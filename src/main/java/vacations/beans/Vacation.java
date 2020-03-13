package vacations.beans;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vacation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String phone;
	private String date;
	@Autowired
	private Destination destination;
	
	/**
	 * Default no-arg constructor
	 */
	public Vacation() {
		super();
	}
	
	/** Non-default constructor
	 * @param name
	 */
	public Vacation(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * @param name
	 * @param phone
	 * @param date
	 */
	public Vacation(String name, String phone, String date) {
		super();
		this.name = name;
		this.phone = phone;
		this.date = date;
	}

	/** Non-default constructor
	 * @param id
	 * @param name
	 * @param phone
	 * @param date
	 */
	public Vacation(long id, String name, String phone, String date) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Vacation [id=" + id + ", name=" + name + ", phone=" + phone + ", date=" + date + ", destination="
				+ destination + "]";
	}
	
	
}
