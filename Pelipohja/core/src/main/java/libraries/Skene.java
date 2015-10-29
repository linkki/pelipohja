package libraries;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import java.util.ArrayList;

public abstract class Skene implements Screen {

    private ArrayList<PeliOtus> kaikkiOtukset;
    private ArrayList<PeliOtus> lisattavat;
    private ArrayList<PeliOtus> poistettavat;

    public Skene() {
        kaikkiOtukset = new ArrayList<PeliOtus>();
        lisattavat = new ArrayList<PeliOtus>();
        poistettavat = new ArrayList<PeliOtus>();
    }

    public abstract void alusta();

    public abstract void paivita();

    public abstract void tarkistaSyote();

    public void lisaaOtus(PeliOtus kuva) {
        lisattavat.add(kuva);
    }

    public void poistaOtus(PeliOtus kuva) {
        poistettavat.add(kuva);
    }

    //REFACTOR THIS AWAY TO THE ONE BELOW THIS METHOD
    public void lisaaNapit(ArrayList<MenuNappi> napit) {
        lisattavat.addAll(napit);
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
