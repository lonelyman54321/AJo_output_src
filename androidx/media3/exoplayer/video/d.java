/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.os.Handler
 *  android.view.Display
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.d$a;
import androidx.media3.exoplayer.video.d$b;

public final class d {
    public final d$b a;
    public final OB3 b;
    public final long c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public float k;
    public VV l;

    public d(Context object, d$b object2) {
        long l2;
        this.a = object2;
        this.c = 5000L;
        this.b = object2 = new OB3((Context)object);
        this.e = 0;
        this.f = l2 = -9223372036854775807L;
        this.h = l2;
        this.i = l2;
        this.k = 1.0f;
        object = VV.a;
        this.l = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(long var1_1, long var3_2, long var5_3, long var7_4, boolean var9_5, d$a var10_6) {
        block46: {
            block45: {
                block35: {
                    block41: {
                        block42: {
                            block43: {
                                block44: {
                                    block36: {
                                        block38: {
                                            block40: {
                                                block39: {
                                                    block37: {
                                                        var11_7 = this;
                                                        var12_8 = var1_1;
                                                        var14_9 = var3_2;
                                                        var16_10 = var10_6;
                                                        var17_11 = -9223372036854775807L;
                                                        var19_12 = -4.9E-324;
                                                        var10_6.a = var17_11;
                                                        var10_6.b = var17_11;
                                                        var21_13 = this.f;
                                                        cfr_temp_0 = var21_13 - var17_11;
                                                        var23_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                        if (var23_14 /* !! */  == false) {
                                                            this.f = var3_2;
                                                        }
                                                        var21_13 = var11_7.h;
                                                        var24_15 = -1;
                                                        var26_16 = 1000L;
                                                        var28_17 = false;
                                                        var29_18 = 1;
                                                        var30_19 /* !! */  = (long)(var21_13 == var12_8 ? 0 : (var21_13 < var12_8 ? -1 : 1));
                                                        if (var30_19 /* !! */  == false) break block36;
                                                        var31_20 = var11_7.b;
                                                        var17_11 = var31_20.n;
                                                        cfr_temp_1 = var17_11 - var24_15;
                                                        var32_21 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                        if (var32_21 /* !! */  != false) {
                                                            var31_20.p = var17_11;
                                                            var31_20.q = var17_11 = var31_20.o;
                                                        }
                                                        var17_11 = var31_20.m;
                                                        var33_22 = 1L;
                                                        var31_20.m = var17_11 += var33_22;
                                                        var17_11 = var12_8 * var26_16;
                                                        var35_23 = var31_20.a;
                                                        var35_23.a.b(var17_11);
                                                        var36_24 = var35_23.a;
                                                        var23_14 /* !! */  = (long)var36_24.a();
                                                        if (var23_14 /* !! */  == false) break block37;
                                                        var35_23.c = false;
                                                        break block38;
                                                    }
                                                    var24_15 = var35_23.d;
                                                    var37_25 = -9223372036854775807L;
                                                    cfr_temp_2 = var24_15 - var37_25;
                                                    var39_26 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                    if (var39_26 /* !! */  == false) break block38;
                                                    var23_14 /* !! */  = (long)var35_23.c;
                                                    if (var23_14 /* !! */  == false) break block39;
                                                    var36_24 = var35_23.b;
                                                    var26_16 = var36_24.d;
                                                    var40_27 = 0L;
                                                    cfr_temp_3 = var26_16 - var40_27;
                                                    var42_28 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                    if (var42_28 == 0) {
                                                        var23_14 /* !! */  = 0;
                                                        var36_24 = null;
                                                    } else {
                                                        var26_16 -= var33_22;
                                                        var33_22 = 15;
                                                        var42_28 = (int)(var26_16 %= var33_22);
                                                        var36_24 = var36_24.g;
                                                        var23_14 /* !! */  = (long)var36_24[var42_28];
                                                    }
                                                    if (var23_14 /* !! */  == false) break block40;
                                                }
                                                var35_23.b.c();
                                                var36_24 = var35_23.b;
                                                var26_16 = var35_23.d;
                                                var36_24.b(var26_16);
                                            }
                                            var35_23.c = var29_18;
                                            var36_24 = var35_23.b;
                                            var36_24.b(var17_11);
                                        }
                                        var23_14 /* !! */  = (long)var35_23.c;
                                        if (var23_14 /* !! */  != false && (var23_14 /* !! */  = (long)(var36_24 = var35_23.b).a()) != false) {
                                            var36_24 = var35_23.a;
                                            var35_23.a = var43_29 = var35_23.b;
                                            var35_23.b = var36_24;
                                            var35_23.c = false;
                                        }
                                        var35_23.d = var17_11;
                                        var44_30 = var35_23.a;
                                        var45_31 = (int)var44_30.a();
                                        if (var45_31 != 0) {
                                            var45_31 = 0;
                                            var46_32 = 0.0f;
                                            var44_30 = null;
                                        } else {
                                            var45_31 = var35_23.e + var29_18;
                                        }
                                        var35_23.e = var45_31;
                                        var31_20.c();
                                        var11_7.h = var12_8;
                                    }
                                    var47_33 = var12_8 - var14_9;
                                    var46_32 = var11_7.k;
                                    var19_12 = var46_32;
                                    var12_8 = (long)(var47_33 /= var19_12);
                                    var45_31 = var11_7.d;
                                    if (var45_31 != 0) {
                                        var44_30 = var11_7.l;
                                        var17_11 = gz3.I(var44_30.elapsedRealtime()) - var5_3;
                                        var12_8 -= var17_11;
                                    }
                                    var16_10.a = var12_8;
                                    var17_11 = var11_7.i;
                                    var21_13 = -30000L;
                                    var23_14 /* !! */  = 3;
                                    var42_28 = 2;
                                    var26_16 = -9223372036854775807L;
                                    cfr_temp_4 = var17_11 - var26_16;
                                    var49_34 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                    if (var49_34 /* !! */  != false && (var45_31 = var11_7.j) == 0) lbl-1000:
                                    // 5 sources

                                    {
                                        while (true) {
                                            var50_35 /* !! */  = 0;
                                            var51_36 = null;
                                            break block35;
                                            break;
                                        }
                                    }
                                    var45_31 = var11_7.e;
                                    if (var45_31 == 0) break block41;
                                    if (var45_31 == var29_18) break block42;
                                    if (var45_31 == var42_28) break block43;
                                    if (var45_31 != var23_14 /* !! */ ) break block44;
                                    var44_30 = var11_7.l;
                                    var17_11 = gz3.I(var44_30.elapsedRealtime());
                                    var26_16 = var11_7.g;
                                    var17_11 -= var26_16;
                                    var52_38 /* !! */  = var11_7.d;
                                    if (var52_38 /* !! */  == 0) ** GOTO lbl-1000
                                    var53_39 = (b)var11_7.a;
                                    var53_39.getClass();
                                    var52_38 /* !! */  = (int)(var12_8 == var21_13 ? 0 : (var12_8 < var21_13 ? -1 : 1));
                                    if (var52_38 /* !! */  >= 0) ** GOTO lbl-1000
                                    var12_8 = 100000L;
                                    var47_33 = 4.94066E-319;
                                    var52_38 /* !! */  = (int)(var17_11 == var12_8 ? 0 : (var17_11 < var12_8 ? -1 : 1));
                                    if (var52_38 /* !! */  <= 0) ** GOTO lbl-1000
                                    break block42;
                                }
                                var51_37 = new IllegalStateException();
                                throw var51_37;
                            }
                            var50_35 /* !! */  = (int)(var14_9 == var7_4 ? 0 : (var14_9 < var7_4 ? -1 : 1));
                            if (var50_35 /* !! */  >= 0) ** break;
                            ** while (true)
                        }
                        var50_35 /* !! */  = 1;
                        break block35;
                    }
                    var50_35 /* !! */  = var11_7.d;
                }
                if (var50_35 /* !! */  != 0) {
                    return 0;
                }
                var50_35 /* !! */  = var11_7.d;
                if (var50_35 /* !! */  != 0 && (var50_35 /* !! */  = (int)((cfr_temp_5 = var14_9 - (var17_11 = var11_7.f)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) != 0) break block45;
                var50_35 /* !! */  = 5;
                break block46;
            }
            var17_11 = var11_7.l.nanoTime();
            var51_36 = var11_7.b;
            var26_16 = var16_10.a;
            Long.signum(var26_16);
            var26_16 = var26_16 * 1000L + var17_11;
            var24_15 = var51_36.p;
            var33_22 = -1;
            var54_40 = var24_15 == var33_22 ? 0 : (var24_15 < var33_22 ? -1 : 1);
            if (var54_40 != false && (var23_14 /* !! */  = (long)(var36_24 = var51_36.a.a).a()) != false) {
                var36_24 = var51_36.a;
                var43_29 = var36_24.a;
                var42_28 = (int)var43_29.a();
                if (var42_28 != 0) {
                    var36_24 = var36_24.a;
                    var21_13 = var36_24.e;
                    var40_27 = 0L;
                    cfr_temp_6 = var21_13 - var40_27;
                    var42_28 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                    var24_15 = var42_28 == 0 ? 0L : var36_24.f / var21_13;
                } else {
                    var24_15 = -9223372036854775807L;
                }
                var21_13 = var51_36.q;
                var55_41 = var51_36.m;
                var57_42 = var51_36.p;
                var55_41 = (var55_41 - var57_42) * var24_15;
                var59_43 = var55_41;
                var60_44 = var51_36.i;
                var57_42 = (long)(var59_43 /= var60_44);
                var21_13 += var57_42;
                var57_42 = Math.abs(var26_16 - var21_13);
                var24_15 = 20000000L;
                var61_45 = var57_42 == var24_15 ? 0 : (var57_42 < var24_15 ? -1 : 1);
                if (var61_45 <= 0) {
                    var26_16 = var21_13;
                } else {
                    var51_36.m = 0L;
                    var51_36.p = var57_42 = (long)-1;
                    var51_36.n = var57_42;
                }
            }
            var51_36.n = var57_42 = var51_36.m;
            var51_36.o = var26_16;
            var62_46 = var51_36.c;
            if (var62_46 != null && (var23_14 /* !! */  = (cfr_temp_7 = (var14_9 = var51_36.k) - (var21_13 = -9223372036854775807L)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) != false && (var61_45 = (cfr_temp_8 = (var57_42 = var62_46.a) - var21_13) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) != false) {
                var21_13 = var51_36.k;
                var24_15 = (var26_16 - var57_42) / var21_13 * var21_13 + var57_42;
                cfr_temp_9 = var26_16 - var24_15;
                var63_47 /* !! */  = (long)(cfr_temp_9 == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1));
                if (var63_47 /* !! */  <= 0) {
                    var57_42 = var24_15 - var21_13;
                } else {
                    var21_13 += var24_15;
                    var57_42 = var24_15;
                    var24_15 = var21_13;
                }
                var21_13 = var24_15 - var26_16;
                cfr_temp_10 = var21_13 - (var26_16 -= var57_42);
                var61_45 = cfr_temp_10 == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1);
                if (var61_45 >= 0) {
                    var24_15 = var57_42;
                }
                var12_8 = var51_36.l;
                var26_16 = var24_15 - var12_8;
            }
            var16_10.b = var26_16;
            var26_16 -= var17_11;
            var47_33 = 4.94E-321;
            var16_10.a = var26_16 /= 1000L;
            var12_8 = var11_7.i;
            var14_9 = -9223372036854775807L;
            cfr_temp_11 = var12_8 - var14_9;
            var45_31 = (int)(cfr_temp_11 == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1));
            if (var45_31 != 0 && (var50_35 /* !! */  = (int)var11_7.j) == 0) {
                var50_35 /* !! */  = 1;
            } else {
                var50_35 /* !! */  = 0;
                var51_36 = null;
            }
            var62_46 = (b)var11_7.a;
            var62_46.getClass();
            var14_9 = 4294467296L;
            var45_31 = (int)(var26_16 == var14_9 ? 0 : (var26_16 < var14_9 ? -1 : 1));
            if (var45_31 >= 0 || var9_5) ** GOTO lbl-1000
            var64_48 = var62_46.i;
            var64_48.getClass();
            var17_11 = var62_46.k;
            var17_11 = var3_2 - var17_11;
            var65_49 = var64_48.e(var17_11);
            if (var65_49 != 0) {
                if (var50_35 /* !! */  != 0) {
                    var67_52 = var62_46.O0;
                    var67_52.d = var45_31 = var67_52.d + var65_49;
                    var65_49 = var67_52.f;
                    var45_31 = var62_46.p1;
                    var67_52.f = var65_49 += var45_31;
                } else {
                    var67_53 = var62_46.O0;
                    var45_31 = var67_53.j;
                    var66_51 = 1;
                    var67_53.j = var45_31 += var66_51;
                    var61_45 = var62_46.p1;
                    var62_46.N0(var65_49, (int)var61_45);
                }
                var65_49 = (int)var62_46.R();
                if (var65_49 != 0) {
                    var62_46.b0();
                }
                var62_46 = var62_46.d1;
                var66_51 = 0;
                if (var62_46 != null) {
                    var62_46.t(false);
                }
                var63_47 /* !! */  = 1;
                var59_43 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var66_50 = false;
                var63_47 /* !! */  = 0;
                var59_43 = 0.0f;
                var62_46 = null;
            }
            if (var63_47 /* !! */  != false) {
                return 4;
            }
            var62_46 = var11_7.a;
            var14_9 = var16_10.a;
            var62_46 = (b)var62_46;
            var62_46.getClass();
            var21_13 = -30000L;
            var63_47 /* !! */  = var14_9 == var21_13 ? 0 : (var14_9 < var21_13 ? -1 : 1);
            var28_17 = var63_47 /* !! */  < 0 && var9_5 == false;
            if (var28_17) {
                var23_14 /* !! */  = var50_35 /* !! */  != 0 ? (long)3 : (long)2;
                return (int)var23_14 /* !! */ ;
            }
            var12_8 = var16_10.a;
            var14_9 = 50000L;
            cfr_temp_12 = var12_8 - var14_9;
            var68_54 /* !! */  = (long)(cfr_temp_12 == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1));
            if (var68_54 /* !! */  > 0) {
                return 5;
            }
            var50_35 /* !! */  = 1;
        }
        return var50_35 /* !! */ ;
    }

    public final boolean b(boolean n3) {
        long l2;
        int n4;
        boolean bl2 = true;
        long l3 = -9223372036854775807L;
        if (n3 != 0 && (n3 = this.e) == (n4 = 3)) {
            this.i = l3;
            return bl2;
        }
        long l4 = this.i;
        n3 = 0;
        Object object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (object == false) {
            return false;
        }
        VV vV = this.l;
        l4 = vV.elapsedRealtime();
        long l7 = l4 - (l2 = this.i);
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 < 0) {
            return bl2;
        }
        this.i = l3;
        return false;
    }

    public final void c(boolean object) {
        this.j = object;
        long l2 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            VV vV = this.l;
            l3 = vV.elapsedRealtime() + l2;
        } else {
            l3 = -9223372036854775807L;
        }
        this.i = l3;
    }

    public final void d(int n3) {
        this.e = n3 = Math.min(this.e, n3);
    }

    public final void e() {
        long l2;
        long l3;
        boolean bl2;
        this.d = bl2 = true;
        this.g = l3 = gz3.I(this.l.elapsedRealtime());
        OB3 oB3 = this.b;
        oB3.d = bl2;
        oB3.m = 0L;
        oB3.p = l2 = (long)-1;
        oB3.n = l2;
        bl2 = false;
        Object object = oB3.b;
        if (object != null) {
            OB3$b oB3$b = oB3.c;
            oB3$b.getClass();
            oB3$b = oB3$b.b;
            int n3 = 2;
            oB3$b.sendEmptyMessage(n3);
            oB3$b = gz3.k(null);
            DisplayManager displayManager = ((OB3$a)object).a;
            displayManager.registerDisplayListener((DisplayManager.DisplayListener)object, (Handler)oB3$b);
            oB3$b = displayManager.getDisplay(0);
            object = ((OB3$a)object).b;
            OB3.a((OB3)object, (Display)oB3$b);
        }
        oB3.d(false);
    }

    public final void f() {
        long l2;
        this.d = false;
        this.i = l2 = -9223372036854775807L;
        OB3 oB3 = this.b;
        oB3.d = false;
        Object object = oB3.b;
        if (object != null) {
            DisplayManager displayManager = ((OB3$a)object).a;
            displayManager.unregisterDisplayListener((DisplayManager.DisplayListener)object);
            object = oB3.c;
            object.getClass();
            object = ((OB3$b)object).b;
            int n3 = 3;
            object.sendEmptyMessage(n3);
        }
        oB3.b();
    }

    public final void g(float f5) {
        OB3 oB3 = this.b;
        oB3.f = f5;
        pO0 pO02 = oB3.a;
        pO02.a.c();
        pO02.b.c();
        pO02.c = false;
        pO02.d = -9223372036854775807L;
        pO02.e = 0;
        oB3.c();
    }

    public final void h(Surface surface) {
        OB3 oB3 = this.b;
        Surface surface2 = oB3.e;
        boolean bl2 = true;
        if (surface2 != surface) {
            oB3.b();
            oB3.e = surface;
            oB3.d(bl2);
        }
        this.d((int)(bl2 ? 1 : 0));
    }

    public final void i(float f5) {
        long l2;
        float f6 = 0.0f;
        OB3 oB3 = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
            oB3 = null;
        }
        ct3.a((boolean)object);
        f6 = this.k;
        object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object == false) {
            return;
        }
        this.k = f5;
        oB3 = this.b;
        oB3.i = f5;
        oB3.m = 0L;
        oB3.p = l2 = (long)-1;
        oB3.n = l2;
        oB3.d(false);
    }
}

