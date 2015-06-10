package com.tns.gen.java.lang;

public class Object extends java.lang.Object implements com.tns.NativeScriptHashCodeProvider {
	public Object() {
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
		if ((__ho0 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "clone", params);
		} else {
			return super.clone();
		}
	}

	public boolean equals(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "equals", params);
		} else {
			return super.equals(param_0);
		}
	}

	protected void finalize() throws java.lang.Throwable {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "finalize", params);
		} else {
			super.finalize();
		}
	}

	public int hashCode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "hashCode", params);
		} else {
			return super.hashCode();
		}
	}

	public java.lang.String toString() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "toString", params);
		} else {
			return super.toString();
		}
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	public void setNativeScriptOverrides(java.lang.String[] overrides) {
		for (java.lang.String name: overrides) {
			if (name.equals("init")) {
				__ctorOverridden = true;
			}
			if (name.equals("clone")) {
				__ho0 |= (1 << 0);
			} else if (name.equals("equals")) {
				__ho0 |= (1 << 1);
			} else if (name.equals("finalize")) {
				__ho0 |= (1 << 2);
			} else if (name.equals("hashCode")) {
				__ho0 |= (1 << 3);
			} else if (name.equals("toString")) {
				__ho0 |= (1 << 4);
			}
		}
	}
	private boolean __initialized;
	private boolean __ctorOverridden;
	private byte __ho0;
	private byte __ho1;
}
