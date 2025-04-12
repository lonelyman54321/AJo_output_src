/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.animation.LinearInterpolator
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.ril.ajio.myaccount.order.orderhistory.tracking.TrackOrderLayout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gf2
 */
public final class gf2_1
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ hf2_0 a;
    public final /* synthetic */ float b;

    public /* synthetic */ gf2_1(hf2_0 hf2_02, float f5) {
        this.a = hf2_02;
        this.b = f5;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "animation");
        object = object.getAnimatedValue("rotation");
        String string2 = "null cannot be cast to non-null type kotlin.Float";
        Intrinsics.checkNotNull(object, string2);
        object = (Float)object;
        float f5 = object.floatValue();
        float f6 = (float)((hf2_0)object2).v * f5;
        int n3 = 0x43340000;
        float f7 = 180.0f;
        int n4 = (int)(f6 /= f7);
        ((hf2_0)object2).x(n4);
        Object object3 = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object3 == false) {
            f5 = 0.0f;
            object = null;
            f6 = this.b;
            float f8 = f6 - 0.0f;
            object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object3 == false) {
                object = ((hf2_0)object2).u;
                string2 = object.e;
                int n7 = object.i;
                n3 = 1;
                f7 = Float.MIN_VALUE;
                object2 = new int[]{n3, n7};
                String string3 = "progress";
                string2 = ObjectAnimator.ofInt((Object)string2, (String)string3, (int[])object2);
                n7 = object.a;
                long l2 = n7;
                string2.setDuration(l2);
                string2.setAutoCancel(n3 != 0);
                object2 = new LinearInterpolator();
                string2.setInterpolator((TimeInterpolator)object2);
                object2 = new up3((TrackOrderLayout)((Object)object));
                string2.addListener((Animator.AnimatorListener)object2);
                object2 = new vp3((TrackOrderLayout)((Object)object));
                string2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
                string2.start();
            }
        }
    }
}

