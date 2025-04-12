/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from rU1
 */
public final class ru1_0
extends LP1$c
implements yr3_0,
oU1 {
    public oU1 n;
    public pU1 o;
    public final String p;

    public ru1_0(oU1 oU12, pU1 pU12) {
        this.n = oU12;
        if (pU12 == null) {
            pU12 = new pU1();
        }
        this.o = pU12;
        this.p = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final void j1() {
        pU1 pU12 = this.o;
        pU12.a = this;
        Object object = new su1_0(this, 0);
        pU12.b = object;
        pU12 = this.o;
        pU12.c = object = this.f1();
    }

    public final void k1() {
        pU1 pU12 = this.o;
        ru1_0 ru1_02 = pU12.a;
        if (ru1_02 == this) {
            ru1_02 = null;
            pU12.a = null;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Object onPostFling-RZ2iAVY(long var1_1, long var3_2, f80_0 var5_3) {
        block11: {
            block8: {
                block9: {
                    block10: {
                        var6_4 = this;
                        var7_5 = var5_3;
                        var8_6 = var5_3 instanceof ru1$a_0;
                        if (!var8_6) ** GOTO lbl-1000
                        var9_7 = var5_3;
                        var9_7 = (ru1$a_0)var5_3;
                        var10_8 = var9_7.f;
                        var11_9 = -1 << -1;
                        var12_10 = var10_8 & var11_9;
                        if (var12_10 != 0) {
                            var9_7.f = var10_8 -= var11_9;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_7 = new ru1$a_0(this, (f80_0)var7_5);
                        }
                        var7_5 = var9_7.d;
                        var13_11 = j90_0.COROUTINE_SUSPENDED;
                        var10_8 = var9_7.f;
                        var14_12 = 2;
                        var11_9 = 1;
                        if (var10_8 == 0) break block8;
                        if (var10_8 == var11_9) break block9;
                        if (var10_8 != var14_12) break block10;
                        var15_13 = var9_7.b;
                        vl2_2.b(var7_5);
                        ** GOTO lbl75
                    }
                    var7_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var7_5;
                }
                var17_14 = var9_7.c;
                var19_15 = var9_7.b;
                var21_16 = var9_7.a;
                vl2_2.b(var7_5);
                var22_17 = var17_14;
                var24_18 = var19_15;
                break block11;
            }
            vl2_2.b(var7_5);
            var26_19 = var6_4.n;
            var9_7.a = var6_4;
            var24_18 = var1_1;
            var9_7.b = var1_1;
            var22_17 = var3_2;
            var9_7.c = var3_2;
            var9_7.f = var11_9;
            var27_20 = var1_1;
            var29_21 = var3_2;
            var7_5 = var26_19.onPostFling-RZ2iAVY(var1_1, var3_2, var9_7);
            if (var7_5 == var13_11) {
                return var13_11;
            }
            var21_16 = var6_4;
        }
        var7_5 = (WA3)var7_5;
        var27_20 = var7_5.a;
        var31_22 = var21_16.m;
        var10_8 = 0;
        var26_19 = null;
        if (var31_22 && var31_22) {
            var7_5 = (ru1_0)Zr3.b(var21_16);
        } else {
            var31_22 = false;
            var7_5 = null;
        }
        if (var7_5 != null) {
            var29_21 = WA3.e(var24_18, var27_20);
            var24_18 = WA3.d(var22_17, var27_20);
            var9_7.a = null;
            var9_7.b = var27_20;
            var9_7.f = var14_12;
            var26_19 = var7_5;
            var22_17 = var27_20;
            var27_20 = var29_21;
            var29_21 = var24_18;
            if ((var7_5 = var7_5.onPostFling-RZ2iAVY(var27_20, var24_18, var9_7)) == var13_11) {
                return var13_11;
            }
            var15_13 = var22_17;
lbl75:
            // 2 sources

            var7_5 = (WA3)var7_5;
            var27_20 = var7_5.a;
            var22_17 = var15_13;
        } else {
            var22_17 = var27_20;
            var27_20 = 0L;
        }
        var32_23 = WA3.e(var22_17, var27_20);
        var26_19 = new WA3(var32_23);
        return var26_19;
    }

    public final long onPostScroll-DzOQY0M(long l2, long l3, int n3) {
        oU1 oU12 = this.n;
        long l4 = oU12.onPostScroll-DzOQY0M(l2, l3, n3);
        boolean bl2 = this.m;
        yr3_0 yr3_02 = null;
        if (bl2 && bl2) {
            yr3_0 yr3_03;
            yr3_02 = yr3_03 = Zr3.b(this);
            yr3_02 = (ru1_0)yr3_03;
        }
        if (yr3_02 != null) {
            long l7 = e72.i(l2, l4);
            long l8 = e72.h(l3, l4);
            l2 = ((ru1_0)yr3_02).onPostScroll-DzOQY0M(l7, l8, n3);
        } else {
            l2 = 0L;
        }
        return e72.i(l4, l2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object onPreFling-QWom1Mo(long var1_1, f80_0 var3_2) {
        block13: {
            block15: {
                block14: {
                    block10: {
                        block11: {
                            block12: {
                                var4_3 = var3_2 instanceof rU1$b;
                                if (!var4_3) ** GOTO lbl-1000
                                var5_4 = var3_2;
                                var5_4 = (rU1$b)var3_2;
                                var6_5 = var5_4.e;
                                var7_6 = -1 << -1;
                                var8_7 = var6_5 & var7_6;
                                if (var8_7 != 0) {
                                    var5_4.e = var6_5 -= var7_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var5_4 = new rU1$b(this, (f80_0)var3_2);
                                }
                                var3_2 = var5_4.c;
                                var9_8 = j90_0.COROUTINE_SUSPENDED;
                                var7_6 = var5_4.e;
                                var8_7 = 0;
                                var10_9 = 2;
                                var11_10 = 1;
                                if (var7_6 == 0) break block10;
                                if (var7_6 == var11_10) break block11;
                                if (var7_6 != var10_9) break block12;
                                var1_1 = var5_4.b;
                                vl2_2.b(var3_2);
                                break block13;
                            }
                            var12_11 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var12_11;
                        }
                        var1_1 = var5_4.b;
                        var13_12 = var5_4.a;
                        vl2_2.b(var3_2);
                        break block14;
                    }
                    vl2_2.b(var3_2);
                    var14_13 = this.m;
                    if (var14_13 && var14_13) {
                        var3_2 = (ru1_0)Zr3.b(this);
                    } else {
                        var14_13 = false;
                        var3_2 = null;
                    }
                    if (var3_2 == null) break block15;
                    var5_4.a = this;
                    var5_4.b = var1_1;
                    var5_4.e = var11_10;
                    if ((var3_2 = var3_2.onPreFling-QWom1Mo(var1_1, var5_4)) == var9_8) {
                        return var9_8;
                    }
                    var13_12 = this;
                }
                var3_2 = (WA3)var3_2;
                var15_14 = var3_2.a;
lbl50:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var15_14 = 0L;
            var13_12 = this;
            ** while (true)
            var17_15 = var1_1;
            var1_1 = var15_14;
            var15_14 = var17_15;
            var3_2 = var13_12.n;
            var15_14 = WA3.d(var17_15, var1_1);
            var5_4.a = null;
            var5_4.b = var1_1;
            var5_4.e = var10_9;
            var3_2 = var3_2.onPreFling-QWom1Mo(var15_14, var5_4);
            if (var3_2 == var9_8) {
                return var9_8;
            }
        }
        var19_16 = ((WA3)var3_2).a;
        var1_1 = WA3.e(var1_1, var19_16);
        var3_2 = new WA3(var1_1);
        return var3_2;
    }

    public final long onPreScroll-OzD1aCk(long l2, int n3) {
        boolean bl2 = this.m;
        yr3_0 yr3_02 = null;
        if (bl2 && bl2) {
            yr3_0 yr3_03 = Zr3.b(this);
            yr3_02 = yr3_03;
            yr3_02 = (ru1_0)yr3_03;
        }
        long l3 = yr3_02 != null ? yr3_02.onPreScroll-OzD1aCk(l2, n3) : 0L;
        oU1 oU12 = this.n;
        l2 = e72.h(l2, l3);
        l2 = oU12.onPreScroll-OzD1aCk(l2, n3);
        return e72.i(l3, l2);
    }

    public final i90_0 r1() {
        Object object;
        block7: {
            block6: {
                block5: {
                    boolean bl2 = this.m;
                    if (bl2) {
                        object = (ru1_0)Zr3.b(this);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object == null) break block5;
                    object = ((ru1_0)object).r1();
                    break block6;
                }
                object = this.o.c;
                if (object == null) break block7;
            }
            return object;
        }
        object = new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        throw object;
    }

    public final Object v() {
        return this.p;
    }
}

