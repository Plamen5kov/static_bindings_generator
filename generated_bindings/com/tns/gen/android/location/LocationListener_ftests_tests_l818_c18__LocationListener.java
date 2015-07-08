package com.tns.gen.android.location;

public class LocationListener_ftests_tests_l818_c18__LocationListener implements android.location.LocationListener, com.tns.NativeScriptHashCodeProvider {
	public void onLocationChanged(android.location.Location param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onLocationChanged", params);
	}

	public void onProviderDisabled(java.lang.String param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onProviderDisabled", params);
	}

	public void onProviderEnabled(java.lang.String param_0) {
		java.lang.Object[] params = new Object[1];
		params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "onProviderEnabled", params);
	}

	public void onStatusChanged(java.lang.String param_0, int param_1, android.os.Bundle param_2) {
		java.lang.Object[] params = new Object[3];
		params[0] = param_0;
		params[1] = param_1;
		params[2] = param_2;
		com.tns.Platform.callJSMethod(this, "onStatusChanged", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
}
