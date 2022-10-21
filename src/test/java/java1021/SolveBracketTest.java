package java1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void  bracket(){
        SolveBracket solveBracket = new SolveBracket();
        assertTrue(solveBracket.solution3("()()"));
        assertTrue(solveBracket.solution3("(())()"));
        assertFalse(solveBracket.solution3(")()(")); // stack 사용하면 처음부터 pop을 해서 처리를 해줘여함
        assertFalse(solveBracket.solution3("(()("));
        assertFalse(solveBracket.solution3("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}