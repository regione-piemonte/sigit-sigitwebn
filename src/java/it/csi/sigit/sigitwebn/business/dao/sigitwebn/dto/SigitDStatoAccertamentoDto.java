package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Data transfer object relativo al DAO SigitDStatoAccertamentoDao.
 * @generated
 */
public class SigitDStatoAccertamentoDto extends SigitDStatoAccertamentoPk {

	private static final long serialVersionUID = 1L;

	/**
	 * store della proprieta' associata alla colonna DES_STATO_ACCERTAMENTO
	 * @generated
	 */
	protected String desStatoAccertamento;

	/**
	 * Imposta il valore della proprieta' desStatoAccertamento associata alla
	 * colonna DES_STATO_ACCERTAMENTO.
	 * @generated
	 */
	public void setDesStatoAccertamento(String val) {

		desStatoAccertamento = val;

	}

	/**
	 * Legge il valore della proprieta' desStatoAccertamento associata alla
	 * @generated
	 */
	public String getDesStatoAccertamento() {

		return desStatoAccertamento;

	}

	/**
	 * Crea una istanza di SigitDStatoAccertamentoPk a partire dal valore dei campi chiave del DTO
	 * 
	 * @return SigitDStatoAccertamentoPk
	 * @generated
	 */
	public SigitDStatoAccertamentoPk createPk() {
		return new SigitDStatoAccertamentoPk(idStatoAccertamento);
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
