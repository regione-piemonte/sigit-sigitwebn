<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@taglib uri="/customtag" prefix="customtag" %>
<%@taglib uri="/csiuicore" prefix="csiuicore" %><%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:setBundle basename="/it/csi/sigit/sigitwebn/presentation/sigitwebn/action/elenco_ispezioni_impianti/CpRisultatoRicercaIspezioni2018Action" />


<s:include value="fragments/header.jsp" ></s:include>



<!-- appmoduleId:base/elenco_ispezioni_impianti -->
<!-- pageId:cpRisultatoRicercaIspezioni2018 -->

<s:form id="cpRisultatoRicercaIspezioni2018" action="cpRisultatoRicercaIspezioni2018" namespace="/base/elenco_ispezioni_impianti" method="post">


<%-- NO SCRIPT --%>
		
	
	
		
<!-- ####################### PANNELLO CONTENUTI ###################### -->
<div id="contentPanel">

	<!-- ================ UDLRC Layout UP PANEL ================ -->
	<div id="northPanel">
		<div class="wrapper">
		
	
	<div id="p_fpUpUserInfo" class="formPanelBlock"><!-- startFragment:p_fpUpUserInfo -->

	
	

	
	
			
	
	
<s:include value="/jsp/userpanels/cpRisultatoRicercaIspezioni2018_udpTestalino.jsp"></s:include>

	



			
	
	<div id="p_menuPanel" class="menuPanelBlock"><!-- startFragment:p_menuPanel -->
	
	
<div class="menuPanel horizontal" id="menuPanel">

	
		
			
<s:if test="isWidgetVisible('cpRisultatoRicercaIspezioni2018','menu')" >

	


	<s:include value="fragments/menu.jsp"></s:include>

	

</s:if>

	


		
	
	
</div>

	<!-- endFragment:p_menuPanel --></div>

	

	<!-- endFragment:p_fpUpUserInfo --></div>

		</div>
	</div>
	<!-- ================ FINE UDLRC Layout UP PANEL ================ -->


	<!-- ================ UDLRC Layout WEST-CENTER-EAST WRAPPER ================ -->
	<div id="centerWrapper" class="floatWrapper">


		<!-- ***** UDLRC Layout CENTER PANEL ***** -->
		<div id="centerPanel">
			
			<a id="main_content" name="main_content"></a>
			<div class="wrapper">

					
	
	<div id="p_fpCenter" class="formPanelBlock"><!-- startFragment:p_fpCenter -->

	
	

	
	
			
	
	<div id="p_fpTitle" class="formPanelBlock"><!-- startFragment:p_fpTitle -->
		
	
<h4 class="fpLabel"><s:text name="cpRisultatoRicercaIspezioni2018.fpTitle.label" /></h4>
<div class="formPanel" id="fpTitle">


	
	

	
	
	

		
	
</div>

	<!-- endFragment:p_fpTitle --></div>

			
	
	<div id="p_stdErrorMessageRisultatoRicercaIspezione" class="stdMessagePanelBlock"><!-- startFragment:p_stdErrorMessageRisultatoRicercaIspezione -->
	
	
<div class="stdMessagePanel" id="stdErrorMessageRisultatoRicercaIspezione">
	<customtag:stdMessagePanel id="stdErrorMessageRisultatoRicercaIspezione" errorMessage="true" errorDetails="false" actionMessage="true" />
</div>

	<!-- endFragment:p_stdErrorMessageRisultatoRicercaIspezione --></div>

			
	
	<div id="p_wpRisultato" class="widgetsPanelBlock"><!-- startFragment:p_wpRisultato -->
	
	
<h4 class="wpLabel">ispezioni trovate </h4>
<div class="widgetsPanel" id="wpRisultato">
	

	
	
<s:if test="isWidgetVisible('cpRisultatoRicercaIspezioni2018','tbRisultatiRicerca')" >

	
<div class="tableWidget">


<!-- widget tbRisultatiRicerca -->
	<csiuicore:ajaxify id="p_wpRisultato" 
		widgetType="table"		
		pageId="cpRisultatoRicercaIspezioni2018"
		javascriptDetection="false">
<s:set name="cpRisultatoRicercaIspezioni2018_tbRisultatiRicerca_clearStatus" value="isTableClearStatus('cpRisultatoRicercaIspezioni2018_tbRisultatiRicerca')" />
<s:url id="cpRisultatoRicercaIspezioni2018ViewUrl"						   
					   action="cpRisultatoRicercaIspezioni2018"
					   namespace="/base/elenco_ispezioni_impianti"/>
<display:table name="appDataElencoIspezioni2018"  				
			   excludedParams="*"			   export="true"
               id="widg_tbRisultatiRicerca"
               pagesize="20"
               keepStatus="true"
               requestURI="${cpRisultatoRicercaIspezioni2018ViewUrl}"  
               clearStatus="${cpRisultatoRicercaIspezioni2018_tbRisultatiRicerca_clearStatus}"
               uid="row_tbRisultatiRicerca"
               summary="" 
               class="dataTable">
	
		<display:column headerClass="nosort" media="html">
			<s:radio list="%{#attr.row_tbRisultatiRicerca.identificativoIspezione}" name="appDataidIspezioneSelezionato" id="%{'tbRisultatiRicerca-editcell-'+ (#attr.row_tbRisultatiRicerca_rowNum - 1)}" cssClass="radio"
			/>
		</display:column>

		<display:column headerClass="nosort" media="excel pdf">
		</display:column>
		<display:column property="identificativoIspezione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.identificativoIspezione.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="identificativoIspezione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.identificativoIspezione.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="identificativoIspezione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.identificativoIspezione.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="descrizioneIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneIspettore.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="descrizioneIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneIspettore.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="descrizioneIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneIspettore.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="cfSecondoIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.cfSecondoIspettore.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="cfSecondoIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.cfSecondoIspettore.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="cfSecondoIspettore" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.cfSecondoIspettore.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="dataCreazione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.dataCreazione.label" 
			sortable="true" headerClass="sortable"
			 comparator="it.csi.sigit.sigitwebn.presentation.sigitwebn.comparator.CsiDateComparator"   media="html"
			
 >
			
		</display:column>

		<display:column property="dataCreazione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.dataCreazione.export.label"
			sortable="true" headerClass="sortable"
			comparator="it.csi.sigit.sigitwebn.presentation.sigitwebn.comparator.CsiDateComparator"
			media="excel" />
		<display:column property="dataCreazione" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.dataCreazione.export.label"
			sortable="true" headerClass="sortable"
			 comparator="it.csi.sigit.sigitwebn.presentation.sigitwebn.comparator.CsiDateComparator"
			media="pdf" />	
		<display:column property="descrizioneStato" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneStato.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="descrizioneStato" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneStato.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="descrizioneStato" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descrizioneStato.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="codiceImpianto" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codiceImpianto.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="codiceImpianto" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codiceImpianto.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="codiceImpianto" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codiceImpianto.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="codIstatProv" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codIstatProv.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="codIstatProv" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codIstatProv.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="codIstatProv" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.codIstatProv.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="esito" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.esito.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="esito" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.esito.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="esito" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.esito.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
		<display:column property="descIspPagamento" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descIspPagamento.label" 
			sortable="true" headerClass="sortable"
			    media="html"
			
 >
			
		</display:column>

		<display:column property="descIspPagamento" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descIspPagamento.export.label"
			sortable="true" headerClass="sortable"
			
			media="excel" />
		<display:column property="descIspPagamento" titleKey="cpRisultatoRicercaIspezioni2018.tbRisultatiRicerca.descIspPagamento.export.label"
			sortable="true" headerClass="sortable"
			 
			media="pdf" />	
</display:table>



	</csiuicore:ajaxify>


	
</div>

</s:if>

	



	
	
	
</div>

	<!-- endFragment:p_wpRisultato --></div>

			
	
	<div id="p_cpFunRisultatoRicercaIspezioni" class="commandPanelBlock"><!-- startFragment:p_cpFunRisultatoRicercaIspezioni -->
	
	
<div class="commandPanel functional" id="cpFunRisultatoRicercaIspezioni">

	
	
		
		
<s:if test="isWidgetVisible('cpRisultatoRicercaIspezioni2018','btVisualizzaModifica')" >

	



<!-- widget btVisualizzaModifica -->
<s:submit name="widg_btVisualizzaModifica" id="widg_btVisualizzaModifica" method="handleBtVisualizzaModifica_CLICKED"
	key="cpRisultatoRicercaIspezioni2018.btVisualizzaModifica.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpRisultatoRicercaIspezioni2018','btVisualizzaModifica')" />

	


</s:if>

	


		
<s:if test="isWidgetVisible('cpRisultatoRicercaIspezioni2018','scaricaXls')" >

	



<!-- widget scaricaXls -->
<s:submit name="widg_scaricaXls" id="widg_scaricaXls" method="handleScaricaXls_CLICKED"
	key="cpRisultatoRicercaIspezioni2018.scaricaXls.label" cssClass="buttonWidget showReport"
	disabled="isWidgetDisabled('cpRisultatoRicercaIspezioni2018','scaricaXls')" />

	


</s:if>

	




	
	
</div>

	<!-- endFragment:p_cpFunRisultatoRicercaIspezioni --></div>

			
	
	<div id="p_cpNavRisultatoRicercaIspezioni" class="commandPanelBlock"><!-- startFragment:p_cpNavRisultatoRicercaIspezioni -->
	
	
<div class="commandPanel navigation" id="cpNavRisultatoRicercaIspezioni">

	
	
		
		
<s:if test="isWidgetVisible('cpRisultatoRicercaIspezioni2018','btIndietroRisultatoRicercaIspezioni')" >

	



<!-- widget btIndietroRisultatoRicercaIspezioni -->
<s:submit name="widg_btIndietroRisultatoRicercaIspezioni" id="widg_btIndietroRisultatoRicercaIspezioni" method="handleBtIndietroRisultatoRicercaIspezioni_CLICKED"
	key="cpRisultatoRicercaIspezioni2018.btIndietroRisultatoRicercaIspezioni.label" cssClass="buttonWidget"
	disabled="isWidgetDisabled('cpRisultatoRicercaIspezioni2018','btIndietroRisultatoRicercaIspezioni')" />

	


</s:if>

	




	
	
</div>

	<!-- endFragment:p_cpNavRisultatoRicercaIspezioni --></div>

	

	<!-- endFragment:p_fpCenter --></div>

			</div>
		</div>
		<!-- ***** FINE UDLRC Layout CENTER PANEL ***** -->



	</div>
	<!-- ================ FINE UDLRC Layout WEST-CENTER-EAST WRAPPER ================ -->



</div>
<!-- #################### FINE PANNELLO CONTENUTI #################### -->




</s:form>


	<s:include value="fragments/footer.jsp" ></s:include>
