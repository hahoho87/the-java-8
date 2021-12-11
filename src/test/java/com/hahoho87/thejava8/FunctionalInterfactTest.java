package com.hahoho87.thejava8;

import org.junit.jupiter.api.Test;

import java.util.function.*;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionalInterfactTest {

    @Test
    void functionTest() {
        Function<Integer, Integer> add2Function = (i) -> i + 2;
        assertThat(add2Function.apply(5)).isEqualTo(7);

        UnaryOperator<Integer> multiply3Function = i -> i * 3;
        BinaryOperator<Integer> add3Function = (x, y) -> x + y + 3;

        assertThat(multiply3Function.apply(5)).isEqualTo(15);
        assertThat(add3Function.apply(3, 5)).isEqualTo(11);
    }

    @Test
    void composeFunctionTest() {
        Function<Integer, Integer> add2Function = (i) -> i + 2;
        Function<Integer, Integer> multiply2Function = (i) -> i * 2;

        Function<Integer, Integer> add2AndThenMultiply2 = add2Function.andThen(multiply2Function);
        assertThat(add2AndThenMultiply2.apply(5)).isEqualTo(14);

        Function<Integer, Integer> add2ComposeMultiply2 = add2Function.compose(multiply2Function);
        assertThat(add2ComposeMultiply2.apply(5)).isEqualTo(12);
    }

    @Test
    void consumerTest() {
        Consumer<String> printString = (s -> System.out.println("s = " + s));
        printString.accept("hello");
    }

    @Test
    void supplierTest() {
        Supplier<String> getHelloString = () -> "hello";
        assertThat(getHelloString.get()).isEqualTo("hello");
    }

    @Test
    void PredicateTest() {
        Predicate<Integer> isOddNumber = (i) -> i % 2 != 0;
        assertThat(isOddNumber.test(5)).isTrue();
        assertThat(isOddNumber.test(6)).isFalse();
    }


}