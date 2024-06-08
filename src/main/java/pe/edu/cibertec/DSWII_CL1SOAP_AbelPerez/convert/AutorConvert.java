package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.convert;


import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.model.Autor;
import pe.edu.cibertec.ws.objects.Autorws;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AutorConvert {

    public Autor covertAutorwsToAutor(Autorws autorws){
        Autor autor = new Autor();
        autor.setIdautor(autorws.getIdautor());
        autor.setNomautor(autorws.getNomautor());
        autor.setApeautor(autorws.getApeautor());
        autor.setFechnacautor(autorws.getFechnacautor());
        return autor;
    }

    public List<Autor> covertAutorwsToAutor(List<Autorws> autorws){
        List<Autor> autorList = new ArrayList<>();
        autorws.forEach(aut ->{
            autorList.add(covertAutorwsToAutor(aut));
        });
        return autorList;
    }

    public Autorws covertAutorToAutorws(Autor autor){
        Autorws autorws = new Autorws();
        autorws.setIdautor(autor.getIdautor());
        autorws.setNomautor(autor.getNomautor());
        autorws.setApeautor(autor.getApeautor());
        autorws.setFechnacautor(autor.getFechnacautor());
        return autorws;
    }

    public List<Autorws> covertAutorToAutorws(List<Autor> autor){
        List<Autorws> autorList = new ArrayList<>();
        autor.forEach(aut ->{
            autorList.add(covertAutorToAutorws(aut));
        });
        return autorList;
    }


}
