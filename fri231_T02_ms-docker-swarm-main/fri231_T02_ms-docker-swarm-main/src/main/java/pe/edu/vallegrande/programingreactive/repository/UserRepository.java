package pe.edu.vallegrande.programingreactive.repository;



import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.programingreactive.model.Users;

@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, Long> {}
