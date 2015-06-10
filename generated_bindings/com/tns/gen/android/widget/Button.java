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
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addChildrenForAccessibility", params);
	}

	public void addFocusables(java.util.ArrayList param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "addFocusables", params);
	}

	public void addFocusables(java.util.ArrayList param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "addFocusables", params);
	}

	public void addOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addOnAttachStateChangeListener", params);
	}

	public void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addOnLayoutChangeListener", params);
	}

	public void addTextChangedListener(android.text.TextWatcher param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addTextChangedListener", params);
	}

	public void addTouchables(java.util.ArrayList param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "addTouchables", params);
	}

	public android.view.ViewPropertyAnimator animate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ViewPropertyAnimator)com.tns.Platform.callJSMethod(this, "animate", params);
	}

	public void announceForAccessibility(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "announceForAccessibility", params);
	}

	public void append(java.lang.CharSequence param_0, int param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "append", params);
	}

	protected boolean awakenScrollBars(int param_0, boolean param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
	}

	protected boolean awakenScrollBars() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
	}

	protected boolean awakenScrollBars(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "awakenScrollBars", params);
	}

	public void beginBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "beginBatchEdit", params);
	}

	public boolean bringPointIntoView(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "bringPointIntoView", params);
	}

	public void bringToFront() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "bringToFront", params);
	}

	public void buildDrawingCache(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "buildDrawingCache", params);
	}

	public void buildDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "buildDrawingCache", params);
	}

	public void buildLayer() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "buildLayer", params);
	}

	public boolean callOnClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "callOnClick", params);
	}

	public boolean canScrollHorizontally(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "canScrollHorizontally", params);
	}

	public boolean canScrollVertically(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "canScrollVertically", params);
	}

	public void cancelLongPress() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "cancelLongPress", params);
	}

	public boolean checkInputConnectionProxy(android.view.View param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "checkInputConnectionProxy", params);
	}

	public void clearAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearAnimation", params);
	}

	public void clearComposingText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearComposingText", params);
	}

	public void clearFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "clearFocus", params);
	}

	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "clone", params);
	}

	protected int computeHorizontalScrollExtent() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollExtent", params);
	}

	protected int computeHorizontalScrollOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollOffset", params);
	}

	protected int computeHorizontalScrollRange() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeHorizontalScrollRange", params);
	}

	public void computeScroll() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "computeScroll", params);
	}

	protected int computeVerticalScrollExtent() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollExtent", params);
	}

	protected int computeVerticalScrollOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollOffset", params);
	}

	protected int computeVerticalScrollRange() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "computeVerticalScrollRange", params);
	}

	public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.accessibility.AccessibilityNodeInfo)com.tns.Platform.callJSMethod(this, "createAccessibilityNodeInfo", params);
	}

	public void createContextMenu(android.view.ContextMenu param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "createContextMenu", params);
	}

	public void debug(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "debug", params);
	}

	public void destroyDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "destroyDrawingCache", params);
	}

	public boolean didTouchFocusSelect() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "didTouchFocusSelect", params);
	}

	public void dispatchConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchConfigurationChanged", params);
	}

	public void dispatchDisplayHint(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchDisplayHint", params);
	}

	public boolean dispatchDragEvent(android.view.DragEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchDragEvent", params);
	}

	protected void dispatchDraw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchDraw", params);
	}

	protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericFocusedEvent", params);
	}

	public boolean dispatchGenericMotionEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericMotionEvent", params);
	}

	protected boolean dispatchGenericPointerEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchGenericPointerEvent", params);
	}

	protected boolean dispatchHoverEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchHoverEvent", params);
	}

	public boolean dispatchKeyEvent(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyEvent", params);
	}

	public boolean dispatchKeyEventPreIme(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyEventPreIme", params);
	}

	public boolean dispatchKeyShortcutEvent(android.view.KeyEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchKeyShortcutEvent", params);
	}

	public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchPopulateAccessibilityEvent", params);
	}

	protected void dispatchRestoreInstanceState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchRestoreInstanceState", params);
	}

	protected void dispatchSaveInstanceState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSaveInstanceState", params);
	}

	protected void dispatchSetActivated(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetActivated", params);
	}

	protected void dispatchSetPressed(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetPressed", params);
	}

	protected void dispatchSetSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSetSelected", params);
	}

	public void dispatchSystemUiVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchSystemUiVisibilityChanged", params);
	}

	public boolean dispatchTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchTouchEvent", params);
	}

	public boolean dispatchTrackballEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchTrackballEvent", params);
	}

	public boolean dispatchUnhandledMove(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "dispatchUnhandledMove", params);
	}

	protected void dispatchVisibilityChanged(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "dispatchVisibilityChanged", params);
	}

	public void dispatchWindowFocusChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowFocusChanged", params);
	}

	public void dispatchWindowSystemUiVisiblityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowSystemUiVisiblityChanged", params);
	}

	public void dispatchWindowVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "dispatchWindowVisibilityChanged", params);
	}

	public void draw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "draw", params);
	}

	protected void drawableStateChanged() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "drawableStateChanged", params);
	}

	public void endBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "endBatchEdit", params);
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

	public boolean extractText(android.view.inputmethod.ExtractedTextRequest param_0, android.view.inputmethod.ExtractedText param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "extractText", params);
	}

	protected void finalize() throws java.lang.Throwable {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "finalize", params);
	}

	public android.view.View findFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "findFocus", params);
	}

	public void findViewsWithText(java.util.ArrayList param_0, java.lang.CharSequence param_1, int param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "findViewsWithText", params);
	}

	protected boolean fitSystemWindows(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "fitSystemWindows", params);
	}

	public android.view.View focusSearch(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "focusSearch", params);
	}

	public void forceLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "forceLayout", params);
	}

	public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.accessibility.AccessibilityNodeProvider)com.tns.Platform.callJSMethod(this, "getAccessibilityNodeProvider", params);
	}

	public float getAlpha() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getAlpha", params);
	}

	public android.view.animation.Animation getAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.animation.Animation)com.tns.Platform.callJSMethod(this, "getAnimation", params);
	}

	public android.os.IBinder getApplicationWindowToken() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.IBinder)com.tns.Platform.callJSMethod(this, "getApplicationWindowToken", params);
	}

	public android.graphics.drawable.Drawable getBackground() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable)com.tns.Platform.callJSMethod(this, "getBackground", params);
	}

	public int getBaseline() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getBaseline", params);
	}

	protected float getBottomFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getBottomFadingEdgeStrength", params);
	}

	protected int getBottomPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getBottomPaddingOffset", params);
	}

	public float getCameraDistance() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getCameraDistance", params);
	}

	public int getCompoundDrawablePadding() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundDrawablePadding", params);
	}

	public android.graphics.drawable.Drawable[] getCompoundDrawables() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable[])com.tns.Platform.callJSMethod(this, "getCompoundDrawables", params);
	}

	public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.drawable.Drawable[])com.tns.Platform.callJSMethod(this, "getCompoundDrawablesRelative", params);
	}

	public int getCompoundPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingBottom", params);
	}

	public int getCompoundPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingEnd", params);
	}

	public int getCompoundPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingLeft", params);
	}

	public int getCompoundPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingRight", params);
	}

	public int getCompoundPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingStart", params);
	}

	public int getCompoundPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getCompoundPaddingTop", params);
	}

	public java.lang.CharSequence getContentDescription() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getContentDescription", params);
	}

	protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ContextMenu.ContextMenuInfo)com.tns.Platform.callJSMethod(this, "getContextMenuInfo", params);
	}

	public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ActionMode.Callback)com.tns.Platform.callJSMethod(this, "getCustomSelectionActionModeCallback", params);
	}

	protected boolean getDefaultEditable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getDefaultEditable", params);
	}

	protected android.text.method.MovementMethod getDefaultMovementMethod() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.method.MovementMethod)com.tns.Platform.callJSMethod(this, "getDefaultMovementMethod", params);
	}

	public android.view.Display getDisplay() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.Display)com.tns.Platform.callJSMethod(this, "getDisplay", params);
	}

	public android.graphics.Bitmap getDrawingCache(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.graphics.Bitmap)com.tns.Platform.callJSMethod(this, "getDrawingCache", params);
	}

	public android.graphics.Bitmap getDrawingCache() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.Bitmap)com.tns.Platform.callJSMethod(this, "getDrawingCache", params);
	}

	public int getDrawingCacheBackgroundColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDrawingCacheBackgroundColor", params);
	}

	public int getDrawingCacheQuality() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getDrawingCacheQuality", params);
	}

	public void getDrawingRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getDrawingRect", params);
	}

	public long getDrawingTime() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Long)com.tns.Platform.callJSMethod(this, "getDrawingTime", params);
	}

	public android.text.Editable getEditableText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.Editable)com.tns.Platform.callJSMethod(this, "getEditableText", params);
	}

	public android.text.TextUtils.TruncateAt getEllipsize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.TextUtils.TruncateAt)com.tns.Platform.callJSMethod(this, "getEllipsize", params);
	}

	public java.lang.CharSequence getError() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getError", params);
	}

	public int getExtendedPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getExtendedPaddingBottom", params);
	}

	public int getExtendedPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getExtendedPaddingTop", params);
	}

	public boolean getFilterTouchesWhenObscured() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFilterTouchesWhenObscured", params);
	}

	public android.text.InputFilter[] getFilters() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.InputFilter[])com.tns.Platform.callJSMethod(this, "getFilters", params);
	}

	public boolean getFitsSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFitsSystemWindows", params);
	}

	public java.util.ArrayList getFocusables(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.util.ArrayList)com.tns.Platform.callJSMethod(this, "getFocusables", params);
	}

	public void getFocusedRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getFocusedRect", params);
	}

	public boolean getFreezesText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getFreezesText", params);
	}

	public boolean getGlobalVisibleRect(android.graphics.Rect param_0, android.graphics.Point param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getGlobalVisibleRect", params);
	}

	public int getGravity() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getGravity", params);
	}

	public android.os.Handler getHandler() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.Handler)com.tns.Platform.callJSMethod(this, "getHandler", params);
	}

	public int getHighlightColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHighlightColor", params);
	}

	public java.lang.CharSequence getHint() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getHint", params);
	}

	public void getHitRect(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getHitRect", params);
	}

	public int getHorizontalFadingEdgeLength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHorizontalFadingEdgeLength", params);
	}

	protected int getHorizontalScrollbarHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getHorizontalScrollbarHeight", params);
	}

	public int getId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getId", params);
	}

	public int getImeActionId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImeActionId", params);
	}

	public java.lang.CharSequence getImeActionLabel() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getImeActionLabel", params);
	}

	public int getImeOptions() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImeOptions", params);
	}

	public int getImportantForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getImportantForAccessibility", params);
	}

	public boolean getIncludeFontPadding() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getIncludeFontPadding", params);
	}

	public android.os.Bundle getInputExtras(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.os.Bundle)com.tns.Platform.callJSMethod(this, "getInputExtras", params);
	}

	public int getInputType() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getInputType", params);
	}

	public boolean getKeepScreenOn() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "getKeepScreenOn", params);
	}

	public android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.KeyEvent.DispatcherState)com.tns.Platform.callJSMethod(this, "getKeyDispatcherState", params);
	}

	public int getLabelFor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLabelFor", params);
	}

	public int getLayerType() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLayerType", params);
	}

	public int getLayoutDirection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLayoutDirection", params);
	}

	public android.view.ViewGroup.LayoutParams getLayoutParams() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ViewGroup.LayoutParams)com.tns.Platform.callJSMethod(this, "getLayoutParams", params);
	}

	protected float getLeftFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLeftFadingEdgeStrength", params);
	}

	protected int getLeftPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLeftPaddingOffset", params);
	}

	public int getLineBounds(int param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineBounds", params);
	}

	public int getLineCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineCount", params);
	}

	public int getLineHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getLineHeight", params);
	}

	public float getLineSpacingExtra() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLineSpacingExtra", params);
	}

	public float getLineSpacingMultiplier() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getLineSpacingMultiplier", params);
	}

	public void getLocationInWindow(int[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getLocationInWindow", params);
	}

	public void getLocationOnScreen(int[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getLocationOnScreen", params);
	}

	public int getMarqueeRepeatLimit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMarqueeRepeatLimit", params);
	}

	public android.graphics.Matrix getMatrix() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.Matrix)com.tns.Platform.callJSMethod(this, "getMatrix", params);
	}

	public int getMaxEms() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxEms", params);
	}

	public int getMaxHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxHeight", params);
	}

	public int getMaxLines() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxLines", params);
	}

	public int getMaxWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMaxWidth", params);
	}

	public int getMinEms() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinEms", params);
	}

	public int getMinHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinHeight", params);
	}

	public int getMinLines() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinLines", params);
	}

	public int getMinWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinWidth", params);
	}

	public int getMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinimumHeight", params);
	}

	public int getMinimumWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getMinimumWidth", params);
	}

	public int getNextFocusDownId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusDownId", params);
	}

	public int getNextFocusForwardId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusForwardId", params);
	}

	public int getNextFocusLeftId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusLeftId", params);
	}

	public int getNextFocusRightId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusRightId", params);
	}

	public int getNextFocusUpId() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getNextFocusUpId", params);
	}

	public int getOffsetForPosition(float param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Integer)com.tns.Platform.callJSMethod(this, "getOffsetForPosition", params);
	}

	public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.View.OnFocusChangeListener)com.tns.Platform.callJSMethod(this, "getOnFocusChangeListener", params);
	}

	public int getOverScrollMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getOverScrollMode", params);
	}

	public int getPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingBottom", params);
	}

	public int getPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingEnd", params);
	}

	public int getPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingLeft", params);
	}

	public int getPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingRight", params);
	}

	public int getPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingStart", params);
	}

	public int getPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaddingTop", params);
	}

	public android.text.TextPaint getPaint() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.TextPaint)com.tns.Platform.callJSMethod(this, "getPaint", params);
	}

	public int getPaintFlags() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getPaintFlags", params);
	}

	public android.view.ViewParent getParentForAccessibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ViewParent)com.tns.Platform.callJSMethod(this, "getParentForAccessibility", params);
	}

	public float getPivotX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getPivotX", params);
	}

	public float getPivotY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getPivotY", params);
	}

	public java.lang.String getPrivateImeOptions() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "getPrivateImeOptions", params);
	}

	public android.content.res.Resources getResources() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.content.res.Resources)com.tns.Platform.callJSMethod(this, "getResources", params);
	}

	protected float getRightFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRightFadingEdgeStrength", params);
	}

	protected int getRightPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getRightPaddingOffset", params);
	}

	public android.view.View getRootView() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.View)com.tns.Platform.callJSMethod(this, "getRootView", params);
	}

	public float getRotation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotation", params);
	}

	public float getRotationX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotationX", params);
	}

	public float getRotationY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getRotationY", params);
	}

	public float getScaleX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getScaleX", params);
	}

	public float getScaleY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getScaleY", params);
	}

	public int getScrollBarDefaultDelayBeforeFade() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarDefaultDelayBeforeFade", params);
	}

	public int getScrollBarFadeDuration() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarFadeDuration", params);
	}

	public int getScrollBarSize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarSize", params);
	}

	public int getScrollBarStyle() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getScrollBarStyle", params);
	}

	public int getSelectionEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSelectionEnd", params);
	}

	public int getSelectionStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSelectionStart", params);
	}

	public int getShadowColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getShadowColor", params);
	}

	public float getShadowDx() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowDx", params);
	}

	public float getShadowDy() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowDy", params);
	}

	public float getShadowRadius() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getShadowRadius", params);
	}

	public int getSolidColor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSolidColor", params);
	}

	protected int getSuggestedMinimumHeight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSuggestedMinimumHeight", params);
	}

	protected int getSuggestedMinimumWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSuggestedMinimumWidth", params);
	}

	public int getSystemUiVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getSystemUiVisibility", params);
	}

	public java.lang.Object getTag() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getTag", params);
	}

	public java.lang.Object getTag(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (java.lang.Object)com.tns.Platform.callJSMethod(this, "getTag", params);
	}

	public java.lang.CharSequence getText() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.CharSequence)com.tns.Platform.callJSMethod(this, "getText", params);
	}

	public int getTextAlignment() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTextAlignment", params);
	}

	public int getTextDirection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTextDirection", params);
	}

	public java.util.Locale getTextLocale() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.util.Locale)com.tns.Platform.callJSMethod(this, "getTextLocale", params);
	}

	public float getTextScaleX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTextScaleX", params);
	}

	public float getTextSize() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTextSize", params);
	}

	protected float getTopFadingEdgeStrength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTopFadingEdgeStrength", params);
	}

	protected int getTopPaddingOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTopPaddingOffset", params);
	}

	public int getTotalPaddingBottom() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingBottom", params);
	}

	public int getTotalPaddingEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingEnd", params);
	}

	public int getTotalPaddingLeft() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingLeft", params);
	}

	public int getTotalPaddingRight() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingRight", params);
	}

	public int getTotalPaddingStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingStart", params);
	}

	public int getTotalPaddingTop() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getTotalPaddingTop", params);
	}

	public android.view.TouchDelegate getTouchDelegate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.TouchDelegate)com.tns.Platform.callJSMethod(this, "getTouchDelegate", params);
	}

	public java.util.ArrayList getTouchables() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.util.ArrayList)com.tns.Platform.callJSMethod(this, "getTouchables", params);
	}

	public float getTranslationX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTranslationX", params);
	}

	public float getTranslationY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getTranslationY", params);
	}

	public android.graphics.Typeface getTypeface() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.graphics.Typeface)com.tns.Platform.callJSMethod(this, "getTypeface", params);
	}

	public android.text.style.URLSpan[] getUrls() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.text.style.URLSpan[])com.tns.Platform.callJSMethod(this, "getUrls", params);
	}

	public int getVerticalFadingEdgeLength() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalFadingEdgeLength", params);
	}

	public int getVerticalScrollbarPosition() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalScrollbarPosition", params);
	}

	public int getVerticalScrollbarWidth() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVerticalScrollbarWidth", params);
	}

	public android.view.ViewTreeObserver getViewTreeObserver() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.view.ViewTreeObserver)com.tns.Platform.callJSMethod(this, "getViewTreeObserver", params);
	}

	public int getVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getVisibility", params);
	}

	protected int getWindowAttachCount() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowAttachCount", params);
	}

	public int getWindowSystemUiVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowSystemUiVisibility", params);
	}

	public android.os.IBinder getWindowToken() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.IBinder)com.tns.Platform.callJSMethod(this, "getWindowToken", params);
	}

	public int getWindowVisibility() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "getWindowVisibility", params);
	}

	public void getWindowVisibleDisplayFrame(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "getWindowVisibleDisplayFrame", params);
	}

	public float getX() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getX", params);
	}

	public float getY() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Float)com.tns.Platform.callJSMethod(this, "getY", params);
	}

	public boolean hasFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasFocus", params);
	}

	public boolean hasFocusable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasFocusable", params);
	}

	public boolean hasOnClickListeners() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasOnClickListeners", params);
	}

	public boolean hasOverlappingRendering() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasOverlappingRendering", params);
	}

	public boolean hasSelection() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasSelection", params);
	}

	public boolean hasTransientState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasTransientState", params);
	}

	public boolean hasWindowFocus() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "hasWindowFocus", params);
	}

	public int hashCode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "hashCode", params);
	}

	protected void initializeFadingEdge(android.content.res.TypedArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "initializeFadingEdge", params);
	}

	protected void initializeScrollbars(android.content.res.TypedArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "initializeScrollbars", params);
	}

	public void invalidate(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
	}

	public void invalidate(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
	}

	public void invalidate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "invalidate", params);
	}

	public void invalidateDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "invalidateDrawable", params);
	}

	public boolean isActivated() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isActivated", params);
	}

	public boolean isClickable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isClickable", params);
	}

	public boolean isCursorVisible() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isCursorVisible", params);
	}

	public boolean isDirty() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDirty", params);
	}

	public boolean isDrawingCacheEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDrawingCacheEnabled", params);
	}

	public boolean isDuplicateParentStateEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isDuplicateParentStateEnabled", params);
	}

	public boolean isEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isEnabled", params);
	}

	public boolean isFocused() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isFocused", params);
	}

	public boolean isHapticFeedbackEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHapticFeedbackEnabled", params);
	}

	public boolean isHardwareAccelerated() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHardwareAccelerated", params);
	}

	public boolean isHorizontalFadingEdgeEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHorizontalFadingEdgeEnabled", params);
	}

	public boolean isHorizontalScrollBarEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHorizontalScrollBarEnabled", params);
	}

	public boolean isHovered() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isHovered", params);
	}

	public boolean isInEditMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInEditMode", params);
	}

	public boolean isInTouchMode() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInTouchMode", params);
	}

	public boolean isInputMethodTarget() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isInputMethodTarget", params);
	}

	public boolean isLayoutRequested() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isLayoutRequested", params);
	}

	public boolean isLongClickable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isLongClickable", params);
	}

	public boolean isOpaque() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isOpaque", params);
	}

	protected boolean isPaddingOffsetRequired() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPaddingOffsetRequired", params);
	}

	public boolean isPaddingRelative() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPaddingRelative", params);
	}

	public boolean isPressed() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isPressed", params);
	}

	public boolean isSaveEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSaveEnabled", params);
	}

	public boolean isSaveFromParentEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSaveFromParentEnabled", params);
	}

	public boolean isScrollContainer() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isScrollContainer", params);
	}

	public boolean isScrollbarFadingEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isScrollbarFadingEnabled", params);
	}

	public boolean isSelected() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSelected", params);
	}

	public boolean isShown() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isShown", params);
	}

	public boolean isSoundEffectsEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSoundEffectsEnabled", params);
	}

	public boolean isSuggestionsEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isSuggestionsEnabled", params);
	}

	public boolean isTextSelectable() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isTextSelectable", params);
	}

	public boolean isVerticalFadingEdgeEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isVerticalFadingEdgeEnabled", params);
	}

	public boolean isVerticalScrollBarEnabled() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "isVerticalScrollBarEnabled", params);
	}

	public void jumpDrawablesToCurrentState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "jumpDrawablesToCurrentState", params);
	}

	public void layout(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "layout", params);
	}

	public int length() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Integer)com.tns.Platform.callJSMethod(this, "length", params);
	}

	public boolean moveCursorToVisibleOffset() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "moveCursorToVisibleOffset", params);
	}

	public void offsetLeftAndRight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "offsetLeftAndRight", params);
	}

	public void offsetTopAndBottom(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "offsetTopAndBottom", params);
	}

	protected void onAnimationEnd() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAnimationEnd", params);
	}

	protected void onAnimationStart() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAnimationStart", params);
	}

	protected void onAttachedToWindow() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onAttachedToWindow", params);
	}

	public void onBeginBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onBeginBatchEdit", params);
	}

	public boolean onCheckIsTextEditor() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onCheckIsTextEditor", params);
	}

	public void onCommitCompletion(android.view.inputmethod.CompletionInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCommitCompletion", params);
	}

	public void onCommitCorrection(android.view.inputmethod.CorrectionInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCommitCorrection", params);
	}

	protected void onConfigurationChanged(android.content.res.Configuration param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onConfigurationChanged", params);
	}

	protected void onCreateContextMenu(android.view.ContextMenu param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onCreateContextMenu", params);
	}

	protected int[] onCreateDrawableState(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (int[])com.tns.Platform.callJSMethod(this, "onCreateDrawableState", params);
	}

	public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.inputmethod.InputConnection)com.tns.Platform.callJSMethod(this, "onCreateInputConnection", params);
	}

	protected void onDetachedFromWindow() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onDetachedFromWindow", params);
	}

	protected void onDisplayHint(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onDisplayHint", params);
	}

	public boolean onDragEvent(android.view.DragEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onDragEvent", params);
	}

	protected void onDraw(android.graphics.Canvas param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onDraw", params);
	}

	public void onEditorAction(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onEditorAction", params);
	}

	public void onEndBatchEdit() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onEndBatchEdit", params);
	}

	public boolean onFilterTouchEventForSecurity(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onFilterTouchEventForSecurity", params);
	}

	protected void onFinishInflate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onFinishInflate", params);
	}

	public void onFinishTemporaryDetach() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onFinishTemporaryDetach", params);
	}

	protected void onFocusChanged(boolean param_0, int param_1, android.graphics.Rect param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "onFocusChanged", params);
	}

	public boolean onGenericMotionEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onGenericMotionEvent", params);
	}

	public void onHoverChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onHoverChanged", params);
	}

	public boolean onHoverEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onHoverEvent", params);
	}

	public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onInitializeAccessibilityEvent", params);
	}

	public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onInitializeAccessibilityNodeInfo", params);
	}

	public boolean onKeyDown(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyDown", params);
	}

	public boolean onKeyLongPress(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyLongPress", params);
	}

	public boolean onKeyMultiple(int param_0, int param_1, android.view.KeyEvent param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyMultiple", params);
	}

	public boolean onKeyPreIme(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyPreIme", params);
	}

	public boolean onKeyShortcut(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyShortcut", params);
	}

	public boolean onKeyUp(int param_0, android.view.KeyEvent param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onKeyUp", params);
	}

	protected void onLayout(boolean param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "onLayout", params);
	}

	protected void onMeasure(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onMeasure", params);
	}

	protected void onOverScrolled(int param_0, int param_1, boolean param_2, boolean param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onOverScrolled", params);
	}

	public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onPopulateAccessibilityEvent", params);
	}

	public boolean onPreDraw() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onPreDraw", params);
	}

	public boolean onPrivateIMECommand(java.lang.String param_0, android.os.Bundle param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onPrivateIMECommand", params);
	}

	public void onRestoreInstanceState(android.os.Parcelable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onRestoreInstanceState", params);
	}

	public void onRtlPropertiesChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onRtlPropertiesChanged", params);
	}

	public android.os.Parcelable onSaveInstanceState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (android.os.Parcelable)com.tns.Platform.callJSMethod(this, "onSaveInstanceState", params);
	}

	public void onScreenStateChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onScreenStateChanged", params);
	}

	protected void onScrollChanged(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onScrollChanged", params);
	}

	protected void onSelectionChanged(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onSelectionChanged", params);
	}

	protected boolean onSetAlpha(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onSetAlpha", params);
	}

	protected void onSizeChanged(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onSizeChanged", params);
	}

	public void onStartTemporaryDetach() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "onStartTemporaryDetach", params);
	}

	protected void onTextChanged(java.lang.CharSequence param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "onTextChanged", params);
	}

	public boolean onTextContextMenuItem(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTextContextMenuItem", params);
	}

	public boolean onTouchEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTouchEvent", params);
	}

	public boolean onTrackballEvent(android.view.MotionEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "onTrackballEvent", params);
	}

	protected void onVisibilityChanged(android.view.View param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "onVisibilityChanged", params);
	}

	public void onWindowFocusChanged(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowFocusChanged", params);
	}

	public void onWindowSystemUiVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowSystemUiVisibilityChanged", params);
	}

	protected void onWindowVisibilityChanged(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "onWindowVisibilityChanged", params);
	}

	protected boolean overScrollBy(int param_0, int param_1, int param_2, int param_3, int param_4, int param_5, int param_6, int param_7, boolean param_8) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
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
	}

	public boolean performAccessibilityAction(int param_0, android.os.Bundle param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performAccessibilityAction", params);
	}

	public boolean performClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performClick", params);
	}

	public boolean performHapticFeedback(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performHapticFeedback", params);
	}

	public boolean performHapticFeedback(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performHapticFeedback", params);
	}

	public boolean performLongClick() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "performLongClick", params);
	}

	public void playSoundEffect(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "playSoundEffect", params);
	}

	public boolean post(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "post", params);
	}

	public boolean postDelayed(java.lang.Runnable param_0, long param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "postDelayed", params);
	}

	public void postInvalidate() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "postInvalidate", params);
	}

	public void postInvalidate(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "postInvalidate", params);
	}

	public void postInvalidateDelayed(long param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "postInvalidateDelayed", params);
	}

	public void postInvalidateDelayed(long param_0, int param_1, int param_2, int param_3, int param_4) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[5];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			params[4] = param_4;
			com.tns.Platform.callJSMethod(this, "postInvalidateDelayed", params);
	}

	public void postInvalidateOnAnimation() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "postInvalidateOnAnimation", params);
	}

	public void postInvalidateOnAnimation(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "postInvalidateOnAnimation", params);
	}

	public void postOnAnimation(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "postOnAnimation", params);
	}

	public void postOnAnimationDelayed(java.lang.Runnable param_0, long param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "postOnAnimationDelayed", params);
	}

	public void refreshDrawableState() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "refreshDrawableState", params);
	}

	public boolean removeCallbacks(java.lang.Runnable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "removeCallbacks", params);
	}

	public void removeOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeOnAttachStateChangeListener", params);
	}

	public void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeOnLayoutChangeListener", params);
	}

	public void removeTextChangedListener(android.text.TextWatcher param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "removeTextChangedListener", params);
	}

	public void requestFitSystemWindows() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "requestFitSystemWindows", params);
	}

	public boolean requestFocus(int param_0, android.graphics.Rect param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestFocus", params);
	}

	public void requestLayout() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "requestLayout", params);
	}

	public boolean requestRectangleOnScreen(android.graphics.Rect param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestRectangleOnScreen", params);
	}

	public boolean requestRectangleOnScreen(android.graphics.Rect param_0, boolean param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			return (Boolean)com.tns.Platform.callJSMethod(this, "requestRectangleOnScreen", params);
	}

	public void restoreHierarchyState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "restoreHierarchyState", params);
	}

	public void saveHierarchyState(android.util.SparseArray param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "saveHierarchyState", params);
	}

	public void scheduleDrawable(android.graphics.drawable.Drawable param_0, java.lang.Runnable param_1, long param_2) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[3];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			com.tns.Platform.callJSMethod(this, "scheduleDrawable", params);
	}

	public void scrollBy(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "scrollBy", params);
	}

	public void scrollTo(int param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "scrollTo", params);
	}

	public void sendAccessibilityEvent(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "sendAccessibilityEvent", params);
	}

	public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "sendAccessibilityEventUnchecked", params);
	}

	public void setAccessibilityDelegate(android.view.View.AccessibilityDelegate param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAccessibilityDelegate", params);
	}

	public void setActivated(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setActivated", params);
	}

	public void setAllCaps(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAllCaps", params);
	}

	public void setAlpha(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAlpha", params);
	}

	public void setAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setAnimation", params);
	}

	public void setBackground(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackground", params);
	}

	public void setBackgroundColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundColor", params);
	}

	public void setBackgroundDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundDrawable", params);
	}

	public void setBackgroundResource(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setBackgroundResource", params);
	}

	public void setCameraDistance(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCameraDistance", params);
	}

	public void setClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setClickable", params);
	}

	public void setCompoundDrawablePadding(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablePadding", params);
	}

	public void setCompoundDrawables(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawables", params);
	}

	public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelative", params);
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelativeWithIntrinsicBounds", params);
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesRelativeWithIntrinsicBounds", params);
	}

	public void setCompoundDrawablesWithIntrinsicBounds(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesWithIntrinsicBounds", params);
	}

	public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable param_0, android.graphics.drawable.Drawable param_1, android.graphics.drawable.Drawable param_2, android.graphics.drawable.Drawable param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setCompoundDrawablesWithIntrinsicBounds", params);
	}

	public void setContentDescription(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setContentDescription", params);
	}

	public void setCursorVisible(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCursorVisible", params);
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setCustomSelectionActionModeCallback", params);
	}

	public void setDrawingCacheBackgroundColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheBackgroundColor", params);
	}

	public void setDrawingCacheEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheEnabled", params);
	}

	public void setDrawingCacheQuality(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDrawingCacheQuality", params);
	}

	public void setDuplicateParentStateEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setDuplicateParentStateEnabled", params);
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEllipsize", params);
	}

	public void setEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEms", params);
	}

	public void setEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setEnabled", params);
	}

	public void setError(java.lang.CharSequence param_0, android.graphics.drawable.Drawable param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setError", params);
	}

	public void setError(java.lang.CharSequence param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setError", params);
	}

	public void setExtractedText(android.view.inputmethod.ExtractedText param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setExtractedText", params);
	}

	public void setFadingEdgeLength(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFadingEdgeLength", params);
	}

	public void setFilterTouchesWhenObscured(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFilterTouchesWhenObscured", params);
	}

	public void setFilters(android.text.InputFilter[] param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFilters", params);
	}

	public void setFitsSystemWindows(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFitsSystemWindows", params);
	}

	public void setFocusable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFocusable", params);
	}

	public void setFocusableInTouchMode(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFocusableInTouchMode", params);
	}

	protected boolean setFrame(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			return (Boolean)com.tns.Platform.callJSMethod(this, "setFrame", params);
	}

	public void setFreezesText(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setFreezesText", params);
	}

	public void setGravity(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setGravity", params);
	}

	public void setHapticFeedbackEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHapticFeedbackEnabled", params);
	}

	public void setHasTransientState(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHasTransientState", params);
	}

	public void setHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHeight", params);
	}

	public void setHighlightColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHighlightColor", params);
	}

	public void setHorizontalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontalFadingEdgeEnabled", params);
	}

	public void setHorizontalScrollBarEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontalScrollBarEnabled", params);
	}

	public void setHorizontallyScrolling(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHorizontallyScrolling", params);
	}

	public void setHovered(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setHovered", params);
	}

	public void setId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setId", params);
	}

	public void setImeActionLabel(java.lang.CharSequence param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setImeActionLabel", params);
	}

	public void setImeOptions(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setImeOptions", params);
	}

	public void setImportantForAccessibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setImportantForAccessibility", params);
	}

	public void setIncludeFontPadding(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setIncludeFontPadding", params);
	}

	public void setInputExtras(int param_0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setInputExtras", params);
	}

	public void setInputType(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setInputType", params);
	}

	public void setKeepScreenOn(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setKeepScreenOn", params);
	}

	public void setKeyListener(android.text.method.KeyListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setKeyListener", params);
	}

	public void setLabelFor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLabelFor", params);
	}

	public void setLayerPaint(android.graphics.Paint param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayerPaint", params);
	}

	public void setLayerType(int param_0, android.graphics.Paint param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setLayerType", params);
	}

	public void setLayoutDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutDirection", params);
	}

	public void setLayoutParams(android.view.ViewGroup.LayoutParams param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLayoutParams", params);
	}

	public void setLineSpacing(float param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setLineSpacing", params);
	}

	public void setLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLines", params);
	}

	public void setLongClickable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setLongClickable", params);
	}

	public void setMarqueeRepeatLimit(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMarqueeRepeatLimit", params);
	}

	public void setMaxEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxEms", params);
	}

	public void setMaxHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxHeight", params);
	}

	public void setMaxLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxLines", params);
	}

	public void setMaxWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMaxWidth", params);
	}

	public void setMinEms(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinEms", params);
	}

	public void setMinHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinHeight", params);
	}

	public void setMinLines(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinLines", params);
	}

	public void setMinWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinWidth", params);
	}

	public void setMinimumHeight(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinimumHeight", params);
	}

	public void setMinimumWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setMinimumWidth", params);
	}

	public void setNextFocusDownId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusDownId", params);
	}

	public void setNextFocusForwardId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusForwardId", params);
	}

	public void setNextFocusLeftId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusLeftId", params);
	}

	public void setNextFocusRightId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusRightId", params);
	}

	public void setNextFocusUpId(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setNextFocusUpId", params);
	}

	public void setOnClickListener(android.view.View.OnClickListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnClickListener", params);
	}

	public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnCreateContextMenuListener", params);
	}

	public void setOnDragListener(android.view.View.OnDragListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnDragListener", params);
	}

	public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnEditorActionListener", params);
	}

	public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnFocusChangeListener", params);
	}

	public void setOnGenericMotionListener(android.view.View.OnGenericMotionListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnGenericMotionListener", params);
	}

	public void setOnHoverListener(android.view.View.OnHoverListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnHoverListener", params);
	}

	public void setOnKeyListener(android.view.View.OnKeyListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnKeyListener", params);
	}

	public void setOnLongClickListener(android.view.View.OnLongClickListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnLongClickListener", params);
	}

	public void setOnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnSystemUiVisibilityChangeListener", params);
	}

	public void setOnTouchListener(android.view.View.OnTouchListener param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOnTouchListener", params);
	}

	public void setOverScrollMode(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setOverScrollMode", params);
	}

	public void setPadding(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setPadding", params);
	}

	public void setPaddingRelative(int param_0, int param_1, int param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setPaddingRelative", params);
	}

	public void setPaintFlags(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPaintFlags", params);
	}

	public void setPivotX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPivotX", params);
	}

	public void setPivotY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPivotY", params);
	}

	public void setPressed(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPressed", params);
	}

	public void setPrivateImeOptions(java.lang.String param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setPrivateImeOptions", params);
	}

	public void setRawInputType(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRawInputType", params);
	}

	public void setRotation(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotation", params);
	}

	public void setRotationX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotationX", params);
	}

	public void setRotationY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setRotationY", params);
	}

	public void setSaveEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSaveEnabled", params);
	}

	public void setSaveFromParentEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSaveFromParentEnabled", params);
	}

	public void setScaleX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScaleX", params);
	}

	public void setScaleY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScaleY", params);
	}

	public void setScrollBarDefaultDelayBeforeFade(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarDefaultDelayBeforeFade", params);
	}

	public void setScrollBarFadeDuration(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarFadeDuration", params);
	}

	public void setScrollBarSize(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarSize", params);
	}

	public void setScrollBarStyle(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollBarStyle", params);
	}

	public void setScrollContainer(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollContainer", params);
	}

	public void setScrollX(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollX", params);
	}

	public void setScrollY(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollY", params);
	}

	public void setScrollbarFadingEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScrollbarFadingEnabled", params);
	}

	public void setScroller(android.widget.Scroller param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setScroller", params);
	}

	public void setSelectAllOnFocus(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSelectAllOnFocus", params);
	}

	public void setSelected(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSelected", params);
	}

	public void setShadowLayer(float param_0, float param_1, float param_2, int param_3) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[4];
			params[0] = param_0;
			params[1] = param_1;
			params[2] = param_2;
			params[3] = param_3;
			com.tns.Platform.callJSMethod(this, "setShadowLayer", params);
	}

	public void setSingleLine() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			com.tns.Platform.callJSMethod(this, "setSingleLine", params);
	}

	public void setSingleLine(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSingleLine", params);
	}

	public void setSoundEffectsEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSoundEffectsEnabled", params);
	}

	public void setSystemUiVisibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setSystemUiVisibility", params);
	}

	public void setTag(int param_0, java.lang.Object param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTag", params);
	}

	public void setTag(java.lang.Object param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTag", params);
	}

	public void setText(java.lang.CharSequence param_0, android.widget.TextView.BufferType param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setText", params);
	}

	public void setTextAlignment(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextAlignment", params);
	}

	public void setTextAppearance(android.content.Context param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTextAppearance", params);
	}

	public void setTextColor(android.content.res.ColorStateList param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextColor", params);
	}

	public void setTextColor(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextColor", params);
	}

	public void setTextDirection(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextDirection", params);
	}

	public void setTextIsSelectable(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextIsSelectable", params);
	}

	public void setTextLocale(java.util.Locale param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextLocale", params);
	}

	public void setTextScaleX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextScaleX", params);
	}

	public void setTextSize(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTextSize", params);
	}

	public void setTextSize(int param_0, float param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTextSize", params);
	}

	public void setTouchDelegate(android.view.TouchDelegate param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTouchDelegate", params);
	}

	public void setTranslationX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTranslationX", params);
	}

	public void setTranslationY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTranslationY", params);
	}

	public void setTypeface(android.graphics.Typeface param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setTypeface", params);
	}

	public void setTypeface(android.graphics.Typeface param_0, int param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "setTypeface", params);
	}

	public void setVerticalFadingEdgeEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalFadingEdgeEnabled", params);
	}

	public void setVerticalScrollBarEnabled(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalScrollBarEnabled", params);
	}

	public void setVerticalScrollbarPosition(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVerticalScrollbarPosition", params);
	}

	public void setVisibility(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setVisibility", params);
	}

	public void setWidth(int param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWidth", params);
	}

	public void setWillNotCacheDrawing(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWillNotCacheDrawing", params);
	}

	public void setWillNotDraw(boolean param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setWillNotDraw", params);
	}

	public void setX(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setX", params);
	}

	public void setY(float param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "setY", params);
	}

	public boolean showContextMenu() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "showContextMenu", params);
	}

	public android.view.ActionMode startActionMode(android.view.ActionMode.Callback param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (android.view.ActionMode)com.tns.Platform.callJSMethod(this, "startActionMode", params);
	}

	public void startAnimation(android.view.animation.Animation param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "startAnimation", params);
	}

	public java.lang.String toString() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (java.lang.String)com.tns.Platform.callJSMethod(this, "toString", params);
	}

	public void unscheduleDrawable(android.graphics.drawable.Drawable param_0, java.lang.Runnable param_1) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[2];
			params[0] = param_0;
			params[1] = param_1;
			com.tns.Platform.callJSMethod(this, "unscheduleDrawable", params);
	}

	public void unscheduleDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			com.tns.Platform.callJSMethod(this, "unscheduleDrawable", params);
	}

	protected boolean verifyDrawable(android.graphics.drawable.Drawable param_0) {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = new Object[1];
			params[0] = param_0;
			return (Boolean)com.tns.Platform.callJSMethod(this, "verifyDrawable", params);
	}

	public boolean willNotCacheDrawing() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "willNotCacheDrawing", params);
	}

	public boolean willNotDraw() {
		if (!__initialized) {
			__initialized = true;
			com.tns.Platform.initInstance(this);
		}
			java.lang.Object[] params = null;
			return (Boolean)com.tns.Platform.callJSMethod(this, "willNotDraw", params);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}
	public int hashCode__super() {
		return super.hashCode();
	}
	private boolean __initialized;
}
