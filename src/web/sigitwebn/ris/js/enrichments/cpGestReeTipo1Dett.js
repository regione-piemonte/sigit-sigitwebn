

/**
 * Arricchimenti standard per il ContentPanel [cpGestReeTipo1Dett] da registrare nella
 * variabile globale uiEnricherMgr
 */
function initStdEnrichments4CpGestReeTipo1Dett() {
	var contentPanelName = "cpGestReeTipo1Dett";
	/// arricchimento di base per guigen::TextField [tfPotMax]
	var addBasicEnrichmentToTfPotMax =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfPotMax',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpE", addBasicEnrichmentToTfPotMax);
	/// arricchimento di base per guigen::TextField [tfDepCan]
	var addBasicEnrichmentToTfDepCan =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfDepCan',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpE", addBasicEnrichmentToTfDepCan);
	/// arricchimento per guigen::ComboBox [cbModuli]: autonarrowing
	var addNarrowingToCbModuli =
		function(){
			uiNRichLib.addComboNarrowingNRich(
				'widg_cbModuli',
			 	true);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpElencoNonCompilati", addNarrowingToCbModuli);


	/// arricchimento di base per guigen::TextField [tfTempFumiC]
	var addBasicEnrichmentToTfTempFumiC =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfTempFumiC',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfTempFumiC);
	/// arricchimento di base per guigen::TextField [tfTempAriaC]
	var addBasicEnrichmentToTfTempAriaC =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfTempAriaC',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfTempAriaC);
	/// arricchimento di base per guigen::TextField [tfO2Perc]
	var addBasicEnrichmentToTfO2Perc =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfO2Perc',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfO2Perc);
	/// arricchimento di base per guigen::TextField [tfCo2Perc]
	var addBasicEnrichmentToTfCo2Perc =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfCo2Perc',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfCo2Perc);
	/// arricchimento di base per guigen::TextField [tfBacharachMin]
	var addBasicEnrichmentToTfBacharachMin =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfBacharachMin',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfBacharachMin);
	/// arricchimento di base per guigen::TextField [tfBacharachMed]
	var addBasicEnrichmentToTfBacharachMed =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfBacharachMed',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfBacharachMed);
	/// arricchimento di base per guigen::TextField [tfBacharachMax]
	var addBasicEnrichmentToTfBacharachMax =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfBacharachMax',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfBacharachMax);
	/// arricchimento di base per guigen::TextField [tfCoCorrettoPpm]
	var addBasicEnrichmentToTfCoCorrettoPpm =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfCoCorrettoPpm',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfCoCorrettoPpm);
	/// arricchimento di base per guigen::TextField [tfRendCombPerc]
	var addBasicEnrichmentToTfRendCombPerc =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfRendCombPerc',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfRendCombPerc);
	/// arricchimento di base per guigen::TextField [tfRendMInLeggePerc]
	var addBasicEnrichmentToTfRendMInLeggePerc =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfRendMInLeggePerc',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfRendMInLeggePerc);
	/// arricchimento di base per guigen::TextField [tfNoxPpm]
	var addBasicEnrichmentToTfNoxPpm =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfNoxPpm',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfNoxPpm);
	/// arricchimento per guigen::ComboBox [cbPortataCombUm]: autonarrowing
	var addNarrowingToCbPortataCombUm =
		function(){
			uiNRichLib.addComboNarrowingNRich(
				'widg_cbPortataCombUm',
			 	true);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addNarrowingToCbPortataCombUm);


	/// arricchimento di base per guigen::TextField [tfPortataComb]
	var addBasicEnrichmentToTfPortataComb =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfPortataComb',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfPortataComb);
	/// arricchimento di base per guigen::TextField [tfCoNoAriaPpm]
	var addBasicEnrichmentToTfCoNoAriaPpm =
		function(){
			uiNRichLib.basicTextFieldNRich(
				'widg_tfCoNoAriaPpm',
			 	false,
			 	'java.lang.String',
			 	null);
		};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpModulo", addBasicEnrichmentToTfCoNoAriaPpm);


}

/**
 * Arricchimenti custom
 */
function initCustomEnrichments4CpGestReeTipo1Dett(){
/*PROTECTED REGION ID(R1028056698) ENABLED START*/
	/*
	 * definire e registrare qui eventuali arricchimenti custom, nel formato:
	 * var customEnr_n = function(){
	 *	// codice da eseguire all'applicazione dell'arricchimento
	 * };
	 * String customEnr_fragmentID = p_[id del pannello a cui deve essere associato l'arricchimento];
	 * uiEnricherMgr.registerEnrichment(contentPanelName, customEnr_fragmentID, customEnr_n);
	*/

/*PROTECTED REGION END*/
}

function initUIStructCpGestReeTipo1Dett(){
	var contentPanelName = "cpGestReeTipo1Dett";
	var structure =
      {
        name: "p_fpGestReeTipo1Dett", panels: [
        {
          name: "p_fpUpUserInfo", panels: [
          {
            name: "p_udpTestalino", panels: [
            ]
          }
,          {
            name: "p_menuPanel", panels: []
          }
          ]
        }
,        {
          name: "p_fpLeftMenu", panels: [
          {
            name: "p_udpFunzionalita", panels: [
            ]
          }
,          {
            name: "p_wpMenuTree", panels: []
          }
          ]
        }
,        {
          name: "p_fpCenter", panels: [
          {
            name: "p_fpGestRee", panels: [
            ]
          }
,          {
            name: "p_stdMsgReeDett", panels: [
            ]
          }
,          {
            name: "p_wpInfoImpianto", panels: []
          }
,          {
            name: "p_wpE", panels: []
          }
,          {
            name: "p_wpElencoNonCompilati", panels: []
          }
,          {
            name: "p_wpModulo", panels: []
          }
,          {
            name: "p_cpFunGestReeDett", panels: []
          }
,          {
            name: "p_cpNavGestReeDett", panels: []
          }
          ]
        }
        ]
      }
;
	uiEnricherMgr.setPageStructure(contentPanelName, structure);
}



// startup dell arricchimento con JQuery
$( function() {
	uiNRichLib.initStateManager();

	initStdEnrichments4CpGestReeTipo1Dett();
	initCustomEnrichments4CpGestReeTipo1Dett();
	initUIStructCpGestReeTipo1Dett();
	uiEnricherMgr.setReady();
	uiEnricherMgr.applyAll("cpGestReeTipo1Dett");

});



