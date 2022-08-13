package org.asentors.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.asentors.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}