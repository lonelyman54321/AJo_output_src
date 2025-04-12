/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
 */
package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class BottomSheetDragHandleView
extends AppCompatImageView
implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = R$style.Widget_Material3_BottomSheet_DragHandle;
    private final AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;
    private BottomSheetBehavior bottomSheetBehavior;
    private final BottomSheetBehavior$BottomSheetCallback bottomSheetCallback;
    private final String clickFeedback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private boolean interactable;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.bottomSheetDragHandleStyle;
        this(context, attributeSet, n3);
    }

    public BottomSheetDragHandleView(Context object, AttributeSet attributeSet, int n3) {
        int n4 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, n4);
        super((Context)object, attributeSet, n3);
        object = this.getResources();
        int n7 = R$string.bottomsheet_action_expand;
        object = object.getString(n7);
        this.clickToExpandActionLabel = object;
        object = this.getResources();
        n7 = R$string.bottomsheet_action_collapse;
        object = object.getString(n7);
        this.clickToCollapseActionLabel = object;
        object = this.getResources();
        n7 = R$string.bottomsheet_drag_handle_clicked;
        object = object.getString(n7);
        this.clickFeedback = object;
        super(this);
        this.bottomSheetCallback = object;
        object = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.accessibilityManager = object;
        this.updateInteractableState();
        super(this);
        ViewCompat.s((View)this, (a)object);
    }

    public static /* synthetic */ void access$000(BottomSheetDragHandleView bottomSheetDragHandleView, int n3) {
        bottomSheetDragHandleView.onBottomSheetStateChanged(n3);
    }

    public static /* synthetic */ boolean access$100(BottomSheetDragHandleView bottomSheetDragHandleView) {
        return bottomSheetDragHandleView.expandOrCollapseBottomSheetIfPossible();
    }

    private void announceAccessibilityEvent(String string2) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null) {
            return;
        }
        accessibilityManager = AccessibilityEvent.obtain((int)16384);
        accessibilityManager.getText().add(string2);
        this.accessibilityManager.sendAccessibilityEvent((AccessibilityEvent)accessibilityManager);
    }

    public static /* synthetic */ boolean d(BottomSheetDragHandleView bottomSheetDragHandleView, View view, E2$a e2$a) {
        return bottomSheetDragHandleView.lambda$onBottomSheetStateChanged$0(view, e2$a);
    }

    private boolean expandOrCollapseBottomSheetIfPossible() {
        boolean bl2;
        boolean n3 = this.interactable;
        boolean bl3 = false;
        if (!n3) {
            return false;
        }
        Object object = this.clickFeedback;
        this.announceAccessibilityEvent((String)object);
        object = this.bottomSheetBehavior;
        boolean bl4 = ((BottomSheetBehavior)object).isFitToContents();
        boolean bl5 = true;
        if (!bl4 && !(bl2 = ((BottomSheetBehavior)(object = this.bottomSheetBehavior)).shouldSkipHalfExpandedStateWhenDragging())) {
            bl3 = true;
        }
        object = this.bottomSheetBehavior;
        int n4 = ((BottomSheetBehavior)object).getState();
        int n7 = 6;
        int n8 = 3;
        int n10 = 4;
        if (n4 == n10) {
            if (!bl3) {
                n7 = 3;
            }
        } else if (n4 == n8) {
            if (!bl3) {
                n7 = 4;
            }
        } else {
            boolean bl6 = this.clickToExpand;
            if (!bl6) {
                n8 = 4;
            }
            n7 = n8;
        }
        this.bottomSheetBehavior.setState(n7);
        return bl5;
    }

    private BottomSheetBehavior findParentBottomSheetBehavior() {
        BottomSheetDragHandleView bottomSheetDragHandleView = this;
        while ((bottomSheetDragHandleView = BottomSheetDragHandleView.getParentView((View)bottomSheetDragHandleView)) != null) {
            Object object = bottomSheetDragHandleView.getLayoutParams();
            boolean bl2 = object instanceof CoordinatorLayout$e;
            if (!bl2 || !(bl2 = (object = ((CoordinatorLayout$e)((Object)object)).a) instanceof BottomSheetBehavior)) continue;
            return (BottomSheetBehavior)object;
        }
        return null;
    }

    private static View getParentView(View view) {
        boolean bl2 = (view = view.getParent()) instanceof View;
        if (!bl2) {
            view = null;
        }
        return view;
    }

    private /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, E2$a e2$a) {
        return this.expandOrCollapseBottomSheetIfPossible();
    }

    private void onBottomSheetStateChanged(int n3) {
        C2$a c2$a;
        int n4 = 4;
        if (n3 == n4) {
            n3 = 1;
            this.clickToExpand = n3;
        } else {
            n4 = 3;
            if (n3 == n4) {
                n3 = 0;
                c2$a = null;
                this.clickToExpand = false;
            }
        }
        c2$a = C2$a.g;
        n4 = (int)(this.clickToExpand ? 1 : 0);
        String string2 = n4 != 0 ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel;
        zz_0 zz_02 = new zz_0((Object)this);
        ViewCompat.q((View)this, c2$a, string2, zz_02);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior bottomSheetBehavior) {
        Object object = this.bottomSheetBehavior;
        if (object != null) {
            BottomSheetBehavior$BottomSheetCallback bottomSheetBehavior$BottomSheetCallback = this.bottomSheetCallback;
            ((BottomSheetBehavior)object).removeBottomSheetCallback(bottomSheetBehavior$BottomSheetCallback);
            object = this.bottomSheetBehavior;
            bottomSheetBehavior$BottomSheetCallback = null;
            ((BottomSheetBehavior)object).setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView((View)this);
            int n3 = this.bottomSheetBehavior.getState();
            this.onBottomSheetStateChanged(n3);
            bottomSheetBehavior = this.bottomSheetBehavior;
            object = this.bottomSheetCallback;
            bottomSheetBehavior.addBottomSheetCallback((BottomSheetBehavior$BottomSheetCallback)object);
        }
        this.updateInteractableState();
    }

    private void updateInteractableState() {
        Object object;
        boolean bl2 = this.accessibilityServiceEnabled;
        int n3 = 1;
        if (bl2 && (object = this.bottomSheetBehavior) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.interactable = bl2;
        object = this.bottomSheetBehavior;
        if (object == null) {
            n3 = 2;
        }
        object = ViewCompat.a;
        this.setImportantForAccessibility(n3);
        bl2 = this.interactable;
        this.setClickable(bl2);
    }

    public void onAccessibilityStateChanged(boolean bl2) {
        this.accessibilityServiceEnabled = bl2;
        this.updateInteractableState();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior bottomSheetBehavior = this.findParentBottomSheetBehavior();
        this.setBottomSheetBehavior(bottomSheetBehavior);
        bottomSheetBehavior = this.accessibilityManager;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addAccessibilityStateChangeListener(this);
            bottomSheetBehavior = this.accessibilityManager;
            boolean bl2 = bottomSheetBehavior.isEnabled();
            this.onAccessibilityStateChanged(bl2);
        }
    }

    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener)this);
        }
        this.setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }
}

