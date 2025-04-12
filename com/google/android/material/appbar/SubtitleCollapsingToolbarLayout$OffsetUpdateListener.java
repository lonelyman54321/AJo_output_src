/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout$LayoutParams;
import com.google.android.material.appbar.ViewOffsetHelper;
import com.google.android.material.internal.CollapsingTextHelper2;

class SubtitleCollapsingToolbarLayout$OffsetUpdateListener
implements AppBarLayout$OnOffsetChangedListener {
    final /* synthetic */ SubtitleCollapsingToolbarLayout this$0;

    public SubtitleCollapsingToolbarLayout$OffsetUpdateListener(SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout) {
        this.this$0 = subtitleCollapsingToolbarLayout;
    }

    public void onOffsetChanged(AppBarLayout object, int n3) {
        int n4;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        Object object2 = this.this$0;
        ((SubtitleCollapsingToolbarLayout)((Object)object2)).currentOffset = n3;
        object2 = ((SubtitleCollapsingToolbarLayout)((Object)object2)).lastInsets;
        int n8 = 0;
        Object object3 = null;
        if (object2 != null) {
            n4 = ((f)object2).d();
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object4 = this.this$0;
        int n10 = object4.getChildCount();
        for (int i3 = 0; i3 < n10; i3 += n7) {
            int n14;
            View view = this.this$0.getChildAt(i3);
            SubtitleCollapsingToolbarLayout$LayoutParams subtitleCollapsingToolbarLayout$LayoutParams = (SubtitleCollapsingToolbarLayout$LayoutParams)view.getLayoutParams();
            ViewOffsetHelper viewOffsetHelper = SubtitleCollapsingToolbarLayout.getViewOffsetHelper(view);
            int n15 = subtitleCollapsingToolbarLayout$LayoutParams.collapseMode;
            if (n15 != n7) {
                n14 = 2;
                float f6 = 2.8E-45f;
                if (n15 != n14) continue;
                f6 = -n3;
                float f7 = subtitleCollapsingToolbarLayout$LayoutParams.parallaxMult;
                n14 = Math.round(f6 *= f7);
                viewOffsetHelper.setTopAndBottomOffset(n14);
                continue;
            }
            int n16 = -n3;
            SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout = this.this$0;
            n14 = subtitleCollapsingToolbarLayout.getMaxOffsetForPinChild(view);
            n14 = PK1.b(n16, 0, n14);
            viewOffsetHelper.setTopAndBottomOffset(n14);
        }
        this.this$0.updateScrimVisibility();
        object = this.this$0;
        object3 = ((SubtitleCollapsingToolbarLayout)((Object)object)).statusBarScrim;
        if (object3 != null && n4 > 0) {
            object3 = ViewCompat.a;
            object.postInvalidateOnAnimation();
        }
        n7 = this.this$0.getHeight();
        object3 = this.this$0;
        object4 = ViewCompat.a;
        n8 = object3.getMinimumHeight();
        n8 = n7 - n8 - n4;
        n4 = this.this$0.getScrimVisibleHeightTrigger();
        object2 = this.this$0.collapsingTextHelper;
        f5 = n7 -= n4;
        float f8 = n8;
        f5 /= f8;
        f5 = Math.min(1.0f, f5);
        ((CollapsingTextHelper2)object2).setFadeModeStartFraction(f5);
        object = this.this$0;
        object2 = ((SubtitleCollapsingToolbarLayout)((Object)object)).collapsingTextHelper;
        n7 = ((SubtitleCollapsingToolbarLayout)((Object)object)).currentOffset + n8;
        ((CollapsingTextHelper2)object2).setCurrentOffsetY(n7);
        object = this.this$0.collapsingTextHelper;
        float f11 = (float)Math.abs(n3) / f8;
        ((CollapsingTextHelper2)object).setExpansionFraction(f11);
    }
}

