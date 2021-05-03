/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarketsimulatorgui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author kyliec
 */
public class SupermarketFrame extends JFrame{
    static JFrame frame;
    static JPanel headerPanel;
    static JPanel bodyPanel;
    static JPanel footerPanel;
    
    public static void main(String[] args) 
    {
        frame = new JFrame();
        headerPanel = new HeaderPanel(frame);
        bodyPanel = new BodyPanel();
        footerPanel = new FooterPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(Color.getHSBColor(.678f, 0.46f, 1.0f));
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(bodyPanel);
        frame.add(footerPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
