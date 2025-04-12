/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;

/*
 * Renamed from eQ1
 */
public final class eq1_0
implements Interpolator {
    public final /* synthetic */ bx0_0 a;

    public eq1_0(bx0_0 bx0_02) {
        this.a = bx0_02;
    }

    public final float getInterpolation(float f5) {
        bx0_0 bx0_02 = this.a;
        double d2 = f5;
        return (float)bx0_02.a(d2);
    }
}

