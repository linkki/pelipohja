package rampytysralli;

import rampytysralli.MyGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;
import libraries.InputListener;
import libraries.MenuButton;
import libraries.Scene;
import libraries.StaticImage;

class MenuScene extends Scene {

    private ArrayList<MenuButton> buttonList = new ArrayList<MenuButton>();

    private InputListener inputListener;

    @Override
    public void initialize() {
        
        
        
        
        // laita oma koodisi tämän yläpuolelle
        inputListener = new InputListener();
        Gdx.input.setInputProcessor(inputListener);
    }

    @Override
    public void updateScene() {

    }

    @Override
    public void checkInputs() {        
        //for (MenuButton button : buttonList) {
        //    if (button.isMousePointerTouching(inputListener.getMouseX(), inputListener.getMouseY())) {
        //        button.setHover(true);
        //        //Checks if leftmouse is clicked while mousepointer is touching button and then checks which button it was.
        //        if (inputListener.isLeftMouseButtonClicked()) {
        //            if ("QUIT".equals(button.getButtonText())) {
        //                System.exit(0);
        //            }
        //            if ("START".equals(button.getButtonText())) {
        //                MyGame.sceneManager.nextScene();
        //            }
        //        }
        //    } else {
        //        button.setHover(false);
        //    }
        //}
    }

}
