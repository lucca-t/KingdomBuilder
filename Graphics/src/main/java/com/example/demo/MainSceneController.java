package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainSceneController {

    @FXML
    private ImageView bonusTile0,bonusTile1,bonusTile2,bonusTile3,bonusTile4,bonusTile5,bonusTile6,bonusTile7;
    @FXML
    private Button confirmPlaceButton;

    @FXML
    private Label current;

    @FXML
    private ImageView currentTerrainCard;

    @FXML
    private Button finishTurnButton;

    @FXML
    private ImageView firstPlayerToken;

    @FXML
    private ImageView infoTile0;

    @FXML
    private ImageView infoTile1;

    @FXML
    private ImageView infoTile2;

    @FXML
    private ImageView infoTile3;

    @FXML
    private Button nextButton;

    @FXML
    private Label playerName;

    @FXML
    private ImageView pointCard0;

    @FXML
    private ImageView pointCard1;

    @FXML
    private ImageView pointCard2;

    @FXML
    private Button prevButton;

    @FXML
    private Button useBonusButton;

    //public KingdomBuilderMain game;
   /* public MainSceneController(){
         game = new KingdomBuilderMain();

        ArrayList players =game.getPlayers();
       game.getTurnPlayer();
        playerName.setText("Player "+game.getTurnNum());
        //drawPlayerinfo();
       // drawPointsCards();
       // drawInfoCards();







    }*/

    private void drawInfoCards() {



    }

    private void drawPointsCards()  {
        pointCard0 = new ImageView(new Image("/images/WorkerCard.jpg"));


    }
    private Image returnPointsCards(String str){
        Image temp=new Image("/images/board0.png");

        if(str.equals("Citizen"))
            temp=new Image("/images/CitizenCard.jpg");
        else if(str.equals("Discoverers"))
            temp=new Image("/images/DiscovererCard.jpg");
        else if(str.equals("Farmers"))
            temp=new Image("/images/FarmerCard.jpg");
        else if(str.equals("Fishermen"))
            temp=new Image("/images/FishermanCard.jpg");
        else if(str.equals("Hermits"))
            temp=new Image("/images/HermitCard.jpg");
        else if(str.equals("Knights"))
            temp=new Image("/images/KnightCard.jpg");
        else if(str.equals("Lords"))
            temp=new Image("/images/LordCard.jpg");
        else if(str.equals("Merchants"))
            temp=new Image("/images/MerchantCard.jpg");
        else if(str.equals("Miners"))
            temp=new Image("/images/Workers.jpg");





        return temp;

    }

    private void drawPlayerinfo() {
        
        
    }


    @FXML
    void confirmPlace(ActionEvent event) {

    }

    @FXML
    void finishTurn(ActionEvent event) {

    }

    @FXML
    void next(ActionEvent event) {

    }

    @FXML
    void previous(ActionEvent event) {

    }

    @FXML
    void useBonus(ActionEvent event) {

    }



}

