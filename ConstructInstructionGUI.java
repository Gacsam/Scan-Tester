import java.awt.EventQueue;
import javax.jnlp.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class ConstructInstructionGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConstructInstructionGUI frame = new ConstructInstructionGUI();
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
	public ConstructInstructionGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblConstructCreatorV = new JLabel("Construct Creator v1.01r");
		lblConstructCreatorV.setBounds(5, 5, 422, 19);
		lblConstructCreatorV.setHorizontalAlignment(SwingConstants.CENTER);
		lblConstructCreatorV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblConstructCreatorV);
		
		JLabel lblhelloAndWelcome = new JLabel("<html>Hello and welcome to Scan-Tester by Gacsam<br><br>"
				+ "The current version contains 10 colours, 10 shapes and 10 functions.<br><br>"
				+ "The Scan-Tester works by randomising those attributes and creating a construct from them.<br>"
				+ "Choose one of the options and begin.</html>");
		lblhelloAndWelcome.setBounds(5, 24, 422, 200);
		lblhelloAndWelcome.setFont(new Font("Dialog", Font.PLAIN, 15));
		contentPane.add(lblhelloAndWelcome);
		
		
		String[] levels = {"1", "2", "3", "4", "5"};
		
		JLabel lblFunctions = new JLabel("Functions:");
		lblFunctions.setBounds(300, 185, 75, 25);
		contentPane.add(lblFunctions);
		
		JComboBox comboBox = new JComboBox(levels);
		comboBox.setBounds(370, 185, 50, 25);
		contentPane.add(comboBox);
		
		
		JButton btnBegin = new JButton("Functions");
		btnBegin.setBounds(230, 225, 180, 25);
		btnBegin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = comboBox.getSelectedIndex();
				FunctionsGUI newConstructCreator = new FunctionsGUI(index);
				newConstructCreator.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnBegin);
		
		JButton btnShapesAndColours = new JButton("Shapes and Colours");
		btnShapesAndColours.setBounds(20, 225, 170, 25);
		btnShapesAndColours.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ShapesColoursGUI newConstructCreator = new ShapesColoursGUI();
				newConstructCreator.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnShapesAndColours);
	}
}
