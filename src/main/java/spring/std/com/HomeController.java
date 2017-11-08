package spring.std.com;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.std.service.HomeService;
import spring.std.vo.Stadium;

@Controller
public class HomeController {

    @Resource
    HomeService homeService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request, HttpServletResponse response, Model model, Locale locale) throws Exception{
        List<Stadium> list = homeService.home();
        model.addAttribute(list);

        return "home";
    }

}
