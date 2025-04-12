/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
import android.view.animation.Interpolator;

public final class TD3
implements Interpolator {
    public final /* synthetic */ bx0_0 a;

    public TD3(bx0_0 bx0_02) {
        this.a = bx0_02;
    }

    public final float getInterpolation(float f5) {
        bx0_0 bx0_02 = this.a;
        double d2 = f5;
        return (float)bx0_02.a(d2);
    }
}

