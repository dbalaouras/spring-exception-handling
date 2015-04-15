package gr.bytecode.exceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Entry point to the Spring App
 * 
 * @author Dimi Balaouras
 */
@SpringBootApplication
@EnableJpaRepositories
public class App {

    /**
     * Main entry point
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
