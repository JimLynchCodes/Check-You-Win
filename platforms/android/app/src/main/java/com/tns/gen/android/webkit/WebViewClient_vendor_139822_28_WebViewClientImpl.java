/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.android.webkit;

public class WebViewClient_vendor_139822_28_WebViewClientImpl extends android.webkit.WebViewClient
    implements com.tns.NativeScriptHashCodeProvider {
  public WebViewClient_vendor_139822_28_WebViewClientImpl() {
    super();
    com.tns.Runtime.initInstance(this);
  }

  @SuppressWarnings("deprecation")
  public boolean shouldOverrideUrlLoading(
      android.webkit.WebView param_0, java.lang.String param_1) {
    java.lang.Object[] args = new java.lang.Object[2];
    args[0] = param_0;
    args[1] = param_1;
    return (boolean)
        com.tns.Runtime.callJSMethod(this, "shouldOverrideUrlLoading", boolean.class, args);
  }

  public boolean shouldOverrideUrlLoading(
      android.webkit.WebView param_0, android.webkit.WebResourceRequest param_1) {
    java.lang.Object[] args = new java.lang.Object[2];
    args[0] = param_0;
    args[1] = param_1;
    return (boolean)
        com.tns.Runtime.callJSMethod(this, "shouldOverrideUrlLoading", boolean.class, args);
  }

  public void onPageStarted(
      android.webkit.WebView param_0, java.lang.String param_1, android.graphics.Bitmap param_2) {
    java.lang.Object[] args = new java.lang.Object[3];
    args[0] = param_0;
    args[1] = param_1;
    args[2] = param_2;
    com.tns.Runtime.callJSMethod(this, "onPageStarted", void.class, args);
  }

  public void onPageFinished(android.webkit.WebView param_0, java.lang.String param_1) {
    java.lang.Object[] args = new java.lang.Object[2];
    args[0] = param_0;
    args[1] = param_1;
    com.tns.Runtime.callJSMethod(this, "onPageFinished", void.class, args);
  }

  @SuppressWarnings("deprecation")
  public void onReceivedError(
      android.webkit.WebView param_0,
      int param_1,
      java.lang.String param_2,
      java.lang.String param_3) {
    java.lang.Object[] args = new java.lang.Object[4];
    args[0] = param_0;
    args[1] = param_1;
    args[2] = param_2;
    args[3] = param_3;
    com.tns.Runtime.callJSMethod(this, "onReceivedError", void.class, args);
  }

  public void onReceivedError(
      android.webkit.WebView param_0,
      android.webkit.WebResourceRequest param_1,
      android.webkit.WebResourceError param_2) {
    java.lang.Object[] args = new java.lang.Object[3];
    args[0] = param_0;
    args[1] = param_1;
    args[2] = param_2;
    com.tns.Runtime.callJSMethod(this, "onReceivedError", void.class, args);
  }

  public int hashCode__super() {
    return super.hashCode();
  }

  public boolean equals__super(java.lang.Object other) {
    return super.equals(other);
  }
}
