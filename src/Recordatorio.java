import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Queue;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Recordatorio {

	private JFrame frame;
	private JTextField Titulo;
	private JTextField Notas;
	private Lista Lista = new Lista();
//LopezlaraJose
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recordatorio window = new Recordatorio();
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
	public Recordatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.getContentPane().setForeground(new Color(0, 128, 192));
		frame.setBounds(100, 100, 474, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Agregar = new JButton("Agregar");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Agregar.setBounds(95, 144, 85, 21);
		frame.getContentPane().add(Agregar);
		
		JButton Todos = new JButton("Todos");
		Todos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarTodasActividades();
			}
		});
		Todos.setBounds(339, 82, 111, 21);
		frame.getContentPane().add(Todos);
		
		JButton Importantes = new JButton("Destacados");
		Importantes.setBounds(339, 113, 111, 21);
		frame.getContentPane().add(Importantes);
		
		JLabel Recordatorios = new JLabel("Prioridades");
		Recordatorios.setFont(new Font("Eras Demi ITC", Font.PLAIN, 20));
		Recordatorios.setBounds(179, 10, 112, 32);
		frame.getContentPane().add(Recordatorios);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarTodasActividades();
	
			}
		});
		Eliminar.setBounds(339, 144, 111, 21);
		frame.getContentPane().add(Eliminar);
		
		JButton Destacar = new JButton("Destacar");
		Destacar.setBounds(95, 173, 85, 21);
		frame.getContentPane().add(Destacar);
		
		Titulo = new JTextField();
		Titulo.setBounds(84, 83, 96, 19);
		frame.getContentPane().add(Titulo);
		Titulo.setColumns(10);
		
		Notas = new JTextField();
		Notas.setColumns(10);
		Notas.setBounds(84, 114, 96, 19);
		frame.getContentPane().add(Notas);
		
		JLabel Título = new JLabel("Título");
		Título.setFont(new Font("Arial", Font.PLAIN, 15));
		Título.setBounds(29, 85, 45, 13);
		frame.getContentPane().add(Título);
		
		JLabel Nota = new JLabel("Notas");
		Nota.setFont(new Font("Arial", Font.PLAIN, 15));
		Nota.setBounds(29, 116, 45, 13);
		frame.getContentPane().add(Nota);
		
		JButton Completados = new JButton("Completados");
		Completados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarTodasActividadesCompletadas();
			}
		});
		Completados.setBounds(339, 173, 111, 21);
		frame.getContentPane().add(Completados);
		
		JButton btnCompletar = new JButton("Completar");
		btnCompletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.completarSiguienteActividad();
			}
		});
		btnCompletar.setBounds(95, 205, 85, 21);
		frame.getContentPane().add(btnCompletar);
	}
}
