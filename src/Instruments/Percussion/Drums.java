package Instruments.Percussion;

import Instruments.Instrument;
import interfaces.Assembleble;
import interfaces.Carriable;
import interfaces.Tunnable;

/**
 * Created by RODION on 31.10.2017.
 */
public class Drums extends Instrument implements Assembleble, Carriable, Tunnable {

    private short numOfDrums;
    private int weight;

    public Drums(short numOfDrums, int weight, String brandName) {
        this.numOfDrums = numOfDrums;
        this.weight = weight;
        this.brandName = brandName;
    }

    public void baDumTsss(){

    }

    public void setNumOfDrums(short numOfDrums) {
        this.numOfDrums = numOfDrums;
    }

    public short getNumOfDrums() {
        return numOfDrums;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void play(){
        System.out.println("Ba Dum Tss");
    }

    @Override
    public void tune() {

    }

    @Override
    public void carry() {

    }

    @Override
    public void disassemble() {

    }

    @Override
    public void assemble() {

    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Drums";
    }
}
