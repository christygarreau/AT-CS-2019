import processing.core.PApplet;
import java.util.ArrayList;
public class CreatureWorldMaster extends PApplet{
    private static PApplet app;
    private ArrayList<CreatureWorldThing> things;

    public static void main(String[] args) {
        PApplet.main("CreatureWorldMaster");
    }


    public CreatureWorldMaster(){
        super();
        app = this;
    }

    public void settings() {
        size(700,500);
    }


    public void setup(){
        things = new ArrayList<CreatureWorldThing>();
        things.add(new Thing1(0));
        things.add(new Thing2(1));
        things.add(new Thing3(2));
    }

    public void draw(){
        background(100);
        for(int i = 0; i < things.size(); i++){
            things.get(i).display();
            things.get(i).behave();
            things.get(i).interact(things);
        }
    }

    public void keyPressed(){
        for(int i = 0; i < things.size(); i++){
            things.get(i).hewwo(key);
        }
    }

    public void mouseClicked(){
        things.add(new Thing1(2));
    }
/*
    public void kill(CreatureWorldThing things) {
        things.remove(things);
    }
*/
    public static PApplet getApp() {
        return app;
    }
}
