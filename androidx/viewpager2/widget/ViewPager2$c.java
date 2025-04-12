/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.viewpager2.widget;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;

public final class ViewPager2$c
extends ViewPager2$g {
    public final /* synthetic */ ViewPager2 a;

    public ViewPager2$c(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void onPageSelected(int n3) {
        ViewGroup viewGroup = this.a;
        viewGroup.clearFocus();
        int n4 = viewGroup.hasFocus();
        if (n4 != 0) {
            viewGroup = viewGroup.j;
            n4 = 2;
            viewGroup.requestFocus(n4);
        }
    }
}

