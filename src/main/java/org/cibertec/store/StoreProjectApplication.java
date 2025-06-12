package org.cibertec.store;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreProjectApplication {

	public static void main(String[] args) {

		/*		 * Load environment variables from .env file
		 * This is useful for local development to avoid hardcoding sensitive information
		 */
		Dotenv dotenv = Dotenv.configure()
				.filename(".env")
				.load();

		System.setProperty("MYSQL_USER", dotenv.get("MYSQL_USER"));
		System.setProperty("MYSQL_PASSWORD", dotenv.get("MYSQL_PASSWORD"));

		SpringApplication.run(StoreProjectApplication.class, args);

	}

}
