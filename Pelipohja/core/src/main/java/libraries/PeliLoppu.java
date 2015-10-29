package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PeliLoppu {

    private int pisteet;
    private boolean uusiEnnatys;
    private Sprite peliLoppu;
    private BitmapFont fontti;

    public PeliLoppu(int pisteet, boolean uusiEnnatys) {
        this.pisteet = pisteet;
        this.uusiEnnatys = uusiEnnatys;
        this.fontti = new BitmapFont();
    }

    public void paivita() {
        
    }

    public void kuvanna(SpriteBatch batch) {
    }

}