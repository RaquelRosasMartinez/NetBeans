/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.Graphics;
import static newpackage.Graficador.inicioBarra;
import static newpackage.Graficador.valorX;
import static newpackage.Graficador.valorY;

/**
 *
 * @author Raquel
 */
    public class Barra {

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(inicioBarra ,360, 50, valorX);  ;
    }    
}
