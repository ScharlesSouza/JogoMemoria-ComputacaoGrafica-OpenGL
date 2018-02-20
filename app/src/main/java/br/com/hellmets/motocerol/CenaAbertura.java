package br.com.hellmets.motocerol;

import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;
import br.com.hellmets.motocerol.AndGraph.AGTimer;

/**
 * Created by labmacmini18 on 16/11/17.
 */

public class CenaAbertura extends AGScene {
    //atributo de classe
    AGTimer tempo = null;
    AGSprite botaoJogar = null;
    AGSprite botaoSobre = null;
    AGSprite logo = null;


    CenaAbertura(AGGameManager vrManager){

        super(vrManager);
    }


    @Override
    public void init() {
        setSceneBackgroundColor(1,1,1);

        logo = this.createSprite( R.mipmap.menu_jogo,1,1);
        logo.setScreenPercent(80,30);
        logo.vrPosition.setX(AGScreenManager.iScreenWidth/2);
        logo.vrPosition.setY(AGScreenManager.iScreenHeight*0.8f);

        botaoSobre = this.createSprite( R.mipmap.bt_sobre,1,1);
        botaoSobre.setScreenPercent(30,20);
        botaoSobre.vrPosition.setX(AGScreenManager.iScreenWidth*0.33f);
        botaoSobre.vrPosition.setY(AGScreenManager.iScreenHeight*0.35f);


        botaoJogar = this.createSprite( R.mipmap.bt_jogar,1,1);
        botaoJogar.setScreenPercent(30,20);
        botaoJogar.vrPosition.setX(AGScreenManager.iScreenWidth*0.66f);
        botaoJogar.vrPosition.setY(AGScreenManager.iScreenHeight*0.35f);
    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

        if(AGInputManager.vrTouchEvents.screenClicked()){

            if(botaoSobre.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                this.vrGameManager.setCurrentScene(1);
                return;
            }

            if(botaoJogar.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                this.vrGameManager.setCurrentScene(2);
                return;
            }

        }



    }



}
