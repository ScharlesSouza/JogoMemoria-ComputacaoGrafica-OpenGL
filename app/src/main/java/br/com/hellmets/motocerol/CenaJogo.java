package br.com.hellmets.motocerol;

import br.com.hellmets.motocerol.AndGraph.AGGameManager;
import br.com.hellmets.motocerol.AndGraph.AGInputManager;
import br.com.hellmets.motocerol.AndGraph.AGMusic;
import br.com.hellmets.motocerol.AndGraph.AGScene;
import br.com.hellmets.motocerol.AndGraph.AGScreenManager;
import br.com.hellmets.motocerol.AndGraph.AGSoundEffect;
import br.com.hellmets.motocerol.AndGraph.AGSoundManager;
import br.com.hellmets.motocerol.AndGraph.AGSprite;
import br.com.hellmets.motocerol.AndGraph.AGTimer;
import br.com.hellmets.motocerol.R;


import java.util.ArrayList;
import java.util.Collections;
//import java.util.ListIterator;

/**
 * Created by labmacmini18 on 16/11/17.
 */

public class CenaJogo extends AGScene {

    //Declaração dos sprites
    AGSprite carta1, carta2, carta3, carta4, carta5, carta6, carta7,carta8,carta9,carta10 = null;
    AGSprite cartaSelecionada1 = null;

    //declaração de vetores de posições, com dois indices: para altura e largura
    //Float pos1[], pos2[],pos3[], pos4[], pos5[], pos6[],pos7[], pos8[] , pos9[] , pos10[] = null;


    //INICALIZAÇÃO DAS 10 POSIÇÕES COM 2 INDICES CADA.
    Float pos1[] = new Float[2];
    Float pos2[] = new Float[2];
    Float pos3[] = new Float[2];
    Float pos4[] = new Float[2];
    Float pos5[] = new Float[2];
    Float pos6[] = new Float[2];
    Float pos7[] = new Float[2];
    Float pos8[] = new Float[2];
    Float pos9[] = new Float[2];
    Float pos10[] = new Float[2];



    //declaração de outras bvariaveis de controle
    Integer  tempoEspera= 0;
    AGTimer tempo = null;
    Integer somA, somE, somI, somO, somU = 0;

    //construtor
    CenaJogo(AGGameManager vrManager){

        super(vrManager);
    }


    @Override
    public void init() {
        //cor do brackground
        setSceneBackgroundColor(1,1,1);

        //inicialização da variavel tempo, para definir tempo de resolução do problema
        tempo = new AGTimer(40);

        carta1=null;
        carta2 =null;
        carta3=null;
        carta4=null;
        carta5=null;
        carta6=null;
        carta7=null;
        carta8=null;
        carta9=null;
        carta10 = null;

        //DEFINICIÇÃO DOS VALORES DE [0]:LARGURA E  [1]:ALTURA PARA CADA VARIAVEL DE POSIÇÃO
        pos1[0] = null;
        pos1[1] =  null;
        pos2[0] = null;
        pos2[1] =  null;
        pos3[0] = null;
        pos3[1] =  null;
        pos4[0] = null;
        pos4[1] =  null;
        pos5[0] = null;
        pos5[1] =  null;
        pos6[0] = null;
        pos6[1] =  null;
        pos7[0] = null;
        pos7[1] =  null;
        pos8[0] = null;
        pos8[1] =  null;
        pos9[0] = null;
        pos9[1] =  null;
        pos10[0] = null;
        pos10[1] =  null;

        /* INICIALIZAÇÃO DOS SPRITES DE VOGAIS, DEFININIÇÃO DOS TAMANHOS PERCENTUAIS A TELA, DEFINIÇÃO DA IMAGEM PADRÃO A SER EXIBIDA */

        carta1 = this.createSprite( R.mipmap.letraa,2,1);//ultimos parametros significa coluna/linha da imagem
        carta1.setScreenPercent(18,40);
        carta1.addAnimation(1, true,0);
        carta1.addAnimation(1,true,1);
        carta1.setCurrentAnimation(1);

        carta2 = this.createSprite( R.mipmap.letraa,2,1);//ultimos parametros significa coluna/linha da imagem
        carta2.setScreenPercent(18,40);
        carta2.addAnimation(1, true,0);
        carta2.addAnimation(1,true,1);
        carta2.setCurrentAnimation(1);

        carta3 = this.createSprite( R.mipmap.letrae,2,1);//ultimos parametros significa coluna/linha da imagem
        carta3.setScreenPercent(18,40);
        carta3.addAnimation(1, true,0);
        carta3.addAnimation(1,true,1);
        carta3.setCurrentAnimation(1);

        carta4 = this.createSprite( R.mipmap.letrae,2,1);//ultimos parametros significa coluna/linha da imagem
        carta4.setScreenPercent(18,40);
        carta4.addAnimation(1, true,0);
        carta4.addAnimation(1,true,1);
        carta4.setCurrentAnimation(1);

        carta5 = this.createSprite( R.mipmap.letrai,2,1);//ultimos parametros significa coluna/linha da imagem
        carta5.setScreenPercent(18,40);
        carta5.addAnimation(1, true,0);
        carta5.addAnimation(1,true,1);
        carta5.setCurrentAnimation(1);

        carta6 = this.createSprite( R.mipmap.letrai,2,1);//ultimos parametros significa coluna/linha da imagem
        carta6.setScreenPercent(18,40);
        carta6.addAnimation(1, true,0);
        carta6.addAnimation(1,true,1);
        carta6.setCurrentAnimation(1);

        carta7 = this.createSprite( R.mipmap.letrao,2,1);//ultimos parametros significa coluna/linha da imagem
        carta7.setScreenPercent(18,40);
        carta7.addAnimation(1, true,0);
        carta7.addAnimation(1,true,1);
        carta7.setCurrentAnimation(1);

        carta8 = this.createSprite( R.mipmap.letrao,2,1);//ultimos parametros significa coluna/linha da imagem
        carta8.setScreenPercent(18,40);
        carta8.addAnimation(1, true,0);
        carta8.addAnimation(1,true,1);
        carta8.setCurrentAnimation(1);

        carta9 = this.createSprite( R.mipmap.letrau,2,1);//ultimos parametros significa coluna/linha da imagem
        carta9.setScreenPercent(18,40);
        carta9.addAnimation(1, true,0);
        carta9.addAnimation(1,true,1);
        carta9.setCurrentAnimation(1);

        carta10 = this.createSprite( R.mipmap.letrau,2,1);//ultimos parametros significa coluna/linha da imagem
        carta10.setScreenPercent(18,40);
        carta10.addAnimation(1, true,0);
        carta10.addAnimation(1,true,1);
        carta10.setCurrentAnimation(1);

        /*
        //INICALIZAÇÃO DAS 10 POSIÇÕES COM 2 INDICES CADA.
        pos1 = new Float[2];
        pos2 = new Float[2];
        pos3 = new Float[2];
        pos4 = new Float[2];
        pos5 = new Float[2];
        pos6 = new Float[2];
        pos7 = new Float[2];
        pos8 = new Float[2];
        pos9 = new Float[2];
        pos10 = new Float[2];
*/

        //DEFINICIÇÃO DOS VALORES DE [0]:LARGURA E  [1]:ALTURA PARA CADA VARIAVEL DE POSIÇÃO
        pos1[0] = AGScreenManager.iScreenWidth*(0.1f);
        pos1[1] =  AGScreenManager.iScreenHeight*(0.25f);
        pos2[0] = AGScreenManager.iScreenWidth*(0.3f);
        pos2[1] =  AGScreenManager.iScreenHeight*(0.25f);
        pos3[0] = AGScreenManager.iScreenWidth*(0.5f);
        pos3[1] =  AGScreenManager.iScreenHeight*(0.25f);
        pos4[0] = AGScreenManager.iScreenWidth*(0.7f);
        pos4[1] =  AGScreenManager.iScreenHeight*(0.25f);
        pos5[0] = AGScreenManager.iScreenWidth*(0.9f);
        pos5[1] =  AGScreenManager.iScreenHeight*(0.25f);
        pos6[0] = AGScreenManager.iScreenWidth*(0.1f);
        pos6[1] =  AGScreenManager.iScreenHeight*(0.75f);
        pos7[0] = AGScreenManager.iScreenWidth*(0.3f);
        pos7[1] =  AGScreenManager.iScreenHeight*(0.75f);
        pos8[0] = AGScreenManager.iScreenWidth*(0.5f);
        pos8[1] =  AGScreenManager.iScreenHeight*(0.75f);
        pos9[0] = AGScreenManager.iScreenWidth*(0.7f);
        pos9[1] =  AGScreenManager.iScreenHeight*(0.75f);
        pos10[0] = AGScreenManager.iScreenWidth*(0.9f);
        pos10[1] =  AGScreenManager.iScreenHeight*(0.75f);


        //declaração de um arraylist para ser usado no embaralhamento das posições
        ArrayList<Float[]> lista = new ArrayList<Float[]>();

        //Crio uma lista de posições para embaralhar com a função Collections.shuffle
        lista.add(0,pos1);
        lista.add(1,pos2);
        lista.add(2,pos3);
        lista.add(3,pos4);
        lista.add(4,pos5);
        lista.add(5,pos6);
        lista.add(6,pos7);
        lista.add(7,pos8);
        lista.add(8,pos9);
        lista.add(9,pos10);


        //função que embaralha as posiçoes
        Collections.shuffle(lista);


        //POSICIONAMENTO DAS CARTAS NA TELA DO DISPOSITIVO
        carta1.vrPosition.setXY(lista.get(0)[0], lista.get(0)[1]);
        carta2.vrPosition.setXY(lista.get(1)[0], lista.get(1)[1]);
        carta3.vrPosition.setXY(lista.get(2)[0], lista.get(2)[1]);
        carta4.vrPosition.setXY(lista.get(3)[0], lista.get(3)[1]);
        carta5.vrPosition.setXY(lista.get(4)[0], lista.get(4)[1]);
        carta6.vrPosition.setXY(lista.get(5)[0], lista.get(5)[1]);
        carta7.vrPosition.setXY(lista.get(6)[0], lista.get(6)[1]);
        carta8.vrPosition.setXY(lista.get(7)[0], lista.get(7)[1]);
        carta9.vrPosition.setXY(lista.get(8)[0], lista.get(8)[1]);
        carta10.vrPosition.setXY(lista.get(9)[0], lista.get(9)[1]);




        //colocando musica na cena
        //AGSoundManager.vrMusic.loadMusic("music.mp3", true);
        //AGSoundManager.vrMusic.play();


        // INICIALIZAÇÃO DE SONS DAS VOGAIS PARA EFEITOS
        somA = AGSoundManager.vrSoundEffects.loadSoundEffect("a.mp3");
        somE = AGSoundManager.vrSoundEffects.loadSoundEffect("e.mp3");
        somI = AGSoundManager.vrSoundEffects.loadSoundEffect("i.mp3");
        somO = AGSoundManager.vrSoundEffects.loadSoundEffect("o.mp3");
        somU = AGSoundManager.vrSoundEffects.loadSoundEffect("u.mp3");







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

        //SE O BUTÃO VOLTAR FOR PRESSIONADO, MUDAR A CENA PARA O MENU
        if(AGInputManager.vrTouchEvents.backButtonClicked()){

            this.vrGameManager.setCurrentScene(0);
            return;
        }


        //SE O USUARIO CLICAR NA TELA
        if(AGInputManager.vrTouchEvents.screenClicked()){

            //SE O CLIQUE NA TELA ACONTECER ENCIMA DA CARTA 1
           if(carta1.collide(AGInputManager.vrTouchEvents.getLastPosition())){

               //MOSTRA A VOGAL
                carta1.setCurrentAnimation(0);

                //SE NÃO TINHA CARTA SELECIONADA ANTES, OU SEJA, FOR A PRIMEIRA CARTA SELECIONADA DO PAR, MANTENHA A CARTA ABERTA E TOCA O SOM DA VOGAL.
                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta1;AGSoundManager.vrSoundEffects.play(somA);

                //SE A CARTA SELECIONADA FOR A SEGUNDA DO PAR E FOR IGUAIS, TOCA O SOM DA VOGAL E LIBERA A CARTA SELECIONADA PARA NULO.
                }else if(cartaSelecionada1 == carta2){
                    AGSoundManager.vrSoundEffects.play(somA);
                    cartaSelecionada1 = null;

                }else{ //SE AS CARTAS FOREM DIFERENTES CHAMA A FUNÇÃO ERRO
                    carta1.setCurrentAnimation(0);
                    erro(carta1, cartaSelecionada1);
                }


                return;
            }

            if(carta2.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta2.setCurrentAnimation(0);

                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta2;
                    AGSoundManager.vrSoundEffects.play(somA);


                }else if(cartaSelecionada1 == carta1){
                    AGSoundManager.vrSoundEffects.play(somA);
                    cartaSelecionada1 = null;
                }else{
                    carta2.setCurrentAnimation(0);
                    erro(carta2, cartaSelecionada1);
                }

                return;
            }
            if(carta3.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta3.setCurrentAnimation(0);


                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta3;
                    AGSoundManager.vrSoundEffects.play(somE);


                }else if(cartaSelecionada1 == carta4){
                    AGSoundManager.vrSoundEffects.play(somE);
                    cartaSelecionada1 = null;
                }else {
                    carta3.setCurrentAnimation(0);
                    erro(carta3, cartaSelecionada1);
                }

                return;


            }
            if(carta4.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta4.setCurrentAnimation(0);

                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta4;
                    AGSoundManager.vrSoundEffects.play(somE);


                }else if(cartaSelecionada1 == carta3){
                    AGSoundManager.vrSoundEffects.play(somE);
                    cartaSelecionada1 = null;
                }else {
                    carta4.setCurrentAnimation(0);
                    erro(carta4, cartaSelecionada1);
                }
                return;
            }
            if(carta5.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta5.setCurrentAnimation(0);
                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta5;
                    AGSoundManager.vrSoundEffects.play(somI);


                }else if(cartaSelecionada1 == carta6){
                    AGSoundManager.vrSoundEffects.play(somI);
                    cartaSelecionada1 = null;
                }else {
                    carta5.setCurrentAnimation(0);
                    erro(carta5, cartaSelecionada1);
                }

                return;
            }
            if(carta6.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta6.setCurrentAnimation(0);
                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta6;
                    AGSoundManager.vrSoundEffects.play(somI);


                }else if(cartaSelecionada1 == carta5){
                    AGSoundManager.vrSoundEffects.play(somI);
                    cartaSelecionada1 = null;
                }else{
                    carta6.setCurrentAnimation(0);
                    erro(carta6, cartaSelecionada1);
                }

                return;
            }
            if(carta7.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta7.setCurrentAnimation(0);
                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta7;
                    AGSoundManager.vrSoundEffects.play(somO);


                }else if(cartaSelecionada1 == carta8){
                    AGSoundManager.vrSoundEffects.play(somO);
                    cartaSelecionada1 = null;
                }else{
                    carta7.setCurrentAnimation(0);
                    erro(carta7, cartaSelecionada1);
                }

                return;
            }
            if(carta8.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta8.setCurrentAnimation(0);
                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta8;
                    AGSoundManager.vrSoundEffects.play(somO);


                }else if(cartaSelecionada1 == carta7){
                    AGSoundManager.vrSoundEffects.play(somO);
                    cartaSelecionada1 =null;
                }else{
                    carta8.setCurrentAnimation(0);
                    erro(carta8, cartaSelecionada1);
                }

                return;
            }
            if(carta9.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta9.setCurrentAnimation(0);

                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta9;
                    AGSoundManager.vrSoundEffects.play(somU);


                }else if(cartaSelecionada1 == carta10){
                    AGSoundManager.vrSoundEffects.play(somU);
                    cartaSelecionada1 = null;
                }else{
                    carta9.setCurrentAnimation(0);
                    erro(carta9, cartaSelecionada1);
                }
                return;
            }
            if(carta10.collide(AGInputManager.vrTouchEvents.getLastPosition())){

                carta10.setCurrentAnimation(0);

                if(cartaSelecionada1 == null){
                    cartaSelecionada1 = carta10;
                    AGSoundManager.vrSoundEffects.play(somU);


                }else if(cartaSelecionada1 == carta9){
                    AGSoundManager.vrSoundEffects.play(somU);
                    cartaSelecionada1 = null;
                }else {
                    carta10.setCurrentAnimation(0);
                    erro(carta10, cartaSelecionada1);
                }

                return;
            }


        }
        return;


    }


    //FUNÇAO QUE TRATAR O ERRO DE SELEÇÃO DE CARTAS DIFERENTES
    public void erro(AGSprite cartaAtual, AGSprite cartaAberta){
        //ESCONDE AS VOGAIS
        cartaAtual.setCurrentAnimation(1);
        cartaAberta.setCurrentAnimation(1);

        //ZERA A CARTA SELECIONADA
        cartaSelecionada1=null;

        return;


    }
}
