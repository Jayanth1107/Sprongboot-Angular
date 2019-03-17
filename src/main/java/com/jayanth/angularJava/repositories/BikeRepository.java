package com.jayanth.angularJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayanth.angularJava.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
