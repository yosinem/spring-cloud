package com.db.mongoService.config;

import com.db.mongoService.documents.User;
import com.db.mongoService.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)

public class MongoConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> userRepository.save(new User(1,"Yosi",31));
    }
}
