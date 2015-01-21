
package mygame.implementation;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class StaticImage extends GameObject{

    public StaticImage(float x, float y, Sprite img) {
        super(x, y, img);
    }
    
    @Override
    public void drawObject() {
        batch.draw(getImage(), getX(), getY());
    }    

}