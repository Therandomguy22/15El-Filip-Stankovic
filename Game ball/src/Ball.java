import java.awt.*;

public class Ball {

	private int d = 50; //diameter
	private int x = 0;
	private int y = 0;
    private int moveX = 1;
    private int moveY = 1;
	Color ballColor = new Color(0xE73AC0);
	Game game; 
	
	public Ball(Game game){
        this.game = game;
	}
	
	private void moveBall(){
		if(x + moveX  <= 0)
			moveX = 1;
        if(x + moveX > game.getWidth()-d)
				moveX = -1;
		if(y + moveY < 0)
             moveY = 1;
        if(y + moveY > game.getHeight()-d)
        	moveY = -1;
        x += moveX;
        y += moveY;
	}

	public void move(){
		moveBall();
	}
	
    public void paint(Graphics g){
 Graphics2D g2d = (Graphics2D) g;
 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 g2d.setColor(ballColor);
 g2d.fillOval(x, y, d, d);
    }


}
