/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.ViewGroup$LayoutParams
 */
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j41
 */
public final class j41_0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ k41_0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ j41_0(k41_0 k41_02, float f5, int n3, int n4) {
        this.a = k41_02;
        this.b = f5;
        this.c = n3;
        this.d = n4;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        int n3;
        int n4;
        k41_0 k41_02 = this.a;
        Intrinsics.checkNotNullParameter(k41_02, "this$0");
        Intrinsics.checkNotNullParameter(object, "animation1");
        object = object.getAnimatedValue();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        float f5 = ((Float)object).floatValue();
        ViewGroup.LayoutParams layoutParams = k41_02.e.getLayoutParams();
        LottieAnimationView lottieAnimationView = k41_02.e;
        float f6 = lottieAnimationView.getHeight();
        float f7 = this.b;
        layoutParams.width = n4 = (int)(f6 * f7);
        lottieAnimationView.setLayoutParams(layoutParams);
        layoutParams = k41_02.d;
        lottieAnimationView = layoutParams.getLayoutParams();
        n4 = this.c;
        f7 = n4;
        float f8 = 100;
        int n7 = (int)(f7 * (f5 /= f8));
        n4 -= n7;
        n7 = 30;
        ((ViewGroup.LayoutParams)lottieAnimationView).height = n3 = mz3_0.d(n7) + n4;
        layoutParams.setLayoutParams((ViewGroup.LayoutParams)lottieAnimationView);
        layoutParams = k41_02.a;
        k41_02 = layoutParams.getLayoutParams();
        int n8 = this.d;
        int n10 = (int)((float)n8 * f5);
        n8 -= n10;
        ((ViewGroup.LayoutParams)k41_02).height = n10 = mz3_0.d(n7) + n8;
        layoutParams.setLayoutParams((ViewGroup.LayoutParams)k41_02);
    }
}

