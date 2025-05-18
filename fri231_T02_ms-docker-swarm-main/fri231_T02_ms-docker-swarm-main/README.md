# fri231_T02_ms - Docker-swarm

Este proyecto es un microservicio desarrollado con Spring Boot y R2DBC, que permite gestionar usuarios de forma reactiva. 

---

## Requisitos previos

- Java 17 (o versión compatible con Spring Boot 3+)
- Docker y Docker Compose instalados (opcional, para correr base de datos y servicio con contenedores)
- Git (para clonar el repositorio)

---

## Clonar el repositorio

```bash
git clone [https://github.com/tu_usuario/tu_repositorio.git](https://github.com/Ronaldinho-cc/fri231_T02_ms-docker-swarm.git)
cd el nombre del repositorio

## Comando para ejecutar el Docker compose

- docker-compose up --build

--Endpoint
- Get /api/users
- Post /api/users
- Put /api/users{id}
- Delete /api/users{id}
