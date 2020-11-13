package user.recognition;
public class User {

	private String prenom;
	private String nom;
	private String classe;
	private String cardID;
	private String participation;

	public User() {
		this("undefined", "undefined", "undefined", "undefined","undefined");
	}

	public User(String prenom, String nom, String classe, String cardID, String participation) {
		this.prenom = prenom;
		this.nom = nom;
		this.classe = classe;
		this.cardID = cardID;
		this.participation = participation;
	}

	public String getprenom() {
		return prenom;
	}

	public void setprenom(String prenom) {
		this.prenom = prenom;
	}

	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public String getParticipation() {
		return participation;
	}

	public void setParticipation(String participation) {
		this.participation = participation;
	}

	public String toString() {
		return prenom;
	}
}