package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitDDettaglioGfDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitDDettaglioGfPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_DETTAGLIO_GF
	 * @generated
	 */
	protected java.math.BigDecimal idDettaglioGf;

	/**
	 * Imposta il valore della proprieta' idDettaglioGf associata alla
	 * colonna ID_DETTAGLIO_GF.
	 * @generated
	 */
	public void setIdDettaglioGf(java.math.BigDecimal val) {

		idDettaglioGf = val;

	}

	/**
	 * Legge il valore della proprieta' idDettaglioGf associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdDettaglioGf() {

		return idDettaglioGf;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitDDettaglioGfPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitDDettaglioGfPk(

			final java.math.BigDecimal idDettaglioGf

	) {

		this.setIdDettaglioGf(idDettaglioGf);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitDDettaglioGfPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitDDettaglioGfPk)) {
			return false;
		}

		final SigitDDettaglioGfPk _cast = (SigitDDettaglioGfPk) _other;

		if (idDettaglioGf == null
				? _cast.getIdDettaglioGf() != null
				: !idDettaglioGf.equals(_cast.getIdDettaglioGf())) {
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

		if (idDettaglioGf != null) {
			_hashCode = 29 * _hashCode + idDettaglioGf.hashCode();
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

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitDDettaglioGfPk: ");
		ret.append("idDettaglioGf=" + idDettaglioGf);

		return ret.toString();
	}
}
