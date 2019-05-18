package ex2;

/**
 * @author Eloi
 * 
 *         class représentant un compte courant
 *
 */
public class CompteCourant extends CompteBancaire {

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/**
	 * Constructor
	 * 
	 * @param solde
	 *            solde du compte
	 * @param decouvert
	 *            decouvert autorisé (montant doit être négatif)
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}

	}

	/**
	 * Getter for decouvert
	 * 
	 * @return le decouvert autorisé
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
