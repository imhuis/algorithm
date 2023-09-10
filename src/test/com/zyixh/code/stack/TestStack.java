package com.zyixh.code.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: imhuis
 * @date: 2023/9/10
 * @description:
 */
public class TestStack {

    @Test
    public void test() {
        StackBasedOnLinkedList stack = new StackBasedOnLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int a = stack.pop();
        int b = stack.pop();
        int c = stack.pop();

        assertEquals(a, 3);
        assertEquals(b, 2);
        assertEquals(c, 1);
    }
}
