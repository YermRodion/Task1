package Instruments.Keyboard;

import Instruments.Instrument;

/**
 * Created by RODION on 31.10.2017.
 */
public abstract class Keyboard extends Instrument {
    int numOfKeys;
    int weight;
    boolean havePedal;

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHavePedal(boolean havePedal) {
        this.havePedal = havePedal;
    }

    public boolean isHavePedal() {
        return havePedal;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Keyboard";
    }
}
