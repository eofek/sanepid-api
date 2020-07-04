package pl.offline.sanepidAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("pl.offline.sanepidAPI.repository")
@ComponentScan("pl.offline.*")
public class SanepidApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanepidApiApplication.class, args);
	}

}
