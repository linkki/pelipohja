
package rampytysralli;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import libraries.GameObject;

class Player extends GameObject{

    private int leftButton, rightButton;
    private boolean leftPressed = false;
    
    public Player(float x, float y, Sprite img, int leftButton, int rightButton) {
        super(x, y, img);
        this.leftButton = leftButton;
        this.rightButton = rightButton;
    }

    @Override
    public void drawObject() {
        batch.draw(getImage(), getX(), getY());
    }

    @Override
    public void move() {
        if(Gdx.input.isKeyPressed(leftButton)){
            leftPressed = true;
        }
        if(Gdx.input.isKeyPressed(rightButton) && leftPressed && !Gdx.input.isKeyPressed(leftButton)){
            this.setX(this.getX() + 10);
            leftPressed = false;
        }
    }
    
}
