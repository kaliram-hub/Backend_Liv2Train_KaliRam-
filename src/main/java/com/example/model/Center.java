package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table
public class Center {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Address Address;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]{1,40}",message="Enter lessthen 40 characters!!")
	@Size(max =40, message="Enter lessthen 40 characters!!")
	private String CenterName;
	
	 @NotNull
	 @Pattern(regexp = "^[a-zA-Z0-9]{12,12}",message="length must be 12 and alphanumeric only !!")
	private String CenterCode;
	
	
	
	
	 @NotNull(message = "Must be filled !!")
	private int Student_Capacity;
	
	 @ElementCollection // 1
	    @CollectionTable(name = "courses_offered", joinColumns = @JoinColumn(name = "id")) // 2
	    @Column(name = "list")
     @NotNull(message = "Must be filled !!")
     private List<String> Courses_Offered;
	
	@NotNull
	@NotBlank
	@Email(message="your email address is not valid !! ")
	private String ContactEmail;
	
	@NotEmpty	
	 @Pattern(regexp = "^[0-9]{10,10}" , message = "Must be filled !!")
	private String ContactPhone;
	
	
	@Column(name = "Created_On")
	@Temporal(TemporalType.TIMESTAMP)
    private Date CreatedOn=new Date(System.currentTimeMillis());


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Address getAddress() {
		return Address;
	}


	public void setAddress(Address address) {
		Address = address;
	}


	public String getCenterName() {
		return CenterName;
	}


	public void setCenterName(String centerName) {
		CenterName = centerName;
	}


	public String getCenterCode() {
		return CenterCode;
	}


	public void setCenterCode(String centerCode) {
		CenterCode = centerCode;
	}


	public int getStudent_Capacity() {
		return Student_Capacity;
	}


	public void setStudent_Capacity(int student_Capacity) {
		Student_Capacity = student_Capacity;
	}


	


	public List<String> getCourse_offered() {
		return Courses_Offered;
	}


	public void setCourse_offered(List<String> course_offered) {
		this.Courses_Offered = course_offered;
	}


	public String getContactEmail() {
		return ContactEmail;
	}


	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}


	public String getContactPhone() {
		return ContactPhone;
	}


	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}


	public Date getCreatedOn() {
		return CreatedOn;
	}


	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}


	@Override
	public String toString() {
		return "Center [id=" + id + ", Address=" + Address + ", CenterName=" + CenterName + ", CenterCode=" + CenterCode
				+ ", Student_Capacity=" + Student_Capacity + ", course_offered=" + Courses_Offered + ", ContactEmail="
				+ ContactEmail + ", ContactPhone=" + ContactPhone + ", CreatedOn=" + CreatedOn + "]";
	}
	
	
	
}












