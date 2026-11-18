package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, "thé", argent);
	}
   
	public int seFaireExtorquer() {
	   int sommeArgent = getArgent();
	   perdreArgent(sommeArgent);
	   parler("J’ai tout perdu! Le monde est trop injuste...");
	   return sommeArgent; 
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie généreux donateur! ");
	}

}
