/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 */
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/*
 * Renamed from ch3
 */
public final class ch3_1
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public ch3_1(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f5, Transformation object) {
        object = this.a;
        float f6 = ((SwipeRefreshLayout)object).w;
        float f7 = -f6 * f5 + f6;
        ((SwipeRefreshLayout)object).setAnimationProgress(f7);
        ((SwipeRefreshLayout)object).e(f5);
    }
}

