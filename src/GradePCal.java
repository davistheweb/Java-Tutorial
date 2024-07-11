package src;
import javax.swing.JOptionPane;
public class GradePCal {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"GP Calculator", "GPA", JOptionPane.INFORMATION_MESSAGE);
        String YearNumbers = JOptionPane.showInputDialog(null, "Enter the number of years", "Number of years input", JOptionPane.QUESTION_MESSAGE);
        int numYears =Integer.parseInt(YearNumbers);
        String Num_SemPerYear = JOptionPane.showInputDialog(null, "Enter the number of semesters per year", "Semester Per Year", JOptionPane.QUESTION_MESSAGE);
        int numSemestersPerYear = Integer.parseInt(Num_SemPerYear);

        double totalPoints = 0;
        int totalCredits = 0;

        for (int year = 1; year <= numYears; year++) {
            for (int semester = 1; semester <= numSemestersPerYear; semester++) {
                JOptionPane.showMessageDialog(null,"Year" + year + ", Semester " + semester, "", JOptionPane.INFORMATION_MESSAGE);
                String CoursesNumber = JOptionPane.showInputDialog(null,"Enter the number of courses", "Courses", JOptionPane.QUESTION_MESSAGE);
                int numCourses = Integer.parseInt(CoursesNumber);

                double semesterPoints = 0;
                int semesterCredits = 0;

                for (int course = 1; course <= numCourses; course++) {
                    String GFrCourses = JOptionPane.showInputDialog(null,"Enter grade for course " + course + ": ", "coursers num", JOptionPane.QUESTION_MESSAGE);

                    double grade = Double.parseDouble(GFrCourses);
                    String CrUnitFrC = JOptionPane.showInputDialog(null,"Enter credit units for course " + course + ": ","Credit unit", JOptionPane.QUESTION_MESSAGE);

                    int credits = Integer.parseInt(CrUnitFrC);

                    semesterPoints += grade * credits;
                    semesterCredits += credits;
                }

                double semesterGPA = semesterPoints / semesterCredits;
                JOptionPane.showMessageDialog(null,"GPA for Year " + year + ", Semester " + semester + ": " + semesterGPA, "GPA", JOptionPane.INFORMATION_MESSAGE);

                totalPoints += semesterPoints;
                totalCredits += semesterCredits;
            }
        }

        double cumulativeGPA = totalPoints / totalCredits;
        JOptionPane.showMessageDialog(null," GPA: " + cumulativeGPA, "C", JOptionPane.INFORMATION_MESSAGE);
    }
}
