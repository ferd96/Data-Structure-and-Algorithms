package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Hai", 18));
        studentList.add(new Student("Abc", 19));
        studentList.add(new Student("Xyz", 17));
        // Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(" ");
        //comparable
        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
