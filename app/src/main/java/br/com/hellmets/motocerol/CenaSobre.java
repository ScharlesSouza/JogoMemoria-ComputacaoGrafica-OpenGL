package br.com.hellmets.motocerol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;

/**
 * Created by labmacmini18 on 16/11/17.
 */

public class CenaSobre extends AGScene {

    AGSprite imagemFundo= null;



    CenaSobre(AGGameManager vrManager){

        super(vrManager);
    }


    @Override
    public void init() {
        setSceneBackgroundColor(1,1,1);
        imagemFundo = createSprite(R.mipmap.sobre,1,1);
        imagemFundo.setScreenPercent(100,100);
        imagemFundo.vrPosition.setXY(AGScreenManager.iScreenWidth/2, AGScreenManager.iScreenHeight/2);



    }

    @Override
    public void restart() {
    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

        if(AGInputManager.vrTouchEvents.backButtonClicked()){

            this.vrGameManager.setCurrentScene(0);
            return;
        }


        if(AGInputManager.vrTouchEvents.screenClicked()){




        }





    }
}
