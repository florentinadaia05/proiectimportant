package model;

public class Persoana {

	private Integer id;
	private String nume;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Persoana [id=" + id + ", nume=" + nume + ", email=" + email + "]";
	}
	
	
	
}
