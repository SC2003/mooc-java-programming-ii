
import java.util.HashMap;


public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        //From Mooc:- The IOU does not care about old debt
        //So the lines below are commented out
        
        //double alreadyOwedAmount = howMuchDoIOweTo(toWhom);
        //amount += alreadyOwedAmount;
        this.iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.iou.getOrDefault(toWhom, 0.0);
    }
}
