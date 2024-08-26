package tads.ufrn.condominio.service;

import org.springframework.stereotype.Service;
import tads.ufrn.condominio.domain.User;
import tads.ufrn.condominio.repository.UserRepository;

@Service
public class UserService extends GenericService<User, UserRepository> {

    public UserService(UserRepository repository) {
        super(repository);
    }

    public User findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado com o ID:"+ id));
    }


}
