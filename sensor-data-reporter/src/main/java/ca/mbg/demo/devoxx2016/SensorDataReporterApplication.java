package ca.mbg.demo.devoxx2016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.SystemPublicMetrics;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SensorDataReporterApplication {

	@StreamListener(Sink.INPUT)
	public void logReceivedData(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {
		SpringApplication.run(SensorDataReporterApplication.class, args);
	}
}
