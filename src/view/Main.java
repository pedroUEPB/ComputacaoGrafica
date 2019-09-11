/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Graficos.JanelaGraficos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Peu
 */
public class Main extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Main() {
		setBounds(100, 100, 600, 450);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblProjetoDeComputao = new JLabel("Projeto de Computa\u00E7\u00E3o Gr\u00E1fica");
		lblProjetoDeComputao.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		panel.add(lblProjetoDeComputao);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnApresentarOsGrficos = new JButton("Apresentar os Gr\u00E1ficos");
		btnApresentarOsGrficos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                        JanelaGraficos janelaGraficos = new JanelaGraficos();
                        janelaGraficos.setVisible(true);
                    }
		});
		panel_2.add(btnApresentarOsGrficos);
		
		JButton btnApresentarAAnimao = new JButton("Apresentar a Anima\u00E7\u00E3o");
		/*btnApresentarAAnimao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				SistemaSolar sistemaSolar = new SistemaSolar();
				sistemaSolar.animacao();
			}
		});*/
		panel_2.add(btnApresentarAAnimao);
		
		JLabel label = new JLabel("");
		getContentPane().add(label, BorderLayout.CENTER);
		//label.setIcon(new ImageIcon("bin/icon_cg.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(SystemColor.controlShadow);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
