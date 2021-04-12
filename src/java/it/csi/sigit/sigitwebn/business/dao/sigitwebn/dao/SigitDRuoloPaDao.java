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
 * Interfaccia pubblica del DAO sigitDRuoloPa.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitDRuoloPaDao {

	/** 
	 * Returns all rows from the SIGIT_D_RUOLO_PA table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitDRuoloPaDto findByPrimaryKey(SigitDRuoloPaPk pk) throws SigitDRuoloPaDaoException;

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_RUOLO_PA.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitDRuoloPaDto> findAll() throws SigitDRuoloPaDaoException;

}
