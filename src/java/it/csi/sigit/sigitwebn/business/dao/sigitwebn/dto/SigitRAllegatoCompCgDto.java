package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitRAllegatoCompCgDao.
 * @generated
 */
public class SigitRAllegatoCompCgDto extends SigitRAllegatoCompCgPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna BUTTA_FK_R_PG
	 * @generated
	 */
	protected java.math.BigDecimal buttaFkRPg;

	/**
	 * Imposta il valore della proprieta' buttaFkRPg associata alla
	 * colonna BUTTA_FK_R_PG.
	 * @generated
	 */
	public void setButtaFkRPg(java.math.BigDecimal val) {

		buttaFkRPg = val;

	}

	/**
	 * Legge il valore della proprieta' buttaFkRPg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getButtaFkRPg() {

		return buttaFkRPg;

	}

	/**
	 * store della proprieta' associata alla colonna BUTTA_FK_3R_PG
	 * @generated
	 */
	protected java.math.BigDecimal buttaFk3rPg;

	/**
	 * Imposta il valore della proprieta' buttaFk3rPg associata alla
	 * colonna BUTTA_FK_3R_PG.
	 * @generated
	 */
	public void setButtaFk3rPg(java.math.BigDecimal val) {

		buttaFk3rPg = val;

	}

	/**
	 * Legge il valore della proprieta' buttaFk3rPg associata alla
	 * @generated
	 */
	public java.math.BigDecimal getButtaFk3rPg() {

		return buttaFk3rPg;

	}

	/**
	 * store della proprieta' associata alla colonna BUTTA_FK_R_PF
	 * @generated
	 */
	protected java.math.BigDecimal buttaFkRPf;

	/**
	 * Imposta il valore della proprieta' buttaFkRPf associata alla
	 * colonna BUTTA_FK_R_PF.
	 * @generated
	 */
	public void setButtaFkRPf(java.math.BigDecimal val) {

		buttaFkRPf = val;

	}

	/**
	 * Legge il valore della proprieta' buttaFkRPf associata alla
	 * @generated
	 */
	public java.math.BigDecimal getButtaFkRPf() {

		return buttaFkRPf;

	}

	/**
	 * store della proprieta' associata alla colonna BUTTA_FK_3RESP
	 * @generated
	 */
	protected java.math.BigDecimal buttaFk3resp;

	/**
	 * Imposta il valore della proprieta' buttaFk3resp associata alla
	 * colonna BUTTA_FK_3RESP.
	 * @generated
	 */
	public void setButtaFk3resp(java.math.BigDecimal val) {

		buttaFk3resp = val;

	}

	/**
	 * Legge il valore della proprieta' buttaFk3resp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getButtaFk3resp() {

		return buttaFk3resp;

	}

	/**
	 * store della proprieta' associata alla colonna BUTTA_FK_RESP
	 * @generated
	 */
	protected java.math.BigDecimal buttaFkResp;

	/**
	 * Imposta il valore della proprieta' buttaFkResp associata alla
	 * colonna BUTTA_FK_RESP.
	 * @generated
	 */
	public void setButtaFkResp(java.math.BigDecimal val) {

		buttaFkResp = val;

	}

	/**
	 * Legge il valore della proprieta' buttaFkResp associata alla
	 * @generated
	 */
	public java.math.BigDecimal getButtaFkResp() {

		return buttaFkResp;

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
	 * store della proprieta' associata alla colonna FK_CONTRATTO
	 * @generated
	 */
	protected java.math.BigDecimal fkContratto;

	/**
	 * Imposta il valore della proprieta' fkContratto associata alla
	 * colonna FK_CONTRATTO.
	 * @generated
	 */
	public void setFkContratto(java.math.BigDecimal val) {

		fkContratto = val;

	}

	/**
	 * Legge il valore della proprieta' fkContratto associata alla
	 * @generated
	 */
	public java.math.BigDecimal getFkContratto() {

		return fkContratto;

	}

	/**
	 * Crea una istanza di SigitRAllegatoCompCgPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitRAllegatoCompCgPk
	 * @generated
	 */
	public SigitRAllegatoCompCgPk createPk() {
		return new SigitRAllegatoCompCgPk(idAllegato, idTipoComponente, progressivo, codiceImpianto, dataInstall);
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
