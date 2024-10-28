package test.some;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Student {
    private String name;
    private double grade;
    private String department;
    private Gender gender;

    public static final double PASSING_GRADE = 70.0;

    public enum Gender {
        MALE, FEMALE
    }

    public Student(String name, double grade, String department, Gender gender) {
        this.name = name;
        this.grade = grade;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}


class AggregationKata {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        var mapWithMarks = new HashMap<String, Double>();
        List<Student> studentList = students.toList();

        studentList.stream().map(x -> x.getDepartment()).distinct().forEach(key -> mapWithMarks.put(key, (double) 0.0));

        for (String s: mapWithMarks.keySet()){
            double averageGrade = studentList.stream().filter(x -> x.getDepartment().equals(s)).mapToDouble(Student::getGrade).average().orElse(0.0);
            mapWithMarks.put(s, averageGrade);
        }
        return mapWithMarks;
    }

}
