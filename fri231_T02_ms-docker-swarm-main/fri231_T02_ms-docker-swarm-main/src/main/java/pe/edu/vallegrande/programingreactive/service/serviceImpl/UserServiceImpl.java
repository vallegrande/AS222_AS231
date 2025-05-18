package pe.edu.vallegrande.programingreactive.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.programingreactive.model.Users;
import pe.edu.vallegrande.programingreactive.repository.UserRepository;
import pe.edu.vallegrande.programingreactive.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public Flux<Users> listar() {
        return repo.findAll();
    }

    @Override
    public Mono<Users> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Mono<Users> registrar(Users user) {
        return repo.save(user);
    }

    @Override
    public Mono<Users> actualizar(Long id, Users user) {
        return repo.findById(id)
                .flatMap(existing -> {
                    existing.setNombre(user.getNombre());
                    existing.setCorreo(user.getCorreo());
                    return repo.save(existing);
                });
    }

    @Override
    public Mono<Void> eliminar(Long id) {
        return repo.deleteById(id);
    }
}
