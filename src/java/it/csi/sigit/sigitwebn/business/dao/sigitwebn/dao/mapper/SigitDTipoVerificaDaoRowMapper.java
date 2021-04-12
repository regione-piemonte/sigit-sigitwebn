package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitDTipoVerificaDao
 * @generated
 */
public class SigitDTipoVerificaDaoRowMapper extends BaseDaoRowMapper
		implements
			org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitDTipoVerificaDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitDTipoVerificaDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitDTipoVerificaDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitDTipoVerificaDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitDTipoVerificaDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitDTipoVerificaDto) {
			return mapRow_internal((SigitDTipoVerificaDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitDTipoVerificaDto mapRow_internal(SigitDTipoVerificaDto objectToFill, ResultSet rs, int row)
			throws SQLException {
		SigitDTipoVerificaDto dto = objectToFill;

		// colonna [ID_TIPO_VERIFICA]
		if (mapAllColumns || columnsToReadMap.get("ID_TIPO_VERIFICA") != null)
			dto.setIdTipoVerifica((Integer) rs.getObject("ID_TIPO_VERIFICA"));

		// colonna [DES_TIPO_VERIFICA]
		if (mapAllColumns || columnsToReadMap.get("DES_TIPO_VERIFICA") != null)
			dto.setDesTipoVerifica(rs.getString("DES_TIPO_VERIFICA"));

		return dto;
	}

}
