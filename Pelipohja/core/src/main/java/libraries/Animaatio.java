package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animaatio {

    private TextureRegion[] kuvat;
    private float aika;
    private float viive;
    private int kuvaNyt;
    private int esityskerrat;

    public Animaatio(TextureRegion[] kuvat, float viive) {
        Animaatio.this.setKuvat(kuvat, viive);
    }

    public void setKuvat(TextureRegion[] kuvat, float viive) {
        this.kuvat = kuvat;
        this.viive = viive;
        this.aika = 0;
        this.kuvaNyt = 0;
        this.esityskerrat = 0;
    }

    public void setKuvat(TextureRegion[] kuvat) {
        this.kuvat = kuvat;
    }

    public void piirra(SpriteBatch batch, float x, float y) {
        paivita(Gdx.graphics.getDeltaTime());
    }

    public void paivita(float dt) {
        if (viive <= 0) {
            return;
        }
        aika += dt;
        if(aika > viive){
            askel();
            aika = 0;
        }
    }

    private void askel() {
        kuvaNyt++;
        if (kuvaNyt == kuvat.length) {
            kuvaNyt = 0;
            esityskerrat++;
        }
    }

    public TextureRegion getKuva() {
        return kuvat[kuvaNyt];
    }

    public int getEsityskerrat() {
        return esityskerrat;
    }
}