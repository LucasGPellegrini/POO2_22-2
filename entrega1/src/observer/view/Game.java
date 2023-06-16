package observer.view;
import contexto.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import observer.controller.*;
import observer.model.*;

public class Game extends JPanel{
    // Personagens
    private static Jogador j1;
    private static Inimigo i1;
    private static Inimigo i2;
    private static Inimigo i3;
    // Controle
    private static Controle c;
    // Checkpoints
    private static Checkpoint cp1;
    private static Checkpoint cp2;
    private static Checkpoint cp3;
    private static int   cp_count;
    // Fase
    private static int fase;

    
    public Game() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true); //So that the JPanel object receives the keyboard notifications it is necessary to include the instruction setFocusable(true), which allows KeyboardExample to receive the focus.
        
        fase = 1;
        
        Personagem p = new Personagem01();
        p.recolherRecompensa(30);
        j1  = new Jogador(p, 512,384);
        i1 = new Inimigo(10,450);
        i2 = new Inimigo(400,20);
        i3 = new Inimigo(50,50);
        
        cp1 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true
                );
        cp2 = new Checkpoint(0, 0, false);
        cp3 = new Checkpoint(0, 0, false);
        
        cp_count = 0;
        
        

        //configuracao do invoker
        Jogador j = j1;

        //configuracao do controle - CRIANDO INVOKER - PODERIA RECEBER PRONTO
        c = new Controle();
        c.setCommand(new MoverEsq(j),0);
        c.setCommand(new MoverDir(j),1);
        
        c.setCommand(new MoverAlto(j),2);
        c.setCommand(new MoverBaixo(j),3);                      
        
        j1.addObserver(i1);
        j1.addObserver(i2);
        j1.addObserver(i3);  
        j1.addObserver(cp1);
    }       
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT)            
                c.pressionar(0);    
            
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                c.pressionar(1);    
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                c.pressionar(2);    
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                c.pressionar(3);             
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
}    
    
    public void paint(Graphics g) {
        super.paint(g); //The call to "super.paint(g)", cleans the screen 

        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Checkpoints
        if(cp1.getAtivo()) {
            g2d.setColor(Color.BLUE);        
            g2d.fillRect(cp1.getX(), cp1.getY(), 40, 30);
        }
        
        if(cp2.getAtivo()) {
            g2d.setColor(Color.BLUE);        
            g2d.fillRect(cp2.getX(), cp2.getY(), 40, 30);
        }
        
        if (cp3.getAtivo()) {
            g2d.setColor(Color.BLUE);        
            g2d.fillRect(cp3.getX(), cp3.getY(), 40, 30); 
        }
        
        
        // Personagem
        g2d.setColor(Color.BLACK);
        g2d.fillOval(j1.getX(), j1.getY(), 20, 20);

        // Inimigos
        g2d.setColor(Color.RED);        
        g2d.fillOval(i1.getX(), i1.getY(), 20, 20);

        g2d.setColor(Color.RED);                
        g2d.fillOval(i2.getX(), i2.getY(), 20, 20);

        g2d.setColor(Color.RED);        
        g2d.fillOval(i3.getX(), i3.getY(), 20, 20);
        
        // Contadores
        g2d.setColor(Color.GREEN);
        g2d.setFont(new Font( "SansSerif", Font.BOLD, 36 ));
        g2d.drawString("vida: "+j1.getPersonagem().getVida()+"HP", 50, 666);
        
        g2d.setColor(Color.GREEN);
        g2d.setFont(new Font( "SansSerif", Font.BOLD, 36 ));
        g2d.drawString("checkpoints: "+this.cp_count, 50, 712);
    }
    
    public Jogador getJogador() {
        return this.j1;
    }
    
    public int getFase() {
        return this.fase;
    }
    
    public void proximaFase() {
        this.contaCheckpoints();
        switch (this.fase) {
            case 1:
                if (cp1.getPego()) {this.passaFase();}
                break;
            case 2:
                if (cp1.getPego() && cp2.getPego()) {this.passaFase();}
                
                break;
            case 3:
                if (cp1.getPego() && cp2.getPego() && cp3.getPego()) {this.passaFase();}
          
                break;
            default:
                break;
        }
    }
    
    public void passaFase() {
        this.cp_count = 0;
        this.fase += 1;
        switch (this.fase) {
            case 2:
                cp1 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true);
                cp2 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true);
                j1.addObserver(cp1);
                j1.addObserver(cp2);
                
                i1.setBuff(1.2);
                i2.setBuff(1.2);
                i3.setBuff(1.2);
                break;
            case 3:
                cp1 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true);
                cp2 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true);
                cp3 = new Checkpoint(
                        (int) (Math.random()*984),
                        (int) (Math.random()*738),
                        true);
                j1.addObserver(cp1);
                j1.addObserver(cp2);
                j1.addObserver(cp3);
                
                i1.setBuff(1.8);
                i2.setBuff(1.8);
                i3.setBuff(1.8);
                break;
            default:
                break;
        }
    }
    
    public void contaCheckpoints() {
        switch (this.fase) {
            case 1:
                if (cp1.getPego()) {
                    this.cp_count = 1;
                }
                
                break;
            case 2:
                if (cp1.getPego() && cp2.getPego()) {
                    this.cp_count = 2;
                    this.passaFase();
                }
                else if (cp1.getPego() || cp2.getPego()) {this.cp_count = 1;}
                else {this.cp_count = 0;}
                
                break;
            case 3:
                if (cp1.getPego() && cp2.getPego() && cp3.getPego()) {
                    this.cp_count = 3;
                    this.passaFase();
                }
                else if ((cp1.getPego() && (cp2.getPego() || cp3.getPego())) ||
                         (cp2.getPego() && (cp1.getPego() || cp3.getPego())) ||
                         (cp3.getPego() && (cp2.getPego() || cp1.getPego())))
                    this.cp_count = 2;
                else if (cp1.getPego() || cp2.getPego() || cp3.getPego())
                    this.cp_count = 1;
                else
                    this.cp_count = 0;
          
                break;
            default:
                break;
        }
    }
}
