/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.media3.common.d;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.Objects;

public final class zn0$a
extends zn0$h
implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final zn0$d h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public zn0$a(int var1_1, qp3 var2_2, int var3_3, zn0$d var4_4, int var5_5, boolean var6_6, yn0_0 var7_7, int var8_8) {
        block36: {
            block38: {
                block37: {
                    block35: {
                        block34: {
                            block33: {
                                var9_9 = 2;
                                var10_10 = -1;
                                var11_11 = 0;
                                var12_12 = 1;
                                super(var1_1, (qp3)var2_2 /* !! */ , var3_3);
                                this.h = var4_4;
                                var1_1 = (int)var4_4.M;
                                var1_1 = var1_1 != 0 ? 24 : 16;
                                var13_13 = var4_4.I;
                                if (var13_13 != 0 && (var13_13 = var8_8 & var1_1) != 0) {
                                    var13_13 = 1;
                                } else {
                                    var13_13 = 0;
                                    var2_2 /* !! */  = null;
                                }
                                this.m = var13_13;
                                var2_2 /* !! */  = zn0.l(this.d.d);
                                this.g = var2_2 /* !! */ ;
                                var13_13 = (int)tj2_0.d(var5_5, false);
                                this.i = var13_13;
                                var13_13 = 0;
                                var2_2 /* !! */  = null;
                                while (true) {
                                    var14_14 = var4_4.n;
                                    var8_8 = var14_14.size();
                                    var15_15 = -1 >>> 1;
                                    if (var13_13 >= var8_8) break;
                                    var16_16 = this.d;
                                    var3_3 = zn0.j((d)var16_16, (String)(var14_14 = (String)var14_14.get(var13_13)), false);
                                    if (var3_3 <= 0) {
                                        var13_13 += var12_12;
                                        continue;
                                    }
                                    break block33;
                                    break;
                                }
                                var13_13 = -1 >>> 1;
                                var3_3 = 0;
                                var14_14 = null;
                            }
                            this.k = var13_13;
                            this.j = var3_3;
                            var13_13 = this.d.f;
                            var3_3 = var4_4.o;
                            this.l = var13_13 = zn0.h(var13_13, var3_3);
                            var2_2 /* !! */  = this.d;
                            var3_3 = var2_2 /* !! */ .f;
                            if (var3_3 != 0 && (var3_3 &= var12_12) == 0) {
                                var3_3 = 0;
                                var14_14 = null;
                            } else {
                                var3_3 = 1;
                            }
                            this.n = var3_3;
                            var3_3 = var2_2 /* !! */ .e & var12_12;
                            if (var3_3 != 0) {
                                var3_3 = 1;
                            } else {
                                var3_3 = 0;
                                var14_14 = null;
                            }
                            this.q = var3_3;
                            var2_2 /* !! */  = var2_2 /* !! */ .o;
                            if (var2_2 /* !! */  == null) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var13_13 = 0;
                                    var2_2 /* !! */  = null;
                                    break block34;
                                    break;
                                }
                            }
                            var3_3 = var2_2 /* !! */ .hashCode();
                            switch (var3_3) lbl-1000:
                            // 4 sources

                            {
                                default: {
                                    var13_13 = -1;
                                    break;
                                }
                                case 1504698186: {
                                    var14_14 = "audio/iamf";
                                    var13_13 = (int)var2_2 /* !! */ .equals(var14_14);
                                    if (var13_13 == 0) ** GOTO lbl-1000
                                    var13_13 = 2;
                                    break;
                                }
                                case 187078297: {
                                    var14_14 = "audio/ac4";
                                    var13_13 = (int)var2_2 /* !! */ .equals(var14_14);
                                    if (var13_13 == 0) ** GOTO lbl-1000
                                    var13_13 = 1;
                                    break;
                                }
                                case -2123537834: {
                                    var14_14 = "audio/eac3-joc";
                                    var13_13 = (int)var2_2 /* !! */ .equals(var14_14);
                                    if (var13_13 == 0) ** GOTO lbl-1000
                                    var13_13 = 0;
                                    var2_2 /* !! */  = null;
                                }
                            }
                            switch (var13_13) {
                                default: {
                                    ** continue;
                                }
                                case 0: 
                                case 1: 
                                case 2: 
                            }
                            var13_13 = 1;
                        }
                        this.x = var13_13;
                        var2_2 /* !! */  = this.d;
                        this.r = var3_3 = var2_2 /* !! */ .D;
                        this.s = var8_8 = var2_2 /* !! */ .E;
                        this.t = var8_8 = var2_2 /* !! */ .j;
                        if (!(var8_8 != var10_10 && var8_8 > (var17_17 = var4_4.q) || var3_3 != var10_10 && var3_3 > (var8_8 = var4_4.p) || (var13_13 = (int)var7_7.apply(var2_2 /* !! */ )) == 0)) {
                            var13_13 = 1;
                        } else {
                            var13_13 = 0;
                            var2_2 /* !! */  = null;
                        }
                        this.f = var13_13;
                        var2_2 /* !! */  = gz3.v();
                        var14_14 = null;
                        for (var3_3 = 0; var3_3 < (var18_18 = var2_2 /* !! */ .length); var3_3 += var12_12) {
                            var7_7 = this.d;
                            var16_16 = var2_2 /* !! */ [var3_3];
                            var18_18 = zn0.j((d)var7_7, (String)var16_16, false);
                            if (var18_18 <= 0) {
                                continue;
                            }
                            break block35;
                        }
                        var3_3 = -1 >>> 1;
                        var18_18 = 0;
                        var7_7 = null;
                    }
                    this.o = var3_3;
                    this.p = var18_18;
                    var2_2 /* !! */  = null;
                    for (var13_13 = 0; var13_13 < (var18_18 = (var14_14 = var4_4.r).size()); var13_13 += var12_12) {
                        var7_7 = this.d.o;
                        if (var7_7 == null || (var3_3 = (int)var7_7.equals(var14_14 = var14_14.get(var13_13))) == 0) continue;
                        var15_15 = var13_13;
                        break;
                    }
                    this.u = var15_15;
                    var13_13 = tj2_0.b(var5_5);
                    if (var13_13 == (var3_3 = 128)) {
                        var13_13 = 1;
                    } else {
                        var13_13 = 0;
                        var2_2 /* !! */  = null;
                    }
                    this.v = var13_13;
                    var13_13 = tj2_0.c(var5_5);
                    var3_3 = 64;
                    if (var13_13 == var3_3) {
                        var13_13 = 1;
                    } else {
                        var13_13 = 0;
                        var2_2 /* !! */  = null;
                    }
                    this.w = var13_13;
                    var2_2 /* !! */  = this.h;
                    var3_3 = (int)var2_2 /* !! */ .O;
                    var3_3 = (int)tj2_0.d(var5_5, (boolean)var3_3);
                    if (var3_3 == 0 || (var3_3 = (int)this.f) == 0 && !(var19_19 = var2_2 /* !! */ .H)) break block36;
                    var4_4 = var2_2 /* !! */ .s;
                    var4_4.getClass();
                    var19_19 = tj2_0.d(var5_5, false);
                    if (!var19_19 || var3_3 == 0) break block37;
                    var14_14 = this.d;
                    var3_3 = var14_14.j;
                    if (var3_3 != var10_10 && (var3_3 = (int)var2_2 /* !! */ .z) == 0 && (var3_3 = (int)var2_2 /* !! */ .y) == 0 && ((var13_13 = (int)var2_2 /* !! */ .Q) != 0 || !var6_6) && (var1_1 &= var5_5) != 0) break block38;
                }
                var9_9 = 1;
            }
            var11_11 = var9_9;
        }
        this.e = var11_11;
    }

    public final int a() {
        return this.e;
    }

    public final boolean b(zn0$h zn0$h) {
        int n3;
        int n4;
        int n7;
        String string2;
        String string3;
        int n8;
        zn0$h = (zn0$a)zn0$h;
        zn0$d zn0$d = this.h;
        int n10 = zn0$d.K;
        d d2 = zn0$h.d;
        int n14 = -1;
        d d5 = this.d;
        if (n10 == 0 && ((n10 = d5.D) == n14 || n10 != (n8 = d2.D)) || (n10 = (int)(this.m ? 1 : 0)) == 0 && ((string3 = d5.o) == null || (n10 = (int)(TextUtils.equals((CharSequence)string3, (CharSequence)(string2 = d2.o)) ? 1 : 0)) == 0) || (n10 = (int)(zn0$d.J ? 1 : 0)) == 0 && ((n10 = d5.E) == n14 || n10 != (n7 = d2.E)) || (n4 = zn0$d.L) == 0 && ((n10 = (int)(this.v ? 1 : 0)) != (n4 = ((zn0$a)zn0$h).v) || (n4 = (int)(this.w ? 1 : 0)) != (n3 = ((zn0$a)zn0$h).w))) {
            n3 = 0;
            zn0$h = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final int c(zn0$a object) {
        boolean bl2 = this.i;
        int n3 = this.f;
        Ordering ordering = n3 != 0 && bl2 ? zn0.j : zn0.j.reverse();
        Object object2 = ComparisonChain.start();
        int n4 = ((zn0$a)object).i;
        ComparisonChain comparisonChain = ((ComparisonChain)object2).compareFalseFirst(bl2, n4 != 0);
        object2 = this.k;
        Object object3 = ((zn0$a)object).k;
        Object object4 = Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(object2, object3, (Comparator)object4);
        int n7 = this.j;
        n4 = ((zn0$a)object).j;
        comparisonChain = comparisonChain.compare(n7, n4);
        n7 = this.l;
        n4 = ((zn0$a)object).l;
        comparisonChain = comparisonChain.compare(n7, n4);
        n7 = (int)(this.q ? 1 : 0);
        n4 = (int)(((zn0$a)object).q ? 1 : 0);
        comparisonChain = comparisonChain.compareFalseFirst(n7 != 0, n4 != 0);
        n7 = this.n;
        n4 = ((zn0$a)object).n;
        comparisonChain = comparisonChain.compareFalseFirst(n7 != 0, n4 != 0);
        object2 = this.o;
        object3 = ((zn0$a)object).o;
        object4 = Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(object2, object3, (Comparator)object4);
        n7 = this.p;
        n4 = ((zn0$a)object).p;
        comparisonChain = comparisonChain.compare(n7, n4);
        n7 = (int)(((zn0$a)object).f ? 1 : 0);
        comparisonChain = comparisonChain.compareFalseFirst(n3 != 0, n7 != 0);
        Object object5 = this.u;
        object2 = ((zn0$a)object).u;
        object3 = Ordering.natural().reverse();
        comparisonChain = comparisonChain.compare(object5, object2, (Comparator)object3);
        object5 = this.h;
        n3 = ((Fp3)object5).y;
        n7 = this.t;
        n4 = ((zn0$a)object).t;
        if (n3 != 0) {
            object5 = n7;
            object4 = n4;
            Ordering ordering2 = zn0.j.reverse();
            comparisonChain = comparisonChain.compare(object5, object4, ordering2);
        }
        n3 = this.v;
        int n8 = ((zn0$a)object).v;
        comparisonChain = comparisonChain.compareFalseFirst(n3 != 0, n8 != 0);
        n3 = this.w;
        n8 = ((zn0$a)object).w;
        comparisonChain = comparisonChain.compareFalseFirst(n3 != 0, n8 != 0);
        n3 = this.x;
        n8 = ((zn0$a)object).x;
        comparisonChain = comparisonChain.compareFalseFirst(n3 != 0, n8 != 0);
        object5 = this.r;
        object4 = ((zn0$a)object).r;
        comparisonChain = comparisonChain.compare(object5, object4, ordering);
        n3 = this.s;
        object5 = n3;
        n8 = ((zn0$a)object).s;
        object4 = n8;
        comparisonChain = comparisonChain.compare(object5, object4, ordering);
        object5 = this.g;
        object = ((zn0$a)object).g;
        boolean bl3 = Objects.equals(object5, object);
        if (bl3) {
            object = n7;
            object5 = n4;
            comparisonChain = comparisonChain.compare(object, object5, ordering);
        }
        return comparisonChain.result();
    }
}

