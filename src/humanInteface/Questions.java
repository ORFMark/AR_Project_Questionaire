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

public class Questions {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questions window = new Questions();
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
	public Questions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblWhatIs = new JLabel("1. What is your Affiliation with ERAU?");
		frame.getContentPane().add(lblWhatIs, "2, 2");
		
		JRadioButton rdbtnUndergraduateStudent = new JRadioButton("Undergraduate Student");
		buttonGroup.add(rdbtnUndergraduateStudent);
		frame.getContentPane().add(rdbtnUndergraduateStudent, "2, 4");
		
		JRadioButton rdbtnGraduateStudent = new JRadioButton("Graduate Student");
		buttonGroup.add(rdbtnGraduateStudent);
		frame.getContentPane().add(rdbtnGraduateStudent, "2, 6");
		
		JRadioButton rdbtnFaculty = new JRadioButton("Faculty");
		buttonGroup.add(rdbtnFaculty);
		frame.getContentPane().add(rdbtnFaculty, "2, 8");
		
		JRadioButton rdbtnStaff = new JRadioButton("Staff");
		buttonGroup.add(rdbtnStaff);
		frame.getContentPane().add(rdbtnStaff, "2, 10");
	}

}
