package Instruments.Stringed;

import Instruments.Instrument;
import interfaces.Carriable;
import interfaces.Tunnable;


abstract public class Guitar extends Instrument implements Carriable, Tunnable {
    private short numberOfStrings;
    private String typeOfWood;

    public void setNumberOfStrings(short numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public short getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + "Guitar";
    }
}
