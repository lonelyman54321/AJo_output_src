/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package androidx.slidingpanelayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

public final class SlidingPaneLayout$b
extends a {
    public final Rect a;
    public final /* synthetic */ SlidingPaneLayout b;

    public SlidingPaneLayout$b(SlidingPaneLayout slidingPaneLayout) {
        this.b = slidingPaneLayout;
        this.a = slidingPaneLayout;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    public final void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        int n3 = 1;
        Object object2 = AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)c2.a);
        Object object3 = new C2((AccessibilityNodeInfo)object2);
        super.onInitializeAccessibilityNodeInfo((View)object, (C2)object3);
        object3 = this.a;
        object2.getBoundsInScreen((Rect)object3);
        c2.k((Rect)object3);
        int n4 = object2.isVisibleToUser();
        AccessibilityNodeInfo accessibilityNodeInfo = c2.a;
        accessibilityNodeInfo.setVisibleToUser(n4 != 0);
        object3 = object2.getPackageName();
        accessibilityNodeInfo.setPackageName((CharSequence)object3);
        object3 = object2.getClassName();
        c2.l((CharSequence)object3);
        object3 = object2.getContentDescription();
        c2.o((CharSequence)object3);
        n4 = object2.isEnabled();
        accessibilityNodeInfo.setEnabled(n4 != 0);
        n4 = object2.isClickable();
        accessibilityNodeInfo.setClickable(n4 != 0);
        n4 = object2.isFocusable();
        accessibilityNodeInfo.setFocusable(n4 != 0);
        n4 = object2.isFocused();
        accessibilityNodeInfo.setFocused(n4 != 0);
        n4 = object2.isAccessibilityFocused();
        c2.h(n4 != 0);
        n4 = object2.isSelected();
        accessibilityNodeInfo.setSelected(n4 != 0);
        n4 = object2.isLongClickable();
        accessibilityNodeInfo.setLongClickable(n4 != 0);
        n4 = object2.getActions();
        c2.a(n4);
        int n7 = object2.getMovementGranularities();
        accessibilityNodeInfo.setMovementGranularities(n7);
        object2 = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
        c2.l((CharSequence)object2);
        c2.c = n7 = -1;
        accessibilityNodeInfo.setSource((View)object);
        object3 = ViewCompat.a;
        object = object.getParentForAccessibility();
        n4 = object instanceof View;
        if (n4 != 0) {
            object = (View)object;
            c2.b = n7;
            accessibilityNodeInfo.setParent((View)object);
        }
        object = this.b;
        int n8 = object.getChildCount();
        object2 = null;
        for (n7 = 0; n7 < n8; n7 += n3) {
            object3 = object.getChildAt(n7);
            int n10 = ((SlidingPaneLayout)((Object)object)).a((View)object3);
            if (n10 != 0 || (n10 = object3.getVisibility()) != 0) continue;
            object3.setImportantForAccessibility(n3);
            accessibilityNodeInfo.addChild((View)object3);
        }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        SlidingPaneLayout slidingPaneLayout = this.b;
        boolean bl2 = slidingPaneLayout.a(view);
        if (!bl2) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}

