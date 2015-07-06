package com.tns.gen.android.widget;

public class SeekBar_OnSeekBarChangeListener_f__tns_modules_ui_slider_slider_l41_c32__ implements android.widget.SeekBar.OnSeekBarChangeListener, com.tns.NativeScriptHashCodeProvider {
	public void onProgressChanged(android.widget.SeekBar param_0, int param_1, boolean param_2) {
		java.lang.Object[] params = new Object[3];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		com.tns.Platform.callJSMethod(this, "onProgressChanged", params);
	}

	public void onStartTrackingTouch(android.widget.SeekBar param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onStartTrackingTouch", params);
	}

	public void onStopTrackingTouch(android.widget.SeekBar param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onStopTrackingTouch", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
