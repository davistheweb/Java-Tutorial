/*
Project1:
Implement your Control Structure knowledge in designing a GP calculator.
Free Style
High scoring points:
Number of semesters
Number of years*/
/*
// This Project was written by @Josiah Davis Chimzuruoke (@davistheweb) on 10/07/2024 ---------- To make use of this project, Get a licence key/ Allowance from https://github.com/davisthweb // */
// Remove package when running file !

import javax.swing.JOptionPane;
public final class GradePointCalculatorForStudent_S {
    public static void main(String[] args) {
        final String Welcome_Message = "Welcome, ..... Loading GPA Calculator";
        JOptionPane.showMessageDialog(null, Welcome_Message, "GPA", JOptionPane.INFORMATION_MESSAGE);
        final String YearNumbers = JOptionPane.showInputDialog(null, "Enter the number of years", "Number of years input", JOptionPane.QUESTION_MESSAGE);
        final int numYears =Integer.parseInt(YearNumbers);
        final String Num_SemPerYear = JOptionPane.showInputDialog(null, "Enter the number of semesters per year", "Semester Per Year", JOptionPane.QUESTION_MESSAGE);
        final int numOfSemestersPerYearly = Integer.parseInt(Num_SemPerYear);

        double StudentTotalPoints = 0;
        int StudentTotalCredits = 0;
        for (int year = 1; year <= numYears; year++) {
            for (int NumOfSemester = 1; NumOfSemester <= numOfSemestersPerYearly; NumOfSemester++) {
                JOptionPane.showMessageDialog(null,"For Year" + year + ", & Semester " + NumOfSemester +".", "GPA", JOptionPane.INFORMATION_MESSAGE);
                String CoursesNumber = JOptionPane.showInputDialog(null,"Enter the number of courses", "Courses", JOptionPane.QUESTION_MESSAGE);
                final int numCourses = Integer.parseInt(CoursesNumber);

                double StudentSemesterPoints = 0;
                int StudentSemesterCredits = 0;

                for (int studentCourse = 1; studentCourse <= numCourses; studentCourse++) {
                   final String GradeForStudentCourses = JOptionPane.showInputDialog(null,"Enter grade for course " + studentCourse + ": ", "coursers num", JOptionPane.QUESTION_MESSAGE);

                   final double studentGrade = Double.parseDouble(GradeForStudentCourses);
                   final String CreditUnitForStudentCourse = JOptionPane.showInputDialog(null,"Enter credit units for course " + studentCourse + ": ","Credit unit", JOptionPane.QUESTION_MESSAGE);

                   final int StudentCredits = Integer.parseInt(CreditUnitForStudentCourse);

                    StudentSemesterPoints += studentGrade * StudentCredits;
                    StudentSemesterCredits += StudentCredits;
                }

                final double semesterGPA = StudentSemesterPoints / StudentSemesterCredits;
                JOptionPane.showMessageDialog(null,"GPA for Year " + year + ", Semester " + NumOfSemester + ": " + semesterGPA, "GPA", JOptionPane.INFORMATION_MESSAGE);

                StudentTotalPoints += StudentSemesterPoints;
                StudentTotalCredits += StudentSemesterCredits;
            }
        }

        final double cumulativeGPA = StudentTotalPoints / StudentTotalCredits;
        final double finalCumulativeGPA = Math.round(cumulativeGPA);
        //String FinalGPA = String.valueOf(cumulativeGPA);
          /*switch (FinalGPA){
            case "4.0":
                JOptionPane.showMessageDialog(null," GPA: " + cumulativeGPA + "=", "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }*/
       if(finalCumulativeGPA == 4.0){
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"A and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA < 4.0 && finalCumulativeGPA >3.3 ) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"A- and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA > 3.0 && finalCumulativeGPA <=3.3) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"B+ and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA == 3.0) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"B and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA < 3.0 && finalCumulativeGPA>= 2.0) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"B- and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA > 2.0 && finalCumulativeGPA <= 2.3) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"C+ and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       } else if (finalCumulativeGPA == 2.0) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"C and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       }else if (finalCumulativeGPA > 1.3 && finalCumulativeGPA <= 1.7) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"C- and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       }else if (finalCumulativeGPA > 1.0 && finalCumulativeGPA<= 1.3) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"D+ and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       }else if (finalCumulativeGPA == 1.0) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"D and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       }else if (finalCumulativeGPA < 1.0) {
           JOptionPane.showMessageDialog(null," GPA Letter grade is : " +"F and GPA point is " + finalCumulativeGPA, "***___*** Program/Calculation Done!", JOptionPane.INFORMATION_MESSAGE);
       }


    }
}
