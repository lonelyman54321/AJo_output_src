/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.text.StringsKt;

/*
 * Renamed from Hh3
 */
public final class hh3_1 {
    public static float a(float f5) {
        float f6 = 0.04045f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object <= 0) {
            object = 1095678034;
            f6 = 12.92f;
            f5 /= f6;
        } else {
            object = 1065814589;
            f6 = 1.055f;
            double d2 = (f5 += 0.055f) / f6;
            double d5 = 2.4f;
            d2 = Math.pow(d2, d5);
            f5 = (float)d2;
        }
        return f5;
    }

    public static float b(float f5) {
        float f6 = 0.0031308f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object <= 0) {
            object = 1095678034;
            f6 = 12.92f;
            f5 *= f6;
        } else {
            double d2 = Math.pow(f5, 0.4166666567325592) * (double)1.055f;
            double d5 = 0.055f;
            f5 = (float)(d2 -= d5);
        }
        return f5;
    }

    public static int c(float f5, int n3, int n4) {
        if (n3 == n4) {
            return n3;
        }
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object <= 0) {
            return n3;
        }
        f6 = 1.0f;
        float f8 = f5 - f6;
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0) {
            return n4;
        }
        f6 = n3 >> 24 & 0xFF;
        float f11 = 255.0f;
        f6 /= f11;
        float f12 = (float)(n3 >> 16 & 0xFF) / f11;
        float f14 = (float)(n3 >> 8 & 0xFF) / f11;
        float f15 = (float)(n3 & 0xFF) / f11;
        float f16 = (float)(n4 >> 24 & 0xFF) / f11;
        float f17 = (float)(n4 >> 16 & 0xFF) / f11;
        float f18 = (float)(n4 >> 8 & 0xFF) / f11;
        float f19 = (float)(n4 & 0xFF) / f11;
        f12 = hh3_1.a(f12);
        f14 = hh3_1.a(f14);
        f15 = hh3_1.a(f15);
        f17 = hh3_1.a(f17);
        f18 = hh3_1.a(f18);
        f19 = hh3_1.a(f19);
        f6 = xu0_1.a(f16, f6, f5, f6);
        f12 = xu0_1.a(f17, f12, f5, f12);
        f14 = xu0_1.a(f18, f14, f5, f14);
        f5 = xu0_1.a(f19, f15, f5, f15);
        f15 = hh3_1.b(f12) * f11;
        f19 = hh3_1.b(f14) * f11;
        f5 = hh3_1.b(f5) * f11;
        object = Math.round(f6 *= f11) << 24;
        n3 = Math.round(f15) << 16 | object;
        n4 = Math.round(f19) << 8;
        return Math.round(f5) | (n3 |= n4);
    }

    public static final long d(long l2, long l3, long l4, String string2) {
        String string3;
        char c2;
        Serializable serializable;
        CharSequence charSequence;
        block5: {
            long l7;
            block6: {
                block4: {
                    try {
                        charSequence = System.getProperty(string2);
                    }
                    catch (SecurityException securityException) {
                        charSequence = null;
                    }
                    if (charSequence == null) break block4;
                    serializable = StringsKt.l0((String)charSequence);
                    c2 = '\'';
                    string3 = "System property '";
                    if (serializable == null) break block5;
                    l7 = serializable;
                    long l8 = l3 - l7;
                    Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object > 0 || (object = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) > 0) break block6;
                    l2 = l7;
                }
                return l2;
            }
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("' should be in range ");
            ((StringBuilder)charSequence).append(l3);
            fn0_2.b((StringBuilder)charSequence, "..", l4, ", but is '");
            ((StringBuilder)charSequence).append(l7);
            ((StringBuilder)charSequence).append(c2);
            String string4 = ((StringBuilder)charSequence).toString().toString();
            serializable = new IllegalStateException(string4);
            throw serializable;
        }
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        stringBuilder.append("' has unrecognized value '");
        stringBuilder.append((String)charSequence);
        stringBuilder.append(c2);
        String string5 = stringBuilder.toString().toString();
        serializable = new IllegalStateException(string5);
        throw serializable;
    }

    public static int e(int n3, int n4, int n7, int n8, String string2) {
        int n10 = n8 & 4;
        if (n10 != 0) {
            n4 = 1;
        }
        if ((n8 &= 8) != 0) {
            n7 = -1 >>> 1;
        }
        long l2 = n3;
        long l3 = n4;
        long l4 = n7;
        return (int)hh3_1.d(l2, l3, l4, string2);
    }
}

