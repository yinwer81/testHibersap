package com.dunkcoder.hibersap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import java.lang.Override;

@BapiStructure
public class Return
{

   @Parameter("MESSAGE_V3")
   String _messageV3;
   @Parameter("LOG_MSG_NO")
   String _logMsgNo;
   @Parameter("TYPE")
   String _type;
   @Parameter("MESSAGE")
   String _message;
   @Parameter("MESSAGE_V1")
   String _messageV1;
   @Parameter("MESSAGE_V2")
   String _messageV2;
   @Parameter("LOG_NO")
   String _logNo;
   @Parameter("CODE")
   String _code;
   @Parameter("MESSAGE_V4")
   String _messageV4;

   public String get_messageV3()
   {
      return this._messageV3;
   }

   public void set_messageV3(final String _messageV3)
   {
      this._messageV3 = _messageV3;
   }

   public String get_logMsgNo()
   {
      return this._logMsgNo;
   }

   public void set_logMsgNo(final String _logMsgNo)
   {
      this._logMsgNo = _logMsgNo;
   }

   public String get_type()
   {
      return this._type;
   }

   public void set_type(final String _type)
   {
      this._type = _type;
   }

   public String get_message()
   {
      return this._message;
   }

   public void set_message(final String _message)
   {
      this._message = _message;
   }

   public String get_messageV1()
   {
      return this._messageV1;
   }

   public void set_messageV1(final String _messageV1)
   {
      this._messageV1 = _messageV1;
   }

   public String get_messageV2()
   {
      return this._messageV2;
   }

   public void set_messageV2(final String _messageV2)
   {
      this._messageV2 = _messageV2;
   }

   public String get_logNo()
   {
      return this._logNo;
   }

   public void set_logNo(final String _logNo)
   {
      this._logNo = _logNo;
   }

   public String get_code()
   {
      return this._code;
   }

   public void set_code(final String _code)
   {
      this._code = _code;
   }

   public String get_messageV4()
   {
      return this._messageV4;
   }

   public void set_messageV4(final String _messageV4)
   {
      this._messageV4 = _messageV4;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (_messageV3 != null && !_messageV3.trim().isEmpty())
         result += "_messageV3: " + _messageV3;
      if (_logMsgNo != null && !_logMsgNo.trim().isEmpty())
         result += ", _logMsgNo: " + _logMsgNo;
      if (_type != null && !_type.trim().isEmpty())
         result += ", _type: " + _type;
      if (_message != null && !_message.trim().isEmpty())
         result += ", _message: " + _message;
      if (_messageV1 != null && !_messageV1.trim().isEmpty())
         result += ", _messageV1: " + _messageV1;
      if (_messageV2 != null && !_messageV2.trim().isEmpty())
         result += ", _messageV2: " + _messageV2;
      if (_logNo != null && !_logNo.trim().isEmpty())
         result += ", _logNo: " + _logNo;
      if (_code != null && !_code.trim().isEmpty())
         result += ", _code: " + _code;
      if (_messageV4 != null && !_messageV4.trim().isEmpty())
         result += ", _messageV4: " + _messageV4;
      return result;
   }
}