package gr.bytecode.exceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Entry point to the Spring App
 * 
 * @author Dimi Balaouras
 * @copyright Bytecode.gr 2015
 */
@SpringBootApplication
@EnableJpaRepositories
public class App {

    /**
     * description
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
