import processing.core.PApplet;

import java.util.ArrayList;

public class Thing3 extends CreatureWorldThing{

    public Thing3(int _id) {
        super(_id, CreatureWorldMaster.getApp().width/2+40, CreatureWorldMaster.getApp().height-30,  CreatureWorldMaster.getApp().color(44, 73, 105), 30, 30, 10, 10, 5, 1, false);
    }

    public void display(){
        PApplet app = CreatureWorldMaster.getApp();
        app.noStroke();
        app.fill(getColor());
        app.rect(getX(), getY(), getHeroWidth(), getHeroHeight());
    }
    public void behave() {

        if (getAmTarget() == true) {
        }
    }

    public void interact(ArrayList<CreatureWorldThing> things){
    }//hi
}
