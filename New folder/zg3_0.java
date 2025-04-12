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
 * Renamed from Zg3
 */
public final class zg3_0
extends Animation {
    public final /* synthetic */ SwipeRefreshLayout a;

    public zg3_0(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f5, Transformation transformation) {
        this.a.setAnimationProgress(f5);
    }
}

