package it.csi.sigit.sigitwebn.business.gestisci_libretto_scheda10_1;

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

/*PROTECTED REGION ID(R404246966) ENABLED START*/
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitVCompVmDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.exceptions.SigitVCompVmDaoException;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.filter.CompFilter;
import it.csi.sigit.sigitwebn.business.manager.DbMgr;
import it.csi.sigit.sigitwebn.business.manager.SigitMgr;
import it.csi.sigit.sigitwebn.business.manager.ValidationMgr;
import it.csi.sigit.sigitwebn.business.manager.util.ManagerException;
import it.csi.sigit.sigitwebn.business.manager.util.Message;
import it.csi.sigit.sigitwebn.business.manager.util.ValidationManagerException;
/*PROTECTED REGION END*/

public class CPBECpGestLibScheda10_1Dett {

	/**  */
	protected static final Logger log = //NOSONAR  Reason:EIAS 
			Logger.getLogger(Constants.APPLICATION_CODE + ".business"); //NOSONAR  Reason:EIAS

	//////////////////////////////////////////////////////////////////////////////
	/// Costanti identificative degli Application Data
	//////////////////////////////////////////////////////////////////////////////

	// ApplicationData: [librettoMenuTree, scope:USER_SESSION]
	public static final String APPDATA_LIBRETTOMENUTREE_CODE = "appDatalibrettoMenuTree";

	// ApplicationData: [paginaChiamante, scope:USER_SESSION]
	public static final String APPDATA_PAGINACHIAMANTE_CODE = "appDatapaginaChiamante";

	// ApplicationData: [identificativoImpianto, scope:USER_SESSION]
	public static final String APPDATA_IDENTIFICATIVOIMPIANTO_CODE = "appDataidentificativoImpianto";

	// ApplicationData: [idImpiantoSelez, scope:USER_SESSION]
	public static final String APPDATA_IDIMPIANTOSELEZ_CODE = "appDataidImpiantoSelez";

	// ApplicationData: [utenteLoggato, scope:USER_SESSION]
	public static final String APPDATA_UTENTELOGGATO_CODE = "appDatautenteLoggato";

	// ApplicationData: [rigaSelezionata, scope:USER_SESSION]
	public static final String APPDATA_RIGASELEZIONATA_CODE = "appDatarigaSelezionata";

	// ApplicationData: [listaComponenti, scope:USER_SESSION]
	public static final String APPDATA_LISTACOMPONENTI_CODE = "appDatalistaComponenti";

	// ApplicationData: [elencoFabbricante, scope:USER_SESSION]
	public static final String APPDATA_ELENCOFABBRICANTE_CODE = "appDataelencoFabbricante";

	// ApplicationData: [isNuovoComponente, scope:USER_SESSION]
	public static final String APPDATA_ISNUOVOCOMPONENTE_CODE = "appDataisNuovoComponente";

	// ApplicationData: [componenteVM, scope:USER_SESSION]
	public static final String APPDATA_COMPONENTEVM_CODE = "appDatacomponenteVM";

	// ApplicationData: [listaComponentiVM, scope:USER_SESSION]
	public static final String APPDATA_LISTACOMPONENTIVM_CODE = "appDatalistaComponentiVM";

	// ApplicationData: [elencoTipoDettaglioVm, scope:USER_SESSION]
	public static final String APPDATA_ELENCOTIPODETTAGLIOVM_CODE = "appDataelencoTipoDettaglioVm";

	//////////////////////////////////////////////////////////////////////////////
	/// Metodi associati alla U.I.
	//////////////////////////////////////////////////////////////////////////////

	// nome del content panel associato al bean
	public static final String CPNAME = "cpGestLibScheda10_1Dett";

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
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults onTreeClick(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

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
			/*PROTECTED REGION ID(R1937422632) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			result.setResultCode(
					GenericUtil.gestisciTreeClick(theModel.getIdNodo(), theModel.getAppDatalibrettoMenuTree()));

			// Setto la pagina in cui sto andando, mi servir� nel caso ci sia necessit� di ricaricare la pagina con un messaggio (es. consolida libretto)
			theModel.getSession().put(Constants.SESSIONE_VAR_LIBRETTO_SCHEDA, result.getResultCode());

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

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
	 * Implementazione del metodo sostituisciComp definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults sostituisciComp(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String SOSTITUISCICOMP_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String SOSTITUISCICOMP_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R79435943) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			try {
				ComponenteVM componente = theModel.getAppDatacomponenteVM();
				ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

				// VALIDAZIONE
				getValidationMgr().validazioneFormaleLibrettoScheda10Dett(componente, compList, true);

				sostituisciComponente(componente, theModel);

				// impostazione del result code 
				result.setResultCode(SOSTITUISCICOMP_OUTCOME_CODE__OK);

			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::sostituisciComp] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo dismettiComp definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults dismettiComp(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String DISMETTICOMP_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String DISMETTICOMP_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R238870227) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			try {

				ComponenteVM componente = theModel.getAppDatacomponenteVM();
				ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

				// VALIDAZIONE
				getValidationMgr().validazioneFormaleLibrettoScheda10Dett(componente, compList, true);

				// Questo controllo mi serve per capire se l'utente ha esplicitamente dismesso/sostituito un componente
				componente.setFlgDismesso(true);

				theModel.setAppDatacomponenteVM(componente);

				// devo togliere il Riattiva dai sostituiti
				settaRiattivaSostituiti(false, theModel);

				// impostazione del result code 
				result.setResultCode(DISMETTICOMP_OUTCOME_CODE__OK);

			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::dismettiComp] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo rollbackComp definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults rollbackComp(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ROLLBACKCOMP_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R297741970) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			ComponenteVM componente = theModel.getAppDatacomponenteVM();
			componente.setDataDismissione(null);
			componente.setFlgDismesso(false);

			theModel.setAppDatacomponenteVM(componente);

			// devo togliere il Riattiva dai sostituiti
			settaRiattivaSostituiti(true, theModel);

			// impostazione del result code 
			result.setResultCode(ROLLBACKCOMP_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::rollbackComp] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo attivaColonna definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults attivaColonna(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ATTIVACOLONNA_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-830840300) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			ComponenteVM componente = theModel.getAppDatacomponenteVM();

			riattivaComponente(componente, theModel);

			// impostazione del result code 
			result.setResultCode(ATTIVACOLONNA_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::attivaColonna] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo ripristinaComp definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults ripristinaComp(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String RIPRISTINACOMP_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String RIPRISTINACOMP_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1838391221) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			recuperaComponenteDett(theModel);

			// impostazione del result code 
			result.setResultCode(RIPRISTINACOMP_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::ripristinaComp] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciVisualizzazioneRipristina definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults gestisciVisualizzazioneRipristina(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIVISUALIZZAZIONERIPRISTINA_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIVISUALIZZAZIONERIPRISTINA_OUTCOME_CODE__DISMESSO = //NOSONAR  Reason:EIAS
				"DISMESSO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-209310408) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			ComponenteVM componente = theModel.getAppDatacomponenteVM();
			//ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

			if (componente.getFlgDismesso()) {
				// impostazione del result code 
				result.setResultCode(GESTISCIVISUALIZZAZIONERIPRISTINA_OUTCOME_CODE__DISMESSO);
			} else {
				// impostazione del result code 
				result.setResultCode(GESTISCIVISUALIZZAZIONERIPRISTINA_OUTCOME_CODE__ATTIVO);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error(
					"[BackEndFacade::gestisciVisualizzazioneRipristina] Errore occorso nell'esecuzione del metodo:" + e,
					e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo salvaComp definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults salvaComp(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String SALVACOMP_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String SALVACOMP_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-2082906437) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			UtenteLoggato utente = theModel.getAppDatautenteLoggato();
			String codImpiantoSelez = theModel.getAppDataidImpiantoSelez();

			ComponenteVM componente = theModel.getAppDatacomponenteVM();
			ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

			try {
				// VALIDAZIONE
				getValidationMgr().validazioneFormaleLibrettoScheda10Dett(componente, compList, false);

				// devo verificare, visto che ha inserito la data dismissione, che abbia dismesso la componente (premendo il bottone "dismetti")
				if (GenericUtil.isNotNullOrEmpty(componente.getDataDismissione()) && !componente.getFlgDismesso()) {
					throw new ValidationManagerException(new Message(Messages.ERROR_COMPONENTE_NON_DISMESSA));
				}

				getDbMgr().salvaComponenteVM(codImpiantoSelez, componente, compList, utente.getCodiceFiscale());

				theModel.setAppDataisNuovoComponente(false);
				theModel.setAppDatarigaSelezionata(componente.getIdComponente());

				result.getGlobalMessages().add(Messages.INFO_SALVATAGGIO_CORRETTO);

				// impostazione del result code 
				result.setResultCode(SALVACOMP_OUTCOME_CODE__OK);

			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::salvaComp] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciIndietro definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults gestisciIndietro(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIINDIETRO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-617327008) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			// impostazione del result code 
			result.setResultCode(GESTISCIINDIETRO_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciIndietro] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo isRuoloAbilitato definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults isRuoloAbilitato(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ISRUOLOABILITATO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1257471811) ENABLED START*/
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
	 * Implementazione del metodo cercaComponenteDett definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults cercaComponenteDett(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String CERCACOMPONENTEDETT_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R803423452) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			if (theModel.getAppDataelencoFabbricante() == null) {
				theModel.setAppDataelencoFabbricante(getSigitMgr().getListMarche());
			}

			if (theModel.getAppDataelencoTipoDettaglioVm() == null) {
				theModel.setAppDataelencoTipoDettaglioVm(getSigitMgr().getListDettaglioVm());
			}

			log.debug("### cercaComponenteDett rigaSelez: " + theModel.getAppDatarigaSelezionata());

			recuperaComponenteDett(theModel);

			// impostazione del result code 
			result.setResultCode(CERCACOMPONENTEDETT_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::cercaComponenteDett] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciAbilitazione definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults gestisciAbilitazione(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIABILITAZIONE_OUTCOME_CODE__ABILITA = //NOSONAR  Reason:EIAS
				"ABILITA"; //NOSONAR  Reason:EIAS
		final String GESTISCIABILITAZIONE_OUTCOME_CODE__DISABILITA = //NOSONAR  Reason:EIAS
				"DISABILITA"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-49904047) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			UtenteLoggato utente = theModel.getAppDatautenteLoggato();

			if (GenericUtil.isUtenteAutorLibWebScheda10(utente)) {
				// impostazione del result code 
				result.setResultCode(GESTISCIABILITAZIONE_OUTCOME_CODE__ABILITA);
			} else {
				// impostazione del result code 
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
	 * Implementazione del metodo gestisciVisualizzazione definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults gestisciVisualizzazione(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIVISUALIZZAZIONE_OUTCOME_CODE__ATTIVO = //NOSONAR  Reason:EIAS
				"ATTIVO"; //NOSONAR  Reason:EIAS
		final String GESTISCIVISUALIZZAZIONE_OUTCOME_CODE__DISMESSO = //NOSONAR  Reason:EIAS
				"DISMESSO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R114683395) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			ComponenteVM componente = theModel.getAppDatacomponenteVM();
			//ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

			if (componente.getFlgDismesso()) {
				// impostazione del result code 
				result.setResultCode(GESTISCIVISUALIZZAZIONE_OUTCOME_CODE__DISMESSO);
			} else {
				// impostazione del result code 
				result.setResultCode(GESTISCIVISUALIZZAZIONE_OUTCOME_CODE__ATTIVO);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::gestisciVisualizzazione] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo gestisciMsg definito in un ExecCommand del
	 * ContentPanel cpGestLibScheda10_1Dett
	 */
	public ExecResults gestisciMsg(

			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String GESTISCIMSG_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R1873748289) ENABLED START*/
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
	 * permette di resettare lo stato di paginazione della tabella widg_tbComponenti
	 */
	public static void resetClearStatus_widg_tbComponenti(java.util.Map session) {
		session.put("cpGestLibScheda10_1Dett_tbComponenti_clearStatus", Boolean.TRUE);
	}

	//////////////////////////////////////////////////////////////////////////////
	/// Property aggiuntive del bean
	//////////////////////////////////////////////////////////////////////////////
	/*PROTECTED REGION ID(R-262118984) ENABLED START*/
	//// inserire qui le property che si vogliono iniettare in questo bean (es. dao, proxy di pd, ...) 

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

	private DbMgr dbMgr;

	public DbMgr getDbMgr() {
		return dbMgr;
	}

	public void setDbMgr(DbMgr dbMgr) {
		this.dbMgr = dbMgr;
	}

	private void recuperaComponenteDett(
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel)
			throws ManagerException {
		String compSelez = theModel.getAppDatarigaSelezionata();
		String codImpiantoSelez = theModel.getAppDataidImpiantoSelez();

		boolean isNuovoComponente = theModel.getAppDataisNuovoComponente();

		int progressivo = 0;

		if (isNuovoComponente) {

			// E' un inserimento

			// Recupero le componenti principali
			ArrayList<Componente> componenteList = theModel.getAppDatalistaComponenti();

			if (componenteList != null && componenteList.size() > 0) {
				// Vuol dire che esistono gi� delle componenti
				// devo prendere l'ultimo progressivo ed aggiungere un numero

				Componente componente = componenteList.get(componenteList.size() - 1);
				progressivo = ConvertUtil.convertToInteger(componente.getProgrComponente());

			}

			ComponenteVM compVM = new ComponenteVM();

			progressivo++;

			compVM.setIdComponente(Constants.TIPO_COMPONENTE_VM + Constants.INTERVAL_SEP + progressivo);
			compVM.setIdTipoComponente(Constants.TIPO_COMPONENTE_VM);
			compVM.setProgrComponente(ConvertUtil.convertToString(progressivo));

			theModel.setAppDatacomponenteVM(compVM);
			theModel.setAppDatalistaComponentiVM(null);

		} else {
			progressivo = GenericUtil.getProgrComponente(compSelez);
			// E' una modifica
			compilaComponente(codImpiantoSelez, progressivo, theModel);
		}
	}

	private void compilaComponente(String codImpianto, int progressivo,
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel)
			throws ManagerException {
		CompFilter filter = new CompFilter(codImpianto, ConvertUtil.convertToString(progressivo));

		try {
			List<SigitVCompVmDto> compList = getDbMgr().getSigitVCompVmDao().findByCodImpiantoOrdered(filter);

			ComponenteVM componenteVM = MapDto.mapToComponentePrincVM(compList);
			theModel.setAppDatacomponenteVM(componenteVM);

			// Il primo elemento delle sostituzioni e' ripristinabile se l'utente e' abilitato e se l'elemento attuale non e' dismesso 
			boolean isRipristinabile = GenericUtil.isUtenteAutorLibWebScheda10(theModel.getAppDatautenteLoggato())
					&& !componenteVM.getFlgDismesso();

			theModel.setAppDatalistaComponentiVM(MapDto.mapToComponenteSostVM(compList, isRipristinabile));

		} catch (SigitVCompVmDaoException e) {
			throw new ManagerException(e, new Message(Messages.ERROR_RECUPERO_DB));
		}

	}

	private void sostituisciComponente(ComponenteVM componente,
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel)
			throws ManagerException {

		try {

			String descFabb = GenericUtil.getDescriptionByCod(componente.getIdFabbricante(),
					theModel.getAppDataelencoFabbricante());
			componente.setDescFabbricante(descFabb);
			ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

			// Nel caso di un nuovo componente
			if (compList == null) {
				compList = new ArrayList<ComponenteVM>();
				theModel.setAppDatalistaComponentiVM(compList);
			}

			compList.add(0, componente);

			ComponenteVM componenteNew = new ComponenteVM();

			componenteNew.setIdTipoComponente(componente.getIdTipoComponente());
			componenteNew.setProgrComponente(componente.getProgrComponente());
			componenteNew.setIdComponente(componente.getIdComponente());
			componenteNew.setFlgDismesso(false);
			theModel.setAppDatacomponenteVM(componenteNew);

			// Devo gestire il ripristina sulla prima riga ( e toglierlo sulle altre)
			settaRiattivaSostituiti(true, theModel);

		} catch (Exception e) {
			throw new ManagerException(e, new Message(Messages.ERROR_GENERICO));
		}

	}

	private void riattivaComponente(ComponenteVM componente,
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel)
			throws ManagerException {

		try {

			ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

			ComponenteVM componenteNew = compList.get(0);

			componenteNew.setDataDismissione(null);
			componenteNew.setFlgDismesso(false);
			componenteNew.setRipristina(null);
			componenteNew.setRipristinaAttivabile(false);

			theModel.setAppDatacomponenteVM(componenteNew);

			// Rimuovo l'elemento ripristinato dai sostituiti
			compList.remove(0);

			settaRiattivaSostituiti(true, theModel);

		} catch (Exception e) {
			throw new ManagerException(e, new Message(Messages.ERROR_GENERICO));
		}

	}

	private void settaRiattivaSostituiti(boolean isRiattivabile,
			it.csi.sigit.sigitwebn.dto.gestisci_libretto_scheda10_1.CpGestLibScheda10_1DettModel theModel) {
		ArrayList<ComponenteVM> compList = theModel.getAppDatalistaComponentiVM();

		if (compList != null) {
			for (int i = 0; i < compList.size(); i++) {
				if (isRiattivabile && i == 0) {
					// devo mettere il ripristina
					compList.get(i).setRipristina(Constants.LABEL_RIPRISTINA);
					compList.get(i).setRipristinaAttivabile(true);
				} else {
					// devo togliere il ripristina					
					compList.get(i).setRipristina(null);
					compList.get(i).setRipristinaAttivabile(false);
				}
			}
		}

		theModel.setAppDatalistaComponentiVM(compList);

	}

	/*PROTECTED REGION END*/
}
