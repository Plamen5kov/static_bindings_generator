package com.tns.gen.java.lang;

public class Object_ftests_extendClassNameTests_l17_c29__abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789 extends java.lang.Object implements com.tns.NativeScriptHashCodeProvider {
	public Object_ftests_extendClassNameTests_l17_c29__abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789() {
		super();
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
	}

	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "clone", params);
	}

	public boolean equals(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "equals", params);
	}

	protected void finalize() throws java.lang.Throwable {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "finalize", params);
	}

	public int hashCode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "hashCode", params);
	}

	public java.lang.String toString() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "toString", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
