package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Example 类的单元测试
 */
public class ExampleTest {

    private Example example;

    @BeforeEach
    void setUp() {
        example = new Example("TestUser");
    }

    @Test
    void testAddMessage() {
        example.addMessage("Hello Test!");
        List<String> messages = example.getMessages();

        assertEquals(1, messages.size(), "消息列表应包含一条记录");
        assertTrue(messages.get(0).contains("Hello Test!"), "消息内容应包含输入文本");
    }

    @Test
    void testMultipleMessages() {
        example.addMessage("Message 1");
        example.addMessage("Message 2");

        List<String> messages = example.getMessages();
        assertEquals(2, messages.size());
        assertTrue(messages.get(0).contains("Message 1"));
        assertTrue(messages.get(1).contains("Message 2"));
    }

    @Test
    void testPrintMessages() {
        example.addMessage("Printed message");
        assertDoesNotThrow(() -> example.printMessages(), "打印消息时不应抛出异常");
    }

    @Test
    void testEmptyMessageListInitially() {
        assertTrue(example.getMessages().isEmpty(), "初始消息列表应为空");
    }
}
