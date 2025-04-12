/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;

public final class tC1
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yc1_1 a;

    public /* synthetic */ tC1(yc1_1 yc1_12) {
        this.a = yc1_12;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        object = this.a;
        Object object2 = ((yc1_1)((Object)object)).M;
        if (object2 == null) {
            object2 = Yo1.a;
        }
        Hq hq = Hq.ENABLED;
        if (object2 == hq) {
            ((yc1_1)((Object)object)).invalidateSelf();
        } else {
            object2 = ((yc1_1)((Object)object)).p;
            if (object2 != null) {
                object = ((yc1_1)((Object)object)).b;
                float f5 = ((KC1)((Object)object)).e();
                ((g30_0)object2).s(f5);
            }
        }
    }
}

