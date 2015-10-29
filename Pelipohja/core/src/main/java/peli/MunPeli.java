
package peli;

import com.badlogic.gdx.Game;
import libraries.Skenelista;

class MunPeli extends Game{

    static final int SCREEN_WIDTH = 1200;    
    static final int SCREEN_HEIGHT = 900;
    
    static Skenelista sceneManager;
    
    

    @Override
    public void create() {        
        sceneManager = new Skenelista();
        MenuSkene menu = new MenuSkene();
        menu.alusta();
        sceneManager.lisaaSkene(menu);
    }

    @Override
    public void render(){
        sceneManager.getSkeneNyt().render(30);
    }
    
}
