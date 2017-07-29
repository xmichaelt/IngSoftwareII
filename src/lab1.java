
import java.applet.Applet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */

import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class lab1 extends Applet {
    Image img;
    int code,  x=115, y=110;
    String dato="";
    
    
    public void paint(Graphics g) {
     
        g.setColor(Color.BLUE);
        
        g.drawLine(100,100,150,100);
        g.drawLine(100,100,100,350);
        g.drawLine(100,350,50,350);
        g.drawLine(50,350,50,400);
        g.drawLine(50,400,400,400);
        g.drawLine(400,400,400,350);
        g.drawLine(400,350,600,350);
        g.drawLine(600,350,600,450);
        g.drawLine(600,450,550,450);
        g.drawLine(550,450,550,400);
        g.drawLine(550,400,450,400);
        g.drawLine(450,400,450,450);
        g.drawLine(450,450,50,450);
        g.drawLine(50,450,50,650);
        g.drawLine(50,650,750,650);
        g.drawLine(750,650,750,500);
        g.drawLine(750,500,850,500);
        g.drawLine(850,500,850,600);
        g.drawLine(850,600,900,600);
        g.drawLine(900,600,900,500);
        g.drawLine(900,500,950,500);
        g.drawLine(950,500,950,100);
        g.drawLine(950,100,750,100);
        g.drawLine(750,100,750,200);
        g.drawLine(750,200,700,200);
        g.drawLine(700,200,700,50);
        g.drawLine(700,50,650,50);
        g.drawLine(650,50,650,250);
        g.drawLine(650,250,800,250);
        g.drawLine(800,250,800,150);
        g.drawLine(800,150,900,150);
        g.drawLine(900,150,900,200);
        g.drawLine(900,200,800,200);
        g.drawLine(900,250,800,250);
        g.drawLine(900,250,900,450);
        g.drawLine(900,450,700,450);
        g.drawLine(700,450,700,600);
        g.drawLine(700,600,300,600);
        g.drawLine(300,600,300,550);
        g.drawLine(300,550,250,550);
        g.drawLine(250,550,250,600);
        g.drawLine(250,600,100,600);
        g.drawLine(100,600,100,500);
        g.drawLine(100,500,650,500);
        g.drawLine(650,500,650,300);
        g.drawLine(650,300,400,300);
        g.drawLine(400,300,400,250);
        g.drawLine(400,250,550,250);
        g.drawLine(550,250,550,200);
        g.drawLine(550,200,350,200);
        g.drawLine(350,200,350,350);
        g.drawLine(350,350,150,350);
        g.drawLine(150,350,150,100);
        
        g.drawLine(450,450,500,450);
        
        g.drawString(x+"-"+y,200,20);
        //g.drawString(code,200,40);
        g.drawString(dato,200,40);
        
        img=getImage(getDocumentBase(), "gorgori.gif");
        g.setFont(new Font("Chiller", Font.BOLD, 10));
        g.setColor(new Color(255,0,0));
        g.drawImage(img,x,y,this);
        //setBackground(new Color(0,0,0));   
    }
       public void mover(String dato) {
        //Movimiento arriba - abajo
        if((x>=100 && x<=150) &&(y>=100 && y<=355)){
            if((dato.equalsIgnoreCase("Inactivo"))) {
                if(y!=355){
                    y+=vel;
                    x+=0;
                    repaint(); 
                }
            }
            else {
                if((dato.equalsIgnoreCase("Arriba"))) {
                    if(y!=100){
                        y-=vel;
                        x+=0;
                        repaint();                         
                    }
               }                
            }            
        }
        
        //Movimiento izquierda - derecha
        if((x>=55 && x<=360) &&(y>=320 && y<=355)){
            if(dato.equalsIgnoreCase("Derecha")){
                if (x!=360) {
                    x+=vel;  
                    y+=0;
                    repaint();
                }
            }
            else {
                if(dato.equalsIgnoreCase("Izquierda")){
                    if(x!=55) {
                        x-=vel; 
                        y+=0;
                        repaint();
                    }                    
                }
            }
        }
        
        
        //Movimiento arriba - abajo
        if((x>=355 && x<=370) &&(y>=210 && y<=360)){
            if((dato.equalsIgnoreCase("Inactivo"))) {
                if(y!=360){
                    y+=vel;
                    x+=0;
                    repaint(); 
                }
            }
            else {
                if((dato.equalsIgnoreCase("Arriba"))) {
                    if(y!=210){
                        y-=vel;
                        x+=0;
                        repaint();                         
                    }
               }                
            }            
        }
        
        
        //Movimiento izquierda - derecha
        if((x>=360 && x<=520) &&(y>=205 && y<=215)){
            if(dato.equalsIgnoreCase("Derecha")){
                if (x!=520) {
                    x+=vel;  
                    y+=0;
                    repaint();
                }
            }
            else {
                if(dato.equalsIgnoreCase("Izquierda")){
                    if(x!=360) {
                        x-=vel; 
                        y+=0;
                        repaint();
                    }                    
                }
            }
        }
        
        
        //Movimiento izquierda - derecha
        if((x>=360 && x<=610) &&(y>=305 && y<=320)){
            if(dato.equalsIgnoreCase("Derecha")){
                if (x!=610) {
                    x+=vel;  
                    y+=0;
                    repaint();
                }
            }
            else {
                if(dato.equalsIgnoreCase("Izquierda")){
                    if(x!=360) {
                        x-=vel; 
                        y+=0;
                        repaint();
                    }                    
                }
            }
        }
        
        
        //Movimiento arriba - abajo
        if((x>=605 && x<=620) &&(y>=305 && y<=460)){
            if((dato.equalsIgnoreCase("Inactivo"))) {
                if(y!=460){
                    y+=vel;
                    x+=0;
                    repaint(); 
                }
            }
            else {
                if((dato.equalsIgnoreCase("Arriba"))) {
                    if(y!=305){
                        y-=vel;
                        x+=0;
                        repaint();                         
                    }
               }                
            }            
        }
        
        
        //Movimiento izquierda - derecha
        if((x>=60 && x<=610) &&(y>=455 && y<=465)){
            if(dato.equalsIgnoreCase("Derecha")){
                if (x!=610) {
                    x+=vel;  
                    y+=0;
                    repaint();
                }
            }
            else {
                if(dato.equalsIgnoreCase("Izquierda")){
                    if(x!=60) {
                        x-=vel; 
                        y+=0;
                        repaint();
                    }                    
                }
            }
        }
        
        
        //Movimiento arriba - abajo
        if((x>=500 && x<=520) &&(y>=410 && y<=460)){
            if((dato.equalsIgnoreCase("Inactivo"))) {
                if(y!=460){
                    y+=vel;
                    x+=0;
                    repaint(); 
                }
            }
            else {
                if((dato.equalsIgnoreCase("Arriba"))) {
                    if(y!=410){
                        y-=vel;
                        x+=0;
                        repaint();                         
                    }
               }                
            }            
        }
        
        
        //Movimiento izquierda - derecha
        if((x>=455 && x<=515) &&(y>=405 && y<=415)){
            if(dato.equalsIgnoreCase("Derecha")){
                if (x!=510) {
                    x+=vel;  
                    y+=0;
                    repaint();
                }
            }
            else {
                if(dato.equalsIgnoreCase("Izquierda")){
                    if(x!=460) {
                        x-=vel; 
                        y+=0;
                        repaint();
                    }                    
                }
            }
        }
        
        