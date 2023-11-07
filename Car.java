public class Car{
    private float effeciency;
    private float fuel;

    //constructor
    //constructors have the same name as that of class
    //they do not return anything
    public Car(float effeciency){
        this.effeciency = effeciency;
        fuel = 0;
    }

    //setter for effeciency
    public void setEffeciency(float effeciency){
        this.effeciency = effeciency;
    }

    //setter for fuel
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    //getter for effeciency
    public float getEffeciency() {
        return effeciency;
    }

    //getter for fuel
    public float getGas() {
        return fuel;
    }

    public void drive(int miles){
        float fuelConsumed = miles / effeciency;
         if (fuel >= fuelConsumed) {
            fuel -= fuelConsumed;
         } else {
            System.out.println("Your fuel is finished");
         }
    }

    public void addGas(int gallons) {
        if (gallons >= 0) {
            fuel += gallons;
        }
    } 

}


