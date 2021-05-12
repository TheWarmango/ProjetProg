
public class CD extends Produit{
	
	private float duree;
	private String titre;
	private String interprete;
	private int annee;
	private String Nb_titres;
	
	public CD(int code, double prix_achat, float duree, String titre, String interprete, int annee, String nb_titres) {
		super(code, prix_achat);
		this.duree = duree;
		this.titre = titre;
		this.interprete = interprete;
		this.annee = annee;
		Nb_titres = nb_titres;
	}
	
	// hi hello
}
