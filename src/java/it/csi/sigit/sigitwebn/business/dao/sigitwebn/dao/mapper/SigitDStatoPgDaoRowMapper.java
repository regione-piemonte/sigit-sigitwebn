package it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.mapper;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.*;
import it.csi.sigit.sigitwebn.business.dao.impl.BaseDaoRowMapper;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dao.impl.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper specifico del DAO SigitDStatoPgDao
 * @generated
 */
public class SigitDStatoPgDaoRowMapper extends BaseDaoRowMapper implements org.springframework.jdbc.core.RowMapper {

	/**
	 * Dao associato al RowMapper. Serve per i supplier DAO
	 * @generated
	 */
	SigitDStatoPgDaoImpl dao;

	/**
	 * costruttore
	 * @param columnsToRead elenco delle colonne da includere nel mapping (per query
	 *        incomplete, esempio distinct, custom select...) nella classe padre
	 */
	public SigitDStatoPgDaoRowMapper(String[] columnsToRead, Class dtoClass, SigitDStatoPgDao dao) {
		super(columnsToRead, dtoClass);
		this.dao = (SigitDStatoPgDaoImpl) dao;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SigitDStatoPgDto
	 * @generated
	 */
	public Object mapRow(ResultSet rs, int row) throws SQLException {
		Object dtoInstance = getNewDto();

		if (dtoInstance instanceof SigitDStatoPgDto) {
			return mapRow_internal((SigitDStatoPgDto) dtoInstance, rs, row);
		}

		return dtoInstance;
	}

	public SigitDStatoPgDto mapRow_internal(SigitDStatoPgDto objectToFill, ResultSet rs, int row) throws SQLException {
		SigitDStatoPgDto dto = objectToFill;

		// colonna [ID_STATO_PG]
		if (mapAllColumns || columnsToReadMap.get("ID_STATO_PG") != null)
			dto.setIdStatoPg((Integer) rs.getObject("ID_STATO_PG"));

		// colonna [DES_STATO_PG]
		if (mapAllColumns || columnsToReadMap.get("DES_STATO_PG") != null)
			dto.setDesStatoPg(rs.getString("DES_STATO_PG"));

		return dto;
	}

}
