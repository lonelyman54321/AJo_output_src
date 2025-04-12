/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class S83$a {
    public final Function1 a;
    public Object b;
    public gr1_1 c;
    public int d;
    public final vt2_0 e;
    public final nr1_1 f;
    public final pr1_1 g;
    public final WR1 h;
    public final S83$a$a i;
    public int j;
    public final vt2_0 k;
    public final HashMap l;

    public S83$a(Function1 hashMap) {
        this.a = hashMap;
        this.d = -1;
        hashMap = new HashMap();
        this.e = hashMap;
        hashMap = new HashMap(null);
        this.f = hashMap;
        hashMap = new HashMap(null);
        this.g = hashMap;
        Object[] objectArray = new np0_0[16];
        hashMap = new HashMap(objectArray);
        this.h = hashMap;
        hashMap = new HashMap(this);
        this.i = hashMap;
        hashMap = new HashMap();
        this.k = hashMap;
        this.l = hashMap = new HashMap();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object, Function1 function1, Function0 function0) {
        int n3;
        gr1_1 gr1_12;
        Object object2;
        block13: {
            long[] lArray;
            int n4;
            Object object3;
            S83$a s83$a = this;
            Object object4 = object;
            object2 = this.b;
            gr1_12 = this.c;
            n3 = this.d;
            this.b = object;
            Object object5 = this.f;
            this.c = object4 = (gr1_1)((dt2_0)object5).b(object);
            int n7 = this.d;
            int n8 = -1;
            if (n7 == n8) {
                object4 = A83.k();
                this.d = n7 = ((v83_0)object4).d();
            }
            object4 = s83$a.i;
            object5 = J83.c();
            int n10 = 1;
            try {
                ((WR1)object5).b(object4);
                object4 = function1;
                object3 = function0;
                v83$a.c(function0, function1);
                n7 = ((WR1)object5).c - n10;
                ((WR1)object5).n(n7);
            }
            catch (Throwable throwable) {
                int n14 = ((WR1)object5).c - 1;
                ((WR1)object5).n(n14);
                throw throwable;
            }
            object4 = s83$a.b;
            Intrinsics.checkNotNull(object4);
            n8 = s83$a.d;
            object3 = s83$a.c;
            if (object3 == null || (n4 = (lArray = ((i62)object3).a).length + -2) < 0) break block13;
            int n15 = 0;
            while (true) {
                void var31_36;
                void var14_16;
                void var17_26 = var14_16[n15];
                void var19_27 = var17_26 ^ (long)-1;
                int n16 = 7;
                var19_27 = var19_27 << n16 & var17_26;
                long l2 = -9187201950435737472L;
                void cfr_temp_0 = (var19_27 &= l2) - l2;
                int n17 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                if (n17 == 0) {
                    var31_36 = var14_16;
                } else {
                    void var14_17;
                    int n18 = ~(n15 - n4) >>> 31;
                    n18 = 8 - n18;
                    for (int i3 = 0; i3 < n18; var17_26 >>= n10, ++i3) {
                        l2 = var17_26 & 0xFFL;
                        long l3 = 128L;
                        long l4 = l2 - l3;
                        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (l7 < 0) {
                            n16 = n15 << 3;
                            n10 = n16 + i3;
                            Object object6 = ((i62)object3).b[n10];
                            var31_36 = var14_17;
                            int[] nArray = ((i62)object3).c;
                            int n19 = nArray[n10];
                            if (n19 != n8) {
                                n19 = 1;
                            } else {
                                n19 = 0;
                                Object var14_19 = null;
                            }
                            if (n19 != 0) {
                                s83$a.d(object4, object6);
                            }
                            if (n19 != 0) {
                                ((gr1_1)object3).g(n10);
                            }
                        } else {
                            var31_36 = var14_17;
                        }
                        n10 = 8;
                        void var14_22 = var31_36;
                        n10 = 1;
                    }
                    var31_36 = var14_17;
                    n10 = 8;
                    if (n18 != n10) break;
                }
                if (n15 == n4) break;
                ++n15;
                void var14_23 = var31_36;
                n10 = 1;
            }
        }
        s83$a.b = object2;
        s83$a.c = gr1_12;
        s83$a.d = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean b(Set var1_1) {
        block115: {
            block120: {
                block114: {
                    block121: {
                        var2_2 = this;
                        var3_3 /* !! */  = var1_1 /* !! */ ;
                        var4_4 = this.l;
                        var5_5 = var1_1 /* !! */  instanceof ht2_1;
                        var6_6 = qi_2.b;
                        var7_7 /* !! */  = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
                        var8_8 = this.h;
                        var9_9 = 7;
                        var10_10 = 2;
                        var11_11 /* !! */  = 8;
                        var12_12 = this.k;
                        var13_13 /* !! */  = this.e;
                        var14_14 = this.g;
                        if (var5_5 == 0) break block120;
                        var3_3 /* !! */  = ((ht2_1)var1_1 /* !! */ ).a;
                        var15_15 /* !! */  = var3_3 /* !! */ .b;
                        var3_3 /* !! */  = var3_3 /* !! */ .a;
                        var16_16 = var3_3 /* !! */ .length - var10_10;
                        if (var16_16 < 0) break block121;
                        var10_10 = 0;
                        var17_17 = null;
                        var18_18 = 0;
                        while (true) {
                            block136: {
                                block122: {
                                    var19_19 = var3_3 /* !! */ [var10_10];
                                    var1_1 /* !! */  = var3_3 /* !! */ ;
                                    var21_20 = (var19_19 ^ (long)-1) << var9_9 & var19_19;
                                    var23_21 = -9187201950435737472L;
                                    cfr_temp_0 = (var21_20 &= var23_21) - var23_21;
                                    var25_22 /* !! */  = (reference)(cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1));
                                    if (var25_22 /* !! */  == false) break block122;
                                    var26_23 = ~(var10_10 - var16_16) >>> 31;
                                    var26_23 = 8 - var26_23;
                                    var27_24 = 0;
                                    var3_3 /* !! */  = null;
                                    while (var27_24 < var26_23) {
                                        block126: {
                                            block123: {
                                                block112: {
                                                    block127: {
                                                        block128: {
                                                            block111: {
                                                                block129: {
                                                                    block125: {
                                                                        block124: {
                                                                            var28_25 = 255L;
                                                                            var30_26 = var19_19 & var28_25;
                                                                            var32_27 = 128L;
                                                                            cfr_temp_1 = var30_26 - var32_27;
                                                                            var34_28 /* !! */  = (reference)(cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1));
                                                                            if (var34_28 /* !! */  >= 0) break block123;
                                                                            var25_22 /* !! */  = (reference)((var10_10 << 3) + var27_24);
                                                                            var35_29 = var15_15 /* !! */ [var25_22 /* !! */ ];
                                                                            var9_9 = var35_29 instanceof qb3_0;
                                                                            if (var9_9 == 0) break block124;
                                                                            var36_30 = var35_29;
                                                                            var36_30 = (qb3_0)var35_29;
                                                                            var37_31 /* !! */  = var15_15 /* !! */ ;
                                                                            var5_5 = 2;
                                                                            var9_9 = (int)var36_30.t(var5_5);
                                                                            if (var9_9 != 0) break block125;
                                                                            var38_32 = var26_23;
                                                                            var39_33 = var27_24;
                                                                            var2_2 = var4_4;
                                                                            break block126;
                                                                        }
                                                                        var37_31 /* !! */  = var15_15 /* !! */ ;
                                                                    }
                                                                    if ((var5_5 = (int)(var15_15 /* !! */  = var12_12.a).a(var35_29)) == 0 || (var15_15 /* !! */  = var12_12.a.b(var35_29)) == null) break block127;
                                                                    var9_9 = var15_15 /* !! */  instanceof pr1_1;
                                                                    if (var9_9 == 0) break block128;
                                                                    var15_15 /* !! */  = (pr1_1)var15_15 /* !! */ ;
                                                                    var36_30 = var15_15 /* !! */ .b;
                                                                    var15_15 /* !! */  = var15_15 /* !! */ .a;
                                                                    var40_34 /* !! */  = var6_6;
                                                                    var41_35 = var15_15 /* !! */ .length + -2;
                                                                    var38_32 = var26_23;
                                                                    var39_33 = var27_24;
                                                                    if (var41_35 < 0) break block129;
                                                                    var42_36 /* !! */  = var12_12;
                                                                    var43_37 = 0;
                                                                    var12_12 = null;
                                                                    while (true) {
                                                                        block135: {
                                                                            block130: {
                                                                                var21_20 = var15_15 /* !! */ [var43_37];
                                                                                var44_38 /* !! */  = var10_10;
                                                                                var45_39 = var19_19;
                                                                                var47_40 = (long)((var21_20 ^ (long)-1) << 7 & var21_20);
                                                                                var23_21 = -9187201950435737472L;
                                                                                cfr_temp_2 = (var47_40 &= var23_21) - var23_21;
                                                                                var49_41 /* !! */  = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                                                if (var49_41 /* !! */  == 0) break block130;
                                                                                var10_10 = ~(var43_37 - var41_35) >>> 31;
                                                                                var10_10 = 8 - var10_10;
                                                                                for (var50_42 = 0; var50_42 < var10_10; ++var50_42) {
                                                                                    block131: {
                                                                                        block110: {
                                                                                            block132: {
                                                                                                block134: {
                                                                                                    block133: {
                                                                                                        var28_25 = 255L;
                                                                                                        var51_43 = var21_20 & var28_25;
                                                                                                        var32_27 = 128L;
                                                                                                        cfr_temp_3 = var51_43 - var32_27;
                                                                                                        var49_41 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                                                                        if (var49_41 /* !! */  >= 0) break block131;
                                                                                                        var49_41 /* !! */  = (var43_37 << 3) + var50_42;
                                                                                                        var53_44 = (np0_0)var36_30[var49_41 /* !! */ ];
                                                                                                        Intrinsics.checkNotNull(var53_44, (String)var7_7 /* !! */ );
                                                                                                        var54_45 = var15_15 /* !! */ ;
                                                                                                        var15_15 /* !! */  = var4_4.get(var53_44);
                                                                                                        var55_46 /* !! */  = var53_44.a();
                                                                                                        if (var55_46 /* !! */  == null) {
                                                                                                            J83.l();
                                                                                                            var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                                                            var56_47 = var36_30;
                                                                                                            var36_30 = var40_34 /* !! */ ;
                                                                                                        } else {
                                                                                                            var56_47 = var36_30;
                                                                                                            var36_30 = var55_46 /* !! */ ;
                                                                                                            var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                                                        }
                                                                                                        var7_7 /* !! */  = var53_44.s().f;
                                                                                                        var5_5 = (int)var36_30.b(var7_7 /* !! */ , var15_15 /* !! */ );
                                                                                                        if (var5_5 != 0) break block132;
                                                                                                        var15_15 /* !! */  = var13_13 /* !! */ .a.b(var53_44);
                                                                                                        if (var15_15 /* !! */  == null) break block133;
                                                                                                        var57_48 = var15_15 /* !! */  instanceof pr1_1;
                                                                                                        if (var57_48 != 0) {
                                                                                                            var15_15 /* !! */  = (pr1_1)var15_15 /* !! */ ;
                                                                                                            var7_7 /* !! */  = var15_15 /* !! */ .b;
                                                                                                            var15_15 /* !! */  = var15_15 /* !! */ .a;
                                                                                                            var9_9 = var15_15 /* !! */ .length;
                                                                                                            var49_41 /* !! */  = 2;
                                                                                                            if ((var9_9 -= var49_41 /* !! */ ) >= 0) {
                                                                                                                var58_49 = var43_37;
                                                                                                                var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                                                var49_41 /* !! */  = 0;
                                                                                                                var53_44 = null;
                                                                                                                while (true) {
                                                                                                                    var60_51 = var15_15 /* !! */ [var49_41 /* !! */ ];
                                                                                                                    var62_52 /* !! */  = var4_4;
                                                                                                                    var63_53 /* !! */  = var15_15 /* !! */ ;
                                                                                                                    var64_54 = var60_51 ^ (long)-1;
                                                                                                                    var25_22 /* !! */  = (reference)7;
                                                                                                                    var64_54 = var64_54 << var25_22 /* !! */  & var60_51;
                                                                                                                    var23_21 = -9187201950435737472L;
                                                                                                                    cfr_temp_4 = (var64_54 &= var23_21) - var23_21;
                                                                                                                    var66_55 /* !! */  = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1);
                                                                                                                    if (var66_55 /* !! */  != 0) {
                                                                                                                        var67_56 /* !! */  = ~(var49_41 /* !! */  - var9_9) >>> 31;
                                                                                                                        var67_56 /* !! */  = 8 - var67_56 /* !! */ ;
                                                                                                                        var15_15 /* !! */  = null;
                                                                                                                        for (var5_5 = 0; var5_5 < var67_56 /* !! */ ; ++var5_5) {
                                                                                                                            var28_25 = 255L;
                                                                                                                            var68_57 = var60_51 & var28_25;
                                                                                                                            var32_27 = 128L;
                                                                                                                            cfr_temp_5 = var68_57 - var32_27;
                                                                                                                            var70_58 /* !! */  = (reference)(cfr_temp_5 == 0 ? 0 : (cfr_temp_5 < 0 ? -1 : 1));
                                                                                                                            if (var70_58 /* !! */  < 0) {
                                                                                                                                var18_18 = (var49_41 /* !! */  << 3) + var5_5;
                                                                                                                                var66_55 /* !! */  = var16_16;
                                                                                                                                var71_59 = var7_7 /* !! */ [var18_18];
                                                                                                                                var14_14.d(var71_59);
                                                                                                                                var16_16 = 8;
                                                                                                                                var18_18 = 1;
                                                                                                                            } else {
                                                                                                                                var66_55 /* !! */  = var16_16;
                                                                                                                                var16_16 = 8;
                                                                                                                            }
                                                                                                                            var60_51 >>= var16_16;
                                                                                                                            var16_16 = var66_55 /* !! */ ;
                                                                                                                        }
                                                                                                                        var66_55 /* !! */  = var16_16;
                                                                                                                        var16_16 = 8;
                                                                                                                        if (var67_56 /* !! */  != var16_16) break block110;
                                                                                                                    } else {
                                                                                                                        var66_55 /* !! */  = var16_16;
                                                                                                                    }
                                                                                                                    if (var49_41 /* !! */  != var9_9) {
                                                                                                                        ++var49_41 /* !! */ ;
                                                                                                                        var4_4 = var62_52 /* !! */ ;
                                                                                                                        var15_15 /* !! */  = var63_53 /* !! */ ;
                                                                                                                        var16_16 = var66_55 /* !! */ ;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    break block110;
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                ** GOTO lbl170
                                                                                                            }
                                                                                                        }
                                                                                                        break block134;
                                                                                                    }
                                                                                                    var62_52 /* !! */  = var4_4;
                                                                                                    var58_49 = var43_37;
                                                                                                    var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                                    var66_55 /* !! */  = var16_16;
                                                                                                    break block110;
                                                                                                }
                                                                                                var62_52 /* !! */  = var4_4;
                                                                                                var58_49 = var43_37;
                                                                                                var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                                var66_55 /* !! */  = var16_16;
                                                                                                var14_14.d(var15_15 /* !! */ );
                                                                                                var18_18 = 1;
                                                                                                break block110;
                                                                                            }
                                                                                            var62_52 /* !! */  = var4_4;
                                                                                            var58_49 = var43_37;
                                                                                            var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                            var66_55 /* !! */  = var16_16;
                                                                                            var8_8.b(var53_44);
                                                                                        }
lbl192:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var62_52 /* !! */  = var4_4;
                                                                                    var54_45 = var15_15 /* !! */ ;
                                                                                    var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                                    var58_49 = var43_37;
                                                                                    var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                    var66_55 /* !! */  = var16_16;
                                                                                    var56_47 = var36_30;
                                                                                    ** continue;
                                                                                    var67_56 /* !! */  = 8;
                                                                                    var21_20 >>= var67_56 /* !! */ ;
                                                                                    var15_15 /* !! */  = var54_45;
                                                                                    var7_7 /* !! */  = var55_46 /* !! */ ;
                                                                                    var36_30 = var56_47;
                                                                                    var13_13 /* !! */  = var59_50 /* !! */ ;
                                                                                    var43_37 = var58_49;
                                                                                    var4_4 = var62_52 /* !! */ ;
                                                                                    var16_16 = var66_55 /* !! */ ;
                                                                                }
                                                                                var62_52 /* !! */  = var4_4;
                                                                                var54_45 = var15_15 /* !! */ ;
                                                                                var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                                var58_49 = var43_37;
                                                                                var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                                var66_55 /* !! */  = var16_16;
                                                                                var56_47 = var36_30;
                                                                                var67_56 /* !! */  = 8;
                                                                                if (var10_10 != var67_56 /* !! */ ) break block111;
                                                                                var26_23 = var43_37;
                                                                                break block135;
                                                                            }
                                                                            var62_52 /* !! */  = var4_4;
                                                                            var54_45 = var15_15 /* !! */ ;
                                                                            var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                            var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                            var66_55 /* !! */  = var16_16;
                                                                            var56_47 = var36_30;
                                                                            var26_23 = var43_37;
                                                                        }
                                                                        if (var26_23 != var41_35) {
                                                                            var43_37 = var26_23 + 1;
                                                                            var10_10 = var44_38 /* !! */ ;
                                                                            var19_19 = var45_39;
                                                                            var15_15 /* !! */  = var54_45;
                                                                            var7_7 /* !! */  = var55_46 /* !! */ ;
                                                                            var36_30 = var56_47;
                                                                            var13_13 /* !! */  = var59_50 /* !! */ ;
                                                                            var4_4 = var62_52 /* !! */ ;
                                                                            var16_16 = var66_55 /* !! */ ;
                                                                            continue;
                                                                        }
                                                                        break block111;
                                                                        break;
                                                                    }
                                                                }
                                                                var62_52 /* !! */  = var4_4;
                                                                var55_46 /* !! */  = var7_7 /* !! */ ;
                                                                var42_36 /* !! */  = var12_12;
                                                                var59_50 /* !! */  = var13_13 /* !! */ ;
                                                                var66_55 /* !! */  = var16_16;
                                                                var44_38 /* !! */  = var10_10;
                                                                var45_39 = var19_19;
                                                            }
                                                            var4_4 = var59_50 /* !! */ ;
                                                            var2_2 = var62_52 /* !! */ ;
                                                            break block112;
                                                        }
                                                        var38_32 = var26_23;
                                                        var39_33 = var27_24;
                                                        var62_52 /* !! */  = var4_4;
                                                        var40_34 /* !! */  = var6_6;
                                                        var55_46 /* !! */  = var7_7 /* !! */ ;
                                                        var42_36 /* !! */  = var12_12;
                                                        var59_50 /* !! */  = var13_13 /* !! */ ;
                                                        var66_55 /* !! */  = var16_16;
                                                        var44_38 /* !! */  = var10_10;
                                                        var45_39 = var19_19;
                                                        var15_15 /* !! */  = (np0_0)var15_15 /* !! */ ;
                                                        var2_2 = var4_4;
                                                        var3_3 /* !! */  = var4_4.get(var15_15 /* !! */ );
                                                        var4_4 = var15_15 /* !! */ .a();
                                                        if (var4_4 == null) {
                                                            J83.l();
                                                            var4_4 = var6_6;
                                                        }
                                                        if ((var27_24 = (int)var4_4.b(var6_6 = var15_15 /* !! */ .s().f, var3_3 /* !! */ )) == 0) {
                                                            var4_4 = var59_50 /* !! */ ;
                                                            var3_3 /* !! */  = var59_50 /* !! */ .a.b(var15_15 /* !! */ );
                                                            if (var3_3 /* !! */  != null) {
                                                                var5_5 = var3_3 /* !! */  instanceof pr1_1;
                                                                if (var5_5 != 0) {
                                                                    var3_3 /* !! */  = (pr1_1)var3_3 /* !! */ ;
                                                                    var15_15 /* !! */  = var3_3 /* !! */ .b;
                                                                    var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                    var41_35 = var3_3 /* !! */ .length;
                                                                    var57_48 = 2;
                                                                    if ((var41_35 -= var57_48) >= 0) {
                                                                        var57_48 = 0;
                                                                        var7_7 /* !! */  = null;
                                                                        while (true) {
                                                                            var60_51 = var3_3 /* !! */ [var57_48];
                                                                            var72_60 = var60_51 ^ (long)-1;
                                                                            var10_10 = 7;
                                                                            var72_60 = var72_60 << var10_10 & var60_51;
                                                                            var47_40 = -9187201950435737472L;
                                                                            cfr_temp_6 = (var72_60 &= var47_40) - var47_40;
                                                                            var49_41 /* !! */  = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                                                                            if (var49_41 /* !! */  != 0) {
                                                                                var16_16 = ~(var57_48 - var41_35) >>> 31;
                                                                                var16_16 = 8 - var16_16;
                                                                                var36_30 = null;
                                                                                for (var9_9 = 0; var9_9 < var16_16; ++var9_9) {
                                                                                    var74_61 = var60_51 & 255L;
                                                                                    var47_40 = 128L;
                                                                                    cfr_temp_7 = var74_61 - var47_40;
                                                                                    var49_41 /* !! */  = cfr_temp_7 == 0 ? 0 : (cfr_temp_7 < 0 ? -1 : 1);
                                                                                    if (var49_41 /* !! */  < 0) {
                                                                                        var10_10 = (var57_48 << 3) + var9_9;
                                                                                        var17_17 = var15_15 /* !! */ [var10_10];
                                                                                        var14_14.d(var17_17);
                                                                                        var10_10 = 8;
                                                                                        var18_18 = 1;
                                                                                    } else {
                                                                                        var10_10 = 8;
                                                                                    }
                                                                                    var60_51 >>= var10_10;
                                                                                }
                                                                                var10_10 = 8;
                                                                                if (var16_16 != var10_10) break block112;
                                                                            }
                                                                            if (var57_48 != var41_35) {
                                                                                ++var57_48;
                                                                                continue;
                                                                            }
                                                                            break block112;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var14_14.d(var3_3 /* !! */ );
                                                                    var18_18 = 1;
                                                                }
                                                            }
                                                        } else {
                                                            var4_4 = var59_50 /* !! */ ;
                                                            var8_8.b(var15_15 /* !! */ );
                                                        }
                                                        break block112;
                                                    }
                                                    var38_32 = var26_23;
                                                    var39_33 = var27_24;
                                                    var2_2 = var4_4;
                                                    var40_34 /* !! */  = var6_6;
                                                    var55_46 /* !! */  = var7_7 /* !! */ ;
                                                    var42_36 /* !! */  = var12_12;
                                                    var4_4 = var13_13 /* !! */ ;
                                                    var66_55 /* !! */  = var16_16;
                                                    var44_38 /* !! */  = var10_10;
                                                    var45_39 = var19_19;
                                                }
                                                var3_3 /* !! */  = var4_4.a.b(var35_29);
                                                if (var3_3 /* !! */  != null) {
                                                    var5_5 = var3_3 /* !! */  instanceof pr1_1;
                                                    if (var5_5 != 0) {
                                                        var3_3 /* !! */  = (pr1_1)var3_3 /* !! */ ;
                                                        var15_15 /* !! */  = var3_3 /* !! */ .b;
                                                        var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                        var41_35 = var3_3 /* !! */ .length;
                                                        var57_48 = 2;
                                                        if ((var41_35 -= var57_48) >= 0) {
                                                            var57_48 = 0;
                                                            var7_7 /* !! */  = null;
                                                            while (true) {
                                                                var60_51 = var3_3 /* !! */ [var57_48];
                                                                var72_60 = var60_51 ^ (long)-1;
                                                                var10_10 = 7;
                                                                var72_60 = var72_60 << var10_10 & var60_51;
                                                                var47_40 = -9187201950435737472L;
                                                                cfr_temp_8 = (var72_60 &= var47_40) - var47_40;
                                                                var49_41 /* !! */  = cfr_temp_8 == 0 ? 0 : (cfr_temp_8 < 0 ? -1 : 1);
                                                                if (var49_41 /* !! */  != 0) {
                                                                    var16_16 = ~(var57_48 - var41_35) >>> 31;
                                                                    var9_9 = 8;
                                                                    var11_11 /* !! */  = 8 - var16_16;
                                                                    var71_59 = null;
                                                                    for (var16_16 = 0; var16_16 < var11_11 /* !! */ ; ++var16_16) {
                                                                        var19_19 = var60_51 & 255L;
                                                                        var76_62 /* !! */  = (reference)128L;
                                                                        cfr_temp_9 = var19_19 - var76_62 /* !! */ ;
                                                                        var78_63 /* !! */  = (reference)(cfr_temp_9 == 0 ? 0 : (cfr_temp_9 < 0 ? -1 : 1));
                                                                        if (var78_63 /* !! */  < 0) {
                                                                            var9_9 = (var57_48 << 3) + var16_16;
                                                                            var36_30 = var15_15 /* !! */ [var9_9];
                                                                            var14_14.d(var36_30);
                                                                            var9_9 = 8;
                                                                            var18_18 = 1;
                                                                        } else {
                                                                            var9_9 = 8;
                                                                        }
                                                                        var60_51 >>= var9_9;
                                                                    }
                                                                    var9_9 = 8;
                                                                    if (var11_11 /* !! */  != var9_9) break;
                                                                }
                                                                if (var57_48 != var41_35) {
                                                                    ++var57_48;
                                                                    continue;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        var14_14.d(var3_3 /* !! */ );
                                                        var18_18 = 1;
                                                    }
                                                }
lbl395:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var38_32 = var26_23;
                                            var39_33 = var27_24;
                                            var2_2 = var4_4;
                                            var37_31 /* !! */  = var15_15 /* !! */ ;
                                        }
                                        var40_34 /* !! */  = var6_6;
                                        var55_46 /* !! */  = var7_7 /* !! */ ;
                                        var42_36 /* !! */  = var12_12;
                                        var4_4 = var13_13 /* !! */ ;
                                        var66_55 /* !! */  = var16_16;
                                        var44_38 /* !! */  = var10_10;
                                        var45_39 = var19_19;
                                        ** continue;
                                        var27_24 = 8;
                                        var19_19 = var45_39 >> var27_24;
                                        var5_5 = var39_33 + 1;
                                        var13_13 /* !! */  = var4_4;
                                        var27_24 = var5_5;
                                        var15_15 /* !! */  = var37_31 /* !! */ ;
                                        var6_6 = var40_34 /* !! */ ;
                                        var12_12 = var42_36 /* !! */ ;
                                        var10_10 = var44_38 /* !! */ ;
                                        var7_7 /* !! */  = var55_46 /* !! */ ;
                                        var16_16 = var66_55 /* !! */ ;
                                        var9_9 = 7;
                                        var11_11 /* !! */  = 8;
                                        var4_4 = var2_2;
                                        var26_23 = var38_32;
                                    }
                                    var11_11 /* !! */  = var26_23;
                                    var2_2 = var4_4;
                                    var37_31 /* !! */  = var15_15 /* !! */ ;
                                    var40_34 /* !! */  = var6_6;
                                    var55_46 /* !! */  = var7_7 /* !! */ ;
                                    var42_36 /* !! */  = var12_12;
                                    var4_4 = var13_13 /* !! */ ;
                                    var66_55 /* !! */  = var16_16;
                                    var44_38 /* !! */  = var10_10;
                                    var27_24 = 8;
                                    if (var26_23 != var27_24) break block114;
                                    var27_24 = var10_10;
                                    break block136;
                                }
                                var2_2 = var4_4;
                                var37_31 /* !! */  = var15_15 /* !! */ ;
                                var40_34 /* !! */  = var6_6;
                                var55_46 /* !! */  = var7_7 /* !! */ ;
                                var42_36 /* !! */  = var12_12;
                                var4_4 = var13_13 /* !! */ ;
                                var27_24 = var10_10;
                            }
                            if (var27_24 != var16_16) {
                                var10_10 = var27_24 + 1;
                                var3_3 /* !! */  = var1_1 /* !! */ ;
                                var13_13 /* !! */  = var4_4;
                                var15_15 /* !! */  = var37_31 /* !! */ ;
                                var6_6 = var40_34 /* !! */ ;
                                var12_12 = var42_36 /* !! */ ;
                                var7_7 /* !! */  = var55_46 /* !! */ ;
                                var9_9 = 7;
                                var11_11 /* !! */  = 8;
                                var4_4 = var2_2;
                                var2_2 = this;
                                continue;
                            }
                            break block114;
                            break;
                        }
                    }
                    var4_4 = var13_13 /* !! */ ;
                    var18_18 = 0;
                }
                while (true) {
                    break block115;
                    break;
                }
            }
            var2_2 = var4_4;
            var40_34 /* !! */  = var6_6;
            var55_46 /* !! */  = var7_7 /* !! */ ;
            var42_36 /* !! */  = var12_12;
            var4_4 = var13_13 /* !! */ ;
            var3_3 /* !! */  = ((Iterable)var1_1 /* !! */ ).iterator();
            var18_18 = 0;
            while (true) {
                block119: {
                    block118: {
                        block138: {
                            block139: {
                                block117: {
                                    block140: {
                                        block137: {
                                            if ((var5_5 = var3_3 /* !! */ .hasNext()) == 0) ** continue;
                                            var15_15 /* !! */  = var3_3 /* !! */ .next();
                                            var41_35 = var15_15 /* !! */  instanceof qb3_0;
                                            if (var41_35 == 0) break block137;
                                            var6_6 = var15_15 /* !! */ ;
                                            var6_6 = (qb3_0)var15_15 /* !! */ ;
                                            var57_48 = 2;
                                            var41_35 = var6_6.t(var57_48);
                                            if (var41_35 != 0) break block137;
                                            var1_1 /* !! */  = var3_3 /* !! */ ;
                                            var3_3 /* !! */  = var4_4;
                                            break block119;
                                        }
                                        var6_6 = var42_36 /* !! */ ;
                                        var7_7 /* !! */  = var42_36 /* !! */ .a;
                                        var57_48 = (int)var7_7 /* !! */ .a(var15_15 /* !! */ );
                                        if (var57_48 == 0 || (var7_7 /* !! */  = var42_36 /* !! */ .a.b(var15_15 /* !! */ )) == null) break block138;
                                        var43_37 = var7_7 /* !! */  instanceof pr1_1;
                                        if (var43_37 == 0) break block139;
                                        var7_7 /* !! */  = (pr1_1)var7_7 /* !! */ ;
                                        var12_12 = var7_7 /* !! */ .b;
                                        var7_7 /* !! */  = var7_7 /* !! */ .a;
                                        var79_64 = var7_7 /* !! */ .length;
                                        var16_16 = 2;
                                        if ((var79_64 -= var16_16) < 0) break block140;
                                        var16_16 = 0;
                                        var71_59 = null;
                                        while (true) {
                                            block147: {
                                                block141: {
                                                    var76_62 /* !! */  = var7_7 /* !! */ [var16_16];
                                                    var19_19 = (var76_62 /* !! */  ^ (long)-1) << 7 & var76_62 /* !! */ ;
                                                    var23_21 = -9187201950435737472L;
                                                    cfr_temp_10 = (var19_19 &= var23_21) - var23_21;
                                                    var11_11 /* !! */  = cfr_temp_10 == 0 ? 0 : (cfr_temp_10 < 0 ? -1 : 1);
                                                    if (var11_11 /* !! */  == 0) break block141;
                                                    var50_42 = ~(var16_16 - var79_64) >>> 31;
                                                    var49_41 /* !! */  = 8;
                                                    var11_11 /* !! */  = 8 - var50_42;
                                                    for (var50_42 = 0; var50_42 < var11_11 /* !! */ ; ++var50_42) {
                                                        block146: {
                                                            block142: {
                                                                block116: {
                                                                    block143: {
                                                                        block145: {
                                                                            block144: {
                                                                                var28_25 = 255L;
                                                                                var80_65 = var76_62 /* !! */  & var28_25;
                                                                                var32_27 = 128L;
                                                                                cfr_temp_11 = var80_65 - var32_27;
                                                                                var49_41 /* !! */  = cfr_temp_11 == 0 ? 0 : (cfr_temp_11 < 0 ? -1 : 1);
                                                                                if (var49_41 /* !! */  >= 0) break block142;
                                                                                var49_41 /* !! */  = (var16_16 << 3) + var50_42;
                                                                                var53_44 = (np0_0)var12_12[var49_41 /* !! */ ];
                                                                                var1_1 /* !! */  = var3_3 /* !! */ ;
                                                                                var3_3 /* !! */  = var55_46 /* !! */ ;
                                                                                Intrinsics.checkNotNull(var53_44, (String)var55_46 /* !! */ );
                                                                                var3_3 /* !! */  = var2_2.get(var53_44);
                                                                                var37_31 /* !! */  = var53_44.a();
                                                                                if (var37_31 /* !! */  == null) {
                                                                                    J83.l();
                                                                                    var42_36 /* !! */  = var6_6;
                                                                                    var37_31 /* !! */  = var7_7 /* !! */ ;
                                                                                    var6_6 = var40_34 /* !! */ ;
                                                                                } else {
                                                                                    var42_36 /* !! */  = var6_6;
                                                                                    var6_6 = var37_31 /* !! */ ;
                                                                                    var37_31 /* !! */  = var7_7 /* !! */ ;
                                                                                }
                                                                                var7_7 /* !! */  = var53_44.s().f;
                                                                                var27_24 = (int)var6_6.b(var7_7 /* !! */ , var3_3 /* !! */ );
                                                                                if (var27_24 != 0) break block143;
                                                                                var3_3 /* !! */  = var4_4.a.b(var53_44);
                                                                                if (var3_3 /* !! */  == null) break block144;
                                                                                var41_35 = var3_3 /* !! */  instanceof pr1_1;
                                                                                if (var41_35 != 0) {
                                                                                    var3_3 /* !! */  = (pr1_1)var3_3 /* !! */ ;
                                                                                    var6_6 = var3_3 /* !! */ .b;
                                                                                    var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                                    var57_48 = var3_3 /* !! */ .length;
                                                                                    var49_41 /* !! */  = 2;
                                                                                    if ((var57_48 -= var49_41 /* !! */ ) >= 0) {
                                                                                        var59_50 /* !! */  = var4_4;
                                                                                        var82_66 /* !! */  = var15_15 /* !! */ ;
                                                                                        var49_41 /* !! */  = 0;
                                                                                        var53_44 = null;
                                                                                        while (true) {
                                                                                            var64_54 = var3_3 /* !! */ [var49_41 /* !! */ ];
                                                                                            var62_52 /* !! */  = var2_2;
                                                                                            var83_67 /* !! */  = var3_3 /* !! */ ;
                                                                                            var21_20 = var64_54 ^ (long)-1;
                                                                                            var25_22 /* !! */  = (reference)7;
                                                                                            var21_20 = var21_20 << var25_22 /* !! */  & var64_54;
                                                                                            var23_21 = -9187201950435737472L;
                                                                                            cfr_temp_12 = (var21_20 &= var23_21) - var23_21;
                                                                                            var44_38 /* !! */  = cfr_temp_12 == 0 ? 0 : (cfr_temp_12 < 0 ? -1 : 1);
                                                                                            if (var44_38 /* !! */  != 0) {
                                                                                                var26_23 = ~(var49_41 /* !! */  - var57_48) >>> 31;
                                                                                                var26_23 = 8 - var26_23;
                                                                                                var3_3 /* !! */  = null;
                                                                                                for (var27_24 = 0; var27_24 < var26_23; ++var27_24) {
                                                                                                    var28_25 = 255L;
                                                                                                    var84_68 = var64_54 & var28_25;
                                                                                                    var32_27 = 128L;
                                                                                                    cfr_temp_13 = var84_68 - var32_27;
                                                                                                    var86_69 /* !! */  = (reference)(cfr_temp_13 == 0 ? 0 : (cfr_temp_13 < 0 ? -1 : 1));
                                                                                                    if (var86_69 /* !! */  < 0) {
                                                                                                        var18_18 = (var49_41 /* !! */  << 3) + var27_24;
                                                                                                        var87_70 /* !! */  = var12_12;
                                                                                                        var12_12 = var6_6[var18_18];
                                                                                                        var14_14.d(var12_12);
                                                                                                        var43_37 = 8;
                                                                                                        var18_18 = 1;
                                                                                                    } else {
                                                                                                        var87_70 /* !! */  = var12_12;
                                                                                                        var43_37 = 8;
                                                                                                    }
                                                                                                    var64_54 >>= var43_37;
                                                                                                    var12_12 = var87_70 /* !! */ ;
                                                                                                }
                                                                                                var87_70 /* !! */  = var12_12;
                                                                                                var43_37 = 8;
                                                                                                if (var26_23 != var43_37) break block116;
                                                                                            } else {
                                                                                                var87_70 /* !! */  = var12_12;
                                                                                            }
                                                                                            if (var49_41 /* !! */  != var57_48) {
                                                                                                ++var49_41 /* !! */ ;
                                                                                                var3_3 /* !! */  = var83_67 /* !! */ ;
                                                                                                var12_12 = var87_70 /* !! */ ;
                                                                                                var2_2 = var62_52 /* !! */ ;
                                                                                                continue;
                                                                                            }
                                                                                            break block116;
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        ** GOTO lbl602
                                                                                    }
                                                                                }
                                                                                break block145;
                                                                            }
                                                                            var62_52 /* !! */  = var2_2;
                                                                            var59_50 /* !! */  = var4_4;
                                                                            var82_66 /* !! */  = var15_15 /* !! */ ;
                                                                            break block146;
                                                                        }
                                                                        var62_52 /* !! */  = var2_2;
                                                                        var59_50 /* !! */  = var4_4;
                                                                        var82_66 /* !! */  = var15_15 /* !! */ ;
                                                                        var87_70 /* !! */  = var12_12;
                                                                        var14_14.d(var3_3 /* !! */ );
                                                                        var18_18 = 1;
                                                                        break block116;
                                                                    }
                                                                    var62_52 /* !! */  = var2_2;
                                                                    var59_50 /* !! */  = var4_4;
                                                                    var82_66 /* !! */  = var15_15 /* !! */ ;
                                                                    var87_70 /* !! */  = var12_12;
                                                                    var8_8.b(var53_44);
                                                                }
lbl623:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var62_52 /* !! */  = var2_2;
                                                            var1_1 /* !! */  = var3_3 /* !! */ ;
                                                            var59_50 /* !! */  = var4_4;
                                                            var82_66 /* !! */  = var15_15 /* !! */ ;
                                                            var42_36 /* !! */  = var6_6;
                                                            var37_31 /* !! */  = var7_7 /* !! */ ;
                                                        }
                                                        var87_70 /* !! */  = var12_12;
                                                        ** continue;
                                                        var26_23 = 8;
                                                        var76_62 /* !! */  >>= var26_23;
                                                        var3_3 /* !! */  = var1_1 /* !! */ ;
                                                        var7_7 /* !! */  = var37_31 /* !! */ ;
                                                        var6_6 = var42_36 /* !! */ ;
                                                        var15_15 /* !! */  = var82_66 /* !! */ ;
                                                        var12_12 = var87_70 /* !! */ ;
                                                        var4_4 = var59_50 /* !! */ ;
                                                        var2_2 = var62_52 /* !! */ ;
                                                    }
                                                    var62_52 /* !! */  = var2_2;
                                                    var1_1 /* !! */  = var3_3 /* !! */ ;
                                                    var59_50 /* !! */  = var4_4;
                                                    var82_66 /* !! */  = var15_15 /* !! */ ;
                                                    var42_36 /* !! */  = var6_6;
                                                    var37_31 /* !! */  = var7_7 /* !! */ ;
                                                    var87_70 /* !! */  = var12_12;
                                                    var26_23 = 8;
                                                    if (var11_11 /* !! */  != var26_23) break block117;
                                                    break block147;
                                                }
                                                var62_52 /* !! */  = var2_2;
                                                var1_1 /* !! */  = var3_3 /* !! */ ;
                                                var59_50 /* !! */  = var4_4;
                                                var82_66 /* !! */  = var15_15 /* !! */ ;
                                                var42_36 /* !! */  = var6_6;
                                                var37_31 /* !! */  = var7_7 /* !! */ ;
                                                var87_70 /* !! */  = var12_12;
                                            }
                                            if (var16_16 != var79_64) {
                                                ++var16_16;
                                                var3_3 /* !! */  = var1_1 /* !! */ ;
                                                var7_7 /* !! */  = var37_31 /* !! */ ;
                                                var6_6 = var42_36 /* !! */ ;
                                                var15_15 /* !! */  = var82_66 /* !! */ ;
                                                var12_12 = var87_70 /* !! */ ;
                                                var4_4 = var59_50 /* !! */ ;
                                                var2_2 = var62_52 /* !! */ ;
                                                continue;
                                            }
                                            break block117;
                                            break;
                                        }
                                    }
                                    var62_52 /* !! */  = var2_2;
                                    var1_1 /* !! */  = var3_3 /* !! */ ;
                                    var59_50 /* !! */  = var4_4;
                                    var82_66 /* !! */  = var15_15 /* !! */ ;
                                }
                                var3_3 /* !! */  = var59_50 /* !! */ ;
                                var2_2 = var62_52 /* !! */ ;
                                break block118;
                            }
                            var62_52 /* !! */  = var2_2;
                            var1_1 /* !! */  = var3_3 /* !! */ ;
                            var59_50 /* !! */  = var4_4;
                            var82_66 /* !! */  = var15_15 /* !! */ ;
                            var7_7 /* !! */  = (np0_0)var7_7 /* !! */ ;
                            var3_3 /* !! */  = var2_2.get(var7_7 /* !! */ );
                            var4_4 = var7_7 /* !! */ .a();
                            if (var4_4 == null) {
                                J83.l();
                                var4_4 = var40_34 /* !! */ ;
                            }
                            if ((var27_24 = (int)var4_4.b(var15_15 /* !! */  = var7_7 /* !! */ .s().f, var3_3 /* !! */ )) == 0) {
                                var3_3 /* !! */  = var59_50 /* !! */ ;
                                var4_4 = var59_50 /* !! */ .a.b(var7_7 /* !! */ );
                                if (var4_4 != null) {
                                    var5_5 = var4_4 instanceof pr1_1;
                                    if (var5_5 != 0) {
                                        var4_4 = (pr1_1)var4_4;
                                        var15_15 /* !! */  = var4_4.b;
                                        var4_4 = var4_4.a;
                                        var41_35 = ((Object[])var4_4).length;
                                        var57_48 = 2;
                                        if ((var41_35 -= var57_48) >= 0) {
                                            var57_48 = 0;
                                            var7_7 /* !! */  = null;
                                            while (true) {
                                                var60_51 = var4_4[var57_48];
                                                var72_60 = var60_51 ^ (long)-1;
                                                var10_10 = 7;
                                                var72_60 = var72_60 << var10_10 & var60_51;
                                                var47_40 = -9187201950435737472L;
                                                cfr_temp_14 = (var72_60 &= var47_40) - var47_40;
                                                var49_41 /* !! */  = cfr_temp_14 == 0 ? 0 : (cfr_temp_14 < 0 ? -1 : 1);
                                                if (var49_41 /* !! */  != 0) {
                                                    var16_16 = ~(var57_48 - var41_35) >>> 31;
                                                    var9_9 = 8;
                                                    var11_11 /* !! */  = 8 - var16_16;
                                                    var71_59 = null;
                                                    for (var16_16 = 0; var16_16 < var11_11 /* !! */ ; ++var16_16) {
                                                        var19_19 = var60_51 & 255L;
                                                        var76_62 /* !! */  = (reference)128L;
                                                        cfr_temp_15 = var19_19 - var76_62 /* !! */ ;
                                                        var34_28 /* !! */  = (reference)(cfr_temp_15 == 0 ? 0 : (cfr_temp_15 < 0 ? -1 : 1));
                                                        if (var34_28 /* !! */  < 0) {
                                                            var9_9 = (var57_48 << 3) + var16_16;
                                                            var36_30 = var15_15 /* !! */ [var9_9];
                                                            var14_14.d(var36_30);
                                                            var9_9 = 8;
                                                            var18_18 = 1;
                                                        } else {
                                                            var9_9 = 8;
                                                        }
                                                        var60_51 >>= var9_9;
                                                    }
                                                    var9_9 = 8;
                                                    if (var11_11 /* !! */  != var9_9) break block118;
                                                }
                                                if (var57_48 != var41_35) {
                                                    ++var57_48;
                                                    continue;
                                                }
                                                break block118;
                                                break;
                                            }
                                        }
                                    } else {
                                        var14_14.d(var4_4);
                                        var18_18 = 1;
                                    }
                                }
                            } else {
                                var3_3 /* !! */  = var59_50 /* !! */ ;
                                var8_8.b(var7_7 /* !! */ );
                            }
                            break block118;
                        }
                        var1_1 /* !! */  = var3_3 /* !! */ ;
                        var3_3 /* !! */  = var4_4;
                        var82_66 /* !! */  = var15_15 /* !! */ ;
                        var42_36 /* !! */  = var6_6;
                    }
                    var4_4 = var3_3 /* !! */ .a;
                    var15_15 /* !! */  = var82_66 /* !! */ ;
                    var4_4 = var4_4.b(var82_66 /* !! */ );
                    if (var4_4 != null) {
                        var5_5 = var4_4 instanceof pr1_1;
                        if (var5_5 != 0) {
                            var4_4 = (pr1_1)var4_4;
                            var15_15 /* !! */  = var4_4.b;
                            var4_4 = var4_4.a;
                            var41_35 = ((Object[])var4_4).length;
                            var57_48 = 2;
                            if ((var41_35 -= var57_48) >= 0) {
                                var57_48 = 0;
                                var7_7 /* !! */  = null;
                                while (true) {
                                    var60_51 = var4_4[var57_48];
                                    var72_60 = var60_51 ^ (long)-1;
                                    var10_10 = 7;
                                    var72_60 = var72_60 << var10_10 & var60_51;
                                    var47_40 = -9187201950435737472L;
                                    cfr_temp_16 = (var72_60 &= var47_40) - var47_40;
                                    var49_41 /* !! */  = cfr_temp_16 == 0 ? 0 : (cfr_temp_16 < 0 ? -1 : 1);
                                    if (var49_41 /* !! */  != 0) {
                                        var16_16 = ~(var57_48 - var41_35) >>> 31;
                                        var9_9 = 8;
                                        var11_11 /* !! */  = 8 - var16_16;
                                        var71_59 = null;
                                        for (var16_16 = 0; var16_16 < var11_11 /* !! */ ; ++var16_16) {
                                            var19_19 = var60_51 & 255L;
                                            var76_62 /* !! */  = (reference)128L;
                                            cfr_temp_17 = var19_19 - var76_62 /* !! */ ;
                                            var34_28 /* !! */  = (reference)(cfr_temp_17 == 0 ? 0 : (cfr_temp_17 < 0 ? -1 : 1));
                                            if (var34_28 /* !! */  < 0) {
                                                var9_9 = (var57_48 << 3) + var16_16;
                                                var36_30 = var15_15 /* !! */ [var9_9];
                                                var14_14.d(var36_30);
                                                var9_9 = 8;
                                                var18_18 = 1;
                                            } else {
                                                var9_9 = 8;
                                            }
                                            var60_51 >>= var9_9;
                                        }
                                        var9_9 = 8;
                                        if (var11_11 /* !! */  != var9_9) break;
                                    }
                                    if (var57_48 != var41_35) {
                                        ++var57_48;
                                        continue;
                                    }
                                    break;
                                }
                            }
                        } else {
                            var14_14.d(var4_4);
                            var18_18 = 1;
                        }
                    }
                }
                var4_4 = var3_3 /* !! */ ;
                var3_3 /* !! */  = var1_1 /* !! */ ;
            }
        }
        var3_3 /* !! */  = var4_4;
        var26_23 = var8_8.l();
        if (var26_23 != 0) {
            var26_23 = var8_8.c;
            if (var26_23 > 0) {
                var4_4 = var8_8.a;
                var5_5 = 0;
                var15_15 /* !! */  = null;
                while (true) {
                    var6_6 = (np0_0)var4_4[var5_5];
                    var7_7 /* !! */  = A83.k();
                    var57_48 = var7_7 /* !! */ .d();
                    var12_12 = var3_3 /* !! */ .a.b(var6_6);
                    if (var12_12 != null) {
                        var79_64 = var12_12 instanceof pr1_1;
                        var71_59 = this;
                        var36_30 = this.f;
                        if (var79_64 != 0) {
                            var12_12 = (pr1_1)var12_12;
                            var13_13 /* !! */  = var12_12.b;
                            var12_12 = var12_12.a;
                            var10_10 = ((Object[])var12_12).length;
                            var50_42 = 2;
                            if ((var10_10 -= var50_42) >= 0) {
                                var49_41 /* !! */  = 0;
                                var53_44 = null;
                                while (true) {
                                    var88_71 = var12_12[var49_41 /* !! */ ];
                                    var11_11 /* !! */  = var49_41 /* !! */ ;
                                    var19_19 = var88_71 ^ (long)-1;
                                    var25_22 /* !! */  = (reference)7;
                                    var19_19 = var19_19 << var25_22 /* !! */  & var88_71;
                                    var23_21 = -9187201950435737472L;
                                    cfr_temp_18 = (var19_19 &= var23_21) - var23_21;
                                    var34_28 /* !! */  = (reference)(cfr_temp_18 == 0 ? 0 : (cfr_temp_18 < 0 ? -1 : 1));
                                    if (var34_28 /* !! */  != false) {
                                        var50_42 = ~(var49_41 /* !! */  - var10_10) >>> 31;
                                        var50_42 = 8 - var50_42;
                                        var53_44 = null;
                                        for (var49_41 /* !! */  = 0; var49_41 /* !! */  < var50_42; ++var49_41 /* !! */ ) {
                                            var28_25 = 255L;
                                            var90_72 = var88_71 & var28_25;
                                            var32_27 = 128L;
                                            cfr_temp_19 = var90_72 - var32_27;
                                            var92_73 /* !! */  = (reference)(cfr_temp_19 == 0 ? 0 : (cfr_temp_19 < 0 ? -1 : 1));
                                            if (var92_73 /* !! */  < 0) {
                                                var34_28 /* !! */  = (reference)((var11_11 /* !! */  << 3) + var49_41 /* !! */ );
                                                var59_50 /* !! */  = var3_3 /* !! */ ;
                                                var3_3 /* !! */  = var13_13 /* !! */ [var34_28 /* !! */ ];
                                                var37_31 /* !! */  = (gr1_1)var36_30.b(var3_3 /* !! */ );
                                                var40_34 /* !! */  = var4_4;
                                                if (var37_31 /* !! */  == null) {
                                                    var42_36 /* !! */  = var12_12;
                                                    var43_37 = 0;
                                                    var4_4 = new gr1_1(null);
                                                    var36_30.i(var3_3 /* !! */ , var4_4);
                                                    var12_12 = Unit.a;
                                                    var12_12 = this;
                                                } else {
                                                    var42_36 /* !! */  = var12_12;
                                                    var12_12 = this;
                                                    var4_4 = var37_31 /* !! */ ;
                                                }
                                                var12_12.c(var6_6, var57_48, var3_3 /* !! */ , (gr1_1)var4_4);
lbl879:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var59_50 /* !! */  = var3_3 /* !! */ ;
                                            var40_34 /* !! */  = var4_4;
                                            var42_36 /* !! */  = var12_12;
                                            var12_12 = this;
                                            ** continue;
                                            var27_24 = 8;
                                            var88_71 >>= var27_24;
                                            var4_4 = var40_34 /* !! */ ;
                                            var12_12 = var42_36 /* !! */ ;
                                            var3_3 /* !! */  = var59_50 /* !! */ ;
                                        }
                                        var59_50 /* !! */  = var3_3 /* !! */ ;
                                        var40_34 /* !! */  = var4_4;
                                        var42_36 /* !! */  = var12_12;
                                        var27_24 = 8;
                                        var32_27 = 128L;
                                        var28_25 = 255L;
                                        var12_12 = this;
                                        if (var50_42 == var27_24) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                    } else {
                                        var59_50 /* !! */  = var3_3 /* !! */ ;
                                        var40_34 /* !! */  = var4_4;
                                        var42_36 /* !! */  = var12_12;
                                        var27_24 = 8;
                                        var32_27 = 128L;
                                        var28_25 = 255L;
                                        var12_12 = this;
                                        ** continue;
                                        var67_56 /* !! */  = var11_11 /* !! */ ;
                                        if (var11_11 /* !! */  != var10_10) {
                                            var49_41 /* !! */  = var11_11 /* !! */  + 1;
                                            var4_4 = var40_34 /* !! */ ;
                                            var12_12 = var42_36 /* !! */ ;
                                            var3_3 /* !! */  = var59_50 /* !! */ ;
                                            var50_42 = 2;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                var59_50 /* !! */  = var3_3 /* !! */ ;
                                var40_34 /* !! */  = var4_4;
                                var12_12 = this;
                                var27_24 = 8;
                                var32_27 = 128L;
                                var28_25 = 255L;
                                var23_21 = -9187201950435737472L;
                                var25_22 /* !! */  = (reference)7;
                            }
                            var4_4 = var12_12;
                        } else {
                            var59_50 /* !! */  = var3_3 /* !! */ ;
                            var40_34 /* !! */  = var4_4;
                            var4_4 = this;
                            var27_24 = 8;
                            var32_27 = 128L;
                            var28_25 = 255L;
                            var23_21 = -9187201950435737472L;
                            var25_22 /* !! */  = (reference)7;
                            var13_13 /* !! */  = (gr1_1)var36_30.b(var12_12);
                            if (var13_13 /* !! */  == null) {
                                var13_13 /* !! */  = new gr1_1(null);
                                var36_30.i(var12_12, var13_13 /* !! */ );
                                var14_14 = Unit.a;
                            }
                            var4_4.c(var6_6, var57_48, var12_12, (gr1_1)var13_13 /* !! */ );
                        }
                    } else {
                        var59_50 /* !! */  = var3_3 /* !! */ ;
                        var40_34 /* !! */  = var4_4;
                        var27_24 = 8;
                        var32_27 = 128L;
                        var28_25 = 255L;
                        var23_21 = -9187201950435737472L;
                        var25_22 /* !! */  = (reference)7;
                        var4_4 = this;
                    }
                    if (++var5_5 < var26_23) {
                        var4_4 = var40_34 /* !! */ ;
                        var3_3 /* !! */  = var59_50 /* !! */ ;
                        continue;
                    }
                    break;
                }
            } else {
                var4_4 = this;
            }
            var8_8.g();
        } else {
            var4_4 = this;
        }
        return (boolean)var18_18;
    }

    public final void c(Object object, int n3, Object object2, gr1_1 gr1_12) {
        Object object3;
        int n4;
        S83$a s83$a = this;
        Object object4 = object;
        int n7 = n3;
        Object object5 = gr1_12;
        int n8 = this.j;
        if (n8 > 0) {
            return;
        }
        n8 = gr1_12.e(object);
        if (n8 < 0) {
            n8 ^= 0xFFFFFFFF;
            n4 = -1;
        } else {
            int[] nArray = gr1_12.c;
            n4 = nArray[n8];
        }
        Object object6 = ((i62)object5).b;
        object6[n8] = object4;
        object5 = ((i62)object5).c;
        object5[n8] = n7;
        boolean bl2 = object4 instanceof np0_0;
        n8 = 2;
        if (bl2 && n4 != n7) {
            object3 = object4;
            object3 = ((np0_0)object4).s();
            object5 = s83$a.l;
            object6 = ((mp0$a)object3).f;
            ((HashMap)object5).put(object4, object6);
            object3 = ((mp0$a)object3).e;
            object5 = s83$a.k;
            ((vt2_0)object5).c(object4);
            object6 = ((i62)object3).b;
            object3 = ((i62)object3).a;
            int n10 = ((Object)object3).length - n8;
            if (n10 >= 0) {
                int n14 = 0;
                while (true) {
                    reference var17_17 = object3[n14];
                    reference var19_18 = var17_17 ^ (long)-1;
                    int n15 = 7;
                    var19_18 = var19_18 << n15 & var17_17;
                    long l2 = -9187201950435737472L;
                    reference cfr_temp_0 = (var19_18 &= l2) - l2;
                    Object object7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (object7 != false) {
                        int n16 = ~(n14 - n10) >>> 31;
                        int n17 = 8;
                        n16 = 8 - n16;
                        for (n15 = 0; n15 < n16; ++n15) {
                            reference var27_24 = var17_17 & 0xFFL;
                            long l3 = 128L;
                            reference cfr_temp_1 = var27_24 - l3;
                            Object object8 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                            if (object8 < 0) {
                                Object object9;
                                int n18 = (n14 << 3) + n15;
                                Object object10 = object9 = object6[n18];
                                object10 = (pb3_0)object9;
                                boolean bl3 = object10 instanceof qb3_0;
                                if (bl3) {
                                    Object object11 = object10;
                                    object11 = (qb3_0)object10;
                                    ((qb3_0)object11).v(n8);
                                }
                                ((vt2_0)object5).a(object10, object4);
                            }
                            var17_17 >>= n17;
                        }
                        if (n16 != n17) break;
                    }
                    if (n14 == n10) break;
                    ++n14;
                }
            }
        }
        if (n4 == (n7 = -1)) {
            n7 = object4 instanceof qb3_0;
            if (n7 != 0) {
                object3 = object4;
                object3 = (qb3_0)object4;
                ((qb3_0)object3).v(n8);
            }
            object3 = s83$a.e;
            object5 = object2;
            ((vt2_0)object3).a(object4, object2);
        }
    }

    public final void d(Object object, Object object2) {
        vt2_0 vt2_02 = this.e;
        vt2_02.b(object2, object);
        boolean bl2 = object2 instanceof np0_0;
        if (bl2 && !(bl2 = ((dt2_0)(object = vt2_02.a)).a(object2))) {
            this.k.c(object2);
            object = this.l;
            ((HashMap)object).remove(object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void e(Function1 var1_1) {
        var2_2 = this;
        var3_3 = this.f;
        var4_4 = var3_3.a;
        var5_5 = var4_4.length + -2;
        if (var5_5 >= 0) {
            var6_6 = 0;
            while (true) {
                var7_7 = var4_4[var6_6];
                var9_8 = var7_7 ^ (long)-1;
                var11_9 = 7;
                var9_8 = var9_8 << var11_9 & var7_7;
                var12_10 = -9187201950435737472L;
                var14_11 = -2.937446524422997E-306;
                cfr_temp_0 = (var9_8 &= var12_10) - var12_10;
                var16_12 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                if (var16_12 != false) {
                    var17_13 = ~(var6_6 - var5_5) >>> 31;
                    var17_13 = 8 - var17_13;
                    for (var16_12 = (long)0; var16_12 < var17_13; ++var16_12) {
                        var18_14 = 255L;
                        var20_15 = var7_7 & var18_14;
                        var22_16 = 128L;
                        cfr_temp_1 = var20_15 - var22_16;
                        var24_17 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                        if (var24_17 < 0) {
                            block17: {
                                var25_18 = var6_6 << 3;
                                var26_19 = var25_18 + var16_12;
                                var27_20 = var3_3.b[var26_19];
                                var28_21 = (gr1_1)var3_3.c[var26_19];
                                var29_22 = (Boolean)var1_1.invoke(var27_20);
                                var30_23 = var29_22;
                                if (var30_23) {
                                    var31_24 = var28_21.b;
                                    var32_25 = var28_21.c;
                                    var28_21 = var28_21.a;
                                    var11_9 = ((Object)var28_21).length + -2;
                                    var33_26 = var4_4;
                                    if (var11_9 >= 0) {
                                        var34_27 = var17_13;
                                        var35_28 = 0;
                                        var4_4 = null;
                                        while (true) {
                                            var9_8 = (long)var28_21[var35_28];
                                            var36_29 = var6_6;
                                            var37_30 = var7_7;
                                            var39_31 = var9_8 ^ (long)-1;
                                            var41_32 = 7;
                                            var39_31 = var39_31 << var41_32 & var9_8;
                                            var42_33 = -9187201950435737472L;
                                            var44_34 = -2.937446524422997E-306;
                                            cfr_temp_2 = (var39_31 &= var42_33) - var42_33;
                                            var46_35 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                            if (var46_35 != false) {
                                                var6_6 = ~(var35_28 - var11_9) >>> 31;
                                                var6_6 = 8 - var6_6;
                                                for (var47_36 = 0; var47_36 < var6_6; ++var47_36) {
                                                    var48_37 = 255L;
                                                    var50_38 = var9_8 & var48_37;
                                                    cfr_temp_3 = var50_38 - var22_16;
                                                    var46_35 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                    if (var46_35 < 0) {
                                                        var46_35 = (var35_28 << 3) + var47_36;
                                                        var52_39 = var31_24[var46_35];
                                                        var46_35 = var32_25[var46_35];
                                                        var2_2.d(var27_20, var52_39);
                                                    }
                                                    var9_8 >>= 8;
                                                    var41_32 = 7;
                                                }
                                                var41_32 = 8;
                                                var48_37 = 255L;
                                                if (var6_6 != var41_32) break block17;
                                            } else {
                                                var48_37 = 255L;
                                            }
                                            if (var35_28 != var11_9) {
                                                ++var35_28;
                                                var6_6 = var36_29;
                                                var7_7 = var37_30;
                                                continue;
                                            }
                                            break block17;
                                            break;
                                        }
                                    }
                                    var36_29 = var6_6;
                                    var37_30 = var7_7;
                                    var34_27 = var17_13;
                                    var42_33 = -9187201950435737472L;
                                    var44_34 = -2.937446524422997E-306;
                                } else {
                                    var33_26 = var4_4;
                                    var36_29 = var6_6;
                                    var37_30 = var7_7;
                                    var34_27 = var17_13;
                                    var42_33 = var12_10;
                                    var44_34 = var14_11;
                                }
                            }
                            if ((var35_28 = (int)var29_22.booleanValue()) != 0) {
                                var3_3.h(var26_19);
                            }
lbl96:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var33_26 = var4_4;
                        var36_29 = var6_6;
                        var37_30 = var7_7;
                        var34_27 = var17_13;
                        var42_33 = var12_10;
                        var44_34 = var14_11;
                        ** continue;
                        var35_28 = 8;
                        var7_7 = var37_30 >> var35_28;
                        var12_10 = var42_33;
                        var14_11 = var44_34;
                        var4_4 = var33_26;
                        var17_13 = var34_27;
                        var6_6 = var36_29;
                        var11_9 = 7;
                    }
                    var33_26 = var4_4;
                    var36_29 = var6_6;
                    var35_28 = 8;
                    if (var17_13 != var35_28) break;
                    var26_19 = var6_6;
                } else {
                    var33_26 = var4_4;
                    var26_19 = var6_6;
                }
                if (var26_19 == var5_5) break;
                var6_6 = var26_19 + 1;
                var4_4 = var33_26;
            }
        }
    }
}

