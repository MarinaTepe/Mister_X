import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.DropMode;



public class GUI extends JFrame implements ActionListener{

	
	public static JSplitPane splitPane_2,splitPane;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel label1;
	private JEditorPane txtpnVerfgbareTickets;
	private JPanel buttonPanel;
	private JButton buttonspieler1, buttonspieler2, buttonspieler3, buttonspieler4, buttonmisterx, buttonbus,buttontaxi, buttonbahn, buttonblack, button2x, 
	button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
	button11, button12, button13, button14, button15, button16, button17, button18, button19, button20,
	button21, button22, button23, button24, button25;
	
	public static int va,wa,xa,ya,za;
	public static int vb,wb,xb,yb,zb;
	public static int vc,wc,xc,yc,zc;
	public static int hoehe;
	public static int breite;
	public static Color vd,wd,xd,yd,zd;
	public  int counterField1=8;
	public  int counterField2=11;
	public  int counterField3=4;
	public  int counterField4=4;
	public  int counterField5=2; 
	public  int counterField6=8;
	public  int counterField7=11;
	public  int counterField8=4; 
	public  int counterField9=8;
	public  int counterField10=11;
	public  int counterField11=4; 
	public  int counterField12=8;
	public  int counterField13=11;
	public  int counterField14=4; 
	public final Icon icon1,icon2,icon3,icon4,iconx;
	
	public  void setCounterField1() {counterField1 = counterField1-1;}
	public  void setCounterField2() {counterField2 = counterField2-1;}
	public  void setCounterField3() {counterField3 = counterField3-1;}
	public  void setCounterField4() {counterField4 = counterField4-1;}
	public  void setCounterField5() {counterField5 = counterField5-1;}
	public  void setCounterField6() {counterField6 = counterField6-1;}
	public  void setCounterField7() {counterField7 = counterField7-1;}
	public  void setCounterField8() {counterField8 = counterField8-1;}
	public  void setCounterField9() {counterField9 = counterField9-1;}
	public  void setCounterField10() {counterField10 = counterField10-1;}
	public  void setCounterField11() {counterField11 = counterField11-1;}
	public  void setCounterField12() {counterField12 = counterField12-1;}
	public  void setCounterField13() {counterField13 = counterField13-1;}
	public  void setCounterField14() {counterField14 = counterField14-1;}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame2 = new JFrame("Start");
				frame2.setVisible( true );
				frame2.setBounds(100, 100, 450, 300);	
				JPanel buttonPanel2 = new JPanel();
				buttonPanel2.setLayout(new GridLayout(4,2,0,20));
				
				JButton buttonanleitung = new JButton("Anleitung");
				buttonanleitung.addActionListener( new ActionListener() 
				{ public void actionPerformed( ActionEvent e ) 
				{JFrame frame3 = new JFrame("Anleitung");
				frame3.setVisible( true );
				frame3.setBounds(200, 200, 650, 500);
				JTextPane anleitungtxt = new JTextPane();
				anleitungtxt.setEditable(false);
				BufferedReader br = null;
				File anleitung = new File("anleitung.txt");
				try {
					br = new BufferedReader(new FileReader(anleitung));
					String line = null;
					while((line = br.readLine()) != null) { anleitungtxt.read(br, anleitung);}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				frame3.add(anleitungtxt);
				}});
				buttonPanel2.add(buttonanleitung);
				
				JButton buttonstart = new JButton("Start");
				buttonstart.addActionListener( new ActionListener() 
					{
					public void actionPerformed( ActionEvent e ) 
						{
							try {
								GUI frame = new GUI();
								frame.setVisible(true);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							frame2.setVisible(false);
							va=100;vb=80;vc=80;
							splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			wa=800;wb=420;wc=80;
							splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			xa=430;xb=900;xc=80;
							splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			ya=200;yb=400;yc=80;
							splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			}
					}
				);
				buttonPanel2.add(buttonstart);
								
				JButton buttonexit = new JButton("Exit");
				buttonexit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent e ) {System.exit( 0 );}});
				buttonPanel2.add(buttonexit);
				
				buttonPanel2.setBackground(Color.white);
				buttonPanel2.setBorder(new EmptyBorder(20, 20, 20, 20));
				frame2.add(buttonPanel2);
				
				

				}
		});
	}

	
	public GUI() {
		Color taxi =new Color(150,150,150);
		va=0;vb=0;vc=0;vd= Color.black;
		wa=0;wb=0;wc=0;wd= Color.yellow;
		xa=0;xb=0;xc=0;xd= Color.magenta;
		ya=0;yb=0;yc=0;yd= Color.cyan;
		za=0;zb=0;zc=0;zd= Color.white;
		
		
		//bildschirmanpassung
		hoehe=Toolkit.getDefaultToolkit().getScreenSize().height-70;//-60 richtwert für die taskleiste
		breite=Toolkit.getDefaultToolkit().getScreenSize().width;
		
		
		
		/**
	 * Create the frame.
	 */
		setTitle("Mister X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//spielfeld
		splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setBounds(0, 0, breite, hoehe);
		splitPane.setDividerLocation(splitPane.getSize().width/2);
		contentPane.add(splitPane);
		splitPane.setLeftComponent(new OvalComponent());
	
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setEnabled(false);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setDividerLocation(313);
		splitPane.setRightComponent(splitPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		splitPane_1.setLeftComponent(scrollPane);
		
		
		//MR X spieltafel
		label1 = new JLabel();
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"   Spieltafel", "von Mister X", null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{"Zug Nr.", "Verkehrsmittel", " Station", "Zug Nr.", "Verkehrsmittel", " Station", "Zug Nr.", "Verkehrsmittel", " Station"},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(1), label1.getText(), null, new Integer(9), null, null, new Integer(17), null, null},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(2), null, null, new Integer(10), null, null, "(18)", null, null},
				{null, null, null, null, null, null, null, null, null},
				{"(3)", null, null, new Integer(11), null, null, new Integer(19), null, null},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(4), null, null, new Integer(12), null, null, new Integer(20), null, null},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(5), null, null, "(13)", null, null, new Integer(21), null, null},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(6), null, null, new Integer(14), null, null, new Integer(22), null, null},
				{null, null, null, null, null, null, null, null, null},
				{new Integer(7), null, null, new Integer(15), null, null, new Integer(23), null, null},
				{null, null, null, null, null, null, null, null, null},
				{"(8)", null, null, new Integer(16), null, null, "(24)", null, null},
			},
			new String[] {
				"", "", "", "", "", "", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(35);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setMinWidth(5);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(35);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(15);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(15);
		table.getColumnModel().getColumn(7).setPreferredWidth(35);
		table.getColumnModel().getColumn(8).setPreferredWidth(15);
		scrollPane.setViewportView(table);
		
		splitPane_2 = new JSplitPane();
		splitPane_2.setEnabled(false);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_2);
	
		
		// Ticket stack
	
		
		
		//Verfügbare Tickets generieren
		//counterField1 = 8;		
		//counterField2 = 11;
		//counterField3 = 4;
		//counterField4 = 4;
		//counterField5 = 2;
		textFeld();
		
		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
		//splitPane_1.setDividerLocation(splitPane.getSize().height/2);
		
		//Aktionsfeld
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(7,2,0,0));
		
		icon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("s1.png"));
		icon2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("s2.png"));
		icon3 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("s3.png"));
		icon4 = new ImageIcon(Toolkit.getDefaultToolkit().getImage("s4.png"));
		iconx = new ImageIcon(Toolkit.getDefaultToolkit().getImage("x.png"));
		
		buttonspieler1= new JButton(icon1);
		buttonspieler1.addActionListener(this);
		buttonPanel.add(buttonspieler1);
		
		buttonspieler2= new JButton(icon2);
		buttonspieler2.addActionListener(this);
		buttonPanel.add(buttonspieler2);
		
		buttonspieler3= new JButton(icon3);
		buttonspieler3.addActionListener(this);
		buttonPanel.add(buttonspieler3);
				
		buttonspieler4= new JButton(icon4);
		buttonspieler4.addActionListener(this);
		buttonPanel.add(buttonspieler4);
		
		buttonmisterx= new JButton(iconx);
		buttonmisterx.addActionListener(this);
		buttonPanel.add(buttonmisterx);
		
		buttonbus = new JButton("Bus");
		buttonbus.addActionListener(this);
		buttonbus.setBackground(Color.blue);
		buttonPanel.add(buttonbus);
		
		buttontaxi = new JButton("Taxi");
		buttontaxi.addActionListener(this);
		buttontaxi.setBackground(taxi);
		buttonPanel.add(buttontaxi);
		
		buttonbahn = new JButton("U-Bahn");
		buttonbahn.addActionListener(this);
		buttonbahn.setBackground(Color.red);
		buttonPanel.add(buttonbahn);
		
		buttonblack = new JButton("Black");
		buttonblack.addActionListener(this);
		buttonblack.setBackground(Color.BLACK);
		buttonblack.setForeground(Color.GRAY);
		buttonPanel.add(buttonblack);
		
		button2x = new JButton("Zweimal");
		button2x.addActionListener(this);
		button2x.setBackground(Color.orange);
		buttonPanel.add(button2x);
		

		button1 = new JButton("1");
		button1.addActionListener(this);
		buttonPanel.add(button1);
		
		button2 = new JButton("2");
		button2.addActionListener(this);
		buttonPanel.add(button2);
		
		button3 = new JButton("3");
		button3.addActionListener(this);
		buttonPanel.add(button3);
		
		button4 = new JButton("4");
		button4.addActionListener(this);
		buttonPanel.add(button4);
		
		button5 = new JButton("5");
		button5.addActionListener(this);
		buttonPanel.add(button5);
		
		button6 = new JButton("6");
		button6.addActionListener(this);
		buttonPanel.add(button6);
		
		button7 = new JButton("7");
		button7.addActionListener(this);
		buttonPanel.add(button7);
		
		button8 = new JButton("8");
		button8.addActionListener(this);
		buttonPanel.add(button8);
		
		button9 = new JButton("9");
		button9.addActionListener(this);
		buttonPanel.add(button9);
		
		button10 = new JButton("10");
		button10.addActionListener(this);
		buttonPanel.add(button10);
		
		button11 = new JButton("11");
		button11.addActionListener(this);
		buttonPanel.add(button11);
		
		button12 = new JButton("12");
		button12.addActionListener(this);
		buttonPanel.add(button12);
		
		button13 = new JButton("13");
		button13.addActionListener(this);
		buttonPanel.add(button13);
		
		button14 = new JButton("14");
		button14.addActionListener(this);
		buttonPanel.add(button14);
		
		button15 = new JButton("15");
		button15.addActionListener(this);
		buttonPanel.add(button15);
		
		button16 = new JButton("16");
		button16.addActionListener(this);
		buttonPanel.add(button16);
		
		button17 = new JButton("17");
		button17.addActionListener(this);
		buttonPanel.add(button17);
		
		button18 = new JButton("18");
		button18.addActionListener(this);
		buttonPanel.add(button18);
		
		button19 = new JButton("19");
		button19.addActionListener(this);
		buttonPanel.add(button19);
		
		button20 = new JButton("20");
		button20.addActionListener(this);
		buttonPanel.add(button20);
		
		button21 = new JButton("21");
		button21.addActionListener(this);
		buttonPanel.add(button21);
		
		button22 = new JButton("22");
		button22.addActionListener(this);
		buttonPanel.add(button22);
		
		button23 = new JButton("23");
		button23.addActionListener(this);
		buttonPanel.add(button23);
		
		button24 = new JButton("24");
		button24.addActionListener(this);
		buttonPanel.add(button24);
		
		button25 = new JButton("25");
		button25.addActionListener(this);
		buttonPanel.add(button25);
		
		buttonPanel.setBackground(Color.white);
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		splitPane_2.setRightComponent(buttonPanel);
		
		}		

		//auslöser für die knöpfe
	
		public void actionPerformed (ActionEvent ae) {
	        // Die Quelle wird mit getSource() abgefragt und mit den
	        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
	        // der Buttons ist, wird der Text des JLabels entsprechend geändert					
			
			if (ae.getSource() == this.buttonspieler1) {
				buttonspieler1.setEnabled(false);}
			
			else if (ae.getSource() == this.buttonspieler2) {
				buttonspieler2.setEnabled(false);}
			
			else if (ae.getSource() == this.buttonspieler3) {
				buttonspieler3.setEnabled(false);}
			
			else if (ae.getSource() == this.buttonspieler4) {
				buttonspieler4.setEnabled(false);}
			
			else if (ae.getSource() == this.buttonmisterx) {
				buttonmisterx.setEnabled(false);}
			
			else if(ae.getSource() == this.buttonbus){
					if (!buttonspieler1.isEnabled()){
						setCounterField1();	
						splitPane_2.remove(txtpnVerfgbareTickets);
						textFeld();
						splitPane_2.setLeftComponent(txtpnVerfgbareTickets);					
				    	buttonbus.setEnabled(false);}
					if (!buttonspieler2.isEnabled()){
						setCounterField6();	
						splitPane_2.remove(txtpnVerfgbareTickets);
						textFeld();
						splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbus.setEnabled(false);}
					if (!buttonspieler3.isEnabled()){
						setCounterField9();	
						splitPane_2.remove(txtpnVerfgbareTickets);
						textFeld();
						splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbus.setEnabled(false);}
				    if (!buttonspieler4.isEnabled()){
				    	setCounterField12();	
						splitPane_2.remove(txtpnVerfgbareTickets);
						textFeld();
						splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbus.setEnabled(false);}
				    if (!buttonmisterx.isEnabled()){
					    buttonbus.setEnabled(false);}}
		        
			else if(ae.getSource() == this.buttontaxi){
		        	if (!buttonspieler1.isEnabled()){
		        		setCounterField2();	
		        		splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttontaxi.setEnabled(false);}
					if (!buttonspieler2.isEnabled()){
						setCounterField7();	
		        		splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttontaxi.setEnabled(false);}
					if (!buttonspieler3.isEnabled()){
						setCounterField10();	
		        		splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttontaxi.setEnabled(false);}
				    if (!buttonspieler4.isEnabled()){
				    	setCounterField13();	
		        		splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
					    buttontaxi.setEnabled(false);}
				    if (!buttonmisterx.isEnabled()){
					    buttontaxi.setEnabled(false);}}
		       
			else if (ae.getSource() == this.buttonbahn){
		        	if (!buttonspieler1.isEnabled()){
		        		setCounterField3();	
		        		splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbahn.setEnabled(false);}
					if (!buttonspieler2.isEnabled()){
						setCounterField8();	
						splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbahn.setEnabled(false);}
					if (!buttonspieler3.isEnabled()){
						setCounterField11();	
						splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
				    	buttonbahn.setEnabled(false);}
				    if (!buttonspieler4.isEnabled()){
				    	setCounterField14();	
						splitPane_2.remove(txtpnVerfgbareTickets);
		        		textFeld();
		        		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
					    buttonbahn.setEnabled(false);}
				    if (!buttonmisterx.isEnabled()){
					    buttonbahn.setEnabled(false);}}
		        
			else if(ae.getSource() == this.buttonblack){
		        	if (!buttonmisterx.isEnabled()){
		        		setCounterField4();	
						splitPane_2.remove(txtpnVerfgbareTickets);
				    	textFeld();
				    	splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
					    buttonblack.setEnabled(false);}}
		        
			else if(ae.getSource() == this.button2x){
		        	if (!buttonmisterx.isEnabled()){
		        		setCounterField5();	
						splitPane_2.remove(txtpnVerfgbareTickets);
				    	textFeld();
				    	splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
					    button2x.setEnabled(false);}}
		        
		        else if(ae.getSource() == this.button1){
	        	if (!buttonspieler1.isEnabled()){
					va=100;vb=80;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=100;wb=80;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=100;xb=80;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=100;yb=80;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        		
		        }
	        		
	        	
	        else if(ae.getSource() == this.button2){
	        	buttonbus.setEnabled(true);
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
	        		va=250;vb=100;vc=80;
        			if (!buttontaxi.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonspieler1.setEnabled(true);
        			buttontaxi.setEnabled(true);}}
        	else if (!buttonspieler2.isEnabled()){
        			wa=250;wb=100;wc=80;
        			if (!buttontaxi.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonspieler2.setEnabled(true);
        			buttontaxi.setEnabled(true);}}
        	else if (!buttonspieler3.isEnabled()){
        			xa=250;xb=100;xc=80;
        			if (!buttontaxi.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonspieler3.setEnabled(true);
        			buttontaxi.setEnabled(true);}}
        	else if (!buttonspieler4.isEnabled()){
        			ya=250;yb=100;yc=80;
        			if (!buttontaxi.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonspieler4.setEnabled(true);
        			buttontaxi.setEnabled(true);}}
        	else if (!buttonmisterx.isEnabled()){
        			if (!buttontaxi.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonmisterx.setEnabled(true);
        			buttontaxi.setEnabled(true);}
        			else if (!buttonblack.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonmisterx.setEnabled(true);
        			buttonblack.setEnabled(true);}
        			else if (!button2x.isEnabled()){	
        			splitPane.setLeftComponent(new OvalComponent());
        			splitPane.setDividerLocation(splitPane.getSize().width/2);
        			buttonmisterx.setEnabled(true);
        			button2x.setEnabled(true);}}
	        }
	        	
	       
	        else if (ae.getSource() == this.button3){
	        	buttonbus.setEnabled(true);
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        		va=300;vb=00;vc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=300;wb=00;wc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=300;xb=00;xc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=300;yb=00;yc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	        
	        else if(ae.getSource() == this.button4){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=440;vb=110;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=440;wb=110;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=440;xb=110;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=440;yb=110;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	        
	        else if(ae.getSource() == this.button5){
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=600;vb=90;vc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=600;wb=90;wc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=600;xb=90;xc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=600;yb=90;yc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	       
	        else if (ae.getSource() == this.button6){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=900;vb=30;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=900;wb=30;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=900;xb=30;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=900;yb=30;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	        
	        else if(ae.getSource() == this.button7){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=400;vb=190;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=400;wb=190;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=400;xb=190;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=400;yb=190;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	        
	        else if(ae.getSource() == this.button8){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=540;vb=220;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=540;wb=220;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=540;xb=220;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);;
	        			button2x.setEnabled(true);}}
	        }
	       
	        else if (ae.getSource() == this.button9){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	 if (!buttonspieler1.isEnabled()){
	 	        	va=760;vb=180;vc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler1.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler2.isEnabled()){
	         			wa=760;wb=180;wc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler2.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler3.isEnabled()){
	         			xa=760;xb=180;xc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler3.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler4.isEnabled()){
	         			ya=760;yb=180;yc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler4.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonmisterx.isEnabled()){
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonmisterx.setEnabled(true);
	         			buttontaxi.setEnabled(true);}
	         		else if (!buttonblack.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			buttonblack.setEnabled(true);}
		        		else if (!button2x.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			button2x.setEnabled(true);}}
	        }
	        
	        else if (ae.getSource() == this.button10){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	 if (!buttonspieler1.isEnabled()){
	 	        	va=150;vb=250;vc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler1.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler2.isEnabled()){
	         			wa=150;wb=250;wc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler2.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler3.isEnabled()){
	         			xa=150;xb=250;xc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler3.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonspieler4.isEnabled()){
	         			ya=150;yb=250;yc=80;
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonspieler4.setEnabled(true);
	         			buttontaxi.setEnabled(true);}}
	         	else if (!buttonmisterx.isEnabled()){
	         		if (!buttontaxi.isEnabled()){	
	         			splitPane.setLeftComponent(new OvalComponent());
	         			splitPane.setDividerLocation(splitPane.getSize().width/2);
	         			buttonmisterx.setEnabled(true);
	         			buttontaxi.setEnabled(true);}
	         		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	 	        }
	        
	        	else if(ae.getSource() == this.button11){
	        		buttonbahn.setEnabled(true);
	        		buttonbus.setEnabled(true);
	        		 if (!buttonspieler1.isEnabled()){
	     	        	va=330;vb=300;vc=80;
	             		if (!buttontaxi.isEnabled()){	
	             			splitPane.setLeftComponent(new OvalComponent());
	             			splitPane.setDividerLocation(splitPane.getSize().width/2);
	             			buttonspieler1.setEnabled(true);;
	             			buttontaxi.setEnabled(true);}}
	             	else if (!buttonspieler2.isEnabled()){
	             			wa=330;wb=300;wc=80;
	             		if (!buttontaxi.isEnabled()){	
	             			splitPane.setLeftComponent(new OvalComponent());
	             			splitPane.setDividerLocation(splitPane.getSize().width/2);
	             			buttonspieler2.setEnabled(true);
	             			buttontaxi.setEnabled(true);}}
	             	else if (!buttonspieler3.isEnabled()){
	             			xa=330;xb=300;xc=80;
	             		if (!buttontaxi.isEnabled()){	
	             			splitPane.setLeftComponent(new OvalComponent());
	             			splitPane.setDividerLocation(splitPane.getSize().width/2);
	             			buttonspieler3.setEnabled(true);
	             			buttontaxi.setEnabled(true);}}
	             	else if (!buttonspieler4.isEnabled()){
	             			ya=330;yb=300;yc=80;
	             		if (!buttontaxi.isEnabled()){	
	             			splitPane.setLeftComponent(new OvalComponent());
	             			splitPane.setDividerLocation(splitPane.getSize().width/2);
	             			buttonspieler4.setEnabled(true);
	             			buttontaxi.setEnabled(true);}}
	             	else if (!buttonmisterx.isEnabled()){
	             		if (!buttontaxi.isEnabled()){	
	             			splitPane.setLeftComponent(new OvalComponent());
	             			splitPane.setDividerLocation(splitPane.getSize().width/2);
	             			buttonmisterx.setEnabled(true);
	             			buttontaxi.setEnabled(true);}
	             		else if (!buttonblack.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			buttonblack.setEnabled(true);}
		        		else if (!button2x.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);;
		        			button2x.setEnabled(true);}}
	     	        }
	        
	        else if(ae.getSource() == this.button12){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=200;vb=400;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=200;wb=400;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=200;xb=400;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=200;yb=400;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	       
	        else if (ae.getSource() == this.button13){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=500;vb=370;vc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=500;wb=370;wc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler2.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=500;xb=370;xc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler3.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=500;yb=370;yc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler4.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             	else if (!buttonmisterx.isEnabled()){
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
     	        }
	        
	        else if(ae.getSource() == this.button14){
	        	if (!buttonspieler1.isEnabled()){
					va=800;vb=420;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=800;wb=420;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=800;xb=420;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=800;yb=420;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        		
		        }
	        
	        else if(ae.getSource() == this.button15){
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=00;vb=470;vc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=00;wb=470;wc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=00;xb=470;xc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=00;yb=470;yc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	       
	        else if (ae.getSource() == this.button16){
	        	if (!buttonspieler1.isEnabled()){
					va=380;vb=550;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=380;wb=550;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=380;xb=550;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=380;yb=550;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        		
		        }
	        
	        else if(ae.getSource() == this.button17){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=600;vb=500;vc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=600;wb=500;wc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler2.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=600;xb=500;xc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler3.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=600;yb=500;yc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler4.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonmisterx.isEnabled()){
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
     	        }
	        
	        else if(ae.getSource() == this.button18){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=150;vb=630;vc=80;
     	        	if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=150;wb=630;wc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler2.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=150;xb=630;xc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler3.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=150;yb=630;yc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler4.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonmisterx.isEnabled()){
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
     	        }
	       
	        else if (ae.getSource() == this.button19){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=580;vb=600;vc=80;
     	        	if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=580;wb=600;wc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler2.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=580;xb=600;xc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler3.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=580;yb=600;yc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler4.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonmisterx.isEnabled()){
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
     	        }
	        
	        else if (ae.getSource() == this.button20){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=50;vb=800;vc=80;
     	        	if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=50;wb=800;wc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler2.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=50;xb=800;xc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler3.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=50;yb=800;yc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler4.setEnabled(true);
                 			buttontaxi.setEnabled(true);}}
             	else if (!buttonmisterx.isEnabled()){
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
     	        }
	        
		        else if(ae.getSource() == this.button21){
		        	buttonbahn.setEnabled(true);
		        	if (!buttonspieler1.isEnabled()){
			        	va=300;vb=770;vc=80;
		        		if (!buttonbus.isEnabled()){
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler1.setEnabled(true);
		        			buttonbus.setEnabled(true);}
		        		else if (!buttontaxi.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler1.setEnabled(true);
		        			buttontaxi.setEnabled(true);}}
		        	else if (!buttonspieler2.isEnabled()){
		        			wa=300;wb=770;wc=80;
		        		if (!buttonbus.isEnabled()){
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler2.setEnabled(true);
		        			buttonbus.setEnabled(true);}
		        		else if (!buttontaxi.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler2.setEnabled(true);
		        			buttontaxi.setEnabled(true);}}
		        	else if (!buttonspieler3.isEnabled()){
		        			xa=300;xb=770;xc=80;
		        		if (!buttonbus.isEnabled()){
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler3.setEnabled(true);
		        			buttonbus.setEnabled(true);}
		        		else if (!buttontaxi.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler3.setEnabled(true);
		        			buttontaxi.setEnabled(true);}}
		        	else if (!buttonspieler4.isEnabled()){
		        			ya=300;yb=770;yc=80;
		        		if (!buttonbus.isEnabled()){
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler4.setEnabled(true);
		        			buttonbus.setEnabled(true);}
		        		else if (!buttontaxi.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonspieler4.setEnabled(true);
		        			buttontaxi.setEnabled(true);}}
		        	else if (!buttonmisterx.isEnabled()){
		        		if (!buttonbus.isEnabled()){
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			buttonbus.setEnabled(true);}
		        		else if (!buttontaxi.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			buttontaxi.setEnabled(true);}
		        		else if (!buttonblack.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			buttonblack.setEnabled(true);}
		        		else if (!button2x.isEnabled()){	
		        			splitPane.setLeftComponent(new OvalComponent());
		        			splitPane.setDividerLocation(splitPane.getSize().width/2);
		        			buttonmisterx.setEnabled(true);
		        			button2x.setEnabled(true);}}
		        }
	        
	        else if(ae.getSource() == this.button22){
	        	buttonbahn.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=750;vb=750;vc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=750;wb=750;wc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=750;xb=750;xc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=750;yb=750;yc=80;
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttonbus.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbus.setEnabled(true);}
	        		else if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	       
	        else if (ae.getSource() == this.button23){
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
		        	va=430;vb=900;vc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler1.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler2.isEnabled()){
	        			wa=430;wb=900;wc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler2.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler3.isEnabled()){
	        			xa=430;xb=900;xc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler3.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonspieler4.isEnabled()){
	        			ya=430;yb=900;yc=80;
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonspieler4.setEnabled(true);
	        			buttonbahn.setEnabled(true);}}
	        	else if (!buttonmisterx.isEnabled()){
	        		if (!buttontaxi.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttontaxi.setEnabled(true);}
	        		else if (!buttonbahn.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonbahn.setEnabled(true);}
	        		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);}}
	        }
	        
	        else if(ae.getSource() == this.button24){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=660;vb=840;vc=80;
     	        	if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=660;wb=840;wc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler2.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=660;xb=840;xc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler3.setEnabled(true);
                 			buttontaxi.setEnabled(true);
                 			abgleich();}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=660;yb=840;yc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler4.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}}
             	else if (!buttonmisterx.isEnabled()){
             			za=660;zb=840;zc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);
	        			abgleich();}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);
	        			abgleich();}}
     	        }
	       
	        else if(ae.getSource() == this.button25){
	        	buttonbahn.setEnabled(true);
	        	buttonbus.setEnabled(true);
	        	if (!buttonspieler1.isEnabled()){
     	        	va=900;vb=850;vc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler1.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}}
             	else if (!buttonspieler2.isEnabled()){
             			wa=900;wb=850;wc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler2.setEnabled(true);
                 			buttontaxi.setEnabled(true);
                 			abgleich();}}
             	else if (!buttonspieler3.isEnabled()){
             			xa=900;xb=850;xc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonspieler3.setEnabled(true);
             			buttontaxi.setEnabled(true);
             			abgleich();}}
             	else if (!buttonspieler4.isEnabled()){
             			ya=900;yb=850;yc=80;
             			if (!buttontaxi.isEnabled()){	
                 			splitPane.setLeftComponent(new OvalComponent());
                 			splitPane.setDividerLocation(splitPane.getSize().width/2);
                 			buttonspieler4.setEnabled(true);
                 			buttontaxi.setEnabled(true);
                 			abgleich();}}
             	else if (!buttonmisterx.isEnabled()){
             			za=900;zb=850;zc=80;
             		if (!buttontaxi.isEnabled()){	
             			splitPane.setLeftComponent(new OvalComponent());
             			splitPane.setDividerLocation(splitPane.getSize().width/2);
             			buttonmisterx.setEnabled(true);
             			buttontaxi.setEnabled(true);}
             		else if (!buttonblack.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			buttonblack.setEnabled(true);}
	        		else if (!button2x.isEnabled()){	
	        			splitPane.setLeftComponent(new OvalComponent());
	        			splitPane.setDividerLocation(splitPane.getSize().width/2);
	        			buttonmisterx.setEnabled(true);
	        			button2x.setEnabled(true);
	        			abgleich();}}
     	        }
	       
		}
		
		public void textFeld() {
			if(1920==breite) {
				txtpnVerfgbareTickets = new JEditorPane("text/html", "<font face='Arial'>" + "<h1><center>Verf\u00FCgbare Tickets:</center></h1><FONT SIZE=\"5\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s1.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s2.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s3.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s4.png\">"+"<br>"
						+ "Bus :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+counterField1+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField6+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField9+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField12+"<br>"
						+ "Taxi :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField2+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField7+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField10+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField13+"<br>"
						+ "U-Bahn :&nbsp&nbsp&nbsp;"+counterField3+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField8+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField11+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField14+"<br>"
						+ "<center>Mister X:<br>"+ "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Black-Tickets :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField4+ "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Zweimal :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField5+"</center>");
				txtpnVerfgbareTickets.setEditable(false);
			}
			else if(breite!=1920) {
				txtpnVerfgbareTickets = new JEditorPane("text/html", "<font face='Arial'>" + "<h3><center>Verf\u00FCgbare Tickets:</center></h3><FONT SIZE=\"3\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s1.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s2.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s3.png\">"
						+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"file:s4.png\">"+"<br>"
						+ "Bus :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+counterField1+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField6+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField9+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField12+"<br>"
						+ "Taxi :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField2+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField7+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField10+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField13+"<br>"
						+ "U-Bahn :&nbsp&nbsp&nbsp;"+counterField3+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField8+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField11+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField14+"<br>"
						+ "<center>Mister X:</center>"+ "<center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Black-Tickets :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField4+ "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Zweimal :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;"+counterField5+"</center>");
				txtpnVerfgbareTickets.setEditable(false);
				
			}
			
		}
		
		public static int getva() {return va;}//xachse
		public static int getvb() {return vb;}//yachse
		public static int getvc() {return vc;}
		public static Color getvd() {return vd;}//spielerfarbe
		
		public static int getwa() {return wa;}//xachse
		public static int getwb() {return wb;}//yachse
		public static int getwc() {return wc;}
		public static Color getwd() {return wd;}//spielerfarbe
		
		public static int getxa() {return xa;}//xachse
		public static int getxb() {return xb;}//yachse
		public static int getxc() {return xc;}
		public static Color getxd() {return xd;}//spielerfarbe
		
		public static int getza() {return za;}//xachse
		public static int getzb() {return zb;}//yachse
		public static int getzc() {return zc;}
		public static Color getzd() {return zd;}//spielerfarbe
		
		public static int getya() {return ya;}//xachse
		public static int getyb() {return yb;}//yachse
		public static int getyc() {return yc;}
		public static Color getyd() {return yd;}//spielerfarbe
		
		public static int gethoehe() {return hoehe;}
		public static int getbreite() {return breite;}
		
		public void abgleich() {
			if(vb == zb) {JFrame frame4 = new JFrame("Gewonnen");
			frame4.setVisible( true );
			frame4.setBounds(200, 200, 650, 500);
			JTextPane gewonnentxt = new JTextPane();
			gewonnentxt.setEditable(false);
			gewonnentxt.setText("Gewonnen!");
			frame4.add(gewonnentxt);}
			if(wb == zb) {JFrame frame4 = new JFrame("Gewonnen");
			frame4.setVisible( true );
			frame4.setBounds(200, 200, 650, 500);
			JTextPane gewonnentxt = new JTextPane();
			gewonnentxt.setEditable(false);
			gewonnentxt.setText("Gewonnen!");
			frame4.add(gewonnentxt);}
			if(xb == zb) {JFrame frame4 = new JFrame("Gewonnen");
			frame4.setVisible( true );
			frame4.setBounds(200, 200, 650, 500);
			JTextPane gewonnentxt = new JTextPane();
			gewonnentxt.setEditable(false);
			gewonnentxt.setText("Gewonnen!");
			frame4.add(gewonnentxt);}
			if(yb == zb) {JFrame frame4 = new JFrame("Gewonnen");
			frame4.setVisible( true );
			frame4.setBounds(200, 200, 650, 500);
			JTextPane gewonnentxt = new JTextPane();
			gewonnentxt.setEditable(false);
			gewonnentxt.setText("Gewonnen!");
			frame4.add(gewonnentxt);}
			
		}
	}



	
	

//kreise malen
	class OvalComponent extends JComponent{
		
		int aa=GUI.getva();// spieler schwarz
		int ab=GUI.getvb();
		int ac=GUI.getvc();
		Color ad = GUI.getvd();
		
		int ba=GUI.getwa();// spieler gelb
		int bb=GUI.getwb();
		int bc=GUI.getwc();
		Color bd = GUI.getwd();
		
		int ca=GUI.getxa();// spieler lila
		int cb=GUI.getxb();
		int cc=GUI.getxc();
		Color cd = GUI.getxd();
		
		int da=GUI.getya();// spieler türkis
		int db=GUI.getyb();
		int dc=GUI.getyc();
		Color dd = GUI.getyd();
		
		int ea=GUI.getza();// spieler misterx
		int eb=GUI.getzb();
		int ec=GUI.getzc();
		Color ed = GUI.getzd();
		//double xfact=1.1;
		int w2=GUI.getbreite()/2;
		double xfact=w2/960.0;
		
		public void paintComponent(Graphics g) {
			
			Color gruen =new Color(102,205,0);
			Color fluss =new Color(30,144,255);
			Color taxi =new Color(150,150,150);
			
			int[] xpoints= {(int)(440 *xfact),(int)(500 *xfact),(int)(480 *xfact),(int)(410 *xfact),(int)(280 *xfact),(int)(80 *xfact),(int)(0 *xfact
					),(int)(0 *xfact),(int)(110 *xfact),(int)(340 *xfact),(int)(460 *xfact),(int)(560 *xfact),(int)(580 *xfact),(int)(560 *xfact)};
			int[] ypoints= {(int)(0 *xfact),(int)(140 *xfact),(int)(220 *xfact),(int)(330 *xfact),(int)(450 *xfact),(int)(510 *xfact),(int)(560 *xfact
					),(int)(760 *xfact),(int)(640 *xfact),(int)(570 *xfact),(int)(400 *xfact),(int)(220 *xfact),(int)(90 *xfact),(int)(0 *xfact)};
			g.setColor(gruen);
			g.fillRect(0, 0, (int)(1000 *xfact), (int)(1000 *xfact));
			g.setColor(fluss);
			g.fillPolygon(xpoints , ypoints, 14);
			
			g.setColor(ad);
			g.fillOval((int)(aa*xfact-10*xfact) ,(int) (ab*xfact-10*xfact),(int) (ac *xfact),(int) (ac *xfact));
			
 			g.setColor(bd);
			g.fillOval((int)(ba*xfact-10*xfact) ,(int) (bb*xfact-10*xfact),(int) (bc *xfact),(int) (bc *xfact));
			
			g.setColor(cd);
			g.fillOval((int)(ca*xfact-10*xfact) ,(int) (cb*xfact-10*xfact),(int) (cc *xfact),(int) (cc *xfact));
			
			g.setColor(dd);
			g.fillOval((int)(da*xfact-10*xfact),(int) (db*xfact-10*xfact),(int) (dc *xfact),(int) (dc *xfact));
			
			/*g.setColor(ed);
			g.fillOval((int)(ea*xfact-10*xfact) ,(int) (eb*xfact-10*xfact),(int) (ec *xfact),(int) (ec *xfact));
			*/  //auskommentiert da Kreis von MisterX nicht sichtbar sein soll
			
			g.setColor(taxi);
			//g.fillRect(130,110,80,20);
			//g.setStroke();
			//g.drawLine(0, 0, 100, 100);
			g.setFont(new Font("Serif", Font.PLAIN,(int) (30 *xfact)));//g.drawString(Double.toString ((int)(440 *xfact)),(int)( 10 *xfact),(int)( 70 *xfact));
			
						Graphics2D g2 = (Graphics2D)g;
						g2.setStroke(new BasicStroke(7));
						
						g2.setColor(Color.red);									//Ubahn
						g2.draw(new Line2D.Double(123 *xfact, 103 *xfact, 23 *xfact, 493 *xfact));
						g2.draw(new Line2D.Double(123 *xfact, 103 *xfact, 463 *xfact, 133 *xfact));
						g2.draw(new Line2D.Double(623 *xfact, 113 *xfact, 463 *xfact, 133 *xfact));
						g2.draw(new Line2D.Double(623 *xfact, 113 *xfact, 823 *xfact, 443 *xfact));
						g2.draw(new Line2D.Double(403 *xfact, 573 *xfact, 823 *xfact, 443 *xfact));
						g2.draw(new Line2D.Double(415 *xfact, 573 *xfact, 235 *xfact, 423 *xfact));
						g2.draw(new Line2D.Double(23 *xfact, 493 *xfact, 223 *xfact, 423 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 120 *xfact, 410 *xfact, 580 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 460 *xfact, 930 *xfact));
						
						g2.setColor(Color.blue);									//bus
						g2.draw(new Line2D.Double(137 *xfact, 117 *xfact, 287 *xfact, 137 *xfact));
						g2.draw(new Line2D.Double(477 *xfact, 147 *xfact, 287 *xfact, 137 *xfact));
						g2.draw(new Line2D.Double(437 *xfact, 235 *xfact, 287 *xfact, 145 *xfact));
						g2.draw(new Line2D.Double(477 *xfact, 147 *xfact, 437 *xfact, 230 *xfact));
						g2.draw(new Line2D.Double(477 *xfact, 147 *xfact, 637 *xfact, 127 *xfact));
						g2.draw(new Line2D.Double(937 *xfact, 67 *xfact, 637 *xfact, 127 *xfact));
						g2.draw(new Line2D.Double(937 *xfact, 67 *xfact, 797 *xfact, 217 *xfact));
						g2.draw(new Line2D.Double(840 *xfact, 457 *xfact, 800 *xfact, 217 *xfact));
						g2.draw(new Line2D.Double(577 *xfact, 257 *xfact, 797 *xfact, 217 *xfact));
						g2.draw(new Line2D.Double(577 *xfact, 257 *xfact, 830 *xfact, 450 *xfact));
						g2.draw(new Line2D.Double(780 *xfact, 780 *xfact, 837 *xfact, 457 *xfact));
						g2.draw(new Line2D.Double(787 *xfact, 787 *xfact, 697 *xfact, 877 *xfact));
						g2.draw(new Line2D.Double(467 *xfact, 937 *xfact, 697 *xfact, 877 *xfact));
						g2.draw(new Line2D.Double(477 *xfact, 937 *xfact, 347 *xfact, 807 *xfact));
						g2.draw(new Line2D.Double(417 *xfact, 587 *xfact, 337 *xfact, 807 *xfact));
						g2.draw(new Line2D.Double(417 *xfact, 590 *xfact, 617 *xfact, 640 *xfact));
						g2.draw(new Line2D.Double(787 *xfact, 797 *xfact, 617 *xfact, 647 *xfact));
						g2.draw(new Line2D.Double(417 *xfact, 587 *xfact, 537 *xfact, 407 *xfact));
						g2.draw(new Line2D.Double(577 *xfact, 257 *xfact, 537 *xfact, 407 *xfact));
						g2.draw(new Line2D.Double(417 *xfact, 597 *xfact, 237 *xfact, 447 *xfact));
						g2.draw(new Line2D.Double(193 *xfact, 287 *xfact, 243 *xfact, 437 *xfact));
						g2.draw(new Line2D.Double(367 *xfact, 337 *xfact, 237 *xfact, 437 *xfact));
						g2.draw(new Line2D.Double(367 *xfact, 337 *xfact, 437 *xfact, 227 *xfact));
						g2.draw(new Line2D.Double(187 *xfact, 287 *xfact, 137 *xfact, 117 *xfact));
						
						g2.setColor(taxi);								//Taxi
						g2.draw(new Line2D.Double(130 *xfact, 110 *xfact, 280 *xfact, 130 *xfact));
						g2.draw(new Line2D.Double(330 *xfact, 30 *xfact, 280 *xfact, 130 *xfact));
						g2.draw(new Line2D.Double(330 *xfact, 30 *xfact, 470 *xfact, 140 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 120 *xfact, 470 *xfact, 140 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 120 *xfact, 930 *xfact, 60 *xfact));
						g2.draw(new Line2D.Double(930 *xfact, 60 *xfact, 790 *xfact, 210 *xfact));
						g2.draw(new Line2D.Double(790 *xfact, 210 *xfact, 630 *xfact, 120 *xfact));
						g2.draw(new Line2D.Double(790 *xfact, 210 *xfact, 570 *xfact, 250 *xfact));
						g2.draw(new Line2D.Double(790 *xfact, 210 *xfact, 830 *xfact, 450 *xfact));
						g2.draw(new Line2D.Double(130 *xfact, 110 *xfact, 330 *xfact, 30 *xfact));
						g2.draw(new Line2D.Double(430 *xfact, 220 *xfact, 280 *xfact, 130 *xfact));
						g2.draw(new Line2D.Double(180 *xfact, 280 *xfact, 280 *xfact, 130 *xfact));
						g2.draw(new Line2D.Double(230 *xfact, 430 *xfact, 410 *xfact, 580 *xfact));
						g2.draw(new Line2D.Double(180 *xfact, 280 *xfact, 360 *xfact, 330 *xfact));
						g2.draw(new Line2D.Double(180 *xfact, 280 *xfact, 230 *xfact, 430 *xfact));
						g2.draw(new Line2D.Double(430 *xfact, 220 *xfact, 360 *xfact, 330 *xfact));
						g2.draw(new Line2D.Double(230 *xfact, 430 *xfact, 360 *xfact, 330 *xfact));
						g2.draw(new Line2D.Double(230 *xfact, 430 *xfact, 30 *xfact, 500 *xfact));
						g2.draw(new Line2D.Double(180 *xfact, 280 *xfact, 30 *xfact, 500 *xfact));
						g2.draw(new Line2D.Double(570 *xfact, 250 *xfact, 530 *xfact, 400 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 530 *xfact, 400 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 630 *xfact, 530 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 530 *xfact, 530 *xfact, 400 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 530 *xfact, 830 *xfact, 450 *xfact));
						g2.draw(new Line2D.Double(630 *xfact, 530 *xfact, 610 *xfact, 630 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 610 *xfact, 630 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 180 *xfact, 660 *xfact));
						g2.draw(new Line2D.Double(410 *xfact, 580 *xfact, 330 *xfact, 800 *xfact));
						g2.draw(new Line2D.Double(180 *xfact, 660 *xfact, 330 *xfact, 800 *xfact));
						g2.draw(new Line2D.Double(80 *xfact, 830 *xfact, 330 *xfact, 800 *xfact));
						g2.draw(new Line2D.Double(80 *xfact, 830 *xfact, 180 *xfact, 660 *xfact));
						g2.draw(new Line2D.Double(460 *xfact, 930 *xfact, 330 *xfact, 800 *xfact));
						g2.draw(new Line2D.Double(610 *xfact, 630 *xfact, 780 *xfact, 780 *xfact));
						g2.draw(new Line2D.Double(690 *xfact, 870 *xfact, 780 *xfact, 780 *xfact));
						g2.draw(new Line2D.Double(690 *xfact, 870 *xfact, 460 *xfact, 930 *xfact));
						g2.draw(new Line2D.Double(690 *xfact, 870 *xfact, 930 *xfact, 880 *xfact));
						g2.draw(new Line2D.Double(780 *xfact, 780 *xfact, 930 *xfact, 880 *xfact));
			
					g.setColor(taxi);
					g.fillRect((int)(100 *xfact),(int)( 80 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(100 *xfact),(int)( 80 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(100*xfact+15 *xfact),(int)( 80*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("1",(int)( 125 *xfact),(int)( 120 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(250 *xfact),(int)( 100 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(250 *xfact, 100 *xfact, 60 *xfact, 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(250*xfact+15 *xfact, 100*xfact+15 *xfact, 30 *xfact, 30 *xfact));
					g.setColor(Color.black);
					g.drawString("2",(int)( 275 *xfact),(int)( 140 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(300 *xfact),(int)( 00 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(300 *xfact, 00 *xfact, 60 *xfact, 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(300*xfact+15 *xfact, 00*xfact+15 *xfact, 30 *xfact, 30 *xfact));
					g.setColor(Color.black);
					g.drawString("3",(int)( 325 *xfact),(int)( 40 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(440 *xfact),(int)( 110 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(440 *xfact),(int)( 110 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(440*xfact+15 *xfact),(int)( 110*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("4",(int)( 465 *xfact),(int)( 150 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(600 *xfact),(int)( 90 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(600 *xfact),(int)( 90 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(600*xfact+15 *xfact),(int)( 90*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("5",(int)( 625 *xfact),(int)( 130 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(900 *xfact),(int)( 30 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(900 *xfact),(int)( 30 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(900*xfact+15 *xfact),(int)( 30*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("6",(int)( 925 *xfact),(int)( 70 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(400 *xfact),(int)( 190 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(400 *xfact),(int)( 190 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(400*xfact+15 *xfact),(int)( 190*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("7",(int)( 425 *xfact),(int)( 230 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(540 *xfact),(int)( 220 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(540 *xfact),(int)( 220 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(540*xfact+15 *xfact),(int)( 220*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("8" ,(int)( 565 *xfact),(int)( 260 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(760 *xfact),(int)( 180 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(760 *xfact),(int)( 180 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(760*xfact+15 *xfact),(int)( 180*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("9",(int)( 780 *xfact),(int)( 220 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(150 *xfact),(int)( 250 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(150 *xfact),(int)( 250 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(150*xfact+15 *xfact),(int)( 250*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("10",(int)( 165 *xfact),(int)( 290 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(330 *xfact),(int)( 300 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(330 *xfact),(int)( 300 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(330*xfact+15 *xfact),(int)( 300*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("11" ,(int)( 345 *xfact),(int)( 340 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(200 *xfact),(int)( 400 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(200 *xfact),(int)( 400 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(200*xfact+15 *xfact),(int)( 400*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("12",(int)( 215 *xfact),(int)( 440 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(500 *xfact),(int)( 370 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(500 *xfact),(int)( 370 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(500*xfact+15 *xfact),(int)( 370*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("13",(int)( 515 *xfact),(int)( 410 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(800 *xfact),(int)( 420 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(800 *xfact),(int)( 420 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(800*xfact+15 *xfact),(int)( 420*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("14",(int)( 815 *xfact),(int)( 460 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(00 *xfact),(int)( 470 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(00 *xfact),(int)( 470 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(00*xfact+15 *xfact),(int)( 470*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("15",(int)( 15 *xfact),(int)( 510 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(380 *xfact),(int)( 550 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(380 *xfact),(int)( 550 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(380*xfact+15 *xfact),(int)( 550*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("16",(int)( 395 *xfact),(int)( 590 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(600 *xfact),(int)( 500 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(600 *xfact),(int)( 500 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(600*xfact+15 *xfact),(int)( 500*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("17",(int)( 615 *xfact),(int)( 540 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(150 *xfact),(int)( 630 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(150 *xfact),(int)( 630 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(150*xfact+15 *xfact),(int)( 630*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("18",(int)( 165 *xfact),(int)( 670 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(580 *xfact),(int)( 600 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(580 *xfact),(int)( 600 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(580*xfact+15 *xfact),(int)( 600*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("19",(int)( 595 *xfact),(int)( 640 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(50 *xfact),(int)( 800 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(50 *xfact),(int)( 800 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red );
					//g.fillOval((int)(50*xfact+15 *xfact),(int)( 800*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("20" ,(int)( 65 *xfact),(int)( 840 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(300 *xfact),(int)( 770 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(300 *xfact),(int)( 770 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(300*xfact+15 *xfact),(int)( 770*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("21" ,(int)( 315 *xfact),(int)( 810 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(750 *xfact),(int)( 750 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.BLUE);
					g.fillOval((int)(750 *xfact),(int)( 750 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(750*xfact+15 *xfact),(int)( 750*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("22" ,(int)( 765 *xfact),(int)( 790 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(430 *xfact),(int)( 900 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(430 *xfact),(int)( 900 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					g.setColor(Color.red);
					g.fillOval((int)(430*xfact+15 *xfact),(int)( 900*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("23",(int)( 445 *xfact),(int)( 940 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(660 *xfact),(int)( 840 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(660 *xfact),(int)( 840 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(660*xfact+15 *xfact),(int)( 840*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("24",(int)( 675 *xfact),(int)( 880 *xfact));
					
					g.setColor(taxi);
					g.fillRect((int)(900 *xfact),(int)( 850 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.BLUE);
					//g.fillOval((int)(900 *xfact),(int)( 850 *xfact),(int)( 60 *xfact),(int)( 60 *xfact));
					//g.setColor(Color.red);
					//g.fillOval((int)(900*xfact+15 *xfact),(int)( 850*xfact+15 *xfact),(int)( 30 *xfact),(int)( 30 *xfact));
					g.setColor(Color.black);
					g.drawString("25",(int)( 915 *xfact),(int)( 890 *xfact));				
		}
		
	}	



