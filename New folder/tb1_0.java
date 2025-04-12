/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tB1
 */
public abstract class tb1_0
extends Ns2
implements dl1_1,
rq1_1 {
    public static final tB1$a l = tB1$a.c;
    public boolean f;
    public boolean g;
    public boolean h;
    public final wb1_0 i;
    public fr1_1 j;
    public fr1_1 k;

    public tb1_0() {
        Object object = Os2.a;
        this.i = object = new wb1_0(this);
    }

    public static void C0(w32_0 object) {
        boolean bl2;
        Tg2 tg2 = ((w32_0)object).p;
        if (tg2 != null) {
            tg2 = tg2.m;
        } else {
            bl2 = false;
            tg2 = null;
        }
        object = ((w32_0)object).m;
        bl2 = Intrinsics.areEqual(tg2, object);
        if (!bl2) {
            object = ((xp1_0)object).z.r.u;
            ((Sc)object).g();
        } else {
            object = ((xp1_0)object).z.r.x();
            if (object != null && (object = ((bq1$b)object).u) != null) {
                ((Sc)object).g();
            }
        }
    }

    public abstract tb1_0 A0();

    public abstract long B0();

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final bl1_0 F0(int n3, int n4, Map object, Function1 function1) {
        int n7 = -16777216;
        int n8 = n3 & n7;
        if (n8 == 0 && (n7 &= n4) == 0) {
            ub1_0 ub1_02 = new ub1_0(n3, n4, (Map)object, function1, this);
            return ub1_02;
        }
        object = new StringBuilder("Size(");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" x ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(") is out of range. Each dimension must be between 0 and 16777215.");
        bh1_1.c(((StringBuilder)object).toString());
        throw null;
    }

    public abstract void G0();

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final /* synthetic */ long K0(float f5) {
        return mv0_0.b(f5, this);
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.K0(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final int U(Oc oc) {
        boolean bl2 = this.w0();
        int n3 = -1 << -1;
        if (!bl2) {
            return n3;
        }
        int n4 = this.o0(oc);
        if (n4 == n3) {
            return n3;
        }
        n3 = (int)(this.e & 0xFFFFFFFFL);
        return n4 + n3;
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.F0(n3, n4, map2, function1);
    }

    public boolean W() {
        return false;
    }

    public final void X(boolean bl2) {
        this.f = bl2;
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public abstract int o0(Oc var1);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void q0(Ps2 var1_1) {
        block42: {
            block40: {
                block43: {
                    block41: {
                        var2_2 /* !! */  = this;
                        var3_3 = var1_1;
                        var4_4 /* !! */  = 7;
                        var5_5 = this.h;
                        if (var5_5) {
                            return;
                        }
                        var6_6 = var1_1.a.k();
                        if (var6_6 != null) break block41;
                        var7_7 = this;
                        break block42;
                    }
                    var6_6 = this.k;
                    if (var6_6 == null) {
                        this.k = var6_6 = new fr1_1();
                    }
                    if ((var8_9 = var2_2 /* !! */ .j) == null) {
                        var2_2 /* !! */ .j = var8_9 = new fr1_1();
                    }
                    Intrinsics.checkNotNullParameter(var8_9, "from");
                    var9_10 /* !! */  = var8_9.b;
                    var10_11 /* !! */  = var8_9.c;
                    var11_12 /* !! */  = var8_9.a;
                    var12_13 = var11_12 /* !! */ .length + -2;
                    var13_14 = -9187201950435737472L;
                    var15_15 = 8;
                    if (var12_13 < 0) break block43;
                    var16_16 /* !! */  = 0;
                    while (true) {
                        block49: {
                            block44: {
                                if ((var21_19 = (cfr_temp_0 = (var19_18 = ((var17_17 = var11_12 /* !! */ [var16_16 /* !! */ ]) ^ (long)-1) << var4_4 /* !! */  & var17_17 & var13_14) - var13_14) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) break block44;
                                var22_20 = ~(var16_16 /* !! */  - var12_13) >>> 31;
                                var22_20 = 8 - var22_20;
                                var23_21 /* !! */  = 0;
                                var24_22 = null;
                                while (var23_21 /* !! */  < var22_20) {
                                    block39: {
                                        block45: {
                                            var25_23 = 255L;
                                            var27_24 = var17_17 & var25_23;
                                            var29_25 = 128L;
                                            cfr_temp_1 = var27_24 - var29_25;
                                            var31_26 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                            if (var31_26 /* !! */  >= 0) break block45;
                                            var21_19 = (var16_16 /* !! */  << 3) + var23_21 /* !! */ ;
                                            var7_8 = var9_10 /* !! */ [var21_19];
                                            var32_27 = var10_11 /* !! */ [var21_19];
                                            if (var7_8 != null) {
                                                var31_26 /* !! */  = var7_8.hashCode();
                                            } else {
                                                var31_26 /* !! */  = 0;
                                                var33_28 = null;
                                            }
                                            var34_29 = -862048943;
                                            var35_30 = (var31_26 /* !! */  *= var34_29) << 16;
                                            var31_26 /* !! */  = var31_26 /* !! */  ^ var35_30;
                                            var36_31 = (int)(var31_26 /* !! */  >>> 7);
                                            var4_4 /* !! */  = var31_26 /* !! */  & 127;
                                            var33_28 = var9_10 /* !! */ ;
                                            var37_32 = var6_6.d;
                                            var38_33 = var36_31 & var37_32;
                                            var39_34 = var10_11 /* !! */ ;
                                            var40_35 = 0;
                                            while (true) {
                                                block46: {
                                                    block38: {
                                                        block48: {
                                                            block47: {
                                                                var10_11 /* !! */  = var6_6.a;
                                                                var41_36 = var38_33 >> 3;
                                                                var42_37 = 7;
                                                                var43_38 = var38_33 & 7;
                                                                var44_39 = var11_12 /* !! */ ;
                                                                var45_40 = var43_38 << 3;
                                                                var46_41 = var10_11 /* !! */ [var41_36] >>> var45_40;
                                                                var35_30 = 1;
                                                                var48_42 /* !! */  = var10_11 /* !! */ [++var41_36];
                                                                var50_43 = 64 - var45_40;
                                                                var51_44 = -((long)var45_40) >> 63;
                                                                var51_44 = (long)((var48_42 /* !! */  <<= var50_43) & var51_44);
                                                                var51_44 = (long)(var46_41 | var51_44);
                                                                var53_45 = var4_4 /* !! */ ;
                                                                var48_42 /* !! */  = 0x101010101010101L;
                                                                var46_41 = var53_45 * var48_42 /* !! */ ;
                                                                var55_46 = var12_13;
                                                                var56_47 = var16_16 /* !! */ ;
                                                                var57_48 = (reference)(var51_44 ^ var46_41);
                                                                var48_42 /* !! */  = (float)(var57_48 - var48_42 /* !! */ );
                                                                var57_48 ^= (long)-1;
                                                                var57_48 = (reference)(var48_42 /* !! */  & var57_48 & var13_14);
                                                                while ((var59_49 /* !! */  = (cfr_temp_2 = var57_48 - (var48_42 /* !! */  = (float)0L)) == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1)) != false) {
                                                                    var41_36 = Long.numberOfTrailingZeros((long)var57_48) >> 3;
                                                                    var41_36 = var38_33 + var41_36 & var37_32;
                                                                    var59_49 /* !! */  = (reference)var4_4 /* !! */ ;
                                                                    var60_50 = var6_6.b[var41_36];
                                                                    var4_4 /* !! */  = (int)Intrinsics.areEqual(var60_50, var7_8);
                                                                    if (var4_4 /* !! */  != 0) {
                                                                        var61_51 = var7_8;
                                                                        var62_52 = var8_9;
                                                                        var63_53 = var17_17;
                                                                        var65_54 = var22_20;
                                                                        var66_55 = var23_21 /* !! */ ;
                                                                        var67_56 = var41_36;
                                                                        var68_57 /* !! */  = -1;
                                                                        var69_58 = 0.0f / 0.0f;
                                                                        break block38;
                                                                    }
                                                                    var48_42 /* !! */  = (float)(var57_48 - 1L);
                                                                    var57_48 &= var48_42 /* !! */ ;
                                                                    var4_4 /* !! */  = (int)var59_49 /* !! */ ;
                                                                }
                                                                var59_49 /* !! */  = (reference)var4_4 /* !! */ ;
                                                                var57_48 = (reference)((var51_44 ^ (long)-1) << 6);
                                                                cfr_temp_3 = (var51_44 = var51_44 & var57_48 & var13_14) - var48_42 /* !! */ ;
                                                                var4_4 /* !! */  = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                                                if (var4_4 /* !! */  == 0) break block46;
                                                                var4_4 /* !! */  = var6_6.c(var36_31);
                                                                var37_32 = var6_6.f;
                                                                if (var37_32 == 0 && (var16_16 /* !! */  = (int)((cfr_temp_4 = (var70_59 = (reference)((var51_44 = (long)(var9_10 /* !! */  = (Object[])var6_6.a)[var50_43 = var4_4 /* !! */  >> 3]) >> (var37_32 = (var12_13 = var4_4 /* !! */  & 7) << 3) & 255L)) - (var72_60 = (reference)254L)) == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1))) != 0) break block47;
                                                                var74_61 = var53_45;
                                                                var61_51 = var7_8;
                                                                var62_52 = var8_9;
                                                                var63_53 = var17_17;
                                                                var65_54 = var22_20;
                                                                var66_55 = var23_21 /* !! */ ;
                                                                var68_57 /* !! */  = -1;
                                                                var69_58 = 0.0f / 0.0f;
                                                                var76_62 /* !! */  = 1;
                                                                var77_63 = 1.4E-45f;
                                                                break block48;
                                                            }
                                                            var4_4 /* !! */  = var6_6.d;
                                                            var37_32 = 8;
                                                            if (var4_4 /* !! */  <= var37_32) ** GOTO lbl-1000
                                                            var37_32 = var6_6.e;
                                                            var70_59 = (reference)((long)var37_32);
                                                            var78_64 = 32;
                                                            var70_59 *= var78_64;
                                                            var72_60 = (reference)((long)var4_4 /* !! */  * (long)25);
                                                            var48_42 /* !! */  = -9223372036854775808L;
                                                            var4_4 /* !! */  = Long.compare((long)(var70_59 ^= var48_42 /* !! */ ), (long)(var72_60 ^= var48_42 /* !! */ ));
                                                            if (var4_4 /* !! */  <= 0) {
                                                                var60_50 = var6_6.a;
                                                                var37_32 = var6_6.d;
                                                                var10_11 /* !! */  = (float[])var6_6.b;
                                                                var11_12 /* !! */  = (long[])var6_6.c;
                                                                et2_1.a((long[])var60_50, var37_32);
                                                                var12_13 = 0;
                                                                var16_16 /* !! */  = -1;
                                                                block4: while (var12_13 != var37_32) {
                                                                    var59_49 /* !! */  = (reference)(var12_13 >> 3);
                                                                    var80_65 = var60_50[var59_49 /* !! */ ];
                                                                    var42_37 = 7;
                                                                    var82_66 = (var12_13 & 7) << 3;
                                                                    var80_65 >>= var82_66;
                                                                    var25_23 = 255L;
                                                                    var29_25 = 128L;
                                                                    cfr_temp_5 = (var80_65 &= var25_23) - var29_25;
                                                                    var83_67 = cfr_temp_5 == 0 ? 0 : (cfr_temp_5 < 0 ? -1 : 1);
                                                                    if (var83_67 == false) {
                                                                        var35_30 = 1;
                                                                        var84_68 = var12_13 + 1;
                                                                        var16_16 /* !! */  = var12_13;
                                                                        var12_13 = var84_68;
                                                                        continue;
                                                                    }
                                                                    var35_30 = 1;
                                                                    var78_64 = 254L;
                                                                    cfr_temp_6 = var80_65 - var78_64;
                                                                    var83_67 = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                                                                    if (var83_67 != false) {
                                                                        ++var12_13;
                                                                        continue;
                                                                    }
                                                                    var85_69 = var10_11 /* !! */ [var12_13];
                                                                    if (var85_69 != null) {
                                                                        var86_70 = var85_69.hashCode();
                                                                    } else {
                                                                        var86_70 = 0;
                                                                        var85_69 = (float)null;
                                                                    }
                                                                    var87_71 = (var86_70 *= var34_29) << 16;
                                                                    var62_52 = var8_9;
                                                                    var42_37 = 7;
                                                                    var76_62 /* !! */  = (var86_70 ^= var87_71) >>> 7;
                                                                    var83_67 = var6_6.c(var76_62 /* !! */ );
                                                                    var66_55 = var83_67 - (var76_62 /* !! */  &= var37_32) & var37_32;
                                                                    var65_54 = var22_20;
                                                                    var22_20 = var66_55 / 8;
                                                                    var76_62 /* !! */  = (var12_13 - var76_62 /* !! */  & var37_32) / 8;
                                                                    var88_72 = 0xFFFFFFFFFFFFFFL;
                                                                    var66_55 = var23_21 /* !! */ ;
                                                                    var24_22 = "<this>";
                                                                    if (var22_20 == var76_62 /* !! */ ) {
                                                                        var76_62 /* !! */  = var86_70 & 127;
                                                                        var63_53 = var17_17;
                                                                        var17_17 = var76_62 /* !! */ ;
                                                                        var90_73 = var60_50[var59_49 /* !! */ ];
                                                                        var74_61 = var53_45;
                                                                        var25_23 = 255L;
                                                                        var53_45 = var25_23 << var82_66 ^ (long)-1;
                                                                        var53_45 = (long)(var90_73 & var53_45);
                                                                        var60_50[var59_49 /* !! */ ] = var53_45 |= (var17_17 <<= var82_66);
                                                                        Intrinsics.checkNotNullParameter(var60_50, (String)var24_22);
                                                                        var68_57 /* !! */  = ((Object)var60_50).length;
                                                                        var67_56 = 1;
                                                                        var76_62 /* !! */  = 0;
                                                                        var77_63 = 0.0f;
                                                                        var17_17 = (long)(var60_50[0] & var88_72 | var48_42 /* !! */ );
                                                                        var60_50[var68_57 /* !! */  -= var67_56] = var17_17;
                                                                        var12_13 += var67_56;
                                                                        var22_20 = var65_54;
                                                                        var17_17 = var63_53;
lbl200:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var53_45 = var74_61;
                                                                            continue block4;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var74_61 = var53_45;
                                                                    var63_53 = var17_17;
                                                                    var68_57 /* !! */  = (int)(var83_67 >> 3);
                                                                    var17_17 = (long)var60_50[var68_57 /* !! */ ];
                                                                    var67_56 = (var83_67 & 7) << 3;
                                                                    var90_73 = (reference)(var17_17 >> var67_56);
                                                                    var25_23 = 255L;
                                                                    var29_25 = 128L;
                                                                    cfr_temp_7 = (var90_73 &= var25_23) - var29_25;
                                                                    var76_62 /* !! */  = (int)(cfr_temp_7 == 0 ? 0 : (cfr_temp_7 < 0 ? -1 : 1));
                                                                    if (var76_62 /* !! */  == 0) {
                                                                        var76_62 /* !! */  = var86_70 & 127;
                                                                        var92_74 = var7_8;
                                                                        var93_75 = var36_31;
                                                                        var94_76 = var76_62 /* !! */ ;
                                                                        var96_77 = var6_6;
                                                                        var97_78 = (var25_23 << var67_56 ^ (long)-1) & var17_17;
                                                                        var99_79 = var94_76 << var67_56 | var97_78;
                                                                        var60_50[var68_57 /* !! */ ] = var99_79;
                                                                        var53_45 = (long)var60_50[var59_49 /* !! */ ];
                                                                        var94_76 = var25_23 << var82_66 ^ (long)-1;
                                                                        var53_45 &= var94_76;
                                                                        var94_76 = 128L;
                                                                        var97_78 = var94_76 << var82_66;
                                                                        var60_50[var59_49 /* !! */ ] = var53_45 |= var97_78;
                                                                        var2_2 /* !! */  = (Object[])var10_11 /* !! */ [var12_13];
                                                                        var10_11 /* !! */ [var83_67] = (float)var2_2 /* !! */ ;
                                                                        var10_11 /* !! */ [var12_13] = (float)null;
                                                                        var69_58 = var11_12 /* !! */ [var12_13];
                                                                        var11_12 /* !! */ [var83_67] = (long)var69_58;
                                                                        var2_2 /* !! */  = null;
                                                                        var11_12 /* !! */ [var12_13] = (long)0.0f;
                                                                        var16_16 /* !! */  = var12_13;
                                                                        var61_51 = var7_8;
                                                                        var3_3 = var24_22;
                                                                        var68_57 /* !! */  = -1;
                                                                        var69_58 = 0.0f / 0.0f;
                                                                    } else {
                                                                        var92_74 = var7_8;
                                                                        var93_75 = var36_31;
                                                                        var96_77 = var6_6;
                                                                        var15_15 = var86_70 & 127;
                                                                        var94_76 = var15_15;
                                                                        var61_51 = var7_8;
                                                                        var101_80 = var24_22;
                                                                        var19_18 = 255L << var67_56;
                                                                        var97_78 = (var19_18 ^ (long)-1) & var17_17;
                                                                        var99_79 = var94_76 << var67_56 | var97_78;
                                                                        var60_50[var68_57 /* !! */ ] = var99_79;
                                                                        var68_57 /* !! */  = -1;
                                                                        var69_58 = 0.0f / 0.0f;
                                                                        if (var16_16 /* !! */  == var68_57 /* !! */ ) {
                                                                            var68_57 /* !! */  = 1;
                                                                            var69_58 = 1.4E-45f;
                                                                            var36_31 = var12_13 + 1;
                                                                            var16_16 /* !! */  = et2_1.b((long[])var60_50, var36_31, var37_32);
                                                                        }
                                                                        var2_2 /* !! */  = (Object[])var10_11 /* !! */ [var83_67];
                                                                        var10_11 /* !! */ [var16_16 /* !! */ ] = (float)var2_2 /* !! */ ;
                                                                        var2_2 /* !! */  = (Object[])var10_11 /* !! */ [var12_13];
                                                                        var10_11 /* !! */ [var83_67] = (float)var2_2 /* !! */ ;
                                                                        var2_2 /* !! */  = (Object[])var10_11 /* !! */ [var16_16 /* !! */ ];
                                                                        var10_11 /* !! */ [var12_13] = (float)var2_2 /* !! */ ;
                                                                        var69_58 = var11_12 /* !! */ [var83_67];
                                                                        var11_12 /* !! */ [var16_16 /* !! */ ] = (long)var69_58;
                                                                        var69_58 = var11_12 /* !! */ [var12_13];
                                                                        var11_12 /* !! */ [var83_67] = (long)var69_58;
                                                                        var69_58 = var11_12 /* !! */ [var16_16 /* !! */ ];
                                                                        var11_12 /* !! */ [var12_13] = (long)var69_58;
                                                                        var68_57 /* !! */  = -1;
                                                                        var69_58 = 0.0f / 0.0f;
                                                                        var12_13 += var68_57 /* !! */ ;
                                                                        var3_3 = var101_80;
                                                                    }
                                                                    Intrinsics.checkNotNullParameter(var60_50, (String)var3_3);
                                                                    var67_56 = ((Object)var60_50).length;
                                                                    var15_15 = 1;
                                                                    var76_62 /* !! */  = 0;
                                                                    var77_63 = 0.0f;
                                                                    var17_17 = (long)(var60_50[0] & var88_72 | var48_42 /* !! */ );
                                                                    var60_50[var67_56 -= var15_15] = var17_17;
                                                                    var12_13 += var15_15;
                                                                    var7_8 = var61_51;
                                                                    var8_9 = var62_52;
                                                                    var23_21 /* !! */  = var66_55;
                                                                    var22_20 = var65_54;
                                                                    var17_17 = var63_53;
                                                                    var36_31 = var93_75;
                                                                    var6_6 = var96_77;
                                                                    ** continue;
                                                                }
                                                                var74_61 = var53_45;
                                                                var61_51 = var7_8;
                                                                var93_75 = var36_31;
                                                                var62_52 = var8_9;
                                                                var63_53 = var17_17;
                                                                var65_54 = var22_20;
                                                                var66_55 = var23_21 /* !! */ ;
                                                                var68_57 /* !! */  = -1;
                                                                var69_58 = 0.0f / 0.0f;
                                                                var8_9 = null;
                                                                var67_56 = et2_1.c(var6_6.d);
                                                                var15_15 = var6_6.e;
                                                                var6_6.f = var67_56 -= var15_15;
                                                                var67_56 = var36_31;
                                                                var76_62 /* !! */  = 1;
                                                                var77_63 = 1.4E-45f;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var74_61 = var53_45;
                                                                var61_51 = var7_8;
                                                                var93_75 = var36_31;
                                                                var62_52 = var8_9;
                                                                var63_53 = var17_17;
                                                                var65_54 = var22_20;
                                                                var66_55 = var23_21 /* !! */ ;
                                                                var68_57 /* !! */  = -1;
                                                                var69_58 = 0.0f / 0.0f;
                                                                var76_62 /* !! */  = 0;
                                                                var77_63 = 0.0f;
                                                                var8_9 = null;
                                                                var67_56 = et2_1.e(var6_6.d);
                                                                var7_8 = var6_6.a;
                                                                var102_81 = var6_6.b;
                                                                var60_50 = var6_6.c;
                                                                var37_32 = var6_6.d;
                                                                var6_6.d(var67_56);
                                                                var3_3 = var6_6.a;
                                                                var10_11 /* !! */  = (float[])var6_6.b;
                                                                var11_12 /* !! */  = (long[])var6_6.c;
                                                                var12_13 = var6_6.d;
                                                                for (var16_16 /* !! */  = 0; var16_16 /* !! */  < var37_32; var16_16 /* !! */  += var76_62 /* !! */ ) {
                                                                    var103_82 = var16_16 /* !! */  >> 3;
                                                                    var17_17 = (long)var7_8[var103_82];
                                                                    var23_21 /* !! */  = var16_16 /* !! */  & 7;
                                                                    var22_20 = var23_21 /* !! */  << 3;
                                                                    var19_18 = 128L;
                                                                    cfr_temp_8 = (var17_17 = var17_17 >> var22_20 & 255L) - var19_18;
                                                                    var104_83 /* !! */  = (long)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
                                                                    if (var104_83 /* !! */  < 0) {
                                                                        var105_84 = var102_81[var16_16 /* !! */ ];
                                                                        var106_85 = var105_84 != null ? var105_84.hashCode() : 0;
                                                                        var22_20 = (var106_85 *= var34_29) << 16;
                                                                        var23_21 /* !! */  = (var106_85 ^= var22_20) >>> 7;
                                                                        var23_21 /* !! */  = var6_6.c(var23_21 /* !! */ );
                                                                        var104_83 /* !! */  = var37_32;
                                                                        var107_86 = (reference)((long)(var106_85 &= 127));
                                                                        var106_85 = var23_21 /* !! */  >> 3;
                                                                        var42_37 = (var23_21 /* !! */  & 7) << 3;
                                                                        var78_64 = (long)var3_3[var106_85];
                                                                        var43_38 = var23_21 /* !! */ ;
                                                                        var25_23 = 255L;
                                                                        var19_18 = var25_23 << var42_37 ^ (long)-1;
                                                                        var19_18 = var78_64 & var19_18;
                                                                        var3_3[var106_85] = var107_86 = var107_86 << var42_37 | var19_18;
                                                                        var22_20 = var23_21 /* !! */  + -7 & var12_13;
                                                                        var23_21 /* !! */  = var12_13 & 7;
                                                                        var106_85 = (var22_20 += var23_21 /* !! */ ) >> 3;
                                                                        var3_3[var106_85] = var107_86;
                                                                        var10_11 /* !! */ [var43_38] = (float)var105_84;
                                                                        var77_63 = (float)var60_50[var16_16 /* !! */ ];
                                                                        var11_12 /* !! */ [var43_38] = (long)var77_63;
lbl361:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var104_83 /* !! */  = var37_32;
                                                                    ** continue;
                                                                    var76_62 /* !! */  = 1;
                                                                    var77_63 = 1.4E-45f;
                                                                    var37_32 = (int)var104_83 /* !! */ ;
                                                                    var76_62 /* !! */  = 0;
                                                                    var77_63 = 0.0f;
                                                                    var8_9 = null;
                                                                }
                                                                var76_62 /* !! */  = 1;
                                                                var77_63 = 1.4E-45f;
                                                                var67_56 = var93_75;
                                                            }
                                                            var4_4 /* !! */  = var6_6.c(var67_56);
                                                        }
                                                        var6_6.e = var67_56 = var6_6.e + var76_62 /* !! */ ;
                                                        var67_56 = var6_6.f;
                                                        var7_8 = var6_6.a;
                                                        var36_31 = var4_4 /* !! */  >> 3;
                                                        var107_86 = var7_8[var36_31];
                                                        var45_40 = var4_4 /* !! */  & 7;
                                                        var50_43 = var45_40 << 3;
                                                        var72_60 = var107_86 >> var50_43;
                                                        var109_87 = 255L;
                                                        var111_88 = 128L;
                                                        cfr_temp_9 = (var72_60 &= var109_87) - var111_88;
                                                        var23_21 /* !! */  = (int)(cfr_temp_9 == 0 ? 0 : (cfr_temp_9 < 0 ? -1 : 1));
                                                        if (var23_21 /* !! */  == 0) {
                                                            var45_40 = 1;
                                                        } else {
                                                            var45_40 = 0;
                                                            var11_12 /* !! */  = null;
                                                        }
                                                        var6_6.f = var67_56 -= var45_40;
                                                        var67_56 = var6_6.d;
                                                        var72_60 = (reference)(var109_87 << var50_43 ^ (long)-1);
                                                        var107_86 &= var72_60;
                                                        var51_44 = var74_61 << var50_43;
                                                        var7_8[var36_31] = var107_86 |= var51_44;
                                                        var36_31 = 7;
                                                        var50_43 = var4_4 /* !! */  + -7 & var67_56;
                                                        var67_56 = (var50_43 += (var67_56 &= var36_31)) >> 3;
                                                        var7_8[var67_56] = var107_86;
                                                        var67_56 = ~var4_4 /* !! */ ;
                                                    }
                                                    if (var67_56 < 0) {
                                                        var67_56 ^= -1;
                                                    }
                                                    var6_6.b[var67_56] = var61_51;
                                                    var7_8 = var6_6.c;
                                                    var7_8[var67_56] = var32_27;
                                                    var15_15 = 8;
                                                    break block39;
                                                }
                                                var61_51 = var7_8;
                                                var67_56 = var36_31;
                                                var62_52 = var8_9;
                                                var63_53 = var17_17;
                                                var65_54 = var22_20;
                                                var66_55 = var23_21 /* !! */ ;
                                                var68_57 /* !! */  = -1;
                                                var69_58 = 0.0f / 0.0f;
                                                var15_15 = 8;
                                                var38_33 = var38_33 + (var40_35 += 8) & var37_32;
                                                var2_2 /* !! */  = this;
                                                var11_12 /* !! */  = var44_39;
                                                var4_4 /* !! */  = (int)var59_49 /* !! */ ;
                                                var12_13 = var55_46;
                                                var16_16 /* !! */  = var56_47;
                                                var3_3 = var1_1;
                                            }
                                        }
                                        var62_52 = var8_9;
                                        var33_28 = var9_10 /* !! */ ;
                                        var39_34 = var10_11 /* !! */ ;
                                        var44_39 = var11_12 /* !! */ ;
                                        var55_46 = var12_13;
                                        var56_47 = var16_16 /* !! */ ;
                                        var63_53 = var17_17;
                                        var65_54 = var22_20;
                                        var66_55 = var23_21 /* !! */ ;
                                        var68_57 /* !! */  = -1;
                                        var69_58 = 0.0f / 0.0f;
                                    }
                                    var17_17 = var63_53 >> var15_15;
                                    var67_56 = 1;
                                    var23_21 /* !! */  = var66_55 + 1;
                                    var4_4 /* !! */  = 7;
                                    var2_2 /* !! */  = this;
                                    var3_3 = var1_1;
                                    var9_10 /* !! */  = var33_28;
                                    var10_11 /* !! */  = var39_34;
                                    var11_12 /* !! */  = var44_39;
                                    var12_13 = var55_46;
                                    var16_16 /* !! */  = var56_47;
                                    var8_9 = var62_52;
                                    var22_20 = var65_54;
                                }
                                var62_52 = var8_9;
                                var33_28 = var9_10 /* !! */ ;
                                var39_34 = var10_11 /* !! */ ;
                                var44_39 = var11_12 /* !! */ ;
                                var55_46 = var12_13;
                                var56_47 = var16_16 /* !! */ ;
                                var36_31 = var22_20;
                                var68_57 /* !! */  = -1;
                                var69_58 = 0.0f / 0.0f;
                                var67_56 = 1;
                                if (var22_20 != var15_15) break block40;
                                break block49;
                            }
                            var62_52 = var8_9;
                            var33_28 = var9_10 /* !! */ ;
                            var39_34 = var10_11 /* !! */ ;
                            var44_39 = var11_12 /* !! */ ;
                            var68_57 /* !! */  = -1;
                            var69_58 = 0.0f / 0.0f;
                            var67_56 = 1;
                        }
                        if (var16_16 /* !! */  != var12_13) {
                            var16_16 /* !! */  += var67_56;
                            var2_2 /* !! */  = this;
                            var3_3 = var1_1;
                            var9_10 /* !! */  = var33_28;
                            var10_11 /* !! */  = var39_34;
                            var11_12 /* !! */  = var44_39;
                            var8_9 = var62_52;
                            var15_15 = 8;
                            var4_4 /* !! */  = 7;
                            continue;
                        }
                        break block40;
                        break;
                    }
                }
                var62_52 = var8_9;
            }
            var62_52.b();
            var2_2 /* !! */  = this.y0().i;
            if (var2_2 /* !! */  != null && (var2_2 /* !! */  = var2_2 /* !! */ .getSnapshotObserver()) != null) {
                var7_8 = this;
                var102_81 = var1_1;
                var3_3 = new tB1$b((Ps2)var1_1, this);
                var60_50 = tb1_0.l;
                var2_2 /* !! */ .a((Tg2)var1_1, (Function1)var60_50, (Function0)var3_3);
lbl502:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var7_8 = this;
            ** while (true)
            var8_9 = var62_52;
            var2_2 /* !! */  = var62_52.b;
            var3_3 = var62_52.a;
            var36_31 = ((Object)var3_3).length + -2;
            if (var36_31 >= 0) {
                var76_62 /* !! */  = 0;
                var77_63 = 0.0f;
                var8_9 = null;
                while (true) {
                    var70_59 = var3_3[var76_62 /* !! */ ];
                    var72_60 = var70_59 ^ (long)-1;
                    var4_4 /* !! */  = 7;
                    cfr_temp_10 = (var72_60 = var72_60 << var4_4 /* !! */  & var70_59 & var13_14) - var13_14;
                    var16_16 /* !! */  = (int)(cfr_temp_10 == 0 ? 0 : (cfr_temp_10 < 0 ? -1 : 1));
                    if (var16_16 /* !! */  != 0) {
                        var45_40 = ~(var76_62 /* !! */  - var36_31) >>> 31;
                        var12_13 = 8;
                        var45_40 = 8 - var45_40;
                        var57_48 = var70_59;
                        var9_10 /* !! */  = null;
                        for (var37_32 = 0; var37_32 < var45_40; var37_32 += var22_20) {
                            var17_17 = 255L;
                            var19_18 = (long)(var57_48 & var17_17);
                            var29_25 = 128L;
                            cfr_temp_11 = var19_18 - var29_25;
                            var50_43 = (int)(cfr_temp_11 == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1));
                            if (var50_43 < 0 && (var22_20 = var6_6.a(var10_11 /* !! */  = (float[])((NQ2)var2_2 /* !! */ [var50_43 = (var76_62 /* !! */  << 3) + var37_32]))) < 0 && (var92_74 = this.A0()) != null) {
                                while (((var24_22 = var92_74.j) == null || (var23_21 /* !! */  = var24_22.a(var10_11 /* !! */ )) < 0) && (var92_74 = var92_74.A0()) != null) {
                                }
                            }
                            var50_43 = 8;
                            var57_48 >>= var50_43;
                            var22_20 = 1;
                        }
                        var50_43 = 8;
                        var17_17 = 255L;
                        var22_20 = 1;
                        var29_25 = 128L;
                        if (var45_40 != var50_43) break;
                    } else {
                        var50_43 = 8;
                        var17_17 = 255L;
                        var22_20 = 1;
                        var29_25 = 128L;
                    }
                    if (var76_62 /* !! */  == var36_31) break;
                    var76_62 /* !! */  += var22_20;
                }
            }
            var6_6.b();
        }
    }

    public abstract tb1_0 r0();

    public abstract zp1 u0();

    public abstract boolean w0();

    public abstract xp1_0 y0();

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }

    public abstract bl1_0 z0();
}

