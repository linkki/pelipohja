package rampytysralli;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import libraries.Scene;
import libraries.StaticImage;

class RallyScene extends Scene {

    private Player player1;
    private Player player2;

    @Override
    public void initialize() {
        StaticImage background = new StaticImage(0, 0, new Sprite(new Texture("assets/bg.png")));
        addDrawable(background);

        Sprite car1Image = new Sprite(new Texture("assets/ferrari.png"));
        player1 = new Player(20, 520, car1Image, Keys.A, Keys.D);
        addDrawable(player1);
        
        Sprite car2Image = new Sprite(new Texture("assets/sedan.png"));
        player2 = new Player(20, 220, car2Image, Keys.LEFT, Keys.RIGHT);
        addDrawable(player2);
     }

    @Override
    public void updateScene() {
        player1.move();
        player2.move();
        
        // jos jompikumpi pelaaja menee ruudun oikeasta laidasta yli, 
        // siirrytään viimeiseen eli voittoruutuun
        if(player1.getX() > 1000 || player2.getX() > 1000){
            MyGame.sceneManager.nextScene();
        }
    }

    @Override
    public void checkInputs() {

    }

}
