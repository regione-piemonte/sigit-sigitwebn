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

/*PROTECTED REGION ID(R935222991) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTConsumo14_4.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - byCodImpianto (datagen::CustomFinder)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 *   - ByCodImpianto (datagen::CustomDeleter)
 *   - delete (datagen::DeleteByPK)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTConsumo14_4DaoImpl extends AbstractDAO implements SigitTConsumo14_4Dao {
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
	 * Metodo di inserimento del DAO sigitTConsumo14_4. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTConsumo14_4Pk
	 * @generated
	 */

	public SigitTConsumo14_4Pk insert(SigitTConsumo14_4Dto dto)

	{
		LOG.debug("[SigitTConsumo14_4DaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_CONSUMO_H2O,CODICE_IMPIANTO,FLG_CIRCUITO_IT,FLG_CIRCUITO_ACS,FLG_ACA,NOME_PRODOTTO,QTA_CONSUMATA,FK_UNITA_MISURA,ESERCIZIO_DA,ESERCIZIO_A,DATA_ULT_MOD,UTENTE_ULT_MOD,ESERCIZIO ) VALUES (  :ID_CONSUMO_H2O , :CODICE_IMPIANTO , :FLG_CIRCUITO_IT , :FLG_CIRCUITO_ACS , :FLG_ACA , :NOME_PRODOTTO , :QTA_CONSUMATA , :FK_UNITA_MISURA , :ESERCIZIO_DA , :ESERCIZIO_A , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :ESERCIZIO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_CONSUMO_H2O]
		params.addValue("ID_CONSUMO_H2O", newKey, java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_CIRCUITO_IT]
		params.addValue("FLG_CIRCUITO_IT", dto.getFlgCircuitoIt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_CIRCUITO_ACS]
		params.addValue("FLG_CIRCUITO_ACS", dto.getFlgCircuitoAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_ACA]
		params.addValue("FLG_ACA", dto.getFlgAca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [NOME_PRODOTTO]
		params.addValue("NOME_PRODOTTO", dto.getNomeProdotto(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [QTA_CONSUMATA]
		params.addValue("QTA_CONSUMATA", dto.getQtaConsumata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_UNITA_MISURA]
		params.addValue("FK_UNITA_MISURA", dto.getFkUnitaMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_DA]
		params.addValue("ESERCIZIO_DA", dto.getEsercizioDa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_A]
		params.addValue("ESERCIZIO_A", dto.getEsercizioA(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ESERCIZIO]
		params.addValue("ESERCIZIO", dto.getEsercizio(), java.sql.Types.VARCHAR);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdConsumoH2o(newKey);
		LOG.debug("[SigitTConsumo14_4DaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_CONSUMO_14_4 table.
	 * @generated
	 */
	public void update(SigitTConsumo14_4Dto dto) throws SigitTConsumo14_4DaoException {
		LOG.debug("[SigitTConsumo14_4DaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET CODICE_IMPIANTO = :CODICE_IMPIANTO ,FLG_CIRCUITO_IT = :FLG_CIRCUITO_IT ,FLG_CIRCUITO_ACS = :FLG_CIRCUITO_ACS ,FLG_ACA = :FLG_ACA ,NOME_PRODOTTO = :NOME_PRODOTTO ,QTA_CONSUMATA = :QTA_CONSUMATA ,FK_UNITA_MISURA = :FK_UNITA_MISURA ,ESERCIZIO_DA = :ESERCIZIO_DA ,ESERCIZIO_A = :ESERCIZIO_A ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,ESERCIZIO = :ESERCIZIO  WHERE ID_CONSUMO_H2O = :ID_CONSUMO_H2O ";

		if (dto.getIdConsumoH2o() == null) {
			LOG.error("[SigitTConsumo14_4DaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTConsumo14_4DaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_CONSUMO_H2O]
		params.addValue("ID_CONSUMO_H2O", dto.getIdConsumoH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_CIRCUITO_IT]
		params.addValue("FLG_CIRCUITO_IT", dto.getFlgCircuitoIt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_CIRCUITO_ACS]
		params.addValue("FLG_CIRCUITO_ACS", dto.getFlgCircuitoAcs(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FLG_ACA]
		params.addValue("FLG_ACA", dto.getFlgAca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [NOME_PRODOTTO]
		params.addValue("NOME_PRODOTTO", dto.getNomeProdotto(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [QTA_CONSUMATA]
		params.addValue("QTA_CONSUMATA", dto.getQtaConsumata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_UNITA_MISURA]
		params.addValue("FK_UNITA_MISURA", dto.getFkUnitaMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_DA]
		params.addValue("ESERCIZIO_DA", dto.getEsercizioDa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ESERCIZIO_A]
		params.addValue("ESERCIZIO_A", dto.getEsercizioA(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [ESERCIZIO]
		params.addValue("ESERCIZIO", dto.getEsercizio(), java.sql.Types.VARCHAR);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTConsumo14_4DaoImpl::update] END");
	}

	/** 
	 * Custom deleter in the SIGIT_T_CONSUMO_14_4 table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(Integer filter) throws SigitTConsumo14_4DaoException {
		LOG.debug("[SigitTConsumo14_4DaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-445440344) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTConsumo14_4DaoImpl::customDeleterByCodImpianto] END");
	}

	/** 
	 * Deletes a single row in the SIGIT_T_CONSUMO_14_4 table.
	 * @generated
	 */

	public void delete(SigitTConsumo14_4Pk pk) throws SigitTConsumo14_4DaoException {
		LOG.debug("[SigitTConsumo14_4DaoImpl::delete] START");
		final String sql = "DELETE FROM " + getTableName() + " WHERE ID_CONSUMO_H2O = :ID_CONSUMO_H2O ";

		if (pk == null) {
			LOG.error("[SigitTConsumo14_4DaoImpl::delete] ERROR chiave primaria non impostata");
			throw new SigitTConsumo14_4DaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_CONSUMO_H2O]
		params.addValue("ID_CONSUMO_H2O", pk.getIdConsumoH2o(), java.sql.Types.NUMERIC);

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTConsumo14_4DaoImpl::delete] END");
	}

	protected SigitTConsumo14_4DaoRowMapper byCodImpiantoRowMapper = new SigitTConsumo14_4DaoRowMapper(null,
			SigitTConsumo14_4Dto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_CONSUMO_14_4";
	}

	/** 
	 * Implementazione del finder byCodImpianto
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTConsumo14_4Dto> findByCodImpianto(Integer input) throws SigitTConsumo14_4DaoException {
		LOG.debug("[SigitTConsumo14_4DaoImpl::findByCodImpianto] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_CONSUMO_H2O,CODICE_IMPIANTO,FLG_CIRCUITO_IT,FLG_CIRCUITO_ACS,FLG_ACA,NOME_PRODOTTO,QTA_CONSUMATA,FK_UNITA_MISURA,ESERCIZIO_DA,ESERCIZIO_A,DATA_ULT_MOD,UTENTE_ULT_MOD,ESERCIZIO ");
		sql.append(" FROM SIGIT_T_CONSUMO_14_4");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-800413496) ENABLED START*/

		sql.append("CODICE_IMPIANTO = :codImpianto");

		sql.append(" ORDER BY ESERCIZIO_DA ASC, ESERCIZIO_A ASC");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1837549178) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input, java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitTConsumo14_4Dto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byCodImpiantoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTConsumo14_4DaoImpl::findByCodImpianto] esecuzione query", ex);
			throw new SigitTConsumo14_4DaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTConsumo14_4DaoImpl", "findByCodImpianto", "esecuzione query", sql.toString());
			LOG.debug("[SigitTConsumo14_4DaoImpl::findByCodImpianto] END");
		}
		return list;
	}

}
