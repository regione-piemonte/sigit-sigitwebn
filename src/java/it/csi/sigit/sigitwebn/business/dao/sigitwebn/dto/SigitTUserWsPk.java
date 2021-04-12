package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitTUserWsDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitTUserWsPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_USER_WS
	 * @generated
	 */
	protected Integer idUserWs;

	/**
	 * Imposta il valore della proprieta' idUserWs associata alla
	 * colonna ID_USER_WS.
	 * @generated
	 */
	public void setIdUserWs(Integer val) {

		idUserWs = val;

	}

	/**
	 * Legge il valore della proprieta' idUserWs associata alla
	 * @generated
	 */
	public Integer getIdUserWs() {

		return idUserWs;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitTUserWsPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitTUserWsPk(

			final Integer idUserWs

	) {

		this.setIdUserWs(idUserWs);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitTUserWsPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitTUserWsPk)) {
			return false;
		}

		final SigitTUserWsPk _cast = (SigitTUserWsPk) _other;

		if (idUserWs == null ? _cast.getIdUserWs() != null : !idUserWs.equals(_cast.getIdUserWs())) {
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

		if (idUserWs != null) {
			_hashCode = 29 * _hashCode + idUserWs.hashCode();
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

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTUserWsPk: ");
		ret.append("idUserWs=" + idUserWs);

		return ret.toString();
	}
}
