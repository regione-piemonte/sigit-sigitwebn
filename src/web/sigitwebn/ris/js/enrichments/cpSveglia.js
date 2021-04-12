

/**
 * Arricchimenti standard per il ContentPanel [cpSveglia] da registrare nella
 * variabile globale uiEnricherMgr
 */
function initStdEnrichments4CpSveglia() {
	var contentPanelName = "cpSveglia";
	/// arricchimento per guigen::Calendar [cSvegliaAttuale]: aggiunta datepicker
	var addDateToCSvegliaAttuale = function(){
		uiNRichLib.addDatePickerNRich("widg_cSvegliaAttuale", 
		true, false, "", false);
	};
	uiEnricherMgr.registerEnrichment(contentPanelName, "p_wpAzione", addDateToCSvegliaAttuale);


}

/**
 * Arricchimenti custom
 */
function initCustomEnrichments4CpSveglia(){
/*PROTECTED REGION ID(R1825866132) ENABLED START*/
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

function initUIStructCpSveglia(){
	var contentPanelName = "cpSveglia";
	var structure =
      {
        name: "p_fpSveglia", panels: [
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
          name: "p_fpCenter", panels: [
          {
            name: "p_fpImpostaSveglia", panels: [
            {
              name: "p_stdMsgSveglia", panels: [
              ]
            }
,            {
              name: "p_wpAzione", panels: []
            }
,            {
              name: "p_cpFun", panels: []
            }
,            {
              name: "p_cpNav", panels: []
            }
            ]
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

	initStdEnrichments4CpSveglia();
	initCustomEnrichments4CpSveglia();
	initUIStructCpSveglia();
	uiEnricherMgr.setReady();
	uiEnricherMgr.applyAll("cpSveglia");

});



