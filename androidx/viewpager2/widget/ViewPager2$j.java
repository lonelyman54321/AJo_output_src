/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.ViewPager2;

public final class ViewPager2$j
extends u {
    public final /* synthetic */ ViewPager2 c;

    public ViewPager2$j(ViewPager2 viewPager2) {
        this.c = viewPager2;
    }

    public final View findSnapView(RecyclerView$o recyclerView$o) {
        ViewPager2 viewPager2 = this.c;
        boolean bl2 = viewPager2.e();
        recyclerView$o = bl2 ? null : super.findSnapView(recyclerView$o);
        return recyclerView$o;
    }
}

