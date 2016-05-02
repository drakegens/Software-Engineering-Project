import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import edu.truman.cs370t1.addNorm.Address;
import edu.truman.cs370t1.addNorm.PersonalAddress;;


public class AddNormSingle extends JFrame{
	
	private JTextField street;
	private JTextField city;
	private JTextField state;
	private JTextField zip4;
	private JTextField zip5;
	private JTextField result;
	private JButton normalizeButton;
	private JPanel jContentPane;
	
	public AddNormSingle(){
		
		jContentPane = new JPanel();
		
		jContentPane.setLayout(new BoxLayout(jContentPane, BoxLayout.Y_AXIS));
		
		jContentPane.add(new JLabel("Street: "));
		street = new JTextField();
		street.setEditable(true);
		jContentPane.add(street);
		
		jContentPane.add(new JLabel("City: "));
		city = new JTextField();
		city.setEditable(true);
		jContentPane.add(city);
		
		jContentPane.add(new JLabel("State: "));
		state = new JTextField();
		state.setEditable(true);
		jContentPane.add(state);

		
		jContentPane.add(new JLabel("Zip5: "));
		zip5 = new JTextField();
		zip5.setEditable(true);
		jContentPane.add(zip5);		
		
		jContentPane.add(new JLabel("Zip4: "));
		zip4 = new JTextField();
		zip4.setEditable(true);
		jContentPane.add(zip4);

		
		jContentPane.add(new JLabel("Result: "));
		result = new JTextField();
		result.setEditable(true);
		jContentPane.add(result);
		
		normalizeButton = new JButton("Normalize");
		jContentPane.add(normalizeButton);
		normalizeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!street.getText().equals("") && !city.getText().equals("") 
						&& !zip4.getText().equals("") && !state.getText().equals("")){
					PersonalAddress personalAddress = new PersonalAddress(zip4.getText(), 
							zip5.getText(), state.getText(), city.getText(), street.getText());
					if(personalAddress.normalize()){
						result.setText(personalAddress.getLine1() + personalAddress.getLine2());
					}
					else{
						result.setText(personalAddress.getError());
					}
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setTitle("Address Normalizer");
		setVisible(true);
		setContentPane(jContentPane);
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
