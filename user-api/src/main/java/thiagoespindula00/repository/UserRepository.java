package thiagoespindula00.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thiagoespindula00.dto.UserDTO;
import thiagoespindula00.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpf(String cpf);
    List<User> queryByNomeLike(String nome);
}
