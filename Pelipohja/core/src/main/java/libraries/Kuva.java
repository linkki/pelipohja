
package libraries;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Kuva extends PeliOtus{

    public Kuva(float x, float y, Sprite kuva) {
        super(x, y, kuva);
    }
    
    public Kuva(float x, float y, String kuvanOsoite) {
        super(x, y, kuvanOsoite);
    }

}
