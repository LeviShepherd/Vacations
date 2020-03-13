package vacations.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Destination {
	private String city;
	private String country;
	private String packageLevel;
	
	/**
	 * Default no-arg constructor
	 */
	public Destination() {
		super();
	}

	/** Non-default constructor
	 * @param country
	 * @param city
	 * @param packageLevel
	 */
	public Destination(String city, String country, String packageLevel) {
		super();
		this.city = city;
		this.country = country;
		this.packageLevel = packageLevel;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPackageLevel() {
		return packageLevel;
	}

	public void setPackageLevel(String packageLevel) {
		this.packageLevel = packageLevel;
	}


	@Override
	public String toString() {
		return "Destination [country=" + country + ", city=" + city + ", packageLevel=" + packageLevel + "]";
	}
}
