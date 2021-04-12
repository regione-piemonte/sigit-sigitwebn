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

/*PROTECTED REGION ID(R41399503) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitDTipoConclusione.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
 *   - findAll (datagen::FindAll)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitDTipoConclusioneDaoImpl extends AbstractDAO implements SigitDTipoConclusioneDao {
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

	protected SigitDTipoConclusioneDaoRowMapper findByPrimaryKeyRowMapper = new SigitDTipoConclusioneDaoRowMapper(null,
			SigitDTipoConclusioneDto.class, this);

	protected SigitDTipoConclusioneDaoRowMapper findAllRowMapper = new SigitDTipoConclusioneDaoRowMapper(null,
			SigitDTipoConclusioneDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_D_TIPO_CONCLUSIONE";
	}

	/** 
	 * Returns all rows from the SIGIT_D_TIPO_CONCLUSIONE table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitDTipoConclusioneDto findByPrimaryKey(SigitDTipoConclusionePk pk)
			throws SigitDTipoConclusioneDaoException {
		LOG.debug("[SigitDTipoConclusioneDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder("SELECT ID_TIPO_CONCLUSIONE,DES_TIPO_CONCLUSIONE FROM "
				+ getTableName() + " WHERE ID_TIPO_CONCLUSIONE = :ID_TIPO_CONCLUSIONE ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_CONCLUSIONE]
		params.addValue("ID_TIPO_CONCLUSIONE", pk.getIdTipoConclusione(), java.sql.Types.INTEGER);

		List<SigitDTipoConclusioneDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitDTipoConclusioneDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitDTipoConclusioneDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitDTipoConclusioneDaoImpl", "findByPrimaryKey", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitDTipoConclusioneDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_D_TIPO_CONCLUSIONE.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitDTipoConclusioneDto> findAll() throws SigitDTipoConclusioneDaoException {
		LOG.debug("[SigitDTipoConclusioneDaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_TIPO_CONCLUSIONE,DES_TIPO_CONCLUSIONE FROM " + getTableName());

		MapSqlParameterSource params = new MapSqlParameterSource();

		List<SigitDTipoConclusioneDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitDTipoConclusioneDaoImpl::findAll] ERROR esecuzione query", ex);
			throw new SigitDTipoConclusioneDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitDTipoConclusioneDaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[SigitDTipoConclusioneDaoImpl::findAll] END");
		}
		return list;
	}

}
