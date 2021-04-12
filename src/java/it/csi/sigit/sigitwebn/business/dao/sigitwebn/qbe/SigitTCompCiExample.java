package it.csi.sigit.sigitwebn.business.dao.sigitwebn.qbe;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.qbe.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import java.io.Serializable;
import java.util.*;

/**
 * Classe utilizzata dal framework di QBE (Query By Example).
 * Rappresenta l'esempio corrispondente al DTO [SigitTCompCiDto].
 * Contiene:
 * - una property di tipo FieldCheck per ogni property del DTO: 
 *   deve essere valorizzata per definire il constraint che l'esempio
 *   pone relativamente a quella property (es. range tra 1 e 100).
 * Combinando opportunamente i check e gli esempi (positivi e negativi)
 * e' possibile costruire query complesse
 * @generated
 */
public class SigitTCompCiExample extends AbstractExample {

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk codiceImpianto;

	/**
	 * @generated
	 */
	public void setCodiceImpianto(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		codiceImpianto = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getCodiceImpianto() {
		return codiceImpianto;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk idTipoComponente;

	/**
	 * @generated
	 */
	public void setIdTipoComponente(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		idTipoComponente = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getIdTipoComponente() {
		return idTipoComponente;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk progressivo;

	/**
	 * @generated
	 */
	public void setProgressivo(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		progressivo = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getProgressivo() {
		return progressivo;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk dataInstall;

	/**
	 * @generated
	 */
	public void setDataInstall(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		dataInstall = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getDataInstall() {
		return dataInstall;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk lunghezzaCircM;

	/**
	 * @generated
	 */
	public void setLunghezzaCircM(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		lunghezzaCircM = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getLunghezzaCircM() {
		return lunghezzaCircM;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk superfScambM2;

	/**
	 * @generated
	 */
	public void setSuperfScambM2(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		superfScambM2 = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getSuperfScambM2() {
		return superfScambM2;
	}

	/**
	 * @generated
	 */
	private it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk profInstallM;

	/**
	 * @generated
	 */
	public void setProfInstallM(it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk chk) {
		profInstallM = chk;
	}

	/**
	 * @generated
	 */
	public it.csi.sigit.sigitwebn.business.dao.qbe.FieldChk getProfInstallM() {
		return profInstallM;
	}

}
