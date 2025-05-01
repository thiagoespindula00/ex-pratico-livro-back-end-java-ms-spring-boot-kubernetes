package thiagoespindula00.dto;

import java.util.Date;

public record UserDTO(
        String nome,
        String cpf,
        String endereco,
        String email,
        String telefone,
        Date dataCadastro
) {

}
