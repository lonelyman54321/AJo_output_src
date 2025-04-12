/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
package androidx.viewpager.widget;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$g;
import androidx.viewpager.widget.ViewPager$h;

public final class PagerTitleStrip$a
extends DataSetObserver
implements ViewPager$h,
ViewPager$g {
    public int a;
    public final /* synthetic */ PagerTitleStrip b;

    public PagerTitleStrip$a(PagerTitleStrip pagerTitleStrip) {
        this.b = pagerTitleStrip;
    }

    public final void onAdapterChanged(ViewPager viewPager, Uk2 uk2, Uk2 uk22) {
        this.b.a(uk2, uk22);
    }

    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.b;
        ViewPager viewPager = pagerTitleStrip.a;
        int n3 = viewPager.getCurrentItem();
        Uk2 uk2 = pagerTitleStrip.a.getAdapter();
        pagerTitleStrip.b(n3, uk2);
        float f5 = pagerTitleStrip.f;
        int n4 = 0;
        uk2 = null;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 < 0) {
            n3 = 0;
            f5 = 0.0f;
            viewPager = null;
        }
        n4 = pagerTitleStrip.a.getCurrentItem();
        pagerTitleStrip.c(n4, f5, true);
    }

    public final void onPageScrollStateChanged(int n3) {
        this.a = n3;
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        float f6 = 0.5f;
        float f7 = f5 - f6;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            ++n3;
        }
        this.b.c(n3, f5, false);
    }

    public final void onPageSelected(int n3) {
        n3 = this.a;
        if (n3 == 0) {
            PagerTitleStrip pagerTitleStrip = this.b;
            ViewPager viewPager = pagerTitleStrip.a;
            int n4 = viewPager.getCurrentItem();
            Object object = pagerTitleStrip.a.getAdapter();
            pagerTitleStrip.b(n4, (Uk2)object);
            float f5 = pagerTitleStrip.f;
            int n7 = 0;
            object = null;
            float f6 = f5 - 0.0f;
            float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (f7 < 0) {
                n4 = 0;
                f5 = 0.0f;
                viewPager = null;
            }
            object = pagerTitleStrip.a;
            n7 = ((ViewPager)((Object)object)).getCurrentItem();
            f7 = 1.0f;
            pagerTitleStrip.c(n7, f5, (boolean)f7);
        }
    }
}

