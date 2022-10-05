package Java1005.collection;

import java.util.ArrayList;
import java.util.List;
// Shift + F6 = 동시에 수정할 때(커서여러개)
public class LikeLion2th {
    // 멋사 2기 학생의 이름이 들어있는 List를 return하는 method

    private List<String> students = new ArrayList<>();

    Names names = new Names();

    public LikeLion2th(){
        this.students = names.getList();
    }

    public  List<String> getStudentList(){
        return this.students;
    }

}
