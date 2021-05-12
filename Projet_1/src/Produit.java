
public class Produit {
	
	private int code;
	private double prix_achat;
	private int stock;
	private String description;
	
	public Produit(int code, double prix_achat) {
		super();
		this.code = code;
		this.prix_achat = prix_achat;
		this.description = "Non disponible";
		this.stock = 0;
	}
	
	public void afficher(){
		System.out.println(description);
	}
	
	public void AugmenterStock() {
		this.stock += 1;
	}
	
	public void DiminuerStock() {
		if(this.stock > 0)
		this.stock -= 1;
	}
	
	public double Calcul_PrixVente(Produit P) {
		
		
	}
}
