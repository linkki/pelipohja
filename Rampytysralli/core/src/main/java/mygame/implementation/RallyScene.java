package mygame.implementation;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;

public class RallyScene extends Scene {

    private ArrayList<GameObject> objects;

    @Override
    public void initialize() {
        objects = new ArrayList<GameObject>();
        StaticImage background = new StaticImage(0, 0, new Sprite(new Texture("assets/bg.png")));
        addDrawable(background);

        Sprite car1Image = new Sprite(new Texture("assets/ferrari.png"));
        Sprite car2Image = new Sprite(new Texture("assets/sedan.png"));
        objects.add(new Player(20, 520, car1Image, Keys.A, Keys.D));
        objects.add(new Player(20, 220, car2Image, Keys.LEFT, Keys.RIGHT));
        addDrawables(objects);
    }

    @Override
    public void updateScene() {
        for (GameObject player : objects) {
            player.move();
            if(player.getX() > 1000){
                MyGame.sceneManager.nextScene();
            }
        }
    }

    @Override
    public void checkInputs() {

    }

}
