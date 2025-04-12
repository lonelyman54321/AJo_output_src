/*
 * Decompiled with CFR 0.152.
 */
public final class OX {
    public static final long b = zx_0.d(0xFF000000L);
    public static final long c = zx_0.d(0xFF444444L);
    public static final long d = zx_0.d(0xFF888888L);
    public static final long e = zx_0.d(0xFFCCCCCCL);
    public static final long f = zx_0.d(0xFFFFFFFFL);
    public static final long g = zx_0.d(0xFFFF0000L);
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final /* synthetic */ int m;
    public final long a;

    static {
        zx_0.d(0xFF00FF00L);
        h = zx_0.d(0xFF0000FFL);
        i = zx_0.d(0xFFFFFF00L);
        j = zx_0.d(0xFF00FFFFL);
        zx_0.d(0xFFFF00FFL);
        k = zx_0.c(0);
        gp2_0 gp2_02 = eZ.s;
        l = zx_0.b(0.0f, 0.0f, 0.0f, 0.0f, gp2_02);
    }

    public /* synthetic */ OX(long l2) {
        this.a = l2;
    }

    public static final long a(long l2, py_1 object) {
        py_1 py_12 = OX.f(l2);
        int n3 = py_12.c;
        int n4 = ((py_1)object).c;
        int n7 = n3 | n4;
        if (n7 < 0) {
            object = ry_0.d(py_12, (py_1)object, 0);
        } else {
            tr1_1 tr1_12 = j50_0.a;
            Object object2 = tr1_12.c(n3 |= (n4 <<= 6));
            if (object2 == null) {
                object2 = ry_0.d(py_12, (py_1)object, 0);
                tr1_12.i(n3, object2);
            }
            object = object2;
            object = (i50)object2;
        }
        return ((i50)object).a(l2);
    }

    public static long b(long l2, float f5) {
        float f6 = OX.h(l2);
        float f7 = OX.g(l2);
        float f8 = OX.e(l2);
        py_1 py_12 = OX.f(l2);
        return zx_0.b(f6, f7, f8, f5, py_12);
    }

    public static final boolean c(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float d(long l2) {
        float f5;
        float f6;
        long l3 = (long)63 & l2;
        long l4 = 0L;
        long l7 = l3 - l4;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 == false) {
            int n3 = 56;
            l2 >>>= n3;
            l3 = 255L;
            double d2 = ht2_0.e(l2 &= l3);
            f6 = (float)d2;
            f5 = 255.0f;
            return f6 /= f5;
        } else {
            int n4 = 6;
            l2 >>>= n4;
            l3 = 1023L;
            double d5 = ht2_0.e(l2 &= l3);
            f6 = (float)d5;
            f5 = 1023.0f;
            return f6 /= f5;
        }
    }

    public static final float e(long l2) {
        float f5;
        block5: {
            int n3;
            int n4;
            int n7;
            int n8;
            block8: {
                int n10;
                float f6;
                block6: {
                    block7: {
                        block4: {
                            long l3 = (long)63 & l2;
                            long l4 = 0L;
                            long l7 = l3 - l4;
                            long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (l8 != false) break block4;
                            int n14 = 32;
                            l2 >>>= n14;
                            l3 = 255L;
                            double d2 = ht2_0.e(l2 &= l3);
                            f5 = (float)d2;
                            int n15 = 1132396544;
                            float f7 = 255.0f;
                            f5 /= f7;
                            break block5;
                        }
                        n8 = 16;
                        l2 >>>= n8;
                        long l12 = (char)-1;
                        n7 = (int)(l2 &= l12);
                        f6 = 9.1834E-41f;
                        n4 = (char)-1 & n7;
                        n3 = 0x8000 & n7;
                        n4 >>>= 10;
                        n10 = 31;
                        n7 &= 0x3FF;
                        if ((n4 &= n10) != 0) break block6;
                        if (n7 == 0) break block7;
                        n4 = 0x3F000000;
                        f5 = Float.intBitsToFloat(n7 += n4);
                        f6 = XR0.a;
                        f5 -= f6;
                        if (n3 != 0) {
                            f5 = -f5;
                        }
                        break block5;
                    }
                    n7 = 0;
                    f5 = 0.0f;
                    n4 = 0;
                    f6 = 0.0f;
                    break block8;
                }
                n7 <<= 13;
                if (n4 == n10) {
                    n4 = 255;
                    f6 = 3.57E-43f;
                    if (n7 != 0) {
                        n10 = 0x400000;
                        n7 |= n10;
                    }
                    n4 = n7;
                    n7 = 255;
                    f5 = 3.57E-43f;
                } else {
                    int n16 = n4 + 112;
                    n4 = n7;
                    n7 = n16;
                }
            }
            n8 = n3 << 16;
            n7 = n7 << 23 | n8 | n4;
            f5 = Float.intBitsToFloat(n7);
        }
        return f5;
    }

    public static final py_1 f(long l2) {
        int n3 = (int)(l2 &= (long)63);
        return eZ.u[n3];
    }

    public static final float g(long l2) {
        float f5;
        block5: {
            int n3;
            int n4;
            block8: {
                int n7;
                float f6;
                block6: {
                    block7: {
                        long l3;
                        block4: {
                            l3 = (long)63 & l2;
                            long l4 = 0L;
                            long l7 = l3 - l4;
                            long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (l8 != false) break block4;
                            int n8 = 40;
                            l2 >>>= n8;
                            l3 = 255L;
                            double d2 = ht2_0.e(l2 &= l3);
                            f5 = (float)d2;
                            int n10 = 1132396544;
                            float f7 = 255.0f;
                            f5 /= f7;
                            break block5;
                        }
                        l2 >>>= 32;
                        l3 = (char)-1;
                        n4 = (int)(l2 &= l3);
                        f6 = 9.1834E-41f;
                        n3 = (char)-1 & n4;
                        int n14 = 0x8000 & n4;
                        n3 >>>= 10;
                        n7 = 31;
                        n4 &= 0x3FF;
                        if ((n3 &= n7) != 0) break block6;
                        if (n4 == 0) break block7;
                        n3 = 0x3F000000;
                        f5 = Float.intBitsToFloat(n4 += n3);
                        f6 = XR0.a;
                        f5 -= f6;
                        if (n14 != 0) {
                            f5 = -f5;
                        }
                        break block5;
                    }
                    n4 = 0;
                    f5 = 0.0f;
                    n3 = 0;
                    f6 = 0.0f;
                    break block8;
                }
                n4 <<= 13;
                if (n3 == n7) {
                    n3 = 255;
                    f6 = 3.57E-43f;
                    if (n4 != 0) {
                        n7 = 0x400000;
                        n4 |= n7;
                    }
                    n3 = n4;
                    n4 = 255;
                    f5 = 3.57E-43f;
                } else {
                    int n15 = n3 + 112;
                    n3 = n4;
                    n4 = n15;
                }
            }
            n4 = n4 << 23 | (n14 <<= 16) | n3;
            f5 = Float.intBitsToFloat(n4);
        }
        return f5;
    }

    public static final float h(long l2) {
        float f5;
        block5: {
            int n3;
            int n4;
            block8: {
                int n7;
                float f6;
                block6: {
                    block7: {
                        int n8;
                        long l3;
                        block4: {
                            l3 = (long)63 & l2;
                            long l4 = 0L;
                            n8 = 48;
                            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                            if (l7 != false) break block4;
                            l2 >>>= n8;
                            l3 = 255L;
                            double d2 = ht2_0.e(l2 &= l3);
                            f5 = (float)d2;
                            int n10 = 1132396544;
                            float f7 = 255.0f;
                            f5 /= f7;
                            break block5;
                        }
                        l2 >>>= n8;
                        l3 = (char)-1;
                        n4 = (int)(l2 &= l3);
                        f6 = 9.1834E-41f;
                        n3 = (char)-1 & n4;
                        int n14 = 0x8000 & n4;
                        n3 >>>= 10;
                        n7 = 31;
                        n4 &= 0x3FF;
                        if ((n3 &= n7) != 0) break block6;
                        if (n4 == 0) break block7;
                        n3 = 0x3F000000;
                        f5 = Float.intBitsToFloat(n4 += n3);
                        f6 = XR0.a;
                        f5 -= f6;
                        if (n14 != 0) {
                            f5 = -f5;
                        }
                        break block5;
                    }
                    n4 = 0;
                    f5 = 0.0f;
                    n3 = 0;
                    f6 = 0.0f;
                    break block8;
                }
                n4 <<= 13;
                if (n3 == n7) {
                    n3 = 255;
                    f6 = 3.57E-43f;
                    if (n4 != 0) {
                        n7 = 0x400000;
                        n4 |= n7;
                    }
                    n3 = n4;
                    n4 = 255;
                    f5 = 3.57E-43f;
                } else {
                    int n15 = n3 + 112;
                    n3 = n4;
                    n4 = n15;
                }
            }
            n4 = n4 << 23 | (n14 <<= 16) | n3;
            f5 = Float.intBitsToFloat(n4);
        }
        return f5;
    }

    public static String i(long l2) {
        StringBuilder stringBuilder = new StringBuilder("Color(");
        float f5 = OX.h(l2);
        stringBuilder.append(f5);
        String string2 = ", ";
        stringBuilder.append(string2);
        float f6 = OX.g(l2);
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        f6 = OX.e(l2);
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        f6 = OX.d(l2);
        stringBuilder.append(f6);
        stringBuilder.append(string2);
        String string3 = OX.f((long)l2).a;
        return ui0_1.a(stringBuilder, string3, ')');
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof OX;
        boolean bl3 = false;
        if (bl2) {
            object = (OX)object;
            long l2 = this.a;
            long l3 = ((OX)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return mt3_0.a(this.a);
    }

    public final String toString() {
        return OX.i(this.a);
    }
}

