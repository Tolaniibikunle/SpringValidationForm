package ries.dan;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by danries on 2/21/17.
 */
@RestController
public class FormValidate {
    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean validateForm(@RequestBody User user){
        if (user.getUsername() == "admin" && user.getPassword() == "password"){
            return true;
        }
        return false;
    }

}
