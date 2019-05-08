package humanInteface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Questions {

	private JFrame frmArSurvey;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questions window = new Questions();
					window.frmArSurvey.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Questions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArSurvey = new JFrame();
		frmArSurvey.setTitle("AR Survey");
		frmArSurvey.setBounds(100, 100, 600, 900);
		frmArSurvey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArSurvey.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblWhatIs = new JLabel("1. What is your Affiliation with ERAU?");
		frmArSurvey.getContentPane().add(lblWhatIs, "2, 2");
		
		JRadioButton rdbtnUndergraduateStudent = new JRadioButton("Undergraduate Student");
		buttonGroup.add(rdbtnUndergraduateStudent);
		frmArSurvey.getContentPane().add(rdbtnUndergraduateStudent, "2, 4");
		
		JRadioButton rdbtnGraduateStudent = new JRadioButton("Graduate Student");
		buttonGroup.add(rdbtnGraduateStudent);
		frmArSurvey.getContentPane().add(rdbtnGraduateStudent, "2, 6");
		
		JRadioButton rdbtnFaculty = new JRadioButton("Faculty");
		buttonGroup.add(rdbtnFaculty);
		frmArSurvey.getContentPane().add(rdbtnFaculty, "2, 8");
		
		JRadioButton rdbtnStaff = new JRadioButton("Staff");
		buttonGroup.add(rdbtnStaff);
		frmArSurvey.getContentPane().add(rdbtnStaff, "2, 10");
		
		JLabel lblfirstLineAnd = new JLabel("<html>2. Please select which of the following most accurately describes your degree program or area of expertise</html>");
		frmArSurvey.getContentPane().add(lblfirstLineAnd, "2, 12");
		
		JLabel lblNewLabel = new JLabel("");
		frmArSurvey.getContentPane().add(lblNewLabel, "2, 14");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("College of Engineering");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton, "2, 16");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("College of Arts and Sciences");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_1, "2, 18");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("College of Security and Intelligence");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_2, "2, 20");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("College of Aviation ");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_3, "2, 22");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Does not apply");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_4, "2, 24");
		
		JLabel lblNewLabel_1 = new JLabel("<html> 3.If you are an undergraduate student, please select your class standing (cumulative, not by degree) </html>");
		frmArSurvey.getContentPane().add(lblNewLabel_1, "2, 26");
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Freshman (0-29)");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_5, "2, 28");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Sophomore (30-59)");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_6, "2, 30");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Junior (60-89)");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_7, "2, 32");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Senior (90+)");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_8, "2, 34");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Does Not Apply");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_9, "2, 36");
		
		JLabel lblgendersex = new JLabel("<html>4. Gender/Sex</html>");
		frmArSurvey.getContentPane().add(lblgendersex, "2, 38");
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Male");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_10, "2, 40");
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Female");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_11, "2, 42");
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Other");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_12, "2, 44");
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Prefer Not to Answer");
		frmArSurvey.getContentPane().add(rdbtnNewRadioButton_13, "2, 46");
		
		JLabel lblhaveManySeparate = new JLabel("<html>5. How many separate experiences of five minutes or longer have you had using Virtual Reality or Augmented Reality technologies?</html>");
		frmArSurvey.getContentPane().add(lblhaveManySeparate, "2, 48");
		
		JLabel lblNewLabel_2 = new JLabel("<html>Please enter the number of CEC or EE lab classes you are enrolled in or have taken previously </html>");
		frmArSurvey.getContentPane().add(lblNewLabel_2, "2, 58");
		
		JSpinner spinner = new JSpinner();
		frmArSurvey.getContentPane().add(spinner, "2, 60, center, default");
		
		JButton btnSubmitResponse = new JButton("Submit Response");
		frmArSurvey.getContentPane().add(btnSubmitResponse, "2, 62");
	}

}
