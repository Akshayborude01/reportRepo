package in.ashokit.planReport.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class PlanReports {
    
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private long moNumber;
	private String gender;
	private long ssnNumber;
	private String planStatus;
	private String planName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMoNumber() {
		return moNumber;
	}

	public void setMoNumber(long moNumber) {
		this.moNumber = moNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(long ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public PlanReports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlanReports(Integer id, String name, String email, long moNumber, String gender, long ssnNumber,
			String planStatus, String planName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.moNumber = moNumber;
		this.gender = gender;
		this.ssnNumber = ssnNumber;
		this.planStatus = planStatus;
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "PlanReports [id=" + id + ", name=" + name + ", email=" + email + ", moNumber=" + moNumber + ", gender="
				+ gender + ", ssnNumber=" + ssnNumber + ", planStatus=" + planStatus + ", planName=" + planName + "]";
	}

}
