package com.tns.gen.android.text;

public class TextWatcher_ftns_modules_ui_editable_text_base_editable_text_base_l28_c27__ implements android.text.TextWatcher, com.tns.NativeScriptHashCodeProvider {
	public void afterTextChanged(android.text.Editable param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "afterTextChanged", params);
	}

	public void beforeTextChanged(java.lang.CharSequence param_0, int param_1, int param_2, int param_3) {
		java.lang.Object[] params = new Object[4];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		params[3] = param_3;
		com.tns.Platform.callJSMethod(this, "beforeTextChanged", params);
	}

	public void onTextChanged(java.lang.CharSequence param_0, int param_1, int param_2, int param_3) {
		java.lang.Object[] params = new Object[4];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		params[3] = param_3;
		com.tns.Platform.callJSMethod(this, "onTextChanged", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
