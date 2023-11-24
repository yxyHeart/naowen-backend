package com.yxy.naowen.common;

import org.junit.jupiter.api.Test;


class ResultTest {

    @Test
    public void test() {

        try {
            // do
            int v = 5 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        final var success = Result.success('1');

    }

}