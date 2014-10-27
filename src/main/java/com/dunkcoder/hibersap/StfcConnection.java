package com.dunkcoder.hibersap;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Export;
import java.lang.Override;

@Bapi("STFC_CONNECTION")
public class StfcConnection
{

   @Import
   @Parameter("REQUTEXT")
   private final String _requtext;
   @Export
   @Parameter("RESPTEXT")
   private String _resptext;
   @Export
   @Parameter("ECHOTEXT")
   private String _echotext;

   public StfcConnection(final String requtext)
   {
      this._requtext = requtext;
   }

   public String get_requtext()
   {
      return this._requtext;
   }

   public String get_resptext()
   {
      return this._resptext;
   }

   public void set_resptext(final String _resptext)
   {
      this._resptext = _resptext;
   }

   public String get_echotext()
   {
      return this._echotext;
   }

   public void set_echotext(final String _echotext)
   {
      this._echotext = _echotext;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (_requtext != null && !_requtext.trim().isEmpty())
         result += "_requtext: " + _requtext;
      if (_resptext != null && !_resptext.trim().isEmpty())
         result += ", _resptext: " + _resptext;
      if (_echotext != null && !_echotext.trim().isEmpty())
         result += ", _echotext: " + _echotext;
      return result;
   }
}