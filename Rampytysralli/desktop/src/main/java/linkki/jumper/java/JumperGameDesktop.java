package linkki.jumper.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import linkki.jumper.core.JumperGame;

public class JumperGameDesktop {

    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.useGL20 = true;
        new LwjglApplication(new JumperGame(), config);
    }
}
