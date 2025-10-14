public class JavaCaseProblem_KarlaCatherineJuguilon {

     public static void main(String[] args) {
        // Personal Information
        String name = "Karla Catherine L. Juguilon"; 
        String idNumber = "2024303917";

       
        int score = 85; 
        String grade;

        if (score >= 90) {
            grade = "With High Honors";
        } else if (score >= 80) {
            grade = "With High Honors";
        } else if (score >= 70) {
            grade = "With Honors";
        } else if (score >= 60) {
            grade = "Completer";
        } else {
            grade = "FAILED";
        }

        
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("-------------------------");
        System.out.println("Result: Your score is " + score + " and your grade is " + grade);
    }
}

