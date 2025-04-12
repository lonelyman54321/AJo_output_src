/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import com.google.accompanist.swiperefresh.Slingshot;
import kotlin.ranges.f;

public final class SlingshotKt {
    public static final float MaxProgressArc = 0.8f;

    public static final Slingshot rememberUpdatedSlingshot(float f5, float f6, int n3, b30_0 b30_02, int n4) {
        b30_02.u(-2136847435);
        float f7 = f5 / f6;
        float f8 = 1.0f;
        f7 = Math.min(f8, f7);
        float f11 = 0.4f;
        float f12 = Math.max(f7 - f11, 0.0f);
        float f14 = 5;
        f12 *= f14;
        f14 = 3;
        f12 /= f14;
        f5 = Math.abs(f5) - f6;
        int n7 = 2;
        float f15 = n7;
        float f16 = f6 * f15;
        f5 = Math.min(f5, f16) / f6;
        f5 = Math.max(0.0f, f5);
        int n8 = 4;
        f16 = n8;
        double d2 = f5 /= f16;
        double d5 = n7;
        d2 = Math.pow(d2, d5);
        f14 = (float)d2;
        f5 = (f5 - f14) * f15;
        f14 = f6 * f5 * f15;
        f6 = f6 * f7 + f14;
        int n10 = (int)f6 + n3 - n3;
        n3 = 1061997773;
        float f17 = 0.8f;
        f17 = f.c(f12 * f17, f17);
        f11 = f11 * f12 + -0.25f;
        f5 = (f5 * f15 + f11) * 0.5f;
        f7 = Math.min(f8, f12);
        int n14 = -2065430172;
        f8 = -5.3611166E-36f;
        b30_02.u(n14);
        Object object = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object == b30$a$a) {
            object = new Slingshot();
            b30_02.o(object);
        }
        object = (Slingshot)object;
        b30_02.I();
        ((Slingshot)object).setOffset(n10);
        ((Slingshot)object).setStartTrim(0.0f);
        ((Slingshot)object).setEndTrim(f17);
        ((Slingshot)object).setRotation(f5);
        ((Slingshot)object).setArrowScale(f7);
        b30_02.I();
        return object;
    }
}

