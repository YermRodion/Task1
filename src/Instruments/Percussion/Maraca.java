package Instruments.Percussion;

import Instruments.Instrument;
import interfaces.Carriable;

public class Maraca extends Instrument implements Carriable {

    private String woodType;
    private String color;

    public Maraca(String woodType, String color, String brandName) {
        this.woodType = woodType;
        this.color = color;
        this.brandName = brandName;
    }

    public void shake(){
        System.out.println("Shaking maraca...");
    }
    public void danceAndShake(){
        System.out.println("Now we are dancing and shaking maraca");
    }

    public String getWoodType() {
        return woodType;
    }

    public String getColor() {
        return color;
    }

    public void play(){
        System.out.println("Lets play the marrrraca!!!");
    }

    @Override
    public void carry() {

    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Drums";
    }
}
