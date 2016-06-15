package libraries;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputProcessor;

public class Kuuntelija implements InputProcessor {

    private boolean nappiPainettu = false;
    private float hiiriX;
    private float hiiriY;

    public boolean vasenNappiPainettu() {
        return nappiPainettu;
    }

    public float getHiiriX() {
        return hiiriX;
    }

    public float getHiiriY() {
        return hiiriY;
    }
    @Override
    public boolean keyDown(int i) {
        return false;
    }

    @Override
    public boolean keyUp(int i) {
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    @Override
    public boolean touchDown(int mouseX, int mouseY, int pointer, int button) {
        if (button == Buttons.LEFT) {
            nappiPainettu = true;
        }
        return false;
    }

    @Override
    public boolean touchUp(int mouseX, int mouseY, int pointer, int button) {
        if (button == Buttons.LEFT) {
            nappiPainettu = false;
        }
        return false;
    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;
    }

    @Override
    public boolean mouseMoved(int mouseX, int mouseY) {
        this.hiiriX = mouseX;
        this.hiiriY = mouseY;
        return false;
    }

    @Override
    public boolean scrolled(int i) {
        return false;
    }

}
