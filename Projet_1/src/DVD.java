
public class DVD extends Produit{

	private float duree;
	private String titre;
	private String realisateur;
	private int annee;
	
	public DVD(int code, double prix_achat, float duree, String titre, String realisateur, int annee) {
		super(code, prix_achat);
		this.duree = duree;
		this.titre = titre;
		this.realisateur = realisateur;
		this.annee = annee;
	}
	
}
