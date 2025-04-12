/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.widget.LinearLayout
 */
import android.animation.Animator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import kotlin.jvm.internal.Intrinsics;

public final class f9
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ f9(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        int n3;
        int n4;
        float f5;
        int n7;
        float f6;
        int n8;
        float f7;
        int n10;
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.a;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        object = q9_02.k;
        float f8 = 0.0f;
        ConstraintLayout constraintLayout = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeListener");
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        int n14 = 0;
        float f11 = 0.0f;
        object.N0(false);
        object = q9_02.G1;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coachMarkLayout");
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        object.setVisibility(0);
        object = q9_02.H1;
        String string2 = "coachMarkView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        object.setVisibility(0);
        object = q9_02.N1;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        ((BaseProgressIndicator)((Object)object)).setIndeterminate(false);
        object = q9_02.O1;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressLyt");
            n10 = 0;
            object = null;
            f7 = 0.0f;
        }
        int n15 = 8;
        object.setVisibility(n15);
        n10 = 2;
        f7 = 2.8E-45f;
        int[] nArray = new int[n10];
        int[] nArray2 = new int[n10];
        ConstraintLayout constraintLayout2 = q9_02.E1;
        Object object2 = "splashLayout";
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            constraintLayout2 = null;
            f6 = 0.0f;
        }
        constraintLayout2.getLocationInWindow(nArray);
        constraintLayout2 = q9_02.H1;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            constraintLayout2 = null;
            f6 = 0.0f;
        }
        constraintLayout2.getLocationInWindow(nArray2);
        constraintLayout2 = q9_02.E1;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            constraintLayout2 = null;
            f6 = 0.0f;
        }
        n8 = constraintLayout2.getWidth();
        ConstraintLayout constraintLayout3 = q9_02.E1;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            constraintLayout3 = null;
            f5 = 0.0f;
        }
        n7 = constraintLayout3.getHeight();
        LinearLayout linearLayout = q9_02.H1;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            linearLayout = null;
        }
        n4 = linearLayout.getWidth();
        LinearLayout linearLayout2 = q9_02.H1;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            linearLayout2 = null;
        }
        int n16 = linearLayout2.getHeight();
        n3 = nArray[0];
        int n17 = 1;
        n15 = nArray[n17];
        n14 = nArray2[0];
        int n18 = nArray2[n17];
        ConstraintLayout constraintLayout4 = q9_02.E1;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            constraintLayout = constraintLayout4;
        }
        constraintLayout = constraintLayout.animate();
        object2 = new z9(q9_02);
        q9_02 = constraintLayout.setListener((Animator.AnimatorListener)object2);
        f8 = n4;
        f6 = n8;
        q9_02 = q9_02.scaleX(f8 /= f6);
        float f12 = n16;
        float f14 = n7;
        q9_02 = q9_02.scaleY(f12 /= f14);
        f11 = n14 - n3;
        f5 = n17;
        f8 = (f5 - f8) * f6;
        f7 = n10;
        q9_02 = q9_02.translationX(f11 -= (f8 /= f7));
        f8 = n18 - n15;
        f5 = (f5 - f12) * f14 / f7;
        q9_02.translationY(f8 -= f5).setDuration(750L);
    }
}

