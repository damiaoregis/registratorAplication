import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7744515304331075379L;
	private String firstName;
	private String lastName; 
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private String country;
	private String selectedColor;
    private List<String> colors; 
	private Boolean subscription;
	private List<String> hobbies;
	private String seletectedHobbies;
	private List<Product> products;
	
	public String initializeFormField() {
		initializeHobbies();
		initializeColors();
		initializeProducts();
		return "input";
    }
	public void initializeHobbies() {
		hobbies = new ArrayList<String>();
        hobbies.add("Reading");
        hobbies.add("Swimming");
        hobbies.add("Gardening");
		hobbies.add("Cooking");
    }
	
	public void initializeColors() {
		colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("black");
    }

	public void initializeProducts() {
		products = new ArrayList<Product>();
        products.add(new Product(1, "Product 1", 100));
        products.add(new Product(2, "Product 2", 200));
        products.add(new Product(3, "Product 3", 300));
    }
	@Override
	public String execute(){
		// TODO Auto-generated method stub
		if (subscription == true) {
			System.out.println("Subscription confirmed.");
        } else {
			System.out.println("Subscription not confirmed.");
		}
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getColors() {
		return colors;
	}
	

	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public void setSubscription(Boolean subscription){
		this.subscription = subscription;
	}
	public Boolean getSubscription(){
		return subscription;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getSeletectedHobbies() {
		return seletectedHobbies;
	}
	public void setSeletectedHobbies(String seletectedHobbies) {
		this.seletectedHobbies = seletectedHobbies;
	}
	
	public List<Product> getProducts() {
        return products;
    }
	public void setProducts(List<Product> products) {
        this.products = products;
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