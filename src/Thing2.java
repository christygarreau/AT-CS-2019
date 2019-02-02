import processing.core.PApplet;
import java.util.ArrayList;

public class Thing2 extends CreatureWorldThing{

    public Thing2(int _id){
        super(_id, CreatureWorldMaster.getApp().width/2-20, CreatureWorldMaster.getApp().height-15, CreatureWorldMaster.getApp().color(248, 167, 56), 15, 15, 10,  10, 5, 1, false);
    }

    public void display(){
        PApplet app = CreatureWorldMaster.getApp();
        app.noStroke();
        app.fill(getColor());
        app.rect(getX(), getY(), getHeroWidth(), getHeroHeight());
    }
    public void behave(){
    }


    public void interact(ArrayList<CreatureWorldThing> things){
    }
}
