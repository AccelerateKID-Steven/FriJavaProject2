package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class main_class {

	private JFrame frmMovies;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_class window = new main_class();
					window.frmMovies.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_class() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMovies = new JFrame();
		frmMovies.setResizable(false);
		frmMovies.setTitle("movies");
		frmMovies.setBounds(100, 100, 599, 364);
		frmMovies.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
