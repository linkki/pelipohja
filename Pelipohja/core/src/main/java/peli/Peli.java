
package peli;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import libraries.Skenelista;
import libraries.Kuuntelija;

class Peli extends Game{

    public static final int SCREEN_WIDTH = 1200;    
    public static final int SCREEN_HEIGHT = 900;
    
    public static Skenelista skenelista;
    public static Kuuntelija kuuntelija;
    
    

    @Override
    public void create() {  
        // Tässä tehdään pelin rakenteen valmisteluja, joihin ei tarvitse koskea
        skenelista = new Skenelista();
        kuuntelija = new Kuuntelija();        
        Gdx.input.setInputProcessor(kuuntelija);
        
        // Tässä luodaan pelissä käytetyt Skenet.
        ValikkoSkene menu = new ValikkoSkene();
        menu.alusta();
        skenelista.lisaaSkene(menu);
        
        // Tähän alle voi lisätä pelin muut skenet, esim.
        // PeliSkene peli = new PeliSkene();
        // peli.alusta();
        // skenelista.lisaaSkene(peli);
        
    }

    @Override
    public void render(){
        skenelista.getSkeneNyt().render(30);
    }
    
}
