package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 * 示例类：演示基本的 Java 语法结构
 */
public class Example {

    private String name;
    private List<String> messages;

    // 构造函数
    public Example(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }

    // 添加消息
    public void addMessage(String msg) {
        String timestamped = String.format("[%s] %s: %s",
                LocalDateTime.now(), name, msg);
        messages.add(timestamped);
        System.out.println("✅ Added message: " + timestamped);
    }

    // 获取所有消息
    public List<String> getMessages() {
        return messages;
    }

    // 打印消息
    public void printMessages() {
        System.out.println("=== Messages for " + name + " ===");
        for (String m : messages) {
            System.out.println(m);
        }
    }

    // 主函数
    public static void main(String[] args) {
        Example example = new Example("ChatGPT");
        example.addMessage("Hello, Java!");
        example.addMessage("Analyzing code changes...");
        example.printMessages();
    }
}
