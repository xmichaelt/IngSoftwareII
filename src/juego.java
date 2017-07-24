
import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class juego extends Applet {
    Image imag;
    int a,  x=115, y=110; 
    String dato="";
    
    public void init() {
        initcomponents();
    }
    
    public void paint(Graphics g) {
     
        g.setColor(Color.BLACK);
        
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
        g.drawLine(150,350,350,100);
        
        g.drawLine(450,450,500,450);
        
        g.drawString(x+"-"+y,200,20);
        //g.drawString(code,200,40);
        g.drawString(dato,200,40);
        
        imag=getImage(getDocumentBase(), "homero.gif");
        g.setFont(new Font("Chiller", Font.BOLD, 10));
        g.setColor(new Color(255,0,0));
        g.drawImage(imag,x,y,this);
        //setBackground(new Color(0,0,0));   
    }
    
  void initcomponents(){        
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent evt){
                formKeyPressed(evt);
            }            
        });                
    }
    
    public void formKeyPressed(KeyEvent evt){
        a=evt.getKeyCode(); //obtiene codigo de la tecla presionada
        dato=evt.getKeyText(a); //obtiene el nombre de la tecla presionada
        mover(dato);
    }
    
    public void mover(String dato) {
        if(dato.equalsIgnoreCase("Derecha")){
            x+=5;  
            y+=0;
        }
        if(dato.equalsIgnoreCase("Izquierda")){
            x-=5; 
            y+=0;
        }
        if(dato.equalsIgnoreCase("Arriba")){
            x-=0; 
            y-=5;
        }
        if(dato.equalsIgnoreCase("Abajo")){
            x-=0; 
            y+=5;
        }
              
        repaint();   
    }
}