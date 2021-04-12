<%@taglib uri="/struts-tags" prefix="s" %>
<s:include value="../fragments/header.jsp" ></s:include>

<s:form id="dpAnnullaRappProva_Form" action="cpInitRapProva" namespace="/base/gestisci_rapprova" method="post">

	<!-- ####################### PANNELLO CONTENUTI ###################### -->
	<div id="contentPanel">
		<div id="centerWrapper" class="floatWrapper">
			<div id="centerPanel">
			
			<a id="main_content" name="main_content"></a>
				<div class="dialogPanel" id="dpAnnullaRappProva_">

		
		
<div id="p_mbpConfAnnullaAllegati" class="msgBoxPanelBlock"><!-- startFragment:p_mbpConfAnnullaAllegati -->

	
<div class="msgBoxPanel info" id="mbpConfAnnullaAllegati">


		
<s:if test="isWidgetVisible('cpInitRapProva','ptMessaggioDinamicoAnnullaAll')" >

	
<p>


<!-- widget ptMessaggioDinamicoAnnullaAll -->
<s:property value="appDatamessaggioDinamico" escape="false" />

	
</p>

</s:if>

	


	
</div>

<!-- endFragment:p_mbpConfAnnullaAllegati --></div>

	
	<div id="p_cpDialogPanelAnnullaIspeAllImpianto" class="commandPanelBlock"><!-- startFragment:p_cpDialogPanelAnnullaIspeAllImpianto -->
	
	
<div class="commandPanel functional" id="cpDialogPanelAnnullaIspeAllImpianto">

	
	
		

	
	
	
	<div class="button left">
		
<s:if test="isWidgetVisible('cpInitRapProva','btAnnullaAnnullaAll')" >

	



<!-- widget btAnnullaAnnullaAll -->
<s:submit name="widg_btAnnullaAnnullaAll" id="widg_btAnnullaAnnullaAll" method="handleBtAnnullaAnnullaAll_CLICKED"
	key="cpInitRapProva.btAnnullaAnnullaAll.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpInitRapProva','btAnnullaAnnullaAll')" />

	


</s:if>

	


	</div>
	
	

	
	
	
	

	
	
	
	<div class="button right">
		
<s:if test="isWidgetVisible('cpInitRapProva','btConfermaAnnullaAll')" >

	



<!-- widget btConfermaAnnullaAll -->
<s:submit name="widg_btConfermaAnnullaAll" id="widg_btConfermaAnnullaAll" method="handleBtConfermaAnnullaAll_CLICKED"
	key="cpInitRapProva.btConfermaAnnullaAll.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpInitRapProva','btConfermaAnnullaAll')" />

	


</s:if>

	


	</div>
	
	
	
	
	
	
	



	
	
</div>

	<!-- endFragment:p_cpDialogPanelAnnullaIspeAllImpianto --></div>

				</div>

			</div>
		</div>
	</div>
	<!-- #################### FINE PANNELLO CONTENUTI #################### -->

</s:form>

<s:include value="../fragments/footer.jsp" ></s:include>
