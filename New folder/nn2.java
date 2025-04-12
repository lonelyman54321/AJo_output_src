/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.view.animation.Interpolator
 */
import android.graphics.Path;
import android.graphics.PointF;
import android.view.animation.Interpolator;

public final class nn2
extends Bo1 {
    public Path q;
    public final Bo1 r;

    public nn2(QB1 qB1, Bo1 bo1) {
        Object object;
        Object object2 = object = bo1.b;
        object2 = (PointF)object;
        Object object3 = object = bo1.c;
        object3 = (PointF)object;
        Interpolator interpolator2 = bo1.d;
        Interpolator interpolator3 = bo1.e;
        Interpolator interpolator4 = bo1.f;
        float f5 = bo1.g;
        Float f6 = bo1.h;
        super(qB1, object2, object3, interpolator2, interpolator3, interpolator4, f5, f6);
        this.r = bo1;
        this.d();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d() {
        block4: {
            var1_1 = this.c;
            var2_2 = this.b;
            if (var1_1 == null || var2_2 == null) ** GOTO lbl-1000
            var3_3 = var2_2;
            var3_3 = (PointF)var2_2;
            var4_4 = var1_1;
            var4_4 = (PointF)var1_1;
            var5_5 = var4_4.x;
            var1_1 = (PointF)var1_1;
            var6_6 = var1_1.y;
            var7_7 = var3_3.equals(var5_5, var6_6);
            if (var7_7) {
                var7_7 = true;
                var6_6 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var7_7 = false;
                var6_6 = 0.0f;
                var1_1 = null;
            }
            if (var2_2 == null || (var3_3 = this.c) == null || var7_7) break block4;
            var2_2 = (PointF)var2_2;
            var3_3 = (PointF)var3_3;
            var1_1 = this.r;
            var4_4 = var1_1.o;
            var1_1 = var1_1.p;
            var8_8 = wz3.a;
            var8_8 = new Path();
            var9_9 = var2_2.x;
            var10_10 = var2_2.y;
            var8_8.moveTo(var9_9, var10_10);
            if (var4_4 == null || var1_1 == null) ** GOTO lbl-1000
            var9_9 = var4_4.length();
            var10_10 = 0.0f;
            cfr_temp_0 = var9_9 - 0.0f;
            var11_11 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var11_11 /* !! */  != false || (var11_11 /* !! */  = (cfr_temp_1 = (var9_9 = var1_1.length()) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) != false) {
                var9_9 = var2_2.x;
                var10_10 = var4_4.x + var9_9;
                var12_12 = var2_2.y;
                var5_5 = var4_4.y;
                var13_14 = var12_12 + var5_5;
                var14_15 = var3_3.x;
                var12_12 = var1_1.x;
                var15_16 = var14_15 + var12_12;
                var16_17 = var3_3.y;
                var6_6 = var1_1.y;
                var17_18 = var16_17 + var6_6;
                var8_8.cubicTo(var10_10, var13_14, var15_16, var17_18, var14_15, var16_17);
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = var3_3.x;
                var12_13 = var3_3.y;
                var8_8.lineTo(var6_6, var12_13);
            }
            this.q = var8_8;
        }
    }
}

