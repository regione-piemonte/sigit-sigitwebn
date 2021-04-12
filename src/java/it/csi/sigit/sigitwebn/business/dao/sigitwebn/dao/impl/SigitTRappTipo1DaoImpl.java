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

/*PROTECTED REGION ID(R574979983) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTRappTipo1.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - findAll (datagen::FindAll)
 *   - findByPrimaryKey (datagen::FindByPK)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 * - DELETERS:
 *   - delete (datagen::DeleteByPK)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTRappTipo1DaoImpl extends AbstractDAO implements SigitTRappTipo1Dao {
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
	 * Metodo di inserimento del DAO sigitTRappTipo1. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTRappTipo1Pk
	 * @generated
	 */

	public SigitTRappTipo1Pk insert(SigitTRappTipo1Dto dto)

	{
		LOG.debug("[SigitTRappTipo1DaoImpl::insert] START");
		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_ALLEGATO,D_FLG_LOCALE_INT_IDONEO,D_FLG_GEN_EXT_IDONEO,D_FLG_APERTURE_LIBERE,D_FLG_APERTURE_ADEG,D_FLG_SCARICO_IDONEO,D_FLG_TEMP_AMB_FUNZ,D_FLG_ASSENZA_PERD_COMB,D_FLG_IDO_TEN_IMP_INT,F_FLG_ADOZIONE_VALVOLE_TERM,F_FLG_ISOLAMENTE_RETE,F_FLG_ADOZ_SIST_TRATTAM_H2O,F_FLG_SOSTITUZ_SIST_REGOLAZ,C_FLG_TRATT_CLIMA_NON_RICH,C_FLG_TRATT_ACS_NON_RICHIESTO ) VALUES (  :ID_ALLEGATO , :D_FLG_LOCALE_INT_IDONEO , :D_FLG_GEN_EXT_IDONEO , :D_FLG_APERTURE_LIBERE , :D_FLG_APERTURE_ADEG , :D_FLG_SCARICO_IDONEO , :D_FLG_TEMP_AMB_FUNZ , :D_FLG_ASSENZA_PERD_COMB , :D_FLG_IDO_TEN_IMP_INT , :F_FLG_ADOZIONE_VALVOLE_TERM , :F_FLG_ISOLAMENTE_RETE , :F_FLG_ADOZ_SIST_TRATTAM_H2O , :F_FLG_SOSTITUZ_SIST_REGOLAZ , :C_FLG_TRATT_CLIMA_NON_RICH , :C_FLG_TRATT_ACS_NON_RICHIESTO  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", dto.getIdAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_LOCALE_INT_IDONEO]
		params.addValue("D_FLG_LOCALE_INT_IDONEO", dto.getDFlgLocaleIntIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_GEN_EXT_IDONEO]
		params.addValue("D_FLG_GEN_EXT_IDONEO", dto.getDFlgGenExtIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_LIBERE]
		params.addValue("D_FLG_APERTURE_LIBERE", dto.getDFlgApertureLibere(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_ADEG]
		params.addValue("D_FLG_APERTURE_ADEG", dto.getDFlgApertureAdeg(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_SCARICO_IDONEO]
		params.addValue("D_FLG_SCARICO_IDONEO", dto.getDFlgScaricoIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_TEMP_AMB_FUNZ]
		params.addValue("D_FLG_TEMP_AMB_FUNZ", dto.getDFlgTempAmbFunz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_ASSENZA_PERD_COMB]
		params.addValue("D_FLG_ASSENZA_PERD_COMB", dto.getDFlgAssenzaPerdComb(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_IDO_TEN_IMP_INT]
		params.addValue("D_FLG_IDO_TEN_IMP_INT", dto.getDFlgIdoTenImpInt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZIONE_VALVOLE_TERM]
		params.addValue("F_FLG_ADOZIONE_VALVOLE_TERM", dto.getFFlgAdozioneValvoleTerm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ISOLAMENTE_RETE]
		params.addValue("F_FLG_ISOLAMENTE_RETE", dto.getFFlgIsolamenteRete(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZ_SIST_TRATTAM_H2O]
		params.addValue("F_FLG_ADOZ_SIST_TRATTAM_H2O", dto.getFFlgAdozSistTrattamH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_SOSTITUZ_SIST_REGOLAZ]
		params.addValue("F_FLG_SOSTITUZ_SIST_REGOLAZ", dto.getFFlgSostituzSistRegolaz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_CLIMA_NON_RICH]
		params.addValue("C_FLG_TRATT_CLIMA_NON_RICH", dto.getCFlgTrattClimaNonRich(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_ACS_NON_RICHIESTO]
		params.addValue("C_FLG_TRATT_ACS_NON_RICHIESTO", dto.getCFlgTrattAcsNonRichiesto(), java.sql.Types.NUMERIC);

		insert(jdbcTemplate, sql.toString(), params);

		LOG.debug("[SigitTRappTipo1DaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_RAPP_TIPO1 table.
	 * @generated
	 */
	public void update(SigitTRappTipo1Dto dto) throws SigitTRappTipo1DaoException {
		LOG.debug("[SigitTRappTipo1DaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET D_FLG_LOCALE_INT_IDONEO = :D_FLG_LOCALE_INT_IDONEO ,D_FLG_GEN_EXT_IDONEO = :D_FLG_GEN_EXT_IDONEO ,D_FLG_APERTURE_LIBERE = :D_FLG_APERTURE_LIBERE ,D_FLG_APERTURE_ADEG = :D_FLG_APERTURE_ADEG ,D_FLG_SCARICO_IDONEO = :D_FLG_SCARICO_IDONEO ,D_FLG_TEMP_AMB_FUNZ = :D_FLG_TEMP_AMB_FUNZ ,D_FLG_ASSENZA_PERD_COMB = :D_FLG_ASSENZA_PERD_COMB ,D_FLG_IDO_TEN_IMP_INT = :D_FLG_IDO_TEN_IMP_INT ,F_FLG_ADOZIONE_VALVOLE_TERM = :F_FLG_ADOZIONE_VALVOLE_TERM ,F_FLG_ISOLAMENTE_RETE = :F_FLG_ISOLAMENTE_RETE ,F_FLG_ADOZ_SIST_TRATTAM_H2O = :F_FLG_ADOZ_SIST_TRATTAM_H2O ,F_FLG_SOSTITUZ_SIST_REGOLAZ = :F_FLG_SOSTITUZ_SIST_REGOLAZ ,C_FLG_TRATT_CLIMA_NON_RICH = :C_FLG_TRATT_CLIMA_NON_RICH ,C_FLG_TRATT_ACS_NON_RICHIESTO = :C_FLG_TRATT_ACS_NON_RICHIESTO  WHERE ID_ALLEGATO = :ID_ALLEGATO ";

		if (dto.getIdAllegato() == null) {
			LOG.error("[SigitTRappTipo1DaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTRappTipo1DaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", dto.getIdAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_LOCALE_INT_IDONEO]
		params.addValue("D_FLG_LOCALE_INT_IDONEO", dto.getDFlgLocaleIntIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_GEN_EXT_IDONEO]
		params.addValue("D_FLG_GEN_EXT_IDONEO", dto.getDFlgGenExtIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_LIBERE]
		params.addValue("D_FLG_APERTURE_LIBERE", dto.getDFlgApertureLibere(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_APERTURE_ADEG]
		params.addValue("D_FLG_APERTURE_ADEG", dto.getDFlgApertureAdeg(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_SCARICO_IDONEO]
		params.addValue("D_FLG_SCARICO_IDONEO", dto.getDFlgScaricoIdoneo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_TEMP_AMB_FUNZ]
		params.addValue("D_FLG_TEMP_AMB_FUNZ", dto.getDFlgTempAmbFunz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_ASSENZA_PERD_COMB]
		params.addValue("D_FLG_ASSENZA_PERD_COMB", dto.getDFlgAssenzaPerdComb(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [D_FLG_IDO_TEN_IMP_INT]
		params.addValue("D_FLG_IDO_TEN_IMP_INT", dto.getDFlgIdoTenImpInt(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZIONE_VALVOLE_TERM]
		params.addValue("F_FLG_ADOZIONE_VALVOLE_TERM", dto.getFFlgAdozioneValvoleTerm(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ISOLAMENTE_RETE]
		params.addValue("F_FLG_ISOLAMENTE_RETE", dto.getFFlgIsolamenteRete(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_ADOZ_SIST_TRATTAM_H2O]
		params.addValue("F_FLG_ADOZ_SIST_TRATTAM_H2O", dto.getFFlgAdozSistTrattamH2o(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [F_FLG_SOSTITUZ_SIST_REGOLAZ]
		params.addValue("F_FLG_SOSTITUZ_SIST_REGOLAZ", dto.getFFlgSostituzSistRegolaz(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_CLIMA_NON_RICH]
		params.addValue("C_FLG_TRATT_CLIMA_NON_RICH", dto.getCFlgTrattClimaNonRich(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [C_FLG_TRATT_ACS_NON_RICHIESTO]
		params.addValue("C_FLG_TRATT_ACS_NON_RICHIESTO", dto.getCFlgTrattAcsNonRichiesto(), java.sql.Types.NUMERIC);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTRappTipo1DaoImpl::update] END");
	}

	/** 
	 * Deletes a single row in the SIGIT_T_RAPP_TIPO1 table.
	 * @generated
	 */

	public void delete(SigitTRappTipo1Pk pk) throws SigitTRappTipo1DaoException {
		LOG.debug("[SigitTRappTipo1DaoImpl::delete] START");
		final String sql = "DELETE FROM " + getTableName() + " WHERE ID_ALLEGATO = :ID_ALLEGATO ";

		if (pk == null) {
			LOG.error("[SigitTRappTipo1DaoImpl::delete] ERROR chiave primaria non impostata");
			throw new SigitTRappTipo1DaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", pk.getIdAllegato(), java.sql.Types.NUMERIC);

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTRappTipo1DaoImpl::delete] END");
	}

	protected SigitTRappTipo1DaoRowMapper findAllRowMapper = new SigitTRappTipo1DaoRowMapper(null,
			SigitTRappTipo1Dto.class, this);

	protected SigitTRappTipo1DaoRowMapper findByPrimaryKeyRowMapper = new SigitTRappTipo1DaoRowMapper(null,
			SigitTRappTipo1Dto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_RAPP_TIPO1";
	}

	/** 
	 * Restituisce tutte le righe della tabella SIGIT_T_RAPP_TIPO1.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTRappTipo1Dto> findAll() throws SigitTRappTipo1DaoException {
		LOG.debug("[SigitTRappTipo1DaoImpl::findAll] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_ALLEGATO,D_FLG_LOCALE_INT_IDONEO,D_FLG_GEN_EXT_IDONEO,D_FLG_APERTURE_LIBERE,D_FLG_APERTURE_ADEG,D_FLG_SCARICO_IDONEO,D_FLG_TEMP_AMB_FUNZ,D_FLG_ASSENZA_PERD_COMB,D_FLG_IDO_TEN_IMP_INT,F_FLG_ADOZIONE_VALVOLE_TERM,F_FLG_ISOLAMENTE_RETE,F_FLG_ADOZ_SIST_TRATTAM_H2O,F_FLG_SOSTITUZ_SIST_REGOLAZ,C_FLG_TRATT_CLIMA_NON_RICH,C_FLG_TRATT_ACS_NON_RICHIESTO FROM "
						+ getTableName());

		MapSqlParameterSource params = new MapSqlParameterSource();

		List<SigitTRappTipo1Dto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findAllRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTRappTipo1DaoImpl::findAll] ERROR esecuzione query", ex);
			throw new SigitTRappTipo1DaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTRappTipo1DaoImpl", "findAll", "esecuzione query", sql.toString());
			LOG.debug("[SigitTRappTipo1DaoImpl::findAll] END");
		}
		return list;
	}

	/** 
	 * Returns all rows from the SIGIT_T_RAPP_TIPO1 table that match the primary key criteria
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SigitTRappTipo1Dto findByPrimaryKey(SigitTRappTipo1Pk pk) throws SigitTRappTipo1DaoException {
		LOG.debug("[SigitTRappTipo1DaoImpl::findByPrimaryKey] START");
		final StringBuilder sql = new StringBuilder(
				"SELECT ID_ALLEGATO,D_FLG_LOCALE_INT_IDONEO,D_FLG_GEN_EXT_IDONEO,D_FLG_APERTURE_LIBERE,D_FLG_APERTURE_ADEG,D_FLG_SCARICO_IDONEO,D_FLG_TEMP_AMB_FUNZ,D_FLG_ASSENZA_PERD_COMB,D_FLG_IDO_TEN_IMP_INT,F_FLG_ADOZIONE_VALVOLE_TERM,F_FLG_ISOLAMENTE_RETE,F_FLG_ADOZ_SIST_TRATTAM_H2O,F_FLG_SOSTITUZ_SIST_REGOLAZ,C_FLG_TRATT_CLIMA_NON_RICH,C_FLG_TRATT_ACS_NON_RICHIESTO FROM "
						+ getTableName() + " WHERE ID_ALLEGATO = :ID_ALLEGATO ");

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_ALLEGATO]
		params.addValue("ID_ALLEGATO", pk.getIdAllegato(), java.sql.Types.NUMERIC);

		List<SigitTRappTipo1Dto> list = null;

		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), params, findByPrimaryKeyRowMapper);
		} catch (RuntimeException ex) {
			LOG.error("[SigitTRappTipo1DaoImpl::findByPrimaryKey] ERROR esecuzione query", ex);
			throw new SigitTRappTipo1DaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTRappTipo1DaoImpl", "findByPrimaryKey", "esecuzione query", sql.toString());
			LOG.debug("[SigitTRappTipo1DaoImpl::findByPrimaryKey] END");
		}
		return list.isEmpty() ? null : list.get(0);
	}

}
