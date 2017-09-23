import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FunctionsGUI extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private int functionAmount = 1;
	DefaultListModel<String> model = new DefaultListModel<>();
	JList list = new JList<>(model);
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
					FunctionsGUI frame = new FunctionsGUI(2);
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
	public FunctionsGUI(int function) {
		functionAmount += function;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblScanCompare = new JLabel("Scan now");
		lblScanCompare.setBounds(80, 135, 131, 25);
		contentPane.add(lblScanCompare);
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setVisible(false);
		RandomizeItems();
		JButton btnDisplay = new JButton("Reveal");
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list.isVisible()){
					btnDisplay.setText("Reveal");
					lblScanCompare.setText("Scan now");
					txtLocation.setText("Location");
					list.setVisible(false);
				DissipateConstructs();
				RandomizeItems();
				}
				else{
					btnDisplay.setText("Hide");
					lblScanCompare.setText("Compare results");
					txtLocation.setText(location);
					list.setVisible(true);
				}
			}
		});
		
		JPanel functionPanel = new JPanel();
		functionPanel.setBounds(5, 5, 384, 117);
		contentPane.add(functionPanel);
		functionPanel.setLayout(null);
		
		JLabel lblFunctions = new JLabel("Function(s)");
		lblFunctions.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunctions.setBounds(12, 5, 360, 16);
		functionPanel.add(lblFunctions);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 24, 345, 93);
		functionPanel.add(scrollPane);
		
		scrollPane.setViewportView(list);
		btnDisplay.setBounds(150, 135, 97, 25);
		contentPane.add(btnDisplay);
		
		BasicArrowButton btnArrowBack = new BasicArrowButton(7);
		btnArrowBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ConstructInstructionGUI newMainMenu = new ConstructInstructionGUI();
				newMainMenu.setVisible(true);
				dispose();
			}
		});
		btnArrowBack.setBounds(15, 135, 30, 30);
		contentPane.add(btnArrowBack);
		
		txtLocation = new JTextField();
		txtLocation.setText("Location");
		txtLocation.setBounds(279, 138, 91, 22);
		contentPane.add(txtLocation);
		txtLocation.setColumns(10);
		
	}
	
	private void RandomizeItems(){
		ArrayList<String> functions = new ArrayList<String>(Arrays.asList
				("Generate energy", "Bounce energy back", "Pulse with energy", "Absorb energy", "Store energy", "Deflect energy",
						"Scan for malicious intent", "Compress energy", "Clean energy", "Cloak", "Mimic energy", "Randomly convert energy", "Transfer mild poison over link, administer antidote after 30 seconds"));
		ArrayList<String> locations = new ArrayList<String>(Arrays.asList("Above", "Front", "Left", "Right", "Behind"));
		System.out.println(functions.size());
		StringBuilder result = new StringBuilder();

		// Randomise the functions
		model.clear();
		for(int i=0; i < functionAmount; i++) {
			if(rand.nextInt(100) < 95) {
			randomised = (rand.nextInt(functions.size()));
			model.addElement(functions.get(randomised));
			result.append(functions.get(randomised));
			functions.remove(randomised);
		}else model.addElement("EMPTY");
		}
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
