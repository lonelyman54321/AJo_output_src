/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.CompoundButton
 */
package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.flexbox.FlexContainer;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxHelper$FlexLinesResult;
import com.google.android.flexbox.FlexboxHelper$Order;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 0xFFFFFFFFL;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    private void addFlexLine(List list, FlexLine flexLine, int n3, int n4) {
        flexLine.mSumCrossSizeBefore = n4;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = n3;
        list.add(flexLine);
    }

    /*
     * Unable to fully structure code
     */
    private void checkSizeConstraints(View var1_1, int var2_2) {
        var3_3 = (FlexItem)var1_1.getLayoutParams();
        var4_4 = var1_1.getMeasuredWidth();
        var5_5 = var1_1.getMeasuredHeight();
        var6_6 = var3_3.getMinWidth();
        var7_7 = 1;
        if (var4_4 < var6_6) {
            var4_4 = var3_3.getMinWidth();
lbl8:
            // 2 sources

            while (true) {
                var6_6 = 1;
                break;
            }
        } else {
            var6_6 = var3_3.getMaxWidth();
            if (var4_4 > var6_6) {
                var4_4 = var3_3.getMaxWidth();
                ** continue;
            }
            var6_6 = 0;
        }
        var8_8 = var3_3.getMinHeight();
        if (var5_5 < var8_8) {
            var5_5 = var3_3.getMinHeight();
        } else {
            var8_8 = var3_3.getMaxHeight();
            if (var5_5 > var8_8) {
                var5_5 = var3_3.getMaxHeight();
            } else {
                var7_7 = var6_6;
            }
        }
        if (var7_7 != 0) {
            var9_9 = 0x40000000;
            var4_4 = View.MeasureSpec.makeMeasureSpec((int)var4_4, (int)var9_9);
            var9_9 = View.MeasureSpec.makeMeasureSpec((int)var5_5, (int)var9_9);
            var1_1.measure(var4_4, var9_9);
            this.updateMeasureCache(var2_2, var4_4, var9_9, var1_1);
            var3_3 = this.mFlexContainer;
            var3_3.updateViewCache(var2_2, var1_1);
        }
    }

    private List constructFlexLinesForAlignContentCenter(List list, int n3, int n4) {
        n3 = (n3 - n4) / 2;
        ArrayList<FlexLine> arrayList = new ArrayList<FlexLine>();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = n3;
        n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 == 0) {
                arrayList.add(flexLine);
            }
            FlexLine flexLine2 = (FlexLine)list.get(i3);
            arrayList.add(flexLine2);
            int n7 = list.size() + -1;
            if (i3 != n7) continue;
            arrayList.add(flexLine);
        }
        return arrayList;
    }

    private List createOrders(int n3) {
        ArrayList<FlexboxHelper$Order> arrayList = new ArrayList<FlexboxHelper$Order>(n3);
        int n4 = 0;
        while (n4 < n3) {
            int n7;
            FlexItem flexItem = (FlexItem)this.mFlexContainer.getFlexItemAt(n4).getLayoutParams();
            FlexboxHelper$Order flexboxHelper$Order = new FlexboxHelper$Order(null);
            flexboxHelper$Order.order = n7 = flexItem.getOrder();
            flexboxHelper$Order.index = n4++;
            arrayList.add(flexboxHelper$Order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int n3) {
        boolean[] blArray = this.mChildrenFrozen;
        if (blArray == null) {
            int n4 = 10;
            n3 = Math.max(n3, n4);
            boolean[] blArray2 = new boolean[n3];
            this.mChildrenFrozen = blArray2;
        } else {
            int n7 = blArray.length;
            if (n7 < n3) {
                int n8 = blArray.length * 2;
                n3 = Math.max(n8, n3);
                boolean[] blArray3 = new boolean[n3];
                this.mChildrenFrozen = blArray3;
            } else {
                n3 = 0;
                Object var4_7 = null;
                Arrays.fill(blArray, false);
            }
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem)compoundButton.getLayoutParams();
        int n3 = flexItem.getMinWidth();
        int n4 = flexItem.getMinHeight();
        compoundButton = R30.a(compoundButton);
        int n7 = 0;
        int n8 = compoundButton == null ? 0 : compoundButton.getMinimumWidth();
        if (compoundButton != null) {
            n7 = compoundButton.getMinimumHeight();
        }
        int n10 = -1;
        if (n3 == n10) {
            n3 = n8;
        }
        flexItem.setMinWidth(n3);
        if (n4 == n10) {
            n4 = n7;
        }
        flexItem.setMinHeight(n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void expandFlexItems(int var1_1, int var2_2, FlexLine var3_3, int var4_4, int var5_5, boolean var6_6) {
        block26: {
            var7_7 = this;
            var8_8 = var3_3;
            var9_9 = var3_3.mTotalFlexGrow;
            var10_10 = 0;
            var11_11 = 0.0f;
            var12_12 = null;
            cfr_temp_0 = var9_9 - 0.0f;
            var13_13 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var13_13 /* !! */  <= 0 || var4_4 < (var13_13 /* !! */  = (float)var3_3.mMainSize)) break block26;
            var14_14 = var4_4 - var13_13 /* !! */ ;
            var15_15 = (float)var14_14 / var9_9;
            var16_16 = var3_3.mDividerLengthInMainSize;
            var3_3.mMainSize = var16_16 = var5_5 + var16_16;
            if (!var6_6) {
                var16_16 = -1 << -1;
                var9_9 = -0.0f;
                var3_3.mCrossSize = var16_16;
            }
            var9_9 = 0.0f;
            var17_17 = false;
            var18_18 = 0.0f;
            var19_19 = 0;
            var20_20 /* !! */  = 0;
            var21_21 = 0.0f;
            for (var16_16 = 0; var16_16 < (var22_22 = var8_8.mItemCount); ++var16_16) {
                block29: {
                    block31: {
                        block30: {
                            block28: {
                                block27: {
                                    var22_22 = var8_8.mFirstIndex + var16_16;
                                    var23_23 = var7_7.mFlexContainer.getReorderedFlexItemAt(var22_22);
                                    if (var23_23 == null) break block27;
                                    var24_24 = var23_23.getVisibility();
                                    var25_25 = 8;
                                    var26_26 = 1.1E-44f;
                                    if (var24_24 != var25_25) break block28;
                                }
                                var25_25 = var2_2;
                                var27_27 = var13_13 /* !! */ ;
                                break block29;
                            }
                            var28_28 = (FlexItem)var23_23.getLayoutParams();
                            var29_29 = var7_7.mFlexContainer;
                            var25_25 = var29_29.getFlexDirection();
                            var30_30 = 1.0;
                            var32_31 = 1;
                            var33_32 = 1.4E-45f;
                            if (var25_25 == 0 || var25_25 == var32_31) break block30;
                            var25_25 = var23_23.getMeasuredHeight();
                            var35_34 /* !! */  = var7_7.mMeasuredSizeCache;
                            if (var35_34 /* !! */  != null) {
                                var36_35 /* !! */  = var35_34 /* !! */ [var22_22];
                                var25_25 = var7_7.extractHigherInt(var36_35 /* !! */ );
                            }
                            var32_31 = var23_23.getMeasuredWidth();
                            var35_34 /* !! */  = var7_7.mMeasuredSizeCache;
                            if (var35_34 /* !! */  != null) {
                                var36_35 /* !! */  = var35_34 /* !! */ [var22_22];
                                var32_31 = var7_7.extractLowerInt(var36_35 /* !! */ );
                            }
                            if ((var34_33 = (float)(var35_34 /* !! */  = (long[])var7_7.mChildrenFrozen)[var22_22]) == false && (var34_33 = (cfr_temp_1 = (var38_36 = var28_28.getFlexGrow()) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) > 0) {
                                var26_26 = var25_25;
                                var33_32 = var28_28.getFlexGrow() * var15_15 + var26_26;
                                var25_25 = var8_8.mItemCount;
                                var34_33 = (float)true;
                                var38_36 = 1.4E-45f;
                                if (var16_16 == (var25_25 -= var34_33)) {
                                    var33_32 += var21_21;
                                    var20_20 /* !! */  = 0;
                                    var21_21 = 0.0f;
                                }
                                if ((var25_25 = Math.round(var33_32)) > (var10_10 = var28_28.getMaxHeight())) {
                                    var25_25 = var28_28.getMaxHeight();
                                    var12_12 = var7_7.mChildrenFrozen;
                                    var12_12[var22_22] = var34_33;
                                    var11_11 = var8_8.mTotalFlexGrow;
                                    var18_18 = var28_28.getFlexGrow();
                                    var8_8.mTotalFlexGrow = var11_11 -= var18_18;
                                    var34_33 = var13_13 /* !! */ ;
                                    var17_17 = true;
                                    var18_18 = 1.4E-45f;
                                } else {
                                    var11_11 = var25_25;
                                    var33_32 = var33_32 - var11_11 + var21_21;
                                    var34_33 = var13_13 /* !! */ ;
                                    var39_37 = var33_32;
                                    cfr_temp_2 = var39_37 - var30_30;
                                    var20_20 /* !! */  = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                    if (var20_20 /* !! */  > 0) {
                                        ++var25_25;
                                        var39_37 -= var30_30;
lbl84:
                                        // 2 sources

                                        while (true) {
                                            var21_21 = var11_11 = (float)var39_37;
                                            break;
                                        }
                                    } else {
                                        var41_38 = -1.0;
                                        cfr_temp_3 = var39_37 - var41_38;
                                        var20_20 /* !! */  = (int)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                                        if (var20_20 /* !! */  < 0) {
                                            var25_25 += -1;
                                            var39_37 += var30_30;
                                            ** continue;
                                        }
                                        var21_21 = var33_32;
                                    }
                                }
                                var10_10 = var8_8.mSumCrossSizeBefore;
                                var13_13 /* !! */  = var1_1;
                                var10_10 = var7_7.getChildWidthMeasureSpecInternal(var1_1, var28_28, var10_10);
                                var33_32 = 2.0f;
                                var25_25 = View.MeasureSpec.makeMeasureSpec((int)var25_25, (int)0x40000000);
                                var23_23.measure(var10_10, var25_25);
                                var32_31 = var23_23.getMeasuredWidth();
                                var43_39 = var23_23.getMeasuredHeight();
                                var7_7.updateMeasureCache(var22_22, var10_10, var25_25, var23_23);
                                var12_12 = var7_7.mFlexContainer;
                                var12_12.updateViewCache(var22_22, var23_23);
                                var25_25 = var43_39;
                            } else {
                                var34_33 = var13_13 /* !! */ ;
                                var13_13 /* !! */  = var1_1;
                            }
                            var10_10 = var28_28.getMarginLeft();
                            var32_31 += var10_10;
                            var10_10 = var28_28.getMarginRight();
                            var32_31 += var10_10;
                            var12_12 = var7_7.mFlexContainer;
                            var10_10 = var12_12.getDecorationLengthCrossAxis(var23_23);
                            var32_31 += var10_10;
                            var10_10 = Math.max(var19_19, var32_31);
                            var19_19 = var8_8.mMainSize;
                            var22_22 = var28_28.getMarginTop();
                            var25_25 += var22_22;
                            var22_22 = var28_28.getMarginBottom();
                            var8_8.mMainSize = var25_25 = var25_25 + var22_22 + var19_19;
                            var25_25 = var2_2;
                            var27_27 = var34_33;
                            break block31;
                        }
                        var34_33 = var13_13 /* !! */ ;
                        var13_13 /* !! */  = var1_1;
                        var10_10 = var23_23.getMeasuredWidth();
                        var29_29 = var7_7.mMeasuredSizeCache;
                        if (var29_29 != null) {
                            var44_40 = var29_29[var22_22];
                            var10_10 = var7_7.extractLowerInt((long)var44_40);
                        }
                        var13_13 /* !! */  = var23_23.getMeasuredHeight();
                        var29_29 = var7_7.mMeasuredSizeCache;
                        var27_27 = var34_33;
                        if (var29_29 != null) {
                            var36_35 /* !! */  = (long)var29_29[var22_22];
                            var13_13 /* !! */  = var7_7.extractHigherInt(var36_35 /* !! */ );
                        }
                        if ((var25_25 = (int)(var29_29 = (Object)var7_7.mChildrenFrozen)[var22_22]) != 0) ** GOTO lbl-1000
                        var26_26 = var28_28.getFlexGrow();
                        var32_31 = 0;
                        var33_32 = 0.0f;
                        cfr_temp_4 = var26_26 - 0.0f;
                        var25_25 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                        if (var25_25 > 0) {
                            var11_11 = var10_10;
                            var46_41 = var28_28.getFlexGrow() * var15_15 + var11_11;
                            var10_10 = var8_8.mItemCount;
                            var25_25 = 1;
                            var26_26 = 1.4E-45f;
                            if (var16_16 == (var10_10 -= var25_25)) {
                                var46_41 += var21_21;
                                var20_20 /* !! */  = 0;
                                var21_21 = 0.0f;
                            }
                            if ((var10_10 = Math.round(var46_41)) > (var34_33 = (float)var28_28.getMaxWidth())) {
                                var10_10 = var28_28.getMaxWidth();
                                var47_42 = var7_7.mChildrenFrozen;
                                var47_42[var22_22] = var25_25;
                                var46_41 = var8_8.mTotalFlexGrow;
                                var18_18 = var28_28.getFlexGrow();
                                var8_8.mTotalFlexGrow = var46_41 -= var18_18;
                                var17_17 = true;
                                var18_18 = 1.4E-45f;
                            } else {
                                var26_26 = var10_10;
                                var48_43 = var46_41 = var46_41 - var26_26 + var21_21;
                                cfr_temp_5 = var48_43 - var30_30;
                                var20_20 /* !! */  = (int)(cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1));
                                if (var20_20 /* !! */  > 0) {
                                    ++var10_10;
                                    var48_43 -= var30_30;
lbl173:
                                    // 2 sources

                                    while (true) {
                                        var46_41 = (float)var48_43;
                                        while (true) {
                                            var21_21 = var46_41;
                                            ** GOTO lbl182
                                            break;
                                        }
                                        break;
                                    }
                                } else {
                                    if ((var20_20 /* !! */  = (int)((cfr_temp_6 = var48_43 - (var41_38 = -1.0)) == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1))) >= 0) ** continue;
                                    var10_10 += -1;
                                    var48_43 += var30_30;
                                    ** continue;
                                }
                            }
lbl182:
                            // 2 sources

                            var13_13 /* !! */  = var8_8.mSumCrossSizeBefore;
                            var25_25 = var2_2;
                            var13_13 /* !! */  = var7_7.getChildHeightMeasureSpecInternal(var2_2, var28_28, (int)var13_13 /* !! */ );
                            var33_32 = 2.0f;
                            var10_10 = View.MeasureSpec.makeMeasureSpec((int)var10_10, (int)0x40000000);
                            var23_23.measure(var10_10, (int)var13_13 /* !! */ );
                            var32_31 = var23_23.getMeasuredWidth();
                            var34_33 = var23_23.getMeasuredHeight();
                            var7_7.updateMeasureCache(var22_22, var10_10, (int)var13_13 /* !! */ , var23_23);
                            var12_12 = var7_7.mFlexContainer;
                            var12_12.updateViewCache(var22_22, var23_23);
                            var10_10 = var32_31;
                            var13_13 /* !! */  = var34_33;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var25_25 = var2_2;
                        }
                        var22_22 = var28_28.getMarginTop();
                        var13_13 /* !! */  += var22_22;
                        var22_22 = var28_28.getMarginBottom();
                        var13_13 /* !! */  += var22_22;
                        var50_44 = var7_7.mFlexContainer;
                        var22_22 = var50_44.getDecorationLengthCrossAxis(var23_23);
                        var13_13 /* !! */  += var22_22;
                        var13_13 /* !! */  = Math.max(var19_19, (int)var13_13 /* !! */ );
                        var19_19 = var8_8.mMainSize;
                        var22_22 = var28_28.getMarginLeft();
                        var10_10 += var22_22;
                        var22_22 = var28_28.getMarginRight();
                        var8_8.mMainSize = var10_10 = var10_10 + var22_22 + var19_19;
                        var10_10 = (int)var13_13 /* !! */ ;
                    }
                    var13_13 /* !! */  = Math.max(var8_8.mCrossSize, var10_10);
                    var8_8.mCrossSize = (int)var13_13 /* !! */ ;
                    var19_19 = var10_10;
                }
                var13_13 /* !! */  = var27_27;
                var10_10 = 0;
                var11_11 = 0.0f;
                var12_12 = null;
            }
            var25_25 = var2_2;
            var27_27 = var13_13 /* !! */ ;
            if (var17_17) {
                var16_16 = var8_8.mMainSize;
                var10_10 = var13_13 /* !! */ ;
                if (var13_13 /* !! */  != var16_16) {
                    var17_17 = true;
                    var18_18 = 1.4E-45f;
                    var10_10 = var1_1;
                    var13_13 /* !! */  = var2_2;
                    var8_8 = var3_3;
                    var14_14 = var5_5;
                    this.expandFlexItems(var1_1, var2_2, var3_3, var4_4, var5_5, var17_17);
                }
            }
        }
    }

    private int getChildHeightMeasureSpecInternal(int n3, FlexItem flexItem, int n4) {
        int n7;
        FlexContainer flexContainer = this.mFlexContainer;
        int n8 = flexContainer.getPaddingTop();
        FlexContainer flexContainer2 = this.mFlexContainer;
        int n10 = flexContainer2.getPaddingBottom();
        n8 += n10;
        n10 = flexItem.getMarginTop();
        n8 += n10;
        n10 = flexItem.getMarginBottom();
        n8 = n8 + n10 + n4;
        n4 = flexItem.getHeight();
        if ((n4 = View.MeasureSpec.getSize((int)(n3 = flexContainer.getChildHeightMeasureSpec(n3, n8, n4)))) > (n7 = flexItem.getMaxHeight())) {
            int n14 = flexItem.getMaxHeight();
            n3 = View.MeasureSpec.getMode((int)n3);
            n3 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)n3);
        } else {
            n7 = flexItem.getMinHeight();
            if (n4 < n7) {
                int n15 = flexItem.getMinHeight();
                n3 = View.MeasureSpec.getMode((int)n3);
                n3 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)n3);
            }
        }
        return n3;
    }

    private int getChildWidthMeasureSpecInternal(int n3, FlexItem flexItem, int n4) {
        int n7;
        FlexContainer flexContainer = this.mFlexContainer;
        int n8 = flexContainer.getPaddingLeft();
        FlexContainer flexContainer2 = this.mFlexContainer;
        int n10 = flexContainer2.getPaddingRight();
        n8 += n10;
        n10 = flexItem.getMarginLeft();
        n8 += n10;
        n10 = flexItem.getMarginRight();
        n8 = n8 + n10 + n4;
        n4 = flexItem.getWidth();
        if ((n4 = View.MeasureSpec.getSize((int)(n3 = flexContainer.getChildWidthMeasureSpec(n3, n8, n4)))) > (n7 = flexItem.getMaxWidth())) {
            int n14 = flexItem.getMaxWidth();
            n3 = View.MeasureSpec.getMode((int)n3);
            n3 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)n3);
        } else {
            n7 = flexItem.getMinWidth();
            if (n4 < n7) {
                int n15 = flexItem.getMinWidth();
                n3 = View.MeasureSpec.getMode((int)n3);
                n3 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)n3);
            }
        }
        return n3;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getMarginBottom();
        }
        return flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getMarginRight();
        }
        return flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getMarginTop();
        }
        return flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getMarginLeft();
        }
        return flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean bl2) {
        if (bl2) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean bl2) {
        if (bl2) {
            return this.mFlexContainer.getPaddingBottom();
        }
        return this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean bl2) {
        if (bl2) {
            return this.mFlexContainer.getPaddingEnd();
        }
        return this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean bl2) {
        if (bl2) {
            return this.mFlexContainer.getPaddingTop();
        }
        return this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean bl2) {
        if (bl2) {
            return this.mFlexContainer.getPaddingStart();
        }
        return this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view, boolean bl2) {
        if (bl2) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view, boolean bl2) {
        if (bl2) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int n3, int n4, FlexLine flexLine) {
        int n7 = 1;
        if (n3 != (n4 -= n7) || (n3 = flexLine.getItemCountNotGone()) == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    private boolean isWrapRequired(View view, int n3, int n4, int n7, int n8, FlexItem flexItem, int n10, int n14, int n15) {
        FlexContainer flexContainer = this.mFlexContainer;
        int n16 = flexContainer.getFlexWrap();
        boolean bl2 = false;
        if (n16 == 0) {
            return false;
        }
        int n17 = flexItem.isWrapBefore();
        n16 = 1;
        if (n17 != 0) {
            return n16 != 0;
        }
        if (n3 == 0) {
            return false;
        }
        FlexContainer flexContainer2 = this.mFlexContainer;
        n3 = flexContainer2.getMaxLine();
        if (n3 != (n17 = -1) && n3 <= (n15 += n16)) {
            return false;
        }
        flexContainer2 = this.mFlexContainer;
        int n18 = flexContainer2.getDecorationLengthMainAxis(view, n10, n14);
        if (n18 > 0) {
            n8 += n18;
        }
        if (n4 < (n7 += n8)) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void shrinkFlexItems(int var1_1, int var2_2, FlexLine var3_3, int var4_4, int var5_5, boolean var6_6) {
        block15: {
            var7_7 = this;
            var8_8 = var3_3;
            var9_9 = var3_3.mMainSize;
            var10_10 = var3_3.mTotalFlexShrink;
            var11_11 = 0;
            var12_12 = 0.0f;
            var13_13 = null;
            cfr_temp_0 = var10_10 - 0.0f;
            var14_14 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var14_14 /* !! */  <= 0 || var4_4 > var9_9) break block15;
            var14_14 /* !! */  = var9_9 - var4_4;
            var15_15 = (float)var14_14 /* !! */  / var10_10;
            var16_16 = var3_3.mDividerLengthInMainSize;
            var3_3.mMainSize = var16_16 = var5_5 + var16_16;
            if (!var6_6) {
                var16_16 = -1 << -1;
                var10_10 = -0.0f;
                var3_3.mCrossSize = var16_16;
            }
            var16_16 = 0;
            var10_10 = 0.0f;
            var17_17 = false;
            var18_18 = 0.0f;
            var19_19 = 0;
            var20_20 /* !! */  = 0;
            var21_21 = 0.0f;
            while (var16_16 < (var22_22 = var8_8.mItemCount)) {
                block18: {
                    block23: {
                        block26: {
                            block24: {
                                block14: {
                                    block25: {
                                        block19: {
                                            block22: {
                                                block20: {
                                                    block13: {
                                                        block21: {
                                                            block17: {
                                                                block16: {
                                                                    var22_22 = var8_8.mFirstIndex + var16_16;
                                                                    var23_23 = var7_7.mFlexContainer.getReorderedFlexItemAt(var22_22);
                                                                    if (var23_23 == null) break block16;
                                                                    var24_24 = var23_23.getVisibility();
                                                                    var25_25 /* !! */  = 8;
                                                                    var26_26 = 1.1E-44f;
                                                                    if (var24_24 != var25_25 /* !! */ ) break block17;
                                                                }
                                                                var25_25 /* !! */  = var2_2;
                                                                var11_11 = var9_9;
                                                                var27_27 = var16_16;
                                                                break block18;
                                                            }
                                                            var28_28 = (FlexItem)var23_23.getLayoutParams();
                                                            var29_29 = var7_7.mFlexContainer;
                                                            var25_25 /* !! */  = var29_29.getFlexDirection();
                                                            var30_30 = 1.0;
                                                            var32_31 = 1.0f;
                                                            var33_32 = 1;
                                                            var34_33 = 1.4E-45f;
                                                            if (var25_25 /* !! */  == 0 || var25_25 /* !! */  == var33_32) break block19;
                                                            var25_25 /* !! */  = var23_23.getMeasuredHeight();
                                                            var35_34 /* !! */  = var7_7.mMeasuredSizeCache;
                                                            if (var35_34 /* !! */  != null) {
                                                                var36_35 /* !! */  = var35_34 /* !! */ [var22_22];
                                                                var25_25 /* !! */  = var7_7.extractHigherInt(var36_35 /* !! */ );
                                                            }
                                                            var33_32 = var23_23.getMeasuredWidth();
                                                            var35_34 /* !! */  = var7_7.mMeasuredSizeCache;
                                                            if (var35_34 /* !! */  != null) {
                                                                var36_35 /* !! */  = var35_34 /* !! */ [var22_22];
                                                                var33_32 = var7_7.extractLowerInt(var36_35 /* !! */ );
                                                            }
                                                            if ((var27_27 = (int)(var35_34 /* !! */  = (long[])var7_7.mChildrenFrozen)[var22_22]) != 0 || (var27_27 = (int)((cfr_temp_1 = (var38_36 = var28_28.getFlexShrink()) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) <= 0) break block20;
                                                            var26_26 = var25_25 /* !! */ ;
                                                            var34_33 = var28_28.getFlexShrink() * var15_15;
                                                            var26_26 -= var34_33;
                                                            var33_32 = var8_8.mItemCount;
                                                            var27_27 = 1;
                                                            var38_36 = 1.4E-45f;
                                                            if (var16_16 == (var33_32 -= var27_27)) {
                                                                var26_26 += var21_21;
                                                                var20_20 /* !! */  = 0;
                                                                var21_21 = 0.0f;
                                                            }
                                                            if ((var33_32 = Math.round(var26_26)) >= (var11_11 = var28_28.getMinHeight())) break block21;
                                                            var33_32 = var28_28.getMinHeight();
                                                            var13_13 = var7_7.mChildrenFrozen;
                                                            var13_13[var22_22] = var27_27;
                                                            var12_12 = var8_8.mTotalFlexShrink;
                                                            var18_18 = var28_28.getFlexShrink();
                                                            var8_8.mTotalFlexShrink = var12_12 -= var18_18;
                                                            var11_11 = var9_9;
                                                            var27_27 = var16_16;
                                                            var17_17 = true;
                                                            var18_18 = 1.4E-45f;
                                                            break block13;
                                                        }
                                                        var12_12 = var33_32;
                                                        var26_26 = var26_26 - var12_12 + var21_21;
                                                        var11_11 = var9_9;
                                                        var27_27 = var16_16;
                                                        var39_37 = var26_26;
                                                        cfr_temp_2 = var39_37 - var30_30;
                                                        var20_20 /* !! */  = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                                        if (var20_20 /* !! */  > 0) {
                                                            ++var33_32;
                                                            var26_26 -= var32_31;
lbl92:
                                                            // 3 sources

                                                            while (true) {
                                                                var21_21 = var26_26;
                                                                break block13;
                                                                break;
                                                            }
                                                        }
                                                        var41_38 = -1.0;
                                                        cfr_temp_3 = var39_37 - var41_38;
                                                        var20_20 /* !! */  = (int)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1));
                                                        if (var20_20 /* !! */  >= 0) ** GOTO lbl92
                                                        var33_32 += -1;
                                                        var26_26 += var32_31;
                                                        ** continue;
                                                    }
                                                    var9_9 = var8_8.mSumCrossSizeBefore;
                                                    var16_16 = var1_1;
                                                    var9_9 = var7_7.getChildWidthMeasureSpecInternal(var1_1, var28_28, var9_9);
                                                    var26_26 = 2.0f;
                                                    var25_25 /* !! */  = View.MeasureSpec.makeMeasureSpec((int)var33_32, (int)0x40000000);
                                                    var23_23.measure(var9_9, var25_25 /* !! */ );
                                                    var33_32 = var23_23.getMeasuredWidth();
                                                    var43_39 = var23_23.getMeasuredHeight();
                                                    var7_7.updateMeasureCache(var22_22, var9_9, var25_25 /* !! */ , var23_23);
                                                    var44_40 = var7_7.mFlexContainer;
                                                    var44_40.updateViewCache(var22_22, var23_23);
                                                    var25_25 /* !! */  = var43_39;
                                                    break block22;
                                                }
                                                var11_11 = var9_9;
                                                var27_27 = var16_16;
                                                var16_16 = var1_1;
                                            }
                                            var9_9 = var28_28.getMarginLeft();
                                            var33_32 += var9_9;
                                            var9_9 = var28_28.getMarginRight();
                                            var33_32 += var9_9;
                                            var44_40 = var7_7.mFlexContainer;
                                            var9_9 = var44_40.getDecorationLengthCrossAxis(var23_23);
                                            var33_32 += var9_9;
                                            var9_9 = Math.max(var19_19, var33_32);
                                            var19_19 = var8_8.mMainSize;
                                            var22_22 = var28_28.getMarginTop();
                                            var25_25 /* !! */  += var22_22;
                                            var22_22 = var28_28.getMarginBottom();
                                            var8_8.mMainSize = var25_25 /* !! */  = var25_25 /* !! */  + var22_22 + var19_19;
                                            var25_25 /* !! */  = var2_2;
                                            break block23;
                                        }
                                        var11_11 = var9_9;
                                        var27_27 = var16_16;
                                        var16_16 = var1_1;
                                        var9_9 = var23_23.getMeasuredWidth();
                                        var29_29 = var7_7.mMeasuredSizeCache;
                                        if (var29_29 != null) {
                                            var45_41 = var29_29[var22_22];
                                            var9_9 = var7_7.extractLowerInt((long)var45_41);
                                        }
                                        var16_16 = var23_23.getMeasuredHeight();
                                        var29_29 = var7_7.mMeasuredSizeCache;
                                        var47_42 = var27_27;
                                        if (var29_29 != null) {
                                            var36_35 /* !! */  = (long)var29_29[var22_22];
                                            var16_16 = var7_7.extractHigherInt(var36_35 /* !! */ );
                                        }
                                        if ((var25_25 /* !! */  = (int)(var29_29 = (Object)var7_7.mChildrenFrozen)[var22_22]) != 0) break block24;
                                        var26_26 = var28_28.getFlexShrink();
                                        var33_32 = 0;
                                        var34_33 = 0.0f;
                                        cfr_temp_4 = var26_26 - 0.0f;
                                        var25_25 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                                        if (var25_25 /* !! */  <= 0) break block24;
                                        var48_43 = var9_9;
                                        var10_10 = var28_28.getFlexShrink() * var15_15;
                                        var48_43 -= var10_10;
                                        var16_16 = var8_8.mItemCount;
                                        var25_25 /* !! */  = 1;
                                        var26_26 = 1.4E-45f;
                                        var27_27 = var47_42;
                                        if (var47_42 == (var16_16 -= var25_25 /* !! */ )) {
                                            var48_43 += var21_21;
                                            var20_20 /* !! */  = 0;
                                            var21_21 = 0.0f;
                                        }
                                        if ((var16_16 = Math.round(var48_43)) >= (var33_32 = var28_28.getMinWidth())) break block25;
                                        var16_16 = var28_28.getMinWidth();
                                        var44_40 = var7_7.mChildrenFrozen;
                                        var44_40[var22_22] = var25_25 /* !! */ ;
                                        var48_43 = var8_8.mTotalFlexShrink;
                                        var18_18 = var28_28.getFlexShrink();
                                        var8_8.mTotalFlexShrink = var48_43 -= var18_18;
                                        var17_17 = true;
                                        var18_18 = 1.4E-45f;
                                        break block14;
                                    }
                                    var26_26 = var16_16;
                                    var49_44 = var48_43 = var48_43 - var26_26 + var21_21;
                                    cfr_temp_5 = var49_44 - var30_30;
                                    var20_20 /* !! */  = (int)(cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1));
                                    if (var20_20 /* !! */  > 0) {
                                        ++var16_16;
                                        var48_43 -= var32_31;
lbl187:
                                        // 3 sources

                                        while (true) {
                                            var21_21 = var48_43;
                                            break block14;
                                            break;
                                        }
                                    }
                                    var41_38 = -1.0;
                                    cfr_temp_6 = var49_44 - var41_38;
                                    var20_20 /* !! */  = (int)(cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1));
                                    if (var20_20 /* !! */  >= 0) ** GOTO lbl187
                                    var16_16 += -1;
                                    var48_43 += var32_31;
                                    ** continue;
                                }
                                var9_9 = var8_8.mSumCrossSizeBefore;
                                var25_25 /* !! */  = var2_2;
                                var9_9 = var7_7.getChildHeightMeasureSpecInternal(var2_2, var28_28, var9_9);
                                var34_33 = 2.0f;
                                var16_16 = View.MeasureSpec.makeMeasureSpec((int)var16_16, (int)0x40000000);
                                var23_23.measure(var16_16, var9_9);
                                var33_32 = var23_23.getMeasuredWidth();
                                var43_39 = var23_23.getMeasuredHeight();
                                var7_7.updateMeasureCache(var22_22, var16_16, var9_9, var23_23);
                                var44_40 = var7_7.mFlexContainer;
                                var44_40.updateViewCache(var22_22, var23_23);
                                var9_9 = var33_32;
                                var16_16 = var43_39;
                                break block26;
                            }
                            var25_25 /* !! */  = var2_2;
                            var27_27 = var47_42;
                        }
                        var22_22 = var28_28.getMarginTop();
                        var16_16 += var22_22;
                        var22_22 = var28_28.getMarginBottom();
                        var16_16 += var22_22;
                        var51_45 = var7_7.mFlexContainer;
                        var22_22 = var51_45.getDecorationLengthCrossAxis(var23_23);
                        var16_16 += var22_22;
                        var16_16 = Math.max(var19_19, var16_16);
                        var19_19 = var8_8.mMainSize;
                        var22_22 = var28_28.getMarginLeft();
                        var9_9 += var22_22;
                        var22_22 = var28_28.getMarginRight();
                        var8_8.mMainSize = var9_9 = var9_9 + var22_22 + var19_19;
                        var9_9 = var16_16;
                    }
                    var8_8.mCrossSize = var16_16 = Math.max(var8_8.mCrossSize, var9_9);
                    var19_19 = var9_9;
                }
                var16_16 = var27_27 + 1;
                var9_9 = var11_11;
                var11_11 = 0;
                var12_12 = 0.0f;
                var13_13 = null;
            }
            var25_25 /* !! */  = var2_2;
            var11_11 = var9_9;
            if (var17_17 && var11_11 != (var9_9 = var8_8.mMainSize)) {
                var17_17 = true;
                var18_18 = 1.4E-45f;
                var44_40 = this;
                var16_16 = var1_1;
                var11_11 = var2_2;
                var8_8 = var3_3;
                var14_14 /* !! */  = var5_5;
                this.shrinkFlexItems(var1_1, var2_2, var3_3, var4_4, var5_5, var17_17);
            }
        }
    }

    private int[] sortOrdersIntoReorderedIndices(int n3, List object, SparseIntArray sparseIntArray) {
        int n4;
        Collections.sort(object);
        sparseIntArray.clear();
        int[] nArray = new int[n3];
        object = object.iterator();
        int n7 = 0;
        while ((n4 = object.hasNext()) != 0) {
            int n8;
            FlexboxHelper$Order flexboxHelper$Order = (FlexboxHelper$Order)object.next();
            nArray[n7] = n8 = flexboxHelper$Order.index;
            n4 = flexboxHelper$Order.order;
            sparseIntArray.append(n8, n4);
            ++n7;
        }
        return nArray;
    }

    private void stretchViewHorizontally(View view, int n3, int n4) {
        Object object = (FlexItem)view.getLayoutParams();
        int n7 = object.getMarginLeft();
        n3 -= n7;
        n7 = object.getMarginRight();
        n3 -= n7;
        FlexContainer flexContainer = this.mFlexContainer;
        n7 = flexContainer.getDecorationLengthCrossAxis(view);
        n3 -= n7;
        n7 = object.getMinWidth();
        n3 = Math.max(n3, n7);
        int n8 = object.getMaxWidth();
        n3 = Math.min(n3, n8);
        object = this.mMeasuredSizeCache;
        if (object != null) {
            Object object2 = object[n4];
            n8 = this.extractHigherInt((long)object2);
        } else {
            n8 = view.getMeasuredHeight();
        }
        n7 = 0x40000000;
        n8 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n7);
        n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n7);
        view.measure(n3, n8);
        this.updateMeasureCache(n4, n3, n8, view);
        this.mFlexContainer.updateViewCache(n4, view);
    }

    private void stretchViewVertically(View view, int n3, int n4) {
        Object object = (FlexItem)view.getLayoutParams();
        int n7 = object.getMarginTop();
        n3 -= n7;
        n7 = object.getMarginBottom();
        n3 -= n7;
        FlexContainer flexContainer = this.mFlexContainer;
        n7 = flexContainer.getDecorationLengthCrossAxis(view);
        n3 -= n7;
        n7 = object.getMinHeight();
        n3 = Math.max(n3, n7);
        int n8 = object.getMaxHeight();
        n3 = Math.min(n3, n8);
        object = this.mMeasuredSizeCache;
        if (object != null) {
            Object object2 = object[n4];
            n8 = this.extractLowerInt((long)object2);
        } else {
            n8 = view.getMeasuredWidth();
        }
        n7 = 0x40000000;
        n8 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n7);
        n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n7);
        view.measure(n8, n3);
        this.updateMeasureCache(n4, n8, n3, view);
        this.mFlexContainer.updateViewCache(n4, view);
    }

    private void updateMeasureCache(int n3, int n4, int n7, View view) {
        long[] lArray;
        long[] lArray2 = this.mMeasureSpecCache;
        if (lArray2 != null) {
            long l2;
            lArray2[n3] = l2 = this.makeCombinedLong(n4, n7);
        }
        if ((lArray = this.mMeasuredSizeCache) != null) {
            long l3;
            n7 = view.getMeasuredWidth();
            int n8 = view.getMeasuredHeight();
            lArray[n3] = l3 = this.makeCombinedLong(n7, n8);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void calculateFlexLines(FlexboxHelper$FlexLinesResult var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, List var7_7) {
        block39: {
            var8_8 = this;
            var9_9 = var1_1;
            var10_10 = var2_2;
            var11_11 = var3_3;
            var12_12 = var6_6;
            var13_13 = this.mFlexContainer;
            var14_14 = var13_13.isMainAxisDirectionHorizontal();
            var15_15 = View.MeasureSpec.getMode((int)var2_2);
            var16_16 = View.MeasureSpec.getSize((int)var2_2);
            if (var7_7 == null) {
                var13_13 = new ArrayList();
                var17_17 = var13_13;
            } else {
                var17_17 = var7_7;
            }
            var9_9.mFlexLines = var17_17;
            var18_18 = -1;
            if (var12_12 == var18_18) {
                var19_19 = 1;
            } else {
                var19_19 = 0;
                var13_13 = null;
            }
            var20_20 = var8_8.getPaddingStartMain(var14_14);
            var21_21 = var8_8.getPaddingEndMain(var14_14);
            var22_22 = var8_8.getPaddingStartCross(var14_14);
            var23_23 = var8_8.getPaddingEndCross(var14_14);
            var24_24 = new FlexLine();
            var24_24.mFirstIndex = var5_5;
            var24_24.mMainSize = var21_21 += var20_20;
            var25_25 = var8_8.mFlexContainer;
            var20_20 = var25_25.getFlexItemCount();
            var26_26 = var19_19;
            var19_19 = 0;
            var13_13 = null;
            var27_27 = 0;
            var28_28 = 0;
            var29_29 = -1 << -1;
            for (var18_18 = var5_5; var18_18 < var20_20; ++var18_18) {
                block43: {
                    block45: {
                        block44: {
                            block42: {
                                block41: {
                                    block40: {
                                        var30_30 = var8_8.mFlexContainer.getReorderedFlexItemAt(var18_18);
                                        if (var30_30 != null) break block40;
                                        var31_31 = var8_8.isLastFlexItem(var18_18, var20_20, (FlexLine)var24_24);
                                        if (var31_31 != 0) {
                                            var8_8.addFlexLine((List)var17_17, (FlexLine)var24_24, var18_18, var19_19);
                                        }
                                        break block41;
                                    }
                                    var32_32 = var30_30.getVisibility();
                                    if (var32_32 != (var33_33 = 8)) break block42;
                                    var31_31 = var24_24.mGoneItemCount;
                                    var32_32 = 1;
                                    var34_34 = 1.4E-45f;
                                    var24_24.mGoneItemCount = var31_31 += var32_32;
                                    var24_24.mItemCount = var31_31 = var24_24.mItemCount + var32_32;
                                    var31_31 = (int)var8_8.isLastFlexItem(var18_18, var20_20, (FlexLine)var24_24);
                                    if (var31_31 != 0) {
                                        var8_8.addFlexLine((List)var17_17, (FlexLine)var24_24, var18_18, var19_19);
                                    }
                                }
                                var10_10 = var4_4;
                                var35_35 = var16_16;
                                var36_36 = var15_15;
                                var31_31 = var11_11;
                                var33_33 = var12_12;
                                var16_16 = var21_21;
                                var37_37 = var17_17;
                                var38_38 = -1;
                                var21_21 = var20_20;
                                var20_20 = 1;
                                var39_39 = 1.4E-45f;
                                break block43;
                            }
                            var32_32 = var30_30 instanceof CompoundButton;
                            if (var32_32 != 0) {
                                var40_40 = var30_30;
                                var40_40 = (CompoundButton)var30_30;
                                var8_8.evaluateMinimumSizeForCompoundButton((CompoundButton)var40_40);
                            }
                            var9_9 = var40_40 = var30_30.getLayoutParams();
                            var9_9 = (FlexItem)var40_40;
                            var32_32 = var9_9.getAlignSelf();
                            var41_41 = var20_20;
                            var20_20 = 4;
                            var39_39 = 5.6E-45f;
                            if (var32_32 == var20_20) {
                                var25_25 = var24_24.mIndicesAlignSelfStretch;
                                var40_40 = var18_18;
                                var25_25.add(var40_40);
                            }
                            var20_20 = var8_8.getFlexItemSizeMain((FlexItem)var9_9, var14_14);
                            var34_34 = var9_9.getFlexBasisPercent();
                            var36_36 = -1082130432;
                            var42_42 = -1.0f;
                            cfr_temp_0 = var34_34 - var42_42;
                            var32_32 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var32_32 != 0) {
                                var32_32 = 0x40000000;
                                var34_34 = 2.0f;
                                if (var15_15 == var32_32) {
                                    var39_39 = var16_16;
                                    var34_34 = var9_9.getFlexBasisPercent();
                                    var20_20 = Math.round(var39_39 *= var34_34);
                                }
                            }
                            if (var14_14) {
                                var40_40 = var8_8.mFlexContainer;
                                var12_12 = 1;
                                var35_35 = var8_8.getFlexItemMarginStartMain((FlexItem)var9_9, (boolean)var12_12);
                                var35_35 = var21_21 + var35_35;
                                var36_36 = var8_8.getFlexItemMarginEndMain((FlexItem)var9_9, (boolean)var12_12);
                                var12_12 = var35_35 + var36_36;
                                var20_20 = var40_40.getChildWidthMeasureSpec(var10_10, var12_12, var20_20);
                                var40_40 = var8_8.mFlexContainer;
                                var12_12 = var22_22 + var23_23;
                                var35_35 = var16_16;
                                var16_16 = 1;
                                var36_36 = var8_8.getFlexItemMarginStartCross((FlexItem)var9_9, (boolean)var16_16);
                                var12_12 += var36_36;
                                var36_36 = var8_8.getFlexItemMarginEndCross((FlexItem)var9_9, (boolean)var16_16);
                                var12_12 = var12_12 + var36_36 + var19_19;
                                var36_36 = var15_15;
                                var15_15 = var8_8.getFlexItemSizeCross((FlexItem)var9_9, (boolean)var16_16);
                                var32_32 = var40_40.getChildHeightMeasureSpec(var11_11, var12_12, var15_15);
                                var30_30.measure(var20_20, var32_32);
                                var8_8.updateMeasureCache(var18_18, var20_20, var32_32, var30_30);
                                var15_15 = var20_20;
                                var12_12 = 0;
                                var37_37 = null;
                            } else {
                                var35_35 = var16_16;
                                var36_36 = var15_15;
                                var40_40 = var8_8.mFlexContainer;
                                var15_15 = var22_22 + var23_23;
                                var12_12 = 0;
                                var37_37 = null;
                                var43_43 = var8_8.getFlexItemMarginStartCross((FlexItem)var9_9, false);
                                var15_15 += var43_43;
                                var43_43 = var8_8.getFlexItemMarginEndCross((FlexItem)var9_9, false);
                                var15_15 = var15_15 + var43_43 + var19_19;
                                var16_16 = var8_8.getFlexItemSizeCross((FlexItem)var9_9, false);
                                var32_32 = var40_40.getChildWidthMeasureSpec(var11_11, var15_15, var16_16);
                                var44_44 = var8_8.mFlexContainer;
                                var15_15 = var8_8.getFlexItemMarginStartMain((FlexItem)var9_9, false) + var21_21;
                                var43_43 = var8_8.getFlexItemMarginEndMain((FlexItem)var9_9, false);
                                var20_20 = var44_44.getChildHeightMeasureSpec(var10_10, var15_15 += var43_43, var20_20);
                                var30_30.measure(var32_32, var20_20);
                                var8_8.updateMeasureCache(var18_18, var32_32, var20_20, var30_30);
                                var15_15 = var20_20;
                            }
                            var8_8.mFlexContainer.updateViewCache(var18_18, var30_30);
                            var8_8.checkSizeConstraints(var30_30, var18_18);
                            var20_20 = var30_30.getMeasuredState();
                            var32_32 = var27_27;
                            var27_27 = View.combineMeasuredStates((int)var27_27, (int)var20_20);
                            var32_32 = var24_24.mMainSize;
                            var20_20 = var8_8.getViewMeasuredSizeMain(var30_30, var14_14);
                            var16_16 = var8_8.getFlexItemMarginStartMain((FlexItem)var9_9, var14_14);
                            var20_20 += var16_16;
                            var16_16 = var8_8.getFlexItemMarginEndMain((FlexItem)var9_9, var14_14) + var20_20;
                            var43_43 = var17_17.size();
                            var20_20 = var19_19;
                            var13_13 = this;
                            var10_10 = var19_19;
                            var12_12 = var41_41;
                            var25_25 = var30_30;
                            var12_12 = var21_21;
                            var21_21 = var36_36;
                            var45_45 = var35_35;
                            var46_46 = var12_12;
                            var37_37 = var30_30;
                            var31_31 = var32_32;
                            var32_32 = var16_16;
                            var5_5 = var18_18;
                            var7_7 = var30_30;
                            var37_37 = var17_17;
                            var38_38 = var18_18;
                            var11_11 = -1;
                            var47_47 = 0.0f / 0.0f;
                            var16_16 = var28_28;
                            var48_48 = var15_15;
                            var15_15 = var43_43;
                            var19_19 = (int)this.isWrapRequired(var30_30, var36_36, var35_35, var31_31, var32_32, (FlexItem)var9_9, var18_18, var28_28, var43_43);
                            if (var19_19 != 0) {
                                var19_19 = var24_24.getItemCountNotGone();
                                if (var19_19 > 0) {
                                    if (var18_18 > 0) {
                                        var31_31 = var18_18 + -1;
                                    } else {
                                        var31_31 = 0;
                                        var30_30 = null;
                                    }
                                    var8_8.addFlexLine((List)var37_37, (FlexLine)var24_24, var31_31, var10_10);
                                    var19_19 = var24_24.mCrossSize + var10_10;
                                } else {
                                    var19_19 = var20_20;
                                }
                                if (var14_14) {
                                    var20_20 = var9_9.getHeight();
                                    if (var20_20 == var11_11) {
                                        var25_25 = var8_8.mFlexContainer;
                                        var21_21 = var25_25.getPaddingTop();
                                        var24_24 = var8_8.mFlexContainer;
                                        var45_45 = var24_24.getPaddingBottom();
                                        var21_21 += var45_45;
                                        var45_45 = var9_9.getMarginTop();
                                        var21_21 += var45_45;
                                        var45_45 = var9_9.getMarginBottom();
                                        var21_21 = var21_21 + var45_45 + var19_19;
                                        var45_45 = var9_9.getHeight();
                                        var31_31 = var3_3;
                                        var38_38 = -1;
                                        var20_20 = var25_25.getChildHeightMeasureSpec(var3_3, var21_21, var45_45);
                                        var49_49 = var7_7;
                                        var45_45 = var48_48;
                                        var7_7.measure(var48_48, var20_20);
                                        var8_8.checkSizeConstraints(var7_7, var18_18);
                                    } else {
                                        var31_31 = var3_3;
                                        var49_49 = var7_7;
                                        var38_38 = -1;
                                    }
                                } else {
                                    var31_31 = var3_3;
                                    var49_49 = var7_7;
                                    var45_45 = var48_48;
                                    var38_38 = -1;
                                    var20_20 = var9_9.getWidth();
                                    if (var20_20 == var38_38) {
                                        var25_25 = var8_8.mFlexContainer;
                                        var32_32 = var25_25.getPaddingLeft();
                                        var44_44 = var8_8.mFlexContainer;
                                        var16_16 = var44_44.getPaddingRight();
                                        var32_32 += var16_16;
                                        var16_16 = var9_9.getMarginLeft();
                                        var32_32 += var16_16;
                                        var16_16 = var9_9.getMarginRight();
                                        var32_32 = var32_32 + var16_16 + var19_19;
                                        var16_16 = var9_9.getWidth();
                                        var20_20 = var25_25.getChildWidthMeasureSpec(var3_3, var32_32, var16_16);
                                        var7_7.measure(var20_20, var48_48);
                                        var8_8.checkSizeConstraints(var7_7, var18_18);
                                    }
                                }
                                var24_24 = new FlexLine();
                                var20_20 = 1;
                                var39_39 = 1.4E-45f;
                                var24_24.mItemCount = var20_20;
                                var16_16 = var46_46;
                                var24_24.mMainSize = var46_46;
                                var24_24.mFirstIndex = var18_18;
                                var32_32 = 0;
                                var34_34 = 0.0f;
                                var40_40 = null;
                                var15_15 = -1 << -1;
                            } else {
                                var31_31 = var3_3;
                                var49_49 = var30_30;
                                var16_16 = var12_12;
                                var20_20 = 1;
                                var39_39 = 1.4E-45f;
                                var38_38 = -1;
                                var24_24.mItemCount = var19_19 = var24_24.mItemCount + var20_20;
                                var32_32 = var28_28 + 1;
                                var19_19 = var10_10;
                                var15_15 = var29_29;
                            }
                            var10_10 = (int)var24_24.mAnyItemsHaveFlexGrow;
                            var47_47 = var9_9.getFlexGrow();
                            var28_28 = 0;
                            cfr_temp_1 = var47_47 - 0.0f;
                            var11_11 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                            if (var11_11 != 0) {
                                var11_11 = 1;
                                var47_47 = 1.4E-45f;
                            } else {
                                var11_11 = 0;
                                var47_47 = 0.0f;
                                var50_50 = null;
                            }
                            var24_24.mAnyItemsHaveFlexGrow = var10_10 |= var11_11;
                            var10_10 = (int)var24_24.mAnyItemsHaveFlexShrink;
                            var47_47 = var9_9.getFlexShrink();
                            cfr_temp_2 = var47_47 - 0.0f;
                            var11_11 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                            if (var11_11 != 0) {
                                var11_11 = 1;
                                var47_47 = 1.4E-45f;
                            } else {
                                var11_11 = 0;
                                var47_47 = 0.0f;
                                var50_50 = null;
                            }
                            var24_24.mAnyItemsHaveFlexShrink = var10_10 |= var11_11;
                            var51_51 = var8_8.mIndexToFlexLine;
                            if (var51_51 != null) {
                                var51_51[var18_18] = var11_11 = var37_37.size();
                            }
                            var10_10 = var24_24.mMainSize;
                            var11_11 = var8_8.getViewMeasuredSizeMain(var49_49, var14_14);
                            var28_28 = var8_8.getFlexItemMarginStartMain((FlexItem)var9_9, var14_14);
                            var11_11 += var28_28;
                            var28_28 = var8_8.getFlexItemMarginEndMain((FlexItem)var9_9, var14_14);
                            var24_24.mMainSize = var11_11 = var11_11 + var28_28 + var10_10;
                            var52_52 = var24_24.mTotalFlexGrow;
                            var47_47 = var9_9.getFlexGrow();
                            var24_24.mTotalFlexGrow = var52_52 += var47_47;
                            var52_52 = var24_24.mTotalFlexShrink;
                            var47_47 = var9_9.getFlexShrink();
                            var24_24.mTotalFlexShrink = var52_52 += var47_47;
                            var51_51 = var8_8.mFlexContainer;
                            var51_51.onNewFlexItemAdded(var49_49, var18_18, var32_32, (FlexLine)var24_24);
                            var10_10 = var8_8.getViewMeasuredSizeCross(var49_49, var14_14);
                            var11_11 = var8_8.getFlexItemMarginStartCross((FlexItem)var9_9, var14_14);
                            var10_10 += var11_11;
                            var11_11 = var8_8.getFlexItemMarginEndCross((FlexItem)var9_9, var14_14);
                            var10_10 += var11_11;
                            var50_50 = var8_8.mFlexContainer;
                            var11_11 = var50_50.getDecorationLengthCrossAxis(var49_49);
                            var15_15 = Math.max(var15_15, var10_10 += var11_11);
                            var24_24.mCrossSize = var10_10 = Math.max(var24_24.mCrossSize, var15_15);
                            if (!var14_14) break block44;
                            var51_51 = var8_8.mFlexContainer;
                            var10_10 = var51_51.getFlexWrap();
                            var11_11 = 2;
                            var47_47 = 2.8E-45f;
                            if (var10_10 == var11_11) break block45;
                            var10_10 = var24_24.mMaxBaseline;
                            var21_21 = var49_49.getBaseline();
                            var33_33 = var9_9.getMarginTop();
                            var21_21 += var33_33;
                            var24_24.mMaxBaseline = var21_21 = Math.max(var10_10, var21_21);
                        }
lbl316:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var10_10 = var24_24.mMaxBaseline;
                    var11_11 = var49_49.getMeasuredHeight();
                    var21_21 = var49_49.getBaseline();
                    var11_11 -= var21_21;
                    var21_21 = var9_9.getMarginBottom();
                    var11_11 += var21_21;
                    var24_24.mMaxBaseline = var21_21 = Math.max(var10_10, var11_11);
                    ** continue;
                    var21_21 = var41_41;
                    var33_33 = (int)var8_8.isLastFlexItem(var18_18, var41_41, (FlexLine)var24_24);
                    if (var33_33 != 0) {
                        var8_8.addFlexLine((List)var37_37, (FlexLine)var24_24, var18_18, var19_19);
                        var33_33 = var24_24.mCrossSize;
                        var19_19 += var33_33;
                    }
                    var33_33 = var6_6;
                    if (var6_6 == var38_38 || (var10_10 = var37_37.size()) <= 0) ** GOTO lbl-1000
                    var51_51 = (FlexLine)on_2.d(var20_20, (List)var37_37);
                    var10_10 = var51_51.mLastIndex;
                    if (var10_10 >= var6_6 && var18_18 >= var6_6 && var26_26 == 0) {
                        var19_19 = -var24_24.getCrossSize();
                        var10_10 = var4_4;
                        var26_26 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var10_10 = var4_4;
                    }
                    if (var19_19 > var10_10 && var26_26 != 0) {
                        var13_13 = var1_1;
                        var32_32 = var27_27;
                        break block39;
                    }
                    var28_28 = var32_32;
                    var29_29 = var15_15;
                }
                var10_10 = var2_2;
                var20_20 = var21_21;
                var11_11 = var31_31;
                var21_21 = var16_16;
                var17_17 = var37_37;
                var16_16 = var35_35;
                var15_15 = var36_36;
                var12_12 = var33_33;
                var9_9 = var1_1;
            }
            var32_32 = var27_27;
            var13_13 = var1_1;
        }
        var13_13.mChildState = var32_32;
    }

    public void calculateHorizontalFlexLines(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n3, n4, -1 >>> 1, 0, -1, null);
    }

    public void calculateHorizontalFlexLines(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4, int n7, int n8, List list) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n3, n4, n7, n8, -1, list);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4, int n7, int n8, List list) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n3, n4, n7, 0, n8, list);
    }

    public void calculateVerticalFlexLines(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n4, n3, -1 >>> 1, 0, -1, null);
    }

    public void calculateVerticalFlexLines(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4, int n7, int n8, List list) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n4, n3, n7, n8, -1, list);
    }

    public void calculateVerticalFlexLinesToIndex(FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult, int n3, int n4, int n7, int n8, List list) {
        this.calculateFlexLines(flexboxHelper$FlexLinesResult, n4, n3, n7, 0, n8, list);
    }

    public void clearFlexLines(List object, int n3) {
        int n4;
        int[] nArray = this.mIndexToFlexLine;
        int n7 = nArray[n3];
        int n8 = -1;
        if (n7 == n8) {
            n7 = 0;
            nArray = null;
        }
        if ((n4 = object.size()) > n7) {
            n4 = object.size();
            object = object.subList(n7, n4);
            object.clear();
        }
        if (n3 > (n7 = ((Object)(object = (Object)this.mIndexToFlexLine)).length + -1)) {
            Arrays.fill(object, n8);
        } else {
            Arrays.fill(object, n3, n7, n8);
        }
        object = this.mMeasureSpecCache;
        n7 = ((Object)object).length + -1;
        long l2 = 0L;
        if (n3 > n7) {
            Arrays.fill((long[])object, l2);
        } else {
            Arrays.fill((long[])object, n3, n7, l2);
        }
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int n3 = this.mFlexContainer.getFlexItemCount();
        List list = this.createOrders(n3);
        return this.sortOrdersIntoReorderedIndices(n3, list, sparseIntArray);
    }

    public int[] createReorderedIndices(View object, int n3, ViewGroup.LayoutParams object2, SparseIntArray sparseIntArray) {
        int n4;
        FlexContainer flexContainer = this.mFlexContainer;
        int n7 = flexContainer.getFlexItemCount();
        List list = this.createOrders(n7);
        FlexboxHelper$Order flexboxHelper$Order = new FlexboxHelper$Order(null);
        int n8 = 1;
        if (object != null && (n4 = object2 instanceof FlexItem) != 0) {
            object2 = (FlexItem)object2;
            flexboxHelper$Order.order = n4 = object2.getOrder();
        } else {
            flexboxHelper$Order.order = n8;
        }
        n4 = -1;
        if (n3 != n4 && n3 != n7) {
            object = this.mFlexContainer;
            n4 = object.getFlexItemCount();
            if (n3 < n4) {
                flexboxHelper$Order.index = n3;
                while (n3 < n7) {
                    int n10;
                    object = (FlexboxHelper$Order)list.get(n3);
                    ((FlexboxHelper$Order)object).index = n10 = ((FlexboxHelper$Order)object).index + n8;
                    ++n3;
                }
            } else {
                flexboxHelper$Order.index = n7;
            }
        } else {
            flexboxHelper$Order.index = n7;
        }
        list.add(flexboxHelper$Order);
        return this.sortOrdersIntoReorderedIndices(n7 += n8, list, sparseIntArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void determineCrossSize(int n3, int n4, int n7) {
        float f5;
        float f6;
        int n8;
        ArrayList<Object> arrayList;
        float f7;
        int n10;
        int n14;
        float f8;
        int n15;
        Object object;
        block29: {
            float f11;
            Object object2;
            float f12;
            block28: {
                object = this.mFlexContainer;
                int n16 = object.getFlexDirection();
                n15 = 3;
                f8 = 4.2E-45f;
                n14 = 2;
                f12 = 2.8E-45f;
                n10 = 1;
                if (n16 != 0 && n16 != n10) {
                    if (n16 != n14 && n16 != n15) {
                        String string2 = hj0_0.a(n16, "Invalid flex direction: ");
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                        throw illegalArgumentException;
                    }
                    n4 = View.MeasureSpec.getMode((int)n3);
                    n3 = View.MeasureSpec.getSize((int)n3);
                } else {
                    n3 = View.MeasureSpec.getMode((int)n4);
                    int n17 = View.MeasureSpec.getSize((int)n4);
                    n4 = n3;
                    n3 = n17;
                }
                object = this.mFlexContainer.getFlexLinesInternal();
                int n18 = 0x40000000;
                f7 = 2.0f;
                if (n4 != n18) return;
                arrayList = this.mFlexContainer;
                n4 = arrayList.getSumOfCrossSize() + n7;
                n18 = object.size();
                n8 = 0;
                if (n18 == n10) {
                    arrayList = (FlexLine)object.get(0);
                    ((FlexLine)((Object)arrayList)).mCrossSize = n3 -= n7;
                    return;
                }
                n7 = object.size();
                if (n7 < n14) return;
                object2 = this.mFlexContainer;
                n7 = object2.getAlignContent();
                if (n7 == n10) {
                    arrayList = new ArrayList<Object>();
                    ((FlexLine)((Object)arrayList)).mCrossSize = n3 -= n4;
                    object.add(0, arrayList);
                    return;
                }
                if (n7 == n14) {
                    object2 = this.mFlexContainer;
                    List list = this.constructFlexLinesForAlignContentCenter((List)object, n3, n4);
                    object2.setFlexLines(list);
                    return;
                }
                n18 = -1082130432;
                f7 = -1.0f;
                f6 = 1.0f;
                if (n7 != n15) {
                    n15 = 4;
                    f8 = 5.6E-45f;
                    if (n7 != n15) {
                        n15 = 5;
                        f8 = 7.0E-45f;
                        if (n7 != n15) {
                            return;
                        }
                        if (n4 >= n3) {
                            return;
                        }
                        f11 = n3 -= n4;
                        float f14 = object.size();
                        f11 /= f14;
                        break block28;
                    } else {
                        if (n4 >= n3) {
                            object2 = this.mFlexContainer;
                            List list = this.constructFlexLinesForAlignContentCenter((List)object, n3, n4);
                            object2.setFlexLines(list);
                            return;
                        }
                        n3 -= n4;
                        n4 = object.size() * 2;
                        arrayList = new ArrayList<Object>();
                        object2 = new FlexLine();
                        ((FlexLine)object2).mCrossSize = n3 /= n4;
                        Object object3 = object.iterator();
                        while (true) {
                            if ((n16 = (int)(object3.hasNext() ? 1 : 0)) == 0) {
                                object3 = this.mFlexContainer;
                                object3.setFlexLines(arrayList);
                                return;
                            }
                            object = (FlexLine)object3.next();
                            arrayList.add(object2);
                            arrayList.add(object);
                            arrayList.add(object2);
                        }
                    }
                }
                if (n4 >= n3) {
                    return;
                }
                f5 = n3 -= n4;
                n4 = object.size() - n10;
                float f15 = n4;
                f5 /= f15;
                break block29;
            }
            n4 = object.size();
            n7 = 0;
            float f16 = 0.0f;
            object2 = null;
            while (n8 < n4) {
                float f17;
                float f18;
                FlexLine flexLine = (FlexLine)object.get(n8);
                n14 = flexLine.mCrossSize;
                f12 = (float)n14 + f11;
                int n19 = object.size() - n10;
                if (n8 == n19) {
                    f12 += f16;
                    n7 = 0;
                    f16 = 0.0f;
                    object2 = null;
                }
                if ((n7 = (int)((f18 = (f12 = f12 - (f17 = (float)(n19 = Math.round(f12))) + f16) - f6) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1))) > 0) {
                    f12 -= f6;
                } else {
                    n7 = (int)(f12 == f7 ? 0 : (f12 < f7 ? -1 : 1));
                    if (n7 < 0) {
                        n19 += -1;
                        f12 += f6;
                    }
                }
                f16 = f12;
                flexLine.mCrossSize = ++n19;
                ++n8;
            }
            return;
        }
        arrayList = new ArrayList<Object>();
        n7 = object.size();
        n15 = 0;
        f8 = 0.0f;
        Object var22_30 = null;
        while (true) {
            if (n8 >= n7) {
                FlexContainer flexContainer = this.mFlexContainer;
                flexContainer.setFlexLines(arrayList);
                return;
            }
            FlexLine flexLine = (FlexLine)object.get(n8);
            arrayList.add(flexLine);
            int n20 = object.size() - n10;
            if (n8 != n20) {
                flexLine = new FlexLine();
                int n21 = object.size() - n14;
                if (n8 == n21) {
                    flexLine.mCrossSize = n15 = Math.round(f8 + f5);
                    n15 = 0;
                    f8 = 0.0f;
                    var22_30 = null;
                } else {
                    flexLine.mCrossSize = n21 = Math.round(f5);
                }
                n21 = flexLine.mCrossSize;
                float f19 = n21;
                f19 = f5 - f19 + f8;
                n15 = (int)(f19 == f6 ? 0 : (f19 > f6 ? 1 : -1));
                if (n15 > 0) {
                    flexLine.mCrossSize = ++n21;
                    f19 -= f6;
                } else {
                    n15 = (int)(f19 == f7 ? 0 : (f19 < f7 ? -1 : 1));
                    if (n15 < 0) {
                        flexLine.mCrossSize = n21 += -1;
                        f19 += f6;
                    }
                }
                f8 = f19;
                arrayList.add(flexLine);
            }
            ++n8;
        }
    }

    public void determineMainSize(int n3, int n4) {
        this.determineMainSize(n3, n4, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void determineMainSize(int n3, int n4, int object) {
        Object object2;
        int n7;
        int n8 = this.mFlexContainer.getFlexItemCount();
        this.ensureChildrenFrozen(n8);
        FlexContainer flexContainer = this.mFlexContainer;
        n8 = flexContainer.getFlexItemCount();
        if (object >= n8) {
            return;
        }
        flexContainer = this.mFlexContainer;
        n8 = flexContainer.getFlexDirection();
        FlexContainer flexContainer2 = this.mFlexContainer;
        int n10 = flexContainer2.getFlexDirection();
        int n14 = 0x40000000;
        if (n10 != 0 && n10 != (n7 = 1)) {
            n7 = 2;
            if (n10 != n7 && n10 != (n7 = 3)) {
                String string2 = hj0_0.a(n8, "Invalid flex direction: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            n8 = View.MeasureSpec.getMode((int)n4);
            n10 = View.MeasureSpec.getSize((int)n4);
            if (n8 != n14) {
                flexContainer = this.mFlexContainer;
                n10 = flexContainer.getLargestMainSize();
            }
            flexContainer = this.mFlexContainer;
            n8 = flexContainer.getPaddingTop();
            object2 = this.mFlexContainer;
            n14 = object2.getPaddingBottom();
        } else {
            n8 = View.MeasureSpec.getMode((int)n3);
            n10 = View.MeasureSpec.getSize((int)n3);
            FlexContainer flexContainer3 = this.mFlexContainer;
            n7 = flexContainer3.getLargestMainSize();
            if (n8 != n14) {
                n10 = n8 = Math.min(n7, n10);
            }
            flexContainer = this.mFlexContainer;
            n8 = flexContainer.getPaddingLeft();
            object2 = this.mFlexContainer;
            n14 = object2.getPaddingRight();
        }
        n8 += n14;
        object2 = this.mIndexToFlexLine;
        if (object2 != null) {
            Object object3 = object2[object];
        } else {
            boolean bl2 = false;
        }
        object2 = this.mFlexContainer;
        List list = object2.getFlexLinesInternal();
        int n15 = list.size();
        void var3_7;
        while (var3_7 < n15) {
            Object object4 = object2 = list.get((int)var3_7);
            object4 = (FlexLine)object2;
            n14 = ((FlexLine)object4).mMainSize;
            if (n14 < n10 && (n7 = (int)(((FlexLine)object4).mAnyItemsHaveFlexGrow ? 1 : 0)) != 0) {
                object2 = this;
                n7 = n3;
                this.expandFlexItems(n3, n4, (FlexLine)object4, n10, n8, false);
            } else if (n14 > n10 && (n14 = (int)(((FlexLine)object4).mAnyItemsHaveFlexShrink ? 1 : 0)) != 0) {
                object2 = this;
                n7 = n3;
                this.shrinkFlexItems(n3, n4, (FlexLine)object4, n10, n8, false);
            }
            ++var3_7;
        }
        return;
    }

    public void ensureIndexToFlexLine(int n3) {
        int[] nArray = this.mIndexToFlexLine;
        if (nArray == null) {
            int n4 = 10;
            n3 = Math.max(n3, n4);
            int[] nArray2 = new int[n3];
            this.mIndexToFlexLine = nArray2;
        } else {
            int n7 = nArray.length;
            if (n7 < n3) {
                int n8 = nArray.length * 2;
                n3 = Math.max(n8, n3);
                nArray = this.mIndexToFlexLine;
                int[] nArray3 = Arrays.copyOf(nArray, n3);
                this.mIndexToFlexLine = nArray3;
            }
        }
    }

    public void ensureMeasureSpecCache(int n3) {
        long[] lArray = this.mMeasureSpecCache;
        if (lArray == null) {
            int n4 = 10;
            n3 = Math.max(n3, n4);
            long[] lArray2 = new long[n3];
            this.mMeasureSpecCache = lArray2;
        } else {
            int n7 = lArray.length;
            if (n7 < n3) {
                int n8 = lArray.length * 2;
                n3 = Math.max(n8, n3);
                lArray = this.mMeasureSpecCache;
                long[] lArray3 = Arrays.copyOf(lArray, n3);
                this.mMeasureSpecCache = lArray3;
            }
        }
    }

    public void ensureMeasuredSizeCache(int n3) {
        long[] lArray = this.mMeasuredSizeCache;
        if (lArray == null) {
            int n4 = 10;
            n3 = Math.max(n3, n4);
            long[] lArray2 = new long[n3];
            this.mMeasuredSizeCache = lArray2;
        } else {
            int n7 = lArray.length;
            if (n7 < n3) {
                int n8 = lArray.length * 2;
                n3 = Math.max(n8, n3);
                lArray = this.mMeasuredSizeCache;
                long[] lArray3 = Arrays.copyOf(lArray, n3);
                this.mMeasuredSizeCache = lArray3;
            }
        }
    }

    public int extractHigherInt(long l2) {
        return (int)(l2 >> 32);
    }

    public int extractLowerInt(long l2) {
        return (int)l2;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        FlexContainer flexContainer = this.mFlexContainer;
        int n3 = flexContainer.getFlexItemCount();
        int n4 = sparseIntArray.size();
        boolean bl2 = true;
        if (n4 != n3) {
            return bl2;
        }
        n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            int n8;
            Object object = this.mFlexContainer.getFlexItemAt(i3);
            if (object == null || (n8 = (object = (FlexItem)object.getLayoutParams()).getOrder()) == (n7 = sparseIntArray.get(i3))) continue;
            return bl2;
        }
        return false;
    }

    public void layoutSingleChildHorizontal(View view, FlexLine object, int n3, int n4, int n7, int n8) {
        block13: {
            int n10;
            int n14;
            FlexItem flexItem;
            block9: {
                int n15;
                block10: {
                    block11: {
                        int n16;
                        FlexContainer flexContainer;
                        block12: {
                            flexItem = (FlexItem)view.getLayoutParams();
                            flexContainer = this.mFlexContainer;
                            n16 = flexContainer.getAlignItems();
                            n15 = flexItem.getAlignSelf();
                            if (n15 != (n14 = -1)) {
                                n16 = flexItem.getAlignSelf();
                            }
                            n15 = ((FlexLine)object).mCrossSize;
                            n14 = 2;
                            if (n16 == 0) break block9;
                            int n17 = 1;
                            if (n16 == n17) break block10;
                            if (n16 == n14) break block11;
                            n15 = 3;
                            if (n16 == n15) break block12;
                            n10 = 4;
                            if (n16 == n10) break block9;
                            break block13;
                        }
                        flexContainer = this.mFlexContainer;
                        n16 = flexContainer.getFlexWrap();
                        if (n16 != n14) {
                            int n18 = ((FlexLine)object).mMaxBaseline;
                            n16 = view.getBaseline();
                            n18 -= n16;
                            int n19 = flexItem.getMarginTop();
                            n18 = Math.max(n18, n19);
                            view.layout(n3, n4 += n18, n7, n8 += n18);
                        } else {
                            int n20 = ((FlexLine)object).mMaxBaseline;
                            n16 = view.getMeasuredHeight();
                            n20 -= n16;
                            n16 = view.getBaseline() + n20;
                            n20 = flexItem.getMarginBottom();
                            n20 = Math.max(n16, n20);
                            view.layout(n3, n4 -= n20, n7, n8 -= n20);
                        }
                        break block13;
                    }
                    int n21 = view.getMeasuredHeight();
                    n15 -= n21;
                    n21 = flexItem.getMarginTop();
                    n15 += n21;
                    n21 = flexItem.getMarginBottom();
                    n15 = (n15 - n21) / n14;
                    object = this.mFlexContainer;
                    n21 = object.getFlexWrap();
                    if (n21 != n14) {
                        n21 = view.getMeasuredHeight() + (n4 += n15);
                        view.layout(n3, n4, n7, n21);
                    } else {
                        n21 = view.getMeasuredHeight() + (n4 -= n15);
                        view.layout(n3, n4, n7, n21);
                    }
                    break block13;
                }
                object = this.mFlexContainer;
                int n22 = object.getFlexWrap();
                if (n22 != n14) {
                    n22 = view.getMeasuredHeight();
                    n22 = (n4 += n15) - n22;
                    n8 = flexItem.getMarginBottom();
                    n22 -= n8;
                    n8 = flexItem.getMarginBottom();
                    view.layout(n3, n22, n7, n4 -= n8);
                } else {
                    n22 = view.getMeasuredHeight() + (n4 -= n15);
                    n4 = flexItem.getMarginTop();
                    n22 += n4;
                    n4 = view.getMeasuredHeight() + (n8 -= n15);
                    n8 = flexItem.getMarginTop();
                    view.layout(n3, n22, n7, n4 += n8);
                }
                break block13;
            }
            if ((n10 = (object = this.mFlexContainer).getFlexWrap()) != n14) {
                n10 = flexItem.getMarginTop();
                n4 += n10;
                n10 = flexItem.getMarginTop();
                view.layout(n3, n4, n7, n8 += n10);
            } else {
                n10 = flexItem.getMarginBottom();
                n4 -= n10;
                n10 = flexItem.getMarginBottom();
                view.layout(n3, n4, n7, n8 -= n10);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void layoutSingleChildVertical(View view, FlexLine flexLine, boolean bl2, int n3, int n4, int n7, int n8) {
        block10: {
            int n10;
            void var7_11;
            void var5_9;
            int n14;
            FlexItem flexItem;
            block7: {
                block8: {
                    int n15;
                    int n16;
                    block9: {
                        int n17;
                        flexItem = (FlexItem)view.getLayoutParams();
                        FlexContainer flexContainer = this.mFlexContainer;
                        n16 = flexContainer.getAlignItems();
                        n15 = flexItem.getAlignSelf();
                        if (n15 != (n17 = -1)) {
                            n16 = flexItem.getAlignSelf();
                        }
                        n14 = flexLine.mCrossSize;
                        if (n16 == 0) break block7;
                        n15 = 1;
                        if (n16 == n15) break block8;
                        n15 = 2;
                        if (n16 == n15) break block9;
                        n14 = 3;
                        if (n16 == n14 || n16 == (n14 = 4)) break block7;
                        break block10;
                    }
                    flexItem = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
                    n16 = view.getMeasuredWidth();
                    n14 -= n16;
                    n16 = flexItem.getMarginStart() + n14;
                    n14 = flexItem.getMarginEnd();
                    n16 = (n16 - n14) / n15;
                    if (!bl2) {
                        view.layout(n10 += n16, (int)var5_9, (int)(var6_10 += n16), (int)var7_11);
                    } else {
                        view.layout(n10 -= n16, (int)var5_9, (int)(var6_10 -= n16), (int)var7_11);
                    }
                    break block10;
                }
                if (!bl2) {
                    n10 += n14;
                    int n18 = view.getMeasuredWidth();
                    n10 -= n18;
                    int n19 = flexItem.getMarginRight();
                    var6_10 += n14;
                    n14 = view.getMeasuredWidth();
                    var6_10 -= n14;
                    n14 = flexItem.getMarginRight();
                    view.layout(n10 -= n19, (int)var5_9, (int)(var6_10 -= n14), (int)var7_11);
                } else {
                    void var6_10;
                    int n20 = view.getMeasuredWidth() + (n10 -= n14);
                    n10 = flexItem.getMarginLeft();
                    int n21 = n20 + n10;
                    var6_10 -= n14;
                    n14 = view.getMeasuredWidth() + var6_10;
                    n10 = flexItem.getMarginLeft();
                    view.layout(n21, (int)var5_9, n14 += n10, (int)var7_11);
                }
                break block10;
            }
            if (!bl2) {
                n14 = flexItem.getMarginLeft();
                n10 += n14;
                n14 = flexItem.getMarginLeft();
                view.layout(n10, (int)var5_9, (int)(var6_10 += n14), (int)var7_11);
            } else {
                n14 = flexItem.getMarginRight();
                n10 -= n14;
                n14 = flexItem.getMarginRight();
                view.layout(n10, (int)var5_9, (int)(var6_10 -= n14), (int)var7_11);
            }
        }
    }

    public long makeCombinedLong(int n3, int n4) {
        long l2 = (long)n4 << 32;
        return (long)n3 & 0xFFFFFFFFL | l2;
    }

    public void stretchViews() {
        this.stretchViews(0);
    }

    public void stretchViews(int n3) {
        FlexboxHelper flexboxHelper = this;
        Object object = n3;
        Object object2 = this.mFlexContainer;
        int n4 = object2.getFlexItemCount();
        if (n3 >= n4) {
            return;
        }
        object2 = this.mFlexContainer;
        n4 = object2.getFlexDirection();
        Object object3 = this.mFlexContainer;
        int n7 = object3.getAlignItems();
        String string2 = "Invalid flex direction: ";
        int n8 = 4;
        int n10 = 1;
        if (n7 == n8) {
            IllegalArgumentException illegalArgumentException;
            object3 = this.mIndexToFlexLine;
            if (object3 != null) {
                object = object3[n3];
            } else {
                object = 0;
                illegalArgumentException = null;
            }
            object3 = flexboxHelper.mFlexContainer.getFlexLinesInternal();
            int n14 = object3.size();
            while (object < n14) {
                FlexLine flexLine = (FlexLine)object3.get((int)object);
                int n15 = flexLine.mItemCount;
                for (int i3 = 0; i3 < n15; ++i3) {
                    int n16;
                    FlexItem flexItem;
                    int n17;
                    int n18;
                    int n19 = flexLine.mFirstIndex + i3;
                    FlexContainer flexContainer = flexboxHelper.mFlexContainer;
                    int n20 = flexContainer.getFlexItemCount();
                    if (i3 >= n20 || (flexContainer = flexboxHelper.mFlexContainer.getReorderedFlexItemAt(n19)) == null || (n18 = flexContainer.getVisibility()) == (n17 = 8) || (n18 = (flexItem = (FlexItem)flexContainer.getLayoutParams()).getAlignSelf()) != (n16 = -1) && (n17 = flexItem.getAlignSelf()) != n8) continue;
                    if (n4 != 0 && n4 != n10) {
                        n17 = 2;
                        if (n4 != n17 && n4 != (n17 = 3)) {
                            object2 = hj0_0.a(n4, string2);
                            illegalArgumentException = new IllegalArgumentException((String)object2);
                            throw illegalArgumentException;
                        }
                        n17 = flexLine.mCrossSize;
                        flexboxHelper.stretchViewHorizontally((View)flexContainer, n17, n19);
                        continue;
                    }
                    n17 = flexLine.mCrossSize;
                    flexboxHelper.stretchViewVertically((View)flexContainer, n17, n19);
                }
                ++object;
            }
        } else {
            Object object4 = this.mFlexContainer.getFlexLinesInternal().iterator();
            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                int n21;
                object3 = (FlexLine)object4.next();
                Iterator iterator = ((FlexLine)object3).mIndicesAlignSelfStretch.iterator();
                while ((n21 = iterator.hasNext()) != 0) {
                    int n22;
                    int n24;
                    Integer n25 = (Integer)iterator.next();
                    FlexContainer flexContainer = flexboxHelper.mFlexContainer;
                    int n26 = n25;
                    flexContainer = flexContainer.getReorderedFlexItemAt(n26);
                    if (n4 != 0 && n4 != n10) {
                        n26 = 2;
                        n24 = 3;
                        if (n4 != n26 && n4 != n24) {
                            object2 = hj0_0.a(n4, string2);
                            object4 = new IllegalArgumentException((String)object2);
                            throw object4;
                        }
                        n22 = ((FlexLine)object3).mCrossSize;
                        n21 = n25;
                        flexboxHelper.stretchViewHorizontally((View)flexContainer, n22, n21);
                        continue;
                    }
                    n26 = 2;
                    n24 = 3;
                    n22 = ((FlexLine)object3).mCrossSize;
                    n21 = n25;
                    flexboxHelper.stretchViewVertically((View)flexContainer, n22, n21);
                }
            }
        }
    }
}

