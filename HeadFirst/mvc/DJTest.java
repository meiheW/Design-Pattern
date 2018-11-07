package mvc;

import mvc.controller.BeatController;
import mvc.model.BeatModel;

public class DJTest {
    public static void main(String[] args){
        new BeatController(new BeatModel());
    }

}
