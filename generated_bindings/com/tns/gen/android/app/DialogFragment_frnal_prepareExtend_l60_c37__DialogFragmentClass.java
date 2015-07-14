package com.tns.gen.android.app;

public class DialogFragment_frnal_prepareExtend_l60_c37__DialogFragmentClass extends android.app.DialogFragment implements com.tns.NativeScriptHashCodeProvider {
	public DialogFragment_frnal_prepareExtend_l60_c37__DialogFragmentClass() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	public android.app.Dialog onCreateDialog(android.os.Bundle param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.app.Dialog)com.tns.Platform.callJSMethod(this, "onCreateDialog", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
