import javax.swing.JOptionPane;
public class testL{
	public static void main(String[] args){
		
		int[] numbers = {1,2,3,4,5,6,7};
	
		for(int number : numbers){
			JOptionPane.showMessageDialog(null, number + " J", "j", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
			
	}
}