package good.is.more;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	
	@RequestMapping(value = "/happy", method = RequestMethod.GET)
	public ModelAndView getView() {
		ModelAndView m = new ModelAndView("rainbows");
		m.addObject("rainbows", "mind");
		return m;
		
	}
}