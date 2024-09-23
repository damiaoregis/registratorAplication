import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String firstName;
	private String lastName; 
	private String gender;
	private Integer age;
	private String email;
	
	@Override
	public String execute(){
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}   
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	/*public void validate() {
		if (firstName == null || firstName.equals("") || firstName.isEmpty()) {
			addFieldError("firstName", "First Name is required");
		}
		if (lastName == null || lastName.equals("")|| lastName.isEmpty()) {
			addFieldError("lastName", "Last Name is required");
		}
		if (gender == null || gender.isEmpty()) {
			addFieldError("gender", "Gender is required");
		}
		if (age == null) {
			addFieldError("age", "Age is required");
		}
		if (email == null ||email.equals("")|| email.isEmpty()) {
			addFieldError("email", "Email is required");
		}else if (age<= 18){
			addFieldError("age", "Age must be greater than or equal to 18");
		}
	}*/

}