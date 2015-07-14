package com.tns.gen.android.webkit;

public class WebViewClient_frnal_prepareExtend_l60_c37__WebViewClientClass extends android.webkit.WebViewClient implements com.tns.NativeScriptHashCodeProvider {
	public WebViewClient_frnal_prepareExtend_l60_c37__WebViewClientClass() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public void onPageFinished(android.webkit.WebView param_0, java.lang.String param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onPageFinished", params);
	}

	public void onPageStarted(android.webkit.WebView param_0, java.lang.String param_1, android.graphics.Bitmap param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "onPageStarted", params);
	}

	public void onReceivedError(android.webkit.WebView param_0, int param_1, java.lang.String param_2, java.lang.String param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onReceivedError", params);
	}

	public boolean shouldOverrideUrlLoading(android.webkit.WebView param_0, java.lang.String param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "shouldOverrideUrlLoading", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
