package personstudentteacher;

public class Main {
    public static void main(String[] args) {
        Student yearUpStudent1 = new Student(000001,"Claude Mcalpin");
        Instructor zipCodeInstructor  = new Instructor(00000011,"Mikaila Arekdolu");



        zipCodeInstructor.teach(yearUpStudent1,8.0);
        System.out.println(yearUpStudent1.getTotalStudyTime());


    }
}
