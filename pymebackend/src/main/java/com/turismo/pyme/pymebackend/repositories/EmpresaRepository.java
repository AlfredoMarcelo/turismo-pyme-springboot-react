package com.turismo.pyme.pymebackend.repositories;

import com.turismo.pyme.pymebackend.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
