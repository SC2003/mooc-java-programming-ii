
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> VehicleRegister;

    public VehicleRegistry() {
        this.VehicleRegister = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String Owner) {
        if (!(this.VehicleRegister.containsKey(licensePlate))) {
            this.VehicleRegister.put(licensePlate, Owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.VehicleRegister.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.VehicleRegister.containsKey(licensePlate)) {
            this.VehicleRegister.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.VehicleRegister.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : this.VehicleRegister.values()) {
            if (owners.contains(owner)) {
                continue;
            }
            owners.add(owner);
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
