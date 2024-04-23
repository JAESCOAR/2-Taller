package com.apirest.V_Guitarras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apirest.V_Guitarras.models.Guitar;

@Repository
public interface GuitarRepository extends JpaRepository<Guitar,Long >{

}
