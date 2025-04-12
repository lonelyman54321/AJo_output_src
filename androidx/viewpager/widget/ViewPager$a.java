/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager.widget;

import androidx.viewpager.widget.ViewPager$e;
import java.util.Comparator;

public final class ViewPager$a
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (ViewPager$e)object;
        object2 = (ViewPager$e)object2;
        int n3 = ((ViewPager$e)object).b;
        int n4 = ((ViewPager$e)object2).b;
        return n3 - n4;
    }
}

