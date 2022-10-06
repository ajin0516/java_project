package Java1006;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
//        listExercise.stedunts.add("이아진");  // students -> private로 막아서 접근 불가

        List<String> students = listExercise.getStudents();
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("총인원은 " + students.size() + "명이다");
    }
}
