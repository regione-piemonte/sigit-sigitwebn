package it.csi.sigit.sigitwebn.business.gestisci_libretto_scheda4_5;

import java.util.*;

import it.csi.sigit.sigitwebn.dto.*;
import it.csi.sigit.sigitwebn.dto.accesso.*;
import it.csi.sigit.sigitwebn.dto.codici_impianto.*;
import it.csi.sigit.sigitwebn.dto.common.*;
import it.csi.sigit.sigitwebn.dto.impianto.*;
import it.csi.sigit.sigitwebn.dto.main.*;
import it.csi.sigit.sigitwebn.dto.bollini.*;
import it.csi.sigit.sigitwebn.dto.allegati.*;
import it.csi.sigit.sigitwebn.dto.subentro.*;
import it.csi.sigit.sigitwebn.dto.delega.*;
import it.csi.sigit.sigitwebn.dto.terzoresponsabile.*;
import it.csi.sigit.sigitwebn.dto.ispezioni.*;
import it.csi.sigit.sigitwebn.dto.distributori.*;
import it.csi.sigit.sigitwebn.dto.incarico.*;
import it.csi.sigit.sigitwebn.dto.impresa.*;
import it.csi.sigit.sigitwebn.dto.documentazione.*;
import it.csi.sigit.sigitwebn.dto.libretto.*;
import it.csi.sigit.sigitwebn.dto.ree.*;
import it.csi.sigit.sigitwebn.dto.verifica.*;
import it.csi.sigit.sigitwebn.dto.accertamento.*;
import it.csi.sigit.sigitwebn.dto.azioni.*;
import it.csi.sigit.sigitwebn.dto.sanzioni.*;
import it.csi.sigit.sigitwebn.dto.rappprova.*;
import it.csi.sigit.sigitwebn.dto.back_office.*;
import it.csi.sigit.sigitwebn.dto.userws.*;

import org.apache.log4j.*;
import it.csi.sigit.sigitwebn.util.*;
import it.csi.sigit.sigitwebn.business.*;

/*PROTECTED REGION ID(R-431227287) ENABLED START*/
import it.csi.sigit.sigitwebn.business.manager.DbMgr;
import it.csi.sigit.sigitwebn.business.manager.SigitMgr;
import it.csi.sigit.sigitwebn.business.manager.ValidationMgr;
import it.csi.sigit.sigitwebn.business.manager.util.DbManagerException;
import it.csi.sigit.sigitwebn.business.manager.util.ManagerException;
import it.csi.sigit.sigitwebn.business.manager.util.Message;
import it.csi.sigit.sigitwebn.business.manager.util.ValidationManagerException;
import it.csi.sigit.sigitwebn.util.enumutil.EditabilitaComp4Enum;

/*PROTECTED REGION END*/

public class CPBECpGestLibScheda4_5Dett {

	/**  */
	protected static final Logger log = //NOSONAR  Reason:EIAS 
			Logger.getLogger(Constants.APPLICATION_CODE + ".business"); //NOSONAR  Reason:EIAS

	//////////////////////////////////////////////////////////////////////////////
	/// Costanti identificative degli Application Data
	//////////////////////////////////////////////////////////////////////////////

	// ApplicationData: [paginaChiamante, scope:USER_SESSION]
	public static final String APPDATA_PAGINACHIAMANTE_CODE = "appDatapaginaChiamante";

	// ApplicationData: [utenteLoggato, scope:USER_SESSION]
	public static final String APPDATA_UTENTELOGGATO_CODE = "appDatautenteLoggato";

	// ApplicationData: [componenteSC, scope:USER_SESSION]
	public static final String APPDATA_COMPONENTESC_CODE = "appDatacomponenteSC";

	// ApplicationData: [elencoFabbricante, scope:USER_SESSION]
	public static final String APPDATA_ELENCOFABBRICANTE_CODE = "appDataelencoFabbricante";

	// ApplicationData: [librettoMenuTree, scope:USER_SESSION]
	public static final String APPDATA_LIBRETTOMENUTREE_CODE = "appDatalibrettoMenuTree";

	// ApplicationData: [isNuovoComponente, scope:USER_SESSION]
	public static final String APPDATA_ISNUOVOCOMPONENTE_CODE = "appDataisNuovoComponente";

	// ApplicationData: [listaComponentiSC, scope:USER_SESSION]
	public static final String APPDATA_LISTACOMPONENTISC_CODE = "appDatalistaComponentiSC";

	// ApplicationData: [rigaSelezionata, scope:USER_SESSION]
	public static final String APPDATA_RIGASELEZIONATA_CODE = "appDatarigaSelezionata";

	// ApplicationData: [listaStoricoComponentiSC, scope:USER_SESSION]
	public static final String APPDATA_LISTASTORICOCOMPONENTISC_CODE = "appDatalistaStoricoComponentiSC";

	// ApplicationData: [identificativoImpianto, scope:USER_SESSION]
	public static final String APPDATA_IDENTIFICATIVOIMPIANTO_CODE = "appDataidentificativoImpianto";

	// ApplicationData: [idImpiantoSelez, scope:USER_SESSION]
	public static final String APPDATA_IDIMPIANTOSELEZ_CODE = "appDataidImpiantoSelez";

	// ApplicationData: [editabilitaByRee, scope:SAME_PAGE]
	public static final String APPDATA_EDITABILITABYREE_CODE = "appDataeditabilitaByRee";

	//////////////////////////////////////////////////////////////////////////////
	/// Metodi associati alla U.I.
	//////////////////////////////////////////////////////////////////////////////

	// nome del content panel associato al bean
	public static final String CPNAME = "cpGestLibScheda4_5Dett";

	/** 
	 * Restituisce il tab correntemente visibile in un determinato tab set
	 */
	private String getCurrentTab(Map session, String tabSetName) {
		String value = (String) session.get(CPNAME + "_" + tabSetName + "_selectedMultiPanel");
		return value;
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo onTreeClick definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults onTreeClick(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ONTREECLICK_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA1_EXTRA = //NOSONAR  Reason:EIAS
				"SCHEDA1_EXTRA"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA1 = //NOSONAR  Reason:EIAS
				"SCHEDA1"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA2 = //NOSONAR  Reason:EIAS
				"SCHEDA2"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA3 = //NOSONAR  Reason:EIAS
				"SCHEDA3"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_1 = //NOSONAR  Reason:EIAS
				"SCHEDA4_1"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_2 = //NOSONAR  Reason:EIAS
				"SCHEDA4_2"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_3 = //NOSONAR  Reason:EIAS
				"SCHEDA4_3"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_4 = //NOSONAR  Reason:EIAS
				"SCHEDA4_4"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_5 = //NOSONAR  Reason:EIAS
				"SCHEDA4_5"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_6 = //NOSONAR  Reason:EIAS
				"SCHEDA4_6"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_7 = //NOSONAR  Reason:EIAS
				"SCHEDA4_7"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA4_8 = //NOSONAR  Reason:EIAS
				"SCHEDA4_8"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA5_1SR = //NOSONAR  Reason:EIAS
				"SCHEDA5_1SR"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA5_1VR = //NOSONAR  Reason:EIAS
				"SCHEDA5_1VR"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA5_2 = //NOSONAR  Reason:EIAS
				"SCHEDA5_2"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA6_4 = //NOSONAR  Reason:EIAS
				"SCHEDA6_4"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA6 = //NOSONAR  Reason:EIAS
				"SCHEDA6"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA7 = //NOSONAR  Reason:EIAS
				"SCHEDA7"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA8 = //NOSONAR  Reason:EIAS
				"SCHEDA8"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_1 = //NOSONAR  Reason:EIAS
				"SCHEDA9_1"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_2 = //NOSONAR  Reason:EIAS
				"SCHEDA9_2"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_3 = //NOSONAR  Reason:EIAS
				"SCHEDA9_3"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_4 = //NOSONAR  Reason:EIAS
				"SCHEDA9_4"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_5 = //NOSONAR  Reason:EIAS
				"SCHEDA9_5"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA9_6 = //NOSONAR  Reason:EIAS
				"SCHEDA9_6"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA10 = //NOSONAR  Reason:EIAS
				"SCHEDA10"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA12 = //NOSONAR  Reason:EIAS
				"SCHEDA12"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA13 = //NOSONAR  Reason:EIAS
				"SCHEDA13"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA14_1 = //NOSONAR  Reason:EIAS
				"SCHEDA14_1"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA14_2 = //NOSONAR  Reason:EIAS
				"SCHEDA14_2"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA14_3 = //NOSONAR  Reason:EIAS
				"SCHEDA14_3"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA14_4 = //NOSONAR  Reason:EIAS
				"SCHEDA14_4"; //NOSONAR  Reason:EIAS
		final String ONTREECLICK_OUTCOME_CODE__SCHEDA15 = //NOSONAR  Reason:EIAS
				"SCHEDA15"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R569401883) ENABLED START*/
			result.setResultCode(
					GenericUtil.gestisciTreeClick(theModel.getIdNodo(), theModel.getAppDatalibrettoMenuTree()));

			// Setto la pagina in cui sto andando, mi servir� nel caso ci sia necessit� di ricaricare la pagina con un messaggio (es. consolida libretto)
			theModel.getSession().put(Constants.SESSIONE_VAR_LIBRETTO_SCHEDA, result.getResultCode());

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::onTreeClick] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo sostituisciComponente definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults sostituisciComponente(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String SOSTITUISCICOMPONENTE_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String SOSTITUISCICOMPONENTE_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-957948415) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			ComponenteSC componente = theModel.getAppDatacomponenteSC();
			componente.setFabbricanteLabel(GenericUtil.getDescriptionByCod(componente.getFabbricante(),
					theModel.getAppDataelencoFabbricante()));
			List<ComponenteSC> compList = theModel.getAppDatalistaStoricoComponentiSC();
			try {

				//VALIDAZIONE SULLA DISMISSIONE
				getSigitMgr().checkREESostituzioneDismissone(theModel.getAppDataidImpiantoSelez(),
						Constants.TIPO_COMPONENTE_SC,
						GenericUtil.getProgrComponente(componente.getComponente()).toString(),
						componente.getDataInstallazione(), componente.getDataDismissione());

				getValidationMgr().validazioneFormaleLibrettoScheda4_5Dett(componente,
						(ArrayList<ComponenteSC>) compList, true,
						EditabilitaComp4Enum.valueOf(theModel.getAppDataeditabilitaByRee()));

				// per la sostituzione va aggiunta la componente in primoPiano tra quelle dello
				// storico
				// creata una nuova componente da settare come componente in primo piano
				if (compList == null) {
					compList = new ArrayList<ComponenteSC>();
				}
				componente.setFlgDismesso(true);
				compList.add(0, componente);
				theModel.setAppDatalistaStoricoComponentiSC((ArrayList<ComponenteSC>) compList);

				// nuova Componente in primo Piano
				ComponenteSC componenteNew = new ComponenteSC();
				componenteNew.setComponente(componente.getComponente());
				componenteNew.setFlgDismesso(false);

				theModel.setAppDatacomponenteSC(componenteNew);

				settaRiattivaSostituiti(true, theModel);

				// impostazione del result code
				result.setResultCode(SOSTITUISCICOMPONENTE_OUTCOME_CODE__OK);
			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::sostituisciComponente] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo dismettiComponente definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults dismettiComponente(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String DISMETTICOMPONENTE_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String DISMETTICOMPONENTE_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R55504295) ENABLED START*/
			try {
				ComponenteSC componente = theModel.getAppDatacomponenteSC();
				List<ComponenteSC> compList = theModel.getAppDatalistaStoricoComponentiSC();

				//VALIDAZIONE SULLA DISMISSIONE
				getSigitMgr().checkREESostituzioneDismissone(theModel.getAppDataidImpiantoSelez(),
						Constants.TIPO_COMPONENTE_SC,
						GenericUtil.getProgrComponente(componente.getComponente()).toString(),
						componente.getDataInstallazione(), componente.getDataDismissione());

				// VALIDAZIONE
				getValidationMgr().validazioneFormaleLibrettoScheda4_5Dett(componente,
						(ArrayList<ComponenteSC>) compList, true,
						EditabilitaComp4Enum.valueOf(theModel.getAppDataeditabilitaByRee()));

				componente.setFlgDismesso(true);

				theModel.setAppDatacomponenteSC(componente);

				// devo togliere il Riattiva dai sostituiti
				settaRiattivaSostituiti(false, theModel);

				result.setResultCode(DISMETTICOMPONENTE_OUTCOME_CODE__OK);
			} catch (ManagerException e) {
				Validator.gestisciEccezione(result, e);
			}
			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::dismettiComponente] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo riattivaComponente definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults riattivaComponente(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String RIATTIVACOMPONENTE_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String RIATTIVACOMPONENTE_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1272137536) ENABLED START*/
			ComponenteSC componente = theModel.getAppDatacomponenteSC();
			componente.setDataDismissione(null);
			componente.setFlgDismesso(false);

			settaRiattivaSostituiti(true, theModel);

			// impostazione del result code 
			result.setResultCode(RIATTIVACOMPONENTE_OUTCOME_CODE__OK);

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::riattivaComponente] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazioneOnRiattiva definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciAbilitazioneOnRiattiva(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_MODIFICABILE"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_NON_MODIFICABILE"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-876747979) ENABLED START*/
			result.setResultCode(
					settaAttivoNonModificabile(theModel, GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO,
							GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE,
							GESTISCIABILITAZIONEONRIATTIVA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE));

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciAbilitazioneOnRiattiva] Errore occorso nell'esecuzione del metodo:" + e,
					e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo riattivaComponenteSostituita definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults riattivaComponenteSostituita(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String RIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String RIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R355349911) ENABLED START*/
			List<ComponenteSC> compList = theModel.getAppDatalistaStoricoComponentiSC();

			//prima si verifica che la componente attualmente attiva non abbia degli ree associati
			ComponenteSC componenteOld = theModel.getAppDatacomponenteSC();
			try {
				//il controllo si pu� fare solo se la componente che si sta cancellando ha una data di installazione
				//ES. dopo la sostituzione di una componente si clicca subito sulla sua riattivazione senza popolare il form
				if (componenteOld.getDataInstallazione() != null) {
					getSigitMgr().checkPresenzaREE(theModel.getAppDataidImpiantoSelez(),
							componenteOld.getDataInstallazione(), Constants.TIPO_COMPONENTE_SC,
							GenericUtil.getProgrComponente(componenteOld.getComponente()).toString());

				}

				//prende la componente piu' recente tra i sostituiti
				ComponenteSC componenteNew = compList.get(0);

				//ripristino la componente appena recuperata
				componenteNew.setAzione(null);
				componenteNew.setFlgDismesso(false);
				componenteNew.setFlgRipristina(false);
				componenteNew.setDataDismissione(null);

				//imposto la componente ripristinata come componente corrente (dimenticando quindi quella vecchia)
				theModel.setAppDatacomponenteSC(componenteNew);

				//la componente appena dichiarata attiva viene tolta dalla lista delle sostituite
				compList.remove(0);

				//l'elenco dei sostutuiti viene quindi aggiornato per capire qual e' la nuova componente riattivabile
				settaRiattivaSostituiti(true, theModel);

				// impostazione del result code 
				result.setResultCode(RIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__OK);

			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::riattivaComponenteSostituita] Errore occorso nell'esecuzione del metodo:" + e,
					e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazioneOnRiattivaComponenteSostituita definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciAbilitazioneOnRiattivaComponenteSostituita(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_MODIFICABILE"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_NON_MODIFICABILE"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-2133369244) ENABLED START*/
			result.setResultCode(settaAttivoNonModificabile(theModel,
					GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO,
					GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE,
					GESTISCIABILITAZIONEONRIATTIVACOMPONENTESOSTITUITA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE));

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error(
					"[BackEndFacade::gestisciAbilitazioneOnRiattivaComponenteSostituita] Errore occorso nell'esecuzione del metodo:"
							+ e,
					e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo ripristinaDettaglioAttuale definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults ripristinaDettaglioAttuale(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String RIPRISTINADETTAGLIOATTUALE_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String RIPRISTINADETTAGLIOATTUALE_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-378731924) ENABLED START*/
			recuperaComponenteDett(theModel);

			// impostazione del result code 
			result.setResultCode(RIPRISTINADETTAGLIOATTUALE_OUTCOME_CODE__OK);

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::ripristinaDettaglioAttuale] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazioneByFlgDismissioneOnRipristina definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciAbilitazioneByFlgDismissioneOnRipristina(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__DISMESSO = //NOSONAR  Reason:EIAS
				"DISMESSO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_MODIFICABILE"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_NON_MODIFICABILE"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1415050921) ENABLED START*/
			result.setResultCode(GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__DISMESSO);

			if (isAbilitatoByFlgDismesso(theModel)) {
				//check sulla presenza di ree
				result.setResultCode(settaAttivoNonModificabile(theModel,
						GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO,
						GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE,
						GESTISCIABILITAZIONEBYFLGDISMISSIONEONRIPRISTINA_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE));
			}

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error(
					"[BackEndFacade::gestisciAbilitazioneByFlgDismissioneOnRipristina] Errore occorso nell'esecuzione del metodo:"
							+ e,
					e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo salvaDettaglio definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults salvaDettaglio(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String SALVADETTAGLIO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String SALVADETTAGLIO_OUTCOME_CODE__INSERISCI_IMPRESA = //NOSONAR  Reason:EIAS
				"INSERISCI_IMPRESA"; //NOSONAR  Reason:EIAS
		final String SALVADETTAGLIO_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-338992528) ENABLED START*/

			UtenteLoggato utente = theModel.getAppDatautenteLoggato();
			String codImpiantoSelez = theModel.getAppDataidImpiantoSelez();

			ComponenteSC componente = theModel.getAppDatacomponenteSC();
			Integer progressivo = GenericUtil.getProgrComponente(componente.getComponente());
			ArrayList<ComponenteSC> compList = theModel.getAppDatalistaStoricoComponentiSC();

			try {
				// VALIDAZIONE
				getValidationMgr().validazioneFormaleLibrettoScheda4_5Dett(componente, compList, false,
						EditabilitaComp4Enum.valueOf(theModel.getAppDataeditabilitaByRee()));

				// n.b se la componente in primo piano ha il flagDismesso = true allora la
				// componente e' dismessa
				if (GenericUtil.isNotNullOrEmpty(componente.getDataDismissione()) && !componente.getFlgDismesso()) {
					throw new ValidationManagerException(new Message(Messages.ERROR_COMPONENTE_NON_DISMESSA));
				}

				Integer idPersonaGiuridica = getSigitMgr().getImpresaAssociata(utente, codImpiantoSelez);

				if (idPersonaGiuridica == null) {
					// Devo andare sulla nuova pagina per far inserire l'impresa associata

					// impostazione del result code
					result.setResultCode(SALVADETTAGLIO_OUTCOME_CODE__INSERISCI_IMPRESA);
				} else {
					getSigitMgr().salvaComponenteSC(codImpiantoSelez, progressivo.toString(), componente, compList,
							idPersonaGiuridica, utente, theModel.getAppDataisNuovoComponente());

					theModel.setAppDataisNuovoComponente(false);
					theModel.setAppDatarigaSelezionata(componente.getComponente());

					result.getGlobalMessages().add(Messages.INFO_SALVATAGGIO_CORRETTO);

					// impostazione del result code
					result.setResultCode(SALVADETTAGLIO_OUTCOME_CODE__OK);
				}
			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}
			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::salvaDettaglio] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciIndietroDaDettaglio definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciIndietroDaDettaglio(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIINDIETRODADETTAGLIO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-2035612675) ENABLED START*/
			result.setResultCode(GESTISCIINDIETRODADETTAGLIO_OUTCOME_CODE__OK);
			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciIndietroDaDettaglio] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo isRuoloAbilitato definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults isRuoloAbilitato(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ISRUOLOABILITATO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R344553386) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			UtenteLoggato utente = theModel.getAppDatautenteLoggato();

			if (GenericUtil.isRuoloAbilitatoAccessoLibrettoWEB(utente)) {
				result.setResultCode(ISRUOLOABILITATO_OUTCOME_CODE__OK);
			} else {
				GenericUtil.redirectToNotAllowedPage();
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::isRuoloAbilitato] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo caricaSchedaDett definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults caricaSchedaDett(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String CARICASCHEDADETT_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1168831756) ENABLED START*/
			if (theModel.getAppDataelencoFabbricante() == null) {
				theModel.setAppDataelencoFabbricante(getSigitMgr().getListMarche());
			}

			recuperaComponenteDett(theModel);

			// impostazione del result code 
			result.setResultCode(CARICASCHEDADETT_OUTCOME_CODE__OK);
			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::caricaSchedaDett] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazione definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciAbilitazione(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONE_OUTCOME_CODE__ABILITA = //NOSONAR  Reason:EIAS
				"ABILITA"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONE_OUTCOME_CODE__DISABILITA = //NOSONAR  Reason:EIAS
				"DISABILITA"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-702267714) ENABLED START*/
			UtenteLoggato utente = theModel.getAppDatautenteLoggato();
			// impostazione del result code 
			if (GenericUtil.isUtenteAutorLibWebScheda4(utente)) {
				result.setResultCode(GESTISCIABILITAZIONE_OUTCOME_CODE__ABILITA);
			} else {
				result.setResultCode(GESTISCIABILITAZIONE_OUTCOME_CODE__DISABILITA);
			}

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciAbilitazione] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazioneByFlgDismissione definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciAbilitazioneByFlgDismissione(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__DISMESSO = //NOSONAR  Reason:EIAS
				"DISMESSO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_MODIFICABILE"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE = //NOSONAR  Reason:EIAS
				"ATTIVO_REE_NON_MODIFICABILE"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R961339585) ENABLED START*/
			result.setResultCode(GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__DISMESSO);

			if (isAbilitatoByFlgDismesso(theModel)) {
				//check sulla presenza di ree
				result.setResultCode(
						settaAttivoNonModificabile(theModel, GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO,
								GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO_REE_MODIFICABILE,
								GESTISCIABILITAZIONEBYFLGDISMISSIONE_OUTCOME_CODE__ATTIVO_REE_NON_MODIFICABILE));
			}

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciAbilitazioneByFlgDismissione] Errore occorso nell'esecuzione del metodo:"
					+ e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciMsg definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda4_5Dett
	 */
	public ExecResults gestisciMsg(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIMSG_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R505727540) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			GenericUtil.gestisciMessaggioSessione(theModel, result);

			// impostazione del result code 
			result.setResultCode(GESTISCIMSG_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciMsg] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	//////////////////////////////////////////////////////////////////////////////
	/// Metodi statici per il reset delle tabelle
	//////////////////////////////////////////////////////////////////////////////

	/**
	 * permette di resettare lo stato di paginazione della tabella widg_tbSostituzioni
	 */
	public static void resetClearStatus_widg_tbSostituzioni(java.util.Map session) {
		session.put("cpGestLibScheda4_5Dett_tbSostituzioni_clearStatus", Boolean.TRUE);
	}

	//////////////////////////////////////////////////////////////////////////////
	/// Property aggiuntive del bean
	//////////////////////////////////////////////////////////////////////////////
	/*PROTECTED REGION ID(R1308938987) ENABLED START*/
	private DbMgr dbMgr;

	public DbMgr getDbMgr() {
		return dbMgr;
	}

	public void setDbMgr(DbMgr dbMgr) {
		this.dbMgr = dbMgr;
	}

	private SigitMgr sigitMgr;

	public SigitMgr getSigitMgr() {
		return sigitMgr;
	}

	public void setSigitMgr(SigitMgr sigitMgr) {
		this.sigitMgr = sigitMgr;
	}

	private ValidationMgr validationMgr;

	public ValidationMgr getValidationMgr() {
		return validationMgr;
	}

	public void setValidationMgr(ValidationMgr validationMgr) {
		this.validationMgr = validationMgr;
	}

	private void recuperaComponenteDett(
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel)
			throws ManagerException {
		String codImpiantoSelez = theModel.getAppDataidImpiantoSelez();
		boolean isNuovoComponente = theModel.getAppDataisNuovoComponente();
		String compSelez = theModel.getAppDatarigaSelezionata();

		int progressivo = 0;

		if (isNuovoComponente) {
			//trattandosi di nuovo componente il progressivo dipende dalla lista di componenti gia' create
			List<ComponenteSC> componentiPersisted = theModel.getAppDatalistaComponentiSC();
			//find max value
			if (componentiPersisted != null) {
				for (ComponenteSC comp : componentiPersisted) {
					Integer progrComp = GenericUtil.getProgrComponente(comp.getComponente());
					if (progressivo < progrComp.intValue()) {
						progressivo = progrComp.intValue();
					}
				}
			}

			progressivo++;

			//viene creata una nuova componente
			ComponenteSC componenteNew = new ComponenteSC();
			componenteNew.setComponente(Constants.TIPO_COMPONENTE_SC + Constants.INTERVAL_SEP + progressivo);
			componenteNew.setFlgDismesso(false);

			//la nuova componente viene impostata nel modello come componente su cui lavorare
			theModel.setAppDatacomponenteSC(componenteNew);
			theModel.setAppDatalistaStoricoComponentiSC(null);
			theModel.setAppDataeditabilitaByRee(EditabilitaComp4Enum.COMP_MODIFICABILE.name());
		} else {
			//si sta accedendo dal pulsante dettaglio: si caricano le componenti dello stesso progressivo
			//viene estratto il progressivo della componente da cui costruire lo storico
			progressivo = GenericUtil.getProgrComponente(compSelez);

			try {
				//si recupera lo storico della compSelez
				List<ComponenteSC> compList = getSigitMgr().cercaComponentiScByFilter(codImpiantoSelez, progressivo,
						false);

				if (compList != null) {
					//la componente da impostare in primo piano corrisponde alla prima della lista
					ComponenteSC componentePrimoPriano = compList.get(0);
					theModel.setAppDatacomponenteSC(componentePrimoPriano);

					if (compList.size() > 1) {
						theModel.setAppDatalistaStoricoComponentiSC(
								new ArrayList<ComponenteSC>(compList.subList(1, compList.size())));
						settaRiattivaSostituiti(!componentePrimoPriano.getFlgDismesso(), theModel);
					} else {
						theModel.setAppDatalistaStoricoComponentiSC(null);
					}
				}

			} catch (Exception e) {
				throw new ManagerException(e, new Message(Messages.ERROR_RECUPERO_DB));
			}
		}
	}

	private void settaRiattivaSostituiti(boolean isRiattivabile,
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel) {
		//isRiattivabile viene arricchito con l'info sull'utente loggato
		isRiattivabile = isRiattivabile && GenericUtil.isUtenteAutorLibWebScheda4(theModel.getAppDatautenteLoggato());
		ArrayList<ComponenteSC> compList = theModel.getAppDatalistaStoricoComponentiSC();
		if (compList != null) {
			for (int i = 0; i < compList.size(); i++) {
				if (isRiattivabile && i == 0) {
					// devo mettere il ripristina
					compList.get(i).setAzione(Constants.LABEL_RIPRISTINA);
					compList.get(i).setFlgRipristina(true);
				} else {
					// devo togliere il ripristina					
					compList.get(i).setAzione(null);
					compList.get(i).setFlgRipristina(false);
				}
			}
		}

		theModel.setAppDatalistaStoricoComponentiSC(compList);

	}

	private boolean isAbilitatoByFlgDismesso(
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel) {
		ComponenteSC componentePrimoPiano = theModel.getAppDatacomponenteSC();
		if (componentePrimoPiano != null && !componentePrimoPiano.getFlgDismesso()) {
			return true;
		} else {
			theModel.setAppDataeditabilitaByRee(EditabilitaComp4Enum.COMP_NON_MODIFICABILE.name());
			return false;
		}
	}

	private String settaAttivoNonModificabile(
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda4_5.CpGestLibScheda4_5DettModel theModel,
			String resultAttivo, String resultReeModificabile, String resultReeNonModificabile)
			throws DbManagerException {
		ComponenteSC componentePrimoPiano = theModel.getAppDatacomponenteSC();
		Integer progressivo = GenericUtil.getProgrComponente(componentePrimoPiano.getComponente());
		//check sulla presenza di ree
		Integer contaREE = getSigitMgr().contaREE(theModel.getAppDataidImpiantoSelez(),
				componentePrimoPiano.getDataInstallazione(), Constants.TIPO_COMPONENTE_SC, progressivo.toString());
		if (contaREE != null && contaREE.intValue() > 0) {
			//CDU 036 (versione 1.1): nel caso di REE alcuni campi sono non modificabili a meno che il profilo dell'utente sia quello del 
			//VALIDATORE o SUPER
			UtenteLoggato utente = theModel.getAppDatautenteLoggato();
			if (GenericUtil.checkValidRole(utente, Arrays.asList(Constants.RUOLO_VALIDATORE, Constants.RUOLO_SUPER),
					false, /*il true serve a dire che il ruolo dell'utente
							deve essere compreso nella lista*/true)) {
				theModel.setAppDataeditabilitaByRee(EditabilitaComp4Enum.COMP_REE_MODIFICABILE.name());
				return resultReeModificabile;
			}
			theModel.setAppDataeditabilitaByRee(EditabilitaComp4Enum.COMP_REE_NON_MODIFICABILE.name());
			return resultReeNonModificabile;
		} else {
			theModel.setAppDataeditabilitaByRee(EditabilitaComp4Enum.COMP_MODIFICABILE.name());
			return resultAttivo;
		}
	}

	/*PROTECTED REGION END*/
}
