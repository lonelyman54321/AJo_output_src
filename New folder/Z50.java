/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class Z50
extends tf3_0 {
    public int A0;
    public Zw$b B0;
    public boolean C0;
    public Eu1 D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public qr_0[] I0;
    public qr_0[] J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public WeakReference N0;
    public WeakReference O0;
    public WeakReference P0;
    public WeakReference Q0;
    public HashSet R0;
    public Zw$a S0;
    public Zw y0;
    public cp0 z0;

    public Z50() {
        Object object = new Zw(this);
        this.y0 = object;
        this.z0 = object = new cp0(this);
        this.B0 = null;
        this.C0 = false;
        qr_0[] qr_0Array = new Eu1();
        this.D0 = qr_0Array;
        this.G0 = 0;
        this.H0 = 0;
        int n3 = 4;
        qr_0[] qr_0Array2 = new qr_0[n3];
        this.I0 = qr_0Array2;
        qr_0Array = new qr_0[n3];
        this.J0 = qr_0Array;
        this.K0 = 257;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        object = new HashSet();
        this.R0 = object;
        this.S0 = object = new Object();
    }

    public static void e0(Y50 y50, Zw$b zw$b, Zw$a zw$a) {
        if (zw$b == null) {
            return;
        }
        int n3 = y50.k0;
        int n4 = 8;
        float f5 = 1.1E-44f;
        if (n3 != n4 && (n3 = y50 instanceof w11_0) == 0 && (n3 = y50 instanceof Lv) == 0) {
            int n7;
            float f6;
            float f7;
            Y50$b y50$b;
            float f8;
            float f11;
            int n8;
            float f12;
            int n10;
            float f14;
            Y50$b y50$b2;
            Object object = y50.W;
            zw$a.a = y50$b2 = object[0];
            n4 = 1;
            f5 = Float.MIN_VALUE;
            zw$a.b = object = object[n4];
            zw$a.c = n3 = y50.v();
            zw$a.d = n3 = y50.p();
            zw$a.i = false;
            zw$a.j = 0;
            object = zw$a.a;
            Y50$b y50$b3 = Y50$b.MATCH_CONSTRAINT;
            if (object == y50$b3) {
                n3 = 1;
                f14 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f14 = 0.0f;
                object = null;
            }
            Y50$b y50$b4 = zw$a.b;
            if (y50$b4 == y50$b3) {
                n10 = 1;
                f12 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f12 = 0.0f;
                y50$b3 = null;
            }
            int n14 = 0;
            y50$b4 = null;
            if (n3 != 0 && (n8 = (f11 = (f8 = y50.a0) - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) > 0) {
                n8 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f8 = 0.0f;
                y50$b = null;
            }
            if (n10 != 0 && (n14 = (f7 = (f6 = y50.a0) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
                n14 = 1;
            } else {
                n14 = 0;
                y50$b4 = null;
            }
            if (n3 != 0 && (n7 = y50.y(0)) != 0 && (n7 = y50.t) == 0 && n8 == 0) {
                zw$a.a = object = Y50$b.WRAP_CONTENT;
                if (n10 != 0 && (n3 = y50.u) == 0) {
                    zw$a.a = object = Y50$b.FIXED;
                }
                n3 = 0;
                f14 = 0.0f;
                object = null;
            }
            if (n10 != 0 && (n7 = y50.y(n4)) != 0 && (n7 = y50.u) == 0 && n14 == 0) {
                zw$a.b = y50$b3 = Y50$b.WRAP_CONTENT;
                if (n3 != 0 && (n10 = y50.t) == 0) {
                    zw$a.b = y50$b3 = Y50$b.FIXED;
                }
                n10 = 0;
                f12 = 0.0f;
                y50$b3 = null;
            }
            if ((n7 = y50.F()) != 0) {
                zw$a.a = object = Y50$b.FIXED;
                n3 = 0;
                f14 = 0.0f;
                object = null;
            }
            if ((n7 = (int)(y50.G() ? 1 : 0)) != 0) {
                zw$a.b = y50$b3 = Y50$b.FIXED;
                n10 = 0;
                f12 = 0.0f;
                y50$b3 = null;
            }
            int[] nArray = y50.v;
            int n15 = 4;
            if (n8 != 0) {
                n8 = nArray[0];
                if (n8 == n15) {
                    zw$a.a = y50$b3 = Y50$b.FIXED;
                } else if (n10 == 0) {
                    y50$b3 = zw$a.b;
                    y50$b = Y50$b.FIXED;
                    if (y50$b3 == y50$b) {
                        n10 = zw$a.d;
                    } else {
                        zw$a.a = y50$b3 = Y50$b.WRAP_CONTENT;
                        zw$b.b(y50, zw$a);
                        n10 = zw$a.f;
                    }
                    zw$a.a = y50$b;
                    f8 = y50.a0;
                    f12 = n10;
                    zw$a.c = n10 = (int)(f8 *= f12);
                }
            }
            if (n14 != 0) {
                if ((n4 = nArray[n4]) == n15) {
                    zw$a.b = object = Y50$b.FIXED;
                } else if (n3 == 0) {
                    object = zw$a.a;
                    y50$b2 = Y50$b.FIXED;
                    if (object == y50$b2) {
                        n3 = zw$a.c;
                    } else {
                        zw$a.b = object = Y50$b.WRAP_CONTENT;
                        zw$b.b(y50, zw$a);
                        n3 = zw$a.e;
                    }
                    zw$a.b = y50$b2;
                    n4 = y50.b0;
                    n10 = -1;
                    f12 = 0.0f / 0.0f;
                    if (n4 == n10) {
                        f14 = n3;
                        f5 = y50.a0;
                        zw$a.d = n3 = (int)(f14 /= f5);
                    } else {
                        f5 = y50.a0;
                        f14 = n3;
                        zw$a.d = n3 = (int)(f5 *= f14);
                    }
                }
            }
            zw$b.b(y50, zw$a);
            int n16 = zw$a.e;
            y50.W(n16);
            n16 = zw$a.f;
            y50.R(n16);
            n16 = (int)(zw$a.h ? 1 : 0);
            y50.G = n16;
            n16 = zw$a.g;
            y50.N(n16);
            zw$a.j = 0;
            return;
        }
        zw$a.e = 0;
        zw$a.f = 0;
    }

    public final void H() {
        this.D0.t();
        this.E0 = 0;
        this.F0 = 0;
        super.H();
    }

    public final void X(boolean bl2, boolean bl3) {
        super.X(bl2, bl3);
        ArrayList arrayList = this.x0;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Y50 y50 = (Y50)this.x0.get(i3);
            y50.X(bl2, bl3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z() {
        block170: {
            block150: {
                block169: {
                    block168: {
                        block154: {
                            block167: {
                                block155: {
                                    block166: {
                                        block165: {
                                            block164: {
                                                block151: {
                                                    block163: {
                                                        block162: {
                                                            block161: {
                                                                block160: {
                                                                    var1_1 = this;
                                                                    var2_2 = 0;
                                                                    var3_3 /* !! */  = null;
                                                                    this.c0 = 0;
                                                                    this.d0 = 0;
                                                                    this.L0 = false;
                                                                    this.M0 = false;
                                                                    var4_4 = this.x0;
                                                                    var5_12 = var4_4.size();
                                                                    var6_13 /* !! */  = this.v();
                                                                    var6_13 /* !! */  = Math.max(0, var6_13 /* !! */ );
                                                                    var7_14 = this.p();
                                                                    var7_14 = Math.max(0, var7_14);
                                                                    var8_15 /* !! */  = this.W;
                                                                    var9_16 = 1;
                                                                    var10_17 = 1.4E-45f;
                                                                    var11_18 = var8_15 /* !! */ [var9_16];
                                                                    var8_15 /* !! */  = var8_15 /* !! */ [0];
                                                                    var12_19 = this.A0;
                                                                    var13_20 /* !! */  = this.M;
                                                                    var14_21 = this.L;
                                                                    if (var12_19 == 0 && (var12_19 = (int)T92.b(this.K0, var9_16)) != 0) {
                                                                        var15_22 /* !! */  = this.B0;
                                                                        var16_23 /* !! */  = this.W;
                                                                        var17_24 /* !! */  = var16_23 /* !! */ [0];
                                                                        var16_23 /* !! */  = var16_23 /* !! */ [var9_16];
                                                                        this.J();
                                                                        var18_25 /* !! */  = this.x0;
                                                                        var19_26 = var18_25 /* !! */ .size();
                                                                        var21_28 /* !! */  = null;
                                                                        for (var20_27 = 0; var20_27 < var19_26; ++var20_27) {
                                                                            var22_29 = (Y50)var18_25 /* !! */ .get(var20_27);
                                                                            var22_29.J();
                                                                        }
                                                                        var20_27 = (int)var1_1.C0;
                                                                        var23_30 /* !! */  = Y50$b.FIXED;
                                                                        if (var17_24 /* !! */  == var23_30 /* !! */ ) {
                                                                            var9_16 = this.v();
                                                                            var1_1.P(0, var9_16);
                                                                        } else {
                                                                            var14_21.l(0);
                                                                            var1_1.c0 = 0;
                                                                        }
                                                                        var9_16 = 0;
                                                                        var10_17 = 0.0f;
                                                                        var23_30 /* !! */  = null;
                                                                        var24_31 = 0;
                                                                        var17_24 /* !! */  = null;
                                                                        var25_32 = false;
                                                                        while (true) {
                                                                            var26_33 = 0.5f;
                                                                            if (var24_31 >= var19_26) break;
                                                                            var27_34 = var18_25 /* !! */ .get(var24_31);
                                                                            var3_3 /* !! */  = var27_34;
                                                                            var3_3 /* !! */  = (Y50)var27_34;
                                                                            var27_34 = var14_21;
                                                                            var28_35 = var3_3 /* !! */  instanceof w11_0;
                                                                            if (var28_35 != 0) {
                                                                                var3_3 /* !! */  = (w11_0)var3_3 /* !! */ ;
                                                                                var28_35 = var3_3 /* !! */ .B0;
                                                                                var29_36 = var7_14;
                                                                                var7_14 = 1;
                                                                                var30_37 = 1.4E-45f;
                                                                                if (var28_35 == var7_14) {
                                                                                    var7_14 = var3_3 /* !! */ .y0;
                                                                                    var9_16 = -1;
                                                                                    var10_17 = 0.0f / 0.0f;
                                                                                    if (var7_14 != var9_16) {
                                                                                        var3_3 /* !! */ .Z(var7_14);
                                                                                    } else {
                                                                                        var7_14 = var3_3 /* !! */ .z0;
                                                                                        if (var7_14 != var9_16 && (var7_14 = (int)this.F()) != 0) {
                                                                                            var7_14 = this.v();
                                                                                            var9_16 = var3_3 /* !! */ .z0;
                                                                                            var3_3 /* !! */ .Z(var7_14 -= var9_16);
                                                                                        } else {
                                                                                            var7_14 = (int)this.F();
                                                                                            if (var7_14 != 0) {
                                                                                                var30_37 = var3_3 /* !! */ .x0;
                                                                                                var9_16 = this.v();
                                                                                                var10_17 = var9_16;
                                                                                                var30_37 = var30_37 * var10_17 + var26_33;
                                                                                                var7_14 = (int)var30_37;
                                                                                                var3_3 /* !! */ .Z(var7_14);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var9_16 = 1;
                                                                                    var10_17 = 1.4E-45f;
                                                                                }
                                                                            } else {
                                                                                var29_36 = var7_14;
                                                                                var7_14 = var3_3 /* !! */  instanceof Lv;
                                                                                if (var7_14 != 0 && (var2_2 = (var3_3 /* !! */  = (Lv)var3_3 /* !! */ ).b0()) == 0) {
                                                                                    var25_32 = true;
                                                                                }
                                                                            }
                                                                            ++var24_31;
                                                                            var14_21 = var27_34;
                                                                            var7_14 = var29_36;
                                                                            var2_2 = 0;
                                                                            var3_3 /* !! */  = null;
                                                                        }
                                                                        var29_36 = var7_14;
                                                                        var27_34 = var14_21;
                                                                        if (var9_16 != 0) {
                                                                            var3_3 /* !! */  = null;
                                                                            for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                                var31_38 /* !! */  = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                                var9_16 = var31_38 /* !! */  instanceof w11_0;
                                                                                if (var9_16 != 0) {
                                                                                    var31_38 /* !! */  = (w11_0)var31_38 /* !! */ ;
                                                                                    var9_16 = var31_38 /* !! */ .B0;
                                                                                    var28_35 = 1;
                                                                                    if (var9_16 == var28_35) {
                                                                                        var9_16 = 0;
                                                                                        var10_17 = 0.0f;
                                                                                        var23_30 /* !! */  = null;
                                                                                        Bq0.b(0, var15_22 /* !! */ , (Y50)var31_38 /* !! */ , (boolean)var20_27);
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                var9_16 = 0;
                                                                                var10_17 = 0.0f;
                                                                                var23_30 /* !! */  = null;
                                                                            }
                                                                        }
                                                                        var9_16 = 0;
                                                                        var10_17 = 0.0f;
                                                                        var23_30 /* !! */  = null;
                                                                        Bq0.b(0, var15_22 /* !! */ , var1_1, (boolean)var20_27);
                                                                        if (var25_32) {
                                                                            var3_3 /* !! */  = null;
                                                                            for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                                var31_38 /* !! */  = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                                var9_16 = var31_38 /* !! */  instanceof Lv;
                                                                                if (var9_16 == 0 || (var9_16 = (var31_38 /* !! */  = (Lv)var31_38 /* !! */ ).b0()) != 0 || (var9_16 = var31_38 /* !! */ .a0()) == 0) continue;
                                                                                var9_16 = 1;
                                                                                var10_17 = 1.4E-45f;
                                                                                Bq0.b(var9_16, var15_22 /* !! */ , (Y50)var31_38 /* !! */ , (boolean)var20_27);
                                                                            }
                                                                        }
                                                                        if (var16_23 /* !! */  == (var3_3 /* !! */  = Y50$b.FIXED)) {
                                                                            var2_2 = this.p();
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var1_1.Q(0, var2_2);
                                                                        } else {
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var13_20 /* !! */ .l(0);
                                                                            var1_1.d0 = 0;
                                                                        }
                                                                        var3_3 /* !! */  = null;
                                                                        var7_14 = 0;
                                                                        var30_37 = 0.0f;
                                                                        var31_38 /* !! */  = null;
                                                                        var9_16 = 0;
                                                                        var10_17 = 0.0f;
                                                                        var23_30 /* !! */  = null;
                                                                        for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                            var14_21 = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                            var32_39 = var14_21 instanceof w11_0;
                                                                            if (var32_39 != 0) {
                                                                                var14_21 = (w11_0)var14_21;
                                                                                var32_39 = var14_21.B0;
                                                                                if (var32_39 != 0) continue;
                                                                                var7_14 = var14_21.y0;
                                                                                var32_39 = -1;
                                                                                var33_40 = 0.0f / 0.0f;
                                                                                if (var7_14 != var32_39) {
                                                                                    var14_21.Z(var7_14);
                                                                                } else {
                                                                                    var7_14 = var14_21.z0;
                                                                                    if (var7_14 != var32_39 && (var7_14 = (int)this.G()) != 0) {
                                                                                        var7_14 = this.p();
                                                                                        var32_39 = var14_21.z0;
                                                                                        var14_21.Z(var7_14 -= var32_39);
                                                                                    } else {
                                                                                        var7_14 = (int)this.G();
                                                                                        if (var7_14 != 0) {
                                                                                            var30_37 = var14_21.x0;
                                                                                            var32_39 = this.p();
                                                                                            var33_40 = var32_39;
                                                                                            var30_37 = var30_37 * var33_40 + var26_33;
                                                                                            var7_14 = (int)var30_37;
                                                                                            var14_21.Z(var7_14);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                var7_14 = 1;
                                                                                var30_37 = 1.4E-45f;
                                                                                continue;
                                                                            }
                                                                            var32_39 = var14_21 instanceof Lv;
                                                                            if (var32_39 == 0) continue;
                                                                            var14_21 = (Lv)var14_21;
                                                                            var28_35 = var14_21.b0();
                                                                            var32_39 = 1;
                                                                            var33_40 = 1.4E-45f;
                                                                            if (var28_35 != var32_39) continue;
                                                                            var9_16 = 1;
                                                                            var10_17 = 1.4E-45f;
                                                                        }
                                                                        if (var7_14 != 0) {
                                                                            var3_3 /* !! */  = null;
                                                                            for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                                var31_38 /* !! */  = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                                var28_35 = var31_38 /* !! */  instanceof w11_0;
                                                                                if (var28_35 == 0) continue;
                                                                                var31_38 /* !! */  = (w11_0)var31_38 /* !! */ ;
                                                                                var28_35 = var31_38 /* !! */ .B0;
                                                                                if (var28_35 != 0) continue;
                                                                                var28_35 = 1;
                                                                                Bq0.g(var28_35, var15_22 /* !! */ , (Y50)var31_38 /* !! */ );
                                                                            }
                                                                        }
                                                                        var2_2 = 0;
                                                                        var3_3 /* !! */  = null;
                                                                        Bq0.g(0, var15_22 /* !! */ , var1_1);
                                                                        if (var9_16 != 0) {
                                                                            var3_3 /* !! */  = null;
                                                                            for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                                var31_38 /* !! */  = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                                var9_16 = var31_38 /* !! */  instanceof Lv;
                                                                                if (var9_16 == 0 || (var9_16 = (var31_38 /* !! */  = (Lv)var31_38 /* !! */ ).b0()) != (var28_35 = 1) || (var9_16 = (int)var31_38 /* !! */ .a0()) == 0) continue;
                                                                                Bq0.g(var28_35, var15_22 /* !! */ , (Y50)var31_38 /* !! */ );
                                                                            }
                                                                        }
                                                                        var3_3 /* !! */  = null;
                                                                        for (var2_2 = 0; var2_2 < var19_26; ++var2_2) {
                                                                            var31_38 /* !! */  = (Y50)var18_25 /* !! */ .get(var2_2);
                                                                            var9_16 = (int)var31_38 /* !! */ .E();
                                                                            if (var9_16 == 0 || (var9_16 = (int)Bq0.a((Y50)var31_38 /* !! */ )) == 0) continue;
                                                                            var23_30 /* !! */  = Bq0.a;
                                                                            Z50.e0((Y50)var31_38 /* !! */ , var15_22 /* !! */ , (Zw$a)var23_30 /* !! */ );
                                                                            var9_16 = var31_38 /* !! */  instanceof w11_0;
                                                                            if (var9_16 != 0) {
                                                                                var23_30 /* !! */  = var31_38 /* !! */ ;
                                                                                var23_30 /* !! */  = (w11_0)var31_38 /* !! */ ;
                                                                                var9_16 = var23_30 /* !! */ .B0;
                                                                                if (var9_16 == 0) {
                                                                                    var9_16 = 0;
                                                                                    var10_17 = 0.0f;
                                                                                    var23_30 /* !! */  = null;
                                                                                    Bq0.g(0, var15_22 /* !! */ , (Y50)var31_38 /* !! */ );
                                                                                    continue;
                                                                                }
                                                                                var9_16 = 0;
                                                                                var10_17 = 0.0f;
                                                                                var23_30 /* !! */  = null;
                                                                                Bq0.b(0, var15_22 /* !! */ , (Y50)var31_38 /* !! */ , (boolean)var20_27);
                                                                                continue;
                                                                            }
                                                                            var9_16 = 0;
                                                                            var10_17 = 0.0f;
                                                                            var23_30 /* !! */  = null;
                                                                            Bq0.b(0, var15_22 /* !! */ , (Y50)var31_38 /* !! */ , (boolean)var20_27);
                                                                            Bq0.g(0, var15_22 /* !! */ , (Y50)var31_38 /* !! */ );
                                                                        }
                                                                        var3_3 /* !! */  = null;
                                                                        for (var2_2 = 0; var2_2 < var5_12; ++var2_2) {
                                                                            var31_38 /* !! */  = (Y50)var1_1.x0.get(var2_2);
                                                                            var9_16 = (int)var31_38 /* !! */ .E();
                                                                            if (var9_16 == 0 || (var9_16 = var31_38 /* !! */  instanceof w11_0) != 0 || (var9_16 = var31_38 /* !! */  instanceof Lv) != 0 || (var9_16 = var31_38 /* !! */  instanceof se3_0) != 0 || (var9_16 = (int)var31_38 /* !! */ .I) != 0) continue;
                                                                            var23_30 /* !! */  = null;
                                                                            var15_22 /* !! */  = var31_38 /* !! */ .o(0);
                                                                            var9_16 = 1;
                                                                            var10_17 = 1.4E-45f;
                                                                            var14_21 = var31_38 /* !! */ .o(var9_16);
                                                                            var21_28 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                                                            if (var15_22 /* !! */  == var21_28 /* !! */  && (var12_19 = var31_38 /* !! */ .t) != var9_16 && var14_21 == var21_28 /* !! */  && (var12_19 = var31_38 /* !! */ .u) != var9_16) continue;
                                                                            var23_30 /* !! */  = new Object();
                                                                            var15_22 /* !! */  = var1_1.B0;
                                                                            Z50.e0((Y50)var31_38 /* !! */ , var15_22 /* !! */ , (Zw$a)var23_30 /* !! */ );
                                                                        }
                                                                    } else {
                                                                        var29_36 = var7_14;
                                                                        var27_34 = var14_21;
                                                                    }
                                                                    var3_3 /* !! */  = var1_1.D0;
                                                                    var9_16 = 2;
                                                                    var10_17 = 2.8E-45f;
                                                                    if (var5_12 <= var9_16 || var8_15 /* !! */  != (var15_22 /* !! */  = Y50$b.WRAP_CONTENT) && var11_18 != var15_22 /* !! */ ) lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        while (true) {
                                                                            var7_14 = var6_13 /* !! */ ;
                                                                            var34_41 = var5_12;
                                                                            var35_42 = var13_20 /* !! */ ;
                                                                            var9_16 = var29_36;
                                                                            var36_43 = var11_18;
                                                                            var11_18 = var3_3 /* !! */ ;
                                                                            var3_3 /* !! */  = var8_15 /* !! */ ;
                                                                            var8_15 /* !! */  = var36_43;
                                                                            break block150;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var12_19 = var1_1.K0;
                                                                    ** while ((var12_19 = (int)T92.b((int)var12_19, (int)(var28_35 = 1024))) == 0)
lbl278:
                                                                    // 1 sources

                                                                    var15_22 /* !! */  = var1_1.B0;
                                                                    var14_21 = var1_1.x0;
                                                                    var20_27 = var14_21.size();
                                                                    var33_40 = 0.0f;
                                                                    var16_23 /* !! */  = null;
                                                                    for (var32_39 = 0; var32_39 < var20_27; ++var32_39) {
                                                                        var17_24 /* !! */  = (Y50)var14_21.get(var32_39);
                                                                        var18_25 /* !! */  = var1_1.W;
                                                                        var19_26 = 0;
                                                                        var23_30 /* !! */  = var18_25 /* !! */ [0];
                                                                        var37_44 = 1;
                                                                        var18_25 /* !! */  = var18_25 /* !! */ [var37_44];
                                                                        var31_38 /* !! */  = var17_24 /* !! */ .W;
                                                                        var35_42 = var13_20 /* !! */ ;
                                                                        var13_20 /* !! */  = var31_38 /* !! */ [0];
                                                                        var7_14 = (int)S11.b(var23_30 /* !! */ , (Y50$b)var18_25 /* !! */ , (Y50$b)var13_20 /* !! */ , (Y50$b)(var31_38 /* !! */  = var31_38 /* !! */ [var37_44]));
                                                                        if (var7_14 == 0) {
                                                                            while (true) {
                                                                                var38_45 = var6_13 /* !! */ ;
                                                                                var34_41 = var5_12;
                                                                                var39_46 /* !! */  = var8_15 /* !! */ ;
                                                                                var40_47 /* !! */  = var11_18;
                                                                                var11_18 = var3_3 /* !! */ ;
                                                                                break block151;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if ((var7_14 = var17_24 /* !! */  instanceof ds0_1) != 0) ** continue;
                                                                        var13_20 /* !! */  = var35_42;
                                                                        var9_16 = 2;
                                                                        var10_17 = 2.8E-45f;
                                                                    }
                                                                    var35_42 = var13_20 /* !! */ ;
                                                                    var7_14 = 0;
                                                                    var30_37 = 0.0f;
                                                                    var31_38 /* !! */  = null;
                                                                    var9_16 = 0;
                                                                    var10_17 = 0.0f;
                                                                    var23_30 /* !! */  = null;
                                                                    var41_48 = 0;
                                                                    var13_20 /* !! */  = null;
                                                                    var32_39 = 0;
                                                                    var33_40 = 0.0f;
                                                                    var16_23 /* !! */  = null;
                                                                    var24_31 = 0;
                                                                    var17_24 /* !! */  = null;
                                                                    var42_49 = 0;
                                                                    var43_50 = 0.0f;
                                                                    var18_25 /* !! */  = null;
                                                                    for (var19_26 = 0; var19_26 < var20_27; ++var19_26) {
                                                                        var40_47 /* !! */  = var14_21.get(var19_26);
                                                                        var34_41 = var5_12;
                                                                        var44_51 /* !! */  = var40_47 /* !! */ ;
                                                                        var44_51 /* !! */  = (Y50)var40_47 /* !! */ ;
                                                                        var40_47 /* !! */  = var11_18;
                                                                        var11_18 = var1_1.W;
                                                                        var38_45 = var6_13 /* !! */ ;
                                                                        var4_4 = var11_18[0];
                                                                        var37_44 = 1;
                                                                        var11_18 = var11_18[var37_44];
                                                                        var39_46 /* !! */  = var8_15 /* !! */ ;
                                                                        var8_15 /* !! */  = var44_51 /* !! */ .W;
                                                                        var45_52 /* !! */  = var3_3 /* !! */ ;
                                                                        var3_3 /* !! */  = var8_15 /* !! */ [0];
                                                                        var6_13 /* !! */  = (int)S11.b((Y50$b)var4_4, (Y50$b)var11_18, (Y50$b)var3_3 /* !! */ , (Y50$b)(var8_15 /* !! */  = var8_15 /* !! */ [var37_44]));
                                                                        if (var6_13 /* !! */  == 0) {
                                                                            var4_4 = var1_1.S0;
                                                                            Z50.e0(var44_51 /* !! */ , var15_22 /* !! */ , (Zw$a)var4_4);
                                                                        }
                                                                        if ((var6_13 /* !! */  = var44_51 /* !! */  instanceof w11_0) != 0) {
                                                                            var3_3 /* !! */  = var44_51 /* !! */ ;
                                                                            var3_3 /* !! */  = (w11_0)var44_51 /* !! */ ;
                                                                            var46_53 = var3_3 /* !! */ .B0;
                                                                            if (var46_53 == 0) {
                                                                                if (var13_20 /* !! */  == null) {
                                                                                    var13_20 /* !! */  = new ArrayList();
                                                                                }
                                                                                var13_20 /* !! */ .add(var3_3 /* !! */ );
                                                                            }
                                                                            if ((var46_53 = var3_3 /* !! */ .B0) == (var47_54 = 1)) {
                                                                                if (var31_38 /* !! */  == null) {
                                                                                    var31_38 /* !! */  = new ArrayList();
                                                                                }
                                                                                var31_38 /* !! */ .add(var3_3 /* !! */ );
                                                                            }
                                                                        }
                                                                        if ((var2_2 = var44_51 /* !! */  instanceof F41) != 0) {
                                                                            var2_2 = var44_51 /* !! */  instanceof Lv;
                                                                            if (var2_2 != 0) {
                                                                                var3_3 /* !! */  = var44_51 /* !! */ ;
                                                                                var3_3 /* !! */  = (Lv)var44_51 /* !! */ ;
                                                                                var46_53 = var3_3 /* !! */ .b0();
                                                                                if (var46_53 == 0) {
                                                                                    if (var23_30 /* !! */  == null) {
                                                                                        var23_30 /* !! */  = new ArrayList();
                                                                                    }
                                                                                    var23_30 /* !! */ .add(var3_3 /* !! */ );
                                                                                }
                                                                                if ((var46_53 = var3_3 /* !! */ .b0()) == (var47_54 = 1)) {
                                                                                    if (var16_23 /* !! */  == null) {
                                                                                        var16_23 /* !! */  = new ArrayList();
                                                                                    }
                                                                                    var16_23 /* !! */ .add(var3_3 /* !! */ );
                                                                                }
                                                                            } else {
                                                                                var3_3 /* !! */  = var44_51 /* !! */ ;
                                                                                var3_3 /* !! */  = (F41)var44_51 /* !! */ ;
                                                                                if (var23_30 /* !! */  == null) {
                                                                                    var23_30 /* !! */  = new ArrayList();
                                                                                }
                                                                                var23_30 /* !! */ .add(var3_3 /* !! */ );
                                                                                if (var16_23 /* !! */  == null) {
                                                                                    var16_23 /* !! */  = new ArrayList();
                                                                                }
                                                                                var16_23 /* !! */ .add(var3_3 /* !! */ );
                                                                            }
                                                                        }
                                                                        if ((var3_3 /* !! */  = ((Y50)var44_51 /* !! */ ).L.f) == null && (var3_3 /* !! */  = ((Y50)var44_51 /* !! */ ).N.f) == null && var6_13 /* !! */  == 0 && (var2_2 = var44_51 /* !! */  instanceof Lv) == 0) {
                                                                            if (var17_24 /* !! */  == null) {
                                                                                var17_24 /* !! */  = new ArrayList();
                                                                            }
                                                                            var17_24 /* !! */ .add(var44_51 /* !! */ );
                                                                        }
                                                                        if ((var3_3 /* !! */  = ((Y50)var44_51 /* !! */ ).M.f) == null && (var3_3 /* !! */  = ((Y50)var44_51 /* !! */ ).O.f) == null && (var3_3 /* !! */  = ((Y50)var44_51 /* !! */ ).P.f) == null && var6_13 /* !! */  == 0 && (var6_13 /* !! */  = var44_51 /* !! */  instanceof Lv) == 0) {
                                                                            if (var18_25 /* !! */  == null) {
                                                                                var18_25 /* !! */  = new ArrayList();
                                                                            }
                                                                            var18_25 /* !! */ .add(var44_51 /* !! */ );
                                                                        }
                                                                        var11_18 = var40_47 /* !! */ ;
                                                                        var5_12 = var34_41;
                                                                        var6_13 /* !! */  = var38_45;
                                                                        var8_15 /* !! */  = var39_46 /* !! */ ;
                                                                        var3_3 /* !! */  = var45_52 /* !! */ ;
                                                                    }
                                                                    var38_45 = var6_13 /* !! */ ;
                                                                    var45_52 /* !! */  = var3_3 /* !! */ ;
                                                                    var34_41 = var5_12;
                                                                    var39_46 /* !! */  = var8_15 /* !! */ ;
                                                                    var40_47 /* !! */  = var11_18;
                                                                    var4_4 = new ArrayList();
                                                                    if (var31_38 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var31_38 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (w11_0)var3_3 /* !! */ .next();
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var7_14 = 0;
                                                                    var30_37 = 0.0f;
                                                                    var31_38 /* !! */  = null;
                                                                    var46_53 = 0;
                                                                    var8_15 /* !! */  = null;
                                                                    if (var23_30 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var23_30 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (F41)var3_3 /* !! */ .next();
                                                                            var23_30 /* !! */  = S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                            var44_51 /* !! */ .Z(0, (VF3)var23_30 /* !! */ , (ArrayList)var4_4);
                                                                            var23_30 /* !! */ .a((ArrayList)var4_4);
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.LEFT;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.RIGHT;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.CENTER;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 0;
                                                                            var30_37 = 0.0f;
                                                                            var31_38 /* !! */  = null;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var7_14 = 0;
                                                                    var30_37 = 0.0f;
                                                                    var31_38 /* !! */  = null;
                                                                    var46_53 = 0;
                                                                    var8_15 /* !! */  = null;
                                                                    if (var17_24 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var17_24 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (Y50)var3_3 /* !! */ .next();
                                                                            S11.a(var44_51 /* !! */ , 0, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    if (var13_20 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var13_20 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (w11_0)var3_3 /* !! */ .next();
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var7_14 = 1;
                                                                    var30_37 = 1.4E-45f;
                                                                    if (var16_23 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var16_23 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (F41)var3_3 /* !! */ .next();
                                                                            var23_30 /* !! */  = S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                            var44_51 /* !! */ .Z(var7_14, (VF3)var23_30 /* !! */ , (ArrayList)var4_4);
                                                                            var23_30 /* !! */ .a((ArrayList)var4_4);
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.TOP;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.BASELINE;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.BOTTOM;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = v50$a.CENTER;
                                                                    var3_3 /* !! */  = var1_1.n((v50$a)var3_3 /* !! */ ).a;
                                                                    if (var3_3 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = ((v50_0)var3_3 /* !! */ .next()).d;
                                                                            var7_14 = 1;
                                                                            var30_37 = 1.4E-45f;
                                                                            var46_53 = 0;
                                                                            var8_15 /* !! */  = null;
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var7_14 = 1;
                                                                    var30_37 = 1.4E-45f;
                                                                    var46_53 = 0;
                                                                    var8_15 /* !! */  = null;
                                                                    if (var18_25 /* !! */  != null) {
                                                                        var3_3 /* !! */  = var18_25 /* !! */ .iterator();
                                                                        while ((var5_12 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                            var44_51 /* !! */  = (Y50)var3_3 /* !! */ .next();
                                                                            S11.a(var44_51 /* !! */ , var7_14, (ArrayList)var4_4, null);
                                                                        }
                                                                    }
                                                                    var3_3 /* !! */  = null;
                                                                    for (var2_2 = 0; var2_2 < var20_27; ++var2_2) {
                                                                        block153: {
                                                                            block152: {
                                                                                var44_51 /* !! */  = (Y50)var14_21.get(var2_2);
                                                                                var31_38 /* !! */  = var44_51 /* !! */ .W;
                                                                                var46_53 = 0;
                                                                                var23_30 /* !! */  = var31_38 /* !! */ [0];
                                                                                var8_15 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                                                                if (var23_30 /* !! */  != var8_15 /* !! */ ) continue;
                                                                                var9_16 = 1;
                                                                                var10_17 = 1.4E-45f;
                                                                                if ((var31_38 /* !! */  = var31_38 /* !! */ [var9_16]) != var8_15 /* !! */ ) continue;
                                                                                var7_14 = var44_51 /* !! */ .v0;
                                                                                var46_53 = var4_4.size();
                                                                                var10_17 = 0.0f;
                                                                                var23_30 /* !! */  = null;
                                                                                for (var9_16 = 0; var9_16 < var46_53; ++var9_16) {
                                                                                    var11_18 = (VF3)var4_4.get(var9_16);
                                                                                    var12_19 = var11_18.b;
                                                                                    if (var7_14 != var12_19) {
                                                                                        continue;
                                                                                    }
                                                                                    break block152;
                                                                                }
                                                                                var47_54 = 0;
                                                                                var11_18 = null;
                                                                            }
                                                                            var5_12 = var44_51 /* !! */ .w0;
                                                                            var7_14 = var4_4.size();
                                                                            var8_15 /* !! */  = null;
                                                                            for (var46_53 = 0; var46_53 < var7_14; ++var46_53) {
                                                                                var23_30 /* !! */  = (VF3)var4_4.get(var46_53);
                                                                                var12_19 = var23_30 /* !! */ .b;
                                                                                if (var5_12 != var12_19) {
                                                                                    continue;
                                                                                }
                                                                                break block153;
                                                                            }
                                                                            var9_16 = 0;
                                                                            var10_17 = 0.0f;
                                                                            var23_30 /* !! */  = null;
                                                                        }
                                                                        if (var11_18 == null || var23_30 /* !! */  == null) continue;
                                                                        var44_51 /* !! */  = null;
                                                                        var11_18.c(0, (VF3)var23_30 /* !! */ );
                                                                        var23_30 /* !! */ .c = var5_12 = 2;
                                                                        var4_4.remove(var11_18);
                                                                    }
                                                                    var2_2 = var4_4.size();
                                                                    if (var2_2 > (var5_12 = 1)) break block160;
                                                                    var11_18 = var45_52 /* !! */ ;
                                                                    break block151;
                                                                }
                                                                var3_3 /* !! */  = var1_1.W;
                                                                var5_12 = 0;
                                                                var44_51 /* !! */  = Y50$b.WRAP_CONTENT;
                                                                if ((var3_3 /* !! */  = var3_3 /* !! */ [0]) != var44_51 /* !! */ ) break block161;
                                                                var3_3 /* !! */  = var4_4.iterator();
                                                                var5_12 = 0;
                                                                var44_51 /* !! */  = null;
                                                                var7_14 = 0;
                                                                var30_37 = 0.0f;
                                                                var31_38 /* !! */  = null;
                                                                while ((var46_53 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                                                    var8_15 /* !! */  = (VF3)var3_3 /* !! */ .next();
                                                                    var9_16 = var8_15 /* !! */ .c;
                                                                    var47_54 = 1;
                                                                    if (var9_16 == var47_54) continue;
                                                                    var11_18 = var45_52 /* !! */ ;
                                                                    var9_16 = 0;
                                                                    var10_17 = 0.0f;
                                                                    var23_30 /* !! */  = null;
                                                                    var12_19 = var8_15 /* !! */ .b((Eu1)var45_52 /* !! */ , 0);
                                                                    if (var12_19 > var7_14) {
                                                                        var44_51 /* !! */  = var8_15 /* !! */ ;
                                                                        var7_14 = var12_19;
                                                                    }
                                                                    var45_52 /* !! */  = var11_18;
                                                                }
                                                                var11_18 = var45_52 /* !! */ ;
                                                                if (var44_51 /* !! */  == null) break block162;
                                                                var3_3 /* !! */  = Y50$b.FIXED;
                                                                var1_1.S((Y50$b)var3_3 /* !! */ );
                                                                var1_1.W(var7_14);
                                                                break block163;
                                                            }
                                                            var11_18 = var45_52 /* !! */ ;
                                                        }
                                                        var5_12 = 0;
                                                        var44_51 /* !! */  = null;
                                                    }
                                                    var3_3 /* !! */  = var1_1.W;
                                                    var7_14 = 1;
                                                    var30_37 = 1.4E-45f;
                                                    var3_3 /* !! */  = var3_3 /* !! */ [var7_14];
                                                    var31_38 /* !! */  = Y50$b.WRAP_CONTENT;
                                                    if (var3_3 /* !! */  != var31_38 /* !! */ ) ** GOTO lbl-1000
                                                    var4_4 = var4_4.iterator();
                                                    var2_2 = 0;
                                                    var3_3 /* !! */  = null;
                                                    var7_14 = 0;
                                                    var30_37 = 0.0f;
                                                    var31_38 /* !! */  = null;
                                                    while ((var46_53 = (int)var4_4.hasNext()) != 0) {
                                                        var8_15 /* !! */  = (VF3)var4_4.next();
                                                        var9_16 = var8_15 /* !! */ .c;
                                                        if (var9_16 == 0) continue;
                                                        var9_16 = 1;
                                                        var10_17 = 1.4E-45f;
                                                        var12_19 = var8_15 /* !! */ .b((Eu1)var11_18, var9_16);
                                                        if (var12_19 <= var7_14) continue;
                                                        var3_3 /* !! */  = var8_15 /* !! */ ;
                                                        var7_14 = var12_19;
                                                    }
                                                    if (var3_3 /* !! */  != null) {
                                                        var4_4 = Y50$b.FIXED;
                                                        var1_1.U((Y50$b)var4_4);
                                                        var1_1.R(var7_14);
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var2_2 = 0;
                                                        var3_3 /* !! */  = null;
                                                    }
                                                    if (var44_51 /* !! */  != null || var3_3 /* !! */  != null) break block164;
                                                }
                                                var9_16 = var29_36;
                                                var8_15 /* !! */  = var40_47 /* !! */ ;
                                                var7_14 = var38_45;
                                                var3_3 /* !! */  = var39_46 /* !! */ ;
                                                break block150;
                                            }
                                            var4_4 = Y50$b.WRAP_CONTENT;
                                            var3_3 /* !! */  = var39_46 /* !! */ ;
                                            if (var39_46 /* !! */  != var4_4) break block165;
                                            var5_12 = this.v();
                                            var7_14 = var38_45;
                                            if (var38_45 < var5_12 && var38_45 > 0) {
                                                var1_1.W(var38_45);
                                                var5_12 = 1;
                                                var1_1.L0 = var5_12;
                                                break block166;
                                            } else {
                                                var5_12 = this.v();
lbl711:
                                                // 2 sources

                                                while (true) {
                                                    var8_15 /* !! */  = var40_47 /* !! */ ;
                                                    if (var40_47 /* !! */  != var4_4) break block154;
                                                    break block155;
                                                    break;
                                                }
                                            }
                                        }
                                        var7_14 = var38_45;
                                    }
                                    var5_12 = var7_14;
                                    ** while (true)
                                }
                                var6_13 /* !! */  = this.p();
                                var9_16 = var29_36;
                                if (var29_36 >= var6_13 /* !! */  || var29_36 <= 0) break block167;
                                var1_1.R(var29_36);
                                var7_14 = 1;
                                var30_37 = 1.4E-45f;
                                var1_1.M0 = var7_14;
                                break block168;
                            }
                            var7_14 = this.p();
                            break block169;
                        }
                        var9_16 = var29_36;
                    }
                    var7_14 = var9_16;
                }
                var6_13 /* !! */  = 1;
                var48_55 = 1.4E-45f;
                break block170;
            }
            var5_12 = var7_14;
            var7_14 = var9_16;
            var6_13 /* !! */  = 0;
            var48_55 = 0.0f;
            var4_4 = null;
        }
        var9_16 = 64;
        var10_17 = 9.0E-44f;
        var12_19 = (int)var1_1.f0(var9_16);
        if (var12_19 == 0 && (var12_19 = (int)var1_1.f0(128)) == 0) {
            var12_19 = 0;
            var15_22 /* !! */  = null;
        } else {
            var12_19 = 1;
        }
        var11_18.getClass();
        var41_48 = 0;
        var13_20 /* !! */  = null;
        var11_18.h = false;
        var28_35 = var1_1.K0;
        if (var28_35 != 0 && var12_19 != 0) {
            var12_19 = 1;
            var11_18.h = var12_19;
        } else {
            var12_19 = 1;
        }
        var14_21 = var1_1.x0;
        var21_28 /* !! */  = var1_1.W;
        var16_23 /* !! */  = var21_28 /* !! */ [0];
        var17_24 /* !! */  = Y50$b.WRAP_CONTENT;
        if (var16_23 /* !! */  != var17_24 /* !! */  && (var21_28 /* !! */  = var21_28 /* !! */ [var12_19]) != var17_24 /* !! */ ) {
            var12_19 = 0;
            var15_22 /* !! */  = null;
        } else {
            var12_19 = 1;
        }
        var1_1.G0 = 0;
        var1_1.H0 = 0;
        var20_27 = var34_41;
        var13_20 /* !! */  = null;
        for (var41_48 = 0; var41_48 < var20_27; ++var41_48) {
            var16_23 /* !! */  = (Y50)var1_1.x0.get(var41_48);
            var24_31 = var16_23 /* !! */  instanceof tf3_0;
            if (var24_31 == 0) continue;
            var16_23 /* !! */  = (tf3_0)var16_23 /* !! */ ;
            var16_23 /* !! */ .Z();
        }
        var41_48 = (int)var1_1.f0(var9_16);
        var32_39 = var6_13 /* !! */ ;
        var33_40 = var48_55;
        var6_13 /* !! */  = 0;
        var48_55 = 0.0f;
        var4_4 = null;
        var24_31 = 1;
        while (var24_31 != 0) {
            block172: {
                block156: {
                    block159: {
                        block157: {
                            block158: {
                                var42_49 = 1;
                                var43_50 = 1.4E-45f;
                                var19_26 = var6_13 /* !! */  + 1;
                                try {
                                    var11_18.t();
                                    var42_49 = 0;
                                    var43_50 = 0.0f;
                                    var18_25 /* !! */  = null;
                                    var1_1.G0 = 0;
                                    var1_1.H0 = 0;
                                    var1_1.l((Eu1)var11_18);
                                    var48_55 = 0.0f;
                                    var4_4 = null;
                                    for (var6_13 /* !! */  = 0; var6_13 /* !! */  < var20_27; ++var6_13 /* !! */ ) {
                                        var18_25 /* !! */  = var1_1.x0;
                                        var18_25 /* !! */  = var18_25 /* !! */ .get(var6_13 /* !! */ );
                                        var18_25 /* !! */  = (Y50)var18_25 /* !! */ ;
                                        var18_25 /* !! */ .l((Eu1)var11_18);
                                    }
                                }
                                catch (Exception var4_5) {
                                    var34_41 = var32_39;
                                    var49_56 = var33_40;
                                    var40_47 /* !! */  = var35_42;
                                    var9_16 = 0;
                                    var10_17 = 0.0f;
                                    var23_30 /* !! */  = null;
                                    break block156;
                                }
                                var1_1.b0((Eu1)var11_18);
                                var4_4 = var1_1.N0;
                                if (var4_4 != null && (var4_4 = var4_4.get()) != null) {
                                    var4_4 = var1_1.N0;
                                    var4_4 = var4_4.get();
                                    var4_4 = (v50_0)var4_4;
                                    var18_25 /* !! */  = var35_42;
                                }
                                ** GOTO lbl869
                                {
                                    block171: {
                                        catch (Exception var4_8) {
                                            var34_41 = var32_39;
                                            var49_56 = var33_40;
                                            var40_47 /* !! */  = var35_42;
                                            ** GOTO lbl-1000
                                        }
                                        try {
                                            var23_30 /* !! */  = var11_18.k(var35_42);
                                            var17_24 /* !! */  = var1_1.D0;
                                            var4_4 = var17_24 /* !! */ .k(var4_4);
                                            var34_41 = var32_39;
                                            var49_56 = var33_40;
                                            var40_47 /* !! */  = var35_42;
                                            var32_39 = 5;
                                            var33_40 = 7.0E-45f;
                                            var42_49 = 0;
                                            var43_50 = 0.0f;
                                            var18_25 /* !! */  = null;
                                        }
                                        catch (Exception var4_7) {
                                            var34_41 = var32_39;
                                            var49_56 = var33_40;
                                            var40_47 /* !! */  = var18_25 /* !! */ ;
                                        }
lbl-1000:
                                        // 5 sources

                                        {
                                            while (true) {
                                                var9_16 = 0;
                                                var10_17 = 0.0f;
                                                var23_30 /* !! */  = null;
lbl854:
                                                // 2 sources

                                                while (true) {
                                                    var24_31 = 1;
                                                    break block156;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        ** try [egrp 3[TRYBLOCK] [17 : 4829->5068)] { 
lbl863:
                                        // 1 sources

                                        var17_24 /* !! */ .f((k93_0)var4_4, (k93_0)var23_30 /* !! */ , 0, var32_39);
                                        var9_16 = 0;
                                        var10_17 = 0.0f;
                                        var23_30 /* !! */  = null;
                                        var1_1.N0 = null;
                                        break block171;
lbl869:
                                        // 1 sources

                                        var34_41 = var32_39;
                                        var49_56 = var33_40;
                                        var40_47 /* !! */  = var35_42;
                                    }
                                    var4_4 = var1_1.P0;
                                    if (var4_4 != null && (var4_4 = var4_4.get()) != null) {
                                        var4_4 = var1_1.P0;
                                        var4_4 = var4_4.get();
                                        var4_4 = (v50_0)var4_4;
                                        var23_30 /* !! */  = var1_1.O;
                                        var23_30 /* !! */  = var11_18.k((Object)var23_30 /* !! */ );
                                        var16_23 /* !! */  = var1_1.D0;
                                        var4_4 = var16_23 /* !! */ .k(var4_4);
                                        var24_31 = 0;
                                        var17_24 /* !! */  = null;
                                        var42_49 = 5;
                                        var43_50 = 7.0E-45f;
                                        var16_23 /* !! */ .f((k93_0)var23_30 /* !! */ , (k93_0)var4_4, 0, var42_49);
                                        var9_16 = 0;
                                        var10_17 = 0.0f;
                                        var23_30 /* !! */  = null;
                                        var1_1.P0 = null;
                                    }
                                    if ((var4_4 = var1_1.O0) == null || (var4_4 = var4_4.get()) == null) break block157;
                                    var4_4 = var1_1.O0;
                                    var4_4 = var4_4.get();
                                    var4_4 = (v50_0)var4_4;
                                    var23_30 /* !! */  = var27_34;
                                    try {
                                        var16_23 /* !! */  = var11_18.k(var27_34);
                                        var17_24 /* !! */  = var1_1.D0;
                                        var4_4 = var17_24 /* !! */ .k(var4_4);
                                        var9_16 = 5;
                                        var10_17 = 7.0E-45f;
                                        var42_49 = 0;
                                        var43_50 = 0.0f;
                                        var18_25 /* !! */  = null;
                                        break block158;
                                    }
                                    catch (Exception var4_9) {
                                        var27_34 = var23_30 /* !! */ ;
                                        ** GOTO lbl-1000
                                    }
                                }
lbl909:
                                // 1 sources

                                catch (Exception var4_6) {}
                                ** GOTO lbl-1000
                            }
                            var17_24 /* !! */ .f((k93_0)var4_4, (k93_0)var16_23 /* !! */ , 0, var9_16);
                            var9_16 = 0;
                            var10_17 = 0.0f;
                            var23_30 /* !! */  = null;
                            var1_1.O0 = null;
                        }
                        if ((var4_4 = var1_1.Q0) != null && (var4_4 = var4_4.get()) != null) {
                            var4_4 = var1_1.Q0;
                            var4_4 = var4_4.get();
                            var4_4 = (v50_0)var4_4;
                            var23_30 /* !! */  = var1_1.N;
                            var23_30 /* !! */  = var11_18.k((Object)var23_30 /* !! */ );
                            var16_23 /* !! */  = var1_1.D0;
                            var4_4 = var16_23 /* !! */ .k(var4_4);
                            var24_31 = 0;
                            var17_24 /* !! */  = null;
                            var42_49 = 5;
                            var43_50 = 7.0E-45f;
                            var16_23 /* !! */ .f((k93_0)var23_30 /* !! */ , (k93_0)var4_4, 0, var42_49);
                            var9_16 = 0;
                            var10_17 = 0.0f;
                            var23_30 /* !! */  = null;
                            {
                                catch (Exception var4_11) {
                                    ** continue;
                                }
                                ** try [egrp 7[TRYBLOCK] [50 : 5262->5293)] { 
lbl939:
                                // 1 sources

                                var1_1.Q0 = null;
                                break block159;
                            }
lbl941:
                            // 1 sources

                            catch (Exception var4_10) {
                                ** continue;
                            }
                        }
                        var9_16 = 0;
                        var10_17 = 0.0f;
                        var23_30 /* !! */  = null;
                    }
                    var11_18.p();
                    var24_31 = 1;
                    break block172;
                }
                var16_23 /* !! */  = System.out;
                var23_30 /* !! */  = "EXCEPTION : ";
                var18_25 /* !! */  = new StringBuilder((String)var23_30 /* !! */ );
                var18_25 /* !! */ .append(var4_4);
                var4_4 = var18_25 /* !! */ .toString();
                var16_23 /* !! */ .println((String)var4_4);
            }
            var4_4 = T92.a;
            if (var24_31 != 0) {
                var33_40 = 2.8E-45f;
                var4_4[2] = (Y50$b)false;
                var32_39 = (int)var1_1.f0(64);
                var1_1.Y((Eu1)var11_18, (boolean)var32_39);
                var17_24 /* !! */  = var1_1.x0;
                var24_31 = var17_24 /* !! */ .size();
                var10_17 = 0.0f;
                var23_30 /* !! */  = null;
                var42_49 = 0;
                var43_50 = 0.0f;
                var18_25 /* !! */  = null;
                for (var9_16 = 0; var9_16 < var24_31; ++var9_16) {
                    var50_57 = var24_31;
                    var17_24 /* !! */  = (Y50)var1_1.x0.get(var9_16);
                    var17_24 /* !! */ .Y((Eu1)var11_18, (boolean)var32_39);
                    var38_45 = var32_39;
                    var32_39 = var17_24 /* !! */ .i;
                    var51_58 = var42_49;
                    var52_59 = var43_50;
                    var42_49 = -1;
                    var43_50 = 0.0f / 0.0f;
                    if (var32_39 != var42_49 || (var32_39 = var17_24 /* !! */ .j) != var42_49) {
                        var51_58 = 1;
                        var52_59 = 1.4E-45f;
                    }
                    var24_31 = var50_57;
                    var32_39 = var38_45;
                    var42_49 = var51_58;
                    var43_50 = var52_59;
                }
                var51_58 = var42_49;
                var52_59 = var43_50;
                var42_49 = -1;
                var43_50 = 0.0f / 0.0f;
            } else {
                var42_49 = -1;
                var43_50 = 0.0f / 0.0f;
                var1_1.Y((Eu1)var11_18, (boolean)var41_48);
                var10_17 = 0.0f;
                var23_30 /* !! */  = null;
                for (var9_16 = 0; var9_16 < var20_27; ++var9_16) {
                    var16_23 /* !! */  = (Y50)var1_1.x0.get(var9_16);
                    var16_23 /* !! */ .Y((Eu1)var11_18, (boolean)var41_48);
                }
                var51_58 = 0;
                var52_59 = 0.0f;
                var39_46 /* !! */  = null;
            }
            var9_16 = 8;
            var10_17 = 1.1E-44f;
            if (var12_19 != 0 && var19_26 < var9_16) {
                var32_39 = 2;
                var33_40 = 2.8E-45f;
                var6_13 /* !! */  = (int)var4_4[var32_39];
                if (var6_13 /* !! */  != 0) {
                    var48_55 = 0.0f;
                    var4_4 = null;
                    var32_39 = 0;
                    var33_40 = 0.0f;
                    var16_23 /* !! */  = null;
                    var24_31 = 0;
                    var17_24 /* !! */  = null;
                    for (var6_13 /* !! */  = 0; var6_13 /* !! */  < var20_27; ++var6_13 /* !! */ ) {
                        var18_25 /* !! */  = (Y50)var1_1.x0.get(var6_13 /* !! */ );
                        var9_16 = var18_25 /* !! */ .c0;
                        var38_45 = var18_25 /* !! */ .v();
                        var9_16 = var38_45 + var9_16;
                        var24_31 = Math.max(var24_31, var9_16);
                        var9_16 = var18_25 /* !! */ .d0;
                        var42_49 = var18_25 /* !! */ .p() + var9_16;
                        var32_39 = Math.max(var32_39, var42_49);
                        var9_16 = 8;
                        var10_17 = 1.1E-44f;
                        var42_49 = -1;
                        var43_50 = 0.0f / 0.0f;
                    }
                    var6_13 /* !! */  = Math.max(var1_1.f0, var24_31);
                    var9_16 = Math.max(var1_1.g0, var32_39);
                    var16_23 /* !! */  = Y50$b.WRAP_CONTENT;
                    if (var3_3 /* !! */  == var16_23 /* !! */  && (var24_31 = this.v()) < var6_13 /* !! */ ) {
                        var1_1.W(var6_13 /* !! */ );
                        var4_4 = var1_1.W;
                        var24_31 = 0;
                        var17_24 /* !! */  = null;
                        var4_4[0] = var16_23 /* !! */ ;
                        var34_41 = 1;
                        var49_56 = 1.4E-45f;
                        var51_58 = 1;
                        var52_59 = 1.4E-45f;
                    }
                    if (var8_15 /* !! */  == var16_23 /* !! */  && (var6_13 /* !! */  = this.p()) < var9_16) {
                        var1_1.R(var9_16);
                        var4_4 = var1_1.W;
                        var9_16 = 1;
                        var10_17 = 1.4E-45f;
                        var4_4[var9_16] = var16_23 /* !! */ ;
                        var34_41 = 1;
                        var49_56 = 1.4E-45f;
                        var51_58 = 1;
                        var52_59 = 1.4E-45f;
                    }
                }
            }
            var6_13 /* !! */  = var1_1.f0;
            var9_16 = this.v();
            if ((var6_13 /* !! */  = Math.max(var6_13 /* !! */ , var9_16)) > (var9_16 = this.v())) {
                var1_1.W(var6_13 /* !! */ );
                var4_4 = var1_1.W;
                var23_30 /* !! */  = Y50$b.FIXED;
                var32_39 = 0;
                var33_40 = 0.0f;
                var16_23 /* !! */  = null;
                var4_4[0] = var23_30 /* !! */ ;
                var34_41 = 1;
                var49_56 = 1.4E-45f;
                var51_58 = 1;
                var52_59 = 1.4E-45f;
            }
            var6_13 /* !! */  = var1_1.g0;
            var9_16 = this.p();
            if ((var6_13 /* !! */  = Math.max(var6_13 /* !! */ , var9_16)) > (var9_16 = this.p())) {
                var1_1.R(var6_13 /* !! */ );
                var4_4 = var1_1.W;
                var23_30 /* !! */  = Y50$b.FIXED;
                var32_39 = 1;
                var33_40 = 1.4E-45f;
                var4_4[var32_39] = var23_30 /* !! */ ;
                var34_41 = 1;
                var49_56 = 1.4E-45f;
                var51_58 = 1;
                var52_59 = 1.4E-45f;
            } else {
                var32_39 = 1;
                var33_40 = 1.4E-45f;
            }
            if (var34_41 != 0) ** GOTO lbl-1000
            var4_4 = var1_1.W;
            var9_16 = 0;
            var10_17 = 0.0f;
            var23_30 /* !! */  = null;
            var17_24 /* !! */  = Y50$b.WRAP_CONTENT;
            if ((var4_4 = var4_4[0]) == var17_24 /* !! */  && var5_12 > 0 && (var6_13 /* !! */  = this.v()) > var5_12) {
                var1_1.L0 = var32_39;
                var4_4 = var1_1.W;
                var4_4[0] = var18_25 /* !! */  = Y50$b.FIXED;
                var1_1.W(var5_12);
                var34_41 = 1;
                var49_56 = 1.4E-45f;
                var51_58 = 1;
                var52_59 = 1.4E-45f;
            }
            if ((var4_4 = var1_1.W[var32_39]) == var17_24 /* !! */  && var7_14 > 0 && (var6_13 /* !! */  = this.p()) > var7_14) {
                var1_1.M0 = var32_39;
                var4_4 = var1_1.W;
                var23_30 /* !! */  = Y50$b.FIXED;
                var4_4[var32_39] = var23_30 /* !! */ ;
                var1_1.R(var7_14);
                var6_13 /* !! */  = 8;
                var48_55 = 1.1E-44f;
                var32_39 = 1;
                var33_40 = 1.4E-45f;
                var51_58 = 1;
                var52_59 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var32_39 = var34_41;
                var33_40 = var49_56;
                var6_13 /* !! */  = 8;
                var48_55 = 1.1E-44f;
            }
            if (var19_26 > var6_13 /* !! */ ) {
                var24_31 = 0;
                var17_24 /* !! */  = null;
            } else {
                var24_31 = var51_58;
            }
            var6_13 /* !! */  = var19_26;
            var35_42 = var40_47 /* !! */ ;
            var9_16 = 64;
            var10_17 = 9.0E-44f;
        }
        var34_41 = var32_39;
        var49_56 = var33_40;
        var1_1.x0 = var14_21;
        if (var32_39 != 0) {
            var4_4 = var1_1.W;
            var5_12 = 0;
            var44_51 /* !! */  = null;
            var4_4[0] = var3_3 /* !! */ ;
            var2_2 = 1;
            var4_4[var2_2] = var8_15 /* !! */ ;
        }
        var4_4 = var11_18.m;
        var1_1.K((SI)var4_4);
    }

    public final void a0(Y50 y50, int n3) {
        int n4 = 1;
        if (n3 == 0) {
            qr_0 qr_02;
            qr_0[] qr_0Array;
            n3 = this.G0 + n4;
            qr_0[] qr_0Array2 = this.J0;
            int n7 = qr_0Array2.length;
            if (n3 >= n7) {
                n3 = qr_0Array2.length * 2;
                this.J0 = qr_0Array = Arrays.copyOf(qr_0Array2, n3);
            }
            qr_0Array = this.J0;
            int n8 = this.G0;
            boolean bl2 = this.C0;
            qr_0Array[n8] = qr_02 = new qr_0(y50, 0, bl2);
            this.G0 = n8 += n4;
        } else if (n3 == n4) {
            qr_0 qr_03;
            qr_0[] qr_0Array;
            n3 = this.H0 + n4;
            qr_0[] qr_0Array3 = this.I0;
            int n10 = qr_0Array3.length;
            if (n3 >= n10) {
                n3 = qr_0Array3.length * 2;
                this.I0 = qr_0Array = Arrays.copyOf(qr_0Array3, n3);
            }
            qr_0Array = this.I0;
            int n14 = this.H0;
            boolean bl3 = this.C0;
            qr_0Array[n14] = qr_03 = new qr_0(y50, n4, bl3);
            this.H0 = n14 += n4;
        }
    }

    public final void b0(Eu1 eu1) {
        int n3;
        Object object;
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        Object object3;
        Object object4;
        int n14;
        boolean bl2 = this.f0(64);
        this.f(eu1, bl2);
        Object object5 = this.x0;
        int n15 = object5.size();
        int n16 = 0;
        Object object6 = null;
        int n17 = 0;
        Object object7 = null;
        while (true) {
            n14 = 1;
            if (n16 >= n15) break;
            object4 = (Y50)this.x0.get(n16);
            object3 = ((Y50)object4).V;
            object3[0] = false;
            object3[n14] = false;
            n10 = object4 instanceof Lv;
            if (n10 != 0) {
                n17 = 1;
            }
            ++n16;
        }
        if (n17 != 0) {
            object6 = null;
            for (n16 = 0; n16 < n15; ++n16) {
                object7 = (Y50)this.x0.get(n16);
                n10 = object7 instanceof Lv;
                if (n10 == 0) continue;
                object7 = (Lv)object7;
                object4 = null;
                for (n10 = 0; n10 < (n8 = ((F41)object7).y0); ++n10) {
                    object3 = ((F41)object7).x0[n10];
                    n7 = ((Lv)object7).A0;
                    if (n7 == 0 && (n7 = (int)(((Y50)object3).g() ? 1 : 0)) == 0) continue;
                    n7 = ((Lv)object7).z0;
                    if (n7 != 0 && n7 != n14) {
                        n4 = 2;
                        if (n7 != n4 && n7 != (n4 = 3)) continue;
                        object3 = ((Y50)object3).V;
                        object3[n14] = n14;
                        continue;
                    }
                    object3 = ((Y50)object3).V;
                    object3[0] = n14;
                }
            }
        }
        object6 = this.R0;
        ((HashSet)object6).clear();
        object7 = null;
        for (n17 = 0; n17 < n15; ++n17) {
            object4 = (Y50)this.x0.get(n17);
            object4.getClass();
            n8 = object4 instanceof se3_0;
            if (n8 == 0 && (n7 = object4 instanceof w11_0) == 0) continue;
            if (n8 != 0) {
                ((HashSet)object6).add(object4);
                continue;
            }
            ((Y50)object4).f(eu1, bl2);
        }
        while ((n17 = ((HashSet)object6).size()) > 0) {
            n17 = ((HashSet)object6).size();
            object4 = ((HashSet)object6).iterator();
            block5: while ((n8 = object4.hasNext()) != 0) {
                object3 = (se3_0)((Y50)object4.next());
                object2 = null;
                for (n7 = 0; n7 < (n4 = ((F41)object3).y0); ++n7) {
                    object = ((F41)object3).x0[n7];
                    n4 = (int)(((HashSet)object6).contains(object) ? 1 : 0);
                    if (n4 == 0) continue;
                    ((Y50)object3).f(eu1, bl2);
                    ((HashSet)object6).remove(object3);
                    break block5;
                }
            }
            if (n17 != (n10 = ((HashSet)object6).size())) continue;
            object7 = ((HashSet)object6).iterator();
            while ((n10 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                object4 = (Y50)object7.next();
                ((Y50)object4).f(eu1, bl2);
            }
            ((HashSet)object6).clear();
        }
        n16 = (int)(Eu1.q ? 1 : 0);
        if (n16 != 0) {
            object6 = new HashSet();
            object7 = null;
            for (n17 = 0; n17 < n15; ++n17) {
                object4 = (Y50)this.x0.get(n17);
                object4.getClass();
                n8 = object4 instanceof se3_0;
                if (n8 != 0 || (n8 = object4 instanceof w11_0) != 0) continue;
                ((HashSet)object6).add(object4);
            }
            object5 = this.W[0];
            object7 = Y50$b.WRAP_CONTENT;
            int n18 = object5 == object7 ? 0 : 1;
            object4 = this;
            object3 = this;
            object2 = eu1;
            object = object6;
            this.e(this, eu1, (HashSet)object6, n18, false);
            object5 = ((HashSet)object6).iterator();
            while ((n16 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object6 = (Y50)object5.next();
                T92.a(this, eu1, (Y50)object6);
                ((Y50)object6).f(eu1, bl2);
            }
        } else {
            object6 = null;
            for (n16 = 0; n16 < n15; ++n16) {
                object7 = (Y50)this.x0.get(n16);
                n10 = object7 instanceof Z50;
                if (n10 != 0) {
                    object4 = ((Y50)object7).W;
                    object3 = object4[0];
                    object4 = object4[n14];
                    object2 = Y50$b.WRAP_CONTENT;
                    if (object3 == object2) {
                        object = Y50$b.FIXED;
                        ((Y50)object7).S((Y50$b)((Object)object));
                    }
                    if (object4 == object2) {
                        object = Y50$b.FIXED;
                        ((Y50)object7).U((Y50$b)((Object)object));
                    }
                    ((Y50)object7).f(eu1, bl2);
                    if (object3 == object2) {
                        ((Y50)object7).S((Y50$b)((Object)object3));
                    }
                    if (object4 != object2) continue;
                    ((Y50)object7).U((Y50$b)((Object)object4));
                    continue;
                }
                T92.a(this, eu1, (Y50)object7);
                n10 = object7 instanceof se3_0;
                if (n10 != 0 || (n10 = object7 instanceof w11_0) != 0) continue;
                ((Y50)object7).f(eu1, bl2);
            }
        }
        int n19 = this.G0;
        n15 = 0;
        object5 = null;
        if (n19 > 0) {
            pr_0.a(this, eu1, null, 0);
        }
        if ((n3 = this.H0) > 0) {
            pr_0.a(this, eu1, null, n14);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean c0(int var1_1, boolean var2_2) {
        block15: {
            block14: {
                block16: {
                    var3_3 = this.z0;
                    var4_4 = var3_3.a;
                    var5_5 = false;
                    var6_6 = var4_4.o(0);
                    var7_7 = 1;
                    var8_8 = var4_4.o(var7_7);
                    var9_9 = var4_4.w();
                    var10_10 = var4_4.x();
                    var11_11 = var3_3.e;
                    if (var2_2 && (var6_6 == (var12_12 = Y50$b.WRAP_CONTENT) || var8_8 == var12_12)) {
                        var12_12 = var11_11.iterator();
                        while (var13_13 = var12_12.hasNext()) {
                            var14_14 = (wf3_0)var12_12.next();
                            var15_15 = var14_14.f;
                            if (var15_15 != var1_1 || (var13_13 = var14_14.k())) continue;
                            var2_2 = false;
                            var16_16 /* !! */  = null;
                            break;
                        }
                        if (var1_1 == 0) {
                            if (var2_2 && var6_6 == (var16_16 /* !! */  = Y50$b.WRAP_CONTENT)) {
                                var16_16 /* !! */  = Y50$b.FIXED;
                                var4_4.S(var16_16 /* !! */ );
                                var2_2 = var3_3.d(var4_4, 0);
                                var4_4.W((int)var2_2);
                                var16_16 /* !! */  = var4_4.d.e;
                                var17_17 = var4_4.v();
                                var16_16 /* !! */ .d(var17_17);
                            }
                        } else if (var2_2 && var8_8 == (var16_16 /* !! */  = Y50$b.WRAP_CONTENT)) {
                            var16_16 /* !! */  = Y50$b.FIXED;
                            var4_4.U(var16_16 /* !! */ );
                            var2_2 = var3_3.d(var4_4, var7_7);
                            var4_4.R((int)var2_2);
                            var16_16 /* !! */  = var4_4.e.e;
                            var17_17 = var4_4.p();
                            var16_16 /* !! */ .d(var17_17);
                        }
                    }
                    if (var1_1 != 0) break block16;
                    var16_16 /* !! */  = var4_4.W[0];
                    var18_18 /* !! */  = Y50$b.FIXED;
                    if (var16_16 /* !! */  == var18_18 /* !! */  || var16_16 /* !! */  == (var18_18 /* !! */  = Y50$b.MATCH_PARENT)) {
                        var2_2 = var4_4.v() + var9_9;
                        var4_4.d.i.d((int)var2_2);
                        var18_18 /* !! */  = var4_4.d.e;
                        var18_18 /* !! */ .d((int)(var2_2 -= var9_9));
lbl45:
                        // 2 sources

                        while (true) {
                            var2_2 = true;
                            break block14;
                            break;
                        }
                    }
                    ** GOTO lbl-1000
                }
                var16_16 /* !! */  = var4_4.W[var7_7];
                var19_19 /* !! */  = Y50$b.FIXED;
                if (var16_16 /* !! */  != var19_19 /* !! */  && var16_16 /* !! */  != (var19_19 /* !! */  = Y50$b.MATCH_PARENT)) lbl-1000:
                // 2 sources

                {
                    var2_2 = false;
                    var16_16 /* !! */  = null;
                } else {
                    var2_2 = var4_4.p() + var10_10;
                    var4_4.e.i.d((int)var2_2);
                    var19_19 /* !! */  = var4_4.e.e;
                    var19_19 /* !! */ .d((int)(var2_2 -= var10_10));
                    ** continue;
                }
            }
            var3_3.g();
            var3_3 = var11_11.iterator();
            while ((var9_9 = (int)var3_3.hasNext()) != 0) {
                var19_19 /* !! */  = (wf3_0)var3_3.next();
                var10_10 = var19_19 /* !! */ .f;
                if (var10_10 != var1_1 || (var18_18 /* !! */  = var19_19 /* !! */ .b) == var4_4 && (var10_10 = (int)var19_19 /* !! */ .g) == 0) continue;
                var19_19 /* !! */ .e();
            }
            var3_3 = var11_11.iterator();
            while ((var9_9 = (int)var3_3.hasNext()) != 0) {
                var19_19 /* !! */  = (wf3_0)var3_3.next();
                var10_10 = var19_19 /* !! */ .f;
                if (var10_10 != var1_1 || !var2_2 && (var18_18 /* !! */  = var19_19 /* !! */ .b) == var4_4) continue;
                var18_18 /* !! */  = var19_19 /* !! */ .h;
                var10_10 = (int)var18_18 /* !! */ .j;
                if (var10_10 != 0) {
                    var18_18 /* !! */  = var19_19 /* !! */ .i;
                    var10_10 = (int)var18_18 /* !! */ .j;
                    if (var10_10 != 0) {
                        var10_10 = var19_19 /* !! */  instanceof sr_0;
                        if (var10_10 != 0) continue;
                        var19_19 /* !! */  = var19_19 /* !! */ .e;
                        var9_9 = (int)var19_19 /* !! */ .j;
                        if (var9_9 != 0) continue;
                    }
                }
                break block15;
            }
            var5_5 = true;
        }
        var4_4.S(var6_6);
        var4_4.U(var8_8);
        return var5_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d0(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        block92: {
            block94: {
                block93: {
                    block91: {
                        block90: {
                            block87: {
                                block89: {
                                    block88: {
                                        block85: {
                                            block86: {
                                                var8_8 = this;
                                                var9_9 = var1_1;
                                                var10_10 = var2_2;
                                                var11_11 = var4_4;
                                                this.E0 = var6_6;
                                                this.F0 = var7_7;
                                                var12_12 = this.y0;
                                                var12_12.getClass();
                                                var13_13 = this.B0;
                                                var14_14 /* !! */  = this.x0;
                                                var15_15 = var14_14 /* !! */ .size();
                                                var16_16 = this.v();
                                                var17_17 = this.p();
                                                var18_18 = 1.8E-43f;
                                                var19_19 = T92.b(var1_1, 128);
                                                var20_20 = 0;
                                                var21_21 = 0.0f;
                                                var22_22 /* !! */  = null;
                                                var23_23 = 1;
                                                var24_24 = 64;
                                                if (var19_19 == 0 && (var9_9 = (int)T92.b(var1_1, var24_24)) == 0) {
                                                    var9_9 = 0;
                                                    var25_25 = null;
                                                } else {
                                                    var9_9 = 1;
                                                }
                                                if (var9_9 == 0) break block86;
                                                var27_27 = null;
                                                block0: for (var26_26 = 0; var26_26 < var15_15; ++var26_26) {
                                                    var28_28 = (Y50)var8_8.x0.get(var26_26);
                                                    var29_29 /* !! */  = var28_28.W;
                                                    var30_30 /* !! */  = var29_29 /* !! */ [0];
                                                    var22_22 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                                    if (var30_30 /* !! */  == var22_22 /* !! */ ) {
                                                        var31_31 /* !! */  = (Y50$b)true;
                                                    } else {
                                                        var31_31 /* !! */  = (Y50$b)false;
                                                        var30_30 /* !! */  = null;
                                                    }
                                                    var29_29 /* !! */  = var29_29 /* !! */ [var23_23];
                                                    if (var29_29 /* !! */  == var22_22 /* !! */ ) {
                                                        var20_20 = 1;
                                                        var21_21 = 1.4E-45f;
                                                    } else {
                                                        var20_20 = 0;
                                                        var21_21 = 0.0f;
                                                        var22_22 /* !! */  = null;
                                                    }
                                                    if (var31_31 /* !! */  == false || var20_20 == 0) ** GOTO lbl-1000
                                                    var21_21 = var28_28.a0;
                                                    var24_24 = 0;
                                                    var29_29 /* !! */  = null;
                                                    cfr_temp_0 = var21_21 - 0.0f;
                                                    var20_20 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                    if (var20_20 > 0) {
                                                        var20_20 = 1;
                                                        var21_21 = 1.4E-45f;
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var20_20 = 0;
                                                        var21_21 = 0.0f;
                                                        var22_22 /* !! */  = null;
                                                    }
                                                    var24_24 = (int)var28_28.C();
                                                    if (var24_24 != 0 && var20_20 != 0) {
                                                        while (true) {
                                                            var9_9 = 0;
                                                            var25_25 = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    if ((var24_24 = (int)var28_28.D()) != 0 && var20_20 != 0 || (var20_20 = var28_28 instanceof se3_0) != 0 || (var20_20 = (int)var28_28.C()) != 0 || (var20_20 = (int)var28_28.D()) != 0) ** continue;
                                                    var20_20 = 0;
                                                    var21_21 = 0.0f;
                                                    var22_22 /* !! */  = null;
                                                    var24_24 = 64;
                                                }
                                            }
                                            var20_20 = 0x40000000;
                                            var21_21 = 2.0f;
                                            if (var10_10 == var20_20 && var11_11 == var20_20 || var19_19 != 0) {
                                                var24_24 = 1;
                                            } else {
                                                var24_24 = 0;
                                                var29_29 /* !! */  = null;
                                            }
                                            if ((var9_9 &= var24_24) == 0) break block87;
                                            var30_30 /* !! */  = (Y50$b)var8_8.E;
                                            var31_31 /* !! */  = var30_30 /* !! */ [0];
                                            var26_26 = var3_3;
                                            var31_31 /* !! */  = (Y50$b)Math.min((int)var31_31 /* !! */ , var3_3);
                                            var27_27 = var8_8.E;
                                            var26_26 = var27_27[var23_23];
                                            var32_32 = var5_5;
                                            var26_26 = Math.min(var26_26, var5_5);
                                            if (var10_10 == var20_20 && (var32_32 = this.v()) != var31_31 /* !! */ ) {
                                                var8_8.W((int)var31_31 /* !! */ );
                                                var30_30 /* !! */  = var8_8.z0;
                                                var30_30 /* !! */ .b = var23_23;
                                            }
                                            if (var11_11 == var20_20 && (var31_31 /* !! */  = (Y50$b)this.p()) != var26_26) {
                                                var8_8.R(var26_26);
                                                var30_30 /* !! */  = var8_8.z0;
                                                var30_30 /* !! */ .b = var23_23;
                                            }
                                            var30_30 /* !! */  = var8_8.z0;
                                            if (var10_10 != var20_20 || var11_11 != var20_20) break block88;
                                            var26_26 = (int)var30_30 /* !! */ .b;
                                            var28_28 = var30_30 /* !! */ .a;
                                            if (var26_26 == 0 && (var26_26 = (int)var30_30 /* !! */ .c) == 0) {
                                                var20_20 = 0;
                                                var21_21 = 0.0f;
                                                var22_22 /* !! */  = null;
                                            } else {
                                                var27_27 = var28_28.x0.iterator();
                                                while ((var33_33 = (int)var27_27.hasNext()) != 0) {
                                                    var34_34 = var27_27.next();
                                                    var29_29 /* !! */  = var34_34;
                                                    var29_29 /* !! */  = (Y50)var34_34;
                                                    var29_29 /* !! */ .m();
                                                    var22_22 /* !! */  = null;
                                                    var29_29 /* !! */ .a = false;
                                                    var29_29 /* !! */ .d.n();
                                                    var35_35 = var29_29 /* !! */ .e;
                                                    var35_35.m();
                                                    var20_20 = 0x40000000;
                                                    var21_21 = 2.0f;
                                                    var23_23 = 1;
                                                }
                                                var20_20 = 0;
                                                var21_21 = 0.0f;
                                                var22_22 /* !! */  = null;
                                                var28_28.m();
                                                var28_28.a = false;
                                                var28_28.d.n();
                                                var35_35 = var28_28.e;
                                                var35_35.m();
                                                var30_30 /* !! */ .c = false;
                                            }
                                            var35_35 = var30_30 /* !! */ .d;
                                            var30_30 /* !! */ .b((Z50)var35_35);
                                            var28_28.c0 = 0;
                                            var28_28.d0 = 0;
                                            var35_35 = var28_28.o(0);
                                            var21_21 = 1.4E-45f;
                                            var29_29 /* !! */  = var28_28.o(1);
                                            var20_20 = (int)var30_30 /* !! */ .b;
                                            if (var20_20 != 0) {
                                                var30_30 /* !! */ .c();
                                            }
                                            var20_20 = var28_28.w();
                                            var26_26 = var28_28.x();
                                            var36_36 = var9_9;
                                            var28_28.d.h.d(var20_20);
                                            var28_28.e.h.d(var26_26);
                                            var30_30 /* !! */ .g();
                                            var25_25 = Y50$b.WRAP_CONTENT;
                                            var37_37 /* !! */  = var13_13;
                                            var13_13 = var30_30 /* !! */ .e;
                                            if (var35_35 != var25_25 && var29_29 /* !! */  != var25_25) {
                                                var38_38 = var16_16;
                                            } else {
                                                if (var19_19 != 0) {
                                                    var25_25 = var13_13.iterator();
                                                    while ((var38_38 = var25_25.hasNext()) != 0) {
                                                        var39_39 = (wf3_0)var25_25.next();
                                                        var38_38 = var39_39.k();
                                                        if (var38_38 != 0) continue;
                                                        var19_19 = 0;
                                                        var18_18 = 0.0f;
                                                        var40_40 /* !! */  = null;
                                                        break;
                                                    }
                                                }
                                                if (var19_19 != 0 && var35_35 == (var25_25 = Y50$b.WRAP_CONTENT)) {
                                                    var25_25 = Y50$b.FIXED;
                                                    var28_28.S((Y50$b)var25_25);
                                                    var38_38 = var16_16;
                                                    var9_9 = 0;
                                                    var16_16 = var30_30 /* !! */ .d((Z50)var28_28, 0);
                                                    var28_28.W(var16_16);
                                                    var25_25 = var28_28.d.e;
                                                    var16_16 = var28_28.v();
                                                    var25_25.d(var16_16);
                                                } else {
                                                    var38_38 = var16_16;
                                                }
                                                if (var19_19 != 0 && var29_29 /* !! */  == (var25_25 = Y50$b.WRAP_CONTENT)) {
                                                    var25_25 = Y50$b.FIXED;
                                                    var28_28.U((Y50$b)var25_25);
                                                    var9_9 = 1;
                                                    var16_16 = var30_30 /* !! */ .d((Z50)var28_28, var9_9);
                                                    var28_28.R(var16_16);
                                                    var25_25 = var28_28.e.e;
                                                    var16_16 = var28_28.p();
                                                    var25_25.d(var16_16);
                                                }
                                            }
                                            var25_25 = var28_28.W;
                                            var16_16 = 0;
                                            var25_25 = var25_25[0];
                                            var41_41 /* !! */  = Y50$b.FIXED;
                                            if (var25_25 != var41_41 /* !! */  && var25_25 != (var40_40 /* !! */  = Y50$b.MATCH_PARENT)) {
                                                var9_9 = 0;
                                                var25_25 = null;
                                            } else {
                                                var9_9 = var28_28.v() + var20_20;
                                                var28_28.d.i.d(var9_9);
                                                var40_40 /* !! */  = var28_28.d.e;
                                                var40_40 /* !! */ .d(var9_9 -= var20_20);
                                                var30_30 /* !! */ .g();
                                                var25_25 = var28_28.W;
                                                var19_19 = 1;
                                                var18_18 = 1.4E-45f;
                                                var25_25 = var25_25[var19_19];
                                                if (var25_25 == var41_41 /* !! */  || var25_25 == (var41_41 /* !! */  = Y50$b.MATCH_PARENT)) {
                                                    var9_9 = var28_28.p() + var26_26;
                                                    var28_28.e.i.d(var9_9);
                                                    var41_41 /* !! */  = var28_28.e.e;
                                                    var41_41 /* !! */ .d(var9_9 -= var26_26);
                                                }
                                                var30_30 /* !! */ .g();
                                                var9_9 = 1;
                                            }
                                            var41_41 /* !! */  = var13_13.iterator();
                                            while ((var19_19 = (int)var41_41 /* !! */ .hasNext()) != 0) {
                                                var40_40 /* !! */  = (wf3_0)var41_41 /* !! */ .next();
                                                var22_22 /* !! */  = var40_40 /* !! */ .b;
                                                if (var22_22 /* !! */  == var28_28 && (var20_20 = (int)var40_40 /* !! */ .g) == 0) continue;
                                                var40_40 /* !! */ .e();
                                            }
                                            var13_13 = var13_13.iterator();
                                            while ((var16_16 = (int)var13_13.hasNext()) != 0) {
                                                var41_41 /* !! */  = (wf3_0)var13_13.next();
                                                if (var9_9 == 0 && (var40_40 /* !! */  = var41_41 /* !! */ .b) == var28_28) continue;
                                                var40_40 /* !! */  = var41_41 /* !! */ .h;
                                                var19_19 = (int)var40_40 /* !! */ .j;
                                                if (var19_19 == 0) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        var9_9 = 0;
                                                        var25_25 = null;
                                                        break block85;
                                                        break;
                                                    }
                                                }
                                                var40_40 /* !! */  = var41_41 /* !! */ .i;
                                                var19_19 = (int)var40_40 /* !! */ .j;
                                                if (var19_19 == 0 && (var19_19 = var41_41 /* !! */  instanceof x11_0) == 0) ** GOTO lbl-1000
                                                var40_40 /* !! */  = ((wf3_0)var41_41 /* !! */ ).e;
                                                var19_19 = (int)var40_40 /* !! */ .j;
                                                if (var19_19 != 0 || (var19_19 = var41_41 /* !! */  instanceof sr_0) != 0 || (var16_16 = var41_41 /* !! */  instanceof x11_0) != 0) continue;
                                                ** continue;
                                            }
                                            var9_9 = 1;
                                        }
                                        var28_28.S((Y50$b)var35_35);
                                        var28_28.U((Y50$b)var29_29 /* !! */ );
                                        var16_16 = var9_9;
                                        var9_9 = 0x40000000;
                                        var42_42 = 2;
                                        break block89;
                                    }
                                    var36_36 = var9_9;
                                    var37_37 /* !! */  = var13_13;
                                    var38_38 = var16_16;
                                    var9_9 = (int)var30_30 /* !! */ .b;
                                    var13_13 = var30_30 /* !! */ .a;
                                    if (var9_9 != 0) {
                                        var25_25 = var13_13.x0.iterator();
                                        while ((var16_16 = (int)var25_25.hasNext()) != 0) {
                                            var41_41 /* !! */  = (Y50)var25_25.next();
                                            var41_41 /* !! */ .m();
                                            var20_20 = 0;
                                            var21_21 = 0.0f;
                                            var22_22 /* !! */  = null;
                                            var41_41 /* !! */ .a = false;
                                            var35_35 = var41_41 /* !! */ .d;
                                            var29_29 /* !! */  = var35_35.e;
                                            var29_29 /* !! */ .j = false;
                                            var35_35.g = false;
                                            var35_35.n();
                                            var41_41 /* !! */  = var41_41 /* !! */ .e;
                                            var35_35 = var41_41 /* !! */ .e;
                                            var35_35.j = false;
                                            var41_41 /* !! */ .g = false;
                                            var41_41 /* !! */ .m();
                                        }
                                        var20_20 = 0;
                                        var21_21 = 0.0f;
                                        var22_22 /* !! */  = null;
                                        var13_13.m();
                                        var13_13.a = false;
                                        var25_25 = var13_13.d;
                                        var25_25.e.j = false;
                                        var25_25.g = false;
                                        var25_25.n();
                                        var25_25 = var13_13.e;
                                        var41_41 /* !! */  = var25_25.e;
                                        var41_41 /* !! */ .j = false;
                                        var25_25.g = false;
                                        var25_25.m();
                                        var30_30 /* !! */ .c();
                                    } else {
                                        var20_20 = 0;
                                        var21_21 = 0.0f;
                                        var22_22 /* !! */  = null;
                                    }
                                    var25_25 = var30_30 /* !! */ .d;
                                    var30_30 /* !! */ .b((Z50)var25_25);
                                    var13_13.c0 = 0;
                                    var13_13.d0 = 0;
                                    var13_13.d.h.d(0);
                                    var25_25 = var13_13.e.h;
                                    var25_25.d(0);
                                    var9_9 = 0x40000000;
                                    if (var10_10 == var9_9) {
                                        var16_16 = (int)var8_8.c0(0, (boolean)var19_19);
                                        var42_42 = 1;
                                    } else {
                                        var42_42 = 0;
                                        var13_13 = null;
                                        var16_16 = 1;
                                    }
                                    if (var11_11 == var9_9) {
                                        var20_20 = 1;
                                        var21_21 = 1.4E-45f;
                                        var19_19 = var8_8.c0(var20_20, (boolean)var19_19);
                                        var16_16 &= var19_19;
                                        ++var42_42;
                                    }
                                }
                                if (var16_16 != 0) {
                                    if (var10_10 == var9_9) {
                                        var10_10 = 1;
                                    } else {
                                        var10_10 = 0;
                                        var43_43 /* !! */  = null;
                                    }
                                    if (var11_11 == var9_9) {
                                        var9_9 = 1;
                                    } else {
                                        var9_9 = 0;
                                        var25_25 = null;
                                    }
                                    var8_8.X((boolean)var10_10, (boolean)var9_9);
                                }
                                break block90;
                            }
                            var36_36 = var9_9;
                            var37_37 /* !! */  = var13_13;
                            var38_38 = var16_16;
                            var42_42 = 0;
                            var13_13 = null;
                            var16_16 = 0;
                            var41_41 /* !! */  = null;
                        }
                        if (var16_16 == 0 || var42_42 != (var9_9 = 2)) break block91;
                        var25_25 = var8_8;
                        break block92;
                    }
                    var9_9 = var8_8.K0;
                    if (var15_15 <= 0) break block93;
                    var43_43 /* !! */  = var8_8.x0;
                    var10_10 = var43_43 /* !! */ .size();
                    var11_11 = (int)var8_8.f0(64);
                    var13_13 = var8_8.B0;
                    var27_27 = null;
                    block8: for (var26_26 = 0; var26_26 < var10_10; ++var26_26) {
                        var41_41 /* !! */  = (Y50)var8_8.x0.get(var26_26);
                        var19_19 = var41_41 /* !! */  instanceof w11_0;
                        if (var19_19 != 0) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var20_20 = 0;
                                var21_21 = 0.0f;
                                var22_22 /* !! */  = null;
                                continue block8;
                                break;
                            }
                        }
                        var19_19 = var41_41 /* !! */  instanceof Lv;
                        if (var19_19 != 0 || (var19_19 = var41_41 /* !! */ .I) != 0) ** GOTO lbl-1000
                        if (var11_11 != 0 && (var40_40 /* !! */  = var41_41 /* !! */ .d) != null && (var22_22 /* !! */  = var41_41 /* !! */ .e) != null) {
                            var40_40 /* !! */  = var40_40 /* !! */ .e;
                            var19_19 = (int)var40_40 /* !! */ .j;
                            if (var19_19 != 0) {
                                var40_40 /* !! */  = var22_22 /* !! */ .e;
                                var19_19 = (int)var40_40 /* !! */ .j;
                                if (var19_19 == 0) ** break;
                                ** continue;
                            }
                        }
                        var40_40 /* !! */  = null;
                        var22_22 /* !! */  = var41_41 /* !! */ .o(0);
                        var19_19 = 1;
                        var18_18 = 1.4E-45f;
                        var35_35 = var41_41 /* !! */ .o(var19_19);
                        var29_29 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                        if (var22_22 /* !! */  == var29_29 /* !! */  && (var31_31 /* !! */  = (Y50$b)var41_41 /* !! */ .t) != var19_19 && var35_35 == var29_29 /* !! */  && (var31_31 /* !! */  = (Y50$b)var41_41 /* !! */ .u) != var19_19) {
                            var31_31 /* !! */  = (Y50$b)true;
                        } else {
                            var31_31 /* !! */  = (Y50$b)false;
                            var30_30 /* !! */  = null;
                        }
                        if (var31_31 /* !! */  != false || (var32_32 = (int)var8_8.f0(var19_19)) == 0 || (var19_19 = var41_41 /* !! */  instanceof se3_0) != 0) ** GOTO lbl-1000
                        if (var22_22 /* !! */  == var29_29 /* !! */  && (var19_19 = var41_41 /* !! */ .t) == 0 && var35_35 != var29_29 /* !! */  && (var19_19 = (int)var41_41 /* !! */ .C()) == 0) {
                            var31_31 /* !! */  = (Y50$b)true;
                        }
                        if (var35_35 == var29_29 /* !! */  && (var19_19 = var41_41 /* !! */ .u) == 0 && var22_22 /* !! */  != var29_29 /* !! */  && (var19_19 = (int)var41_41 /* !! */ .C()) == 0) {
                            var31_31 /* !! */  = (Y50$b)true;
                        }
                        if (var22_22 /* !! */  != var29_29 /* !! */  && var35_35 != var29_29 /* !! */ ) lbl-1000:
                        // 2 sources

                        {
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var22_22 /* !! */  = null;
                        } else {
                            var18_18 = var41_41 /* !! */ .a0;
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var22_22 /* !! */  = null;
                            cfr_temp_1 = var18_18 - 0.0f;
                            var19_19 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                            if (var19_19 > 0) {
                                var31_31 /* !! */  = (Y50$b)true;
                            }
                        }
                        if (var31_31 /* !! */  != false) continue;
                        var19_19 = 0;
                        var18_18 = 0.0f;
                        var40_40 /* !! */  = null;
                        var12_12.a(0, (Zw$b)var13_13, var41_41 /* !! */ );
                    }
                    var13_13.a();
                }
                var12_12.c(var8_8);
                var43_43 /* !! */  = var12_12.a;
                var11_11 = var43_43 /* !! */ .size();
                var42_42 = var38_38;
                var26_26 = 0;
                var27_27 = null;
                if (var15_15 > 0) {
                    var12_12.b(var8_8, 0, var38_38, var17_17);
                }
                if (var11_11 <= 0) break block94;
                var14_14 /* !! */  = var8_8.W;
                var41_41 /* !! */  = var14_14 /* !! */ [0];
                var40_40 /* !! */  = Y50$b.WRAP_CONTENT;
                if (var41_41 /* !! */  == var40_40 /* !! */ ) {
                    var16_16 = 1;
lbl411:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var16_16 = 0;
                var41_41 /* !! */  = null;
                ** while (true)
                var20_20 = 1;
                var21_21 = 1.4E-45f;
                var14_14 /* !! */  = var14_14 /* !! */ [var20_20];
                if (var14_14 /* !! */  == var40_40 /* !! */ ) {
                    var15_15 = 1;
                } else {
                    var15_15 = 0;
                    var14_14 /* !! */  = null;
                }
                var19_19 = this.v();
                var22_22 /* !! */  = var12_12.c;
                var23_23 = var22_22 /* !! */ .f0;
                var19_19 = Math.max(var19_19, var23_23);
                var23_23 = this.p();
                var20_20 = var22_22 /* !! */ .g0;
                var20_20 = Math.max(var23_23, var20_20);
                var35_35 = null;
                var24_24 = 0;
                var29_29 /* !! */  = null;
                for (var23_23 = 0; var23_23 < var11_11; ++var23_23) {
                    var30_30 /* !! */  = (Y50)var43_43 /* !! */ .get(var23_23);
                    var32_32 = var30_30 /* !! */  instanceof se3_0;
                    if (var32_32 == 0) {
                        var33_33 = var9_9;
                        var25_25 = var37_37 /* !! */ ;
                    } else {
                        var32_32 = ((Y50)var30_30 /* !! */ ).v();
                        var26_26 = ((Y50)var30_30 /* !! */ ).p();
                        var33_33 = var9_9;
                        var25_25 = var37_37 /* !! */ ;
                        var44_44 = var12_12.a(1, (Zw$b)var37_37 /* !! */ , (Y50)var30_30 /* !! */ );
                        var45_45 = var24_24 | var44_44;
                        var24_24 = ((Y50)var30_30 /* !! */ ).v();
                        var1_1 = var45_45;
                        var45_45 = ((Y50)var30_30 /* !! */ ).p();
                        if (var24_24 != var32_32) {
                            ((Y50)var30_30 /* !! */ ).W(var24_24);
                            if (var16_16 != 0) {
                                var24_24 = ((Y50)var30_30 /* !! */ ).w();
                                var32_32 = ((Y50)var30_30 /* !! */ ).Y;
                                if ((var24_24 += var32_32) > var19_19) {
                                    var24_24 = ((Y50)var30_30 /* !! */ ).w();
                                    var32_32 = ((Y50)var30_30 /* !! */ ).Y;
                                    var24_24 += var32_32;
                                    var28_28 = v50$a.RIGHT;
                                    var28_28 = ((Y50)var30_30 /* !! */ ).n((v50$a)var28_28);
                                    var32_32 = var28_28.e() + var24_24;
                                    var19_19 = Math.max(var19_19, var32_32);
                                }
                            }
                            var24_24 = 1;
                        } else {
                            var24_24 = var1_1;
                        }
                        if (var45_45 != var26_26) {
                            ((Y50)var30_30 /* !! */ ).R(var45_45);
                            if (var15_15 != 0) {
                                var45_45 = ((Y50)var30_30 /* !! */ ).x();
                                var24_24 = ((Y50)var30_30 /* !! */ ).Z;
                                if ((var45_45 += var24_24) > var20_20) {
                                    var45_45 = ((Y50)var30_30 /* !! */ ).x();
                                    var24_24 = ((Y50)var30_30 /* !! */ ).Z;
                                    var45_45 += var24_24;
                                    var29_29 /* !! */  = v50$a.BOTTOM;
                                    var29_29 /* !! */  = ((Y50)var30_30 /* !! */ ).n((v50$a)var29_29 /* !! */ );
                                    var24_24 = var29_29 /* !! */ .e() + var45_45;
                                    var20_20 = Math.max(var20_20, var24_24);
                                }
                            }
                            var45_45 = var20_20;
                            var20_20 = 1;
                            var21_21 = 1.4E-45f;
                        } else {
                            var45_45 = var20_20;
                            var20_20 = var24_24;
                        }
                        var30_30 /* !! */  = (se3_0)var30_30 /* !! */ ;
                        var24_24 = (int)var30_30 /* !! */ .F0;
                        var24_24 = var20_20 | var24_24;
                        var20_20 = var45_45;
                    }
                    var26_26 = 0;
                    var27_27 = null;
                    var8_8 = this;
                    var37_37 /* !! */  = var25_25;
                    var9_9 = var33_33;
                }
                var33_33 = var9_9;
                var25_25 = var37_37 /* !! */ ;
                var45_45 = var20_20;
                var20_20 = 2;
                var21_21 = 2.8E-45f;
                var26_26 = 0;
                var27_27 = null;
                while (var26_26 < var20_20) {
                    var35_35 = null;
                    for (var23_23 = 0; var23_23 < var11_11; ++var23_23) {
                        block95: {
                            var30_30 /* !! */  = (Y50)var43_43 /* !! */ .get(var23_23);
                            var32_32 = var30_30 /* !! */  instanceof C41;
                            if (var32_32 != 0 && (var32_32 = var30_30 /* !! */  instanceof se3_0) == 0 || (var32_32 = var30_30 /* !! */  instanceof w11_0) != 0) ** GOTO lbl-1000
                            var32_32 = ((Y50)var30_30 /* !! */ ).k0;
                            var20_20 = 8;
                            var21_21 = 1.1E-44f;
                            if (var32_32 == var20_20) ** GOTO lbl-1000
                            if (var36_36 == 0) break block95;
                            var22_22 /* !! */  = ((Y50)var30_30 /* !! */ ).d.e;
                            var20_20 = (int)var22_22 /* !! */ .j;
                            if (var20_20 == 0) break block95;
                            var22_22 /* !! */  = ((Y50)var30_30 /* !! */ ).e.e;
                            var20_20 = (int)var22_22 /* !! */ .j;
                            if (var20_20 != 0) ** GOTO lbl-1000
                        }
                        if ((var20_20 = var30_30 /* !! */  instanceof se3_0) != 0) lbl-1000:
                        // 4 sources

                        {
                            var39_39 = var25_25;
                            var37_37 /* !! */  = var43_43 /* !! */ ;
                            var1_1 = var11_11;
                        } else {
                            var20_20 = ((Y50)var30_30 /* !! */ ).v();
                            var32_32 = ((Y50)var30_30 /* !! */ ).p();
                            var37_37 /* !! */  = var43_43 /* !! */ ;
                            var10_10 = ((Y50)var30_30 /* !! */ ).e0;
                            var1_1 = var11_11;
                            var11_11 = 1;
                            if (var26_26 == var11_11) {
                                var11_11 = 2;
                            }
                            var11_11 = var12_12.a(var11_11, (Zw$b)var25_25, (Y50)var30_30 /* !! */ ) | var24_24;
                            var24_24 = ((Y50)var30_30 /* !! */ ).v();
                            var39_39 = var25_25;
                            var9_9 = ((Y50)var30_30 /* !! */ ).p();
                            if (var24_24 != var20_20) {
                                ((Y50)var30_30 /* !! */ ).W(var24_24);
                                if (var16_16 != 0) {
                                    var11_11 = ((Y50)var30_30 /* !! */ ).w();
                                    var20_20 = ((Y50)var30_30 /* !! */ ).Y;
                                    if ((var11_11 += var20_20) > var19_19) {
                                        var11_11 = ((Y50)var30_30 /* !! */ ).w();
                                        var20_20 = ((Y50)var30_30 /* !! */ ).Y;
                                        var11_11 += var20_20;
                                        var22_22 /* !! */  = v50$a.RIGHT;
                                        var22_22 /* !! */  = ((Y50)var30_30 /* !! */ ).n((v50$a)var22_22 /* !! */ );
                                        var20_20 = var22_22 /* !! */ .e() + var11_11;
                                        var19_19 = Math.max(var19_19, var20_20);
                                    }
                                }
                                var20_20 = 1;
                                var21_21 = 1.4E-45f;
                            } else {
                                var20_20 = var11_11;
                            }
                            if (var9_9 != var32_32) {
                                ((Y50)var30_30 /* !! */ ).R(var9_9);
                                if (var15_15 != 0) {
                                    var9_9 = ((Y50)var30_30 /* !! */ ).x();
                                    var11_11 = ((Y50)var30_30 /* !! */ ).Z;
                                    if ((var9_9 += var11_11) > var45_45) {
                                        var9_9 = ((Y50)var30_30 /* !! */ ).x();
                                        var11_11 = ((Y50)var30_30 /* !! */ ).Z;
                                        var9_9 += var11_11;
                                        var46_46 = v50$a.BOTTOM;
                                        var46_46 = ((Y50)var30_30 /* !! */ ).n((v50$a)var46_46);
                                        var11_11 = var46_46.e() + var9_9;
                                        var45_45 = Math.max(var45_45, var11_11);
                                    }
                                }
                                var20_20 = 1;
                                var21_21 = 1.4E-45f;
                            }
                            var24_24 = (var9_9 = (int)((Y50)var30_30 /* !! */ ).G) != 0 && var10_10 != (var9_9 = ((Y50)var30_30 /* !! */ ).e0) ? 1 : var20_20;
                        }
                        var11_11 = var1_1;
                        var43_43 /* !! */  = var37_37 /* !! */ ;
                        var25_25 = var39_39;
                        var20_20 = 2;
                        var21_21 = 2.8E-45f;
                    }
                    var39_39 = var25_25;
                    var37_37 /* !! */  = var43_43 /* !! */ ;
                    var1_1 = var11_11;
                    if (var24_24 == 0) break;
                    var25_25 = this;
                    var12_12.b(this, ++var26_26, var42_42, var17_17);
                    var25_25 = var39_39;
                    var20_20 = 2;
                    var21_21 = 2.8E-45f;
                    var24_24 = 0;
                    var29_29 /* !! */  = null;
                }
                var25_25 = this;
lbl589:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var33_33 = var9_9;
            var25_25 = var8_8;
            ** while (true)
            var45_45 = var33_33;
            var25_25.K0 = var33_33;
            var45_45 = (int)var25_25.f0(512);
            Eu1.q = var45_45;
        }
    }

    public final boolean f0(int n3) {
        int n4 = this.K0 & n3;
        n3 = n4 == n3 ? 1 : 0;
        return n3 != 0;
    }

    public final void s(StringBuilder stringBuilder) {
        Object object = new StringBuilder();
        CharSequence charSequence = this.l;
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(":{\n");
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        object = new StringBuilder("  actualWidth:");
        int n3 = this.Y;
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        object = "\n";
        stringBuilder.append((String)object);
        String string2 = "  actualHeight:";
        charSequence = new StringBuilder(string2);
        int n4 = this.Z;
        ((StringBuilder)charSequence).append(n4);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        stringBuilder.append((String)object);
        object = this.x0.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ((Y50)object.next()).s(stringBuilder);
            charSequence = ",\n";
            stringBuilder.append((String)charSequence);
        }
        stringBuilder.append("}");
    }
}

