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
 * Renamed from bh3
 */
public final class bh3_2
extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SwipeRefreshLayout c;

    public bh3_2(SwipeRefreshLayout swipeRefreshLayout, int n3, int n4) {
        this.c = swipeRefreshLayout;
        this.a = n3;
        this.b = n4;
    }

    public final void applyTransformation(float f5, Transformation object) {
        object = this.c.A;
        int n3 = this.a;
        float f6 = n3;
        int n4 = (int)((float)(this.b - n3) * f5 + f6);
        ((QU)((Object)object)).setAlpha(n4);
    }
}

