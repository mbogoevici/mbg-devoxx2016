package ca.mbg.demo.devoxx2016;

/**
 * @author Marius Bogoevici
 */
public class ReceivedSensorData {

    private int id;

    private int temperature;

    public ReceivedSensorData() {
    }

    public ReceivedSensorData(int id, int temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
