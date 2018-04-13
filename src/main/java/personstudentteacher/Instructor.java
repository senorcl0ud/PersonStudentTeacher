package personstudentteacher;

public class Instructor extends Person implements ITeacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(ILearner learner, double numOfHours){
        learner.learn(numOfHours);

    }
    public void lecture(ILearner [] learners, double numOfHours){

        double numberOfHoursPerLearner = numOfHours / learners.length;

        for(int i = 0; i <= learners.length;i++){

            learners[i].learn(numberOfHoursPerLearner);
        }


    }


}
