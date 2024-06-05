package program;

import model.Galaxy;
import model.Planet;

public class Main {
    public static void main(String[] args){
        Planet planetA = new Planet();
        Planet planetB = new Planet("name B", 500, 2);
        Planet planetC = new Planet("name C", 1000, 1);

        System.out.println(planetA);
        System.out.println(planetB);
        System.out.println(planetC);

        Galaxy galaxy = new Galaxy();
        System.out.println(galaxy);
        galaxy.addPlanet(planetB);
        System.out.println(galaxy);

        System.out.println("+");
    }
}
