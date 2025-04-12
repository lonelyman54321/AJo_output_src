/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public final class m72
implements eI0 {
    public gi0_0 a;
    public zd3_0 b;
    public boolean c;

    /*
     * Unable to fully structure code
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block18: {
            block19: {
                block20: {
                    block22: {
                        block21: {
                            var3_3 = this;
                            ct3.h(this.a);
                            var4_4 = this.b;
                            var5_5 = 0;
                            var6_6 = null;
                            if (var4_4 == null) {
                                var4_4 = var1_1;
                                var4_4 = (il0_0)var1_1;
                                var7_7 = this.d((il0_0)var4_4);
                                if (var7_7 != 0) {
                                    var4_4.f = 0;
                                } else {
                                    throw ParserException.a("Failed to determine bitstream type", null);
                                }
                            }
                            var8_8 = var3_3.c;
                            var7_7 = 1;
                            if (!var8_8) {
                                var4_4 = var3_3.a.n(0, var7_7);
                                var3_3.a.j();
                                var9_9 = var3_3.b;
                                var9_9.c = var10_10 = var3_3.a;
                                var9_9.b = var4_4;
                                var9_9.d((boolean)var7_7);
                                var3_3.c = var7_7;
                            }
                            var4_4 = var3_3.b;
                            var9_9 = var4_4.b;
                            ct3.h(var9_9);
                            var11_11 = gz3.a;
                            var11_11 = var4_4.h;
                            var10_10 = var4_4.a;
                            var12_12 = -1;
                            var14_13 = -1;
                            var15_14 = 3;
                            var16_15 = 2;
                            if (var11_11 == 0) break block19;
                            if (var11_11 == var7_7) break block20;
                            if (var11_11 != var16_15) {
                                if (var11_11 == var15_14) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        var5_5 = -1;
                                        break block18;
                                        break;
                                    }
                                }
                                var4_4 = new IllegalStateException();
                                throw var4_4;
                            }
                            var9_9 = var4_4.d;
                            var17_16 = var1_1;
                            var17_16 = (il0_0)var1_1;
                            var18_17 = var9_9.a((il0_0)var17_16);
                            cfr_temp_0 = var18_17 - (var20_18 = 0L);
                            var11_11 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var11_11 < 0) break block21;
                            var9_9 = var2_2;
                            var2_2.a = var18_17;
                            var5_5 = 1;
                            break block18;
                        }
                        var11_11 = (int)(var18_17 == var12_12 ? 0 : (var18_17 < var12_12 ? -1 : 1));
                        if (var11_11 < 0) {
                            var22_19 = 2;
                            var18_17 = -(var18_17 + var22_19);
                            var4_4.a(var18_17);
                        }
                        if ((var11_11 = (int)var4_4.l) == 0) {
                            var9_9 = var4_4.d.b();
                            ct3.h(var9_9);
                            var24_20 = var4_4.c;
                            var24_20.h((dx2_1)var9_9);
                            var4_4.l = var7_7;
                        }
                        if ((var27_23 = (cfr_temp_1 = (var25_21 = var4_4.k) - var20_18) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) > 0 || (var7_7 = (int)var10_10.b((il0_0)var17_16)) != 0) break block22;
                        var4_4.h = var15_14;
                        ** GOTO lbl-1000
                    }
                    var4_4.k = var20_18;
                    var28_24 = var10_10.b;
                    var29_28 = var4_4.b(var28_24);
                    cfr_temp_2 = var29_28 - var20_18;
                    var14_13 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var14_13 >= 0 && (var16_15 = (int)((cfr_temp_3 = (var33_32 = (var31_30 = var4_4.g) + var29_28) - (var35_34 = var4_4.e)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) >= 0) {
                        var37_36 = var4_4.i;
                        var33_32 = var37_36;
                        var20_18 = (var31_30 *= 1000000L) / var33_32;
                        var38_38 = var4_4.b;
                        var15_14 = var28_24.c;
                        var38_38.f(var15_14, var28_24);
                        var39_40 = var4_4.b;
                        var7_7 = var28_24.c;
                        var40_41 = 1;
                        var41_42 = var7_7;
                        var39_40.a(var20_18, var40_41, var7_7, 0, null);
                        var4_4.e = var12_12;
                    }
                    var4_4.g = var12_12 = var4_4.g + var29_28;
                    break block18;
                }
                var25_22 = var4_4.f;
                var11_11 = (int)var25_22;
                var28_25 = var1_1;
                var28_25 = (il0_0)var1_1;
                var28_25.j(var11_11);
                var4_4.h = var16_15;
                break block18;
            }
            while (true) {
                var9_9 = var1_1;
                var9_9 = (il0_0)var1_1;
                var37_37 = var10_10.b((il0_0)var9_9);
                if (!var37_37) {
                    var4_4.h = var15_14;
                    ** continue;
                }
                var33_33 = var9_9.d;
                var35_35 = var4_4.f;
                var4_4.k = var33_33 -= var35_35;
                var42_44 = var10_10.b;
                var9_9 = var4_4.j;
                var11_11 = (int)var4_4.c(var42_44, var35_35, (Zd3$a)var9_9);
                if (var11_11 == 0) break;
                var9_9 = var1_1;
                var9_9 = (il0_0)var1_1;
                var4_4.f = var33_33 = var9_9.d;
            }
            var9_9 = var4_4.j.a;
            var4_4.i = var14_13 = var9_9.E;
            var14_13 = (int)var4_4.m;
            if (var14_13 == 0) {
                var38_39 = var4_4.b;
                var38_39.d((d)var9_9);
                var4_4.m = var7_7;
            }
            if ((var9_9 = var4_4.j.b) != null) {
                var4_4.d = var9_9;
lbl126:
                // 2 sources

                while (true) {
                    var43_45 = var42_44;
                    var5_5 = 2;
                    break;
                }
            } else {
                var9_9 = var1_1;
                var9_9 = (il0_0)var1_1;
                var33_33 = var9_9.c;
                cfr_temp_4 = var33_33 - var12_12;
                var11_11 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                if (var11_11 == 0) {
                    var28_26 = new Object();
                    var4_4.d = var28_26;
                    ** continue;
                }
                var9_9 = var10_10.a;
                var44_46 = var9_9.a & 4;
                var41_43 = var44_46 != 0;
                var31_31 = var4_4.f;
                var44_46 = var9_9.d;
                var45_47 = var9_9.e;
                var35_35 = var44_46 += var45_47;
                var29_29 = var9_9.b;
                var43_45 = var42_44;
                var5_5 = 2;
                var28_27 = new ym0_1((zd3_0)var4_4, var31_31, var33_33, var35_35, var29_29, var41_43);
                var4_4.d = var28_27;
            }
            var4_4.h = var5_5;
            var4_4 = var43_45;
            var6_6 = var43_45.a;
            var7_7 = var6_6.length;
            var11_11 = 65025;
            if (var7_7 != var11_11) {
                var7_7 = var43_45.c;
                var7_7 = Math.max(var11_11, var7_7);
                var6_6 = Arrays.copyOf(var6_6, var7_7);
                var7_7 = var43_45.c;
                var43_45.G(var7_7, var6_6);
            }
            var5_5 = 0;
            var6_6 = null;
        }
        return var5_5;
    }

    public final boolean b(fi0_0 fi0_02) {
        try {
            fi0_02 = (il0_0)fi0_02;
        }
        catch (ParserException parserException) {
            return false;
        }
        return this.d((il0_0)fi0_02);
    }

    public final void c(long l2, long l3) {
        zd3_0 zd3_02 = this.b;
        if (zd3_02 != null) {
            int n3;
            long l4;
            o72 o722 = zd3_02.a;
            Object object = o722.a;
            ((p72)object).a = 0;
            ((p72)object).b = l4 = 0L;
            ((p72)object).c = 0;
            ((p72)object).d = 0;
            ((p72)object).e = 0;
            object = o722.b;
            ((Xm2)object).F(0);
            o722.c = n3 = -1;
            o722.e = false;
            long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (l7 == false) {
                boolean bl2 = zd3_02.l ^ true;
                zd3_02.d(bl2);
            } else {
                int n4 = zd3_02.h;
                if (n4 != 0) {
                    l2 = (long)zd3_02.i * l3;
                    l3 = 1000000L;
                    zd3_02.e = l2 /= l3;
                    q72 q722 = zd3_02.d;
                    q722.c(l2);
                    zd3_02.h = n4 = 2;
                }
            }
        }
    }

    public final boolean d(il0_0 object) {
        block4: {
            boolean bl2;
            block6: {
                int n3;
                Xm2 xm2;
                block7: {
                    block5: {
                        long l2;
                        long l3;
                        long l4;
                        p72 p722 = new p72();
                        bl2 = true;
                        int n4 = p722.a((il0_0)object, bl2);
                        if (n4 == 0) break block4;
                        n4 = p722.a;
                        int n7 = 2;
                        if ((n4 &= n7) != n7) break block4;
                        int n8 = p722.e;
                        n4 = 8;
                        n8 = Math.min(n8, n4);
                        xm2 = new Xm2(n8);
                        byte[] byArray = xm2.a;
                        ((il0_0)object).b(byArray, 0, n8, false);
                        xm2.I(0);
                        n3 = xm2.a();
                        n8 = 5;
                        if (n3 < n8 || (n3 = xm2.w()) != (n8 = 127) || (n3 = (int)((l4 = (l3 = xm2.y()) - (l2 = 1179402563L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) break block5;
                        this.b = object = new zd3_0();
                        break block6;
                    }
                    xm2.I(0);
                    try {
                        n3 = (int)(KE3.d((int)(bl2 ? 1 : 0), xm2, bl2) ? 1 : 0);
                    }
                    catch (ParserException parserException) {
                        n3 = 0;
                        object = null;
                    }
                    if (n3 == 0) break block7;
                    this.b = object = new zd3_0();
                    break block6;
                }
                xm2.I(0);
                object = da2.o;
                n3 = (int)(da2.e(xm2, (byte[])object) ? 1 : 0);
                if (n3 == 0) break block4;
                this.b = object = new zd3_0();
            }
            return bl2;
        }
        return false;
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.a = gi0_02;
    }

    public final void release() {
    }
}

