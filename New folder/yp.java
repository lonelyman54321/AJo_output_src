/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
import android.animation.TypeEvaluator;

public final class yp
implements TypeEvaluator {
    public static final yp a;

    static {
        yp yp2;
        a = yp2 = new Object();
    }

    public final Object evaluate(float f5, Object object, Object object2) {
        int n3 = (Integer)object;
        float f6 = n3 >> 24 & 0xFF;
        float f7 = 255.0f;
        f6 /= f7;
        float f8 = (float)(n3 >> 16 & 0xFF) / f7;
        float f11 = (float)(n3 >> 8 & 0xFF) / f7;
        float f12 = (float)(n3 & 0xFF) / f7;
        int n4 = (Integer)object2;
        float f14 = (float)(n4 >> 24 & 0xFF) / f7;
        float f15 = (float)(n4 >> 16 & 0xFF) / f7;
        float f16 = (float)(n4 >> 8 & 0xFF) / f7;
        float f17 = (float)(n4 & 0xFF) / f7;
        double d2 = f8;
        double d5 = 2.2;
        f8 = (float)Math.pow(d2, d5);
        f11 = (float)Math.pow(f11, d5);
        f12 = (float)Math.pow(f12, d5);
        f15 = (float)Math.pow(f15, d5);
        f16 = (float)Math.pow(f16, d5);
        f17 = (float)Math.pow(f17, d5);
        f6 = xu0_1.a(f14, f6, f5, f6);
        f8 = xu0_1.a(f15, f8, f5, f8);
        f11 = xu0_1.a(f16, f11, f5, f11);
        f5 = xu0_1.a(f17, f12, f5, f12);
        f6 *= f7;
        double d7 = f8;
        double d9 = 0.45454545454545453;
        f12 = (float)Math.pow(d7, d9) * f7;
        f17 = (float)Math.pow(f11, d9) * f7;
        f5 = (float)Math.pow(f5, d9) * f7;
        int n7 = Math.round(f6) << 24;
        n3 = Math.round(f12) << 16 | n7;
        n4 = Math.round(f17) << 8;
        return Math.round(f5) | (n3 |= n4);
    }
}

