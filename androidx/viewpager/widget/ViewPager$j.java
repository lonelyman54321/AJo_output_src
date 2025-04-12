/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
package androidx.viewpager.widget;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

public final class ViewPager$j
extends DataSetObserver {
    public final /* synthetic */ ViewPager a;

    public ViewPager$j(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void onChanged() {
        this.a.dataSetChanged();
    }

    public final void onInvalidated() {
        this.a.dataSetChanged();
    }
}

