
public class Librairie {

	private String nom;
	private float solde;
	private final int MAX = 100; // a changer
	private Produit stock[] = new Produit[MAX];
	
	public Librairie(String nom, float solde, Produit[] stock) {
		super();
		this.nom = nom;
		this.solde = solde;
		this.stock = stock;
	}
	
	
}
