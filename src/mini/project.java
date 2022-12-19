package mini;
import java.util.*;
import javax.swing.JOptionPane;

public class project {

	static Scanner JObject = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int rating;
		String user = "";
		String pass = "";
		String username ="";
		String password ="";
		String usernames ="";
		String passwords ="";
		String[] rate = {"Dissatisfied","Satisfied","Very Satisfied"};
		
		JOptionPane.showMessageDialog(null, "Welcome🙂","FACEBOOK", JOptionPane.PLAIN_MESSAGE);
		int chosenmenu = JOptionPane.showConfirmDialog(null, "Do you have account?","FACEBOOK", JOptionPane.YES_NO_OPTION);
		
		
		if (chosenmenu == 0 ) {
			JOptionPane.showMessageDialog(null, "Click ok to log in");
			username  = JOptionPane.showInputDialog("Username ");
			password  = JOptionPane.showInputDialog("Password");
			JOptionPane.showMessageDialog(null, "unregistered account❗❗",null, JOptionPane.WARNING_MESSAGE);
			int chosen =JOptionPane.showConfirmDialog(null, "Would you like to create account?",null,JOptionPane.YES_NO_OPTION);
			
			
			if (chosen == 1 ) {
				
				JOptionPane.showMessageDialog(null, "have a great day","FACEBOOK",JOptionPane.WARNING_MESSAGE);
				rating = JOptionPane.showOptionDialog(null, "RATE MY WORK", null, JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, rate, 0);
				
				switch (rating) {
				case 0 :JOptionPane.showMessageDialog(null, "0_c",null, JOptionPane.PLAIN_MESSAGE);
					break;
				case 1 :JOptionPane.showMessageDialog(null, "tnx 😳",null, JOptionPane.PLAIN_MESSAGE);
					break;
				case 2 :JOptionPane.showMessageDialog(null, "thank you 3_3",null, JOptionPane.PLAIN_MESSAGE);
					break;
				}
			}
			
			else if (chosenmenu == 0) 
				{
				JOptionPane.showMessageDialog(null, "create an account","FACEBOOK", JOptionPane.WARNING_MESSAGE);
				
				while (usernames.isBlank()) {
					usernames  = JOptionPane.showInputDialog("Create username ");
					}

				while (passwords.isBlank()) {
					passwords  = JOptionPane.showInputDialog("Create password");
					}
				
				JOptionPane.showMessageDialog(null, "Account succesfully created ");
				JOptionPane.showMessageDialog(null, "Continue Log in ");
				
				for (int i = 0; i < 3; i++) {
					user = JOptionPane.showInputDialog("Enter username");
					pass = JOptionPane.showInputDialog("Enter password");
						
					if (user.equals(usernames) && pass.equals(passwords)) {
						JOptionPane.showMessageDialog(null, "Log in succesful", "FACEBOOK", JOptionPane.INFORMATION_MESSAGE);
						break;
					}
					else {
						JOptionPane.showMessageDialog(null, "Username or Password Incorrect❗❗", "FACEBOOK", JOptionPane.WARNING_MESSAGE);
						
					}
					
					if (i == 1) {
						JOptionPane.showMessageDialog(null, "1 Attempt left❗❗", "FACEBOOK", JOptionPane.WARNING_MESSAGE);
						
					}
					if (i >= 2) {
						JOptionPane.showMessageDialog(null, "0 Attempt❗❗", "FACEBOOK", JOptionPane.ERROR_MESSAGE);
						JOptionPane.showMessageDialog(null, "Try again later", "FACEBOOK", JOptionPane.ERROR_MESSAGE);
						
						rating = JOptionPane.showOptionDialog(null, "RATE MY WORK", null, JOptionPane.YES_NO_OPTION,
								JOptionPane.INFORMATION_MESSAGE, null, rate, 0);
						
						switch (rating) {
						case 0 :JOptionPane.showMessageDialog(null, "0_c",null, JOptionPane.PLAIN_MESSAGE);
							break;
						case 1 :JOptionPane.showMessageDialog(null, "tnx 😳",null, JOptionPane.PLAIN_MESSAGE);
							break;
						case 2 :JOptionPane.showMessageDialog(null, "thank you 3_3",null, JOptionPane.PLAIN_MESSAGE);
							break;
						}
						System.exit(0);
						
					}
						}
					}
						}
		
		else if (chosenmenu == 1) 
			
				{
			JOptionPane.showMessageDialog(null, "create an account" );
			
			while(username.isBlank()) {
				username  = JOptionPane.showInputDialog("Create username ");
				}

			while (password.isBlank()) {
				password  = JOptionPane.showInputDialog("Create password");
				}
			
			JOptionPane.showMessageDialog(null, "Account succesfully created ");
			JOptionPane.showMessageDialog(null, "Continue Log in ");
			
			for (int i = 0; i < 3; i++) {
				user = JOptionPane.showInputDialog("Enter username");
				pass = JOptionPane.showInputDialog("Enter password");
					
				if (user.equals(username) && pass.equals(password)) {
					JOptionPane.showMessageDialog(null, "Log in succesful","FACEBOOK", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				else {
					JOptionPane.showMessageDialog(null, "Username or Password Incorrect❗❗", "FACEBOOK", JOptionPane.WARNING_MESSAGE);
					
				}
				
				if (i == 1) {
					JOptionPane.showMessageDialog(null, "1 Attempt left❗❗", "FACEBOOK", JOptionPane.WARNING_MESSAGE);
					
				}
				if (i >= 2) {
					JOptionPane.showMessageDialog(null, "0 Attempt❗❗", "FACEBOOK", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Try again later", "FACEBOOK", JOptionPane.ERROR_MESSAGE);
					
					rating = JOptionPane.showOptionDialog(null, "RATE MY WORK", null, JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE, null, rate, 0);
					
					switch (rating) {
					case 0 :JOptionPane.showMessageDialog(null, "0_c",null, JOptionPane.PLAIN_MESSAGE);
						break;
					case 1 :JOptionPane.showMessageDialog(null, "tnx 😳",null, JOptionPane.PLAIN_MESSAGE);
						break;
					case 2 :JOptionPane.showMessageDialog(null, "thank you 3_3",null, JOptionPane.PLAIN_MESSAGE);
						break;
					}
					System.exit(0);
				}	
					}
						}
			
					}
			
				}