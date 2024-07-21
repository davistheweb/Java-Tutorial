import javax.swing.JOptionPane;
public final class AdmissionStatus {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Jamb Admission status check", "For Jamb", JOptionPane.INFORMATION_MESSAGE );

        final String StudentCourse = JOptionPane.showInputDialog(null, "Enter Student Course", "Jamb", JOptionPane.QUESTION_MESSAGE);
        switch (StudentCourse){
            case "Computer Science":
                JOptionPane.showMessageDialog(null, "Computer Science cut off mark is 200", "Admission Status", JOptionPane.INFORMATION_MESSAGE);
                    break;

            case "Medicine and Surgery":
                JOptionPane.showMessageDialog(null, "Medicine and Surgery cut off mark is 300", "Admission Status", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Law":
                JOptionPane.showMessageDialog(null, "law cut off mark is 250", "Admission Status", JOptionPane.INFORMATION_MESSAGE);
				break;
            default:
                JOptionPane.showMessageDialog(null, "Error, Course is not in the list of student courses", "Admission Status", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }
}
