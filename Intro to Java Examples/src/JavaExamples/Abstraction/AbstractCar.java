package JavaExamples.Abstraction;

  /* Abstract classes are not available to create objects directly.
  *  Instead another class must inherit/extend from from them in order to create a new object from
  *    the abstract class.
  **/

  abstract class AbstractCar {
    //  Variables
    public int wheels = 4;
    public int vehicleSpeed = 0;
    public String vehicleModel = "";
    public boolean vehicleTurnedOn = false;

    //  Abstract class to increase speed
    abstract void speedUp();

    //  Abstract class to lower speed
    abstract void slowDown();

    //  Turn the car on
    public void turnVehicleOn() {
        if (vehicleTurnedOn == true) {
            System.out.println("The vehicle is already turned on");
        } else if (vehicleTurnedOn == false) {
            vehicleTurnedOn = true;
            System.out.println("The vehicle has been turned on.");
        }
    }

    //  Turn the vehicle off
    public void turnVehicleOff(){
        if (vehicleTurnedOn == false) {
            System.out.println("The vehicle is already turned off");
        } else if (vehicleTurnedOn == true) {
            vehicleTurnedOn = false;
            System.out.println("The vehicle has been turned off.");
        }
    }

    //  Set vehicle make
        public void setVehicleModel(String newModel){
            this.vehicleModel = newModel;
            System.out.println("You are driving a Ford " + this.vehicleModel);
        }

    //  Print out the current speed
        public void currentSpeed(){
            System.out.println("The current speed is:  " + this.vehicleSpeed);
        }

    }


    //  An example of a class extended from an Abstract class
    class fordTruck extends AbstractCar {

      //  Will speed up by 10 units when called
      public void speedUp(){
          if(this.vehicleSpeed <= 115){
          this.vehicleSpeed += 10;
          } else {
              System.out.println("You are at the maximum speed!");
          }
      }

      //  Will slow down by 10 units when called
      public void slowDown() {
          if(this.vehicleSpeed >= 10){
              this.vehicleSpeed -= 10;
          } else if(vehicleSpeed < 10 ){
              System.out.println("You can not slow down anymore!");
          }
      }

  }

  class vehicleCreation {
      public static void main(String[] args) {
          fordTruck F150 = new fordTruck();

          F150.setVehicleModel("F150");
          F150.turnVehicleOn();
          F150.speedUp();
          F150.speedUp();
          F150.speedUp();
          F150.currentSpeed();
          F150.slowDown();
          F150.slowDown();
          F150.slowDown();
          F150.slowDown();
          F150.turnVehicleOff();
      }
  }