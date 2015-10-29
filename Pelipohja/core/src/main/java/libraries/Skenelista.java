package libraries;

import java.util.ArrayList;

public class Skenelista {

    private int skeneNyt;
    private ArrayList<Skene> skeneLista;

    public Skenelista() {
        skeneLista = new ArrayList<Skene>();
    }

    public void lisaaSkene(Skene skene) {
        skeneLista.add(skene);
    }

    public Skene getSkene(int monesko) {
        return skeneLista.get(monesko);
    }

    public void seuraavaSkene() {
        skeneNyt++;
    }

    public void setSkeneNyt(int monesko) {
        this.skeneNyt = monesko;
    }

    public Skene getSkeneNyt() {
        return skeneLista.get(skeneNyt);
    }

    public ArrayList<Skene> getSkenelista(){
        return skeneLista;
    }
}
