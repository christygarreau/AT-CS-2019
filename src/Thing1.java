import processing.core.PApplet;

import java.util.ArrayList;

public class Thing1 extends CreatureWorldThing{

        public Thing1(int _id){
            super(_id, CreatureWorldMaster.getApp().width/2, CreatureWorldMaster.getApp().height-21, CreatureWorldMaster.getApp().color(250, 82, 57), 14, 21, 10, 10, 5, 1, true);
        }
//hi
        public void display(){
            PApplet app = CreatureWorldMaster.getApp();
            app.noStroke();
            app.fill(getColor());
            app.rect(getX(), getY(), getHeroWidth(), getHeroHeight());
        }
        public void behave() {
        }

        public void interact(ArrayList<CreatureWorldThing> things){
            for(int i = 0; i < things.size(); i++){

            }
        }

    }

