/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.view.animation.DecelerateInterpolator
 */
package com.ril.ajio.pdprefresh.holders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.ril.ajio.R$string;
import com.ril.ajio.pdprefresh.holders.HeroImageHolder$startExpandAnimation$1$1$a;
import kotlin.jvm.internal.Intrinsics;

final class HeroImageHolder$startExpandAnimation$1$1
implements Runnable {
    public final /* synthetic */ M41 a;

    public HeroImageHolder$startExpandAnimation$1$1(M41 m41) {
        this.a = m41;
    }

    public final void run() {
        M41 m41 = this.a;
        Object object = m41.Q;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivSimilarExpandView");
            object = null;
        }
        int n3 = 8;
        object.setVisibility(n3);
        object = m41.P;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivSimilarCollapsedView");
            object = null;
        }
        n3 = 0;
        object.setVisibility(0);
        object = m41.R;
        String string2 = "tvSimilarTextView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        int n4 = R$string.similar_text;
        String string3 = hv3_0.K(n4);
        object.setText((CharSequence)string3);
        object = m41.R;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object = new int[]{95};
        object = ObjectAnimator.ofInt((Object)object2, (String)"width", (int[])object);
        object.setDuration(300L);
        object2 = new DecelerateInterpolator();
        object.setInterpolator((TimeInterpolator)object2);
        object.start();
        Intrinsics.checkNotNull(object);
        object2 = new HeroImageHolder$startExpandAnimation$1$1$a(m41);
        object.addListener((Animator.AnimatorListener)object2);
    }
}

