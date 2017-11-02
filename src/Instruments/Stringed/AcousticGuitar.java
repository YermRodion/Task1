package Instruments.Stringed;

import Instruments.Percussion.Maraca;

import java.util.HashSet;


public class AcousticGuitar extends Guitar{
    private HashSet<String> styles = new HashSet<>();

    public AcousticGuitar(String brandName){
        this.brandName = brandName;
    }

    public HashSet<String> getStyles() {
        return styles;
    }

    public void setStyles(HashSet<String> styles) {
        this.styles = styles;
    }

    public void play() {
        System.out.println("Acoustic is playing");
    }

    @Override
    public void carry() {
    }

    @Override
    public void tune() {
    }

    @Override
    public String toString() {
        return super.toString() + ", type: Acoustic Guitar";
    }
}

