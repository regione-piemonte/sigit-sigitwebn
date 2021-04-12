package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Primary Key del DTO SigitWrkLogPrecDto.
 * E' utilizzato per tutte le operazioni di lettura dati per chiave primaria. 
 * @generated
 */
public class SigitWrkLogPrecPk implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna ID_LOG
	 * @generated
	 */
	protected Integer idLog;

	/**
	 * Imposta il valore della proprieta' idLog associata alla
	 * colonna ID_LOG.
	 * @generated
	 */
	public void setIdLog(Integer val) {

		idLog = val;

	}

	/**
	 * Legge il valore della proprieta' idLog associata alla
	 * @generated
	 */
	public Integer getIdLog() {

		return idLog;

	}

	/**
	 * Costruttore di una chiave primaria vuota
	 * @generated 
	 */
	public SigitWrkLogPrecPk() {
		//empty constructor
	}

	/**
	 * Costruttore di una chiave primaria a partire dai valori delle varie colonne
	 * @generated
	 */
	public SigitWrkLogPrecPk(

			final Integer idLog

	) {

		this.setIdLog(idLog);

	}

	/**
	 * Method 'equals'. 
	 * Due istanze di SigitWrkLogPrecPk sono equals se i valori di tutti i campi coincidono.
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

		if (!(_other instanceof SigitWrkLogPrecPk)) {
			return false;
		}

		final SigitWrkLogPrecPk _cast = (SigitWrkLogPrecPk) _other;

		if (idLog == null ? _cast.getIdLog() != null : !idLog.equals(_cast.getIdLog())) {
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

		if (idLog != null) {
			_hashCode = 29 * _hashCode + idLog.hashCode();
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

		ret.append("it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitWrkLogPrecPk: ");
		ret.append("idLog=" + idLog);

		return ret.toString();
	}
}
