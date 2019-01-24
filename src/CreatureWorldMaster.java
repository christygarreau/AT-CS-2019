import processing.core.PApplet;
public class CreatureWorldMaster extends PApplet{
    private static PApplet app;
    CreatureWorldThing[] things;

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
        things = new CreatureWorldThing[3];
        things[0] = new Thing1(0);
        things[1] = new Thing2(1);
        things[2] = new Thing3(2);
    }

    public void draw(){
        background(100);
        for(int i = 0; i < things.length; i++){
            things[i].display();
            things[i].behave();
            things[i].interact(things);
        }
    }

    public void keyPressed(){
        for(int i = 0; i < things.length; i++){
            things[i].keyPressed();
        }
    }
    public static PApplet getApp() {
        return app;
    }
}
