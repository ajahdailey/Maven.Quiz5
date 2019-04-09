package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    List<Student> myList = new ArrayList<>();
    private Map<Student,Double> studyMap = new LinkedHashMap<>();


    public void enroll(Student student) {
    myList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return myList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student: myList) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        for (Student student: myList) {
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
