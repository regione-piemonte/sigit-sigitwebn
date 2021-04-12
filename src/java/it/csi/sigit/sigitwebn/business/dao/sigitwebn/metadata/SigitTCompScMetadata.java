package it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitTCompScMetadata extends DAOMetadata {

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
	 * DAO: [sigitTCompSc]
	 * tabella: [SIGIT_T_COMP_SC].
	 */
	public SigitTCompScMetadata() {
		columnNames = new String[]{"ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "CODICE_IMPIANTO",
				"DATA_DISMISS", "FLG_DISMISSIONE", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FK_MARCA", "MATRICOLA", "MODELLO",
				"POTENZA_TERMICA_KW", "NOME_PROPRIETARIO", "CF_PROPRIETARIO", "NOTE", "TEMPO_MANUT_ANNI"};
		propertyNames = new String[]{"idTipoComponente", "progressivo", "dataInstall", "codiceImpianto", "dataDismiss",
				"flgDismissione", "dataUltMod", "utenteUltMod", "fkMarca", "matricola", "modello", "potenzaTermicaKw",
				"nomeProprietario", "cfProprietario", "note", "tempoManutAnni"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitTCompSc] fa riferimento
	 * (SIGIT_T_COMP_SC).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "SIGIT_T_COMP_SC";
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
