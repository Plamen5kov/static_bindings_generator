package com.tns.gen.android.widget;

public class SearchView_OnQueryTextListener_f__tns_modules_ui_search_bar_search_bar_l83_c46__ implements android.widget.SearchView.OnQueryTextListener, com.tns.NativeScriptHashCodeProvider {
	public boolean onQueryTextChange(java.lang.String param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		return (Boolean)com.tns.Platform.callJSMethod(this, "onQueryTextChange", params);
	}

	public boolean onQueryTextSubmit(java.lang.String param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		return (Boolean)com.tns.Platform.callJSMethod(this, "onQueryTextSubmit", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
