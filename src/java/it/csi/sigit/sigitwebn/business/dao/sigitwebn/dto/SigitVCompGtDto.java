package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitVCompGtDao.
 * @generated
 */
public class SigitVCompGtDto implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna CODICE_IMPIANTO
	 * @generated
	 */
	protected java.math.BigDecimal codiceImpianto;

	/**
	 * Imposta il valore della proprieta' codiceImpianto associata alla
	 * colonna CODICE_IMPIANTO.
	 * @generated
	 */
	public void setCodiceImpianto(java.math.BigDecimal val) {

		codiceImpianto = val;

	}

	/**
	 * Legge il valore della proprieta' codiceImpianto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getCodiceImpianto() {

		return codiceImpianto;

	}

	/**
	 * store della proprieta' associata alla colonna ID_TIPO_COMPONENTE
	 * @generated
	 */
	protected String idTipoComponente;

	/**
	 * Imposta il valore della proprieta' idTipoComponente associata alla
	 * colonna ID_TIPO_COMPONENTE.
	 * @generated
	 */
	public void setIdTipoComponente(String val) {

		idTipoComponente = val;

	}

	/**
	 * Legge il valore della proprieta' idTipoComponente associata alla
	 * @generated
	 */
	public String getIdTipoComponente() {

		return idTipoComponente;

	}

	/**
	 * store della proprieta' associata alla colonna PROGRESSIVO
	 * @generated
	 */
	protected java.math.BigDecimal progressivo;

	/**
	 * Imposta il valore della proprieta' progressivo associata alla
	 * colonna PROGRESSIVO.
	 * @generated
	 */
	public void setProgressivo(java.math.BigDecimal val) {

		progressivo = val;

	}

	/**
	 * Legge il valore della proprieta' progressivo associata alla
	 * @generated
	 */
	public java.math.BigDecimal getProgressivo() {

		return progressivo;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INSTALL
	 * @generated
	 */
	protected java.sql.Date dataInstall;

	/**
	 * Imposta il valore della proprieta' dataInstall associata alla
	 * colonna DATA_INSTALL.
	 * @generated
	 */
	public void setDataInstall(java.sql.Date val) {

		if (val != null) {
			dataInstall = new java.sql.Date(val.getTime());
		} else {
			dataInstall = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInstall associata alla
	 * @generated
	 */
	public java.sql.Date getDataInstall() {

		if (dataInstall != null) {
			return new java.sql.Date(dataInstall.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna DATA_DISMISS
	 * @generated
	 */
	protected java.sql.Date dataDismiss;

	/**
	 * Imposta il valore della proprieta' dataDismiss associata alla
	 * colonna DATA_DISMISS.
	 * @generated
	 */
	public void setDataDismiss(java.sql.Date val) {

		if (val != null) {
			dataDismiss = new java.sql.Date(val.getTime());
		} else {
			dataDismiss = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataDismiss associata alla
	 * @generated
	 */
	public java.sql.Date getDataDismiss() {

		if (dataDismiss != null) {
			return new java.sql.Date(dataDismiss.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna MATRICOLA
	 * @generated
	 */
	protected String matricola;

	/**
	 * Imposta il valore della proprieta' matricola associata alla
	 * colonna MATRICOLA.
	 * @generated
	 */
	public void setMatricola(String val) {

		matricola = val;

	}

	/**
	 * Legge il valore della proprieta' matricola associata alla
	 * @generated
	 */
	public String getMatricola() {

		return matricola;

	}

	/**
	 * store della proprieta' associata alla colonna FK_MARCA
	 * @generated
	 */
	protected java.math.BigDecimal fkMarca;

	/**
	 * Imposta il valore della proprieta' fkMarca associata alla
	 * colonna FK_MARCA.
	 * @generated
	 */
	public void setFkMarca(java.math.BigDecimal val) {

		fkMarca = val;

	}

	/**
	 * Legge il valore della proprieta' fkMarca associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkMarca() {

		return fkMarca;

	}

	/**
	 * store della proprieta' associata alla colonna DES_MARCA
	 * @generated
	 */
	protected String desMarca;

	/**
	 * Imposta il valore della proprieta' desMarca associata alla
	 * colonna DES_MARCA.
	 * @generated
	 */
	public void setDesMarca(String val) {

		desMarca = val;

	}

	/**
	 * Legge il valore della proprieta' desMarca associata alla
	 * @generated
	 */
	public String getDesMarca() {

		return desMarca;

	}

	/**
	 * store della proprieta' associata alla colonna ID_COMBUSTIBILE
	 * @generated
	 */
	protected java.math.BigDecimal idCombustibile;

	/**
	 * Imposta il valore della proprieta' idCombustibile associata alla
	 * colonna ID_COMBUSTIBILE.
	 * @generated
	 */
	public void setIdCombustibile(java.math.BigDecimal val) {

		idCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' idCombustibile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getIdCombustibile() {

		return idCombustibile;

	}

	/**
	 * store della proprieta' associata alla colonna DES_COMBUSTIBILE
	 * @generated
	 */
	protected String desCombustibile;

	/**
	 * Imposta il valore della proprieta' desCombustibile associata alla
	 * colonna DES_COMBUSTIBILE.
	 * @generated
	 */
	public void setDesCombustibile(String val) {

		desCombustibile = val;

	}

	/**
	 * Legge il valore della proprieta' desCombustibile associata alla
	 * @generated
	 */
	public String getDesCombustibile() {

		return desCombustibile;

	}

	/**
	 * store della proprieta' associata alla colonna FK_FLUIDO
	 * @generated
	 */
	protected java.math.BigDecimal fkFluido;

	/**
	 * Imposta il valore della proprieta' fkFluido associata alla
	 * colonna FK_FLUIDO.
	 * @generated
	 */
	public void setFkFluido(java.math.BigDecimal val) {

		fkFluido = val;

	}

	/**
	 * Legge il valore della proprieta' fkFluido associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkFluido() {

		return fkFluido;

	}

	/**
	 * store della proprieta' associata alla colonna DES_FLUIDO
	 * @generated
	 */
	protected String desFluido;

	/**
	 * Imposta il valore della proprieta' desFluido associata alla
	 * colonna DES_FLUIDO.
	 * @generated
	 */
	public void setDesFluido(String val) {

		desFluido = val;

	}

	/**
	 * Legge il valore della proprieta' desFluido associata alla
	 * @generated
	 */
	public String getDesFluido() {

		return desFluido;

	}

	/**
	 * store della proprieta' associata alla colonna FK_DETTAGLIO_GT
	 * @generated
	 */
	protected java.math.BigDecimal fkDettaglioGt;

	/**
	 * Imposta il valore della proprieta' fkDettaglioGt associata alla
	 * colonna FK_DETTAGLIO_GT.
	 * @generated
	 */
	public void setFkDettaglioGt(java.math.BigDecimal val) {

		fkDettaglioGt = val;

	}

	/**
	 * Legge il valore della proprieta' fkDettaglioGt associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkDettaglioGt() {

		return fkDettaglioGt;

	}

	/**
	 * store della proprieta' associata alla colonna DES_DETTAGLIO_GT
	 * @generated
	 */
	protected String desDettaglioGt;

	/**
	 * Imposta il valore della proprieta' desDettaglioGt associata alla
	 * colonna DES_DETTAGLIO_GT.
	 * @generated
	 */
	public void setDesDettaglioGt(String val) {

		desDettaglioGt = val;

	}

	/**
	 * Legge il valore della proprieta' desDettaglioGt associata alla
	 * @generated
	 */
	public String getDesDettaglioGt() {

		return desDettaglioGt;

	}

	/**
	 * store della proprieta' associata alla colonna MODELLO
	 * @generated
	 */
	protected String modello;

	/**
	 * Imposta il valore della proprieta' modello associata alla
	 * colonna MODELLO.
	 * @generated
	 */
	public void setModello(String val) {

		modello = val;

	}

	/**
	 * Legge il valore della proprieta' modello associata alla
	 * @generated
	 */
	public String getModello() {

		return modello;

	}

	/**
	 * store della proprieta' associata alla colonna POTENZA_TERMICA_KW
	 * @generated
	 */
	protected java.math.BigDecimal potenzaTermicaKw;

	/**
	 * Imposta il valore della proprieta' potenzaTermicaKw associata alla
	 * colonna POTENZA_TERMICA_KW.
	 * @generated
	 */
	public void setPotenzaTermicaKw(java.math.BigDecimal val) {

		potenzaTermicaKw = val;

	}

	/**
	 * Legge il valore della proprieta' potenzaTermicaKw associata alla
	 * @generated
	 */
	public java.math.BigDecimal getPotenzaTermicaKw() {

		return potenzaTermicaKw;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_ULT_MOD
	 * @generated
	 */
	protected java.sql.Timestamp dataUltMod;

	/**
	 * Imposta il valore della proprieta' dataUltMod associata alla
	 * colonna DATA_ULT_MOD.
	 * @generated
	 */
	public void setDataUltMod(java.sql.Timestamp val) {

		if (val != null) {
			dataUltMod = new java.sql.Timestamp(val.getTime());
		} else {
			dataUltMod = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataUltMod associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDataUltMod() {

		if (dataUltMod != null) {
			return new java.sql.Timestamp(dataUltMod.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna UTENTE_ULT_MOD
	 * @generated
	 */
	protected String utenteUltMod;

	/**
	 * Imposta il valore della proprieta' utenteUltMod associata alla
	 * colonna UTENTE_ULT_MOD.
	 * @generated
	 */
	public void setUtenteUltMod(String val) {

		utenteUltMod = val;

	}

	/**
	 * Legge il valore della proprieta' utenteUltMod associata alla
	 * @generated
	 */
	public String getUtenteUltMod() {

		return utenteUltMod;

	}

	/**
	 * store della proprieta' associata alla colonna RENDIMENTO_PERC
	 * @generated
	 */
	protected java.math.BigDecimal rendimentoPerc;

	/**
	 * Imposta il valore della proprieta' rendimentoPerc associata alla
	 * colonna RENDIMENTO_PERC.
	 * @generated
	 */
	public void setRendimentoPerc(java.math.BigDecimal val) {

		rendimentoPerc = val;

	}

	/**
	 * Legge il valore della proprieta' rendimentoPerc associata alla
	 * @generated
	 */
	public java.math.BigDecimal getRendimentoPerc() {

		return rendimentoPerc;

	}

	/**
	 * store della proprieta' associata alla colonna N_MODULI
	 * @generated
	 */
	protected java.math.BigDecimal nModuli;

	/**
	 * Imposta il valore della proprieta' nModuli associata alla
	 * colonna N_MODULI.
	 * @generated
	 */
	public void setNModuli(java.math.BigDecimal val) {

		nModuli = val;

	}

	/**
	 * Legge il valore della proprieta' nModuli associata alla
	 * @generated
	 */
	public java.math.BigDecimal getNModuli() {

		return nModuli;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_DISMISSIONE
	 * @generated
	 */
	protected java.math.BigDecimal flgDismissione;

	/**
	 * Imposta il valore della proprieta' flgDismissione associata alla
	 * colonna FLG_DISMISSIONE.
	 * @generated
	 */
	public void setFlgDismissione(java.math.BigDecimal val) {

		flgDismissione = val;

	}

	/**
	 * Legge il valore della proprieta' flgDismissione associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgDismissione() {

		return flgDismissione;

	}

}
