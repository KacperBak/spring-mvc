package de.kacperbak.web;

import de.kacperbak.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        String defaultProfiles = AppUtils.stringArrayValuesToString(context.getEnvironment().getDefaultProfiles());
        String activeProfiles = AppUtils.stringArrayValuesToString(context.getEnvironment().getActiveProfiles());
        model.addAttribute("defaultProfiles", defaultProfiles);
        model.addAttribute("activeProfiles", activeProfiles);
        return "index";
    }
}
