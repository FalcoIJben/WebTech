package nl.saxion.model;

public class Contact {
	
	private String voorNaam;
	private String tussenV;
	private String achterNaam;
	private String nummer;
	private int foto;
	
	
	public Contact(String voorNaam, String achterNaam, String nummer, int foto){
		this.voorNaam = voorNaam;
		this.tussenV = "";
		this.achterNaam = achterNaam;
		this.nummer = nummer;
		this.foto = foto;
	}
	public Contact(String voorNaam, String tussenVoegsel, String achterNaam, String nummer, int foto){
		this.voorNaam = voorNaam;
		this.tussenV = tussenVoegsel;
		this.achterNaam = achterNaam;
		this.nummer = nummer;
		this.foto = foto;
	}
	//getters
	public String getVoorNaam(){
		return voorNaam;
	}
	public String getTussenV() {
		return tussenV;
	}
	public String getAchterNaam() {
		return achterNaam;
	}
	public String getNummer() {
		return nummer;
	}
	public int getFoto() {
		return foto;
	}

	//setters
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	public void setFoto(int foto) {
		this.foto = foto;
	}
	
	
	
	
	

}
