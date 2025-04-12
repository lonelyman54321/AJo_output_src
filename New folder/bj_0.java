/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from bj
 */
public final class bj_0 {
    public static final void a(k72 k722, Nc nc, u10 u102, b30_0 object, int n3) {
        int n4;
        object = object.g(476043083);
        int n7 = n3 & 6;
        int n8 = 4;
        if (n7 == 0) {
            n7 = n3 & 8;
            n7 = n7 == 0 ? (int)(((j30_0)object).J(k722) ? 1 : 0) : (int)(((j30_0)object).x(k722) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x30;
        int n14 = 32;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).J(nc) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n3 & 0x180) == 0) {
            n10 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        if ((n10 = n7 & 0x93) == (n4 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Mw2 mw2;
            Object object2;
            Object object3;
            n10 = n7 & 0x70;
            n4 = 0;
            boolean bl2 = true;
            if (n10 == n14) {
                n10 = 1;
            } else {
                n10 = 0;
                object3 = null;
            }
            n14 = n7 & 0xE;
            if (n14 == n8 || (n8 = n7 & 8) != 0 && (n8 = (int)(((j30_0)object).J(k722) ? 1 : 0)) != 0) {
                n4 = 1;
            }
            n8 = n10 | n4;
            object3 = ((j30_0)object).v();
            if (n8 != 0 || object3 == (object2 = b30$a.a)) {
                object3 = new w21_0(nc, k722);
                ((j30_0)object).o(object3);
            }
            object2 = object3;
            object2 = (w21_0)object3;
            ZW2 zW2 = ZW2.Inherit;
            bl2 = true;
            n14 = 0;
            n4 = 1;
            object3 = mw2;
            mw2 = new Mw2(false, n4 != 0, bl2, zW2, true, false);
            n7 = n7 << 3 & 0x1C00;
            int n15 = n7 | 0x180;
            int n16 = 2;
            n10 = 0;
            object3 = null;
            xi.a((Lw2)object2, null, mw2, u102, (b30_0)object, n15, n16);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ui_1 ui_12 = new ui_1(k722, nc, u102, n3);
            ((CF2)object).d = ui_12;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void b(k72 var0, boolean var1_1, uk2_0 var2_2, boolean var3_3, long var4_4, SuspendPointerInputElement var6_5, b30_0 var7_6, int var8_7) {
        block17: {
            block18: {
                block16: {
                    var9_8 = var0;
                    var10_9 = var1_1;
                    var11_10 /* !! */  = var2_2;
                    var12_11 = var3_3;
                    var13_12 = var6_5;
                    var14_13 = var8_7;
                    var15_14 = 1;
                    var16_15 = var7_6.g(-843755800);
                    var17_16 = var8_7 & 6;
                    var18_17 = 4;
                    if (var17_16 == 0) {
                        var17_16 = var8_7 & 8;
                        var17_16 = var17_16 == 0 ? (int)var16_15.J(var0) : (int)var16_15.x(var0);
                        var17_16 = var17_16 != 0 ? 4 : 2;
                        var17_16 |= var14_13;
                    } else {
                        var17_16 = var8_7;
                    }
                    var19_18 = var14_13 & 48;
                    var20_19 = 32;
                    if (var19_18 == 0) {
                        var19_18 = (int)var16_15.a((boolean)var10_9);
                        var19_18 = var19_18 != 0 ? 32 : 16;
                        var17_16 |= var19_18;
                    }
                    if ((var19_18 = var14_13 & 384) == 0) {
                        var19_18 = (int)var16_15.J((Object)var11_10 /* !! */ );
                        var19_18 = var19_18 != 0 ? 256 : 128;
                        var17_16 |= var19_18;
                    }
                    if ((var19_18 = var14_13 & 3072) == 0) {
                        var19_18 = (int)var16_15.a(var12_11);
                        var19_18 = var19_18 != 0 ? 2048 : 1024;
                        var17_16 |= var19_18;
                    }
                    if ((var19_18 = var14_13 & 24576) == 0) {
                        var17_16 |= 8192;
                    }
                    if ((var19_18 = 196608 & var14_13) == 0) {
                        var19_18 = (int)var16_15.J(var13_12);
                        var19_18 = var19_18 != 0 ? 131072 : 65536;
                        var17_16 |= var19_18;
                    }
                    if ((var19_18 = 74899 & var17_16) != (var21_20 = 74898) || (var19_18 = (int)var16_15.h()) == 0) break block16;
                    var16_15.D();
                    var22_21 = var4_4;
                    break block17;
                }
                var16_15.r0();
                var19_18 = var14_13 & 1;
                var21_20 = -57345;
                if (var19_18 != 0 && (var19_18 = (int)var16_15.c0()) == 0) {
                    var16_15.D();
                    var17_16 &= var21_20;
                    var24_22 = var4_4;
                } else {
                    var17_16 &= var21_20;
                    var24_22 = var22_21 = 9205357640488583168L;
                }
                var16_15.U();
                if (var10_9 == 0) break block18;
                var26_23 /* !! */  = uk2_0.Ltr;
                if ((var11_10 /* !! */  != var26_23 /* !! */  || var12_11) && (var11_10 /* !! */  != (var26_23 /* !! */  = uk2_0.Rtl) || !var12_11)) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            var26_23 /* !! */  = uk2_0.Ltr;
            if (var11_10 /* !! */  == var26_23 /* !! */  && !var12_11 || var11_10 /* !! */  == (var26_23 /* !! */  = uk2_0.Rtl) && var12_11) {
                var21_20 = 1;
            } else {
                var21_20 = 0;
                var26_23 /* !! */  = null;
            }
            if (var21_20 == 0) lbl-1000:
            // 2 sources

            {
                var21_20 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var21_20 = 0;
                var26_23 /* !! */  = null;
            }
            var27_24 = var21_20 != 0 ? A0.b : A0.a;
            var19_18 = var17_16 & 14;
            var18_17 = var19_18 != var18_17 && ((var18_17 = var17_16 & 8) == 0 || (var18_17 = (int)var16_15.x(var9_8)) == 0) ? 0 : 1;
            if ((var17_16 &= 112) != var20_19) {
                var15_14 = 0;
                var28_25 = null;
            }
            var15_14 |= var18_17;
            var17_16 = (int)var16_15.a((boolean)var21_20);
            var29_26 = var16_15.v();
            if ((var15_14 |= var17_16) != 0 || var29_26 == (var28_25 = b30$a.a)) {
                var29_26 = new aj_1((k72)var9_8, (boolean)var10_9, (boolean)var21_20);
                var16_15.o(var29_26);
            }
            var29_26 = (Function1)var29_26;
            var30_27 = CY2.b(var13_12, false, (Function1)var29_26);
            var28_25 = O30.q;
            var29_26 = var28_25 = var16_15.j((H30)var28_25);
            var29_26 = (NC3)var28_25;
            var28_25 = var31_28;
            var10_9 = var19_18;
            var11_10 /* !! */  = var31_28;
            var20_19 = var21_20;
            var26_23 /* !! */  = var30_27;
            var32_29 = var27_24;
            var27_24 = var0;
            var31_28 = new Yi((NC3)var29_26, var24_22, (boolean)var21_20, var30_27, var0);
            var15_14 = 280174801;
            var28_25 = v10.c(var15_14, var31_28, var16_15);
            var17_16 = var19_18 | 384;
            bj_0.a((k72)var9_8, (Nc)var32_29, (u10)var28_25, var16_15, var17_16);
            var22_21 = var24_22;
        }
        var11_10 /* !! */  = var16_15.X();
        if (var11_10 /* !! */  != null) {
            var28_25 = var32_29;
            var29_26 = var0;
            var18_17 = var1_1;
            var20_19 = (int)var3_3;
            var9_8 = var6_5;
            var10_9 = var8_7;
            var32_29 = new zi_1(var0, (boolean)var1_1, var2_2, var3_3, var22_21, var6_5, var8_7);
            var11_10 /* !! */ .d = var32_29;
        }
    }

    public static final void c(LP1 lP1, Function0 function0, boolean bl2, b30_0 object, int n3) {
        Object object2;
        float f5;
        float f6 = 3.6813775E37f;
        object = object.g(2111672474);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f6 = 5.6E-45f;
            } else {
                n4 = 2;
                f6 = 2.8E-45f;
            }
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(function0) ? 1 : 0);
            if (n7 != 0) {
                n7 = 32;
                f5 = 4.5E-44f;
            } else {
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n4 |= n7;
        }
        if ((n7 = n3 & 0x180) == 0) {
            n7 = (int)(((j30_0)object).a(bl2) ? 1 : 0);
            if (n7 != 0) {
                n7 = 256;
                f5 = 3.59E-43f;
            } else {
                n7 = 128;
                f5 = 1.8E-43f;
            }
            n4 |= n7;
        }
        n7 = 146;
        f5 = 2.05E-43f;
        if ((n4 &= 0x93) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            f6 = hY2.a;
            f5 = hY2.b;
            object2 = j.i(lP1, f6, f5);
            ej_2 ej_22 = new ej_2(function0, bl2);
            ji1$a ji1$a = ji1.a;
            object2 = a30_0.a((LP1)object2, ji1$a, ej_22);
            Q93.b((b30_0)object, (LP1)object2);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new bj$a(lP1, function0, bl2, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final hd1_0 d(xi_0 xi_02, float f5) {
        xl_0 xl_02;
        void var8_10;
        int n3;
        xi_0 xi_03 = xi_02;
        float f6 = f5;
        double d2 = Math.ceil(f5);
        float f7 = (float)d2;
        int n4 = (int)f7 * 2;
        hd1_0 hd1_02 = rb1_0.b;
        iL iL2 = rb1_0.c;
        xl_0 xl_03 = rb1_0.d;
        if (hd1_02 == null || iL2 == null || n4 > (n3 = hd1_02.getWidth()) || n4 > (n3 = hd1_02.getHeight())) {
            int n7 = 1;
            ih_0 ih_02 = xj2_2.b(n4, n4, n7);
            rb1_0.b = ih_02;
            rb1_0.c = iL2 = BL.a(ih_02);
        }
        void var12_17 = var8_10;
        iL iL3 = iL2;
        if (xl_03 == null) {
            rb1_0.d = xl_02 = new xl_0();
        } else {
            xl_02 = xl_03;
        }
        bp1_0 bp1_02 = xi_03.a.getLayoutDirection();
        float f8 = var12_17.getWidth();
        float f11 = var12_17.getHeight();
        long l2 = bo1_1.a(f8, f11);
        xL$a xL$a = xl_02.a;
        Vo0 vo0 = xL$a.a;
        bp1_0 bp1_03 = xL$a.b;
        iL iL4 = xL$a.c;
        long l3 = xL$a.d;
        xL$a.a = xi_03;
        xL$a.b = bp1_02;
        xL$a.c = iL3;
        xL$a.d = l2;
        iL3.p();
        l2 = OX.b;
        long l4 = xl_02.l();
        long l7 = l3;
        l3 = l2;
        iL2 = iL4;
        long l8 = l4;
        bp1_0 bp1_04 = bp1_03;
        Vo0 vo02 = vo0;
        int n8 = 58;
        Jt0.j(xl_02, l2, l4, 0.0f, null, n8);
        long l12 = 0xFF000000L;
        l3 = zx_0.d(l12);
        l8 = bo1_1.a(f6, f6);
        Jt0.j(xl_02, l3, l8, 0.0f, null, 120);
        long l14 = zx_0.d(l12);
        long l15 = h72.a(f6, f6);
        Vo0 vo03 = vo0;
        xl_0 xl_04 = xl_02;
        f6 = f5;
        l2 = l15;
        n3 = 120;
        Jt0.c(xl_02, l14, f5, l15, n3);
        iL3.h();
        xL$a.a = vo0;
        xL$a.b = bp1_04;
        xL$a.c = iL4;
        xL$a.d = l7;
        return var12_17;
    }
}

