package linkki.jumper.html;

import linkki.jumper.core.JumperGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class JumperGameHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new JumperGame();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
