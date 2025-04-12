/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tJ3
 */
public final class tj3_0
implements px2_1 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public tj3_0(long l2, int n3, long l3, int n4, long l4, long[] lArray) {
        this.a = l2;
        this.b = n3;
        this.c = l3;
        this.d = n4;
        this.e = l4;
        this.g = lArray;
        long l7 = -1;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 != false) {
            l7 = l2 + l4;
        }
        this.f = l7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final dX2$a d(long var1_1) {
        var3_2 = this;
        var4_3 /* !! */  = this.g();
        var5_4 = this.b;
        var6_5 = this.a;
        if (var4_3 /* !! */  == 0) {
            var10_8 = var5_4;
            var9_7 = new fx2_0(0L, var6_5 += var10_8);
            var8_6 = new dX2$a(var9_7, var9_7);
            return var8_6;
        }
        var12_9 = 0L;
        var14_10 = 0.0;
        var16_11 = this.c;
        var18_12 = gz3.i(var1_1, var12_9, var16_11);
        var20_13 = var18_12;
        var22_14 = 100.0;
        var20_13 *= var22_14;
        var24_15 = this.c;
        cfr_temp_0 = (var20_13 /= var24_15) - (var24_15 = 0.0);
        var4_3 /* !! */  = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
        if (var4_3 /* !! */  <= 0) lbl-1000:
        // 2 sources

        {
            while (true) {
                var26_17 = 0x4070000000000000L;
                var20_13 = 256.0;
                break;
            }
        } else {
            var4_3 /* !! */  = (int)(var20_13 == var22_14 ? 0 : (var20_13 > var22_14 ? 1 : -1));
            if (var4_3 /* !! */  >= 0) {
                var26_17 = 0x4070000000000000L;
                var20_13 = 256.0;
                var24_15 = 256.0;
            } else {
                var4_3 /* !! */  = (int)var20_13;
                var28_18 = this.g;
                ct3.h(var28_18);
                var12_9 = var28_18[var4_3 /* !! */ ];
                var14_10 = var12_9;
                var29_19 = 99;
                if (var4_3 /* !! */  == var29_19) {
                    var16_11 = 0x4070000000000000L;
                    var30_20 = 256.0;
                } else {
                    var29_19 = var4_3 /* !! */  + 1;
                    var32_16 = var28_18[var29_19];
                    var30_20 = var32_16;
                }
                var34_21 = var4_3 /* !! */ ;
                var30_20 = (var30_20 - var14_10) * (var20_13 -= var34_21);
                var24_15 = var30_20 + var14_10;
                ** continue;
            }
        }
        var26_17 = var3_2.e;
        var22_14 = var26_17;
        var32_16 = Math.round((var24_15 /= var20_13) * var22_14);
        var36_22 = var5_4;
        var38_23 = var26_17 - 1L;
        var36_22 = gz3.i(var32_16, var36_22, var38_23);
        var41_25 = new fx2_0(var18_12, var6_5 += var36_22);
        var40_24 = new dX2$a(var41_25, var41_25);
        return var40_24;
    }

    public final long f() {
        return this.f;
    }

    public final boolean g() {
        boolean bl2;
        long[] lArray = this.g;
        if (lArray != null) {
            bl2 = true;
        } else {
            bl2 = false;
            lArray = null;
        }
        return bl2;
    }

    public final long getDurationUs() {
        return this.c;
    }

    public final long h(long l2) {
        long l3;
        long l4;
        long l7 = this.a;
        l2 -= l7;
        int n3 = this.g();
        if (n3 != 0 && (l4 = (l3 = l2 - (l7 = (long)(n3 = this.b))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            double d2;
            long[] lArray = this.g;
            ct3.h(lArray);
            double d5 = (double)l2 * 256.0;
            double d7 = this.e;
            long l8 = (long)(d5 /= d7);
            boolean bl2 = true;
            int n4 = gz3.d(lArray, l8, bl2);
            long l12 = n4;
            long l14 = this.c;
            l12 *= l14;
            long l15 = 100;
            double d9 = 4.94E-322;
            l12 /= l15;
            long l16 = lArray[n4];
            int n7 = n4 + 1;
            long l17 = n7;
            l14 = l14 * l17 / l15;
            int n8 = 99;
            if (n4 == n8) {
                l7 = 256L;
                d2 = 1.265E-321;
            } else {
                l7 = l15 = lArray[n7];
            }
            n8 = (int)(l16 == l7 ? 0 : (l16 < l7 ? -1 : 1));
            if (n8 == 0) {
                l2 = 0L;
                d5 = 0.0;
            } else {
                d9 = l16;
                d5 -= d9;
                d2 = l7 -= l16;
                d5 /= d2;
            }
            d2 = l14 - l12;
            return Math.round(d5 * d2) + l12;
        }
        return 0L;
    }

    public final int j() {
        return this.d;
    }
}

