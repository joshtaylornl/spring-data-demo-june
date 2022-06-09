package ca.nl.cna.java3.springdatademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/v1")
public class MainController {

    public static final String USER = "/users";

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path=USER)
    public @ResponseBody
    Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping(path = USER + "/{id}")
    public @ResponseBody
    Optional<User> getUserWithId(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @PostMapping(path=USER)
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }


}
