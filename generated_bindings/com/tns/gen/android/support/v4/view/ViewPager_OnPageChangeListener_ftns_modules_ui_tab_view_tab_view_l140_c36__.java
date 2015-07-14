package com.tns.gen.android.support.v4.view;

public class ViewPager_OnPageChangeListener_ftns_modules_ui_tab_view_tab_view_l140_c36__ implements android.support.v4.view.ViewPager.OnPageChangeListener, com.tns.NativeScriptHashCodeProvider {
	public void onPageScrollStateChanged(int param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onPageScrollStateChanged", params);
	}

	public void onPageScrolled(int param_0, float param_1, int param_2) {
		java.lang.Object[] params = new Object[3];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		com.tns.Platform.callJSMethod(this, "onPageScrolled", params);
	}

	public void onPageSelected(int param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onPageSelected", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
