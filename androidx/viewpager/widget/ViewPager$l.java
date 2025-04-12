/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.viewpager.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager$LayoutParams;
import java.util.Comparator;

public final class ViewPager$l
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (View)object;
        object2 = (View)object2;
        object = (ViewPager$LayoutParams)object.getLayoutParams();
        object2 = (ViewPager$LayoutParams)object2.getLayoutParams();
        boolean bl2 = ((ViewPager$LayoutParams)((Object)object)).a;
        boolean bl3 = ((ViewPager$LayoutParams)((Object)object2)).a;
        if (bl2 != bl3) {
            n3 = bl2 ? 1 : -1;
        } else {
            n3 = ((ViewPager$LayoutParams)((Object)object)).e;
            int n4 = ((ViewPager$LayoutParams)((Object)object2)).e;
            n3 -= n4;
        }
        return n3;
    }
}

