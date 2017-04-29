package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import javax.swing.border.TitledBorder;

import logic.N_aryTree;
import logic.Node;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import ui.Root;
import logic.Process; 

public class ChayoteCanvas extends JFrame {
	
	
	private int chayotesPerSecond;
	private int probability;
	private int chayotes;
	private JPanel contentPane;
	private JTextField numeroChayotes;
	private JTextField probaChayotes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChayoteCanvas frame = new ChayoteCanvas();
					frame.setTitle("CHAYOTERA");
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
	public ChayoteCanvas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(29, 89, 1072, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(10, 20, 1017, 417);
		panel.add(canvas);
		
		JLabel lblNumeroDe = new JLabel("Numero de Chayotes ");
		lblNumeroDe.setBounds(33, 23, 137, 17);
		contentPane.add(lblNumeroDe);
		
		numeroChayotes = new JTextField();
		numeroChayotes.setBounds(156, 21, 37, 20);
		contentPane.add(numeroChayotes);
		numeroChayotes.setColumns(10);
		
		JLabel lblProbabilidadDeNacimiento = new JLabel("Probabilidad de Nacimiento del Chayote");
		lblProbabilidadDeNacimiento.setBounds(251, 24, 239, 14);
		contentPane.add(lblProbabilidadDeNacimiento);
		
		probaChayotes = new JTextField();
		probaChayotes.setBounds(479, 21, 37, 20);
		contentPane.add(probaChayotes);
		probaChayotes.setColumns(10);
		
		JLabel lblSegundosDeProduccion = new JLabel("Segundos de Producci\u00F3n");
		lblSegundosDeProduccion.setBounds(573, 24, 152, 14);
		contentPane.add(lblSegundosDeProduccion);
		
		
		SpinnerNumberModel model = new SpinnerNumberModel(new Integer(1),new Integer(1),new Integer(5),new Integer(1)); 	
		JSpinner spinnerSeconds = new JSpinner(model);
		spinnerSeconds.setBounds(723, 21, 29, 20);
		contentPane.add(spinnerSeconds);
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (Integer.parseInt(numeroChayotes.getText()) <10 || Integer.parseInt(numeroChayotes.getText())>30)
				{
					JOptionPane.showMessageDialog(null, "El numero de hijos debe ser mayor que 10 y menor a 30", "Error", 
					JOptionPane.ERROR_MESSAGE);
					numeroChayotes.setText(null);
					probaChayotes.setText(null);
				}
				else if(Integer.parseInt(probaChayotes.getText())<70 || Integer.parseInt(probaChayotes.getText())>90)
				{
					JOptionPane.showMessageDialog(null, "Ingrese una probabilidad entre 70% y 90% y unicamente el numero", "Error", 
							JOptionPane.ERROR_MESSAGE);
					probaChayotes.setText(null);
					numeroChayotes.setText(null);
				}
				
				chayotes = Integer.parseInt(numeroChayotes.getText());
				probability =  Integer.parseInt(probaChayotes.getText());
				chayotesPerSecond = (int) spinnerSeconds.getValue();
				Process Thread = new Process(canvas);
				try {
					Thread.sleep(chayotesPerSecond*100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Hilo de ejecucion
				try {
					
				
					Thread.run(chayotes, probability, chayotesPerSecond);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
			}
		});
		btnIniciar.setBounds(855, 20, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnDetener = new JButton("DETENER");
		btnDetener.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		btnDetener.setBounds(970, 20, 89, 23);
		contentPane.add(btnDetener);
	}
}
