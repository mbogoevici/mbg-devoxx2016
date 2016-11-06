package ca.mbg.demo.devoxx2016;

/**
 * @author Marius Bogoevici
 */
public class ReceivedSensorData {

    private int id;

    private int temperature;

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

    @Override
    public String toString() {
        return "ReceivedSensorData{" +
                "id=" + id +
                ", temperature=" + temperature +
                '}';
    }
}
