package org.sparta.junit5practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class CustomTest {

    @Test
    @DisplayName("테스트의 내용을 한눈에 알아볼 수 있게 네이밍 해줄 수 있습니다.")
    void test1() {
        System.out.println("테스트의 수행 내용들을 빠르게 파악할 수 있습니다.");
    }

    @Nested
    @DisplayName("주제 별로 테스트를 그룹지어서 파악하기 좋습니다.")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Test1 {

        @Order(1)
        @Test
        @DisplayName("Test1 클래스")
        void test() {
            System.out.println("\nTest1 클래스");
        }

        @Order(3)
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Order(2)
        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @Nested
    @DisplayName("Test2 다른 주제")
    class Test2 {
        @Test
        @DisplayName("Test2 - test1()")
        void test1() {
            System.out.println("Test2.test1");
        }

        @Test
        @DisplayName("Test2 - test2()")
        void test2() {
            System.out.println("Test2.test2");
        }
    }
}
