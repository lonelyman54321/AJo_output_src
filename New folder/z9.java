/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.os.Handler
 *  android.os.Looper
 */
import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

public final class z9
implements Animator.AnimatorListener {
    public final /* synthetic */ q9_0 a;

    public z9(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onAnimationCancel(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationEnd(Animator object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        Object object2 = object.I1;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coachIcon");
            object2 = null;
        }
        object2.setVisibility(0);
        object2 = object.E1;
        if (object2 == null) {
            object2 = "splashLayout";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        object3.setVisibility(8);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object.J2 = object2;
        object3 = new y9(object, 0);
        object = od3_2.a();
        long l2 = h40_0.o((String)object);
        long l3 = 1000;
        object2.postDelayed((Runnable)object3, l2 *= l3);
    }

    public final void onAnimationRepeat(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }

    public final void onAnimationStart(Animator animator2) {
        Intrinsics.checkNotNullParameter(animator2, "animation");
    }
}

