package com.tns.gen.android.util;

public class LruCache_frnal_prepareExtend_l60_c37__LruBitmapCache extends android.util.LruCache implements com.tns.NativeScriptHashCodeProvider {
	public LruCache_frnal_prepareExtend_l60_c37__LruBitmapCache(int param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	protected int sizeOf(java.lang.Object param_0, java.lang.Object param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "sizeOf", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
