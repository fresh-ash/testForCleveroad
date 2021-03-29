package sergei.tsapko.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sergei.tsapko.test.conroller.Controller;
import sergei.tsapko.test.model.UserDAO;
import sergei.tsapko.test.model.entity.Result;
import sergei.tsapko.test.model.Service;
import sergei.tsapko.test.model.entity.User;
import sergei.tsapko.test.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class TestApplication {

	@Autowired
	private Controller controller;


	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

	}
	@Bean
	public CommandLineRunner demo(){
		return args -> {
			controller.saveListToDB(controller.getUsersFromURL());
			controller.showInConsole(controller.getUsersFromDB());

		};
	}

}
