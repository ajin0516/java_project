package Java1006.Map;

import java.util.HashMap;

public class MapExcercise {
    public static void main(String[] args) {
        // TreeMap
        // 정보 찾기, key를 사용해 value를 찾아옴
        // 리스트는 포함된 모든 정보를 다 확인해가며 찾기 때문에 더 속도가 느림
        HashMap<String, String> map = new HashMap<>();
        map.put("권하준", "https://github.com/dongyeon-0822/java-project-exercise");
        map.put("이아진", "https://github.com/ajin0516/java_project.git");
        map.put("강동연","https://github.com/dongyeon-0822/java-project-exercise");
        map.put("강수빈","https://github.com/kang-subin/Java");
        map.put("고관운","https://github.com/KoKwanwun/LikeLion.git");
        map.put("고현석","https://github.com/lcomment/likelion-practice");
        map.put("곽철민","https://github.com/cmkxak/likelion-java-course");
        map.put("구경덕","https://github.com/rnrudejr9/CodeLion-git-test");
        map.put("구연지","https://github.com/Qkite/java-excercise-02");
        map.put("권소연","https://github.com/lucyoz/java-exercise");
        map.put("권오석","https://github.com/percyfrank/like-lion");
        map.put("김건우","https://github.com/KimGunWoo9595/Lion_Java_Pratice");

        System.out.println(map);
    }
}
