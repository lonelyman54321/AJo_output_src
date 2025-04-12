/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.pdp.fragment;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;
import com.ril.ajio.pdp.data.VideoConfig;
import com.ril.ajio.pdp.fragment.ZoomFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ZoomFragment$b
implements ViewPager$h {
    public final /* synthetic */ ZoomFragment a;

    public ZoomFragment$b(ZoomFragment zoomFragment) {
        this.a = zoomFragment;
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
    }

    public final void onPageSelected(int n3) {
        Object object;
        int n4;
        int n7;
        ZoomFragment zoomFragment = this.a;
        Object object2 = zoomFragment.b;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zoomViewPager");
            n7 = 0;
            object2 = null;
        }
        object2 = ((ViewPager)((Object)object2)).getAdapter();
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.pdp.adapter.ZoomPagerAdapter");
        object2 = ((tj3_2)object2).i;
        Object object4 = n3;
        object2 = (View)((LinkedHashMap)object2).get(object4);
        if (object2 != null) {
            n4 = R$id.imgPlay;
            object4 = object2.findViewById(n4);
        } else {
            n4 = 0;
            object4 = null;
        }
        Object object5 = h40_0.a;
        object5 = h40_0.Z();
        boolean n8 = ((VideoConfig)object5).getAutoplayEnabled();
        if (n8) {
            if (object4 != null) {
                object4.performClick();
            }
            if ((object4 = zoomFragment.o) != null) {
                int n10 = R$id.playerView;
                object4 = object4.findViewById(n10);
            } else {
                n4 = 0;
                object4 = null;
            }
            if (object4 != null) {
                object4.performClick();
            }
            zoomFragment.o = object2;
        }
        object2 = zoomFragment.f;
        object4 = "circlePageIndicator";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n7 = 0;
            object2 = null;
        }
        ((DynamicCirclePageIndicator)((Object)object2)).setCurrentPageIndexChange(n3);
        if (n3 == 0) {
            object = zoomFragment.g;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = zoomFragment.h) != null) {
                ai0_2.B((View)object);
            }
        } else {
            object2 = zoomFragment.d;
            n7 = ((ArrayList)object2).size() + -1;
            if (n3 == n7) {
                object = zoomFragment.h;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = zoomFragment.g) != null) {
                    ai0_2.B((View)object);
                }
            } else {
                object = zoomFragment.g;
                if (object != null) {
                    ai0_2.B((View)object);
                }
                if ((object = zoomFragment.h) != null) {
                    ai0_2.B((View)object);
                }
            }
        }
        if ((object = zoomFragment.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object;
        }
        ai0_2.B((View)object3);
    }
}

