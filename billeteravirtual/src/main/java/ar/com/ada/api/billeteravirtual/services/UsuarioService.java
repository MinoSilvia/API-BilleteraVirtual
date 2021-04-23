package ar.com.ada.api.billeteravirtual.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.billeteravirtual.entities.Persona;
import ar.com.ada.api.billeteravirtual.entities.Usuario;
import ar.com.ada.api.billeteravirtual.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repo;

    @Autowired
    PersonaService personaService;

    public Usuario buscarPorUsername(String username) {
        return null;
    }

    public void login(String username, String password) {

    }

    /**
     * 2. METODO: Iniciar Sesion 2.1 -- recibe el username y la password 2.2 --
     * vamos a validar los datos 2.3 -- devolver un verdadero o falso
     */

    public Usuario crearUsuario(String nombre, int pais, int tipoDocumento, String documento, Date fechaNacimiento,
            String email, String password) {

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setPaisId(pais);
        persona.setTipoDocumentoId(tipoDocumento);
        persona.setDocumento(documento);
        persona.setFechaNacimiento(fechaNacimiento);

        Usuario usuario = new Usuario();
        usuario.setUsername(email);
        usuario.setEmail(email);
        usuario.setPassword(password);

        persona.setUsuario(usuario);

        personaService.grabar(persona);

        /*
         * 1. METODO: CrearUsuario 1.1 Crear una Persona(settearle a la persona un
         * usuario) 1.2 Crear un Usuario 1.3 Crear una Billetera(settearle a la
         * billetera una persona ) 1.4 Crear una cuenta en pesos y otra en dolares
         */
        return usuario;
    }

}
