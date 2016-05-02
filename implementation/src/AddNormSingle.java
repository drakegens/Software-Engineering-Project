import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;;


public class AddNormSingle extends JFrame{
	
	private JTextField addressInput;
	private JButton normalizeButton;
	
	public AddNormSingle(){
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Address: "));
		addressInput = new JTextField("Please enter address here");
		addressInput.setEditable(true);
		cp.add(addressInput);
		normalizeButton = new JButton("Normalize");
		cp.add(normalizeButton);
		normalizeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Address address = AddNormBatch.parse(addressInput.getText());
				PersonalAddress personalAddress = new PersonalAddress(address.getZip4(), 
						address.getZip5(), address.getStateCode(), address.getCity(), address.getLine1());
				if(personalAddress.normalize()){
					addressInput.setText(personalAddress.getLine1() + personalAddress.getLine2());
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Normalizer");
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new AddNormSingle();
				
			}
		});
		
	}

}
