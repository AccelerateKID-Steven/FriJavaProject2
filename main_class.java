package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class main_class {

	private JFrame frmMovies;
	private JTextField txtGenres;
	private JTextField txtMovieCompany;
	private JTextField txtYear;
	private JTextField txtRating;

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
		frmMovies.getContentPane().setLayout(null);
		
		JButton btnSearchButton = new JButton("Search For Movies");
		btnSearchButton.setBounds(306, 110, 121, 23);
		frmMovies.getContentPane().add(btnSearchButton);
		
		JComboBox cmbGenre = new JComboBox();
		cmbGenre.setBounds(73, 11, 181, 22);
		frmMovies.getContentPane().add(cmbGenre);
		
		txtGenres = new JTextField();
		txtGenres.setText("Genres");
		txtGenres.setBounds(10, 12, 53, 20);
		frmMovies.getContentPane().add(txtGenres);
		txtGenres.setColumns(10);
		
		txtMovieCompany = new JTextField();
		txtMovieCompany.setText("Movie Company");
		txtMovieCompany.setBounds(264, 12, 86, 20);
		frmMovies.getContentPane().add(txtMovieCompany);
		txtMovieCompany.setColumns(10);
		
		JComboBox cmbCompany = new JComboBox();
		cmbCompany.setBounds(360, 11, 203, 22);
		frmMovies.getContentPane().add(cmbCompany);
		
		txtYear = new JTextField();
		txtYear.setText("Year");
		txtYear.setBounds(10, 44, 53, 20);
		frmMovies.getContentPane().add(txtYear);
		txtYear.setColumns(10);
		
		JComboBox cmbYear = new JComboBox();
		cmbYear.setBounds(73, 44, 68, 22);
		frmMovies.getContentPane().add(cmbYear);
		
		txtRating = new JTextField();
		txtRating.setText("Rating");
		txtRating.setBounds(151, 44, 86, 20);
		frmMovies.getContentPane().add(txtRating);
		txtRating.setColumns(10);
		
		JComboBox cmbRating = new JComboBox();
		cmbRating.setBounds(247, 43, 78, 22);
		frmMovies.getContentPane().add(cmbRating);
		
		JToggleButton tglbtnInternational = new JToggleButton("International");
		tglbtnInternational.setBounds(335, 43, 96, 23);
		frmMovies.getContentPane().add(tglbtnInternational);
		
		JComboBox cmbNation = new JComboBox();
		cmbNation.setEnabled(false);
		cmbNation.setBounds(441, 43, 122, 22);
		frmMovies.getContentPane().add(cmbNation);
		
		JToggleButton tglbtnDoc = new JToggleButton("Documenterie");
		tglbtnDoc.setBounds(10, 75, 104, 23);
		frmMovies.getContentPane().add(tglbtnDoc);
		
		JComboBox cmbDocCompany = new JComboBox();
		cmbDocCompany.setEnabled(false);
		cmbDocCompany.setBounds(124, 77, 113, 22);
		frmMovies.getContentPane().add(cmbDocCompany);
		
		JToggleButton tglbtnAnimated = new JToggleButton("Animated");
		tglbtnAnimated.setBounds(243, 76, 78, 23);
		frmMovies.getContentPane().add(tglbtnAnimated);
		
		JToggleButton tglbtnStopMotion = new JToggleButton("Stop motion");
		tglbtnStopMotion.setEnabled(false);
		tglbtnStopMotion.setBounds(331, 76, 100, 23);
		frmMovies.getContentPane().add(tglbtnStopMotion);
		
		JComboBox cmbAnimatedComp = new JComboBox();
		cmbAnimatedComp.setEnabled(false);
		cmbAnimatedComp.setBounds(441, 76, 122, 22);
		frmMovies.getContentPane().add(cmbAnimatedComp);
		
		JToggleButton tglbtnFantasy = new JToggleButton("Fantasy");
		tglbtnFantasy.setBounds(10, 109, 78, 23);
		frmMovies.getContentPane().add(tglbtnFantasy);
		
		JComboBox cmbFantasrComp = new JComboBox();
		cmbFantasrComp.setBounds(101, 109, 104, 22);
		frmMovies.getContentPane().add(cmbFantasrComp);
	}
}
