/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.v$a;

public class v
extends a {
    private final v$a mItemDelegate;
    final RecyclerView mRecyclerView;

    public v(RecyclerView object) {
        boolean bl2;
        this.mRecyclerView = object;
        object = this.getItemDelegate();
        this.mItemDelegate = object != null && (bl2 = object instanceof v$a) ? (object = (v$a)object) : (object = new v$a(this));
    }

    public a getItemDelegate() {
        return this.mItemDelegate;
    }

    public void onInitializeAccessibilityEvent(View object, AccessibilityEvent accessibilityEvent) {
        RecyclerView$o recyclerView$o;
        super.onInitializeAccessibilityEvent((View)object, accessibilityEvent);
        boolean bl2 = object instanceof RecyclerView;
        if (bl2 && !(bl2 = this.shouldIgnore()) && (recyclerView$o = ((RecyclerView)(object = (RecyclerView)object)).getLayoutManager()) != null) {
            object = ((RecyclerView)object).getLayoutManager();
            ((RecyclerView$o)object).onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        boolean bl2 = this.shouldIgnore();
        if (!bl2 && (object = this.mRecyclerView.getLayoutManager()) != null) {
            object = this.mRecyclerView.getLayoutManager();
            ((RecyclerView$o)object).onInitializeAccessibilityNodeInfo(c2);
        }
    }

    public boolean performAccessibilityAction(View object, int n3, Bundle bundle) {
        boolean bl2 = super.performAccessibilityAction((View)object, n3, bundle);
        if (bl2) {
            return true;
        }
        bl2 = this.shouldIgnore();
        if (!bl2 && (object = this.mRecyclerView.getLayoutManager()) != null) {
            return this.mRecyclerView.getLayoutManager().performAccessibilityAction(n3, bundle);
        }
        return false;
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}

