/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.ArrayList;
import java.util.Arrays;

public final class f21
implements qy0_0 {
    public final DX2 a;
    public final boolean b;
    public final boolean c;
    public final BS1 d;
    public final BS1 e;
    public final BS1 f;
    public long g;
    public final boolean[] h;
    public String i;
    public wp3 j;
    public f21$a k;
    public boolean l;
    public long m;
    public boolean n;
    public final Xm2 o;

    public f21(DX2 object, boolean bl2, boolean bl3) {
        this.a = object;
        this.b = bl2;
        this.c = bl3;
        object = new boolean[3];
        this.h = (boolean[])object;
        this.d = object = new BS1(7);
        this.e = object = new BS1(8);
        this.f = object = new BS1(6);
        this.m = -9223372036854775807L;
        this.o = object = new Xm2();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Xm2 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 3;
        var5_5 = this.j;
        ct3.h(var5_5);
        var6_6 = gz3.a;
        var6_6 = var1_1.b;
        var7_7 = var1_1.c;
        var8_8 = var1_1.a;
        var9_9 = this.g;
        var11_10 = var1_1.a();
        var12_11 = var11_10;
        this.g = var9_9 += var12_11;
        var14_12 = this.j;
        var15_13 = var1_1.a();
        var14_12.f(var15_13, var1_1);
        while (true) {
            block35: {
                block34: {
                    block33: {
                        block32: {
                            if ((var16_14 = DS1.b((byte[])var8_8, var6_6, var7_7, (boolean[])(var3_3 = (Object)var2_2.h))) == var7_7) {
                                var2_2.b(var6_6, (byte[])var8_8, var7_7);
                                return;
                            }
                            var17_15 = var16_14 + 3;
                            var15_13 = var8_8[var17_15] & 31;
                            var11_10 = var16_14 - var6_6;
                            if (var11_10 > 0) {
                                var2_2.b(var6_6, (byte[])var8_8, var16_14);
                            }
                            var16_14 = var7_7 - var16_14;
                            var18_16 = var2_2.g;
                            var20_17 = var16_14;
                            var18_16 -= var20_17;
                            if (var11_10 < 0) {
                                var6_6 = -var11_10;
                            } else {
                                var6_6 = 0;
                                var5_5 = null;
                            }
                            var20_17 = var2_2.m;
                            var11_10 = (int)var2_2.l;
                            var22_18 = var2_2.e;
                            var23_19 = var2_2.d;
                            var24_20 = var2_2.a;
                            if (var11_10 == 0) ** GOTO lbl-1000
                            var25_21 = var2_2.k;
                            var11_10 = (int)var25_21.c;
                            if (var11_10 == 0) {
                                while (true) {
                                    var26_22 = var16_14;
                                    var27_23 = var7_7;
                                    var28_24 /* !! */  = var8_8;
                                    var29_25 = var17_15;
                                    var30_26 = var15_13;
                                    var31_27 = var18_16;
                                    var33_28 = var20_17;
lbl52:
                                    // 2 sources

                                    while (true) {
                                        var7_7 = 3;
                                        ** GOTO lbl184
                                        break;
                                    }
                                    break;
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var23_19.b(var6_6);
                                var22_18.b(var6_6);
                                var11_10 = (int)var2_2.l;
                                if (var11_10 == 0) {
                                    if ((var11_10 = (int)var23_19.c) == 0 || (var11_10 = (int)var22_18.c) == 0) ** continue;
                                    var25_21 = new ArrayList();
                                    var35_29 = var23_19.d;
                                    var27_23 = var7_7;
                                    var7_7 = var23_19.e;
                                    var35_29 = Arrays.copyOf((byte[])var35_29, var7_7);
                                    var25_21.add(var35_29);
                                    var35_29 = var22_18.d;
                                    var7_7 = var22_18.e;
                                    var35_29 = Arrays.copyOf((byte[])var35_29, var7_7);
                                    var25_21.add(var35_29);
                                    var35_29 = var23_19.d;
                                    var7_7 = var23_19.e;
                                    var28_24 /* !! */  = (byte[])var8_8;
                                    var35_29 = DS1.i(3, (byte[])var35_29, var7_7);
                                    var36_30 = var22_18.d;
                                    var37_31 = var22_18.e;
                                    var29_25 = var17_15;
                                    var30_26 = var15_13;
                                    var15_13 = 4;
                                    var14_12 = new Ym2(var36_30, var15_13, var37_31);
                                    var7_7 = var14_12.g();
                                    var37_31 = var14_12.g();
                                    var14_12.k();
                                    var17_15 = var14_12.e();
                                    var38_32 = new DS1$l(var7_7, var37_31, (boolean)var17_15);
                                    var8_8 = LW.a;
                                    var8_8 = var35_29.a;
                                    var17_15 = var35_29.b;
                                    var14_12 = var17_15;
                                    var26_22 = var16_14;
                                    var3_3 = var35_29.c;
                                    var31_27 = var18_16;
                                    var39_33 = new Object[]{var8_8, var14_12, var3_3};
                                    var3_3 = String.format("avc1.%02X%02X%02X", var39_33);
                                    var8_8 = var2_2.j;
                                    var14_12 = new d$a();
                                    var14_12.a = var40_34 = var2_2.i;
                                    var14_12.n = var40_34 = ip1_0.l("video/avc");
                                    var14_12.j = var3_3;
                                    var14_12.u = var16_14 = var35_29.e;
                                    var14_12.v = var16_14 = var35_29.f;
                                    var41_35 = var35_29.h + 8;
                                    var42_36 = var35_29.i + 8;
                                    var43_37 /* !! */  = var35_29.p;
                                    var44_38 = var35_29.q;
                                    var33_28 = var20_17;
                                    var45_39 = var35_29.r;
                                    var14_12.B = var3_3 = new VX((int)var43_37 /* !! */ , var44_38, var45_39, var41_35, var42_36, null);
                                    var14_12.y = var46_40 = var35_29.g;
                                    var14_12.q = var25_21;
                                    var14_12.p = var16_14 = var35_29.s;
                                    var25_21 = new d((d$a)var14_12);
                                    var8_8.d((d)var25_21);
                                    var37_31 = 1;
                                    var2_2.l = var37_31;
                                    var8_8 = var24_20.c;
                                    var8_8.getClass();
                                    if (var16_14 >= 0) {
                                        var17_15 = 1;
                                    } else {
                                        var17_15 = 0;
                                        var14_12 = null;
                                    }
                                    ct3.f((boolean)var17_15);
                                    var8_8.e = var16_14;
                                    var8_8.b(var16_14);
                                    var3_3 = var2_2.k.d;
                                    var37_31 = var35_29.d;
                                    var3_3.append(var37_31, var35_29);
                                    var3_3 = var2_2.k.e;
                                    var3_3.append(var7_7, var38_32);
                                    var23_19.c();
                                    var22_18.c();
                                    ** continue;
                                }
                                var26_22 = var16_14;
                                var27_23 = var7_7;
                                var28_24 /* !! */  = var8_8;
                                var29_25 = var17_15;
                                var30_26 = var15_13;
                                var31_27 = var18_16;
                                var33_28 = var20_17;
                                var16_14 = (int)var23_19.c;
                                if (var16_14 != 0) {
                                    var3_3 = var23_19.d;
                                    var4_4 = var23_19.e;
                                    var7_7 = 3;
                                    var3_3 = DS1.i(var7_7, (byte[])var3_3, var4_4);
                                    var35_29 = var24_20.c;
                                    var35_29.getClass();
                                    var37_31 = var3_3.s;
                                    if (var37_31 >= 0) {
                                        var17_15 = 1;
                                    } else {
                                        var17_15 = 0;
                                        var14_12 = null;
                                    }
                                    ct3.f((boolean)var17_15);
                                    var35_29.e = var37_31;
                                    var35_29.b(var37_31);
                                    var35_29 = var2_2.k.d;
                                    var37_31 = var3_3.d;
                                    var35_29.append(var37_31, var3_3);
                                    var23_19.c();
                                } else {
                                    var7_7 = 3;
                                    var16_14 = (int)var22_18.c;
                                    if (var16_14 != 0) {
                                        var3_3 = var22_18.d;
                                        var4_4 = var22_18.e;
                                        var8_8 = new Ym2;
                                        var17_15 = 4;
                                        var8_8((byte[])var3_3, var17_15, var4_4);
                                        var16_14 = var8_8.g();
                                        var4_4 = var8_8.g();
                                        var8_8.k();
                                        var37_31 = (int)var8_8.e();
                                        var14_12 = new DS1$l(var16_14, var4_4, (boolean)var37_31);
                                        var35_29 = var2_2.k.e;
                                        var35_29.append(var16_14, var14_12);
                                        var22_18.c();
                                    }
                                }
                            }
lbl184:
                            // 5 sources

                            var3_3 = var2_2.f;
                            var4_4 = (int)var3_3.b(var6_6);
                            if (var4_4 != 0) {
                                var35_29 = var3_3.d;
                                var6_6 = var3_3.e;
                                var4_4 = DS1.k(var6_6, (byte[])var35_29);
                                var5_5 = var3_3.d;
                                var8_8 = var2_2.o;
                                var8_8.G(var4_4, (byte[])var5_5);
                                var4_4 = 4;
                                var8_8.I(var4_4);
                                var24_20 = var24_20.c;
                                var47_41 = var33_28;
                                var24_20.a(var33_28, (Xm2)var8_8);
                            }
                            var24_20 = var2_2.k;
                            var4_4 = (int)var2_2.l;
                            var6_6 = var24_20.i;
                            var37_31 = 9;
                            if (var6_6 == var37_31) ** GOTO lbl-1000
                            var6_6 = (int)var24_20.c;
                            if (var6_6 == 0) ** GOTO lbl-1000
                            var5_5 = var24_20.n;
                            var8_8 = var24_20.m;
                            var17_15 = var5_5.a;
                            if (var17_15 == 0) ** GOTO lbl-1000
                            var17_15 = var8_8.a;
                            if (var17_15 != 0) {
                                var14_12 = var5_5.c;
                                ct3.h(var14_12);
                                var38_32 = var8_8.c;
                                ct3.h(var38_32);
                                var11_10 = var5_5.f;
                                var43_37 /* !! */  = var8_8.f;
                                if (var11_10 == var43_37 /* !! */  && (var11_10 = var5_5.g) == (var43_37 /* !! */  = (long)var8_8.g) && (var11_10 = (int)var5_5.h) == (var43_37 /* !! */  = (long)var8_8.h) && ((var11_10 = (int)var5_5.i) == 0 || (var11_10 = (int)var8_8.i) == 0 || (var11_10 = (int)var5_5.j) == (var43_37 /* !! */  = (long)var8_8.j)) && ((var11_10 = var5_5.d) == (var43_37 /* !! */  = (long)var8_8.d) || var11_10 != 0 && var43_37 /* !! */  != false)) {
                                    var15_13 = var38_32.m;
                                    var17_15 = var14_12.m;
                                    ** if (var17_15 == 0 && var15_13 == 0 && ((var11_10 = var5_5.m) != (var43_37 /* !! */  = (long)var8_8.m) || (var11_10 = var5_5.n) != (var43_37 /* !! */  = (long)var8_8.n)) || var17_15 == (var11_10 = 1) && var15_13 == var11_10 && ((var17_15 = var5_5.o) != (var15_13 = var8_8.o) || (var17_15 = var5_5.p) != (var15_13 = var8_8.p)) || (var17_15 = (int)var5_5.k) != (var15_13 = (int)var8_8.k) || var17_15 != 0 && (var6_6 = var5_5.l) != (var37_31 = var8_8.l)) goto lbl-1000
                                }
                            }
                            ** GOTO lbl-1000
lbl-1000:
                            // 3 sources

                            {
                                var4_4 = 0;
                                var35_29 = null;
                                ** GOTO lbl246
                            }
lbl-1000:
                            // 3 sources

                            {
                                if (var4_4 != 0 && (var4_4 = (int)var24_20.o) != 0) {
                                    var47_41 = var24_20.j;
                                    var18_16 = var31_27 - var47_41;
                                    var37_31 = (int)var18_16;
                                    var45_39 = var26_22 + var37_31;
                                    var49_42 = var24_20.q;
                                    var51_43 = -9223372036854775807L;
                                    cfr_temp_0 = var49_42 - var51_43;
                                    var43_37 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var43_37 /* !! */  != false) {
                                        var43_37 /* !! */  = (long)var24_20.r;
                                        var51_43 = var24_20.p;
                                        var44_38 = (int)(var47_41 -= var51_43);
                                        var14_12 = var24_20.a;
                                        var14_12.a(var49_42, (int)var43_37 /* !! */ , var44_38, var45_39, null);
                                    }
                                }
                                var24_20.p = var47_41 = var24_20.j;
                                var24_20.q = var47_41 = var24_20.l;
                                var4_4 = 0;
                                var35_29 = null;
                                var24_20.r = false;
                                var24_20.o = var6_6 = 1;
                            }
lbl246:
                            // 2 sources

                            var24_20.a();
                            var53_44 = var24_20.r;
                            if (var53_44 != 0) {
                                var2_2.n = false;
                            }
                            var47_41 = var2_2.m;
                            var53_44 = var2_2.l;
                            if (var53_44 == 0) ** GOTO lbl-1000
                            var24_20 = var2_2.k;
                            var53_44 = (int)var24_20.c;
                            if (var53_44 == 0) {
                                var53_44 = var30_26;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var53_44 = var30_26;
                                var23_19.d(var30_26);
                                var22_18.d(var30_26);
                            }
                            var3_3.d(var53_44);
                            var3_3 = var2_2.k;
                            var54_45 = var2_2.n;
                            var3_3.i = var53_44;
                            var3_3.l = var47_41;
                            var18_16 = var31_27;
                            var3_3.j = var31_27;
                            var3_3.s = var54_45;
                            var54_45 = var3_3.b;
                            if (var54_45 == 0) break block32;
                            var54_45 = 1;
                            if (var53_44 != var54_45) break block33;
                            while (true) {
                                var54_45 = 2;
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        var54_45 = 1;
                    }
                    var55_46 = var3_3.c;
                    if (var55_46 != 0) {
                        if (var53_44 == (var55_46 = 5) || var53_44 == var54_45) ** continue;
                        var54_45 = 2;
                        ** if (var53_44 == var54_45) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var53_44 = 1;
lbl285:
                            // 2 sources

                            while (true) {
                                var55_46 = 0;
                                var23_19 = null;
                                ** GOTO lbl305
                                break;
                            }
                        }
                    }
                    break block34;
lbl-1000:
                    // 2 sources

                    {
                        var24_20 = var3_3.m;
                        var3_3.m = var23_19 = var3_3.n;
                        var3_3.n = var24_20;
                        var55_46 = 0;
                        var23_19 = null;
                        var24_20.b = false;
                        var24_20.a = false;
                        var3_3.h = 0;
                        var53_44 = 1;
                        var3_3.k = var53_44;
                    }
                    break block35;
                }
                var53_44 = 1;
                var54_45 = 2;
                ** continue;
            }
            var7_7 = var27_23;
            var8_8 = var28_24 /* !! */ ;
            var6_6 = var29_25;
            var4_4 = 3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n3, byte[] byArray, int n4) {
        int n7;
        int n8;
        boolean bl2;
        boolean bl3;
        DS1$m dS1$m;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        Object object;
        int n20;
        int n21;
        Object object2;
        block32: {
            block35: {
                Ym2 ym2;
                block31: {
                    byte[] byArray2;
                    block33: {
                        block34: {
                            block30: {
                                DS1$l dS1$l;
                                byte[] byArray3;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    object2 = this;
                                                    n21 = n3;
                                                    byArray2 = byArray;
                                                    n20 = n4;
                                                    boolean bl4 = this.l;
                                                    if (!bl4) break block25;
                                                    object = this.k;
                                                    bl4 = ((f21$a)object).c;
                                                    if (!bl4) break block26;
                                                }
                                                ((f21)object2).d.a(n21, byArray2, n20);
                                                object = ((f21)object2).e;
                                                ((BS1)object).a(n21, byArray2, n20);
                                            }
                                            ((f21)object2).f.a(n21, byArray2, n20);
                                            object = ((f21)object2).k;
                                            n19 = ((f21$a)object).k;
                                            if (n19 == 0) {
                                                return;
                                            }
                                            byArray3 = ((f21$a)object).g;
                                            n18 = byArray3.length;
                                            n17 = ((f21$a)object).h + (n20 -= n21);
                                            n16 = 2;
                                            if (n18 < n17) {
                                                ((f21$a)object).g = byArray3 = Arrays.copyOf(byArray3, n17 *= 2);
                                            }
                                            byArray3 = ((f21$a)object).g;
                                            n18 = ((f21$a)object).h;
                                            System.arraycopy(byArray2, n21, byArray3, n18, n20);
                                            ((f21$a)object).h = n21 = ((f21$a)object).h + n20;
                                            byArray2 = ((f21$a)object).g;
                                            ym2 = ((f21$a)object).f;
                                            ym2.a = byArray2;
                                            n15 = 0;
                                            byArray2 = null;
                                            ym2.c = 0;
                                            ym2.b = n21;
                                            ym2.d = 0;
                                            ym2.a();
                                            n21 = (int)(ym2.c(8) ? 1 : 0);
                                            if (n21 == 0) {
                                                return;
                                            }
                                            ym2.k();
                                            n21 = ym2.f(n16);
                                            n19 = 5;
                                            ym2.l(n19);
                                            n18 = (int)(ym2.d() ? 1 : 0);
                                            if (n18 == 0) {
                                                return;
                                            }
                                            ym2.g();
                                            n18 = (int)(ym2.d() ? 1 : 0);
                                            if (n18 == 0) {
                                                return;
                                            }
                                            n18 = ym2.g();
                                            n17 = (int)(((f21$a)object).c ? 1 : 0);
                                            n14 = 1;
                                            if (n17 == 0) {
                                                ((f21$a)object).k = false;
                                                f21$a$a f21$a$a = ((f21$a)object).n;
                                                f21$a$a.e = n18;
                                                f21$a$a.b = n14;
                                                return;
                                            }
                                            n17 = (int)(ym2.d() ? 1 : 0);
                                            if (n17 == 0) {
                                                return;
                                            }
                                            SparseArray sparseArray = ((f21$a)object).e;
                                            n17 = ym2.g();
                                            int n22 = sparseArray.indexOfKey(n17);
                                            if (n22 < 0) {
                                                ((f21$a)object).k = false;
                                                return;
                                            }
                                            dS1$l = (DS1$l)sparseArray.get(n17);
                                            SparseArray sparseArray2 = ((f21$a)object).d;
                                            n10 = dS1$l.a;
                                            dS1$m = (DS1$m)sparseArray2.get(n10);
                                            n10 = (int)(dS1$m.j ? 1 : 0);
                                            if (n10 != 0) {
                                                n10 = (int)(ym2.c(n16) ? 1 : 0);
                                                if (n10 == 0) {
                                                    return;
                                                }
                                                ym2.l(n16);
                                            }
                                            if ((n10 = (int)(ym2.c(n16 = dS1$m.l) ? 1 : 0)) == 0) {
                                                return;
                                            }
                                            n16 = ym2.f(n16);
                                            n10 = (int)(dS1$m.k ? 1 : 0);
                                            if (n10 != 0) break block27;
                                            n10 = (int)(ym2.c(n14) ? 1 : 0);
                                            if (n10 == 0) {
                                                return;
                                            }
                                            n10 = (int)(ym2.e() ? 1 : 0);
                                            if (n10 == 0) break block28;
                                            bl3 = ym2.c(n14);
                                            if (!bl3) {
                                                return;
                                            }
                                            bl3 = ym2.e();
                                            bl2 = true;
                                            break block29;
                                        }
                                        n10 = 0;
                                    }
                                    bl3 = false;
                                    bl2 = false;
                                }
                                n8 = ((f21$a)object).i;
                                if (n8 == n19) {
                                    n19 = 1;
                                } else {
                                    n19 = 0;
                                    byArray3 = null;
                                }
                                if (n19 != 0) {
                                    n8 = (int)(ym2.d() ? 1 : 0);
                                    if (n8 == 0) {
                                        return;
                                    }
                                    n8 = ym2.g();
                                } else {
                                    n8 = 0;
                                }
                                n7 = dS1$l.b;
                                n15 = dS1$m.m;
                                if (n15 != 0) break block30;
                                n15 = dS1$m.n;
                                boolean bl5 = ym2.c(n15);
                                if (!bl5) {
                                    return;
                                }
                                n15 = ym2.f(n15);
                                if (n7 == 0 || n10 != 0) break block31;
                                n7 = ym2.d();
                                if (n7 == 0) {
                                    return;
                                }
                                n7 = ym2.h();
                                n20 = 0;
                                ym2 = null;
                                n14 = 0;
                                break block32;
                            }
                            if (n15 != n14 || (n15 = (int)(dS1$m.o ? 1 : 0)) != 0) break block33;
                            n15 = (int)(ym2.d() ? 1 : 0);
                            if (n15 == 0) {
                                return;
                            }
                            n15 = ym2.h();
                            if (n7 == 0 || n10 != 0) break block34;
                            n7 = ym2.d();
                            if (n7 == 0) {
                                return;
                            }
                            n14 = ym2.h();
                            n7 = 0;
                            Object var19_22 = null;
                            n20 = n15;
                            n15 = 0;
                            byArray2 = null;
                            break block32;
                        }
                        n20 = n15;
                        n15 = 0;
                        byArray2 = null;
                        break block35;
                    }
                    n15 = 0;
                    byArray2 = null;
                }
                n20 = 0;
                ym2 = null;
            }
            n14 = 0;
            n7 = 0;
            Object var19_21 = null;
        }
        object2 = ((f21$a)object).n;
        ((f21$a$a)object2).c = dS1$m;
        ((f21$a$a)object2).d = n21;
        ((f21$a$a)object2).e = n18;
        ((f21$a$a)object2).f = n16;
        ((f21$a$a)object2).g = n17;
        ((f21$a$a)object2).h = n10;
        ((f21$a$a)object2).i = bl2;
        ((f21$a$a)object2).j = bl3;
        ((f21$a$a)object2).k = n19;
        ((f21$a$a)object2).l = n8;
        ((f21$a$a)object2).m = n15;
        ((f21$a$a)object2).n = n7;
        ((f21$a$a)object2).o = n20;
        ((f21$a$a)object2).p = n14;
        n21 = 1;
        ((f21$a$a)object2).a = n21;
        ((f21$a$a)object2).b = n21;
        object2 = null;
        ((f21$a)object).k = false;
    }

    public final void c() {
        long l2;
        long l3;
        this.g = l3 = 0L;
        this.n = false;
        this.m = l2 = -9223372036854775807L;
        DS1.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.c.b(0);
        Object object = this.k;
        if (object != null) {
            ((f21$a)object).k = false;
            ((f21$a)object).o = false;
            object = ((f21$a)object).n;
            ((f21$a$a)object).b = false;
            ((f21$a$a)object).a = false;
        }
    }

    public final void d(boolean bl2) {
        Object object = this.j;
        ct3.h(object);
        if (bl2) {
            bl2 = false;
            object = this.a.c;
            ((wJ2)object).b(0);
            f21$a f21$a = this.k;
            long l2 = this.g;
            f21$a.a();
            f21$a.j = l2;
            long l3 = f21$a.q;
            long l4 = -9223372036854775807L;
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 != false) {
                int n3 = f21$a.r;
                long l8 = f21$a.p;
                int n4 = (int)(l2 -= l8);
                wp3 wp32 = f21$a.a;
                wp32.a(l3, n3, n4, 0, null);
            }
            f21$a.o = false;
        }
    }

    public final void e(gi0_0 gi0_02, Gs3$d gs3$d) {
        f21$a f21$a;
        gs3$d.a();
        gs3$d.b();
        Object object = gs3$d.e;
        this.i = object;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.j = object = gi0_02.n(n3, 2);
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        this.k = f21$a = new f21$a((wp3)object, bl2, bl3);
        this.a.a(gi0_02, gs3$d);
    }

    public final void f(int n3, long l2) {
        this.m = l2;
        int n4 = this.n;
        n3 = (n3 &= 2) != 0 ? 1 : 0;
        this.n = n3 |= n4;
    }
}

