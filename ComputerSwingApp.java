package computer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

class ComputerSwingApp extends javax.swing.JFrame
{
	

	ArrayList<computer>List;
	
	public ComputerSwingApp() 
	{ 
	initComponents(); 
	 List = new ArrayList<computer>(); 
	} 
	@SuppressWarnings("unchecked")
	 private void initComponents()
	{ 
	jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
	jLabel3 = new javax.swing.JLabel();
	jTextField1 = new javax.swing.JTextField();
	jTextField2 = new javax.swing.JTextField();
	jButton1 = new javax.swing.JButton(); 
	jButton2 = new javax.swing.JButton();
	jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    
   

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setText("Computer Lab");

jLabel2.setText("IP Address");

jLabel3.setText("Value");

jButton1.setText("+"); 

jButton1.addActionListener(new java.awt.event.ActionListener() 
{
	public void actionPerformed(java.awt.event.ActionEvent evt) 
	{
		jButton1ActionPerformed(evt); 
		}
	});
        jButton2.setText("Show Computers");
        
		jButton2.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton2ActionPerformed(evt); 
					}
			});
		jButton3.setText("Clear"); 
		jButton3.addActionListener(new java.awt.event.ActionListener() 
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton3ActionPerformed(evt); 
				}
			});
		jButton4.setText("Exit App");
		jButton4.addActionListener(new java.awt.event.ActionListener() 
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				
				jButton4ActionPerformed(evt);} 
				
		});
	
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
		.addGroup(layout.createSequentialGroup() 
		.addContainerGap() 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
		.addGroup(layout.createSequentialGroup() 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		
		.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, 
				
		javax.swing.GroupLayout.PREFERRED_SIZE)) 
		.addGroup(layout.createSequentialGroup() 
		.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
		javax.swing.GroupLayout.PREFERRED_SIZE) 
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 
		.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
				
		javax.swing.GroupLayout.PREFERRED_SIZE))) .addContainerGap(50, Short.MAX_VALUE))
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		.addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, 
		javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		Short.MAX_VALUE) 
		.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
		.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE) 
		.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGap(34, 34, 34))
		);
		layout.setVerticalGroup( 
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup() 
		.addContainerGap() 
		.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
		javax.swing.GroupLayout.PREFERRED_SIZE) 
		.addGap(20, 20, 20)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
		.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
		javax.swing.GroupLayout.PREFERRED_SIZE) 
		.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
		javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGap(20, 20, 20)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE) 
		.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGap(20, 20, 20) 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE) 
		.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
		.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE) 
		.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
	    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	
	);
		
		
		pack();
		}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	String ip=jTextField1.getText();
    String s=jTextField2.getText();
    
   if(ip.isEmpty() && s.isEmpty()) 
	JOptionPane.showMessageDialog(this, "Please enter all details!","Computer",
	JOptionPane.ERROR_MESSAGE);
   else {
	   float value = Float.parseFloat(s);
	   computer c= new computer(ip,value);
	   List.add(c);
	   JOptionPane.showMessageDialog(this,"Computer Inserted");
	   jTextField1.setText(""); 
	   jTextField2.setText("");
	   }
   } 
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		 String s="";
		 for(computer c:this.List) {
			 
			 s+=c.toString();
		 } 
		 JOptionPane.showMessageDialog(this,s);
		 }
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
		jTextField1.setText("");
		jTextField2.setText(""); 
		}
	
	 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		 try {
			wait(0);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		 } 
	 public static void main(String args[]) {
		
		 try { 
			 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { 
				 if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName());
				 break;
				 } 
				 } 
			 } 
		  catch (ClassNotFoundException ex)
		 { java.util.logging.Logger.getLogger(ComputerSwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		 } catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(ComputerSwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) { 
		java.util.logging.Logger.getLogger(ComputerSwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) { 
		java.util.logging.Logger.getLogger(ComputerSwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} 
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			new ComputerSwingApp().setVisible(true);
       } 
		
		
       });
		} 
	 private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2; 
     private javax.swing.JLabel jLabel3; 
     private javax.swing.JTextField jTextField1;
     private javax.swing.JTextField jTextField2;
     // End of variables declaration 
    
}