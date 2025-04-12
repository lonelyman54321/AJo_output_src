/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.math.RoundingMode;

/*
 * Renamed from yQ1
 */
public final class yq1_1
implements eI0 {
    public static final lo v;
    public final int a;
    public final long b;
    public final Xm2 c;
    public final EQ1$a d;
    public final IY0 e;
    public final vc1_0 f;
    public final jq0_0 g;
    public gi0_0 h;
    public wp3 i;
    public wp3 j;
    public int k;
    public Metadata l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public px2_1 r;
    public boolean s;
    public boolean t;
    public long u;

    static {
        lo lo3;
        v = lo3 = new Object();
    }

    public yq1_1() {
        this(0);
    }

    public yq1_1(int n3) {
        long l2;
        this.a = 0;
        this.b = l2 = -9223372036854775807L;
        Object object = new Xm2(10);
        this.c = object;
        this.d = object = new Object();
        this.e = object = new IY0();
        this.m = l2;
        this.f = object = new vc1_0();
        this.g = object = new jq0_0();
        this.j = object;
        this.p = -1;
    }

    public static long d(Metadata metadata) {
        if (metadata != null) {
            int n3 = metadata.e();
            for (int i3 = 0; i3 < n3; ++i3) {
                Metadata$Entry metadata$Entry = metadata.c(i3);
                boolean bl2 = metadata$Entry instanceof TextInformationFrame;
                if (!bl2) continue;
                metadata$Entry = (TextInformationFrame)metadata$Entry;
                String string2 = ((Id3Frame)metadata$Entry).a;
                String string3 = "TLEN";
                bl2 = string2.equals(string3);
                if (!bl2) continue;
                return gz3.I(Long.parseLong((String)((TextInformationFrame)metadata$Entry).c.get(0)));
            }
        }
        return -9223372036854775807L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block82: {
            block87: {
                block100: {
                    block101: {
                        block103: {
                            block102: {
                                block99: {
                                    block88: {
                                        block86: {
                                            block98: {
                                                block97: {
                                                    block95: {
                                                        block96: {
                                                            block85: {
                                                                block93: {
                                                                    block94: {
                                                                        block84: {
                                                                            block91: {
                                                                                block92: {
                                                                                    block90: {
                                                                                        block89: {
                                                                                            block83: {
                                                                                                var3_3 /* !! */  = this;
                                                                                                var4_4 = var1_1;
                                                                                                var5_5 /* !! */  = 4;
                                                                                                var6_6 = 1;
                                                                                                var7_7 = this.i;
                                                                                                ct3.h(var7_7);
                                                                                                var8_8 = gz3.a;
                                                                                                var8_8 = this.k;
                                                                                                var9_9 = 1000000L;
                                                                                                var11_10 = this.d;
                                                                                                var12_11 = 0;
                                                                                                var13_12 = null;
                                                                                                if (var8_8 == 0) {
                                                                                                    var7_7 = var1_1;
                                                                                                    try {
                                                                                                        var7_7 = (il0_0)var1_1;
                                                                                                    }
                                                                                                    catch (EOFException v0) {
                                                                                                        var14_13 = var11_10;
                                                                                                        var15_14 = -1;
                                                                                                        var16_15 = -1;
                                                                                                        break block82;
                                                                                                    }
                                                                                                    this.h((il0_0)var7_7, false);
                                                                                                }
                                                                                                var7_7 = var3_3 /* !! */ .r;
                                                                                                var17_16 = var3_3 /* !! */ .c;
                                                                                                if (var7_7 != null) break block88;
                                                                                                var18_17 = var11_10.c;
                                                                                                var7_7 = new Xm2(var18_17);
                                                                                                var19_18 /* !! */  = var7_7.a;
                                                                                                var16_15 = var11_10.c;
                                                                                                var20_19 = var4_4;
                                                                                                var20_19 = (il0_0)var4_4;
                                                                                                var20_19.b(var19_18 /* !! */ , 0, var16_15, false);
                                                                                                var18_17 = var11_10.a & var6_6;
                                                                                                var16_15 = 36;
                                                                                                if (var18_17 == 0) ** GOTO lbl47
                                                                                                var18_17 = var11_10.e;
                                                                                                if (var18_17 != var6_6) {
                                                                                                    var18_17 = 36;
                                                                                                } else {
                                                                                                    while (true) {
                                                                                                        var18_17 = 21;
                                                                                                        break block83;
                                                                                                        break;
                                                                                                    }
lbl47:
                                                                                                    // 1 sources

                                                                                                    if ((var18_17 = var11_10.e) != var6_6) ** continue;
                                                                                                    var18_17 = 13;
                                                                                                }
                                                                                            }
                                                                                            var21_20 = var7_7.c;
                                                                                            var22_21 = var18_17 + 4;
                                                                                            var23_22 = 1447187017;
                                                                                            var5_5 /* !! */  = 1231971951;
                                                                                            var6_6 = 1483304551;
                                                                                            if (var21_20 < var22_21) break block89;
                                                                                            var7_7.I(var18_17);
                                                                                            var22_21 = var7_7.i();
                                                                                            if (var22_21 == var6_6 || var22_21 == var5_5 /* !! */ ) break block90;
                                                                                        }
                                                                                        if ((var22_21 = var7_7.c) < (var18_17 = 40)) ** GOTO lbl-1000
                                                                                        var7_7.I(var16_15);
                                                                                        var22_21 = var7_7.i();
                                                                                        if (var22_21 == var23_22) {
                                                                                            var22_21 = 1447187017;
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            var22_21 = 0;
                                                                                            var24_23 /* !! */  = null;
                                                                                        }
                                                                                    }
                                                                                    var19_18 /* !! */  = (byte[])var3_3 /* !! */ .e;
                                                                                    var25_25 = -1;
                                                                                    if (var22_21 == var5_5 /* !! */ ) break block91;
                                                                                    if (var22_21 == var23_22) break block92;
                                                                                    if (var22_21 == var6_6) break block91;
                                                                                    var27_26 = var4_4;
                                                                                    var27_26 = (il0_0)var4_4;
                                                                                    var27_26.f = 0;
                                                                                    var14_13 = var11_10;
                                                                                    var28_27 = var17_16;
                                                                                    var29_28 /* !! */  = var19_18 /* !! */ ;
                                                                                    var15_14 = 0;
                                                                                    var4_4 = null;
                                                                                    break block93;
                                                                                }
                                                                                var27_26 = var4_4;
                                                                                var27_26 = (il0_0)var4_4;
                                                                                var30_29 = var27_26.d;
                                                                                var7_7.J(6);
                                                                                var6_6 = var7_7.i();
                                                                                var22_21 = var11_10.c;
                                                                                var28_27 = var17_16;
                                                                                var32_30 = (long)var22_21 + var30_29;
                                                                                var34_31 = var30_29;
                                                                                var36_32 = var6_6;
                                                                                var32_30 += var36_32;
                                                                                var6_6 = var7_7.i();
                                                                                if (var6_6 <= 0) {
                                                                                    var3_3 /* !! */  = var27_26;
                                                                                    var14_13 = var11_10;
lbl99:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var15_14 = 0;
                                                                                        var4_4 = null;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    var22_21 = var11_10.d;
                                                                                    var36_32 = var6_6;
                                                                                    var6_6 = 32000;
                                                                                    if (var22_21 >= var6_6) {
                                                                                        var6_6 = 1152;
lbl108:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var6_6 = 576;
                                                                                    ** continue;
                                                                                    var38_33 = var27_26;
                                                                                    var39_34 = (long)var6_6 * var9_9;
                                                                                    var41_35 = var22_21;
                                                                                    var43_36 = RoundingMode.DOWN;
                                                                                    var44_37 = gz3.O(var36_32, var39_34, var41_35, var43_36);
                                                                                    var46_38 = var7_7.C();
                                                                                    var5_5 /* !! */  = var7_7.C();
                                                                                    var6_6 = var7_7.C();
                                                                                    var7_7.J(2);
                                                                                    var22_21 = var11_10.c;
                                                                                    var36_32 = var22_21;
                                                                                    var36_32 = var34_31 + var36_32;
                                                                                    var24_23 /* !! */  = new long[var46_38];
                                                                                    var47_39 /* !! */  = new long[var46_38];
                                                                                    var49_41 /* !! */  = null;
                                                                                    for (var48_40 = (long)0; var48_40 < var46_38; var48_40 += var55_45) {
                                                                                        var50_42 = (long)var48_40 * var44_37;
                                                                                        var52_43 = var11_10;
                                                                                        var53_44 = var46_38;
                                                                                        var24_23 /* !! */ [var48_40] = var50_42 /= var53_44;
                                                                                        var47_39 /* !! */ [var48_40] = var36_32;
                                                                                        var55_45 = 1;
                                                                                        if (var6_6 != var55_45) {
                                                                                            var55_45 = 2;
                                                                                            if (var6_6 != var55_45) {
                                                                                                var15_14 = 3;
                                                                                                if (var6_6 != var15_14) {
                                                                                                    var15_14 = 4;
                                                                                                    if (var6_6 != var15_14) {
                                                                                                        var3_3 /* !! */  = var38_33;
                                                                                                        var14_13 = var11_10;
                                                                                                        ** continue;
                                                                                                    }
                                                                                                    var15_14 = var7_7.A();
                                                                                                } else {
                                                                                                    var15_14 = var7_7.z();
                                                                                                }
                                                                                            } else {
                                                                                                var15_14 = var7_7.C();
                                                                                            }
                                                                                        } else {
                                                                                            var15_14 = var7_7.w();
                                                                                        }
                                                                                        var53_44 = var15_14;
                                                                                        var50_42 = var5_5 /* !! */ ;
                                                                                        var36_32 += (var53_44 *= var50_42);
                                                                                        var55_45 = 1;
                                                                                        var3_3 /* !! */  = this;
                                                                                        var4_4 = var1_1;
                                                                                        var11_10 = var52_43;
                                                                                    }
                                                                                    var52_43 = var11_10;
                                                                                    var3_3 /* !! */  = var38_33;
                                                                                    var56_46 = var38_33.c;
                                                                                    var27_26 = ", ";
                                                                                    var6_6 = (int)(var56_46 == var25_25 ? 0 : (var56_46 < var25_25 ? -1 : 1));
                                                                                    if (var6_6 != 0 && (var6_6 = (int)(var56_46 == var32_30 ? 0 : (var56_46 < var32_30 ? -1 : 1))) != 0) {
                                                                                        var58_47 = "VBRI data size mismatch: ";
                                                                                        var4_4 = D70.c(var56_46, (String)var58_47, (String)var27_26);
                                                                                        var4_4.append(var32_30);
                                                                                        var4_4 = var4_4.toString();
                                                                                        Cx.f((String)var4_4);
                                                                                    }
                                                                                    if ((var15_14 = (int)(var32_30 == var36_32 ? 0 : (var32_30 < var36_32 ? -1 : 1))) != 0) {
                                                                                        var4_4 = D70.c(var32_30, "VBRI bytes and ToC mismatch (using max): ", (String)var27_26);
                                                                                        var4_4.append(var36_32);
                                                                                        var14_13 = "\nSeeking will be inaccurate.";
                                                                                        var4_4.append((String)var14_13);
                                                                                        var4_4 = var4_4.toString();
                                                                                        Cx.f((String)var4_4);
                                                                                        var32_30 = Math.max(var32_30, var36_32);
                                                                                    }
                                                                                    var14_13 = var52_43;
                                                                                    var5_5 /* !! */  = var52_43.f;
                                                                                    var4_4 = new wa3_2(var24_23 /* !! */ , var47_39 /* !! */ , var44_37, var32_30, var5_5 /* !! */ );
                                                                                }
                                                                                var5_5 /* !! */  = var14_13.c;
                                                                                var3_3 /* !! */ .j(var5_5 /* !! */ );
                                                                                var3_3 /* !! */  = this;
                                                                                var29_28 /* !! */  = var19_18 /* !! */ ;
                                                                                break block93;
                                                                            }
                                                                            var14_13 = var11_10;
                                                                            var28_27 = var17_16;
                                                                            var55_45 = var7_7.i();
                                                                            var15_14 = 1;
                                                                            var5_5 /* !! */  = var55_45 & 1;
                                                                            if (var5_5 /* !! */  != 0) {
                                                                                var15_14 = var7_7.A();
lbl197:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var15_14 = -1;
                                                                            ** while (true)
                                                                            var5_5 /* !! */  = 2;
                                                                            var48_40 = var55_45 & 2;
                                                                            if (var48_40 != false) {
                                                                                var59_48 = var9_9 = var7_7.y();
lbl205:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var59_48 = var25_25;
                                                                            ** while (true)
                                                                            var5_5 /* !! */  = 4;
                                                                            var48_40 = var55_45 & 4;
                                                                            if (var48_40 == var5_5 /* !! */ ) {
                                                                                var5_5 /* !! */  = 100;
                                                                                var49_41 /* !! */  = new long[var5_5 /* !! */ ];
                                                                                var62_50 = null;
                                                                                for (var61_49 /* !! */  = (long)0; var61_49 /* !! */  < var5_5 /* !! */ ; var61_49 /* !! */  += var65_51) {
                                                                                    var49_41 /* !! */ [var61_49 /* !! */ ] = var63_52 = (long)var7_7.w();
                                                                                    var65_51 = 1;
                                                                                }
                                                                                var66_53 /* !! */  = var49_41 /* !! */ ;
                                                                            } else {
                                                                                var66_53 /* !! */  = null;
                                                                            }
                                                                            if ((var55_45 &= 8) != 0) {
                                                                                var55_45 = 4;
                                                                                var7_7.J(var55_45);
                                                                            }
                                                                            if ((var55_45 = var7_7.a()) >= (var5_5 /* !! */  = 24)) {
                                                                                var7_7.J(21);
                                                                                var55_45 = var7_7.z();
                                                                                var5_5 /* !! */  = (0xFFF000 & var55_45) >> 12;
                                                                                var55_45 &= 4095;
                                                                            } else {
                                                                                var55_45 = -1;
                                                                                var5_5 /* !! */  = -1;
                                                                            }
                                                                            var9_9 = var15_14;
                                                                            var15_14 = var14_13.c;
                                                                            var8_8 = var14_13.d;
                                                                            var65_51 = var14_13.f;
                                                                            var12_11 = var14_13.g;
                                                                            var67_54 = var19_18 /* !! */ .a;
                                                                            var16_15 = -1;
                                                                            if (var67_54 != var16_15 && (var67_54 = var19_18 /* !! */ .b) != var16_15) lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (var5_5 /* !! */  == var16_15 || var55_45 == var16_15) ** GOTO lbl-1000
                                                                            var19_18 /* !! */ .a = var5_5 /* !! */ ;
                                                                            var19_18 /* !! */ .b = var55_45;
                                                                            ** while (true)
                                                                            var3_3 /* !! */  = var1_1;
                                                                            var27_26 = var1_1;
                                                                            var27_26 = (il0_0)var1_1;
                                                                            var36_32 = var27_26.d;
                                                                            var68_55 = var8_8;
                                                                            var69_56 = var27_26.c;
                                                                            var71_57 = var69_56 == var25_25 ? 0 : (var69_56 < var25_25 ? -1 : 1);
                                                                            if (var71_57 != false && (var71_57 = var59_48 == var25_25 ? 0 : (var59_48 < var25_25 ? -1 : 1)) != false) {
                                                                                var29_28 /* !! */  = var19_18 /* !! */ ;
                                                                                var72_58 = var36_32 + var59_48;
                                                                                cfr_temp_0 = var69_56 - var72_58;
                                                                                var74_59 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                if (var74_59 /* !! */  != false) {
                                                                                    var47_39 /* !! */  = (long[])"Data size mismatch between stream (";
                                                                                    var3_3 /* !! */  = D70.c(var69_56, (String)var47_39 /* !! */ , ") and Xing frame (");
                                                                                    var3_3 /* !! */ .append(var72_58);
                                                                                    var17_16 = "), using Xing value.";
                                                                                    var3_3 /* !! */ .append((String)var17_16);
                                                                                    var3_3 /* !! */  = var3_3 /* !! */ .toString();
                                                                                    Cx.e((String)var3_3 /* !! */ );
                                                                                }
                                                                            } else {
                                                                                var29_28 /* !! */  = var19_18 /* !! */ ;
                                                                            }
                                                                            var55_45 = var14_13.c;
                                                                            var27_26.j(var55_45);
                                                                            var72_58 = 1L;
                                                                            var55_45 = 1483304551;
                                                                            if (var22_21 != var55_45) break block94;
                                                                            var55_45 = (int)(var9_9 == var25_25 ? 0 : (var9_9 < var25_25 ? -1 : 1));
                                                                            if (var55_45 != 0 && (var55_45 = (int)((cfr_temp_1 = var9_9 - (var75_60 = 0L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) != 0) {
                                                                                var75_60 = var12_11;
                                                                                var9_9 = var9_9 * var75_60 - var72_58;
                                                                                var55_45 = var68_55;
                                                                                var77_61 = gz3.M(var68_55, var9_9);
                                                                                var75_60 = -9223372036854775807L;
                                                                            } else {
                                                                                var75_60 = -9223372036854775807L;
                                                                                var77_61 = -9223372036854775807L;
                                                                            }
                                                                            var55_45 = (int)(var77_61 == var75_60 ? 0 : (var77_61 < var75_60 ? -1 : 1));
                                                                            if (var55_45 == 0) lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                while (true) {
                                                                                    var15_14 = 0;
                                                                                    var4_4 = null;
                                                                                    break block84;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var55_45 = (int)(var59_48 == var25_25 ? 0 : (var59_48 < var25_25 ? -1 : 1));
                                                                            if (var55_45 != 0 && var66_53 /* !! */  != null) {
                                                                                var52_43 = var3_3 /* !! */ ;
                                                                                var39_34 = var36_32;
                                                                                var79_62 = var77_61;
                                                                                var3_3 /* !! */  = new tj3_0(var36_32, var15_14, var77_61, var65_51, var59_48, var66_53 /* !! */ );
lbl298:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var4_4 = var3_3 /* !! */ ;
                                                                                    break block84;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var81_64 = -1;
                                                                            var3_3 /* !! */  = new tj3_0(var36_32, var15_14, var77_61, var65_51, var81_64, null);
                                                                            ** GOTO lbl298
                                                                        }
                                                                        var3_3 /* !! */  = this;
                                                                        break block93;
                                                                    }
                                                                    var55_45 = var68_55;
                                                                    var5_5 /* !! */  = (int)(var9_9 == var25_25 ? 0 : (var9_9 < var25_25 ? -1 : 1));
                                                                    if (var5_5 /* !! */  != 0 && (var5_5 /* !! */  = (int)((cfr_temp_2 = var9_9 - (var83_63 = 0L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) != 0) {
                                                                        var63_52 = (long)var12_11 * var9_9 - var72_58;
                                                                        var79_62 = gz3.M(var68_55, var63_52);
                                                                        var63_52 = -9223372036854775807L;
                                                                    } else {
                                                                        var63_52 = -9223372036854775807L;
                                                                        var79_62 = -9223372036854775807L;
                                                                    }
                                                                    if ((var55_45 = (int)(var79_62 == var63_52 ? 0 : (var79_62 < var63_52 ? -1 : 1))) == 0) ** GOTO lbl-1000
                                                                    var55_45 = (int)(var59_48 == var25_25 ? 0 : (var59_48 < var25_25 ? -1 : 1));
                                                                    if (var55_45 != 0) {
                                                                        var69_56 = var36_32 + var59_48;
                                                                        var63_52 = var15_14;
                                                                        var59_48 -= var63_52;
lbl323:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var55_45 = (int)(var69_56 == var25_25 ? 0 : (var69_56 < var25_25 ? -1 : 1));
                                                                    if (var55_45 != 0) ** break;
                                                                    ** while (true)
                                                                    var63_52 = var69_56 - var36_32;
                                                                    var72_58 = var15_14;
                                                                    var59_48 = var63_52 - var72_58;
                                                                    ** while (true)
                                                                    var75_60 = var59_48;
                                                                    var3_3 /* !! */  = RoundingMode.HALF_UP;
                                                                    var85_65 = 8000000L;
                                                                    var87_66 = gz3.O(var59_48, var85_65, var79_62, (RoundingMode)var3_3 /* !! */ );
                                                                    var89_67 = Ints.checkedCast(var87_66);
                                                                    var90_68 = Ints.checkedCast(LongMath.divide(var59_48, var9_9, (RoundingMode)var3_3 /* !! */ ));
                                                                    var75_60 = var15_14;
                                                                    var91_69 = var36_32 + var75_60;
                                                                    var66_53 /* !! */  = (long[])var3_3 /* !! */ ;
                                                                    var3_3 /* !! */  = new o50_0(var69_56, var91_69, var89_67, var90_68, false);
                                                                    ** while (true)
                                                                }
                                                                var27_26 = var3_3 /* !! */ .l;
                                                                var58_47 = var1_1;
                                                                var7_7 = var1_1;
                                                                var7_7 = (il0_0)var1_1;
                                                                var93_70 = var7_7.d;
                                                                if (var27_26 != null) {
                                                                    var62_50 = var27_26.a;
                                                                    var65_51 = ((Metadata$Entry[])var62_50).length;
                                                                    var13_12 = null;
                                                                    for (var12_11 = 0; var12_11 < var65_51; var12_11 += var6_6) {
                                                                        var17_16 = var62_50[var12_11];
                                                                        var18_17 = var17_16 instanceof MlltFrame;
                                                                        if (var18_17 != 0) {
                                                                            var17_16 = (MlltFrame)var17_16;
                                                                            var53_44 = yq1_1.d((Metadata)var27_26);
                                                                            var27_26 = var17_16.e;
                                                                            var5_5 /* !! */  = ((Object)var27_26).length;
                                                                            var12_11 = var5_5 /* !! */  + 1;
                                                                            var19_18 /* !! */  = (byte[])new long[var12_11];
                                                                            var13_12 = new long[var12_11];
                                                                            var16_15 = 0;
                                                                            var95_71 = null;
                                                                            var19_18 /* !! */ [0] = (byte)var93_70;
                                                                            var13_12[0] = var30_29 = 0L;
                                                                            var36_32 = 0L;
                                                                            for (var21_20 = 1; var21_20 <= var5_5 /* !! */ ; var21_20 += var6_6) {
                                                                                var68_55 = var21_20 + -1;
                                                                                var96_72 = var5_5 /* !! */ ;
                                                                                var5_5 /* !! */  = var17_16.e[var68_55];
                                                                                var75_60 = var17_16.c + var5_5 /* !! */ ;
                                                                                var93_70 += var75_60;
                                                                                var27_26 = var17_16.f;
                                                                                var5_5 /* !! */  = (int)var27_26[var68_55];
                                                                                var75_60 = var17_16.d + var5_5 /* !! */ ;
                                                                                var19_18 /* !! */ [var21_20] = (byte)var93_70;
                                                                                var13_12[var21_20] = var36_32 += var75_60;
                                                                                var6_6 = 1;
                                                                                var58_47 = var1_1;
                                                                                var5_5 /* !! */  = var96_72;
                                                                            }
                                                                            var6_6 = 1;
                                                                            var27_26 = new np1_1(var19_18 /* !! */ , var13_12, var53_44);
                                                                            break block85;
                                                                        }
                                                                        var6_6 = 1;
                                                                        var58_47 = var1_1;
                                                                    }
                                                                }
                                                                var5_5 /* !! */  = 0;
                                                                var27_26 = null;
                                                            }
                                                            var6_6 = (int)var3_3 /* !! */ .s;
                                                            var22_21 = var3_3 /* !! */ .a;
                                                            if (var6_6 != 0) {
                                                                var75_60 = -9223372036854775807L;
                                                                var4_4 = new dX2$b(var75_60);
lbl398:
                                                                // 3 sources

                                                                while (true) {
                                                                    var27_26 = var4_4;
                                                                    var4_4 = var28_27;
                                                                    break block86;
                                                                    break;
                                                                }
                                                            }
                                                            var6_6 = 4;
                                                            var48_40 = var22_21 & 4;
                                                            if (var48_40 == false) break block95;
                                                            if (var27_26 != null) {
                                                                var75_60 = var27_26.c;
lbl407:
                                                                // 3 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            if (var4_4 == null) break block96;
                                                            var75_60 = var4_4.getDurationUs();
                                                            var25_25 = var4_4.f();
                                                            ** GOTO lbl407
                                                        }
                                                        var4_4 = var3_3 /* !! */ .l;
                                                        var75_60 = yq1_1.d((Metadata)var4_4);
                                                        ** while (true)
                                                        var53_44 = var75_60;
                                                        var32_30 = var7_7.d;
                                                        var49_41 /* !! */  = (long[])var4_4;
                                                        var4_4 = new ig1_1(var75_60, var32_30, var25_25);
                                                        break block97;
                                                    }
                                                    if (var27_26 != null) {
                                                        var4_4 = var27_26;
                                                    } else if (var4_4 == null) {
                                                        var15_14 = 0;
                                                        var4_4 = null;
                                                    }
                                                }
                                                if (var4_4 == null) break block98;
                                                var5_5 /* !! */  = (int)var4_4.g();
                                                if (var5_5 /* !! */  != 0) ** GOTO lbl398
                                                var5_5 /* !! */  = 1;
                                                var6_6 = var22_21 & 1;
                                                if (var6_6 != 0) ** break;
                                                ** while (true)
                                            }
                                            if ((var15_14 = 2 & var22_21) != 0) {
                                                var4_4 = var28_27;
                                                var23_22 = 1;
                                            } else {
                                                var4_4 = var28_27;
                                                var23_22 = 0;
                                                var20_19 = null;
                                            }
                                            var27_26 = var4_4.a;
                                            var6_6 = 0;
                                            var58_47 = null;
                                            var48_40 = 4;
                                            var7_7.b((byte[])var27_26, 0, (int)var48_40, false);
                                            var4_4.I(0);
                                            var5_5 /* !! */  = var4_4.i();
                                            var14_13.a(var5_5 /* !! */ );
                                            var32_30 = var7_7.d;
                                            var18_17 = var14_13.f;
                                            var16_15 = var14_13.c;
                                            var53_44 = var7_7.c;
                                            var49_41 /* !! */  = (long[])var27_26;
                                            var27_26 = new o50_0(var53_44, var32_30, var18_17, var16_15, (boolean)var23_22);
                                        }
                                        var3_3 /* !! */ .r = var27_26;
                                        var3_3 /* !! */ .h.h((dx2_1)var27_26);
                                        var27_26 = new d$a();
                                        var27_26.n = var58_47 = ip1_0.l(var14_13.b);
                                        var27_26.o = 4096;
                                        var27_26.C = var6_6 = var14_13.e;
                                        var27_26.D = var6_6 = var14_13.d;
                                        var58_47 = var29_28 /* !! */ ;
                                        var48_40 = var29_28 /* !! */ .a;
                                        var27_26.F = (int)var48_40;
                                        var27_26.G = var6_6 = var29_28 /* !! */ .b;
                                        var6_6 = var22_21 & 8;
                                        if (var6_6 != 0) {
                                            var16_15 = 0;
                                            var95_71 = null;
                                        } else {
                                            var95_71 = var3_3 /* !! */ .l;
                                        }
                                        var27_26.k = var95_71;
                                        var58_47 = var3_3 /* !! */ .r;
                                        var6_6 = var58_47.j();
                                        var22_21 = -2147483647;
                                        if (var6_6 != var22_21) {
                                            var58_47 = var3_3 /* !! */ .r;
                                            var27_26.h = var6_6 = var58_47.j();
                                        }
                                        var58_47 = var3_3 /* !! */ .j;
                                        var24_23 /* !! */  = (long[])new d;
                                        var24_23 /* !! */ ((d$a)var27_26);
                                        var58_47.d((d)var24_23 /* !! */ );
                                        var3_3 /* !! */ .o = var75_60 = var7_7.d;
                                        var7_7 = var1_1;
                                        break block99;
                                    }
                                    var14_13 = var11_10;
                                    var4_4 = var17_16;
                                    var75_60 = var3_3 /* !! */ .o;
                                    var87_66 = 0L;
                                    var48_40 = var75_60 == var87_66 ? 0 : (var75_60 < var87_66 ? -1 : 1);
                                    var7_7 = var1_1;
                                    if (var48_40 != false) {
                                        var24_24 = var1_1;
                                        var24_24 = (il0_0)var1_1;
                                        var93_70 = var24_24.d;
                                        cfr_temp_3 = var93_70 - var75_60;
                                        var61_49 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                        if (var61_49 /* !! */  < 0) {
                                            var6_6 = (int)(var75_60 -= var93_70);
                                            var27_26 = var1_1;
                                            var27_26 = (il0_0)var1_1;
                                            var27_26.j(var6_6);
                                        }
                                    }
                                }
                                var5_5 /* !! */  = var3_3 /* !! */ .q;
                                if (var5_5 /* !! */  != 0) break block100;
                                var27_26 = var7_7;
                                var27_26 = (il0_0)var7_7;
                                var6_6 = 0;
                                var58_47 = null;
                                var27_26.f = 0;
                                var27_26 = var7_7;
                                var27_26 = (il0_0)var7_7;
                                var22_21 = var3_3 /* !! */ .g((il0_0)var27_26);
                                if (var22_21 != 0) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var12_11 = -1;
                                        break block87;
                                        break;
                                    }
                                }
                                var4_4.I(0);
                                var15_14 = var4_4.i();
                                var93_70 = var3_3 /* !! */ .k;
                                var53_44 = -128000 & var15_14;
                                var32_30 = 4294839296L;
                                cfr_temp_4 = var53_44 - (var93_70 &= var32_30);
                                var6_6 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                if (var6_6 != 0 || (var6_6 = EQ1.a(var15_14)) == (var22_21 = -1)) break block101;
                                var14_13.a(var15_14);
                                var93_70 = var3_3 /* !! */ .m;
                                var53_44 = -9223372036854775807L;
                                var15_14 = (int)(var93_70 == var53_44 ? 0 : (var93_70 < var53_44 ? -1 : 1));
                                if (var15_14 == 0) {
                                    var4_4 = var3_3 /* !! */ .r;
                                    var93_70 = var27_26.d;
                                    var3_3 /* !! */ .m = var93_70 = var4_4.h(var93_70);
                                    var93_70 = var3_3 /* !! */ .b;
                                    cfr_temp_5 = var93_70 - var53_44;
                                    var15_14 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                    if (var15_14 != 0) {
                                        var4_4 = var3_3 /* !! */ .r;
                                        var53_44 = var4_4.h(0L);
                                        var32_30 = var3_3 /* !! */ .m;
                                        var3_3 /* !! */ .m = var93_70 = var93_70 - var53_44 + var32_30;
                                    }
                                }
                                var3_3 /* !! */ .q = var15_14 = var14_13.c;
                                var75_60 = var27_26.d;
                                var93_70 = var15_14;
                                var3_3 /* !! */ .p = var75_60 += var93_70;
                                var4_4 = var3_3 /* !! */ .r;
                                var22_21 = var4_4 instanceof ig1_1;
                                if (var22_21 == 0) break block100;
                                var4_4 = (ig1_1)var4_4;
                                var93_70 = var3_3 /* !! */ .n;
                                var61_49 /* !! */  = var14_13.g;
                                var53_44 = var61_49 /* !! */ ;
                                var93_70 += var53_44;
                                var53_44 = var3_3 /* !! */ .m;
                                var93_70 *= 1000000L;
                                var12_11 = var14_13.d;
                                var32_30 = var12_11;
                                var93_70 = var93_70 / var32_30 + var53_44;
                                var62_50 = var4_4.c.b;
                                var65_51 = var62_50.a;
                                var32_30 = 100000L;
                                var4_4 = var4_4.c;
                                if (var65_51 == 0) break block102;
                                var53_44 = var62_50.c(--var65_51);
                                cfr_temp_6 = (var53_44 = var93_70 - var53_44) - var32_30;
                                var18_17 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                                if (var18_17 < 0) break block103;
                            }
                            var4_4.a(var93_70, var75_60);
                        }
                        var5_5 /* !! */  = (int)var3_3 /* !! */ .t;
                        if (var5_5 /* !! */  == 0) break block100;
                        var75_60 = var3_3 /* !! */ .u;
                        var4_4 = var4_4.b;
                        var22_21 = var4_4.a;
                        if (var22_21 == 0) {
                            while (true) {
                                var15_14 = 0;
                                var4_4 = null;
                                ** GOTO lbl606
                                break;
                            }
                        } else {
                            if ((var15_14 = (int)((cfr_temp_7 = (var75_60 -= (var93_70 = var4_4.c(var22_21 -= (var48_40 = (long)1)))) - var32_30) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1))) >= 0) ** continue;
                            var15_14 = 0;
                            var4_4 = null;
                            var3_3 /* !! */ .t = false;
                            var3_3 /* !! */ .j = var27_26 = var3_3 /* !! */ .i;
                        }
                        break block100;
                    }
                    var15_14 = 0;
                    var4_4 = null;
                    var6_6 = 1;
                    var27_26.j(var6_6);
                    var3_3 /* !! */ .k = 0;
lbl602:
                    // 3 sources

                    while (true) {
                        var12_11 = 0;
                        var13_12 = null;
                        break block87;
                        break;
                    }
                }
                var6_6 = 1;
                var4_4 = var3_3 /* !! */ .j;
                var5_5 /* !! */  = var3_3 /* !! */ .q;
                var15_14 = var4_4.c((mi0_0)var7_7, var5_5 /* !! */ , (boolean)var6_6);
                var5_5 /* !! */  = -1;
                ** while (var15_14 == var5_5 /* !! */ )
lbl613:
                // 1 sources

                var3_3 /* !! */ .q = var5_5 /* !! */  = var3_3 /* !! */ .q - var15_14;
                if (var5_5 /* !! */  > 0) ** GOTO lbl602
                var58_47 = var3_3 /* !! */ .j;
                var87_66 = var3_3 /* !! */ .n;
                var9_9 = var3_3 /* !! */ .m;
                var87_66 *= 1000000L;
                var63_52 = var14_13.d;
                var87_66 = var87_66 / var63_52 + var9_9;
                var61_49 /* !! */  = var14_13.c;
                var65_51 = 0;
                var11_10 = null;
                var12_11 = 0;
                var13_12 = null;
                var48_40 = 1;
                var58_47.a(var87_66, (int)var48_40, (int)var61_49 /* !! */ , 0, null);
                var75_60 = var3_3 /* !! */ .n;
                var87_66 = var14_13.g;
                var3_3 /* !! */ .n = var75_60 += var87_66;
                var15_14 = 0;
                var4_4 = null;
                var3_3 /* !! */ .q = 0;
                ** while (true)
            }
            var16_15 = var12_11;
            var15_14 = -1;
        }
        if (var16_15 == var15_14 && (var5_5 /* !! */  = (var4_4 = var3_3 /* !! */ .r) instanceof ig1_1) != 0) {
            var75_60 = var3_3 /* !! */ .n;
            var87_66 = var3_3 /* !! */ .m;
            var75_60 *= 1000000L;
            var46_38 = var14_13.d;
            var9_9 = var46_38;
            var75_60 = var75_60 / var9_9 + var87_66;
            var56_46 = ((dx2_1)var4_4).getDurationUs();
            cfr_temp_8 = var56_46 - var75_60;
            var8_8 = (int)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
            if (var8_8 != 0) {
                var14_13 = var4_4 = var3_3 /* !! */ .r;
                ((ig1_1)var4_4).c.c = var75_60;
                var14_13 = var3_3 /* !! */ .h;
                var14_13.h((dx2_1)var4_4);
            }
        }
        return var16_15;
    }

    public final boolean b(fi0_0 fi0_02) {
        fi0_02 = (il0_0)fi0_02;
        return this.h((il0_0)fi0_02, true);
    }

    public final void c(long l2, long l3) {
        block2: {
            int n3;
            Object object;
            block3: {
                long l4;
                this.k = 0;
                this.m = -9223372036854775807L;
                this.n = l4 = 0L;
                this.q = 0;
                this.u = l3;
                object = this.r;
                int n4 = object instanceof ig1_1;
                if (n4 == 0) break block2;
                object = ((ig1_1)object).c.b;
                n4 = ((ZA1)object).a;
                n3 = 1;
                if (n4 == 0) break block3;
                l2 = ((ZA1)object).c(n4 -= n3);
                long l7 = (l3 -= l2) - (l2 = 100000L);
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 < 0) break block2;
            }
            this.t = n3;
            this.j = object = this.g;
        }
    }

    public final eI0 e() {
        return this;
    }

    public final void f() {
        px2_1 px2_12;
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        boolean bl2;
        Object object = this.r;
        boolean bl3 = object instanceof o50_0;
        if (bl3 && (bl2 = ((n50_0)(object = (n50_0)object)).g()) && (l8 = (l7 = (l4 = this.p) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (l8 = (l2 = l4 - (l3 = (px2_12 = this.r).f())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            o50_0 o50_02;
            object = (o50_0)this.r;
            l3 = this.p;
            int n3 = ((o50_0)object).j;
            int n4 = ((o50_0)object).i;
            boolean bl4 = ((o50_0)object).k;
            long l12 = ((o50_0)object).h;
            px2_1 px2_13 = o50_02;
            o50_02 = new o50_0(l3, l12, n4, n3, bl4);
            this.r = o50_02;
            object = this.h;
            object.getClass();
            px2_13 = this.r;
            object.h(px2_13);
        }
    }

    public final boolean g(il0_0 il0_02) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        Object object = this.r;
        boolean bl2 = true;
        if (object != null && (l12 = (l8 = (l7 = object.f()) - (l4 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false && (l12 = (l3 = (l4 = il0_02.h()) - (l7 -= (l2 = (long)4))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            return bl2;
        }
        try {
            object = this.c;
        }
        catch (EOFException eOFException) {
            return bl2;
        }
        object = ((Xm2)object).a;
        int n3 = 4;
        return il0_02.b((byte[])object, 0, n3, bl2) ^ bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean h(il0_0 il0_02, boolean bl2) {
        int n3;
        Object object;
        Object object2;
        int n4;
        yq1_1 yq1_12 = this;
        Object object3 = il0_02;
        int n7 = bl2 ? 32768 : 131072;
        ((il0_0)object3).f = 0;
        long l2 = ((il0_0)object3).d;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 == false) {
            n4 = yq1_12.a & 8;
            if (n4 == 0) {
                n4 = 0;
                object2 = null;
            } else {
                object2 = v;
            }
            object = yq1_12.f;
            yq1_12.l = object2 = ((vc1_0)object).a((il0_0)object3, (Uc1$a)object2);
            if (object2 != null) {
                object = yq1_12.e;
                ((IY0)object).b((Metadata)object2);
            }
            l2 = il0_02.h();
            n3 = (int)l2;
            if (!bl2) {
                ((il0_0)object3).j(n3);
            }
            n4 = 0;
            object2 = null;
        } else {
            n4 = 0;
            object2 = null;
            n3 = 0;
            object = null;
        }
        int n8 = 0;
        int n10 = 0;
        while (true) {
            block28: {
                int n14;
                block23: {
                    int n15;
                    block27: {
                        block26: {
                            block25: {
                                int n16;
                                int n17;
                                block24: {
                                    block22: {
                                        n15 = this.g(il0_02);
                                        n14 = 1;
                                        if (n15 == 0) break block22;
                                        if (n8 <= 0) {
                                            this.f();
                                            object3 = new EOFException();
                                            throw object3;
                                        }
                                        break block23;
                                    }
                                    Xm2 xm2 = yq1_12.c;
                                    xm2.I(0);
                                    n15 = xm2.i();
                                    if (n4 == 0) break block24;
                                    long l7 = n4;
                                    int n18 = 0xFFFE0C00 & n15;
                                    long l8 = n18;
                                    long l12 = 4294839296L;
                                    long l14 = l8 - (l7 &= l12);
                                    Object object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object5 != false) break block25;
                                }
                                if ((n17 = EQ1.a(n15)) != (n16 = -1)) break block26;
                            }
                            n4 = n10 + 1;
                            if (n10 == n7) {
                                if (bl2) {
                                    return false;
                                }
                                this.f();
                                object3 = new EOFException();
                                throw object3;
                            }
                            if (bl2) {
                                ((il0_0)object3).f = 0;
                                n8 = n3 + n4;
                                ((il0_0)object3).l(n8, false);
                            } else {
                                ((il0_0)object3).j(n14);
                            }
                            n10 = n4;
                            n4 = 0;
                            object2 = null;
                            n8 = 0;
                            continue;
                        }
                        if (++n8 != n14) break block27;
                        object2 = yq1_12.d;
                        ((EQ1$a)object2).a(n15);
                        n4 = n15;
                        break block28;
                    }
                    n15 = 4;
                    if (n8 != n15) break block28;
                }
                if (bl2) {
                    ((il0_0)object3).j(n3 += n10);
                } else {
                    ((il0_0)object3).f = 0;
                }
                yq1_12.k = n4;
                return n14 != 0;
            }
            ((il0_0)object3).l(n17 += -4, false);
        }
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 object) {
        this.h = object;
        this.i = object = object.n(0, 1);
        this.j = object;
        this.h.j();
    }

    public final void release() {
    }
}

