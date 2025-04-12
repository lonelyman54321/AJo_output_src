/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package androidx.viewpager.widget;

import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

public final class PagerTabStrip$b
implements View.OnClickListener {
    public final /* synthetic */ PagerTabStrip a;

    public PagerTabStrip$b(PagerTabStrip pagerTabStrip) {
        this.a = pagerTabStrip;
    }

    public final void onClick(View object) {
        object = this.a.a;
        int n3 = ((ViewPager)((Object)object)).getCurrentItem() + 1;
        ((ViewPager)((Object)object)).setCurrentItem(n3);
    }
}

