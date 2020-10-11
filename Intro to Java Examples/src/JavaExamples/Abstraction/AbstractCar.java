package JavaExamples.Abstraction;


abstract class AbstractCar {
    //  Variables
    private int wheels = 4;
    private int vehicleSpeed = 0;
    private String vehicleMake = "";
    private boolean vehicleTurnedOn = false;

    //  Abstract class to increase speed
    abstract void speedUp();

    //  Abstract class to lower speed
    abstract void slowDown();

    //  Turn the car on
    public void turnCarOn() {
        if (vehicleTurnedOn == true) {
            System.out.println("The vehicle is already turned on");
        } else if (vehicleTurnedOn == false) {
            vehicleTurnedOn = true;
            System.out.println("The vehicle has been turned on.");
        }
    }

    //  Turn the vehicle off
    public void turnCarOff(){
        if (vehicleTurnedOn == false) {
            System.out.println("The vehicle is already turned off");
        } else if (vehicleTurnedOn == true) {
            vehicleTurnedOn = false;
            System.out.println("The vehicle has been turned off.");
        }
    }

    }



