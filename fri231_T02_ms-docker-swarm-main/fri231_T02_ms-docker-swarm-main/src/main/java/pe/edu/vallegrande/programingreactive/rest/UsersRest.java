package pe.edu.vallegrande.programingreactive.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.programingreactive.model.Users;
import pe.edu.vallegrande.programingreactive.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UsersRest {

    @Autowired
    private UserService service;

    @GetMapping
    public Flux<Users> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Mono<Users> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Mono<Users> registrar(@RequestBody Users users) {
        return service.registrar(users);
    }

    @PutMapping("/{id}")
    public Mono<Users> actualizar(@PathVariable Long id, @RequestBody Users user) {
        return service.actualizar(id, user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminar(@PathVariable Long id) {
        return service.eliminar(id);
    }
}
