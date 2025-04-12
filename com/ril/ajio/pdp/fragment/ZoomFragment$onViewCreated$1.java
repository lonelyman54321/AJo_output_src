/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.ril.ajio.pdp.fragment;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import com.ril.ajio.pdp.fragment.ZoomFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ZoomFragment$onViewCreated$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ZoomFragment a;

    public ZoomFragment$onViewCreated$1(ZoomFragment zoomFragment) {
        this.a = zoomFragment;
    }

    public final void onGlobalLayout() {
        int n3;
        ZoomFragment zoomFragment = this.a;
        Object object = zoomFragment.b;
        Object object2 = null;
        String string2 = "zoomViewPager";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object = object.getViewTreeObserver();
        object.removeOnGlobalLayoutListener(this);
        n3 = zoomFragment.c;
        ViewPager viewPager = zoomFragment.b;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = viewPager;
        }
        object2 = ((ViewPager)((Object)object2)).getAdapter();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.pdp.adapter.ZoomPagerAdapter");
        object2 = ((tj3_2)object2).i;
        object = n3;
        object = (View)((LinkedHashMap)object2).get(object);
        zoomFragment.o = object;
    }
}

