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

/*PROTECTED REGION ID(R317336239) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVPotenzaPrezzo.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - findAll (datagen::FindAll)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitVPotenzaPrezzoDaoImpl extends AbstractDAO implements SigitVPotenzaPrezzoDao {
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

	protected SigitVPotenzaPrezzoDaoRowMapper findAllRowMapper = new SigitVPotenzaPrezzoDaoRowMapper(null,
			SigitVPotenzaPrezzoDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_POTENZA_PREZZO";
	}

	/** 
	 * Restituisce tutte le righe della tabella VISTA_POTENZA_PREZZO.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitVPotenzaPrezzoDto> findAll() throws SigitVPotenzaPrezzoDaoException {
		LOG.debug("[SigitVPotenzaPrezzoDaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_POTENZA,DES_POTENZA,LIMITE_INFERIORE,LIMITE_SUPERIORE,ID_PREZZO,PREZZO,DT_INIZIO,DT_FINE FROM "
						+ getTableName());

		sql.append(" ORDER BY LIMITE_INFERIORE ASC");
		MapSqlParameterSource params = new MapSqlParameterSource();

		List<SigitVPotenzaPrezzoDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitVPotenzaPrezzoDaoImpl::findAll] ERROR esecuzione query", ex);
			throw new SigitVPotenzaPrezzoDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVPotenzaPrezzoDaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[SigitVPotenzaPrezzoDaoImpl::findAll] END");
		}
		return list;
	}

}
