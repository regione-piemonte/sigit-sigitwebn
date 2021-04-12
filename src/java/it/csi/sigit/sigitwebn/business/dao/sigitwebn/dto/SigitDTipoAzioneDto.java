package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitDTipoAzioneDao.
 * @generated
 */
public class SigitDTipoAzioneDto extends SigitDTipoAzionePk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DES_TIPO_AZIONE
	 * @generated
	 */
	protected String desTipoAzione;

	/**
	 * Imposta il valore della proprieta' desTipoAzione associata alla
	 * colonna DES_TIPO_AZIONE.
	 * @generated
	 */
	public void setDesTipoAzione(String val) {

		desTipoAzione = val;

	}

	/**
	 * Legge il valore della proprieta' desTipoAzione associata alla
	 * @generated
	 */
	public String getDesTipoAzione() {

		return desTipoAzione;

	}

	/**
	 * Crea una istanza di SigitDTipoAzionePk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitDTipoAzionePk
	 * @generated
	 */
	public SigitDTipoAzionePk createPk() {
		return new SigitDTipoAzionePk(idTipoAzione);
	}

	/**
	 * la semantica dell'equals del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * @param other l'oggetto con cui effettuare il confronto
	 * @return true se i due oggetti sono semanticamente da considerarsi uguali
	 */
	public boolean equals(Object other) {
		return super.equals(other);
	}

	/**
	 * la semantica dell'hashCode del DTO e' la stessa della PK
	 * (ovvero della superclasse).
	 * 
	 * @return int
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
