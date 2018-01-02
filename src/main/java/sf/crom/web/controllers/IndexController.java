package sf.crom.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
