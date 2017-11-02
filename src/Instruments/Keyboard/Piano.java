package Instruments.Keyboard;

import interfaces.Tunnable;


public class Piano extends Keyboard implements Tunnable {

    public Piano (int numOfKeys, int weight, boolean havePedal, String brandName){
        this.numOfKeys = numOfKeys;
        this.weight = weight;
        this.havePedal = havePedal;
        this.brandName = brandName;
    }

    public void play() {
        System.out.println("Piano is playing");
    }

    @Override
    public void tune() {

    }

    @Override
    public String toString() {
        return super.toString() + ", type: Piano";
    }

}
