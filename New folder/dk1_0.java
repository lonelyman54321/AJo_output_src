/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;

/*
 * Renamed from DK1
 */
public final class dk1_0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ClippableRoundedCornerLayout a;

    public /* synthetic */ dk1_0(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        this.a = clippableRoundedCornerLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialMainContainerBackHelper.a(this.a, valueAnimator);
    }
}

