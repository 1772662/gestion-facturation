public class CV {

	// Attributs
	private String nom;
	private String prenom;
	private String formation;
	private int nbAnnees;
	private String[] competences = new String[10];
	private String attentes;

	// Constreur avec paramètre complet
	public CV(String nom, String prenom, String formation, int nbAnnees, String[] competences, String attentes) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.nbAnnees = nbAnnees;
		this.competences = competences;
		this.attentes = attentes;

	}

	// Accesseur
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getFormation() {
		return this.formation;
	}

	public void setNbAnnees(int nbAnnees) {
		this.nbAnnees = nbAnnees;
	}

	public int getNbAnnees() {
		return this.nbAnnees;
	}

	public void setCompetences(String[] competences) {
		this.competences = competences;
	}

	public String[] getCompetences() {
		return this.competences;
	}

	public void setAttentes(String attentes) {
		this.attentes = attentes;
	}

	public String getAttentes() {
		return this.attentes;
	}
	// fin accesseur

	// Methode qui permet d’afficher toutes les informations d’un CV.
	public void affiche() {

		String comptetencesList = "";

		for (int i = 0; i < getCompetences().length; i++) {
			if (getCompetences()[i] != null)
				comptetencesList += "" + getCompetences()[i].toString() + ";";
		}

		String informations = "\nNom                             : " + getNom() + ""
				+ "\nPrenom                          : " + getPrenom() + "\nFormation                       : "
				+ getFormation() + "\nAnnée(s) expérience de travail  : " + getNbAnnees()
				+ "\nCompetences                     : " + comptetencesList + "\nAttentes vis à vis le cours 4B4 : "
				+ getAttentes();
		System.out.println(informations);

	}

}
