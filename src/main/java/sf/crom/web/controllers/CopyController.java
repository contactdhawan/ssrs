package sf.crom.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CopyController {

	@RequestMapping("/about")
	public String getAboutPage() {
		return "copy/about";
	}
}
