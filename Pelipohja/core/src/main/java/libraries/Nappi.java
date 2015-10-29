package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Nappi extends Klikattava {

    private String napinNimi;
    private final BitmapFont fontti = new BitmapFont();
    private Sprite perusKuva;
    private Sprite leijuKuva;
    private int nappain;
    private boolean painettuJo;

    public Nappi(float x, float y, String perusKuva, String leijuKuva, String napinNimi) {
        super(x, y, new Sprite(new Texture(perusKuva)));
        this.perusKuva = super.getKuva();
        this.leijuKuva = new Sprite(new Texture(leijuKuva));
        this.napinNimi = napinNimi;
        fontti.setScale(1.5f);
    }
    
    
    
    @Override
    public void piirra() {
        kuvajoukko.begin();
        if(getLeijuu()){
            kuvajoukko.draw(this.leijuKuva, getX(), getY());
        }
        else{
            kuvajoukko.draw(this.perusKuva, getX(), getY());
        }
        kuvajoukko.end();
    }
    public String getNapinNimi(){
        return this.napinNimi;
    }
    
    public void sidoNappain(int nappain) {
        this.nappain = nappain;
    }
    
    public boolean onkoJuuriPainettu() {
        if (!Gdx.input.isKeyPressed(nappain)) {
            painettuJo = false;
            return false;
        }
        if (painettuJo) {
            return false;
        }
        painettuJo = true;
        return true;
    }

    
}

