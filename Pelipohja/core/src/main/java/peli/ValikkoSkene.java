package peli;

import libraries.Kuuntelija;
import libraries.Nappi;
import libraries.Skene;
import libraries.Kuva;

class ValikkoSkene extends Skene {

    private Kuuntelija kuuntelija;
    
    @Override
    public void alusta() {
        // asetetaan taustakuva 
        asetaKuva("tausta", 0, 0, "assets/bg2.png");
        
        // luodaan nappi, jolla voi sulkea ohjelman
        Nappi sulje = new Nappi(0, 0, "assets/buttonQuit.png", "assets/buttonQuitHover.png", "SULJE");
        lisaaNappi(sulje);
                
        
        // tässä luodaan kuuntelija, joka seuraa hiiren liikkeitä ja painalluksia
        // tähän ei tarvitse koskea!
        kuuntelija = Peli.kuuntelija;
    }

    @Override
    public void paivita() {

    }

    @Override
    public void tarkistaSyote() {        
        for (Nappi nappi : super.getNapit()) {
            if (nappi.koskeekoHiiri(kuuntelija.getHiiriX(), kuuntelija.getHiiriY())) {
                nappi.setLeijuu(true); // jos hiiri koskee nappiin, kerrotaan tämä napille, jotta se voi käyttää eri kuvaa
                if (kuuntelija.vasenNappiPainettu()) {
                    if ("SULJE".equals(nappi.getNapinNimi())) {
                        System.exit(0);
                    }
//                    if ("PELAA".equals(nappi.getNapinNimi())) {
//                        Peli.skenelista.seuraavaSkene();
//                    }
                }
            } else {
                nappi.setLeijuu(false);
            }
        }
    }

}
