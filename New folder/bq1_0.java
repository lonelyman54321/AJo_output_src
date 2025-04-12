/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;

/*
 * Renamed from BQ1
 */
public final class bq1_0
implements eI0,
dx2_1 {
    public BQ1$a[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public MotionPhotoMetadata F;
    public final vf3$a_0 a;
    public final int b;
    public final Xm2 c;
    public final Xm2 d;
    public final Xm2 e;
    public final Xm2 f;
    public final ArrayDeque g;
    public final tX2 h;
    public final ArrayList i;
    public ImmutableList j;
    public int k;
    public int l;
    public long m;
    public int n;
    public Xm2 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public gi0_0 z;

    public bq1_0(int n3, vf3$a_0 bQ1$aArray) {
        this.a = bQ1$aArray;
        this.b = n3;
        bQ1$aArray = ImmutableList.of();
        this.j = bQ1$aArray;
        int n4 = n3 & 4;
        boolean bl2 = false;
        if (n4 != 0) {
            n4 = 3;
        } else {
            n4 = 0;
            bQ1$aArray = null;
        }
        this.k = n4;
        bQ1$aArray = new tX2();
        this.h = bQ1$aArray;
        bQ1$aArray = new ArrayList();
        this.i = bQ1$aArray;
        bQ1$aArray = new Xm2(16);
        this.f = bQ1$aArray;
        bQ1$aArray = new ArrayDeque();
        this.g = bQ1$aArray;
        byte[] byArray = DS1.a;
        bQ1$aArray = new Xm2(byArray);
        this.c = bQ1$aArray;
        int n7 = 5;
        bQ1$aArray = new Xm2(n7);
        this.d = bQ1$aArray;
        bQ1$aArray = new Xm2();
        this.e = bQ1$aArray;
        this.p = n4 = -1;
        bQ1$aArray = gi0_0.c0;
        this.z = bQ1$aArray;
        bQ1$aArray = new BQ1$a[]{};
        this.A = bQ1$aArray;
        if ((n3 &= 0x20) == 0) {
            bl2 = true;
        }
        this.t = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block121: {
            var3_3 = this;
            var4_4 = var1_1;
            var5_6 = var2_2;
            do {
                block118: {
                    var6_7 = 3;
                    do {
                        block131: {
                            block122: {
                                block123: {
                                    block124: {
                                        block119: {
                                            block125: {
                                                block130: {
                                                    block126: {
                                                        block129: {
                                                            block127: {
                                                                block128: {
                                                                    var7_8 = 0;
                                                                    var8_10 = null;
                                                                    var9_11 = 2;
                                                                    var10_13 = 4;
                                                                    var11_14 = 1;
                                                                    var12_15 = var3_3.k;
                                                                    var13_16 = var3_3.g;
                                                                    var14_18 = var3_3.b;
                                                                    var15_20 = var3_3.e;
                                                                    var16_21 = -1;
                                                                    var18_23 = 0;
                                                                    var19_25 = null;
                                                                    if (var12_15 == 0) break block118;
                                                                    var20_27 = 262144L;
                                                                    if (var12_15 == var11_14) break block122;
                                                                    var22_44 = 8;
                                                                    if (var12_15 == var9_11) break block123;
                                                                    if (var12_15 != var6_7) break block124;
                                                                    var24_29 = var3_3.i;
                                                                    var25_45 = var3_3.h;
                                                                    var26_31 = var25_45.b;
                                                                    if (var26_31 == 0) break block125;
                                                                    if (var26_31 == var11_14) break block126;
                                                                    var27_47 = var25_45.a;
                                                                    var28_48 = 2817;
                                                                    var11_14 = 2819;
                                                                    var29_34 = 2192;
                                                                    if (var26_31 == var9_11) break block127;
                                                                    if (var26_31 != var6_7) break block128;
                                                                    var30_50 = var1_1.getPosition();
                                                                    var20_27 = var1_1.getLength();
                                                                    var22_44 = var1_1.getPosition();
                                                                    var12_15 = var25_45.c;
                                                                    var32_35 = var12_15;
                                                                    var32_35 = (var20_27 -= var22_44) - var32_35;
                                                                    var26_31 = (int)var32_35;
                                                                    var25_45 = new Xm2(var26_31);
                                                                    var34_36 = var25_45.a;
                                                                    var4_4.readFully((byte[])var34_36, 0, var26_31);
                                                                    var4_4 = null;
                                                                    for (var35_51 /* !! */  = (long)0; var35_51 /* !! */  < (var9_11 = var27_47.size()); var35_51 /* !! */  += var38_38 /* !! */ ) {
                                                                        var34_36 = (tX2$a)var27_47.get((int)var35_51 /* !! */ );
                                                                        var36_37 = var34_36.a - var30_50;
                                                                        var7_8 = (int)var36_37;
                                                                        var25_45.I(var7_8);
                                                                        var25_45.J(var10_13);
                                                                        var38_38 /* !! */  = var25_45.k();
                                                                        var8_10 = StandardCharsets.UTF_8;
                                                                        var13_16 = var25_45.u(var38_38 /* !! */ , (Charset)var8_10);
                                                                        var39_53 = var13_16.hashCode();
                                                                        switch (var39_53) lbl-1000:
                                                                        // 6 sources

                                                                        {
                                                                            default: {
                                                                                var10_13 = -1;
                                                                                break;
                                                                            }
                                                                            case 1760745220: {
                                                                                var40_39 /* !! */  = (byte[])"Super_SlowMotion_BGM";
                                                                                var10_13 = (int)var13_16.equals(var40_39 /* !! */ );
                                                                                if (var10_13 == 0) ** GOTO lbl-1000
                                                                                var10_13 = 4;
                                                                                break;
                                                                            }
                                                                            case -830665521: {
                                                                                var40_39 /* !! */  = (byte[])"Super_SlowMotion_Deflickering_On";
                                                                                var10_13 = (int)var13_16.equals(var40_39 /* !! */ );
                                                                                if (var10_13 == 0) ** GOTO lbl-1000
                                                                                var10_13 = 3;
                                                                                break;
                                                                            }
                                                                            case -1251387154: {
                                                                                var40_39 /* !! */  = (byte[])"Super_SlowMotion_Data";
                                                                                var10_13 = (int)var13_16.equals(var40_39 /* !! */ );
                                                                                if (var10_13 == 0) ** GOTO lbl-1000
                                                                                var10_13 = 2;
                                                                                break;
                                                                            }
                                                                            case -1332107749: {
                                                                                var40_39 /* !! */  = (byte[])"Super_SlowMotion_Edit_Data";
                                                                                var10_13 = (int)var13_16.equals(var40_39 /* !! */ );
                                                                                if (var10_13 == 0) ** GOTO lbl-1000
                                                                                var10_13 = 1;
                                                                                break;
                                                                            }
                                                                            case -1711564334: {
                                                                                var40_39 /* !! */  = (byte[])"SlowMotion_Data";
                                                                                var10_13 = (int)var13_16.equals(var40_39 /* !! */ );
                                                                                if (var10_13 == 0) ** GOTO lbl-1000
                                                                                var10_13 = 0;
                                                                                var40_39 /* !! */  = null;
                                                                            }
                                                                        }
                                                                        block19 : switch (var10_13) {
                                                                            default: {
                                                                                throw ParserException.a("Invalid SEF name", null);
                                                                            }
                                                                            case 4: {
                                                                                var10_13 = 2817;
lbl96:
                                                                                // 5 sources

                                                                                while (true) {
                                                                                    var26_31 = 8;
                                                                                    break block19;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            case 3: {
                                                                                var10_13 = 2820;
                                                                                ** GOTO lbl96
                                                                            }
                                                                            case 2: {
                                                                                var10_13 = 2816;
                                                                                ** GOTO lbl96
                                                                            }
                                                                            case 1: {
                                                                                var10_13 = 2819;
                                                                                ** GOTO lbl96
                                                                            }
                                                                            case 0: {
                                                                                var10_13 = 2192;
                                                                                ** continue;
                                                                            }
                                                                        }
                                                                        var9_11 = var34_36.b - (var38_38 /* !! */  += var26_31);
                                                                        if (var10_13 != var29_34) {
                                                                            var38_38 /* !! */  = 2816;
                                                                            if (var10_13 != var38_38 /* !! */  && var10_13 != var28_48 && var10_13 != var11_14 && var10_13 != (var38_38 /* !! */  = 2820)) {
                                                                                var4_4 = new IllegalStateException();
                                                                                throw var4_4;
                                                                            }
lbl117:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var41_40 = new ArrayList;
                                                                        var41_40();
                                                                        var8_10 = var25_45.u(var9_11, (Charset)var8_10);
                                                                        var8_10 = tX2.e.splitToList((CharSequence)var8_10);
                                                                        var34_36 = null;
                                                                        for (var9_11 = 0; var9_11 < (var10_13 = var8_10.size()); var9_11 += var26_31) {
                                                                            var40_39 /* !! */  = (byte[])((CharSequence)var8_10.get(var9_11));
                                                                            var13_16 = tX2.d;
                                                                            var26_31 = (var40_39 /* !! */  = (byte[])var13_16.splitToList((CharSequence)var40_39 /* !! */ )).size();
                                                                            if (var26_31 == var6_7) {
                                                                                var26_31 = 0;
                                                                                var13_16 = null;
                                                                                try {
                                                                                    var42_54 /* !! */  = var40_39 /* !! */ .get(0);
                                                                                }
                                                                                catch (NumberFormatException var4_5) {
                                                                                    throw ParserException.a(null, var4_5);
                                                                                }
                                                                                var42_54 /* !! */  = (String)var42_54 /* !! */ ;
                                                                                var43_55 = Long.parseLong(var42_54 /* !! */ );
                                                                                var26_31 = 1;
                                                                                var42_54 /* !! */  = var40_39 /* !! */ .get(var26_31);
                                                                                var42_54 /* !! */  = (String)var42_54 /* !! */ ;
                                                                                var45_56 = Long.parseLong(var42_54 /* !! */ );
                                                                                var26_31 = 2;
                                                                                var40_39 /* !! */  = var40_39 /* !! */ .get(var26_31);
                                                                                var40_39 /* !! */  = (byte[])((String)var40_39 /* !! */ );
                                                                                var10_13 = Integer.parseInt((String)var40_39 /* !! */ );
                                                                                var26_31 = 1;
                                                                                var47_57 = var26_31 << (var10_13 -= var26_31);
                                                                                var40_39 /* !! */  = (byte[])new SlowMotionData$Segment;
                                                                                var40_39 /* !! */ (var43_55, var45_56, var47_57);
                                                                                var41_40.add(var40_39 /* !! */ );
                                                                                continue;
                                                                            }
                                                                            throw ParserException.a(null, null);
                                                                        }
                                                                        var8_10 = new SlowMotionData((ArrayList)var41_40);
                                                                        var24_29.add(var8_10);
                                                                        ** continue;
                                                                        var38_38 /* !! */  = 1;
                                                                        var7_8 = 0;
                                                                        var8_10 = null;
                                                                        var10_13 = 4;
                                                                    }
                                                                    var5_6.a = var36_37 = 0L;
lbl174:
                                                                    // 5 sources

                                                                    while (true) {
                                                                        var35_51 /* !! */  = 1;
                                                                        break block119;
                                                                        break;
                                                                    }
                                                                }
                                                                var4_4 = new IllegalStateException();
                                                                throw var4_4;
                                                            }
                                                            var36_37 = var1_1.getLength();
                                                            var48_41 /* !! */  = var25_45.c + -20;
                                                            var34_36 = new Xm2(var48_41 /* !! */ );
                                                            var40_39 /* !! */  = var34_36.a;
                                                            var26_31 = 0;
                                                            var13_16 = null;
                                                            var4_4.readFully(var40_39 /* !! */ , 0, var48_41 /* !! */ );
                                                            var4_4 = null;
                                                            for (var35_51 /* !! */  = (long)0; var35_51 /* !! */  < (var10_13 = var48_41 /* !! */  / 12); var35_51 /* !! */  += var29_34) {
                                                                var34_36.J(2);
                                                                var10_13 = var34_36.m();
                                                                var26_31 = 2816;
                                                                if (var10_13 != var29_34 && var10_13 != var26_31 && var10_13 != var28_48 && var10_13 != var11_14) {
                                                                    var18_23 = 2820;
                                                                    if (var10_13 != var18_23) {
                                                                        var10_13 = 8;
                                                                        var34_36.J(var10_13);
                                                                        var49_60 = var36_37;
lbl199:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var18_23 = 2820;
                                                                }
                                                                var51_61 = var25_45.c;
                                                                var51_61 = var36_37 - var51_61;
                                                                var10_13 = var34_36.k();
                                                                var49_60 = var36_37;
                                                                var53_62 = var10_13;
                                                                var29_34 = var34_36.k();
                                                                var41_40 = new tX2$a;
                                                                var41_40(var51_61 -= var53_62, var29_34);
                                                                var27_47.add(var41_40);
                                                                ** continue;
                                                                var29_34 = 1;
                                                                var36_37 = var49_60;
                                                                var29_34 = 2192;
                                                            }
                                                            var35_51 /* !! */  = (long)var27_47.isEmpty();
                                                            if (var35_51 /* !! */  == false) break block129;
                                                            var5_6.a = var53_62 = 0L;
                                                            var48_41 /* !! */  = 0;
                                                            var24_29 = null;
                                                            ** GOTO lbl174
                                                        }
                                                        var25_45.b = var6_7;
                                                        var48_41 /* !! */  = 0;
                                                        var24_29 = null;
                                                        var4_4 = (tX2$a)var27_47.get(0);
                                                        var5_6.a = var55_58 = var4_4.a;
                                                        ** GOTO lbl174
                                                    }
                                                    var24_29 = null;
                                                    var29_34 = 8;
                                                    var57_42 = new Xm2(var29_34);
                                                    var41_40 = var57_42.a;
                                                    var4_4.readFully((byte[])var41_40, 0, var29_34);
                                                    var25_45.c = var48_41 /* !! */  = var57_42.k() + var29_34;
                                                    var48_41 /* !! */  = var57_42.i();
                                                    var6_7 = 1397048916;
                                                    if (var48_41 /* !! */  == var6_7) break block130;
                                                    var5_6.a = var58_43 = 0L;
                                                    ** GOTO lbl174
                                                }
                                                var58_43 = var1_1.getPosition();
                                                var53_63 = var25_45.c + -12;
                                                var5_6.a = var58_43 -= var53_63;
                                                var35_51 /* !! */  = 2;
                                                var25_45.b = (int)var35_51 /* !! */ ;
                                                ** continue;
                                            }
                                            var58_43 = var1_1.getLength();
                                            cfr_temp_0 = var58_43 - var16_21;
                                            var35_51 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                            var58_43 = var35_51 /* !! */  != false && (var35_51 /* !! */  = var58_43 == var22_44 ? 0 : (var58_43 < var22_44 ? -1 : 1)) >= 0 ? (var58_43 -= var22_44) : 0L;
                                            var5_6.a = var58_43;
                                            var35_51 /* !! */  = 1;
                                            var25_45.b = (int)var35_51 /* !! */ ;
                                        }
                                        var60_64 = var5_6.a;
                                        var55_58 = 0L;
                                        var38_38 /* !! */  = (int)(var60_64 == var55_58 ? 0 : (var60_64 < var55_58 ? -1 : 1));
                                        if (var38_38 /* !! */  == 0) {
                                            var62_65 = false;
                                            var5_6 = null;
                                            var3_3.k = 0;
                                            var3_3.n = 0;
                                        }
                                        return (int)var35_51 /* !! */ ;
                                    }
                                    var4_4 = new IllegalStateException();
                                    throw var4_4;
                                }
                                var55_59 = var1_1.getPosition();
                                var38_38 /* !! */  = var3_3.p;
                                var7_8 = -1;
                                if (var38_38 /* !! */  != var7_8) ** GOTO lbl-1000
                                var9_11 = -1;
                                var10_13 = -1;
                                var11_14 = 1;
                                var12_15 = 1;
                                var13_16 = null;
                                var16_21 = 0x7FFFFFFFFFFFFFFFL;
                                var63_67 /* !! */  = 0x7FFFFFFFFFFFFFFFL;
                                var65_68 = 0x7FFFFFFFFFFFFFFFL;
                                for (var26_31 = 0; var26_31 < (var18_23 = ((BQ1$a[])(var24_29 = var3_3.A)).length); var26_31 += var48_41 /* !! */ ) {
                                    var24_29 = var24_29[var26_31];
                                    var18_23 = var24_29.e;
                                    var24_29 = var24_29.b;
                                    var38_38 /* !! */  = var24_29.b;
                                    if (var18_23 == var38_38 /* !! */ ) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var36_37 = var24_29.c[var18_23];
                                    var24_29 = var3_3.B;
                                    var24_29 = var24_29[var26_31];
                                    var67_69 = var24_29[var18_23];
                                    var69_70 = 0L;
                                    cfr_temp_1 = (var36_37 -= var55_59) - var69_70;
                                    var48_41 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var48_41 /* !! */  >= 0 && (var48_41 /* !! */  = (int)(var36_37 == var20_27 ? 0 : (var36_37 < var20_27 ? -1 : 1))) < 0) {
                                        var48_41 /* !! */  = 0;
                                        var24_29 = null;
                                    } else {
                                        var48_41 /* !! */  = 1;
                                    }
                                    if (var48_41 /* !! */  == 0 && var12_15 != 0 || var48_41 /* !! */  == var12_15 && (var18_23 = (int)(var36_37 == var65_68 ? 0 : (var36_37 < var65_68 ? -1 : 1))) < 0) {
                                        var12_15 = var48_41 /* !! */ ;
                                        var65_68 = var36_37;
                                        var10_13 = var26_31;
                                        var63_67 /* !! */  = (long)var67_69;
                                    }
                                    if ((var38_38 /* !! */  = (int)(var67_69 == var16_21 ? 0 : (var67_69 < var16_21 ? -1 : 1))) >= 0) ** GOTO lbl-1000
                                    var11_14 = var48_41 /* !! */ ;
                                    var9_11 = var26_31;
                                    var16_21 = (long)var67_69;
                                    ** continue;
                                    var48_41 /* !! */  = 1;
                                    var18_23 = 0;
                                    var19_25 = null;
                                }
                                var36_37 = 0x7FFFFFFFFFFFFFFFL;
                                cfr_temp_2 = var16_21 - var36_37;
                                var48_41 /* !! */  = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                if (var48_41 /* !! */  == 0 || var11_14 == 0 || (var48_41 /* !! */  = (int)((cfr_temp_3 /* !! */  = var63_67 /* !! */  - (var16_21 += (var36_37 = 0xA00000L))) == 0L ? 0 : (cfr_temp_3 /* !! */  < 0L ? -1 : 1))) < 0) {
                                    var9_11 = var10_13;
                                }
                                var3_3.p = var9_11;
                                var48_41 /* !! */  = -1;
                                if (var9_11 == var48_41 /* !! */ ) {
                                    var29_34 = -1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var24_29 = var3_3.A;
                                    var38_38 /* !! */  = var3_3.p;
                                    var24_29 = var24_29[var38_38 /* !! */ ];
                                    var19_25 = var24_29.c;
                                    var26_31 = var24_29.e;
                                    var25_46 = var24_29.b;
                                    var71_9 = var25_46.c[var26_31];
                                    var73_12 = var3_3.y;
                                    var41_40 = var25_46.d;
                                    var38_38 /* !! */  = var41_40[var26_31];
                                    var55_59 = (var71_9 += var73_12) - var55_59;
                                    var10_13 = var3_3.q;
                                    var73_12 = var10_13;
                                    cfr_temp_4 = (var55_59 += var73_12) - (var73_12 = 0L);
                                    var75_71 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                    if (var75_71 /* !! */  >= 0 && (var10_13 = (int)(var55_59 == var20_27 ? 0 : (var55_59 < var20_27 ? -1 : 1))) < 0) {
                                        var5_6 = var24_29.a;
                                        var7_8 = var5_6.h;
                                        var9_11 = 1;
                                        if (var7_8 == var9_11) {
                                            var55_59 += var22_44;
                                            var38_38 /* !! */  += -8;
                                        }
                                        var29_34 = (int)var55_59;
                                        var4_4.j(var29_34);
                                        var57_42 = var5_6.g;
                                        var76_72 = var57_42.o;
                                        var8_10 = "video/avc";
                                        var29_34 = (byte)Objects.equals(var76_72, var8_10);
                                        if (var29_34 == 0) {
                                            var29_34 = 1;
                                            var3_3.t = var29_34;
                                        } else {
                                            var29_34 = 1;
                                        }
                                        var62_66 /* !! */  = var5_6.k;
                                        var77_17 = var24_29.d;
                                        if (var62_66 /* !! */  != 0) {
                                            var57_42 = var3_3.d;
                                            var8_10 = var57_42.a;
                                            var34_36 = null;
                                            var8_10[0] = false;
                                            var8_10[var29_34] = false;
                                            var8_10[2] = false;
                                            var9_11 = var62_66 /* !! */  + 1;
                                            var29_34 = 4;
                                            var10_13 = 4 - var62_66 /* !! */ ;
                                            while ((var62_66 /* !! */  = var3_3.r) < var38_38 /* !! */ ) {
                                                var62_66 /* !! */  = var3_3.s;
                                                if (var62_66 /* !! */  == 0) {
                                                    var4_4.readFully((byte[])var8_10, var10_13, var9_11);
                                                    var3_3.q = var62_66 /* !! */  = var3_3.q + var9_11;
                                                    var62_66 /* !! */  = 0;
                                                    var5_6 = null;
                                                    var57_42.I(0);
                                                    var29_34 = var57_42.i();
                                                    var28_49 = 1;
                                                    if (var29_34 >= var28_49) {
                                                        var3_3.s = var29_34 -= var28_49;
                                                        var76_72 = var3_3.c;
                                                        var76_72.I(0);
                                                        var62_66 /* !! */  = 4;
                                                        var19_25.f(var62_66 /* !! */ , (Xm2)var76_72);
                                                        var19_25.f(var28_49, (Xm2)var57_42);
                                                        var29_34 = var3_3.r + 5;
                                                        var3_3.r = var29_34;
                                                        var38_38 /* !! */  += var10_13;
                                                        var29_34 = (byte)var3_3.t;
                                                        if (var29_34 != 0 || (var62_66 /* !! */  = (int)DS1.c(var29_34 = (byte)var8_10[var62_66 /* !! */ ])) == 0) continue;
                                                        var3_3.t = var28_49;
                                                        continue;
                                                    }
                                                    throw ParserException.a("Invalid NAL length", null);
                                                }
                                                var76_72 = null;
                                                var62_66 /* !! */  = var19_25.c((mi0_0)var4_4, var62_66 /* !! */ , false);
                                                var29_34 = var3_3.q + var62_66 /* !! */ ;
                                                var3_3.q = var29_34;
                                                var29_34 = var3_3.r + var62_66 /* !! */ ;
                                                var3_3.r = var29_34;
                                                var29_34 = var3_3.s - var62_66 /* !! */ ;
                                                var3_3.s = var29_34;
                                            }
                                            while (true) {
                                                break;
                                            }
                                        } else {
                                            var57_42 = "audio/ac4";
                                            var5_6 = var57_42.o;
                                            var62_66 /* !! */  = (int)var57_42.equals(var5_6);
                                            if (var62_66 /* !! */  != 0) {
                                                var62_66 /* !! */  = var3_3.r;
                                                if (var62_66 /* !! */  == 0) {
                                                    z1_0.a(var38_38 /* !! */ , (Xm2)var15_20);
                                                    var29_34 = 7;
                                                    var19_25.f(var29_34, (Xm2)var15_20);
                                                    var3_3.r = var62_66 /* !! */  = var3_3.r + var29_34;
                                                } else {
                                                    var29_34 = 7;
                                                }
                                                var38_38 /* !! */  += var29_34;
                                            } else if (var77_17 != null) {
                                                var77_17.c((fi0_0)var4_4);
                                            }
                                            while (true) {
                                                if ((var62_66 /* !! */  = var3_3.r) >= var38_38 /* !! */ ) ** continue;
                                                var62_66 /* !! */  = var38_38 /* !! */  - var62_66 /* !! */ ;
                                                var57_42 = null;
                                                var62_66 /* !! */  = var19_25.c((mi0_0)var4_4, var62_66 /* !! */ , false);
                                                var3_3.q = var6_7 = var3_3.q + var62_66 /* !! */ ;
                                                var3_3.r = var6_7 = var3_3.r + var62_66 /* !! */ ;
                                                var3_3.s = var6_7 = var3_3.s - var62_66 /* !! */ ;
                                            }
                                        }
                                        var35_52 /* !! */  = var38_38 /* !! */ ;
                                        var55_59 = var25_46.f[var26_31];
                                        var5_6 = var25_46.g;
                                        var62_66 /* !! */  = (int)var5_6[var26_31];
                                        var38_38 /* !! */  = (int)var3_3.t;
                                        if (var38_38 /* !! */  == 0) {
                                            var38_38 /* !! */  = 0x4000000;
                                            var62_66 /* !! */  |= var38_38 /* !! */ ;
                                        }
                                        if (var77_17 != null) {
                                            var28_49 = 0;
                                            var75_71 /* !! */  = 0;
                                            var41_40 = var77_17;
                                            var8_10 = var19_25;
                                            var78_19 = var55_59;
                                            var57_42 = var77_17;
                                            var11_14 = var62_66 /* !! */ ;
                                            var5_6 = var25_46;
                                            var12_15 = var35_52 /* !! */ ;
                                            var35_52 /* !! */  = var26_31++;
                                            var13_16 = null;
                                            var15_20 = var19_25;
                                            var18_23 = 0;
                                            var19_25 = null;
                                            var77_17.b((wp3)var8_10, var55_59, var62_66 /* !! */ , var12_15, 0, null);
                                            var29_34 = 1;
                                            var35_52 /* !! */  = var25_46.b;
                                            if (var26_31 == var35_52 /* !! */ ) {
                                                var62_66 /* !! */  = 0;
                                                var5_6 = null;
                                                var77_17.a((wp3)var8_10, null);
                                            }
                                        } else {
                                            var15_20 = var19_25;
                                            var12_15 = 0;
                                            var25_46 = null;
                                            var26_31 = 0;
                                            var13_16 = null;
                                            var41_40 = var19_25;
                                            var71_9 = var55_59;
                                            var10_13 = var62_66 /* !! */ ;
                                            var11_14 = var35_52 /* !! */ ;
                                            var19_25.a(var55_59, var62_66 /* !! */ , var35_52 /* !! */ , 0, null);
                                        }
                                        var35_52 /* !! */  = var24_29.e;
                                        var62_66 /* !! */  = 1;
                                        var24_29.e = var35_52 /* !! */  += var62_66 /* !! */ ;
                                        var3_3.p = -1;
                                        var4_4 = null;
                                        var3_3.q = 0;
                                        var3_3.r = 0;
                                        var3_3.s = 0;
                                        var35_52 /* !! */  = var14_18 & 32;
                                        if (var35_52 /* !! */  == 0) {
                                            var11_14 = 1;
                                        } else {
                                            var11_14 = 0;
                                            var77_17 = null;
                                        }
                                        var3_3.t = var11_14;
                                        var29_34 = 0;
                                        var76_72 = null;
                                    } else {
                                        var5_6.a = var71_9;
                                        var29_34 = 1;
                                    }
                                }
                                return var29_34;
                            }
                            var29_34 = 7;
                            var36_37 = var3_3.m;
                            var48_41 /* !! */  = var3_3.n;
                            var78_19 = var48_41 /* !! */ ;
                            var36_37 -= var78_19;
                            var78_19 = var1_1.getPosition() + var36_37;
                            var24_29 = var3_3.o;
                            if (var24_29 == null) break block131;
                            var77_17 = var24_29.a;
                            var12_15 = var3_3.n;
                            var7_8 = (int)var36_37;
                            var4_4.readFully((byte[])var77_17, var12_15, var7_8);
                            var38_38 /* !! */  = var3_3.l;
                            var7_8 = 1718909296;
                            if (var38_38 /* !! */  == var7_8) {
                                block120: {
                                    var3_3.u = true;
                                    var24_29.I(8);
                                    var38_38 /* !! */  = var24_29.i();
                                    var7_8 = 1903435808;
                                    var11_14 = 1751476579;
                                    if (var38_38 /* !! */  != var11_14) {
                                        if (var38_38 /* !! */  != var7_8) {
                                            var38_38 /* !! */  = 0;
                                            var41_40 = null;
                                        } else {
                                            var38_38 /* !! */  = 1;
                                        }
                                    } else {
                                        var38_38 /* !! */  = 2;
                                    }
                                    if (var38_38 /* !! */  == 0) {
                                        var38_38 /* !! */  = 4;
                                        var24_29.J(var38_38 /* !! */ );
                                        while ((var38_38 /* !! */  = var24_29.a()) > 0) {
                                            var38_38 /* !! */  = var24_29.i();
                                            if (var38_38 /* !! */  != var11_14) {
                                                if (var38_38 /* !! */  != var7_8) {
                                                    var38_38 /* !! */  = 0;
                                                    var41_40 = null;
                                                } else {
                                                    var38_38 /* !! */  = 1;
                                                }
                                            } else {
                                                var38_38 /* !! */  = 2;
                                            }
                                            if (var38_38 /* !! */  == 0) continue;
                                            break block120;
                                        }
                                        var38_38 /* !! */  = 0;
                                        var41_40 = null;
                                    }
                                }
                                var3_3.E = var38_38 /* !! */ ;
                            } else {
                                var38_38 /* !! */  = (int)var13_16.isEmpty();
                                if (var38_38 /* !! */  == 0) {
                                    var41_40 = (zQ1$a)var13_16.peek();
                                    var11_14 = var3_3.l;
                                    var8_10 = new zQ1$b(var11_14, (Xm2)var24_29);
                                    var24_29 = var41_40.c;
                                    var24_29.add(var8_10);
                                }
                            }
                            ** GOTO lbl562
                        }
                        var48_41 /* !! */  = var3_3.u;
                        if (var48_41 /* !! */  == 0 && (var48_41 /* !! */  = var3_3.l) == (var11_14 = 1835295092)) {
                            var3_3.E = var48_41 /* !! */  = 1;
                        }
                        if ((var48_41 /* !! */  = (int)(var36_37 == var20_27 ? 0 : (var36_37 < var20_27 ? -1 : 1))) < 0) {
                            var48_41 /* !! */  = (int)var36_37;
                            var4_4.j(var48_41 /* !! */ );
lbl562:
                            // 3 sources

                            var48_41 /* !! */  = 0;
                            var24_29 = null;
                        } else {
                            var5_6.a = var80_22 = var1_1.getPosition() + var36_37;
                            var48_41 /* !! */  = 1;
                        }
                        var3_3.l(var78_19);
                        var38_38 /* !! */  = (int)var3_3.v;
                        if (var38_38 /* !! */  != 0) {
                            var38_38 /* !! */  = 1;
                            var3_3.x = var38_38 /* !! */ ;
                            var5_6.a = var36_37 = var3_3.w;
                            var24_29 = null;
                            var3_3.v = false;
                            var48_41 /* !! */  = 1;
                        }
                        if (var48_41 /* !! */  != 0 && (var48_41 /* !! */  = var3_3.k) != (var38_38 /* !! */  = 2)) {
                            var48_41 /* !! */  = 1;
                            continue;
                        }
                        var48_41 /* !! */  = 0;
                        var24_29 = null;
                    } while (var48_41 /* !! */  == 0);
                    return 1;
                }
                var48_41 /* !! */  = 1;
                var29_34 = 7;
                var38_38 /* !! */  = var3_3.n;
                var8_10 = var3_3.f;
                if (var38_38 /* !! */  == 0) {
                    var41_40 = var8_10.a;
                    var9_11 = 0;
                    var34_36 = null;
                    var10_13 = 8;
                    var38_38 /* !! */  = (int)var4_4.e((byte[])var41_40, 0, var10_13, (boolean)var48_41 /* !! */ );
                    if (var38_38 /* !! */  == 0) {
                        var48_41 /* !! */  = var3_3.E;
                        var38_38 /* !! */  = 2;
                        if (var48_41 /* !! */  == var38_38 /* !! */  && (var48_41 /* !! */  = var14_18 & 2) != 0) {
                            var24_29 = var3_3.z;
                            var7_8 = 4;
                            var24_29 = var24_29.n(0, var7_8);
                            var8_10 = var3_3.F;
                            if (var8_10 == null) {
                                var18_23 = 0;
                                var19_25 = null;
                            } else {
                                var10_13 = 1;
                                var77_17 = new Metadata$Entry[var10_13];
                                var77_17[0] = (byte)var8_10;
                                var19_25 = new Metadata((Metadata$Entry[])var77_17);
                            }
                            var8_10 = new d$a();
                            var8_10.k = var19_25;
                            var34_36 = new d((d$a)var8_10);
                            var24_29.d((d)var34_36);
                            var3_3.z.j();
                            var24_29 = var3_3.z;
                            var78_19 = -9223372036854775807L;
                            var8_10 = new dX2$b(var78_19);
                            var24_29.h((dx2_1)var8_10);
                        }
                        var48_41 /* !! */  = 8;
                        var6_7 = 0;
                        var57_42 = null;
                        var11_14 = 4;
                        var26_31 = 0;
                        var13_16 = null;
                        continue;
                    }
                    var38_38 /* !! */  = 2;
                    var3_3.n = 8;
                    var24_29 = null;
                    var8_10.I(0);
                    var3_3.m = var78_19 = var8_10.y();
                    var3_3.l = var48_41 /* !! */  = var8_10.i();
                } else {
                    var38_38 /* !! */  = 2;
                }
                var78_19 = var3_3.m;
                var80_22 = 1L;
                var48_41 /* !! */  = (int)(var78_19 == var80_22 ? 0 : (var78_19 < var80_22 ? -1 : 1));
                if (var48_41 /* !! */  == 0) {
                    var24_29 = var8_10.a;
                    var9_11 = 8;
                    var4_4.readFully((byte[])var24_29, var9_11, var9_11);
                    var3_3.n = var48_41 /* !! */  = var3_3.n + var9_11;
                    var3_3.m = var78_19 = var8_10.B();
                } else {
                    var80_22 = 0L;
                    cfr_temp_5 = var78_19 - var80_22;
                    var48_41 /* !! */  = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                    if (var48_41 /* !! */  == 0) {
                        var78_19 = var1_1.getLength();
                        cfr_temp_6 = var78_19 - var16_21;
                        var48_41 /* !! */  = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                        if (var48_41 /* !! */  == 0 && (var24_29 = (zQ1$a)var13_16.peek()) != null) {
                            var78_19 = var24_29.b;
                        }
                        if ((var48_41 /* !! */  = (int)(var78_19 == var16_21 ? 0 : (var78_19 < var16_21 ? -1 : 1))) != 0) {
                            var80_22 = var1_1.getPosition();
                            var78_19 -= var80_22;
                            var48_41 /* !! */  = var3_3.n;
                            var80_22 = var48_41 /* !! */ ;
                            var3_3.m = var78_19 += var80_22;
                        }
                    }
                }
                var78_19 = var3_3.m;
                var48_41 /* !! */  = var3_3.n;
                var80_22 = var48_41 /* !! */ ;
                var18_23 = (int)(var78_19 == var80_22 ? 0 : (var78_19 < var80_22 ? -1 : 1));
                if (var18_23 < 0) break block121;
                var9_11 = var3_3.l;
                var10_13 = 1751411826;
                var11_14 = 1836019574;
                var12_15 = 1835365473;
                if (var9_11 == var11_14 || var9_11 == (var11_14 = 1953653099) || var9_11 == (var11_14 = 1835297121) || var9_11 == (var11_14 = 1835626086) || var9_11 == (var11_14 = 1937007212) || var9_11 == (var11_14 = 1701082227) || var9_11 == var12_15 || var9_11 == (var11_14 = 1701082724)) ** GOTO lbl720
                var11_14 = 1835296868;
                if (var9_11 != var11_14 && var9_11 != (var11_14 = 1836476516) && var9_11 != var10_13 && var9_11 != (var10_13 = 1937011556) && var9_11 != (var10_13 = 0x73747473) && var9_11 != (var10_13 = 0x73747373) && var9_11 != (var10_13 = 1668576371) && var9_11 != (var10_13 = 1701606260) && var9_11 != (var10_13 = 1937011555) && var9_11 != (var10_13 = 1937011578) && var9_11 != (var10_13 = 1937013298) && var9_11 != (var10_13 = 1937007471) && var9_11 != (var10_13 = 1668232756) && var9_11 != (var10_13 = 1953196132) && var9_11 != (var10_13 = 1718909296) && var9_11 != (var10_13 = 1969517665) && var9_11 != (var10_13 = 1801812339) && var9_11 != (var10_13 = 1768715124)) {
                    var71_9 = var1_1.getPosition();
                    var73_12 = var3_3.n;
                    var82_24 = var71_9 - var73_12;
                    var48_41 /* !! */  = var3_3.l;
                    var7_8 = 1836086884;
                    if (var48_41 /* !! */  == var7_8) {
                        var84_26 = var82_24 + var73_12;
                        var71_9 = var3_3.m;
                        var86_28 = var71_9 - var73_12;
                        var88_30 = 0L;
                        var90_32 = -9223372036854775807L;
                        var3_3.F = var24_29 = new MotionPhotoMetadata(var88_30, var82_24, var90_32, var84_26, var86_28);
                    }
                    var24_29 = null;
                    var3_3.o = null;
                    var3_3.k = var48_41 /* !! */  = 1;
lbl686:
                    // 2 sources

                    while (true) {
                        var48_41 /* !! */  = 8;
                        var6_7 = 0;
                        var57_42 = null;
                        var11_14 = 4;
                        break;
                    }
                } else {
                    var9_11 = 8;
                    if (var48_41 /* !! */  == var9_11) {
                        var48_41 /* !! */  = 1;
                    } else {
                        var48_41 /* !! */  = 0;
                        var24_29 = null;
                    }
                    ct3.f((boolean)var48_41 /* !! */ );
                    var78_19 = var3_3.m;
                    var80_22 = 0x7FFFFFFFL;
                    var48_41 /* !! */  = (int)(var78_19 == var80_22 ? 0 : (var78_19 < var80_22 ? -1 : 1));
                    if (var48_41 /* !! */  <= 0) {
                        var48_41 /* !! */  = 1;
                    } else {
                        var48_41 /* !! */  = 0;
                        var24_29 = null;
                    }
                    ct3.f((boolean)var48_41 /* !! */ );
                    var78_19 = var3_3.m;
                    var10_13 = (int)var78_19;
                    var24_29 = new Xm2(var10_13);
                    var8_10 = var8_10.a;
                    var34_36 = var24_29.a;
                    var10_13 = 0;
                    var40_39 /* !! */  = null;
                    var11_14 = 8;
                    System.arraycopy(var8_10, 0, var34_36, 0, var11_14);
                    var3_3.o = var24_29;
                    var3_3.k = var48_41 /* !! */  = 1;
                    ** continue;
lbl720:
                    // 1 sources

                    var48_41 /* !! */  = 1;
                    var71_9 = var1_1.getPosition();
                    var92_33 = var3_3.m;
                    var71_9 += var92_33;
                    var58_43 = var3_3.n;
                    var71_9 -= var58_43;
                    var11_14 = (int)(var92_33 == var58_43 ? 0 : (var92_33 < var58_43 ? -1 : 1));
                    if (var11_14 != 0 && (var48_41 /* !! */  = var3_3.l) == var12_15) {
                        var48_41 /* !! */  = 8;
                        var15_20.F(var48_41 /* !! */ );
                        var57_42 = var15_20.a;
                        var77_17 = null;
                        var4_4.f(0, (byte[])var57_42, var48_41 /* !! */ );
                        var57_42 = JA.a;
                        var6_7 = var15_20.b;
                        var11_14 = 4;
                        var15_20.J(var11_14);
                        var12_15 = var15_20.i();
                        if (var12_15 != var10_13) {
                            var6_7 += var11_14;
                        }
                        var15_20.I(var6_7);
                        var6_7 = var15_20.b;
                        var4_4.j(var6_7);
                        var1_1.d();
                    } else {
                        var48_41 /* !! */  = 8;
                        var11_14 = 4;
                    }
                    var10_13 = var3_3.l;
                    var57_42 = new zQ1$a(var10_13, var71_9);
                    var13_16.push(var57_42);
                    var32_35 = var3_3.m;
                    var92_33 = var3_3.n;
                    var6_7 = (int)(var32_35 == var92_33 ? 0 : (var32_35 < var92_33 ? -1 : 1));
                    if (var6_7 == 0) {
                        var3_3.l(var71_9);
                        var6_7 = 0;
                        var57_42 = null;
                    } else {
                        var6_7 = 0;
                        var57_42 = null;
                        var3_3.k = 0;
                        var3_3.n = 0;
                    }
                }
                var26_31 = 1;
            } while (var26_31 != 0);
            return -1;
        }
        throw ParserException.b("Atom size less than header length (unsupported).");
    }

    /*
     * WARNING - void declaration
     */
    public final boolean b(fi0_0 object) {
        void var2_5;
        ImmutableList immutableList;
        int bl2 = this.b & 2;
        boolean bl3 = true;
        if (bl2 != 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            immutableList = null;
        }
        object = J70.b((fi0_0)object, false, (boolean)var2_5);
        immutableList = object != null ? ImmutableList.of(object) : ImmutableList.of();
        this.j = immutableList;
        if (object != null) {
            bl3 = false;
        }
        return bl3;
    }

    public final void c(long l2, long l3) {
        int n3;
        this.g.clear();
        this.n = 0;
        this.p = n3 = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        int n4 = this.b & 0x20;
        int n7 = 1;
        n4 = n4 == 0 ? 1 : 0;
        this.t = n4;
        long l4 = 0L;
        n4 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
        if (n4 == 0) {
            int n8 = this.k;
            int n10 = 3;
            if (n8 != n10) {
                this.k = 0;
                this.n = 0;
            } else {
                Object object = this.h;
                ArrayList arrayList = ((tX2)object).a;
                arrayList.clear();
                ((tX2)object).b = 0;
                object = this.i;
                ((ArrayList)object).clear();
            }
        } else {
            for (BQ1$a bQ1$a : this.A) {
                int n8;
                Bp3 bp3;
                block8: {
                    bp3 = bQ1$a.b;
                    long[] lArray = bp3.f;
                    for (n8 = gz3.d(lArray, l3, false); n8 >= 0; n8 += -1) {
                        int[] nArray = bp3.g;
                        int n10 = nArray[n8] & n7;
                        if (n10 == 0) {
                            continue;
                        }
                        break block8;
                    }
                    n8 = -1;
                }
                if (n8 == n3) {
                    n8 = bp3.a(l3);
                }
                bQ1$a.e = n8;
                zs3 object = bQ1$a.d;
                if (object == null) continue;
                object.b = false;
                object.c = 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final dX2$a d(long object) {
        int n3;
        Object object2;
        long l2;
        long l3;
        long l4;
        Object object3;
        Object object4 = this;
        Object object5 = object;
        Object object6 = this.A;
        int n4 = ((BQ1$a[])object6).length;
        Object object7 = fx2_0.c;
        if (n4 == 0) {
            return new dX2$a((fx2_0)object7, (fx2_0)object7);
        }
        n4 = this.C;
        int[] nArray = null;
        int n7 = -1;
        if (n4 == n7) {
            object3 = Long.MAX_VALUE;
            l4 = -9223372036854775807L;
            l3 = -1;
        } else {
            Object object8;
            int n8;
            block20: {
                object6 = object6[n4].b;
                long[] lArray = ((Bp3)object6).f;
                for (n4 = gz3.d(lArray, object, false); n4 >= 0; n4 += -1) {
                    int[] nArray2 = ((Bp3)object6).g;
                    int n10 = nArray2[n4] & 1;
                    if (n10 == 0) {
                        continue;
                    }
                    break block20;
                }
                n4 = -1;
            }
            if (n4 == n7) {
                n4 = ((Bp3)object6).a((long)object5);
            }
            if (n4 == n7) {
                return new dX2$a((fx2_0)object7, (fx2_0)object7);
            }
            object7 = ((Bp3)object6).f;
            l2 = (long)object7[n4];
            object2 = ((Bp3)object6).c;
            object3 = object2[n4];
            Object object9 = l2 == object5 ? 0 : (l2 < object5 ? -1 : 1);
            if (object9 < 0 && n4 < (n8 = ((Bp3)object6).b + -1) && (n3 = ((Bp3)object6).a((long)object5)) != n7 && n3 != n4) {
                object8 = object7[n3];
                l3 = (long)object2[n3];
            } else {
                object8 = -9223372036854775807L;
                l3 = -1;
            }
            l4 = object8;
            object5 = l2;
        }
        l2 = object3;
        int n14 = 0;
        object7 = null;
        while (true) {
            block27: {
                int n15;
                long[] lArray;
                block22: {
                    long l7;
                    block26: {
                        Object object10;
                        block25: {
                            long l8;
                            int n16;
                            block21: {
                                block24: {
                                    block23: {
                                        if (n14 >= (n16 = ((BQ1$a[])(object2 = ((bq1_0)object4).A)).length)) break block23;
                                        n16 = ((bq1_0)object4).C;
                                        if (n14 != n16) break block24;
                                        object = object5;
                                        break block25;
                                    }
                                    object = object5;
                                    object4 = new fx2_0((long)object5, l2);
                                    object5 = -9223372036854775807L;
                                    long l12 = l4 - object5;
                                    n14 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                                    if (n14 == 0) {
                                        return new dX2$a((fx2_0)object4, (fx2_0)object4);
                                    }
                                    object10 = new fx2_0(l4, l3);
                                    dX2$a dX2$a = new dX2$a((fx2_0)object4, (fx2_0)object10);
                                    return dX2$a;
                                }
                                object2 = object2[n14].b;
                                long[] lArray2 = ((Bp3)object2).f;
                                n16 = gz3.d(lArray2, object5, false);
                                while (true) {
                                    nArray = ((Bp3)object2).g;
                                    if (n16 < 0) break;
                                    int n17 = nArray[n16] & 1;
                                    if (n17 == 0) {
                                        n16 += -1;
                                        continue;
                                    }
                                    break block21;
                                    break;
                                }
                                n16 = -1;
                            }
                            if (n16 == n7) {
                                n16 = ((Bp3)object2).a((long)object5);
                            }
                            lArray = ((Bp3)object2).c;
                            if (n16 == n7) {
                                object = object5;
                            } else {
                                object = object5;
                                l8 = lArray[n16];
                                l2 = Math.min(l8, l2);
                            }
                            l8 = -9223372036854775807L;
                            l7 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                            if (l7 == false) break block25;
                            object4 = ((Bp3)object2).f;
                            n3 = 0;
                            object10 = null;
                            break block26;
                        }
                        n3 = 0;
                        object10 = null;
                        break block27;
                    }
                    for (n15 = gz3.d((long[])object4, l4, false); n15 >= 0; n15 += -1) {
                        l7 = nArray[n15] & 1;
                        if (l7 == false) {
                            continue;
                        }
                        break block22;
                    }
                    n15 = -1;
                }
                if (n15 == n7) {
                    n15 = ((Bp3)object2).a(l4);
                }
                if (n15 != n7) {
                    long l14 = lArray[n15];
                    l3 = Math.min(l14, l3);
                }
            }
            ++n14;
            object4 = this;
            object5 = object;
            nArray = null;
        }
    }

    public final eI0 e() {
        return this;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.D;
    }

    public final ImmutableList i() {
        return this.j;
    }

    public final void k(gi0_0 gi0_02) {
        int n3 = this.b & 0x10;
        if (n3 == 0) {
            vf3$a_0 vf3$a_0 = this.a;
            wf3_1 wf3_12 = new wf3_1(gi0_02, vf3$a_0);
            gi0_02 = wf3_12;
        }
        this.z = gi0_02;
    }

    /*
     * Exception decompiling
     */
    public final void l(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 1774->1779)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void release() {
    }
}

