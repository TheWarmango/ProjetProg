
public class Livres extends Produit {

	private String titre;
	private String auteur;
	private int annee;
	private String editeur;
	
	public Livres(int code, double prix_achat, String titre, String auteur, int annee, String editeur) {
		super(code, prix_achat);
		this.titre = titre;
		this.auteur = auteur;
		this.annee = annee;
		this.editeur = editeur;
		// TODO Auto-generated constructor stub
	}
	
	
}
