package ca.mbg.demos.devoxx2016;

/**
 * @author Marius Bogoevici
 */
public class SensorData {

    private int id;

    private int temperature;

    public SensorData(int id, int temperature) {
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
