/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author Urmee
 */
public class Calculator {
    
    private JFrame frame;
	private JTextField disPlay;


    /**
     * @param args the command line arguments
     */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		disPlay = new JTextField();
		disPlay.setBounds(0, 0, 384, 62);http:
		disPlay.setBackground(Color.DARK_GRAY);
		disPlay.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(disPlay);
		disPlay.setColumns(10);
		
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font("Arial", Font.BOLD, 18));
		btnAc.setBounds(10, 100, 74, 68);
		frame.getContentPane().add(btnAc);		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Arial", Font.BOLD, 18));
		btnC.setBounds(94, 100, 74, 68);
		frame.getContentPane().add(btnC);
		
		JButton banParsent = new JButton("%");
		banParsent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		banParsent.setFont(new Font("Arial", Font.BOLD, 18));
		banParsent.setBounds(178, 100, 74, 68);
		frame.getContentPane().add(banParsent);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(274, 100, 74, 68);
		frame.getContentPane().add(btnDiv);
		
		JButton button_3 = new JButton("AC");
		button_3.setFont(new Font("Arial", Font.BOLD, 18));
		button_3.setBounds(10, 197, 74, 68);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("AC");
		button_4.setFont(new Font("Arial", Font.BOLD, 18));
		button_4.setBounds(94, 197, 74, 68);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("AC");
		button_5.setFont(new Font("Arial", Font.BOLD, 18));
		button_5.setBounds(178, 197, 74, 68);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("AC");
		button_6.setFont(new Font("Arial", Font.BOLD, 18));
		button_6.setBounds(274, 197, 74, 68);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("AC");
		button_7.setFont(new Font("Arial", Font.BOLD, 18));
		button_7.setBounds(10, 290, 74, 68);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("AC");
		button_8.setFont(new Font("Arial", Font.BOLD, 18));
		button_8.setBounds(94, 290, 74, 68);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("AC");
		button_9.setFont(new Font("Arial", Font.BOLD, 18));
		button_9.setBounds(178, 290, 74, 68);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("AC");
		button_10.setFont(new Font("Arial", Font.BOLD, 18));
		button_10.setBounds(274, 290, 74, 68);
		frame.getContentPane().add(button_10);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Arial", Font.BOLD, 18));
		btnPoint.setBounds(10, 388, 74, 68);
		frame.getContentPane().add(btnPoint);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(94, 388, 74, 68);
		frame.getContentPane().add(btn0);
		
		JButton button_13 = new JButton("AC");
		button_13.setFont(new Font("Arial", Font.BOLD, 18));
		button_13.setBounds(178, 388, 74, 68);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("AC");
		button_14.setFont(new Font("Arial", Font.BOLD, 18));
		button_14.setBounds(274, 388, 74, 68);
		frame.getContentPane().add(button_14);
	}
}

