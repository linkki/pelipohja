package peli;

import peli.MunPeli;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;
import libraries.Kuuntelija;
import libraries.MenuNappi;
import libraries.Skene;
import libraries.Kuva;

class MenuSkene extends Skene {

    private ArrayList<MenuNappi> buttonList;

    private Kuuntelija inputListener;

    @Override
    public void alusta() {
        Kuva background = new Kuva(0, 0, new Sprite(new Texture("assets/bg2.png")));
        lisaaOtus(background);
        Sprite quitImg = new Sprite(new Texture("assets/buttonQuit.png"));
        Sprite quitImgHover = new Sprite(new Texture("assets/buttonQuitHover.png"));

        float buttonHeight = quitImg.getHeight();
        float buttonWidth = quitImg.getWidth();

        buttonList = new ArrayList<MenuNappi>();
        buttonList.add(new MenuNappi(MunPeli.SCREEN_WIDTH / 2 - buttonWidth / 2, MunPeli.SCREEN_HEIGHT / 2 - buttonHeight, quitImg, quitImgHover, "QUIT"));

        lisaaNapit(buttonList);
        inputListener = new Kuuntelija();
        Gdx.input.setInputProcessor(inputListener);
    }

    @Override
    public void paivita() {

    }

    @Override
    public void tarkistaSyote() {        
        for (MenuNappi button : buttonList) {
            if (button.koskeekoHiiri(inputListener.getHiiriX(), inputListener.getHiiriY())) {
                button.setLeijuu(true);
                //Checks if leftmouse is clicked while mousepointer is touching button and then checks which button it was.
                if (inputListener.vasenNappiPainettu()) {
                    if ("QUIT".equals(button.getNapinTeksti())) {
                        System.exit(0);
                    }
//                    if ("START".equals(button.getButtonText())) {
//                        MunPeli.sceneManager.nextScene();
//                    }
                }
            } else {
                button.setLeijuu(false);
            }
        }
    }

}
