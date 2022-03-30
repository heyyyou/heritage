package com.projet.stock.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="generaliste")
public class Generaliste extends User {
	 private String gender ;
	  private String image ; 
	  private long telephone ;
	
		public Generaliste(String username, String email, String password,String role, String gender, long telephone , String image  ) {
			super(username,email,password,role,image);
			this.gender=gender;
			this.image=image;
			this.telephone=telephone;
		
		}
		
		

		
		
		public String getUsername(){
			return super.getUsername();
		}
		

		public void setUsername(){
			 super.setUsername(super.getUsername());
			 
		}
		public String getEmail(){
			return super.getEmail();
		}
		

		public void setEmail(){
			 super.setEmail(super.getEmail());
		}
		
		
		public String getUPassword(){
			return super.getPassword();
		}
		

		public void setPassword(){
			 super.setPassword(super.getPassword());
		}
		
		
		public String getRole(){
			return super.getRole();
		}
		

		public void setRole(){
			 super.setRole(super.getRole());
		}
		
	
	public Generaliste() {
		super();
	}
}
