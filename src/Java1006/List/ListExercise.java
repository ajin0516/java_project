package Java1006.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    // private로 외부 접근 막아줌
    private List<String> students;

    public ListExercise() {

        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("홍길동");
        this.students.add("홍길순");
    }

    public List<String> getStudents(){
        return this.students;
    }
}
