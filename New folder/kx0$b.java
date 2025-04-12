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

public final class kx0$b {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            EdgeEffect edgeEffect = new EdgeEffect(context, attributeSet);
            return edgeEffect;
        }
        catch (Throwable throwable) {
            attributeSet = new EdgeEffect(context);
            return attributeSet;
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        }
        catch (Throwable throwable) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f5, float f6) {
        try {
            return edgeEffect.onPullDistance(f5, f6);
        }
        catch (Throwable throwable) {
            edgeEffect.onPull(f5, f6);
            return 0.0f;
        }
    }
}

