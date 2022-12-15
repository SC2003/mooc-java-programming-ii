package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> numberValueList;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.numberValueList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }

    public List<Integer> readings() {
        return this.numberValueList;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensorList) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensorList) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (isOn()) {
            double average = this.sensorList.stream()
                    .mapToInt(i -> i.read())
                    .average()
                    .getAsDouble();
            this.numberValueList.add((int) average);
            return (int) average;
        }
        throw new IllegalStateException("Il sensore è spento !");
    }

}
