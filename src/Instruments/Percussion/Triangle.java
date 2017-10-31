package Instruments.Percussion;

import Instruments.Instrument;
import interfaces.Carriable;

/**
 * Created by RODION on 31.10.2017.
 */
public class Triangle extends Instrument implements Carriable{
    private String metalType;
    private int size;

    public Triangle(String metalType, int size, String brandName){
        this.metalType = metalType;
        this.size = size;
        this.brandName = brandName;
    }

    public void waitAMoment(){}

    public String getMetalType() {
        return metalType;
    }

    public int getSize() {
        return size;
    }

    public void play(){
        System.out.println("Triangle is playing");
    }

    @Override
    public void carry() {

    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Drums";
    }
}
