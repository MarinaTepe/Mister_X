import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import com.sun.prism.shader.DrawCircle_Color_Loader;
import com.sun.prism.shader.DrawCircle_ImagePattern_Loader;

public class GUI extends JFrame implements ActionListener{

	private JTextComponent buttonLabel;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextPane txtpnVerfgbareTickets;
	private JPanel panel,buttonPanel,kreispanel;
	private JButton buttonbus,buttontaxi, buttonbahn, buttonblack, button2x, button1, button2, button3;
	private int i, j, k, l, m, n;
	

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
		JSplitPane splitPane = new JSplitPane();
		kreispanel=new JPanel();
		kreispanel.add(new OvalComponent());
		splitPane.setBounds(0, 0, breite, hoehe);
		splitPane.setDividerLocation(splitPane.getSize().width/2);
		contentPane.add(splitPane);
		splitPane.setLeftComponent(kreispanel);
	
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
		
		//Array mit verfügbaren Tickets füllen
		       int [] Bustickets = new int[8];
		       for (i=1; i<Bustickets.length; i++) { 
		         }
		       int [] Taxitickets = new int[11];
		       for (j=1; j<Taxitickets.length; j++) { 
		         }
		       int [] Ubahntickets = new int[4];
		       for (k=1; k<Ubahntickets.length; k++) { 
		         }
		       int [] Blacktickets = new int[5];
		       for (l=1; l<Blacktickets.length; l++) { 
		         }
		       int [] Zweimaltickets = new int[2];
		       for (m=1; m<Zweimaltickets.length; m++) { 
		         }
		
		txtpnVerfgbareTickets = new JTextPane();
		txtpnVerfgbareTickets.setEditable(false);
		txtpnVerfgbareTickets.setText("Verf\u00FCgbare Tickets:\r\n\t"
				+ "\tBus\t"+(i)
				+ "\tTaxi\t"+(j)
				+ "\tU-Bahn\t"+(k)
				+ "\n\r\n\r"
				+ "\nMister X:\r\n\t"
				+ "\tBlack-Tickets\t"+(l)
				+ "\tZweimal\t"+(m));
		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
		splitPane_1.setDividerLocation(splitPane.getSize().height/2);
		
		//Aktionsfeld
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(11,2,0,0));
		
		JButton buttonbus = new JButton("Bus");
		buttonbus.addActionListener(this);
		buttonPanel.add(buttonbus);
		
		JButton buttontaxi = new JButton("Taxi");
		buttontaxi.addActionListener(this);
		buttonPanel.add(buttontaxi);
		
		JButton buttonbahn = new JButton("U-Bahn");
		buttonbahn.addActionListener(this);
		buttonPanel.add(buttonbahn);
		
		JButton buttonblack = new JButton("Black");
		buttonblack.addActionListener(this);
		buttonPanel.add(buttonblack);
		
		JButton button2x = new JButton("Zweimal");
		button2x.addActionListener(this);
		buttonPanel.add(button2x);
		

		JButton button1 = new JButton("1");
		buttonbus.addActionListener(this);
		buttonPanel.add(button1);
		
		JButton button2 = new JButton("2");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button2);
		
		JButton button3 = new JButton("3");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button3);
		
		JButton button4 = new JButton("4");
		buttonblack.addActionListener(this);
		buttonPanel.add(button4);
		
		JButton button5 = new JButton("5");
		button2x.addActionListener(this);
		buttonPanel.add(button5);
		
		JButton button6 = new JButton("6");
		buttonbus.addActionListener(this);
		buttonPanel.add(button6);
		
		JButton button7 = new JButton("7");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button7);
		
		JButton button8 = new JButton("8");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button8);
		
		JButton button9 = new JButton("9");
		buttonblack.addActionListener(this);
		buttonPanel.add(button9);
		
		JButton button10 = new JButton("10");
		button2x.addActionListener(this);
		buttonPanel.add(button10);
		
		JButton button11 = new JButton("11");
		buttonbus.addActionListener(this);
		buttonPanel.add(button11);
		
		JButton button12 = new JButton("12");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button12);
		
		JButton button13 = new JButton("13");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button13);
		
		JButton button14 = new JButton("14");
		buttonblack.addActionListener(this);
		buttonPanel.add(button14);
		
		JButton button15 = new JButton("15");
		button2x.addActionListener(this);
		buttonPanel.add(button15);
		
		JButton button16 = new JButton("16");
		buttonbus.addActionListener(this);
		buttonPanel.add(button16);
		
		JButton button17 = new JButton("17");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button17);
		
		JButton button18 = new JButton("18");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button18);
		
		JButton button19 = new JButton("19");
		buttonblack.addActionListener(this);
		buttonPanel.add(button19);
		
		JButton button20 = new JButton("20");
		button2x.addActionListener(this);
		buttonPanel.add(button20);
		
		JButton button21 = new JButton("21");
		buttonbus.addActionListener(this);
		buttonPanel.add(button21);
		
		JButton button22 = new JButton("22");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button22);
		
		JButton button23 = new JButton("23");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button23);
		
		JButton button24 = new JButton("24");
		buttonblack.addActionListener(this);
		buttonPanel.add(button24);
		
		JButton button25 = new JButton("25");
		button2x.addActionListener(this);
		buttonPanel.add(button25);
		
		JButton button26 = new JButton("26");
		buttonbus.addActionListener(this);
		buttonPanel.add(button26);
		
		JButton button27 = new JButton("27");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button27);
		
		JButton button28 = new JButton("28");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button28);
		
		JButton button29 = new JButton("29");
		buttonblack.addActionListener(this);
		buttonPanel.add(button29);
		
		JButton button30 = new JButton("30");
		button2x.addActionListener(this);
		buttonPanel.add(button30);
		
		JButton button31 = new JButton("31");
		buttonbus.addActionListener(this);
		buttonPanel.add(button31);
		
		JButton button32 = new JButton("32");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button32);
		
		JButton button33 = new JButton("33");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button33);
		
		JButton button34 = new JButton("34");
		buttonblack.addActionListener(this);
		buttonPanel.add(button34);
		
		JButton button35 = new JButton("35");
		button2x.addActionListener(this);
		buttonPanel.add(button35);
		
		JButton button36 = new JButton("36");
		buttonbus.addActionListener(this);
		buttonPanel.add(button36);
		
		JButton button37 = new JButton("37");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button37);
		
		JButton button38 = new JButton("38");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button38);
		
		JButton button39 = new JButton("39");
		buttonblack.addActionListener(this);
		buttonPanel.add(button39);
		
		JButton button40 = new JButton("40");
		button2x.addActionListener(this);
		buttonPanel.add(button40);
		
		JButton button41 = new JButton("41");
		buttonbus.addActionListener(this);
		buttonPanel.add(button41);
		
		JButton button42 = new JButton("42");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button42);
		
		JButton button43 = new JButton("43");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button43);
		
		JButton button44 = new JButton("44");
		buttonblack.addActionListener(this);
		buttonPanel.add(button44);
		
		JButton button45 = new JButton("45");
		button2x.addActionListener(this);
		buttonPanel.add(button45);
		
		JButton button46 = new JButton("46");
		buttonbus.addActionListener(this);
		buttonPanel.add(button46);
		
		JButton button47 = new JButton("47");
		buttontaxi.addActionListener(this);
		buttonPanel.add(button47);
		
		JButton button48 = new JButton("48");
		buttonbahn.addActionListener(this);
		buttonPanel.add(button48);
		
		JButton button49 = new JButton("49");
		buttonblack.addActionListener(this);
		buttonPanel.add(button49);
		
		JButton button50 = new JButton("50");
		button2x.addActionListener(this);
		buttonPanel.add(button50);
		
		
		
		
		buttonPanel.setBackground(Color.white);
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		splitPane_2.setRightComponent(buttonPanel);
		
		/*panel = new JPanel();
		splitPane.setLeftComponent(panel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, splitPane_1, table, contentPane, splitPane}));*/
	}		

		//auslöser für die knöpfe
		public void actionPerformed (ActionEvent ae){
	        // Die Quelle wird mit getSource() abgefragt und mit den
	        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
	        // der Buttons ist, wird der Text des JLabels entsprechend geändert
	        if(ae.getSource() == buttonbus){
	            System.out.println("Button 1 wurde betätigt");
	        }
	        else if(ae.getSource() == this.button2){
	        	buttonLabel.setText("Button 2 wurde betätigt");
	        }
	        else if (ae.getSource() == this.button3){
	        	buttonLabel.setText(("Button 3 wurde betätigt"));
	        }
		}
	}
		

	

//kreise malen
	class OvalComponent extends JComponent {

		public void paintComponent(Graphics g) {
			for(int i=0;i<5;i++){
				for(int j=0;j<10;j++){
					g.setColor(Color.RED);
					g.fillRect(120*i, 100*j, 60, 60);
					g.setColor(Color.BLUE);
					g.fillOval(120*i, 100*j, 60, 60);
		}
	}
}
}




