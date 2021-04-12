package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitRComp4ManutDao
 * @generated
 */
public class SigitRComp4ManutDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitRComp4ManutDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitRComp4ManutDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitRComp4ManutDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitRComp4ManutDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitRComp4ManutDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitRComp4ManutDto) {
			return mapRow_internal((SigitRComp4ManutDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof SigitRComp4ManutManutentoriByCodiceImpiantoDto) {
			return mapRow_internal((SigitRComp4ManutManutentoriByCodiceImpiantoDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitRComp4ManutDto mapRow_internal(SigitRComp4ManutDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitRComp4ManutDto dto = objectToFill;

		// colonna [ID_R_COMP4_MANUT]
		if (mapAllColumns || columnsToReadMap.get("ID_R_COMP4_MANUT") != null)
			dto.setIdRComp4Manut((Integer) rs.getObject("ID_R_COMP4_MANUT"));

		// colonna [FK_PERSONA_GIURIDICA]
		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_GIURIDICA") != null)
			dto.setFkPersonaGiuridica(rs.getBigDecimal("FK_PERSONA_GIURIDICA"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		// colonna [ID_TIPO_COMPONENTE]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		// colonna [PROGRESSIVO]
		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		// colonna [DATA_INIZIO]
		if (mapAllColumns || columnsToReadMap.get("DATA_INIZIO") != null)
			dto.setDataInizio(rs.getDate("DATA_INIZIO"));

		// colonna [DATA_FINE]
		if (mapAllColumns || columnsToReadMap.get("DATA_FINE") != null)
			dto.setDataFine(rs.getDate("DATA_FINE"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [FK_RUOLO]
		if (mapAllColumns || columnsToReadMap.get("FK_RUOLO") != null)
			dto.setFkRuolo(rs.getBigDecimal("FK_RUOLO"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom SigitRComp4ManutManutentoriByCodiceImpiantoDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitRComp4ManutManutentoriByCodiceImpiantoDto
	 * @generated
	 */

	public SigitRComp4ManutManutentoriByCodiceImpiantoDto mapRow_internal(
			SigitRComp4ManutManutentoriByCodiceImpiantoDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitRComp4ManutManutentoriByCodiceImpiantoDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("CODICE_FISCALE") != null)
			dto.setPgCodiceFiscale(rs.getString("CODICE_FISCALE"));

		if (mapAllColumns || columnsToReadMap.get("SIGLA_REA") != null)
			dto.setPgSiglaRea(rs.getString("SIGLA_REA"));

		if (mapAllColumns || columnsToReadMap.get("NUMERO_REA") != null)
			dto.setPgNumeroRea(rs.getBigDecimal("NUMERO_REA"));

		if (mapAllColumns || columnsToReadMap.get("DENOMINAZIONE") != null)
			dto.setPgDenominazione(rs.getString("DENOMINAZIONE"));

		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_DOCUMENTO") != null)
			dto.setTdDesTipoDocumento(rs.getString("DES_TIPO_DOCUMENTO"));

		if (mapAllColumns || columnsToReadMap.get("PROGRESSIVO") != null)
			dto.setCmProgressivo(rs.getBigDecimal("PROGRESSIVO"));

		if (mapAllColumns || columnsToReadMap.get("FK_PERSONA_GIURIDICA") != null)
			dto.setCmFkPersonaGiuridica(rs.getBigDecimal("FK_PERSONA_GIURIDICA"));

		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_COMPONENTE") != null)
			dto.setCmIdTipoComponente(rs.getString("ID_TIPO_COMPONENTE"));

		return dto;
	}

}
