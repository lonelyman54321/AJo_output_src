/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lS0
 */
public abstract class ls0_1 {
    public long[] a;
    public float[] b;
    public int c;

    public ls0_1() {
        Object[] objectArray = et2_1.a;
        this.a = objectArray;
        objectArray = ms0_0.a;
        this.b = objectArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        var2_2 = var1_1;
        var3_3 = true;
        if (var1_1 == this) {
            return var3_3;
        }
        var4_4 = var1_1 instanceof ls0_1;
        var5_5 = 0;
        if (var4_4 == 0) {
            return false;
        }
        var2_2 = (ls0_1)var1_1;
        var2_2.getClass();
        var6_6 = this.b;
        var7_7 = this.a;
        var8_8 = var7_7.length + -2;
        if (var8_8 < 0) ** GOTO lbl125
        var9_9 = 0;
        block0: while (true) {
            block20: {
                block17: {
                    var10_10 = var7_7[var9_9];
                    var12_11 = var10_10 ^ (long)-1;
                    var14_12 = 7;
                    var12_11 = var12_11 << var14_12 & var10_10;
                    var15_13 = -9187201950435737472L;
                    var17_14 = -2.937446524422997E-306;
                    cfr_temp_0 = (var12_11 &= var15_13) - var15_13;
                    var19_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var19_15 /* !! */  == false) break block17;
                    var20_16 = ~(var9_9 - var8_8) >>> 31;
                    var21_17 = 8;
                    var20_16 = 8 - var20_16;
                    for (var19_15 /* !! */  = (long)0; var19_15 /* !! */  < var20_16; ++var19_15 /* !! */ ) {
                        block18: {
                            var22_18 = var10_10 & 255L;
                            var24_19 = 128L;
                            cfr_temp_1 = var22_18 - var24_19;
                            var26_20 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var26_20 /* !! */  >= 0) break block18;
                            var27_21 = (var9_9 << 3) + var19_15 /* !! */ ;
                            var28_22 = var6_6[var27_21];
                            var2_2.getClass();
                            var29_23 = Float.floatToIntBits(var28_22) * -862048943;
                            var30_24 = var29_23 << 16;
                            var21_17 = (var29_23 ^= var30_24) & 127;
                            var5_5 = var2_2.c;
                            var29_23 = var29_23 >>> 7 & var5_5;
                            var31_25 = 0;
                            while (true) {
                                block19: {
                                    block16: {
                                        var32_26 = var2_2.a;
                                        var33_27 = var29_23 >> 3;
                                        var34_28 = var29_23 & 7;
                                        var35_29 = var34_28 << 3;
                                        var36_30 = var32_26[var33_27] >>> var35_29;
                                        var38_31 = var32_26[++var33_27];
                                        var14_12 = 64 - var35_29;
                                        var40_32 = -((long)var35_29);
                                        var42_33 = 63;
                                        var43_34 = 8.8E-44f;
                                        var40_32 >>= var42_33;
                                        var40_32 = (var38_31 <<= var14_12) & var40_32;
                                        var40_32 = var36_30 | var40_32;
                                        var44_35 = var6_6;
                                        var45_36 = var21_17;
                                        var36_30 = 0x101010101010101L;
                                        var45_36 = var45_36 * var36_30 ^ var40_32;
                                        var36_30 = var45_36 - var36_30;
                                        var45_36 ^= (long)-1;
                                        var45_36 = var36_30 & var45_36;
                                        var47_37 = -9187201950435737472L;
                                        var45_36 &= var47_37;
                                        while ((var34_28 = (int)((cfr_temp_2 = var45_36 - (var36_30 = 0L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) != 0) {
                                            var34_28 = Long.numberOfTrailingZeros(var45_36) >> 3;
                                            var49_38 = var2_2.b;
                                            var43_34 = var49_38[var34_28 = var29_23 + var34_28 & var5_5];
                                            cfr_temp_3 = var43_34 - var28_22;
                                            var42_33 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                                            if (var42_33 == 0) {
                                                var40_32 = -9187201950435737472L;
                                                var50_39 = -2.937446524422997E-306;
                                                break block16;
                                            }
                                            var36_30 = var45_36 - 1L;
                                            var45_36 &= var36_30;
                                        }
                                        var45_36 = var40_32 ^ (long)-1;
                                        var43_34 = 8.4E-45f;
                                        var45_36 = var45_36 << 6 & var40_32;
                                        var40_32 = -9187201950435737472L;
                                        var50_39 = -2.937446524422997E-306;
                                        cfr_temp_4 = (var45_36 &= var40_32) - var36_30;
                                        var42_33 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                        if (var42_33 == 0) break block19;
                                        var34_28 = -1;
                                    }
                                    var3_3 = var34_28 >= 0;
                                    if (!var3_3) {
                                        return false;
                                    }
lbl95:
                                    // 3 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var4_4 = 8;
                                var29_23 = var29_23 + (var31_25 += 8) & var5_5;
                                var15_13 = var40_32;
                                var17_14 = var50_39;
                                var6_6 = var44_35;
                                var3_3 = true;
                            }
                        }
                        var44_35 = var6_6;
                        var40_32 = var15_13;
                        var50_39 = var17_14;
                        ** continue;
                        var3_3 = false;
                        var4_4 = 8;
                        var10_10 >>= var4_4;
                        var15_13 = var40_32;
                        var17_14 = var50_39;
                        var6_6 = var44_35;
                        var3_3 = true;
                        var5_5 = 0;
                        var21_17 = 8;
                        var14_12 = 7;
                    }
                    var44_35 = var6_6;
                    var3_3 = false;
                    var4_4 = 8;
                    if (var20_16 == var4_4) break block20;
lbl125:
                    // 3 sources

                    break block0;
                }
                var44_35 = var6_6;
                var3_3 = false;
            }
            if (var9_9 == var8_8) ** continue;
            ++var9_9;
            var6_6 = var44_35;
            var3_3 = true;
            var5_5 = 0;
        }
        var52_40 = true;
        return var52_40;
    }

    public final int hashCode() {
        int n3;
        block5: {
            float[] fArray = this.b;
            long[] lArray = this.a;
            int n4 = lArray.length + -2;
            int n7 = 0;
            if (n4 >= 0) {
                int n8 = 0;
                n3 = 0;
                while (true) {
                    long l2 = lArray[n8];
                    long l3 = l2 ^ (long)-1;
                    int n10 = 7;
                    l3 = l3 << n10 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object != false) {
                        int n14 = ~(n8 - n4) >>> 31;
                        int n15 = 8;
                        n14 = 8 - n14;
                        for (n10 = 0; n10 < n14; ++n10) {
                            long l8 = 0xFFL & l2;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object2 < 0) {
                                int n16 = (n8 << 3) + n10;
                                float f5 = fArray[n16];
                                n3 = n16 = Float.floatToIntBits(f5) + n3;
                            }
                            l2 >>= n15;
                        }
                        if (n14 != n15) break block5;
                    }
                    if (n8 == n4) break;
                    ++n8;
                }
                n7 = n3;
            }
            n3 = n7;
        }
        return n3;
    }

    public final String toString() {
        CharSequence charSequence;
        block7: {
            String string2 = ", ";
            Intrinsics.checkNotNullParameter(string2, "separator");
            Object object = "[";
            Intrinsics.checkNotNullParameter(object, "prefix");
            String string3 = "]";
            Intrinsics.checkNotNullParameter(string3, "postfix");
            String string4 = "...";
            Intrinsics.checkNotNullParameter(string4, "truncated");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((CharSequence)object);
            object = this.b;
            long[] lArray = this.a;
            int n3 = lArray.length + -2;
            if (n3 >= 0) {
                int n4 = 0;
                int n7 = 0;
                while (true) {
                    long l2 = lArray[n4];
                    long l3 = l2 ^ (long)-1;
                    int n8 = 7;
                    l3 = l3 << n8 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object2 != false) {
                        int n10;
                        Object object3;
                        int n14 = ~(n4 - n3) >>> 31;
                        int n15 = 8;
                        n14 = 8 - n14;
                        for (n8 = 0; n8 < n14; ++n8) {
                            long l8 = l2 & 0xFFL;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object4 < 0) {
                                int n16 = (n4 << 3) + n8;
                                object3 = object[n16];
                                n15 = -1;
                                if (n7 == n15) {
                                    ((StringBuilder)charSequence).append((CharSequence)string4);
                                    break block7;
                                }
                                if (n7 != 0) {
                                    ((StringBuilder)charSequence).append((CharSequence)string2);
                                }
                                ((StringBuilder)charSequence).append((float)object3);
                                ++n7;
                            }
                            n10 = 8;
                            object3 = 1.1E-44f;
                            l2 >>= n10;
                            n15 = 8;
                        }
                        n10 = 8;
                        object3 = 1.1E-44f;
                        if (n14 != n10) break;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            ((StringBuilder)charSequence).append((CharSequence)string3);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

