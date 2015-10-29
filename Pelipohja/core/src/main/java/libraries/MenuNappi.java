package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class MenuNappi extends Klikattava {

    private String napinTeksti;
    private final BitmapFont fontti = new BitmapFont();
    private Sprite perusKuva;
    private Sprite leijuKuva;
    private int nappain;
    private boolean painettuJo;

    public MenuNappi(float x, float y, Sprite perusKuva, Sprite leijuKuva, String napinTeksti) {
        super(x, y, perusKuva);
        this.perusKuva = perusKuva;
        this.leijuKuva = leijuKuva;
        this.napinTeksti = napinTeksti;
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
    public String getNapinTeksti(){
        return this.napinTeksti;
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

