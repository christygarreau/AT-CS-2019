import processing.core.PApplet;

public class CreatureWorldThing {
    private int id;
    private int x;
    private int y;
    private int direction;
    private int myColor;
    private int heroWidth;
    private int heroHeight;
    private float xVelocity;
    private float yVelocity;
    private boolean amTarget;

    public CreatureWorldThing(int _id, int _x, int _y, int _direction, int _myColor, int _heroWidth, int _heroHeight, float _xVelocity, float _yVelocity, boolean _amTarget){ //contructor sets up initial state of object
        id = _id;
        x = _x;
        y = _y;
        direction = _direction;
        myColor = _myColor;
        heroWidth = _heroWidth;
        heroHeight = _heroHeight;
        xVelocity = _xVelocity;
        yVelocity = _yVelocity;
        amTarget = _amTarget;
    }
    public void display(){
        PApplet app = CreatureWorldMaster.getApp();
        app.noStroke();
        app.fill(getColor());
        app.rect(getX(), getY(), 50, 50);
    }

    public void behave(){
        if(getX()+getHeroWidth() == CreatureWorldMaster.getApp().width || getX() == 0){
            xVelocity = 0;
        }
    }
    public void interact(CreatureWorldThing[] things){

    }


    public void keyPressed(){
        //leave empty
    }

    public void keyReleased(){
        //leave empty
    }
/*
public void checkAmTarget(){
 for(int i = getID(); i < 3; i++){
   //
 }
}*/

    public int getX(){
        return x;
    }
    public void setX(int _x){
        x = _x;
    }
    public int getY(){
        return y;
    }
    public void setY(int _y){
        y = _y;
    }
    public float getXVelocity(){
        return xVelocity;
    }
    public void setXVelocity(float _xVelocity){
        xVelocity = _xVelocity;
    }
    public int getDirection(){
        return direction;
    }
    public void setDirection(int _direction){
        direction = _direction;
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
    public float getYVelocity(){
        return yVelocity;
    }
    public void setYVelocity(float _yVelocity){
        yVelocity = _yVelocity;
    }

}

