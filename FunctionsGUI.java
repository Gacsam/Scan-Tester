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
		
		JLabel lblNewLabel = new JLabel("Scan now");
		lblNewLabel.setBounds(80, 135, 131, 25);
		contentPane.add(lblNewLabel);
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setVisible(false);
		RandomizeItems();
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list.isVisible()){
					btnDisplay.setText("Display");
					lblNewLabel.setText("Scan now");
					list.setVisible(false);
				DissipateConstructs();
				RandomizeItems();
				}
				else{
					btnDisplay.setText("Hide");
					lblNewLabel.setText("Test results");
					list.setVisible(true);
				}
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 384, 117);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFunctions = new JLabel("Function(s)");
		lblFunctions.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunctions.setBounds(12, 5, 360, 16);
		panel_1.add(lblFunctions);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 24, 345, 93);
		panel_1.add(scrollPane);
		
		scrollPane.setViewportView(list);
		btnDisplay.setBounds(170, 135, 97, 25);
		contentPane.add(btnDisplay);
		
		BasicArrowButton basicArrowButton = new BasicArrowButton(7);
		basicArrowButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ConstructInstructionGUI newMainMenu = new ConstructInstructionGUI();
				newMainMenu.setVisible(true);
				dispose();
			}
		});
		basicArrowButton.setBounds(15, 135, 30, 30);
		contentPane.add(basicArrowButton);
		
	}
	
	private void RandomizeItems(){
		ArrayList<String> functions = new ArrayList<String>(Arrays.asList
				("Generate energy", "Bounce energy back", "Pulse with energy", "Absorb energy", "Store energy", "Deflect energy",
						"Scan for malicious intent", "Compress energy", "Clean energy", "Play Rick Astley's Never Gonna Give You Up through telepathy"));
		StringBuilder result = new StringBuilder();

		// Randomise the functions
		model.clear();
		for(int i=0; i < functionAmount; i++) {
			if(rand.nextInt(100) < 95) {
			randomised = (rand.nextInt(functions.size()));
			outerloop:
			if(functions.get(randomised).contains("Rick Astley")) {
				// Lower chances by 10 times
					if(rand.nextInt(100) == 0)
						model.addElement("SECRET");
					else {
						randomised = (rand.nextInt(functions.size()-1));
						model.addElement(functions.get(randomised));
						break outerloop;
				}
			}else model.addElement(functions.get(randomised));
			result.append(functions.get(randomised));
			functions.remove(randomised);
		}else model.addElement("EMPTY");
		}
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
