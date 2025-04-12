/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;

public final class MotionLayout$a
extends oq1_0 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c;
    public final /* synthetic */ MotionLayout d;

    public MotionLayout$a(MotionLayout motionLayout) {
        this.d = motionLayout;
    }

    public final float a() {
        return this.d.d;
    }

    public final float getInterpolation(float f5) {
        float f6 = this.a;
        float f7 = 0.0f;
        float f8 = 2.0f;
        MotionLayout motionLayout = this.d;
        float f11 = f6 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            f7 = this.c;
            float f12 = f6 / f7;
            float f14 = f12 - f5;
            Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                f5 = f6 / f7;
            }
            f12 = f7 * f5;
            motionLayout.d = f12 = f6 - f12;
            f6 *= f5;
            f7 = f7 * f5 * f5 / f8;
            f5 = this.b;
            return (f6 -= f7) + f5;
        }
        f7 = -f6;
        float f15 = this.c;
        float f16 = (f7 /= f15) - f5;
        object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = -f6 / f15;
        }
        motionLayout.d = f7 = f15 * f5 + f6;
        f15 = f15 * f5 * f5 / f8 + (f6 *= f5);
        f5 = this.b;
        return f15 + f5;
    }
}

