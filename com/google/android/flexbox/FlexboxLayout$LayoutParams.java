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
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayout$LayoutParams$1;
import com.google.android.flexbox.R$styleable;

public class FlexboxLayout$LayoutParams
extends ViewGroup.MarginLayoutParams
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
    private int mOrder;
    private boolean mWrapBefore;

    static {
        FlexboxLayout$LayoutParams$1 flexboxLayout$LayoutParams$1 = new FlexboxLayout$LayoutParams$1();
        CREATOR = flexboxLayout$LayoutParams$1;
    }

    public FlexboxLayout$LayoutParams(int n3, int n4) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n4);
        super(layoutParams);
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = n3 = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = n3;
        this.mMinHeight = n3;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        int n3;
        float f6;
        int n4;
        float f7;
        int n7;
        this.mOrder = n7 = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = f7 = 1.0f;
        this.mAlignSelf = n4 = -1;
        this.mFlexBasisPercent = f6 = -1.0f;
        this.mMinWidth = n4;
        this.mMinHeight = n4;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
        int[] nArray = R$styleable.FlexboxLayout_Layout;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n8 = R$styleable.FlexboxLayout_Layout_layout_order;
        this.mOrder = n8 = context.getInt(n8, n7);
        n8 = R$styleable.FlexboxLayout_Layout_layout_flexGrow;
        this.mFlexGrow = f5 = context.getFloat(n8, 0.0f);
        n8 = R$styleable.FlexboxLayout_Layout_layout_flexShrink;
        this.mFlexShrink = f5 = context.getFloat(n8, f7);
        n8 = R$styleable.FlexboxLayout_Layout_layout_alignSelf;
        this.mAlignSelf = n8 = context.getInt(n8, n4);
        n8 = R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent;
        this.mFlexBasisPercent = f5 = context.getFraction(n8, n7, n7, f6);
        n8 = R$styleable.FlexboxLayout_Layout_layout_minWidth;
        this.mMinWidth = n8 = context.getDimensionPixelSize(n8, n4);
        n8 = R$styleable.FlexboxLayout_Layout_layout_minHeight;
        this.mMinHeight = n8 = context.getDimensionPixelSize(n8, n4);
        n8 = R$styleable.FlexboxLayout_Layout_layout_maxWidth;
        this.mMaxWidth = n8 = context.getDimensionPixelSize(n8, n3);
        n8 = R$styleable.FlexboxLayout_Layout_layout_maxHeight;
        this.mMaxHeight = n8 = context.getDimensionPixelSize(n8, n3);
        n8 = R$styleable.FlexboxLayout_Layout_layout_wrapBefore;
        n8 = (int)(context.getBoolean(n8, false) ? 1 : 0);
        this.mWrapBefore = n8;
        context.recycle();
    }

    public FlexboxLayout$LayoutParams(Parcel parcel) {
        int n3;
        float f5;
        float f6;
        int n4;
        int n7;
        int n8 = 0;
        super(0, 0);
        this.mOrder = n7 = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = n4 = -1;
        this.mFlexBasisPercent = f6 = -1.0f;
        this.mMinWidth = n4;
        this.mMinHeight = n4;
        this.mMaxWidth = n4 = 0xFFFFFF;
        this.mMaxHeight = n4;
        this.mOrder = n4 = parcel.readInt();
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
            n8 = 1;
        }
        this.mWrapBefore = n8;
        this.bottomMargin = n8 = parcel.readInt();
        this.leftMargin = n8 = parcel.readInt();
        this.rightMargin = n8 = parcel.readInt();
        this.topMargin = n8 = parcel.readInt();
        this.height = n8 = parcel.readInt();
        this.width = n3 = parcel.readInt();
    }

    public FlexboxLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        int n3;
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = n3 = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = n3;
        this.mMinHeight = n3;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        int n3;
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = n3 = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = n3;
        this.mMinHeight = n3;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
    }

    public FlexboxLayout$LayoutParams(FlexboxLayout$LayoutParams flexboxLayout$LayoutParams) {
        super((ViewGroup.MarginLayoutParams)flexboxLayout$LayoutParams);
        boolean bl2;
        float f5;
        int n3;
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = n3 = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = n3;
        this.mMinHeight = n3;
        this.mMaxWidth = n3 = 0xFFFFFF;
        this.mMaxHeight = n3;
        this.mOrder = n3 = flexboxLayout$LayoutParams.mOrder;
        this.mFlexGrow = f5 = flexboxLayout$LayoutParams.mFlexGrow;
        this.mFlexShrink = f5 = flexboxLayout$LayoutParams.mFlexShrink;
        this.mAlignSelf = n3 = flexboxLayout$LayoutParams.mAlignSelf;
        this.mFlexBasisPercent = f5 = flexboxLayout$LayoutParams.mFlexBasisPercent;
        this.mMinWidth = n3 = flexboxLayout$LayoutParams.mMinWidth;
        this.mMinHeight = n3 = flexboxLayout$LayoutParams.mMinHeight;
        this.mMaxWidth = n3 = flexboxLayout$LayoutParams.mMaxWidth;
        this.mMaxHeight = n3 = flexboxLayout$LayoutParams.mMaxHeight;
        this.mWrapBefore = bl2 = flexboxLayout$LayoutParams.mWrapBefore;
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
        return this.mOrder;
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
        this.mOrder = n3;
    }

    public void setWidth(int n3) {
        this.width = n3;
    }

    public void setWrapBefore(boolean bl2) {
        this.mWrapBefore = bl2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.mOrder;
        parcel.writeInt(n3);
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

