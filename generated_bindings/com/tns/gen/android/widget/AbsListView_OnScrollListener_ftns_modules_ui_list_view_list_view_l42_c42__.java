package com.tns.gen.android.widget;

public class AbsListView_OnScrollListener_ftns_modules_ui_list_view_list_view_l42_c42__ implements android.widget.AbsListView.OnScrollListener, com.tns.NativeScriptHashCodeProvider {
	public void onScroll(android.widget.AbsListView param_0, int param_1, int param_2, int param_3) {
		java.lang.Object[] params = new Object[4];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		params[3] = param_3;
		com.tns.Platform.callJSMethod(this, "onScroll", params);
	}

	public void onScrollStateChanged(android.widget.AbsListView param_0, int param_1) {
		java.lang.Object[] params = new Object[2];
		params[0] = param_0;
		params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "onScrollStateChanged", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
