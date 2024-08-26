package tads.ufrn.condominio.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import tads.ufrn.condominio.domain.AbstractEntity;

@Repository
public interface IGenericRepository<E extends AbstractEntity, L extends Number> extends ListCrudRepository<E, Long>{
}
