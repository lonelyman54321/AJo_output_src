/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wh
 */
public final class wh_0
implements Pg2 {
    public e72 a;
    public final lx0 b;
    public final ParcelableSnapshotMutableState c;
    public final boolean d;
    public boolean e;
    public long f;
    public Yv2 g;
    public final LP1 h;

    public wh_0(Context object, Ng2 object2) {
        long l2;
        lx0 lx02;
        int n3 = zx_0.i(((Ng2)object2).a);
        this.b = lx02 = new lx0((Context)object, n3);
        object = Unit.a;
        J83.h();
        Object object3 = wv1_0.b;
        this.c = object3 = J83.f(object, (I83)object3);
        this.d = true;
        this.f = l2 = 0L;
        object3 = new wh$a(this, null);
        int n4 = 6;
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(object, null, (Function2)object3, n4);
        int n7 = Build.VERSION.SDK_INT;
        n3 = 31;
        if (n7 >= n3) {
            object2 = ji1.a;
            super(this, lx02, (Function1)object2);
        } else {
            object3 = ji1.a;
            super(this, lx02, (Ng2)object2, (Function1)object3);
        }
        object = kp1_0.a(suspendPointerInputElement, (LP1)object);
        this.h = object;
    }

    public final boolean a() {
        int n3;
        float f5;
        int n4;
        lx0 lx02 = this.b;
        EdgeEffect edgeEffect = lx02.d;
        boolean bl2 = true;
        bm_0 bm_02 = bm_0.a;
        int n7 = 31;
        if (edgeEffect != null) {
            float f6;
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n7) {
                f5 = bm_02.b(edgeEffect);
            } else {
                n3 = 0;
                f5 = 0.0f;
                edgeEffect = null;
            }
            n3 = (f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (n3 != 0) {
                return bl2;
            }
        }
        if ((edgeEffect = lx02.e) != null) {
            float f7;
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n7) {
                f5 = bm_02.b(edgeEffect);
            } else {
                n3 = 0;
                f5 = 0.0f;
                edgeEffect = null;
            }
            n3 = (int)((f7 = f5 - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
            if (n3 != 0) {
                return bl2;
            }
        }
        if ((edgeEffect = lx02.f) != null) {
            float f8;
            n4 = Build.VERSION.SDK_INT;
            if (n4 >= n7) {
                f5 = bm_02.b(edgeEffect);
            } else {
                n3 = 0;
                f5 = 0.0f;
                edgeEffect = null;
            }
            n3 = (int)((f8 = f5 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
            if (n3 != 0) {
                return bl2;
            }
        }
        if ((lx02 = lx02.g) != null) {
            float f11;
            boolean bl3;
            float f12;
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n7) {
                f12 = bm_02.b((EdgeEffect)lx02);
            } else {
                bl3 = false;
                f12 = 0.0f;
                lx02 = null;
            }
            bl3 = (f11 = f12 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (bl3) {
                return bl2;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(long var1_1, lu2_2 var3_2, f80_0 var4_3) {
        block48: {
            block50: {
                block49: {
                    block45: {
                        block46: {
                            block47: {
                                var5_4 = var4_3 instanceof vh_0;
                                if (var5_4 == 0) ** GOTO lbl-1000
                                var6_5 = var4_3;
                                var6_5 = (vh_0)var4_3;
                                var7_6 = var6_5.e;
                                var8_7 = -1 << -1;
                                var9_8 = -0.0f;
                                var10_9 = var7_6 & var8_7;
                                if (var10_9 != 0) {
                                    var6_5.e = var7_6 -= var8_7;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var6_5 = new vh_0(this, (f80_0)var4_3);
                                }
                                var4_3 = var6_5.c;
                                var11_10 = j90_0.COROUTINE_SUSPENDED;
                                var8_7 = var6_5.e;
                                var12_11 = 0L;
                                var14_12 = 2;
                                var15_13 = 1;
                                var16_14 = 1.4E-45f;
                                var17_15 = 31;
                                if (var8_7 == 0) break block45;
                                if (var8_7 == var15_13) break block46;
                                if (var8_7 != var14_12) break block47;
                                var1_1 = var6_5.b;
                                var3_2 = var6_5.a;
                                vl2_2.b(var4_3);
                                break block48;
                            }
                            var18_16 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var18_16;
                        }
                        vl2_2.b(var4_3);
                        break block49;
                    }
                    vl2_2.b(var4_3);
                    var19_18 = this.f;
                    var21_19 /* !! */  = C63.e(var19_18);
                    if (var21_19 /* !! */  != 0) {
                        var6_5.e = var15_13;
                        var3_2.getClass();
                        var3_2 = var3_2.d;
                        var4_3 = new lu2_2((ku2_0)var3_2, (f80_0)var6_5);
                        var4_3.c = var1_1;
                        var18_17 = Unit.a;
                        var18_17 = var4_3.invokeSuspend(var18_17);
                        if (var18_17 == var11_10) {
                            return var11_10;
                        } else {
                            ** GOTO lbl50
                        }
                    }
                    break block50;
                }
                return Unit.a;
            }
            var22_20 = WA3.b(var1_1);
            var23_21 = this.b;
            cfr_temp_0 = var22_20 - 0.0f;
            var21_19 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var21_19 /* !! */  > 0 && (var21_19 /* !! */  = (int)lx0.g((EdgeEffect)(var4_3 = var23_21.f))) != 0) {
                var4_3 = var23_21.c();
                var16_14 = WA3.b(var1_1);
                var15_13 = ok1_1.b(var16_14);
                var24_22 = Build.VERSION.SDK_INT;
                if (var24_22 >= var17_15) {
                    var4_3.onAbsorb(var15_13);
                } else {
                    var24_22 = (int)var4_3.isFinished();
                    if (var24_22 != 0) {
                        var4_3.onAbsorb(var15_13);
                    }
                }
                var22_20 = WA3.b(var1_1);
            } else {
                var22_20 = WA3.b(var1_1);
                cfr_temp_1 = var22_20 - 0.0f;
                var21_19 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                if (var21_19 /* !! */  < 0 && (var21_19 /* !! */  = (int)lx0.g((EdgeEffect)(var4_3 = var23_21.g))) != 0) {
                    var4_3 = var23_21.d();
                    var16_14 = WA3.b(var1_1);
                    var15_13 = -ok1_1.b(var16_14);
                    var24_22 = Build.VERSION.SDK_INT;
                    if (var24_22 >= var17_15) {
                        var4_3.onAbsorb(var15_13);
                    } else {
                        var24_22 = (int)var4_3.isFinished();
                        if (var24_22 != 0) {
                            var4_3.onAbsorb(var15_13);
                        }
                    }
                    var22_20 = WA3.b(var1_1);
                } else {
                    var21_19 /* !! */  = 0;
                    var22_20 = 0.0f;
                    var4_3 = null;
                }
            }
            var16_14 = WA3.c(var1_1);
            cfr_temp_2 = var16_14 - 0.0f;
            var15_13 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
            if (var15_13 > 0 && (var15_13 = (int)lx0.g(var25_23 = var23_21.d)) != 0) {
                var23_21 = var23_21.e();
                var16_14 = WA3.c(var1_1);
                var15_13 = ok1_1.b(var16_14);
                var24_22 = Build.VERSION.SDK_INT;
                if (var24_22 >= var17_15) {
                    var23_21.onAbsorb(var15_13);
                } else {
                    var24_22 = (int)var23_21.isFinished();
                    if (var24_22 != 0) {
                        var23_21.onAbsorb(var15_13);
                    }
                }
                var9_8 = WA3.c(var1_1);
            } else {
                var16_14 = WA3.c(var1_1);
                cfr_temp_3 = var16_14 - 0.0f;
                var15_13 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                if (var15_13 < 0 && (var15_13 = (int)lx0.g(var25_23 = var23_21.e)) != 0) {
                    var23_21 = var23_21.b();
                    var16_14 = WA3.c(var1_1);
                    var15_13 = -ok1_1.b(var16_14);
                    var24_22 = Build.VERSION.SDK_INT;
                    if (var24_22 >= var17_15) {
                        var23_21.onAbsorb(var15_13);
                    } else {
                        var24_22 = (int)var23_21.isFinished();
                        if (var24_22 != 0) {
                            var23_21.onAbsorb(var15_13);
                        }
                    }
                    var9_8 = WA3.c(var1_1);
                } else {
                    var8_7 = 0;
                    var9_8 = 0.0f;
                    var23_21 = null;
                }
            }
            var19_18 = XA3.a(var22_20, var9_8);
            var21_19 /* !! */  = (int)(var19_18 == var12_11 ? 0 : (var19_18 < var12_11 ? -1 : 1));
            if (var21_19 /* !! */  != 0) {
                this.g();
            }
            var1_1 = WA3.d(var1_1, var19_18);
            var6_5.a = this;
            var6_5.b = var1_1;
            var6_5.e = var14_12;
            var3_2.getClass();
            var3_2 = var3_2.d;
            var4_3 = new lu2_2((ku2_0)var3_2, (f80_0)var6_5);
            var4_3.c = var1_1;
            var3_2 = Unit.a;
            var4_3 = var4_3.invokeSuspend(var3_2);
            if (var4_3 == var11_10) {
                return var11_10;
            }
            var3_2 = this;
        }
        var26_24 = ((WA3)var4_3).a;
        var1_1 = WA3.d(var1_1, var26_24);
        var4_3 = null;
        var3_2.e = false;
        var22_20 = WA3.b(var1_1);
        var6_5 = var3_2.b;
        cfr_temp_4 = var22_20 - 0.0f;
        var21_19 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
        if (var21_19 /* !! */  > 0) {
            var4_3 = var6_5.c();
            var28_25 = WA3.b(var1_1);
            var7_6 = ok1_1.b(var28_25);
            var8_7 = Build.VERSION.SDK_INT;
            if (var8_7 >= var17_15) {
                var4_3.onAbsorb(var7_6);
            } else {
                var8_7 = (int)var4_3.isFinished();
                if (var8_7 != 0) {
                    var4_3.onAbsorb(var7_6);
                }
            }
        } else {
            var22_20 = WA3.b(var1_1);
            cfr_temp_5 = var22_20 - 0.0f;
            var21_19 /* !! */  = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
            if (var21_19 /* !! */  < 0) {
                var4_3 = var6_5.d();
                var28_26 = WA3.b(var1_1);
                var7_6 = -ok1_1.b(var28_26);
                var8_7 = Build.VERSION.SDK_INT;
                if (var8_7 >= var17_15) {
                    var4_3.onAbsorb(var7_6);
                } else {
                    var8_7 = (int)var4_3.isFinished();
                    if (var8_7 != 0) {
                        var4_3.onAbsorb(var7_6);
                    }
                }
            }
        }
        var22_20 = WA3.c(var1_1);
        cfr_temp_6 = var22_20 - 0.0f;
        var21_19 /* !! */  = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
        if (var21_19 /* !! */  > 0) {
            var4_3 = var6_5.e();
            var29_27 = WA3.c(var1_1);
            var5_4 = ok1_1.b(var29_27);
            var7_6 = Build.VERSION.SDK_INT;
            if (var7_6 >= var17_15) {
                var4_3.onAbsorb(var5_4);
            } else {
                var7_6 = (int)var4_3.isFinished();
                if (var7_6 != 0) {
                    var4_3.onAbsorb(var5_4);
                }
            }
        } else {
            var22_20 = WA3.c(var1_1);
            cfr_temp_7 = var22_20 - 0.0f;
            var21_19 /* !! */  = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1));
            if (var21_19 /* !! */  < 0) {
                var4_3 = var6_5.b();
                var29_28 = WA3.c(var1_1);
                var5_4 = -ok1_1.b(var29_28);
                var7_6 = Build.VERSION.SDK_INT;
                if (var7_6 >= var17_15) {
                    var4_3.onAbsorb(var5_4);
                } else {
                    var7_6 = (int)var4_3.isFinished();
                    if (var7_6 != 0) {
                        var4_3.onAbsorb(var5_4);
                    }
                }
            }
        }
        var21_19 /* !! */  = (int)(var1_1 == var12_11 ? 0 : (var1_1 < var12_11 ? -1 : 1));
        if (var21_19 /* !! */  != 0) {
            var3_2.g();
        }
        var3_2.e();
        return Unit.a;
    }

    public final LP1 c() {
        return this.h;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long d(long var1_1, int var3_2, kU2$d var4_3) {
        var5_4 = this;
        var6_5 = var1_1;
        var8_6 = var4_3;
        var9_7 = this.f;
        var11_8 /* !! */  = C63.e(var9_7);
        if (var11_8 /* !! */ ) {
            var4_3.getClass();
            var8_6 = var4_3.c;
            var12_9 = var8_6.h;
            var13_11 = var8_6.g;
            var6_5 = ku2_0.a((ku2_0)var8_6, var12_9, var1_1, var13_11);
            var8_6 = new e72(var6_5);
            return var8_6.a;
        }
        var11_8 /* !! */  = this.e;
        var13_12 = 1;
        var14_13 = 0L;
        var16_14 = this.b;
        if (!var11_8 /* !! */ ) {
            var12_10 /* !! */  = var16_14.f;
            var11_8 /* !! */  = lx0.g(var12_10 /* !! */ );
            if (var11_8 /* !! */ ) {
                this.i(var14_13);
            }
            if (var11_8 /* !! */  = lx0.g(var12_10 /* !! */  = var16_14.g)) {
                var5_4.j(var14_13);
            }
            if (var11_8 /* !! */  = lx0.g(var12_10 /* !! */  = var16_14.d)) {
                var5_4.k(var14_13);
            }
            if (var11_8 /* !! */  = lx0.g(var12_10 /* !! */  = var16_14.e)) {
                var5_4.h(var14_13);
            }
            var5_4.e = var13_12;
        }
        var17_15 = e72.e(var1_1);
        var18_16 = 0;
        var19_17 = null;
        cfr_temp_0 = var17_15 - 0.0f;
        var11_8 /* !! */  = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        if (!var11_8 /* !! */ ) {
            while (true) {
                var11_8 /* !! */  = false;
                var17_15 = 0.0f;
                var12_10 /* !! */  = null;
                break;
            }
        } else {
            var12_10 /* !! */  = var16_14.d;
            var11_8 /* !! */  = lx0.g(var12_10 /* !! */ );
            if (var11_8 /* !! */ ) {
                var17_15 = this.k(var1_1);
                var20_18 = var16_14.d;
                var21_19 = (float)lx0.g(var20_18);
                if (var21_19 == false) {
                    var20_18 = var16_14.e();
                    var20_18.onRelease();
                }
            } else {
                if (!(var11_8 /* !! */  = lx0.g(var12_10 /* !! */  = var16_14.e))) ** continue;
                var17_15 = this.h(var1_1);
                var20_18 = var16_14.e;
                var21_19 = (float)lx0.g(var20_18);
                if (var21_19 == false) {
                    var20_18 = var16_14.b();
                    var20_18.onRelease();
                }
            }
        }
        var22_20 = e72.d(var1_1);
        cfr_temp_1 = var22_20 - 0.0f;
        var21_19 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
        if (var21_19 == false) {
            while (true) {
                var21_19 = (float)false;
                var22_20 = 0.0f;
                var20_18 = null;
                break;
            }
        } else {
            var20_18 = var16_14.f;
            var21_19 = (float)lx0.g(var20_18);
            if (var21_19 != false) {
                var22_20 = this.i(var1_1);
                var23_21 = var16_14.f;
                var24_23 = lx0.g(var23_21);
                if (!var24_23) {
                    var23_21 = var16_14.c();
                    var23_21.onRelease();
                }
            } else {
                if ((var21_19 = (float)lx0.g(var20_18 = var16_14.g)) == false) ** continue;
                var22_20 = this.j(var1_1);
                var23_22 = var16_14.g;
                var24_24 = lx0.g(var23_22);
                if (!var24_24) {
                    var23_22 = var16_14.d();
                    var23_22.onRelease();
                }
            }
        }
        var25_25 = h72.a(var22_20, var17_15);
        var11_8 /* !! */  = e72.b(var25_25, var14_13);
        if (!var11_8 /* !! */ ) {
            this.g();
        }
        var14_13 = e72.h(var6_5, var25_25);
        var4_3.getClass();
        var8_6 = var8_6.c;
        var12_10 /* !! */  = var8_6.h;
        var27_26 = var8_6.g;
        var28_27 = ku2_0.a((ku2_0)var8_6, (QT2)var12_10 /* !! */ , var14_13, var27_26);
        var30_28 = new e72(var28_27);
        var28_27 = var30_28.a;
        var14_13 = e72.h(var14_13, var28_27);
        var27_26 = 0;
        var30_28 = null;
        var31_29 = var3_2;
        if (var3_2 == var13_12) {
            var31_29 = 1;
            var32_30 = 1.4E-45f;
        } else {
            var31_29 = 0;
            var32_30 = 0.0f;
            var33_31 = null;
        }
        if (var31_29 == 0) ** GOTO lbl-1000
        var32_30 = e72.d(var14_13);
        var34_32 = -1090519040;
        var35_33 = -0.5f;
        var36_34 = 0x3F000000;
        var37_35 = 0.5f;
        cfr_temp_2 = var32_30 - var37_35;
        var31_29 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
        if (var31_29 > 0) {
            var5_4.i(var14_13);
lbl124:
            // 2 sources

            while (true) {
                var31_29 = 1;
                var32_30 = 1.4E-45f;
                break;
            }
        } else {
            var32_30 = e72.d(var14_13);
            cfr_temp_3 = var32_30 - var35_33;
            var31_29 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
            if (var31_29 < 0) {
                var5_4.j(var14_13);
                ** continue;
            }
            var31_29 = 0;
            var32_30 = 0.0f;
            var33_31 = null;
        }
        var38_36 = e72.e(var14_13);
        var36_34 = (int)(var38_36 == var37_35 ? 0 : (var38_36 > var37_35 ? 1 : -1));
        if (var36_34 > 0) {
            var5_4.k(var14_13);
lbl143:
            // 2 sources

            while (true) {
                var39_37 = true;
                break;
            }
        } else {
            var37_35 = e72.e(var14_13);
            cfr_temp_4 = var37_35 - var35_33;
            var34_32 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
            if (var34_32 < 0) {
                var5_4.h(var14_13);
                ** continue;
            }
            var39_37 = false;
        }
        if (var31_29 != 0 || var39_37) {
            var39_37 = true;
        } else lbl-1000:
        // 2 sources

        {
            var39_37 = false;
        }
        var40_38 = var16_14.f;
        var41_39 = lx0.f(var40_38);
        if (var41_39 != 0 && (var41_39 = (cfr_temp_5 = (var42_40 = e72.d(var1_1)) - 0.0f) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1)) < 0) {
            var40_38 = var16_14.c();
            var32_30 = e72.d(var1_1);
            var34_32 = var40_38 instanceof j01;
            if (var34_32 != 0) {
                var40_38 = (j01)var40_38;
                var40_38.b = var35_33 = var40_38.b + var32_30;
                var32_30 = Math.abs(var35_33);
                cfr_temp_6 = var32_30 - (var35_33 = var40_38.a);
                var31_29 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                if (var31_29 > 0) {
                    var40_38.onRelease();
                }
            } else {
                var40_38.onRelease();
            }
            var40_38 = var16_14.f;
            var41_39 = lx0.f(var40_38) ^ var13_12;
        } else {
            var41_39 = 0;
            var42_40 = 0.0f;
            var40_38 = null;
        }
        var33_31 = var16_14.g;
        var31_29 = (int)lx0.f(var33_31);
        if (var31_29 != 0 && (var31_29 = (int)((cfr_temp_7 = (var32_30 = e72.d(var1_1)) - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1))) > 0) {
            var33_31 = var16_14.d();
            var35_33 = e72.d(var1_1);
            var36_34 = var33_31 instanceof j01;
            if (var36_34 != 0) {
                var33_31 = (j01)var33_31;
                var33_31.b = var37_35 = var33_31.b + var35_33;
                var35_33 = Math.abs(var37_35);
                cfr_temp_8 = var35_33 - (var37_35 = var33_31.a);
                var34_32 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
                if (var34_32 > 0) {
                    var33_31.onRelease();
                }
            } else {
                var33_31.onRelease();
            }
            if (var41_39 == 0 && (var41_39 = (int)lx0.f(var40_38 = var16_14.g)) != 0) {
                var41_39 = 0;
                var42_40 = 0.0f;
                var40_38 = null;
            } else {
                var41_39 = 1;
                var42_40 = 1.4E-45f;
            }
        }
        if ((var31_29 = (int)lx0.f(var33_31 = var16_14.d)) != 0 && (var31_29 = (int)((cfr_temp_9 = (var32_30 = e72.e(var1_1)) - 0.0f) == 0.0f ? 0 : (cfr_temp_9 < 0.0f ? -1 : 1))) < 0) {
            var33_31 = var16_14.e();
            var35_33 = e72.e(var1_1);
            var36_34 = var33_31 instanceof j01;
            if (var36_34 != 0) {
                var33_31 = (j01)var33_31;
                var33_31.b = var37_35 = var33_31.b + var35_33;
                var35_33 = Math.abs(var37_35);
                cfr_temp_10 = var35_33 - (var37_35 = var33_31.a);
                var34_32 = (int)(cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1));
                if (var34_32 > 0) {
                    var33_31.onRelease();
                }
            } else {
                var33_31.onRelease();
            }
            if (var41_39 == 0 && (var41_39 = (int)lx0.f(var40_38 = var16_14.d)) != 0) {
                var41_39 = 0;
                var42_40 = 0.0f;
                var40_38 = null;
            } else {
                var41_39 = 1;
                var42_40 = 1.4E-45f;
            }
        }
        if ((var31_29 = (int)lx0.f(var33_31 = var16_14.e)) != 0 && (var18_16 = (cfr_temp_11 = (var32_30 = e72.e(var1_1)) - 0.0f) == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1)) > 0) {
            var19_17 = var16_14.b();
            var43_41 = e72.e(var1_1);
            var44_42 = var19_17 instanceof j01;
            if (var44_42) {
                var19_17 = (j01)var19_17;
                var19_17.b = var45_43 = var19_17.b + var43_41;
                var43_41 = Math.abs(var45_43);
                cfr_temp_12 = var43_41 - (var45_43 = var19_17.a);
                var46_44 /* !! */  = (int)(cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1));
                if (var46_44 /* !! */  > 0) {
                    var19_17.onRelease();
                }
            } else {
                var19_17.onRelease();
            }
            if (var41_39 == 0 && (var46_44 /* !! */  = lx0.f(var47_45 = var16_14.e)) != 0) {
                var41_39 = 0;
                var42_40 = 0.0f;
                var40_38 = null;
            } else {
                var41_39 = 1;
                var42_40 = 1.4E-45f;
            }
        }
        if (var41_39 == 0 && !var39_37) {
            var13_12 = 0;
        }
        if (var13_12 != 0) {
            this.g();
        }
        return e72.i(var25_25, var28_27);
    }

    public final void e() {
        boolean bl2;
        boolean bl3;
        lx0 lx02 = this.b;
        EdgeEffect edgeEffect = lx02.d;
        boolean bl4 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl3 = edgeEffect.isFinished();
        } else {
            bl3 = false;
            edgeEffect = null;
        }
        EdgeEffect edgeEffect2 = lx02.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            bl2 = edgeEffect2.isFinished();
            if (!bl2 && !bl3) {
                bl3 = false;
                edgeEffect = null;
            } else {
                bl3 = true;
            }
        }
        if ((edgeEffect2 = lx02.f) != null) {
            edgeEffect2.onRelease();
            bl2 = edgeEffect2.isFinished();
            if (!bl2 && !bl3) {
                bl3 = false;
                edgeEffect = null;
            } else {
                bl3 = true;
            }
        }
        if ((lx02 = lx02.g) != null) {
            lx02.onRelease();
            boolean bl5 = lx02.isFinished();
            if (bl5 || bl3) {
                bl4 = true;
            }
            bl3 = bl4;
        }
        if (bl3) {
            this.g();
        }
    }

    public final long f() {
        e72 e722 = this.a;
        long l2 = e722 != null ? e722.a : bo1_1.b(this.f);
        float f5 = e72.d(l2);
        float f6 = C63.d(this.f);
        float f7 = e72.e(l2);
        float f8 = C63.b(this.f);
        return h72.a(f5 /= f6, f7 /= f8);
    }

    public final void g() {
        boolean bl2 = this.d;
        if (bl2) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
            Unit unit = Unit.a;
            parcelableSnapshotMutableState.setValue(unit);
        }
    }

    public final float h(long l2) {
        float f5;
        long l3 = this.f();
        float f6 = e72.d(l3);
        float f7 = e72.e(l2);
        long l4 = this.f;
        float f8 = C63.b(l4);
        f7 /= f8;
        EdgeEffect edgeEffect = this.b.b();
        f7 = -f7;
        boolean bl2 = true;
        float f11 = (float)bl2 - f6;
        int n3 = Build.VERSION.SDK_INT;
        bm_0 bm_02 = bm_0.a;
        int n4 = 31;
        if (n3 >= n4) {
            f7 = bm_02.c(edgeEffect, f7, f11);
        } else {
            edgeEffect.onPull(f7, f11);
        }
        f6 = -f7;
        long l7 = this.f;
        f7 = C63.b(l7) * f6;
        n3 = Build.VERSION.SDK_INT;
        bl2 = false;
        f11 = 0.0f;
        if (n3 >= n4) {
            f6 = bm_02.b(edgeEffect);
        } else {
            n3 = 0;
            f6 = 0.0f;
        }
        n3 = (int)((f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1));
        if (n3 != 0) {
            f7 = e72.e(l2);
        }
        return f7;
    }

    public final float i(long l2) {
        float f5;
        long l3 = this.f();
        float f6 = e72.e(l3);
        float f7 = e72.d(l2);
        long l4 = this.f;
        float f8 = C63.d(l4);
        f7 /= f8;
        EdgeEffect edgeEffect = this.b.c();
        boolean bl2 = true;
        float f11 = (float)bl2 - f6;
        int n3 = Build.VERSION.SDK_INT;
        bm_0 bm_02 = bm_0.a;
        int n4 = 31;
        if (n3 >= n4) {
            f7 = bm_02.c(edgeEffect, f7, f11);
        } else {
            edgeEffect.onPull(f7, f11);
        }
        long l7 = this.f;
        f6 = C63.d(l7) * f7;
        int n7 = Build.VERSION.SDK_INT;
        bl2 = false;
        f11 = 0.0f;
        if (n7 >= n4) {
            f7 = bm_02.b(edgeEffect);
        } else {
            n7 = 0;
            f7 = 0.0f;
        }
        n7 = (int)((f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1));
        if (n7 != 0) {
            f6 = e72.d(l2);
        }
        return f6;
    }

    public final float j(long l2) {
        float f5;
        long l3 = this.f();
        float f6 = e72.e(l3);
        float f7 = e72.d(l2);
        long l4 = this.f;
        float f8 = C63.d(l4);
        f7 /= f8;
        EdgeEffect edgeEffect = this.b.d();
        f7 = -f7;
        int n3 = Build.VERSION.SDK_INT;
        bm_0 bm_02 = bm_0.a;
        int n4 = 31;
        if (n3 >= n4) {
            f7 = bm_02.c(edgeEffect, f7, f6);
        } else {
            edgeEffect.onPull(f7, f6);
        }
        f6 = -f7;
        long l7 = this.f;
        f7 = C63.d(l7) * f6;
        int n7 = Build.VERSION.SDK_INT;
        n3 = 0;
        if (n7 >= n4) {
            f6 = bm_02.b(edgeEffect);
        } else {
            n7 = 0;
            f6 = 0.0f;
        }
        n7 = (int)((f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1));
        if (n7 != 0) {
            f7 = e72.d(l2);
        }
        return f7;
    }

    public final float k(long l2) {
        float f5;
        long l3 = this.f();
        float f6 = e72.d(l3);
        float f7 = e72.e(l2);
        long l4 = this.f;
        float f8 = C63.b(l4);
        f7 /= f8;
        EdgeEffect edgeEffect = this.b.e();
        int n3 = Build.VERSION.SDK_INT;
        bm_0 bm_02 = bm_0.a;
        int n4 = 31;
        if (n3 >= n4) {
            f7 = bm_02.c(edgeEffect, f7, f6);
        } else {
            edgeEffect.onPull(f7, f6);
        }
        long l7 = this.f;
        f6 = C63.b(l7) * f7;
        int n7 = Build.VERSION.SDK_INT;
        n3 = 0;
        if (n7 >= n4) {
            f7 = bm_02.b(edgeEffect);
        } else {
            n7 = 0;
            f7 = 0.0f;
        }
        n7 = (int)((f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1));
        if (n7 != 0) {
            f6 = e72.e(l2);
        }
        return f6;
    }

    public final void l(long l2) {
        long l3 = this.f;
        long l4 = 0L;
        boolean bl2 = C63.a(l3, l4);
        long l7 = this.f;
        boolean bl3 = C63.a(l2, l7) ^ true;
        this.f = l2;
        if (bl3) {
            int n3;
            long l8;
            int n4;
            long l12;
            float f5 = C63.d(l2);
            int n7 = ok1_1.b(f5);
            float f6 = C63.b(l2);
            int n8 = ok1_1.b(f6);
            l2 = dj1.a(n7, n8);
            lx0 lx02 = this.b;
            lx02.c = l2;
            EdgeEffect edgeEffect = lx02.d;
            long l14 = 0xFFFFFFFFL;
            int n10 = 32;
            if (edgeEffect != null) {
                l12 = l2 >> n10;
                n4 = (int)l12;
                l8 = l2 & l14;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.e) != null) {
                l12 = l2 >> n10;
                n4 = (int)l12;
                l8 = l2 & l14;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.f) != null) {
                l12 = l2 & l14;
                n4 = (int)l12;
                l8 = l2 >> n10;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.g) != null) {
                l12 = l2 & l14;
                n4 = (int)l12;
                l8 = l2 >> n10;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.h) != null) {
                l12 = l2 >> n10;
                n4 = (int)l12;
                l8 = l2 & l14;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.i) != null) {
                l12 = l2 >> n10;
                n4 = (int)l12;
                l8 = l2 & l14;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((edgeEffect = lx02.j) != null) {
                l12 = l2 & l14;
                n4 = (int)l12;
                l8 = l2 >> n10;
                n3 = (int)l8;
                edgeEffect.setSize(n4, n3);
            }
            if ((lx02 = lx02.k) != null) {
                long l15 = l2 & l14;
                int n14 = (int)l15;
                int n15 = (int)(l2 >>= n10);
                lx02.setSize(n14, n15);
            }
        }
        if (!bl2 && bl3) {
            this.g();
            this.e();
        }
    }
}

