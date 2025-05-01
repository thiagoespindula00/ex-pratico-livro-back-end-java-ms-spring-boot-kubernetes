package thiagoespindula00.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thiagoespindula00.dto.UserDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateUserList() {
        UserDTO userDTO = new UserDTO("Eduardo", "123", "Rua a", "eduardo@email.com", "1234-3454", new Date());
        UserDTO userDTO2 = new UserDTO("Luiz", "456", "Rua b", "luiz@email.com", "1234-3454", new Date());
        UserDTO userDTO3 = new UserDTO("Bruna", "678", "Rua c", "bruna@email.com", "1234-3454", new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
    }

    @GetMapping("/")
    public String getMensagem() {
        return "Spring boot is working";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return usuarios;
    }
}
