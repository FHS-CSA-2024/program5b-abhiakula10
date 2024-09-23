public class Car {
    private String carName;
    private double mileDriven;
    private double gallonUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
        
    }
    
    public Car(String name, double mile, double gallon) {
        carName = name;
        mileDriven = mile;
        gallonUsed = gallon;
        
    }
    
    public String getName(){
        String n1 = name;
        return carName;
    }
    
    public double getMile(){
        double m1 = mileDriven;
        return m1;
    }
    
    public double getGallon(){
        double g1 = gallonUsed;
        return g1;
    }
    
    public void setName(String newName){
        carName = newName;
    }
    
    public void setMile(double newMile){
        mileDriven = newMile;
    }
    
    public void setGallon(double newGallon){
        gallonUsed = newGallon;
    }
    
    public double calculateAverage(){
        double avg = mileDriven / gallonUsed;
        return avg; 
    }
    public String toString(){
        return carName + "Averaged" + calculateAverage() + "mile/gallon";
        
    }
    
}

