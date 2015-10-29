package libraries;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Teksti extends PeliOtus {

    private String teksti;
    private float skaala;
    private Color vari;
    private SpriteBatch kuvajoukko;
    private BitmapFont fontti;

    public Teksti(String teksti, float x, float y) {
        super(x, y, "assets/box.png");
        this.skaala = 1;
        this.teksti = teksti;
        this.vari = Color.BLACK;
        this.kuvajoukko = new SpriteBatch();
        this.fontti = new BitmapFont();
    }

    public String getTeksti() {
        return this.teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public float getSkaala() {
        return this.skaala;
    }

    public void setSkaala(float skaala) {
        this.skaala = skaala;
    }

    public void setVari(Color vari) {
        this.vari = vari;
    }

    public Color getVari() {
        return this.vari;
    }

    @Override
    public void piirra() {
        kuvajoukko.begin();
        fontti.draw(kuvajoukko, teksti, getX(), getY());
        kuvajoukko.end();
    }
}
