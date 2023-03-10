package tictactoe;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToe extends JFrame {
    private ArrayList<JButton> buttons = new ArrayList();
    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        setSize(450, 450);
        setVisible(true);

        createButtons();

        setLayout(new GridLayout(3, 3, 5, 5));
        setVisible(true);
    }

    private void createButtons() {
        buttons.add(new JButton("A3"));
        buttons.add(new JButton("B3"));
        buttons.add(new JButton("C3"));
        buttons.add(new JButton("A2"));
        buttons.add(new JButton("B2"));
        buttons.add(new JButton("C2"));
        buttons.add(new JButton("A1"));
        buttons.add(new JButton("B1"));
        buttons.add(new JButton("C1"));

        buttons.forEach(button -> {
            button.setOpaque(true);
            button.setBackground(Color.ORANGE);
            button.setForeground(Color.BLACK);
            button.setName("Button" + button.getText());
            Border line = new LineBorder(Color.BLACK);
            Border margin = new EmptyBorder(5, 15, 5, 15);
            Border compound = new CompoundBorder(line, margin);
            button.setBorder(compound);
            add(button);
        });
    }
}