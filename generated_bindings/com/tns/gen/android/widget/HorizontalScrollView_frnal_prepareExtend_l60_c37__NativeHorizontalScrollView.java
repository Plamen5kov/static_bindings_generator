package com.tns.gen.android.widget;

public class HorizontalScrollView_frnal_prepareExtend_l60_c37__NativeHorizontalScrollView extends android.widget.HorizontalScrollView implements com.tns.NativeScriptHashCodeProvider {
	public HorizontalScrollView_frnal_prepareExtend_l60_c37__NativeHorizontalScrollView(android.content.Context param_0, android.util.AttributeSet param_1, int param_2) {
		super(param_0, param_1, param_2);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public HorizontalScrollView_frnal_prepareExtend_l60_c37__NativeHorizontalScrollView(android.content.Context param_0, android.util.AttributeSet param_1) {
		super(param_0, param_1);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public HorizontalScrollView_frnal_prepareExtend_l60_c37__NativeHorizontalScrollView(android.content.Context param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	protected void onLayout(boolean param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "onLayout", params);
	}

	protected void onMeasure(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onMeasure", params);
	}

	protected android.os.Parcelable onSaveInstanceState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.Parcelable)com.tns.Platform.callJSMethod(this, "onSaveInstanceState", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
