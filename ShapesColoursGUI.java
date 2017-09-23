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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.Font;
import javax.swing.plaf.basic.BasicArrowButton;

@SuppressWarnings("serial")
public class ShapesColoursGUI extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField textColour;
	private JTextField textShape;
	private Random rand = new Random();
	// Randomise once, as the 1st random is always the same
	private int randomised = (rand.nextInt(3));
	private JTextField txtLocation;
	private String location;

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
		setBounds(100, 100, 420, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel attributePanel = new JPanel();
		attributePanel.setBounds(12, 13, 384, 153);
		contentPane.add(attributePanel);
		attributePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setFont(new Font("Tahoma", Font.BOLD, 13));
		attributePanel.add(lblColour);;
		
		textColour = new JTextField();
		textColour.setEditable(false);
		textColour.setColumns(10);
		textColour.setVisible(false);
		attributePanel.add(textColour);
		
		JLabel lblShape = new JLabel("Shape");
		lblShape.setFont(new Font("Tahoma", Font.BOLD, 13));
		attributePanel.add(lblShape);
		
		JLabel lblNewLabel = new JLabel("Scan now");
		lblNewLabel.setBounds(80, 179, 131, 25);
		contentPane.add(lblNewLabel);
		
		textShape = new JTextField();
		textShape.setEditable(false);
		textShape.setColumns(10);
		textShape.setVisible(false);
		attributePanel.add(textShape);
		RandomizeItems();
		JButton btnDisplay = new JButton("Reveal");
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textColour.isVisible()){
					btnDisplay.setText("Reveal");
					lblNewLabel.setText("Scan now");
					txtLocation.setText("Location");
					textColour.setVisible(false);
					textShape.setVisible(false);
				DissipateConstructs();
				RandomizeItems();
				}
				else{
					btnDisplay.setText("Hide");
					lblNewLabel.setText("Test results");
					txtLocation.setText(location);
					textColour.setVisible(true);
					textShape.setVisible(true);
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
		
		txtLocation = new JTextField();
		txtLocation.setText("Location");
		txtLocation.setColumns(10);
		txtLocation.setBounds(305, 180, 91, 22);
		contentPane.add(txtLocation);
		
	}
	
	private void RandomizeItems(){
		String[] colours = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "White", "Gold"};
		String[] shapes = {"Rectangular Prism", "Sphere", "Cone", "Cylinder", "Torus/donut", "Diamond", "Square Pyramid", "Triangular Pyramid", "Hexagonal Prism", "Triangular Prism"};
		ArrayList<String> locations = new ArrayList<String>(Arrays.asList("Above", "Front", "Left", "Right", "Behind"));
		StringBuilder result = new StringBuilder();
		
		// Randomise the colour
		if(rand.nextInt(100) < 97) {
		randomised = (rand.nextInt(colours.length));
		textColour.setText(colours[randomised]);
		result.append(colours[randomised]);
		}
		else textShape.setText("EMPTY");
		
		if(rand.nextInt(100) < 97) {
		// Randomise the shape
		randomised = (rand.nextInt(shapes.length));
		textShape.setText(shapes[randomised]);
		result.append(shapes[randomised]);
		}
		else textShape.setText("EMPTY");
		location = locations.get(rand.nextInt(locations.size()));
		result.append(location);
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
