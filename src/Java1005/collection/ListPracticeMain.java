package Java1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLoin2th = new LikeLion2th();
        List<String> students = likeLoin2th.getStudentList();

        // iter = foreach문 자동완성
        for (String student : students) {
            System.out.println(student);
        }
            System.out.println(students.size());

    }
}
