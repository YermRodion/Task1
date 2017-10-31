package Test;
import Instruments.Percussion.Drums;
import Instruments.Stringed.ElectroGuitar;

/**
 * Created by RODION on 31.10.2017.
 */

public  class Test {


    public static void main(String[] args) {
        ElectroGuitar solo = new ElectroGuitar("Gibson LesPaul", true, 90);
        Drums drum = new Drums(1, 30, "Yamaha");

        System.out.println(solo.toString());
        System.out.println(solo.getBrandName());
        System.out.println(drum.toString());
        System.out.println(drum.getBrandName());


        solo.play();
        drum.play();
    }
}
