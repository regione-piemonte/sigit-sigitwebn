package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitSAllegatoDao.
 * @generated
 */
public class SigitSAllegatoDto extends SigitSAllegatoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna FK_STATO_RAPP
	 * @generated
	 */
	protected java.math.BigDecimal fkStatoRapp;

	/**
	 * Imposta il valore della proprieta' fkStatoRapp associata alla
	 * colonna FK_STATO_RAPP.
	 * @generated
	 */
	public void setFkStatoRapp(java.math.BigDecimal val) {

		fkStatoRapp = val;

	}

	/**
	 * Legge il valore della proprieta' fkStatoRapp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkStatoRapp() {

		return fkStatoRapp;

	}

	/**
	 * store della proprieta' associata alla colonna FK_IMP_RUOLO_PFPG
	 * @generated
	 */
	protected java.math.BigDecimal fkImpRuoloPfpg;

	/**
	 * Imposta il valore della proprieta' fkImpRuoloPfpg associata alla
	 * colonna FK_IMP_RUOLO_PFPG.
	 * @generated
	 */
	public void setFkImpRuoloPfpg(java.math.BigDecimal val) {

		fkImpRuoloPfpg = val;

	}

	/**
	 * Legge il valore della proprieta' fkImpRuoloPfpg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkImpRuoloPfpg() {

		return fkImpRuoloPfpg;

	}

	/**
	 * store della proprieta' associata alla colonna FK_TIPO_DOCUMENTO
	 * @generated
	 */
	protected java.math.BigDecimal fkTipoDocumento;

	/**
	 * Imposta il valore della proprieta' fkTipoDocumento associata alla
	 * colonna FK_TIPO_DOCUMENTO.
	 * @generated
	 */
	public void setFkTipoDocumento(java.math.BigDecimal val) {

		fkTipoDocumento = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoDocumento associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkTipoDocumento() {

		return fkTipoDocumento;

	}

	/**
	 * store della proprieta' associata alla colonna FK_SIGLA_BOLLINO
	 * @generated
	 */
	protected String fkSiglaBollino;

	/**
	 * Imposta il valore della proprieta' fkSiglaBollino associata alla
	 * colonna FK_SIGLA_BOLLINO.
	 * @generated
	 */
	public void setFkSiglaBollino(String val) {

		fkSiglaBollino = val;

	}

	/**
	 * Legge il valore della proprieta' fkSiglaBollino associata alla
	 * @generated
	 */
	public String getFkSiglaBollino() {

		return fkSiglaBollino;

	}

	/**
	 * store della proprieta' associata alla colonna FK_NUMERO_BOLLINO
	 * @generated
	 */
	protected java.math.BigDecimal fkNumeroBollino;

	/**
	 * Imposta il valore della proprieta' fkNumeroBollino associata alla
	 * colonna FK_NUMERO_BOLLINO.
	 * @generated
	 */
	public void setFkNumeroBollino(java.math.BigDecimal val) {

		fkNumeroBollino = val;

	}

	/**
	 * Legge il valore della proprieta' fkNumeroBollino associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkNumeroBollino() {

		return fkNumeroBollino;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_CONTROLLO
	 * @generated
	 */
	protected java.sql.Date dataControllo;

	/**
	 * Imposta il valore della proprieta' dataControllo associata alla
	 * colonna DATA_CONTROLLO.
	 * @generated
	 */
	public void setDataControllo(java.sql.Date val) {

		if (val != null) {
			dataControllo = new java.sql.Date(val.getTime());
		} else {
			dataControllo = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataControllo associata alla
	 * @generated
	 */
	public java.sql.Date getDataControllo() {

		if (dataControllo != null) {
			return new java.sql.Date(dataControllo.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIBRETTO_USO
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibrettoUso;

	/**
	 * Imposta il valore della proprieta' bFlgLibrettoUso associata alla
	 * colonna B_FLG_LIBRETTO_USO.
	 * @generated
	 */
	public void setBFlgLibrettoUso(java.math.BigDecimal val) {

		bFlgLibrettoUso = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibrettoUso associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibrettoUso() {

		return bFlgLibrettoUso;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_DICHIAR_CONFORM
	 * @generated
	 */
	protected java.math.BigDecimal bFlgDichiarConform;

	/**
	 * Imposta il valore della proprieta' bFlgDichiarConform associata alla
	 * colonna B_FLG_DICHIAR_CONFORM.
	 * @generated
	 */
	public void setBFlgDichiarConform(java.math.BigDecimal val) {

		bFlgDichiarConform = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgDichiarConform associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgDichiarConform() {

		return bFlgDichiarConform;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIB_IMP
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibImp;

	/**
	 * Imposta il valore della proprieta' bFlgLibImp associata alla
	 * colonna B_FLG_LIB_IMP.
	 * @generated
	 */
	public void setBFlgLibImp(java.math.BigDecimal val) {

		bFlgLibImp = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibImp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibImp() {

		return bFlgLibImp;

	}

	/**
	 * store della proprieta' associata alla colonna B_FLG_LIB_COMPL
	 * @generated
	 */
	protected java.math.BigDecimal bFlgLibCompl;

	/**
	 * Imposta il valore della proprieta' bFlgLibCompl associata alla
	 * colonna B_FLG_LIB_COMPL.
	 * @generated
	 */
	public void setBFlgLibCompl(java.math.BigDecimal val) {

		bFlgLibCompl = val;

	}

	/**
	 * Legge il valore della proprieta' bFlgLibCompl associata alla
	 * @generated
	 */
	public java.math.BigDecimal getBFlgLibCompl() {

		return bFlgLibCompl;

	}

	/**
	 * store della proprieta' associata alla colonna F_OSSERVAZIONI
	 * @generated
	 */
	protected String fOsservazioni;

	/**
	 * Imposta il valore della proprieta' fOsservazioni associata alla
	 * colonna F_OSSERVAZIONI.
	 * @generated
	 */
	public void setFOsservazioni(String val) {

		fOsservazioni = val;

	}

	/**
	 * Legge il valore della proprieta' fOsservazioni associata alla
	 * @generated
	 */
	public String getFOsservazioni() {

		return fOsservazioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_RACCOMANDAZIONI
	 * @generated
	 */
	protected String fRaccomandazioni;

	/**
	 * Imposta il valore della proprieta' fRaccomandazioni associata alla
	 * colonna F_RACCOMANDAZIONI.
	 * @generated
	 */
	public void setFRaccomandazioni(String val) {

		fRaccomandazioni = val;

	}

	/**
	 * Legge il valore della proprieta' fRaccomandazioni associata alla
	 * @generated
	 */
	public String getFRaccomandazioni() {

		return fRaccomandazioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_PRESCRIZIONI
	 * @generated
	 */
	protected String fPrescrizioni;

	/**
	 * Imposta il valore della proprieta' fPrescrizioni associata alla
	 * colonna F_PRESCRIZIONI.
	 * @generated
	 */
	public void setFPrescrizioni(String val) {

		fPrescrizioni = val;

	}

	/**
	 * Legge il valore della proprieta' fPrescrizioni associata alla
	 * @generated
	 */
	public String getFPrescrizioni() {

		return fPrescrizioni;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_PUO_FUNZIONARE
	 * @generated
	 */
	protected java.math.BigDecimal fFlgPuoFunzionare;

	/**
	 * Imposta il valore della proprieta' fFlgPuoFunzionare associata alla
	 * colonna F_FLG_PUO_FUNZIONARE.
	 * @generated
	 */
	public void setFFlgPuoFunzionare(java.math.BigDecimal val) {

		fFlgPuoFunzionare = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgPuoFunzionare associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgPuoFunzionare() {

		return fFlgPuoFunzionare;

	}

	/**
	 * store della proprieta' associata alla colonna F_INTERVENTO_ENTRO
	 * @generated
	 */
	protected java.sql.Date fInterventoEntro;

	/**
	 * Imposta il valore della proprieta' fInterventoEntro associata alla
	 * colonna F_INTERVENTO_ENTRO.
	 * @generated
	 */
	public void setFInterventoEntro(java.sql.Date val) {

		if (val != null) {
			fInterventoEntro = new java.sql.Date(val.getTime());
		} else {
			fInterventoEntro = null;
		}

	}

	/**
	 * Legge il valore della proprieta' fInterventoEntro associata alla
	 * @generated
	 */
	public java.sql.Date getFInterventoEntro() {

		if (fInterventoEntro != null) {
			return new java.sql.Date(fInterventoEntro.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna F_ORA_ARRIVO
	 * @generated
	 */
	protected String fOraArrivo;

	/**
	 * Imposta il valore della proprieta' fOraArrivo associata alla
	 * colonna F_ORA_ARRIVO.
	 * @generated
	 */
	public void setFOraArrivo(String val) {

		fOraArrivo = val;

	}

	/**
	 * Legge il valore della proprieta' fOraArrivo associata alla
	 * @generated
	 */
	public String getFOraArrivo() {

		return fOraArrivo;

	}

	/**
	 * store della proprieta' associata alla colonna F_ORA_PARTENZA
	 * @generated
	 */
	protected String fOraPartenza;

	/**
	 * Imposta il valore della proprieta' fOraPartenza associata alla
	 * colonna F_ORA_PARTENZA.
	 * @generated
	 */
	public void setFOraPartenza(String val) {

		fOraPartenza = val;

	}

	/**
	 * Legge il valore della proprieta' fOraPartenza associata alla
	 * @generated
	 */
	public String getFOraPartenza() {

		return fOraPartenza;

	}

	/**
	 * store della proprieta' associata alla colonna F_DENOMINAZ_TECNICO
	 * @generated
	 */
	protected String fDenominazTecnico;

	/**
	 * Imposta il valore della proprieta' fDenominazTecnico associata alla
	 * colonna F_DENOMINAZ_TECNICO.
	 * @generated
	 */
	public void setFDenominazTecnico(String val) {

		fDenominazTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fDenominazTecnico associata alla
	 * @generated
	 */
	public String getFDenominazTecnico() {

		return fDenominazTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_FIRMA_TECNICO
	 * @generated
	 */
	protected java.math.BigDecimal fFlgFirmaTecnico;

	/**
	 * Imposta il valore della proprieta' fFlgFirmaTecnico associata alla
	 * colonna F_FLG_FIRMA_TECNICO.
	 * @generated
	 */
	public void setFFlgFirmaTecnico(java.math.BigDecimal val) {

		fFlgFirmaTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgFirmaTecnico associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgFirmaTecnico() {

		return fFlgFirmaTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FLG_FIRMA_RESPONSABILE
	 * @generated
	 */
	protected java.math.BigDecimal fFlgFirmaResponsabile;

	/**
	 * Imposta il valore della proprieta' fFlgFirmaResponsabile associata alla
	 * colonna F_FLG_FIRMA_RESPONSABILE.
	 * @generated
	 */
	public void setFFlgFirmaResponsabile(java.math.BigDecimal val) {

		fFlgFirmaResponsabile = val;

	}

	/**
	 * Legge il valore della proprieta' fFlgFirmaResponsabile associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFFlgFirmaResponsabile() {

		return fFlgFirmaResponsabile;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_INVIO
	 * @generated
	 */
	protected java.sql.Date dataInvio;

	/**
	 * Imposta il valore della proprieta' dataInvio associata alla
	 * colonna DATA_INVIO.
	 * @generated
	 */
	public void setDataInvio(java.sql.Date val) {

		if (val != null) {
			dataInvio = new java.sql.Date(val.getTime());
		} else {
			dataInvio = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataInvio associata alla
	 * @generated
	 */
	public java.sql.Date getDataInvio() {

		if (dataInvio != null) {
			return new java.sql.Date(dataInvio.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna NOME_ALLEGATO
	 * @generated
	 */
	protected String nomeAllegato;

	/**
	 * Imposta il valore della proprieta' nomeAllegato associata alla
	 * colonna NOME_ALLEGATO.
	 * @generated
	 */
	public void setNomeAllegato(String val) {

		nomeAllegato = val;

	}

	/**
	 * Legge il valore della proprieta' nomeAllegato associata alla
	 * @generated
	 */
	public String getNomeAllegato() {

		return nomeAllegato;

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
	 * store della proprieta' associata alla colonna CF_REDATTORE
	 * @generated
	 */
	protected String cfRedattore;

	/**
	 * Imposta il valore della proprieta' cfRedattore associata alla
	 * colonna CF_REDATTORE.
	 * @generated
	 */
	public void setCfRedattore(String val) {

		cfRedattore = val;

	}

	/**
	 * Legge il valore della proprieta' cfRedattore associata alla
	 * @generated
	 */
	public String getCfRedattore() {

		return cfRedattore;

	}

	/**
	 * store della proprieta' associata alla colonna UID_INDEX
	 * @generated
	 */
	protected String uidIndex;

	/**
	 * Imposta il valore della proprieta' uidIndex associata alla
	 * colonna UID_INDEX.
	 * @generated
	 */
	public void setUidIndex(String val) {

		uidIndex = val;

	}

	/**
	 * Legge il valore della proprieta' uidIndex associata alla
	 * @generated
	 */
	public String getUidIndex() {

		return uidIndex;

	}

	/**
	 * store della proprieta' associata alla colonna FLG_CONTROLLO_BOZZA
	 * @generated
	 */
	protected java.math.BigDecimal flgControlloBozza;

	/**
	 * Imposta il valore della proprieta' flgControlloBozza associata alla
	 * colonna FLG_CONTROLLO_BOZZA.
	 * @generated
	 */
	public void setFlgControlloBozza(java.math.BigDecimal val) {

		flgControlloBozza = val;

	}

	/**
	 * Legge il valore della proprieta' flgControlloBozza associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFlgControlloBozza() {

		return flgControlloBozza;

	}

	/**
	 * store della proprieta' associata alla colonna A_POTENZA_TERMICA_NOMINALE_MAX
	 * @generated
	 */
	protected java.math.BigDecimal aPotenzaTermicaNominaleMax;

	/**
	 * Imposta il valore della proprieta' aPotenzaTermicaNominaleMax associata alla
	 * colonna A_POTENZA_TERMICA_NOMINALE_MAX.
	 * @generated
	 */
	public void setAPotenzaTermicaNominaleMax(java.math.BigDecimal val) {

		aPotenzaTermicaNominaleMax = val;

	}

	/**
	 * Legge il valore della proprieta' aPotenzaTermicaNominaleMax associata alla
	 * @generated
	 */
	public java.math.BigDecimal getAPotenzaTermicaNominaleMax() {

		return aPotenzaTermicaNominaleMax;

	}

	/**
	 * store della proprieta' associata alla colonna F_FIRMA_TECNICO
	 * @generated
	 */
	protected String fFirmaTecnico;

	/**
	 * Imposta il valore della proprieta' fFirmaTecnico associata alla
	 * colonna F_FIRMA_TECNICO.
	 * @generated
	 */
	public void setFFirmaTecnico(String val) {

		fFirmaTecnico = val;

	}

	/**
	 * Legge il valore della proprieta' fFirmaTecnico associata alla
	 * @generated
	 */
	public String getFFirmaTecnico() {

		return fFirmaTecnico;

	}

	/**
	 * store della proprieta' associata alla colonna F_FIRMA_RESPONSABILE
	 * @generated
	 */
	protected String fFirmaResponsabile;

	/**
	 * Imposta il valore della proprieta' fFirmaResponsabile associata alla
	 * colonna F_FIRMA_RESPONSABILE.
	 * @generated
	 */
	public void setFFirmaResponsabile(String val) {

		fFirmaResponsabile = val;

	}

	/**
	 * Legge il valore della proprieta' fFirmaResponsabile associata alla
	 * @generated
	 */
	public String getFFirmaResponsabile() {

		return fFirmaResponsabile;

	}

	/**
	 * store della proprieta' associata alla colonna ELENCO_COMBUSTIBILI
	 * @generated
	 */
	protected String elencoCombustibili;

	/**
	 * Imposta il valore della proprieta' elencoCombustibili associata alla
	 * colonna ELENCO_COMBUSTIBILI.
	 * @generated
	 */
	public void setElencoCombustibili(String val) {

		elencoCombustibili = val;

	}

	/**
	 * Legge il valore della proprieta' elencoCombustibili associata alla
	 * @generated
	 */
	public String getElencoCombustibili() {

		return elencoCombustibili;

	}

	/**
	 * store della proprieta' associata alla colonna ELENCO_APPARECCHIATURE
	 * @generated
	 */
	protected String elencoApparecchiature;

	/**
	 * Imposta il valore della proprieta' elencoApparecchiature associata alla
	 * colonna ELENCO_APPARECCHIATURE.
	 * @generated
	 */
	public void setElencoApparecchiature(String val) {

		elencoApparecchiature = val;

	}

	/**
	 * Legge il valore della proprieta' elencoApparecchiature associata alla
	 * @generated
	 */
	public String getElencoApparecchiature() {

		return elencoApparecchiature;

	}

	/**
	 * store della proprieta' associata alla colonna DATA_RESPINTA
	 * @generated
	 */
	protected java.sql.Date dataRespinta;

	/**
	 * Imposta il valore della proprieta' dataRespinta associata alla
	 * colonna DATA_RESPINTA.
	 * @generated
	 */
	public void setDataRespinta(java.sql.Date val) {

		if (val != null) {
			dataRespinta = new java.sql.Date(val.getTime());
		} else {
			dataRespinta = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dataRespinta associata alla
	 * @generated
	 */
	public java.sql.Date getDataRespinta() {

		if (dataRespinta != null) {
			return new java.sql.Date(dataRespinta.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna MOTIVO_RESPINTA
	 * @generated
	 */
	protected String motivoRespinta;

	/**
	 * Imposta il valore della proprieta' motivoRespinta associata alla
	 * colonna MOTIVO_RESPINTA.
	 * @generated
	 */
	public void setMotivoRespinta(String val) {

		motivoRespinta = val;

	}

	/**
	 * Legge il valore della proprieta' motivoRespinta associata alla
	 * @generated
	 */
	public String getMotivoRespinta() {

		return motivoRespinta;

	}

	/**
	 * store della proprieta' associata alla colonna FK_PG_CAT
	 * @generated
	 */
	protected java.math.BigDecimal fkPgCat;

	/**
	 * Imposta il valore della proprieta' fkPgCat associata alla
	 * colonna FK_PG_CAT.
	 * @generated
	 */
	public void setFkPgCat(java.math.BigDecimal val) {

		fkPgCat = val;

	}

	/**
	 * Legge il valore della proprieta' fkPgCat associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkPgCat() {

		return fkPgCat;

	}

	/**
	 * store della proprieta' associata alla colonna ABCDF_CONTROLLOWEB
	 * @generated
	 */
	protected java.sql.Timestamp abcdfControlloweb;

	/**
	 * Imposta il valore della proprieta' abcdfControlloweb associata alla
	 * colonna ABCDF_CONTROLLOWEB.
	 * @generated
	 */
	public void setAbcdfControlloweb(java.sql.Timestamp val) {

		if (val != null) {
			abcdfControlloweb = new java.sql.Timestamp(val.getTime());
		} else {
			abcdfControlloweb = null;
		}

	}

	/**
	 * Legge il valore della proprieta' abcdfControlloweb associata alla
	 * @generated
	 */
	public java.sql.Timestamp getAbcdfControlloweb() {

		if (abcdfControlloweb != null) {
			return new java.sql.Timestamp(abcdfControlloweb.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna FK_TIPO_MANUTENZIONE
	 * @generated
	 */
	protected Integer fkTipoManutenzione;

	/**
	 * Imposta il valore della proprieta' fkTipoManutenzione associata alla
	 * colonna FK_TIPO_MANUTENZIONE.
	 * @generated
	 */
	public void setFkTipoManutenzione(Integer val) {

		fkTipoManutenzione = val;

	}

	/**
	 * Legge il valore della proprieta' fkTipoManutenzione associata alla
	 * @generated
	 */
	public Integer getFkTipoManutenzione() {

		return fkTipoManutenzione;

	}

	/**
	 * store della proprieta' associata alla colonna ALTRO_DESCR
	 * @generated
	 */
	protected String altroDescr;

	/**
	 * Imposta il valore della proprieta' altroDescr associata alla
	 * colonna ALTRO_DESCR.
	 * @generated
	 */
	public void setAltroDescr(String val) {

		altroDescr = val;

	}

	/**
	 * Legge il valore della proprieta' altroDescr associata alla
	 * @generated
	 */
	public String getAltroDescr() {

		return altroDescr;

	}

	/**
	 * store della proprieta' associata alla colonna DT_INVIO_MEMO
	 * @generated
	 */
	protected java.sql.Timestamp dtInvioMemo;

	/**
	 * Imposta il valore della proprieta' dtInvioMemo associata alla
	 * colonna DT_INVIO_MEMO.
	 * @generated
	 */
	public void setDtInvioMemo(java.sql.Timestamp val) {

		if (val != null) {
			dtInvioMemo = new java.sql.Timestamp(val.getTime());
		} else {
			dtInvioMemo = null;
		}

	}

	/**
	 * Legge il valore della proprieta' dtInvioMemo associata alla
	 * @generated
	 */
	public java.sql.Timestamp getDtInvioMemo() {

		if (dtInvioMemo != null) {
			return new java.sql.Timestamp(dtInvioMemo.getTime());
		} else {
			return null;
		}

	}

	/**
	 * store della proprieta' associata alla colonna MAIL_INVIO_MEMO
	 * @generated
	 */
	protected String mailInvioMemo;

	/**
	 * Imposta il valore della proprieta' mailInvioMemo associata alla
	 * colonna MAIL_INVIO_MEMO.
	 * @generated
	 */
	public void setMailInvioMemo(String val) {

		mailInvioMemo = val;

	}

	/**
	 * Legge il valore della proprieta' mailInvioMemo associata alla
	 * @generated
	 */
	public String getMailInvioMemo() {

		return mailInvioMemo;

	}

	/**
	 * store della proprieta' associata alla colonna UID_INDEX_FIRMATO
	 * @generated
	 */
	protected String uidIndexFirmato;

	/**
	 * Imposta il valore della proprieta' uidIndexFirmato associata alla
	 * colonna UID_INDEX_FIRMATO.
	 * @generated
	 */
	public void setUidIndexFirmato(String val) {

		uidIndexFirmato = val;

	}

	/**
	 * Legge il valore della proprieta' uidIndexFirmato associata alla
	 * @generated
	 */
	public String getUidIndexFirmato() {

		return uidIndexFirmato;

	}

	/**
	 * store della proprieta' associata alla colonna NOME_ALLEGATO_FIRMATO
	 * @generated
	 */
	protected String nomeAllegatoFirmato;

	/**
	 * Imposta il valore della proprieta' nomeAllegatoFirmato associata alla
	 * colonna NOME_ALLEGATO_FIRMATO.
	 * @generated
	 */
	public void setNomeAllegatoFirmato(String val) {

		nomeAllegatoFirmato = val;

	}

	/**
	 * Legge il valore della proprieta' nomeAllegatoFirmato associata alla
	 * @generated
	 */
	public String getNomeAllegatoFirmato() {

		return nomeAllegatoFirmato;

	}

	/**
	 * Crea una istanza di SigitSAllegatoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitSAllegatoPk
	 * @generated
	 */
	public SigitSAllegatoPk createPk() {
		return new SigitSAllegatoPk(idAllegato);
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
