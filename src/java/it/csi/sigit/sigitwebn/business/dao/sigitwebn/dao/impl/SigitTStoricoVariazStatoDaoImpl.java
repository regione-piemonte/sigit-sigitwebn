package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.qbe.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.*;
import it.csi.sigit.sigitwebn.business.dao.impl.*;
import it.csi.sigit.sigitwebn.business.dao.util.*;
import it.csi.sigit.sigitwebn.business.dao.qbe.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import it.csi.util.performance.StopWatch;
import org.apache.log4j.Logger;
import java.util.Map;
import java.util.TreeMap;

/*PROTECTED REGION ID(R1476748867) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTStoricoVariazStato.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 
 *    --
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 *   - byCodiceImpianto (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTStoricoVariazStatoDaoImpl extends AbstractDAO implements SigitTStoricoVariazStatoDao {
	protected static final Logger LOG = Logger.getLogger(Constants.APPLICATION_CODE);
	/**
	 * Il DAO utilizza JDBC template per l'implementazione delle query.
	 * @generated
	 */
	protected NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * Imposta il JDBC template utilizato per l'implementazione delle query
	 * @generated
	 */
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Metodo di inserimento del DAO sigitTStoricoVariazStato. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTStoricoVariazStatoPk
	 * @generated
	 */

	public SigitTStoricoVariazStatoPk insert(SigitTStoricoVariazStatoDto dto)

	{
		LOG.debug("[SigitTStoricoVariazStatoDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	CODICE_IMPIANTO,DT_EVENTO,DT_INIZIO_VARIAZIONE,MOTIVO,STATO_DA,STATO_A,DATA_ULT_MOD,UTENTE_ULT_MOD ) VALUES (  :CODICE_IMPIANTO , :DT_EVENTO , :DT_INIZIO_VARIAZIONE , :MOTIVO , :STATO_DA , :STATO_A , :DATA_ULT_MOD , :UTENTE_ULT_MOD  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DT_EVENTO]
		params.addValue("DT_EVENTO", dto.getDtEvento(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [DT_INIZIO_VARIAZIONE]
		params.addValue("DT_INIZIO_VARIAZIONE", dto.getDtInizioVariazione(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [MOTIVO]
		params.addValue("MOTIVO", dto.getMotivo(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [STATO_DA]
		params.addValue("STATO_DA", dto.getStatoDa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [STATO_A]
		params.addValue("STATO_A", dto.getStatoA(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTStoricoVariazStatoDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Custom deleter in the SIGIT_T_STORICO_VARIAZ_STATO table.
	 * @generated
	 */
	public void customDeleterByCodiceImpianto(Integer filter) throws SigitTStoricoVariazStatoDaoException {
		LOG.debug("[SigitTStoricoVariazStatoDaoImpl::customDeleterByCodiceImpianto] START");
		/*PROTECTED REGION ID(R-2121884950) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTStoricoVariazStatoDaoImpl::customDeleterByCodiceImpianto] END");
	}

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_STORICO_VARIAZ_STATO";
	}

}
