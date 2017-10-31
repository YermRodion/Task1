package Test;
import Instruments.Stringed.ElectroGuitar;

/**
 * Created by RODION on 31.10.2017.
 */

public  class Test {


    public static void main(String[] args) {
        ElectroGuitar solo = new ElectroGuitar("Yamaha", false, 90);

        System.out.println(solo.getBrandName());
        System.out.println(solo.toString());
        solo.setDistortion((solo.getBrandName().equals("Yamaha")));
        System.out.println(solo.getGain());
        solo.setGain(100);
        System.out.println(solo.getGain());
        solo.play();
    }
}
