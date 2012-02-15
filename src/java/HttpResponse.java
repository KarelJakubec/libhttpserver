/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class HttpResponse {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HttpResponse(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HttpResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libjavawebserver_frameworkJNI.delete_HttpResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HttpResponse() {
    this(libjavawebserver_frameworkJNI.new_HttpResponse__SWIG_0(), true);
  }

  public HttpResponse(String content, int responseCode, HttpResponse.ResponseType_T responseType) {
    this(libjavawebserver_frameworkJNI.new_HttpResponse__SWIG_1(content, responseCode, responseType.swigValue()), true);
  }

  public HttpResponse(String content, int responseCode) {
    this(libjavawebserver_frameworkJNI.new_HttpResponse__SWIG_2(content, responseCode), true);
  }

  public HttpResponse(HttpResponse arg0) {
    this(libjavawebserver_frameworkJNI.new_HttpResponse__SWIG_3(HttpResponse.getCPtr(arg0), arg0), true);
  }

  public String getContent() {
    return libjavawebserver_frameworkJNI.HttpResponse_getContent(swigCPtr, this);
  }

  public void setContent(String arg0) {
    libjavawebserver_frameworkJNI.HttpResponse_setContent(swigCPtr, this, arg0);
  }

  public String getHeader(String arg0) {
    return libjavawebserver_frameworkJNI.HttpResponse_getHeader(swigCPtr, this, arg0);
  }

  public String getFooter(String arg0) {
    return libjavawebserver_frameworkJNI.HttpResponse_getFooter(swigCPtr, this, arg0);
  }

  public void setHeader(String arg0, String arg1) {
    libjavawebserver_frameworkJNI.HttpResponse_setHeader(swigCPtr, this, arg0, arg1);
  }

  public void setFooter(String arg0, String arg1) {
    libjavawebserver_frameworkJNI.HttpResponse_setFooter(swigCPtr, this, arg0, arg1);
  }

  public void setContentType(String arg0) {
    libjavawebserver_frameworkJNI.HttpResponse_setContentType(swigCPtr, this, arg0);
  }

  public void removeHeader(String arg0) {
    libjavawebserver_frameworkJNI.HttpResponse_removeHeader(swigCPtr, this, arg0);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__string_t getHeaders() {
    return new SWIGTYPE_p_std__mapT_std__string_std__string_t(libjavawebserver_frameworkJNI.HttpResponse_getHeaders(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__string_t getFooters() {
    return new SWIGTYPE_p_std__mapT_std__string_std__string_t(libjavawebserver_frameworkJNI.HttpResponse_getFooters(swigCPtr, this), true);
  }

  public void setHeaders(SWIGTYPE_p_std__mapT_std__string_std__string_t arg0) {
    libjavawebserver_frameworkJNI.HttpResponse_setHeaders(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(arg0));
  }

  public void setFooters(SWIGTYPE_p_std__mapT_std__string_std__string_t arg0) {
    libjavawebserver_frameworkJNI.HttpResponse_setFooters(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(arg0));
  }

  public void setResponseCode(int responseCode) {
    libjavawebserver_frameworkJNI.HttpResponse_setResponseCode(swigCPtr, this, responseCode);
  }

  public int getResponseCode() {
    return libjavawebserver_frameworkJNI.HttpResponse_getResponseCode(swigCPtr, this);
  }

  public final static class ResponseType_T {
    public final static HttpResponse.ResponseType_T STRING_CONTENT = new HttpResponse.ResponseType_T("STRING_CONTENT", 0);
    public final static HttpResponse.ResponseType_T FILE_CONTENT = new HttpResponse.ResponseType_T("FILE_CONTENT");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ResponseType_T swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ResponseType_T.class + " with value " + swigValue);
    }

    private ResponseType_T(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ResponseType_T(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ResponseType_T(String swigName, ResponseType_T swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ResponseType_T[] swigValues = { STRING_CONTENT, FILE_CONTENT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}