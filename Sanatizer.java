public class Sanatizer {
    private String sanatizerType; 
    private double amountDispensed; 
    private Boolean motionSense; 

    public Sanatizer() {
        sanatizerType = "Purell";
        amountDispensed = 0.7; 
        motionSense = false; 
    }

    public Sanatizer(String Type, double amount) {
        sanatizerType = Type; 
        amountDispensed = amount;
        motionSense = false; 
    }

    public Sanatizer(String Type, double amount, Boolean isDispensing) {
        sanatizerType = Type; 
        amountDispensed = amount;
        motionSense = isDispensing; 
    }
    
    public String toString() {
        return "Sanatizer type: " + sanatizerType + ", amount dispensed per: " + amountDispensed + "ml, currently dispensing: " + motionSense;    
    }


    public double getA() { return amountDispensed; }
    public String getT() { return sanatizerType; }
    public Boolean getS() { return motionSense; }
    
    public void setA(int amount) { amountDispensed = amount; }
    public void setT(String Type) { sanatizerType = Type; }
    public void setS(Boolean isDispensing) { motionSense = isDispensing; } 

    


    

    
}

