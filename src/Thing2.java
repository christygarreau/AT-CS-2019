import processing.core.PApplet;

public class Thing2 extends CreatureWorldThing{
    private int jumpState = 0;
    private int xDistance = 0;

    public Thing2(int _id){
        super(_id, CreatureWorldMaster.getApp().width/2-20, CreatureWorldMaster.getApp().height-15, 1, CreatureWorldMaster.getApp().color(248, 167, 56), 15, 15, 10, 1, false);
    }

    public void display(){
        PApplet app = CreatureWorldMaster.getApp();
        app.noStroke();
        app.fill(getColor());
        app.rect(getX(), getY(), getHeroWidth(), getHeroHeight());
    }
    public void behave(){
        //calculates next loc
        if(jumpState == 1){
            setY(getY() - 1);
            if(getY() == 400){
                jumpState = 2;
            }
        }else if(jumpState == 2){
            setX(getX() + 1);
            xDistance++;
            if(xDistance == 30){
                jumpState = 3;
            }
        }else if(jumpState == 3){
            setY(getY() + 1);
            if(getY() == CreatureWorldMaster.getApp().width){
                jumpState = 0;
            }
        }
        if(getAmTarget() == true){
            if (CreatureWorldMaster.getApp().key == 'a'){
                setX(getX() - (int)getXVelocity());
            }
            if (CreatureWorldMaster.getApp().key == 'd'){
                setX(getX() + (int)getXVelocity());
            }
            if (CreatureWorldMaster.getApp().key == 'w'){
                jumpState = 1;
                setY(getY() - (int)getYVelocity());
                if (getY() >= CreatureWorldMaster.getApp().height-getHeroHeight()){
                    setY(CreatureWorldMaster.getApp().height - getHeroHeight());
                }
            }
        }
    }


    public void interact(CreatureWorldThing[] things){
    }
}
