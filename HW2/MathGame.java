

public class MathGame {

    public static void main(String[] args) {

        System.out.println("HW2: Begin!");

        //Menu Coding
        

        //Pythagorean Theorem Object
        {
            String trianglePythagorean = Triangle.Pythagorean();
            System.out.println(trianglePythagorean);
        }
        //Grading Object
        {
            String gradingGrades = Grading.Grades();
            System.out.println(gradingGrades);
        }

    }
    
}
