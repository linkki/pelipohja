package libraries;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Teksti extends PeliOtus {

    private String teksti;
    private SpriteBatch kuvajoukko;
    private BitmapFont fontti;

    public Teksti(String teksti, float x, float y) {
        super(x, y, "assets/box.png");
        this.teksti = teksti;
        this.kuvajoukko = new SpriteBatch();
        this.fontti = new BitmapFont();
        this.fontti.setColor(Color.RED);
        this.fontti.setScale(1);
    }

    public String getTeksti() {
        return this.teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public float getSkaala() {
        return fontti.getScaleX();
    }

    public void setSkaala(float skaala) {
        fontti.setScale(skaala);
    }

    public void setVari(Color vari) {
        fontti.setColor(vari);
    }

    public Color getVari() {
        return fontti.getColor();
    }

    @Override
    public void piirra() {
        kuvajoukko.begin();
        fontti.draw(kuvajoukko, teksti, getX(), getY());
        kuvajoukko.end();
    }
}
