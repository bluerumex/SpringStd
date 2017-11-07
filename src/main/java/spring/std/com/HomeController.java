package spring.std.com;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.std.service.HomeService;
import spring.std.vo.Stadium;

@Controller
public class HomeController {

    @Resource
    HomeService homeService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public List<Stadium> home(Locale locale, ModelAndView mv) {
        List<Stadium> list = homeService.home();

        return list;
    }

}
