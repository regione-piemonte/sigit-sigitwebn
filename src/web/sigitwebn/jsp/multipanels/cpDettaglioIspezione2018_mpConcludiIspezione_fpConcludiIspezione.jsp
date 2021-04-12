<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@taglib uri="/customtag" prefix="customtag" %>
<%@taglib uri="/csiuicore" prefix="csiuicore" %>

	
	<div id="p_fpConcludiIspezione" class="formPanelBlock"><!-- startFragment:p_fpConcludiIspezione -->
		
	
<h4 class="fpLabel"><s:text name="cpDettaglioIspezione2018.fpConcludiIspezione.label" /></h4>
<div class="formPanel" id="fpConcludiIspezione">


	
	

	
	
			
	
	<div id="p_wpConcludiIspezione" class="widgetsPanelBlock"><!-- startFragment:p_wpConcludiIspezione -->
	
	

<div class="widgetsPanel" id="wpConcludiIspezione">
	
	<customtag:widgetsPanel id="wpConcludiIspezioneTbl" columns="2" tableStyleClass="formTable"
		summary="" 
		>
	

	
	
<s:if test="isWidgetVisible('cpDettaglioIspezione2018','tfEnteCompetenteConclusione')" >

	
<customtag:widgetsPanelColumn   labelField="true" textLabel="%{getText('cpDettaglioIspezione2018.tfEnteCompetenteConclusione.label')}" labelFor="widg_tfEnteCompetenteConclusione" errorFor="appDataConclusioneIspezione2018.enteCompetente" labelId="tfEnteCompetenteConclusioneLbl"
	  >


<!-- widget tfEnteCompetenteConclusione -->
<s:textfield 
	
	
	name="appDataConclusioneIspezione2018.enteCompetente" id="widg_tfEnteCompetenteConclusione"
	disabled="isWidgetDisabled('cpDettaglioIspezione2018','tfEnteCompetenteConclusione')"
	size="15" 
/>

	
</customtag:widgetsPanelColumn>

</s:if>

	


	
<s:if test="isWidgetVisible('cpDettaglioIspezione2018','rbsEsito')" >

	
<customtag:widgetsPanelColumn   labelField="true" textLabel="%{getText('cpDettaglioIspezione2018.rbsEsito.label')}" labelFor="widg_rbsEsito" errorFor="appDataConclusioneIspezione2018.flgEsito" labelId="rbsEsitoLbl"
	  >


<!-- widget rbsEsito -->

	
<div id="appDataConclusioneIspezione2018.flgEsito" class="radiobuttons ">







<s:radio
	
	
	id="widg_rbPositivo" name="appDataConclusioneIspezione2018.flgEsito"
	list="#{'1':'positivo'}"
	disabled="isWidgetDisabled('cpDettaglioIspezione2018','rbsEsito')"
	cssClass="radio"
	
	/> <label  for="widg_rbPositivo1"><s:text name="cpDettaglioIspezione2018.rbsEsito.rbPositivo.label" /></label>








<s:radio
	
	
	id="widg_rbNegativo" name="appDataConclusioneIspezione2018.flgEsito"
	list="#{'0':'negativo'}"
	disabled="isWidgetDisabled('cpDettaglioIspezione2018','rbsEsito')"
	cssClass="radio"
	
	/> <label  for="widg_rbNegativo0"><s:text name="cpDettaglioIspezione2018.rbsEsito.rbNegativo.label" /></label>





	
</div>



	
</customtag:widgetsPanelColumn>

</s:if>

	



	
	
	
	</customtag:widgetsPanel>
	
</div>

	<!-- endFragment:p_wpConcludiIspezione --></div>

			
	
	<div id="p_cpConclusione" class="commandPanelBlock"><!-- startFragment:p_cpConclusione -->
	
	
<div class="commandPanel functional" id="cpConclusione">

	
	
		
		
<s:if test="isWidgetVisible('cpDettaglioIspezione2018','btConfermaConclusione')" >

	



<!-- widget btConfermaConclusione -->
<s:submit name="widg_btConfermaConclusione" id="widg_btConfermaConclusione" method="handleBtConfermaConclusione_CLICKED"
	key="cpDettaglioIspezione2018.btConfermaConclusione.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpDettaglioIspezione2018','btConfermaConclusione')" />

	


</s:if>

	


		
<s:if test="isWidgetVisible('cpDettaglioIspezione2018','btAnnullaConclusione')" >

	



<!-- widget btAnnullaConclusione -->
<s:submit name="widg_btAnnullaConclusione" id="widg_btAnnullaConclusione" method="handleBtAnnullaConclusione_CLICKED"
	key="cpDettaglioIspezione2018.btAnnullaConclusione.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpDettaglioIspezione2018','btAnnullaConclusione')" />

	


</s:if>

	




	
	
</div>

	<!-- endFragment:p_cpConclusione --></div>

	

		
	
</div>

	<!-- endFragment:p_fpConcludiIspezione --></div>
