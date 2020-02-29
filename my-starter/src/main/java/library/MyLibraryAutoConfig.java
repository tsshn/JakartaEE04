package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    MyLibraryClass myLibraryClass() {
        return new MyLibraryClass();
    }

    @Bean
    @ConditionalOnProperty(value = "sequence", havingValue = "123581321")
    ConditionalClass conditionalClassFibonacci() {
        return new ConditionalClass("Fibonacci");
    }

    @Bean
    @ConditionalOnProperty(value = "sequence", havingValue = "1,618")
    ConditionalClass conditionalClassGoldenSection() {
        return new ConditionalClass("Golden Section");
    }

}