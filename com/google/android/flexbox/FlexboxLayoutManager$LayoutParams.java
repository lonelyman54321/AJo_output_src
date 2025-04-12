/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.flexbox;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$1;

public class FlexboxLayoutManager$LayoutParams
extends RecyclerView$LayoutParams
implements FlexItem {
    public static final Parcelable.Creator CREATOR;
    private int mAlignSelf;
    private float mFlexBasisPercent;
    private float mFlexGrow;
    private float mFlexShrink;
    private int mMaxHeight;
    private int mMaxWidth;
    private int mMinHeight;
    private int mMinWidth;
    private boolean mWrapBefore;

    static {
        FlexboxLayoutManager$LayoutParams$1 flexboxLayoutManager$LayoutParams$1 = new FlexboxLayoutManager$LayoutParams$1();
        CREATOR = flexboxLayoutManager$LayoutParams$1;
    }

    public FlexboxLayoutManager$LayoutParams(int n3, int n4) {
        super(n3, n4);
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayoutManager$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayoutManager$LayoutParams(Parcel parcel) {
        int n3;
        float f5;
        int n4 = -2;
        super(n4, n4);
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n4 = 0xFFFFFF;
        this.mMaxHeight = n4;
        this.mFlexGrow = f5 = parcel.readFloat();
        this.mFlexShrink = f5 = parcel.readFloat();
        this.mAlignSelf = n4 = parcel.readInt();
        this.mFlexBasisPercent = f5 = parcel.readFloat();
        this.mMinWidth = n4 = parcel.readInt();
        this.mMinHeight = n4 = parcel.readInt();
        this.mMaxWidth = n4 = parcel.readInt();
        this.mMaxHeight = n4 = parcel.readInt();
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f5 = 0.0f;
        }
        this.mWrapBefore = n4;
        this.bottomMargin = n4 = parcel.readInt();
        this.leftMargin = n4 = parcel.readInt();
        this.rightMargin = n4 = parcel.readInt();
        this.topMargin = n4 = parcel.readInt();
        this.height = n4 = parcel.readInt();
        this.width = n3 = parcel.readInt();
    }

    public FlexboxLayoutManager$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        int n3;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayoutManager$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        int n3;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayoutManager$LayoutParams(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        super(recyclerView$LayoutParams);
        int n3;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayoutManager$LayoutParams(FlexboxLayoutManager$LayoutParams flexboxLayoutManager$LayoutParams) {
        super(flexboxLayoutManager$LayoutParams);
        boolean bl2;
        float f5;
        int n3;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
        this.mFlexGrow = f5 = flexboxLayoutManager$LayoutParams.mFlexGrow;
        this.mFlexShrink = f5 = flexboxLayoutManager$LayoutParams.mFlexShrink;
        this.mAlignSelf = n3 = flexboxLayoutManager$LayoutParams.mAlignSelf;
        this.mFlexBasisPercent = f5 = flexboxLayoutManager$LayoutParams.mFlexBasisPercent;
        this.mMinWidth = n3 = flexboxLayoutManager$LayoutParams.mMinWidth;
        this.mMinHeight = n3 = flexboxLayoutManager$LayoutParams.mMinHeight;
        this.mMaxWidth = n3 = flexboxLayoutManager$LayoutParams.mMaxWidth;
        this.mMaxHeight = n3 = flexboxLayoutManager$LayoutParams.mMaxHeight;
        this.mWrapBefore = bl2 = flexboxLayoutManager$LayoutParams.mWrapBefore;
    }

    public int describeContents() {
        return 0;
    }

    public int getAlignSelf() {
        return this.mAlignSelf;
    }

    public float getFlexBasisPercent() {
        return this.mFlexBasisPercent;
    }

    public float getFlexGrow() {
        return this.mFlexGrow;
    }

    public float getFlexShrink() {
        return this.mFlexShrink;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMarginBottom() {
        return this.bottomMargin;
    }

    public int getMarginLeft() {
        return this.leftMargin;
    }

    public int getMarginRight() {
        return this.rightMargin;
    }

    public int getMarginTop() {
        return this.topMargin;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOrder() {
        return 1;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isWrapBefore() {
        return this.mWrapBefore;
    }

    public void setAlignSelf(int n3) {
        this.mAlignSelf = n3;
    }

    public void setFlexBasisPercent(float f5) {
        this.mFlexBasisPercent = f5;
    }

    public void setFlexGrow(float f5) {
        this.mFlexGrow = f5;
    }

    public void setFlexShrink(float f5) {
        this.mFlexShrink = f5;
    }

    public void setHeight(int n3) {
        this.height = n3;
    }

    public void setMaxHeight(int n3) {
        this.mMaxHeight = n3;
    }

    public void setMaxWidth(int n3) {
        this.mMaxWidth = n3;
    }

    public void setMinHeight(int n3) {
        this.mMinHeight = n3;
    }

    public void setMinWidth(int n3) {
        this.mMinWidth = n3;
    }

    public void setOrder(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        throw unsupportedOperationException;
    }

    public void setWidth(int n3) {
        this.width = n3;
    }

    public void setWrapBefore(boolean bl2) {
        this.mWrapBefore = bl2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        float f5 = this.mFlexGrow;
        parcel.writeFloat(f5);
        f5 = this.mFlexShrink;
        parcel.writeFloat(f5);
        n3 = this.mAlignSelf;
        parcel.writeInt(n3);
        f5 = this.mFlexBasisPercent;
        parcel.writeFloat(f5);
        n3 = this.mMinWidth;
        parcel.writeInt(n3);
        n3 = this.mMinHeight;
        parcel.writeInt(n3);
        n3 = this.mMaxWidth;
        parcel.writeInt(n3);
        n3 = this.mMaxHeight;
        parcel.writeInt(n3);
        n3 = (int)(this.mWrapBefore ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = this.bottomMargin;
        parcel.writeInt(n3);
        n3 = this.leftMargin;
        parcel.writeInt(n3);
        n3 = this.rightMargin;
        parcel.writeInt(n3);
        n3 = this.topMargin;
        parcel.writeInt(n3);
        n3 = this.height;
        parcel.writeInt(n3);
        n3 = this.width;
        parcel.writeInt(n3);
    }
}

