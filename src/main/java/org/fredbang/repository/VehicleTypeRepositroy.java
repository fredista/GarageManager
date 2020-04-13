package org.fredbang.repository;


import org.fredbang.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleTypeRepositroy extends JpaRepository<VehicleType, Integer> {

}
