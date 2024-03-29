import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Queue;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Recordatorio {
	private Lista Lista = new Lista();
	private JFrame frame;
	private JTextField Titulo;
	private JTextField Notas;
//<<<<<<< HEAD
	//private Lista Lista = new Lista();

	//Angel Nah Zapata
//=======
	//private Lista Lista = new Lista();
//LopezlaraJose
	/**
	 * Launch the application.
	 */
//>>>>>>> refs/remotes/origin/RobertoLara
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
//<<<<<<< HEAD
		//Agregar.setBounds(95, 173, 96, 21);
//=======
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String titulo = Titulo.getText();
                String nota = Notas.getText();
                if (!titulo.isEmpty()) {
                Lista.agregarActividad(new nodo(titulo, nota,false));
                    JOptionPane.showMessageDialog(null, " Se ha agregado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "El título no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                }
				
			}
		});
		Agregar.setBounds(86, 168, 94, 21);
//>>>>>>> refs/remotes/origin/Rama_Gerardo
		frame.getContentPane().add(Agregar);
		
		JButton Todos = new JButton("Todos");
//<<<<<<< HEAD
	//	Todos.setBounds(329, 91, 111, 21);
//=======
		Todos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarTodasActividades();
			}
		});
		Todos.setBounds(317, 137, 111, 21);
//>>>>>>> refs/remotes/origin/RobertoLara
		frame.getContentPane().add(Todos);
		
		JButton Importantes = new JButton("Destacados");
		Importantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarDestacados();
			}
		});
		Importantes.setBounds(317, 168, 111, 21);
		frame.getContentPane().add(Importantes);
		
		JLabel Recordatorios = new JLabel("To Do List");
		Recordatorios.setFont(new Font("Eras Demi ITC", Font.BOLD | Font.ITALIC, 42));
		Recordatorios.setBounds(22, 10, 228, 32);
		frame.getContentPane().add(Recordatorios);
		
		JButton Eliminar = new JButton("Eliminar");
//<<<<<<< HEAD
		//Eliminar.setBounds(317, 199, 111, 21);
//=======
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//<<<<<<< HEAD
				
				Lista.eliminar();
				 Titulo.setText("");
                 Notas.setText("");
                 
//=======
				Lista.mostrarTodasActividades();
	
//>>>>>>> refs/remotes/origin/RobertoLara
			}
		});
		Eliminar.setBounds(317, 199, 111, 21);
//>>>>>>> refs/remotes/origin/Rama_Gerardo
		frame.getContentPane().add(Eliminar);
		
		JButton Destacar = new JButton("Destacar");
		Destacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.destacar();
			}
		});
		Destacar.setBounds(84, 199, 96, 21);
		frame.getContentPane().add(Destacar);
		
		Titulo = new JTextField();
		Titulo.setBounds(84, 92, 96, 19);
		frame.getContentPane().add(Titulo);
		Titulo.setColumns(10);
		
		Notas = new JTextField();
		Notas.setColumns(10);
		Notas.setBounds(84, 139, 96, 19);
		frame.getContentPane().add(Notas);
		
		JLabel Título = new JLabel("Agregar una tarea");
		Título.setFont(new Font("Arial", Font.PLAIN, 12));
		Título.setBounds(80, 54, 129, 49);
		frame.getContentPane().add(Título);
		
		JLabel Comentarios = new JLabel("Comentarios");
		Comentarios.setFont(new Font("Arial", Font.PLAIN, 12));
		Comentarios.setBounds(94, 117, 94, 13);
		frame.getContentPane().add(Comentarios);
		
		JButton Completados = new JButton("Completados");
//<<<<<<< HEAD
		//Completados.setBounds(319, 215, 111, 21);
//=======
		Completados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.mostrarTodasActividadesCompletadas();
			}
		});
		Completados.setBounds(317, 227, 111, 21);
//>>>>>>> refs/remotes/origin/RobertoLara
		frame.getContentPane().add(Completados);
		
//<<<<<<< HEAD
		
		
//=======
		JButton btnCompletar = new JButton("Completar");
		btnCompletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista.completarSiguienteActividad();
			}
		});
		btnCompletar.setBounds(86, 227, 94, 21);
		frame.getContentPane().add(btnCompletar);
		
		JLabel amarillo = new JLabel("");
		amarillo.setIcon(new ImageIcon("C:\\Users\\angel\\OneDrive\\Imágenes\\VersionControl\\imagenes\\significado-del-color-amarillo.jpg"));
		amarillo.setBounds(0, 52, 250, 218);
		frame.getContentPane().add(amarillo);
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon("C:\\Users\\angel\\OneDrive\\Imágenes\\VersionControl\\imagenes\\icon.png"));
		icon.setBounds(326, 10, 91, 101);
		frame.getContentPane().add(icon);
		
		JLabel purpura = new JLabel("");
		purpura.setIcon(new ImageIcon("C:\\Users\\angel\\OneDrive\\Imágenes\\VersionControl\\imagenes\\7d2181.png"));
		purpura.setBounds(249, 52, 235, 248);
		frame.getContentPane().add(purpura);
//>>>>>>> refs/remotes/origin/RobertoLara
	}
}
