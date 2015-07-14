package com.tns.gen.android.support.v4.view;

public class PagerAdapter_frnal_prepareExtend_l60_c37__PagerAdapterClass extends android.support.v4.view.PagerAdapter implements com.tns.NativeScriptHashCodeProvider {
	public PagerAdapter_frnal_prepareExtend_l60_c37__PagerAdapterClass() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public void destroyItem(android.view.View param_0, int param_1, java.lang.Object param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "destroyItem", params);
	}

	public void destroyItem(android.view.ViewGroup param_0, int param_1, java.lang.Object param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "destroyItem", params);
	}

	public int getCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCount", params);
	}

	public java.lang.CharSequence getPageTitle(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getPageTitle", params);
	}

	public java.lang.Object instantiateItem(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "instantiateItem", params);
	}

	public java.lang.Object instantiateItem(android.view.ViewGroup param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "instantiateItem", params);
	}

	public boolean isViewFromObject(android.view.View param_0, java.lang.Object param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isViewFromObject", params);
	}

	public void restoreState(android.os.Parcelable param_0, java.lang.ClassLoader param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "restoreState", params);
	}

	public android.os.Parcelable saveState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.Parcelable)com.tns.Platform.callJSMethod(this, "saveState", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
