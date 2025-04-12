/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.ViewPager2$h;

public final class ViewPager2$b
extends ViewPager2$g {
    public final /* synthetic */ ViewPager2 a;

    public ViewPager2$b(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void onPageScrollStateChanged(int n3) {
        if (n3 == 0) {
            ViewPager2 viewPager2 = this.a;
            viewPager2.i();
        }
    }

    public final void onPageSelected(int n3) {
        ViewPager2 viewPager2 = this.a;
        int n4 = viewPager2.d;
        if (n4 != n3) {
            viewPager2.d = n3;
            ViewPager2$h viewPager2$h = viewPager2.t;
            viewPager2$h.b();
        }
    }
}

