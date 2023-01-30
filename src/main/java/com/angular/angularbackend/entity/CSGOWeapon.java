package com.angular.angularbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weapon_table")
public class CSGOWeapon 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "weapon_type")
	private String weaponType;
	
	@Column(name = "weapon_model")
	private String weaponModel;
	
	@Column(name = "weapon_skin")
	private String weaponSkin;
	
	public CSGOWeapon()
	{
		
	}

	public CSGOWeapon(String weaponType, String weaponModel, String weaponSkin) {
		this.weaponType = weaponType;
		this.weaponModel = weaponModel;
		this.weaponSkin = weaponSkin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getWeaponModel() {
		return weaponModel;
	}

	public void setWeaponModel(String weaponModel) {
		this.weaponModel = weaponModel;
	}

	public String getWeaponSkin() {
		return weaponSkin;
	}

	public void setWeaponSkin(String weaponSkin) {
		this.weaponSkin = weaponSkin;
	}
	
	
	
}
