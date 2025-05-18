package pe.edu.vallegrande.programingreactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.programingreactive.model.Users;
import pe.edu.vallegrande.programingreactive.model.Users;
import pe.edu.vallegrande.programingreactive.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface UserService {
    Flux<Users> listar();
    Mono<Users> obtenerPorId(Long id);
    Mono<Users> registrar(Users Userss);
    Mono<Users> actualizar(Long id, Users Userss);
    Mono<Void> eliminar(Long id);
}
