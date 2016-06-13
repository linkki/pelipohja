package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;

public abstract class Skene implements Screen {

    private ArrayList<PeliOtus> kaikkiOtukset;
    private ArrayList<PeliOtus> lisattavat;
    private ArrayList<PeliOtus> poistettavat;
    private ArrayList<Nappi> napit;

    private Kuva tausta;
    private Kuva otsikko;

    public Skene() {
        kaikkiOtukset = new ArrayList<PeliOtus>();
        lisattavat = new ArrayList<PeliOtus>();
        poistettavat = new ArrayList<PeliOtus>();
        napit = new ArrayList<Nappi>();
    }

    public abstract void alusta();
    
    public void asetaKuva(String tehtava, int x, int y, String kuva) {
        if (tehtava.equals("tausta")) {
            tausta = new Kuva(x, y, new Sprite(new Texture(kuva)));
            lisaaOtus(tausta);
        } else if (tehtava.equals("otsikko")) {
            otsikko = new Kuva(x, y, new Sprite(new Texture(kuva)));
            lisaaOtus(otsikko);
        }
    }

    public abstract void paivita();

    public abstract void tarkistaSyote();

    public void lisaaOtus(PeliOtus otus) {
        lisattavat.add(otus);
    }

    public void poistaOtus(PeliOtus kuva) {
        poistettavat.add(kuva);
    }
    
    public ArrayList<PeliOtus> getOtukset() {
        return kaikkiOtukset;
    }
    
    public void lisaaNappi(Nappi nappi) {
        lisattavat.add(nappi);
        napit.add(nappi);
    }
    public ArrayList<Nappi> getNapit() {
        return napit;
    }

    public void lisaaOtukset(ArrayList<PeliOtus> otukset) {
        lisattavat.addAll(otukset);
    }

    @Override
    public void render(float f) {
        tarkistaSyote();
        paivita();
        pyyhi();
        kaikkiOtukset.addAll(lisattavat);
        lisattavat.clear();
        kaikkiOtukset.removeAll(poistettavat);
        poistettavat.clear();
        for (PeliOtus otus : kaikkiOtukset) {
            otus.piirra();
        }
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

    private void pyyhi() {
        Gdx.gl.glClearColor(255, 255, 255, 0);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
    }
}
