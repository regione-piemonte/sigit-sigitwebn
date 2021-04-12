package it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitWrkLogMetadata extends DAOMetadata {

	/**
	 * contiene l'elenco dei nomi delle property del DTO associato al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] propertyNames;

	/**
	 * contiene l'elenco dei nomi delle colonne della tabella associata al DAO a cui
	 * questi metadati fanno riferimento
	 */
	private final String[] columnNames;

	/**
	 * Contiene i metadati relativi a:
	 * DAO: [sigitWrkLog]
	 * tabella: [SIGIT_WRK_LOG].
	 */
	public SigitWrkLogMetadata() {
		columnNames = new String[]{"CODICE_FISCALE", "DATA_OPERAZIONE", "TBL_IMPATTATA", "ID_RECORD", "TIPO_OPERAZIONE",
				"ID_LOG"};
		propertyNames = new String[]{"codiceFiscale", "dataOperazione", "tblImpattata", "idRecord", "tipoOperazione",
				"idLog"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitWrkLog] fa riferimento
	 * (SIGIT_WRK_LOG).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_WRK_LOG";
	}

	/**
	 * Method 'getColumnNames'
	 * Restutuisce l'insieme dei nomi delle colonne gestite dal DAO.
	 * @return String[]
	 * @generated
	 */
	public String[] getColumnNames() {
		String ris[] = new String[columnNames.length];
		System.arraycopy(columnNames, 0, ris, 0, columnNames.length);
		return ris;
	}

}
