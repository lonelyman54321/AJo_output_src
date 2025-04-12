/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.ViewPager2$i;
import java.util.Locale;

public final class c
extends ViewPager2$g {
    public final LinearLayoutManager a;
    public ViewPager2$i b;

    public c(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        LinearLayoutManager linearLayoutManager;
        int n7;
        ViewPager2$i viewPager2$i = this.b;
        if (viewPager2$i == null) {
            return;
        }
        f5 = -f5;
        viewPager2$i = null;
        for (n4 = 0; n4 < (n7 = (linearLayoutManager = this.a).getChildCount()); ++n4) {
            View view = linearLayoutManager.getChildAt(n4);
            if (view != null) {
                int n8 = linearLayoutManager.getPosition(view) - n3;
                float f6 = (float)n8 + f5;
                ViewPager2$i viewPager2$i2 = this.b;
                viewPager2$i2.a(f6, view);
                continue;
            }
            Object object = Locale.US;
            int n10 = linearLayoutManager.getChildCount();
            object = z41.a("LayoutManager returned a null child at pos ", "/", " while transforming pages", n4, n10);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
    }

    public final void onPageSelected(int n3) {
    }
}

