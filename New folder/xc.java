/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ArgbEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.drawable.GradientDrawable
 */
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;

public final class xc
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ArgbEvaluator a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ GradientDrawable e;

    public /* synthetic */ xc(ArgbEvaluator argbEvaluator, int n3, int n4, int n7, GradientDrawable gradientDrawable) {
        this.a = argbEvaluator;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        ArgbEvaluator argbEvaluator = this.a;
        Intrinsics.checkNotNullParameter(argbEvaluator, "$evaluator");
        GradientDrawable gradientDrawable = this.e;
        Intrinsics.checkNotNullParameter(gradientDrawable, "$gradient");
        Intrinsics.checkNotNullParameter(object, "it");
        float f5 = object.getAnimatedFraction();
        int n3 = this.b;
        Object object2 = n3;
        int n4 = this.c;
        Object object3 = n4;
        object2 = argbEvaluator.evaluate(f5, object2, object3);
        object3 = "null cannot be cast to non-null type kotlin.Int";
        Intrinsics.checkNotNull(object2, (String)object3);
        int n7 = (Integer)object2;
        int n8 = this.d;
        Integer n10 = n8;
        Object object4 = n3;
        object4 = argbEvaluator.evaluate(f5, (Object)n10, object4);
        Intrinsics.checkNotNull(object4, (String)object3);
        n3 = (Integer)object4;
        Integer n14 = n4;
        Integer n15 = n8;
        object = argbEvaluator.evaluate(f5, (Object)n14, (Object)n15);
        Intrinsics.checkNotNull(object, (String)object3);
        int n16 = (Integer)object;
        object = new int[]{n7, n3, n16};
        gradientDrawable.setColors((int[])object);
    }
}

