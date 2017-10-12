import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class frame extends javax.swing.JFrame {
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel labelPpg;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField textPpgCurrent;
    private javax.swing.JTextField textPpgFreq;
    private javax.swing.JTextField textPpgColour;
    private javax.swing.JLabel labelPpgCol;
    private javax.swing.JLabel labelPpgFreq;
    private javax.swing.JLabel labelPpgCurrent;
    private javax.swing.JTextField textMovFreq;
    private javax.swing.JLabel labelMov;
    private javax.swing.JLabel labelMovFreq;
    private javax.swing.JTextField textTempFreq;
    private javax.swing.JLabel labelTemp;
    private javax.swing.JLabel labelTempFreq;
    private javax.swing.JTextField textEdaFreq;
    private javax.swing.JLabel labelEda;
    private javax.swing.JLabel labelEdaFreq;
    private javax.swing.JLabel labelMonitorLocation;
    private javax.swing.JTextField textMonitorLocation;
    
    /**
     * Creates new form SimpleUI
     */
    public frame() {
        initComponents();
    }

    private void initComponents() {
    	mainPanel = new javax.swing.JPanel();
    	BtnStart = new javax.swing.JButton();
        labelPpg = new javax.swing.JLabel();
        labelPpgCurrent = new javax.swing.JLabel();
        labelPpgCol = new javax.swing.JLabel();
        labelPpgFreq = new javax.swing.JLabel();
        textPpgFreq = new javax.swing.JTextField();
        textPpgColour = new javax.swing.JTextField();
        textPpgCurrent = new javax.swing.JTextField();
        labelMov = new javax.swing.JLabel();
        labelMovFreq = new javax.swing.JLabel();
        textMovFreq = new javax.swing.JTextField();
        labelTemp = new javax.swing.JLabel();
        labelTempFreq = new javax.swing.JLabel();
        textTempFreq = new javax.swing.JTextField();
        labelEda = new javax.swing.JLabel();
        labelEdaFreq = new javax.swing.JLabel();
        textEdaFreq = new javax.swing.JTextField();
        labelMonitorLocation = new javax.swing.JLabel();
        textMonitorLocation = new javax.swing.JTextField();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        
        labelMonitorLocation.setText("monitor path: ");
        textMonitorLocation.setText("sudo /usr/bin/node /home/pi/Desktop/docking_station_EDA_Julio2017/martin_docking.js");
        labelPpg.setText("PPG");
        labelPpgFreq.setText("Frequency");
        labelPpgCurrent.setText("Current");
        labelPpgCol.setText("Colour");
        
        labelMov.setText("Movement (Accel & Gyro)");;
        labelMovFreq.setText("Frequency");
        
        labelTemp.setText("Temperature");
        labelTempFreq.setText("Frequency");
        
        labelEda.setText("Electrodermal Activity");
        labelEdaFreq.setText("Frequency");

        BtnStart.setText("Start monitoring");
        
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
					try {
						executeDocking(evt);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        
        mainPanelLayout.setHorizontalGroup(
        		mainPanelLayout.createSequentialGroup()
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelPpg)
        					.addComponent(labelMov)
        					.addComponent(labelTemp)
        					.addComponent(labelEda)
        					.addComponent(labelMonitorLocation)
        					.addComponent(BtnStart)
        					)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelPpgFreq)
        					.addComponent(labelPpgCol)
        					.addComponent(labelPpgCurrent)
        					.addComponent(labelMovFreq)
        					.addComponent(labelTempFreq)
        					.addComponent(labelEdaFreq)
        					.addComponent(textMonitorLocation))
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(textPpgFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        					.addComponent(textPpgColour, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        					.addComponent(textPpgCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        					.addComponent(textMovFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        					.addComponent(textTempFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        					.addComponent(textEdaFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        			);
        
        mainPanelLayout.setVerticalGroup(
        		mainPanelLayout.createSequentialGroup()
        		.addContainerGap(2, Short.MAX_VALUE)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelPpg)
        					.addGroup(mainPanelLayout.createSequentialGroup()
        							.addComponent(labelPpgFreq)
        							.addComponent(labelPpgCol)
        							.addComponent(labelPpgCurrent)
        							)
        					.addGroup(mainPanelLayout.createSequentialGroup()
        							.addComponent(textPpgFreq)
        							.addComponent(textPpgColour)
        							.addComponent(textPpgCurrent)
        							)
        					)
        			.addGap(2, 2, 2)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelTemp)
        					.addComponent(labelTempFreq)
        					.addComponent(textTempFreq)
        					)
        			.addGap(2, 2, 2)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelMov)
        					.addComponent(labelMovFreq)
        					.addComponent(textMovFreq)
        					)
        			.addGap(2, 2, 2)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelEda)
        					.addComponent(labelEdaFreq)
        					.addComponent(textEdaFreq)
        					)
        			.addGap(2, 2, 2)
        			.addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        					.addComponent(labelMonitorLocation)
                			.addComponent(textMonitorLocation)
        					)
        			.addGap(2, 2, 2)
        			.addComponent(BtnStart)
        			.addContainerGap(2, Short.MAX_VALUE)
        		);
        
//        mainPanelLayout.setHorizontalGroup(
//            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(mainPanelLayout.createSequentialGroup()
//                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(labelPpg)
//                    .addComponent(labelPpgCurrent)
//                    .addComponent(BtnStart))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(textPpgCurrent)
//                    .addComponent(textPpgCurrentFreq, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
//                .addGap(18, 18, 18)
////                .addComponent(BtnStart)
//                )
//        );
//        
//        mainPanelLayout.setVerticalGroup(
//            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(mainPanelLayout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(labelPpg)
//                    .addComponent(textPpgCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(labelPpgCurrent)
//                    .addComponent(textPpgCurrentFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
////                    .addComponent(BtnStart)
//                    )
//                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                        .addComponent(BtnStart))
//                .addContainerGap(15, Short.MAX_VALUE))
//        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    /**
    *   This is the method that is called when an action is performed.
    *   Over here I just simply show an error message if any of the text fields are empty or just show their names.
     * @throws IOException 
    */
    private void executeDocking(java.awt.event.ActionEvent evt) throws IOException {
String ppgFreq = textPpgFreq.getText();
		String tempFreq = textTempFreq.getText();
		String movFreq = textMovFreq.getText();
		String edaFreq = textEdaFreq.getText();
		String path = textMonitorLocation.getText();
		System.out.println("Valor de frecuencia de PPG: "+ ppgFreq);
		System.out.println("Valor de frecuencia de TEMP: "+ tempFreq);
		System.out.println("Valor de frecuencia de MOV: "+ movFreq);
		System.out.println("Valor de frecuencia de EDA: "+ edaFreq);
		String execution =	path;
		System.out.println("String de ejecution de la docking: " + execution);
		String command = path;
		Process proc = Runtime.getRuntime().exec(command);
		
//		ProcessBuilder pb = new ProcessBuilder("/usr/local/bin/node", "/Users/jorge/Documents/javascipt_workspace/docking_station_V_0.3/martin_docking.js");
//		pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
//		pb.redirectError(ProcessBuilder.Redirect.INHERIT);
//		Process p = pb.start();
    }

}