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

/*PROTECTED REGION ID(R1384717583) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitVRicercaComp.
 * Il DAO implementa le seguenti operazioni:
  * - FINDERS:
 *   - componentiByFilter (datagen::CustomFinder)
  * - UPDATERS:
 
 *    --
 * - DELETERS:
 
 *    --
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitVRicercaCompDaoImpl extends AbstractDAO implements SigitVRicercaCompDao {
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

	protected SigitVRicercaCompDaoRowMapper componentiByFilterRowMapper = new SigitVRicercaCompDaoRowMapper(null,
			SigitVRicercaCompComponentiByFilterDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_RICERCA_COMP";
	}

	/** 
		 * Implementazione del finder componentiByFilter con Qdef
		 * @generated
		 */

	public List<SigitVRicercaCompComponentiByFilterDto> findComponentiByFilter(
			it.csi.sigit.sigitwebn.business.dao.sigitwebn.filter.CompFilter input)
			throws SigitVRicercaCompDaoException {
		LOG.debug("[SigitVRicercaCompDaoImpl::findComponentiByFilter] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append("SELECT rc.ID_TIPO_COMPONENTE, rc.PROGRESSIVO, m.DES_MARCA, rc.MODELLO");

		sql.append(" FROM VISTA_RICERCA_COMP rc, SIGIT_D_MARCA m");

		sql.append(" WHERE ");

		sql.append("rc.FK_MARCA = m.ID_MARCA");

		sql.append(" AND ");

		sql.append("CODICE_IMPIANTO = :codImp");
		/*PROTECTED REGION ID(R1242006995) ENABLED START*///inserire qui i parametri indicati nella espressione di where, ad esempio:

		sql.append(" AND :dataInizio BETWEEN DATA_INSTALL AND COALESCE(DATA_DISMISS, CURRENT_DATE) ");

		sql.append(" AND rc.ID_TIPO_COMPONENTE IN ('GT','GF', 'SC', 'CG', 'CS', 'AG')");

		//sql.append(" AND DATA_INSTALL >= :dataInizio ");

		paramMap.addValue("codImp", input.getCodImpianto(), java.sql.Types.NUMERIC);

		paramMap.addValue("dataInizio", input.getDataInstallazione(), java.sql.Types.DATE);

		/*PROTECTED REGION END*/

		List<SigitVRicercaCompComponentiByFilterDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);

		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, componentiByFilterRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitVRicercaCompDaoImpl::findComponentiByFilter] ERROR esecuzione query", ex);
			throw new SigitVRicercaCompDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitVRicercaCompDaoImpl", "findComponentiByFilter", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitVRicercaCompDaoImpl::findComponentiByFilter] END");
		}
		return list;
	}

}
