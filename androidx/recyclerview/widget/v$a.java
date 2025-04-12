/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.v;
import java.util.WeakHashMap;

public final class v$a
extends a {
    public final v a;
    public final WeakHashMap b;

    public v$a(v v4) {
        WeakHashMap weakHashMap;
        this.b = weakHashMap = new WeakHashMap();
        this.a = v4;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            return a2.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final D2 getAccessibilityNodeProvider(View view) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            return a2.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            a2.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        RecyclerView$o recyclerView$o;
        a a2 = this.a;
        boolean bl2 = ((v)a2).shouldIgnore();
        if (!bl2 && (recyclerView$o = ((v)a2).mRecyclerView.getLayoutManager()) != null) {
            ((v)a2).mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c2);
            a2 = (a)this.b.get(view);
            if (a2 != null) {
                a2.onInitializeAccessibilityNodeInfo(view, c2);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c2);
            }
        } else {
            super.onInitializeAccessibilityNodeInfo(view, c2);
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            a2.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a a2 = (a)this.b.get(viewGroup);
        if (a2 != null) {
            return a2.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int n3, Bundle bundle) {
        Object object;
        v v4 = this.a;
        boolean bl2 = v4.shouldIgnore();
        if (!bl2 && (object = v4.mRecyclerView.getLayoutManager()) != null) {
            object = (a)this.b.get(view);
            boolean bl3 = true;
            if (object != null ? (bl2 = ((a)object).performAccessibilityAction(view, n3, bundle)) : (bl2 = super.performAccessibilityAction(view, n3, bundle))) {
                return bl3;
            }
            return v4.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, n3, bundle);
        }
        return super.performAccessibilityAction(view, n3, bundle);
    }

    public final void sendAccessibilityEvent(View view, int n3) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            a2.sendAccessibilityEvent(view, n3);
        } else {
            super.sendAccessibilityEvent(view, n3);
        }
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        a a2 = (a)this.b.get(view);
        if (a2 != null) {
            a2.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}

