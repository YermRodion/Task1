package Instruments.Percussion;

import Instruments.Instrument;
import interfaces.Carriable;

/**
 * Created by RODION on 31.10.2017.
 */
public class Maraca extends Instrument implements Carriable {

    private String woodType;
    private String color;

    public Maraca(String woodType, String color, String brandName) {
        this.woodType = woodType;
        this.color = color;
        this.brandName = brandName;
    }

    public void shake(){}
    public void danceAndShake(){}

    public String getWoodType() {
        return woodType;
    }

    public String getColor() {
        return color;
    }

    public void play(){
        System.out.println("Shaking Marrrraca!!!");
    }

    @Override
    public void carry() {

    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Drums";
    }
}
