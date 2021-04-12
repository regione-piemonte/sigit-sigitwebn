package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitDDettaglioGtDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitDDettaglioGtPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETTAGLIO_GT
	 * @generated
	 */
	protected java.math.BigDecimal idDettaglioGt;

	/**
	 * Imposta il valore della proprieta' idDettaglioGt associata alla
	 * colonna ID_DETTAGLIO_GT.
	 * @generated
	 */
	public void setIdDettaglioGt(java.math.BigDecimal val) {

		idDettaglioGt = val;

	}

	/**
	 * Legge il valore della proprieta' idDettaglioGt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettaglioGt() {

		return idDettaglioGt;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitDDettaglioGtPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitDDettaglioGtPk(

			final java.math.BigDecimal idDettaglioGt

	) {

		this.setIdDettaglioGt(idDettaglioGt);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitDDettaglioGtPk sono equals se i valori di tutti i campi coincidono.
	 * 
	 * @param _other
	 * @return boolean se i due oggetti sono uguali
	 */
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof SigitDDettaglioGtPk)) {
			return false;
		}

		final SigitDDettaglioGtPk _cast = (SigitDDettaglioGtPk) _other;

		if (idDettaglioGt == null
				? _cast.getIdDettaglioGt() != null
				: !idDettaglioGt.equals(_cast.getIdDettaglioGt())) {
			return false;
		}

		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode() {
		int _hashCode = 0;

		if (idDettaglioGt != null) {
			_hashCode = 29 * _hashCode + idDettaglioGt.hashCode();
		}

		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder ret = new StringBuilder();

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitDDettaglioGtPk: ");
		ret.append("idDettaglioGt=" + idDettaglioGt);

		return ret.toString();
	}
}
