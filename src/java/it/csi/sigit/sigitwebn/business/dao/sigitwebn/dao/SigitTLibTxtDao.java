package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.qbe.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import it.csi.sigit.sigitwebn.business.dao.util.*;
import it.csi.sigit.sigitwebn.business.dao.qbe.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interfaccia pubblica del DAO sigitTLibTxt.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitTLibTxtDao {

	/**
	 * Metodo di inserimento del DAO sigitTLibTxt. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTLibTxtPk
	 * @generated
	 */

	public SigitTLibTxtPk insert(SigitTLibTxtDto dto)

	;

	/** 
	 * Updates a single row in the SIGIT_T_LIB_TXT table.
	 * @generated
	 */
	public void update(SigitTLibTxtDto dto) throws SigitTLibTxtDaoException;

	/** 
	 * Deletes a single row in the SIGIT_T_LIB_TXT table.
	 * @generated
	 */

	public void delete(SigitTLibTxtPk pk) throws SigitTLibTxtDaoException;

	/** 
	 * Custom deleter in the SIGIT_T_LIB_TXT table.
	 * @generated
	 */
	public void customDeleterAllByCodImpianto(java.math.BigDecimal filter) throws SigitTLibTxtDaoException;

	/** 
	 * Custom deleter in the SIGIT_T_LIB_TXT table.
	 * @generated
	 */
	public void customDeleterBozzaByCodImpianto(java.math.BigDecimal filter) throws SigitTLibTxtDaoException;

	/** 
	 * Returns all rows from the SIGIT_T_LIB_TXT table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTLibTxtDto findByPrimaryKey(SigitTLibTxtPk pk) throws SigitTLibTxtDaoException;

	/** 
		 * Implementazione del finder byCodImpianti con Qdef
		 * @generated
		 */

	public List<SigitTLibTxtByCodImpiantiDto> findByCodImpianti(java.lang.String input) throws SigitTLibTxtDaoException;

}
