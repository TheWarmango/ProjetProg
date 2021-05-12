
public class Jeux extends Produit{

	private String nom;
	private int joueurs;
	private String theme;
	private int niveau;
	
	public Jeux(int code, double prix_achat, String nom, int joueurs, String theme, int niveau) {
		super(code, prix_achat);
		this.nom = nom;
		this.joueurs = joueurs;
		this.theme = theme;
		this.niveau = niveau;
	}
	
	
}
