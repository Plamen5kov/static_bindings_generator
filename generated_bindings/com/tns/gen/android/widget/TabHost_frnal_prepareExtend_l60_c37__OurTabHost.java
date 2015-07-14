package com.tns.gen.android.widget;

public class TabHost_frnal_prepareExtend_l60_c37__OurTabHost extends android.widget.TabHost implements com.tns.NativeScriptHashCodeProvider {
	public TabHost_frnal_prepareExtend_l60_c37__OurTabHost(android.content.Context param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public TabHost_frnal_prepareExtend_l60_c37__OurTabHost(android.content.Context param_0, android.util.AttributeSet param_1) {
		super(param_0, param_1);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	protected void onAttachedToWindow() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAttachedToWindow", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
