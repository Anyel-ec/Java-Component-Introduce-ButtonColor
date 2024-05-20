package top.anyel;

import top.anyel.component.ButtonColor;

import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // centrar en el medio de la pantalla
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());
        // components here
        this.add(new ButtonColor("Anyel"));

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}