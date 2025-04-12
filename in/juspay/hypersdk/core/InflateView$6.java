/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.util.Pair
 */
package in.juspay.hypersdk.core;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Pair;
import in.juspay.hypersdk.core.InflateView;
import java.util.HashMap;

class InflateView$6
implements Animator.AnimatorListener {
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ String val$finalOnEndId;
    final /* synthetic */ ObjectAnimator val$objAnim;

    public InflateView$6(InflateView inflateView, String string2, ObjectAnimator objectAnimator) {
        this.this$0 = inflateView;
        this.val$finalOnEndId = string2;
        this.val$objAnim = objectAnimator;
    }

    public void onAnimationCancel(Animator animator2) {
    }

    public void onAnimationEnd(Animator object) {
        object = this.this$0.state;
        String string2 = this.val$finalOnEndId;
        boolean bl2 = ((HashMap)object).containsKey(string2);
        if (bl2) {
            object = this.this$0.state;
            string2 = this.val$finalOnEndId;
            object = (ObjectAnimator)((Pair)((HashMap)object).get((Object)string2)).second;
            if (object != null && object != (string2 = this.val$objAnim)) {
                object.start();
            }
        }
    }

    public void onAnimationRepeat(Animator animator2) {
    }

    public void onAnimationStart(Animator animator2) {
    }
}

