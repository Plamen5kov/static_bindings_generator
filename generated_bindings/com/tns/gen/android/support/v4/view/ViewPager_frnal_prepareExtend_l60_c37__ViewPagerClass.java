package com.tns.gen.android.support.v4.view;

public class ViewPager_frnal_prepareExtend_l60_c37__ViewPagerClass extends android.support.v4.view.ViewPager implements com.tns.NativeScriptHashCodeProvider {
	public ViewPager_frnal_prepareExtend_l60_c37__ViewPagerClass(android.content.Context param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public ViewPager_frnal_prepareExtend_l60_c37__ViewPagerClass(android.content.Context param_0, android.util.AttributeSet param_1) {
		super(param_0, param_1);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	protected void onVisibilityChanged(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onVisibilityChanged", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
