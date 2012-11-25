package nz.co.aetheric.scrivener.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    
    public static final String PATH_PROFILE_EDIT = "/user/profile";

    @Resource
    UserDao userDao;
    
    
}
