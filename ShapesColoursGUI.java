import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Font;
import javax.swing.plaf.basic.BasicArrowButton;

@SuppressWarnings("serial")
public class ShapesColoursGUI extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Random rand = new Random();
	// Randomise once, as the 1st random is always the same
	private int randomised = (rand.nextInt(3));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapesColoursGUI frame = new ShapesColoursGUI();
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
	public ShapesColoursGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 384, 153);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblAttribute = new JLabel("Colour");
		lblAttribute.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblAttribute);;
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setVisible(false);
		panel.add(textField);
		
		JLabel lblAttribute_1 = new JLabel("Shape");
		lblAttribute_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblAttribute_1);
		
		JLabel lblNewLabel = new JLabel("Scan now");
		lblNewLabel.setBounds(80, 179, 131, 25);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		panel.add(textField_1);
		RandomizeItems();
		JButton btnDisplay = new JButton("Reveal");
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.isVisible()){
					btnDisplay.setText("Reveal");
					lblNewLabel.setText("Scan now");
					textField.setVisible(false);
					textField_1.setVisible(false);
				DissipateConstructs();
				RandomizeItems();
				}
				else{
					btnDisplay.setText("Hide");
					lblNewLabel.setText("Test results");
					textField.setVisible(true);
					textField_1.setVisible(true);
				}
			}
		});
		btnDisplay.setBounds(170, 179, 97, 25);
		contentPane.add(btnDisplay);
		
		BasicArrowButton basicArrowButton = new BasicArrowButton(7);
		basicArrowButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConstructInstructionGUI newMainMenu = new ConstructInstructionGUI();
				newMainMenu.setVisible(true);
				dispose();
			}
		});
		basicArrowButton.setBounds(15, 185, 30, 30);
		contentPane.add(basicArrowButton);
		
	}
	
	private void RandomizeItems(){
		String[] colours = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "White", "Gold"};
		String[] shapes = {"Rectangular Prism", "Sphere", "Cone", "Cylinder", "Torus/donut", "Diamond", "Square Pyramid", "Triangular Pyramid", "Hexagonal Prism", "Triangular Prism"};
		StringBuilder result = new StringBuilder();
		
		// Randomise the colour
		if(rand.nextInt(100) < 97) {
		randomised = (rand.nextInt(colours.length));
		textField.setText(colours[randomised]);
		result.append(colours[randomised]);
		}
		else textField_1.setText("EMPTY");
		
		if(rand.nextInt(100) < 97) {
		// Randomise the shape
		randomised = (rand.nextInt(shapes.length));
		textField_1.setText(shapes[randomised]);
		result.append(shapes[randomised]);
		}
		else textField_1.setText("EMPTY");
		
		ForgeTheConstruct(result.toString());
	}
	
	private void ForgeTheConstruct(String result){
		/*
		 * HELIO'S FORGE SIGIL
			                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
               @@@@                                                                                 
              @@``@@                                                                                
             @@    @@                                                                               
             @`    `@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                
             @`    `@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                
             @@    @@                                                              @                
              @@``@@                                                               @                
               @@@@                                                                @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                                                                                   @                
                 @                                                                 @                
                 @                                                                 @                
                 @                                                                 @                
                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                
                 @                                                                                  
                 @                                                                                  
                 @                                                                                  
                 @                                                                                  
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    
                                                                                                    

		 */
	}
	
	private void DissipateConstructs(){
        /*
        
        
        
        
        
        
        
        
        
        
        
        
        
'+            
,                                 ',+             
',                               ',,+              
,,                               ,,,                            ',,,+               
,,                              ',,,                          ',,,,+                
,,                              ,,',,                       ',,,,,+                 
,,                             ',, ,,                     ',,,:,,+                  
,,                             ,,  ',,                  ',,,: ,,+                   
,,                            ',,   ,,                ',,,:  ,,+                    
,,                            ,,    ',,             ',,,:   ,,+                     
,,                           ',,     ,,           ',,,:    ,,+                      
,,                           ,,      ',,        ',,,:     ,,+                       
,,                          ',,       ,,      ',,,:      ,,+                        
,,                          ,,        ',,   ',,,:       ,,+                         
,,                         ',,         ,, ',,,:        ,,+                          
,,                         ,,          ',,,,:         ,,+                           
,,                        ',,         ',,,:          ,,+                            
,,                        ,,        ',,,:,,         ,,+                             
,,                       ',,      ',,,:  ,,        ,,+                              
,,                       ,,     ',,,:    ',,      ,,+                               
,,                      ',,   ',,,:       ,,     ,,+                                
,,                      ,,  ',,,:         ',,   ,,+                                 
,,                     ',,',,,:            ,,  ,,+                                  
,,                     ,,,,,:              ',,,,+                                   
,,                    ',,,:                 ,,,+                                    
,,                  ',,,:                   ,,,                                     
,,                ',,,,,                   ,,,,                                     
,,              ',,,:,,                   ,,+',,                                    
,,            ',,,: ',,                  ,,+  ,,                                    
,,          ',,,:   ,,                  ,,+   ',,                                   
,,        ',,,:    ',,                 ,,+     ,,                                   
,,      ',,,:      ,,                 ,,+      ',,                                  
,,    ',,,:       ',,                ,,+        ,,                                  
,,  ',,,:         ,,            ;   ,,+         ',,                                 
,,,,,,,:          ',,           ;,, ,,+           ,,                                 
;,,,,,:            ,,             ,,,,+            ',,                                
,,,,,,            ',,              ,,,              ,,                                
',,,,,,'          ,,                ,,,             ',,                               
;,,;,,,,'       ',,                 ,,              ,,                               
,,   ,,,,'     ,,                                  ',,                              
,,     ,,,,'  ',,                                   ,,                              
,,       ,,,,',,                                    ',,                             
,,         ,,,,,                                     ,,                             
,,           ,,,,'                                   ',,                            
,,          ',,,,,,'                                  ,,                            
,,          ,,   ,,,,'                                ',,                           
,,         ',,     ,,,,'                               ,,                           
,,         ,,        ,,,,'                             ',,                          
,,        ',,          ,,,,'                            ,,                          
,,        ,,             ,,,,'                          ',,                         
,,       ',,               ,,,,'                         ,,                         
,,       ,,                  ,,,,'                       ',,                        
,,      ',,                    :,,,'                      ,,                        
,,      ,,                       :,,,'                    ',,                       
,,     ',,                         :,,,'                   ,,                       
,,     ,,                            :,,,'                 ',,                      
,,    ',,                              :,,,'                ,,                      
,,    ,,                                 :,,,'              ',,                     
,,   ',,                                   :,,,'             ,,                     
,,   ,,                                      :,,,'           ',,                    
,,  ',,                                        :,,,'          ,,                    
,,  ,,                                           :,,,'        ',,                   
,, ',,                                             :,,,'       ,,                   
,, ,,                                                :,,,'     ',,                  
,,',,                                                  :,,,'    ,,                  
,,,,                                                     :,,,'  ',,                 
,,,,                                                       :,,,' ,,                 
,,,                                                          :,,,',,                
,,,                                                            :,,,,                
,,                                                               :,,,               
,,                                                                 :,               
,                                                                    '              
,                                                                                   
        
        
        
        
        
        
        
        
        
        
        
        
        
*/
	}
	}
