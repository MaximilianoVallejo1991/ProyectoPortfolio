package com.maxsalvadorportfolio.jmv2.Security.Service;

import com.maxsalvadorportfolio.jmv2.Security.Entity.Usuario;
import com.maxsalvadorportfolio.jmv2.Security.Repository.iUsuarioRepository;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);

    }

    

    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }

}
