package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.model.Autor;

@Repository
public interface AutorRepository  extends JpaRepository<Autor, Integer> {
}
