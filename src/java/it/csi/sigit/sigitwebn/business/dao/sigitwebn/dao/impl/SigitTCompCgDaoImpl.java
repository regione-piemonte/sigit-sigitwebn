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

/*PROTECTED REGION ID(R-695017845) ENABLED START*/
// aggiungere qui eventuali import custom. 
import it.csi.sigit.sigitwebn.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTCompCg.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findByPrimaryKey (datagen::FindByPK)
 *   - componentiCancellate (datagen::CustomFinder)
 *   - byExample (datagen::CustomFinder)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 *   - delete (datagen::DeleteByPK)
 *   - byCodImpianto (datagen::CustomDeleter)
 *   - byFilter (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTCompCgDaoImpl extends AbstractDAO implements SigitTCompCgDao {
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
	 * Metodo di inserimento del DAO sigitTCompCg. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTCompCgPk
	 * @generated
	 */

	public SigitTCompCgPk insert(SigitTCompCgDto dto)

	{
		LOG.debug("[SigitTCompCgDaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POTENZA_ELETTRICA_KW,TEMP_H2O_OUT_MIN,TEMP_H2O_OUT_MAX,TEMP_H2O_IN_MIN,TEMP_H2O_IN_MAX,TEMP_H2O_MOTORE_MIN,TEMP_H2O_MOTORE_MAX,TEMP_FUMI_VALLE_MIN,TEMP_FUMI_VALLE_MAX,TEMP_FUMI_MONTE_MIN,TEMP_FUMI_MONTE_MAX,CO_MIN,CO_MAX,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,ALIMENTAZIONE,NOTE,TEMPO_MANUT_ANNI ) VALUES (  :ID_TIPO_COMPONENTE , :PROGRESSIVO , :DATA_INSTALL , :CODICE_IMPIANTO , :TIPOLOGIA , :POTENZA_ELETTRICA_KW , :TEMP_H2O_OUT_MIN , :TEMP_H2O_OUT_MAX , :TEMP_H2O_IN_MIN , :TEMP_H2O_IN_MAX , :TEMP_H2O_MOTORE_MIN , :TEMP_H2O_MOTORE_MAX , :TEMP_FUMI_VALLE_MIN , :TEMP_FUMI_VALLE_MAX , :TEMP_FUMI_MONTE_MIN , :TEMP_FUMI_MONTE_MAX , :CO_MIN , :CO_MAX , :DATA_DISMISS , :FLG_DISMISSIONE , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :FK_MARCA , :FK_COMBUSTIBILE , :MATRICOLA , :MODELLO , :POTENZA_TERMICA_KW , :ALIMENTAZIONE , :NOTE , :TEMPO_MANUT_ANNI  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", dto.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TIPOLOGIA]
		params.addValue("TIPOLOGIA", dto.getTipologia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_ELETTRICA_KW]
		params.addValue("POTENZA_ELETTRICA_KW", dto.getPotenzaElettricaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MIN]
		params.addValue("TEMP_H2O_OUT_MIN", dto.getTempH2oOutMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MAX]
		params.addValue("TEMP_H2O_OUT_MAX", dto.getTempH2oOutMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MIN]
		params.addValue("TEMP_H2O_IN_MIN", dto.getTempH2oInMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MAX]
		params.addValue("TEMP_H2O_IN_MAX", dto.getTempH2oInMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MIN]
		params.addValue("TEMP_H2O_MOTORE_MIN", dto.getTempH2oMotoreMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MAX]
		params.addValue("TEMP_H2O_MOTORE_MAX", dto.getTempH2oMotoreMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MIN]
		params.addValue("TEMP_FUMI_VALLE_MIN", dto.getTempFumiValleMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MAX]
		params.addValue("TEMP_FUMI_VALLE_MAX", dto.getTempFumiValleMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MIN]
		params.addValue("TEMP_FUMI_MONTE_MIN", dto.getTempFumiMonteMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MAX]
		params.addValue("TEMP_FUMI_MONTE_MAX", dto.getTempFumiMonteMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MIN]
		params.addValue("CO_MIN", dto.getCoMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MAX]
		params.addValue("CO_MAX", dto.getCoMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_DISMISS]
		params.addValue("DATA_DISMISS", dto.getDataDismiss(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FLG_DISMISSIONE]
		params.addValue("FLG_DISMISSIONE", dto.getFlgDismissione(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_MARCA]
		params.addValue("FK_MARCA", dto.getFkMarca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_COMBUSTIBILE]
		params.addValue("FK_COMBUSTIBILE", dto.getFkCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MATRICOLA]
		params.addValue("MATRICOLA", dto.getMatricola(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [MODELLO]
		params.addValue("MODELLO", dto.getModello(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_TERMICA_KW]
		params.addValue("POTENZA_TERMICA_KW", dto.getPotenzaTermicaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ALIMENTAZIONE]
		params.addValue("ALIMENTAZIONE", dto.getAlimentazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [TEMPO_MANUT_ANNI]
		params.addValue("TEMPO_MANUT_ANNI", dto.getTempoManutAnni(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTCompCgDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_COMP_CG table.
	 * @generated
	 */
	public void update(SigitTCompCgDto dto) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET TIPOLOGIA = :TIPOLOGIA ,POTENZA_ELETTRICA_KW = :POTENZA_ELETTRICA_KW ,TEMP_H2O_OUT_MIN = :TEMP_H2O_OUT_MIN ,TEMP_H2O_OUT_MAX = :TEMP_H2O_OUT_MAX ,TEMP_H2O_IN_MIN = :TEMP_H2O_IN_MIN ,TEMP_H2O_IN_MAX = :TEMP_H2O_IN_MAX ,TEMP_H2O_MOTORE_MIN = :TEMP_H2O_MOTORE_MIN ,TEMP_H2O_MOTORE_MAX = :TEMP_H2O_MOTORE_MAX ,TEMP_FUMI_VALLE_MIN = :TEMP_FUMI_VALLE_MIN ,TEMP_FUMI_VALLE_MAX = :TEMP_FUMI_VALLE_MAX ,TEMP_FUMI_MONTE_MIN = :TEMP_FUMI_MONTE_MIN ,TEMP_FUMI_MONTE_MAX = :TEMP_FUMI_MONTE_MAX ,CO_MIN = :CO_MIN ,CO_MAX = :CO_MAX ,DATA_DISMISS = :DATA_DISMISS ,FLG_DISMISSIONE = :FLG_DISMISSIONE ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,FK_MARCA = :FK_MARCA ,FK_COMBUSTIBILE = :FK_COMBUSTIBILE ,MATRICOLA = :MATRICOLA ,MODELLO = :MODELLO ,POTENZA_TERMICA_KW = :POTENZA_TERMICA_KW ,ALIMENTAZIONE = :ALIMENTAZIONE ,NOTE = :NOTE ,TEMPO_MANUT_ANNI = :TEMPO_MANUT_ANNI  WHERE ID_TIPO_COMPONENTE = :ID_TIPO_COMPONENTE  AND PROGRESSIVO = :PROGRESSIVO  AND DATA_INSTALL = :DATA_INSTALL  AND CODICE_IMPIANTO = :CODICE_IMPIANTO ";

		if (dto.getIdTipoComponente() == null || dto.getProgressivo() == null || dto.getDataInstall() == null
				|| dto.getCodiceImpianto() == null) {
			LOG.error("[SigitTCompCgDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTCompCgDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", dto.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TIPOLOGIA]
		params.addValue("TIPOLOGIA", dto.getTipologia(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_ELETTRICA_KW]
		params.addValue("POTENZA_ELETTRICA_KW", dto.getPotenzaElettricaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MIN]
		params.addValue("TEMP_H2O_OUT_MIN", dto.getTempH2oOutMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_OUT_MAX]
		params.addValue("TEMP_H2O_OUT_MAX", dto.getTempH2oOutMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MIN]
		params.addValue("TEMP_H2O_IN_MIN", dto.getTempH2oInMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_IN_MAX]
		params.addValue("TEMP_H2O_IN_MAX", dto.getTempH2oInMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MIN]
		params.addValue("TEMP_H2O_MOTORE_MIN", dto.getTempH2oMotoreMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_H2O_MOTORE_MAX]
		params.addValue("TEMP_H2O_MOTORE_MAX", dto.getTempH2oMotoreMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MIN]
		params.addValue("TEMP_FUMI_VALLE_MIN", dto.getTempFumiValleMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_VALLE_MAX]
		params.addValue("TEMP_FUMI_VALLE_MAX", dto.getTempFumiValleMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MIN]
		params.addValue("TEMP_FUMI_MONTE_MIN", dto.getTempFumiMonteMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [TEMP_FUMI_MONTE_MAX]
		params.addValue("TEMP_FUMI_MONTE_MAX", dto.getTempFumiMonteMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MIN]
		params.addValue("CO_MIN", dto.getCoMin(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CO_MAX]
		params.addValue("CO_MAX", dto.getCoMax(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_DISMISS]
		params.addValue("DATA_DISMISS", dto.getDataDismiss(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [FLG_DISMISSIONE]
		params.addValue("FLG_DISMISSIONE", dto.getFlgDismissione(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [FK_MARCA]
		params.addValue("FK_MARCA", dto.getFkMarca(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_COMBUSTIBILE]
		params.addValue("FK_COMBUSTIBILE", dto.getFkCombustibile(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [MATRICOLA]
		params.addValue("MATRICOLA", dto.getMatricola(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [MODELLO]
		params.addValue("MODELLO", dto.getModello(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [POTENZA_TERMICA_KW]
		params.addValue("POTENZA_TERMICA_KW", dto.getPotenzaTermicaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [ALIMENTAZIONE]
		params.addValue("ALIMENTAZIONE", dto.getAlimentazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [NOTE]
		params.addValue("NOTE", dto.getNote(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [TEMPO_MANUT_ANNI]
		params.addValue("TEMPO_MANUT_ANNI", dto.getTempoManutAnni(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompCgDaoImpl::update] END");
	}

	/** 
	 * Deletes a single row in the SIGIT_T_COMP_CG table.
	 * @generated
	 */

	public void delete(SigitTCompCgPk pk) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::delete] START");
		final String sql = "DELETE FROM " + getTableName()
				+ " WHERE ID_TIPO_COMPONENTE = :ID_TIPO_COMPONENTE  AND PROGRESSIVO = :PROGRESSIVO  AND DATA_INSTALL = :DATA_INSTALL  AND CODICE_IMPIANTO = :CODICE_IMPIANTO ";

		if (pk == null) {
			LOG.error("[SigitTCompCgDaoImpl::delete] ERROR chiave primaria non impostata");
			throw new SigitTCompCgDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", pk.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", pk.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", pk.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", pk.getCodiceImpianto(), java.sql.Types.NUMERIC);

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompCgDaoImpl::delete] END");
	}

	/** 
	 * Custom deleter in the SIGIT_T_COMP_CG table.
	 * @generated
	 */
	public void customDeleterByCodImpianto(java.lang.Integer filter) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByCodImpianto] START");
		/*PROTECTED REGION ID(R-450874575) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE CODICE_IMPIANTO = :codImpianto";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codImpianto", filter, java.sql.Types.NUMERIC);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByCodImpianto] END");
	}

	/** 
	 * Custom deleter in the SIGIT_T_COMP_CG table.
	 * @generated
	 */
	public void customDeleterByFilter(it.csi.sigit.sigitwebn.business.dao.sigitwebn.filter.CompFilter filter)
			throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByFilter] START");
		/*PROTECTED REGION ID(R-824837114) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName()
				+ " WHERE ID_TIPO_COMPONENTE = :ID_TIPO_COMPONENTE  AND PROGRESSIVO = :PROGRESSIVO  AND CODICE_IMPIANTO = :CODICE_IMPIANTO ";

		MapSqlParameterSource params = new MapSqlParameterSource();

		params.addValue("ID_TIPO_COMPONENTE", filter.getTipoComponente(), java.sql.Types.VARCHAR);

		params.addValue("PROGRESSIVO", filter.getProgressivo(), java.sql.Types.NUMERIC);

		params.addValue("CODICE_IMPIANTO", filter.getCodImpianto(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTCompCgDaoImpl::customDeleterByFilter] END");
	}

	protected SigitTCompCgDaoRowMapper findByPrimaryKeyRowMapper = new SigitTCompCgDaoRowMapper(null,
			SigitTCompCgDto.class, this);

	protected SigitTCompCgDaoRowMapper componentiCancellateRowMapper = new SigitTCompCgDaoRowMapper(null,
			SigitTCompCgDto.class, this);

	protected SigitTCompCgDaoRowMapper byExampleRowMapper = new SigitTCompCgDaoRowMapper(null, SigitTCompCgDto.class,
			this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_CG";
	}

	/** 
	 * Returns all rows from the SIGIT_T_COMP_CG table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTCompCgDto findByPrimaryKey(SigitTCompCgPk pk) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POTENZA_ELETTRICA_KW,TEMP_H2O_OUT_MIN,TEMP_H2O_OUT_MAX,TEMP_H2O_IN_MIN,TEMP_H2O_IN_MAX,TEMP_H2O_MOTORE_MIN,TEMP_H2O_MOTORE_MAX,TEMP_FUMI_VALLE_MIN,TEMP_FUMI_VALLE_MAX,TEMP_FUMI_MONTE_MIN,TEMP_FUMI_MONTE_MAX,CO_MIN,CO_MAX,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,ALIMENTAZIONE,NOTE,TEMPO_MANUT_ANNI FROM "
						+ getTableName()
						+ " WHERE ID_TIPO_COMPONENTE = :ID_TIPO_COMPONENTE  AND PROGRESSIVO = :PROGRESSIVO  AND DATA_INSTALL = :DATA_INSTALL  AND CODICE_IMPIANTO = :CODICE_IMPIANTO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_TIPO_COMPONENTE]
		params.addValue("ID_TIPO_COMPONENTE", pk.getIdTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", pk.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", pk.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", pk.getCodiceImpianto(), java.sql.Types.NUMERIC);

		List<SigitTCompCgDto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTCompCgDaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTCompCgDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTCompCgDaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTCompCgDaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

	/** 
	 * Implementazione del finder componentiCancellate
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTCompCgDto> findComponentiCancellate(
			it.csi.sigit.sigitwebn.business.dao.sigitwebn.filter.CompFilter input) throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::findComponentiCancellate] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POTENZA_ELETTRICA_KW,TEMP_H2O_OUT_MIN,TEMP_H2O_OUT_MAX,TEMP_H2O_IN_MIN,TEMP_H2O_IN_MAX,TEMP_H2O_MOTORE_MIN,TEMP_H2O_MOTORE_MAX,TEMP_FUMI_VALLE_MIN,TEMP_FUMI_VALLE_MAX,TEMP_FUMI_MONTE_MIN,TEMP_FUMI_MONTE_MAX,CO_MIN,CO_MAX,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,ALIMENTAZIONE,NOTE,TEMPO_MANUT_ANNI ");
		sql.append(" FROM SIGIT_T_COMP_CG");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-1576185205) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)

		sql.append("CODICE_IMPIANTO = :codImpianto");

		sql.append(" AND ID_TIPO_COMPONENTE = :tipoComponente");

		if (GenericUtil.isNotNullOrEmpty(input.getProgressivo()))
			sql.append(" AND PROGRESSIVO = :progressivo");

		if (input.getListDateInstallazione() != null && !input.getListDateInstallazione().isEmpty()) {
			sql.append(" AND TO_CHAR(DATA_INSTALL,'DD/MM/YYYY') NOT IN  (");
			boolean aggVirg = false;
			for (String data : input.getListDateInstallazione()) {
				if (aggVirg)
					sql.append(", ");
				sql.append(" '" + data + "'");
				aggVirg = true;
			}
			sql.append(") ");
		}

		if (input.getListProgressivi() != null && !input.getListProgressivi().isEmpty()) {
			sql.append(" AND PROGRESSIVO NOT IN  (");
			boolean aggVirg = false;
			for (String progr : input.getListProgressivi()) {
				if (aggVirg)
					sql.append(", ");
				sql.append(progr);
				aggVirg = true;
			}
			sql.append(") ");
		}

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-736537321) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("codImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);
		paramMap.addValue("tipoComponente", input.getTipoComponente(), java.sql.Types.VARCHAR);
		paramMap.addValue("progressivo", input.getProgressivo(), java.sql.Types.NUMERIC);

		/*PROTECTED REGION END*/
		List<SigitTCompCgDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, componentiCancellateRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTCompCgDaoImpl::findComponentiCancellate] esecuzione query", ex);
			throw new SigitTCompCgDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTCompCgDaoImpl", "findComponentiCancellate", "esecuzione query",
					sql.toString());
			LOG.debug("[SigitTCompCgDaoImpl::findComponentiCancellate] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byExample
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTCompCgDto> findByExample(it.csi.sigit.sigitwebn.business.dao.sigitwebn.filter.CompFilter input)
			throws SigitTCompCgDaoException {
		LOG.debug("[SigitTCompCgDaoImpl::findByExample] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_TIPO_COMPONENTE,PROGRESSIVO,DATA_INSTALL,CODICE_IMPIANTO,TIPOLOGIA,POTENZA_ELETTRICA_KW,TEMP_H2O_OUT_MIN,TEMP_H2O_OUT_MAX,TEMP_H2O_IN_MIN,TEMP_H2O_IN_MAX,TEMP_H2O_MOTORE_MIN,TEMP_H2O_MOTORE_MAX,TEMP_FUMI_VALLE_MIN,TEMP_FUMI_VALLE_MAX,TEMP_FUMI_MONTE_MIN,TEMP_FUMI_MONTE_MAX,CO_MIN,CO_MAX,DATA_DISMISS,FLG_DISMISSIONE,DATA_ULT_MOD,UTENTE_ULT_MOD,FK_MARCA,FK_COMBUSTIBILE,MATRICOLA,MODELLO,POTENZA_TERMICA_KW,ALIMENTAZIONE,NOTE,TEMPO_MANUT_ANNI ");
		sql.append(" FROM SIGIT_T_COMP_CG");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R1048680528) ENABLED START*/
		sql.append(" 1 = 1 ");

		if (input.getCodImpianto() != null) {
			sql.append(" AND CODICE_IMPIANTO = :codiceImpianto");
		}

		if (input.getProgressivo() != null) {
			sql.append(" AND PROGRESSIVO = :progressivo");
		}

		if (input.getDataInstallazione() != null) {
			sql.append(" AND DATA_INSTALL = :dataInstall");
		}

		sql.append(" AND ID_TIPO_COMPONENTE = '" + it.csi.sigit.sigitwebn.util.Constants.TIPO_COMPONENTE_CG + "'");

		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R-970078222) ENABLED START*/
		//***aggiungere tutte le condizioni

		if (input.getCodImpianto() != null) {
			paramMap.addValue("codiceImpianto", input.getCodImpianto(), java.sql.Types.NUMERIC);
		}

		if (input.getDataInstallazione() != null) {
			paramMap.addValue("dataInstall", input.getDataInstallazione(), java.sql.Types.DATE);
		}

		if (input.getProgressivo() != null) {
			paramMap.addValue("progressivo", input.getProgressivo(), java.sql.Types.NUMERIC);
		}

		sql.append(" ORDER BY PROGRESSIVO ASC, DATA_INSTALL DESC");

		/*PROTECTED REGION END*/
		List<SigitTCompCgDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byExampleRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTCompCgDaoImpl::findByExample] esecuzione query", ex);
			throw new SigitTCompCgDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTCompCgDaoImpl", "findByExample", "esecuzione query", sql.toString());
			LOG.debug("[SigitTCompCgDaoImpl::findByExample] END");
		}
		return list;
	}

}
