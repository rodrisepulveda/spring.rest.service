package prueba.spring.cero.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	@ResponseBody
	public String sayHelloWorld() {
		
		return "Hola Esteban......!";
		
	}
}