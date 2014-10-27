package com.dunkcoder.hibersap;


import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import java.util.List;
import org.hibersap.annotations.Table;
import java.lang.Override;

@Bapi("BAPI_COMPANYCODE_GETLIST")
public class BapiCompanycodeGetlist {

	@Export
	@Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
	private Return _return;
	@Table
	@Parameter("COMPANYCODE_LIST")
	private List<CompanycodeList> _companycodeList;

	public BapiCompanycodeGetlist(){};

	public Return get_return() {
		return this._return;
	}

	public void set_return(final Return _return) {
		this._return = _return;
	}

	public List<CompanycodeList> get_companycodeList() {
		return this._companycodeList;
	}

	public void set_companycodeList(final List<CompanycodeList> _companycodeList) {
		this._companycodeList = _companycodeList;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (_return != null)
			result += "_return: " + _return;
		if (_companycodeList != null)
			result += ", _companycodeList: " + _companycodeList;
		return result;
	} }