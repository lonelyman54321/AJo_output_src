/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParserException
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.common.collect.ImmutableList;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from Jl1
 */
public final class jl1_1
implements eI0 {
    public final Xm2 a;
    public gi0_0 b;
    public int c;
    public int d;
    public int e;
    public long f;
    public MotionPhotoMetadata g;
    public fi0_0 h;
    public vb3_0 i;
    public bq1_0 j;

    public jl1_1() {
        Xm2 xm2;
        this.a = xm2 = new Xm2(6);
        this.f = -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block30: {
            block26: {
                block27: {
                    block28: {
                        block29: {
                            block25: {
                                var3_3 = this;
                                var4_4 = var1_1;
                                var5_5 = var2_2;
                                var6_6 = -1;
                                var7_7 = 1;
                                var8_8 = null;
                                var9_9 = this.c;
                                var10_10 = -1;
                                var12_11 = this.a;
                                var13_12 = 4;
                                var14_13 = 2;
                                if (var9_9 == 0) break block26;
                                if (var9_9 == var7_7) break block27;
                                if (var9_9 != var14_13) {
                                    var15_14 = 5;
                                    if (var9_9 != var13_12) {
                                        if (var9_9 != var15_14) {
                                            var16_15 = 6;
                                            if (var9_9 == var16_15) {
                                                return var6_6;
                                            }
                                            var4_4 = new IllegalStateException();
                                            throw var4_4;
                                        }
                                        var17_21 /* !! */  = this.i;
                                        if (var17_21 /* !! */  == null || var1_1 != (var17_21 /* !! */  = this.h)) {
                                            var3_3.h = var4_4;
                                            var18_25 = var3_3.f;
                                            var4_4 = (il0_0)var4_4;
                                            var3_3.i = var17_21 /* !! */  = new vb3_0((il0_0)var4_4, var18_25);
                                        }
                                        var4_4 = var3_3.j;
                                        var4_4.getClass();
                                        var17_21 /* !! */  = var3_3.i;
                                        var16_16 = var4_4.a(var17_21 /* !! */ , (Pw2)var5_5);
                                        if (var16_16 == var7_7) {
                                            var20_26 = var5_5.a;
                                            var18_25 = var3_3.f;
                                            var5_5.a = var20_26 += var18_25;
                                        }
                                        return var16_16;
                                    }
                                    var17_22 = var1_1;
                                    var17_22 = (il0_0)var1_1;
                                    var22_27 = var17_22.d;
                                    var24_28 = this.f;
                                    cfr_temp_0 = var22_27 - var24_28;
                                    var6_6 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var6_6 != 0) {
                                        var2_2.a = var24_28;
                                        return var7_7;
                                    }
                                    var4_4 = (il0_0)var1_1;
                                    var5_5 = var12_11.a;
                                    var26_30 = var4_4.b((byte[])var5_5, 0, var7_7, (boolean)var7_7);
                                    if (!var26_30) {
                                        this.d();
                                    } else {
                                        var4_4.f = 0;
                                        var5_5 = this.j;
                                        if (var5_5 == null) {
                                            var17_22 = vf3$a_0.a;
                                            var9_9 = 8;
                                            this.j = var5_5 = new bq1_0(var9_9, (vf3$a_0)var17_22);
                                        }
                                        var27_33 = var3_3.f;
                                        var3_3.i = var5_5 = new vb3_0((il0_0)var4_4, var27_33);
                                        var4_4 = var3_3.j;
                                        var16_17 = var4_4.b((fi0_0)var5_5);
                                        if (var16_17) {
                                            var4_4 = var3_3.j;
                                            var27_33 = var3_3.f;
                                            var17_22 = var3_3.b;
                                            var17_22.getClass();
                                            var5_5 = new wb3_1(var27_33, (gi0_0)var17_22);
                                            var4_4.k((gi0_0)var5_5);
                                            var4_4 = var3_3.g;
                                            var4_4.getClass();
                                            var5_5 = var3_3.b;
                                            var5_5.getClass();
                                            var6_6 = 1024;
                                            var5_5 = var5_5.n(var6_6, var13_12);
                                            var17_22 = new d$a();
                                            var29_34 = ip1_0.l("image/jpeg");
                                            var17_22.m = var29_34;
                                            var30_36 = new Metadata$Entry[var7_7];
                                            var30_36[0] = var4_4;
                                            var17_22.k = var29_34 = new Metadata(var30_36);
                                            var4_4 = new d((d$a)var17_22);
                                            var5_5.d((d)var4_4);
                                            var3_3.c = var15_14;
                                        } else {
                                            this.d();
                                        }
                                    }
                                    return 0;
                                }
                                var26_31 = this.d;
                                var9_9 = (char)-31;
                                if (var26_31 != var9_9) break block28;
                                var9_9 = this.e;
                                var5_5 = new Xm2(var9_9);
                                var29_35 = var5_5.a;
                                var31_38 = this.e;
                                var32_39 = var1_1;
                                var32_39 = (il0_0)var1_1;
                                var32_39.e((byte[])var29_35, 0, var31_38, false);
                                var29_35 = this.g;
                                if (var29_35 != null || (var9_9 = (int)(var29_35 = (Object)"http://ns.adobe.com/xap/1.0/").equals(var12_11 = var5_5.r())) == 0 || (var5_5 = var5_5.r()) == null) break block29;
                                var4_4 = (il0_0)var1_1;
                                var33_40 = var4_4.c;
                                cfr_temp_1 = var33_40 - var10_10;
                                var9_9 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var9_9 == 0) lbl-1000:
                                // 3 sources

                                {
                                    while (true) {
                                        var16_18 /* !! */  = 0;
                                        var4_4 = null;
                                        break block25;
                                        break;
                                    }
                                }
                                try {
                                    var5_5 = uj3_0.a((String)var5_5);
                                }
                                catch (ParserException | NumberFormatException | XmlPullParserException v0) {
                                    Cx.f("Ignoring unexpected XMP metadata");
                                    var26_31 = 0;
                                    var5_5 = null;
                                }
                                if (var5_5 == null || (var35_41 = (var29_35 = var5_5.b).size()) < var14_13) ** GOTO lbl-1000
                                var14_13 = var29_35.size() - var7_7;
                                var24_29 = var10_10;
                                var36_42 = var10_10;
                                var38_43 = var10_10;
                                var40_44 = var10_10;
                                var7_7 = 0;
                                var30_37 = null;
                                while (var14_13 >= 0) {
                                    var42_45 = (qQ1$a)var29_35.get(var14_13);
                                    var4_4 = var42_45.a;
                                    var8_8 = "video/mp4";
                                    var16_18 /* !! */  = var8_8.equals(var4_4) | var7_7;
                                    if (var14_13 == 0) {
                                        var43_46 = var42_45.c;
                                        var33_40 -= var43_46;
                                        var43_46 = 0L;
lbl138:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var43_46 = var42_45.b;
                                    var43_46 = var33_40 - var43_46;
                                    ** continue;
                                    var45_47 = var43_46;
                                    var43_46 = var33_40;
                                    var33_40 = var45_47;
                                    if (var16_18 /* !! */  != 0 && (var35_41 = (int)(var45_47 == var43_46 ? 0 : (var45_47 < var43_46 ? -1 : 1))) != 0) {
                                        var40_44 = var43_46 - var45_47;
                                        var38_43 = var45_47;
                                        var16_18 /* !! */  = 0;
                                        var4_4 = null;
                                    }
                                    if (var14_13 == 0) {
                                        var36_42 = var43_46;
                                        var24_29 = var33_40;
                                    }
                                    var14_13 += var6_6;
                                    var7_7 = var16_18 /* !! */ ;
                                    var8_8 = null;
                                }
                                var16_18 /* !! */  = (int)(var38_43 == var10_10 ? 0 : (var38_43 < var10_10 ? -1 : 1));
                                if (var16_18 /* !! */  != 0 && (var16_18 /* !! */  = var40_44 == var10_10 ? 0 : (var40_44 < var10_10 ? -1 : 1)) != 0 && (var16_18 /* !! */  = (int)(var24_29 == var10_10 ? 0 : (var24_29 < var10_10 ? -1 : 1))) != 0 && (var16_18 /* !! */  = (int)(var36_42 == var10_10 ? 0 : (var36_42 < var10_10 ? -1 : 1))) != 0) ** break;
                                ** while (true)
                                var47_48 = var5_5.a;
                                var42_45 = var4_4;
                                var4_4 = new MotionPhotoMetadata(var24_29, var36_42, var47_48, var38_43, var40_44);
                            }
                            var3_3.g = var4_4;
                            if (var4_4 != null) {
                                var3_3.f = var49_49 = var4_4.d;
                            }
                        }
lbl169:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var26_31 = this.e;
                    var4_4 = (il0_0)var1_1;
                    var4_4.j(var26_31);
                    ** while (true)
                    var26_31 = 0;
                    var5_5 = null;
                    var3_3.c = 0;
                    return 0;
                }
                var12_11.F(var14_13);
                var17_23 = var12_11.a;
                ((il0_0)var1_1).e(var17_23, 0, var14_13, false);
                this.e = var16_19 = var12_11.C() - var14_13;
                this.c = var14_13;
                return 0;
            }
            var5_5 = null;
            var12_11.F(var14_13);
            var17_24 = var12_11.a;
            var4_4 = (il0_0)var1_1;
            var4_4.e(var17_24, 0, var14_13, false);
            this.d = var16_20 = var12_11.C();
            var26_32 = -38;
            if (var16_20 != var26_32) break block30;
            var49_50 = this.f;
            cfr_temp_2 = var49_50 - var10_10;
            var6_6 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
            if (var6_6 != 0) {
                this.c = var13_12;
lbl203:
                // 4 sources

                while (true) {
                    continue;
                    break;
                }
            }
            this.d();
            ** GOTO lbl203
        }
        var26_32 = (char)-48;
        if (var16_20 >= var26_32 && var16_20 <= (var26_32 = (int)((char)-39)) || var16_20 == (var26_32 = 65281)) ** GOTO lbl203
        var3_3.c = var7_7;
        ** while (true)
        var16_20 = 0;
        var4_4 = null;
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        fi0_02 = (il0_0)fi0_02;
        Xm2 xm2 = this.a;
        int n3 = 2;
        xm2.F(n3);
        byte[] byArray = xm2.a;
        boolean bl2 = false;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        int n4 = xm2.C();
        char c2 = (char)-40;
        if (n4 != c2) {
            return false;
        }
        xm2.F(n3);
        byArray = xm2.a;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        this.d = n4 = xm2.C();
        c2 = (char)-32;
        if (n4 == c2) {
            xm2.F(n3);
            byArray = xm2.a;
            ((il0_0)fi0_02).b(byArray, 0, n3, false);
            n4 = xm2.C() - n3;
            ((il0_0)fi0_02).l(n4, false);
            xm2.F(n3);
            byArray = xm2.a;
            ((il0_0)fi0_02).b(byArray, 0, n3, false);
            this.d = n4 = xm2.C();
        }
        if ((n4 = this.d) != (c2 = (char)-31)) {
            return false;
        }
        ((il0_0)fi0_02).l(n3, false);
        n3 = 6;
        xm2.F(n3);
        byArray = xm2.a;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        long l2 = xm2.y();
        long l3 = 1165519206L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false && (l4 = (long)xm2.C()) == false) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            this.c = 0;
            this.j = null;
        } else {
            int n3 = this.c;
            int n4 = 5;
            if (n3 == n4) {
                bq1_0 bq1_02 = this.j;
                bq1_02.getClass();
                bq1_02.c(l2, l3);
            }
        }
    }

    public final void d() {
        gi0_0 gi0_02 = this.b;
        gi0_02.getClass();
        gi0_02.j();
        gi0_02 = this.b;
        dX2$b dX2$b = new dX2$b(-9223372036854775807L);
        gi0_02.h(dX2$b);
        this.c = 6;
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.b = gi0_02;
    }

    public final void release() {
        bq1_0 bq1_02 = this.j;
        if (bq1_02 != null) {
            bq1_02.getClass();
        }
    }
}

