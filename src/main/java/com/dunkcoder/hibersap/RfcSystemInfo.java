package com.dunkcoder.hibersap;


import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import java.lang.Override;@Bapi("RFC_SYSTEM_INFO")
public class RfcSystemInfo {

	@Export
	@Parameter(value = "RFCSI_EXPORT", type = ParameterType.STRUCTURE)
	private RfcsiExport _rfcsiExport;
	@Export
	@Parameter("MAXIMAL_RESOURCES")
	private Integer _maximalResources;
	@Export
	@Parameter("RECOMMENDED_DELAY")
	private Integer _recommendedDelay;
	@Export
	@Parameter("CURRENT_RESOURCES")
	private Integer _currentResources;

	public RfcSystemInfo(){};

	public RfcsiExport get_rfcsiExport() {
		return this._rfcsiExport;
	}

	public void set_rfcsiExport(final RfcsiExport _rfcsiExport) {
		this._rfcsiExport = _rfcsiExport;
	}

	public Integer get_maximalResources() {
		return this._maximalResources;
	}

	public void set_maximalResources(final Integer _maximalResources) {
		this._maximalResources = _maximalResources;
	}

	public Integer get_recommendedDelay() {
		return this._recommendedDelay;
	}

	public void set_recommendedDelay(final Integer _recommendedDelay) {
		this._recommendedDelay = _recommendedDelay;
	}

	public Integer get_currentResources() {
		return this._currentResources;
	}

	public void set_currentResources(final Integer _currentResources) {
		this._currentResources = _currentResources;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (_rfcsiExport != null)
			result += "_rfcsiExport: " + _rfcsiExport;
		if (_maximalResources != null)
			result += ", _maximalResources: " + _maximalResources;
		if (_recommendedDelay != null)
			result += ", _recommendedDelay: " + _recommendedDelay;
		if (_currentResources != null)
			result += ", _currentResources: " + _currentResources;
		return result;
	} }