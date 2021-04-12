/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * DTO specifico della query modellata nel finder responsabiliByCodiceImpianto.
 * @generated
 */
public class SigitRImpRuoloPfpgResponsabiliByCodiceImpiantoDto
		implements
			Serializable {

	/*	 
	 * @generated
	 */
	private String pgCodiceFiscale;

	/**
	 * @generated
	 */
	public void setPgCodiceFiscale(String val) {
		pgCodiceFiscale = val;
	}
	/**
	 * @generated
	 */
	public String getPgCodiceFiscale() {
		return pgCodiceFiscale;
	}

	/*	 
	 * @generated
	 */
	private String pgSiglaRea;

	/**
	 * @generated
	 */
	public void setPgSiglaRea(String val) {
		pgSiglaRea = val;
	}
	/**
	 * @generated
	 */
	public String getPgSiglaRea() {
		return pgSiglaRea;
	}

	/*	 
	 * @generated
	 */
	private java.math.BigDecimal pgNumeroRea;

	/**
	 * @generated
	 */
	public void setPgNumeroRea(java.math.BigDecimal val) {
		pgNumeroRea = val;
	}
	/**
	 * @generated
	 */
	public java.math.BigDecimal getPgNumeroRea() {
		return pgNumeroRea;
	}

	/*	 
	 * @generated
	 */
	private String pgDenominazione;

	/**
	 * @generated
	 */
	public void setPgDenominazione(String val) {
		pgDenominazione = val;
	}
	/**
	 * @generated
	 */
	public String getPgDenominazione() {
		return pgDenominazione;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 * @generated
	 */
	public boolean equals(Object _other) {
		return super.equals(_other);
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 * @generated
	 */
	public int hashCode() {
		return super.hashCode();
	}

}
