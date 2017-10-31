package Instruments;

/**
 * Created by RODION on 30.10.2017.
 */
public abstract class Instrument {
    protected String brandName;
    private int price;
    private float noisiness;

    public abstract void play();


    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setNoisiness(float noisiness) {
        this.noisiness = noisiness;
    }

    public float getNoisiness() {
        return noisiness;
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}

