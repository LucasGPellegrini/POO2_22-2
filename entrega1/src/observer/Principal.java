package observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import observer.model.Jogador;
import observer.view.Game;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        int x = 1024;
        int y = 768;  
        
        JFrame frame = new JFrame("Pega-Pega");
        Game game = new Game();
       
        JLabel label = new JLabel();
        
        label.setBounds(0, 0, x, y);

        game.setLayout(null);
        game.add(label);
        
        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        Jogador j = game.getJogador();
        
        while (j.getPersonagem().getVida() > 0 && game.getFase() <= 3) {
            j.show();           
            game.repaint();
            game.proximaFase();
            Thread.sleep(50);
        }
        
        if (game.getFase() == 4) {
            JOptionPane.showMessageDialog(frame, "PARABENS - VOCE GANHOU!");
        }
        else {
            JOptionPane.showMessageDialog(frame, "VOCE PERDEU - OTARIO!");
        }
        
    }
}
