//Aplication package
package br.com.hellmets.motocerol;

//Used Packages
import android.os.Bundle;
import br.com.hellmets.motocerol.AndGraph.AGActivityGame;
import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGMusic;


public class Game extends AGActivityGame
{


    AGMusic musica = new AGMusic(this);

    public void onCreate(Bundle saved)
    {

        super.onCreate(saved);

        //(this=esta tela, false= não utilizar acelelometro)
        this.vrManager = new AGGameManager(this, false);

        //referencia da scena
        CenaAbertura vrAbertura = new CenaAbertura(vrManager);
        //add scena de abertura no GameManager. a cena tem identificador de acordo com sua chammada.
        vrManager.addScene(vrAbertura);

        //referencia da scena
        CenaSobre vrSobre = new CenaSobre(vrManager);
        //add scena de abertura no GameManager. a cena tem identificador de acordo com sua chammada.
        vrManager.addScene(vrSobre);


        //referencia da scena
        CenaJogo vrCenaJogo = new CenaJogo(vrManager);
        //add scena de abertura no GameManager. a cena tem identificador de acordo com sua chammada.
        vrManager.addScene(vrCenaJogo);



        //musica.loadMusic("musica.mp3", true);
        //vrAmarela.tocaMusica(musica);





    }
}
