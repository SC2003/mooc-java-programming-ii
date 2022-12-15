package application;

public class StandardSensor implements Sensor {

    private int numberValue;

    public StandardSensor(int numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.numberValue;
    }

}
