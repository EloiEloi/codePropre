package ex2;

/**
 * @author Eloi
 * 
 *         class représentant un livret A
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération */
	private double tauxRemuneration;

	/**
	 * Constructor
	 * 
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {
		ajouterMontant(solde * tauxRemuneration);
	}

	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
