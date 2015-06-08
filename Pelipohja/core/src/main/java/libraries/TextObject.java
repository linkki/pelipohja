package libraries;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public class TextObject {
    
    private int x,y;
    private String txt;
    private float scale;
    private Color color;
    
    public TextObject(String txt, int x, int y){
        this.scale = 1;
        this.x = x;
        this.y = y;
        this.txt = txt;
        this.color = Color.BLACK;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getTxt() {
        return this.txt;
    }
    
    public void setText(String txt){
        this.txt = txt;
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }
}