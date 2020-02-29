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
    @ConditionalOnProperty(value = "property", havingValue = "0")
    ConditionalClass conditionalClass() {
        return new ConditionalClass();
    }

}