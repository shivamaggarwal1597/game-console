package AirCrash;

import java.awt.EventQueue;

//showing the points by using array




import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameWay2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int points=0;
	Icon bombImage=new ImageIcon(GameWay2.class.getResource("bomb.png"));
	Icon scoreImage=new ImageIcon(GameWay2.class.getResource("dot.png"));
	private int n=3;
	//private final int RAND_POS=29;
	//private int Dot_x;
	//private int Dot_y;
	JLabel label = new JLabel("");
	Timer timer;
	JLabel planeLabel = new JLabel("");
	JLabel skyLabel = new JLabel("");
	private JPanel contentPane;
	JLabel label_3 = new JLabel("");
	JLabel label_1 = new JLabel("");
	JLabel label_0 = new JLabel("");
	JLabel label_4 = new JLabel("");
	JLabel label_2 = new JLabel("");
	int label_0X=521;
	int label_1X=559;
	int label_2X=569;
	int label_3X=545;
	int label_0Y=162;
	int label_1Y=229;
	int label_2Y=302;
	int label_3Y=491;
	int label_4X=559;
	int label_4Y=393;
	int label_5X=697;
	int label_5Y=125;
	int label_6X=708;
	int label_6Y=229;
	int label_7X=708;
	int label_7Y=539;
	
	
	private final int LEFT_ARROW = 37;
	private final int RIGHT_ARROW = 39;
	private final int TOP_ARROW = 40;
	private final int BOTTOM_ARROW = 38;
	private int CurrentX =58;
	private int CurrentY=276;
	//private JTextField Score = new JTextField();;
//	int GiftX1=390;
	//int GiftY1=214;
	private final JLabel scorelbl = new JLabel("");
	private final JLabel label_5 = new JLabel("");
	private final JLabel label_6 = new JLabel("");
	private final JLabel label_7 = new JLabel("");
	/**
	 * Launch the application.
	 */
	private void orderDots(){
		switch (1){
		case 1 :
			if(collission(label_0)||label_0X<50){
			label_1.setVisible(true);
		    
		  }
		case 2:if(collission(label_1)||label_1X<50)
		{
			label_2.setVisible(true);
		}
		case 3:if(collission(label_2)||label_2X<50)
		{
		label_3.setVisible(true);
		
		}
		case 4:if(collission(label_3)||label_3X<50)
			{
			
	          label_4.setVisible(true);
		}
		case 5:if(label_4X<50)
		{
		
          label_5.setVisible(true);
	}
		case 6:if(collission(label_5)||label_5X<50)
	{
		
        label_6.setVisible(true);
	}
		case 7:if(collission(label_6)||label_6X<50)
		{
		
          label_7.setVisible(true);
	}
		case 8:if(collission(label_7)||label_7X<50)
		{
		
       JOptionPane.showMessageDialog(this, "you have completed the game...ur score is.."+points);
       
       
       System.exit(0);
	}
		
		
		
		
		
		
		
		
		}

		
		/*if(collission(label_0)||(label_0X<50)){
			label_1.setVisible(true);
			
			if(collission(label_1)||(label_1X<50)){
				label_2.setVisible(true);
				
				if(collission(label_2)||(label_2X<50)){
					label_3.setVisible(true);
					n++;
					if(collission(label_3)||(label_3X<50)){
				
						label_2.setVisible(true);
						n++;
						if(collission(label_2)||label_2X<50){
							label_1.setVisible(true);
							n++;
							if
						}
						
					}
					
				}
			}
		}*/
	}
	private boolean collission(JLabel label){
		return planeLabel.getBounds().intersects(label.getBounds());
	}
	

		
	
	private void gameRunning(JLabel label,int cordinate){
		if(collission(label)){
			label.setVisible(false);
			scorelbl.setText("0");
			if(scorelbl.getText().length()!=0)
			{
				String a=scorelbl.getText();
			
			int b=Integer.parseInt(a);
			points=points+10+b;
			
			scorelbl.setText("score"+points);
			}
			
		}
		if(cordinate<50){
			
			label.setVisible(false);
		}
	}
	
	private void initialise(){
		
		label_0.setVisible(true);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		gameStart();
		timer.start();
		label_4.setBounds(559, 393, 278, 91);
        label_3.setBounds(545, 491, 56, 85);
        label_5.setBounds(697, 125, 67, 64);	
        label_6.setBounds(708, 229, 67, 75);	
        label_7.setBounds(708, 539, 78, 64);
        label_0.setBounds(521, 125, 56, 64);
        label_1.setBounds(559, 229, 56, 41);
        label_2.setBounds(569, 302, 56, 76);
        planeLabel.setBounds(58, 276, 171, 133);
        points=0;
	}
	
	private void movePlane(int direction){
		switch(direction){
		case LEFT_ARROW:CurrentX-=6;
		planeLabel.setBounds(CurrentX,CurrentY,171,133);
		break;
		case BOTTOM_ARROW:CurrentY-=6;
		planeLabel.setBounds(CurrentX,CurrentY,171,133);
		break;
		case TOP_ARROW:CurrentY+=6;
		planeLabel.setBounds(CurrentX,CurrentY,171,133);
		break;
		case RIGHT_ARROW:CurrentX+=6;
		planeLabel.setBounds(CurrentX,CurrentY,171,133);
		break;
		case 32:timer.stop();
		break;
		case 10:timer.start();
		
		}
		
		
	}
	private boolean ifVisible(JLabel label){
		if(label.isVisible())
		return true;
		else 
			return false;
	}
	private void gameStart(){
		label_0.setHorizontalAlignment(SwingConstants.LEFT);
		label_0.setVisible(true);
		label_1.setVisible(false);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setVisible(false);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		label_7.setVisible(false);
		timer=new Timer(20,(e)->{
			
		    if(ifVisible(label_0))
		    {
			label_0X-=n;
		    label_0.setBounds(label_0X,label_0Y,56,64);
		    }
		    if(ifVisible(label_1))
		    {
		    label_1X-=n;
		    label_1.setBounds(label_1X,label_1Y,56,41);
		    }
		    if(ifVisible(label_2))
		    {
		    	
		    
		    label_2X-=n;
		    label_2.setBounds(label_2X,label_2Y,56,76);
		    }
		   if(ifVisible(label_3))
		   { 
		    label_3X-=n;
		    label_3.setBounds(label_3X,label_3Y,143,146);
		    }
		   if(ifVisible(label_4)){
			   label_4X-=n;
			   label_4.setBounds(label_4X,label_4Y,278,91);
		   }
		   if(ifVisible(label_5)){
			   label_5X-=n;
			   label_5.setBounds(label_5X,label_5Y,67,64);
		   }
		   if(ifVisible(label_6)){
			   label_6X-=n;
			   label_6.setBounds(label_6X,label_6Y,67,75);
		   }
		   if(ifVisible(label_7)){
			   label_7X-=n;
			   label_7.setBounds(label_7X,label_7Y,78,64);
		   }
		   
		    
		
			orderDots();
		
			
		if(collission(label_4)){
			
			
			timer.stop();
			label.setVisible(true);
			int choice=JOptionPane.showConfirmDialog(this,"you have lost the game...wanna try again?","game - 2016" ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(choice==JOptionPane.YES_OPTION){
				initialise();
				label.setVisible(false);
				n=3;
				
			}
			else
			System.exit(0);
			
		}
		gameRunning(label_0,label_0X);
		gameRunning(label_1,label_1X);
		gameRunning(label_2,label_2X);
		gameRunning(label_3,label_3X);
		gameRunning(label_5,label_5X);
		gameRunning(label_6,label_6X);
		gameRunning(label_7,label_7X);
		
		
		//if(GiftX1<50){
			//timer.stop();
			//giftLabel.setVisible(false);
			
		//}
			
		});
		timer.start();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWay2 frame = new GameWay2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameWay2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1227, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		Icon skyImage=new ImageIcon(GameWay2.class.getResource("cloud.jpg"));
		
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode()+""+e.getKeyChar());
				movePlane(e.getKeyCode());
				//System.out.println("key char"+e.getKeyChar()+"key code"+e.getKeyCode());
			}
		});
		planeLabel.setBounds(58, 276, 171, 133);
		Icon planeImage=new ImageIcon(GameWay2.class.getResource("planeImage.gif"));
		
		/*JButton resume = new JButton("resume");
		resume.setForeground(Color.BLACK);
		resume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});*/
		
	/*	JButton pause = new JButton("pause");
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer.stop();
			}
		});*/
		
	/*	pause.setBounds(101, 597, 97, 25);
		contentPane.add(pause);
		resume.setBounds(248, 597, 97, 25);
		contentPane.add(resume);*/
		
		
		label.setBounds(42, 13, 1112, 722);
		contentPane.add(label);
		label_7.setBounds(708, 539, 78, 64);
		
		contentPane.add(label_7);
		label_6.setBounds(708, 229, 67, 75);
		
		contentPane.add(label_6);
		label_5.setBounds(697, 125, 67, 64);
		
		contentPane.add(label_5);
		
		
		label_4.setBounds(559, 393, 278, 91);
		contentPane.add(label_4);
		
		scorelbl.setForeground(Color.WHITE);
		scorelbl.setBounds(101, 90, 128, 31);
		
		contentPane.add(scorelbl);
		label_0.setIcon(scoreImage);
		
		
		label_0.setBounds(521, 125, 56, 64);
		contentPane.add(label_0);
		label_0.setVisible(false);
		label_1.setIcon(scoreImage);
		
		
		label_1.setBounds(559, 229, 56, 41);
		contentPane.add(label_1);
		label_1.setVisible(false);
		label_3.setIcon(scoreImage);
		
		
		
		label_4.setIcon(bombImage);
		label_4.setVisible(false);
		label_3.setBounds(545, 491, 56, 85);
		contentPane.add(label_3);
		label_3.setVisible(false);
		label_2.setIcon(scoreImage);
		
		
		label_2.setBounds(569, 302, 56, 76);
		contentPane.add(label_2);
		label_2.setVisible(false);
		planeLabel.setIcon(planeImage);
		contentPane.add(planeLabel);
		skyLabel.setIcon(skyImage);
		skyLabel.setBounds(32, 31, 805, 640);
		contentPane.add(skyLabel);
		gameStart();
	label_5.setIcon(scoreImage);
	Icon Crashimage=new ImageIcon(GameWay2.class.getResource("crash1.gif"));
	label.setIcon(Crashimage);
	label.setVisible(false);
	label_6.setIcon(scoreImage);
	label_7.setIcon(scoreImage);
	
	}
}
