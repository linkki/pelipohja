package peli;

import peli.Peli;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;

public class PelinAlustaja 
{
    
    
    public static void main( String[] args )
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.useGL20 = false;
        config.fullscreen = false;
        config.width = Peli.SCREEN_WIDTH;
        config.height = Peli.SCREEN_HEIGHT;
        Texture.setEnforcePotImages(false);
        new LwjglApplication(new Peli(), config);
    }
}
