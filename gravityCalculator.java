import  java.math.*;

public class gravityCalculator {
    double gravity = -9.81;
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initialPosition = 0.0;
    double finalPosition = 0.0;
    public void setPosition(){
        double x = (this.gravity * Math.pow(fallingTime,2))*0.5 + (this.initialVelocity*this.fallingTime)
                    + initialPosition;
        this.finalPosition = x;
    }

    public static void main(String [] args){
        gravityCalculator calc = new gravityCalculator();
        calc.setPosition();
        System.out.println("The object's position after " + calc.fallingTime +
                " seconds is " + calc.finalPosition + " m.");
    }

}
