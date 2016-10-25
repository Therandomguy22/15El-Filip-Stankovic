import javax.swing.*;
import java.awt.*;
public class Game extends JPanel{
	
	Ball ball = new Ball(this);
	
	private void moveBall(){
		ball.move();
	}
	
	public void paint(Graphics g){
    	super.paint(g);
 Graphics2D g2d = (Graphics2D) g;
 ball.paint(g2d);
    }
 
	public  void gameOver(){
	  JOptionPane.showMessageDialog(this, "Game over", "Game over", JOptionPane.YES_NO_OPTION);
	   System.exit(ABORT);
	}
	   public static void main(String[] args) {
       JFrame frame = new JFrame();
       Game game = new Game();
       
       frame.setSize(400, 400); //x, y
       frame.setLocation(300, 300); 
       frame.setDefaultCloseOperation(3);
       frame.add(game);
       frame.setTitle("Spel projekt");
       frame.setResizable(false);
       frame.setVisible(true);
       
       while(true){
		   game.moveBall();
		   game.repaint();
		   
		   try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		      	   }
	}
}
