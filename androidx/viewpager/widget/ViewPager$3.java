/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager.widget;

import androidx.viewpager.widget.ViewPager;

class ViewPager$3
implements Runnable {
    public final /* synthetic */ ViewPager a;

    public ViewPager$3(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void run() {
        ViewPager viewPager = this.a;
        viewPager.setScrollState(0);
        viewPager.populate();
    }
}

