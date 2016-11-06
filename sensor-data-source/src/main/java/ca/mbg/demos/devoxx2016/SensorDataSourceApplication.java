package ca.mbg.demos.devoxx2016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.util.Random;

@SpringBootApplication
@EnableBinding(Source.class)
public class SensorDataSourceApplication {

    @InboundChannelAdapter(Source.OUTPUT)
    public SensorData emitSensorData() {
        return new SensorData(new Random().nextInt(10), new Random().nextInt(100));
    }

    public static void main(String[] args) {
        SpringApplication.run(SensorDataSourceApplication.class, args);
    }
}
