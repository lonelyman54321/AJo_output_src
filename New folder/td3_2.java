/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from td3
 */
public final class td3_2
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ vd3_2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ td3_2(vd3_2 vd3_22, boolean bl2) {
        this.a = vd3_22;
        this.b = bl2;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        float f5;
        Object object2 = vd3_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        Object object3 = ((vd3_2)object2).f;
        if (object3 != null) {
            boolean n3 = ((ViewPager2)((Object)object3)).e();
            object3 = n3;
        } else {
            boolean bl2 = false;
            f5 = 0.0f;
            object3 = null;
        }
        Intrinsics.checkNotNull(object3);
        boolean bl3 = (Boolean)object3;
        if (bl3) {
            object = object.getAnimatedValue();
            object3 = "null cannot be cast to non-null type kotlin.Int";
            Intrinsics.checkNotNull(object, (String)object3);
            object = (Integer)object;
            int n3 = (Integer)object;
            int n7 = ((vd3_2)object2).k;
            n7 = n3 - n7;
            int n8 = this.b;
            n8 = n8 != 0 ? -1 : 1;
            int n10 = n7 * n8;
            f5 = n10;
            ((vd3_2)object2).k = n3;
            object = ((vd3_2)object2).f;
            if (object != null) {
                ((ViewPager2)((Object)object)).c(f5);
            }
        }
    }
}

