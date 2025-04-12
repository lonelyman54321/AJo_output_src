/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fj
 */
public final class fj_2 {
    public static final int a(List list) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        int n7 = 0;
        if (n3 >= n4) {
            return 0;
        }
        n3 = xx_2.h(list);
        for (n4 = 1; n4 < n3; ++n4) {
            OX oX = (OX)list.get(n4);
            long l2 = oX.a;
            float f5 = OX.d(l2);
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (object != false) continue;
            ++n7;
        }
        return n7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final int[] b(int var0, List var1_1) {
        var2_2 = Build.VERSION.SDK_INT;
        var3_3 = 26;
        if (var2_2 >= var3_3) {
            var0 = var1_1.size();
            var5_5 = new int[var0];
            for (var4_4 = 0; var4_4 < var0; ++var4_4) {
                var6_6 = (OX)var1_1.get(var4_4);
                var7_7 = var6_6.a;
                var5_5[var4_4] = var3_3 = zx_0.i(var7_7);
            }
            return var5_5;
        }
        var9_8 = new int[var1_1.size() + var0];
        var2_2 = xx_2.h(var1_1);
        var3_3 = var1_1.size();
        var10_9 = 0;
        while (var4_4 < var3_3) {
            var11_10 = (OX)var1_1.get(var4_4);
            var12_11 = var11_10.a;
            var14_12 = OX.d(var12_11);
            cfr_temp_0 = var14_12 - 0.0f;
            var15_13 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var15_13 /* !! */  == false) {
                if (var4_4 == 0) {
                    var16_14 = var10_9 + 1;
                    var17_15 = (OX)var1_1.get(1);
                    var18_16 = OX.b(var17_15.a, 0.0f);
                    var9_8[var10_9] = var20_17 = zx_0.i(var18_16);
lbl28:
                    // 2 sources

                    while (true) {
                        var10_9 = var16_14;
                        break;
                    }
                } else {
                    if (var4_4 == var2_2) {
                        var16_14 = var10_9 + 1;
                        var20_17 = var4_4 + -1;
                        var17_15 = (OX)var1_1.get(var20_17);
                        var18_16 = OX.b(var17_15.a, 0.0f);
                        var9_8[var10_9] = var20_17 = zx_0.i(var18_16);
                        ** continue;
                    }
                    var16_14 = var4_4 + -1;
                    var12_11 = ((OX)var1_1.get((int)var16_14)).a;
                    var15_13 /* !! */  = var10_9 + 1;
                    var9_8[var10_9] = var16_14 = zx_0.i(OX.b(var12_11, 0.0f));
                    var16_14 = var4_4 + 1;
                    var11_10 = (OX)var1_1.get(var16_14);
                    var12_11 = var11_10.a;
                    var10_9 += 2;
                    var12_11 = OX.b(var12_11, 0.0f);
                    var9_8[var15_13 /* !! */ ] = var16_14 = zx_0.i(var12_11);
                }
            } else {
                var15_13 /* !! */  = var10_9 + 1;
                var9_8[var10_9] = var16_14 = zx_0.i(var12_11);
                var10_9 = (int)var15_13 /* !! */ ;
            }
            ++var4_4;
        }
        return var9_8;
    }

    public static final float[] c(List object, List object2, int n3) {
        float f5;
        int n4;
        float f6;
        Number number;
        if (n3 == 0) {
            if (object != null) {
                boolean bl2;
                object = (Collection)object;
                Intrinsics.checkNotNullParameter(object, "<this>");
                int n7 = object.size();
                object2 = new float[n7];
                object = object.iterator();
                n3 = 0;
                Object var4_6 = null;
                while (bl2 = object.hasNext()) {
                    Number number2 = (Number)object.next();
                    float f7 = number2.floatValue();
                    int n8 = n3 + 1;
                    object2[n3] = f7;
                    n3 = n8;
                }
            } else {
                boolean bl3 = false;
                object2 = null;
            }
            return object2;
        }
        float[] fArray = new float[object2.size() + n3];
        boolean bl4 = false;
        float f8 = 0.0f;
        Object var6_11 = null;
        int n10 = 0;
        if (object != null) {
            number = (Number)object.get(0);
            f6 = number.floatValue();
        } else {
            n4 = 0;
            f6 = 0.0f;
            number = null;
        }
        fArray[0] = f6;
        n10 = xx_2.h((List)object2);
        f6 = Float.MIN_VALUE;
        int n14 = 1;
        for (n4 = 1; n4 < n10; ++n4) {
            int n15;
            float f11;
            OX oX = (OX)object2.get(n4);
            long l2 = oX.a;
            if (object != null) {
                Number number3 = (Number)object.get(n4);
                f11 = number3.floatValue();
            } else {
                f11 = n4;
                n15 = xx_2.h((List)object2);
                float f12 = n15;
                f11 /= f12;
            }
            n15 = n14 + 1;
            fArray[n14] = f11;
            float f14 = OX.d(l2);
            float f15 = f14 - 0.0f;
            float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (f16 == false) {
                n14 += 2;
                fArray[n15] = f11;
                continue;
            }
            n14 = n15;
        }
        if (object != null) {
            int n16 = xx_2.h((List)object2);
            object = (Number)object.get(n16);
            f5 = ((Number)object).floatValue();
        } else {
            f5 = 1.0f;
        }
        fArray[n14] = f5;
        return fArray;
    }

    public static final void d(List object, List list) {
        block7: {
            block6: {
                int n3;
                block5: {
                    int n4;
                    if (list != null) break block5;
                    int n7 = object.size();
                    if (n7 < (n4 = 2)) {
                        object = new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
                        throw object;
                    }
                    break block6;
                }
                int n8 = object.size();
                if (n8 != (n3 = list.size())) break block7;
            }
            return;
        }
        object = new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        throw object;
    }
}

