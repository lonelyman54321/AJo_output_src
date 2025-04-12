/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.ScrollView
 */
package androidx.core.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.a;
import androidx.core.widget.NestedScrollView;

public final class NestedScrollView$a
extends a {
    public final void onInitializeAccessibilityEvent(View object, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent((View)object, accessibilityEvent);
        object = (NestedScrollView)object;
        String string2 = ScrollView.class.getName();
        accessibilityEvent.setClassName((CharSequence)string2);
        int n3 = ((NestedScrollView)object).getScrollRange();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        accessibilityEvent.setScrollable(n3 != 0);
        n3 = object.getScrollX();
        accessibilityEvent.setScrollX(n3);
        n3 = object.getScrollY();
        accessibilityEvent.setScrollY(n3);
        n3 = object.getScrollX();
        accessibilityEvent.setMaxScrollX(n3);
        int n4 = ((NestedScrollView)object).getScrollRange();
        accessibilityEvent.setMaxScrollY(n4);
    }

    public final void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        object = (NestedScrollView)object;
        String string2 = ScrollView.class.getName();
        c2.l(string2);
        int n3 = object.isEnabled();
        if (n3 != 0 && (n3 = ((NestedScrollView)object).getScrollRange()) > 0) {
            int n4;
            c2.r(true);
            int n7 = object.getScrollY();
            if (n7 > 0) {
                C2$a c2$a = C2$a.k;
                c2.b(c2$a);
                c2$a = C2$a.p;
                c2.b(c2$a);
            }
            if ((n4 = object.getScrollY()) < n3) {
                object = C2$a.j;
                c2.b((C2$a)object);
                object = C2$a.r;
                c2.b((C2$a)object);
            }
        }
    }

    public final boolean performAccessibilityAction(View object, int n3, Bundle bundle) {
        int n4;
        int n7 = super.performAccessibilityAction((View)object, n3, bundle);
        boolean bl2 = true;
        if (n7 != 0) {
            return bl2;
        }
        object = (NestedScrollView)object;
        n7 = object.isEnabled();
        int n8 = 0;
        if (n7 == 0) {
            return false;
        }
        n7 = object.getHeight();
        Rect rect = new Rect();
        Matrix matrix = object.getMatrix();
        boolean bl3 = matrix.isIdentity();
        if (bl3 && (bl3 = object.getGlobalVisibleRect(rect))) {
            n7 = rect.height();
        }
        if (n3 != (n4 = 4096)) {
            n4 = 8192;
            if (n3 != n4 && n3 != (n4 = 16908344)) {
                n4 = 16908346;
                if (n3 != n4) {
                    return false;
                }
            } else {
                n3 = object.getPaddingBottom();
                n7 -= n3;
                n3 = object.getPaddingTop();
                n7 -= n3;
                n3 = Math.max(object.getScrollY() - n7, 0);
                if (n3 != (n7 = object.getScrollY())) {
                    n7 = object.getScrollX();
                    n8 = 0 - n7;
                    n7 = object.getScrollY();
                    ((NestedScrollView)object).p(n8, n3 -= n7, bl2);
                    return bl2;
                }
                return false;
            }
        }
        n3 = object.getPaddingBottom();
        n7 -= n3;
        n3 = object.getPaddingTop();
        n7 -= n3;
        n3 = object.getScrollY() + n7;
        n7 = ((NestedScrollView)object).getScrollRange();
        if ((n3 = Math.min(n3, n7)) != (n7 = object.getScrollY())) {
            n7 = object.getScrollX();
            n8 = 0 - n7;
            n7 = object.getScrollY();
            ((NestedScrollView)object).p(n8, n3 -= n7, bl2);
            return bl2;
        }
        return false;
    }
}

