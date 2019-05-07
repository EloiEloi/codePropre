package ex1;

import java.util.Date;

/**
 * @author Eloi
 *
 *         Class représentant une les informations basiques dune entreprise comme le numéro de Siret, le nom, l'adresse, et sa date de création
 */
public class Entreprise {

	/** siret : int siret de l'entreprise */
	public int siret;

	/** nom : String nom de l'entreprise */
	public String nom;

	/** adresse : String adresse de l'entreprise */
	public String adresse;

	/** dateCreation : Date de création de l'entreprise */
	public Date dateCreation;

	/** CAPITAL_MAX : int capital maximum de 300000 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Constructor
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter
	 *
	 * @param siret
	 *            the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 *
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 *
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter
	 * 
	 * @return the capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}

}
