package tw.sean.apis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private BufferedImage ballImg;
	private int ballX,ballY,ballW,ballH,viewW,viewH,dx,dy;
	private Timer timer;
	public GamePanel() {
		setBackground(Color.WHITE);
		try {
			ballImg = ImageIO.read(new File("dir2/ball0.png"));
			ballW = ballImg.getWidth();
			ballH = ballImg.getHeight();
		} catch (IOException e) {
			
		}
		addMouseListener(new MyListener());
		timer = new Timer();
		timer.schedule(new BallTask(), 1*1000,10);
		ballX = ballY = 1;
		dx=dy=20;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		g.drawImage(ballImg, ballX, ballY, null);
		
		
	}
	private class BallTask extends TimerTask{
		@Override
		public void run() {
			if(ballX<=0 ||ballX + ballW >=viewW) {
				dx *=-1;
			}
			if(ballY<=0 ||ballY + ballH >=viewH) {
				dy *=-1;
			}
			ballX +=dx;
			ballY +=dy;
			repaint();
			
		}
	}
	
	private class MyListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			ballX = e.getX()-(int)(ballW/2.0);
			ballY = e.getY()-(int)(ballH/2.0);
			repaint();
			
		}
	}

}
