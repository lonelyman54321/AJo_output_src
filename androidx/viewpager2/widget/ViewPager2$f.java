/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.View
 */
package androidx.viewpager2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.viewpager2.widget.ViewPager2;

public final class ViewPager2$f
extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 a;

    public ViewPager2$f(ViewPager2 viewPager2, Context context) {
        this.a = viewPager2;
        super(context);
    }

    public final void calculateExtraLayoutSpace(RecyclerView$y recyclerView$y, int[] nArray) {
        int n3;
        int n4;
        ViewPager2 viewPager2 = this.a;
        int n7 = viewPager2.getOffscreenPageLimit();
        if (n7 == (n4 = -1)) {
            super.calculateExtraLayoutSpace(recyclerView$y, nArray);
            return;
        }
        nArray[0] = n3 = viewPager2.getPageSize() * n7;
        nArray[1] = n3;
    }

    public final void onInitializeAccessibilityNodeInfo(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(recyclerView$u, recyclerView$y, c2);
        this.a.t.getClass();
    }

    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView$u object, RecyclerView$y object2, View view, C2 c2) {
        int n3;
        int n4;
        object = this.a.t.d;
        int n7 = ((ViewPager2)((Object)object)).getOrientation();
        int n8 = 1;
        int n10 = 0;
        if (n7 == n8) {
            object2 = ((ViewPager2)((Object)object)).g;
            n4 = n7 = ((RecyclerView$o)object2).getPosition(view);
        } else {
            n4 = 0;
        }
        n7 = ((ViewPager2)((Object)object)).getOrientation();
        if (n7 == 0) {
            object = ((ViewPager2)((Object)object)).g;
            n3 = n10 = ((RecyclerView$o)object).getPosition(view);
        } else {
            n3 = 0;
        }
        object = C2$f.a(n4, 1, n3, 1, false, false);
        c2.n((C2$f)object);
    }

    public final boolean performAccessibilityAction(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, int n3, Bundle bundle) {
        this.a.t.getClass();
        return super.performAccessibilityAction(recyclerView$u, recyclerView$y, n3, bundle);
    }

    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean bl2, boolean bl3) {
        return false;
    }
}

