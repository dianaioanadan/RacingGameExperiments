package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "BMW";
        firstEngine.cubicCapacity = 1990;
        firstEngine.emissionClass = 5;
        firstEngine.power = 124;
        firstEngine.fuel = "disel";

        Car firstCompetitor = new Car();
        firstCompetitor.name = "Toyota";
        firstCompetitor.colour = "silver";
        firstCompetitor.doorCount = 5;
        firstCompetitor.mileage = 9.5;
        firstCompetitor.doorCount =5;
        firstCompetitor.aBS = true;
        firstCompetitor.eSP = true;
        firstCompetitor.gearBox = "automatic transmition";
        firstCompetitor.engine = firstEngine;
    }
}
