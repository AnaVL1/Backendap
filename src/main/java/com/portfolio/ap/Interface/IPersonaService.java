
package com.portfolio.ap.Interface;

import com.portfolio.ap.Entity.Persona;
import java.util.List;


public interface IPersonaService {
 
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de una persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}


