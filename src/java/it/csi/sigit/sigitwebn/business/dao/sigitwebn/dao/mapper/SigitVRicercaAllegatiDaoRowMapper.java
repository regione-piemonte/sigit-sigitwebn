package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitVRicercaAllegatiDao
 * @generated
 */
public class SigitVRicercaAllegatiDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitVRicercaAllegatiDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitVRicercaAllegatiDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitVRicercaAllegatiDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitVRicercaAllegatiDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVRicercaAllegatiDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitVRicercaAllegatiDto) {
			return mapRow_internal((SigitVRicercaAllegatiDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto) {
			return mapRow_internal((SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitVRicercaAllegatiDto mapRow_internal(SigitVRicercaAllegatiDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitVRicercaAllegatiDto dto = objectToFill;

		// colonna [ID_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("ID_ALLEGATO") != null)
			dto.setIdAllegato(rs.getBigDecimal("ID_ALLEGATO"));

		// colonna [FK_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO_RAPP") != null)
			dto.setFkStatoRapp(rs.getBigDecimal("FK_STATO_RAPP"));

		// colonna [FK_ISPEZ_ISPET]
		if (mapAllColumns || columnsToReadMap.get("FK_ISPEZ_ISPET") != null)
			dto.setFkIspezIspet(rs.getBigDecimal("FK_ISPEZ_ISPET"));

		// colonna [FK_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_DOCUMENTO") != null)
			dto.setFkTipoDocumento(rs.getBigDecimal("FK_TIPO_DOCUMENTO"));

		// colonna [FK_SIGLA_BOLLINO]
		if (mapAllColumns || columnsToReadMap.get("FK_SIGLA_BOLLINO") != null)
			dto.setFkSiglaBollino(rs.getString("FK_SIGLA_BOLLINO"));

		// colonna [FK_NUMERO_BOLLINO]
		if (mapAllColumns || columnsToReadMap.get("FK_NUMERO_BOLLINO") != null)
			dto.setFkNumeroBollino(rs.getBigDecimal("FK_NUMERO_BOLLINO"));

		// colonna [DATA_CONTROLLO]
		if (mapAllColumns || columnsToReadMap.get("DATA_CONTROLLO") != null)
			dto.setDataControllo(rs.getDate("DATA_CONTROLLO"));

		// colonna [B_FLG_LIBRETTO_USO]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIBRETTO_USO") != null)
			dto.setBFlgLibrettoUso(rs.getBigDecimal("B_FLG_LIBRETTO_USO"));

		// colonna [B_FLG_DICHIAR_CONFORM]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_DICHIAR_CONFORM") != null)
			dto.setBFlgDichiarConform(rs.getBigDecimal("B_FLG_DICHIAR_CONFORM"));

		// colonna [B_FLG_LIB_IMP]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIB_IMP") != null)
			dto.setBFlgLibImp(rs.getBigDecimal("B_FLG_LIB_IMP"));

		// colonna [B_FLG_LIB_COMPL]
		if (mapAllColumns || columnsToReadMap.get("B_FLG_LIB_COMPL") != null)
			dto.setBFlgLibCompl(rs.getBigDecimal("B_FLG_LIB_COMPL"));

		// colonna [F_OSSERVAZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_OSSERVAZIONI") != null)
			dto.setFOsservazioni(rs.getString("F_OSSERVAZIONI"));

		// colonna [F_RACCOMANDAZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_RACCOMANDAZIONI") != null)
			dto.setFRaccomandazioni(rs.getString("F_RACCOMANDAZIONI"));

		// colonna [F_PRESCRIZIONI]
		if (mapAllColumns || columnsToReadMap.get("F_PRESCRIZIONI") != null)
			dto.setFPrescrizioni(rs.getString("F_PRESCRIZIONI"));

		// colonna [F_FLG_PUO_FUNZIONARE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_PUO_FUNZIONARE") != null)
			dto.setFFlgPuoFunzionare(rs.getBigDecimal("F_FLG_PUO_FUNZIONARE"));

		// colonna [F_INTERVENTO_ENTRO]
		if (mapAllColumns || columnsToReadMap.get("F_INTERVENTO_ENTRO") != null)
			dto.setFInterventoEntro(rs.getDate("F_INTERVENTO_ENTRO"));

		// colonna [F_ORA_ARRIVO]
		if (mapAllColumns || columnsToReadMap.get("F_ORA_ARRIVO") != null)
			dto.setFOraArrivo(rs.getString("F_ORA_ARRIVO"));

		// colonna [F_ORA_PARTENZA]
		if (mapAllColumns || columnsToReadMap.get("F_ORA_PARTENZA") != null)
			dto.setFOraPartenza(rs.getString("F_ORA_PARTENZA"));

		// colonna [F_DENOMINAZ_TECNICO]
		if (mapAllColumns || columnsToReadMap.get("F_DENOMINAZ_TECNICO") != null)
			dto.setFDenominazTecnico(rs.getString("F_DENOMINAZ_TECNICO"));

		// colonna [F_FLG_FIRMA_TECNICO]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_FIRMA_TECNICO") != null)
			dto.setFFlgFirmaTecnico(rs.getBigDecimal("F_FLG_FIRMA_TECNICO"));

		// colonna [F_FLG_FIRMA_RESPONSABILE]
		if (mapAllColumns || columnsToReadMap.get("F_FLG_FIRMA_RESPONSABILE") != null)
			dto.setFFlgFirmaResponsabile(rs.getBigDecimal("F_FLG_FIRMA_RESPONSABILE"));

		// colonna [DATA_INVIO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INVIO") != null)
			dto.setDataInvio(rs.getDate("DATA_INVIO"));

		// colonna [DATA_RESPINTA]
		if (mapAllColumns || columnsToReadMap.get("DATA_RESPINTA") != null)
			dto.setDataRespinta(rs.getDate("DATA_RESPINTA"));

		// colonna [NOME_ALLEGATO]
		if (mapAllColumns || columnsToReadMap.get("NOME_ALLEGATO") != null)
			dto.setNomeAllegato(rs.getString("NOME_ALLEGATO"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [DES_RUOLO]
		if (mapAllColumns || columnsToReadMap.get("DES_RUOLO") != null)
			dto.setDesRuolo(rs.getString("DES_RUOLO"));

		// colonna [RUOLO_FUNZ]
		if (mapAllColumns || columnsToReadMap.get("RUOLO_FUNZ") != null)
			dto.setRuoloFunz(rs.getString("RUOLO_FUNZ"));

		// colonna [ID_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("ID_PERSONA_GIURIDICA") != null)
			dto.setIdPersonaGiuridica(rs.getBigDecimal("ID_PERSONA_GIURIDICA"));

		// colonna [PG_DENOMINAZIONE]
		if (mapAllColumns || columnsToReadMap.get("PG_DENOMINAZIONE") != null)
			dto.setPgDenominazione(rs.getString("PG_DENOMINAZIONE"));

		// colonna [PG_CODICE_FISCALE]
		if (mapAllColumns || columnsToReadMap.get("PG_CODICE_FISCALE") != null)
			dto.setPgCodiceFiscale(rs.getString("PG_CODICE_FISCALE"));

		// colonna [PG_SIGLA_REA]
		if (mapAllColumns || columnsToReadMap.get("PG_SIGLA_REA") != null)
			dto.setPgSiglaRea(rs.getString("PG_SIGLA_REA"));

		// colonna [PG_NUMERO_REA]
		if (mapAllColumns || columnsToReadMap.get("PG_NUMERO_REA") != null)
			dto.setPgNumeroRea(rs.getBigDecimal("PG_NUMERO_REA"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [COMUNE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("COMUNE_IMPIANTO") != null)
			dto.setComuneImpianto(rs.getString("COMUNE_IMPIANTO"));

		// colonna [SIGLA_PROV_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("SIGLA_PROV_IMPIANTO") != null)
			dto.setSiglaProvImpianto(rs.getString("SIGLA_PROV_IMPIANTO"));

		// colonna [INDIRIZZO_UNITA_IMMOB]
		if (mapAllColumns || columnsToReadMap.get("INDIRIZZO_UNITA_IMMOB") != null)
			dto.setIndirizzoUnitaImmob(rs.getString("INDIRIZZO_UNITA_IMMOB"));

		// colonna [CIVICO_UNITA_IMMOB]
		if (mapAllColumns || columnsToReadMap.get("CIVICO_UNITA_IMMOB") != null)
			dto.setCivicoUnitaImmob(rs.getString("CIVICO_UNITA_IMMOB"));

		// colonna [DES_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_DOCUMENTO") != null)
			dto.setDesTipoDocumento(rs.getString("DES_TIPO_DOCUMENTO"));

		// colonna [DES_STATO_RAPP]
		if (mapAllColumns || columnsToReadMap.get("DES_STATO_RAPP") != null)
			dto.setDesStatoRapp(rs.getString("DES_STATO_RAPP"));

		// colonna [FLG_CONTROLLO_BOZZA]
		if (mapAllColumns || columnsToReadMap.get("FLG_CONTROLLO_BOZZA") != null)
			dto.setFlgControlloBozza(rs.getBigDecimal("FLG_CONTROLLO_BOZZA"));

		// colonna [UID_INDEX]
		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setUidIndex(rs.getString("UID_INDEX"));

		// colonna [ELENCO_COMBUSTIBILI]
		if (mapAllColumns || columnsToReadMap.get("ELENCO_COMBUSTIBILI") != null)
			dto.setElencoCombustibili(rs.getString("ELENCO_COMBUSTIBILI"));

		// colonna [ELENCO_APPARECCHIATURE]
		if (mapAllColumns || columnsToReadMap.get("ELENCO_APPARECCHIATURE") != null)
			dto.setElencoApparecchiature(rs.getString("ELENCO_APPARECCHIATURE"));

		// colonna [FK_PG_CAT]
		if (mapAllColumns || columnsToReadMap.get("FK_PG_CAT") != null)
			dto.setFkPgCat(rs.getBigDecimal("FK_PG_CAT"));

		// colonna [PG_FK_STATO_PG]
		if (mapAllColumns || columnsToReadMap.get("PG_FK_STATO_PG") != null)
			dto.setPgFkStatoPg((Integer) rs.getObject("PG_FK_STATO_PG"));

		// colonna [ID_TIPO_MANUTENZIONE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_MANUTENZIONE") != null)
			dto.setIdTipoManutenzione(rs.getBigDecimal("ID_TIPO_MANUTENZIONE"));

		// colonna [DES_TIPO_MANUTENZIONE]
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_MANUTENZIONE") != null)
			dto.setDesTipoManutenzione(rs.getString("DES_TIPO_MANUTENZIONE"));

		// colonna [ALTRO_DESCR]
		if (mapAllColumns || columnsToReadMap.get("ALTRO_DESCR") != null)
			dto.setAltroDescr(rs.getString("ALTRO_DESCR"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto
	 * @generated
	 */

	public SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto mapRow_internal(
			SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitVRicercaAllegatiByCodiceImpiantoCountVerificheDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("IDALLEGATO") != null)
			dto.setIdallegato(rs.getBigDecimal("idallegato"));

		if (mapAllColumns || columnsToReadMap.get("DATACONTROLLO") != null)
			dto.setDatacontrollo(rs.getDate("datacontrollo"));

		if (mapAllColumns || columnsToReadMap.get("DESCDOCUMENTO") != null)
			dto.setDescdocumento(rs.getString("descdocumento"));

		if (mapAllColumns || columnsToReadMap.get("DESCSTATORAPP") != null)
			dto.setDescstatorapp(rs.getString("descstatorapp"));

		if (mapAllColumns || columnsToReadMap.get("OSSERVAZIONI") != null)
			dto.setOsservazioni(rs.getString("osservazioni"));

		if (mapAllColumns || columnsToReadMap.get("RACCOMANDAZIONI") != null)
			dto.setRaccomandazioni(rs.getString("raccomandazioni"));

		if (mapAllColumns || columnsToReadMap.get("PRESCRIZIONI") != null)
			dto.setPrescrizioni(rs.getString("prescrizioni"));

		if (mapAllColumns || columnsToReadMap.get("INTERV") != null)
			dto.setInterv(rs.getDate("interv"));

		if (mapAllColumns || columnsToReadMap.get("ELENCOAPP") != null)
			dto.setElencoapp(rs.getString("elencoapp"));

		if (mapAllColumns || columnsToReadMap.get("NUM_VERIFICHE") != null)
			dto.setNum_verifiche(rs.getBigDecimal("num_verifiche"));

		return dto;
	}

}
