package com.angular.angularbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.angularbackend.entity.CSGOWeapon;

public interface CSGOWeaponRepository extends JpaRepository<CSGOWeapon, Integer>
{
	CSGOWeapon findWeaponById(int id);
}
