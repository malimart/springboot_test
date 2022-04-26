package local.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/about")
	public String sayHello() {
		return "<h1>Mi smo top</h1>";
	}
	@RequestMapping("/pogoji_uporabe")
	public String pogojiUporabe() {
		return "<p style=\"background-color:black; color:white\">To so vsi pogoji uporabe:<p>"
				+ "<ul><li>prvi člen</li>"
				+ "<li>drugi člen</li></il>";
	}

	

}
