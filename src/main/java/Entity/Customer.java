package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Customer_Details")
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String mobNo;
	private String gender;
	private String ssn;
	private plan plan;
	

}
