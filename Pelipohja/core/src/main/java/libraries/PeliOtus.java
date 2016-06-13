package libraries;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class PeliOtus implements Liikkuva {

    private float x, y;
    protected float kulma;
    private Sprite kuva;
    protected SpriteBatch kuvajoukko = new SpriteBatch();

    public PeliOtus(float x, float y, String kuvanOsoite) {
        this.x = x;
        this.y = y;
        this.kuva = new Sprite(new Texture(kuvanOsoite));
    }
    
    public PeliOtus(float x, float y, Sprite kuva) {
        this.x = x;
        this.y = y;
        this.kuva = kuva;
    }

    public void piirra() {
        kuvajoukko.begin();
        if (this.kulma == 0) {
            kuvajoukko.draw(getKuva(), getX(), getY());
        } else {
            kuvajoukko.draw(this.kuva, this.x, this.y, this.kuva.getWidth() / 2, this.kuva.getHeight() / 2, this.kuva.getWidth(), this.kuva.getHeight(), 1f, 1f,
                    this.kulma * -57.296f);
        }
        kuvajoukko.end();
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getKulma() {
        return kulma;
    }

    public void setKulma(float kulma) {
        this.kulma = kulma;
    }

    public Sprite getKuva() {
        return this.kuva;
    }

    public Rectangle getHahmoAlue() {
        return new Rectangle(x, y, kuva.getWidth(), kuva.getHeight());
    }

    public void liikuEteen(double matka) {
        this.liikuEteen((float) matka);
    }

    public void liikuEteen(float matka) {
        this.x += Math.sin(this.kulma) * matka;
        this.y += Math.cos(this.kulma) * matka;
    }

    public void liikuKohti(PeliOtus kohde, float matka) {
        float minMatka = this.kuva.getWidth() + 10;
        float matkaNytX = kohde.x - this.x;
        float matkaNytY = kohde.y - this.y;
        this.kulma = (float) Math.atan(matkaNytX / matkaNytY);
        float matkaNyt = (float) Math.sqrt(matkaNytX * matkaNytX + matkaNytY * matkaNytY);
        if (matka >= matkaNyt - minMatka) {
            return;
        }
        //distance = Math.min(distance, curDist - minDist);
        this.x += matkaNytX * matka / matkaNyt;
        this.y += matkaNytY * matka / matkaNyt;
    }

    @Override
    public void liiku() {

    }
}
