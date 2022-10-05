package Java1005.collection;

import java.util.ArrayList;
import java.util.List;

public class Names {
    // 변수
    private List<String> students = new ArrayList<>();

    private List<Student> studentObjs = new ArrayList<>();

    // 생성자
    public Names(){};

    // 함수
    public List<Student> getStudentObjs (){
        this.studentObjs.add(new Student(1, "김경록", "te"));
        return studentObjs;
    }
    //함수
    public List<String> makeNames(){
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");
        this.students.add("안준휘");
        this.students.add("하채민");
        this.students.add("허도한");
        return students;
    }
    // 함수
    public List<String> getList(){
        return this.students;
    }
}
