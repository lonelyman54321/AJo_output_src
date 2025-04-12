/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.view.Display
 *  android.view.Surface
 */
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

public final class OB3 {
    public final pO0 a;
    public final OB3$a b;
    public final OB3$b c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /*
     * Enabled aggressive block sorting
     */
    public OB3(Context context) {
        Object object;
        long l2;
        pO0$a pO0$a;
        Object object2;
        ((pO0)object2).a = pO0$a = new pO0$a();
        ((pO0)object2).b = pO0$a = new pO0$a();
        ((pO0)object2).d = l2 = -9223372036854775807L;
        this.a = object2;
        object2 = null;
        object = context != null && (context = (DisplayManager)context.getSystemService((String)(object = "display"))) != null ? new OB3$a(this, (DisplayManager)context) : null;
        this.b = object;
        if (object != null) {
            object2 = OB3$b.e;
        }
        this.c = object2;
        this.k = l2;
        this.l = l2;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(OB3 oB3, Display object) {
        oB3.getClass();
        if (object != null) {
            long l2;
            float f5 = object.getRefreshRate();
            double d2 = f5;
            oB3.k = l2 = (long)(1.0E9 / d2);
            l2 *= (long)80;
            long l3 = 100;
            oB3.l = l2 /= l3;
        } else {
            object = "Unable to query display refresh rate";
            Cx.f((String)object);
            long l4 = -9223372036854775807L;
            double d5 = -4.9E-324;
            oB3.k = l4;
            oB3.l = l4;
        }
    }

    public final void b() {
        int n3;
        Surface surface;
        int n4 = gz3.a;
        int n7 = 30;
        float f5 = 4.2E-44f;
        if (n4 >= n7 && (surface = this.e) != null && (n7 = this.j) != (n3 = -1 << -1)) {
            f5 = this.h;
            n3 = 0;
            float f6 = f5 - 0.0f;
            n7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (n7 != 0) {
                this.h = 0.0f;
                n7 = 0;
                f5 = 0.0f;
                String string2 = null;
                try {
                    NB3.a(surface, 0.0f, 0);
                }
                catch (IllegalStateException illegalStateException) {
                    string2 = "Failed to call Surface.setFrameRate";
                    Cx.d(string2, illegalStateException);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c() {
        block13: {
            block15: {
                block14: {
                    var1_1 = gz3.a;
                    var2_2 = 30;
                    var3_3 = 4.2E-44f;
                    if (var1_1 < var2_2 || (var4_4 /* !! */  = this.e) == null) break block13;
                    var4_4 /* !! */  = this.a;
                    var5_5 = var4_4 /* !! */ .a;
                    var6_6 = var5_5.a();
                    var7_7 = -1082130432;
                    var8_8 = -1.0f;
                    if (var6_6 != 0) {
                        var5_5 = var4_4 /* !! */ .a;
                        var6_6 = var5_5.a();
                        if (var6_6 != 0) {
                            var5_5 = var4_4 /* !! */ .a;
                            var9_9 = var5_5.e;
                            var11_10 = 0L;
                            var13_11 = 0.0;
                            var15_12 = var9_9 == var11_10 ? 0 : (var9_9 < var11_10 ? -1 : 1);
                            if (var15_12 != false) {
                                var11_10 = var5_5.f / var9_9;
                            }
                            var16_13 = var11_10;
                            var11_10 = 4741671816366391296L;
                            var13_11 = 1.0E9 / var16_13;
                            var18_14 = (float)var13_11;
                        } else {
                            var6_6 = -1082130432;
                            var18_14 = -1.0f;
                        }
                    } else {
                        var18_14 = this.f;
                    }
                    var19_15 = this.g;
                    var20_16 = var18_14 == var19_15 ? 0 : (var18_14 > var19_15 ? 1 : -1);
                    if (var20_16 == false) {
                        return;
                    }
                    var20_16 = var18_14 == var8_8 ? 0 : (var18_14 > var8_8 ? 1 : -1);
                    if (var20_16 == false || (var7_7 = (int)(var19_15 == var8_8 ? 0 : (var19_15 > var8_8 ? 1 : -1))) == 0) break block14;
                    var21_17 = var4_4 /* !! */ .a;
                    var2_2 = (int)var21_17.a();
                    if (var2_2 == 0) ** GOTO lbl-1000
                    var21_17 = var4_4 /* !! */ .a;
                    var2_2 = (int)var21_17.a();
                    if (var2_2 != 0) {
                        var4_4 /* !! */  = var4_4 /* !! */ .a;
                        var22_18 = var4_4 /* !! */ .f;
                    } else {
                        var22_18 = -9223372036854775807L;
                    }
                    var24_19 = 5000000000L;
                    var20_16 = var22_18 == var24_19 ? 0 : (var22_18 < var24_19 ? -1 : 1);
                    if (var20_16 >= 0) {
                        var1_1 = 1017370378;
                        var26_20 = 0.02f;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 = 1065353216;
                        var26_20 = 1.0f;
                    }
                    var3_3 = this.g;
                    var3_3 = Math.abs(var18_14 - var3_3);
                    var1_1 = var3_3 == var26_20 ? 0 : (var3_3 > var26_20 ? 1 : -1);
                    if (var1_1 < 0) break block13;
                    break block15;
                }
                if (var20_16 == false && (var1_1 = var4_4 /* !! */ .e) < var2_2) break block13;
            }
            this.g = var18_14;
            var1_1 = 0;
            var26_20 = 0.0f;
            var4_4 /* !! */  = null;
            this.d(false);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void d(boolean bl2) {
        int n3;
        Object object;
        int n4 = gz3.a;
        int n7 = 30;
        float f5 = 4.2E-44f;
        if (n4 >= n7 && (object = this.e) != null && (n7 = this.j) != (n3 = -1 << -1)) {
            float f6;
            float f7;
            float f8;
            float f11;
            float f12;
            float f14;
            n7 = this.d ? 1 : 0;
            n3 = 0;
            if (n7 != 0 && (f14 = (f12 = (f5 = this.g) - (f11 = -1.0f)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) != false) {
                f11 = this.i;
                f5 *= f11;
            } else {
                n7 = 0;
                f5 = 0.0f;
            }
            if (!bl2 && (f8 = (f7 = (f6 = this.h) - f5) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false) {
                return;
            }
            this.h = f5;
            float f15 = f5 - 0.0f;
            float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (f16 == false) {
                boolean bl3 = false;
                f6 = 0.0f;
                Object var10_15 = null;
            } else {
                boolean bl4 = true;
                f6 = Float.MIN_VALUE;
            }
            try {
                void var1_6;
                NB3.a(object, f5, (int)var1_6);
            }
            catch (IllegalStateException illegalStateException) {
                object = "Failed to call Surface.setFrameRate";
                Cx.d((String)object, illegalStateException);
            }
        }
    }
}

