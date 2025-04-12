/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.flexbox;

import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.flexbox.FlexboxLayoutManager$1;
import java.util.List;

class FlexboxLayoutManager$LayoutState {
    private static final int ITEM_DIRECTION_TAIL = 1;
    private static final int LAYOUT_END = 1;
    private static final int LAYOUT_START = 255;
    private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
    private int mAvailable;
    private int mFlexLinePosition;
    private boolean mInfinite;
    private int mItemDirection;
    private int mLastScrollDelta;
    private int mLayoutDirection;
    private int mOffset;
    private int mPosition;
    private int mScrollingOffset;
    private boolean mShouldRecycle;

    private FlexboxLayoutManager$LayoutState() {
        int n3;
        this.mItemDirection = n3 = 1;
        this.mLayoutDirection = n3;
    }

    public /* synthetic */ FlexboxLayoutManager$LayoutState(FlexboxLayoutManager$1 flexboxLayoutManager$1) {
        this();
    }

    public static /* synthetic */ int access$1000(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mOffset;
    }

    public static /* synthetic */ int access$1002(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mOffset = n3;
        return n3;
    }

    public static /* synthetic */ int access$1012(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mOffset = n4 = flexboxLayoutManager$LayoutState.mOffset + n3;
        return n4;
    }

    public static /* synthetic */ int access$1020(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mOffset = n4 = flexboxLayoutManager$LayoutState.mOffset - n3;
        return n4;
    }

    public static /* synthetic */ boolean access$1100(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mInfinite;
    }

    public static /* synthetic */ boolean access$1102(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, boolean bl2) {
        flexboxLayoutManager$LayoutState.mInfinite = bl2;
        return bl2;
    }

    public static /* synthetic */ int access$1200(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mAvailable;
    }

    public static /* synthetic */ int access$1202(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mAvailable = n3;
        return n3;
    }

    public static /* synthetic */ int access$1220(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mAvailable = n4 = flexboxLayoutManager$LayoutState.mAvailable - n3;
        return n4;
    }

    public static /* synthetic */ int access$1500(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mFlexLinePosition;
    }

    public static /* synthetic */ int access$1502(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mFlexLinePosition = n3;
        return n3;
    }

    public static /* synthetic */ int access$1508(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        int n3;
        int n4 = flexboxLayoutManager$LayoutState.mFlexLinePosition;
        flexboxLayoutManager$LayoutState.mFlexLinePosition = n3 = n4 + 1;
        return n4;
    }

    public static /* synthetic */ int access$1510(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        int n3;
        int n4 = flexboxLayoutManager$LayoutState.mFlexLinePosition;
        flexboxLayoutManager$LayoutState.mFlexLinePosition = n3 = n4 + -1;
        return n4;
    }

    public static /* synthetic */ int access$1512(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mFlexLinePosition = n4 = flexboxLayoutManager$LayoutState.mFlexLinePosition + n3;
        return n4;
    }

    public static /* synthetic */ int access$2000(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mScrollingOffset;
    }

    public static /* synthetic */ int access$2002(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mScrollingOffset = n3;
        return n3;
    }

    public static /* synthetic */ int access$2012(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mScrollingOffset = n4 = flexboxLayoutManager$LayoutState.mScrollingOffset + n3;
        return n4;
    }

    public static /* synthetic */ boolean access$2100(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, RecyclerView$y recyclerView$y, List list) {
        return flexboxLayoutManager$LayoutState.hasMore(recyclerView$y, list);
    }

    public static /* synthetic */ int access$2200(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mPosition;
    }

    public static /* synthetic */ int access$2202(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mPosition = n3;
        return n3;
    }

    public static /* synthetic */ int access$2212(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mPosition = n4 = flexboxLayoutManager$LayoutState.mPosition + n3;
        return n4;
    }

    public static /* synthetic */ int access$2220(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        int n4;
        flexboxLayoutManager$LayoutState.mPosition = n4 = flexboxLayoutManager$LayoutState.mPosition - n3;
        return n4;
    }

    public static /* synthetic */ int access$2300(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mLayoutDirection;
    }

    public static /* synthetic */ int access$2302(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mLayoutDirection = n3;
        return n3;
    }

    public static /* synthetic */ int access$2500(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mItemDirection;
    }

    public static /* synthetic */ int access$2502(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mItemDirection = n3;
        return n3;
    }

    public static /* synthetic */ int access$2702(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, int n3) {
        flexboxLayoutManager$LayoutState.mLastScrollDelta = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$500(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState) {
        return flexboxLayoutManager$LayoutState.mShouldRecycle;
    }

    public static /* synthetic */ boolean access$502(FlexboxLayoutManager$LayoutState flexboxLayoutManager$LayoutState, boolean bl2) {
        flexboxLayoutManager$LayoutState.mShouldRecycle = bl2;
        return bl2;
    }

    private boolean hasMore(RecyclerView$y recyclerView$y, List list) {
        int n3;
        int n4;
        int n7 = this.mPosition;
        if (n7 >= 0 && n7 < (n4 = recyclerView$y.b()) && (n4 = this.mFlexLinePosition) >= 0 && n4 < (n3 = list.size())) {
            n4 = 1;
        } else {
            n4 = 0;
            recyclerView$y = null;
        }
        return n4 != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutState{mAvailable=");
        int n3 = this.mAvailable;
        stringBuilder.append(n3);
        stringBuilder.append(", mFlexLinePosition=");
        n3 = this.mFlexLinePosition;
        stringBuilder.append(n3);
        stringBuilder.append(", mPosition=");
        n3 = this.mPosition;
        stringBuilder.append(n3);
        stringBuilder.append(", mOffset=");
        n3 = this.mOffset;
        stringBuilder.append(n3);
        stringBuilder.append(", mScrollingOffset=");
        n3 = this.mScrollingOffset;
        stringBuilder.append(n3);
        stringBuilder.append(", mLastScrollDelta=");
        n3 = this.mLastScrollDelta;
        stringBuilder.append(n3);
        stringBuilder.append(", mItemDirection=");
        n3 = this.mItemDirection;
        stringBuilder.append(n3);
        stringBuilder.append(", mLayoutDirection=");
        n3 = this.mLayoutDirection;
        return tu.a(stringBuilder, n3, '}');
    }
}

