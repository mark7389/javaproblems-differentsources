import java.math.*;

public class fooCorporation {
    double base;
    int hours;
    public fooCorporation(double b, int h){
        this.base = b;
        this.hours = h;
    }
    public void printTotal(){
        if(this.base < 8.00){
            System.out.println("base pay must be greater than minimum wage!!");
        }
        else if(this.hours > 60){
            System.out.println("Hours exceed maximum !!");
        }
        else if(this.hours > 40){
            double baseHoursPay = 40.0 * this.base;
            double overTime = (double)(this.hours-40) * (this.base * 1.5);
            System.out.println("Total for Employee: $"+(baseHoursPay+overTime));
        }
        else{
            System.out.println("Total for Employee: $"+(this.base*(double)this.hours));
        }
    }
    public static void main(String [] args){
        fooCorporation one = new fooCorporation(7.50,35);
        fooCorporation two = new fooCorporation(8.20,47);
        fooCorporation three = new fooCorporation(10.00,73);
        one.printTotal();
        two.printTotal();
        three.printTotal();
    }

}