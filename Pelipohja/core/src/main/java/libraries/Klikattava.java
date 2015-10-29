
package libraries;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;


public abstract class Klikattava extends PeliOtus{
    
    private boolean leijuu;
    
    public Klikattava(float x, float y, Sprite kuva) {
        super(x, y, kuva);
    }
    
    public boolean koskeekoHiiri(float hiiriX, float hiiriY){
        return getHahmoAlue().contains(hiiriX, Math.abs(hiiriY - Gdx.app.getGraphics().getHeight()));
    }

    public boolean getLeijuu() {
        return leijuu;
    }

    public void setLeijuu(boolean leijuu) {
        this.leijuu = leijuu;
    }
    
    @Override
    public void liiku() {
    }
}
