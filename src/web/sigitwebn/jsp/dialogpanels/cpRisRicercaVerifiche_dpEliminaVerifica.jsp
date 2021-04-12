<%@taglib uri="/struts-tags" prefix="s" %>
<s:include value="../fragments/header.jsp" ></s:include>

<s:form id="dpEliminaVerificaForm" action="cpRisRicercaVerifiche" namespace="/base/risultato_ricerca_verifiche" method="post">

	<!-- ####################### PANNELLO CONTENUTI ###################### -->
	<div id="contentPanel">
		<div id="centerWrapper" class="floatWrapper">
			<div id="centerPanel">
			
			<a id="main_content" name="main_content"></a>
				<div class="dialogPanel" id="dpEliminaVerifica">

		
		
<div id="p_mbConfEliminaVerifica" class="msgBoxPanelBlock"><!-- startFragment:p_mbConfEliminaVerifica -->

	
<div class="msgBoxPanel info" id="mbConfEliminaVerifica">


		
<s:if test="isWidgetVisible('cpRisRicercaVerifiche','ptMsg')" >

	
<p>


<!-- widget ptMsg -->
<s:property value="appDatamessaggioDinamico" escape="false" />

	
</p>

</s:if>

	


	
</div>

<!-- endFragment:p_mbConfEliminaVerifica --></div>

	
	<div id="p_cpConfEliminaVerifica" class="commandPanelBlock"><!-- startFragment:p_cpConfEliminaVerifica -->
	
	
<div class="commandPanel functional" id="cpConfEliminaVerifica">

	
	
		

	
	
	
	<div class="button left">
		
<s:if test="isWidgetVisible('cpRisRicercaVerifiche','BtnAnnulla')" >

	



<!-- widget BtnAnnulla -->
<s:submit name="widg_BtnAnnulla" id="widg_BtnAnnulla" method="handleBtnAnnulla_CLICKED"
	key="cpRisRicercaVerifiche.BtnAnnulla.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpRisRicercaVerifiche','BtnAnnulla')" />

	


</s:if>

	


	</div>
	
	

	
	
	
	

	
	
	
	<div class="button right">
		
<s:if test="isWidgetVisible('cpRisRicercaVerifiche','btConferma')" >

	



<!-- widget btConferma -->
<s:submit name="widg_btConferma" id="widg_btConferma" method="handleBtConferma_CLICKED"
	key="cpRisRicercaVerifiche.btConferma.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpRisRicercaVerifiche','btConferma')" />

	


</s:if>

	


	</div>
	
	
	
	
	
	
	



	
	
</div>

	<!-- endFragment:p_cpConfEliminaVerifica --></div>

				</div>

			</div>
		</div>
	</div>
	<!-- #################### FINE PANNELLO CONTENUTI #################### -->

</s:form>

<s:include value="../fragments/footer.jsp" ></s:include>
