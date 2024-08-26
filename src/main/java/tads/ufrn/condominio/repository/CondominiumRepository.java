package tads.ufrn.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tads.ufrn.condominio.domain.Condominium;

@Repository
public interface CondominiumRepository extends IGenericRepository<Condominium, Number>, JpaRepository<Condominium, Long> {
}
