package basicCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class CalculatorGraph {

	private JFrame frmBasicCalculatorMade;
	private JTextField disPlay;
	//variable declaration
	double num1Dbl,num2Dbl,ansDbl;
	//check the button
	int addClick,subClick,mulClick,divClick,modClick,parsentClick,decimalClick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGraph window = new CalculatorGraph();
					window.frmBasicCalculatorMade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGraph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBasicCalculatorMade = new JFrame();
		frmBasicCalculatorMade.setBackground(new Color(0, 255, 255));
		frmBasicCalculatorMade.setForeground(new Color(255, 255, 255));
		frmBasicCalculatorMade.setTitle("Calculator@Shoikat_ItHome");
		frmBasicCalculatorMade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		frmBasicCalculatorMade.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\STUDY\\CSE LEARNE\\source code\\java code\\java basic\\basicCalculator\\fb logo1.png"));
		frmBasicCalculatorMade.getContentPane().setBackground(new Color(176, 224, 230));
		frmBasicCalculatorMade.setBounds(100, 100, 349, 482);
		frmBasicCalculatorMade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBasicCalculatorMade.getContentPane().setLayout(null);
		
		disPlay = new JTextField();
		disPlay.setBackground(new Color(0, 128, 128));
		disPlay.setHorizontalAlignment(SwingConstants.RIGHT);
		disPlay.setFont(new Font("Arial", Font.BOLD, 35));
		disPlay.setForeground(new Color(255, 255, 255));
		disPlay.setBounds(0, 0, 333, 101);
		frmBasicCalculatorMade.getContentPane().add(disPlay);
		disPlay.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_7.getText());
			}
		});
		btn_7.setBackground(new Color(221, 160, 221));
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_7.setBounds(10, 179, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_8.getText());
			}
		});
		btn_8.setBackground(new Color(221, 160, 221));
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_8.setBounds(85, 179, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(new Color(221, 160, 221));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_9.getText());
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_9.setBounds(160, 179, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_9);
		
		JButton btn_div = new JButton("\u00F7");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				disPlay.setText("");
				divClick=1;
				decimalClick=0;
			}
		});
		btn_div.setForeground(new Color(255, 255, 255));
		btn_div.setBackground(new Color(255, 69, 0));
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_div.setBounds(249, 112, 72, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_div);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_4.getText());
			}
		});
		btn_4.setBackground(new Color(221, 160, 221));
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_4.setBounds(10, 247, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_5.getText());
			}
		});
		btn_5.setBackground(new Color(221, 160, 221));
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_5.setBounds(85, 247, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_6.getText());
			}
		});
		btn_6.setBackground(new Color(221, 160, 221));
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_6.setBounds(160, 245, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_6);
		
		JButton btn_multiply = new JButton("x");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				disPlay.setText("");
				mulClick=1;
				decimalClick=0;
			}
		});
		btn_multiply.setBackground(new Color(255, 69, 0));
		btn_multiply.setForeground(new Color(255, 255, 255));
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_multiply.setBounds(249, 179, 72, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_multiply);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				disPlay.setText(disPlay.getText()+ btn_1.getText());
				
			}
		});
		btn_1.setBackground(new Color(221, 160, 221));
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_1.setBounds(10, 316, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_2.getText());
			}
		});
		btn_2.setBackground(new Color(221, 160, 221));
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_2.setBounds(85, 313, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText(disPlay.getText()+ btn_3.getText());
			}
		});
		btn_3.setBackground(new Color(221, 160, 221));
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_3.setBounds(160, 316, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_3);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				disPlay.setText("");
				subClick=1;
				decimalClick=0;
			}
		});
		btn_sub.setBackground(new Color(255, 69, 0));
		btn_sub.setForeground(new Color(255, 255, 255));
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_sub.setBounds(249, 247, 72, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_sub);
		
		JButton btn_decimal = new JButton(".");
		btn_decimal.setBackground(new Color(221, 160, 221));
		btn_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(decimalClick==0)
				{
					disPlay.setText(disPlay.getText()+ btn_decimal.getText());
					decimalClick++;
				}
				
			}
				
			
		});
		btn_decimal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_decimal.setBounds(10, 382, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_decimal);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				disPlay.setText(disPlay.getText()+ btn_0.getText());
			}
		});
		btn_0.setBackground(new Color(221, 160, 221));
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_0.setBounds(85, 382, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_0);
		
		JButton btn_equalTo = new JButton("=");
		btn_equalTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				if(addClick>0)
				{
					ansDbl=num1Dbl+num2Dbl;
					disPlay.setText(String.valueOf(ansDbl));
					num1Dbl=0;
					num2Dbl=0;
					addClick=0;
				}
				if(subClick>0)
				{
					ansDbl=num1Dbl-num2Dbl;
					disPlay.setText(String.valueOf(ansDbl));
					num1Dbl=0;
					num2Dbl=0;
					subClick=0;
				}
				if(mulClick>0)
				{
					ansDbl=num1Dbl*num2Dbl;
					disPlay.setText(String.valueOf(ansDbl));
					num1Dbl=0;
					num2Dbl=0;
					mulClick=0;
				}
				if(divClick>0)
				{
					ansDbl=num1Dbl/num2Dbl;
					disPlay.setText(String.valueOf(ansDbl));
					num1Dbl=0;
					num2Dbl=0;
					divClick=0;
				}
				if(modClick>0)
				{
					ansDbl=num1Dbl%num2Dbl;
					disPlay.setText(String.valueOf(ansDbl));
					num1Dbl=0;
					num2Dbl=0;
					modClick=0;
				}
			}
		});
		btn_equalTo.setBackground(new Color(255, 69, 0));
		btn_equalTo.setForeground(new Color(240, 248, 255));
		btn_equalTo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_equalTo.setBounds(251, 382, 72, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_equalTo);
		
		JButton btn_add = new JButton("+");
		btn_add.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				disPlay.setText("");
				addClick=1;
				decimalClick=0;
				
			}
		});
		btn_add.setForeground(new Color(255, 255, 255));
		btn_add.setBackground(new Color(255, 69, 0));
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_add.setBounds(249, 316, 72, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_add);
		
		JButton btn_ac = new JButton("AC");
		btn_ac.setBackground(new Color(192, 192, 192));
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disPlay.setText("");
			}
		});
		btn_ac.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_ac.setBounds(10, 112, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_ac);
		
		JButton btn_parsent = new JButton("%");
		btn_parsent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1Dbl=Double.parseDouble(String.valueOf(disPlay.getText()));
				disPlay.setText("");
				modClick=1;
				decimalClick=0;
			}
		});
		btn_parsent.setBackground(new Color(221, 160, 221));
		btn_parsent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_parsent.setBounds(160, 382, 65, 55);
		frmBasicCalculatorMade.getContentPane().add(btn_parsent);
	}
}
