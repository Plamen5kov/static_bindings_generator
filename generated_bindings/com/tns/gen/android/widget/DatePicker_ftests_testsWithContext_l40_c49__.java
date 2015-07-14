package com.tns.gen.android.widget;

public class DatePicker_ftests_testsWithContext_l40_c49__ extends android.widget.DatePicker implements com.tns.NativeScriptHashCodeProvider {
	public DatePicker_ftests_testsWithContext_l40_c49__(android.content.Context param_0, android.util.AttributeSet param_1, int param_2) {
		super(param_0, param_1, param_2);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public DatePicker_ftests_testsWithContext_l40_c49__(android.content.Context param_0, android.util.AttributeSet param_1) {
		super(param_0, param_1);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public DatePicker_ftests_testsWithContext_l40_c49__(android.content.Context param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public void init(int param_0, int param_1, int param_2, android.widget.DatePicker.OnDateChangedListener param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "init", false, params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
