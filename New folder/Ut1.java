/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class Ut1 {
    public static void a(lf3_0 object, int n3, n60_0 n60_02) {
        long l2 = object.c(n3);
        List list = object.b(l2);
        int n4 = list.isEmpty();
        if (n4 != 0) {
            return;
        }
        n4 = object.d() + -1;
        if (n3 != n4) {
            n4 = n3 + 1;
            long l3 = object.c(n4);
            long l4 = object.c(n3);
            long l7 = (l3 -= l4) - (l4 = 0L);
            n4 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n4 > 0) {
                object = new We0(list, l2, l3);
                n60_02.accept(object);
            }
            return;
        }
        object = new IllegalStateException();
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void b(lf3_0 var0, Vf3$b var1_1, n60_0 var2_2) {
        var3_3 = var1_1.a;
        var5_4 = -9223372036854775807L;
        var7_5 = 0;
        var8_6 /* !! */  = (long)(var3_3 == var5_4 ? 0 : (var3_3 < var5_4 ? -1 : 1));
        if (var8_6 /* !! */  == false) {
            var8_6 /* !! */  = 0;
        } else {
            var8_6 /* !! */  = var0.a(var3_3);
            if (var8_6 /* !! */  == (var9_7 = -1)) {
                var8_6 /* !! */  = var0.d();
            }
            if (var8_6 /* !! */  > 0 && (var12_9 = (cfr_temp_0 = (var10_8 = var0.c(var9_7 = (int)(var8_6 /* !! */  + -1))) - var3_3) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                var8_6 /* !! */  += -1;
            }
        }
        var9_7 = (int)(var3_3 == var5_4 ? 0 : (var3_3 < var5_4 ? -1 : 1));
        if (var9_7 == 0 || var8_6 /* !! */  >= (var13_10 = var0.d())) ** GOTO lbl-1000
        var14_11 = var0.b(var3_3);
        var5_4 = var0.c((int)var8_6 /* !! */ );
        var9_7 = (int)var14_11.isEmpty();
        if (var9_7 == 0 && (var9_7 = (int)((cfr_temp_1 = (var15_12 = var1_1.a) - var5_4) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
            var18_14 = var5_4 - var15_12;
            var17_13 = new We0(var14_11, var15_12, var18_14);
            var2_2.accept(var17_13);
            var13_10 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var13_10 = 0;
        }
        for (var20_15 = var8_6 /* !! */ ; var20_15 < (var9_7 = var0.d()); ++var20_15) {
            Ut1.a(var0, (int)var20_15, var2_2);
        }
        var21_16 = var1_1.b;
        if (var21_16) {
            if (var13_10 != 0) {
                var8_6 /* !! */  += -1;
            }
            while (var7_5 < var8_6 /* !! */ ) {
                Ut1.a(var0, var7_5, var2_2);
                ++var7_5;
            }
            if (var13_10 != 0) {
                var14_11 = var0.b(var3_3);
                var15_12 = var0.c((int)var8_6 /* !! */ );
                var5_4 = var0.c((int)var8_6 /* !! */ );
                var18_14 = var3_3 - var5_4;
                var1_1 = new We0(var14_11, var15_12, var18_14);
                var2_2.accept(var1_1);
            }
        }
    }
}

