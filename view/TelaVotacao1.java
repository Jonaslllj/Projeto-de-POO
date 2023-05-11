package view;


import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVotacao1 extends JFrame{
    public TelaVotacao1 (){
        
        ImageIcon telaVot1 = new ImageIcon("Interface\\Imagens\\Telas Urna Eletrônica\\telaVotacao1.png");
        
        JLabel telaVotacao01 = new JLabel();
        telaVotacao01.setIcon(telaVot1);
        telaVotacao01.setVisible(true);
        telaVotacao01.setBounds(0, 0, 980, 576);

        JButton buttonConfirm = new JButton();
        buttonConfirm.setBounds(470, 422, 108, 50);
        buttonConfirm.setText("Confirmar");
        buttonConfirm.setFocusable(false);
        buttonConfirm.addActionListener(e -> System.out.println("Voto efetuado com sucesso!"));
        
        this.setLayout(new GridLayout(4,3, 15, 15));
        this.setTitle("Urna Eletronica");
        this.setResizable(false);
        this.setSize(980, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("0"));
        this.add(buttonConfirm); 
        
        this.add(telaVotacao01);
        this.setVisible(true);
    

    }
}
