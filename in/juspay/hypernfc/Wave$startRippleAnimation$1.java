/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package in.juspay.hypernfc;

import android.animation.ValueAnimator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Wave$startRippleAnimation$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ List $animators;
    final /* synthetic */ int $j;

    public Wave$startRippleAnimation$1(List list, int n3) {
        this.$animators = list;
        this.$j = n3;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = object.getCurrentPlayTime();
        long l3 = 500L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            object = this.$animators;
            int n3 = this.$j + 1;
            ((ValueAnimator)object.get(n3)).start();
            object = this.$animators;
            n3 = this.$j;
            object = (ValueAnimator)object.get(n3);
            object.removeUpdateListener((ValueAnimator.AnimatorUpdateListener)this);
        }
    }
}

