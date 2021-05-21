package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;

public class main_class extends JFrame implements ActionListener{

	private JFrame frmMovies;
	private JTextField txtGenres;
	private JTextField txtMovieCompany;
	private JTextField txtYear;
	private JTextField txtRating;
	private JComboBox cmbGenre;
	private JComboBox cmbCompany;
	private JComboBox cmbYear;
	private JComboBox cmbRating;
	private JList movieList;
	private JComboBox cmbFantasyComp;
	private JToggleButton tglbtnFantasy;
	private JComboBox cmbAnimatedComp;
	private JToggleButton tglbtnStopMotion;
	private JToggleButton tglbtnAnimated;
	private JComboBox cmbDocCompany;
	private JToggleButton tglbtnDoc;
	private JComboBox cmbNation;
	private JToggleButton tglbtnInternational;
	private JButton btnSearchButton;
	

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


	public main_class() {
		initialize();
	}


	private void initialize() {
		frmMovies = new JFrame();
		frmMovies.setResizable(false);
		frmMovies.setTitle("movies");
		frmMovies.setBounds(100, 100, 599, 364);
		frmMovies.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMovies.getContentPane().setLayout(null);
		
		btnSearchButton = new JButton("Search For Movies");
		btnSearchButton.addActionListener(this);
		btnSearchButton.setBounds(306, 110, 121, 23);
		frmMovies.getContentPane().add(btnSearchButton);
		
		cmbGenre = new JComboBox();
		cmbGenre.setModel(new DefaultComboBoxModel(new String[] {"Horror", "Sci-Fi", "Action", "Comedy"}));
		cmbGenre.setBounds(73, 11, 181, 22);
		frmMovies.getContentPane().add(cmbGenre);
		
		txtGenres = new JTextField();
		txtGenres.setEditable(false);
		txtGenres.setText("Genres");
		txtGenres.setBounds(10, 12, 53, 20);
		frmMovies.getContentPane().add(txtGenres);
		txtGenres.setColumns(10);
		
		txtMovieCompany = new JTextField();
		txtMovieCompany.setEditable(false);
		txtMovieCompany.setText("Movie Company");
		txtMovieCompany.setBounds(264, 12, 86, 20);
		frmMovies.getContentPane().add(txtMovieCompany);
		txtMovieCompany.setColumns(10);
		
		cmbCompany = new JComboBox();
		cmbCompany.setBounds(360, 11, 203, 22);
		frmMovies.getContentPane().add(cmbCompany);
		
		txtYear = new JTextField();
		txtYear.setEditable(false);
		txtYear.setText("Year");
		txtYear.setBounds(10, 44, 53, 20);
		frmMovies.getContentPane().add(txtYear);
		txtYear.setColumns(10);
		
		cmbYear = new JComboBox();
		cmbYear.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		cmbYear.setBounds(73, 44, 68, 22);
		frmMovies.getContentPane().add(cmbYear);
		
		txtRating = new JTextField();
		txtRating.setEditable(false);
		txtRating.setText("Rating");
		txtRating.setBounds(151, 44, 86, 20);
		frmMovies.getContentPane().add(txtRating);
		txtRating.setColumns(10);
		
		cmbRating = new JComboBox();
		cmbRating.setModel(new DefaultComboBoxModel(new String[] {"10 - 19%", "20 - 29%", "30 - 39%", "40 - 49%", "50 - 59%", "60 - 69%", "70 - 79%", "80 - 89%", "90 - 100%"}));
		cmbRating.setBounds(247, 44, 78, 22);
		frmMovies.getContentPane().add(cmbRating);
		
		tglbtnInternational = new JToggleButton("International");
		tglbtnInternational.setBounds(335, 43, 96, 23);
		frmMovies.getContentPane().add(tglbtnInternational);
		
		cmbNation = new JComboBox();
		cmbNation.setEnabled(false);
		cmbNation.setBounds(441, 43, 122, 22);
		frmMovies.getContentPane().add(cmbNation);
		
		tglbtnDoc = new JToggleButton("Documenterie");
		tglbtnDoc.setBounds(10, 75, 104, 23);
		frmMovies.getContentPane().add(tglbtnDoc);
		
		cmbDocCompany = new JComboBox();
		cmbDocCompany.setEnabled(false);
		cmbDocCompany.setBounds(124, 77, 113, 22);
		frmMovies.getContentPane().add(cmbDocCompany);
		
		tglbtnAnimated = new JToggleButton("Animated");
		tglbtnAnimated.setBounds(243, 76, 78, 23);
		frmMovies.getContentPane().add(tglbtnAnimated);
		
		tglbtnStopMotion = new JToggleButton("Stop motion");
		tglbtnStopMotion.setEnabled(false);
		tglbtnStopMotion.setBounds(331, 76, 100, 23);
		frmMovies.getContentPane().add(tglbtnStopMotion);
		
		cmbAnimatedComp = new JComboBox();
		cmbAnimatedComp.setEnabled(false);
		cmbAnimatedComp.setBounds(441, 76, 122, 22);
		frmMovies.getContentPane().add(cmbAnimatedComp);
		
		tglbtnFantasy = new JToggleButton("Fantasy");
		tglbtnFantasy.setBounds(10, 109, 78, 23);
		frmMovies.getContentPane().add(tglbtnFantasy);
		
		movieList = new JList();
		movieList.setBounds(10, 144, 573, 180);
		frmMovies.getContentPane().add(movieList);
		
		cmbFantasyComp = new JComboBox();
		cmbFantasyComp.setEnabled(false);
		cmbFantasyComp.setBounds(98, 110, 173, 22);
		frmMovies.getContentPane().add(cmbFantasyComp);
	}


	@Override
	public void actionPerformed(ActionEvent e) {		
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == btnSearchButton)
		{
			System.out.println("iiiiiiiiii");
		}
		
	}
}
