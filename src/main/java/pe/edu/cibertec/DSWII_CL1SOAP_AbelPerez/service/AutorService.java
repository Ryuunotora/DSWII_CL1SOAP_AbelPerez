package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.convert.AutorConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.model.Autor;
import pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.repository.AutorRepository;
import pe.edu.cibertec.ws.objects.Autorws;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService {

    private AutorRepository autorRepository;
    private AutorConvert autorConvert;

    @Override
    public List<Autorws> listarAutores() {
        return autorConvert.covertAutorToAutorws(
                autorRepository.findAll()
        );
    }

    @Override
    public Autorws obtenerAutorId(int id) {
        Optional<Autor> autor = autorRepository.findById(id);
        return autor.map(value ->
                autorConvert.covertAutorToAutorws(value))
                .orElse(null);
    }

    @Override
    public Autorws registrarActualizarAutor(Autorws autorws) {
        Autor nuevoAutor = autorRepository.save(
                autorConvert.covertAutorwsToAutor(autorws));
        if(nuevoAutor == null)
            return null;
        return autorConvert.covertAutorToAutorws(nuevoAutor);
    }
}
