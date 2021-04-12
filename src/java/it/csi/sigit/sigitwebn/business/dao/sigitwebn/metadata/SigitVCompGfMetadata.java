package it.csi.sigit.sigitwebn.business.dao.sigitwebn.metadata;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.business.dao.metadata.*;
import java.util.List;

/**
 * @generated
 */
public class SigitVCompGfMetadata extends DAOMetadata {

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
	 * DAO: [sigitVCompGf]
	 * tabella: [VISTA_COMP_GF].
	 */
	public SigitVCompGfMetadata() {
		columnNames = new String[]{"ID_TIPO_COMPONENTE", "PROGRESSIVO", "DATA_INSTALL", "CODICE_IMPIANTO",
				"FK_DETTAGLIO_GF", "FLG_SORGENTE_EXT", "FLG_FLUIDO_UTENZE", "FLUIDO_FRIGORIGENO", "N_CIRCUITI",
				"RAFFRESCAMENTO_EER", "RAFF_POTENZA_KW", "RAFF_POTENZA_ASS", "RISCALDAMENTO_COP", "RISC_POTENZA_KW",
				"RISC_POTENZA_ASS_KW", "DATA_DISMISS", "FLG_DISMISSIONE", "DATA_ULT_MOD", "UTENTE_ULT_MOD", "FK_MARCA",
				"DES_MARCA", "ID_COMBUSTIBILE", "DES_COMBUSTIBILE", "MATRICOLA", "MODELLO", "POTENZA_TERMICA_KW",
				"DES_DETTAGLIO_GF"};
		propertyNames = new String[]{"idTipoComponente", "progressivo", "dataInstall", "codiceImpianto",
				"fkDettaglioGf", "flgSorgenteExt", "flgFluidoUtenze", "fluidoFrigorigeno", "nCircuiti",
				"raffrescamentoEer", "raffPotenzaKw", "raffPotenzaAss", "riscaldamentoCop", "riscPotenzaKw",
				"riscPotenzaAssKw", "dataDismiss", "flgDismissione", "dataUltMod", "utenteUltMod", "fkMarca",
				"desMarca", "idCombustibile", "desCombustibile", "matricola", "modello", "potenzaTermicaKw",
				"desDettaglioGf"};
		for (int i = 0; i < columnNames.length; i++) {
			columnsNamesMap.put(propertyNames[i], columnNames[i]);

		}
	}

	/**
	 * Method 'getTableName'
	 * Restituisce il nome della tabella a cui il DAO [sigitVCompGf] fa riferimento
	 * (VISTA_COMP_GF).
	 * @return String
	 * @generated
	 */
	public String getTableName() {
		return "VISTA_COMP_GF";
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
