package view;

import javax.swing.*;

public class TelaInicial extends JFrame {
    
    public TelaInicial (){
        
        ImageIcon telaIni = new ImageIcon("Interface\\Imagens\\Telas Urna Eletrônica\\telaIniValid.png");

        JLabel telaInicial = new JLabel();
        telaInicial.setIcon(telaIni);
        telaInicial.setVisible(true);
        telaInicial.setBounds(0, 0, 980, 576);

        JButton button = new JButton();
        button.setBounds(470, 422, 108, 50);
        button.setText("Validar");
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("Eleitor Valido!"));
        
        
        this.setTitle("Urna Eletronica");
        this.setResizable(false);
        this.setSize(980, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button); 
        this.add(telaInicial);
        this.setVisible(true);

    }
}