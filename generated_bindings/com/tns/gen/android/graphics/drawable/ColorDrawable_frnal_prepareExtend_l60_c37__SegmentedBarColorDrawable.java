package com.tns.gen.android.graphics.drawable;

public class ColorDrawable_frnal_prepareExtend_l60_c37__SegmentedBarColorDrawable extends android.graphics.drawable.ColorDrawable implements com.tns.NativeScriptHashCodeProvider {
	public ColorDrawable_frnal_prepareExtend_l60_c37__SegmentedBarColorDrawable() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public ColorDrawable_frnal_prepareExtend_l60_c37__SegmentedBarColorDrawable(int param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public void draw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "draw", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
