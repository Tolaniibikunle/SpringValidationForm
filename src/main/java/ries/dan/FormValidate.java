package ries.dan;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by danries on 2/21/17.
 */
@RestController
public class FormValidate {
    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean validateForm(@RequestBody User user){
        if (user.getUsername().equals("admin") && user.getPassword().equals("password")){
            return true;
        }
        return false;
    }

}
