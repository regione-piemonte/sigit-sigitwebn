package it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVSk4ScMetadata extends DAOMetadata {

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
	 * DAO: [sigitVSk4Sc]
	 * tabella: [VISTA_SK4_SC].
	 */
	public SigitVSk4ScMetadata() {
		columnNames = new String[]{"CODICE_IMPIANTO", "ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL",
				"FLG_DISMISSIONE", "DATA_DISMISS", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "MATRICOLA", "MODELLO",
				"POTENZA_TERMICA_KW", "FK_MARCA", "DES_MARCA", "DATA_CONTROLLO", "ID_ALLEGATO", "FK_TIPO_DOCUMENTO",
				"DES_TIPO_DOCUMENTO"};
		propertyNames = new String[]{"codiceImpianto", "idTipoComponente", "progressivo", "dataInstall",
				"flgDismissione", "dataDismiss", "dataUltMod", "utenteUltMod", "matricola", "modello",
				"potenzaTermicaKw", "fkMarca", "desMarca", "dataControllo", "idAllegato", "fkTipoDocumento",
				"desTipoDocumento"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVSk4Sc] fa riferimento
	 * (VISTA_SK4_SC).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_SK4_SC";
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
