/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;

public abstract class AB1
implements Interpolator {
    public final float[] a;
    public final float b;

    public AB1(float[] fArray) {
        float f5;
        this.a = fArray;
        float f6 = fArray.length + -1;
        this.b = f5 = 1.0f / f6;
    }

    public final float getInterpolation(float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 >= 0) {
            return f6;
        }
        f6 = 0.0f;
        float[] fArray = null;
        float f11 = f5 - 0.0f;
        f8 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (f8 <= 0) {
            return 0.0f;
        }
        fArray = this.a;
        f8 = (int)((float)(fArray.length + -1) * f5);
        int n3 = fArray.length + -2;
        f8 = Math.min((int)f8, n3);
        float f12 = f8;
        float f14 = this.b;
        f5 = qy_1.a(f12, f14, f5, f14);
        f12 = fArray[f8];
        return xu0_1.a(fArray[++f8], f12, f5, f12);
    }
}

