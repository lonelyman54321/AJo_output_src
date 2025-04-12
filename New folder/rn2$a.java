/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 */
import android.graphics.Path;

public final class rn2$a {
    public char a;
    public final float[] b;

    public rn2$a(char c2, float[] fArray) {
        this.a = c2;
        this.b = fArray;
    }

    public rn2$a(rn2$a object) {
        char c2;
        this.a = c2 = ((rn2$a)object).a;
        object = ((rn2$a)object).b;
        object = rn2.b(((Object)object).length, (float[])object);
        this.b = (float[])object;
    }

    public static void a(Path path, float f5, float f6, float f7, float f8, float f11, float f12, float f14, boolean bl2, boolean bl3) {
        double d2;
        float f15 = f5;
        float f16 = f7;
        float f17 = f14;
        boolean bl4 = bl3;
        double d5 = Math.toRadians(f14);
        double d7 = Math.cos(d5);
        double d9 = Math.sin(d5);
        double d12 = f5;
        double d13 = d12 * d7;
        float f18 = f6;
        double d14 = f6;
        double d15 = d14 * d9 + d13;
        d13 = d12;
        d12 = f11;
        d15 /= d12;
        f18 = -f5;
        double d16 = d5;
        d5 = (double)f18 * d9;
        double d17 = d14 * d7 + d5;
        d5 = f12;
        d17 /= d5;
        double d18 = d14;
        double d19 = (double)f7 * d7;
        double d20 = f8;
        double d22 = (d20 * d9 + d19) / d12;
        f18 = -f7;
        d19 = (double)f18 * d9;
        d20 = (d20 * d7 + d19) / d5;
        d19 = d15 - d22;
        double d23 = d17 - d20;
        double d24 = d15 + d22;
        double d25 = 2.0;
        d24 /= d25;
        double d26 = (d17 + d20) / d25;
        double d27 = d19 * d19;
        double d28 = d23 * d23 + d27;
        double d29 = d28 - (d27 = 0.0);
        Object object = d29 == 0.0 ? 0 : (d29 > 0.0 ? 1 : -1);
        if (object == false) {
            return;
        }
        double d30 = 1.0;
        double d32 = d30 / d28;
        double d34 = 0.25;
        double d35 = (d32 -= d34) - d27;
        Object object2 = d35 == 0.0 ? 0 : (d35 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            f15 = (float)(Math.sqrt(d28) / 1.99999);
            float f19 = f11 * f15;
            f18 = f12 * f15;
            f15 = f5;
            float f20 = f8;
            boolean bl5 = bl2;
            rn2$a.a(path, f5, f6, f7, f8, f19, f18, f14, bl2, bl3);
            return;
        }
        d28 = Math.sqrt(d32);
        d19 *= d28;
        d28 *= d23;
        if (bl2 == bl3) {
            d24 -= d28;
            d26 += d19;
        } else {
            d24 += d28;
            d26 -= d19;
        }
        d19 = d17 - d26;
        d17 = d9;
        d9 = d15 - d24;
        d19 = Math.atan2(d19, d9);
        d9 = d22 - d24;
        double d36 = Math.atan2(d20 -= d26, d9) - d19;
        int n3 = 0;
        double d37 = d36 == d27 ? 0 : (d36 > d27 ? 1 : -1);
        boolean bl6 = d37 >= 0;
        if (bl4 != bl6) {
            d2 = Math.PI * 2;
            d36 = d37 > 0 ? (d36 -= d2) : (d36 += d2);
        }
        d2 = (d24 *= d12) * d7;
        d9 = (d26 *= d5) * d17;
        d2 -= d9;
        d26 = d26 * d7 + (d24 *= d17);
        d37 = (int)Math.ceil(Math.abs(d36 * 4.0 / Math.PI));
        d9 = Math.cos(d16);
        d15 = Math.sin(d16);
        d16 = Math.cos(d19);
        d17 = Math.sin(d19);
        d7 = -d12;
        d22 = d7 * d9;
        d23 = d22 * d17;
        d24 = d5 * d15;
        d27 = d24 * d16;
        d23 -= d27;
        d16 = d16 * (d5 *= d9) + (d17 *= (d7 *= d15));
        double d38 = d19;
        d19 = d37;
        d36 /= d19;
        d19 = d38;
        while (n3 < d37) {
            d17 = d19 + d36;
            d27 = Math.sin(d17);
            d28 = Math.cos(d17);
            d32 = d12 * d9 * d28 + d2;
            d34 = d24 * d27;
            d38 = d36;
            d36 = d32 - d34;
            d32 = d12 * d15 * d28 + d26;
            d34 = d5 * d27;
            double d39 = d2;
            d2 = d34 + d32;
            d32 = d22 * d27;
            d34 = d24 * d28;
            d32 -= d34;
            d27 *= d7;
            d27 = d28 * d5 + d27;
            d19 = d17 - d19;
            d28 = Math.tan(d19 / d25);
            d19 = Math.sin(d19);
            d34 = 3.0;
            double d40 = d28 * d34 * d28;
            d28 = 4.0;
            d40 = (Math.sqrt(d40 + d28) - d30) * d19 / d34;
            d19 = d23 * d40 + d13;
            double d41 = d16 * d40 + d18;
            d16 = d40 * d32;
            double d42 = d7;
            d7 = d36 - d16;
            d16 = d9;
            d9 = d2 - (d40 *= d27);
            d18 = d12;
            path.rLineTo(0.0f, 0.0f);
            float f22 = (float)d19;
            f16 = (float)d41;
            float f23 = (float)d7;
            f18 = (float)d9;
            f17 = (float)d36;
            float f24 = (float)d2;
            path.cubicTo(f22, f16, f23, f18, f17, f24);
            ++n3;
            d7 = d42;
            d9 = d16;
            d19 = d17;
            d16 = d27;
            d23 = d32;
            d13 = d36;
            d18 = d2;
            d36 = d38;
            d2 = d39;
        }
    }
}

