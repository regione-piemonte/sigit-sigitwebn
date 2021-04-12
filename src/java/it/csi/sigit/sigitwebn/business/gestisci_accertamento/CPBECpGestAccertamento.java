package it.csi.sigit.sigitwebn.business.gestisci_accertamento;

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

/*PROTECTED REGION ID(R-778007217) ENABLED START*/
import it.csi.sigit.sigitwebn.business.manager.ServiziMgr;
import it.csi.sigit.sigitwebn.business.manager.SigitMgr;
import it.csi.sigit.sigitwebn.business.manager.ValidationMgr;
import it.csi.sigit.sigitwebn.business.manager.util.ManagerException;
import it.csi.sigit.sigitwebn.business.manager.util.ServiceException;
import it.csi.sigit.sigitwebn.business.manager.DbMgr;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitVRicercaImpiantiDto;

/*PROTECTED REGION END*/

public class CPBECpGestAccertamento {

	/**  */
	protected static final Logger log = //NOSONAR  Reason:EIAS 
			Logger.getLogger(Constants.APPLICATION_CODE + ".business"); //NOSONAR  Reason:EIAS

	//////////////////////////////////////////////////////////////////////////////
	/// Costanti identificative degli Application Data
	//////////////////////////////////////////////////////////////////////////////

	// ApplicationData: [utenteLoggato, scope:USER_SESSION]
	public static final String APPDATA_UTENTELOGGATO_CODE = "appDatautenteLoggato";

	// ApplicationData: [accertamento, scope:USER_SESSION]
	public static final String APPDATA_ACCERTAMENTO_CODE = "appDataaccertamento";

	// ApplicationData: [elencoTipoAnomalie, scope:USER_SESSION]
	public static final String APPDATA_ELENCOTIPOANOMALIE_CODE = "appDataelencoTipoAnomalie";

	// ApplicationData: [idAccertamentoSelezionato, scope:USER_SESSION]
	public static final String APPDATA_IDACCERTAMENTOSELEZIONATO_CODE = "appDataidAccertamentoSelezionato";

	// ApplicationData: [verifica, scope:USER_SESSION]
	public static final String APPDATA_VERIFICA_CODE = "appDataverifica";

	//////////////////////////////////////////////////////////////////////////////
	/// Metodi associati alla U.I.
	//////////////////////////////////////////////////////////////////////////////

	// nome del content panel associato al bean
	public static final String CPNAME = "cpGestAccertamento";

	/** 
	 * Restituisce il tab correntemente visibile in un determinato tab set
	 */
	private String getCurrentTab(Map session, String tabSetName) {
		String value = (String) session.get(CPNAME + "_" + tabSetName + "_selectedMultiPanel");
		return value;
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo salvaAccertamento definito in un ExecCommand del
	 * ContentPanel cpGestAccertamento
	 */
	public ExecResults salvaAccertamento(

			it.csi.sigit.sigitwebn.dto.gestisci_accertamento.CpGestAccertamentoModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String SALVAACCERTAMENTO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		final String SALVAACCERTAMENTO_OUTCOME_CODE__KO = //NOSONAR  Reason:EIAS
				"KO"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R-1442018835) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			try {

				getValidationMgr().validazioneFormaleAccertamento(theModel.getAppDataaccertamento());

				String idAccertamento = getSigitMgr().salvaAccertamento(theModel.getAppDataaccertamento(), null,
						theModel.getAppDatautenteLoggato());

				theModel.setAppDataidAccertamentoSelezionato(idAccertamento);
				result.getGlobalMessages().add(Messages.INFO_INSERIMENTO_CORRETTO);
				result.setResultCode(SALVAACCERTAMENTO_OUTCOME_CODE__OK);
			} catch (ManagerException ex) {
				Validator.gestisciEccezione(result, ex);
			}

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::salvaAccertamento] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Implementazione del metodo isRuoloAbilitato definito in un ExecCommand del
	 * ContentPanel cpGestAccertamento
	 */
	public ExecResults isRuoloAbilitato(

			it.csi.sigit.sigitwebn.dto.gestisci_accertamento.CpGestAccertamentoModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String ISRUOLOABILITATO_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R685015044) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			String descRuolo = theModel.getAppDatautenteLoggato().getRuolo().getDescRuolo();

			if (descRuolo.equals(Constants.RUOLO_VALIDATORE) || descRuolo.equals(Constants.RUOLO_SUPER)) {
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
	 * Implementazione del metodo preparaFormRicerca definito in un ExecCommand del
	 * ContentPanel cpGestAccertamento
	 */
	public ExecResults preparaFormRicerca(

			it.csi.sigit.sigitwebn.dto.gestisci_accertamento.CpGestAccertamentoModel theModel

	) throws BEException {
		/// definizione costanti di outcome
		final String PREPARAFORMRICERCA_OUTCOME_CODE__OK = //NOSONAR  Reason:EIAS
				"OK"; //NOSONAR  Reason:EIAS
		///
		try {
			ExecResults result = new ExecResults();
			/*PROTECTED REGION ID(R579835164) ENABLED START*/
			// inserire qui la logica applicativa da eseguire:

			resetRicerca(theModel);

			preparaAccertamento(theModel);

			result.setResultCode(PREPARAFORMRICERCA_OUTCOME_CODE__OK);

			// modifica degli attributi del model (che verranno propagati allo strato
			// di presentation). si puo' agire anche direttamente sull'attributo "session".

			result.setModel(theModel);
			return result;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			log.error("[BackEndFacade::preparaFormRicerca] Errore occorso nell'esecuzione del metodo:" + e, e);
			throw new BEException("Errore occorso nell'esecuzione del metodo:" + e, e);
		}
	}

	//////////////////////////////////////////////////////////////////////////////
	/// Metodi statici per il reset delle tabelle
	//////////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////////
	/// Property aggiuntive del bean
	//////////////////////////////////////////////////////////////////////////////
	/*PROTECTED REGION ID(R933188549) ENABLED START*/
	//// inserire qui le property che si vogliono iniettare in questo bean (es. dao, proxy di pd, ...) 

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

	private ServiziMgr serviziMgr;

	public ServiziMgr getServiziMgr() {
		return serviziMgr;
	}

	public void setServiziMgr(ServiziMgr serviziMgr) {
		this.serviziMgr = serviziMgr;
	}

	private ValidationMgr validationMgr;

	public ValidationMgr getValidationMgr() {
		return validationMgr;
	}

	public void setValidationMgr(ValidationMgr validationMgr) {
		this.validationMgr = validationMgr;
	}

	private void resetRicerca(it.csi.sigit.sigitwebn.dto.gestisci_accertamento.CpGestAccertamentoModel theModel)
			throws ManagerException, ServiceException {

		if (theModel.getAppDataelencoTipoAnomalie() == null || theModel.getAppDataelencoTipoAnomalie().isEmpty()) {
			//viene popolata la lista dei tipi di anomalia
			theModel.setAppDataelencoTipoAnomalie(getSigitMgr().getElencoTipoAnomalie());
		}

	}

	private void preparaAccertamento(it.csi.sigit.sigitwebn.dto.gestisci_accertamento.CpGestAccertamentoModel theModel)
			throws ManagerException {
		//SE NON C'E' LA RIGA SELEZIONATA ALLORA SI TRATTA DI UN NUOV ACCERTAMENTO
		boolean nuova = GenericUtil.isNullOrEmpty(theModel.getAppDataidAccertamentoSelezionato());

		Accertamento accertamento = null;

		if (nuova) {
			UtenteLoggato utente = theModel.getAppDatautenteLoggato();
			//IMPOSTAZIONE INFO DEFAULT
			accertamento = new Accertamento();
			accertamento.setCfUtenteCaricamento(utente.getCodiceFiscale());
			accertamento.setDenomUtenteCaricamento(utente.getDenominazione());
			//accertamento.setAssegnatario(utente.getDenominazione() + " (" + utente.getCodiceFiscale() + ")");
			accertamento.setDataCreazione(DateUtil.getDataCorrenteFormat());

			SigitVRicercaImpiantiDto impiantoEntity = null;

			// Se arrivo dalle veriche, e se e' presente il codiceImpianto, ricerco l'indirizzo
			if (theModel.getAppDataverifica() != null
					&& GenericUtil.isNotNullOrEmpty(theModel.getAppDataverifica().getCodiceImpianto())) {
				impiantoEntity = getDbMgr().cercaImpiantoByCodImpianto(
						ConvertUtil.convertToBigDecimal(theModel.getAppDataverifica().getCodiceImpianto()));

				accertamento.setCodiceImpianto(theModel.getAppDataverifica().getCodiceImpianto());
				accertamento.setIndirizzoImpianto(MapDto.getIndirizzoCompleto(impiantoEntity.getDenominazioneComune(),
						impiantoEntity.getIndirizzoUnitaImmob(), impiantoEntity.getCivico(),
						impiantoEntity.getSiglaProvincia()));

				accertamento.setSiglaProv(impiantoEntity.getSiglaProvincia());
				accertamento
						.setCodIstatProv(GenericUtil.getCodIstatProvByCodIstatComune(impiantoEntity.getIstatComune()));
			}

		} else {
			//VIENE RECUPERATA L'ACCERTAMENTO DAL DB
			accertamento = getSigitMgr().getAccertamentoDaId(theModel.getAppDataaccertamento().getIdentificativo(),
					null, null);
		}

		accertamento.setIdVerifica(theModel.getAppDataverifica().getIdentificativo());

		theModel.setAppDataaccertamento(accertamento);
	}

	/*PROTECTED REGION END*/
}
