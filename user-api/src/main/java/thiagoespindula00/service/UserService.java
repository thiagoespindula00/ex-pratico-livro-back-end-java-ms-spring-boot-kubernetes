package thiagoespindula00.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thiagoespindula00.dto.UserDTO;
import thiagoespindula00.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserDTO::convert)
                .collect(Collectors.toList());
    }
}
