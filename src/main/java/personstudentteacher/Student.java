package personstudentteacher;

public class Student extends Person implements ILearner {
   private double totalStudyTime;

    public Student(long id, String name){
        super(id, name);

    }

    public void learn(double numOfHours){

        totalStudyTime = numOfHours + totalStudyTime;

    }



    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
