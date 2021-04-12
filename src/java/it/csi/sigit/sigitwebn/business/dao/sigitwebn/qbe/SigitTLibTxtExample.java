package it.csi.sigit.sigitwebn.business.dao.sigitwebn.qbe;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.qbe.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTLibTxtDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTLibTxtExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk idLibretto;

	/**
	 * @generated
	 */
	public void setIdLibretto(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		idLibretto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getIdLibretto() {
		return idLibretto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk xmlLibretto;

	/**
	 * @generated
	 */
	public void setXmlLibretto(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		xmlLibretto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getXmlLibretto() {
		return xmlLibretto;
	}

}
