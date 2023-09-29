package hn.edu.unah.proyectow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Controlador {

    @FXML
    private TextField palabraUsuario;
    @FXML
    private Button Boton0;
    @FXML
    private Button Boton1;
    @FXML
    private Button Boton2;
    @FXML
    private Button Boton3;
    @FXML
    private Button Boton4;
    @FXML
    private Button Boton5;
    @FXML
    private Button Boton6;
    @FXML
    private Button Boton7;
    @FXML
    private Button Boton8;
    @FXML
    private Button Boton9;
    @FXML
    private Button Boton10;
    @FXML
    private Button Boton11;
    @FXML
    private Button Boton12;
    @FXML
    private Button Boton13;
    @FXML
    private Button Boton14;
    @FXML
    private Button Boton15;
    @FXML
    private Button Boton16;
    @FXML
    private Button Boton17;
    @FXML
    private Button Boton18;
    @FXML
    private Button Boton19;
    @FXML
    private Button Boton20;
    @FXML
    private Button Boton21;
    @FXML
    private Button Boton22;
    @FXML
    private Button Boton23;
    @FXML
    private Button Boton24;
    @FXML
    private Button Boton25;
    @FXML
    private Button Boton26;
    @FXML
    private Button Boton27;
    @FXML
    private Button Boton28;
    @FXML
    private Button Boton29;

    String azar = palabrAzar().toUpperCase();
    private int cont_p=0;
    almacenarAzar guardando = new almacenarAzar();


    public Controlador() throws FileNotFoundException {
    }


    @FXML
    protected void onButtonClick() throws IOException {
        String palabra = palabraUsuario.getText();
        guardando.almacenamiento(azar);
        FileReader Posibilidades = new FileReader("src/main/resources/hn/edu/unah/proyectow/PalabrasDisponibles.txt");
        BufferedReader Buffer = new BufferedReader(Posibilidades);
        String Lector = "";
        int i = 0;
        boolean existe;
        int cont_v=0;
        int cont_v1=0;
        int cont_v2=0;
        int cont_v3=0;
        int cont_v4=0;
        int cont_final=0;

        if(palabra.length()>5 ||palabra.length()<5){
            mostrarError();
        }else {
            while(Lector!=null){
                if(Lector.equalsIgnoreCase(palabra)==true){
                    if(palabra==palabra.toLowerCase()){
                        mostrarError3();
                        break;
                    }
                    cont_p++;
                    if(Boton0.getText()==""){
                        existe = false;
                        Boton0.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton0.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton0.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton0.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }else if(Boton5.getText()==""){
                        existe = false;
                        Boton5.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton5.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton5.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton5.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }else if(Boton10.getText()==""){
                        existe = false;
                        Boton10.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton10.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton10.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton10.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }else if(Boton15.getText()==""){
                        existe = false;
                        Boton15.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton15.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton15.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton15.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }else if(Boton20.getText()==""){
                        existe = false;
                        Boton20.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton20.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton20.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton20.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }else if(Boton25.getText()==""){
                        existe = false;
                        Boton25.setText(String.valueOf(palabra.charAt(0)).toUpperCase());
                        for(int j=0;i<5;j++){
                            for(i=0;i<5;i++){
                                if(azar.charAt(i)==palabra.charAt(j)){
                                    existe = true;
                                    if(i==j){
                                        Boton25.setTextFill(Color.GREEN);
                                        if(cont_v<1){
                                            cont_v++;
                                        }else{
                                            cont_v=0;
                                        }
                                    }else if(i!=j){
                                        Boton25.setTextFill(Color.YELLOW);
                                    }
                                }else if(existe == false){
                                    Boton25.setTextFill(Color.GRAY);
                                }
                            }
                        }
                    }

                    //------------------------------------------------------------
                    cont_p++;
                    if(Boton1.getText()==""){
                        existe = false;
                        Boton1.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton1.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton1.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton1.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton6.getText()==""){
                        existe = false;
                        Boton6.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton6.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton6.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton6.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton11.getText()==""){
                        existe = false;
                        Boton11.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton11.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton11.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton11.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton16.getText()==""){
                        existe = false;
                        Boton16.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton16.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton16.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton16.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton21.getText()==""){
                        existe = false;
                        Boton21.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton21.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton21.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton21.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton26.getText()==""){
                        existe = false;
                        Boton26.setText(String.valueOf(palabra.charAt(1)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(1)){
                                existe = true;
                                if(i==1){
                                    Boton26.setTextFill(Color.GREEN);
                                    if(cont_v1<1){
                                        cont_v1++;
                                    }else{
                                        cont_v1=0;
                                    }
                                }else if(i!=1){
                                    Boton26.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton26.setTextFill(Color.GRAY);
                            }
                        }
                    }

                    //-------------------------------------------------------
                    cont_p++;
                    if(Boton2.getText()==""){
                        existe = false;
                        Boton2.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton2.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton2.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton2.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton7.getText()==""){
                        existe = false;
                        Boton7.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton7.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton7.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton7.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton12.getText()==""){
                        existe = false;
                        Boton12.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton12.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton12.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton12.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton17.getText()==""){
                        existe = false;
                        Boton17.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton17.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton17.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton17.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton22.getText()==""){
                        existe = false;
                        Boton22.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton22.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton22.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton22.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton27.getText()==""){
                        existe = false;
                        Boton27.setText(String.valueOf(palabra.charAt(2)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(2)){
                                existe = true;
                                if(i==2){
                                    Boton27.setTextFill(Color.GREEN);
                                    if(cont_v2<1){
                                        cont_v2++;
                                    }else{
                                        cont_v2=0;
                                    }
                                }else if(i!=2){
                                    Boton27.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton27.setTextFill(Color.GRAY);
                            }
                        }
                    }

                    //-------------------------------------------------------------------
                    cont_p++;
                    if(Boton3.getText()==""){
                        existe = false;
                        Boton3.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton3.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton3.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton3.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton8.getText()==""){
                        existe = false;
                        Boton8.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton8.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton8.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton8.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton13.getText()==""){
                        existe = false;
                        Boton13.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton13.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton13.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton13.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton18.getText()==""){
                        existe = false;
                        Boton18.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton18.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton18.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton18.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton23.getText()==""){
                        existe = false;
                        Boton23.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton23.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton23.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton23.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton28.getText()==""){
                        existe = false;
                        Boton28.setText(String.valueOf(palabra.charAt(3)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(3)){
                                existe = true;
                                if(i==3){
                                    Boton28.setTextFill(Color.GREEN);
                                    if(cont_v3<1){
                                        cont_v3++;
                                    }else{
                                        cont_v3=0;
                                    }
                                }else if(i!=3){
                                    Boton28.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton28.setTextFill(Color.GRAY);
                            }
                        }
                    }

                    //---------------------------------------------------
                    cont_p++;
                    if(Boton4.getText()==""){
                        existe = false;
                        Boton4.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton4.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton4.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton4.setTextFill(Color.GRAY);
                            }
                        }
                    } else if(Boton9.getText()==""){
                        existe = false;
                        Boton9.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton9.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton9.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton9.setTextFill(Color.GRAY);
                            }
                        }
                        }else if(Boton14.getText()==""){
                        existe = false;
                        Boton14.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton14.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton14.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton14.setTextFill(Color.GRAY);
                            }
                        }
                        }else if(Boton19.getText()==""){
                        existe = false;
                        Boton19.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton19.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton19.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton19.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton24.getText()==""){
                        existe = false;
                        Boton24.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton24.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton24.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton24.setTextFill(Color.GRAY);
                            }
                        }
                    }else if(Boton29.getText()==""){
                        existe = false;
                        Boton29.setText(String.valueOf(palabra.charAt(4)).toUpperCase());
                        for(i=0;i<5;i++){
                            if(azar.charAt(i)==palabra.charAt(4)){
                                existe = true;
                                if(i==4){
                                    Boton29.setTextFill(Color.GREEN);
                                    if(cont_v4<1){
                                        cont_v4++;
                                    }else{
                                        cont_v4=0;
                                    }
                                }else if(i!=4){
                                    Boton29.setTextFill(Color.YELLOW);
                                }
                            }else if(existe==false){
                                Boton29.setTextFill(Color.GRAY);
                            }
                        }
                    }

                    cont_final = cont_v+cont_v1+cont_v2+cont_v3+cont_v4;

                    break;
                }else{
                    Lector = Buffer.readLine();
                }
            }
            if(Lector==null){
                mostrarError2();
            }
        }

        int intentos=0;

        if(cont_final == 5){
            if(cont_p==30){
                cont_p=0;
            }
            switch(cont_p){
                case 0:
                    intentos = 6;
                    break;
                case 5:
                    intentos = 1;
                    break;
                case 10:
                    intentos = 2;
                    break;
                case 15:
                    intentos = 3;
                    break;
                case 20:
                    intentos = 4;
                    break;
                case 25:
                    intentos = 5;
                    break;
                case 30:
                    intentos = 6;
                    break;
            }
            victoria(intentos);
            System.exit(2);
        }else if(cont_p==30){
            switch(cont_p){
                case 0:
                    intentos = 6;
                    break;
                case 5:
                    intentos = 1;
                    break;
                case 10:
                    intentos = 2;
                    break;
                case 15:
                    intentos = 3;
                    break;
                case 20:
                    intentos = 4;
                    break;
                case 25:
                    intentos = 5;
                    break;
                case 30:
                    intentos = 6;
                    break;
            }
            pierde(intentos,azar.toUpperCase());
            System.exit(2);
        }

    }

    public static String palabrAzar() throws FileNotFoundException {
        String[] lista = new String[133];
        File entrada = new File("src/main/resources/hn/edu/unah/proyectow/PosiblesPalabras");
        Scanner lector = new Scanner(entrada);
        int contador = 0;

        while(lector.hasNextLine()){
            String palabra = lector.nextLine();
            lista[contador] = palabra;
            contador++;
        }
        lector.close();

        return lista[(int)(Math.random() * (lista.length - 1))];
    }

   class almacenarAzar{
        public void almacenamiento(String palabra) throws IOException {
            String almacenar = palabra;
            FileWriter alm = new FileWriter("src/main/resources/hn/edu/unah/proyectow/MemoriaPalabras.txt",true);
            for(int i =0;i<almacenar.length();i++){
                alm.write(almacenar.charAt(i));
            }
        }
   }


    @FXML
    private void mostrarInfo(ActionEvent event){
        Alert informacion = new Alert(Alert.AlertType.INFORMATION);
        informacion.setHeaderText(null);
        informacion.setTitle("Info");
        informacion.setContentText("Por:\n"+"        David Alejandro Garcia Ordoñez\n"+
                "              #Cuenta: 20181003916"
        +       "\n                       Seccion: 0700");
        informacion.showAndWait();
    }

    @FXML
    public void mostrarError(){
        Alert palabraIncorrecta = new Alert(Alert.AlertType.ERROR);
        palabraIncorrecta.setHeaderText(null);
        palabraIncorrecta.setTitle("Error");
        palabraIncorrecta.setContentText("La palabra debe contener 5 letras.");
        palabraIncorrecta.showAndWait();
    }

    @FXML
    public void mostrarError2(){
        Alert palabraNoexiste = new Alert(Alert.AlertType.ERROR);
        palabraNoexiste.setHeaderText(null);
        palabraNoexiste.setTitle("Error");
        palabraNoexiste.setContentText("Parece que la palabra no esta en el sistema, contiene letras repetidas o numeros.");
        palabraNoexiste.showAndWait();
    }

    @FXML
    public void mostrarError3(){
        Alert palabraNoexiste = new Alert(Alert.AlertType.ERROR);
        palabraNoexiste.setHeaderText(null);
        palabraNoexiste.setTitle("Error");
        palabraNoexiste.setContentText("Por favor, escriba la palabra en mayusculas.");
        palabraNoexiste.showAndWait();
    }

    @FXML
    public void pierde(int intentos, String palabra){
        Alert p = new Alert(Alert.AlertType.WARNING);
        p.setHeaderText(null);
        p.setTitle("Has perdido");
        p.setContentText("Se han acabado los intentos."+"\nLa palabra era: "+palabra+
                "\n                                                                        Intentos: "+intentos);
        p.showAndWait();
    }

    @FXML
    private void victoria(int intentos){
        Alert v = new Alert(Alert.AlertType.INFORMATION);
        v.setHeaderText(null);
        v.setTitle("Victoria");
        v.setContentText("¡HAS GANADO!"+
                "\n                                                                         Intentos: "+intentos);
        v.showAndWait();
    }

}