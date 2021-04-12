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
 * Interfaccia pubblica del DAO sigitDStatoAccertamento.
 * Espone le operazioni che possono essere eseguite per la gestione 
 * della tabella [Table[TRANSIENT]]
 * @generated
 */
public interface SigitDStatoAccertamentoDao {

	/** 
	 * Returns all rows from the SIGIT_D_STATO_ACCERTAMENTO table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitDStatoAccertamentoDto findByPrimaryKey(SigitDStatoAccertamentoPk pk)
			throws SigitDStatoAccertamentoDaoException;

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_STATO_ACCERTAMENTO.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitDStatoAccertamentoDto> findAll() throws SigitDStatoAccertamentoDaoException;

}
