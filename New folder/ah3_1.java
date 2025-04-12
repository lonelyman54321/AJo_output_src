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
 * Renamed from ah3
 */
public final class ah3_1
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public ah3_1(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f5, Transformation transformation) {
        float f6 = 1.0f - f5;
        this.a.setAnimationProgress(f6);
    }
}

