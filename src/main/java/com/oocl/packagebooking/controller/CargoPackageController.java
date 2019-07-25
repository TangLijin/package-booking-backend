package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.Repository.CargoPackageRepository;
import com.oocl.packagebooking.model.CargoPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargoPackage")
public class CargoPackageController {

    @Autowired
    private CargoPackageRepository cargoPackageRepository;

    @GetMapping
    public List<CargoPackage> getAllPackage(){
        return cargoPackageRepository.findAll();
    }


    @PostMapping
    public  List<CargoPackage> addNewPackage(@RequestBody CargoPackage cargoPackage){
        cargoPackageRepository.saveAndFlush(cargoPackage);
        return cargoPackageRepository.findAll();
    }

//    @PutMapping("/updatePackage/{packageNumber}")
//    public List<CargoPackage> updatePackage(Long packageNumber){
//
//    }




    @PutMapping("/{packageNumber}")
    public List<CargoPackage> updatePackage(@PathVariable Long packageNumber,@RequestParam(required = false)String appointmentTime){
        CargoPackage cargoPackage = cargoPackageRepository.findById(packageNumber).get();

        if(appointmentTime == null){    //取件
//            CargoPackage cargoPackage = cargoPackageRepository.findById(packageNumber).get();
            cargoPackage.setState("已取件");
            cargoPackage.setAppointmentTime(null);
        }else {  //预约
//            CargoPackage cargoPackage = cargoPackageRepository.findById(packageNumber).get();
            cargoPackage.setState("已预约");
            cargoPackage.setAppointmentTime(appointmentTime);
        }
        cargoPackageRepository.saveAndFlush(cargoPackage);
        return cargoPackageRepository.findAll();
    }

}
