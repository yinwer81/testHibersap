package com.dunkcoder.hibersap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import java.lang.Override;

@BapiStructure
public class RfcsiExport
{

   @Parameter("RFCFLOTYP")
   String _rfcflotyp;
   @Parameter("RFCIPV6ADDR")
   String _rfcipv6addr;
   @Parameter("RFCMACH")
   String _rfcmach;
   @Parameter("RFCHOST")
   String _rfchost;
   @Parameter("RFCSI_RESV")
   String _rfcsiResv;
   @Parameter("RFCIPADDR")
   String _rfcipaddr;
   @Parameter("RFCSAPRL")
   String _rfcsaprl;
   @Parameter("RFCDBHOST")
   String _rfcdbhost;
   @Parameter("RFCINTTYP")
   String _rfcinttyp;
   @Parameter("RFCSYSID")
   String _rfcsysid;
   @Parameter("RFCDBSYS")
   String _rfcdbsys;
   @Parameter("RFCDEST")
   String _rfcdest;
   @Parameter("RFCPROTO")
   String _rfcproto;
   @Parameter("RFCHOST2")
   String _rfchost2;
   @Parameter("RFCKERNRL")
   String _rfckernrl;
   @Parameter("RFCDAYST")
   String _rfcdayst;
   @Parameter("RFCOPSYS")
   String _rfcopsys;
   @Parameter("RFCCHARTYP")
   String _rfcchartyp;
   @Parameter("RFCDATABS")
   String _rfcdatabs;
   @Parameter("RFCTZONE")
   String _rfctzone;

   public String get_rfcflotyp()
   {
      return this._rfcflotyp;
   }

   public void set_rfcflotyp(final String _rfcflotyp)
   {
      this._rfcflotyp = _rfcflotyp;
   }

   public String get_rfcipv6addr()
   {
      return this._rfcipv6addr;
   }

   public void set_rfcipv6addr(final String _rfcipv6addr)
   {
      this._rfcipv6addr = _rfcipv6addr;
   }

   public String get_rfcmach()
   {
      return this._rfcmach;
   }

   public void set_rfcmach(final String _rfcmach)
   {
      this._rfcmach = _rfcmach;
   }

   public String get_rfchost()
   {
      return this._rfchost;
   }

   public void set_rfchost(final String _rfchost)
   {
      this._rfchost = _rfchost;
   }

   public String get_rfcsiResv()
   {
      return this._rfcsiResv;
   }

   public void set_rfcsiResv(final String _rfcsiResv)
   {
      this._rfcsiResv = _rfcsiResv;
   }

   public String get_rfcipaddr()
   {
      return this._rfcipaddr;
   }

   public void set_rfcipaddr(final String _rfcipaddr)
   {
      this._rfcipaddr = _rfcipaddr;
   }

   public String get_rfcsaprl()
   {
      return this._rfcsaprl;
   }

   public void set_rfcsaprl(final String _rfcsaprl)
   {
      this._rfcsaprl = _rfcsaprl;
   }

   public String get_rfcdbhost()
   {
      return this._rfcdbhost;
   }

   public void set_rfcdbhost(final String _rfcdbhost)
   {
      this._rfcdbhost = _rfcdbhost;
   }

   public String get_rfcinttyp()
   {
      return this._rfcinttyp;
   }

   public void set_rfcinttyp(final String _rfcinttyp)
   {
      this._rfcinttyp = _rfcinttyp;
   }

   public String get_rfcsysid()
   {
      return this._rfcsysid;
   }

   public void set_rfcsysid(final String _rfcsysid)
   {
      this._rfcsysid = _rfcsysid;
   }

   public String get_rfcdbsys()
   {
      return this._rfcdbsys;
   }

   public void set_rfcdbsys(final String _rfcdbsys)
   {
      this._rfcdbsys = _rfcdbsys;
   }

   public String get_rfcdest()
   {
      return this._rfcdest;
   }

   public void set_rfcdest(final String _rfcdest)
   {
      this._rfcdest = _rfcdest;
   }

   public String get_rfcproto()
   {
      return this._rfcproto;
   }

   public void set_rfcproto(final String _rfcproto)
   {
      this._rfcproto = _rfcproto;
   }

   public String get_rfchost2()
   {
      return this._rfchost2;
   }

   public void set_rfchost2(final String _rfchost2)
   {
      this._rfchost2 = _rfchost2;
   }

   public String get_rfckernrl()
   {
      return this._rfckernrl;
   }

   public void set_rfckernrl(final String _rfckernrl)
   {
      this._rfckernrl = _rfckernrl;
   }

   public String get_rfcdayst()
   {
      return this._rfcdayst;
   }

   public void set_rfcdayst(final String _rfcdayst)
   {
      this._rfcdayst = _rfcdayst;
   }

   public String get_rfcopsys()
   {
      return this._rfcopsys;
   }

   public void set_rfcopsys(final String _rfcopsys)
   {
      this._rfcopsys = _rfcopsys;
   }

   public String get_rfcchartyp()
   {
      return this._rfcchartyp;
   }

   public void set_rfcchartyp(final String _rfcchartyp)
   {
      this._rfcchartyp = _rfcchartyp;
   }

   public String get_rfcdatabs()
   {
      return this._rfcdatabs;
   }

   public void set_rfcdatabs(final String _rfcdatabs)
   {
      this._rfcdatabs = _rfcdatabs;
   }

   public String get_rfctzone()
   {
      return this._rfctzone;
   }

   public void set_rfctzone(final String _rfctzone)
   {
      this._rfctzone = _rfctzone;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (_rfcflotyp != null && !_rfcflotyp.trim().isEmpty())
         result += "_rfcflotyp: " + _rfcflotyp;
      if (_rfcipv6addr != null && !_rfcipv6addr.trim().isEmpty())
         result += ", _rfcipv6addr: " + _rfcipv6addr;
      if (_rfcmach != null && !_rfcmach.trim().isEmpty())
         result += ", _rfcmach: " + _rfcmach;
      if (_rfchost != null && !_rfchost.trim().isEmpty())
         result += ", _rfchost: " + _rfchost;
      if (_rfcsiResv != null && !_rfcsiResv.trim().isEmpty())
         result += ", _rfcsiResv: " + _rfcsiResv;
      if (_rfcipaddr != null && !_rfcipaddr.trim().isEmpty())
         result += ", _rfcipaddr: " + _rfcipaddr;
      if (_rfcsaprl != null && !_rfcsaprl.trim().isEmpty())
         result += ", _rfcsaprl: " + _rfcsaprl;
      if (_rfcdbhost != null && !_rfcdbhost.trim().isEmpty())
         result += ", _rfcdbhost: " + _rfcdbhost;
      if (_rfcinttyp != null && !_rfcinttyp.trim().isEmpty())
         result += ", _rfcinttyp: " + _rfcinttyp;
      if (_rfcsysid != null && !_rfcsysid.trim().isEmpty())
         result += ", _rfcsysid: " + _rfcsysid;
      if (_rfcdbsys != null && !_rfcdbsys.trim().isEmpty())
         result += ", _rfcdbsys: " + _rfcdbsys;
      if (_rfcdest != null && !_rfcdest.trim().isEmpty())
         result += ", _rfcdest: " + _rfcdest;
      if (_rfcproto != null && !_rfcproto.trim().isEmpty())
         result += ", _rfcproto: " + _rfcproto;
      if (_rfchost2 != null && !_rfchost2.trim().isEmpty())
         result += ", _rfchost2: " + _rfchost2;
      if (_rfckernrl != null && !_rfckernrl.trim().isEmpty())
         result += ", _rfckernrl: " + _rfckernrl;
      if (_rfcdayst != null && !_rfcdayst.trim().isEmpty())
         result += ", _rfcdayst: " + _rfcdayst;
      if (_rfcopsys != null && !_rfcopsys.trim().isEmpty())
         result += ", _rfcopsys: " + _rfcopsys;
      if (_rfcchartyp != null && !_rfcchartyp.trim().isEmpty())
         result += ", _rfcchartyp: " + _rfcchartyp;
      if (_rfcdatabs != null && !_rfcdatabs.trim().isEmpty())
         result += ", _rfcdatabs: " + _rfcdatabs;
      if (_rfctzone != null && !_rfctzone.trim().isEmpty())
         result += ", _rfctzone: " + _rfctzone;
      return result;
   }
}