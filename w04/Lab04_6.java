// Thadchanon Maidee 670510662
import java.util.ArrayList;
import java.util.Scanner;

public class Lab04_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Students students = new Students();

        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <  numStudents; i++) {
            String studentId = scanner.next(); 
            int midtermScore = scanner.nextInt(); 
            int finalScore = scanner.nextInt();
            scanner.nextLine();

            students.addStudent(new University(studentId, midtermScore, finalScore));
        }

        double averageScore = students.calculateAverageScore();

        String searchYear = scanner.next();
        String searchFaculty = scanner.next();

        students.filterAndDisplay(searchYear, searchFaculty, averageScore);
    }
}

class Students {
    private ArrayList<University> studentList;

    public Students() {
        studentList = new ArrayList<>();
    }

    public void addStudent(University student) {
        studentList.add(student);
    }

    public double calculateAverageScore() {
        double totalScore = 0;
        for (University student : studentList) {
            totalScore += student.getMidtermScore() + student.getFinalScore();
        }
        return totalScore / studentList.size();
    }

    public void filterAndDisplay(String year, String faculty, double averageScore) {
        int matchingCount = 0;
        int aboveAverageCount = 0;

        for (University student : studentList) {
            if (student.matchesYear(year) && student.matchesFaculty(faculty)) {
                student.calculateTotalScore();
                student.display();

                if (student.getTotalScore() > averageScore) {
                    aboveAverageCount++;
                }
                matchingCount++;
            }
        }

        if (matchingCount > 0) {
            System.out.printf("%d\n%d\n", matchingCount, aboveAverageCount);
        } else {
            System.out.println("None");
        }
    }
}

class University {
    private final String studentId;
    private final int midtermScore; 
    private final int finalScore; 
    private int totalScore; 

    public University(String studentId, int midtermScore, int finalScore) {
        this.studentId = studentId;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    // Match
    public boolean matchesYear(String year) {
        return studentId.substring(0, 2).equals(year);
    }

    public boolean matchesFaculty(String faculty) {
        return studentId.substring(2, 4).equals(faculty);
    }

    // calculate
    public void calculateTotalScore() {
        totalScore = midtermScore + finalScore;
    }

    // GET Medthod
    public int getMidtermScore() {
        return midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    // Display
    public void display() {
        System.out.println(studentId + " " + totalScore);
    }

}
