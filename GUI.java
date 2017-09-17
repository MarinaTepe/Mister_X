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
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;



public class GUI extends JFrame implements ActionListener{

	public JSplitPane splitPane;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextPane txtpnVerfgbareTickets;
	private JPanel buttonPanel,kreispanel;
	private JButton buttonbus,buttontaxi, buttonbahn, buttonblack, button2x, 
	button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
	button11, button12, button13, button14, button15, button16, button17, button18, button19, button20,
	button21, button22, button23, button24, button25, button26, button27, button28, button29, button30,
	button31, button32, button33, button34, button35, button36, button37, button38, button39, button40,
	button41, button42, button43, button44, button45, button46, button47, button48, button49, button50;
	private int i, j, k, l, m;
	public static int a;
	public static int b;
	public static int c;
	public static Color d;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUI() {
		a=0;b=0;c=0;d= Color.black;
		
		
		//bildschirmanpassung
		int hoehe=Toolkit.getDefaultToolkit().getScreenSize().height-70;//-60 richtwert für die taskleiste
		int breite=Toolkit.getDefaultToolkit().getScreenSize().width;
		
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
		//kreispanel=new JPanel();
		//kreispanel.add(new OvalComponent());
		splitPane.setBounds(0, 0, breite, hoehe);
		splitPane.setDividerLocation(splitPane.getSize().width/2);
		contentPane.add(splitPane);
		splitPane.setLeftComponent(new OvalComponent());
	
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		//splitPane_1.setDividerLocation(splitPane.getSize().height/4);
		splitPane.setRightComponent(splitPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		splitPane_1.setLeftComponent(scrollPane);
		
		
		//MR X spieltafel
		table = new JTable();
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new String("      Spieltafel"), new String ("von Mister X"), null, null, null, null},
				{null, null, null, null, null, null},
				{new Integer(1), null, new Integer(9), null, new Integer(17), null},
				{new Integer(2), null, new Integer(10), null, "(18)", null},
				{"(3)", null, new Integer(11), null, new Integer(19), null},
				{new Integer(4), null, new Integer(12), null, new Integer(20), null},
				{new Integer(5), null, "(13)", null, new Integer(21), null},
				{new Integer(6), null, new Integer(14), null, new Integer(22), null},
				{new Integer(7), null, new Integer (15), null, new Integer(23), null},
				{"(8)", null, new Integer(16), null, "(24)", null}
			},
			new String[] {
				"", "", "", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(10);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(15);
		table.getColumnModel().getColumn(5).setResizable(false);
		scrollPane.setViewportView(table);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_2);
	
		
		// Ticket stack
	
		//Verfügbare Tickets generieren
		int counterField1 = 8;
		int counterField2 = 11;
		int counterField3 = 4;
		int counterField4= 4;
		int counterField5= 2; 
		
				
		txtpnVerfgbareTickets = new JTextPane();
		txtpnVerfgbareTickets.setEditable(false);
		txtpnVerfgbareTickets.setText("Verf\u00FCgbare Tickets:\r\n\t"
				+ "\tBus\t"+(counterField1)
				+ "\tTaxi\t"+(counterField2)
				+ "\tU-Bahn\t"+(counterField3)
				+ "\n\r\n\r"
				+ "\nMister X:\r\n\t"
				+ "\tBlack-Tickets\t"+(counterField4)
				+ "\tZweimal\t"+(counterField5));
		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
		splitPane_1.setDividerLocation(splitPane.getSize().height/2);
		
		//Aktionsfeld
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(6,2,0,0));
		
		buttonbus = new JButton("Bus");
		buttonbus.addActionListener(this);
		buttonPanel.add(buttonbus);
		
		buttontaxi = new JButton("Taxi");
		buttontaxi.addActionListener(this);
		buttonPanel.add(buttontaxi);
		
		buttonbahn = new JButton("U-Bahn");
		buttonbahn.addActionListener(this);
		buttonPanel.add(buttonbahn);
		
		buttonblack = new JButton("Black");
		buttonblack.addActionListener(this);
		buttonPanel.add(buttonblack);
		
		button2x = new JButton("Zweimal");
		button2x.addActionListener(this);
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
		
		/**button26 = new JButton("26");
		button26.addActionListener(this);
		buttonPanel.add(button26);
		
		button27 = new JButton("27");
		button27.addActionListener(this);
		buttonPanel.add(button27);
		
		button28 = new JButton("28");
		button28.addActionListener(this);
		buttonPanel.add(button28);
		
		button29 = new JButton("29");
		button29.addActionListener(this);
		buttonPanel.add(button29);
		
		button30 = new JButton("30");
		button30.addActionListener(this);
		buttonPanel.add(button30);
		
		button31 = new JButton("31");
		button31.addActionListener(this);
		buttonPanel.add(button31);
		
		button32 = new JButton("32");
		button32.addActionListener(this);
		buttonPanel.add(button32);
		
		button33 = new JButton("33");
		button33.addActionListener(this);
		buttonPanel.add(button33);
		
		button34 = new JButton("34");
		button34.addActionListener(this);
		buttonPanel.add(button34);
		
		button35 = new JButton("35");
		button35.addActionListener(this);
		buttonPanel.add(button35);
		
		button36 = new JButton("36");
		button36.addActionListener(this);
		buttonPanel.add(button36);
		
		button37 = new JButton("37");
		button37.addActionListener(this);
		buttonPanel.add(button37);
		
		button38 = new JButton("38");
		button38.addActionListener(this);
		buttonPanel.add(button38);
		
		button39 = new JButton("39");
		button39.addActionListener(this);
		buttonPanel.add(button39);
		
		button40 = new JButton("40");
		button40.addActionListener(this);
		buttonPanel.add(button40);
		
		button41 = new JButton("41");
		button41.addActionListener(this);
		buttonPanel.add(button41);
		
		button42 = new JButton("42");
		button42.addActionListener(this);
		buttonPanel.add(button42);
		
		button43 = new JButton("43");
		button43.addActionListener(this);
		buttonPanel.add(button43);
		
		button44 = new JButton("44");
		button44.addActionListener(this);
		buttonPanel.add(button44);
		
		button45 = new JButton("45");
		button45.addActionListener(this);
		buttonPanel.add(button45);
		
		button46 = new JButton("46");
		button46.addActionListener(this);
		buttonPanel.add(button46);
		
		button47 = new JButton("47");
		button47.addActionListener(this);
		buttonPanel.add(button47);
		
		button48 = new JButton("48");
		button48.addActionListener(this);
		buttonPanel.add(button48);
		
		button49 = new JButton("49");
		button49.addActionListener(this);
		buttonPanel.add(button49);
		
		button50 = new JButton("50");
		button50.addActionListener(this);
		buttonPanel.add(button50);**/
		
		
		
		
		buttonPanel.setBackground(Color.white);
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		splitPane_2.setRightComponent(buttonPanel);
		
		/*panel = new JPanel();
		splitPane.setLeftComponent(panel);
	    setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, splitPane_1, table, contentPane, splitPane}));*/
		}		

		//auslöser für die knöpfe
	
		public void actionPerformed (ActionEvent ae) {
	        // Die Quelle wird mit getSource() abgefragt und mit den
	        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
	        // der Buttons ist, wird der Text des JLabels entsprechend geändert
								
			
	        if(ae.getSource() == this.button1){
	        	a=80;b=100;c=100;
	        	splitPane.setLeftComponent(new OvalComponent());
	        	splitPane.setDividerLocation(splitPane.getSize().width/2);}
	        
	        else if(ae.getSource() == this.button2){
	        	System.out.println("Button 2 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button3){
	        	System.out.println("Button 3 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button4){
	            System.out.println("Button 4 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button5){
	        	System.out.println("Button 5 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button6){
	        	System.out.println("Button 6 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button7){
	            System.out.println("Button 7 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button8){
	        	System.out.println("Button 8 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button9){
	        	System.out.println("Button 9 wurde betätigt");}
	        
	        else if (ae.getSource() == this.button10){
	        	System.out.println("Button 10 wurde betätigt");}
	        
	        	else if(ae.getSource() == this.button11){
	        		System.out.println("Button 11 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button12){
	        	System.out.println("Button 12 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button13){
	        	System.out.println("Button 13 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button14){
	            System.out.println("Button 14 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button15){
	        	System.out.println("Button 15 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button16){
	        	System.out.println("Button 16 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button17){
	            System.out.println("Button 17 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button18){
	        	System.out.println("Button 18 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button19){
	        	System.out.println("Button 19 wurde betätigt");}
	        
	        else if (ae.getSource() == this.button20){
	        	System.out.println("Button 20 wurde betätigt");}
	        
		        else if(ae.getSource() == this.button21){
	        		System.out.println("Button 21 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button22){
	        	System.out.println("Button 22 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button23){
	        	System.out.println("Button 23 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button24){
	            System.out.println("Button 24 wurde betätigt");}
	        
	        /**else if(ae.getSource() == this.button25){
	        	System.out.println("Button 25 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button26){
	        	System.out.println("Button 26 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button27){
	            System.out.println("Button 27 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button28){
	        	System.out.println("Button 28 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button29){
	        	System.out.println("Button 29 wurde betätigt");}
	        
	        else if (ae.getSource() == this.button30){
	        	System.out.println("Button 30 wurde betätigt");}
	        
		        else if(ae.getSource() == this.button31){
	        		System.out.println("Button 31 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button32){
	        	System.out.println("Button 32 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button33){
	        	System.out.println("Button 33 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button34){
	            System.out.println("Button 34 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button35){
	        	System.out.println("Button 35 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button36){
	        	System.out.println("Button 36 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button37){
	            System.out.println("Button 37 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button38){
	        	System.out.println("Button 38 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button39){
	        	System.out.println("Button 39 wurde betätigt");}
	        
	        else if (ae.getSource() == this.button40){
	        	System.out.println("Button 40 wurde betätigt");}
	        
		        else if(ae.getSource() == this.button41){
	        		System.out.println("Button 41 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button42){
	        	System.out.println("Button 42 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button43){
	        	System.out.println("Button 43 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button44){
	            System.out.println("Button 44 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button45){
	        	System.out.println("Button 45 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button46){
	        	System.out.println("Button 46 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button47){
	            System.out.println("Button 47 wurde betätigt");}
	        
	        else if(ae.getSource() == this.button48){
	        	System.out.println("Button 48 wurde betätigt");}
	       
	        else if (ae.getSource() == this.button49){
	        	System.out.println("Button 49 wurde betätigt");}
	        
	        else if (ae.getSource() == this.button50){
	        	System.out.println("Button 50 wurde betätigt");}**/
	        
	        
	        
			        else if(ae.getSource() == this.buttonbus){
			        	System.out.println("Button Bus wurde betätigt");}
		        
		        else if(ae.getSource() == this.buttontaxi){
		        	System.out.println("Button Taxi wurde betätigt");}
		       
		        else if (ae.getSource() == this.buttonbahn){
		        	System.out.println("Button U-Bahn wurde betätigt");}
		        
		        else if(ae.getSource() == this.buttonblack){
		            System.out.println("Button Black wurde betätigt");}
		        
		        else if(ae.getSource() == this.button2x){
		        	System.out.println("Button 2X wurde betätigt");}
		       
		       
		        
	        
		}
		public static int geta() {return a;}
		public static int getb() {return b;}
		public static int getc() {return c;}
		public static Color getd() {return d;}
	}
		

	

//kreise malen
	class OvalComponent extends JComponent {
		
		int aa=GUI.geta();// spieler schwarz
		int bb=GUI.getb();
		int cc=GUI.getc();
		Color dd = GUI.getd();
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.green);
			g.fillRect(0, 0, 1000, 1000);
			g.setColor(dd);
			g.fillOval(bb-(aa/8), cc-(aa/3+aa/12), aa, aa);
			g.setColor(Color.gray);
			//g.fillRect(130,110,80,20);
			//g.setStroke();
			//g.drawLine(0, 0, 100, 100);
			g.setFont(new Font("Serif", Font.PLAIN, 30));
			
			
			
					g.setColor(Color.gray);
					g.fillRect(100, 80, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(100, 80, 60, 60);
					g.setColor(Color.red);
					g.fillOval(100+15, 80+15, 30, 30);
					g.setColor(Color.black);
					//g.setFont(new Font("Serif", Font.PLAIN, 30));
					g.drawString("1", 125, 120);
					
					g.setColor(Color.gray);
					g.fillRect(250, 100, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(250, 100, 60, 60);
					g.setColor(Color.red);
					g.fillOval(250+15, 100+15, 30, 30);
					g.setColor(Color.black);
					//g.setFont(new Font("Serif", Font.PLAIN, 30));
					g.drawString("2", 275, 140);
					
					g.setColor(Color.gray);
					g.fillRect(300, 00, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(300, 00, 60, 60);
					g.setColor(Color.red);
					g.fillOval(300+15, 00+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("3", 325, 40);
					
					g.setColor(Color.gray);
					g.fillRect(440, 110, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(440, 110, 60, 60);
					g.setColor(Color.red);
					g.fillOval(440+15, 110+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("4", 465, 150);
					
					g.setColor(Color.gray);
					g.fillRect(600, 90, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(600, 90, 60, 60);
					g.setColor(Color.red);
					g.fillOval(600+15, 90+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("5", 625, 130);
					
					g.setColor(Color.gray);
					g.fillRect(900, 30, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(900, 30, 60, 60);
					g.setColor(Color.red);
					g.fillOval(900+15, 30+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("6", 925, 70);
					
					g.setColor(Color.gray);
					g.fillRect(400, 190, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(400, 190, 60, 60);
					g.setColor(Color.red);
					g.fillOval(400+15, 190+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("7", 425, 230);
					
					g.setColor(Color.gray);
					g.fillRect(540, 220, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(540, 220, 60, 60);
					g.setColor(Color.red);
					g.fillOval(540+15, 220+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("8", 565, 260);
					
					g.setColor(Color.gray);
					g.fillRect(760, 180, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(760, 180, 60, 60);
					g.setColor(Color.red);
					g.fillOval(760+15, 180+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("9", 780, 220);
					
					g.setColor(Color.gray);
					g.fillRect(150, 250, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(150, 250, 60, 60);
					g.setColor(Color.red);
					g.fillOval(150+15, 250+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("10", 165, 290);
					
					g.setColor(Color.gray);
					g.fillRect(330, 300, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(330, 300, 60, 60);
					g.setColor(Color.red);
					g.fillOval(330+15, 300+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("11", 345, 340);
					
					g.setColor(Color.gray);
					g.fillRect(200, 400, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(200, 400, 60, 60);
					g.setColor(Color.red);
					g.fillOval(200+15, 400+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("12", 215, 440);
					
					g.setColor(Color.gray);
					g.fillRect(500, 370, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(500, 370, 60, 60);
					g.setColor(Color.red);
					g.fillOval(500+15, 370+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("13", 515, 410);
					
					g.setColor(Color.gray);
					g.fillRect(800, 420, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(800, 420, 60, 60);
					g.setColor(Color.red);
					g.fillOval(800+15, 420+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("14", 815, 460);
					
					g.setColor(Color.gray);
					g.fillRect(00, 470, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(00, 470, 60, 60);
					g.setColor(Color.red);
					g.fillOval(00+15, 470+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("15", 15, 510);
					
					g.setColor(Color.gray);
					g.fillRect(380, 550, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(380, 550, 60, 60);
					g.setColor(Color.red);
					g.fillOval(380+15, 550+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("16", 395, 590);
					
					g.setColor(Color.gray);
					g.fillRect(600, 500, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(600, 500, 60, 60);
					g.setColor(Color.red);
					g.fillOval(600+15, 500+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("17", 615, 540);
					
					g.setColor(Color.gray);
					g.fillRect(150, 630, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(150, 630, 60, 60);
					g.setColor(Color.red);
					g.fillOval(150+15, 630+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("18", 165, 670);
					
					g.setColor(Color.gray);
					g.fillRect(580, 600, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(580, 600, 60, 60);
					g.setColor(Color.red);
					g.fillOval(580+15, 600+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("19", 595, 640);
					
					g.setColor(Color.gray);
					g.fillRect(50, 800, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(50, 800, 60, 60);
					g.setColor(Color.red);
					g.fillOval(50+15, 800+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("20", 65, 840);
					
					g.setColor(Color.gray);
					g.fillRect(300, 770, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(300, 770, 60, 60);
					g.setColor(Color.red);
					g.fillOval(300+15, 770+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("21", 315, 810);
					
					g.setColor(Color.gray);
					g.fillRect(750, 750, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(750, 750, 60, 60);
					g.setColor(Color.red);
					g.fillOval(750+15, 750+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("22", 765, 790);
					
					g.setColor(Color.gray);
					g.fillRect(430, 900, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(430, 900, 60, 60);
					g.setColor(Color.red);
					g.fillOval(430+15, 900+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("23", 445, 940);
					
					g.setColor(Color.gray);
					g.fillRect(660, 840, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(660, 840, 60, 60);
					g.setColor(Color.red);
					g.fillOval(660+15, 840+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("24", 675, 880);
					
					g.setColor(Color.gray);
					g.fillRect(900, 850, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(900, 850, 60, 60);
					g.setColor(Color.red);
					g.fillOval(900+15, 850+15, 30, 30);
					g.setColor(Color.black);
					g.drawString("25", 915, 890);				
					
					Graphics2D g2 = (Graphics2D)g;
					g2.setStroke(new BasicStroke(7));
			        g2.draw(new Line2D.Double(10, 10, 100, 2));
					
				
			
		}
	}



