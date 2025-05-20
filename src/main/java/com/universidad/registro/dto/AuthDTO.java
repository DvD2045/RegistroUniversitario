package com.universidad.registro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

/**
 * DTO para autenticación y autorización de usuarios.
 */
public class AuthDTO {

    /**
     * Clase que representa la solicitud de inicio de sesión.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginRequest {
        @NotBlank
        private String username;

        @NotBlank
        private String password;
    }

    /**
     * Clase que representa la solicitud de registro de un nuevo usuario.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SignupRequest {
        @NotBlank
        @Size(min = 3, max = 20)
        private String username;

        @NotBlank
        @Size(max = 50)
        @Email
        private String email;

        @NotBlank
        @Size(min = 6, max = 40)
        private String password;

        private String nombre;

        private String apellido;

        private Set<String> roles;
    }

    /**
     * Clase que representa la respuesta con el token JWT y datos del usuario.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JwtResponse {
        private String token;
        private String type = "Bearer";
        private Long id;
        private String username;
        private String email;
        private Set<String> roles;

        public JwtResponse(String token, Long id, String username, String email, Set<String> roles) {
            this.token = token;
            this.id = id;
            this.username = username;
            this.email = email;
            this.roles = roles;
        }
    }

    /**
     * Clase que representa la respuesta de un mensaje genérico.
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MessageResponse {
        private String message;
    }
}
