package com.tns.gen.android.widget;

public class Button extends android.widget.Button implements com.tns.NativeScriptHashCodeProvider {
	public Button(android.content.Context param_0, android.util.AttributeSet param_1, int param_2) {
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

	public Button(android.content.Context param_0, android.util.AttributeSet param_1) {
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

	public Button(android.content.Context param_0) {
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

	public void addTextChangedListener(android.text.TextWatcher param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addTextChangedListener", params);
		} else {
			super.addTextChangedListener(param_0);
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

	public android.view.ViewPropertyAnimator animate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho0 & (1 << 6)) > 0) { 
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
		if ((__ho0 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "announceForAccessibility", params);
		} else {
			super.announceForAccessibility(param_0);
		}
	}

	public void append(java.lang.CharSequence param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "append", params);
		} else {
			super.append(param_0, param_1, param_2);
		}
	}

	protected boolean awakenScrollBars(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 1)) > 0) { 
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
		if ((__ho1 & (1 << 1)) > 0) { 
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
		if ((__ho1 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
		} else {
			return super.awakenScrollBars(param_0, param_1);
		}
	}

	public void beginBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "beginBatchEdit", params);
		} else {
			super.beginBatchEdit();
		}
	}

	public boolean bringPointIntoView(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "bringPointIntoView", params);
		} else {
			return super.bringPointIntoView(param_0);
		}
	}

	public void bringToFront() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho1 & (1 << 4)) > 0) { 
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
		if ((__ho1 & (1 << 5)) > 0) { 
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
		if ((__ho1 & (1 << 5)) > 0) { 
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
		if ((__ho1 & (1 << 6)) > 0) { 
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
		if ((__ho1 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "callOnClick", params);
		} else {
			return super.callOnClick();
		}
	}

	public boolean canScrollHorizontally(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 0)) > 0) { 
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
		if ((__ho2 & (1 << 1)) > 0) { 
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
		if ((__ho2 & (1 << 2)) > 0) { 
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
		if ((__ho2 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "checkInputConnectionProxy", params);
		} else {
			return super.checkInputConnectionProxy(param_0);
		}
	}

	public void clearAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearAnimation", params);
		} else {
			super.clearAnimation();
		}
	}

	public void clearComposingText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearComposingText", params);
		} else {
			super.clearComposingText();
		}
	}

	public void clearFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho2 & (1 << 6)) > 0) { 
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
		if ((__ho2 & (1 << 7)) > 0) { 
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
		if ((__ho3 & (1 << 0)) > 0) { 
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
		if ((__ho3 & (1 << 1)) > 0) { 
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
		if ((__ho3 & (1 << 2)) > 0) { 
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
		if ((__ho3 & (1 << 3)) > 0) { 
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
		if ((__ho3 & (1 << 4)) > 0) { 
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
		if ((__ho3 & (1 << 5)) > 0) { 
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
		if ((__ho3 & (1 << 6)) > 0) { 
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
		if ((__ho3 & (1 << 7)) > 0) { 
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
		if ((__ho4 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "createContextMenu", params);
		} else {
			super.createContextMenu(param_0);
		}
	}

	public void debug(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 1)) > 0) { 
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
		if ((__ho4 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "destroyDrawingCache", params);
		} else {
			super.destroyDrawingCache();
		}
	}

	public boolean didTouchFocusSelect() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "didTouchFocusSelect", params);
		} else {
			return super.didTouchFocusSelect();
		}
	}

	public void dispatchConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho4 & (1 << 4)) > 0) { 
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
		if ((__ho4 & (1 << 5)) > 0) { 
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
		if ((__ho4 & (1 << 6)) > 0) { 
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
		if ((__ho4 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchDraw", params);
		} else {
			super.dispatchDraw(param_0);
		}
	}

	protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho5 & (1 << 0)) > 0) { 
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
		if ((__ho5 & (1 << 1)) > 0) { 
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
		if ((__ho5 & (1 << 2)) > 0) { 
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
		if ((__ho5 & (1 << 3)) > 0) { 
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
		if ((__ho5 & (1 << 4)) > 0) { 
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
		if ((__ho5 & (1 << 5)) > 0) { 
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
		if ((__ho5 & (1 << 6)) > 0) { 
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
		if ((__ho5 & (1 << 7)) > 0) { 
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
		if ((__ho6 & (1 << 0)) > 0) { 
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
		if ((__ho6 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSaveInstanceState", params);
		} else {
			super.dispatchSaveInstanceState(param_0);
		}
	}

	protected void dispatchSetActivated(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 2)) > 0) { 
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
		if ((__ho6 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetPressed", params);
		} else {
			super.dispatchSetPressed(param_0);
		}
	}

	protected void dispatchSetSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 4)) > 0) { 
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
		if ((__ho6 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSystemUiVisibilityChanged", params);
		} else {
			super.dispatchSystemUiVisibilityChanged(param_0);
		}
	}

	public boolean dispatchTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho6 & (1 << 6)) > 0) { 
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
		if ((__ho6 & (1 << 7)) > 0) { 
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
		if ((__ho7 & (1 << 0)) > 0) { 
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
		if ((__ho7 & (1 << 1)) > 0) { 
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
		if ((__ho7 & (1 << 2)) > 0) { 
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
		if ((__ho7 & (1 << 3)) > 0) { 
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
		if ((__ho7 & (1 << 4)) > 0) { 
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
		if ((__ho7 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "draw", params);
		} else {
			super.draw(param_0);
		}
	}

	protected void drawableStateChanged() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "drawableStateChanged", params);
		} else {
			super.drawableStateChanged();
		}
	}

	public void endBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho7 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "endBatchEdit", params);
		} else {
			super.endBatchEdit();
		}
	}

	public boolean equals(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "equals", params);
		} else {
			return super.equals(param_0);
		}
	}

	public boolean extractText(android.view.inputmethod.ExtractedTextRequest param_0, android.view.inputmethod.ExtractedText param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "extractText", params);
		} else {
			return super.extractText(param_0, param_1);
		}
	}

	protected void finalize() throws java.lang.Throwable {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 2)) > 0) { 
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
		if ((__ho8 & (1 << 3)) > 0) { 
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
		if ((__ho8 & (1 << 4)) > 0) { 
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
		if ((__ho8 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "fitSystemWindows", params);
		} else {
			return super.fitSystemWindows(param_0);
		}
	}

	public android.view.View focusSearch(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "focusSearch", params);
		} else {
			return super.focusSearch(param_0);
		}
	}

	public void forceLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho8 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "forceLayout", params);
		} else {
			super.forceLayout();
		}
	}

	public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho9 & (1 << 0)) > 0) { 
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
		if ((__ho9 & (1 << 1)) > 0) { 
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
		if ((__ho9 & (1 << 2)) > 0) { 
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
		if ((__ho9 & (1 << 3)) > 0) { 
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
		if ((__ho9 & (1 << 4)) > 0) { 
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
		if ((__ho9 & (1 << 5)) > 0) { 
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
		if ((__ho9 & (1 << 6)) > 0) { 
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
		if ((__ho9 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getBottomPaddingOffset", params);
		} else {
			return super.getBottomPaddingOffset();
		}
	}

	public float getCameraDistance() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getCameraDistance", params);
		} else {
			return super.getCameraDistance();
		}
	}

	public int getCompoundDrawablePadding() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundDrawablePadding", params);
		} else {
			return super.getCompoundDrawablePadding();
		}
	}

	public android.graphics.drawable.Drawable[] getCompoundDrawables() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable[])com.tns.Platform.callJSMethod(this, "getCompoundDrawables", params);
		} else {
			return super.getCompoundDrawables();
		}
	}

	public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable[])com.tns.Platform.callJSMethod(this, "getCompoundDrawablesRelative", params);
		} else {
			return super.getCompoundDrawablesRelative();
		}
	}

	public int getCompoundPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingBottom", params);
		} else {
			return super.getCompoundPaddingBottom();
		}
	}

	public int getCompoundPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingEnd", params);
		} else {
			return super.getCompoundPaddingEnd();
		}
	}

	public int getCompoundPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingLeft", params);
		} else {
			return super.getCompoundPaddingLeft();
		}
	}

	public int getCompoundPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho10 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingRight", params);
		} else {
			return super.getCompoundPaddingRight();
		}
	}

	public int getCompoundPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingStart", params);
		} else {
			return super.getCompoundPaddingStart();
		}
	}

	public int getCompoundPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingTop", params);
		} else {
			return super.getCompoundPaddingTop();
		}
	}

	public java.lang.CharSequence getContentDescription() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 2)) > 0) { 
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
		if ((__ho11 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ContextMenu.ContextMenuInfo)com.tns.Platform.callJSMethod(this, "getContextMenuInfo", params);
		} else {
			return super.getContextMenuInfo();
		}
	}

	public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ActionMode.Callback)com.tns.Platform.callJSMethod(this, "getCustomSelectionActionModeCallback", params);
		} else {
			return super.getCustomSelectionActionModeCallback();
		}
	}

	protected boolean getDefaultEditable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getDefaultEditable", params);
		} else {
			return super.getDefaultEditable();
		}
	}

	protected android.text.method.MovementMethod getDefaultMovementMethod() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.method.MovementMethod)com.tns.Platform.callJSMethod(this, "getDefaultMovementMethod", params);
		} else {
			return super.getDefaultMovementMethod();
		}
	}

	public android.view.Display getDisplay() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho11 & (1 << 7)) > 0) { 
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
		if ((__ho12 & (1 << 0)) > 0) { 
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
		if ((__ho12 & (1 << 0)) > 0) { 
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
		if ((__ho12 & (1 << 1)) > 0) { 
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
		if ((__ho12 & (1 << 2)) > 0) { 
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
		if ((__ho12 & (1 << 3)) > 0) { 
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
		if ((__ho12 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Long)com.tns.Platform.callJSMethod(this, "getDrawingTime", params);
		} else {
			return super.getDrawingTime();
		}
	}

	public android.text.Editable getEditableText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.Editable)com.tns.Platform.callJSMethod(this, "getEditableText", params);
		} else {
			return super.getEditableText();
		}
	}

	public android.text.TextUtils.TruncateAt getEllipsize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.TextUtils.TruncateAt)com.tns.Platform.callJSMethod(this, "getEllipsize", params);
		} else {
			return super.getEllipsize();
		}
	}

	public java.lang.CharSequence getError() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho12 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getError", params);
		} else {
			return super.getError();
		}
	}

	public int getExtendedPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getExtendedPaddingBottom", params);
		} else {
			return super.getExtendedPaddingBottom();
		}
	}

	public int getExtendedPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getExtendedPaddingTop", params);
		} else {
			return super.getExtendedPaddingTop();
		}
	}

	public boolean getFilterTouchesWhenObscured() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFilterTouchesWhenObscured", params);
		} else {
			return super.getFilterTouchesWhenObscured();
		}
	}

	public android.text.InputFilter[] getFilters() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.InputFilter[])com.tns.Platform.callJSMethod(this, "getFilters", params);
		} else {
			return super.getFilters();
		}
	}

	public boolean getFitsSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 4)) > 0) { 
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
		if ((__ho13 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.util.ArrayList)com.tns.Platform.callJSMethod(this, "getFocusables", params);
		} else {
			return super.getFocusables(param_0);
		}
	}

	public void getFocusedRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getFocusedRect", params);
		} else {
			super.getFocusedRect(param_0);
		}
	}

	public boolean getFreezesText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho13 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFreezesText", params);
		} else {
			return super.getFreezesText();
		}
	}

	public boolean getGlobalVisibleRect(android.graphics.Rect param_0, android.graphics.Point param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getGlobalVisibleRect", params);
		} else {
			return super.getGlobalVisibleRect(param_0, param_1);
		}
	}

	public int getGravity() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getGravity", params);
		} else {
			return super.getGravity();
		}
	}

	public android.os.Handler getHandler() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (android.os.Handler)com.tns.Platform.callJSMethod(this, "getHandler", params);
		} else {
			return super.getHandler();
		}
	}

	public int getHighlightColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHighlightColor", params);
		} else {
			return super.getHighlightColor();
		}
	}

	public java.lang.CharSequence getHint() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getHint", params);
		} else {
			return super.getHint();
		}
	}

	public void getHitRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho14 & (1 << 5)) > 0) { 
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
		if ((__ho14 & (1 << 6)) > 0) { 
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
		if ((__ho14 & (1 << 7)) > 0) { 
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
		if ((__ho15 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getId", params);
		} else {
			return super.getId();
		}
	}

	public int getImeActionId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImeActionId", params);
		} else {
			return super.getImeActionId();
		}
	}

	public java.lang.CharSequence getImeActionLabel() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getImeActionLabel", params);
		} else {
			return super.getImeActionLabel();
		}
	}

	public int getImeOptions() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImeOptions", params);
		} else {
			return super.getImeOptions();
		}
	}

	public int getImportantForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImportantForAccessibility", params);
		} else {
			return super.getImportantForAccessibility();
		}
	}

	public boolean getIncludeFontPadding() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getIncludeFontPadding", params);
		} else {
			return super.getIncludeFontPadding();
		}
	}

	public android.os.Bundle getInputExtras(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.os.Bundle)com.tns.Platform.callJSMethod(this, "getInputExtras", params);
		} else {
			return super.getInputExtras(param_0);
		}
	}

	public int getInputType() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho15 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getInputType", params);
		} else {
			return super.getInputType();
		}
	}

	public boolean getKeepScreenOn() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 0)) > 0) { 
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
		if ((__ho16 & (1 << 1)) > 0) { 
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
		if ((__ho16 & (1 << 2)) > 0) { 
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
		if ((__ho16 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLayerType", params);
		} else {
			return super.getLayerType();
		}
	}

	public int getLayoutDirection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 4)) > 0) { 
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
		if ((__ho16 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewGroup.LayoutParams)com.tns.Platform.callJSMethod(this, "getLayoutParams", params);
		} else {
			return super.getLayoutParams();
		}
	}

	protected float getLeftFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho16 & (1 << 6)) > 0) { 
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
		if ((__ho16 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLeftPaddingOffset", params);
		} else {
			return super.getLeftPaddingOffset();
		}
	}

	public int getLineBounds(int param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineBounds", params);
		} else {
			return super.getLineBounds(param_0, param_1);
		}
	}

	public int getLineCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineCount", params);
		} else {
			return super.getLineCount();
		}
	}

	public int getLineHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineHeight", params);
		} else {
			return super.getLineHeight();
		}
	}

	public float getLineSpacingExtra() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLineSpacingExtra", params);
		} else {
			return super.getLineSpacingExtra();
		}
	}

	public float getLineSpacingMultiplier() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLineSpacingMultiplier", params);
		} else {
			return super.getLineSpacingMultiplier();
		}
	}

	public void getLocationInWindow(int[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 5)) > 0) { 
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
		if ((__ho17 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getLocationOnScreen", params);
		} else {
			super.getLocationOnScreen(param_0);
		}
	}

	public int getMarqueeRepeatLimit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho17 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMarqueeRepeatLimit", params);
		} else {
			return super.getMarqueeRepeatLimit();
		}
	}

	public android.graphics.Matrix getMatrix() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.Matrix)com.tns.Platform.callJSMethod(this, "getMatrix", params);
		} else {
			return super.getMatrix();
		}
	}

	public int getMaxEms() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxEms", params);
		} else {
			return super.getMaxEms();
		}
	}

	public int getMaxHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxHeight", params);
		} else {
			return super.getMaxHeight();
		}
	}

	public int getMaxLines() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxLines", params);
		} else {
			return super.getMaxLines();
		}
	}

	public int getMaxWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxWidth", params);
		} else {
			return super.getMaxWidth();
		}
	}

	public int getMinEms() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinEms", params);
		} else {
			return super.getMinEms();
		}
	}

	public int getMinHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinHeight", params);
		} else {
			return super.getMinHeight();
		}
	}

	public int getMinLines() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho18 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinLines", params);
		} else {
			return super.getMinLines();
		}
	}

	public int getMinWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinWidth", params);
		} else {
			return super.getMinWidth();
		}
	}

	public int getMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 1)) > 0) { 
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
		if ((__ho19 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinimumWidth", params);
		} else {
			return super.getMinimumWidth();
		}
	}

	public int getNextFocusDownId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho19 & (1 << 3)) > 0) { 
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
		if ((__ho19 & (1 << 4)) > 0) { 
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
		if ((__ho19 & (1 << 5)) > 0) { 
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
		if ((__ho19 & (1 << 6)) > 0) { 
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
		if ((__ho19 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusUpId", params);
		} else {
			return super.getNextFocusUpId();
		}
	}

	public int getOffsetForPosition(float param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "getOffsetForPosition", params);
		} else {
			return super.getOffsetForPosition(param_0, param_1);
		}
	}

	public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho20 & (1 << 1)) > 0) { 
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
		if ((__ho20 & (1 << 2)) > 0) { 
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
		if ((__ho20 & (1 << 3)) > 0) { 
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
		if ((__ho20 & (1 << 4)) > 0) { 
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
		if ((__ho20 & (1 << 5)) > 0) { 
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
		if ((__ho20 & (1 << 6)) > 0) { 
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
		if ((__ho20 & (1 << 7)) > 0) { 
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
		if ((__ho21 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingTop", params);
		} else {
			return super.getPaddingTop();
		}
	}

	public android.text.TextPaint getPaint() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.TextPaint)com.tns.Platform.callJSMethod(this, "getPaint", params);
		} else {
			return super.getPaint();
		}
	}

	public int getPaintFlags() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaintFlags", params);
		} else {
			return super.getPaintFlags();
		}
	}

	public android.view.ViewParent getParentForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (android.view.ViewParent)com.tns.Platform.callJSMethod(this, "getParentForAccessibility", params);
		} else {
			return super.getParentForAccessibility();
		}
	}

	public float getPivotX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 4)) > 0) { 
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
		if ((__ho21 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getPivotY", params);
		} else {
			return super.getPivotY();
		}
	}

	public java.lang.String getPrivateImeOptions() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "getPrivateImeOptions", params);
		} else {
			return super.getPrivateImeOptions();
		}
	}

	public android.content.res.Resources getResources() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho21 & (1 << 7)) > 0) { 
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
		if ((__ho22 & (1 << 0)) > 0) { 
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
		if ((__ho22 & (1 << 1)) > 0) { 
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
		if ((__ho22 & (1 << 2)) > 0) { 
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
		if ((__ho22 & (1 << 3)) > 0) { 
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
		if ((__ho22 & (1 << 4)) > 0) { 
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
		if ((__ho22 & (1 << 5)) > 0) { 
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
		if ((__ho22 & (1 << 6)) > 0) { 
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
		if ((__ho22 & (1 << 7)) > 0) { 
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
		if ((__ho23 & (1 << 0)) > 0) { 
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
		if ((__ho23 & (1 << 1)) > 0) { 
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
		if ((__ho23 & (1 << 2)) > 0) { 
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
		if ((__ho23 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarStyle", params);
		} else {
			return super.getScrollBarStyle();
		}
	}

	public int getSelectionEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSelectionEnd", params);
		} else {
			return super.getSelectionEnd();
		}
	}

	public int getSelectionStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSelectionStart", params);
		} else {
			return super.getSelectionStart();
		}
	}

	public int getShadowColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getShadowColor", params);
		} else {
			return super.getShadowColor();
		}
	}

	public float getShadowDx() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho23 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowDx", params);
		} else {
			return super.getShadowDx();
		}
	}

	public float getShadowDy() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowDy", params);
		} else {
			return super.getShadowDy();
		}
	}

	public float getShadowRadius() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowRadius", params);
		} else {
			return super.getShadowRadius();
		}
	}

	public int getSolidColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSolidColor", params);
		} else {
			return super.getSolidColor();
		}
	}

	protected int getSuggestedMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 3)) > 0) { 
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
		if ((__ho24 & (1 << 4)) > 0) { 
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
		if ((__ho24 & (1 << 5)) > 0) { 
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
		if ((__ho24 & (1 << 6)) > 0) { 
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
		if ((__ho24 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getTag", params);
		} else {
			return super.getTag();
		}
	}

	public java.lang.CharSequence getText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho24 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getText", params);
		} else {
			return super.getText();
		}
	}

	public int getTextAlignment() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 0)) > 0) { 
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
		if ((__ho25 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTextDirection", params);
		} else {
			return super.getTextDirection();
		}
	}

	public java.util.Locale getTextLocale() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (java.util.Locale)com.tns.Platform.callJSMethod(this, "getTextLocale", params);
		} else {
			return super.getTextLocale();
		}
	}

	public float getTextScaleX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTextScaleX", params);
		} else {
			return super.getTextScaleX();
		}
	}

	public float getTextSize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTextSize", params);
		} else {
			return super.getTextSize();
		}
	}

	protected float getTopFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 5)) > 0) { 
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
		if ((__ho25 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTopPaddingOffset", params);
		} else {
			return super.getTopPaddingOffset();
		}
	}

	public int getTotalPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho25 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingBottom", params);
		} else {
			return super.getTotalPaddingBottom();
		}
	}

	public int getTotalPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingEnd", params);
		} else {
			return super.getTotalPaddingEnd();
		}
	}

	public int getTotalPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingLeft", params);
		} else {
			return super.getTotalPaddingLeft();
		}
	}

	public int getTotalPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingRight", params);
		} else {
			return super.getTotalPaddingRight();
		}
	}

	public int getTotalPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingStart", params);
		} else {
			return super.getTotalPaddingStart();
		}
	}

	public int getTotalPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingTop", params);
		} else {
			return super.getTotalPaddingTop();
		}
	}

	public android.view.TouchDelegate getTouchDelegate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho26 & (1 << 5)) > 0) { 
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
		if ((__ho26 & (1 << 6)) > 0) { 
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
		if ((__ho26 & (1 << 7)) > 0) { 
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
		if ((__ho27 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTranslationY", params);
		} else {
			return super.getTranslationY();
		}
	}

	public android.graphics.Typeface getTypeface() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (android.graphics.Typeface)com.tns.Platform.callJSMethod(this, "getTypeface", params);
		} else {
			return super.getTypeface();
		}
	}

	public android.text.style.URLSpan[] getUrls() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (android.text.style.URLSpan[])com.tns.Platform.callJSMethod(this, "getUrls", params);
		} else {
			return super.getUrls();
		}
	}

	public int getVerticalFadingEdgeLength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho27 & (1 << 3)) > 0) { 
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
		if ((__ho27 & (1 << 4)) > 0) { 
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
		if ((__ho27 & (1 << 5)) > 0) { 
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
		if ((__ho27 & (1 << 6)) > 0) { 
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
		if ((__ho27 & (1 << 7)) > 0) { 
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
		if ((__ho28 & (1 << 0)) > 0) { 
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
		if ((__ho28 & (1 << 1)) > 0) { 
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
		if ((__ho28 & (1 << 2)) > 0) { 
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
		if ((__ho28 & (1 << 3)) > 0) { 
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
		if ((__ho28 & (1 << 4)) > 0) { 
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
		if ((__ho28 & (1 << 5)) > 0) { 
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
		if ((__ho28 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getY", params);
		} else {
			return super.getY();
		}
	}

	public boolean hasFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho28 & (1 << 7)) > 0) { 
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
		if ((__ho29 & (1 << 0)) > 0) { 
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
		if ((__ho29 & (1 << 1)) > 0) { 
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
		if ((__ho29 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasOverlappingRendering", params);
		} else {
			return super.hasOverlappingRendering();
		}
	}

	public boolean hasSelection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasSelection", params);
		} else {
			return super.hasSelection();
		}
	}

	public boolean hasTransientState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 4)) > 0) { 
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
		if ((__ho29 & (1 << 5)) > 0) { 
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
		if ((__ho29 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "hashCode", params);
		} else {
			return super.hashCode();
		}
	}

	protected void initializeFadingEdge(android.content.res.TypedArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho29 & (1 << 7)) > 0) { 
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
		if ((__ho30 & (1 << 0)) > 0) { 
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
		if ((__ho30 & (1 << 1)) > 0) { 
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
		if ((__ho30 & (1 << 1)) > 0) { 
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
		if ((__ho30 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
		} else {
			super.invalidate();
		}
	}

	public void invalidateDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 2)) > 0) { 
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
		if ((__ho30 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isActivated", params);
		} else {
			return super.isActivated();
		}
	}

	public boolean isClickable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isClickable", params);
		} else {
			return super.isClickable();
		}
	}

	public boolean isCursorVisible() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isCursorVisible", params);
		} else {
			return super.isCursorVisible();
		}
	}

	public boolean isDirty() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho30 & (1 << 6)) > 0) { 
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
		if ((__ho30 & (1 << 7)) > 0) { 
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
		if ((__ho31 & (1 << 0)) > 0) { 
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
		if ((__ho31 & (1 << 1)) > 0) { 
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
		if ((__ho31 & (1 << 2)) > 0) { 
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
		if ((__ho31 & (1 << 3)) > 0) { 
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
		if ((__ho31 & (1 << 4)) > 0) { 
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
		if ((__ho31 & (1 << 5)) > 0) { 
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
		if ((__ho31 & (1 << 6)) > 0) { 
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
		if ((__ho31 & (1 << 7)) > 0) { 
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
		if ((__ho32 & (1 << 0)) > 0) { 
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
		if ((__ho32 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInTouchMode", params);
		} else {
			return super.isInTouchMode();
		}
	}

	public boolean isInputMethodTarget() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInputMethodTarget", params);
		} else {
			return super.isInputMethodTarget();
		}
	}

	public boolean isLayoutRequested() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 3)) > 0) { 
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
		if ((__ho32 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isLongClickable", params);
		} else {
			return super.isLongClickable();
		}
	}

	public boolean isOpaque() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho32 & (1 << 5)) > 0) { 
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
		if ((__ho32 & (1 << 6)) > 0) { 
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
		if ((__ho32 & (1 << 7)) > 0) { 
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
		if ((__ho33 & (1 << 0)) > 0) { 
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
		if ((__ho33 & (1 << 1)) > 0) { 
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
		if ((__ho33 & (1 << 2)) > 0) { 
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
		if ((__ho33 & (1 << 3)) > 0) { 
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
		if ((__ho33 & (1 << 4)) > 0) { 
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
		if ((__ho33 & (1 << 5)) > 0) { 
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
		if ((__ho33 & (1 << 6)) > 0) { 
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
		if ((__ho33 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSoundEffectsEnabled", params);
		} else {
			return super.isSoundEffectsEnabled();
		}
	}

	public boolean isSuggestionsEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSuggestionsEnabled", params);
		} else {
			return super.isSuggestionsEnabled();
		}
	}

	public boolean isTextSelectable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 1)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isTextSelectable", params);
		} else {
			return super.isTextSelectable();
		}
	}

	public boolean isVerticalFadingEdgeEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 2)) > 0) { 
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
		if ((__ho34 & (1 << 3)) > 0) { 
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
		if ((__ho34 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "jumpDrawablesToCurrentState", params);
		} else {
			super.jumpDrawablesToCurrentState();
		}
	}

	public void layout(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "layout", params);
		} else {
			super.layout(param_0, param_1, param_2, param_3);
		}
	}

	public int length() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "length", params);
		} else {
			return super.length();
		}
	}

	public boolean moveCursorToVisibleOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho34 & (1 << 7)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "moveCursorToVisibleOffset", params);
		} else {
			return super.moveCursorToVisibleOffset();
		}
	}

	public void offsetLeftAndRight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 0)) > 0) { 
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
		if ((__ho35 & (1 << 1)) > 0) { 
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
		if ((__ho35 & (1 << 2)) > 0) { 
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
		if ((__ho35 & (1 << 3)) > 0) { 
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
		if ((__ho35 & (1 << 4)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAttachedToWindow", params);
		} else {
			super.onAttachedToWindow();
		}
	}

	public void onBeginBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onBeginBatchEdit", params);
		} else {
			super.onBeginBatchEdit();
		}
	}

	public boolean onCheckIsTextEditor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onCheckIsTextEditor", params);
		} else {
			return super.onCheckIsTextEditor();
		}
	}

	public void onCommitCompletion(android.view.inputmethod.CompletionInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho35 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCommitCompletion", params);
		} else {
			super.onCommitCompletion(param_0);
		}
	}

	public void onCommitCorrection(android.view.inputmethod.CorrectionInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCommitCorrection", params);
		} else {
			super.onCommitCorrection(param_0);
		}
	}

	protected void onConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho36 & (1 << 1)) > 0) { 
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
		if ((__ho36 & (1 << 2)) > 0) { 
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
		if ((__ho36 & (1 << 3)) > 0) { 
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
		if ((__ho36 & (1 << 4)) > 0) { 
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
		if ((__ho36 & (1 << 5)) > 0) { 
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
		if ((__ho36 & (1 << 6)) > 0) { 
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
		if ((__ho36 & (1 << 7)) > 0) { 
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
		if ((__ho37 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onDraw", params);
		} else {
			super.onDraw(param_0);
		}
	}

	public void onEditorAction(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onEditorAction", params);
		} else {
			super.onEditorAction(param_0);
		}
	}

	public void onEndBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 2)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onEndBatchEdit", params);
		} else {
			super.onEndBatchEdit();
		}
	}

	public boolean onFilterTouchEventForSecurity(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho37 & (1 << 3)) > 0) { 
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
		if ((__ho37 & (1 << 4)) > 0) { 
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
		if ((__ho37 & (1 << 5)) > 0) { 
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
		if ((__ho37 & (1 << 6)) > 0) { 
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
		if ((__ho37 & (1 << 7)) > 0) { 
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
		if ((__ho38 & (1 << 0)) > 0) { 
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
		if ((__ho38 & (1 << 1)) > 0) { 
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
		if ((__ho38 & (1 << 2)) > 0) { 
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
		if ((__ho38 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onInitializeAccessibilityNodeInfo", params);
		} else {
			super.onInitializeAccessibilityNodeInfo(param_0);
		}
	}

	public boolean onKeyDown(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho38 & (1 << 4)) > 0) { 
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
		if ((__ho38 & (1 << 5)) > 0) { 
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
		if ((__ho38 & (1 << 6)) > 0) { 
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
		if ((__ho38 & (1 << 7)) > 0) { 
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
		if ((__ho39 & (1 << 0)) > 0) { 
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
		if ((__ho39 & (1 << 1)) > 0) { 
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
		if ((__ho39 & (1 << 2)) > 0) { 
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
		if ((__ho39 & (1 << 3)) > 0) { 
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
		if ((__ho39 & (1 << 4)) > 0) { 
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
		if ((__ho39 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onPopulateAccessibilityEvent", params);
		} else {
			super.onPopulateAccessibilityEvent(param_0);
		}
	}

	public boolean onPreDraw() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onPreDraw", params);
		} else {
			return super.onPreDraw();
		}
	}

	public boolean onPrivateIMECommand(java.lang.String param_0, android.os.Bundle param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho39 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onPrivateIMECommand", params);
		} else {
			return super.onPrivateIMECommand(param_0, param_1);
		}
	}

	public void onRestoreInstanceState(android.os.Parcelable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 0)) > 0) { 
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
		if ((__ho40 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onRtlPropertiesChanged", params);
		} else {
			super.onRtlPropertiesChanged(param_0);
		}
	}

	public android.os.Parcelable onSaveInstanceState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 2)) > 0) { 
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
		if ((__ho40 & (1 << 3)) > 0) { 
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
		if ((__ho40 & (1 << 4)) > 0) { 
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

	protected void onSelectionChanged(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onSelectionChanged", params);
		} else {
			super.onSelectionChanged(param_0, param_1);
		}
	}

	protected boolean onSetAlpha(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho40 & (1 << 6)) > 0) { 
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
		if ((__ho40 & (1 << 7)) > 0) { 
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
		if ((__ho41 & (1 << 0)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onStartTemporaryDetach", params);
		} else {
			super.onStartTemporaryDetach();
		}
	}

	protected void onTextChanged(java.lang.CharSequence param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onTextChanged", params);
		} else {
			super.onTextChanged(param_0, param_1, param_2, param_3);
		}
	}

	public boolean onTextContextMenuItem(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTextContextMenuItem", params);
		} else {
			return super.onTextContextMenuItem(param_0);
		}
	}

	public boolean onTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho41 & (1 << 3)) > 0) { 
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
		if ((__ho41 & (1 << 4)) > 0) { 
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
		if ((__ho41 & (1 << 5)) > 0) { 
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
		if ((__ho41 & (1 << 6)) > 0) { 
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
		if ((__ho41 & (1 << 7)) > 0) { 
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
		if ((__ho42 & (1 << 0)) > 0) { 
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
		if ((__ho42 & (1 << 1)) > 0) { 
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
		if ((__ho42 & (1 << 2)) > 0) { 
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
		if ((__ho42 & (1 << 3)) > 0) { 
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
		if ((__ho42 & (1 << 4)) > 0) { 
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
		if ((__ho42 & (1 << 4)) > 0) { 
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
		if ((__ho42 & (1 << 5)) > 0) { 
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
		if ((__ho42 & (1 << 6)) > 0) { 
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
		if ((__ho42 & (1 << 7)) > 0) { 
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
		if ((__ho43 & (1 << 0)) > 0) { 
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
		if ((__ho43 & (1 << 1)) > 0) { 
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
		if ((__ho43 & (1 << 1)) > 0) { 
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
		if ((__ho43 & (1 << 2)) > 0) { 
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
		if ((__ho43 & (1 << 2)) > 0) { 
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
		if ((__ho43 & (1 << 3)) > 0) { 
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
		if ((__ho43 & (1 << 3)) > 0) { 
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
		if ((__ho43 & (1 << 4)) > 0) { 
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
		if ((__ho43 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "postOnAnimationDelayed", params);
		} else {
			super.postOnAnimationDelayed(param_0, param_1);
		}
	}

	public void refreshDrawableState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 6)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "refreshDrawableState", params);
		} else {
			super.refreshDrawableState();
		}
	}

	public boolean removeCallbacks(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho43 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "removeCallbacks", params);
		} else {
			return super.removeCallbacks(param_0);
		}
	}

	public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 0)) > 0) { 
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
		if ((__ho44 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeOnLayoutChangeListener", params);
		} else {
			super.removeOnLayoutChangeListener(param_0);
		}
	}

	public void removeTextChangedListener(android.text.TextWatcher param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeTextChangedListener", params);
		} else {
			super.removeTextChangedListener(param_0);
		}
	}

	public void requestFitSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 3)) > 0) { 
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
		if ((__ho44 & (1 << 4)) > 0) { 
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
		if ((__ho44 & (1 << 5)) > 0) { 
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
		if ((__ho44 & (1 << 6)) > 0) { 
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
		if ((__ho44 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestRectangleOnScreen", params);
		} else {
			return super.requestRectangleOnScreen(param_0, param_1);
		}
	}

	public void restoreHierarchyState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho44 & (1 << 7)) > 0) { 
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
		if ((__ho45 & (1 << 0)) > 0) { 
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
		if ((__ho45 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "scheduleDrawable", params);
		} else {
			super.scheduleDrawable(param_0, param_1, param_2);
		}
	}

	public void scrollBy(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho45 & (1 << 2)) > 0) { 
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
		if ((__ho45 & (1 << 3)) > 0) { 
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
		if ((__ho45 & (1 << 4)) > 0) { 
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
		if ((__ho45 & (1 << 5)) > 0) { 
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
		if ((__ho45 & (1 << 6)) > 0) { 
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
		if ((__ho45 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setActivated", params);
		} else {
			super.setActivated(param_0);
		}
	}

	public void setAllCaps(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAllCaps", params);
		} else {
			super.setAllCaps(param_0);
		}
	}

	public void setAlpha(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAlpha", params);
		} else {
			super.setAlpha(param_0);
		}
	}

	public void setAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAnimation", params);
		} else {
			super.setAnimation(param_0);
		}
	}

	public void setBackground(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 3)) > 0) { 
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
		if ((__ho46 & (1 << 4)) > 0) { 
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
		if ((__ho46 & (1 << 5)) > 0) { 
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
		if ((__ho46 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundResource", params);
		} else {
			super.setBackgroundResource(param_0);
		}
	}

	public void setCameraDistance(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho46 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCameraDistance", params);
		} else {
			super.setCameraDistance(param_0);
		}
	}

	public void setClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setClickable", params);
		} else {
			super.setClickable(param_0);
		}
	}

	public void setCompoundDrawablePadding(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablePadding", params);
		} else {
			super.setCompoundDrawablePadding(param_0);
		}
	}

	public void setCompoundDrawables(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawables", params);
		} else {
			super.setCompoundDrawables(param_0, param_1, param_2, param_3);
		}
	}

	public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelative", params);
		} else {
			super.setCompoundDrawablesRelative(param_0, param_1, param_2, param_3);
		}
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelativeWithIntrinsicBounds", params);
		} else {
			super.setCompoundDrawablesRelativeWithIntrinsicBounds(param_0, param_1, param_2, param_3);
		}
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelativeWithIntrinsicBounds", params);
		} else {
			super.setCompoundDrawablesRelativeWithIntrinsicBounds(param_0, param_1, param_2, param_3);
		}
	}

	public void setCompoundDrawablesWithIntrinsicBounds(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesWithIntrinsicBounds", params);
		} else {
			super.setCompoundDrawablesWithIntrinsicBounds(param_0, param_1, param_2, param_3);
		}
	}

	public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesWithIntrinsicBounds", params);
		} else {
			super.setCompoundDrawablesWithIntrinsicBounds(param_0, param_1, param_2, param_3);
		}
	}

	public void setContentDescription(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setContentDescription", params);
		} else {
			super.setContentDescription(param_0);
		}
	}

	public void setCursorVisible(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho47 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCursorVisible", params);
		} else {
			super.setCursorVisible(param_0);
		}
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCustomSelectionActionModeCallback", params);
		} else {
			super.setCustomSelectionActionModeCallback(param_0);
		}
	}

	public void setDrawingCacheBackgroundColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 1)) > 0) { 
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
		if ((__ho48 & (1 << 2)) > 0) { 
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
		if ((__ho48 & (1 << 3)) > 0) { 
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
		if ((__ho48 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDuplicateParentStateEnabled", params);
		} else {
			super.setDuplicateParentStateEnabled(param_0);
		}
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEllipsize", params);
		} else {
			super.setEllipsize(param_0);
		}
	}

	public void setEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEms", params);
		} else {
			super.setEms(param_0);
		}
	}

	public void setEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho48 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEnabled", params);
		} else {
			super.setEnabled(param_0);
		}
	}

	public void setError(java.lang.CharSequence param_0, android.graphics.drawable.Drawable param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setError", params);
		} else {
			super.setError(param_0, param_1);
		}
	}

	public void setError(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setError", params);
		} else {
			super.setError(param_0);
		}
	}

	public void setExtractedText(android.view.inputmethod.ExtractedText param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setExtractedText", params);
		} else {
			super.setExtractedText(param_0);
		}
	}

	public void setFadingEdgeLength(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 2)) > 0) { 
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
		if ((__ho49 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFilterTouchesWhenObscured", params);
		} else {
			super.setFilterTouchesWhenObscured(param_0);
		}
	}

	public void setFilters(android.text.InputFilter[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFilters", params);
		} else {
			super.setFilters(param_0);
		}
	}

	public void setFitsSystemWindows(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho49 & (1 << 5)) > 0) { 
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
		if ((__ho49 & (1 << 6)) > 0) { 
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
		if ((__ho49 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFocusableInTouchMode", params);
		} else {
			super.setFocusableInTouchMode(param_0);
		}
	}

	protected boolean setFrame(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			return (Boolean)com.tns.Platform.callJSMethod(this, "setFrame", params);
		} else {
			return super.setFrame(param_0, param_1, param_2, param_3);
		}
	}

	public void setFreezesText(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFreezesText", params);
		} else {
			super.setFreezesText(param_0);
		}
	}

	public void setGravity(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setGravity", params);
		} else {
			super.setGravity(param_0);
		}
	}

	public void setHapticFeedbackEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 3)) > 0) { 
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
		if ((__ho50 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHasTransientState", params);
		} else {
			super.setHasTransientState(param_0);
		}
	}

	public void setHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHeight", params);
		} else {
			super.setHeight(param_0);
		}
	}

	public void setHighlightColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHighlightColor", params);
		} else {
			super.setHighlightColor(param_0);
		}
	}

	public void setHorizontalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho50 & (1 << 7)) > 0) { 
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
		if ((__ho51 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontalScrollBarEnabled", params);
		} else {
			super.setHorizontalScrollBarEnabled(param_0);
		}
	}

	public void setHorizontallyScrolling(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontallyScrolling", params);
		} else {
			super.setHorizontallyScrolling(param_0);
		}
	}

	public void setHovered(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 2)) > 0) { 
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
		if ((__ho51 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setId", params);
		} else {
			super.setId(param_0);
		}
	}

	public void setImeActionLabel(java.lang.CharSequence param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setImeActionLabel", params);
		} else {
			super.setImeActionLabel(param_0, param_1);
		}
	}

	public void setImeOptions(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setImeOptions", params);
		} else {
			super.setImeOptions(param_0);
		}
	}

	public void setImportantForAccessibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setImportantForAccessibility", params);
		} else {
			super.setImportantForAccessibility(param_0);
		}
	}

	public void setIncludeFontPadding(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho51 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setIncludeFontPadding", params);
		} else {
			super.setIncludeFontPadding(param_0);
		}
	}

	public void setInputExtras(int param_0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setInputExtras", params);
		} else {
			super.setInputExtras(param_0);
		}
	}

	public void setInputType(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setInputType", params);
		} else {
			super.setInputType(param_0);
		}
	}

	public void setKeepScreenOn(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setKeepScreenOn", params);
		} else {
			super.setKeepScreenOn(param_0);
		}
	}

	public void setKeyListener(android.text.method.KeyListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setKeyListener", params);
		} else {
			super.setKeyListener(param_0);
		}
	}

	public void setLabelFor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 4)) > 0) { 
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
		if ((__ho52 & (1 << 5)) > 0) { 
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
		if ((__ho52 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setLayerType", params);
		} else {
			super.setLayerType(param_0, param_1);
		}
	}

	public void setLayoutDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho52 & (1 << 7)) > 0) { 
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
		if ((__ho53 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutParams", params);
		} else {
			super.setLayoutParams(param_0);
		}
	}

	public void setLineSpacing(float param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setLineSpacing", params);
		} else {
			super.setLineSpacing(param_0, param_1);
		}
	}

	public void setLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLines", params);
		} else {
			super.setLines(param_0);
		}
	}

	public void setLongClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLongClickable", params);
		} else {
			super.setLongClickable(param_0);
		}
	}

	public void setMarqueeRepeatLimit(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMarqueeRepeatLimit", params);
		} else {
			super.setMarqueeRepeatLimit(param_0);
		}
	}

	public void setMaxEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxEms", params);
		} else {
			super.setMaxEms(param_0);
		}
	}

	public void setMaxHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxHeight", params);
		} else {
			super.setMaxHeight(param_0);
		}
	}

	public void setMaxLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho53 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxLines", params);
		} else {
			super.setMaxLines(param_0);
		}
	}

	public void setMaxWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxWidth", params);
		} else {
			super.setMaxWidth(param_0);
		}
	}

	public void setMinEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinEms", params);
		} else {
			super.setMinEms(param_0);
		}
	}

	public void setMinHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinHeight", params);
		} else {
			super.setMinHeight(param_0);
		}
	}

	public void setMinLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinLines", params);
		} else {
			super.setMinLines(param_0);
		}
	}

	public void setMinWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinWidth", params);
		} else {
			super.setMinWidth(param_0);
		}
	}

	public void setMinimumHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 5)) > 0) { 
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
		if ((__ho54 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinimumWidth", params);
		} else {
			super.setMinimumWidth(param_0);
		}
	}

	public void setNextFocusDownId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho54 & (1 << 7)) > 0) { 
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
		if ((__ho55 & (1 << 0)) > 0) { 
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
		if ((__ho55 & (1 << 1)) > 0) { 
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
		if ((__ho55 & (1 << 2)) > 0) { 
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
		if ((__ho55 & (1 << 3)) > 0) { 
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
		if ((__ho55 & (1 << 4)) > 0) { 
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
		if ((__ho55 & (1 << 5)) > 0) { 
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
		if ((__ho55 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnDragListener", params);
		} else {
			super.setOnDragListener(param_0);
		}
	}

	public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho55 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnEditorActionListener", params);
		} else {
			super.setOnEditorActionListener(param_0);
		}
	}

	public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 0)) > 0) { 
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
		if ((__ho56 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnGenericMotionListener", params);
		} else {
			super.setOnGenericMotionListener(param_0);
		}
	}

	public void setOnHoverListener(android.view.View.OnHoverListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho56 & (1 << 2)) > 0) { 
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
		if ((__ho56 & (1 << 3)) > 0) { 
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
		if ((__ho56 & (1 << 4)) > 0) { 
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
		if ((__ho56 & (1 << 5)) > 0) { 
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
		if ((__ho56 & (1 << 6)) > 0) { 
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
		if ((__ho56 & (1 << 7)) > 0) { 
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
		if ((__ho57 & (1 << 0)) > 0) { 
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
		if ((__ho57 & (1 << 1)) > 0) { 
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

	public void setPaintFlags(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPaintFlags", params);
		} else {
			super.setPaintFlags(param_0);
		}
	}

	public void setPivotX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 3)) > 0) { 
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
		if ((__ho57 & (1 << 4)) > 0) { 
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
		if ((__ho57 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPressed", params);
		} else {
			super.setPressed(param_0);
		}
	}

	public void setPrivateImeOptions(java.lang.String param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPrivateImeOptions", params);
		} else {
			super.setPrivateImeOptions(param_0);
		}
	}

	public void setRawInputType(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho57 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRawInputType", params);
		} else {
			super.setRawInputType(param_0);
		}
	}

	public void setRotation(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho58 & (1 << 0)) > 0) { 
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
		if ((__ho58 & (1 << 1)) > 0) { 
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
		if ((__ho58 & (1 << 2)) > 0) { 
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
		if ((__ho58 & (1 << 3)) > 0) { 
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
		if ((__ho58 & (1 << 4)) > 0) { 
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
		if ((__ho58 & (1 << 5)) > 0) { 
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
		if ((__ho58 & (1 << 6)) > 0) { 
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
		if ((__ho58 & (1 << 7)) > 0) { 
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
		if ((__ho59 & (1 << 0)) > 0) { 
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
		if ((__ho59 & (1 << 1)) > 0) { 
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
		if ((__ho59 & (1 << 2)) > 0) { 
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
		if ((__ho59 & (1 << 3)) > 0) { 
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
		if ((__ho59 & (1 << 4)) > 0) { 
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
		if ((__ho59 & (1 << 5)) > 0) { 
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
		if ((__ho59 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollbarFadingEnabled", params);
		} else {
			super.setScrollbarFadingEnabled(param_0);
		}
	}

	public void setScroller(android.widget.Scroller param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho59 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScroller", params);
		} else {
			super.setScroller(param_0);
		}
	}

	public void setSelectAllOnFocus(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSelectAllOnFocus", params);
		} else {
			super.setSelectAllOnFocus(param_0);
		}
	}

	public void setSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSelected", params);
		} else {
			super.setSelected(param_0);
		}
	}

	public void setShadowLayer(float param_0, float param_1, float param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setShadowLayer", params);
		} else {
			super.setShadowLayer(param_0, param_1, param_2, param_3);
		}
	}

	public void setSingleLine(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSingleLine", params);
		} else {
			super.setSingleLine(param_0);
		}
	}

	public void setSingleLine() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 3)) > 0) { 
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "setSingleLine", params);
		} else {
			super.setSingleLine();
		}
	}

	public void setSoundEffectsEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSoundEffectsEnabled", params);
		} else {
			super.setSoundEffectsEnabled(param_0);
		}
	}

	public void setSystemUiVisibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 5)) > 0) { 
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
		if ((__ho60 & (1 << 6)) > 0) { 
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
		if ((__ho60 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTag", params);
		} else {
			super.setTag(param_0);
		}
	}

	public void setText(java.lang.CharSequence param_0, android.widget.TextView.BufferType param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho60 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setText", params);
		} else {
			super.setText(param_0, param_1);
		}
	}

	public void setTextAlignment(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextAlignment", params);
		} else {
			super.setTextAlignment(param_0);
		}
	}

	public void setTextAppearance(android.content.Context param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTextAppearance", params);
		} else {
			super.setTextAppearance(param_0, param_1);
		}
	}

	public void setTextColor(android.content.res.ColorStateList param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextColor", params);
		} else {
			super.setTextColor(param_0);
		}
	}

	public void setTextColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextColor", params);
		} else {
			super.setTextColor(param_0);
		}
	}

	public void setTextDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextDirection", params);
		} else {
			super.setTextDirection(param_0);
		}
	}

	public void setTextIsSelectable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextIsSelectable", params);
		} else {
			super.setTextIsSelectable(param_0);
		}
	}

	public void setTextLocale(java.util.Locale param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 5)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextLocale", params);
		} else {
			super.setTextLocale(param_0);
		}
	}

	public void setTextScaleX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextScaleX", params);
		} else {
			super.setTextScaleX(param_0);
		}
	}

	public void setTextSize(int param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTextSize", params);
		} else {
			super.setTextSize(param_0, param_1);
		}
	}

	public void setTextSize(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho61 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextSize", params);
		} else {
			super.setTextSize(param_0);
		}
	}

	public void setTouchDelegate(android.view.TouchDelegate param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho62 & (1 << 0)) > 0) { 
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
		if ((__ho62 & (1 << 1)) > 0) { 
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
		if ((__ho62 & (1 << 2)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTranslationY", params);
		} else {
			super.setTranslationY(param_0);
		}
	}

	public void setTypeface(android.graphics.Typeface param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho62 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTypeface", params);
		} else {
			super.setTypeface(param_0);
		}
	}

	public void setTypeface(android.graphics.Typeface param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho62 & (1 << 3)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTypeface", params);
		} else {
			super.setTypeface(param_0, param_1);
		}
	}

	public void setVerticalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho62 & (1 << 4)) > 0) { 
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
		if ((__ho62 & (1 << 5)) > 0) { 
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
		if ((__ho62 & (1 << 6)) > 0) { 
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
		if ((__ho62 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVisibility", params);
		} else {
			super.setVisibility(param_0);
		}
	}

	public void setWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho63 & (1 << 0)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWidth", params);
		} else {
			super.setWidth(param_0);
		}
	}

	public void setWillNotCacheDrawing(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho63 & (1 << 1)) > 0) { 
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
		if ((__ho63 & (1 << 2)) > 0) { 
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
		if ((__ho63 & (1 << 3)) > 0) { 
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
		if ((__ho63 & (1 << 4)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setY", params);
		} else {
			super.setY(param_0);
		}
	}

	public boolean showContextMenu() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho63 & (1 << 5)) > 0) { 
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "showContextMenu", params);
		} else {
			return super.showContextMenu();
		}
	}

	public android.view.ActionMode startActionMode(android.view.ActionMode.Callback param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho63 & (1 << 6)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.ActionMode)com.tns.Platform.callJSMethod(this, "startActionMode", params);
		} else {
			return super.startActionMode(param_0);
		}
	}

	public void startAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho63 & (1 << 7)) > 0) { 
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "startAnimation", params);
		} else {
			super.startAnimation(param_0);
		}
	}

	public java.lang.String toString() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho64 & (1 << 0)) > 0) { 
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
		if ((__ho64 & (1 << 1)) > 0) { 
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
		if ((__ho64 & (1 << 1)) > 0) { 
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "unscheduleDrawable", params);
		} else {
			super.unscheduleDrawable(param_0, param_1);
		}
	}

	protected boolean verifyDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
		if ((__ho64 & (1 << 2)) > 0) { 
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
		if ((__ho64 & (1 << 3)) > 0) { 
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
		if ((__ho64 & (1 << 4)) > 0) { 
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
			} else if (name.equals("addTextChangedListener")) {
				__ho0 |= (1 << 4);
			} else if (name.equals("addTouchables")) {
				__ho0 |= (1 << 5);
			} else if (name.equals("animate")) {
				__ho0 |= (1 << 6);
			} else if (name.equals("announceForAccessibility")) {
				__ho0 |= (1 << 7);
			} else if (name.equals("append")) {
				__ho1 |= (1 << 0);
			} else if (name.equals("awakenScrollBars")) {
				__ho1 |= (1 << 1);
			} else if (name.equals("beginBatchEdit")) {
				__ho1 |= (1 << 2);
			} else if (name.equals("bringPointIntoView")) {
				__ho1 |= (1 << 3);
			} else if (name.equals("bringToFront")) {
				__ho1 |= (1 << 4);
			} else if (name.equals("buildDrawingCache")) {
				__ho1 |= (1 << 5);
			} else if (name.equals("buildLayer")) {
				__ho1 |= (1 << 6);
			} else if (name.equals("callOnClick")) {
				__ho1 |= (1 << 7);
			} else if (name.equals("canScrollHorizontally")) {
				__ho2 |= (1 << 0);
			} else if (name.equals("canScrollVertically")) {
				__ho2 |= (1 << 1);
			} else if (name.equals("cancelLongPress")) {
				__ho2 |= (1 << 2);
			} else if (name.equals("checkInputConnectionProxy")) {
				__ho2 |= (1 << 3);
			} else if (name.equals("clearAnimation")) {
				__ho2 |= (1 << 4);
			} else if (name.equals("clearComposingText")) {
				__ho2 |= (1 << 5);
			} else if (name.equals("clearFocus")) {
				__ho2 |= (1 << 6);
			} else if (name.equals("clone")) {
				__ho2 |= (1 << 7);
			} else if (name.equals("computeHorizontalScrollExtent")) {
				__ho3 |= (1 << 0);
			} else if (name.equals("computeHorizontalScrollOffset")) {
				__ho3 |= (1 << 1);
			} else if (name.equals("computeHorizontalScrollRange")) {
				__ho3 |= (1 << 2);
			} else if (name.equals("computeScroll")) {
				__ho3 |= (1 << 3);
			} else if (name.equals("computeVerticalScrollExtent")) {
				__ho3 |= (1 << 4);
			} else if (name.equals("computeVerticalScrollOffset")) {
				__ho3 |= (1 << 5);
			} else if (name.equals("computeVerticalScrollRange")) {
				__ho3 |= (1 << 6);
			} else if (name.equals("createAccessibilityNodeInfo")) {
				__ho3 |= (1 << 7);
			} else if (name.equals("createContextMenu")) {
				__ho4 |= (1 << 0);
			} else if (name.equals("debug")) {
				__ho4 |= (1 << 1);
			} else if (name.equals("destroyDrawingCache")) {
				__ho4 |= (1 << 2);
			} else if (name.equals("didTouchFocusSelect")) {
				__ho4 |= (1 << 3);
			} else if (name.equals("dispatchConfigurationChanged")) {
				__ho4 |= (1 << 4);
			} else if (name.equals("dispatchDisplayHint")) {
				__ho4 |= (1 << 5);
			} else if (name.equals("dispatchDragEvent")) {
				__ho4 |= (1 << 6);
			} else if (name.equals("dispatchDraw")) {
				__ho4 |= (1 << 7);
			} else if (name.equals("dispatchGenericFocusedEvent")) {
				__ho5 |= (1 << 0);
			} else if (name.equals("dispatchGenericMotionEvent")) {
				__ho5 |= (1 << 1);
			} else if (name.equals("dispatchGenericPointerEvent")) {
				__ho5 |= (1 << 2);
			} else if (name.equals("dispatchHoverEvent")) {
				__ho5 |= (1 << 3);
			} else if (name.equals("dispatchKeyEvent")) {
				__ho5 |= (1 << 4);
			} else if (name.equals("dispatchKeyEventPreIme")) {
				__ho5 |= (1 << 5);
			} else if (name.equals("dispatchKeyShortcutEvent")) {
				__ho5 |= (1 << 6);
			} else if (name.equals("dispatchPopulateAccessibilityEvent")) {
				__ho5 |= (1 << 7);
			} else if (name.equals("dispatchRestoreInstanceState")) {
				__ho6 |= (1 << 0);
			} else if (name.equals("dispatchSaveInstanceState")) {
				__ho6 |= (1 << 1);
			} else if (name.equals("dispatchSetActivated")) {
				__ho6 |= (1 << 2);
			} else if (name.equals("dispatchSetPressed")) {
				__ho6 |= (1 << 3);
			} else if (name.equals("dispatchSetSelected")) {
				__ho6 |= (1 << 4);
			} else if (name.equals("dispatchSystemUiVisibilityChanged")) {
				__ho6 |= (1 << 5);
			} else if (name.equals("dispatchTouchEvent")) {
				__ho6 |= (1 << 6);
			} else if (name.equals("dispatchTrackballEvent")) {
				__ho6 |= (1 << 7);
			} else if (name.equals("dispatchUnhandledMove")) {
				__ho7 |= (1 << 0);
			} else if (name.equals("dispatchVisibilityChanged")) {
				__ho7 |= (1 << 1);
			} else if (name.equals("dispatchWindowFocusChanged")) {
				__ho7 |= (1 << 2);
			} else if (name.equals("dispatchWindowSystemUiVisiblityChanged")) {
				__ho7 |= (1 << 3);
			} else if (name.equals("dispatchWindowVisibilityChanged")) {
				__ho7 |= (1 << 4);
			} else if (name.equals("draw")) {
				__ho7 |= (1 << 5);
			} else if (name.equals("drawableStateChanged")) {
				__ho7 |= (1 << 6);
			} else if (name.equals("endBatchEdit")) {
				__ho7 |= (1 << 7);
			} else if (name.equals("equals")) {
				__ho8 |= (1 << 0);
			} else if (name.equals("extractText")) {
				__ho8 |= (1 << 1);
			} else if (name.equals("finalize")) {
				__ho8 |= (1 << 2);
			} else if (name.equals("findFocus")) {
				__ho8 |= (1 << 3);
			} else if (name.equals("findViewsWithText")) {
				__ho8 |= (1 << 4);
			} else if (name.equals("fitSystemWindows")) {
				__ho8 |= (1 << 5);
			} else if (name.equals("focusSearch")) {
				__ho8 |= (1 << 6);
			} else if (name.equals("forceLayout")) {
				__ho8 |= (1 << 7);
			} else if (name.equals("getAccessibilityNodeProvider")) {
				__ho9 |= (1 << 0);
			} else if (name.equals("getAlpha")) {
				__ho9 |= (1 << 1);
			} else if (name.equals("getAnimation")) {
				__ho9 |= (1 << 2);
			} else if (name.equals("getApplicationWindowToken")) {
				__ho9 |= (1 << 3);
			} else if (name.equals("getBackground")) {
				__ho9 |= (1 << 4);
			} else if (name.equals("getBaseline")) {
				__ho9 |= (1 << 5);
			} else if (name.equals("getBottomFadingEdgeStrength")) {
				__ho9 |= (1 << 6);
			} else if (name.equals("getBottomPaddingOffset")) {
				__ho9 |= (1 << 7);
			} else if (name.equals("getCameraDistance")) {
				__ho10 |= (1 << 0);
			} else if (name.equals("getCompoundDrawablePadding")) {
				__ho10 |= (1 << 1);
			} else if (name.equals("getCompoundDrawables")) {
				__ho10 |= (1 << 2);
			} else if (name.equals("getCompoundDrawablesRelative")) {
				__ho10 |= (1 << 3);
			} else if (name.equals("getCompoundPaddingBottom")) {
				__ho10 |= (1 << 4);
			} else if (name.equals("getCompoundPaddingEnd")) {
				__ho10 |= (1 << 5);
			} else if (name.equals("getCompoundPaddingLeft")) {
				__ho10 |= (1 << 6);
			} else if (name.equals("getCompoundPaddingRight")) {
				__ho10 |= (1 << 7);
			} else if (name.equals("getCompoundPaddingStart")) {
				__ho11 |= (1 << 0);
			} else if (name.equals("getCompoundPaddingTop")) {
				__ho11 |= (1 << 1);
			} else if (name.equals("getContentDescription")) {
				__ho11 |= (1 << 2);
			} else if (name.equals("getContextMenuInfo")) {
				__ho11 |= (1 << 3);
			} else if (name.equals("getCustomSelectionActionModeCallback")) {
				__ho11 |= (1 << 4);
			} else if (name.equals("getDefaultEditable")) {
				__ho11 |= (1 << 5);
			} else if (name.equals("getDefaultMovementMethod")) {
				__ho11 |= (1 << 6);
			} else if (name.equals("getDisplay")) {
				__ho11 |= (1 << 7);
			} else if (name.equals("getDrawingCache")) {
				__ho12 |= (1 << 0);
			} else if (name.equals("getDrawingCacheBackgroundColor")) {
				__ho12 |= (1 << 1);
			} else if (name.equals("getDrawingCacheQuality")) {
				__ho12 |= (1 << 2);
			} else if (name.equals("getDrawingRect")) {
				__ho12 |= (1 << 3);
			} else if (name.equals("getDrawingTime")) {
				__ho12 |= (1 << 4);
			} else if (name.equals("getEditableText")) {
				__ho12 |= (1 << 5);
			} else if (name.equals("getEllipsize")) {
				__ho12 |= (1 << 6);
			} else if (name.equals("getError")) {
				__ho12 |= (1 << 7);
			} else if (name.equals("getExtendedPaddingBottom")) {
				__ho13 |= (1 << 0);
			} else if (name.equals("getExtendedPaddingTop")) {
				__ho13 |= (1 << 1);
			} else if (name.equals("getFilterTouchesWhenObscured")) {
				__ho13 |= (1 << 2);
			} else if (name.equals("getFilters")) {
				__ho13 |= (1 << 3);
			} else if (name.equals("getFitsSystemWindows")) {
				__ho13 |= (1 << 4);
			} else if (name.equals("getFocusables")) {
				__ho13 |= (1 << 5);
			} else if (name.equals("getFocusedRect")) {
				__ho13 |= (1 << 6);
			} else if (name.equals("getFreezesText")) {
				__ho13 |= (1 << 7);
			} else if (name.equals("getGlobalVisibleRect")) {
				__ho14 |= (1 << 0);
			} else if (name.equals("getGravity")) {
				__ho14 |= (1 << 1);
			} else if (name.equals("getHandler")) {
				__ho14 |= (1 << 2);
			} else if (name.equals("getHighlightColor")) {
				__ho14 |= (1 << 3);
			} else if (name.equals("getHint")) {
				__ho14 |= (1 << 4);
			} else if (name.equals("getHitRect")) {
				__ho14 |= (1 << 5);
			} else if (name.equals("getHorizontalFadingEdgeLength")) {
				__ho14 |= (1 << 6);
			} else if (name.equals("getHorizontalScrollbarHeight")) {
				__ho14 |= (1 << 7);
			} else if (name.equals("getId")) {
				__ho15 |= (1 << 0);
			} else if (name.equals("getImeActionId")) {
				__ho15 |= (1 << 1);
			} else if (name.equals("getImeActionLabel")) {
				__ho15 |= (1 << 2);
			} else if (name.equals("getImeOptions")) {
				__ho15 |= (1 << 3);
			} else if (name.equals("getImportantForAccessibility")) {
				__ho15 |= (1 << 4);
			} else if (name.equals("getIncludeFontPadding")) {
				__ho15 |= (1 << 5);
			} else if (name.equals("getInputExtras")) {
				__ho15 |= (1 << 6);
			} else if (name.equals("getInputType")) {
				__ho15 |= (1 << 7);
			} else if (name.equals("getKeepScreenOn")) {
				__ho16 |= (1 << 0);
			} else if (name.equals("getKeyDispatcherState")) {
				__ho16 |= (1 << 1);
			} else if (name.equals("getLabelFor")) {
				__ho16 |= (1 << 2);
			} else if (name.equals("getLayerType")) {
				__ho16 |= (1 << 3);
			} else if (name.equals("getLayoutDirection")) {
				__ho16 |= (1 << 4);
			} else if (name.equals("getLayoutParams")) {
				__ho16 |= (1 << 5);
			} else if (name.equals("getLeftFadingEdgeStrength")) {
				__ho16 |= (1 << 6);
			} else if (name.equals("getLeftPaddingOffset")) {
				__ho16 |= (1 << 7);
			} else if (name.equals("getLineBounds")) {
				__ho17 |= (1 << 0);
			} else if (name.equals("getLineCount")) {
				__ho17 |= (1 << 1);
			} else if (name.equals("getLineHeight")) {
				__ho17 |= (1 << 2);
			} else if (name.equals("getLineSpacingExtra")) {
				__ho17 |= (1 << 3);
			} else if (name.equals("getLineSpacingMultiplier")) {
				__ho17 |= (1 << 4);
			} else if (name.equals("getLocationInWindow")) {
				__ho17 |= (1 << 5);
			} else if (name.equals("getLocationOnScreen")) {
				__ho17 |= (1 << 6);
			} else if (name.equals("getMarqueeRepeatLimit")) {
				__ho17 |= (1 << 7);
			} else if (name.equals("getMatrix")) {
				__ho18 |= (1 << 0);
			} else if (name.equals("getMaxEms")) {
				__ho18 |= (1 << 1);
			} else if (name.equals("getMaxHeight")) {
				__ho18 |= (1 << 2);
			} else if (name.equals("getMaxLines")) {
				__ho18 |= (1 << 3);
			} else if (name.equals("getMaxWidth")) {
				__ho18 |= (1 << 4);
			} else if (name.equals("getMinEms")) {
				__ho18 |= (1 << 5);
			} else if (name.equals("getMinHeight")) {
				__ho18 |= (1 << 6);
			} else if (name.equals("getMinLines")) {
				__ho18 |= (1 << 7);
			} else if (name.equals("getMinWidth")) {
				__ho19 |= (1 << 0);
			} else if (name.equals("getMinimumHeight")) {
				__ho19 |= (1 << 1);
			} else if (name.equals("getMinimumWidth")) {
				__ho19 |= (1 << 2);
			} else if (name.equals("getNextFocusDownId")) {
				__ho19 |= (1 << 3);
			} else if (name.equals("getNextFocusForwardId")) {
				__ho19 |= (1 << 4);
			} else if (name.equals("getNextFocusLeftId")) {
				__ho19 |= (1 << 5);
			} else if (name.equals("getNextFocusRightId")) {
				__ho19 |= (1 << 6);
			} else if (name.equals("getNextFocusUpId")) {
				__ho19 |= (1 << 7);
			} else if (name.equals("getOffsetForPosition")) {
				__ho20 |= (1 << 0);
			} else if (name.equals("getOnFocusChangeListener")) {
				__ho20 |= (1 << 1);
			} else if (name.equals("getOverScrollMode")) {
				__ho20 |= (1 << 2);
			} else if (name.equals("getPaddingBottom")) {
				__ho20 |= (1 << 3);
			} else if (name.equals("getPaddingEnd")) {
				__ho20 |= (1 << 4);
			} else if (name.equals("getPaddingLeft")) {
				__ho20 |= (1 << 5);
			} else if (name.equals("getPaddingRight")) {
				__ho20 |= (1 << 6);
			} else if (name.equals("getPaddingStart")) {
				__ho20 |= (1 << 7);
			} else if (name.equals("getPaddingTop")) {
				__ho21 |= (1 << 0);
			} else if (name.equals("getPaint")) {
				__ho21 |= (1 << 1);
			} else if (name.equals("getPaintFlags")) {
				__ho21 |= (1 << 2);
			} else if (name.equals("getParentForAccessibility")) {
				__ho21 |= (1 << 3);
			} else if (name.equals("getPivotX")) {
				__ho21 |= (1 << 4);
			} else if (name.equals("getPivotY")) {
				__ho21 |= (1 << 5);
			} else if (name.equals("getPrivateImeOptions")) {
				__ho21 |= (1 << 6);
			} else if (name.equals("getResources")) {
				__ho21 |= (1 << 7);
			} else if (name.equals("getRightFadingEdgeStrength")) {
				__ho22 |= (1 << 0);
			} else if (name.equals("getRightPaddingOffset")) {
				__ho22 |= (1 << 1);
			} else if (name.equals("getRootView")) {
				__ho22 |= (1 << 2);
			} else if (name.equals("getRotation")) {
				__ho22 |= (1 << 3);
			} else if (name.equals("getRotationX")) {
				__ho22 |= (1 << 4);
			} else if (name.equals("getRotationY")) {
				__ho22 |= (1 << 5);
			} else if (name.equals("getScaleX")) {
				__ho22 |= (1 << 6);
			} else if (name.equals("getScaleY")) {
				__ho22 |= (1 << 7);
			} else if (name.equals("getScrollBarDefaultDelayBeforeFade")) {
				__ho23 |= (1 << 0);
			} else if (name.equals("getScrollBarFadeDuration")) {
				__ho23 |= (1 << 1);
			} else if (name.equals("getScrollBarSize")) {
				__ho23 |= (1 << 2);
			} else if (name.equals("getScrollBarStyle")) {
				__ho23 |= (1 << 3);
			} else if (name.equals("getSelectionEnd")) {
				__ho23 |= (1 << 4);
			} else if (name.equals("getSelectionStart")) {
				__ho23 |= (1 << 5);
			} else if (name.equals("getShadowColor")) {
				__ho23 |= (1 << 6);
			} else if (name.equals("getShadowDx")) {
				__ho23 |= (1 << 7);
			} else if (name.equals("getShadowDy")) {
				__ho24 |= (1 << 0);
			} else if (name.equals("getShadowRadius")) {
				__ho24 |= (1 << 1);
			} else if (name.equals("getSolidColor")) {
				__ho24 |= (1 << 2);
			} else if (name.equals("getSuggestedMinimumHeight")) {
				__ho24 |= (1 << 3);
			} else if (name.equals("getSuggestedMinimumWidth")) {
				__ho24 |= (1 << 4);
			} else if (name.equals("getSystemUiVisibility")) {
				__ho24 |= (1 << 5);
			} else if (name.equals("getTag")) {
				__ho24 |= (1 << 6);
			} else if (name.equals("getText")) {
				__ho24 |= (1 << 7);
			} else if (name.equals("getTextAlignment")) {
				__ho25 |= (1 << 0);
			} else if (name.equals("getTextDirection")) {
				__ho25 |= (1 << 1);
			} else if (name.equals("getTextLocale")) {
				__ho25 |= (1 << 2);
			} else if (name.equals("getTextScaleX")) {
				__ho25 |= (1 << 3);
			} else if (name.equals("getTextSize")) {
				__ho25 |= (1 << 4);
			} else if (name.equals("getTopFadingEdgeStrength")) {
				__ho25 |= (1 << 5);
			} else if (name.equals("getTopPaddingOffset")) {
				__ho25 |= (1 << 6);
			} else if (name.equals("getTotalPaddingBottom")) {
				__ho25 |= (1 << 7);
			} else if (name.equals("getTotalPaddingEnd")) {
				__ho26 |= (1 << 0);
			} else if (name.equals("getTotalPaddingLeft")) {
				__ho26 |= (1 << 1);
			} else if (name.equals("getTotalPaddingRight")) {
				__ho26 |= (1 << 2);
			} else if (name.equals("getTotalPaddingStart")) {
				__ho26 |= (1 << 3);
			} else if (name.equals("getTotalPaddingTop")) {
				__ho26 |= (1 << 4);
			} else if (name.equals("getTouchDelegate")) {
				__ho26 |= (1 << 5);
			} else if (name.equals("getTouchables")) {
				__ho26 |= (1 << 6);
			} else if (name.equals("getTranslationX")) {
				__ho26 |= (1 << 7);
			} else if (name.equals("getTranslationY")) {
				__ho27 |= (1 << 0);
			} else if (name.equals("getTypeface")) {
				__ho27 |= (1 << 1);
			} else if (name.equals("getUrls")) {
				__ho27 |= (1 << 2);
			} else if (name.equals("getVerticalFadingEdgeLength")) {
				__ho27 |= (1 << 3);
			} else if (name.equals("getVerticalScrollbarPosition")) {
				__ho27 |= (1 << 4);
			} else if (name.equals("getVerticalScrollbarWidth")) {
				__ho27 |= (1 << 5);
			} else if (name.equals("getViewTreeObserver")) {
				__ho27 |= (1 << 6);
			} else if (name.equals("getVisibility")) {
				__ho27 |= (1 << 7);
			} else if (name.equals("getWindowAttachCount")) {
				__ho28 |= (1 << 0);
			} else if (name.equals("getWindowSystemUiVisibility")) {
				__ho28 |= (1 << 1);
			} else if (name.equals("getWindowToken")) {
				__ho28 |= (1 << 2);
			} else if (name.equals("getWindowVisibility")) {
				__ho28 |= (1 << 3);
			} else if (name.equals("getWindowVisibleDisplayFrame")) {
				__ho28 |= (1 << 4);
			} else if (name.equals("getX")) {
				__ho28 |= (1 << 5);
			} else if (name.equals("getY")) {
				__ho28 |= (1 << 6);
			} else if (name.equals("hasFocus")) {
				__ho28 |= (1 << 7);
			} else if (name.equals("hasFocusable")) {
				__ho29 |= (1 << 0);
			} else if (name.equals("hasOnClickListeners")) {
				__ho29 |= (1 << 1);
			} else if (name.equals("hasOverlappingRendering")) {
				__ho29 |= (1 << 2);
			} else if (name.equals("hasSelection")) {
				__ho29 |= (1 << 3);
			} else if (name.equals("hasTransientState")) {
				__ho29 |= (1 << 4);
			} else if (name.equals("hasWindowFocus")) {
				__ho29 |= (1 << 5);
			} else if (name.equals("hashCode")) {
				__ho29 |= (1 << 6);
			} else if (name.equals("initializeFadingEdge")) {
				__ho29 |= (1 << 7);
			} else if (name.equals("initializeScrollbars")) {
				__ho30 |= (1 << 0);
			} else if (name.equals("invalidate")) {
				__ho30 |= (1 << 1);
			} else if (name.equals("invalidateDrawable")) {
				__ho30 |= (1 << 2);
			} else if (name.equals("isActivated")) {
				__ho30 |= (1 << 3);
			} else if (name.equals("isClickable")) {
				__ho30 |= (1 << 4);
			} else if (name.equals("isCursorVisible")) {
				__ho30 |= (1 << 5);
			} else if (name.equals("isDirty")) {
				__ho30 |= (1 << 6);
			} else if (name.equals("isDrawingCacheEnabled")) {
				__ho30 |= (1 << 7);
			} else if (name.equals("isDuplicateParentStateEnabled")) {
				__ho31 |= (1 << 0);
			} else if (name.equals("isEnabled")) {
				__ho31 |= (1 << 1);
			} else if (name.equals("isFocused")) {
				__ho31 |= (1 << 2);
			} else if (name.equals("isHapticFeedbackEnabled")) {
				__ho31 |= (1 << 3);
			} else if (name.equals("isHardwareAccelerated")) {
				__ho31 |= (1 << 4);
			} else if (name.equals("isHorizontalFadingEdgeEnabled")) {
				__ho31 |= (1 << 5);
			} else if (name.equals("isHorizontalScrollBarEnabled")) {
				__ho31 |= (1 << 6);
			} else if (name.equals("isHovered")) {
				__ho31 |= (1 << 7);
			} else if (name.equals("isInEditMode")) {
				__ho32 |= (1 << 0);
			} else if (name.equals("isInTouchMode")) {
				__ho32 |= (1 << 1);
			} else if (name.equals("isInputMethodTarget")) {
				__ho32 |= (1 << 2);
			} else if (name.equals("isLayoutRequested")) {
				__ho32 |= (1 << 3);
			} else if (name.equals("isLongClickable")) {
				__ho32 |= (1 << 4);
			} else if (name.equals("isOpaque")) {
				__ho32 |= (1 << 5);
			} else if (name.equals("isPaddingOffsetRequired")) {
				__ho32 |= (1 << 6);
			} else if (name.equals("isPaddingRelative")) {
				__ho32 |= (1 << 7);
			} else if (name.equals("isPressed")) {
				__ho33 |= (1 << 0);
			} else if (name.equals("isSaveEnabled")) {
				__ho33 |= (1 << 1);
			} else if (name.equals("isSaveFromParentEnabled")) {
				__ho33 |= (1 << 2);
			} else if (name.equals("isScrollContainer")) {
				__ho33 |= (1 << 3);
			} else if (name.equals("isScrollbarFadingEnabled")) {
				__ho33 |= (1 << 4);
			} else if (name.equals("isSelected")) {
				__ho33 |= (1 << 5);
			} else if (name.equals("isShown")) {
				__ho33 |= (1 << 6);
			} else if (name.equals("isSoundEffectsEnabled")) {
				__ho33 |= (1 << 7);
			} else if (name.equals("isSuggestionsEnabled")) {
				__ho34 |= (1 << 0);
			} else if (name.equals("isTextSelectable")) {
				__ho34 |= (1 << 1);
			} else if (name.equals("isVerticalFadingEdgeEnabled")) {
				__ho34 |= (1 << 2);
			} else if (name.equals("isVerticalScrollBarEnabled")) {
				__ho34 |= (1 << 3);
			} else if (name.equals("jumpDrawablesToCurrentState")) {
				__ho34 |= (1 << 4);
			} else if (name.equals("layout")) {
				__ho34 |= (1 << 5);
			} else if (name.equals("length")) {
				__ho34 |= (1 << 6);
			} else if (name.equals("moveCursorToVisibleOffset")) {
				__ho34 |= (1 << 7);
			} else if (name.equals("offsetLeftAndRight")) {
				__ho35 |= (1 << 0);
			} else if (name.equals("offsetTopAndBottom")) {
				__ho35 |= (1 << 1);
			} else if (name.equals("onAnimationEnd")) {
				__ho35 |= (1 << 2);
			} else if (name.equals("onAnimationStart")) {
				__ho35 |= (1 << 3);
			} else if (name.equals("onAttachedToWindow")) {
				__ho35 |= (1 << 4);
			} else if (name.equals("onBeginBatchEdit")) {
				__ho35 |= (1 << 5);
			} else if (name.equals("onCheckIsTextEditor")) {
				__ho35 |= (1 << 6);
			} else if (name.equals("onCommitCompletion")) {
				__ho35 |= (1 << 7);
			} else if (name.equals("onCommitCorrection")) {
				__ho36 |= (1 << 0);
			} else if (name.equals("onConfigurationChanged")) {
				__ho36 |= (1 << 1);
			} else if (name.equals("onCreateContextMenu")) {
				__ho36 |= (1 << 2);
			} else if (name.equals("onCreateDrawableState")) {
				__ho36 |= (1 << 3);
			} else if (name.equals("onCreateInputConnection")) {
				__ho36 |= (1 << 4);
			} else if (name.equals("onDetachedFromWindow")) {
				__ho36 |= (1 << 5);
			} else if (name.equals("onDisplayHint")) {
				__ho36 |= (1 << 6);
			} else if (name.equals("onDragEvent")) {
				__ho36 |= (1 << 7);
			} else if (name.equals("onDraw")) {
				__ho37 |= (1 << 0);
			} else if (name.equals("onEditorAction")) {
				__ho37 |= (1 << 1);
			} else if (name.equals("onEndBatchEdit")) {
				__ho37 |= (1 << 2);
			} else if (name.equals("onFilterTouchEventForSecurity")) {
				__ho37 |= (1 << 3);
			} else if (name.equals("onFinishInflate")) {
				__ho37 |= (1 << 4);
			} else if (name.equals("onFinishTemporaryDetach")) {
				__ho37 |= (1 << 5);
			} else if (name.equals("onFocusChanged")) {
				__ho37 |= (1 << 6);
			} else if (name.equals("onGenericMotionEvent")) {
				__ho37 |= (1 << 7);
			} else if (name.equals("onHoverChanged")) {
				__ho38 |= (1 << 0);
			} else if (name.equals("onHoverEvent")) {
				__ho38 |= (1 << 1);
			} else if (name.equals("onInitializeAccessibilityEvent")) {
				__ho38 |= (1 << 2);
			} else if (name.equals("onInitializeAccessibilityNodeInfo")) {
				__ho38 |= (1 << 3);
			} else if (name.equals("onKeyDown")) {
				__ho38 |= (1 << 4);
			} else if (name.equals("onKeyLongPress")) {
				__ho38 |= (1 << 5);
			} else if (name.equals("onKeyMultiple")) {
				__ho38 |= (1 << 6);
			} else if (name.equals("onKeyPreIme")) {
				__ho38 |= (1 << 7);
			} else if (name.equals("onKeyShortcut")) {
				__ho39 |= (1 << 0);
			} else if (name.equals("onKeyUp")) {
				__ho39 |= (1 << 1);
			} else if (name.equals("onLayout")) {
				__ho39 |= (1 << 2);
			} else if (name.equals("onMeasure")) {
				__ho39 |= (1 << 3);
			} else if (name.equals("onOverScrolled")) {
				__ho39 |= (1 << 4);
			} else if (name.equals("onPopulateAccessibilityEvent")) {
				__ho39 |= (1 << 5);
			} else if (name.equals("onPreDraw")) {
				__ho39 |= (1 << 6);
			} else if (name.equals("onPrivateIMECommand")) {
				__ho39 |= (1 << 7);
			} else if (name.equals("onRestoreInstanceState")) {
				__ho40 |= (1 << 0);
			} else if (name.equals("onRtlPropertiesChanged")) {
				__ho40 |= (1 << 1);
			} else if (name.equals("onSaveInstanceState")) {
				__ho40 |= (1 << 2);
			} else if (name.equals("onScreenStateChanged")) {
				__ho40 |= (1 << 3);
			} else if (name.equals("onScrollChanged")) {
				__ho40 |= (1 << 4);
			} else if (name.equals("onSelectionChanged")) {
				__ho40 |= (1 << 5);
			} else if (name.equals("onSetAlpha")) {
				__ho40 |= (1 << 6);
			} else if (name.equals("onSizeChanged")) {
				__ho40 |= (1 << 7);
			} else if (name.equals("onStartTemporaryDetach")) {
				__ho41 |= (1 << 0);
			} else if (name.equals("onTextChanged")) {
				__ho41 |= (1 << 1);
			} else if (name.equals("onTextContextMenuItem")) {
				__ho41 |= (1 << 2);
			} else if (name.equals("onTouchEvent")) {
				__ho41 |= (1 << 3);
			} else if (name.equals("onTrackballEvent")) {
				__ho41 |= (1 << 4);
			} else if (name.equals("onVisibilityChanged")) {
				__ho41 |= (1 << 5);
			} else if (name.equals("onWindowFocusChanged")) {
				__ho41 |= (1 << 6);
			} else if (name.equals("onWindowSystemUiVisibilityChanged")) {
				__ho41 |= (1 << 7);
			} else if (name.equals("onWindowVisibilityChanged")) {
				__ho42 |= (1 << 0);
			} else if (name.equals("overScrollBy")) {
				__ho42 |= (1 << 1);
			} else if (name.equals("performAccessibilityAction")) {
				__ho42 |= (1 << 2);
			} else if (name.equals("performClick")) {
				__ho42 |= (1 << 3);
			} else if (name.equals("performHapticFeedback")) {
				__ho42 |= (1 << 4);
			} else if (name.equals("performLongClick")) {
				__ho42 |= (1 << 5);
			} else if (name.equals("playSoundEffect")) {
				__ho42 |= (1 << 6);
			} else if (name.equals("post")) {
				__ho42 |= (1 << 7);
			} else if (name.equals("postDelayed")) {
				__ho43 |= (1 << 0);
			} else if (name.equals("postInvalidate")) {
				__ho43 |= (1 << 1);
			} else if (name.equals("postInvalidateDelayed")) {
				__ho43 |= (1 << 2);
			} else if (name.equals("postInvalidateOnAnimation")) {
				__ho43 |= (1 << 3);
			} else if (name.equals("postOnAnimation")) {
				__ho43 |= (1 << 4);
			} else if (name.equals("postOnAnimationDelayed")) {
				__ho43 |= (1 << 5);
			} else if (name.equals("refreshDrawableState")) {
				__ho43 |= (1 << 6);
			} else if (name.equals("removeCallbacks")) {
				__ho43 |= (1 << 7);
			} else if (name.equals("removeOnAttachStateChangeListener")) {
				__ho44 |= (1 << 0);
			} else if (name.equals("removeOnLayoutChangeListener")) {
				__ho44 |= (1 << 1);
			} else if (name.equals("removeTextChangedListener")) {
				__ho44 |= (1 << 2);
			} else if (name.equals("requestFitSystemWindows")) {
				__ho44 |= (1 << 3);
			} else if (name.equals("requestFocus")) {
				__ho44 |= (1 << 4);
			} else if (name.equals("requestLayout")) {
				__ho44 |= (1 << 5);
			} else if (name.equals("requestRectangleOnScreen")) {
				__ho44 |= (1 << 6);
			} else if (name.equals("restoreHierarchyState")) {
				__ho44 |= (1 << 7);
			} else if (name.equals("saveHierarchyState")) {
				__ho45 |= (1 << 0);
			} else if (name.equals("scheduleDrawable")) {
				__ho45 |= (1 << 1);
			} else if (name.equals("scrollBy")) {
				__ho45 |= (1 << 2);
			} else if (name.equals("scrollTo")) {
				__ho45 |= (1 << 3);
			} else if (name.equals("sendAccessibilityEvent")) {
				__ho45 |= (1 << 4);
			} else if (name.equals("sendAccessibilityEventUnchecked")) {
				__ho45 |= (1 << 5);
			} else if (name.equals("setAccessibilityDelegate")) {
				__ho45 |= (1 << 6);
			} else if (name.equals("setActivated")) {
				__ho45 |= (1 << 7);
			} else if (name.equals("setAllCaps")) {
				__ho46 |= (1 << 0);
			} else if (name.equals("setAlpha")) {
				__ho46 |= (1 << 1);
			} else if (name.equals("setAnimation")) {
				__ho46 |= (1 << 2);
			} else if (name.equals("setBackground")) {
				__ho46 |= (1 << 3);
			} else if (name.equals("setBackgroundColor")) {
				__ho46 |= (1 << 4);
			} else if (name.equals("setBackgroundDrawable")) {
				__ho46 |= (1 << 5);
			} else if (name.equals("setBackgroundResource")) {
				__ho46 |= (1 << 6);
			} else if (name.equals("setCameraDistance")) {
				__ho46 |= (1 << 7);
			} else if (name.equals("setClickable")) {
				__ho47 |= (1 << 0);
			} else if (name.equals("setCompoundDrawablePadding")) {
				__ho47 |= (1 << 1);
			} else if (name.equals("setCompoundDrawables")) {
				__ho47 |= (1 << 2);
			} else if (name.equals("setCompoundDrawablesRelative")) {
				__ho47 |= (1 << 3);
			} else if (name.equals("setCompoundDrawablesRelativeWithIntrinsicBounds")) {
				__ho47 |= (1 << 4);
			} else if (name.equals("setCompoundDrawablesWithIntrinsicBounds")) {
				__ho47 |= (1 << 5);
			} else if (name.equals("setContentDescription")) {
				__ho47 |= (1 << 6);
			} else if (name.equals("setCursorVisible")) {
				__ho47 |= (1 << 7);
			} else if (name.equals("setCustomSelectionActionModeCallback")) {
				__ho48 |= (1 << 0);
			} else if (name.equals("setDrawingCacheBackgroundColor")) {
				__ho48 |= (1 << 1);
			} else if (name.equals("setDrawingCacheEnabled")) {
				__ho48 |= (1 << 2);
			} else if (name.equals("setDrawingCacheQuality")) {
				__ho48 |= (1 << 3);
			} else if (name.equals("setDuplicateParentStateEnabled")) {
				__ho48 |= (1 << 4);
			} else if (name.equals("setEllipsize")) {
				__ho48 |= (1 << 5);
			} else if (name.equals("setEms")) {
				__ho48 |= (1 << 6);
			} else if (name.equals("setEnabled")) {
				__ho48 |= (1 << 7);
			} else if (name.equals("setError")) {
				__ho49 |= (1 << 0);
			} else if (name.equals("setExtractedText")) {
				__ho49 |= (1 << 1);
			} else if (name.equals("setFadingEdgeLength")) {
				__ho49 |= (1 << 2);
			} else if (name.equals("setFilterTouchesWhenObscured")) {
				__ho49 |= (1 << 3);
			} else if (name.equals("setFilters")) {
				__ho49 |= (1 << 4);
			} else if (name.equals("setFitsSystemWindows")) {
				__ho49 |= (1 << 5);
			} else if (name.equals("setFocusable")) {
				__ho49 |= (1 << 6);
			} else if (name.equals("setFocusableInTouchMode")) {
				__ho49 |= (1 << 7);
			} else if (name.equals("setFrame")) {
				__ho50 |= (1 << 0);
			} else if (name.equals("setFreezesText")) {
				__ho50 |= (1 << 1);
			} else if (name.equals("setGravity")) {
				__ho50 |= (1 << 2);
			} else if (name.equals("setHapticFeedbackEnabled")) {
				__ho50 |= (1 << 3);
			} else if (name.equals("setHasTransientState")) {
				__ho50 |= (1 << 4);
			} else if (name.equals("setHeight")) {
				__ho50 |= (1 << 5);
			} else if (name.equals("setHighlightColor")) {
				__ho50 |= (1 << 6);
			} else if (name.equals("setHorizontalFadingEdgeEnabled")) {
				__ho50 |= (1 << 7);
			} else if (name.equals("setHorizontalScrollBarEnabled")) {
				__ho51 |= (1 << 0);
			} else if (name.equals("setHorizontallyScrolling")) {
				__ho51 |= (1 << 1);
			} else if (name.equals("setHovered")) {
				__ho51 |= (1 << 2);
			} else if (name.equals("setId")) {
				__ho51 |= (1 << 3);
			} else if (name.equals("setImeActionLabel")) {
				__ho51 |= (1 << 4);
			} else if (name.equals("setImeOptions")) {
				__ho51 |= (1 << 5);
			} else if (name.equals("setImportantForAccessibility")) {
				__ho51 |= (1 << 6);
			} else if (name.equals("setIncludeFontPadding")) {
				__ho51 |= (1 << 7);
			} else if (name.equals("setInputExtras")) {
				__ho52 |= (1 << 0);
			} else if (name.equals("setInputType")) {
				__ho52 |= (1 << 1);
			} else if (name.equals("setKeepScreenOn")) {
				__ho52 |= (1 << 2);
			} else if (name.equals("setKeyListener")) {
				__ho52 |= (1 << 3);
			} else if (name.equals("setLabelFor")) {
				__ho52 |= (1 << 4);
			} else if (name.equals("setLayerPaint")) {
				__ho52 |= (1 << 5);
			} else if (name.equals("setLayerType")) {
				__ho52 |= (1 << 6);
			} else if (name.equals("setLayoutDirection")) {
				__ho52 |= (1 << 7);
			} else if (name.equals("setLayoutParams")) {
				__ho53 |= (1 << 0);
			} else if (name.equals("setLineSpacing")) {
				__ho53 |= (1 << 1);
			} else if (name.equals("setLines")) {
				__ho53 |= (1 << 2);
			} else if (name.equals("setLongClickable")) {
				__ho53 |= (1 << 3);
			} else if (name.equals("setMarqueeRepeatLimit")) {
				__ho53 |= (1 << 4);
			} else if (name.equals("setMaxEms")) {
				__ho53 |= (1 << 5);
			} else if (name.equals("setMaxHeight")) {
				__ho53 |= (1 << 6);
			} else if (name.equals("setMaxLines")) {
				__ho53 |= (1 << 7);
			} else if (name.equals("setMaxWidth")) {
				__ho54 |= (1 << 0);
			} else if (name.equals("setMinEms")) {
				__ho54 |= (1 << 1);
			} else if (name.equals("setMinHeight")) {
				__ho54 |= (1 << 2);
			} else if (name.equals("setMinLines")) {
				__ho54 |= (1 << 3);
			} else if (name.equals("setMinWidth")) {
				__ho54 |= (1 << 4);
			} else if (name.equals("setMinimumHeight")) {
				__ho54 |= (1 << 5);
			} else if (name.equals("setMinimumWidth")) {
				__ho54 |= (1 << 6);
			} else if (name.equals("setNextFocusDownId")) {
				__ho54 |= (1 << 7);
			} else if (name.equals("setNextFocusForwardId")) {
				__ho55 |= (1 << 0);
			} else if (name.equals("setNextFocusLeftId")) {
				__ho55 |= (1 << 1);
			} else if (name.equals("setNextFocusRightId")) {
				__ho55 |= (1 << 2);
			} else if (name.equals("setNextFocusUpId")) {
				__ho55 |= (1 << 3);
			} else if (name.equals("setOnClickListener")) {
				__ho55 |= (1 << 4);
			} else if (name.equals("setOnCreateContextMenuListener")) {
				__ho55 |= (1 << 5);
			} else if (name.equals("setOnDragListener")) {
				__ho55 |= (1 << 6);
			} else if (name.equals("setOnEditorActionListener")) {
				__ho55 |= (1 << 7);
			} else if (name.equals("setOnFocusChangeListener")) {
				__ho56 |= (1 << 0);
			} else if (name.equals("setOnGenericMotionListener")) {
				__ho56 |= (1 << 1);
			} else if (name.equals("setOnHoverListener")) {
				__ho56 |= (1 << 2);
			} else if (name.equals("setOnKeyListener")) {
				__ho56 |= (1 << 3);
			} else if (name.equals("setOnLongClickListener")) {
				__ho56 |= (1 << 4);
			} else if (name.equals("setOnSystemUiVisibilityChangeListener")) {
				__ho56 |= (1 << 5);
			} else if (name.equals("setOnTouchListener")) {
				__ho56 |= (1 << 6);
			} else if (name.equals("setOverScrollMode")) {
				__ho56 |= (1 << 7);
			} else if (name.equals("setPadding")) {
				__ho57 |= (1 << 0);
			} else if (name.equals("setPaddingRelative")) {
				__ho57 |= (1 << 1);
			} else if (name.equals("setPaintFlags")) {
				__ho57 |= (1 << 2);
			} else if (name.equals("setPivotX")) {
				__ho57 |= (1 << 3);
			} else if (name.equals("setPivotY")) {
				__ho57 |= (1 << 4);
			} else if (name.equals("setPressed")) {
				__ho57 |= (1 << 5);
			} else if (name.equals("setPrivateImeOptions")) {
				__ho57 |= (1 << 6);
			} else if (name.equals("setRawInputType")) {
				__ho57 |= (1 << 7);
			} else if (name.equals("setRotation")) {
				__ho58 |= (1 << 0);
			} else if (name.equals("setRotationX")) {
				__ho58 |= (1 << 1);
			} else if (name.equals("setRotationY")) {
				__ho58 |= (1 << 2);
			} else if (name.equals("setSaveEnabled")) {
				__ho58 |= (1 << 3);
			} else if (name.equals("setSaveFromParentEnabled")) {
				__ho58 |= (1 << 4);
			} else if (name.equals("setScaleX")) {
				__ho58 |= (1 << 5);
			} else if (name.equals("setScaleY")) {
				__ho58 |= (1 << 6);
			} else if (name.equals("setScrollBarDefaultDelayBeforeFade")) {
				__ho58 |= (1 << 7);
			} else if (name.equals("setScrollBarFadeDuration")) {
				__ho59 |= (1 << 0);
			} else if (name.equals("setScrollBarSize")) {
				__ho59 |= (1 << 1);
			} else if (name.equals("setScrollBarStyle")) {
				__ho59 |= (1 << 2);
			} else if (name.equals("setScrollContainer")) {
				__ho59 |= (1 << 3);
			} else if (name.equals("setScrollX")) {
				__ho59 |= (1 << 4);
			} else if (name.equals("setScrollY")) {
				__ho59 |= (1 << 5);
			} else if (name.equals("setScrollbarFadingEnabled")) {
				__ho59 |= (1 << 6);
			} else if (name.equals("setScroller")) {
				__ho59 |= (1 << 7);
			} else if (name.equals("setSelectAllOnFocus")) {
				__ho60 |= (1 << 0);
			} else if (name.equals("setSelected")) {
				__ho60 |= (1 << 1);
			} else if (name.equals("setShadowLayer")) {
				__ho60 |= (1 << 2);
			} else if (name.equals("setSingleLine")) {
				__ho60 |= (1 << 3);
			} else if (name.equals("setSoundEffectsEnabled")) {
				__ho60 |= (1 << 4);
			} else if (name.equals("setSystemUiVisibility")) {
				__ho60 |= (1 << 5);
			} else if (name.equals("setTag")) {
				__ho60 |= (1 << 6);
			} else if (name.equals("setText")) {
				__ho60 |= (1 << 7);
			} else if (name.equals("setTextAlignment")) {
				__ho61 |= (1 << 0);
			} else if (name.equals("setTextAppearance")) {
				__ho61 |= (1 << 1);
			} else if (name.equals("setTextColor")) {
				__ho61 |= (1 << 2);
			} else if (name.equals("setTextDirection")) {
				__ho61 |= (1 << 3);
			} else if (name.equals("setTextIsSelectable")) {
				__ho61 |= (1 << 4);
			} else if (name.equals("setTextLocale")) {
				__ho61 |= (1 << 5);
			} else if (name.equals("setTextScaleX")) {
				__ho61 |= (1 << 6);
			} else if (name.equals("setTextSize")) {
				__ho61 |= (1 << 7);
			} else if (name.equals("setTouchDelegate")) {
				__ho62 |= (1 << 0);
			} else if (name.equals("setTranslationX")) {
				__ho62 |= (1 << 1);
			} else if (name.equals("setTranslationY")) {
				__ho62 |= (1 << 2);
			} else if (name.equals("setTypeface")) {
				__ho62 |= (1 << 3);
			} else if (name.equals("setVerticalFadingEdgeEnabled")) {
				__ho62 |= (1 << 4);
			} else if (name.equals("setVerticalScrollBarEnabled")) {
				__ho62 |= (1 << 5);
			} else if (name.equals("setVerticalScrollbarPosition")) {
				__ho62 |= (1 << 6);
			} else if (name.equals("setVisibility")) {
				__ho62 |= (1 << 7);
			} else if (name.equals("setWidth")) {
				__ho63 |= (1 << 0);
			} else if (name.equals("setWillNotCacheDrawing")) {
				__ho63 |= (1 << 1);
			} else if (name.equals("setWillNotDraw")) {
				__ho63 |= (1 << 2);
			} else if (name.equals("setX")) {
				__ho63 |= (1 << 3);
			} else if (name.equals("setY")) {
				__ho63 |= (1 << 4);
			} else if (name.equals("showContextMenu")) {
				__ho63 |= (1 << 5);
			} else if (name.equals("startActionMode")) {
				__ho63 |= (1 << 6);
			} else if (name.equals("startAnimation")) {
				__ho63 |= (1 << 7);
			} else if (name.equals("toString")) {
				__ho64 |= (1 << 0);
			} else if (name.equals("unscheduleDrawable")) {
				__ho64 |= (1 << 1);
			} else if (name.equals("verifyDrawable")) {
				__ho64 |= (1 << 2);
			} else if (name.equals("willNotCacheDrawing")) {
				__ho64 |= (1 << 3);
			} else if (name.equals("willNotDraw")) {
				__ho64 |= (1 << 4);
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
	private byte __ho61;
	private byte __ho62;
	private byte __ho63;
	private byte __ho64;
	private byte __ho65;
}
