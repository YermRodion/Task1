package Instruments.Stringed;
import interfaces.Pluggable;

/**
 * Created by RODION on 30.10.2017.
 */
public class ElectroGuitar extends Guitar implements Pluggable {
    private boolean distortion;
    private int gain;

    public ElectroGuitar(String brandName, boolean distortion, int gain){
        this.brandName = brandName;
        this.distortion = distortion;
        this.gain = gain;
    }

    public boolean Distortion() {
        return distortion;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }

    public int getGain() {
        return gain;
    }

    public void setDistortion(boolean distortion) {
        this.distortion = distortion;
    }

    public boolean isDistortion() {
        return distortion;
    }

    public void play(){
        System.out.println("Let's Rock!!!");
    }

    @Override
    public void turnOff() {
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void carry() {

    }

    @Override
    public void tune() {

    }

    @Override
    public String toString() {
        return super.toString() + ", type: Electric Guitar";
    }
}
