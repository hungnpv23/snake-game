/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dsnakegame;

/**
 *
 * DanDHCE160966
 */
import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setBounds(10, 10, 905, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
