/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.flexbox;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

public class FlexLine {
    boolean mAnyItemsHaveFlexGrow;
    boolean mAnyItemsHaveFlexShrink;
    int mBottom;
    int mCrossSize;
    int mDividerLengthInMainSize;
    int mFirstIndex;
    int mGoneItemCount;
    List mIndicesAlignSelfStretch;
    int mItemCount;
    int mLastIndex;
    int mLeft;
    int mMainSize;
    int mMaxBaseline;
    int mRight;
    int mSumCrossSizeBefore;
    int mTop;
    float mTotalFlexGrow;
    float mTotalFlexShrink;

    public FlexLine() {
        ArrayList arrayList;
        int n3;
        this.mLeft = n3 = -1 >>> 1;
        this.mTop = n3;
        this.mRight = n3 = -1 << -1;
        this.mBottom = n3;
        this.mIndicesAlignSelfStretch = arrayList = new ArrayList();
    }

    public int getCrossSize() {
        return this.mCrossSize;
    }

    public int getFirstIndex() {
        return this.mFirstIndex;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public int getItemCountNotGone() {
        int n3 = this.mItemCount;
        int n4 = this.mGoneItemCount;
        return n3 - n4;
    }

    public int getMainSize() {
        return this.mMainSize;
    }

    public float getTotalFlexGrow() {
        return this.mTotalFlexGrow;
    }

    public float getTotalFlexShrink() {
        return this.mTotalFlexShrink;
    }

    public void updatePositionFromView(View view, int n3, int n4, int n7, int n8) {
        FlexItem flexItem = (FlexItem)view.getLayoutParams();
        int n10 = this.mLeft;
        int n14 = view.getLeft();
        int n15 = flexItem.getMarginLeft();
        n14 = n14 - n15 - n3;
        this.mLeft = n3 = Math.min(n10, n14);
        n3 = this.mTop;
        n10 = view.getTop();
        n14 = flexItem.getMarginTop();
        n10 = n10 - n14 - n4;
        this.mTop = n3 = Math.min(n3, n10);
        n3 = this.mRight;
        n4 = view.getRight();
        n10 = flexItem.getMarginRight();
        n4 = n4 + n10 + n7;
        this.mRight = n3 = Math.max(n3, n4);
        n3 = this.mBottom;
        int n16 = view.getBottom();
        n4 = flexItem.getMarginBottom();
        n16 = n16 + n4 + n8;
        this.mBottom = n16 = Math.max(n3, n16);
    }
}

