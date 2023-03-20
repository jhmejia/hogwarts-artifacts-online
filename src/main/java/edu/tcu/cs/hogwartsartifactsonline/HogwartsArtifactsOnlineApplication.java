package edu.tcu.cs.hogwartsartifactsonline;

import edu.tcu.cs.hogwartsartifactsonline.artifact.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsArtifactsOnlineApplication {

    // This is the main method

//<<<<<<< HEAD
//
//=======
//>>>>>>> 84c554a788909a6a885ccaee0918e5bd951ca7b7
    public static void main(String[] args) {
        SpringApplication.run(HogwartsArtifactsOnlineApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1);
    }

}
