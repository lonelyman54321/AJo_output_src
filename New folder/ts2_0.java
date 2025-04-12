/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/*
 * Renamed from ts2
 */
public final class ts2_0
implements vf3_0 {
    public final Xm2 a;
    public final Xm2 b;
    public final ts2$a c;
    public Inflater d;

    public ts2_0() {
        Object object = new Xm2();
        this.a = object;
        object = new Xm2();
        this.b = object;
        this.c = object = new ts2$a();
    }

    public final /* synthetic */ lf3_0 a(int n3, byte[] byArray, int n4) {
        return uf3_0.a(this, byArray, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(byte[] byArray, int n3, int n4, Vf3$b vf3$b, n60_0 n60_02) {
        int n7;
        ts2_0 ts2_02 = this;
        int n8 = n3;
        int n10 = n3 + n4;
        Object object = this.a;
        Object object2 = byArray;
        ((Xm2)object).G(n10, byArray);
        ((Xm2)object).I(n3);
        n8 = ((Xm2)object).a();
        n10 = 255;
        if (n8 > 0) {
            byte[] byArray2 = ((Xm2)object).a;
            n7 = ((Xm2)object).b;
            n8 = byArray2[n7] & n10;
            if (n8 == (n7 = 120)) {
                Inflater inflater;
                Inflater inflater2 = this.d;
                if (inflater2 == null) {
                    Inflater inflater3;
                    this.d = inflater3 = new Inflater();
                }
                if ((n8 = (int)(gz3.C((Xm2)object, (Xm2)(object2 = (Object)ts2_02.b), inflater = ts2_02.d) ? 1 : 0)) != 0) {
                    byte[] byArray3 = ((Xm2)object2).a;
                    n7 = ((Xm2)object2).c;
                    ((Xm2)object).G(n7, byArray3);
                }
            }
        }
        ts2$a ts2$a = ts2_02.c;
        n7 = 0;
        object2 = null;
        ts2$a.d = 0;
        ts2$a.e = 0;
        ts2$a.f = 0;
        ts2$a.g = 0;
        ts2$a.h = 0;
        ts2$a.i = 0;
        Object object3 = ts2$a.a;
        ((Xm2)object3).F(0);
        ts2$a.c = false;
        Bitmap.Config config = new ArrayList();
        while (true) {
            Object object4;
            Bitmap.Config config2;
            Object object5;
            block22: {
                int n14;
                block26: {
                    Object object6;
                    block30: {
                        float f5;
                        float f6;
                        int n15;
                        int n16;
                        int[] nArray;
                        float f7;
                        int n17;
                        int n18;
                        float f8;
                        int n19;
                        block29: {
                            int n20;
                            block28: {
                                block27: {
                                    int n21;
                                    block23: {
                                        block25: {
                                            int n22;
                                            block24: {
                                                block21: {
                                                    n21 = ((Xm2)object).a();
                                                    n19 = 3;
                                                    f8 = 4.2E-45f;
                                                    if (n21 < n19) {
                                                        object3 = config;
                                                        We0 we0 = new We0((List)config, -9223372036854775807L, -9223372036854775807L);
                                                        object5 = n60_02;
                                                        n60_02.accept(we0);
                                                        return;
                                                    }
                                                    n21 = ((Xm2)object).c;
                                                    n18 = ((Xm2)object).w();
                                                    n22 = ((Xm2)object).C();
                                                    n14 = ((Xm2)object).b + n22;
                                                    if (n14 <= n21) break block21;
                                                    ((Xm2)object).I(n21);
                                                    object2 = object;
                                                    object5 = object3;
                                                    config2 = config;
                                                    n17 = 0;
                                                    f7 = 0.0f;
                                                    object = null;
                                                    n21 = 255;
                                                    n20 = 0;
                                                    object4 = null;
                                                    break block22;
                                                }
                                                n21 = 128;
                                                nArray = ts2$a.b;
                                                if (n18 == n21) break block23;
                                                switch (n18) {
                                                    case 22: {
                                                        n21 = 19;
                                                        if (n22 < n21) break;
                                                        ts2$a.d = n21 = ((Xm2)object).C();
                                                        ts2$a.e = n21 = ((Xm2)object).C();
                                                        ((Xm2)object).J(11);
                                                        ts2$a.f = n21 = ((Xm2)object).C();
                                                        ts2$a.g = n21 = ((Xm2)object).C();
                                                        break;
                                                    }
                                                    case 21: {
                                                        n18 = 4;
                                                        if (n22 < n18) break;
                                                        ((Xm2)object).J(n19);
                                                        n19 = ((Xm2)object).w();
                                                        boolean bl2 = (n21 &= n19) != 0;
                                                        n21 = n22 + -4;
                                                        if (bl2) {
                                                            n19 = 7;
                                                            f8 = 9.8E-45f;
                                                            if (n21 < n19 || (n21 = ((Xm2)object).z()) < n18) break;
                                                            ts2$a.h = n19 = ((Xm2)object).C();
                                                            ts2$a.i = n19 = ((Xm2)object).C();
                                                            ((Xm2)object3).F(n21 += -4);
                                                            n21 = n22 + -11;
                                                        }
                                                        if ((n19 = ((Xm2)object3).b) >= (n18 = ((Xm2)object3).c) || n21 <= 0) break;
                                                        n21 = Math.min(n21, n18 -= n19);
                                                        byte[] byArray4 = ((Xm2)object3).a;
                                                        ((Xm2)object).g(n19, byArray4, n21);
                                                        ((Xm2)object3).I(n19 += n21);
                                                        break;
                                                    }
                                                    case 20: {
                                                        n19 = n22 % 5;
                                                        n18 = 2;
                                                        if (n19 == n18) break block24;
                                                    }
                                                }
                                                object6 = object;
                                                object4 = object3;
                                                config2 = config;
                                                n21 = 255;
                                                break block25;
                                            }
                                            ((Xm2)object).J(n18);
                                            Arrays.fill(nArray, 0);
                                            n22 /= 5;
                                            f8 = 0.0f;
                                            for (n19 = 0; n19 < n22; ++n19) {
                                                n18 = ((Xm2)object).w();
                                                int n24 = ((Xm2)object).w();
                                                int n25 = ((Xm2)object).w();
                                                int n26 = ((Xm2)object).w();
                                                int n27 = ((Xm2)object).w();
                                                double d2 = n24;
                                                n20 = n25 + -128;
                                                object6 = object;
                                                double d5 = n20;
                                                double d7 = 1.402 * d5;
                                                object4 = object3;
                                                double d9 = d7 + d2;
                                                n7 = (int)d9;
                                                n16 = n26 + -128;
                                                config2 = config;
                                                double d12 = n16;
                                                double d13 = 0.34414 * d12;
                                                d13 = d2 - d13;
                                                double d14 = 0.71414;
                                                d5 *= d14;
                                                d5 = d13 - d5;
                                                n10 = (int)d5;
                                                d13 = 1.772;
                                                d12 = d12 * d13 + d2;
                                                n17 = (int)d12;
                                                n16 = n27 << 24;
                                                n21 = 255;
                                                n15 = 0;
                                                f6 = 0.0f;
                                                n7 = gz3.h(n7, 0, n21) << 16 | n16;
                                                n10 = gz3.h(n10, 0, n21) << 8 | n7;
                                                n17 = gz3.h(n17, 0, n21);
                                                nArray[n18] = n10 |= n17;
                                                n10 = 255;
                                                n7 = 0;
                                                object2 = null;
                                                n21 = 128;
                                            }
                                            object6 = object;
                                            object4 = object3;
                                            config2 = config;
                                            n10 = 1;
                                            n21 = 255;
                                            ts2$a.c = n10;
                                        }
                                        object5 = object4;
                                        object2 = object6;
                                        n17 = 0;
                                        f7 = 0.0f;
                                        object = null;
                                        n20 = 0;
                                        object4 = null;
                                        break block26;
                                    }
                                    object6 = object;
                                    object4 = object3;
                                    config2 = config;
                                    n21 = 255;
                                    n10 = ts2$a.d;
                                    if (n10 == 0 || (n10 = ts2$a.e) == 0 || (n10 = ts2$a.h) == 0 || (n10 = ts2$a.i) == 0) break block27;
                                    object5 = object3;
                                    n17 = ((Xm2)object3).c;
                                    if (n17 == 0 || (n7 = ((Xm2)object3).b) != n17 || (n17 = (int)(ts2$a.c ? 1 : 0)) == 0) break block28;
                                    f7 = 0.0f;
                                    object = null;
                                    ((Xm2)object3).I(0);
                                    n17 = ts2$a.h;
                                    n7 = ts2$a.i;
                                    object2 = new int[n17 *= n7];
                                    n16 = 0;
                                    f5 = 0.0f;
                                    object3 = null;
                                    break block29;
                                }
                                object5 = object4;
                            }
                            n17 = 0;
                            f7 = 0.0f;
                            object = null;
                            n20 = 0;
                            object4 = null;
                            break block30;
                        }
                        while (n16 < n17) {
                            n15 = ((Xm2)object5).w();
                            if (n15 != 0) {
                                n19 = n16 + 1;
                                object2[n16] = n15 = nArray[n15];
                            } else {
                                n15 = ((Xm2)object5).w();
                                if (n15 == 0) continue;
                                n19 = n15 & 0x40;
                                if (n19 == 0) {
                                    n19 = n15 & 0x3F;
                                } else {
                                    n19 = (n15 & 0x3F) << 8;
                                    n18 = ((Xm2)object5).w();
                                    n19 |= n18;
                                }
                                if ((n15 &= 0x80) == 0) {
                                    n15 = 0;
                                    f6 = 0.0f;
                                    config = null;
                                    n18 = nArray[0];
                                } else {
                                    n15 = ((Xm2)object5).w();
                                    n18 = nArray[n15];
                                }
                                Arrays.fill((int[])object2, n16, n19 += n16, n18);
                            }
                            n16 = n19;
                        }
                        n17 = ts2$a.h;
                        n16 = ts2$a.i;
                        config = Bitmap.Config.ARGB_8888;
                        object = Bitmap.createBitmap((int[])object2, (int)n17, (int)n16, (Bitmap.Config)config);
                        object2 = new Pe0$a;
                        ((Pe0$a)object2)();
                        ((Pe0$a)object2).b = object;
                        f7 = ts2$a.f;
                        n16 = ts2$a.d;
                        f5 = n16;
                        ((Pe0$a)object2).h = f7 /= f5;
                        ((Pe0$a)object2).i = 0;
                        n15 = ts2$a.g;
                        f6 = n15;
                        n19 = ts2$a.e;
                        f8 = n19;
                        ((Pe0$a)object2).e = f6 /= f8;
                        ((Pe0$a)object2).f = 0;
                        ((Pe0$a)object2).g = 0;
                        ((Pe0$a)object2).l = f7 = (float)ts2$a.h / f5;
                        ((Pe0$a)object2).m = f7 = (float)ts2$a.i / f8;
                        object4 = ((Pe0$a)object2).a();
                        n17 = 0;
                        f7 = 0.0f;
                        object = null;
                    }
                    ts2$a.d = 0;
                    ts2$a.e = 0;
                    ts2$a.f = 0;
                    ts2$a.g = 0;
                    ts2$a.h = 0;
                    ts2$a.i = 0;
                    ((Xm2)object5).F(0);
                    ts2$a.c = false;
                    object2 = object6;
                }
                ((Xm2)object2).I(n14);
            }
            object3 = config2;
            if (object4 != null) {
                config2.add(object4);
            }
            object = object2;
            config = object3;
            n7 = 0;
            object2 = null;
            object3 = object5;
            n10 = 255;
        }
    }

    public final int c() {
        return 2;
    }

    public final /* synthetic */ void reset() {
    }
}

