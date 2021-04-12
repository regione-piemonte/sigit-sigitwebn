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

/*PROTECTED REGION ID(R-420611857) ENABLED START*/
// aggiungere qui eventuali import custom. 
/*PROTECTED REGION END*/

/**
 * Implementazione del DAO sigitTDettIspezGf.
 * Il DAO implementa le seguenti operazioni:
 * - INSERTER: 
 *   - (insert di default)
  * - FINDERS:
 *   - ByExample (datagen::CustomFinder)
 *   - byIdAllegato (datagen::CustomFinder)
  * - UPDATERS:
 *   - update (datagen::UpdateRow)
 *   - dettDettIspezGfComune (datagen::CustomUpdater)
 * - DELETERS:
 *   - deleteByIdAllegato (datagen::CustomDeleter)
 *
 * Le query sono realizzate utiulizzando spring-JDBCTemplate.
 * @generated
 */
public class SigitTDettIspezGfDaoImpl extends AbstractDAO implements SigitTDettIspezGfDao {
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
	 * Metodo di inserimento del DAO sigitTDettIspezGf. Al termine dell'esecuzione il metodo
	 * ritorna il valore della primary key.
	 * 
	 * @param dto
	 * @return SigitTDettIspezGfPk
	 * @generated
	 */

	public SigitTDettIspezGfPk insert(SigitTDettIspezGfDto dto)

	{
		LOG.debug("[SigitTDettIspezGfDaoImpl::insert] START");
		java.math.BigDecimal newKey = java.math.BigDecimal.valueOf(incrementer.nextLongValue());

		final String sql = "INSERT INTO " + getTableName()
				+ " ( 	ID_DETT_ISPEZ_GF,FK_ALLEGATO,FK_TIPO_COMPONENTE,PROGRESSIVO,CODICE_IMPIANTO,DATA_INSTALL,S6H_FLG_INVERTER,S6N_FLG_FUGA_DIRETTA,S6N_FLG_FUGA_INDIRETTA,S7A_FK_FREQUENZA_MANUT,S7A_FLG_MANUT_EFFETTUATA,S7A_DATA_ULTIMA_MANUT,S7B_FLG_REGISTRO_APPARECC,S7C_FLG_REE_PRESENTE,S7C_DATA_REE,S7C_FLG_OSSERVAZIONI,S7C_FLG_RACCOMAND,S7C_FLG_PRESCR,S8B_FLG_PROVE_RISCALDAMENTO,S8B_FLG_PROVE_RAFFRESCAMENTO,S8C_FLG_FILTRI_PULITI,S8D_FLG_ASSENZA_PERDITE_GAS,S8E_MARCA_STRUM_MISURA,S8E_MODELLO_STRUM_MISURA,S8E_MATRICOLA_STRUM_MISURA,S8F_POT_ASSORBITA_KW,S8G_FLG_STRUMENTAZIONE_FISSA,S8H_OPERATORE_DENOMINAZIONE,S8I_OPERATORE_NUM_ISCRIZ,S8J_SURRISCALDAMENTO_K,S8J_SOTTORAFFREDDAMENTO_K,S8J_TEMP_CONDENSAZIONE_C,S8J_TEMP_EVAPORAZIONE_C,S8J_TEMP_SORG_INGRESSO_C,S8J_TEMP_SORG_USCITA_C,S8J_TEMP_INGRESSO_FLUIDO_C,S8J_TEMP_USCITA_FLUIDO_C,S9A_FLG_VERIFICA_SUPERATA,S9B_FLG_RISPETTO_NORMATIVA,S9C_FLG_NO_RISPETTO_7A,S9C_FLG_NO_RISPETTO_7B,S9C_FLG_NO_RISPETTO_8D,S9C_FLG_NO_RISPETTO_9A,S7A_FREQUENZA_MANUT_ALTRO,S8A_N_CIRCUITO,DATA_ULT_MOD,UTENTE_ULT_MOD,CONTROLLOWEB ) VALUES (  :ID_DETT_ISPEZ_GF , :FK_ALLEGATO , :FK_TIPO_COMPONENTE , :PROGRESSIVO , :CODICE_IMPIANTO , :DATA_INSTALL , :S6H_FLG_INVERTER , :S6N_FLG_FUGA_DIRETTA , :S6N_FLG_FUGA_INDIRETTA , :S7A_FK_FREQUENZA_MANUT , :S7A_FLG_MANUT_EFFETTUATA , :S7A_DATA_ULTIMA_MANUT , :S7B_FLG_REGISTRO_APPARECC , :S7C_FLG_REE_PRESENTE , :S7C_DATA_REE , :S7C_FLG_OSSERVAZIONI , :S7C_FLG_RACCOMAND , :S7C_FLG_PRESCR , :S8B_FLG_PROVE_RISCALDAMENTO , :S8B_FLG_PROVE_RAFFRESCAMENTO , :S8C_FLG_FILTRI_PULITI , :S8D_FLG_ASSENZA_PERDITE_GAS , :S8E_MARCA_STRUM_MISURA , :S8E_MODELLO_STRUM_MISURA , :S8E_MATRICOLA_STRUM_MISURA , :S8F_POT_ASSORBITA_KW , :S8G_FLG_STRUMENTAZIONE_FISSA , :S8H_OPERATORE_DENOMINAZIONE , :S8I_OPERATORE_NUM_ISCRIZ , :S8J_SURRISCALDAMENTO_K , :S8J_SOTTORAFFREDDAMENTO_K , :S8J_TEMP_CONDENSAZIONE_C , :S8J_TEMP_EVAPORAZIONE_C , :S8J_TEMP_SORG_INGRESSO_C , :S8J_TEMP_SORG_USCITA_C , :S8J_TEMP_INGRESSO_FLUIDO_C , :S8J_TEMP_USCITA_FLUIDO_C , :S9A_FLG_VERIFICA_SUPERATA , :S9B_FLG_RISPETTO_NORMATIVA , :S9C_FLG_NO_RISPETTO_7A , :S9C_FLG_NO_RISPETTO_7B , :S9C_FLG_NO_RISPETTO_8D , :S9C_FLG_NO_RISPETTO_9A , :S7A_FREQUENZA_MANUT_ALTRO , :S8A_N_CIRCUITO , :DATA_ULT_MOD , :UTENTE_ULT_MOD , :CONTROLLOWEB  )";

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_ISPEZ_GF]
		params.addValue("ID_DETT_ISPEZ_GF", newKey, java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_ALLEGATO]
		params.addValue("FK_ALLEGATO", dto.getFkAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TIPO_COMPONENTE]
		params.addValue("FK_TIPO_COMPONENTE", dto.getFkTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S6H_FLG_INVERTER]
		params.addValue("S6H_FLG_INVERTER", dto.getS6hFlgInverter(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S6N_FLG_FUGA_DIRETTA]
		params.addValue("S6N_FLG_FUGA_DIRETTA", dto.getS6nFlgFugaDiretta(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S6N_FLG_FUGA_INDIRETTA]
		params.addValue("S6N_FLG_FUGA_INDIRETTA", dto.getS6nFlgFugaIndiretta(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_FK_FREQUENZA_MANUT]
		params.addValue("S7A_FK_FREQUENZA_MANUT", dto.getS7aFkFrequenzaManut(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [S7A_FLG_MANUT_EFFETTUATA]
		params.addValue("S7A_FLG_MANUT_EFFETTUATA", dto.getS7aFlgManutEffettuata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_DATA_ULTIMA_MANUT]
		params.addValue("S7A_DATA_ULTIMA_MANUT", dto.getS7aDataUltimaManut(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S7B_FLG_REGISTRO_APPARECC]
		params.addValue("S7B_FLG_REGISTRO_APPARECC", dto.getS7bFlgRegistroApparecc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_REE_PRESENTE]
		params.addValue("S7C_FLG_REE_PRESENTE", dto.getS7cFlgReePresente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_DATA_REE]
		params.addValue("S7C_DATA_REE", dto.getS7cDataRee(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S7C_FLG_OSSERVAZIONI]
		params.addValue("S7C_FLG_OSSERVAZIONI", dto.getS7cFlgOsservazioni(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_RACCOMAND]
		params.addValue("S7C_FLG_RACCOMAND", dto.getS7cFlgRaccomand(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_PRESCR]
		params.addValue("S7C_FLG_PRESCR", dto.getS7cFlgPrescr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8B_FLG_PROVE_RISCALDAMENTO]
		params.addValue("S8B_FLG_PROVE_RISCALDAMENTO", dto.getS8bFlgProveRiscaldamento(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8B_FLG_PROVE_RAFFRESCAMENTO]
		params.addValue("S8B_FLG_PROVE_RAFFRESCAMENTO", dto.getS8bFlgProveRaffrescamento(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8C_FLG_FILTRI_PULITI]
		params.addValue("S8C_FLG_FILTRI_PULITI", dto.getS8cFlgFiltriPuliti(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8D_FLG_ASSENZA_PERDITE_GAS]
		params.addValue("S8D_FLG_ASSENZA_PERDITE_GAS", dto.getS8dFlgAssenzaPerditeGas(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8E_MARCA_STRUM_MISURA]
		params.addValue("S8E_MARCA_STRUM_MISURA", dto.getS8eMarcaStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8E_MODELLO_STRUM_MISURA]
		params.addValue("S8E_MODELLO_STRUM_MISURA", dto.getS8eModelloStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8E_MATRICOLA_STRUM_MISURA]
		params.addValue("S8E_MATRICOLA_STRUM_MISURA", dto.getS8eMatricolaStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8F_POT_ASSORBITA_KW]
		params.addValue("S8F_POT_ASSORBITA_KW", dto.getS8fPotAssorbitaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8G_FLG_STRUMENTAZIONE_FISSA]
		params.addValue("S8G_FLG_STRUMENTAZIONE_FISSA", dto.getS8gFlgStrumentazioneFissa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8H_OPERATORE_DENOMINAZIONE]
		params.addValue("S8H_OPERATORE_DENOMINAZIONE", dto.getS8hOperatoreDenominazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8I_OPERATORE_NUM_ISCRIZ]
		params.addValue("S8I_OPERATORE_NUM_ISCRIZ", dto.getS8iOperatoreNumIscriz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8J_SURRISCALDAMENTO_K]
		params.addValue("S8J_SURRISCALDAMENTO_K", dto.getS8jSurriscaldamentoK(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_SOTTORAFFREDDAMENTO_K]
		params.addValue("S8J_SOTTORAFFREDDAMENTO_K", dto.getS8jSottoraffreddamentoK(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_CONDENSAZIONE_C]
		params.addValue("S8J_TEMP_CONDENSAZIONE_C", dto.getS8jTempCondensazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_EVAPORAZIONE_C]
		params.addValue("S8J_TEMP_EVAPORAZIONE_C", dto.getS8jTempEvaporazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_SORG_INGRESSO_C]
		params.addValue("S8J_TEMP_SORG_INGRESSO_C", dto.getS8jTempSorgIngressoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_SORG_USCITA_C]
		params.addValue("S8J_TEMP_SORG_USCITA_C", dto.getS8jTempSorgUscitaC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_INGRESSO_FLUIDO_C]
		params.addValue("S8J_TEMP_INGRESSO_FLUIDO_C", dto.getS8jTempIngressoFluidoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_USCITA_FLUIDO_C]
		params.addValue("S8J_TEMP_USCITA_FLUIDO_C", dto.getS8jTempUscitaFluidoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9A_FLG_VERIFICA_SUPERATA]
		params.addValue("S9A_FLG_VERIFICA_SUPERATA", dto.getS9aFlgVerificaSuperata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9B_FLG_RISPETTO_NORMATIVA]
		params.addValue("S9B_FLG_RISPETTO_NORMATIVA", dto.getS9bFlgRispettoNormativa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_7A]
		params.addValue("S9C_FLG_NO_RISPETTO_7A", dto.getS9cFlgNoRispetto7a(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_7B]
		params.addValue("S9C_FLG_NO_RISPETTO_7B", dto.getS9cFlgNoRispetto7b(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_8D]
		params.addValue("S9C_FLG_NO_RISPETTO_8D", dto.getS9cFlgNoRispetto8d(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_9A]
		params.addValue("S9C_FLG_NO_RISPETTO_9A", dto.getS9cFlgNoRispetto9a(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_FREQUENZA_MANUT_ALTRO]
		params.addValue("S7A_FREQUENZA_MANUT_ALTRO", dto.getS7aFrequenzaManutAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8A_N_CIRCUITO]
		params.addValue("S8A_N_CIRCUITO", dto.getS8aNCircuito(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [CONTROLLOWEB]
		params.addValue("CONTROLLOWEB", dto.getControlloweb(), java.sql.Types.TIMESTAMP);

		insert(jdbcTemplate, sql.toString(), params);

		dto.setIdDettIspezGf(newKey);
		LOG.debug("[SigitTDettIspezGfDaoImpl::insert] END");
		return dto.createPk();

	}

	/** 
	 * Updates a single row in the SIGIT_T_DETT_ISPEZ_GF table.
	 * @generated
	 */
	public void update(SigitTDettIspezGfDto dto) throws SigitTDettIspezGfDaoException {
		LOG.debug("[SigitTDettIspezGfDaoImpl::update] START");
		final String sql = "UPDATE " + getTableName()
				+ " SET FK_ALLEGATO = :FK_ALLEGATO ,FK_TIPO_COMPONENTE = :FK_TIPO_COMPONENTE ,PROGRESSIVO = :PROGRESSIVO ,CODICE_IMPIANTO = :CODICE_IMPIANTO ,DATA_INSTALL = :DATA_INSTALL ,S6H_FLG_INVERTER = :S6H_FLG_INVERTER ,S6N_FLG_FUGA_DIRETTA = :S6N_FLG_FUGA_DIRETTA ,S6N_FLG_FUGA_INDIRETTA = :S6N_FLG_FUGA_INDIRETTA ,S7A_FK_FREQUENZA_MANUT = :S7A_FK_FREQUENZA_MANUT ,S7A_FLG_MANUT_EFFETTUATA = :S7A_FLG_MANUT_EFFETTUATA ,S7A_DATA_ULTIMA_MANUT = :S7A_DATA_ULTIMA_MANUT ,S7B_FLG_REGISTRO_APPARECC = :S7B_FLG_REGISTRO_APPARECC ,S7C_FLG_REE_PRESENTE = :S7C_FLG_REE_PRESENTE ,S7C_DATA_REE = :S7C_DATA_REE ,S7C_FLG_OSSERVAZIONI = :S7C_FLG_OSSERVAZIONI ,S7C_FLG_RACCOMAND = :S7C_FLG_RACCOMAND ,S7C_FLG_PRESCR = :S7C_FLG_PRESCR ,S8B_FLG_PROVE_RISCALDAMENTO = :S8B_FLG_PROVE_RISCALDAMENTO ,S8B_FLG_PROVE_RAFFRESCAMENTO = :S8B_FLG_PROVE_RAFFRESCAMENTO ,S8C_FLG_FILTRI_PULITI = :S8C_FLG_FILTRI_PULITI ,S8D_FLG_ASSENZA_PERDITE_GAS = :S8D_FLG_ASSENZA_PERDITE_GAS ,S8E_MARCA_STRUM_MISURA = :S8E_MARCA_STRUM_MISURA ,S8E_MODELLO_STRUM_MISURA = :S8E_MODELLO_STRUM_MISURA ,S8E_MATRICOLA_STRUM_MISURA = :S8E_MATRICOLA_STRUM_MISURA ,S8F_POT_ASSORBITA_KW = :S8F_POT_ASSORBITA_KW ,S8G_FLG_STRUMENTAZIONE_FISSA = :S8G_FLG_STRUMENTAZIONE_FISSA ,S8H_OPERATORE_DENOMINAZIONE = :S8H_OPERATORE_DENOMINAZIONE ,S8I_OPERATORE_NUM_ISCRIZ = :S8I_OPERATORE_NUM_ISCRIZ ,S8J_SURRISCALDAMENTO_K = :S8J_SURRISCALDAMENTO_K ,S8J_SOTTORAFFREDDAMENTO_K = :S8J_SOTTORAFFREDDAMENTO_K ,S8J_TEMP_CONDENSAZIONE_C = :S8J_TEMP_CONDENSAZIONE_C ,S8J_TEMP_EVAPORAZIONE_C = :S8J_TEMP_EVAPORAZIONE_C ,S8J_TEMP_SORG_INGRESSO_C = :S8J_TEMP_SORG_INGRESSO_C ,S8J_TEMP_SORG_USCITA_C = :S8J_TEMP_SORG_USCITA_C ,S8J_TEMP_INGRESSO_FLUIDO_C = :S8J_TEMP_INGRESSO_FLUIDO_C ,S8J_TEMP_USCITA_FLUIDO_C = :S8J_TEMP_USCITA_FLUIDO_C ,S9A_FLG_VERIFICA_SUPERATA = :S9A_FLG_VERIFICA_SUPERATA ,S9B_FLG_RISPETTO_NORMATIVA = :S9B_FLG_RISPETTO_NORMATIVA ,S9C_FLG_NO_RISPETTO_7A = :S9C_FLG_NO_RISPETTO_7A ,S9C_FLG_NO_RISPETTO_7B = :S9C_FLG_NO_RISPETTO_7B ,S9C_FLG_NO_RISPETTO_8D = :S9C_FLG_NO_RISPETTO_8D ,S9C_FLG_NO_RISPETTO_9A = :S9C_FLG_NO_RISPETTO_9A ,S7A_FREQUENZA_MANUT_ALTRO = :S7A_FREQUENZA_MANUT_ALTRO ,S8A_N_CIRCUITO = :S8A_N_CIRCUITO ,DATA_ULT_MOD = :DATA_ULT_MOD ,UTENTE_ULT_MOD = :UTENTE_ULT_MOD ,CONTROLLOWEB = :CONTROLLOWEB  WHERE ID_DETT_ISPEZ_GF = :ID_DETT_ISPEZ_GF ";

		if (dto.getIdDettIspezGf() == null) {
			LOG.error("[SigitTDettIspezGfDaoImpl::update] ERROR chiave primaria non impostata");
			throw new SigitTDettIspezGfDaoException("Chiave primaria non impostata");
		}

		MapSqlParameterSource params = new MapSqlParameterSource();

		// valorizzazione paametro relativo a colonna [ID_DETT_ISPEZ_GF]
		params.addValue("ID_DETT_ISPEZ_GF", dto.getIdDettIspezGf(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_ALLEGATO]
		params.addValue("FK_ALLEGATO", dto.getFkAllegato(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [FK_TIPO_COMPONENTE]
		params.addValue("FK_TIPO_COMPONENTE", dto.getFkTipoComponente(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [PROGRESSIVO]
		params.addValue("PROGRESSIVO", dto.getProgressivo(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [CODICE_IMPIANTO]
		params.addValue("CODICE_IMPIANTO", dto.getCodiceImpianto(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [DATA_INSTALL]
		params.addValue("DATA_INSTALL", dto.getDataInstall(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S6H_FLG_INVERTER]
		params.addValue("S6H_FLG_INVERTER", dto.getS6hFlgInverter(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S6N_FLG_FUGA_DIRETTA]
		params.addValue("S6N_FLG_FUGA_DIRETTA", dto.getS6nFlgFugaDiretta(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S6N_FLG_FUGA_INDIRETTA]
		params.addValue("S6N_FLG_FUGA_INDIRETTA", dto.getS6nFlgFugaIndiretta(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_FK_FREQUENZA_MANUT]
		params.addValue("S7A_FK_FREQUENZA_MANUT", dto.getS7aFkFrequenzaManut(), java.sql.Types.INTEGER);

		// valorizzazione paametro relativo a colonna [S7A_FLG_MANUT_EFFETTUATA]
		params.addValue("S7A_FLG_MANUT_EFFETTUATA", dto.getS7aFlgManutEffettuata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_DATA_ULTIMA_MANUT]
		params.addValue("S7A_DATA_ULTIMA_MANUT", dto.getS7aDataUltimaManut(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S7B_FLG_REGISTRO_APPARECC]
		params.addValue("S7B_FLG_REGISTRO_APPARECC", dto.getS7bFlgRegistroApparecc(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_REE_PRESENTE]
		params.addValue("S7C_FLG_REE_PRESENTE", dto.getS7cFlgReePresente(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_DATA_REE]
		params.addValue("S7C_DATA_REE", dto.getS7cDataRee(), java.sql.Types.DATE);

		// valorizzazione paametro relativo a colonna [S7C_FLG_OSSERVAZIONI]
		params.addValue("S7C_FLG_OSSERVAZIONI", dto.getS7cFlgOsservazioni(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_RACCOMAND]
		params.addValue("S7C_FLG_RACCOMAND", dto.getS7cFlgRaccomand(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7C_FLG_PRESCR]
		params.addValue("S7C_FLG_PRESCR", dto.getS7cFlgPrescr(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8B_FLG_PROVE_RISCALDAMENTO]
		params.addValue("S8B_FLG_PROVE_RISCALDAMENTO", dto.getS8bFlgProveRiscaldamento(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8B_FLG_PROVE_RAFFRESCAMENTO]
		params.addValue("S8B_FLG_PROVE_RAFFRESCAMENTO", dto.getS8bFlgProveRaffrescamento(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8C_FLG_FILTRI_PULITI]
		params.addValue("S8C_FLG_FILTRI_PULITI", dto.getS8cFlgFiltriPuliti(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8D_FLG_ASSENZA_PERDITE_GAS]
		params.addValue("S8D_FLG_ASSENZA_PERDITE_GAS", dto.getS8dFlgAssenzaPerditeGas(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8E_MARCA_STRUM_MISURA]
		params.addValue("S8E_MARCA_STRUM_MISURA", dto.getS8eMarcaStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8E_MODELLO_STRUM_MISURA]
		params.addValue("S8E_MODELLO_STRUM_MISURA", dto.getS8eModelloStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8E_MATRICOLA_STRUM_MISURA]
		params.addValue("S8E_MATRICOLA_STRUM_MISURA", dto.getS8eMatricolaStrumMisura(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8F_POT_ASSORBITA_KW]
		params.addValue("S8F_POT_ASSORBITA_KW", dto.getS8fPotAssorbitaKw(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8G_FLG_STRUMENTAZIONE_FISSA]
		params.addValue("S8G_FLG_STRUMENTAZIONE_FISSA", dto.getS8gFlgStrumentazioneFissa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8H_OPERATORE_DENOMINAZIONE]
		params.addValue("S8H_OPERATORE_DENOMINAZIONE", dto.getS8hOperatoreDenominazione(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8I_OPERATORE_NUM_ISCRIZ]
		params.addValue("S8I_OPERATORE_NUM_ISCRIZ", dto.getS8iOperatoreNumIscriz(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8J_SURRISCALDAMENTO_K]
		params.addValue("S8J_SURRISCALDAMENTO_K", dto.getS8jSurriscaldamentoK(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_SOTTORAFFREDDAMENTO_K]
		params.addValue("S8J_SOTTORAFFREDDAMENTO_K", dto.getS8jSottoraffreddamentoK(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_CONDENSAZIONE_C]
		params.addValue("S8J_TEMP_CONDENSAZIONE_C", dto.getS8jTempCondensazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_EVAPORAZIONE_C]
		params.addValue("S8J_TEMP_EVAPORAZIONE_C", dto.getS8jTempEvaporazioneC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_SORG_INGRESSO_C]
		params.addValue("S8J_TEMP_SORG_INGRESSO_C", dto.getS8jTempSorgIngressoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_SORG_USCITA_C]
		params.addValue("S8J_TEMP_SORG_USCITA_C", dto.getS8jTempSorgUscitaC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_INGRESSO_FLUIDO_C]
		params.addValue("S8J_TEMP_INGRESSO_FLUIDO_C", dto.getS8jTempIngressoFluidoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S8J_TEMP_USCITA_FLUIDO_C]
		params.addValue("S8J_TEMP_USCITA_FLUIDO_C", dto.getS8jTempUscitaFluidoC(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9A_FLG_VERIFICA_SUPERATA]
		params.addValue("S9A_FLG_VERIFICA_SUPERATA", dto.getS9aFlgVerificaSuperata(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9B_FLG_RISPETTO_NORMATIVA]
		params.addValue("S9B_FLG_RISPETTO_NORMATIVA", dto.getS9bFlgRispettoNormativa(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_7A]
		params.addValue("S9C_FLG_NO_RISPETTO_7A", dto.getS9cFlgNoRispetto7a(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_7B]
		params.addValue("S9C_FLG_NO_RISPETTO_7B", dto.getS9cFlgNoRispetto7b(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_8D]
		params.addValue("S9C_FLG_NO_RISPETTO_8D", dto.getS9cFlgNoRispetto8d(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S9C_FLG_NO_RISPETTO_9A]
		params.addValue("S9C_FLG_NO_RISPETTO_9A", dto.getS9cFlgNoRispetto9a(), java.sql.Types.NUMERIC);

		// valorizzazione paametro relativo a colonna [S7A_FREQUENZA_MANUT_ALTRO]
		params.addValue("S7A_FREQUENZA_MANUT_ALTRO", dto.getS7aFrequenzaManutAltro(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [S8A_N_CIRCUITO]
		params.addValue("S8A_N_CIRCUITO", dto.getS8aNCircuito(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [DATA_ULT_MOD]
		params.addValue("DATA_ULT_MOD", dto.getDataUltMod(), java.sql.Types.TIMESTAMP);

		// valorizzazione paametro relativo a colonna [UTENTE_ULT_MOD]
		params.addValue("UTENTE_ULT_MOD", dto.getUtenteUltMod(), java.sql.Types.VARCHAR);

		// valorizzazione paametro relativo a colonna [CONTROLLOWEB]
		params.addValue("CONTROLLOWEB", dto.getControlloweb(), java.sql.Types.TIMESTAMP);

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTDettIspezGfDaoImpl::update] END");
	}

	/** 
	 * Custom updater in the SIGIT_T_DETT_ISPEZ_GF table.
	 * @generated
	 */
	public void customUpdaterDettDettIspezGfComune(
			it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTDettIspezGfDto filter,
			it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTDettIspezGfDto value)
			throws SigitTDettIspezGfDaoException {
		LOG.debug("[SigitTDettIspezGfDaoImpl::customUpdaterDettDettIspezGfComune] START");
		/*PROTECTED REGION ID(R-372301592) ENABLED START*/
		//***scrivere la custom query
		final String sql = "UPDATE " + getTableName() + " SET " + " S6H_FLG_INVERTER = :S6H_FLG_INVERTER ,"
				+ " S6N_FLG_FUGA_DIRETTA = :S6N_FLG_FUGA_DIRETTA ,"
				+ " S6N_FLG_FUGA_INDIRETTA = :S6N_FLG_FUGA_INDIRETTA ,"
				+ " S7A_FK_FREQUENZA_MANUT = :S7A_FK_FREQUENZA_MANUT ,"
				+ " S7A_FLG_MANUT_EFFETTUATA = :S7A_FLG_MANUT_EFFETTUATA ,"
				+ " S7A_DATA_ULTIMA_MANUT = :S7A_DATA_ULTIMA_MANUT ,"
				+ " S7B_FLG_REGISTRO_APPARECC = :S7B_FLG_REGISTRO_APPARECC ,"
				+ " S7C_FLG_REE_PRESENTE = :S7C_FLG_REE_PRESENTE ," + " S7C_DATA_REE = :S7C_DATA_REE ,"
				+ " S7C_FLG_OSSERVAZIONI = :S7C_FLG_OSSERVAZIONI ," + " S7C_FLG_RACCOMAND = :S7C_FLG_RACCOMAND ,"
				+ " S7C_FLG_PRESCR = :S7C_FLG_PRESCR ," + " S7A_FREQUENZA_MANUT_ALTRO = :S7A_FREQUENZA_MANUT_ALTRO "
				+ " WHERE ID_DETT_ISPEZ_GF <> :ID_DETT_ISPEZ_GF " + " AND FK_ALLEGATO = :FK_ALLEGATO "
				+ " AND FK_TIPO_COMPONENTE = :FK_TIPO_COMPONENTE " + " AND PROGRESSIVO = :PROGRESSIVO "
				+ " AND CODICE_IMPIANTO = :CODICE_IMPIANTO " + " AND DATA_INSTALL = :DATA_INSTALL";

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("parametro", value);

		params.addValue("ID_DETT_ISPEZ_GF", filter.getIdDettIspezGf(), java.sql.Types.NUMERIC);
		params.addValue("FK_ALLEGATO", filter.getFkAllegato(), java.sql.Types.NUMERIC);
		params.addValue("FK_TIPO_COMPONENTE", filter.getFkTipoComponente(), java.sql.Types.VARCHAR);
		params.addValue("PROGRESSIVO", filter.getProgressivo(), java.sql.Types.NUMERIC);
		params.addValue("CODICE_IMPIANTO", filter.getCodiceImpianto(), java.sql.Types.NUMERIC);
		params.addValue("DATA_INSTALL", filter.getDataInstall(), java.sql.Types.DATE);

		params.addValue("S6H_FLG_INVERTER", value.getS6hFlgInverter(), java.sql.Types.NUMERIC);
		params.addValue("S6N_FLG_FUGA_DIRETTA", value.getS6nFlgFugaDiretta(), java.sql.Types.NUMERIC);
		params.addValue("S6N_FLG_FUGA_INDIRETTA", value.getS6nFlgFugaIndiretta(), java.sql.Types.NUMERIC);
		params.addValue("S7A_FK_FREQUENZA_MANUT", value.getS7aFkFrequenzaManut(), java.sql.Types.INTEGER);
		params.addValue("S7A_FLG_MANUT_EFFETTUATA", value.getS7aFlgManutEffettuata(), java.sql.Types.NUMERIC);
		params.addValue("S7A_DATA_ULTIMA_MANUT", value.getS7aDataUltimaManut(), java.sql.Types.DATE);
		params.addValue("S7B_FLG_REGISTRO_APPARECC", value.getS7bFlgRegistroApparecc(), java.sql.Types.NUMERIC);
		params.addValue("S7C_FLG_REE_PRESENTE", value.getS7cFlgReePresente(), java.sql.Types.NUMERIC);
		params.addValue("S7C_DATA_REE", value.getS7cDataRee(), java.sql.Types.DATE);
		params.addValue("S7C_FLG_OSSERVAZIONI", value.getS7cFlgOsservazioni(), java.sql.Types.NUMERIC);
		params.addValue("S7C_FLG_RACCOMAND", value.getS7cFlgRaccomand(), java.sql.Types.NUMERIC);
		params.addValue("S7C_FLG_PRESCR", value.getS7cFlgPrescr(), java.sql.Types.NUMERIC);
		params.addValue("S7A_FREQUENZA_MANUT_ALTRO", value.getS7aFrequenzaManutAltro(), java.sql.Types.VARCHAR);
		/*PROTECTED REGION END*/

		update(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTDettIspezGfDaoImpl::customUpdaterDettDettIspezGfComune] END");
	}

	/** 
	 * Custom deleter in the SIGIT_T_DETT_ISPEZ_GF table.
	 * @generated
	 */
	public void customDeleterDeleteByIdAllegato(java.lang.Integer filter) throws SigitTDettIspezGfDaoException {
		LOG.debug("[SigitTDettIspezGfDaoImpl::customDeleterDeleteByIdAllegato] START");
		/*PROTECTED REGION ID(R614468237) ENABLED START*/
		//***scrivere la custom query
		final String sql = "DELETE FROM " + getTableName() + " WHERE FK_ALLEGATO = :idAllegato";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("idAllegato", filter);
		/*PROTECTED REGION END*/

		delete(jdbcTemplate, sql.toString(), params);
		LOG.debug("[SigitTDettIspezGfDaoImpl::customDeleterDeleteByIdAllegato] END");
	}

	protected SigitTDettIspezGfDaoRowMapper ByExampleRowMapper = new SigitTDettIspezGfDaoRowMapper(null,
			SigitTDettIspezGfDto.class, this);

	protected SigitTDettIspezGfDaoRowMapper byIdAllegatoRowMapper = new SigitTDettIspezGfDaoRowMapper(null,
			SigitTDettIspezGfDto.class, this);

	/**
	 * 
	 * Restituisce il nome della tabella su cui opera il DAO
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_DETT_ISPEZ_GF";
	}

	/** 
	 * Implementazione del finder ByExample
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTDettIspezGfDto> findByExample(
			it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTDettIspezGfDto input)
			throws SigitTDettIspezGfDaoException {
		LOG.debug("[SigitTDettIspezGfDaoImpl::findByExample] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_DETT_ISPEZ_GF,FK_ALLEGATO,FK_TIPO_COMPONENTE,PROGRESSIVO,CODICE_IMPIANTO,DATA_INSTALL,S6H_FLG_INVERTER,S6N_FLG_FUGA_DIRETTA,S6N_FLG_FUGA_INDIRETTA,S7A_FK_FREQUENZA_MANUT,S7A_FLG_MANUT_EFFETTUATA,S7A_DATA_ULTIMA_MANUT,S7B_FLG_REGISTRO_APPARECC,S7C_FLG_REE_PRESENTE,S7C_DATA_REE,S7C_FLG_OSSERVAZIONI,S7C_FLG_RACCOMAND,S7C_FLG_PRESCR,S8B_FLG_PROVE_RISCALDAMENTO,S8B_FLG_PROVE_RAFFRESCAMENTO,S8C_FLG_FILTRI_PULITI,S8D_FLG_ASSENZA_PERDITE_GAS,S8E_MARCA_STRUM_MISURA,S8E_MODELLO_STRUM_MISURA,S8E_MATRICOLA_STRUM_MISURA,S8F_POT_ASSORBITA_KW,S8G_FLG_STRUMENTAZIONE_FISSA,S8H_OPERATORE_DENOMINAZIONE,S8I_OPERATORE_NUM_ISCRIZ,S8J_SURRISCALDAMENTO_K,S8J_SOTTORAFFREDDAMENTO_K,S8J_TEMP_CONDENSAZIONE_C,S8J_TEMP_EVAPORAZIONE_C,S8J_TEMP_SORG_INGRESSO_C,S8J_TEMP_SORG_USCITA_C,S8J_TEMP_INGRESSO_FLUIDO_C,S8J_TEMP_USCITA_FLUIDO_C,S9A_FLG_VERIFICA_SUPERATA,S9B_FLG_RISPETTO_NORMATIVA,S9C_FLG_NO_RISPETTO_7A,S9C_FLG_NO_RISPETTO_7B,S9C_FLG_NO_RISPETTO_8D,S9C_FLG_NO_RISPETTO_9A,S7A_FREQUENZA_MANUT_ALTRO,S8A_N_CIRCUITO,DATA_ULT_MOD,UTENTE_ULT_MOD,CONTROLLOWEB ");
		sql.append(" FROM SIGIT_T_DETT_ISPEZ_GF");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R-1094917830) ENABLED START*/
		sql.append(" 1 = 1 ");

		if (input.getFkAllegato() != null) {
			sql.append(" AND FK_ALLEGATO = :idAllegato ");
		}

		if (input.getCodiceImpianto() != null) {
			sql.append(" AND CODICE_IMPIANTO = :idCodiceImpianto ");
		}

		if (input.getProgressivo() != null) {
			sql.append(" AND PROGRESSIVO = :progressivo ");
		}

		if (input.getS8aNCircuito() != null) {
			sql.append(" AND S8A_N_CIRCUITO = :circuito ");
		}

		sql.append(" ORDER BY PROGRESSIVO, TO_NUMBER(S8A_N_CIRCUITO)");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R1297849416) ENABLED START*/
		if (input.getFkAllegato() != null) {
			paramMap.addValue("idAllegato", input.getFkAllegato());
		}

		if (input.getCodiceImpianto() != null) {
			paramMap.addValue("idCodiceImpianto", input.getCodiceImpianto());
		}

		if (input.getProgressivo() != null) {
			paramMap.addValue("progressivo", input.getProgressivo());
		}

		if (input.getS8aNCircuito() != null) {
			paramMap.addValue("circuito", input.getS8aNCircuito());
		}

		/*PROTECTED REGION END*/
		List<SigitTDettIspezGfDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, ByExampleRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTDettIspezGfDaoImpl::findByExample] esecuzione query", ex);
			throw new SigitTDettIspezGfDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTDettIspezGfDaoImpl", "findByExample", "esecuzione query", sql.toString());
			LOG.debug("[SigitTDettIspezGfDaoImpl::findByExample] END");
		}
		return list;
	}

	/** 
	 * Implementazione del finder byIdAllegato
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<SigitTDettIspezGfDto> findByIdAllegato(java.math.BigDecimal input)
			throws SigitTDettIspezGfDaoException {
		LOG.debug("[SigitTDettIspezGfDaoImpl::findByIdAllegato] START");
		StringBuilder sql = new StringBuilder();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();

		sql.append(
				"SELECT ID_DETT_ISPEZ_GF,FK_ALLEGATO,FK_TIPO_COMPONENTE,PROGRESSIVO,CODICE_IMPIANTO,DATA_INSTALL,S6H_FLG_INVERTER,S6N_FLG_FUGA_DIRETTA,S6N_FLG_FUGA_INDIRETTA,S7A_FK_FREQUENZA_MANUT,S7A_FLG_MANUT_EFFETTUATA,S7A_DATA_ULTIMA_MANUT,S7B_FLG_REGISTRO_APPARECC,S7C_FLG_REE_PRESENTE,S7C_DATA_REE,S7C_FLG_OSSERVAZIONI,S7C_FLG_RACCOMAND,S7C_FLG_PRESCR,S8B_FLG_PROVE_RISCALDAMENTO,S8B_FLG_PROVE_RAFFRESCAMENTO,S8C_FLG_FILTRI_PULITI,S8D_FLG_ASSENZA_PERDITE_GAS,S8E_MARCA_STRUM_MISURA,S8E_MODELLO_STRUM_MISURA,S8E_MATRICOLA_STRUM_MISURA,S8F_POT_ASSORBITA_KW,S8G_FLG_STRUMENTAZIONE_FISSA,S8H_OPERATORE_DENOMINAZIONE,S8I_OPERATORE_NUM_ISCRIZ,S8J_SURRISCALDAMENTO_K,S8J_SOTTORAFFREDDAMENTO_K,S8J_TEMP_CONDENSAZIONE_C,S8J_TEMP_EVAPORAZIONE_C,S8J_TEMP_SORG_INGRESSO_C,S8J_TEMP_SORG_USCITA_C,S8J_TEMP_INGRESSO_FLUIDO_C,S8J_TEMP_USCITA_FLUIDO_C,S9A_FLG_VERIFICA_SUPERATA,S9B_FLG_RISPETTO_NORMATIVA,S9C_FLG_NO_RISPETTO_7A,S9C_FLG_NO_RISPETTO_7B,S9C_FLG_NO_RISPETTO_8D,S9C_FLG_NO_RISPETTO_9A,S7A_FREQUENZA_MANUT_ALTRO,S8A_N_CIRCUITO,DATA_ULT_MOD,UTENTE_ULT_MOD,CONTROLLOWEB ");
		sql.append(" FROM SIGIT_T_DETT_ISPEZ_GF");
		sql.append(" WHERE ");
		/*PROTECTED REGION ID(R813828960) ENABLED START*/
		// personalizzare la query SQL relativa al finder

		// personalizzare l'elenco dei parametri da passare al jdbctemplate (devono corrispondere in tipo e
		// numero ai parametri definiti nella queryString)
		sql.append("FK_ALLEGATO = :idAllegato");
		/*PROTECTED REGION END*/
		/*PROTECTED REGION ID(R339457762) ENABLED START*/
		//***aggiungere tutte le condizioni

		paramMap.addValue("idAllegato", input);

		/*PROTECTED REGION END*/
		List<SigitTDettIspezGfDto> list = null;
		StopWatch stopWatch = new StopWatch(Constants.APPLICATION_CODE);
		try {
			stopWatch.start();
			list = jdbcTemplate.query(sql.toString(), paramMap, byIdAllegatoRowMapper);

		} catch (RuntimeException ex) {
			LOG.error("[SigitTDettIspezGfDaoImpl::findByIdAllegato] esecuzione query", ex);
			throw new SigitTDettIspezGfDaoException("Query failed", ex);
		} finally {
			stopWatch.dumpElapsed("SigitTDettIspezGfDaoImpl", "findByIdAllegato", "esecuzione query", sql.toString());
			LOG.debug("[SigitTDettIspezGfDaoImpl::findByIdAllegato] END");
		}
		return list;
	}

}
