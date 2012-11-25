package nz.co.aetheric.scrivener.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;

@Component
@Path("api/user")
public class UserResource implements UserApi {
    private static final Logger log = LoggerFactory.getLogger(UserResource.class);

    @Resource
    UserDao userDao;

    
}
