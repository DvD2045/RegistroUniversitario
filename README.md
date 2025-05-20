1. Autenticación y Seguridad (JWT)
SecurityConfig.java: Configura filtros JWT, autorización por roles, y endpoints públicos/seguros.

AuthController.java: Permite iniciar sesión y registrarse.

Usuario, Rol, AuthDTO: Entidades y objetos de autenticación.

2. Modelo de Datos
Estudiante, Materia, Inscripcion, Docente, EvaluacionDocente: Entidades con anotaciones JPA.

Cada entidad tiene su DTO correspondiente para transferir datos (evita exponer todo el modelo).

3. Controladores
EstudianteController, MateriaController, etc.: Exponen endpoints CRUD.

UsuarioController: Administra los usuarios autenticados.

4. Configuraciones
SwaggerConfig: Habilita documentación automática Swagger.

DatabaseInitializer: Carga datos iniciales como roles o usuarios.

5. Manejo de Evaluaciones Docentes
Permite que los estudiantes evalúen a los docentes.

Usa EvaluacionDocente como entidad relacionada con Docente y Estudiante.
git clone https://github.com/LiaRos-ai/RegistroUniversitario.git
