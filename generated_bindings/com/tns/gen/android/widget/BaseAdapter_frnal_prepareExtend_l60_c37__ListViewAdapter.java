package com.tns.gen.android.widget;

public class BaseAdapter_frnal_prepareExtend_l60_c37__ListViewAdapter extends android.widget.BaseAdapter implements com.tns.NativeScriptHashCodeProvider {
	public BaseAdapter_frnal_prepareExtend_l60_c37__ListViewAdapter() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public int getCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCount", params);
	}

	public java.lang.Object getItem(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getItem", params);
	}

	public long getItemId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Long)com.tns.Platform.callJSMethod(this, "getItemId", params);
	}

	public android.view.View getView(int param_0, android.view.View param_1, android.view.ViewGroup param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "getView", params);
	}

	public boolean hasStableIds() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasStableIds", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
