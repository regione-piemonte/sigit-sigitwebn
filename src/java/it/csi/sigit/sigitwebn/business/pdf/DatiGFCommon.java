/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2021
 *******************************************************************************/
package it.csi.sigit.sigitwebn.business.pdf;

import java.util.List;

import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTAllegatoDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTImpiantoDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTPersonaFisicaDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTPersonaGiuridicaDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTTrattH2ODto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitTUnitaImmobiliareDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitVSk4GfDto;
import it.csi.sigit.sigitwebn.business.dao.sigitwebn.dto.SigitVSk4GtDto;

public class DatiGFCommon {

	SigitTImpiantoDto impiantoDto;
	List<SigitTUnitaImmobiliareDto> unitaImmobiliareList;
	SigitTAllegatoDto allegatoDto;
	List<SigitVSk4GfDto> sk4GfDtoList;
	SigitTPersonaGiuridicaDto personaGiuridicaDto;
	SigitTPersonaFisicaDto personaFisicaDto;
	SigitTTrattH2ODto dettaglioTrattAcquaDto;
	int ruolo;
	boolean isTerzoResp;
	
	
	
	public SigitTImpiantoDto getImpiantoDto() {
		return impiantoDto;
	}
	public void setImpiantoDto(SigitTImpiantoDto impiantoDto) {
		this.impiantoDto = impiantoDto;
	}
	
	public List<SigitTUnitaImmobiliareDto> getUnitaImmobiliareList() {
		return unitaImmobiliareList;
	}
	public void setUnitaImmobiliareList(List<SigitTUnitaImmobiliareDto> unitaImmobiliareList) {
		this.unitaImmobiliareList = unitaImmobiliareList;
	}
	public SigitTAllegatoDto getAllegatoDto() {
		return allegatoDto;
	}
	public void setAllegatoDto(SigitTAllegatoDto allegatoDto) {
		this.allegatoDto = allegatoDto;
	}
	public List<SigitVSk4GfDto> getSk4GfDtoList() {
		return sk4GfDtoList;
	}
	public void setSk4GfDtoList(List<SigitVSk4GfDto> sk4GfDtoList) {
		this.sk4GfDtoList = sk4GfDtoList;
	}
	public SigitTPersonaGiuridicaDto getPersonaGiuridicaDto() {
		return personaGiuridicaDto;
	}
	public void setPersonaGiuridicaDto(SigitTPersonaGiuridicaDto personaGiuridicaDto) {
		this.personaGiuridicaDto = personaGiuridicaDto;
	}
	public SigitTPersonaFisicaDto getPersonaFisicaDto() {
		return personaFisicaDto;
	}
	public void setPersonaFisicaDto(SigitTPersonaFisicaDto personaFisicaDto) {
		this.personaFisicaDto = personaFisicaDto;
	}
	public SigitTTrattH2ODto getDettaglioTrattAcquaDto() {
		return dettaglioTrattAcquaDto;
	}
	public void setDettaglioTrattAcquaDto(SigitTTrattH2ODto dettaglioTrattAcquaSto) {
		this.dettaglioTrattAcquaDto = dettaglioTrattAcquaSto;
	}
	public int getRuolo() {
		return ruolo;
	}
	public void setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}
	public boolean isTerzoResp() {
		return isTerzoResp;
	}
	public void setTerzoResp(boolean isTerzoResp) {
		this.isTerzoResp = isTerzoResp;
	}
	
	
}
