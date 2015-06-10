package com.tns.gen.android.widget;

public class DatePicker extends android.widget.DatePicker implements com.tns.NativeScriptHashCodeProvider {
	public DatePicker(android.content.Context param_0, android.util.AttributeSet param_1, int param_2) {
		super(param_0, param_1, param_2);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public DatePicker(android.content.Context param_0, android.util.AttributeSet param_1) {
		super(param_0, param_1);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public DatePicker(android.content.Context param_0) {
		super(param_0);
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
		com.tns.Platform.callJSMethod(this, "init", true, params);
	}

	public void addChildrenForAccessibility(java.util.ArrayList param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addChildrenForAccessibility", params);
		} else {
			super.addChildrenForAccessibility(param_0);
		}
	}

	public void addFocusables(java.util.ArrayList param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "addFocusables", params);
		} else {
			super.addFocusables(param_0, param_1, param_2);
		}
	}

	public void addFocusables(java.util.ArrayList param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "addFocusables", params);
		} else {
			super.addFocusables(param_0, param_1);
		}
	}

	public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addOnAttachStateChangeListener", params);
		} else {
			super.addOnAttachStateChangeListener(param_0);
		}
	}

	public void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addOnLayoutChangeListener", params);
		} else {
			super.addOnLayoutChangeListener(param_0);
		}
	}

	public boolean addStatesFromChildren() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "addStatesFromChildren", params);
		} else {
			return super.addStatesFromChildren();
		}
	}

	public void addTouchables(java.util.ArrayList param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addTouchables", params);
		} else {
			super.addTouchables(param_0);
		}
	}

	public void addView(android.view.View param_0, android.view.ViewGroup.LayoutParams param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "addView", params);
		} else {
			super.addView(param_0, param_1);
		}
	}

	public void addView(android.view.View param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "addView", params);
		} else {
			super.addView(param_0, param_1, param_2);
		}
	}

	public void addView(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "addView", params);
		} else {
			super.addView(param_0, param_1);
		}
	}

	public void addView(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addView", params);
		} else {
			super.addView(param_0);
		}
	}

	public void addView(android.view.View param_0, int param_1, android.view.ViewGroup.LayoutParams param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "addView", params);
		} else {
			super.addView(param_0, param_1, param_2);
		}
	}

	protected boolean addViewInLayout(android.view.View param_0, int param_1, android.view.ViewGroup.LayoutParams param_2, boolean param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			return (Boolean)com.tns.Platform.callJSMethod(this, "addViewInLayout", params);
		} else {
			return super.addViewInLayout(param_0, param_1, param_2, param_3);
		}
	}

	protected boolean addViewInLayout(android.view.View param_0, int param_1, android.view.ViewGroup.LayoutParams param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "addViewInLayout", params);
		} else {
			return super.addViewInLayout(param_0, param_1, param_2);
		}
	}

	public android.view.ViewPropertyAnimator animate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewPropertyAnimator)com.tns.Platform.callJSMethod(this, "animate", params);
		} else {
			return super.animate();
		}
	}

	public void announceForAccessibility(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "announceForAccessibility", params);
		} else {
			super.announceForAccessibility(param_0);
		}
	}

	protected void attachLayoutAnimationParameters(android.view.View param_0, android.view.ViewGroup.LayoutParams param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "attachLayoutAnimationParameters", params);
		} else {
			super.attachLayoutAnimationParameters(param_0, param_1, param_2, param_3);
		}
	}

	protected void attachViewToParent(android.view.View param_0, int param_1, android.view.ViewGroup.LayoutParams param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "attachViewToParent", params);
		} else {
			super.attachViewToParent(param_0, param_1, param_2);
		}
	}

	protected boolean awakenScrollBars(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
		} else {
			return super.awakenScrollBars(param_0);
		}
	}

	protected boolean awakenScrollBars() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
		} else {
			return super.awakenScrollBars();
		}
	}

	protected boolean awakenScrollBars(int param_0, boolean param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
		} else {
			return super.awakenScrollBars(param_0, param_1);
		}
	}

	public void bringChildToFront(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "bringChildToFront", params);
		} else {
			super.bringChildToFront(param_0);
		}
	}

	public void bringToFront() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "bringToFront", params);
		} else {
			super.bringToFront();
		}
	}

	public void buildDrawingCache(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "buildDrawingCache", params);
		} else {
			super.buildDrawingCache(param_0);
		}
	}

	public void buildDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "buildDrawingCache", params);
		} else {
			super.buildDrawingCache();
		}
	}

	public void buildLayer() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "buildLayer", params);
		} else {
			super.buildLayer();
		}
	}

	public boolean callOnClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "callOnClick", params);
		} else {
			return super.callOnClick();
		}
	}

	protected boolean canAnimate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "canAnimate", params);
		} else {
			return super.canAnimate();
		}
	}

	public boolean canScrollHorizontally(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "canScrollHorizontally", params);
		} else {
			return super.canScrollHorizontally(param_0);
		}
	}

	public boolean canScrollVertically(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "canScrollVertically", params);
		} else {
			return super.canScrollVertically(param_0);
		}
	}

	public void cancelLongPress() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "cancelLongPress", params);
		} else {
			super.cancelLongPress();
		}
	}

	public boolean checkInputConnectionProxy(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "checkInputConnectionProxy", params);
		} else {
			return super.checkInputConnectionProxy(param_0);
		}
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "checkLayoutParams", params);
		} else {
			return super.checkLayoutParams(param_0);
		}
	}

	public void childDrawableStateChanged(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "childDrawableStateChanged", params);
		} else {
			super.childDrawableStateChanged(param_0);
		}
	}

	protected void cleanupLayoutState(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "cleanupLayoutState", params);
		} else {
			super.cleanupLayoutState(param_0);
		}
	}

	public void clearAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearAnimation", params);
		} else {
			super.clearAnimation();
		}
	}

	public void clearChildFocus(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "clearChildFocus", params);
		} else {
			super.clearChildFocus(param_0);
		}
	}

	public void clearDisappearingChildren() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearDisappearingChildren", params);
		} else {
			super.clearDisappearingChildren();
		}
	}

	public void clearFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearFocus", params);
		} else {
			super.clearFocus();
		}
	}

	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "clone", params);
		} else {
			return super.clone();
		}
	}

	protected int computeHorizontalScrollExtent() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho3 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollExtent", params);
		} else {
			return super.computeHorizontalScrollExtent();
		}
	}

	protected int computeHorizontalScrollOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollOffset", params);
		} else {
			return super.computeHorizontalScrollOffset();
		}
	}

	protected int computeHorizontalScrollRange() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollRange", params);
		} else {
			return super.computeHorizontalScrollRange();
		}
	}

	public void computeScroll() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "computeScroll", params);
		} else {
			super.computeScroll();
		}
	}

	protected int computeVerticalScrollExtent() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollExtent", params);
		} else {
			return super.computeVerticalScrollExtent();
		}
	}

	protected int computeVerticalScrollOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollOffset", params);
		} else {
			return super.computeVerticalScrollOffset();
		}
	}

	protected int computeVerticalScrollRange() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollRange", params);
		} else {
			return super.computeVerticalScrollRange();
		}
	}

	public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.accessibility.AccessibilityNodeInfo)com.tns.Platform.callJSMethod(this, "createAccessibilityNodeInfo", params);
		} else {
			return super.createAccessibilityNodeInfo();
		}
	}

	public void createContextMenu(android.view.ContextMenu param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "createContextMenu", params);
		} else {
			super.createContextMenu(param_0);
		}
	}

	protected void debug(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "debug", params);
		} else {
			super.debug(param_0);
		}
	}

	public void destroyDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "destroyDrawingCache", params);
		} else {
			super.destroyDrawingCache();
		}
	}

	protected void detachAllViewsFromParent() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "detachAllViewsFromParent", params);
		} else {
			super.detachAllViewsFromParent();
		}
	}

	protected void detachViewFromParent(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "detachViewFromParent", params);
		} else {
			super.detachViewFromParent(param_0);
		}
	}

	protected void detachViewFromParent(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "detachViewFromParent", params);
		} else {
			super.detachViewFromParent(param_0);
		}
	}

	protected void detachViewsFromParent(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "detachViewsFromParent", params);
		} else {
			super.detachViewsFromParent(param_0, param_1);
		}
	}

	public void dispatchConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchConfigurationChanged", params);
		} else {
			super.dispatchConfigurationChanged(param_0);
		}
	}

	public void dispatchDisplayHint(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchDisplayHint", params);
		} else {
			super.dispatchDisplayHint(param_0);
		}
	}

	public boolean dispatchDragEvent(android.view.DragEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchDragEvent", params);
		} else {
			return super.dispatchDragEvent(param_0);
		}
	}

	protected void dispatchDraw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchDraw", params);
		} else {
			super.dispatchDraw(param_0);
		}
	}

	protected void dispatchFreezeSelfOnly(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchFreezeSelfOnly", params);
		} else {
			super.dispatchFreezeSelfOnly(param_0);
		}
	}

	protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericFocusedEvent", params);
		} else {
			return super.dispatchGenericFocusedEvent(param_0);
		}
	}

	public boolean dispatchGenericMotionEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericMotionEvent", params);
		} else {
			return super.dispatchGenericMotionEvent(param_0);
		}
	}

	protected boolean dispatchGenericPointerEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericPointerEvent", params);
		} else {
			return super.dispatchGenericPointerEvent(param_0);
		}
	}

	protected boolean dispatchHoverEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchHoverEvent", params);
		} else {
			return super.dispatchHoverEvent(param_0);
		}
	}

	public boolean dispatchKeyEvent(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyEvent", params);
		} else {
			return super.dispatchKeyEvent(param_0);
		}
	}

	public boolean dispatchKeyEventPreIme(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyEventPreIme", params);
		} else {
			return super.dispatchKeyEventPreIme(param_0);
		}
	}

	public boolean dispatchKeyShortcutEvent(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyShortcutEvent", params);
		} else {
			return super.dispatchKeyShortcutEvent(param_0);
		}
	}

	public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchPopulateAccessibilityEvent", params);
		} else {
			return super.dispatchPopulateAccessibilityEvent(param_0);
		}
	}

	protected void dispatchRestoreInstanceState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchRestoreInstanceState", params);
		} else {
			super.dispatchRestoreInstanceState(param_0);
		}
	}

	protected void dispatchSaveInstanceState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSaveInstanceState", params);
		} else {
			super.dispatchSaveInstanceState(param_0);
		}
	}

	public void dispatchSetActivated(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetActivated", params);
		} else {
			super.dispatchSetActivated(param_0);
		}
	}

	protected void dispatchSetPressed(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetPressed", params);
		} else {
			super.dispatchSetPressed(param_0);
		}
	}

	public void dispatchSetSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetSelected", params);
		} else {
			super.dispatchSetSelected(param_0);
		}
	}

	public void dispatchSystemUiVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSystemUiVisibilityChanged", params);
		} else {
			super.dispatchSystemUiVisibilityChanged(param_0);
		}
	}

	protected void dispatchThawSelfOnly(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchThawSelfOnly", params);
		} else {
			super.dispatchThawSelfOnly(param_0);
		}
	}

	public boolean dispatchTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchTouchEvent", params);
		} else {
			return super.dispatchTouchEvent(param_0);
		}
	}

	public boolean dispatchTrackballEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchTrackballEvent", params);
		} else {
			return super.dispatchTrackballEvent(param_0);
		}
	}

	public boolean dispatchUnhandledMove(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchUnhandledMove", params);
		} else {
			return super.dispatchUnhandledMove(param_0, param_1);
		}
	}

	protected void dispatchVisibilityChanged(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "dispatchVisibilityChanged", params);
		} else {
			super.dispatchVisibilityChanged(param_0, param_1);
		}
	}

	public void dispatchWindowFocusChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowFocusChanged", params);
		} else {
			super.dispatchWindowFocusChanged(param_0);
		}
	}

	public void dispatchWindowSystemUiVisiblityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowSystemUiVisiblityChanged", params);
		} else {
			super.dispatchWindowSystemUiVisiblityChanged(param_0);
		}
	}

	public void dispatchWindowVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowVisibilityChanged", params);
		} else {
			super.dispatchWindowVisibilityChanged(param_0);
		}
	}

	public void draw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "draw", params);
		} else {
			super.draw(param_0);
		}
	}

	protected boolean drawChild(android.graphics.Canvas param_0, android.view.View param_1, long param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "drawChild", params);
		} else {
			return super.drawChild(param_0, param_1, param_2);
		}
	}

	protected void drawableStateChanged() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "drawableStateChanged", params);
		} else {
			super.drawableStateChanged();
		}
	}

	public void endViewTransition(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "endViewTransition", params);
		} else {
			super.endViewTransition(param_0);
		}
	}

	public boolean equals(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 4)) > 0) { 
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
		if ((__ho9 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "finalize", params);
		} else {
			super.finalize();
		}
	}

	public android.view.View findFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "findFocus", params);
		} else {
			return super.findFocus();
		}
	}

	public void findViewsWithText(java.util.ArrayList param_0, java.lang.CharSequence param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "findViewsWithText", params);
		} else {
			super.findViewsWithText(param_0, param_1, param_2);
		}
	}

	protected boolean fitSystemWindows(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "fitSystemWindows", params);
		} else {
			return super.fitSystemWindows(param_0);
		}
	}

	public android.view.View focusSearch(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "focusSearch", params);
		} else {
			return super.focusSearch(param_0, param_1);
		}
	}

	public android.view.View focusSearch(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "focusSearch", params);
		} else {
			return super.focusSearch(param_0);
		}
	}

	public void focusableViewAvailable(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "focusableViewAvailable", params);
		} else {
			super.focusableViewAvailable(param_0);
		}
	}

	public void forceLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "forceLayout", params);
		} else {
			super.forceLayout();
		}
	}

	public boolean gatherTransparentRegion(android.graphics.Region param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "gatherTransparentRegion", params);
		} else {
			return super.gatherTransparentRegion(param_0);
		}
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.ViewGroup.LayoutParams)com.tns.Platform.callJSMethod(this, "generateLayoutParams", params);
		} else {
			return super.generateLayoutParams(param_0);
		}
	}

	public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.accessibility.AccessibilityNodeProvider)com.tns.Platform.callJSMethod(this, "getAccessibilityNodeProvider", params);
		} else {
			return super.getAccessibilityNodeProvider();
		}
	}

	public float getAlpha() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getAlpha", params);
		} else {
			return super.getAlpha();
		}
	}

	public android.view.animation.Animation getAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.animation.Animation)com.tns.Platform.callJSMethod(this, "getAnimation", params);
		} else {
			return super.getAnimation();
		}
	}

	public android.os.IBinder getApplicationWindowToken() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (android.os.IBinder)com.tns.Platform.callJSMethod(this, "getApplicationWindowToken", params);
		} else {
			return super.getApplicationWindowToken();
		}
	}

	public android.graphics.drawable.Drawable getBackground() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable)com.tns.Platform.callJSMethod(this, "getBackground", params);
		} else {
			return super.getBackground();
		}
	}

	public int getBaseline() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getBaseline", params);
		} else {
			return super.getBaseline();
		}
	}

	protected float getBottomFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getBottomFadingEdgeStrength", params);
		} else {
			return super.getBottomFadingEdgeStrength();
		}
	}

	protected int getBottomPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getBottomPaddingOffset", params);
		} else {
			return super.getBottomPaddingOffset();
		}
	}

	public android.widget.CalendarView getCalendarView() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.widget.CalendarView)com.tns.Platform.callJSMethod(this, "getCalendarView", params);
		} else {
			return super.getCalendarView();
		}
	}

	public boolean getCalendarViewShown() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getCalendarViewShown", params);
		} else {
			return super.getCalendarViewShown();
		}
	}

	public float getCameraDistance() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getCameraDistance", params);
		} else {
			return super.getCameraDistance();
		}
	}

	public android.view.View getChildAt(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "getChildAt", params);
		} else {
			return super.getChildAt(param_0);
		}
	}

	public int getChildCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getChildCount", params);
		} else {
			return super.getChildCount();
		}
	}

	protected int getChildDrawingOrder(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "getChildDrawingOrder", params);
		} else {
			return super.getChildDrawingOrder(param_0, param_1);
		}
	}

	protected boolean getChildStaticTransformation(android.view.View param_0, android.view.animation.Transformation param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getChildStaticTransformation", params);
		} else {
			return super.getChildStaticTransformation(param_0, param_1);
		}
	}

	public boolean getChildVisibleRect(android.view.View param_0, android.graphics.Rect param_1, android.graphics.Point param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getChildVisibleRect", params);
		} else {
			return super.getChildVisibleRect(param_0, param_1, param_2);
		}
	}

	public boolean getConsiderGoneChildrenWhenMeasuring() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getConsiderGoneChildrenWhenMeasuring", params);
		} else {
			return super.getConsiderGoneChildrenWhenMeasuring();
		}
	}

	public java.lang.CharSequence getContentDescription() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getContentDescription", params);
		} else {
			return super.getContentDescription();
		}
	}

	protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ContextMenu.ContextMenuInfo)com.tns.Platform.callJSMethod(this, "getContextMenuInfo", params);
		} else {
			return super.getContextMenuInfo();
		}
	}

	public int getDayOfMonth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDayOfMonth", params);
		} else {
			return super.getDayOfMonth();
		}
	}

	public int getDescendantFocusability() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDescendantFocusability", params);
		} else {
			return super.getDescendantFocusability();
		}
	}

	public android.view.Display getDisplay() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.Display)com.tns.Platform.callJSMethod(this, "getDisplay", params);
		} else {
			return super.getDisplay();
		}
	}

	public android.graphics.Bitmap getDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.Bitmap)com.tns.Platform.callJSMethod(this, "getDrawingCache", params);
		} else {
			return super.getDrawingCache();
		}
	}

	public android.graphics.Bitmap getDrawingCache(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.graphics.Bitmap)com.tns.Platform.callJSMethod(this, "getDrawingCache", params);
		} else {
			return super.getDrawingCache(param_0);
		}
	}

	public int getDrawingCacheBackgroundColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDrawingCacheBackgroundColor", params);
		} else {
			return super.getDrawingCacheBackgroundColor();
		}
	}

	public int getDrawingCacheQuality() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDrawingCacheQuality", params);
		} else {
			return super.getDrawingCacheQuality();
		}
	}

	public void getDrawingRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getDrawingRect", params);
		} else {
			super.getDrawingRect(param_0);
		}
	}

	public long getDrawingTime() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Long)com.tns.Platform.callJSMethod(this, "getDrawingTime", params);
		} else {
			return super.getDrawingTime();
		}
	}

	public boolean getFilterTouchesWhenObscured() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFilterTouchesWhenObscured", params);
		} else {
			return super.getFilterTouchesWhenObscured();
		}
	}

	public boolean getFitsSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFitsSystemWindows", params);
		} else {
			return super.getFitsSystemWindows();
		}
	}

	public java.util.ArrayList getFocusables(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.util.ArrayList)com.tns.Platform.callJSMethod(this, "getFocusables", params);
		} else {
			return super.getFocusables(param_0);
		}
	}

	public android.view.View getFocusedChild() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "getFocusedChild", params);
		} else {
			return super.getFocusedChild();
		}
	}

	public void getFocusedRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getFocusedRect", params);
		} else {
			super.getFocusedRect(param_0);
		}
	}

	public android.graphics.drawable.Drawable getForeground() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable)com.tns.Platform.callJSMethod(this, "getForeground", params);
		} else {
			return super.getForeground();
		}
	}

	public int getForegroundGravity() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getForegroundGravity", params);
		} else {
			return super.getForegroundGravity();
		}
	}

	public boolean getGlobalVisibleRect(android.graphics.Rect param_0, android.graphics.Point param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getGlobalVisibleRect", params);
		} else {
			return super.getGlobalVisibleRect(param_0, param_1);
		}
	}

	public android.os.Handler getHandler() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (android.os.Handler)com.tns.Platform.callJSMethod(this, "getHandler", params);
		} else {
			return super.getHandler();
		}
	}

	public void getHitRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getHitRect", params);
		} else {
			super.getHitRect(param_0);
		}
	}

	public int getHorizontalFadingEdgeLength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHorizontalFadingEdgeLength", params);
		} else {
			return super.getHorizontalFadingEdgeLength();
		}
	}

	protected int getHorizontalScrollbarHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHorizontalScrollbarHeight", params);
		} else {
			return super.getHorizontalScrollbarHeight();
		}
	}

	public int getId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getId", params);
		} else {
			return super.getId();
		}
	}

	public int getImportantForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImportantForAccessibility", params);
		} else {
			return super.getImportantForAccessibility();
		}
	}

	public boolean getKeepScreenOn() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getKeepScreenOn", params);
		} else {
			return super.getKeepScreenOn();
		}
	}

	public android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.KeyEvent.DispatcherState)com.tns.Platform.callJSMethod(this, "getKeyDispatcherState", params);
		} else {
			return super.getKeyDispatcherState();
		}
	}

	public int getLabelFor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLabelFor", params);
		} else {
			return super.getLabelFor();
		}
	}

	public int getLayerType() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLayerType", params);
		} else {
			return super.getLayerType();
		}
	}

	public android.view.animation.LayoutAnimationController getLayoutAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.animation.LayoutAnimationController)com.tns.Platform.callJSMethod(this, "getLayoutAnimation", params);
		} else {
			return super.getLayoutAnimation();
		}
	}

	public android.view.animation.Animation.AnimationListener getLayoutAnimationListener() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.animation.Animation.AnimationListener)com.tns.Platform.callJSMethod(this, "getLayoutAnimationListener", params);
		} else {
			return super.getLayoutAnimationListener();
		}
	}

	public int getLayoutDirection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLayoutDirection", params);
		} else {
			return super.getLayoutDirection();
		}
	}

	public android.view.ViewGroup.LayoutParams getLayoutParams() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewGroup.LayoutParams)com.tns.Platform.callJSMethod(this, "getLayoutParams", params);
		} else {
			return super.getLayoutParams();
		}
	}

	public android.animation.LayoutTransition getLayoutTransition() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (android.animation.LayoutTransition)com.tns.Platform.callJSMethod(this, "getLayoutTransition", params);
		} else {
			return super.getLayoutTransition();
		}
	}

	protected float getLeftFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLeftFadingEdgeStrength", params);
		} else {
			return super.getLeftFadingEdgeStrength();
		}
	}

	protected int getLeftPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLeftPaddingOffset", params);
		} else {
			return super.getLeftPaddingOffset();
		}
	}

	public void getLocationInWindow(int[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getLocationInWindow", params);
		} else {
			super.getLocationInWindow(param_0);
		}
	}

	public void getLocationOnScreen(int[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getLocationOnScreen", params);
		} else {
			super.getLocationOnScreen(param_0);
		}
	}

	public android.graphics.Matrix getMatrix() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.Matrix)com.tns.Platform.callJSMethod(this, "getMatrix", params);
		} else {
			return super.getMatrix();
		}
	}

	public long getMaxDate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Long)com.tns.Platform.callJSMethod(this, "getMaxDate", params);
		} else {
			return super.getMaxDate();
		}
	}

	public boolean getMeasureAllChildren() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getMeasureAllChildren", params);
		} else {
			return super.getMeasureAllChildren();
		}
	}

	public long getMinDate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Long)com.tns.Platform.callJSMethod(this, "getMinDate", params);
		} else {
			return super.getMinDate();
		}
	}

	public int getMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinimumHeight", params);
		} else {
			return super.getMinimumHeight();
		}
	}

	public int getMinimumWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinimumWidth", params);
		} else {
			return super.getMinimumWidth();
		}
	}

	public int getMonth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMonth", params);
		} else {
			return super.getMonth();
		}
	}

	public int getNextFocusDownId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusDownId", params);
		} else {
			return super.getNextFocusDownId();
		}
	}

	public int getNextFocusForwardId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusForwardId", params);
		} else {
			return super.getNextFocusForwardId();
		}
	}

	public int getNextFocusLeftId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusLeftId", params);
		} else {
			return super.getNextFocusLeftId();
		}
	}

	public int getNextFocusRightId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusRightId", params);
		} else {
			return super.getNextFocusRightId();
		}
	}

	public int getNextFocusUpId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusUpId", params);
		} else {
			return super.getNextFocusUpId();
		}
	}

	public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.View.OnFocusChangeListener)com.tns.Platform.callJSMethod(this, "getOnFocusChangeListener", params);
		} else {
			return super.getOnFocusChangeListener();
		}
	}

	public int getOverScrollMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getOverScrollMode", params);
		} else {
			return super.getOverScrollMode();
		}
	}

	public int getPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingBottom", params);
		} else {
			return super.getPaddingBottom();
		}
	}

	public int getPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingEnd", params);
		} else {
			return super.getPaddingEnd();
		}
	}

	public int getPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingLeft", params);
		} else {
			return super.getPaddingLeft();
		}
	}

	public int getPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingRight", params);
		} else {
			return super.getPaddingRight();
		}
	}

	public int getPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingStart", params);
		} else {
			return super.getPaddingStart();
		}
	}

	public int getPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingTop", params);
		} else {
			return super.getPaddingTop();
		}
	}

	public android.view.ViewParent getParentForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewParent)com.tns.Platform.callJSMethod(this, "getParentForAccessibility", params);
		} else {
			return super.getParentForAccessibility();
		}
	}

	public int getPersistentDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPersistentDrawingCache", params);
		} else {
			return super.getPersistentDrawingCache();
		}
	}

	public float getPivotX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getPivotX", params);
		} else {
			return super.getPivotX();
		}
	}

	public float getPivotY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getPivotY", params);
		} else {
			return super.getPivotY();
		}
	}

	public android.content.res.Resources getResources() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.content.res.Resources)com.tns.Platform.callJSMethod(this, "getResources", params);
		} else {
			return super.getResources();
		}
	}

	protected float getRightFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRightFadingEdgeStrength", params);
		} else {
			return super.getRightFadingEdgeStrength();
		}
	}

	protected int getRightPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getRightPaddingOffset", params);
		} else {
			return super.getRightPaddingOffset();
		}
	}

	public android.view.View getRootView() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "getRootView", params);
		} else {
			return super.getRootView();
		}
	}

	public float getRotation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotation", params);
		} else {
			return super.getRotation();
		}
	}

	public float getRotationX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotationX", params);
		} else {
			return super.getRotationX();
		}
	}

	public float getRotationY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotationY", params);
		} else {
			return super.getRotationY();
		}
	}

	public float getScaleX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getScaleX", params);
		} else {
			return super.getScaleX();
		}
	}

	public float getScaleY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getScaleY", params);
		} else {
			return super.getScaleY();
		}
	}

	public int getScrollBarDefaultDelayBeforeFade() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarDefaultDelayBeforeFade", params);
		} else {
			return super.getScrollBarDefaultDelayBeforeFade();
		}
	}

	public int getScrollBarFadeDuration() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarFadeDuration", params);
		} else {
			return super.getScrollBarFadeDuration();
		}
	}

	public int getScrollBarSize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarSize", params);
		} else {
			return super.getScrollBarSize();
		}
	}

	public int getScrollBarStyle() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarStyle", params);
		} else {
			return super.getScrollBarStyle();
		}
	}

	public int getSolidColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSolidColor", params);
		} else {
			return super.getSolidColor();
		}
	}

	public boolean getSpinnersShown() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getSpinnersShown", params);
		} else {
			return super.getSpinnersShown();
		}
	}

	protected int getSuggestedMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSuggestedMinimumHeight", params);
		} else {
			return super.getSuggestedMinimumHeight();
		}
	}

	protected int getSuggestedMinimumWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSuggestedMinimumWidth", params);
		} else {
			return super.getSuggestedMinimumWidth();
		}
	}

	public int getSystemUiVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSystemUiVisibility", params);
		} else {
			return super.getSystemUiVisibility();
		}
	}

	public java.lang.Object getTag(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getTag", params);
		} else {
			return super.getTag(param_0);
		}
	}

	public java.lang.Object getTag() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getTag", params);
		} else {
			return super.getTag();
		}
	}

	public int getTextAlignment() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho22 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTextAlignment", params);
		} else {
			return super.getTextAlignment();
		}
	}

	public int getTextDirection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTextDirection", params);
		} else {
			return super.getTextDirection();
		}
	}

	protected float getTopFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTopFadingEdgeStrength", params);
		} else {
			return super.getTopFadingEdgeStrength();
		}
	}

	protected int getTopPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTopPaddingOffset", params);
		} else {
			return super.getTopPaddingOffset();
		}
	}

	public android.view.TouchDelegate getTouchDelegate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.TouchDelegate)com.tns.Platform.callJSMethod(this, "getTouchDelegate", params);
		} else {
			return super.getTouchDelegate();
		}
	}

	public java.util.ArrayList getTouchables() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (java.util.ArrayList)com.tns.Platform.callJSMethod(this, "getTouchables", params);
		} else {
			return super.getTouchables();
		}
	}

	public float getTranslationX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTranslationX", params);
		} else {
			return super.getTranslationX();
		}
	}

	public float getTranslationY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTranslationY", params);
		} else {
			return super.getTranslationY();
		}
	}

	public int getVerticalFadingEdgeLength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalFadingEdgeLength", params);
		} else {
			return super.getVerticalFadingEdgeLength();
		}
	}

	public int getVerticalScrollbarPosition() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalScrollbarPosition", params);
		} else {
			return super.getVerticalScrollbarPosition();
		}
	}

	public int getVerticalScrollbarWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalScrollbarWidth", params);
		} else {
			return super.getVerticalScrollbarWidth();
		}
	}

	public android.view.ViewTreeObserver getViewTreeObserver() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewTreeObserver)com.tns.Platform.callJSMethod(this, "getViewTreeObserver", params);
		} else {
			return super.getViewTreeObserver();
		}
	}

	public int getVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVisibility", params);
		} else {
			return super.getVisibility();
		}
	}

	protected int getWindowAttachCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowAttachCount", params);
		} else {
			return super.getWindowAttachCount();
		}
	}

	public int getWindowSystemUiVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowSystemUiVisibility", params);
		} else {
			return super.getWindowSystemUiVisibility();
		}
	}

	public android.os.IBinder getWindowToken() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.os.IBinder)com.tns.Platform.callJSMethod(this, "getWindowToken", params);
		} else {
			return super.getWindowToken();
		}
	}

	public int getWindowVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowVisibility", params);
		} else {
			return super.getWindowVisibility();
		}
	}

	public void getWindowVisibleDisplayFrame(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getWindowVisibleDisplayFrame", params);
		} else {
			super.getWindowVisibleDisplayFrame(param_0);
		}
	}

	public float getX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getX", params);
		} else {
			return super.getX();
		}
	}

	public float getY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getY", params);
		} else {
			return super.getY();
		}
	}

	public int getYear() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getYear", params);
		} else {
			return super.getYear();
		}
	}

	public boolean hasFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasFocus", params);
		} else {
			return super.hasFocus();
		}
	}

	public boolean hasFocusable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasFocusable", params);
		} else {
			return super.hasFocusable();
		}
	}

	public boolean hasOnClickListeners() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasOnClickListeners", params);
		} else {
			return super.hasOnClickListeners();
		}
	}

	public boolean hasOverlappingRendering() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasOverlappingRendering", params);
		} else {
			return super.hasOverlappingRendering();
		}
	}

	public boolean hasTransientState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasTransientState", params);
		} else {
			return super.hasTransientState();
		}
	}

	public boolean hasWindowFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasWindowFocus", params);
		} else {
			return super.hasWindowFocus();
		}
	}

	public int hashCode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "hashCode", params);
		} else {
			return super.hashCode();
		}
	}

	public int indexOfChild(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Integer)com.tns.Platform.callJSMethod(this, "indexOfChild", params);
		} else {
			return super.indexOfChild(param_0);
		}
	}

	public void init(int param_0, int param_1, int param_2, android.widget.DatePicker.OnDateChangedListener param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "init", false, params);
		} else {
			super.init(param_0, param_1, param_2, param_3);
		}
	}

	protected void initializeFadingEdge(android.content.res.TypedArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "initializeFadingEdge", params);
		} else {
			super.initializeFadingEdge(param_0);
		}
	}

	protected void initializeScrollbars(android.content.res.TypedArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "initializeScrollbars", params);
		} else {
			super.initializeScrollbars(param_0);
		}
	}

	public void invalidate(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
		} else {
			super.invalidate(param_0, param_1, param_2, param_3);
		}
	}

	public void invalidate(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
		} else {
			super.invalidate(param_0);
		}
	}

	public void invalidate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
		} else {
			super.invalidate();
		}
	}

	public android.view.ViewParent invalidateChildInParent(int[] param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (android.view.ViewParent)com.tns.Platform.callJSMethod(this, "invalidateChildInParent", params);
		} else {
			return super.invalidateChildInParent(param_0, param_1);
		}
	}

	public void invalidateDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "invalidateDrawable", params);
		} else {
			super.invalidateDrawable(param_0);
		}
	}

	public boolean isActivated() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isActivated", params);
		} else {
			return super.isActivated();
		}
	}

	public boolean isAlwaysDrawnWithCacheEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isAlwaysDrawnWithCacheEnabled", params);
		} else {
			return super.isAlwaysDrawnWithCacheEnabled();
		}
	}

	public boolean isAnimationCacheEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isAnimationCacheEnabled", params);
		} else {
			return super.isAnimationCacheEnabled();
		}
	}

	protected boolean isChildrenDrawingOrderEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isChildrenDrawingOrderEnabled", params);
		} else {
			return super.isChildrenDrawingOrderEnabled();
		}
	}

	protected boolean isChildrenDrawnWithCacheEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isChildrenDrawnWithCacheEnabled", params);
		} else {
			return super.isChildrenDrawnWithCacheEnabled();
		}
	}

	public boolean isClickable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isClickable", params);
		} else {
			return super.isClickable();
		}
	}

	public boolean isDirty() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDirty", params);
		} else {
			return super.isDirty();
		}
	}

	public boolean isDrawingCacheEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDrawingCacheEnabled", params);
		} else {
			return super.isDrawingCacheEnabled();
		}
	}

	public boolean isDuplicateParentStateEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDuplicateParentStateEnabled", params);
		} else {
			return super.isDuplicateParentStateEnabled();
		}
	}

	public boolean isEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isEnabled", params);
		} else {
			return super.isEnabled();
		}
	}

	public boolean isFocused() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isFocused", params);
		} else {
			return super.isFocused();
		}
	}

	public boolean isHapticFeedbackEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHapticFeedbackEnabled", params);
		} else {
			return super.isHapticFeedbackEnabled();
		}
	}

	public boolean isHardwareAccelerated() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHardwareAccelerated", params);
		} else {
			return super.isHardwareAccelerated();
		}
	}

	public boolean isHorizontalFadingEdgeEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHorizontalFadingEdgeEnabled", params);
		} else {
			return super.isHorizontalFadingEdgeEnabled();
		}
	}

	public boolean isHorizontalScrollBarEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHorizontalScrollBarEnabled", params);
		} else {
			return super.isHorizontalScrollBarEnabled();
		}
	}

	public boolean isHovered() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHovered", params);
		} else {
			return super.isHovered();
		}
	}

	public boolean isInEditMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInEditMode", params);
		} else {
			return super.isInEditMode();
		}
	}

	public boolean isInTouchMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInTouchMode", params);
		} else {
			return super.isInTouchMode();
		}
	}

	public boolean isLayoutRequested() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isLayoutRequested", params);
		} else {
			return super.isLayoutRequested();
		}
	}

	public boolean isLongClickable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isLongClickable", params);
		} else {
			return super.isLongClickable();
		}
	}

	public boolean isMotionEventSplittingEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isMotionEventSplittingEnabled", params);
		} else {
			return super.isMotionEventSplittingEnabled();
		}
	}

	public boolean isOpaque() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isOpaque", params);
		} else {
			return super.isOpaque();
		}
	}

	protected boolean isPaddingOffsetRequired() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPaddingOffsetRequired", params);
		} else {
			return super.isPaddingOffsetRequired();
		}
	}

	public boolean isPaddingRelative() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPaddingRelative", params);
		} else {
			return super.isPaddingRelative();
		}
	}

	public boolean isPressed() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPressed", params);
		} else {
			return super.isPressed();
		}
	}

	public boolean isSaveEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSaveEnabled", params);
		} else {
			return super.isSaveEnabled();
		}
	}

	public boolean isSaveFromParentEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSaveFromParentEnabled", params);
		} else {
			return super.isSaveFromParentEnabled();
		}
	}

	public boolean isScrollContainer() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isScrollContainer", params);
		} else {
			return super.isScrollContainer();
		}
	}

	public boolean isScrollbarFadingEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isScrollbarFadingEnabled", params);
		} else {
			return super.isScrollbarFadingEnabled();
		}
	}

	public boolean isSelected() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSelected", params);
		} else {
			return super.isSelected();
		}
	}

	public boolean isShown() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isShown", params);
		} else {
			return super.isShown();
		}
	}

	public boolean isSoundEffectsEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSoundEffectsEnabled", params);
		} else {
			return super.isSoundEffectsEnabled();
		}
	}

	public boolean isVerticalFadingEdgeEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isVerticalFadingEdgeEnabled", params);
		} else {
			return super.isVerticalFadingEdgeEnabled();
		}
	}

	public boolean isVerticalScrollBarEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isVerticalScrollBarEnabled", params);
		} else {
			return super.isVerticalScrollBarEnabled();
		}
	}

	public void jumpDrawablesToCurrentState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "jumpDrawablesToCurrentState", params);
		} else {
			super.jumpDrawablesToCurrentState();
		}
	}

	protected void measureChild(android.view.View param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "measureChild", params);
		} else {
			super.measureChild(param_0, param_1, param_2);
		}
	}

	protected void measureChildWithMargins(android.view.View param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "measureChildWithMargins", params);
		} else {
			super.measureChildWithMargins(param_0, param_1, param_2, param_3, param_4);
		}
	}

	protected void measureChildren(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho31 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "measureChildren", params);
		} else {
			super.measureChildren(param_0, param_1);
		}
	}

	public void offsetLeftAndRight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "offsetLeftAndRight", params);
		} else {
			super.offsetLeftAndRight(param_0);
		}
	}

	public void offsetTopAndBottom(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "offsetTopAndBottom", params);
		} else {
			super.offsetTopAndBottom(param_0);
		}
	}

	protected void onAnimationEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAnimationEnd", params);
		} else {
			super.onAnimationEnd();
		}
	}

	protected void onAnimationStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAnimationStart", params);
		} else {
			super.onAnimationStart();
		}
	}

	protected void onAttachedToWindow() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAttachedToWindow", params);
		} else {
			super.onAttachedToWindow();
		}
	}

	public boolean onCheckIsTextEditor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onCheckIsTextEditor", params);
		} else {
			return super.onCheckIsTextEditor();
		}
	}

	protected void onConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onConfigurationChanged", params);
		} else {
			super.onConfigurationChanged(param_0);
		}
	}

	protected void onCreateContextMenu(android.view.ContextMenu param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCreateContextMenu", params);
		} else {
			super.onCreateContextMenu(param_0);
		}
	}

	protected int[] onCreateDrawableState(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (int[])com.tns.Platform.callJSMethod(this, "onCreateDrawableState", params);
		} else {
			return super.onCreateDrawableState(param_0);
		}
	}

	public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.inputmethod.InputConnection)com.tns.Platform.callJSMethod(this, "onCreateInputConnection", params);
		} else {
			return super.onCreateInputConnection(param_0);
		}
	}

	protected void onDetachedFromWindow() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onDetachedFromWindow", params);
		} else {
			super.onDetachedFromWindow();
		}
	}

	protected void onDisplayHint(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onDisplayHint", params);
		} else {
			super.onDisplayHint(param_0);
		}
	}

	public boolean onDragEvent(android.view.DragEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onDragEvent", params);
		} else {
			return super.onDragEvent(param_0);
		}
	}

	protected void onDraw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onDraw", params);
		} else {
			super.onDraw(param_0);
		}
	}

	public boolean onFilterTouchEventForSecurity(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onFilterTouchEventForSecurity", params);
		} else {
			return super.onFilterTouchEventForSecurity(param_0);
		}
	}

	protected void onFinishInflate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho33 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onFinishInflate", params);
		} else {
			super.onFinishInflate();
		}
	}

	public void onFinishTemporaryDetach() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onFinishTemporaryDetach", params);
		} else {
			super.onFinishTemporaryDetach();
		}
	}

	protected void onFocusChanged(boolean param_0, int param_1, android.graphics.Rect param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "onFocusChanged", params);
		} else {
			super.onFocusChanged(param_0, param_1, param_2);
		}
	}

	public boolean onGenericMotionEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onGenericMotionEvent", params);
		} else {
			return super.onGenericMotionEvent(param_0);
		}
	}

	public void onHoverChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onHoverChanged", params);
		} else {
			super.onHoverChanged(param_0);
		}
	}

	public boolean onHoverEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onHoverEvent", params);
		} else {
			return super.onHoverEvent(param_0);
		}
	}

	public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onInitializeAccessibilityEvent", params);
		} else {
			super.onInitializeAccessibilityEvent(param_0);
		}
	}

	public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onInitializeAccessibilityNodeInfo", params);
		} else {
			super.onInitializeAccessibilityNodeInfo(param_0);
		}
	}

	public boolean onInterceptHoverEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onInterceptHoverEvent", params);
		} else {
			return super.onInterceptHoverEvent(param_0);
		}
	}

	public boolean onInterceptTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onInterceptTouchEvent", params);
		} else {
			return super.onInterceptTouchEvent(param_0);
		}
	}

	public boolean onKeyDown(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyDown", params);
		} else {
			return super.onKeyDown(param_0, param_1);
		}
	}

	public boolean onKeyLongPress(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyLongPress", params);
		} else {
			return super.onKeyLongPress(param_0, param_1);
		}
	}

	public boolean onKeyMultiple(int param_0, int param_1, android.view.KeyEvent param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyMultiple", params);
		} else {
			return super.onKeyMultiple(param_0, param_1, param_2);
		}
	}

	public boolean onKeyPreIme(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyPreIme", params);
		} else {
			return super.onKeyPreIme(param_0, param_1);
		}
	}

	public boolean onKeyShortcut(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyShortcut", params);
		} else {
			return super.onKeyShortcut(param_0, param_1);
		}
	}

	public boolean onKeyUp(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyUp", params);
		} else {
			return super.onKeyUp(param_0, param_1);
		}
	}

	protected void onLayout(boolean param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "onLayout", params);
		} else {
			super.onLayout(param_0, param_1, param_2, param_3, param_4);
		}
	}

	protected void onMeasure(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onMeasure", params);
		} else {
			super.onMeasure(param_0, param_1);
		}
	}

	protected void onOverScrolled(int param_0, int param_1, boolean param_2, boolean param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onOverScrolled", params);
		} else {
			super.onOverScrolled(param_0, param_1, param_2, param_3);
		}
	}

	public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onPopulateAccessibilityEvent", params);
		} else {
			super.onPopulateAccessibilityEvent(param_0);
		}
	}

	protected boolean onRequestFocusInDescendants(int param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onRequestFocusInDescendants", params);
		} else {
			return super.onRequestFocusInDescendants(param_0, param_1);
		}
	}

	public boolean onRequestSendAccessibilityEvent(android.view.View param_0, android.view.accessibility.AccessibilityEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onRequestSendAccessibilityEvent", params);
		} else {
			return super.onRequestSendAccessibilityEvent(param_0, param_1);
		}
	}

	protected void onRestoreInstanceState(android.os.Parcelable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onRestoreInstanceState", params);
		} else {
			super.onRestoreInstanceState(param_0);
		}
	}

	public void onRtlPropertiesChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onRtlPropertiesChanged", params);
		} else {
			super.onRtlPropertiesChanged(param_0);
		}
	}

	protected android.os.Parcelable onSaveInstanceState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (android.os.Parcelable)com.tns.Platform.callJSMethod(this, "onSaveInstanceState", params);
		} else {
			return super.onSaveInstanceState();
		}
	}

	public void onScreenStateChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onScreenStateChanged", params);
		} else {
			super.onScreenStateChanged(param_0);
		}
	}

	protected void onScrollChanged(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onScrollChanged", params);
		} else {
			super.onScrollChanged(param_0, param_1, param_2, param_3);
		}
	}

	protected boolean onSetAlpha(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onSetAlpha", params);
		} else {
			return super.onSetAlpha(param_0);
		}
	}

	protected void onSizeChanged(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onSizeChanged", params);
		} else {
			super.onSizeChanged(param_0, param_1, param_2, param_3);
		}
	}

	public void onStartTemporaryDetach() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onStartTemporaryDetach", params);
		} else {
			super.onStartTemporaryDetach();
		}
	}

	public boolean onTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTouchEvent", params);
		} else {
			return super.onTouchEvent(param_0);
		}
	}

	public boolean onTrackballEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTrackballEvent", params);
		} else {
			return super.onTrackballEvent(param_0);
		}
	}

	protected void onVisibilityChanged(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onVisibilityChanged", params);
		} else {
			super.onVisibilityChanged(param_0, param_1);
		}
	}

	public void onWindowFocusChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowFocusChanged", params);
		} else {
			super.onWindowFocusChanged(param_0);
		}
	}

	public void onWindowSystemUiVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowSystemUiVisibilityChanged", params);
		} else {
			super.onWindowSystemUiVisibilityChanged(param_0);
		}
	}

	protected void onWindowVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowVisibilityChanged", params);
		} else {
			super.onWindowVisibilityChanged(param_0);
		}
	}

	protected boolean overScrollBy(int param_0, int param_1, int param_2, int param_3, int param_4, int param_5, int param_6, int param_7, boolean param_8) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[9];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			params[5] = param_5;
			params[6] = param_6;
			params[7] = param_7;
			params[8] = param_8;
			return (Boolean)com.tns.Platform.callJSMethod(this, "overScrollBy", params);
		} else {
			return super.overScrollBy(param_0, param_1, param_2, param_3, param_4, param_5, param_6, param_7, param_8);
		}
	}

	public boolean performAccessibilityAction(int param_0, android.os.Bundle param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performAccessibilityAction", params);
		} else {
			return super.performAccessibilityAction(param_0, param_1);
		}
	}

	public boolean performClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performClick", params);
		} else {
			return super.performClick();
		}
	}

	public boolean performHapticFeedback(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performHapticFeedback", params);
		} else {
			return super.performHapticFeedback(param_0);
		}
	}

	public boolean performHapticFeedback(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performHapticFeedback", params);
		} else {
			return super.performHapticFeedback(param_0, param_1);
		}
	}

	public boolean performLongClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performLongClick", params);
		} else {
			return super.performLongClick();
		}
	}

	public void playSoundEffect(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "playSoundEffect", params);
		} else {
			super.playSoundEffect(param_0);
		}
	}

	public boolean post(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "post", params);
		} else {
			return super.post(param_0);
		}
	}

	public boolean postDelayed(java.lang.Runnable param_0, long param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "postDelayed", params);
		} else {
			return super.postDelayed(param_0, param_1);
		}
	}

	public void postInvalidate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "postInvalidate", params);
		} else {
			super.postInvalidate();
		}
	}

	public void postInvalidate(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "postInvalidate", params);
		} else {
			super.postInvalidate(param_0, param_1, param_2, param_3);
		}
	}

	public void postInvalidateDelayed(long param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "postInvalidateDelayed", params);
		} else {
			super.postInvalidateDelayed(param_0);
		}
	}

	public void postInvalidateDelayed(long param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "postInvalidateDelayed", params);
		} else {
			super.postInvalidateDelayed(param_0, param_1, param_2, param_3, param_4);
		}
	}

	public void postInvalidateOnAnimation(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "postInvalidateOnAnimation", params);
		} else {
			super.postInvalidateOnAnimation(param_0, param_1, param_2, param_3);
		}
	}

	public void postInvalidateOnAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "postInvalidateOnAnimation", params);
		} else {
			super.postInvalidateOnAnimation();
		}
	}

	public void postOnAnimation(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "postOnAnimation", params);
		} else {
			super.postOnAnimation(param_0);
		}
	}

	public void postOnAnimationDelayed(java.lang.Runnable param_0, long param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "postOnAnimationDelayed", params);
		} else {
			super.postOnAnimationDelayed(param_0, param_1);
		}
	}

	public void recomputeViewAttributes(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "recomputeViewAttributes", params);
		} else {
			super.recomputeViewAttributes(param_0);
		}
	}

	public void refreshDrawableState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "refreshDrawableState", params);
		} else {
			super.refreshDrawableState();
		}
	}

	public void removeAllViews() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "removeAllViews", params);
		} else {
			super.removeAllViews();
		}
	}

	public void removeAllViewsInLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "removeAllViewsInLayout", params);
		} else {
			super.removeAllViewsInLayout();
		}
	}

	public boolean removeCallbacks(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "removeCallbacks", params);
		} else {
			return super.removeCallbacks(param_0);
		}
	}

	protected void removeDetachedView(android.view.View param_0, boolean param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "removeDetachedView", params);
		} else {
			super.removeDetachedView(param_0, param_1);
		}
	}

	public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeOnAttachStateChangeListener", params);
		} else {
			super.removeOnAttachStateChangeListener(param_0);
		}
	}

	public void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeOnLayoutChangeListener", params);
		} else {
			super.removeOnLayoutChangeListener(param_0);
		}
	}

	public void removeView(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeView", params);
		} else {
			super.removeView(param_0);
		}
	}

	public void removeViewAt(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeViewAt", params);
		} else {
			super.removeViewAt(param_0);
		}
	}

	public void removeViewInLayout(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeViewInLayout", params);
		} else {
			super.removeViewInLayout(param_0);
		}
	}

	public void removeViews(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "removeViews", params);
		} else {
			super.removeViews(param_0, param_1);
		}
	}

	public void removeViewsInLayout(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "removeViewsInLayout", params);
		} else {
			super.removeViewsInLayout(param_0, param_1);
		}
	}

	public void requestChildFocus(android.view.View param_0, android.view.View param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "requestChildFocus", params);
		} else {
			super.requestChildFocus(param_0, param_1);
		}
	}

	public boolean requestChildRectangleOnScreen(android.view.View param_0, android.graphics.Rect param_1, boolean param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestChildRectangleOnScreen", params);
		} else {
			return super.requestChildRectangleOnScreen(param_0, param_1, param_2);
		}
	}

	public void requestDisallowInterceptTouchEvent(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "requestDisallowInterceptTouchEvent", params);
		} else {
			super.requestDisallowInterceptTouchEvent(param_0);
		}
	}

	public void requestFitSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "requestFitSystemWindows", params);
		} else {
			super.requestFitSystemWindows();
		}
	}

	public boolean requestFocus(int param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestFocus", params);
		} else {
			return super.requestFocus(param_0, param_1);
		}
	}

	public void requestLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "requestLayout", params);
		} else {
			super.requestLayout();
		}
	}

	public boolean requestRectangleOnScreen(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestRectangleOnScreen", params);
		} else {
			return super.requestRectangleOnScreen(param_0);
		}
	}

	public boolean requestRectangleOnScreen(android.graphics.Rect param_0, boolean param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestRectangleOnScreen", params);
		} else {
			return super.requestRectangleOnScreen(param_0, param_1);
		}
	}

	public boolean requestSendAccessibilityEvent(android.view.View param_0, android.view.accessibility.AccessibilityEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestSendAccessibilityEvent", params);
		} else {
			return super.requestSendAccessibilityEvent(param_0, param_1);
		}
	}

	public void requestTransparentRegion(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "requestTransparentRegion", params);
		} else {
			super.requestTransparentRegion(param_0);
		}
	}

	public void restoreHierarchyState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "restoreHierarchyState", params);
		} else {
			super.restoreHierarchyState(param_0);
		}
	}

	public void saveHierarchyState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho42 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "saveHierarchyState", params);
		} else {
			super.saveHierarchyState(param_0);
		}
	}

	public void scheduleDrawable(android.graphics.drawable.Drawable param_0, java.lang.Runnable param_1, long param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "scheduleDrawable", params);
		} else {
			super.scheduleDrawable(param_0, param_1, param_2);
		}
	}

	public void scheduleLayoutAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "scheduleLayoutAnimation", params);
		} else {
			super.scheduleLayoutAnimation();
		}
	}

	public void scrollBy(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "scrollBy", params);
		} else {
			super.scrollBy(param_0, param_1);
		}
	}

	public void scrollTo(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "scrollTo", params);
		} else {
			super.scrollTo(param_0, param_1);
		}
	}

	public void sendAccessibilityEvent(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "sendAccessibilityEvent", params);
		} else {
			super.sendAccessibilityEvent(param_0);
		}
	}

	public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "sendAccessibilityEventUnchecked", params);
		} else {
			super.sendAccessibilityEventUnchecked(param_0);
		}
	}

	public void setAccessibilityDelegate(android.view.View.AccessibilityDelegate param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAccessibilityDelegate", params);
		} else {
			super.setAccessibilityDelegate(param_0);
		}
	}

	public void setActivated(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setActivated", params);
		} else {
			super.setActivated(param_0);
		}
	}

	public void setAddStatesFromChildren(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAddStatesFromChildren", params);
		} else {
			super.setAddStatesFromChildren(param_0);
		}
	}

	public void setAlpha(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAlpha", params);
		} else {
			super.setAlpha(param_0);
		}
	}

	public void setAlwaysDrawnWithCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAlwaysDrawnWithCacheEnabled", params);
		} else {
			super.setAlwaysDrawnWithCacheEnabled(param_0);
		}
	}

	public void setAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAnimation", params);
		} else {
			super.setAnimation(param_0);
		}
	}

	public void setAnimationCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAnimationCacheEnabled", params);
		} else {
			super.setAnimationCacheEnabled(param_0);
		}
	}

	public void setBackground(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackground", params);
		} else {
			super.setBackground(param_0);
		}
	}

	public void setBackgroundColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundColor", params);
		} else {
			super.setBackgroundColor(param_0);
		}
	}

	public void setBackgroundDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundDrawable", params);
		} else {
			super.setBackgroundDrawable(param_0);
		}
	}

	public void setBackgroundResource(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundResource", params);
		} else {
			super.setBackgroundResource(param_0);
		}
	}

	public void setCalendarViewShown(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCalendarViewShown", params);
		} else {
			super.setCalendarViewShown(param_0);
		}
	}

	public void setCameraDistance(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCameraDistance", params);
		} else {
			super.setCameraDistance(param_0);
		}
	}

	protected void setChildrenDrawingCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setChildrenDrawingCacheEnabled", params);
		} else {
			super.setChildrenDrawingCacheEnabled(param_0);
		}
	}

	protected void setChildrenDrawingOrderEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setChildrenDrawingOrderEnabled", params);
		} else {
			super.setChildrenDrawingOrderEnabled(param_0);
		}
	}

	protected void setChildrenDrawnWithCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setChildrenDrawnWithCacheEnabled", params);
		} else {
			super.setChildrenDrawnWithCacheEnabled(param_0);
		}
	}

	public void setClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setClickable", params);
		} else {
			super.setClickable(param_0);
		}
	}

	public void setClipChildren(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setClipChildren", params);
		} else {
			super.setClipChildren(param_0);
		}
	}

	public void setClipToPadding(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setClipToPadding", params);
		} else {
			super.setClipToPadding(param_0);
		}
	}

	public void setContentDescription(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setContentDescription", params);
		} else {
			super.setContentDescription(param_0);
		}
	}

	public void setDescendantFocusability(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDescendantFocusability", params);
		} else {
			super.setDescendantFocusability(param_0);
		}
	}

	public void setDrawingCacheBackgroundColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheBackgroundColor", params);
		} else {
			super.setDrawingCacheBackgroundColor(param_0);
		}
	}

	public void setDrawingCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheEnabled", params);
		} else {
			super.setDrawingCacheEnabled(param_0);
		}
	}

	public void setDrawingCacheQuality(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheQuality", params);
		} else {
			super.setDrawingCacheQuality(param_0);
		}
	}

	public void setDuplicateParentStateEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDuplicateParentStateEnabled", params);
		} else {
			super.setDuplicateParentStateEnabled(param_0);
		}
	}

	public void setEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEnabled", params);
		} else {
			super.setEnabled(param_0);
		}
	}

	public void setFadingEdgeLength(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFadingEdgeLength", params);
		} else {
			super.setFadingEdgeLength(param_0);
		}
	}

	public void setFilterTouchesWhenObscured(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFilterTouchesWhenObscured", params);
		} else {
			super.setFilterTouchesWhenObscured(param_0);
		}
	}

	public void setFitsSystemWindows(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFitsSystemWindows", params);
		} else {
			super.setFitsSystemWindows(param_0);
		}
	}

	public void setFocusable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFocusable", params);
		} else {
			super.setFocusable(param_0);
		}
	}

	public void setFocusableInTouchMode(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFocusableInTouchMode", params);
		} else {
			super.setFocusableInTouchMode(param_0);
		}
	}

	public void setForeground(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setForeground", params);
		} else {
			super.setForeground(param_0);
		}
	}

	public void setForegroundGravity(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setForegroundGravity", params);
		} else {
			super.setForegroundGravity(param_0);
		}
	}

	public void setHapticFeedbackEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHapticFeedbackEnabled", params);
		} else {
			super.setHapticFeedbackEnabled(param_0);
		}
	}

	public void setHasTransientState(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHasTransientState", params);
		} else {
			super.setHasTransientState(param_0);
		}
	}

	public void setHorizontalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontalFadingEdgeEnabled", params);
		} else {
			super.setHorizontalFadingEdgeEnabled(param_0);
		}
	}

	public void setHorizontalScrollBarEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontalScrollBarEnabled", params);
		} else {
			super.setHorizontalScrollBarEnabled(param_0);
		}
	}

	public void setHovered(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHovered", params);
		} else {
			super.setHovered(param_0);
		}
	}

	public void setId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setId", params);
		} else {
			super.setId(param_0);
		}
	}

	public void setImportantForAccessibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setImportantForAccessibility", params);
		} else {
			super.setImportantForAccessibility(param_0);
		}
	}

	public void setKeepScreenOn(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setKeepScreenOn", params);
		} else {
			super.setKeepScreenOn(param_0);
		}
	}

	public void setLabelFor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLabelFor", params);
		} else {
			super.setLabelFor(param_0);
		}
	}

	public void setLayerPaint(android.graphics.Paint param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayerPaint", params);
		} else {
			super.setLayerPaint(param_0);
		}
	}

	public void setLayerType(int param_0, android.graphics.Paint param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setLayerType", params);
		} else {
			super.setLayerType(param_0, param_1);
		}
	}

	public void setLayoutAnimation(android.view.animation.LayoutAnimationController param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutAnimation", params);
		} else {
			super.setLayoutAnimation(param_0);
		}
	}

	public void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutAnimationListener", params);
		} else {
			super.setLayoutAnimationListener(param_0);
		}
	}

	public void setLayoutDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutDirection", params);
		} else {
			super.setLayoutDirection(param_0);
		}
	}

	public void setLayoutParams(android.view.ViewGroup.LayoutParams param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutParams", params);
		} else {
			super.setLayoutParams(param_0);
		}
	}

	public void setLayoutTransition(android.animation.LayoutTransition param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutTransition", params);
		} else {
			super.setLayoutTransition(param_0);
		}
	}

	public void setLongClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLongClickable", params);
		} else {
			super.setLongClickable(param_0);
		}
	}

	public void setMaxDate(long param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxDate", params);
		} else {
			super.setMaxDate(param_0);
		}
	}

	public void setMeasureAllChildren(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMeasureAllChildren", params);
		} else {
			super.setMeasureAllChildren(param_0);
		}
	}

	public void setMinDate(long param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinDate", params);
		} else {
			super.setMinDate(param_0);
		}
	}

	public void setMinimumHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinimumHeight", params);
		} else {
			super.setMinimumHeight(param_0);
		}
	}

	public void setMinimumWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinimumWidth", params);
		} else {
			super.setMinimumWidth(param_0);
		}
	}

	public void setMotionEventSplittingEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMotionEventSplittingEnabled", params);
		} else {
			super.setMotionEventSplittingEnabled(param_0);
		}
	}

	public void setNextFocusDownId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusDownId", params);
		} else {
			super.setNextFocusDownId(param_0);
		}
	}

	public void setNextFocusForwardId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusForwardId", params);
		} else {
			super.setNextFocusForwardId(param_0);
		}
	}

	public void setNextFocusLeftId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusLeftId", params);
		} else {
			super.setNextFocusLeftId(param_0);
		}
	}

	public void setNextFocusRightId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusRightId", params);
		} else {
			super.setNextFocusRightId(param_0);
		}
	}

	public void setNextFocusUpId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusUpId", params);
		} else {
			super.setNextFocusUpId(param_0);
		}
	}

	public void setOnClickListener(android.view.View.OnClickListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnClickListener", params);
		} else {
			super.setOnClickListener(param_0);
		}
	}

	public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnCreateContextMenuListener", params);
		} else {
			super.setOnCreateContextMenuListener(param_0);
		}
	}

	public void setOnDragListener(android.view.View.OnDragListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnDragListener", params);
		} else {
			super.setOnDragListener(param_0);
		}
	}

	public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnFocusChangeListener", params);
		} else {
			super.setOnFocusChangeListener(param_0);
		}
	}

	public void setOnGenericMotionListener(android.view.View.OnGenericMotionListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnGenericMotionListener", params);
		} else {
			super.setOnGenericMotionListener(param_0);
		}
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnHierarchyChangeListener", params);
		} else {
			super.setOnHierarchyChangeListener(param_0);
		}
	}

	public void setOnHoverListener(android.view.View.OnHoverListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnHoverListener", params);
		} else {
			super.setOnHoverListener(param_0);
		}
	}

	public void setOnKeyListener(android.view.View.OnKeyListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnKeyListener", params);
		} else {
			super.setOnKeyListener(param_0);
		}
	}

	public void setOnLongClickListener(android.view.View.OnLongClickListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnLongClickListener", params);
		} else {
			super.setOnLongClickListener(param_0);
		}
	}

	public void setOnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnSystemUiVisibilityChangeListener", params);
		} else {
			super.setOnSystemUiVisibilityChangeListener(param_0);
		}
	}

	public void setOnTouchListener(android.view.View.OnTouchListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnTouchListener", params);
		} else {
			super.setOnTouchListener(param_0);
		}
	}

	public void setOverScrollMode(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOverScrollMode", params);
		} else {
			super.setOverScrollMode(param_0);
		}
	}

	public void setPadding(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setPadding", params);
		} else {
			super.setPadding(param_0, param_1, param_2, param_3);
		}
	}

	public void setPaddingRelative(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setPaddingRelative", params);
		} else {
			super.setPaddingRelative(param_0, param_1, param_2, param_3);
		}
	}

	public void setPersistentDrawingCache(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPersistentDrawingCache", params);
		} else {
			super.setPersistentDrawingCache(param_0);
		}
	}

	public void setPivotX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPivotX", params);
		} else {
			super.setPivotX(param_0);
		}
	}

	public void setPivotY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPivotY", params);
		} else {
			super.setPivotY(param_0);
		}
	}

	public void setPressed(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPressed", params);
		} else {
			super.setPressed(param_0);
		}
	}

	public void setRotation(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotation", params);
		} else {
			super.setRotation(param_0);
		}
	}

	public void setRotationX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotationX", params);
		} else {
			super.setRotationX(param_0);
		}
	}

	public void setRotationY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotationY", params);
		} else {
			super.setRotationY(param_0);
		}
	}

	public void setSaveEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSaveEnabled", params);
		} else {
			super.setSaveEnabled(param_0);
		}
	}

	public void setSaveFromParentEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSaveFromParentEnabled", params);
		} else {
			super.setSaveFromParentEnabled(param_0);
		}
	}

	public void setScaleX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScaleX", params);
		} else {
			super.setScaleX(param_0);
		}
	}

	public void setScaleY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScaleY", params);
		} else {
			super.setScaleY(param_0);
		}
	}

	public void setScrollBarDefaultDelayBeforeFade(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarDefaultDelayBeforeFade", params);
		} else {
			super.setScrollBarDefaultDelayBeforeFade(param_0);
		}
	}

	public void setScrollBarFadeDuration(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarFadeDuration", params);
		} else {
			super.setScrollBarFadeDuration(param_0);
		}
	}

	public void setScrollBarSize(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarSize", params);
		} else {
			super.setScrollBarSize(param_0);
		}
	}

	public void setScrollBarStyle(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarStyle", params);
		} else {
			super.setScrollBarStyle(param_0);
		}
	}

	public void setScrollContainer(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollContainer", params);
		} else {
			super.setScrollContainer(param_0);
		}
	}

	public void setScrollX(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollX", params);
		} else {
			super.setScrollX(param_0);
		}
	}

	public void setScrollY(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollY", params);
		} else {
			super.setScrollY(param_0);
		}
	}

	public void setScrollbarFadingEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollbarFadingEnabled", params);
		} else {
			super.setScrollbarFadingEnabled(param_0);
		}
	}

	public void setSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSelected", params);
		} else {
			super.setSelected(param_0);
		}
	}

	public void setSoundEffectsEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSoundEffectsEnabled", params);
		} else {
			super.setSoundEffectsEnabled(param_0);
		}
	}

	public void setSpinnersShown(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSpinnersShown", params);
		} else {
			super.setSpinnersShown(param_0);
		}
	}

	protected void setStaticTransformationsEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setStaticTransformationsEnabled", params);
		} else {
			super.setStaticTransformationsEnabled(param_0);
		}
	}

	public void setSystemUiVisibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSystemUiVisibility", params);
		} else {
			super.setSystemUiVisibility(param_0);
		}
	}

	public void setTag(int param_0, java.lang.Object param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTag", params);
		} else {
			super.setTag(param_0, param_1);
		}
	}

	public void setTag(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTag", params);
		} else {
			super.setTag(param_0);
		}
	}

	public void setTextAlignment(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextAlignment", params);
		} else {
			super.setTextAlignment(param_0);
		}
	}

	public void setTextDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextDirection", params);
		} else {
			super.setTextDirection(param_0);
		}
	}

	public void setTouchDelegate(android.view.TouchDelegate param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTouchDelegate", params);
		} else {
			super.setTouchDelegate(param_0);
		}
	}

	public void setTranslationX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTranslationX", params);
		} else {
			super.setTranslationX(param_0);
		}
	}

	public void setTranslationY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTranslationY", params);
		} else {
			super.setTranslationY(param_0);
		}
	}

	public void setVerticalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalFadingEdgeEnabled", params);
		} else {
			super.setVerticalFadingEdgeEnabled(param_0);
		}
	}

	public void setVerticalScrollBarEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalScrollBarEnabled", params);
		} else {
			super.setVerticalScrollBarEnabled(param_0);
		}
	}

	public void setVerticalScrollbarPosition(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalScrollbarPosition", params);
		} else {
			super.setVerticalScrollbarPosition(param_0);
		}
	}

	public void setVisibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVisibility", params);
		} else {
			super.setVisibility(param_0);
		}
	}

	public void setWillNotCacheDrawing(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWillNotCacheDrawing", params);
		} else {
			super.setWillNotCacheDrawing(param_0);
		}
	}

	public void setWillNotDraw(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWillNotDraw", params);
		} else {
			super.setWillNotDraw(param_0);
		}
	}

	public void setX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setX", params);
		} else {
			super.setX(param_0);
		}
	}

	public void setY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setY", params);
		} else {
			super.setY(param_0);
		}
	}

	public boolean shouldDelayChildPressedState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "shouldDelayChildPressedState", params);
		} else {
			return super.shouldDelayChildPressedState();
		}
	}

	public boolean showContextMenu() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "showContextMenu", params);
		} else {
			return super.showContextMenu();
		}
	}

	public boolean showContextMenuForChild(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "showContextMenuForChild", params);
		} else {
			return super.showContextMenuForChild(param_0);
		}
	}

	public android.view.ActionMode startActionMode(android.view.ActionMode.Callback param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.ActionMode)com.tns.Platform.callJSMethod(this, "startActionMode", params);
		} else {
			return super.startActionMode(param_0);
		}
	}

	public android.view.ActionMode startActionModeForChild(android.view.View param_0, android.view.ActionMode.Callback param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (android.view.ActionMode)com.tns.Platform.callJSMethod(this, "startActionModeForChild", params);
		} else {
			return super.startActionModeForChild(param_0, param_1);
		}
	}

	public void startAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "startAnimation", params);
		} else {
			super.startAnimation(param_0);
		}
	}

	public void startLayoutAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "startLayoutAnimation", params);
		} else {
			super.startLayoutAnimation();
		}
	}

	public void startViewTransition(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "startViewTransition", params);
		} else {
			super.startViewTransition(param_0);
		}
	}

	public java.lang.String toString() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "toString", params);
		} else {
			return super.toString();
		}
	}

	public void unscheduleDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "unscheduleDrawable", params);
		} else {
			super.unscheduleDrawable(param_0);
		}
	}

	public void unscheduleDrawable(android.graphics.drawable.Drawable param_0, java.lang.Runnable param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "unscheduleDrawable", params);
		} else {
			super.unscheduleDrawable(param_0, param_1);
		}
	}

	public void updateDate(int param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "updateDate", params);
		} else {
			super.updateDate(param_0, param_1, param_2);
		}
	}

	public void updateViewLayout(android.view.View param_0, android.view.ViewGroup.LayoutParams param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "updateViewLayout", params);
		} else {
			super.updateViewLayout(param_0, param_1);
		}
	}

	protected boolean verifyDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "verifyDrawable", params);
		} else {
			return super.verifyDrawable(param_0);
		}
	}

	public boolean willNotCacheDrawing() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "willNotCacheDrawing", params);
		} else {
			return super.willNotCacheDrawing();
		}
	}

	public boolean willNotDraw() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "willNotDraw", params);
		} else {
			return super.willNotDraw();
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
			if (name.equals("addChildrenForAccessibility")) {
				__ho0 |= (1 << 0);
			} else if (name.equals("addFocusables")) {
				__ho0 |= (1 << 1);
			} else if (name.equals("addOnAttachStateChangeListener")) {
				__ho0 |= (1 << 2);
			} else if (name.equals("addOnLayoutChangeListener")) {
				__ho0 |= (1 << 3);
			} else if (name.equals("addStatesFromChildren")) {
				__ho0 |= (1 << 4);
			} else if (name.equals("addTouchables")) {
				__ho0 |= (1 << 5);
			} else if (name.equals("addView")) {
				__ho0 |= (1 << 6);
			} else if (name.equals("addViewInLayout")) {
				__ho0 |= (1 << 7);
			} else if (name.equals("animate")) {
				__ho1 |= (1 << 0);
			} else if (name.equals("announceForAccessibility")) {
				__ho1 |= (1 << 1);
			} else if (name.equals("attachLayoutAnimationParameters")) {
				__ho1 |= (1 << 2);
			} else if (name.equals("attachViewToParent")) {
				__ho1 |= (1 << 3);
			} else if (name.equals("awakenScrollBars")) {
				__ho1 |= (1 << 4);
			} else if (name.equals("bringChildToFront")) {
				__ho1 |= (1 << 5);
			} else if (name.equals("bringToFront")) {
				__ho1 |= (1 << 6);
			} else if (name.equals("buildDrawingCache")) {
				__ho1 |= (1 << 7);
			} else if (name.equals("buildLayer")) {
				__ho2 |= (1 << 0);
			} else if (name.equals("callOnClick")) {
				__ho2 |= (1 << 1);
			} else if (name.equals("canAnimate")) {
				__ho2 |= (1 << 2);
			} else if (name.equals("canScrollHorizontally")) {
				__ho2 |= (1 << 3);
			} else if (name.equals("canScrollVertically")) {
				__ho2 |= (1 << 4);
			} else if (name.equals("cancelLongPress")) {
				__ho2 |= (1 << 5);
			} else if (name.equals("checkInputConnectionProxy")) {
				__ho2 |= (1 << 6);
			} else if (name.equals("checkLayoutParams")) {
				__ho2 |= (1 << 7);
			} else if (name.equals("childDrawableStateChanged")) {
				__ho3 |= (1 << 0);
			} else if (name.equals("cleanupLayoutState")) {
				__ho3 |= (1 << 1);
			} else if (name.equals("clearAnimation")) {
				__ho3 |= (1 << 2);
			} else if (name.equals("clearChildFocus")) {
				__ho3 |= (1 << 3);
			} else if (name.equals("clearDisappearingChildren")) {
				__ho3 |= (1 << 4);
			} else if (name.equals("clearFocus")) {
				__ho3 |= (1 << 5);
			} else if (name.equals("clone")) {
				__ho3 |= (1 << 6);
			} else if (name.equals("computeHorizontalScrollExtent")) {
				__ho3 |= (1 << 7);
			} else if (name.equals("computeHorizontalScrollOffset")) {
				__ho4 |= (1 << 0);
			} else if (name.equals("computeHorizontalScrollRange")) {
				__ho4 |= (1 << 1);
			} else if (name.equals("computeScroll")) {
				__ho4 |= (1 << 2);
			} else if (name.equals("computeVerticalScrollExtent")) {
				__ho4 |= (1 << 3);
			} else if (name.equals("computeVerticalScrollOffset")) {
				__ho4 |= (1 << 4);
			} else if (name.equals("computeVerticalScrollRange")) {
				__ho4 |= (1 << 5);
			} else if (name.equals("createAccessibilityNodeInfo")) {
				__ho4 |= (1 << 6);
			} else if (name.equals("createContextMenu")) {
				__ho4 |= (1 << 7);
			} else if (name.equals("debug")) {
				__ho5 |= (1 << 0);
			} else if (name.equals("destroyDrawingCache")) {
				__ho5 |= (1 << 1);
			} else if (name.equals("detachAllViewsFromParent")) {
				__ho5 |= (1 << 2);
			} else if (name.equals("detachViewFromParent")) {
				__ho5 |= (1 << 3);
			} else if (name.equals("detachViewsFromParent")) {
				__ho5 |= (1 << 4);
			} else if (name.equals("dispatchConfigurationChanged")) {
				__ho5 |= (1 << 5);
			} else if (name.equals("dispatchDisplayHint")) {
				__ho5 |= (1 << 6);
			} else if (name.equals("dispatchDragEvent")) {
				__ho5 |= (1 << 7);
			} else if (name.equals("dispatchDraw")) {
				__ho6 |= (1 << 0);
			} else if (name.equals("dispatchFreezeSelfOnly")) {
				__ho6 |= (1 << 1);
			} else if (name.equals("dispatchGenericFocusedEvent")) {
				__ho6 |= (1 << 2);
			} else if (name.equals("dispatchGenericMotionEvent")) {
				__ho6 |= (1 << 3);
			} else if (name.equals("dispatchGenericPointerEvent")) {
				__ho6 |= (1 << 4);
			} else if (name.equals("dispatchHoverEvent")) {
				__ho6 |= (1 << 5);
			} else if (name.equals("dispatchKeyEvent")) {
				__ho6 |= (1 << 6);
			} else if (name.equals("dispatchKeyEventPreIme")) {
				__ho6 |= (1 << 7);
			} else if (name.equals("dispatchKeyShortcutEvent")) {
				__ho7 |= (1 << 0);
			} else if (name.equals("dispatchPopulateAccessibilityEvent")) {
				__ho7 |= (1 << 1);
			} else if (name.equals("dispatchRestoreInstanceState")) {
				__ho7 |= (1 << 2);
			} else if (name.equals("dispatchSaveInstanceState")) {
				__ho7 |= (1 << 3);
			} else if (name.equals("dispatchSetActivated")) {
				__ho7 |= (1 << 4);
			} else if (name.equals("dispatchSetPressed")) {
				__ho7 |= (1 << 5);
			} else if (name.equals("dispatchSetSelected")) {
				__ho7 |= (1 << 6);
			} else if (name.equals("dispatchSystemUiVisibilityChanged")) {
				__ho7 |= (1 << 7);
			} else if (name.equals("dispatchThawSelfOnly")) {
				__ho8 |= (1 << 0);
			} else if (name.equals("dispatchTouchEvent")) {
				__ho8 |= (1 << 1);
			} else if (name.equals("dispatchTrackballEvent")) {
				__ho8 |= (1 << 2);
			} else if (name.equals("dispatchUnhandledMove")) {
				__ho8 |= (1 << 3);
			} else if (name.equals("dispatchVisibilityChanged")) {
				__ho8 |= (1 << 4);
			} else if (name.equals("dispatchWindowFocusChanged")) {
				__ho8 |= (1 << 5);
			} else if (name.equals("dispatchWindowSystemUiVisiblityChanged")) {
				__ho8 |= (1 << 6);
			} else if (name.equals("dispatchWindowVisibilityChanged")) {
				__ho8 |= (1 << 7);
			} else if (name.equals("draw")) {
				__ho9 |= (1 << 0);
			} else if (name.equals("drawChild")) {
				__ho9 |= (1 << 1);
			} else if (name.equals("drawableStateChanged")) {
				__ho9 |= (1 << 2);
			} else if (name.equals("endViewTransition")) {
				__ho9 |= (1 << 3);
			} else if (name.equals("equals")) {
				__ho9 |= (1 << 4);
			} else if (name.equals("finalize")) {
				__ho9 |= (1 << 5);
			} else if (name.equals("findFocus")) {
				__ho9 |= (1 << 6);
			} else if (name.equals("findViewsWithText")) {
				__ho9 |= (1 << 7);
			} else if (name.equals("fitSystemWindows")) {
				__ho10 |= (1 << 0);
			} else if (name.equals("focusSearch")) {
				__ho10 |= (1 << 1);
			} else if (name.equals("focusableViewAvailable")) {
				__ho10 |= (1 << 2);
			} else if (name.equals("forceLayout")) {
				__ho10 |= (1 << 3);
			} else if (name.equals("gatherTransparentRegion")) {
				__ho10 |= (1 << 4);
			} else if (name.equals("generateLayoutParams")) {
				__ho10 |= (1 << 5);
			} else if (name.equals("getAccessibilityNodeProvider")) {
				__ho10 |= (1 << 6);
			} else if (name.equals("getAlpha")) {
				__ho10 |= (1 << 7);
			} else if (name.equals("getAnimation")) {
				__ho11 |= (1 << 0);
			} else if (name.equals("getApplicationWindowToken")) {
				__ho11 |= (1 << 1);
			} else if (name.equals("getBackground")) {
				__ho11 |= (1 << 2);
			} else if (name.equals("getBaseline")) {
				__ho11 |= (1 << 3);
			} else if (name.equals("getBottomFadingEdgeStrength")) {
				__ho11 |= (1 << 4);
			} else if (name.equals("getBottomPaddingOffset")) {
				__ho11 |= (1 << 5);
			} else if (name.equals("getCalendarView")) {
				__ho11 |= (1 << 6);
			} else if (name.equals("getCalendarViewShown")) {
				__ho11 |= (1 << 7);
			} else if (name.equals("getCameraDistance")) {
				__ho12 |= (1 << 0);
			} else if (name.equals("getChildAt")) {
				__ho12 |= (1 << 1);
			} else if (name.equals("getChildCount")) {
				__ho12 |= (1 << 2);
			} else if (name.equals("getChildDrawingOrder")) {
				__ho12 |= (1 << 3);
			} else if (name.equals("getChildStaticTransformation")) {
				__ho12 |= (1 << 4);
			} else if (name.equals("getChildVisibleRect")) {
				__ho12 |= (1 << 5);
			} else if (name.equals("getConsiderGoneChildrenWhenMeasuring")) {
				__ho12 |= (1 << 6);
			} else if (name.equals("getContentDescription")) {
				__ho12 |= (1 << 7);
			} else if (name.equals("getContextMenuInfo")) {
				__ho13 |= (1 << 0);
			} else if (name.equals("getDayOfMonth")) {
				__ho13 |= (1 << 1);
			} else if (name.equals("getDescendantFocusability")) {
				__ho13 |= (1 << 2);
			} else if (name.equals("getDisplay")) {
				__ho13 |= (1 << 3);
			} else if (name.equals("getDrawingCache")) {
				__ho13 |= (1 << 4);
			} else if (name.equals("getDrawingCacheBackgroundColor")) {
				__ho13 |= (1 << 5);
			} else if (name.equals("getDrawingCacheQuality")) {
				__ho13 |= (1 << 6);
			} else if (name.equals("getDrawingRect")) {
				__ho13 |= (1 << 7);
			} else if (name.equals("getDrawingTime")) {
				__ho14 |= (1 << 0);
			} else if (name.equals("getFilterTouchesWhenObscured")) {
				__ho14 |= (1 << 1);
			} else if (name.equals("getFitsSystemWindows")) {
				__ho14 |= (1 << 2);
			} else if (name.equals("getFocusables")) {
				__ho14 |= (1 << 3);
			} else if (name.equals("getFocusedChild")) {
				__ho14 |= (1 << 4);
			} else if (name.equals("getFocusedRect")) {
				__ho14 |= (1 << 5);
			} else if (name.equals("getForeground")) {
				__ho14 |= (1 << 6);
			} else if (name.equals("getForegroundGravity")) {
				__ho14 |= (1 << 7);
			} else if (name.equals("getGlobalVisibleRect")) {
				__ho15 |= (1 << 0);
			} else if (name.equals("getHandler")) {
				__ho15 |= (1 << 1);
			} else if (name.equals("getHitRect")) {
				__ho15 |= (1 << 2);
			} else if (name.equals("getHorizontalFadingEdgeLength")) {
				__ho15 |= (1 << 3);
			} else if (name.equals("getHorizontalScrollbarHeight")) {
				__ho15 |= (1 << 4);
			} else if (name.equals("getId")) {
				__ho15 |= (1 << 5);
			} else if (name.equals("getImportantForAccessibility")) {
				__ho15 |= (1 << 6);
			} else if (name.equals("getKeepScreenOn")) {
				__ho15 |= (1 << 7);
			} else if (name.equals("getKeyDispatcherState")) {
				__ho16 |= (1 << 0);
			} else if (name.equals("getLabelFor")) {
				__ho16 |= (1 << 1);
			} else if (name.equals("getLayerType")) {
				__ho16 |= (1 << 2);
			} else if (name.equals("getLayoutAnimation")) {
				__ho16 |= (1 << 3);
			} else if (name.equals("getLayoutAnimationListener")) {
				__ho16 |= (1 << 4);
			} else if (name.equals("getLayoutDirection")) {
				__ho16 |= (1 << 5);
			} else if (name.equals("getLayoutParams")) {
				__ho16 |= (1 << 6);
			} else if (name.equals("getLayoutTransition")) {
				__ho16 |= (1 << 7);
			} else if (name.equals("getLeftFadingEdgeStrength")) {
				__ho17 |= (1 << 0);
			} else if (name.equals("getLeftPaddingOffset")) {
				__ho17 |= (1 << 1);
			} else if (name.equals("getLocationInWindow")) {
				__ho17 |= (1 << 2);
			} else if (name.equals("getLocationOnScreen")) {
				__ho17 |= (1 << 3);
			} else if (name.equals("getMatrix")) {
				__ho17 |= (1 << 4);
			} else if (name.equals("getMaxDate")) {
				__ho17 |= (1 << 5);
			} else if (name.equals("getMeasureAllChildren")) {
				__ho17 |= (1 << 6);
			} else if (name.equals("getMinDate")) {
				__ho17 |= (1 << 7);
			} else if (name.equals("getMinimumHeight")) {
				__ho18 |= (1 << 0);
			} else if (name.equals("getMinimumWidth")) {
				__ho18 |= (1 << 1);
			} else if (name.equals("getMonth")) {
				__ho18 |= (1 << 2);
			} else if (name.equals("getNextFocusDownId")) {
				__ho18 |= (1 << 3);
			} else if (name.equals("getNextFocusForwardId")) {
				__ho18 |= (1 << 4);
			} else if (name.equals("getNextFocusLeftId")) {
				__ho18 |= (1 << 5);
			} else if (name.equals("getNextFocusRightId")) {
				__ho18 |= (1 << 6);
			} else if (name.equals("getNextFocusUpId")) {
				__ho18 |= (1 << 7);
			} else if (name.equals("getOnFocusChangeListener")) {
				__ho19 |= (1 << 0);
			} else if (name.equals("getOverScrollMode")) {
				__ho19 |= (1 << 1);
			} else if (name.equals("getPaddingBottom")) {
				__ho19 |= (1 << 2);
			} else if (name.equals("getPaddingEnd")) {
				__ho19 |= (1 << 3);
			} else if (name.equals("getPaddingLeft")) {
				__ho19 |= (1 << 4);
			} else if (name.equals("getPaddingRight")) {
				__ho19 |= (1 << 5);
			} else if (name.equals("getPaddingStart")) {
				__ho19 |= (1 << 6);
			} else if (name.equals("getPaddingTop")) {
				__ho19 |= (1 << 7);
			} else if (name.equals("getParentForAccessibility")) {
				__ho20 |= (1 << 0);
			} else if (name.equals("getPersistentDrawingCache")) {
				__ho20 |= (1 << 1);
			} else if (name.equals("getPivotX")) {
				__ho20 |= (1 << 2);
			} else if (name.equals("getPivotY")) {
				__ho20 |= (1 << 3);
			} else if (name.equals("getResources")) {
				__ho20 |= (1 << 4);
			} else if (name.equals("getRightFadingEdgeStrength")) {
				__ho20 |= (1 << 5);
			} else if (name.equals("getRightPaddingOffset")) {
				__ho20 |= (1 << 6);
			} else if (name.equals("getRootView")) {
				__ho20 |= (1 << 7);
			} else if (name.equals("getRotation")) {
				__ho21 |= (1 << 0);
			} else if (name.equals("getRotationX")) {
				__ho21 |= (1 << 1);
			} else if (name.equals("getRotationY")) {
				__ho21 |= (1 << 2);
			} else if (name.equals("getScaleX")) {
				__ho21 |= (1 << 3);
			} else if (name.equals("getScaleY")) {
				__ho21 |= (1 << 4);
			} else if (name.equals("getScrollBarDefaultDelayBeforeFade")) {
				__ho21 |= (1 << 5);
			} else if (name.equals("getScrollBarFadeDuration")) {
				__ho21 |= (1 << 6);
			} else if (name.equals("getScrollBarSize")) {
				__ho21 |= (1 << 7);
			} else if (name.equals("getScrollBarStyle")) {
				__ho22 |= (1 << 0);
			} else if (name.equals("getSolidColor")) {
				__ho22 |= (1 << 1);
			} else if (name.equals("getSpinnersShown")) {
				__ho22 |= (1 << 2);
			} else if (name.equals("getSuggestedMinimumHeight")) {
				__ho22 |= (1 << 3);
			} else if (name.equals("getSuggestedMinimumWidth")) {
				__ho22 |= (1 << 4);
			} else if (name.equals("getSystemUiVisibility")) {
				__ho22 |= (1 << 5);
			} else if (name.equals("getTag")) {
				__ho22 |= (1 << 6);
			} else if (name.equals("getTextAlignment")) {
				__ho22 |= (1 << 7);
			} else if (name.equals("getTextDirection")) {
				__ho23 |= (1 << 0);
			} else if (name.equals("getTopFadingEdgeStrength")) {
				__ho23 |= (1 << 1);
			} else if (name.equals("getTopPaddingOffset")) {
				__ho23 |= (1 << 2);
			} else if (name.equals("getTouchDelegate")) {
				__ho23 |= (1 << 3);
			} else if (name.equals("getTouchables")) {
				__ho23 |= (1 << 4);
			} else if (name.equals("getTranslationX")) {
				__ho23 |= (1 << 5);
			} else if (name.equals("getTranslationY")) {
				__ho23 |= (1 << 6);
			} else if (name.equals("getVerticalFadingEdgeLength")) {
				__ho23 |= (1 << 7);
			} else if (name.equals("getVerticalScrollbarPosition")) {
				__ho24 |= (1 << 0);
			} else if (name.equals("getVerticalScrollbarWidth")) {
				__ho24 |= (1 << 1);
			} else if (name.equals("getViewTreeObserver")) {
				__ho24 |= (1 << 2);
			} else if (name.equals("getVisibility")) {
				__ho24 |= (1 << 3);
			} else if (name.equals("getWindowAttachCount")) {
				__ho24 |= (1 << 4);
			} else if (name.equals("getWindowSystemUiVisibility")) {
				__ho24 |= (1 << 5);
			} else if (name.equals("getWindowToken")) {
				__ho24 |= (1 << 6);
			} else if (name.equals("getWindowVisibility")) {
				__ho24 |= (1 << 7);
			} else if (name.equals("getWindowVisibleDisplayFrame")) {
				__ho25 |= (1 << 0);
			} else if (name.equals("getX")) {
				__ho25 |= (1 << 1);
			} else if (name.equals("getY")) {
				__ho25 |= (1 << 2);
			} else if (name.equals("getYear")) {
				__ho25 |= (1 << 3);
			} else if (name.equals("hasFocus")) {
				__ho25 |= (1 << 4);
			} else if (name.equals("hasFocusable")) {
				__ho25 |= (1 << 5);
			} else if (name.equals("hasOnClickListeners")) {
				__ho25 |= (1 << 6);
			} else if (name.equals("hasOverlappingRendering")) {
				__ho25 |= (1 << 7);
			} else if (name.equals("hasTransientState")) {
				__ho26 |= (1 << 0);
			} else if (name.equals("hasWindowFocus")) {
				__ho26 |= (1 << 1);
			} else if (name.equals("hashCode")) {
				__ho26 |= (1 << 2);
			} else if (name.equals("indexOfChild")) {
				__ho26 |= (1 << 3);
			} else if (name.equals("init")) {
				__ho26 |= (1 << 4);
			} else if (name.equals("initializeFadingEdge")) {
				__ho26 |= (1 << 5);
			} else if (name.equals("initializeScrollbars")) {
				__ho26 |= (1 << 6);
			} else if (name.equals("invalidate")) {
				__ho26 |= (1 << 7);
			} else if (name.equals("invalidateChildInParent")) {
				__ho27 |= (1 << 0);
			} else if (name.equals("invalidateDrawable")) {
				__ho27 |= (1 << 1);
			} else if (name.equals("isActivated")) {
				__ho27 |= (1 << 2);
			} else if (name.equals("isAlwaysDrawnWithCacheEnabled")) {
				__ho27 |= (1 << 3);
			} else if (name.equals("isAnimationCacheEnabled")) {
				__ho27 |= (1 << 4);
			} else if (name.equals("isChildrenDrawingOrderEnabled")) {
				__ho27 |= (1 << 5);
			} else if (name.equals("isChildrenDrawnWithCacheEnabled")) {
				__ho27 |= (1 << 6);
			} else if (name.equals("isClickable")) {
				__ho27 |= (1 << 7);
			} else if (name.equals("isDirty")) {
				__ho28 |= (1 << 0);
			} else if (name.equals("isDrawingCacheEnabled")) {
				__ho28 |= (1 << 1);
			} else if (name.equals("isDuplicateParentStateEnabled")) {
				__ho28 |= (1 << 2);
			} else if (name.equals("isEnabled")) {
				__ho28 |= (1 << 3);
			} else if (name.equals("isFocused")) {
				__ho28 |= (1 << 4);
			} else if (name.equals("isHapticFeedbackEnabled")) {
				__ho28 |= (1 << 5);
			} else if (name.equals("isHardwareAccelerated")) {
				__ho28 |= (1 << 6);
			} else if (name.equals("isHorizontalFadingEdgeEnabled")) {
				__ho28 |= (1 << 7);
			} else if (name.equals("isHorizontalScrollBarEnabled")) {
				__ho29 |= (1 << 0);
			} else if (name.equals("isHovered")) {
				__ho29 |= (1 << 1);
			} else if (name.equals("isInEditMode")) {
				__ho29 |= (1 << 2);
			} else if (name.equals("isInTouchMode")) {
				__ho29 |= (1 << 3);
			} else if (name.equals("isLayoutRequested")) {
				__ho29 |= (1 << 4);
			} else if (name.equals("isLongClickable")) {
				__ho29 |= (1 << 5);
			} else if (name.equals("isMotionEventSplittingEnabled")) {
				__ho29 |= (1 << 6);
			} else if (name.equals("isOpaque")) {
				__ho29 |= (1 << 7);
			} else if (name.equals("isPaddingOffsetRequired")) {
				__ho30 |= (1 << 0);
			} else if (name.equals("isPaddingRelative")) {
				__ho30 |= (1 << 1);
			} else if (name.equals("isPressed")) {
				__ho30 |= (1 << 2);
			} else if (name.equals("isSaveEnabled")) {
				__ho30 |= (1 << 3);
			} else if (name.equals("isSaveFromParentEnabled")) {
				__ho30 |= (1 << 4);
			} else if (name.equals("isScrollContainer")) {
				__ho30 |= (1 << 5);
			} else if (name.equals("isScrollbarFadingEnabled")) {
				__ho30 |= (1 << 6);
			} else if (name.equals("isSelected")) {
				__ho30 |= (1 << 7);
			} else if (name.equals("isShown")) {
				__ho31 |= (1 << 0);
			} else if (name.equals("isSoundEffectsEnabled")) {
				__ho31 |= (1 << 1);
			} else if (name.equals("isVerticalFadingEdgeEnabled")) {
				__ho31 |= (1 << 2);
			} else if (name.equals("isVerticalScrollBarEnabled")) {
				__ho31 |= (1 << 3);
			} else if (name.equals("jumpDrawablesToCurrentState")) {
				__ho31 |= (1 << 4);
			} else if (name.equals("measureChild")) {
				__ho31 |= (1 << 5);
			} else if (name.equals("measureChildWithMargins")) {
				__ho31 |= (1 << 6);
			} else if (name.equals("measureChildren")) {
				__ho31 |= (1 << 7);
			} else if (name.equals("offsetLeftAndRight")) {
				__ho32 |= (1 << 0);
			} else if (name.equals("offsetTopAndBottom")) {
				__ho32 |= (1 << 1);
			} else if (name.equals("onAnimationEnd")) {
				__ho32 |= (1 << 2);
			} else if (name.equals("onAnimationStart")) {
				__ho32 |= (1 << 3);
			} else if (name.equals("onAttachedToWindow")) {
				__ho32 |= (1 << 4);
			} else if (name.equals("onCheckIsTextEditor")) {
				__ho32 |= (1 << 5);
			} else if (name.equals("onConfigurationChanged")) {
				__ho32 |= (1 << 6);
			} else if (name.equals("onCreateContextMenu")) {
				__ho32 |= (1 << 7);
			} else if (name.equals("onCreateDrawableState")) {
				__ho33 |= (1 << 0);
			} else if (name.equals("onCreateInputConnection")) {
				__ho33 |= (1 << 1);
			} else if (name.equals("onDetachedFromWindow")) {
				__ho33 |= (1 << 2);
			} else if (name.equals("onDisplayHint")) {
				__ho33 |= (1 << 3);
			} else if (name.equals("onDragEvent")) {
				__ho33 |= (1 << 4);
			} else if (name.equals("onDraw")) {
				__ho33 |= (1 << 5);
			} else if (name.equals("onFilterTouchEventForSecurity")) {
				__ho33 |= (1 << 6);
			} else if (name.equals("onFinishInflate")) {
				__ho33 |= (1 << 7);
			} else if (name.equals("onFinishTemporaryDetach")) {
				__ho34 |= (1 << 0);
			} else if (name.equals("onFocusChanged")) {
				__ho34 |= (1 << 1);
			} else if (name.equals("onGenericMotionEvent")) {
				__ho34 |= (1 << 2);
			} else if (name.equals("onHoverChanged")) {
				__ho34 |= (1 << 3);
			} else if (name.equals("onHoverEvent")) {
				__ho34 |= (1 << 4);
			} else if (name.equals("onInitializeAccessibilityEvent")) {
				__ho34 |= (1 << 5);
			} else if (name.equals("onInitializeAccessibilityNodeInfo")) {
				__ho34 |= (1 << 6);
			} else if (name.equals("onInterceptHoverEvent")) {
				__ho34 |= (1 << 7);
			} else if (name.equals("onInterceptTouchEvent")) {
				__ho35 |= (1 << 0);
			} else if (name.equals("onKeyDown")) {
				__ho35 |= (1 << 1);
			} else if (name.equals("onKeyLongPress")) {
				__ho35 |= (1 << 2);
			} else if (name.equals("onKeyMultiple")) {
				__ho35 |= (1 << 3);
			} else if (name.equals("onKeyPreIme")) {
				__ho35 |= (1 << 4);
			} else if (name.equals("onKeyShortcut")) {
				__ho35 |= (1 << 5);
			} else if (name.equals("onKeyUp")) {
				__ho35 |= (1 << 6);
			} else if (name.equals("onLayout")) {
				__ho35 |= (1 << 7);
			} else if (name.equals("onMeasure")) {
				__ho36 |= (1 << 0);
			} else if (name.equals("onOverScrolled")) {
				__ho36 |= (1 << 1);
			} else if (name.equals("onPopulateAccessibilityEvent")) {
				__ho36 |= (1 << 2);
			} else if (name.equals("onRequestFocusInDescendants")) {
				__ho36 |= (1 << 3);
			} else if (name.equals("onRequestSendAccessibilityEvent")) {
				__ho36 |= (1 << 4);
			} else if (name.equals("onRestoreInstanceState")) {
				__ho36 |= (1 << 5);
			} else if (name.equals("onRtlPropertiesChanged")) {
				__ho36 |= (1 << 6);
			} else if (name.equals("onSaveInstanceState")) {
				__ho36 |= (1 << 7);
			} else if (name.equals("onScreenStateChanged")) {
				__ho37 |= (1 << 0);
			} else if (name.equals("onScrollChanged")) {
				__ho37 |= (1 << 1);
			} else if (name.equals("onSetAlpha")) {
				__ho37 |= (1 << 2);
			} else if (name.equals("onSizeChanged")) {
				__ho37 |= (1 << 3);
			} else if (name.equals("onStartTemporaryDetach")) {
				__ho37 |= (1 << 4);
			} else if (name.equals("onTouchEvent")) {
				__ho37 |= (1 << 5);
			} else if (name.equals("onTrackballEvent")) {
				__ho37 |= (1 << 6);
			} else if (name.equals("onVisibilityChanged")) {
				__ho37 |= (1 << 7);
			} else if (name.equals("onWindowFocusChanged")) {
				__ho38 |= (1 << 0);
			} else if (name.equals("onWindowSystemUiVisibilityChanged")) {
				__ho38 |= (1 << 1);
			} else if (name.equals("onWindowVisibilityChanged")) {
				__ho38 |= (1 << 2);
			} else if (name.equals("overScrollBy")) {
				__ho38 |= (1 << 3);
			} else if (name.equals("performAccessibilityAction")) {
				__ho38 |= (1 << 4);
			} else if (name.equals("performClick")) {
				__ho38 |= (1 << 5);
			} else if (name.equals("performHapticFeedback")) {
				__ho38 |= (1 << 6);
			} else if (name.equals("performLongClick")) {
				__ho38 |= (1 << 7);
			} else if (name.equals("playSoundEffect")) {
				__ho39 |= (1 << 0);
			} else if (name.equals("post")) {
				__ho39 |= (1 << 1);
			} else if (name.equals("postDelayed")) {
				__ho39 |= (1 << 2);
			} else if (name.equals("postInvalidate")) {
				__ho39 |= (1 << 3);
			} else if (name.equals("postInvalidateDelayed")) {
				__ho39 |= (1 << 4);
			} else if (name.equals("postInvalidateOnAnimation")) {
				__ho39 |= (1 << 5);
			} else if (name.equals("postOnAnimation")) {
				__ho39 |= (1 << 6);
			} else if (name.equals("postOnAnimationDelayed")) {
				__ho39 |= (1 << 7);
			} else if (name.equals("recomputeViewAttributes")) {
				__ho40 |= (1 << 0);
			} else if (name.equals("refreshDrawableState")) {
				__ho40 |= (1 << 1);
			} else if (name.equals("removeAllViews")) {
				__ho40 |= (1 << 2);
			} else if (name.equals("removeAllViewsInLayout")) {
				__ho40 |= (1 << 3);
			} else if (name.equals("removeCallbacks")) {
				__ho40 |= (1 << 4);
			} else if (name.equals("removeDetachedView")) {
				__ho40 |= (1 << 5);
			} else if (name.equals("removeOnAttachStateChangeListener")) {
				__ho40 |= (1 << 6);
			} else if (name.equals("removeOnLayoutChangeListener")) {
				__ho40 |= (1 << 7);
			} else if (name.equals("removeView")) {
				__ho41 |= (1 << 0);
			} else if (name.equals("removeViewAt")) {
				__ho41 |= (1 << 1);
			} else if (name.equals("removeViewInLayout")) {
				__ho41 |= (1 << 2);
			} else if (name.equals("removeViews")) {
				__ho41 |= (1 << 3);
			} else if (name.equals("removeViewsInLayout")) {
				__ho41 |= (1 << 4);
			} else if (name.equals("requestChildFocus")) {
				__ho41 |= (1 << 5);
			} else if (name.equals("requestChildRectangleOnScreen")) {
				__ho41 |= (1 << 6);
			} else if (name.equals("requestDisallowInterceptTouchEvent")) {
				__ho41 |= (1 << 7);
			} else if (name.equals("requestFitSystemWindows")) {
				__ho42 |= (1 << 0);
			} else if (name.equals("requestFocus")) {
				__ho42 |= (1 << 1);
			} else if (name.equals("requestLayout")) {
				__ho42 |= (1 << 2);
			} else if (name.equals("requestRectangleOnScreen")) {
				__ho42 |= (1 << 3);
			} else if (name.equals("requestSendAccessibilityEvent")) {
				__ho42 |= (1 << 4);
			} else if (name.equals("requestTransparentRegion")) {
				__ho42 |= (1 << 5);
			} else if (name.equals("restoreHierarchyState")) {
				__ho42 |= (1 << 6);
			} else if (name.equals("saveHierarchyState")) {
				__ho42 |= (1 << 7);
			} else if (name.equals("scheduleDrawable")) {
				__ho43 |= (1 << 0);
			} else if (name.equals("scheduleLayoutAnimation")) {
				__ho43 |= (1 << 1);
			} else if (name.equals("scrollBy")) {
				__ho43 |= (1 << 2);
			} else if (name.equals("scrollTo")) {
				__ho43 |= (1 << 3);
			} else if (name.equals("sendAccessibilityEvent")) {
				__ho43 |= (1 << 4);
			} else if (name.equals("sendAccessibilityEventUnchecked")) {
				__ho43 |= (1 << 5);
			} else if (name.equals("setAccessibilityDelegate")) {
				__ho43 |= (1 << 6);
			} else if (name.equals("setActivated")) {
				__ho43 |= (1 << 7);
			} else if (name.equals("setAddStatesFromChildren")) {
				__ho44 |= (1 << 0);
			} else if (name.equals("setAlpha")) {
				__ho44 |= (1 << 1);
			} else if (name.equals("setAlwaysDrawnWithCacheEnabled")) {
				__ho44 |= (1 << 2);
			} else if (name.equals("setAnimation")) {
				__ho44 |= (1 << 3);
			} else if (name.equals("setAnimationCacheEnabled")) {
				__ho44 |= (1 << 4);
			} else if (name.equals("setBackground")) {
				__ho44 |= (1 << 5);
			} else if (name.equals("setBackgroundColor")) {
				__ho44 |= (1 << 6);
			} else if (name.equals("setBackgroundDrawable")) {
				__ho44 |= (1 << 7);
			} else if (name.equals("setBackgroundResource")) {
				__ho45 |= (1 << 0);
			} else if (name.equals("setCalendarViewShown")) {
				__ho45 |= (1 << 1);
			} else if (name.equals("setCameraDistance")) {
				__ho45 |= (1 << 2);
			} else if (name.equals("setChildrenDrawingCacheEnabled")) {
				__ho45 |= (1 << 3);
			} else if (name.equals("setChildrenDrawingOrderEnabled")) {
				__ho45 |= (1 << 4);
			} else if (name.equals("setChildrenDrawnWithCacheEnabled")) {
				__ho45 |= (1 << 5);
			} else if (name.equals("setClickable")) {
				__ho45 |= (1 << 6);
			} else if (name.equals("setClipChildren")) {
				__ho45 |= (1 << 7);
			} else if (name.equals("setClipToPadding")) {
				__ho46 |= (1 << 0);
			} else if (name.equals("setContentDescription")) {
				__ho46 |= (1 << 1);
			} else if (name.equals("setDescendantFocusability")) {
				__ho46 |= (1 << 2);
			} else if (name.equals("setDrawingCacheBackgroundColor")) {
				__ho46 |= (1 << 3);
			} else if (name.equals("setDrawingCacheEnabled")) {
				__ho46 |= (1 << 4);
			} else if (name.equals("setDrawingCacheQuality")) {
				__ho46 |= (1 << 5);
			} else if (name.equals("setDuplicateParentStateEnabled")) {
				__ho46 |= (1 << 6);
			} else if (name.equals("setEnabled")) {
				__ho46 |= (1 << 7);
			} else if (name.equals("setFadingEdgeLength")) {
				__ho47 |= (1 << 0);
			} else if (name.equals("setFilterTouchesWhenObscured")) {
				__ho47 |= (1 << 1);
			} else if (name.equals("setFitsSystemWindows")) {
				__ho47 |= (1 << 2);
			} else if (name.equals("setFocusable")) {
				__ho47 |= (1 << 3);
			} else if (name.equals("setFocusableInTouchMode")) {
				__ho47 |= (1 << 4);
			} else if (name.equals("setForeground")) {
				__ho47 |= (1 << 5);
			} else if (name.equals("setForegroundGravity")) {
				__ho47 |= (1 << 6);
			} else if (name.equals("setHapticFeedbackEnabled")) {
				__ho47 |= (1 << 7);
			} else if (name.equals("setHasTransientState")) {
				__ho48 |= (1 << 0);
			} else if (name.equals("setHorizontalFadingEdgeEnabled")) {
				__ho48 |= (1 << 1);
			} else if (name.equals("setHorizontalScrollBarEnabled")) {
				__ho48 |= (1 << 2);
			} else if (name.equals("setHovered")) {
				__ho48 |= (1 << 3);
			} else if (name.equals("setId")) {
				__ho48 |= (1 << 4);
			} else if (name.equals("setImportantForAccessibility")) {
				__ho48 |= (1 << 5);
			} else if (name.equals("setKeepScreenOn")) {
				__ho48 |= (1 << 6);
			} else if (name.equals("setLabelFor")) {
				__ho48 |= (1 << 7);
			} else if (name.equals("setLayerPaint")) {
				__ho49 |= (1 << 0);
			} else if (name.equals("setLayerType")) {
				__ho49 |= (1 << 1);
			} else if (name.equals("setLayoutAnimation")) {
				__ho49 |= (1 << 2);
			} else if (name.equals("setLayoutAnimationListener")) {
				__ho49 |= (1 << 3);
			} else if (name.equals("setLayoutDirection")) {
				__ho49 |= (1 << 4);
			} else if (name.equals("setLayoutParams")) {
				__ho49 |= (1 << 5);
			} else if (name.equals("setLayoutTransition")) {
				__ho49 |= (1 << 6);
			} else if (name.equals("setLongClickable")) {
				__ho49 |= (1 << 7);
			} else if (name.equals("setMaxDate")) {
				__ho50 |= (1 << 0);
			} else if (name.equals("setMeasureAllChildren")) {
				__ho50 |= (1 << 1);
			} else if (name.equals("setMinDate")) {
				__ho50 |= (1 << 2);
			} else if (name.equals("setMinimumHeight")) {
				__ho50 |= (1 << 3);
			} else if (name.equals("setMinimumWidth")) {
				__ho50 |= (1 << 4);
			} else if (name.equals("setMotionEventSplittingEnabled")) {
				__ho50 |= (1 << 5);
			} else if (name.equals("setNextFocusDownId")) {
				__ho50 |= (1 << 6);
			} else if (name.equals("setNextFocusForwardId")) {
				__ho50 |= (1 << 7);
			} else if (name.equals("setNextFocusLeftId")) {
				__ho51 |= (1 << 0);
			} else if (name.equals("setNextFocusRightId")) {
				__ho51 |= (1 << 1);
			} else if (name.equals("setNextFocusUpId")) {
				__ho51 |= (1 << 2);
			} else if (name.equals("setOnClickListener")) {
				__ho51 |= (1 << 3);
			} else if (name.equals("setOnCreateContextMenuListener")) {
				__ho51 |= (1 << 4);
			} else if (name.equals("setOnDragListener")) {
				__ho51 |= (1 << 5);
			} else if (name.equals("setOnFocusChangeListener")) {
				__ho51 |= (1 << 6);
			} else if (name.equals("setOnGenericMotionListener")) {
				__ho51 |= (1 << 7);
			} else if (name.equals("setOnHierarchyChangeListener")) {
				__ho52 |= (1 << 0);
			} else if (name.equals("setOnHoverListener")) {
				__ho52 |= (1 << 1);
			} else if (name.equals("setOnKeyListener")) {
				__ho52 |= (1 << 2);
			} else if (name.equals("setOnLongClickListener")) {
				__ho52 |= (1 << 3);
			} else if (name.equals("setOnSystemUiVisibilityChangeListener")) {
				__ho52 |= (1 << 4);
			} else if (name.equals("setOnTouchListener")) {
				__ho52 |= (1 << 5);
			} else if (name.equals("setOverScrollMode")) {
				__ho52 |= (1 << 6);
			} else if (name.equals("setPadding")) {
				__ho52 |= (1 << 7);
			} else if (name.equals("setPaddingRelative")) {
				__ho53 |= (1 << 0);
			} else if (name.equals("setPersistentDrawingCache")) {
				__ho53 |= (1 << 1);
			} else if (name.equals("setPivotX")) {
				__ho53 |= (1 << 2);
			} else if (name.equals("setPivotY")) {
				__ho53 |= (1 << 3);
			} else if (name.equals("setPressed")) {
				__ho53 |= (1 << 4);
			} else if (name.equals("setRotation")) {
				__ho53 |= (1 << 5);
			} else if (name.equals("setRotationX")) {
				__ho53 |= (1 << 6);
			} else if (name.equals("setRotationY")) {
				__ho53 |= (1 << 7);
			} else if (name.equals("setSaveEnabled")) {
				__ho54 |= (1 << 0);
			} else if (name.equals("setSaveFromParentEnabled")) {
				__ho54 |= (1 << 1);
			} else if (name.equals("setScaleX")) {
				__ho54 |= (1 << 2);
			} else if (name.equals("setScaleY")) {
				__ho54 |= (1 << 3);
			} else if (name.equals("setScrollBarDefaultDelayBeforeFade")) {
				__ho54 |= (1 << 4);
			} else if (name.equals("setScrollBarFadeDuration")) {
				__ho54 |= (1 << 5);
			} else if (name.equals("setScrollBarSize")) {
				__ho54 |= (1 << 6);
			} else if (name.equals("setScrollBarStyle")) {
				__ho54 |= (1 << 7);
			} else if (name.equals("setScrollContainer")) {
				__ho55 |= (1 << 0);
			} else if (name.equals("setScrollX")) {
				__ho55 |= (1 << 1);
			} else if (name.equals("setScrollY")) {
				__ho55 |= (1 << 2);
			} else if (name.equals("setScrollbarFadingEnabled")) {
				__ho55 |= (1 << 3);
			} else if (name.equals("setSelected")) {
				__ho55 |= (1 << 4);
			} else if (name.equals("setSoundEffectsEnabled")) {
				__ho55 |= (1 << 5);
			} else if (name.equals("setSpinnersShown")) {
				__ho55 |= (1 << 6);
			} else if (name.equals("setStaticTransformationsEnabled")) {
				__ho55 |= (1 << 7);
			} else if (name.equals("setSystemUiVisibility")) {
				__ho56 |= (1 << 0);
			} else if (name.equals("setTag")) {
				__ho56 |= (1 << 1);
			} else if (name.equals("setTextAlignment")) {
				__ho56 |= (1 << 2);
			} else if (name.equals("setTextDirection")) {
				__ho56 |= (1 << 3);
			} else if (name.equals("setTouchDelegate")) {
				__ho56 |= (1 << 4);
			} else if (name.equals("setTranslationX")) {
				__ho56 |= (1 << 5);
			} else if (name.equals("setTranslationY")) {
				__ho56 |= (1 << 6);
			} else if (name.equals("setVerticalFadingEdgeEnabled")) {
				__ho56 |= (1 << 7);
			} else if (name.equals("setVerticalScrollBarEnabled")) {
				__ho57 |= (1 << 0);
			} else if (name.equals("setVerticalScrollbarPosition")) {
				__ho57 |= (1 << 1);
			} else if (name.equals("setVisibility")) {
				__ho57 |= (1 << 2);
			} else if (name.equals("setWillNotCacheDrawing")) {
				__ho57 |= (1 << 3);
			} else if (name.equals("setWillNotDraw")) {
				__ho57 |= (1 << 4);
			} else if (name.equals("setX")) {
				__ho57 |= (1 << 5);
			} else if (name.equals("setY")) {
				__ho57 |= (1 << 6);
			} else if (name.equals("shouldDelayChildPressedState")) {
				__ho57 |= (1 << 7);
			} else if (name.equals("showContextMenu")) {
				__ho58 |= (1 << 0);
			} else if (name.equals("showContextMenuForChild")) {
				__ho58 |= (1 << 1);
			} else if (name.equals("startActionMode")) {
				__ho58 |= (1 << 2);
			} else if (name.equals("startActionModeForChild")) {
				__ho58 |= (1 << 3);
			} else if (name.equals("startAnimation")) {
				__ho58 |= (1 << 4);
			} else if (name.equals("startLayoutAnimation")) {
				__ho58 |= (1 << 5);
			} else if (name.equals("startViewTransition")) {
				__ho58 |= (1 << 6);
			} else if (name.equals("toString")) {
				__ho58 |= (1 << 7);
			} else if (name.equals("unscheduleDrawable")) {
				__ho59 |= (1 << 0);
			} else if (name.equals("updateDate")) {
				__ho59 |= (1 << 1);
			} else if (name.equals("updateViewLayout")) {
				__ho59 |= (1 << 2);
			} else if (name.equals("verifyDrawable")) {
				__ho59 |= (1 << 3);
			} else if (name.equals("willNotCacheDrawing")) {
				__ho59 |= (1 << 4);
			} else if (name.equals("willNotDraw")) {
				__ho59 |= (1 << 5);
			}
		}
	}
	private boolean __initialized;
	private boolean __ctorOverridden;
	private byte __ho0;
	private byte __ho1;
	private byte __ho2;
	private byte __ho3;
	private byte __ho4;
	private byte __ho5;
	private byte __ho6;
	private byte __ho7;
	private byte __ho8;
	private byte __ho9;
	private byte __ho10;
	private byte __ho11;
	private byte __ho12;
	private byte __ho13;
	private byte __ho14;
	private byte __ho15;
	private byte __ho16;
	private byte __ho17;
	private byte __ho18;
	private byte __ho19;
	private byte __ho20;
	private byte __ho21;
	private byte __ho22;
	private byte __ho23;
	private byte __ho24;
	private byte __ho25;
	private byte __ho26;
	private byte __ho27;
	private byte __ho28;
	private byte __ho29;
	private byte __ho30;
	private byte __ho31;
	private byte __ho32;
	private byte __ho33;
	private byte __ho34;
	private byte __ho35;
	private byte __ho36;
	private byte __ho37;
	private byte __ho38;
	private byte __ho39;
	private byte __ho40;
	private byte __ho41;
	private byte __ho42;
	private byte __ho43;
	private byte __ho44;
	private byte __ho45;
	private byte __ho46;
	private byte __ho47;
	private byte __ho48;
	private byte __ho49;
	private byte __ho50;
	private byte __ho51;
	private byte __ho52;
	private byte __ho53;
	private byte __ho54;
	private byte __ho55;
	private byte __ho56;
	private byte __ho57;
	private byte __ho58;
	private byte __ho59;
	private byte __ho60;
}
