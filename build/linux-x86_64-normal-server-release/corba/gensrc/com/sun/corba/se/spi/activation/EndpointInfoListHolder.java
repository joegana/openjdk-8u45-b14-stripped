package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/EndpointInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/jeroen/jdk8u45-b14/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, June 2, 2015 11:08:42 AM CEST
*/

public final class EndpointInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.EndPointInfo value[] = null;

  public EndpointInfoListHolder ()
  {
  }

  public EndpointInfoListHolder (com.sun.corba.se.spi.activation.EndPointInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.EndpointInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.EndpointInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.EndpointInfoListHelper.type ();
  }

}
