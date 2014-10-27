package com.dunkcoder.hibersap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import java.lang.Override;

@BapiStructure
public class CompanycodeList
{

   @Parameter("COMP_NAME")
   String _compName;
   @Parameter("COMP_CODE")
   String _compCode;

   public String get_compName()
   {
      return this._compName;
   }

   public void set_compName(final String _compName)
   {
      this._compName = _compName;
   }

   public String get_compCode()
   {
      return this._compCode;
   }

   public void set_compCode(final String _compCode)
   {
      this._compCode = _compCode;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (_compName != null && !_compName.trim().isEmpty())
         result += "_compName: " + _compName;
      if (_compCode != null && !_compCode.trim().isEmpty())
         result += ", _compCode: " + _compCode;
      return result;
   }
}