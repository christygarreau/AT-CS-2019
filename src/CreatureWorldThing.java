import processing.core.PApplet;
import java.util.ArrayList;

public class CreatureWorldThing {
    private int id;
    private int x;
    private int y;
    private int myColor;
    private int heroWidth;
    private int heroHeight;
    private int speed;
    private int jumpStrength;
    private int weight;
    private float velocity;
    private boolean amTarget;

    public CreatureWorldThing(int _id, int _x, int _y, int _myColor, int _heroWidth, int _heroHeight, int _speed, int _jumpStrength, int _weight, float _velocity, boolean _amTarget){
        id = _id;
        x = _x;
        y = _y;
        myColor = _myColor;
        heroWidth = _heroWidth;
        heroHeight = _heroHeight;
        speed = _speed;
        jumpStrength = _jumpStrength;
        weight = _weight;
        velocity = _velocity;
        amTarget = _amTarget;
    }
    public void display(){
        PApplet app = CreatureWorldMaster.getApp();
        app.noStroke();
        app.fill(getColor());
        app.rect(getX(), getY(), 50, 50);
    }

    public void behave(){
        if (CreatureWorldMaster.getApp().key == 'd'){
            System.out.println("ass eat time");
            x += speed;
        } else if(CreatureWorldMaster.getApp().key == 'a'){
            x -= speed;
        }
        if (CreatureWorldMaster.getApp().key == 32 && y == CreatureWorldMaster.getApp().height - heroHeight){
            jumpStrength = 10;
            y -= jumpStrength;
            jumpStrength -= weight;
        }
        if (y >= CreatureWorldMaster.getApp().height - heroHeight){
            y = CreatureWorldMaster.getApp().height - heroHeight;
        }
//hi
    }

    public void hewwo(char key1) {
        if (key1 == 'd'){
            x += speed;
        } else if(key1 == 'a'){
            x -= speed;
        }
        if (key1 == 32 && y == CreatureWorldMaster.getApp().height - heroHeight){
            jumpStrength = 10;
            y -= jumpStrength;
            jumpStrength -= weight;
        }
        if (y >= CreatureWorldMaster.getApp().height - heroHeight){
            y = CreatureWorldMaster.getApp().height - heroHeight;
        }
    }

    public void interact(ArrayList<CreatureWorldThing> things){
        //implement later
    }

    public void keyPressed(){
        //leave empty
    }
    public void keyReleased(){
        //leave empty
    }

    public int getX(){
        return x;
    }
    public void setX(int _x){
        x = _x;
    }
    public int getY(){ return y; }
    public void setY(int _y){
        y = _y;
    }
    public float getVelocity(){
        return velocity;
    }
    public void setXVelocity(float _velocity){
        velocity = _velocity;
    }
    public int getID(){
        return id;
    }
    public int getColor(){
        return myColor;
    }
    public void setColor(int _myColor){
        myColor = _myColor;
    }
    public int getHeroWidth(){
        return heroWidth;
    }
    public void setHeroWidth(int _heroWidth){
        heroWidth = _heroWidth;
    }
    public int getHeroHeight(){
        return heroHeight;
    }
    public void setHeroHeight(int _heroHeight){
        heroHeight = _heroHeight;
    }
    public boolean getAmTarget(){
        return amTarget;
    }
    public void setAmTarget(boolean _amTarget){
        amTarget = _amTarget;
    }
}

