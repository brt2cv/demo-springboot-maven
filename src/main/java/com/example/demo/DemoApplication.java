// 命令行编译运行: mvn clean compile && mvn exec:java -Dexec.mainClass='com.example.demo.DemoApplication'
package com.example.demo;

/*
public class HelloApplication {
    public String sayHello(){
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloApplication().sayHello());
    }
}
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
