package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Double totalStudyTime = 0.0;

    public Student() {
    }

    public Student(Integer id) {
    }

    public void learn(Double amountOfHours) {
       totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
