package com.oocl.packagebooking.Repository;

import com.oocl.packagebooking.model.CargoPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoPackageRepository extends JpaRepository<CargoPackage,Long> {
}
