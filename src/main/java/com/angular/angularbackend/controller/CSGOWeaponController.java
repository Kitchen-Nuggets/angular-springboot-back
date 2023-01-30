package com.angular.angularbackend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.angular.angularbackend.entity.CSGOWeapon;
import com.angular.angularbackend.service.CSGOWeaponService;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:4200/")
public class CSGOWeaponController 
{
	@Autowired
	private CSGOWeaponService service;
	
	private List<CSGOWeapon> setCSGOWeaponList;
	
	@GetMapping("")
	public String test()
	{
		return "CSGO HELLO WORLD!!!";
	}
	
	@GetMapping("/AllWeapons")
	public List<CSGOWeapon> getCSGOWeapons()
	{
		return service.getCSGOWeapons();
	}
	
	@PostMapping("/add")
	public CSGOWeapon createWeapon(@RequestBody CSGOWeapon csgoWeapon)
	{
		return service.addWeapon(csgoWeapon);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteWeapon(@PathVariable int id)
	{
		service.deleteWeapon(id);
	}
	
	@PutMapping("/update/{id}")
	public CSGOWeapon updateWeapon(@RequestBody CSGOWeapon csgoWeapon, @PathVariable int id)
	{
		return service.updateWeapon(csgoWeapon, id);
	}
	
	@GetMapping("/weaponId/{id}")
	public CSGOWeapon getCSGOWeaponIdUpdate(@PathVariable int id)
	{
		return service.findWeaponById(id);
	}
}
