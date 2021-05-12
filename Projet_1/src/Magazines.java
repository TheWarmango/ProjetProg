
public class Magazines extends Produit{
	
	private String titre;
	private int mois; // a changer
	private int annee;
	private String categorie;
	
	public Magazines(int code, double prix_achat, String titre, int mois, int annee, String categorie) {
		super(code, prix_achat);
		this.titre = titre;
		this.mois = mois;
		this.annee = annee;
		this.categorie = categorie;
	}
	
	
}
