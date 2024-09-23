import java.util.Scanner;




public class CarTester{
    
    public static Car addCar(){
    System.out.println("Enter the name od the car");
        Scanner nameScanner = new Scanner(System.in);
        String name1 = nameScanner.nextLine();
        
    System.out.println("Enter the miles of the car");
        Scanner mileScanner = new Scanner(System.in);
        double mile1 = mileScanner.nextDouble();
        
     System.out.println("Enter the gallons of the car");
        Scanner gallonScanner = new Scanner(System.in);
        double gallon1 = gallonScanner.nextDouble();
        
        Car car1 = new Car(name1, mile1, gallon1);
        return car1;
    }
    
    public static void main(String[] args) {
        Car car2 = addCar();
        System.out.println(car2);
        Car car3 = addCar();
        System .out.println(car3);
        
        
        
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
}
