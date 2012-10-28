package nz.co.aetheric.scrivener.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;

@Component
@Path("api/user")
public class ComparisonResource /*implements UserApi*/ {
    private static final Logger log = LoggerFactory.getLogger(USerResource.class);

    @Resource
    UserDao userDao;

    
}
