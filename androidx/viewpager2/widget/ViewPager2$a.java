/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$e;

public final class ViewPager2$a
extends ViewPager2$e {
    public final /* synthetic */ ViewPager2 a;

    public ViewPager2$a(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void onChanged() {
        boolean bl2;
        ViewPager2 viewPager2 = this.a;
        viewPager2.e = bl2 = true;
        viewPager2.l.l = bl2;
    }
}

