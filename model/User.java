package com.projet.stock.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Utilisateur",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"
				+ ""),
		@UniqueConstraint(columnNames = "email") 
	})
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="roles")
public abstract class User {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  @NotBlank
		@Size(max = 100)
	  private String username;
	  @NotBlank
	  @Size(max = 100)
	  @Email
	  private String email;
	  private String password;
	//  private String gender ;
	 private String image ; 
//	  private long telephone ; 
	  private String role;
	 
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*public String getGender() {
		return gender;
	}*/
	/*public void setGender(String gender) {
		this.gender = gender;
	}*/
/*	public String getImage() {
		return image;
	}*/
/*	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}*/
	public String getEmail() {
		return email;
	}
/*	public void setImage(String image) {
		this.image = image;
	}*/
	/*public long getTelephone() {
		return telephone;
	}*/
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", role=" + role + ", username=" + username + ", password="
				+ password + "]";
	}
	public User(String username, String email, String password, String role  , String image  ) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		
		this.image = image;
	//	this.gender = gender;
		//this.telephone = telephone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}