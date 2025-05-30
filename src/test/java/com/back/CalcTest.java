package com.back;

// Stack 자료구조 사용금지, 재귀함수로 풀기
// GPT 사용금지
// t1부터 순서대로 구현

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalcTest {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }
}



