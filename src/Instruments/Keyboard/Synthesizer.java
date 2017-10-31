package Instruments.Keyboard;

import interfaces.Assembleble;
import interfaces.Carriable;
import interfaces.Pluggable;

/**
 * Created by RODION on 30.10.2017.
 */
public class Synthesizer extends Keyboard implements Pluggable, Carriable, Assembleble {
    private int numOfEffects;
    private double memory;
    private short numOfLoudSpeakers;

    public void Syntheizer (int numOfEffects, short numOfLoudSpeakers, int numOfKeys, int weight, boolean havePedal,
                            String brandName){
        this.brandName = brandName;
        this.numOfEffects = numOfEffects;
        this.numOfLoudSpeakers = numOfLoudSpeakers;
        this.weight = weight;
        this.numOfKeys = numOfKeys;
        this.havePedal = havePedal;
    }

    public void play(){
        System.out.println("Synthesizer is playing");
    }



    public int getNumOfEffects() {
        return numOfEffects;
    }

    public void setMemory(double memory) {
        this.memory = memory;

    }

    public double getMemory() {
        return memory;
    }

    public short getNumOfloudSpeakers() {
        return numOfLoudSpeakers;
    }

    @Override
    public void carry() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void disassemble() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void assemble() {

    }

    @Override
    public String toString() {
        return super.toString() + ", type: Synthesizer";
    }
}
