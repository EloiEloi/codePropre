package ex2;

/**
 * Représente un compte bancaire
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;

	/** solde : solde du compte */
	protected double solde;

	/**
	 * Constructor
	 * 
	 * @param solde
	 *
	 */
	public CompteBancaire(double solde) {

		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant au solde si provision ou découvert suffisant
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
