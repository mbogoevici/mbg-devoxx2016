package ca.mbg.demo.devoxx2016;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.GroupedFlux;
import reactor.core.publisher.Mono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(Processor.class)
public class SensorAverageApplication {

	@StreamListener
	@Output(Processor.OUTPUT)
	public Flux<AverageData> calculateAverage(@Input(Processor.INPUT) Flux<ReceivedSensorData> data) {
		return data.window(Duration.ofSeconds(20), Duration.ofSeconds(10))
				.flatMap(window -> window.groupBy(sensorData -> sensorData.getId())
						.flatMap(group -> calculateAverage(group)));

	}

	private Mono<AverageData> calculateAverage(GroupedFlux<Integer, ReceivedSensorData> group) {
		return group
				.reduce(new Accumulator(0, 0), (a, d) -> new Accumulator(a.getCount() + 1, a.getTotalValue() + d.getTemperature()))
				.map(accumulator -> new AverageData(group.key(), (accumulator.getTotalValue()) / accumulator.getCount()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SensorAverageApplication.class, args);
	}
}
