/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/*
 * Renamed from bm
 */
public final class bm_0 {
    public static final bm_0 a;

    static {
        bm_0 bm_02;
        a = bm_02 = new Object();
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        EdgeEffect edgeEffect;
        try {
            edgeEffect = new EdgeEffect(context, attributeSet);
        }
        catch (Throwable throwable) {
            edgeEffect = new EdgeEffect(context);
        }
        return edgeEffect;
    }

    public final float b(EdgeEffect edgeEffect) {
        float f5;
        try {
            f5 = edgeEffect.getDistance();
        }
        catch (Throwable throwable) {
            f5 = 0.0f;
            edgeEffect = null;
        }
        return f5;
    }

    public final float c(EdgeEffect edgeEffect, float f5, float f6) {
        float f7;
        try {
            f7 = edgeEffect.onPullDistance(f5, f6);
        }
        catch (Throwable throwable) {
            edgeEffect.onPull(f5, f6);
            f7 = 0.0f;
            edgeEffect = null;
        }
        return f7;
    }
}

