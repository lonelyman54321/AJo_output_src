/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$h;

public final class ViewPager2$h$a
implements E2 {
    public final /* synthetic */ ViewPager2$h a;

    public ViewPager2$h$a(ViewPager2$h viewPager2$h) {
        this.a = viewPager2$h;
    }

    public final boolean perform(View object, E2$a e2$a) {
        object = (ViewPager2)((Object)object);
        int n3 = ((ViewPager2)((Object)object)).getCurrentItem();
        int n4 = 1;
        n3 += n4;
        ViewPager2 viewPager2 = this.a.d;
        boolean bl2 = viewPager2.r;
        if (bl2) {
            viewPager2.h(n3, n4 != 0);
        }
        return n4 != 0;
    }
}

