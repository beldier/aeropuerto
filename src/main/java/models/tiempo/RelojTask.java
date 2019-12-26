package models.tiempo;

import java.util.TimerTask;

public class RelojTask extends TimerTask {

    @Override
    public void run(){
        Reloj.actualizarHora();
    }

}
