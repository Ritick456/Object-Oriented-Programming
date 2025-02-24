package Level2;

public class Course {

    String courseName;
    int duration;
    int fees;

    static String instituteName = "Chitkarta";

    Course(String courseName, int duration, int fees) {

        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }
    void displayCourseDetails(){
        System.out.println("CourseName : " + courseName);
        System.out.println("Duration : " + duration);
        System.out.println("Fees : " + fees);

    }
    void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Cse" , 2 , 20000);
        c1.updateInstituteName("iit");
        
        System.out.println(c1.instituteName);
        Course c2 = new Course("Cse" , 2 , 20000);
        System.out.println(c2.instituteName);

    }

}
