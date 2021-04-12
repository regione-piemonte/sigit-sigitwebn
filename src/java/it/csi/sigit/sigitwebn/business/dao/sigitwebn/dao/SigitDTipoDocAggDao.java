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
 * Interfaccia pubblica del DAO sigitDTipoDocAgg.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitDTipoDocAggDao {

	/** 
	 * Implementazione del finder byIdRaggDocAgg
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitDTipoDocAggDto> findByIdRaggDocAgg(java.lang.Integer input) throws SigitDTipoDocAggDaoException;

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_TIPO_DOC_AGG.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitDTipoDocAggDto> findAll() throws SigitDTipoDocAggDaoException;

}
