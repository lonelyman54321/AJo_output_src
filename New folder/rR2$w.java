/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$w
implements rr2$x_0 {
    public byte[] a;
    public int b;
    public float[] c;
    public int d;

    public final void a(float f5, float f6) {
        int n3;
        this.f((byte)0);
        int n4 = 2;
        this.g(n4);
        float[] fArray = this.c;
        int n7 = this.d;
        this.d = n3 = n7 + 1;
        fArray[n7] = f5;
        this.d = n7 += n4;
        fArray[n3] = f6;
    }

    public final void b(float f5, float f6, float f7, float f8) {
        int n3;
        int n4;
        int n7;
        this.f((byte)3);
        int n8 = 4;
        this.g(n8);
        float[] fArray = this.c;
        int n10 = this.d;
        this.d = n7 = n10 + 1;
        fArray[n10] = f5;
        this.d = n4 = n10 + 2;
        fArray[n7] = f6;
        this.d = n3 = n10 + 3;
        fArray[n4] = f7;
        this.d = n10 += n8;
        fArray[n3] = f8;
    }

    public final void c(float f5, float f6, float f7, float f8, float f11, float f12) {
        int n3;
        int n4;
        int n7;
        this.f((byte)2);
        int n8 = 6;
        this.g(n8);
        float[] fArray = this.c;
        int n10 = this.d;
        this.d = n7 = n10 + 1;
        fArray[n10] = f5;
        this.d = n4 = n10 + 2;
        fArray[n7] = f6;
        this.d = n3 = n10 + 3;
        fArray[n4] = f7;
        this.d = n4 = n10 + 4;
        fArray[n3] = f8;
        this.d = n3 = n10 + 5;
        fArray[n4] = f11;
        this.d = n10 += n8;
        fArray[n3] = f12;
    }

    public final void close() {
        this.f((byte)8);
    }

    public final void d(float f5, float f6) {
        int n3;
        this.f((byte)1);
        int n4 = 2;
        this.g(n4);
        float[] fArray = this.c;
        int n7 = this.d;
        this.d = n3 = n7 + 1;
        fArray[n7] = f5;
        this.d = n7 += n4;
        fArray[n3] = f6;
    }

    /*
     * WARNING - void declaration
     */
    public final void e(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8, float f11) {
        void var7_12;
        void var6_11;
        int n3;
        int n4;
        int n7;
        void var5_10;
        void var4_7;
        if (bl2) {
            int n8 = 2;
        } else {
            boolean bl4 = false;
        }
        byte by2 = (byte)(var4_7 | 4 | var5_10);
        this.f(by2);
        int n10 = 5;
        this.g(n10);
        float[] fArray = this.c;
        int n14 = this.d;
        this.d = n7 = n14 + 1;
        fArray[n14] = f5;
        this.d = n4 = n14 + 2;
        fArray[n7] = f6;
        this.d = n3 = n14 + 3;
        fArray[n4] = f7;
        this.d = n4 = n14 + 4;
        fArray[n3] = var6_11;
        this.d = n14 += n10;
        fArray[n4] = var7_12;
    }

    public final void f(byte by2) {
        byte[] byArray;
        int n3 = this.b;
        byte[] byArray2 = this.a;
        int n4 = byArray2.length;
        if (n3 == n4) {
            n3 = byArray2.length * 2;
            byArray = new byte[n3];
            n4 = byArray2.length;
            System.arraycopy(byArray2, 0, byArray, 0, n4);
            this.a = byArray;
        }
        byArray = this.a;
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        byArray[n7] = by2;
    }

    public final void g(int n3) {
        float[] fArray = this.c;
        int n4 = fArray.length;
        int n7 = this.d + n3;
        if (n4 < n7) {
            n3 = fArray.length * 2;
            float[] fArray2 = new float[n3];
            n4 = fArray.length;
            n7 = 0;
            System.arraycopy(fArray, 0, fArray2, 0, n4);
            this.c = fArray2;
        }
    }

    public final void h(rr2$x_0 rr2$x_0) {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.b); ++i3) {
            byte by2;
            float f5;
            int n7;
            Object[] objectArray = this.a;
            n3 = objectArray[i3];
            if (n3 != 0) {
                n7 = 1;
                float f6 = Float.MIN_VALUE;
                if (n3 != n7) {
                    byte by4;
                    byte by5;
                    byte by6;
                    byte by7;
                    float f7;
                    float f8;
                    int n8 = 2;
                    f5 = 2.8E-45f;
                    if (n3 != n8) {
                        n8 = 3;
                        f5 = 4.2E-45f;
                        if (n3 != n8) {
                            n8 = 8;
                            f5 = 1.1E-44f;
                            if (n3 != n8) {
                                boolean bl2;
                                boolean bl3;
                                n8 = n3 & 2;
                                if (n8 != 0) {
                                    bl3 = true;
                                    f8 = Float.MIN_VALUE;
                                } else {
                                    bl3 = false;
                                    f8 = 0.0f;
                                }
                                if ((n3 &= 1) != 0) {
                                    bl2 = true;
                                    f7 = Float.MIN_VALUE;
                                } else {
                                    bl2 = false;
                                    f7 = 0.0f;
                                }
                                objectArray = this.c;
                                n7 = n4 + 1;
                                by7 = objectArray[n4];
                                n8 = n4 + 2;
                                by6 = objectArray[n7];
                                n7 = n4 + 3;
                                by5 = objectArray[n8];
                                n8 = n4 + 4;
                                byte by8 = objectArray[n7];
                                n4 += 5;
                                byte by9 = objectArray[n8];
                                rr2$x_0.e(by7, by6, by5, bl3, bl2, by8, by9);
                                continue;
                            }
                            rr2$x_0.close();
                            continue;
                        }
                        objectArray = this.c;
                        n7 = n4 + 1;
                        f5 = objectArray[n4];
                        int n10 = n4 + 2;
                        f6 = objectArray[n7];
                        int n14 = n4 + 3;
                        by4 = objectArray[n10];
                        n4 += 4;
                        by2 = objectArray[n14];
                        rr2$x_0.b(f5, f6, by4, by2);
                        continue;
                    }
                    objectArray = this.c;
                    n7 = n4 + 1;
                    by4 = objectArray[n4];
                    n8 = n4 + 2;
                    by7 = objectArray[n7];
                    n7 = n4 + 3;
                    by6 = objectArray[n8];
                    n8 = n4 + 4;
                    by5 = objectArray[n7];
                    n7 = n4 + 5;
                    f8 = objectArray[n8];
                    n4 += 6;
                    f7 = objectArray[n7];
                    rr2$x_0.c(by4, by7, by6, by5, f8, f7);
                    continue;
                }
                objectArray = this.c;
                n7 = n4 + 1;
                f5 = objectArray[n4];
                n4 += 2;
                by2 = objectArray[n7];
                rr2$x_0.d(f5, by2);
                continue;
            }
            objectArray = this.c;
            n7 = n4 + 1;
            f5 = objectArray[n4];
            n4 += 2;
            by2 = objectArray[n7];
            rr2$x_0.a(f5, by2);
        }
    }
}

