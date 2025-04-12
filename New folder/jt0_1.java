/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.extractor.flv.TagPayloadReader;
import androidx.media3.extractor.flv.a;
import androidx.media3.extractor.flv.b;
import com.google.common.collect.ImmutableList;

/*
 * Renamed from JT0
 */
public final class jt0_1
implements eI0 {
    public final Xm2 a;
    public final Xm2 b;
    public final Xm2 c;
    public final Xm2 d;
    public final bt2_1 e;
    public gi0_0 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public b p;

    public jt0_1() {
        Object object = new Xm2(4);
        this.a = object;
        object = new Xm2(9);
        this.b = object;
        object = new Xm2(11);
        this.c = object;
        object = new Xm2();
        this.d = object;
        Object object2 = new jq0_0();
        object = new TagPayloadReader((wp3)object2);
        ((bt2_1)object).b = -9223372036854775807L;
        long[] lArray = new long[]{};
        ((bt2_1)object).c = lArray;
        object2 = new long[0];
        ((bt2_1)object).d = (long[])object2;
        this.e = object;
        this.g = 1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        var3_3 = this;
        var4_4 = this.f;
        ct3.h(var4_4);
        while (true) {
            block23: {
                block24: {
                    block25: {
                        block26: {
                            block22: {
                                block29: {
                                    block28: {
                                        block27: {
                                            var5_5 /* !! */  = var3_3.g;
                                            var6_6 = 4;
                                            var7_7 = 0;
                                            var8_8 = null;
                                            var9_9 = 1;
                                            var10_10 = -1;
                                            var11_11 = 9;
                                            var12_12 = 8;
                                            var13_13 = 2;
                                            if (var5_5 /* !! */  == var9_9) break block23;
                                            var14_14 = 3;
                                            if (var5_5 /* !! */  == var13_13) break block24;
                                            if (var5_5 /* !! */  == var14_14) break block25;
                                            if (var5_5 /* !! */  != var6_6) break block26;
                                            var5_5 /* !! */  = (int)var3_3.h;
                                            var15_15 = -9223372036854775807L;
                                            var17_16 = var3_3.e;
                                            if (var5_5 /* !! */  != 0) {
                                                var18_17 = var3_3.i;
                                                var20_18 = var3_3.m;
                                                var18_17 += var20_18;
                                            } else {
                                                var20_18 = var17_16.b;
                                                cfr_temp_0 = var20_18 - var15_15;
                                                var5_5 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                var18_17 = var5_5 /* !! */  == 0 ? 0L : var3_3.m;
                                            }
                                            var5_5 /* !! */  = var3_3.k;
                                            if (var5_5 /* !! */  == var12_12 && (var22_19 = var3_3.o) != null) {
                                                var5_5 /* !! */  = (int)var3_3.n;
                                                if (var5_5 /* !! */  == 0) {
                                                    var4_4 = var3_3.f;
                                                    var23_20 /* !! */  = (byte[])new dX2$b;
                                                    var23_20 /* !! */ (var15_15);
                                                    var4_4.h((dx2_1)var23_20 /* !! */ );
                                                    var3_3.n = var9_9;
                                                }
                                                var4_4 = var3_3.o;
                                                var23_20 /* !! */  = (byte[])var1_1;
                                                var23_20 /* !! */  = (byte[])((il0_0)var1_1);
                                                var23_20 /* !! */  = (byte[])this.d((il0_0)var23_20 /* !! */ );
                                                var4_4.a((Xm2)var23_20 /* !! */ );
                                                var5_5 /* !! */  = (int)var4_4.b(var18_17, (Xm2)var23_20 /* !! */ );
lbl47:
                                                // 3 sources

                                                while (true) {
                                                    var11_11 = 1;
                                                    break block22;
                                                    break;
                                                }
                                            }
                                            if (var5_5 /* !! */  != var11_11 || (var23_20 /* !! */  = (byte[])var3_3.p) == null) break block27;
                                            var5_5 /* !! */  = (int)var3_3.n;
                                            if (var5_5 /* !! */  == 0) {
                                                var4_4 = var3_3.f;
                                                var23_20 /* !! */  = (byte[])new dX2$b;
                                                var23_20 /* !! */ (var15_15);
                                                var4_4.h((dx2_1)var23_20 /* !! */ );
                                                var3_3.n = var9_9;
                                            }
                                            var4_4 = var3_3.p;
                                            var23_20 /* !! */  = (byte[])var1_1;
                                            var23_20 /* !! */  = (byte[])((il0_0)var1_1);
                                            var12_12 = (int)var4_4.a((Xm2)(var23_20 /* !! */  = (byte[])this.d((il0_0)var23_20 /* !! */ )));
                                            if (var12_12 == 0 || (var5_5 /* !! */  = (int)var4_4.b(var18_17, (Xm2)var23_20 /* !! */ )) == 0) break block28;
                                            var5_5 /* !! */  = 1;
                                            ** GOTO lbl47
                                        }
                                        var11_11 = 18;
                                        if (var5_5 /* !! */  != var11_11 || (var5_5 /* !! */  = (int)var3_3.n) != 0) break block29;
                                        var4_4 = var1_1;
                                        var4_4 = (il0_0)var1_1;
                                        var4_4 = this.d((il0_0)var4_4);
                                        var17_16.getClass();
                                        var17_16.a(var18_17, (Xm2)var4_4);
                                        var24_21 = var17_16.b;
                                        var5_5 /* !! */  = (int)(var24_21 == var15_15 ? 0 : (var24_21 < var15_15 ? -1 : 1));
                                        if (var5_5 /* !! */  != 0) {
                                            var4_4 = var3_3.f;
                                            var27_23 = var17_16.d;
                                            var28_24 = var17_16.c;
                                            var26_22 = new hg1_0(var27_23, var28_24, var24_21);
                                            var4_4.h(var26_22);
                                            var3_3.n = var9_9;
                                        }
                                    }
                                    var5_5 /* !! */  = 0;
                                    var4_4 = null;
                                    ** continue;
                                }
                                var5_5 /* !! */  = var3_3.l;
                                var23_20 /* !! */  = (byte[])var1_1;
                                ((il0_0)var1_1).j(var5_5 /* !! */ );
                                var5_5 /* !! */  = 0;
                                var4_4 = null;
                                var11_11 = 0;
                                var23_20 /* !! */  = null;
                            }
                            var12_12 = (int)var3_3.h;
                            if (var12_12 == 0 && var5_5 /* !! */  != 0) {
                                var3_3.h = var9_9;
                                var29_25 = var17_16.b;
                                cfr_temp_1 = var29_25 - var15_15;
                                var5_5 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var5_5 /* !! */  == 0) {
                                    var29_25 = var3_3.m;
                                    var20_18 = -var29_25;
                                } else {
                                    var20_18 = 0L;
                                }
                                var3_3.i = var20_18;
                            }
                            var3_3.j = var6_6;
                            var3_3.g = var13_13;
                            if (var11_11 == 0) continue;
                            return 0;
                        }
                        var4_4 = new IllegalStateException();
                        throw var4_4;
                    }
                    var4_4 = var3_3.c;
                    var23_20 /* !! */  = var4_4.a;
                    var12_12 = 11;
                    var31_26 = var1_1;
                    var31_26 = (il0_0)var1_1;
                    if ((var9_9 = var31_26.e(var23_20 /* !! */ , 0, var12_12, (boolean)var9_9)) == 0) {
                        return var10_10;
                    }
                    var4_4.I(0);
                    var3_3.k = var7_7 = var4_4.w();
                    var3_3.l = var7_7 = var4_4.z();
                    var3_3.m = var32_27 = (long)var4_4.z();
                    var7_7 = var4_4.w() << 24;
                    var32_27 = var7_7;
                    var34_28 = var3_3.m;
                    var32_27 |= var34_28;
                    var34_28 = 1000L;
                    var3_3.m = var32_27 *= var34_28;
                    var4_4.J(var14_14);
                    var3_3.g = var6_6;
                    continue;
                }
                var5_5 /* !! */  = var3_3.j;
                var36_29 = var1_1;
                var36_29 = (il0_0)var1_1;
                var36_29.j(var5_5 /* !! */ );
                var3_3.j = 0;
                var3_3.g = var14_14;
                continue;
            }
            var4_4 = var3_3.b;
            var37_30 = var4_4.a;
            var38_31 = var1_1;
            var38_31 = (il0_0)var1_1;
            var14_14 = var38_31.e(var37_30, 0, var11_11, (boolean)var9_9);
            if (var14_14 == 0) {
                return var10_10;
            }
            var4_4.I(0);
            var4_4.J(var6_6);
            var6_6 = var4_4.w();
            var10_10 = var6_6 & 4;
            if (var10_10 != 0) {
                var10_10 = 1;
            } else {
                var10_10 = 0;
                var17_16 = null;
            }
            if ((var6_6 &= 1) != 0) {
                var7_7 = 1;
            }
            if (var10_10 != 0 && (var36_29 = var3_3.o) == null) {
                var17_16 = var3_3.f;
                var39_32 = var17_16.n(var12_12, var9_9);
                var3_3.o = var36_29 = new TagPayloadReader(var39_32);
            }
            if (var7_7 != 0 && (var36_29 = var3_3.p) == null) {
                var8_8 = var3_3.f.n(var11_11, var13_13);
                var3_3.p = var36_29 = new b(var8_8);
            }
            var36_29 = var3_3.f;
            var36_29.j();
            var3_3.j = var5_5 /* !! */  = var4_4.i() + -5;
            var3_3.g = var13_13;
        }
    }

    public final boolean b(fi0_0 fi0_02) {
        Xm2 xm2 = this.a;
        byte[] byArray = xm2.a;
        fi0_02 = (il0_0)fi0_02;
        boolean bl2 = false;
        ((il0_0)fi0_02).b(byArray, 0, 3, false);
        xm2.I(0);
        int n3 = xm2.z();
        int n4 = 4607062;
        if (n3 != n4) {
            return false;
        }
        byArray = xm2.a;
        n4 = 2;
        ((il0_0)fi0_02).b(byArray, 0, n4, false);
        xm2.I(0);
        n3 = xm2.C() & 0xFA;
        if (n3 != 0) {
            return false;
        }
        byArray = xm2.a;
        n4 = 4;
        ((il0_0)fi0_02).b(byArray, 0, n4, false);
        xm2.I(0);
        n3 = xm2.i();
        ((il0_0)fi0_02).f = 0;
        ((il0_0)fi0_02).l(n3, false);
        byArray = xm2.a;
        ((il0_0)fi0_02).b(byArray, 0, n4, false);
        xm2.I(0);
        int n7 = xm2.i();
        if (n7 == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            int n3;
            this.g = n3 = 1;
            this.h = false;
        } else {
            int n4;
            this.g = n4 = 3;
        }
        this.j = 0;
    }

    public final Xm2 d(il0_0 il0_02) {
        byte[] byArray;
        int n3;
        int n4 = this.l;
        Xm2 xm2 = this.d;
        byte[] byArray2 = xm2.a;
        int n7 = byArray2.length;
        if (n4 > n7) {
            n3 = byArray2.length * 2;
            n4 = Math.max(n3, n4);
            byArray = new byte[n4];
            xm2.G(0, byArray);
        } else {
            xm2.I(0);
        }
        n4 = this.l;
        xm2.H(n4);
        byArray = xm2.a;
        n3 = this.l;
        il0_02.e(byArray, 0, n3, false);
        return xm2;
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.f = gi0_02;
    }

    public final void release() {
    }
}

