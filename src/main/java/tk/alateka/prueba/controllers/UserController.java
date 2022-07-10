package tk.alateka.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.alateka.prueba.models.User;
import tk.alateka.prueba.repository.UserRepository;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
       
    @GetMapping("/get_users")
    public List<User> listAll(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);
           
        return listUsers;
    }
}
