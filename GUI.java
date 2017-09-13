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

	/**
	 * Create the frame.
	 */
	public GUI() {
		int hoehe=Toolkit.getDefaultToolkit().getScreenSize().height-70;//-60 richtwert für die taskleiste
		int breite=Toolkit.getDefaultToolkit().getScreenSize().width;
		setTitle("Mister X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		txtpnVerfgbareTickets = new JTextPane();
		txtpnVerfgbareTickets.setEditable(false);
		txtpnVerfgbareTickets.setText("Verf\u00FCgbare Tickets:\r\n\t\tBus\t\tTaxi\t\tU-Bahn\r\n\r\n\r\nMister X:\r\n\t\tBlack-Tickets\t\t2x");
		splitPane_2.setLeftComponent(txtpnVerfgbareTickets);
		splitPane_1.setDividerLocation(splitPane.getSize().height/2);
		
		
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
		
		JButton button2x = new JButton("2x");
		button2x.addActionListener(this);
		buttonPanel.add(button2x);
		
		for(int i=1;i<=50;i++)
		{
			JButton button1 = new JButton(""+i);
			button1.addActionListener(this);
			buttonPanel.add(button1);
		}
		buttonPanel.setBackground(Color.white);
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		splitPane_2.setRightComponent(buttonPanel);
		
		/*panel = new JPanel();
		splitPane.setLeftComponent(panel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, splitPane_1, table, contentPane, splitPane}));*/
		
		
		

	}
	public void actionPerformed (ActionEvent ae){
        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        if(ae.getSource() == this.button1){
            buttonLabel.setText(("Button 1 wurde betätigt"));
        }
        else if(ae.getSource() == this.button2){
        	buttonLabel.setText("Button 2 wurde betätigt");
        }
        else if (ae.getSource() == this.button3){
        	buttonLabel.setText(("Button 3 wurde betätigt"));
        }
	}
}


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




