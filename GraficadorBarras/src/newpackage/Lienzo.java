package newpackage;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import static newpackage.Graficador.inicioBarra;
import static newpackage.Graficador.valorX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raquel
 */
public class Lienzo extends Canvas {

    private Lienzo objeto = new Lienzo();
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        //FONDO COLOR
        this.setBackground(Color.WHITE);
        
        //TEXTO
        g.setColor(Color.GRAY);
        g.setFont(new Font("Arial", Font.PLAIN,16));
        g.drawString("Calificaciones", 268, 30);
        
        //LINEAS/NÚMEROSX
        g2.setColor(Color.LIGHT_GRAY);
        g.setFont(new Font("Arial", Font.PLAIN,10));
        
        g.setColor(Color.BLACK);
        g.drawString("100", 15, 73);
        g2.drawLine(40,70, 640, 70);
        g.drawString("90", 15, 103);//30
        g2.drawLine(40,100, 640, 100);
        g.drawString("80", 15, 133);
        g2.drawLine(40,130, 640, 130);
        g.drawString("70", 15, 163);
        g2.drawLine(40,160, 640, 160);
        g.drawString("60", 15, 193);
        g2.drawLine(40,190, 640, 190);
        g.drawString("50", 15, 223);
        g2.drawLine(40,220, 640, 220);
        g.drawString("40", 15, 253);
        g2.drawLine(40,250, 640, 250);
        g.drawString("30", 15, 283);
        g2.drawLine(40,280, 640, 280);
        g.drawString("20", 15, 313);
        g2.drawLine(40,310, 640, 310);
        g.drawString("10", 15, 343);
        g2.drawLine(40,340, 640, 340);
        g.drawString("0", 15, 373);
        g2.drawLine(40,370, 640, 370);
        
        //VALORESY
        
        g.drawString("VALOR1", 45, 393);
        g.drawString("VALOR2", 105, 393);
        g.drawString("VALOR3", 165, 393);
        g.drawString("VALOR4", 225, 393);
        g.drawString("VALOR5", 285, 393);
        g.drawString("VALOR6", 345, 393);
        g.drawString("VALOR7", 405, 393);
        g.drawString("VALOR8", 465, 393);
        g.drawString("VALOR9", 525, 393);
        g.drawString("VALOR10", 585, 393);
                
        /*BARRAS
        
        g2.setColor(Color.pink);
        g2.fillRect(45, 360, 50, 10);
        g2.setColor(Color.GREEN);
        g2.fillRect(105, 360, 50, 10);
        g2.setColor(Color.YELLOW);
        g2.fillRect(165, 360, 50, 10);
        g2.setColor(Color.CYAN);
        g2.fillRect(225, 360, 50, 10);
        g2.setColor(Color.BLUE);
        g2.fillRect(285, 360, 50, 10);
        g2.setColor(Color.MAGENTA);
        g2.fillRect(345, 360, 50, 10);
        g2.setColor(Color.ORANGE);
        g2.fillRect(405, 360, 50, 10);
        g2.setColor(Color.BLACK);
        g2.fillRect(465, 360, 50, 10);
        g2.setColor(Color.GRAY);
        g2.fillRect(525, 360, 50, 10);
        g2.setColor(Color.PINK);
        g2.fillRect(585, 360, 50, 10);*/

        g.setColor(Color.black);
        g.fillRect(inicioBarra ,360, 50, valorX);
    } 
}
