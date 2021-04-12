package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitSLibrettoDao
 * @generated
 */
public class SigitSLibrettoDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitSLibrettoDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitSLibrettoDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitSLibrettoDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitSLibrettoDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitSLibrettoDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitSLibrettoDto) {
			return mapRow_internal((SigitSLibrettoDto) dtoInstance, rs, row);
		}

		if (dtoInstance instanceof SigitSLibrettoByCodiceImpiantoNonBozzaDto) {
			return mapRow_internal((SigitSLibrettoByCodiceImpiantoNonBozzaDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitSLibrettoDto mapRow_internal(SigitSLibrettoDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitSLibrettoDto dto = objectToFill;

		// colonna [ID_LIBRETTO]
		if (mapAllColumns || columnsToReadMap.get("ID_LIBRETTO") != null)
			dto.setIdLibretto(rs.getBigDecimal("ID_LIBRETTO"));

		// colonna [FK_STATO]
		if (mapAllColumns || columnsToReadMap.get("FK_STATO") != null)
			dto.setFkStato(rs.getBigDecimal("FK_STATO"));

		// colonna [FK_MOTIVO_CONSOLID]
		if (mapAllColumns || columnsToReadMap.get("FK_MOTIVO_CONSOLID") != null)
			dto.setFkMotivoConsolid(rs.getBigDecimal("FK_MOTIVO_CONSOLID"));

		// colonna [FK_TIPO_DOCUMENTO]
		if (mapAllColumns || columnsToReadMap.get("FK_TIPO_DOCUMENTO") != null)
			dto.setFkTipoDocumento(rs.getBigDecimal("FK_TIPO_DOCUMENTO"));

		// colonna [DATA_CONSOLIDAMENTO]
		if (mapAllColumns || columnsToReadMap.get("DATA_CONSOLIDAMENTO") != null)
			dto.setDataConsolidamento(rs.getDate("DATA_CONSOLIDAMENTO"));

		// colonna [FILE_INDEX]
		if (mapAllColumns || columnsToReadMap.get("FILE_INDEX") != null)
			dto.setFileIndex(rs.getString("FILE_INDEX"));

		// colonna [UID_INDEX]
		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setUidIndex(rs.getString("UID_INDEX"));

		// colonna [CF_REDATTORE]
		if (mapAllColumns || columnsToReadMap.get("CF_REDATTORE") != null)
			dto.setCfRedattore(rs.getString("CF_REDATTORE"));

		// colonna [FLG_CONTROLLO_BOZZA]
		if (mapAllColumns || columnsToReadMap.get("FLG_CONTROLLO_BOZZA") != null)
			dto.setFlgControlloBozza(rs.getBigDecimal("FLG_CONTROLLO_BOZZA"));

		// colonna [DATA_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("DATA_ULT_MOD") != null)
			dto.setDataUltMod(rs.getTimestamp("DATA_ULT_MOD"));

		// colonna [UTENTE_ULT_MOD]
		if (mapAllColumns || columnsToReadMap.get("UTENTE_ULT_MOD") != null)
			dto.setUtenteUltMod(rs.getString("UTENTE_ULT_MOD"));

		// colonna [CODICE_IMPIANTO]
		if (mapAllColumns || columnsToReadMap.get("CODICE_IMPIANTO") != null)
			dto.setCodiceImpianto(rs.getBigDecimal("CODICE_IMPIANTO"));

		return dto;
	}

	/**
	 * Metodo specifico di mapping relativo al DTO custom SigitSLibrettoByCodiceImpiantoNonBozzaDto.
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitSLibrettoByCodiceImpiantoNonBozzaDto
	 * @generated
	 */

	public SigitSLibrettoByCodiceImpiantoNonBozzaDto mapRow_internal(
			SigitSLibrettoByCodiceImpiantoNonBozzaDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitSLibrettoByCodiceImpiantoNonBozzaDto dto = objectToFill;

		if (mapAllColumns || columnsToReadMap.get("ID_LIBRETTO") != null)
			dto.setLibIdLibretto(rs.getBigDecimal("ID_LIBRETTO"));

		if (mapAllColumns || columnsToReadMap.get("DATA_CONSOLIDAMENTO") != null)
			dto.setLibDataConsolidamento(rs.getDate("DATA_CONSOLIDAMENTO"));

		if (mapAllColumns || columnsToReadMap.get("DES_MOTIVO_CONSOLID") != null)
			dto.setMotDesMotivoConsolid(rs.getString("DES_MOTIVO_CONSOLID"));

		if (mapAllColumns || columnsToReadMap.get("FILE_INDEX") != null)
			dto.setLibFileIndex(rs.getString("FILE_INDEX"));

		if (mapAllColumns || columnsToReadMap.get("UID_INDEX") != null)
			dto.setLibUidIndex(rs.getString("UID_INDEX"));

		return dto;
	}

}
