package com.tns.gen.android.app;

public class ActionBar_TabListener_ftns_modules_ui_tab_view_tab_view_l119_c29__ implements android.app.ActionBar.TabListener, com.tns.NativeScriptHashCodeProvider {
	public void onTabReselected(android.app.ActionBar.Tab param_0, android.app.FragmentTransaction param_1) {
		java.lang.Object[] params = new Object[2];
		params[0] = param_0;
		params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "onTabReselected", params);
	}

	public void onTabSelected(android.app.ActionBar.Tab param_0, android.app.FragmentTransaction param_1) {
		java.lang.Object[] params = new Object[2];
		params[0] = param_0;
		params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "onTabSelected", params);
	}

	public void onTabUnselected(android.app.ActionBar.Tab param_0, android.app.FragmentTransaction param_1) {
		java.lang.Object[] params = new Object[2];
		params[0] = param_0;
		params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "onTabUnselected", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
