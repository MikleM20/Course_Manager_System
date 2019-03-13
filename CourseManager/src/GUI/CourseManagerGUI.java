package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * GUI Class for Course + Program Manager
 * Currently contains User Login and Logout Functionalities
 * @author Michael Manila
 */

public class CourseManagerGUI {

	/*
	 * Default username and password
	 */
	private String testUsername = "admin";
	private String testPassword = "Password1";
	

	private JFrame frmCourseAndProgram;
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseManagerGUI window = new CourseManagerGUI();
					window.frmCourseAndProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CourseManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCourseAndProgram = new JFrame();
		frmCourseAndProgram.setResizable(false);
		frmCourseAndProgram.setTitle("Course and Program Manager");
		frmCourseAndProgram.setBounds(100, 100, 650, 400);
		frmCourseAndProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCourseAndProgram.getContentPane().setLayout(null);
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 644, 371);
		frmCourseAndProgram.getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		// Username Label
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(375, 61, 169, 31);
		loginPanel.add(lblUsername);
		// Password Label
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(375, 160, 169, 31);
		loginPanel.add(lblPassword);
		
		// Username Text Field
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameField.setBounds(375, 95, 230, 31);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		// Password Field
		passwordField = new JPasswordField();
		passwordField.setBounds(375, 195, 230, 31);
		loginPanel.add(passwordField);
		
		//Log in Button
		JButton btnLogin = new JButton("Log In");
		btnLogin.setBackground(SystemColor.activeCaption);
		btnLogin.setFont(new Font("Sitka Small", Font.PLAIN, 18));
		btnLogin.setBounds(400, 250, 150, 30);
		loginPanel.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 345, 371);
		loginPanel.add(panel);
		panel.setLayout(null);
		
		JPanel blueLoginPanel = new JPanel();
		blueLoginPanel.setBackground(SystemColor.activeCaption);
		blueLoginPanel.setBounds(0, 0, 345, 371);
		loginPanel.add(blueLoginPanel);
		blueLoginPanel.setLayout(null);
				
		JPanel whiteLoginPanel = new JPanel();
		whiteLoginPanel.setBackground(Color.WHITE);
		whiteLoginPanel.setBounds(342, 0, 302, 371);
		loginPanel.add(whiteLoginPanel);
		whiteLoginPanel.setLayout(null);
		

		JLabel lblCourseAndProgram = new JLabel("<html>Course and <br>Program Manager</html>");
		lblCourseAndProgram.setFont(new Font("Sitka Small", Font.PLAIN, 25));
		lblCourseAndProgram.setBounds(28, 72, 278, 182);
		panel.add(lblCourseAndProgram);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(342, 0, 302, 371);
		loginPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel loginMessage = new JLabel("<html>Wrong Username and <br>Password Combination</html>");
		loginMessage.setBounds(38, 289, 210, 48);
		panel_1.add(loginMessage);
		loginMessage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		loginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		loginMessage.setForeground(Color.RED);
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(SystemColor.window);
		menuPanel.setBounds(0, 0, 644, 371);
		frmCourseAndProgram.getContentPane().add(menuPanel);
		menuPanel.setVisible(false);
		menuPanel.setLayout(null);
		
		JButton btnCourses = new JButton("Courses");
		btnCourses.setBackground(SystemColor.activeCaption);
		btnCourses.setBounds(110, 250, 120, 30);
		btnCourses.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnCourses);
		
		JLabel lblSearch = new JLabel("Search for:");
		lblSearch.setBounds(25, 100, 90, 20);
		lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		menuPanel.add(lblSearch);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.setBackground(SystemColor.activeCaption);
		btnFaculty.setBounds(110, 130, 120, 30);
		btnFaculty.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnFaculty);
		
		JButton btnDepartment = new JButton("Department");
		btnDepartment.setBackground(SystemColor.activeCaption);
		btnDepartment.setBounds(110, 170, 120, 30);
		btnDepartment.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnDepartment);
		
		JButton btnPrograms = new JButton("Programs");
		btnPrograms.setBackground(SystemColor.activeCaption);
		btnPrograms.setBounds(110, 210, 120, 30);
		btnPrograms.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnPrograms);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(SystemColor.activeCaption);
		btnLogout.setBounds(534, 11, 100, 30);
		btnLogout.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnLogout);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBackground(SystemColor.activeCaption);
		btnSettings.setBounds(534, 52, 100, 30);
		btnSettings.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		menuPanel.add(btnSettings);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(0, 0, 644, 371);
		menuPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.window);
		panel_3.setBounds(10, 80, 324, 227);
		panel_2.add(panel_3);
		
		JButton btnAddNew = new JButton("<html>Add Faculty,<br> Department, Program, <br>or Course</html>");
		btnAddNew.setBounds(401, 170, 191, 79);
		panel_2.add(btnAddNew);
		btnAddNew.setBackground(SystemColor.activeCaption);
		btnAddNew.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddNew.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_4.setBounds(519, 0, 125, 95);
		panel_2.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.window);
		panel_5.setBounds(386, 137, 220, 147);
		panel_2.add(panel_5);
		
		
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AddPage addWindow = new AddPage();
					addWindow.setVisible(true);
					addWindow.addWindowListener(new SearchPageWindowListener(btnAddNew));

					btnLogout.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							//Switch to Login Panel and close add page
							loginPanel.setVisible(true);
							menuPanel.setVisible(false);
							addWindow.dispose();
						}
					});

				} catch (Exception a){
					a.printStackTrace();
				}
			}
		});
		btnLogout.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        	//Switch to Login Panel
	        	loginPanel.setVisible(true);
	        	menuPanel.setVisible(false);
	        
	      }
	    });
		
				
				btnLogout.addActionListener(new ActionListener()
			    {
			      public void actionPerformed(ActionEvent e)
			      {
			        	//Switch to Login Panel
			        	loginPanel.setVisible(true);
			        	menuPanel.setVisible(false);
			        
			      }
			    });
				btnFaculty.addActionListener(new ActionListener()
				{
				    public void actionPerformed(ActionEvent e){
				        //create and open Faculty window (but also disable Faculty button)
				        try {
				            FacultySearchPage facultyWindow = new FacultySearchPage();
				            facultyWindow.setVisible(true);
				            facultyWindow.addWindowListener(new SearchPageWindowListener(btnFaculty));

				            btnLogout.addActionListener(new ActionListener()
				            {
				                public void actionPerformed(ActionEvent e)
				                {
				                    //Switch to Login Panel and close Faculty search page
				                    loginPanel.setVisible(true);
				                    menuPanel.setVisible(false);
				                    facultyWindow.dispose();
				                }
				            });

				        } catch (Exception a){
				            a.printStackTrace();
				        }

				    }

				});
				btnDepartment.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        //create and open Department window (but also disable Department button)
				        try {
				            DepartmentSearchPage departmentWindow = new DepartmentSearchPage();
				            btnDepartment.setEnabled(false);
				            departmentWindow.setVisible(true);
				            departmentWindow.addWindowListener(new SearchPageWindowListener(btnDepartment));

				            btnLogout.addActionListener(new ActionListener()
				            {
				                public void actionPerformed(ActionEvent e)
				                {
				                    //Switch to Login Panel and close Faculty search page
				                    loginPanel.setVisible(true);
				                    menuPanel.setVisible(false);
				                    departmentWindow.dispose();
				                }
				            });

				        } catch (Exception a){
				            a.printStackTrace();
				        }
				    }
				});
				btnPrograms.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        try {
				            ProgramSearchPage programWindow = new ProgramSearchPage();
				            btnPrograms.setEnabled(false);
				            programWindow.setVisible(true);
				            programWindow.addWindowListener(new SearchPageWindowListener(btnPrograms));

				            btnLogout.addActionListener(new ActionListener()
				            {
				                public void actionPerformed(ActionEvent e)
				                {
				                    //Switch to Login Panel and close Faculty search page
				                    loginPanel.setVisible(true);
				                    menuPanel.setVisible(false);
				                    programWindow.dispose();
				                }
				            });

				        } catch (Exception a) {
				            a.printStackTrace();
				        }
				    }
				});
				btnCourses.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        try {
				            CourseSearchPage courseWindow = new CourseSearchPage();
				            btnCourses.setEnabled(false);
				            courseWindow.setVisible(true);
				            courseWindow.addWindowListener(new SearchPageWindowListener(btnCourses));

				            btnLogout.addActionListener(new ActionListener()
				            {
				                public void actionPerformed(ActionEvent e)
				                {
				                    //Switch to Login Panel and close Faculty search page
				                    loginPanel.setVisible(true);
				                    menuPanel.setVisible(false);
				                    courseWindow.dispose();
				                }
				            });

				        } catch (Exception a) {
				            a.printStackTrace();
				        }
				    }
				});
		loginMessage.setVisible(false);
		
		
		/*
		 * Create menu panel and add components
		 */
		
		/**
		 * Action Listener for Login Button
		 */
		btnLogin.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        String usernameInput = usernameField.getText();
	        String pwInput = "";
	        
	        char[] passwordArr = passwordField.getPassword();
	        int pwLength = passwordArr.length;
	        for(int i =0; i < pwLength; i++) {
	        	pwInput += passwordArr[i];
	        }
	        

	        
	        // Prints to help check getting proper input
	        //System.out.println(usernameInput);
	        //System.out.println(pwInput);

	        if(usernameInput.equals(testUsername) && pwInput.equals(testPassword)) {
	        	
	        	//Switch to Menu Panel
	        	loginPanel.setVisible(false);
	        	menuPanel.setVisible(true);
	        	
	        	//Clear username and password inputed so user doesn't have to clear text field after logout
	        	usernameField.setText(null);
	        	passwordField.setText(null);
	        	loginMessage.setVisible(false);
	        	
	        }
	        
	        else {
	        	// Incorrect Username and Password Combination, display message and clear password field
	        	loginMessage.setVisible(true);
	        	passwordField.setText(null);
	        }
	        
	        
	      }
	    });
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			        String usernameInput = usernameField.getText();
			        String pwInput = "";
			        
			        char[] passwordArr = passwordField.getPassword();
			        int pwLength = passwordArr.length;
			        for(int i =0; i < pwLength; i++) {
			        	pwInput += passwordArr[i];
			        }
			        

			        
			        // Prints to help check getting proper input
			        //System.out.println(usernameInput);
			        //System.out.println(pwInput);

			        if(usernameInput.equals(testUsername) && pwInput.equals(testPassword)) {
			        	
			        	//Switch to Menu Panel
			        	loginPanel.setVisible(false);
			        	menuPanel.setVisible(true);
			        	
			        	//Clear username and password inputed so user doesn't have to clear text field after logout
			        	usernameField.setText(null);
			        	passwordField.setText(null);
			        	loginMessage.setVisible(false);
			        	
			        }
			        
			        else {
			        	// Incorrect Username and Password Combination, display message and clear password field
			        	loginMessage.setVisible(true);
			        	passwordField.setText(null);
			        }
				}
			}
		});
		
		/**
		 * Action Listener for when Logout Button pressed
		 */
        /**
        * Action Listeners for when the Faculty, Department, Program and Course buttons under search are hit
         */
}
}
