/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import androidx.media3.exoplayer.source.b$a;
import androidx.media3.exoplayer.source.i$a;
import androidx.media3.exoplayer.source.r;

public final class b
implements androidx.media3.exoplayer.source.i,
i$a {
    public final androidx.media3.exoplayer.source.i a;
    public i$a b;
    public b$a[] c;
    public long d;
    public long e;
    public long f;
    public ClippingMediaSource$IllegalClippingException g;

    public b(androidx.media3.exoplayer.source.i b$aArray, boolean bl2, long l2, long l3) {
        this.a = b$aArray;
        b$aArray = new b$a[]{};
        this.c = b$aArray;
        long l4 = bl2 ? l2 : -9223372036854775807L;
        this.d = l4;
        this.e = l2;
        this.f = l3;
    }

    public final boolean a(i i3) {
        return this.a.a(i3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long b(DF0[] var1_1, boolean[] var2_2, VR2[] var3_3, boolean[] var4_4, long var5_5) {
        block26: {
            block27: {
                var7_6 = this;
                var8_7 = var1_1;
                var9_8 = var3_3;
                var10_9 = 1;
                var11_10 = new b$a[var3_3.length];
                this.c = var11_10;
                var12_11 = new VR2[var3_3.length];
                var13_12 = 0;
                var14_13 = 0;
                var11_10 = null;
                while (true) {
                    var15_14 = var9_8.length;
                    var16_15 = null;
                    if (var14_13 >= var15_14) break;
                    var17_16 = var7_6.c;
                    var18_17 /* !! */  = (boolean[])((b$a)var9_8[var14_13]);
                    var17_16[var14_13] = var18_17 /* !! */ ;
                    if (var18_17 /* !! */  != null) {
                        var16_15 = var18_17 /* !! */ .a;
                    }
                    var12_11[var14_13] = var16_15;
                    var14_13 += var10_9;
                }
                var11_10 = var7_6.a;
                var17_16 = var1_1;
                var18_17 /* !! */  = var2_2;
                var19_18 = var12_11;
                var20_19 = var4_4;
                var21_20 = var11_10.b(var1_1, var2_2, var12_11, var4_4, var5_5);
                var23_21 = this.j();
                if (var23_21 == 0 || (var26_23 = (cfr_temp_0 = var5_5 - (var24_22 = var7_6.e)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false || (var29_25 = (cfr_temp_1 = var24_22 - (var27_24 = 0L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) break block27;
                var23_21 = var8_7.length;
                var19_18 = null;
                block18: for (var30_26 = 0; var30_26 < var23_21; var30_26 += var10_9) {
                    var20_19 = var8_7[var30_26];
                    if (var20_19 == null) continue;
                    var20_19 = var20_19.k();
                    var31_27 = var20_19.o;
                    if (var31_27 == null) ** GOTO lbl116
                    var29_25 = -1;
                    var32_28 = var31_27.hashCode();
                    switch (var32_28) {
                        default: {
                            break;
                        }
                        case 1903589369: {
                            var33_29 = "audio/g711-mlaw";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 10;
                            break;
                        }
                        case 1903231877: {
                            var33_29 = "audio/g711-alaw";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 9;
                            break;
                        }
                        case 1504831518: {
                            var33_29 = "audio/mpeg";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 8;
                            break;
                        }
                        case 1504619009: {
                            var33_29 = "audio/flac";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 7;
                            break;
                        }
                        case 1504578661: {
                            var33_29 = "audio/eac3";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 6;
                            break;
                        }
                        case 187094639: {
                            var33_29 = "audio/raw";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 5;
                            break;
                        }
                        case 187078296: {
                            var33_29 = "audio/ac3";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 4;
                            break;
                        }
                        case -53558318: {
                            var33_29 = "audio/mp4a-latm";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 3;
                            break;
                        }
                        case -432837259: {
                            var33_29 = "audio/mpeg-L2";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 2;
                            break;
                        }
                        case -432837260: {
                            var33_29 = "audio/mpeg-L1";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 1;
                            break;
                        }
                        case -2123537834: {
                            var33_29 = "audio/eac3-joc";
                            var34_30 = var31_27.equals(var33_29);
                            if (var34_30 == 0) break;
                            var29_25 = 0;
                        }
                    }
                    switch (var29_25) {
                        default: {
                            ** GOTO lbl116
                        }
                        case 3: {
                            var20_19 = var20_19.k;
                            if (var20_19 != null && (var20_19 = (Object)ip1_0.e((String)var20_19)) != null && (var26_23 = (long)var20_19.a()) != false && var26_23 != (var34_30 = 16)) continue block18;
lbl116:
                            // 3 sources

                            var24_22 = var21_20;
                            break block26;
                        }
                        case 0: 
                        case 1: 
                        case 2: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: 
                    }
                }
            }
            var24_22 = -9223372036854775807L;
        }
        var7_6.d = var24_22;
        var23_21 = var21_20 == var5_5 ? 0 : (var21_20 < var5_5 ? -1 : 1);
        if (var23_21 != 0 && ((var26_23 = (cfr_temp_2 = var21_20 - (var24_22 = var7_6.e)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) < 0 || (var29_25 = (cfr_temp_3 = (var24_22 = var7_6.f) - (var27_24 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) != false && (var26_23 = var21_20 == var24_22 ? 0 : (var21_20 < var24_22 ? -1 : 1)) > 0)) {
            var23_21 = 0;
            var18_17 /* !! */  = null;
        } else {
            var23_21 = 1;
        }
        ct3.f((boolean)var23_21);
        while (var13_12 < (var23_21 = var9_8.length)) {
            var18_17 /* !! */  = (boolean[])var12_11[var13_12];
            if (var18_17 /* !! */  == null) {
                var18_17 /* !! */  = (boolean[])var7_6.c;
                var18_17 /* !! */ [var13_12] = null;
            } else {
                var19_18 = var7_6.c;
                var20_19 = var19_18[var13_12];
                if (var20_19 == null || (var20_19 = (Object)var20_19.a) != var18_17 /* !! */ ) {
                    var20_19 = new b$a;
                    var20_19(this, (VR2)var18_17 /* !! */ );
                    var19_18[var13_12] = var20_19;
                }
            }
            var18_17 /* !! */  = (boolean[])var7_6.c[var13_12];
            var9_8[var13_12] = var18_17 /* !! */ ;
            var13_12 += var10_9;
        }
        return var21_20;
    }

    public final void c(androidx.media3.exoplayer.source.i object) {
        object = this.g;
        if (object != null) {
            return;
        }
        object = this.b;
        object.getClass();
        object.c(this);
    }

    public final long d() {
        long l2;
        long l3;
        long l4;
        long l7;
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l8 = i3.d();
        long l12 = l8 - (l7 = Long.MIN_VALUE);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && ((l4 = (l3 = (l2 = this.f) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false || (l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) < 0)) {
            return l8;
        }
        return l7;
    }

    public final long e(long l2, ex2_0 ex2_02) {
        long l3;
        long l4 = this.e;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return l4;
        }
        long l8 = ex2_02.a;
        long l12 = l2 - l4;
        long l14 = 0L;
        l4 = gz3.i(l8, l14, l12);
        long l15 = this.f;
        long l16 = Long.MIN_VALUE;
        long l17 = l15 - l16;
        Object object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        l15 = object2 == false ? Long.MAX_VALUE : (l15 -= l2);
        l16 = ex2_02.b;
        long l18 = 0L;
        l15 = gz3.i(l16, l18, l15);
        l16 = ex2_02.a;
        object2 = l4 == l16 ? 0 : (l4 < l16 ? -1 : 1);
        if (object2 != false || (object2 = (l3 = l15 - (l16 = ex2_02.b)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            ex2_02 = new ex2_0(l4, l15);
        }
        return this.a.e(l2, ex2_02);
    }

    public final long f(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        int n3;
        long l12;
        this.d = l12 = -9223372036854775807L;
        Object object = this.c;
        int n4 = ((b$a[])object).length;
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            b$a b$a = object[n3];
            if (b$a == null) continue;
            b$a.b = false;
        }
        object = this.a;
        l12 = object.f(l2);
        long l14 = l12 - l2;
        n3 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
        if (n3 == 0 || (n3 = (int)((l8 = l12 - (l2 = this.e)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) >= 0 && ((l7 = (l4 = (l2 = this.f) - (l3 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false || (n3 = (int)(l12 == l2 ? 0 : (l12 < l2 ? -1 : 1))) <= 0)) {
            bl2 = true;
        }
        ct3.f(bl2);
        return l12;
    }

    public final long g() {
        Object object = this.j();
        long l2 = -9223372036854775807L;
        if (object) {
            long l3 = this.d;
            this.d = l2;
            long l4 = this.g();
            long l7 = l4 - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object) {
                l3 = l4;
            }
            return l3;
        }
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l8 = i3.g();
        long l12 = l8 - l2;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (!object) {
            return l2;
        }
        long l14 = this.e;
        boolean bl2 = false;
        Object object2 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1);
        if (object2 >= 0) {
            object = true;
        } else {
            object = false;
            i3 = null;
        }
        ct3.f(object);
        l14 = this.f;
        long l15 = Long.MIN_VALUE;
        long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (l16 == false || (object2 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        ct3.f(bl2);
        return l8;
    }

    public final void h(r object) {
        object = (androidx.media3.exoplayer.source.i)object;
        object = this.b;
        object.getClass();
        object.h(this);
    }

    public final void i() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.g;
        if (clippingMediaSource$IllegalClippingException == null) {
            this.a.i();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final boolean isLoading() {
        return this.a.isLoading();
    }

    public final boolean j() {
        long l2 = this.d;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    public final void k(i$a i$a, long l2) {
        this.b = i$a;
        this.a.k(this, l2);
    }

    public final sp3 l() {
        return this.a.l();
    }

    public final long o() {
        long l2;
        long l3;
        long l4;
        long l7;
        androidx.media3.exoplayer.source.i i3 = this.a;
        long l8 = i3.o();
        long l12 = l8 - (l7 = Long.MIN_VALUE);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && ((l4 = (l3 = (l2 = this.f) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false || (l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) < 0)) {
            return l8;
        }
        return l7;
    }

    public final void p(long l2, boolean bl2) {
        this.a.p(l2, bl2);
    }

    public final void q(long l2) {
        this.a.q(l2);
    }
}

