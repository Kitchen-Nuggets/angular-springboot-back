package com.angular.angularbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.angularbackend.entity.CSGOWeapon;
import com.angular.angularbackend.repository.CSGOWeaponRepository;

@Service
public class CSGOWeaponService 
{
	@Autowired
	private CSGOWeaponRepository repository;
	
	private List<CSGOWeapon> setCSGOWeaponList;
	
	public List<CSGOWeapon> getCSGOWeapons()
	{
		return repository.findAll();
	}
	
	public CSGOWeapon addWeapon(CSGOWeapon csgoWeapon)
	{
		return repository.save(csgoWeapon);
	}
	
	public void deleteWeapon(int id)
	{
		repository.findById(id)
		.orElseThrow();
		
		repository.deleteById(id);
	}
	
	public CSGOWeapon updateWeapon(CSGOWeapon csgoWeapon, int id)
	{
		CSGOWeapon editWeapon = repository.findWeaponById(id);
		editWeapon.setWeaponModel(csgoWeapon.getWeaponModel());
		editWeapon.setWeaponType(csgoWeapon.getWeaponType());
		editWeapon.setWeaponSkin(csgoWeapon.getWeaponSkin());
		
		return repository.save(editWeapon);
	}
	
	public CSGOWeapon findWeaponById(int id)
	{
		return repository.findWeaponById(id);
	}
}
