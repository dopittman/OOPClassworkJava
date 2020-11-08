

abstract class ACar {
     String title;
     int daysAvailable;
     int pickupDate;
     int returnDate;
     boolean isHatchBack;

     abstract void carDetails();
}

    //  Economy Car class created from abstract car class
class economyCar extends ACar {
    String title;
    int daysAvailable = 14;
    int pickupDate;
    int returnDate;
    boolean isHatchBack;
    int daysOverdue;


    //  Getters
    String getTitle(){
        return this.title;
    }
    int daysAvaiable(){
          return this.daysAvailable;
      }

    //  Setters
    void setTitle(String title){
        this.title = title;
    }
    //  Will also set expected returnDate;
    void setPickupDate(int pickupDate){
        this.pickupDate = pickupDate;
        this.returnDate = pickupDate + daysAvailable;
    }
    void setHatchback(boolean hasHatchback){
        this.isHatchBack = hasHatchback;
    }

    // Methods
    public boolean isHatchBack() {
        return isHatchBack;
    }

    /*
    *  The pickup date and return date are based on the numeric day of the year.
    *   ie. an int of 10 would be January 10th, an int of 43 would be February 12th.
    *  A car rented on day 20 and returned on day 35 would be rented for a total of 15 days
    *  todaysDate should always be greater then the pickupDate
    * */
    void daysOverdue(int todaysDate){
        this.daysOverdue = todaysDate - (pickupDate + daysAvailable);
    }


    boolean isOverdue(){
        boolean overdueStatus = false;
        if(this.daysOverdue < 0){
            overdueStatus = false;
        } else if(this.daysOverdue > 0){
            overdueStatus = true;
        }
        return overdueStatus;
    }

    int computePentalty(){
        if( this.daysOverdue < 0){
            return 0;
        } else {
            return 10 * daysOverdue;
        }
    }

    void carDetails(){
        System.out.println("This car is a(n) " + getTitle()+ ". ");
        if(isHatchBack == true){
            System.out.println("This car has a hatchback");
        } else{
            System.out.println("This car does not have a hatchback.");
        }
        System.out.println("The pickup date was:  " + pickupDate);
        System.out.println("The expected return date is/was:  " + returnDate);
    }
}

class deluxeCar extends ACar {
    String title;
    int daysAvailable = 14;
    int mileage;
    int pickupDate;
    int returnDate;
    boolean isHatchBack;
    int daysOverdue;


    //  Getters
    String getTitle(){
        return this.title;
    }
    int daysAvaiable(){
        return this.daysAvailable;
    }
    int getMileage(){
        return this.mileage;
    }

    //  Setters
    void setTitle(String title){
        this.title = title;
    }
    //  Will also set expected returnDate;
    void setPickupDate(int pickupDate){
        this.pickupDate = pickupDate;
        this.returnDate = pickupDate + daysAvailable;
    }
    void setHatchback(boolean hasHatchback){
        this.isHatchBack = hasHatchback;
    }
    void setMileage(int miles){
        this.mileage = miles;
    }

    // Methods
    public boolean isHatchBack() {
        return isHatchBack;
    }

    /*
     *  The pickup date and return date are based on the numeric day of the year.
     *   ie. an int of 10 would be January 10th, an int of 43 would be February 12th.
     *  A car rented on day 20 and returned on day 35 would be rented for a total of 15 days
     *  todaysDate should always be greater then the pickupDate
     * */
    void daysOverdue(int todaysDate){
        this.daysOverdue = todaysDate - (pickupDate + daysAvailable);
    }


    boolean isOverdue(){
        boolean overdueStatus = false;
        if(this.daysOverdue < 0){
            overdueStatus = false;
        } else if(this.daysOverdue > 0){
            overdueStatus = true;
        }
        return overdueStatus;
    }

    int computePentalty(){
        if( this.daysOverdue < 0){
            return 0;
        } else {
            return 100 * daysOverdue;
        }
    }

    void carDetails(){
        System.out.println("This car is a(n) " + getTitle()+ ". ");
        if(isHatchBack == true){
            System.out.println("This car has a hatchback");
        } else{
            System.out.println("This car does not have a hatchback.");
        }
        System.out.println("The mileage on the car when rented was:  " + this.mileage + " miles");
        System.out.println("The pickup date was:  " + pickupDate);
        System.out.println("The expected return date is/was:  " + returnDate);
    }
}

class luxurySportsCar extends ACar {
    String title;
    int daysAvailable = 3;
    int mileage;
    int pickupDate;
    int returnDate;
    boolean isHatchBack;
    int daysOverdue;


    //  Getters
    String getTitle(){
        return this.title;
    }
    int daysAvaiable(){
        return this.daysAvailable;
    }
    int getMileage(){
        return this.mileage;
    }

    //  Setters
    void setTitle(String title){
        this.title = title;
    }
    //  Will also set expected returnDate;
    void setPickupDate(int pickupDate){
        this.pickupDate = pickupDate;
        this.returnDate = pickupDate + daysAvailable;
    }
    void setHatchback(boolean hasHatchback){
        this.isHatchBack = hasHatchback;
    }
    void setMileage(int miles){
        this.mileage = miles;
    }

    // Methods
    public boolean isHatchBack() {
        return isHatchBack;
    }

    /*
     *  The pickup date and return date are based on the numeric day of the year.
     *   ie. an int of 10 would be January 10th, an int of 43 would be February 12th.
     *  A car rented on day 20 and returned on day 35 would be rented for a total of 15 days
     *  todaysDate should always be greater then the pickupDate
     * */
    void daysOverdue(int todaysDate){
        this.daysOverdue = todaysDate - (pickupDate + daysAvailable);
    }


    boolean isOverdue(){
        boolean overdueStatus = false;
        if(this.daysOverdue < 0){
            overdueStatus = false;
        } else if(this.daysOverdue > 0){
            overdueStatus = true;
        }
        return overdueStatus;
    }

    int computePentalty(){
        if( this.daysOverdue < 0){
            return 0;
        } else {
            return 1000 * daysOverdue;
        }
    }

    void carDetails(){
        System.out.println("This car is a(n) " + getTitle()+ ". ");
        if(isHatchBack == true){
            System.out.println("This car has a hatchback");
        } else{
            System.out.println("This car does not have a hatchback.");
        }
        System.out.println("The mileage on the car when rented was:  " + this.mileage + " miles");
        System.out.println("The pickup date was:  " + pickupDate);
        System.out.println("The expected return date is/was:  " + returnDate);
    }
}

class Example {

    public static void main(String[] args) {
        //Testing of economyCar
        luxurySportsCar TestCar = new luxurySportsCar();
        TestCar.setTitle("Beamer");
        TestCar.setPickupDate(75);
        TestCar.setHatchback(false);
        TestCar.setMileage(256);

        // Return values
        TestCar.carDetails();
        TestCar.daysOverdue(80);
        System.out.println("This car is overdue:  " + TestCar.isOverdue());
        System.out.println("The current penalty if this car is returned today is:  $" + TestCar.computePentalty());

    }
}