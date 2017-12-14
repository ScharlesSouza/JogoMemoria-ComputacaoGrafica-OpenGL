package br.com.hellmets.motocerol;

import android.media.MediaPlayer;

import br.com.hellmets.motocerol.AndGraph.AGActivityGame;
import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGMusic;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSoundManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;

/**
 * Created by labmacmini18 on 16/11/17.
 */

public class CenaAmarela extends AGScene {

    //AGSprite carta = null;
    AGSprite gato = null;


    double r,g,b=0;

    CenaAmarela(AGGameManager vrManager){

        super(vrManager);
    }


    @Override
    public void init() {
        setSceneBackgroundColor(1,1,0);
        /*
        carta = this.createSprite( R.mipmap.versocarta,1,1);//ultimos parametros significa coluna/linha da imagem
        carta.setScreenPercent(50,50);
        carta.vrPosition.setX(AGScreenManager.iScreenWidth/2);
        carta.vrPosition.setY(AGScreenManager.iScreenHeight/2);
        */




        gato = this.createSprite(R.mipmap.cat,2,4);//ultimos parametros significa coluna/linha da imagem
        gato.setScreenPercent(40,20);
        gato.vrPosition.setXY(0, AGScreenManager.iScreenHeight/2);

        //colocando musica na cena
        AGSoundManager.vrMusic.loadMusic("music.mp3", true);
        AGSoundManager.vrMusic.play();



    }
    public void tocaMusica(AGMusic musica){
        musica.play();

    }

    @Override
    public void restart() {
    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {
        r = Math.random();
        g = Math.random();
        b = Math.random();//tentativa de fazer a tela mudar de cores

        setSceneBackgroundColor((float)r,(float)g,(float)b);
        //carta.vrPosition.setXY(carta.vrPosition.getX()+10, carta.vrPosition.getY());






        if(AGInputManager.vrTouchEvents.screenClicked()){
            this.vrGameManager.setCurrentScene(0);
            return;

        }
        gato.addAnimation(10, true ,0,7);//parametros: quadros por segundo, voltar ao primeiro quadro depois que chegar no ultimo quadro da imagem, posiçao do primero quadro , posição do ultimo quadro na imagem




            //verifica se estar no fim da tela, na largura total da tela.
            if(gato.vrPosition.getX() == AGScreenManager.iScreenWidth){
                //espelhamento da imagem
                gato.iMirror = AGSprite.HORIZONTAL;

                //verifica se estar no inicio da tela, na largura 0 da tela.
            }else if(gato.vrPosition.getX() == AGScreenManager.iScreenWidth - AGScreenManager.iScreenWidth) {

                gato.iMirror = AGSprite.NONE;

            }

        //faz com que o gato corra na direção, de acordo com o lado que a imagem estiver virada
        if(gato.iMirror == AGSprite.NONE){
                    gato.vrPosition.setXY(gato.vrPosition.getX()+5, gato.vrPosition.getY());
        }else if(gato.iMirror == AGSprite.HORIZONTAL) {
                    gato.vrPosition.setXY(gato.vrPosition.getX()-5, gato.vrPosition.getY());
        }




    }
}
