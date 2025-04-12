/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

public final class DrawerLayout$c
extends a {
    public final Rect a;
    public final /* synthetic */ DrawerLayout b;

    public DrawerLayout$c(DrawerLayout drawerLayout) {
        this.b = drawerLayout;
        this.a = drawerLayout;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View object, AccessibilityEvent object2) {
        int n3;
        int n4 = object2.getEventType();
        if (n4 == (n3 = 32)) {
            object = object2.getText();
            object2 = this.b;
            View view = object2.findVisibleDrawer();
            if (view != null && (object2 = object2.getDrawerTitle(n4 = object2.getDrawerViewAbsoluteGravity(view))) != null) {
                object.add(object2);
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent((View)object, (AccessibilityEvent)object2);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        int n3 = DrawerLayout.CAN_HIDE_DESCENDANTS;
        if (n3 != 0) {
            super.onInitializeAccessibilityNodeInfo(view, c2);
        } else {
            int n4;
            AccessibilityNodeInfo accessibilityNodeInfo = AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)c2.a);
            Object object = new C2(accessibilityNodeInfo);
            super.onInitializeAccessibilityNodeInfo(view, (C2)object);
            c2.c = n4 = -1;
            AccessibilityNodeInfo accessibilityNodeInfo2 = c2.a;
            accessibilityNodeInfo2.setSource(view);
            WeakHashMap weakHashMap = ViewCompat.a;
            weakHashMap = view.getParentForAccessibility();
            boolean bl2 = weakHashMap instanceof View;
            if (bl2) {
                weakHashMap = (View)weakHashMap;
                c2.b = n4;
                accessibilityNodeInfo2.setParent((View)weakHashMap);
            }
            object = this.a;
            accessibilityNodeInfo.getBoundsInScreen((Rect)object);
            c2.k((Rect)object);
            n4 = (int)(accessibilityNodeInfo.isVisibleToUser() ? 1 : 0);
            accessibilityNodeInfo2.setVisibleToUser(n4 != 0);
            object = accessibilityNodeInfo.getPackageName();
            accessibilityNodeInfo2.setPackageName((CharSequence)object);
            object = accessibilityNodeInfo.getClassName();
            c2.l((CharSequence)object);
            object = accessibilityNodeInfo.getContentDescription();
            c2.o((CharSequence)object);
            n4 = accessibilityNodeInfo.isEnabled();
            accessibilityNodeInfo2.setEnabled(n4 != 0);
            n4 = accessibilityNodeInfo.isFocused();
            accessibilityNodeInfo2.setFocused(n4 != 0);
            n4 = accessibilityNodeInfo.isAccessibilityFocused();
            c2.h(n4 != 0);
            n4 = accessibilityNodeInfo.isSelected();
            accessibilityNodeInfo2.setSelected(n4 != 0);
            n3 = accessibilityNodeInfo.getActions();
            c2.a(n3);
            view = (ViewGroup)view;
            n3 = view.getChildCount();
            object = null;
            for (n4 = 0; n4 < n3; ++n4) {
                weakHashMap = view.getChildAt(n4);
                bl2 = DrawerLayout.includeChildForAccessibility((View)weakHashMap);
                if (!bl2) continue;
                accessibilityNodeInfo2.addChild((View)weakHashMap);
            }
        }
        c2.l("androidx.drawerlayout.widget.DrawerLayout");
        view = c2.a;
        view.setFocusable(false);
        view.setFocused(false);
        c2 = (AccessibilityNodeInfo.AccessibilityAction)C2$a.e.a;
        view.removeAction((AccessibilityNodeInfo.AccessibilityAction)c2);
        c2 = (AccessibilityNodeInfo.AccessibilityAction)C2$a.f.a;
        view.removeAction((AccessibilityNodeInfo.AccessibilityAction)c2);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean bl2 = DrawerLayout.CAN_HIDE_DESCENDANTS;
        if (!bl2 && !(bl2 = DrawerLayout.includeChildForAccessibility(view))) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}

