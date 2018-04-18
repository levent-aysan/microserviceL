package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello World Levo") String name) {
		return new Greeting(0, name);
	}

	public static String Fizbuzla(int i) {
		String s = "";
		if (i % 3 == 0) {
			s = s + "Fizz ";
		}
		if (i % 5 == 0) {
			s = s + "Buzz";
		}
		if (s.length() == 0)
			s = String.valueOf(i);
		return s;
	}

}
