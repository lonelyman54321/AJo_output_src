/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.viewpager2.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class ViewPager2$k
extends RecyclerView {
    public final /* synthetic */ ViewPager2 a;

    public ViewPager2$k(ViewPager2 viewPager2, Context context) {
        this.a = viewPager2;
        super(context);
    }

    public final CharSequence getAccessibilityClassName() {
        this.a.t.getClass();
        return super.getAccessibilityClassName();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.a;
        int n3 = viewPager2.d;
        accessibilityEvent.setFromIndex(n3);
        n3 = viewPager2.d;
        accessibilityEvent.setToIndex(n3);
        viewPager2 = viewPager2.t.d;
        accessibilityEvent.setSource((View)viewPager2);
        accessibilityEvent.setClassName((CharSequence)"androidx.viewpager.widget.ViewPager");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        ViewPager2 viewPager2 = this.a;
        boolean bl3 = viewPager2.r;
        if (bl3 && (bl2 = super.onInterceptTouchEvent(motionEvent))) {
            bl2 = true;
        } else {
            bl2 = false;
            motionEvent = null;
        }
        return bl2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        ViewPager2 viewPager2 = this.a;
        boolean bl3 = viewPager2.r;
        if (bl3 && (bl2 = super.onTouchEvent(motionEvent))) {
            bl2 = true;
        } else {
            bl2 = false;
            motionEvent = null;
        }
        return bl2;
    }
}

