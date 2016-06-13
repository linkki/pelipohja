
package peli;

import com.badlogic.gdx.Game;
import libraries.Skenelista;

class Peli extends Game{

    static final int SCREEN_WIDTH = 1200;    
    static final int SCREEN_HEIGHT = 900;
    
    static Skenelista skenelista;
    
    

    @Override
    public void create() {        
        skenelista = new Skenelista();
        
        // Tässä luodaan pelissä käytetyt Skenet
        ValikkoSkene menu = new ValikkoSkene();
        menu.alusta();
        skenelista.lisaaSkene(menu);
    }

    @Override
    public void render(){
        skenelista.getSkeneNyt().render(30);
    }
    
}
