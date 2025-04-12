/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;

public final class PP2
extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0));

    public static float a(float f5, float f6, boolean bl2) {
        if (bl2) {
            double d2 = f5;
            double d5 = a;
            double d7 = 1.0 - d5;
            double d9 = f6;
            d7 = d7 * d9 + d2;
            f5 = (float)d7;
        }
        return f5;
    }

    public static float b(float f5, float f6, boolean bl2) {
        float f7 = 1.5f;
        if (bl2) {
            double d2 = f5 * f7;
            double d5 = a;
            double d7 = 1.0 - d5;
            double d9 = f6;
            return (float)(d7 * d9 + d2);
        }
        return f5 * f7;
    }
}

