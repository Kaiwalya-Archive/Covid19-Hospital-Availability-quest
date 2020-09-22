/*
 * 
 * @author: Kaiwalya Koparkar
 * @contributor: Vandanya Wabale, Pragati More, Mrunaal Chincholikar
 * @date(Of Completion): 22/9/2020
 * @Topic: Covid-19 Hospital Availability Quest
 * @reference: https://github.com/iamareebjamal/dijkstra-gui
 *  
 */

import gui.MainWindow;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {  }

        JFrame j = new JFrame();
        j.setTitle("Covid-19 Hospital Availabilty Quest by Kaiwalya Koparkar & Team");

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(new Dimension(900, 600));
        j.add(new MainWindow());
        j.setVisible(true);

    }

}
