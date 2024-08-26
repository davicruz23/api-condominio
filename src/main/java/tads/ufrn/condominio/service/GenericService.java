package tads.ufrn.condominio.service;

import jakarta.persistence.EntityNotFoundException;
import tads.ufrn.condominio.domain.AbstractEntity;
import tads.ufrn.condominio.repository.IGenericRepository;

import java.util.List;
import java.util.Optional;

public abstract class GenericService<E extends AbstractEntity, R extends IGenericRepository> implements IGenericService<E> {

    R repository;

    public GenericService(R repository){
        this.repository = repository;
    }

    @Override
    public E getById(Long id){
        Optional<E> UsuarioBanco = repository.findById(id);
        if(UsuarioBanco.isPresent()){
            return(E) UsuarioBanco.get();
        }else {
            throw new EntityNotFoundException();
        }
    }
    @Override
    public E create(E e){
        return(E) this.repository.save(e);
    }
    @Override
    public E update(E updatedEntity, Long id){
        Optional<E> entity = repository.findById(id);
        if(entity.isEmpty()){
            E e = entity.get();
            e.partialUpdate(updatedEntity);
            return(E) this.repository.save(e);
        }else{
            throw new EntityNotFoundException();
        }
    }
    @Override
    public void delete(Long id){
        this.repository.delete(id);
    }
    @Override
    public List<E> list(){
        return (List<E>) this.repository.findAll();
    }
}
