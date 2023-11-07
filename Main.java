public class Main{
    public static void main(String[] args){
        Car bugati = new Car(32);
        bugati.drive(100);
        bugati.addGas(30);
        System.out.println("The fuel left is " + bugati.getGas());
    }
}