/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class C91$b {
    public final boolean a;
    public final ce_2 b;
    public int c;
    public boolean d;
    public int e;
    public w31_0[] f;
    public int g;
    public int h;
    public int i;

    public C91$b(ce_2 w31_0Array) {
        Intrinsics.checkNotNullParameter(w31_0Array, "out");
        this.a = true;
        this.b = w31_0Array;
        this.c = -1 >>> 1;
        this.e = 4096;
        w31_0Array = new w31_0[8];
        this.f = w31_0Array;
        this.g = 7;
    }

    public final void a(int n3) {
        if (n3 > 0) {
            int n4;
            w31_0 w31_02;
            int n7;
            int n8;
            w31_0[] w31_0Array = this.f;
            int n10 = 0;
            for (n8 = w31_0Array.length + -1; n8 >= (n7 = this.g) && n3 > 0; n8 += -1) {
                w31_0 w31_03 = this.f[n8];
                Intrinsics.checkNotNull(w31_03);
                n7 = w31_03.c;
                n3 -= n7;
                n7 = this.i;
                w31_02 = this.f[n8];
                Intrinsics.checkNotNull(w31_02);
                n4 = w31_02.c;
                this.i = n7 -= n4;
                this.h = n7 = this.h + -1;
                ++n10;
            }
            Object[] objectArray = this.f;
            n8 = ++n7 + n10;
            n4 = this.h;
            System.arraycopy(objectArray, n7, objectArray, n8, n4);
            objectArray = this.f;
            n8 = this.g + 1;
            n7 = n8 + n10;
            n4 = 0;
            w31_02 = null;
            Arrays.fill(objectArray, n8, n7, null);
            this.g = n3 = this.g + n10;
        }
    }

    public final void b(w31_0 objectArray) {
        int n3;
        int n4 = this.e;
        int n7 = 0;
        w31_0[] w31_0Array = null;
        int n8 = objectArray.c;
        if (n8 > n4) {
            int n10;
            objectArray = this.f;
            rp_1.o(null, objectArray);
            this.g = n10 = this.f.length + -1;
            this.h = 0;
            this.i = 0;
            return;
        }
        int n14 = this.i + n8 - n4;
        this.a(n14);
        n4 = this.h + 1;
        w31_0[] w31_0Array2 = this.f;
        int n15 = w31_0Array2.length;
        if (n4 > n15) {
            n4 = w31_0Array2.length * 2;
            w31_0[] w31_0Array3 = new w31_0[n4];
            n15 = w31_0Array2.length;
            int n16 = w31_0Array2.length;
            System.arraycopy(w31_0Array2, 0, w31_0Array3, n15, n16);
            w31_0Array = this.f;
            this.g = n7 = w31_0Array.length + -1;
            this.f = w31_0Array3;
        }
        n4 = this.g;
        this.g = n7 = n4 + -1;
        this.f[n4] = objectArray;
        this.h = n3 = this.h + 1;
        this.i = n3 = this.i + n8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(ff_2 var1_1) {
        var2_2 = 8;
        var3_3 = "data";
        Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
        var4_4 = this.a;
        var5_5 = this.b;
        var6_6 = 127;
        var7_7 = 0;
        if (var4_4 == 0) ** GOTO lbl-1000
        var3_3 = ub1_1.a;
        var3_3 = "bytes";
        Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
        var4_4 = var1_1.d();
        var10_9 = var8_8 = 0L;
        var13_11 /* !! */  = null;
        for (var12_10 = 0; var12_10 < var4_4; ++var12_10) {
            var14_12 = var1_1.i(var12_10);
            var15_13 = ez3.a;
            var14_12 &= 255;
            var15_13 = ub1_1.b;
            var14_12 = var15_13[var14_12];
            var16_14 = var14_12;
            var10_9 += var16_14;
        }
        var16_14 = 7;
        var18_15 = (var10_9 += var16_14) >> 3;
        var4_4 = (int)var18_15;
        var12_10 = var1_1.d();
        if (var4_4 < var12_10) {
            var3_3 = new ce_2();
            var13_11 /* !! */  = ub1_1.a;
            Intrinsics.checkNotNullParameter(var1_1, "source");
            var13_11 /* !! */  = (int[])"sink";
            Intrinsics.checkNotNullParameter(var3_3, (String)var13_11 /* !! */ );
            var12_10 = var1_1.d();
            var10_9 = var8_8;
            var20_16 = 0;
            while (var7_7 < var12_10) {
                var21_17 = var1_1.i(var7_7);
                var22_18 /* !! */  = ez3.a;
                var22_18 /* !! */  = (byte[])ub1_1.a;
                var14_12 = var22_18 /* !! */ [var21_17 &= 255];
                var15_13 = ub1_1.b;
                var21_17 = var15_13[var21_17];
                var10_9 <<= var21_17;
                var16_14 = var14_12;
                var10_9 |= var16_14;
                var20_16 += var21_17;
                while (var20_16 >= var2_2) {
                    var16_14 = var10_9 >> (var20_16 += -8);
                    var21_17 = (int)var16_14;
                    var3_3.U(var21_17);
                }
                ++var7_7;
            }
            if (var20_16 > 0) {
                var23_19 = var10_9 << (var2_2 -= var20_16);
                var10_9 = 255L;
                var25_20 = var10_9 >>> var20_16 | var23_19;
                var27_21 = (int)var25_20;
                var3_3.U(var27_21);
            }
            var25_20 = var3_3.b;
            var1_1 = var3_3.b0(var25_20);
            var2_2 = var1_1.d();
            var4_4 = 128;
            this.e(var2_2, var6_6, var4_4);
            var5_5.P(var1_1);
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = var1_1.d();
            this.e(var2_2, var6_6, 0);
            var5_5.P(var1_1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(ArrayList arrayList) {
        int n3;
        int n4;
        int n7;
        String string2 = "headerBlock";
        Intrinsics.checkNotNullParameter(arrayList, string2);
        int n8 = this.d;
        if (n8 != 0) {
            n8 = this.c;
            n7 = this.e;
            n4 = 32;
            n3 = 31;
            if (n8 < n7) {
                this.e(n8, n3, n4);
            }
            this.d = false;
            this.c = -1 >>> 1;
            n8 = this.e;
            this.e(n8, n3, n4);
        }
        n8 = arrayList.size();
        n7 = 0;
        while (true) {
            int n10;
            int n14;
            int n15;
            int n16;
            ff_2 ff_22;
            int n17;
            Object object;
            ff_2 ff_23;
            w31_0 w31_02;
            block16: {
                block17: {
                    block13: {
                        block14: {
                            w31_0[] w31_0Array;
                            block15: {
                                if (n7 >= n8) {
                                    return;
                                }
                                w31_02 = (w31_0)arrayList.get(n7);
                                ff_23 = w31_02.a.p();
                                object = (Integer)c91_0.b.get(ff_23);
                                n17 = -1;
                                ff_22 = w31_02.b;
                                if (object == null) break block13;
                                n16 = 2;
                                n15 = (Integer)object;
                                n14 = n15 + 1;
                                if (n16 > n14 || n14 >= (n16 = 8)) break block14;
                                w31_0Array = c91_0.a;
                                ff_2 ff_24 = w31_0Array[n15].b;
                                n10 = (int)(Intrinsics.areEqual(ff_24, ff_22) ? 1 : 0);
                                if (n10 == 0) break block15;
                                n15 = n14;
                                break block16;
                            }
                            ff_2 ff_25 = w31_0Array[n14].b;
                            n16 = (int)(Intrinsics.areEqual(ff_25, ff_22) ? 1 : 0);
                            if (n16 == 0) break block14;
                            int n18 = n14;
                            n14 = n15 += 2;
                            n15 = n18;
                            break block16;
                        }
                        n15 = n14;
                        break block17;
                    }
                    n15 = -1;
                }
                n14 = -1;
            }
            if (n14 == n17) {
                w31_0[] w31_0Array = this.f;
                n10 = w31_0Array.length;
                for (n16 = this.g + 1; n16 < n10; ++n16) {
                    w31_0[] w31_0Array2 = this.f[n16];
                    Intrinsics.checkNotNull(w31_0Array2);
                    w31_0Array2 = w31_0Array2.a;
                    int n19 = Intrinsics.areEqual(w31_0Array2, ff_23);
                    if (n19 == 0) continue;
                    w31_0Array2 = this.f[n16];
                    Intrinsics.checkNotNull(w31_0Array2);
                    w31_0Array2 = w31_0Array2.b;
                    n19 = Intrinsics.areEqual(w31_0Array2, ff_22);
                    if (n19 != 0) {
                        n14 = this.g;
                        n16 -= n14;
                        w31_0[] w31_0Array3 = c91_0.a;
                        n14 = w31_0Array3.length + n16;
                        break;
                    }
                    if (n15 != n17) continue;
                    n15 = this.g;
                    n15 = n16 - n15;
                    w31_0Array2 = c91_0.a;
                    n19 = w31_0Array2.length;
                    n15 += n19;
                }
            }
            if (n14 != n17) {
                n4 = 127;
                n3 = 128;
                this.e(n14, n4, n3);
            } else {
                n14 = 64;
                if (n15 == n17) {
                    object = this.b;
                    ((ce_2)object).U(n14);
                    this.c(ff_23);
                    this.c(ff_22);
                    this.b(w31_02);
                } else {
                    ff_2 ff_26 = w31_0.d;
                    ff_23.getClass();
                    String string3 = "prefix";
                    Intrinsics.checkNotNullParameter(ff_26, string3);
                    n16 = ff_26.d();
                    n17 = (int)(ff_23.l(0, ff_26, n16) ? 1 : 0);
                    if (n17 != 0 && (n3 = (int)(Intrinsics.areEqual(ff_26 = w31_0.i, ff_23) ? 1 : 0)) == 0) {
                        n4 = 15;
                        this.e(n15, n4, 0);
                        this.c(ff_22);
                    } else {
                        n3 = 63;
                        this.e(n15, n3, n14);
                        this.c(ff_22);
                        this.b(w31_02);
                    }
                }
            }
            ++n7;
        }
    }

    public final void e(int n3, int n4, int n7) {
        ce_2 ce_22 = this.b;
        if (n3 < n4) {
            ce_22.U(n3 |= n7);
            return;
        }
        ce_22.U(n7 |= n4);
        n3 -= n4;
        while (n3 >= (n4 = 128)) {
            n7 = n3 & 0x7F;
            ce_22.U(n4 |= n7);
            n3 >>>= 7;
        }
        ce_22.U(n3);
    }
}

