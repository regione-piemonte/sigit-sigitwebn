package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitDFluidoDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitDFluidoPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_FLUIDO
	 * @generated
	 */
	protected java.math.BigDecimal idFluido;

	/**
	 * Imposta il valore della proprieta' idFluido associata alla
	 * colonna ID_FLUIDO.
	 * @generated
	 */
	public void setIdFluido(java.math.BigDecimal val) {

		idFluido = val;

	}

	/**
	 * Legge il valore della proprieta' idFluido associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdFluido() {

		return idFluido;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitDFluidoPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitDFluidoPk(

			final java.math.BigDecimal idFluido

	) {

		this.setIdFluido(idFluido);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitDFluidoPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitDFluidoPk)) {
			return false;
		}

		final SigitDFluidoPk _cast = (SigitDFluidoPk) _other;

		if (idFluido == null ? _cast.getIdFluido() != null : !idFluido.equals(_cast.getIdFluido())) {
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

		if (idFluido != null) {
			_hashCode = 29 * _hashCode + idFluido.hashCode();
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

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitDFluidoPk: ");
		ret.append("idFluido=" + idFluido);

		return ret.toString();
	}
}
