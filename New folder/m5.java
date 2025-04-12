/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;

public final class m5
implements eI0 {
    public final int a;
    public final n5 b;
    public final Xm2 c;
    public final Xm2 d;
    public final Vm2 e;
    public gi0_0 f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public m5() {
        this.a = 0;
        Object object = new n5(true, null, 0);
        this.b = object;
        Object object2 = new Xm2(2048);
        this.c = object2;
        this.i = -1;
        this.h = -1;
        object2 = new Xm2(10);
        this.d = object2;
        object2 = ((Xm2)object2).a;
        int n3 = ((Object)object2).length;
        this.e = object = new Vm2((byte[])object2, n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block34: {
            block35: {
                var3_3 = this;
                ct3.h(this.f);
                var4_4 = var1_1;
                var4_4 = (il0_0)var1_1;
                var5_5 = var4_4.c;
                var7_6 = this.a;
                var8_7 = var7_6 & 2;
                var9_8 = 0;
                var10_9 = null;
                var11_10 = 1;
                var12_11 = -1;
                if (var8_7 != 0 || (var13_12 = var7_6 & 1) != 0 && (var16_14 = (cfr_temp_0 = var5_5 - (var14_13 = (long)-1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0) break block35;
lbl13:
                // 2 sources

                while (true) {
                    var13_12 = -1;
                    ** GOTO lbl112
                    break;
                }
            }
            var17_16 = var3_3.e;
            var18_15 = var3_3.d;
            ** while ((var16_14 = var3_3.j) != 0)
lbl20:
            // 1 sources

            var3_3.i = var12_11;
            var19_17 = var1_1;
            var19_17 = (il0_0)var1_1;
            var19_17.f = 0;
            var20_18 = var19_17.d;
            var22_19 = 0L;
            cfr_temp_1 = var20_18 - var22_19;
            var24_20 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var24_20 /* !! */  == false) {
                var3_3.d((il0_0)var19_17);
            }
            var25_21 = 0;
            var26_22 = null;
            while (true) {
                var27_23 = var18_15.a;
                var28_24 = var1_1;
                var28_24 = (il0_0)var1_1;
                var12_11 = 2;
                var29_25 = var28_24.b(var27_23, 0, var12_11, (boolean)var11_10);
                if (var29_25 == 0) break block34;
                var18_15.I(0);
                var29_25 = var18_15.C() & (char)-10;
                var12_11 = (char)-16;
                if (var29_25 == var12_11) {
                    var29_25 = 1;
                } else {
                    var29_25 = 0;
                    var27_23 = null;
                }
                if (var29_25 == 0) {
                    var25_21 = 0;
                    var26_22 = null;
                    break block34;
                }
                var27_23 = var18_15.a;
                var12_11 = 4;
                var29_25 = (int)var28_24.b(var27_23, 0, var12_11, (boolean)var11_10);
                if (var29_25 == 0) break block34;
                var29_25 = 14;
                var17_16.m(var29_25);
                var29_25 = 13;
                var29_25 = var17_16.g(var29_25);
                var12_11 = 6;
                if (var29_25 <= var12_11) break;
                var30_26 = var29_25;
                var22_19 += var30_26;
                var9_8 = 1000;
                if (++var25_21 == var9_8) {
                    var9_8 = 1;
                    break block34;
                }
                var29_25 += -6;
                var9_8 = 1;
                var29_25 = (int)var28_24.l(var29_25, (boolean)var9_8);
                if (var29_25 != 0) {
                    var9_8 = 0;
                    var10_9 = null;
                    var11_10 = 1;
                    var12_11 = -1;
                    continue;
                }
                break block34;
                break;
            }
            var9_8 = 1;
            var3_3.j = var9_8;
            var17_16 = "Malformed ADTS stream";
            var32_27 = false;
            var18_15 = null;
            var17_16 = ParserException.a((String)var17_16, null);
            try {
                throw var17_16;
            }
            catch (EOFException v0) {
                ** continue;
            }
        }
lbl98:
        // 2 sources

        while (true) {
            var13_12 = 0;
            var17_16 = null;
            var19_17.f = 0;
            if (var25_21 > 0) {
                var14_13 = var25_21;
                var3_3.i = var13_12 = (int)(var22_19 /= var14_13);
                var13_12 = -1;
lbl106:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var3_3.i = var13_12 = -1;
            ** continue;
            var32_27 = true;
            var3_3.j = var32_27;
lbl112:
            // 2 sources

            var10_9 = var3_3.c;
            var18_15 = var10_9.a;
            var16_14 = 2048;
            var26_22 = var1_1;
            var26_22 = (il0_0)var1_1;
            var29_25 = 0;
            var27_23 = null;
            var11_10 = var26_22.read((byte[])var18_15, 0, var16_14);
            var33_28 = var11_10 == var13_12;
            var13_12 = (int)var3_3.l;
            var34_29 = var3_3.b;
            if (var13_12 == 0) {
                var13_12 = 1;
                if ((var7_6 &= var13_12) != 0 && (var7_6 = var3_3.i) > 0) {
                    var7_6 = 1;
                } else {
                    var7_6 = 0;
                    var4_4 = null;
                }
                var14_13 = -9223372036854775807L;
                if (var7_6 == 0 || (var29_25 = (cfr_temp_2 = (var35_30 = var34_29.r) - var14_13) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) != 0 || var33_28) {
                    if (var7_6 != 0 && (var7_6 = (int)((cfr_temp_3 = (var35_30 = var34_29.r) - var14_13) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) != 0) {
                        var4_4 = var3_3.f;
                        if (var8_7 != 0) {
                            var29_25 = 1;
                        } else {
                            var29_25 = 0;
                            var27_23 = null;
                        }
                        var24_20 /* !! */  = var3_3.i;
                        var14_13 = var24_20 /* !! */ ;
                        var37_31 = 8000000L;
                        var16_14 = (int)(var14_13 * var37_31 / var35_30);
                        var14_13 = var3_3.h;
                        var39_32 = var26_22;
                        var25_21 = (int)var24_20 /* !! */ ;
                        var26_22 = new n50_0(var5_5, var14_13, var16_14, (int)var24_20 /* !! */ , (boolean)var29_25);
                        var4_4.h((dx2_1)var26_22);
lbl148:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var4_4 = var3_3.f;
                    var39_33 = new dX2$b(var14_13);
                    var4_4.h(var39_33);
                    ** continue;
                    var7_6 = 1;
                    var3_3.l = var7_6;
                }
            }
            if (var33_28) {
                return -1;
            }
            var4_4 = null;
            var10_9.I(0);
            var10_9.H(var11_10);
            var7_6 = (int)var3_3.k;
            if (var7_6 == 0) {
                var34_29.t = var40_34 = var3_3.g;
                var7_6 = 1;
                var3_3.k = var7_6;
            }
            var34_29.a(var10_9);
            return 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b(fi0_0 fi0_02) {
        int n3;
        int n4;
        int n7;
        fi0_02 = (il0_0)fi0_02;
        int n8 = n7 = this.d((il0_0)fi0_02);
        int n10 = 0;
        int n14 = 0;
        do {
            block5: {
                Object object = this.d;
                byte[] byArray = ((Xm2)object).a;
                ((il0_0)fi0_02).b(byArray, 0, 2, false);
                ((Xm2)object).I(0);
                n3 = ((Xm2)object).C() & (char)-10;
                int n15 = -16;
                if (n3 == n15) {
                    int n16;
                    n3 = 1;
                    n15 = 4;
                    if ((n10 += n3) >= n15 && n14 > (n16 = 188)) {
                        return n3 != 0;
                    }
                    object = ((Xm2)object).a;
                    ((il0_0)fi0_02).b((byte[])object, 0, n15, false);
                    object = this.e;
                    ((Vm2)object).m(14);
                    n4 = ((Vm2)object).g(13);
                    n3 = 6;
                    if (n4 <= n3) {
                        ((il0_0)fi0_02).f = 0;
                        ((il0_0)fi0_02).l(++n8, false);
                        break block5;
                    } else {
                        n3 = n4 + -6;
                        ((il0_0)fi0_02).l(n3, false);
                        n14 += n4;
                        continue;
                    }
                }
                ((il0_0)fi0_02).f = 0;
                ((il0_0)fi0_02).l(++n8, false);
            }
            n10 = 0;
            n14 = 0;
        } while ((n4 = n8 - n7) < (n3 = 8192));
        return false;
    }

    public final void c(long l2, long l3) {
        this.k = false;
        this.b.c();
        this.g = l3;
    }

    public final int d(il0_0 il0_02) {
        int n3 = 0;
        while (true) {
            Xm2 xm2 = this.d;
            byte[] byArray = xm2.a;
            il0_02.b(byArray, 0, 10, false);
            xm2.I(0);
            int n4 = xm2.z();
            int n7 = 0x494433;
            if (n4 != n7) {
                il0_02.f = 0;
                il0_02.l(n3, false);
                long l2 = this.h;
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 == false) {
                    this.h = l2 = (long)n3;
                }
                return n3;
            }
            xm2.J(3);
            int n8 = xm2.v();
            n4 = n8 + 10;
            n3 += n4;
            il0_02.l(n8, false);
        }
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.f = gi0_02;
        Gs3$d gs3$d = new Gs3$d(0, 1);
        this.b.e(gi0_02, gs3$d);
        gi0_02.j();
    }

    public final void release() {
    }
}

