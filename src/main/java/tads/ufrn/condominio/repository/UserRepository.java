package tads.ufrn.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tads.ufrn.condominio.domain.User;

@Repository
public interface UserRepository extends IGenericRepository<User, Number>, JpaRepository<User, Long>{

}
