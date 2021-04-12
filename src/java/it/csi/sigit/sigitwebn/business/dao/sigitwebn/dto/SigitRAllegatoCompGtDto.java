package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitRAllegatoCompGtDao.
 * @generated
 */
public class SigitRAllegatoCompGtDto extends SigitRAllegatoCompGtPk {

	private static final long serialVersionUID = 1L;

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
	 * Crea una istanza di SigitRAllegatoCompGtPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitRAllegatoCompGtPk
	 * @generated
	 */
	public SigitRAllegatoCompGtPk createPk() {
		return new SigitRAllegatoCompGtPk(idAllegato, idTipoComponente, progressivo, codiceImpianto, dataInstall);
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
