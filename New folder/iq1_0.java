/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.SparseBooleanArray
 *  android.util.SparseLongArray
 *  android.view.MotionEvent
 */
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/*
 * Renamed from iQ1
 */
public final class iq1_0 {
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public int e;
    public int f;

    public iq1_0() {
        int n3;
        Object object;
        this.b = object = new SparseLongArray();
        this.c = object;
        super();
        this.d = object;
        this.e = n3 = -1;
        this.f = n3;
    }

    /*
     * Unable to fully structure code
     */
    public final cw2_0 a(MotionEvent var1_1, Ow2 var2_2) {
        block41: {
            var3_3 = this;
            var4_4 = var1_1;
            var5_5 = var2_2;
            var6_6 = var1_1.getActionMasked();
            var7_7 = this.b;
            var8_8 = this.c;
            var9_9 = 3;
            var10_10 = 4.2E-45f;
            if (var6_6 == var9_9) break block41;
            var11_11 = 4;
            var12_12 = 5.6E-45f;
            if (var6_6 == var11_11) break block41;
            var13_13 = var1_1.getPointerCount();
            var14_14 = 1;
            var15_15 = 1.4E-45f;
            var16_16 = 0;
            if (var13_13 == var14_14) {
                var13_13 = var1_1.getToolType(0);
                var17_17 = var1_1.getSource();
                var18_18 = this.e;
                if (var13_13 != var18_18 || var17_17 != (var18_18 = this.f)) {
                    var3_3.e = var13_13;
                    var3_3.f = var17_17;
                    var8_8.clear();
                    var7_7.clear();
                }
            }
            var13_13 = var1_1.getActionMasked();
            var19_19 = 1L;
            var21_20 = 9;
            if (var13_13 != 0 && var13_13 != (var22_21 = 5)) {
                if (var13_13 == var21_20 && (var22_21 = var7_7.indexOfKey(var13_13 = var4_4.getPointerId(0))) < 0) {
                    var23_22 = var3_3.a;
                    var3_3.a = var25_23 = var23_22 + var19_19;
                    var7_7.put(var13_13, var23_22);
                }
            } else {
                var13_13 = var1_1.getActionIndex();
                var14_14 = var4_4.getPointerId(var13_13);
                var16_16 = var7_7.indexOfKey(var14_14);
                if (var16_16 < 0) {
                    var23_22 = var3_3.a;
                    var3_3.a = var27_24 = var23_22 + var19_19;
                    var7_7.put(var14_14, var23_22);
                    var9_9 = var4_4.getToolType(var13_13);
                    var11_11 = 3;
                    var12_12 = 4.2E-45f;
                    if (var9_9 == var11_11) {
                        var9_9 = 1;
                        var10_10 = 1.4E-45f;
                        var8_8.put(var14_14, (boolean)var9_9);
                    }
                }
            }
            var9_9 = 10;
            var10_10 = 1.4E-44f;
            if (var6_6 == var21_20) ** GOTO lbl-1000
            var11_11 = 7;
            var12_12 = 9.8E-45f;
            if (var6_6 != var11_11 && var6_6 != var9_9) {
                var11_11 = 0;
                var12_12 = 0.0f;
                var29_25 = null;
            } else lbl-1000:
            // 2 sources

            {
                var11_11 = 1;
                var12_12 = 1.4E-45f;
            }
            var13_13 = 8;
            if (var6_6 == var13_13) {
                var14_14 = 1;
                var15_15 = 1.4E-45f;
            } else {
                var14_14 = 0;
                var15_15 = 0.0f;
            }
            if (var11_11 != 0) {
                var22_21 = var1_1.getActionIndex();
                var22_21 = var4_4.getPointerId(var22_21);
                var30_26 = 1;
                var8_8.put(var22_21, (boolean)var30_26);
            } else {
                var30_26 = 1;
            }
            var16_16 = 6;
            var6_6 = var6_6 != var30_26 ? (var6_6 != var16_16 ? -1 : var1_1.getActionIndex()) : 0;
            var31_27 = var3_3.d;
            var31_27.clear();
            var22_21 = var1_1.getPointerCount();
            for (var16_16 = 0; var16_16 < var22_21; ++var16_16) {
                var33_29 = var11_11 == 0 && var16_16 != var6_6 && (var14_14 == 0 || (var32_28 = var1_1.getButtonState()) != 0);
                var21_20 = var4_4.getPointerId(var16_16);
                var9_9 = var7_7.indexOfKey(var21_20);
                if (var9_9 >= 0) {
                    var34_30 = var7_7.valueAt(var9_9);
                    var36_31 = var11_11;
                    var37_32 = var12_12;
                    var38_33 = var14_14;
                    var39_34 = var15_15;
                    var40_35 = var34_30;
                } else {
                    var38_33 = var14_14;
                    var39_34 = var15_15;
                    var42_36 = var3_3.a;
                    var36_31 = var11_11;
                    var37_32 = var12_12;
                    var3_3.a = var27_24 = var42_36 + var19_19;
                    var7_7.put(var21_20, var42_36);
                    var40_35 = var42_36;
                }
                var44_37 = var4_4.getPressure(var16_16);
                var10_10 = var4_4.getX(var16_16);
                var12_12 = var4_4.getY(var16_16);
                var27_24 = h72.a(var10_10, var12_12);
                var13_13 = 0;
                var14_14 = 3;
                var15_15 = 4.2E-45f;
                var45_38 = e72.a(var14_14, var27_24, 0.0f);
                if (var16_16 == 0) {
                    var10_10 = var1_1.getRawX();
                    var12_12 = var1_1.getRawY();
                    var27_24 = h72.a(var10_10, var12_12);
                    var47_39 = var5_5.n(var27_24);
lbl113:
                    // 2 sources

                    while (true) {
                        var49_40 = var27_24;
                        var51_41 = var47_39;
                        break;
                    }
                } else {
                    var21_20 = Build.VERSION.SDK_INT;
                    var14_14 = 29;
                    var15_15 = 4.1E-44f;
                    if (var21_20 >= var14_14) {
                        var53_42 = mQ1.a;
                        var27_24 = var53_42.a(var4_4, var16_16);
                        var47_39 = var5_5.n(var27_24);
                        ** continue;
                    }
                    var47_39 = var5_5.s(var27_24);
                    var51_41 = var27_24;
                    var49_40 = var47_39;
                }
                var9_9 = var4_4.getToolType(var16_16);
                if (var9_9 != 0) {
                    var11_11 = 1;
                    var12_12 = 1.4E-45f;
                    if (var9_9 != var11_11) {
                        var11_11 = 2;
                        var12_12 = 2.8E-45f;
                        if (var9_9 != var11_11) {
                            var14_14 = 3;
                            var15_15 = 4.2E-45f;
                            if (var9_9 != var14_14) {
                                var21_20 = 4;
                                if (var9_9 != var21_20) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var54_43 = 0;
                                        break;
                                    }
                                } else {
                                    var54_43 = 4;
                                }
                            } else {
                                var21_20 = 4;
                                var54_43 = 2;
                            }
                        } else {
                            var14_14 = 3;
                            var15_15 = 4.2E-45f;
                            var21_20 = 4;
                            var54_43 = 3;
                        }
                    } else {
                        var14_14 = 3;
                        var15_15 = 4.2E-45f;
                        var21_20 = 4;
                        var54_43 = 1;
                    }
                } else {
                    var14_14 = 3;
                    var15_15 = 4.2E-45f;
                    var21_20 = 4;
                    ** continue;
                }
                var11_11 = var1_1.getHistorySize();
                var53_42 = new ArrayList<A61>(var11_11);
                var11_11 = var1_1.getHistorySize();
                var15_15 = 0.0f;
                for (var14_14 = 0; var14_14 < var11_11; ++var14_14) {
                    var55_44 = var4_4.getHistoricalX(var16_16, var14_14);
                    var56_45 = var4_4.getHistoricalY(var16_16, var14_14);
                    var57_46 = Float.isInfinite(var55_44);
                    if (!(var57_46 || (var57_46 = Float.isNaN(var55_44)) || (var57_46 = Float.isInfinite(var56_45)) || (var57_46 = Float.isNaN(var56_45)))) {
                        var58_47 = h72.a(var55_44, var56_45);
                        var61_49 = var4_4.getHistoricalEventTime(var14_14);
                        var60_48 = new A61(var61_49, var58_47, var58_47);
                        var53_42.add(var60_48);
                    }
                    var19_19 = 1L;
                }
                var11_11 = var1_1.getActionMasked();
                var14_14 = 8;
                var15_15 = 1.1E-44f;
                if (var11_11 == var14_14) {
                    var11_11 = 10;
                    var55_44 = var4_4.getAxisValue(var11_11);
                    var18_18 = 9;
                    var56_45 = 1.3E-44f;
                    var12_12 = -var4_4.getAxisValue(var18_18) + 0.0f;
                    var63_50 = h72.a(var55_44, var12_12);
                } else {
                    var18_18 = 9;
                    var56_45 = 1.3E-44f;
                    var63_50 = 0L;
                }
                var11_11 = var4_4.getPointerId(var16_16);
                var65_51 = var8_8.get(var11_11, false);
                var47_39 = var1_1.getEventTime();
                var29_25 = new dw2_1(var40_35, var47_39, var49_40, var51_41, var33_29, var44_37, var54_43, var65_51, var53_42, var63_50, var45_38);
                var31_27.add(var29_25);
                var14_14 = var38_33;
                var15_15 = var39_34;
                var11_11 = var36_31;
                var12_12 = var37_32;
                var9_9 = 10;
                var10_10 = 1.4E-44f;
                var13_13 = 8;
                var19_19 = 1L;
                var21_20 = 9;
            }
            var66_52 = var1_1.getActionMasked();
            if (var66_52 != (var6_6 = 1) && var66_52 != (var6_6 = 6)) {
                var13_13 = 0;
            } else {
                var66_52 = var1_1.getActionIndex();
                var66_52 = var4_4.getPointerId(var66_52);
                var13_13 = 0;
                var6_6 = (int)var8_8.get(var66_52, false);
                if (var6_6 == 0) {
                    var7_7.delete(var66_52);
                    var8_8.delete(var66_52);
                }
            }
            var66_52 = var7_7.size();
            var6_6 = var1_1.getPointerCount();
            if (var66_52 > var6_6) {
                var6_6 = -1;
                block4: for (var66_52 = var7_7.size() - 1; var6_6 < var66_52; var66_52 += -1) {
                    var9_9 = var7_7.keyAt(var66_52);
                    var11_11 = var1_1.getPointerCount();
                    var15_15 = 0.0f;
                    for (var14_14 = 0; var14_14 < var11_11; ++var14_14) {
                        var16_16 = var4_4.getPointerId(var14_14);
                        if (var16_16 == var9_9) continue block4;
                    }
                    var7_7.removeAt(var66_52);
                    var8_8.delete(var9_9);
                }
            }
            var1_1.getEventTime();
            var5_5 = new cw2_0(var31_27, var4_4);
            return var5_5;
        }
        var7_7.clear();
        var8_8.clear();
        return null;
    }
}

