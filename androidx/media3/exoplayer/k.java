/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.common.a$a;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.ExoPlayer$e;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.j$a;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.ArrayList;
import java.util.List;

public final class k {
    public final g$b a;
    public final g$c b;
    public final je c;
    public final H21 d;
    public final j$a e;
    public long f;
    public int g;
    public boolean h;
    public ExoPlayer$e i;
    public j j;
    public j k;
    public j l;
    public j m;
    public int n;
    public Object o;
    public long p;
    public List q;

    public k(je arrayList, H21 h21, af0_0 af0_02, ExoPlayer$e exoPlayer$e) {
        this.c = arrayList;
        this.d = h21;
        this.e = af0_02;
        this.i = exoPlayer$e;
        arrayList = new ArrayList();
        this.a = arrayList;
        arrayList = new ArrayList();
        this.b = arrayList;
        this.q = arrayList = new ArrayList();
    }

    public static j$b q(androidx.media3.common.g g3, Object object, long l2, long l3, g$c g$c, g$b g$b) {
        int n3;
        long l4;
        int n4;
        int n7;
        Object object2 = g3;
        long l7 = l2;
        g$c g$c2 = g$c;
        Object object3 = object;
        g$b g$b2 = g$b;
        g3.h(object, g$b);
        int n8 = g$b.c;
        g3.o(n8, g$c);
        n8 = g3.b(object);
        Object object4 = object;
        while (true) {
            int n10;
            int n14;
            object3 = g$b2.g;
            int n15 = ((a)object3).b;
            n7 = -1;
            if (n15 == 0) break;
            n4 = 1;
            if (n15 == n4 && (n14 = g$b2.h(0)) != 0) break;
            a a2 = g$b2.g;
            n14 = a2.e;
            if ((n14 = (int)(g$b2.i(n14) ? 1 : 0)) == 0 || (n10 = g$b2.c(l4 = 0L)) != n7) break;
            long l8 = g$b2.d;
            long l12 = l8 - l4;
            Object object5 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object5 != false) {
                n10 = n15 + -1;
                n10 = (n10 = (int)(g$b2.h(n10) ? 1 : 0)) != 0 ? 2 : 1;
                n15 -= n10;
                for (n3 = 0; n3 <= n15; ++n3) {
                    a$a a$a = g$b2.g.a(n3);
                    l8 = a$a.h;
                    l4 += l8;
                }
                l8 = g$b2.d;
                long l14 = l8 - l4;
                n15 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                if (n15 > 0) break;
            }
            n15 = g$c2.o;
            if (n8 > n15) break;
            ((androidx.media3.common.g)object2).g(n8, g$b2, n4 != 0);
            object4 = g$b2.b;
            object4.getClass();
            ++n8;
        }
        ((androidx.media3.common.g)object2).h(object4, g$b2);
        n4 = g$b2.c(l7);
        if (n4 == n7) {
            int n16 = g$b2.b(l7);
            j$b j$b = new j$b(object4, l3, n16);
            return j$b;
        }
        n3 = g$b2.f(n4);
        l4 = l3;
        object2 = new j$b(object4, n4, n3, l3, -1);
        return object2;
    }

    public final j a() {
        int n3;
        Object object = this.j;
        Object object2 = null;
        if (object == null) {
            return null;
        }
        j j3 = this.k;
        if (object == j3) {
            this.k = j3 = ((j)object).n;
        }
        ((j)object).i();
        this.n = n3 = this.n + -1;
        if (n3 == 0) {
            long l2;
            this.l = null;
            object = this.j;
            this.o = object2 = ((j)object).b;
            object = ((j)object).h.a;
            this.p = l2 = ((j$b)object).d;
        }
        object = this.j.n;
        this.j = object;
        this.m();
        return this.j;
    }

    public final void b() {
        long l2;
        Object object;
        int n3 = this.n;
        if (n3 == 0) {
            return;
        }
        j j3 = this.j;
        ct3.h(j3);
        this.o = object = j3.b;
        object = j3.h.a;
        this.p = l2 = ((j$b)object).d;
        while (j3 != null) {
            j3.i();
            j3 = j3.n;
        }
        this.j = null;
        this.l = null;
        this.k = null;
        this.n = 0;
        this.m();
    }

    /*
     * Unable to fully structure code
     */
    public final YM1 c(androidx.media3.common.g var1_1, j var2_2, long var3_3) {
        block8: {
            block9: {
                var5_4 = this;
                var6_5 = var1_1;
                var7_6 = var2_2;
                var8_7 = var2_2.h;
                var9_8 = var8_7.a.a;
                var10_9 = var1_1.b(var9_8);
                var11_10 = this.g;
                var12_11 = this.h;
                var13_12 = this.a;
                var14_13 = this.b;
                var9_8 = var1_1;
                var15_14 = var1_1.d(var10_9, (g$b)var13_12, var14_13, var11_10, var12_11);
                var10_9 = -1;
                var13_12 = null;
                if (var15_14 == var10_9) {
                    return null;
                }
                var16_15 = this.a;
                var17_16 = 1;
                var18_17 = var1_1.g((int)var15_14, (g$b)var16_15, (boolean)var17_16).c;
                var19_18 = var16_15.b;
                var19_18.getClass();
                var20_19 = var8_7.a;
                var21_20 = var20_19.d;
                var23_21 = this.b;
                var24_22 = 0L;
                var26_23 = 0.0;
                var23_21 = var1_1.n(var18_17, (g$c)var23_21, var24_22);
                var28_24 = var23_21.n;
                var29_25 = -9223372036854775807L;
                var31_26 = -4.9E-324;
                if (var28_24 != var15_14) break block9;
                var33_27 = -9223372036854775807L;
                var35_28 = -4.9E-324;
                var21_20 = var3_3;
                var37_30 = Math.max(var24_22, var3_3);
                var39_31 = this.b;
                var23_21 = this.a;
                var40_32 = var1_1;
                var24_22 = var33_27;
                var26_23 = var35_28;
                var9_8 = var2_2;
                var19_18 = var8_7;
                var40_32 = var1_1.k((g$c)var39_31, (g$b)var23_21, var18_17, var33_27, var37_30);
                if (var40_32 == null) {
                    return null;
                }
                var13_12 = var40_32.first;
                var40_32 = (Long)var40_32.second;
                var24_22 = var40_32.longValue();
                var9_8 = var2_2.n;
                if (var9_8 != null && (var41_33 = (var40_32 = var9_8.b).equals(var13_12))) {
                    var9_8 = var9_8.h.a;
                    var21_20 = var9_8.d;
lbl54:
                    // 3 sources

                    while (true) {
                        var9_8 = var19_18;
                        var33_27 = var24_22;
                        var37_30 = var29_25;
                        var24_22 = var21_20;
                        var39_31 = var13_12;
                        break block8;
                        break;
                    }
                }
                var21_20 = var5_4.s(var13_12);
                cfr_temp_0 = var21_20 - (var42_34 = (long)-1);
                var15_14 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var15_14 != 0) ** GOTO lbl54
                var21_20 = var5_4.f;
                var5_4.f = var42_34 = 1L + var21_20;
                ** while (true)
            }
            var9_8 = var8_7;
            var33_27 = var24_22;
            var35_29 = var26_23;
            var37_30 = var24_22;
            var24_22 = var21_20;
            var39_31 = var19_18;
        }
        var7_6 = var5_4.b;
        var8_7 = var5_4.a;
        var40_32 = var1_1;
        var42_34 = var33_27;
        var13_12 = androidx.media3.exoplayer.k.q(var1_1, var39_31, var33_27, var24_22, (g$c)var7_6, (g$b)var8_7);
        var11_10 = (int)(var37_30 == var29_25 ? 0 : (var37_30 < var29_25 ? -1 : 1));
        if (var11_10 == 0 || (var15_14 = (int)((cfr_temp_1 = (var21_20 = var9_8.c) - var29_25) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0) ** GOTO lbl96
        var9_8 = var20_19.a;
        var9_8 = var6_5.h((Object)var9_8, (g$b)var16_15).g;
        var15_14 = var9_8.b;
        var19_18 = var16_15.g;
        var11_10 = var19_18.e;
        if (var15_14 <= 0 || !(var12_11 = var16_15.i(var11_10)) || var15_14 <= var17_16 && (var28_24 = (int)((cfr_temp_2 = (var44_35 = var16_15.d(var11_10)) - (var46_36 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0) {
            var17_16 = 0;
            var14_13 = null;
        }
        if ((var15_14 = (int)var13_12.b()) != 0 && var17_16 != 0) {
            var48_37 = var21_20;
        } else {
            if (var17_16 != 0) {
                var33_27 = var21_20;
            }
lbl96:
            // 4 sources

            var48_37 = var37_30;
        }
        var9_8 = this;
        var16_15 = var1_1;
        return this.e(var1_1, (j$b)var13_12, var48_37, var33_27);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final YM1 d(androidx.media3.common.g g3, j j3, long l2) {
        Object object;
        int n3;
        androidx.media3.common.g g5 = g3;
        Object object2 = j3;
        YM1 yM1 = j3.h;
        long l3 = j3.q;
        long l4 = yM1.e;
        l3 = l3 + l4 - l2;
        int n4 = yM1.g;
        if (n4 != 0) {
            return this.c(g3, j3, l3);
        }
        j$b j$b = yM1.a;
        Object object3 = j$b.a;
        g$b g$b = this.a;
        g3.h(object3, g$b);
        n4 = j$b.b();
        long l7 = Long.MIN_VALUE;
        int n7 = -1;
        Object object4 = j$b.a;
        if (n4 != 0) {
            long l8;
            Object object5;
            Object object6;
            int n8;
            object2 = g$b.g;
            n4 = j$b.b;
            object2 = ((a)object2).a(n4);
            int n10 = ((a$a)object2).b;
            if (n10 == n7) return null;
            a$a a$a = g$b.g.a(n4);
            n7 = a$a.a(n8 = j$b.c);
            if (n7 < n10) {
                Object object7 = j$b.a;
                long l12 = yM1.c;
                long l14 = j$b.d;
                object2 = this;
                androidx.media3.common.g g7 = g3;
                return this.f(g3, object7, n4, n7, l12, l14);
            }
            long l15 = yM1.c;
            l4 = -9223372036854775807L;
            long l16 = l15 - l4;
            n10 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
            if (n10 == 0) {
                n4 = g$b.c;
                long l17 = Math.max(0L, l3);
                object6 = this.b;
                long l18 = -9223372036854775807L;
                object2 = g3;
                object5 = g$b;
                object2 = g3.k((g$c)object6, g$b, n4, l18, l17);
                if (object2 == null) {
                    return null;
                }
                object2 = (Long)((Pair)object2).second;
                l15 = (Long)object2;
            }
            g5.h(object4, g$b);
            n10 = j$b.b;
            l3 = g$b.d(n10);
            n4 = (int)(l3 == l7 ? 0 : (l3 < l7 ? -1 : 1));
            if (n4 == 0) {
                l8 = g$b.d;
            } else {
                object3 = g$b.g;
                object2 = ((a)object3).a(n10);
                l4 = ((a$a)object2).h;
                l8 = l4 + l3;
            }
            l4 = Math.max(l8, l15);
            object5 = j$b.a;
            l15 = yM1.c;
            long l19 = j$b.d;
            object2 = this;
            object6 = g3;
            return this.g(g3, object5, l4, l15, l19);
        }
        n4 = j$b.e;
        if (n4 != n7 && (n7 = (int)(g$b.h(n4) ? 1 : 0)) != 0) {
            return this.c(g3, j3, l3);
        }
        n7 = g$b.f(n4);
        int n14 = g$b.i(n4);
        if (n14 != 0 && (n14 = g$b.e(n4, n7)) == (n3 = 3)) {
            n14 = 1;
        } else {
            n14 = 0;
            object2 = null;
        }
        Object object8 = g$b.g.a(n4);
        n3 = ((a$a)object8).b;
        if (n7 != n3 && n14 == 0) {
            long l20 = yM1.e;
            long l21 = j$b.d;
            Object object9 = j$b.a;
            n4 = j$b.e;
            object2 = this;
            object8 = g3;
            return this.f(g3, object9, n4, n7, l20, l21);
        }
        g5.h(object4, g$b);
        long l22 = g$b.d(n4);
        long l23 = l22 == l7 ? 0 : (l22 < l7 ? -1 : 1);
        if (l23 == false) {
            l4 = l22 = g$b.d;
        } else {
            long l24;
            object = g$b.g.a(n4);
            l4 = l24 = ((a$a)object).h + l22;
        }
        object = j$b.a;
        long l25 = yM1.e;
        long l26 = j$b.d;
        object2 = this;
        object8 = g3;
        return this.g(g3, object, l4, l25, l26);
    }

    public final YM1 e(androidx.media3.common.g g3, j$b j$b, long l2, long l3) {
        Object object = j$b.a;
        Object object2 = this.a;
        g3.h(object, (g$b)object2);
        boolean bl2 = j$b.b();
        if (bl2) {
            int n3 = j$b.c;
            long l4 = j$b.d;
            Object object3 = j$b.a;
            int n4 = j$b.b;
            object2 = this;
            return this.f(g3, object3, n4, n3, l2, l4);
        }
        Object object4 = j$b.a;
        long l7 = j$b.d;
        object2 = this;
        return this.g(g3, object4, l3, l2, l7);
    }

    public final YM1 f(androidx.media3.common.g g3, Object object, int n3, int n4, long l2, long l3) {
        YM1 yM1;
        long l4;
        j$b j$b;
        int n7 = n3;
        int n8 = -1;
        Object object2 = j$b;
        Object object3 = object;
        long l7 = l3;
        j$b = new j$b(object, n3, n4, l3, n8);
        object2 = this.a;
        object3 = g3;
        object3 = g3.h(object, (g$b)object2);
        long l8 = ((g$b)object3).a(n3, n4);
        int n10 = ((g$b)object2).f(n3);
        long l12 = 0L;
        if (n4 == n10) {
            object3 = ((g$b)object2).g;
            l7 = ((a)object3).c;
        } else {
            l7 = l12;
        }
        boolean bl2 = ((g$b)object2).i(n7);
        long l14 = -9223372036854775807L;
        n8 = (int)(l8 == l14 ? 0 : (l8 < l14 ? -1 : 1));
        if (n8 != 0 && (l4 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) >= 0) {
            l14 = l8 - 1L;
            l12 = l14 = Math.max(l12, l14);
        } else {
            l12 = l7;
        }
        object2 = yM1;
        object3 = j$b;
        l7 = l2;
        yM1 = new YM1(j$b, l12, l2, -9223372036854775807L, l8, bl2, false, false, false);
        return yM1;
    }

    /*
     * Unable to fully structure code
     */
    public final YM1 g(androidx.media3.common.g var1_1, Object var2_2, long var3_3, long var5_4, long var7_5) {
        block14: {
            var9_6 = this;
            var10_7 = var1_1;
            var11_8 = var2_2;
            var12_9 = var3_3;
            var14_10 = this.a;
            var1_1.h(var2_2, var14_10);
            var15_11 = var14_10.b(var3_3);
            var16_12 = 0;
            var17_13 = 1;
            var18_14 = -1;
            var19_15 = var15_11 != var18_14 && (var19_15 = var14_10.h(var15_11)) != false;
            if (var15_11 != var18_14) break block14;
            var20_16 = var14_10.g;
            var21_17 = var20_16.b;
            if (var21_17 <= 0) ** GOTO lbl-1000
            var22_19 = var20_16.e;
            if ((var22_19 = (int)var14_10.i(var22_19)) == 0) ** GOTO lbl-1000
            ** GOTO lbl37
        }
        var22_19 = var14_10.i(var15_11);
        if (var22_19 == 0 || (var27_22 = (cfr_temp_0 = (var23_20 = var14_10.d(var15_11)) - (var25_21 = var14_10.d)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) ** GOTO lbl-1000
        var20_16 = var14_10.g.a(var15_11);
        var21_18 = var20_16.b;
        if (var21_18 == var18_14) {
            while (true) {
                var22_19 = 1;
                break;
            }
        } else {
            var29_23 = null;
            for (var28_24 = 0; var28_24 < var21_18; ++var28_24) {
                if ((var31_26 = (var30_25 = var20_16.f)[var28_24]) == 0 || var31_26 == var17_13) ** continue;
            }
            var22_19 = 0;
            var20_16 = null;
        }
        if ((var22_19 ^= var17_13) != 0) {
            var15_11 = -1;
lbl37:
            // 2 sources

            var22_19 = 1;
        } else lbl-1000:
        // 4 sources

        {
            var22_19 = 0;
            var20_16 = null;
        }
        var32_27 = var7_5;
        var29_23 = new j$b(var11_8, var7_5, var15_11);
        var34_28 = var29_23.b();
        if (!var34_28 && var15_11 == var18_14) {
            var34_28 = true;
        } else {
            var34_28 = false;
            var11_8 = null;
        }
        var35_29 = var9_6.k((androidx.media3.common.g)var10_7, var29_23);
        var36_30 = var9_6.j((androidx.media3.common.g)var10_7, var29_23, var34_28);
        var38_32 = var15_11 != var18_14 && (var37_31 = var14_10.i(var15_11)) != 0 && var19_15 == false;
        var32_27 = -9223372036854775807L;
        if (var15_11 != var18_14 && !var19_15) {
            var39_33 = var14_10.d(var15_11);
lbl55:
            // 2 sources

            while (true) {
                var41_34 = var39_33;
                break;
            }
        } else {
            if (var22_19 != 0) {
                var39_33 = var14_10.d;
                ** continue;
            }
            var41_34 = var32_27;
        }
        var37_31 = var41_34 == var32_27 ? 0 : (var41_34 < var32_27 ? -1 : 1);
        var43_35 = var37_31 != 0 && (var37_31 = (cfr_temp_1 = var41_34 - (var39_33 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) != 0 ? var41_34 : (var45_36 = var14_10.d);
        var37_31 = var43_35 == var32_27 ? 0 : (var43_35 < var32_27 ? -1 : 1);
        if (var37_31 != 0 && (var37_31 = var12_9 == var43_35 ? 0 : (var12_9 < var43_35 ? -1 : 1)) >= 0) {
            if (var36_30 || var22_19 == 0) {
                var16_12 = 1;
            }
            var12_9 = var16_12;
            var12_9 = var43_35 - var12_9;
            var45_36 = 0L;
            var12_9 = Math.max(var45_36, var12_9);
        }
        var32_27 = var12_9;
        var10_7 = new YM1(var29_23, var12_9, var5_4, var41_34, var43_35, var38_32, var34_28, var35_29, var36_30);
        return var10_7;
    }

    public final YM1 h(androidx.media3.common.g g3, YM1 yM1) {
        YM1 yM12;
        boolean bl2;
        boolean bl3;
        k k2 = this;
        Object object = g3;
        Object object2 = yM1;
        j$b j$b = yM1.a;
        int n3 = j$b.b();
        int n4 = -1;
        int n7 = j$b.e;
        boolean bl22 = n3 == 0 && n7 == n4;
        boolean bl32 = k2.k((androidx.media3.common.g)object, j$b);
        boolean bl4 = k2.j((androidx.media3.common.g)object, j$b, bl22);
        Object object3 = ((YM1)object2).a.a;
        g$b g$b = k2.a;
        ((androidx.media3.common.g)object).h(object3, g$b);
        boolean bl5 = j$b.b();
        long l2 = -9223372036854775807L;
        long l3 = !bl5 && n7 != n4 ? g$b.d(n7) : l2;
        boolean bl6 = j$b.b();
        n3 = j$b.b;
        if (bl6) {
            int n8 = j$b.c;
            l2 = g$b.a(n3, n8);
        } else {
            long l4;
            long l7;
            Object object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            l2 = object4 != false && (l7 = (l4 = l3 - (l2 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false ? l3 : g$b.d;
        }
        boolean bl7 = j$b.b();
        boolean bl8 = bl7 ? (bl3 = g$b.i(n3)) : n7 != n4 && (bl2 = g$b.i(n7));
        long l8 = ((YM1)object2).b;
        long l12 = ((YM1)object2).c;
        object = yM12;
        object2 = j$b;
        yM12 = new YM1(j$b, l8, l12, l3, l2, bl8, bl22, bl32, bl4);
        return yM12;
    }

    public final void i(androidx.media3.common.g g3) {
        j j3;
        k k2 = this;
        androidx.media3.common.g g5 = g3;
        Object object = this.i;
        long l2 = ((ExoPlayer$e)object).a;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false && (j3 = this.l) != null) {
            long l7;
            Object object3;
            Object object4;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            object = j3.h.a.a;
            Object object5 = this.a;
            object = g3.h(object, (g$b)object5);
            int n3 = ((g$b)object).c;
            int n4 = this.g;
            boolean bl2 = this.h;
            int n7 = g3.e(n3, n4, bl2);
            if (n7 != (n3 = -1)) {
                object4 = this.a;
                long l8 = 0L;
                object3 = this.b;
                l7 = -9223372036854775807L;
                object = g3;
                object = g3.k((g$c)object3, (g$b)object4, n7, l7, l8);
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                object3 = ((Pair)object).first;
                n4 = g5.h((Object)object3, (g$b)object5).c;
                g$c g$c = k2.b;
                l3 = 0L;
                object3 = g5.n(n4, g$c, l3);
                if ((n4 = (int)(((g$c)object3).b() ? 1 : 0)) == 0) {
                    long l12;
                    long l14;
                    object3 = ((Pair)object).first;
                    long l15 = k2.s(object3);
                    long l16 = l15 - (l14 = (long)-1);
                    Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object6 == false) {
                        l15 = k2.f;
                        k2.f = l14 = 1L + l15;
                    }
                    l7 = l15;
                    object3 = ((Pair)object).first;
                    long l17 = (Long)((Pair)object).second;
                    Object object7 = k2.b;
                    g$b g$b = k2.a;
                    object = g3;
                    l3 = l17;
                    object = androidx.media3.exoplayer.k.q(g3, object3, l17, l15, (g$c)object7, g$b);
                    n4 = (int)(((j$b)object).b() ? 1 : 0);
                    if (n4 != 0) {
                        object2 = ((j$b)object).c;
                        l12 = ((j$b)object).d;
                        object4 = ((j$b)object).a;
                        n7 = ((j$b)object).b;
                        object = this;
                        object3 = g3;
                        long l18 = l17;
                        object = this.f(g3, object4, n7, (int)object2, l17, l12);
                    } else {
                        object4 = ((j$b)object).a;
                        long l19 = -9223372036854775807L;
                        l12 = ((j$b)object).d;
                        object = this;
                        object3 = g3;
                        l14 = l17;
                        object = this.g(g3, object4, l17, l19, l12);
                    }
                    object3 = k2.p((YM1)object);
                    if (object3 == null) {
                        l15 = j3.q;
                        l14 = j3.h.e;
                        l15 += l14;
                        l14 = ((YM1)object).b;
                        l12 = l15 - l14;
                        object3 = (af0_0)k2.e;
                        object3 = (g)((af0_0)object3).a;
                        Cj0 cj0 = ((g)object3).g.d();
                        ExoPlayer$e exoPlayer$e = ((g)object3).Z;
                        l14 = exoPlayer$e.a;
                        o[] oArray = ((g)object3).c;
                        Gp3 gp3 = ((g)object3).e;
                        object7 = ((g)object3).u;
                        object3 = ((g)object3).f;
                        object5 = object4;
                        object3 = object4 = new j(oArray, l12, gp3, cj0, (l)object7, (YM1)object, (Hp3)object3, l14);
                    }
                    arrayList.add(object3);
                }
            }
            k2.n(arrayList);
            return;
        }
        object = k2.q;
        boolean bl3 = object.isEmpty();
        if (!bl3) {
            object = new ArrayList();
            k2.n((ArrayList)object);
        }
    }

    public final boolean j(androidx.media3.common.g g3, j$b object, boolean bl2) {
        object = ((j$b)object).a;
        int n3 = g3.b(object);
        object = this.a;
        boolean bl3 = false;
        int n4 = g3.g((int)n3, (g$b)object, (boolean)false).c;
        long l2 = 0L;
        Object object2 = this.b;
        object = g3.n(n4, (g$c)object2, l2);
        n4 = (int)(((g$c)object).i ? 1 : 0);
        if (n4 == 0) {
            int n7 = this.g;
            boolean bl4 = this.h;
            g$b g$b = this.a;
            g$c g$c = this.b;
            object2 = g3;
            int n8 = g3.d(n3, g$b, g$c, n7, bl4);
            if (n8 == (n4 = -1) && bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean k(androidx.media3.common.g object, j$b object2) {
        void var3_7;
        g$b g$b;
        int n3;
        int n4;
        boolean n42 = ((j$b)object2).b();
        boolean bl2 = false;
        if (!n42 && (n4 = ((j$b)object2).e) == (n3 = -1)) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            g$b = null;
        }
        if (var3_7 == false) {
            return false;
        }
        object2 = ((j$b)object2).a;
        g$b = this.a;
        g$b = ((androidx.media3.common.g)object).h(object2, g$b);
        int n7 = g$b.c;
        int n8 = ((androidx.media3.common.g)object).b(object2);
        long l2 = 0L;
        g$c g$c = this.b;
        object = ((androidx.media3.common.g)object).n(n7, g$c, l2);
        int n10 = ((g$c)object).o;
        if (n10 == n8) {
            bl2 = true;
        }
        return bl2;
    }

    public final void l() {
        Object object;
        int n3;
        int n4;
        j j3 = this.m;
        if (j3 != null && (n4 = j3.h()) == 0) {
            return;
        }
        this.m = null;
        j3 = null;
        for (n4 = 0; n4 < (n3 = (object = this.q).size()); ++n4) {
            object = (j)this.q.get(n4);
            boolean bl2 = ((j)object).h();
            if (bl2) continue;
            this.m = object;
            break;
        }
    }

    public final void m() {
        Object object;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        Object object2 = this.j;
        while (object2 != null) {
            object = ((j)object2).h.a;
            immutableList$Builder.add(object);
            object2 = ((j)object2).n;
        }
        object2 = this.k;
        object2 = object2 == null ? null : ((j)object2).h.a;
        object = new tl0_2(this, 1, immutableList$Builder, object2);
        this.d.i((Runnable)object);
    }

    public final void n(ArrayList arrayList) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.q).size()); ++i3) {
            object = (j)this.q.get(i3);
            ((j)object).i();
        }
        this.q = arrayList;
        this.m = null;
        this.l();
    }

    public final boolean o(j j3) {
        ct3.h(j3);
        j j5 = this.l;
        int n3 = j3.equals(j5);
        boolean bl2 = false;
        if (n3 != 0) {
            return false;
        }
        this.l = j3;
        while ((j3 = j3.n) != null) {
            j5 = this.k;
            int n4 = 1;
            if (j3 == j5) {
                this.k = j5 = this.j;
                bl2 = true;
            }
            j3.i();
            this.n = n3 = this.n - n4;
        }
        j3 = this.l;
        j3.getClass();
        j5 = j3.n;
        if (j5 != null) {
            j3.b();
            n3 = 0;
            j5 = null;
            j3.n = null;
            j3.c();
        }
        this.m();
        return bl2;
    }

    public final j p(YM1 yM1) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.q).size()); ++i3) {
            j$b j$b;
            long l2;
            long l3;
            object = ((j)this.q.get((int)i3)).h;
            long l4 = ((YM1)object).e;
            long l7 = -9223372036854775807L;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false && (object2 = (l3 = l4 - (l7 = yM1.e)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false || (object2 = (l2 = (l4 = ((YM1)object).b) - (l7 = yM1.b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n3 = (int)(((j$b)(object = ((YM1)object).a)).equals(j$b = yM1.a) ? 1 : 0)) == 0) continue;
            return (j)this.q.remove(i3);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final j$b r(androidx.media3.common.g var1_1, Object var2_2, long var3_3) {
        var5_4 = this;
        var6_5 = var1_1;
        var7_6 = var2_2;
        var8_7 = this.a;
        var9_8 = var1_1.h(var2_2, var8_7);
        var10_9 = var9_8.c;
        var11_10 = this.o;
        var12_11 = -1;
        var13_12 = null;
        if (var11_10 != null && (var14_13 = var1_1.b(var11_10)) != var12_11) {
            var11_10 = var1_1.g(var14_13, var8_7, false);
            var14_13 = var11_10.c;
            if (var14_13 == var10_9) {
                var15_14 = this.p;
lbl15:
                // 6 sources

                while (true) {
                    continue;
                    break;
                }
            }
        }
        var11_10 = var5_4.j;
        while (var11_10 != null) {
            block8: {
                var19_16 = var11_10.b;
                var20_17 = var19_16.equals(var7_6);
                if (var20_17 == 0) break block8;
                var9_8 = var11_10.h.a;
                var15_14 = var9_8.d;
                ** GOTO lbl15
            }
            var11_10 = var11_10.n;
        }
        var11_10 = var5_4.j;
        while (var11_10 != null) {
            block9: {
                var19_16 = var11_10.b;
                var20_17 = var6_5.b(var19_16);
                if (var20_17 == var12_11) break block9;
                var19_16 = var6_5.g(var20_17, var8_7, false);
                var20_17 = var19_16.c;
                if (var20_17 != var10_9) break block9;
                var9_8 = var11_10.h.a;
                var15_14 = var9_8.d;
                ** GOTO lbl15
            }
            var11_10 = var11_10.n;
        }
        var15_14 = var5_4.s(var7_6);
        cfr_temp_0 = var15_14 - (var17_15 = (long)-1);
        var21_18 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var21_18 /* !! */  != false) ** GOTO lbl15
        var15_14 = var5_4.f;
        var5_4.f = var17_15 = 1L + var15_14;
        var19_16 = var5_4.j;
        if (var19_16 != null) ** GOTO lbl15
        var5_4.o = var7_6;
        var5_4.p = var15_14;
        ** while (true)
        var17_15 = var15_14;
        var6_5.h(var7_6, var8_7);
        var10_9 = var8_7.c;
        var11_10 = var5_4.b;
        var6_5.o(var10_9, (g$c)var11_10);
        var21_18 /* !! */  = 0;
        var22_19 = null;
        for (var10_9 = var1_1.b(var2_2); var10_9 >= (var23_20 = var11_10.n); var10_9 += -1) {
            var23_20 = 1;
            var6_5.g(var10_9, var8_7, (boolean)var23_20);
            var24_21 = var8_7.g;
            var25_22 = var24_21.b;
            if (var25_22 <= 0) {
                var23_20 = 0;
            }
            var21_18 /* !! */  = var21_18 /* !! */  | var23_20;
            var26_23 = var8_7.d;
            var25_22 = var8_7.c(var26_23);
            if (var25_22 != var12_11) {
                var7_6 = var8_7.b;
                var7_6.getClass();
            }
            if (var21_18 /* !! */  != false && (var23_20 == 0 || (var32_26 = (cfr_temp_1 = (var28_24 = var8_7.d) - (var30_25 = 0L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) != false)) break;
        }
        var13_12 = var5_4.b;
        var22_19 = var5_4.a;
        var6_5 = var1_1;
        var19_16 = var22_19;
        return androidx.media3.exoplayer.k.q(var1_1, var7_6, var3_3, var17_15, var13_12, var22_19);
    }

    public final long s(Object object) {
        Object object2;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object2 = this.q).size()); ++i3) {
            object2 = (j)this.q.get(i3);
            Object object3 = ((j)object2).b;
            boolean bl2 = object3.equals(object);
            if (!bl2) continue;
            return ((j)object2).h.a.d;
        }
        return -1;
    }

    public final boolean t(androidx.media3.common.g object) {
        int n3;
        Object object2 = this.j;
        boolean bl2 = true;
        if (object2 == null) {
            return bl2;
        }
        Object object3 = ((j)object2).b;
        int n4 = n3 = ((androidx.media3.common.g)object).b(object3);
        while (true) {
            int n7;
            int n8 = this.g;
            boolean bl3 = this.h;
            Object object4 = this.a;
            g$c g$c = this.b;
            object3 = object;
            n4 = ((androidx.media3.common.g)object).d(n4, (g$b)object4, g$c, n8, bl3);
            while (true) {
                object2.getClass();
                object3 = ((j)object2).n;
                if (object3 == null) break;
                object4 = ((j)object2).h;
                n7 = (int)(((YM1)object4).g ? 1 : 0);
                if (n7 != 0) break;
                object2 = object3;
            }
            if (n4 == (n7 = -1) || object3 == null || (n7 = ((androidx.media3.common.g)object).b(object4 = ((j)object3).b)) != n4) break;
            object2 = object3;
        }
        n3 = (int)(this.o((j)object2) ? 1 : 0);
        YM1 yM1 = ((j)object2).h;
        ((j)object2).h = object = this.h((androidx.media3.common.g)object, yM1);
        return (n3 ^ 1) != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean u(androidx.media3.common.g var1_1, long var2_2, long var4_3) {
        block7: {
            var6_4 = this;
            var7_5 = var1_1;
            var8_6 = this.j;
            var9_7 = false;
            var10_8 = null;
            while (true) {
                block8: {
                    var11_10 = true;
                    if (var8_6 == null) break block7;
                    var12_11 = var8_6.h;
                    if (var10_8 == null) {
                        var10_8 = this.h((androidx.media3.common.g)var7_5, var12_11);
                    } else {
                        var13_12 = this.d((androidx.media3.common.g)var7_5, (j)var10_8, var2_2);
                        if (var13_12 == null) {
                            return this.o((j)var10_8) ^ var11_10;
                        }
                        var14_13 = var12_11.b;
                        var16_14 = var13_12.b;
                        cfr_temp_0 = var14_13 - var16_14;
                        var18_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var18_15 /* !! */  != false || !(var21_18 = (var19_16 = var12_11.a).equals(var20_17 = var13_12.a))) break;
                        var10_8 = var13_12;
                    }
                    var22_19 = var12_11.c;
                    var8_6.h = var13_12 = var10_8.a(var22_19);
                    var22_19 = -9223372036854775807L;
                    var24_20 = var12_11.e;
                    var26_21 = var24_20 == var22_19 ? 0 : (var24_20 < var22_19 ? -1 : 1);
                    if (var26_21 == false || !(var9_7 = (cfr_temp_1 = var24_20 - (var27_22 = var10_8.e)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) break block8;
                    var8_6.k();
                    var29_23 = var27_22 == var22_19 ? 0 : (var27_22 < var22_19 ? -1 : 1);
                    var30_24 = var29_23 == false ? 0x7FFFFFFFFFFFFFFFL : var8_6.q + var27_22;
                    var7_5 = var6_4.k;
                    var9_7 = false;
                    var10_8 = null;
                    if (var8_6 != var7_5) ** GOTO lbl-1000
                    var7_5 = var8_6.h;
                    var29_23 = (long)var7_5.f;
                    if (var29_23 == false && ((var29_23 = (cfr_temp_2 = var4_3 - (var32_25 = -9223372036854775808L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false || (var29_23 = var4_3 == var30_24 ? 0 : (var4_3 < var30_24 ? -1 : 1)) >= 0)) {
                        var29_23 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var29_23 = 0;
                        var7_5 = null;
                    }
                    var34_26 = this.o(var8_6);
                    if (var34_26 || var29_23 != false) {
                        var11_10 = false;
                    }
                    return var11_10;
                }
                var35_9 = var8_6.n;
                var10_8 = var8_6;
                var8_6 = var35_9;
            }
            return this.o((j)var10_8) ^ var11_10;
        }
        return var11_10;
    }
}

