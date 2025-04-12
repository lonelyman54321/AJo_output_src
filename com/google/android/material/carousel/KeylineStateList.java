/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.Carousel;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import com.google.android.material.carousel.KeylineState$Builder;
import com.google.android.material.carousel.KeylineState$Keyline;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class KeylineStateList {
    private static final int NO_INDEX = 255;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(KeylineState object, List object2, List list) {
        List list2;
        this.defaultState = object;
        this.startStateSteps = list2 = Collections.unmodifiableList(object2);
        this.endStateSteps = list2 = Collections.unmodifiableList(list);
        boolean bl2 = true;
        float f5 = ((KeylineState)on_2.d((int)(bl2 ? 1 : 0), (List)object2)).getFirstKeyline().loc;
        float f6 = ((KeylineState)object).getFirstKeyline().loc;
        this.startShiftRange = f5 -= f6;
        float f7 = ((KeylineState)object).getLastKeyline().loc;
        f6 = ((KeylineState)on_2.d((int)(bl2 ? 1 : 0), (List)list)).getLastKeyline().loc;
        this.endShiftRange = f7 -= f6;
        object2 = KeylineStateList.getStateStepInterpolationPoints(f5, (List)object2, bl2);
        this.startStateStepsInterpolationPoints = (float[])object2;
        object = KeylineStateList.getStateStepInterpolationPoints(f7, list, false);
        this.endStateStepsInterpolationPoints = (float[])object;
    }

    private KeylineState closestStateStepFromInterpolation(List list, float f5, float[] fArray) {
        float[] fArray2 = KeylineStateList.getStateStepsRange(list, f5, fArray);
        fArray = null;
        float f6 = fArray2[0];
        float f7 = 0.5f;
        float f8 = f6 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0) {
            int n3 = (int)fArray2[2];
            return (KeylineState)list.get(n3);
        }
        int n4 = (int)fArray2[1];
        return (KeylineState)list.get(n4);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f5) {
        Object object;
        int n3;
        for (int i3 = keylineState.getLastFocalKeylineIndex(); i3 < (n3 = (object = keylineState.getKeylines()).size()); ++i3) {
            object = (KeylineState$Keyline)keylineState.getKeylines().get(i3);
            float f6 = ((KeylineState$Keyline)object).mask;
            float f7 = f5 - f6;
            n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
            if (n3 != 0) continue;
            return i3;
        }
        return keylineState.getKeylines().size() + -1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = keylineState.getKeylines()).size()); ++i3) {
            object = (KeylineState$Keyline)keylineState.getKeylines().get(i3);
            n3 = (int)(((KeylineState$Keyline)object).isAnchor ? 1 : 0);
            if (n3 != 0) continue;
            return i3;
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f5) {
        for (int i3 = keylineState.getFirstFocalKeylineIndex() + -1; i3 >= 0; i3 += -1) {
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)keylineState.getKeylines().get(i3);
            float f6 = keylineState$Keyline.mask;
            float f7 = f5 - f6;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object != false) continue;
            return i3;
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        List list = keylineState.getKeylines();
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)keylineState.getKeylines().get(i3);
            boolean bl2 = keylineState$Keyline.isAnchor;
            if (bl2) continue;
            return i3;
        }
        return -1;
    }

    public static KeylineStateList from(Carousel object, KeylineState keylineState, float f5, float f6, float f7) {
        List list = KeylineStateList.getStateStepsStart((Carousel)object, keylineState, f5, f6);
        object = KeylineStateList.getStateStepsEnd((Carousel)object, keylineState, f5, f7);
        KeylineStateList keylineStateList = new KeylineStateList(keylineState, list, (List)object);
        return keylineStateList;
    }

    private static float[] getStateStepInterpolationPoints(float f5, List list, boolean bl2) {
        int n3 = list.size();
        float[] fArray = new float[n3];
        for (int i3 = 1; i3 < n3; ++i3) {
            float f6;
            float f7;
            float f8;
            int n4 = i3 + -1;
            Object object = (KeylineState)list.get(n4);
            Object object2 = (KeylineState)list.get(i3);
            if (bl2) {
                object2 = ((KeylineState)object2).getFirstKeyline();
                f8 = ((KeylineState$Keyline)object2).loc;
                object = ((KeylineState)object).getFirstKeyline();
                f7 = ((KeylineState$Keyline)object).loc;
                f8 -= f7;
            } else {
                object = ((KeylineState)object).getLastKeyline();
                f7 = ((KeylineState$Keyline)object).loc;
                object2 = ((KeylineState)object2).getLastKeyline();
                f8 = ((KeylineState$Keyline)object2).loc;
                f8 = f7 - f8;
            }
            f8 /= f5;
            int n7 = n3 + -1;
            if (i3 == n7) {
                n4 = 1065353216;
                f6 = 1.0f;
            } else {
                f6 = fArray[n4] + f8;
            }
            fArray[i3] = f6;
        }
        return fArray;
    }

    /*
     * Unable to fully structure code
     */
    private static List getStateStepsEnd(Carousel var0, KeylineState var1_1, float var2_2, float var3_3) {
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = var3_3;
        var7_7 = new ArrayList<Object>();
        var7_7.add(var1_1);
        var8_8 = KeylineStateList.findLastNonAnchorKeylineIndex(var1_1);
        var9_9 = var0.isHorizontal();
        if (var9_9 != 0) {
            var9_9 = var0.getContainerWidth();
lbl11:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var9_9 = var0.getContainerHeight();
        ** while (true)
        var11_11 = var10_10 = (float)var9_9;
        var9_9 = (int)KeylineStateList.isLastFocalItemVisibleAtRightOfContainer(var0, var1_1);
        if (var9_9 == 0) {
            var9_9 = -1;
            var10_10 = 0.0f / 0.0f;
            if (var8_8 != var9_9) {
                var9_9 = var1_1.getLastFocalKeylineIndex();
                var12_12 = var8_8 - var9_9;
                var13_13 = var1_1.getFirstKeyline();
                var10_10 = var13_13.locOffset;
                var14_15 = var1_1.getFirstKeyline();
                var15_16 = var14_15.maskedItemSize;
                var16_17 = 2.0f;
                var17_18 = var10_10 - (var15_16 /= var16_17);
                if (var12_12 <= 0) {
                    var13_13 = var1_1.getLastFocalKeyline();
                    var10_10 = var13_13.cutoff;
                    cfr_temp_0 = var10_10 - 0.0f;
                    var9_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var9_9 > 0) {
                        var5_5 = var1_1.getLastFocalKeyline().cutoff;
                        var5_5 = var17_18 - var5_5;
                        var4_4 = KeylineStateList.shiftKeylinesAndCreateKeylineState(var4_4, var5_5, var11_11);
                        var7_7.add(var4_4);
                        return var7_7;
                    }
                }
                var9_9 = 0;
                var10_10 = 0.0f;
                var13_13 = null;
                var18_19 = 0;
                while (var18_19 < var12_12) {
                    var19_20 = 1;
                    var15_16 = 1.4E-45f;
                    var20_21 = (KeylineState)pp_0.a(var19_20, var7_7);
                    var21_22 = var8_8 - var18_19;
                    var22_23 = (KeylineState$Keyline)var1_1.getKeylines().get(var21_22);
                    var23_24 = var22_23.cutoff;
                    var24_25 = var10_10 + var23_24;
                    var13_13 = var1_1.getKeylines();
                    var9_9 = var13_13.size();
                    if ((var21_22 += var19_20) < var9_9) {
                        var13_13 = (KeylineState$Keyline)var1_1.getKeylines().get(var21_22);
                        var10_10 = var13_13.mask;
                        var21_22 = var9_9 = KeylineStateList.findLastIndexBeforeFirstFocalKeylineWithMask(var20_21, var10_10) + var19_20;
                    } else {
                        var21_22 = 0;
                    }
                    var25_26 = var1_1.getFirstFocalKeylineIndex() + var18_19 + 1;
                    var9_9 = var1_1.getLastFocalKeylineIndex() + var18_19;
                    var26_27 = var9_9 + 1;
                    var27_28 = var17_18 - var24_25;
                    var13_13 = var20_21;
                    var19_20 = var8_8;
                    var28_29 = var18_19;
                    var13_13 = KeylineStateList.moveKeylineAndCreateKeylineState(var20_21, var8_8, var21_22, var27_28, var25_26, var26_27, var11_11);
                    var19_20 = var12_12 + -1;
                    if (var18_19 == var19_20 && (var19_20 = (int)((cfr_temp_1 = var6_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                        var19_20 = 0;
                        var15_16 = 0.0f;
                        var14_15 = null;
                        var13_13 = KeylineStateList.shiftKeylineStateForPadding((KeylineState)var13_13, var6_6, var11_11, false, var5_5);
                    }
                    var7_7.add(var13_13);
                    var18_19 = var28_29 + 1;
                    var10_10 = var24_25;
                }
                return var7_7;
            }
        }
        if ((var9_9 = (int)((cfr_temp_2 = var6_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
            var9_9 = 0;
            var10_10 = 0.0f;
            var13_14 = null;
            var4_4 = KeylineStateList.shiftKeylineStateForPadding(var4_4, var6_6, var11_11, false, var5_5);
            var7_7.add(var4_4);
        }
        return var7_7;
    }

    private static float[] getStateStepsRange(List object, float f5, float[] fArray) {
        int n3 = 3;
        int n4 = object.size();
        float f6 = fArray[0];
        int n7 = 1;
        for (int i3 = 1; i3 < n4; i3 += n7) {
            float f7 = fArray[i3];
            float f8 = f5 - f7;
            Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object2 <= 0) {
                n4 = i3 + -1;
                f5 = AnimationUtils.lerp(0.0f, 1.0f, f6, f7, f5);
                float f11 = n4;
                float f12 = i3;
                float[] fArray2 = new float[n3];
                fArray2[0] = f5;
                fArray2[n7] = f11;
                fArray2[2] = f12;
                return fArray2;
            }
            f6 = f7;
        }
        Object object3 = object = (Object)new float[n3];
        object3[0] = 0.0f;
        object3[1] = 0.0f;
        object3[2] = 0.0f;
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static List getStateStepsStart(Carousel var0, KeylineState var1_1, float var2_2, float var3_3) {
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = var3_3;
        var7_7 = new ArrayList<Object>();
        var7_7.add(var1_1);
        var8_8 = KeylineStateList.findFirstNonAnchorKeylineIndex(var1_1);
        var9_9 /* !! */  = var0.isHorizontal();
        if (var9_9 /* !! */  != 0) {
            var9_9 /* !! */  = var0.getContainerWidth();
lbl11:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var9_9 /* !! */  = var0.getContainerHeight();
        ** while (true)
        var11_11 = var10_10 = (float)var9_9 /* !! */ ;
        var9_9 /* !! */  = (int)KeylineStateList.isFirstFocalItemAtLeftOfContainer(var1_1);
        var12_12 = 1;
        if (var9_9 /* !! */  == 0) {
            var9_9 /* !! */  = -1;
            var10_10 = 0.0f / 0.0f;
            if (var8_8 != var9_9 /* !! */ ) {
                var9_9 /* !! */  = var1_1.getFirstFocalKeylineIndex();
                var13_13 = var9_9 /* !! */  - var8_8;
                var14_14 = var1_1.getFirstKeyline();
                var10_10 = var14_14.locOffset;
                var15_15 = var1_1.getFirstKeyline();
                var16_16 = var15_15.maskedItemSize;
                var17_17 = 0x40000000;
                var18_18 = 2.0f;
                var19_19 = var10_10 - (var16_16 /= var18_18);
                if (var13_13 <= 0) {
                    var14_14 = var1_1.getFirstFocalKeyline();
                    var10_10 = var14_14.cutoff;
                    cfr_temp_0 = var10_10 - 0.0f;
                    var9_9 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var9_9 /* !! */  > 0) {
                        var5_5 = var1_1.getFirstFocalKeyline().cutoff;
                        var5_5 = var19_19 + var5_5;
                        var4_4 = KeylineStateList.shiftKeylinesAndCreateKeylineState(var4_4, var5_5, var11_11);
                        var7_7.add(var4_4);
                        return var7_7;
                    }
                }
                var9_9 /* !! */  = 0;
                var10_10 = 0.0f;
                var14_14 = null;
                var20_20 = 0;
                while (var20_20 < var13_13) {
                    var15_15 = (KeylineState)pp_0.a(var12_12, var7_7);
                    var17_17 = var8_8 + var20_20;
                    var21_21 = var1_1.getKeylines();
                    var22_22 = var21_21.size() - var12_12;
                    var23_23 = (KeylineState$Keyline)var1_1.getKeylines().get(var17_17);
                    var24_24 = var23_23.cutoff;
                    var25_25 = var10_10 + var24_24;
                    if ((var17_17 -= var12_12) >= 0) {
                        var14_14 = (KeylineState$Keyline)var1_1.getKeylines().get(var17_17);
                        var10_10 = var14_14.mask;
                        var17_17 = var9_9 /* !! */  = KeylineStateList.findFirstIndexAfterLastFocalKeylineWithMask((KeylineState)var15_15, var10_10) - var12_12;
                    } else {
                        var17_17 = var22_22;
                    }
                    var26_26 = var1_1.getFirstFocalKeylineIndex() - var20_20 + -1;
                    var9_9 /* !! */  = var1_1.getLastFocalKeylineIndex() - var20_20;
                    var27_27 = var9_9 /* !! */  + -1;
                    var28_28 = var19_19 + var25_25;
                    var14_14 = var15_15;
                    var29_29 = var8_8;
                    var12_12 = var20_20;
                    var14_14 = KeylineStateList.moveKeylineAndCreateKeylineState((KeylineState)var15_15, var8_8, var17_17, var28_28, var26_26, var27_27, var11_11);
                    var29_29 = var13_13 + -1;
                    if (var20_20 == var29_29 && (var29_29 = (int)((cfr_temp_1 = var6_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                        var29_29 = 1;
                        var16_16 = 1.4E-45f;
                        var14_14 = KeylineStateList.shiftKeylineStateForPadding((KeylineState)var14_14, var6_6, var11_11, (boolean)var29_29, var5_5);
                    }
                    var7_7.add(var14_14);
                    var20_20 = var12_12 + 1;
                    var10_10 = var25_25;
                    var12_12 = 1;
                }
                return var7_7;
            }
        }
        if ((var9_9 /* !! */  = (int)((cfr_temp_2 = var6_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
            var9_9 /* !! */  = 1;
            var10_10 = 1.4E-45f;
            var4_4 = KeylineStateList.shiftKeylineStateForPadding(var4_4, var6_6, var11_11, (boolean)var9_9 /* !! */ , var5_5);
            var7_7.add(var4_4);
        }
        return var7_7;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState object) {
        boolean bl2;
        KeylineState$Keyline keylineState$Keyline = ((KeylineState)object).getFirstFocalKeyline();
        float f5 = keylineState$Keyline.locOffset;
        float f6 = ((KeylineState)object).getFirstFocalKeyline().maskedItemSize;
        float f7 = 2.0f;
        f6 = 0.0f;
        float f8 = (f5 -= (f6 /= f7)) - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 >= 0 && (keylineState$Keyline = ((KeylineState)object).getFirstFocalKeyline()) == (object = ((KeylineState)object).getFirstNonAnchorKeyline())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel object, KeylineState object2) {
        int n3 = object.getContainerHeight();
        boolean bl2 = object.isHorizontal();
        if (bl2) {
            n3 = object.getContainerWidth();
        }
        object = ((KeylineState)object2).getLastFocalKeyline();
        float f5 = ((KeylineState$Keyline)object).locOffset;
        KeylineState$Keyline keylineState$Keyline = ((KeylineState)object2).getLastFocalKeyline();
        float f6 = keylineState$Keyline.maskedItemSize;
        float f7 = 2.0f;
        float f8 = (f6 = f6 / f7 + f5) - (f5 = (float)n3);
        Object object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object3 <= 0 && (object = ((KeylineState)object2).getLastFocalKeyline()) == (object2 = ((KeylineState)object2).getLastNonAnchorKeyline())) {
            object3 = true;
            f5 = Float.MIN_VALUE;
        } else {
            object3 = false;
            f5 = 0.0f;
            object = null;
        }
        return (boolean)object3;
    }

    private static KeylineState lerp(List object, float f5, float[] object2) {
        float[] fArray = KeylineStateList.getStateStepsRange((List)object, f5, object2);
        int n3 = (int)fArray[1];
        object2 = (KeylineState)object.get(n3);
        int n4 = (int)fArray[2];
        object = (KeylineState)object.get(n4);
        f5 = fArray[0];
        return KeylineState.lerp((KeylineState)object2, (KeylineState)object, f5);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int n3, int n4, float f5, int n7, int n8, float f6) {
        int n10;
        Object object = keylineState.getKeylines();
        ArrayList<KeylineState$Keyline> arrayList = new ArrayList<KeylineState$Keyline>((Collection<KeylineState$Keyline>)object);
        Object object2 = (KeylineState$Keyline)arrayList.remove(n3);
        arrayList.add(n4, (KeylineState$Keyline)object2);
        float f7 = keylineState.getItemSize();
        object2 = new KeylineState$Builder(f7, f6);
        f7 = 0.0f;
        keylineState = null;
        for (n4 = 0; n4 < (n10 = arrayList.size()); ++n4) {
            boolean bl2;
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)arrayList.get(n4);
            float f8 = keylineState$Keyline.maskedItemSize;
            float f11 = f8 / 2.0f;
            float f12 = f11 + f5;
            if (n4 >= n7 && n4 <= n8) {
                f11 = Float.MIN_VALUE;
                bl2 = true;
            } else {
                bl2 = false;
            }
            float f14 = keylineState$Keyline.mask;
            boolean bl3 = keylineState$Keyline.isAnchor;
            float f15 = keylineState$Keyline.cutoff;
            object = object2;
            ((KeylineState$Builder)object2).addKeyline(f12, f14, f8, bl2, bl3, f15);
            f6 = keylineState$Keyline.maskedItemSize;
            f5 += f6;
        }
        return ((KeylineState$Builder)object2).build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f5, float f6, boolean bl2, float f7) {
        Object object;
        Object object2 = keylineState.getKeylines();
        ArrayList arrayList = new ArrayList(object2);
        float f8 = keylineState.getItemSize();
        float f11 = f6;
        object2 = new KeylineState$Builder(f8, f6);
        int n3 = keylineState.getNumberOfNonAnchorKeylines();
        f8 = n3;
        float f12 = f5 / f8;
        if (bl2) {
            f8 = f5;
        } else {
            n3 = 0;
            f8 = 0.0f;
            object = null;
        }
        float f14 = f8;
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            boolean bl3;
            float f15;
            boolean bl4;
            float f16;
            float f17;
            object = (KeylineState$Keyline)arrayList.get(i3);
            int n4 = ((KeylineState$Keyline)object).isAnchor;
            if (n4 != 0) {
                f11 = ((KeylineState$Keyline)object).locOffset;
                f17 = ((KeylineState$Keyline)object).mask;
                f16 = ((KeylineState$Keyline)object).maskedItemSize;
                bl4 = true;
                f15 = ((KeylineState$Keyline)object).cutoff;
                bl3 = false;
                object = object2;
                ((KeylineState$Builder)object2).addKeyline(f11, f17, f16, false, bl4, f15);
                continue;
            }
            n4 = keylineState.getFirstFocalKeylineIndex();
            if (i3 >= n4 && i3 <= (n4 = keylineState.getLastFocalKeylineIndex())) {
                n4 = 1;
                f11 = Float.MIN_VALUE;
                bl3 = true;
            } else {
                bl3 = false;
            }
            float f18 = ((KeylineState$Keyline)object).maskedItemSize - f12;
            f11 = keylineState.getItemSize();
            float f19 = f7;
            f17 = CarouselStrategy.getChildMaskPercentage(f18, f11, f7);
            n4 = 0x40000000;
            f11 = f18 / 2.0f + f14;
            f16 = ((KeylineState$Keyline)object).locOffset;
            f16 = f11 - f16;
            f15 = ((KeylineState$Keyline)object).cutoff;
            float f20 = bl2 ? f16 : 0.0f;
            float f22 = bl2 ? 0.0f : f16;
            bl4 = false;
            object = object2;
            f16 = f18;
            f19 = f20;
            f20 = f18;
            f18 = f22;
            ((KeylineState$Builder)object2).addKeyline(f11, f17, f16, bl3, false, f15, f19, f22);
            f14 += f16;
        }
        return ((KeylineState$Builder)object2).build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f5, float f6) {
        int n3 = keylineState.getFirstFocalKeylineIndex();
        int n4 = keylineState.getLastFocalKeylineIndex();
        return KeylineStateList.moveKeylineAndCreateKeylineState(keylineState, 0, 0, f5, n3, n4, f6);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        List list = this.endStateSteps;
        return (KeylineState)on_2.d(1, list);
    }

    public Map getKeylineStateForPositionMap(int n3, int n4, int n7, boolean bl2) {
        int n8;
        Object object;
        float f5;
        float f6;
        int n10;
        int n14;
        KeylineState keylineState = this.defaultState;
        float f7 = keylineState.getItemSize();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        int n15 = 0;
        int n16 = 0;
        Integer n17 = null;
        while (true) {
            block9: {
                Object object2;
                block8: {
                    int n18 = -1;
                    float f8 = 0.0f / 0.0f;
                    n14 = 1;
                    if (n15 >= n3) break;
                    n10 = bl2 ? n3 - n15 - n14 : n15;
                    f6 = (float)n10 * f7;
                    if (!bl2) {
                        n18 = 1;
                        f8 = Float.MIN_VALUE;
                    }
                    f8 = n18;
                    f6 *= f8;
                    f8 = n7;
                    f5 = this.endShiftRange;
                    float f11 = f6 - (f8 -= f5);
                    n18 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n18 > 0) break block8;
                    object2 = this.endStateSteps;
                    n18 = object2.size();
                    if (n15 < (n18 = n3 - n18)) break block9;
                }
                object2 = n10;
                object = this.endStateSteps;
                n8 = object.size() - n14;
                n14 = PK1.b(n16, 0, n8);
                KeylineState keylineState2 = (KeylineState)object.get(n14);
                hashMap.put(object2, keylineState2);
                ++n16;
            }
            ++n15;
        }
        n15 = 0;
        for (n7 = n3 + -1; n7 >= 0; n7 += -1) {
            n16 = bl2 ? n3 - n7 - n14 : n7;
            float f12 = (float)n16 * f7;
            if (bl2) {
                n8 = -1;
                f6 = 0.0f / 0.0f;
            } else {
                n8 = 1;
                f6 = Float.MIN_VALUE;
            }
            f6 = n8;
            f12 *= f6;
            f6 = n4;
            f5 = this.startShiftRange;
            float f14 = f12 - (f6 += f5);
            n10 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
            if (n10 >= 0 && n7 >= (n10 = (object = this.startStateSteps).size())) continue;
            n17 = n16;
            object = this.startStateSteps;
            n8 = object.size() - n14;
            n8 = PK1.b(n15, 0, n8);
            object = (KeylineState)object.get(n8);
            hashMap.put(n17, object);
            ++n15;
        }
        return hashMap;
    }

    public KeylineState getShiftedState(float f5, float f6, float f7) {
        return this.getShiftedState(f5, f6, f7, false);
    }

    public KeylineState getShiftedState(float f5, float f6, float f7, boolean bl2) {
        block8: {
            float[] fArray;
            List list;
            block7: {
                float f8;
                float f11;
                block6: {
                    float f12;
                    float f14;
                    float f15 = this.startShiftRange + f6;
                    f11 = this.endShiftRange;
                    f11 = f7 - f11;
                    KeylineState$Keyline keylineState$Keyline = this.getStartState().getFirstFocalKeyline();
                    float f16 = keylineState$Keyline.leftOrTopPaddingShift;
                    KeylineState$Keyline keylineState$Keyline2 = this.getEndState().getLastFocalKeyline();
                    f8 = keylineState$Keyline2.rightOrBottomPaddingShift;
                    float f17 = this.startShiftRange;
                    float f18 = f17 - f16;
                    Object object = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    if (object == false) {
                        f15 += f16;
                    }
                    if ((f14 = (f12 = (f16 = this.endShiftRange) - f8) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) == false) {
                        f11 -= f8;
                    }
                    f14 = 0.0f;
                    f16 = 0.0f;
                    keylineState$Keyline = null;
                    f8 = 1.0f;
                    object = f5 == f15 ? 0 : (f5 < f15 ? -1 : 1);
                    if (object >= 0) break block6;
                    f5 = AnimationUtils.lerp(f8, 0.0f, f6, f15, f5);
                    list = this.startStateSteps;
                    fArray = this.startStateStepsInterpolationPoints;
                    break block7;
                }
                Object object = f5 == f11 ? 0 : (f5 > f11 ? 1 : -1);
                if (object <= 0) break block8;
                f5 = AnimationUtils.lerp(0.0f, f8, f11, f7, f5);
                list = this.endStateSteps;
                fArray = this.endStateStepsInterpolationPoints;
            }
            if (bl2) {
                return this.closestStateStepFromInterpolation(list, f5, fArray);
            }
            return KeylineStateList.lerp(list, f5, fArray);
        }
        return this.defaultState;
    }

    public KeylineState getStartState() {
        List list = this.startStateSteps;
        return (KeylineState)on_2.d(1, list);
    }
}

