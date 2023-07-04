package VehiculeFolder;

public class Hangar {

    public static void main(String[] args) {

        Car megane = new Car("Renault", 8000);
        Car golf = new Car("Volkswagen", 5200);
        Boat yacht = new Boat("deStar", 24000);
        Boat croisiere = new Boat("White Star", 6800);

        System.out.println(megane.doStuff());
        System.out.println(golf.doStuff());
        System.out.println(yacht.doStuff());
        System.out.println(croisiere.doStuff());
    }
}