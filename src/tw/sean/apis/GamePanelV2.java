package tw.sean.apis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class GamePanelV2 extends JPanel{
	private BufferedImage[] ballImgs;
	private int ballW,ballH,viewW,viewH;
	private Timer timer;
	private LinkedList<BallTask> balls;
	
	public GamePanelV2() {
		try {
			ballImgs =new BufferedImage[] {
					ImageIO.read(new File("dir2/ball0.png")),
					ImageIO.read(new File("dir2/ball1.png")),
					ImageIO.read(new File("dir2/ball2.png")),
					ImageIO.read(new File("dir2/ball3.png"))};
			ballW = ballImgs[0].getWidth();
			
			ballH = ballImgs[0].getHeight(); 		
		}catch (IOException e) {
		}
		balls = new LinkedList<>();
		addMouseListener(new MyListener());
		timer = new Timer();
		timer.scheduleAtFixedRate(new RefreshView(), 0, 17);
	}
	
	private class MyListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int ex = e.getX() - (int)(ballW / 2.0);
			int ey = e.getY() - (int)(ballH / 2.0);
			
			BallTask ball = new BallTask(ex, ey);
			balls.add(ball);
			timer.scheduleAtFixedRate(ball, 100, 30);
			
		}
	}	
	
	private class RefreshView extends TimerTask {
		@Override
		public void run() {
			repaint();
		}
	}
	
	private class BallTask extends TimerTask {
		private int x, y, dx, dy;
		private int img;
		
		public BallTask(int x, int y) {
			this.x = x; this.y = y;
			dx = (int)(Math.random()*17) - 8;	// -4 ~ +4
			dy = (int)(Math.random()*17) - 8;	// -4 ~ +4
			img = (int)(Math.random()*4);
			System.out.printf("%d : %d", dx, dy);
		}
		
		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int getImg() {
			return img;
		}

		@Override
		public void run() {
			if (x < 0 || x + ballW > viewW) {
				dx *= -1;
				x = x < 0 ? 1 : viewW - ballW;
			}else {
				x += dx;				
			}
			
			if (y < 0 || y + ballH > viewH) {
				dy *= -1;
				y = y < 0 ? 1 : viewH - ballH;
			}else {
				y += dy;			
			}
			
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		for (BallTask ball : balls) {
			g.drawImage(ballImgs[ball.getImg()], ball.getX(), ball.getY(), null);
		}
		
	}	

}