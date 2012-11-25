package nz.co.aetheric.scrivener.auth;

import nz.co.aetheric.scrivener.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    
    public static final String PATH_SYSTEM_LOGIN = "/auth/login";
    
    @Resource
    MessageService messages;
    
    @RequestMapping(value = PATH_SYSTEM_LOGIN, method = RequestMethod.GET)
    public String systemLogin(
        
        @ModelAttribute("form")
        LoginForm form
        
    ) {
        return "/auth/login";
    }
    
    @RequestMapping(value = PATH_SYSTEM_LOGIN, method = RequestMethod.POST)
    public String systemLogin(
        
        @Valid @ModelAttribute("form")
        LoginForm form,
        
        BindingResult formBinding,
        
        RedirectAttributes redirect
        
    ) {
        if (formBinding.hasErrors()) {
            String msg = messages.getMessage("auth.login.invalid");
            redirect.addFlashAttribute("error", msg);
            return "/auth/login";
        }
        
        //TODO: perform login operation
        
        boolean loginFailed = false;
        if (loginFailed) {
            String msg = messages.getMessage("auth.login.failed");
            redirect.addFlashAttribute("error", msg);
            return "redirect:" + PATH_SYSTEM_LOGIN;
        }
        
        return "redirect:" + form.getRedirect();
    }
}