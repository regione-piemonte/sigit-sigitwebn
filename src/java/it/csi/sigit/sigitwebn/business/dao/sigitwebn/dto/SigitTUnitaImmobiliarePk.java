package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTUnitaImmobiliareDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTUnitaImmobiliarePk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_UNITA_IMM
	 * @generated
	 */
	protected java.math.BigDecimal idUnitaImm;

	/**
	 * Imposta il valore della proprieta' idUnitaImm associata alla
	 * colonna ID_UNITA_IMM.
	 * @generated
	 */
	public void setIdUnitaImm(java.math.BigDecimal val) {

		idUnitaImm = val;

	}

	/**
	 * Legge il valore della proprieta' idUnitaImm associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdUnitaImm() {

		return idUnitaImm;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTUnitaImmobiliarePk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTUnitaImmobiliarePk(

			final java.math.BigDecimal idUnitaImm

	) {

		this.setIdUnitaImm(idUnitaImm);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTUnitaImmobiliarePk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTUnitaImmobiliarePk)) {
			return false;
		}

		final SigitTUnitaImmobiliarePk _cast = (SigitTUnitaImmobiliarePk) _other;

		if (idUnitaImm == null ? _cast.getIdUnitaImm() != null : !idUnitaImm.equals(_cast.getIdUnitaImm())) {
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

		if (idUnitaImm != null) {
			_hashCode = 29 * _hashCode + idUnitaImm.hashCode();
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

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTUnitaImmobiliarePk: ");
		ret.append("idUnitaImm=" + idUnitaImm);

		return ret.toString();
	}
}
