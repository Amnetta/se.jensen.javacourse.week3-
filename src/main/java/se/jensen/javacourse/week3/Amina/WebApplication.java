package se.jensen.javacourse.week3.Amina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {

		SpringApplication.run(se.jensen.javacourse.week3.Amina.WebApplication.class, args);
	}

	@GetMapping("/author/name")
	public String getAuthorName() {
		return "Amina";
	}

	@GetMapping("/square-number//{nr}")

	public int getSquareNumber(@PathVariable("nr") int number) {
		return number * number;
	}

	@GetMapping("/author")

	public Person getPerson(){
		return new Person("Amina", "Ahmed",20);}






}

