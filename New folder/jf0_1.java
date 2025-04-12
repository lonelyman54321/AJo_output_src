/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 */
import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;

/*
 * Renamed from JF0
 */
public final class jf0_1
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ExpandCollapseAnimationHelper a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ jf0_1(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect) {
        this.a = expandCollapseAnimationHelper;
        this.b = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ExpandCollapseAnimationHelper expandCollapseAnimationHelper = this.a;
        Rect rect = this.b;
        ExpandCollapseAnimationHelper.a(expandCollapseAnimationHelper, rect, valueAnimator);
    }
}

