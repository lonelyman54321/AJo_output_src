/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
package com.google.android.flexbox;

import android.os.Parcelable;

interface FlexItem
extends Parcelable {
    public static final float FLEX_BASIS_PERCENT_DEFAULT = -1.0f;
    public static final float FLEX_GROW_DEFAULT = 0.0f;
    public static final float FLEX_SHRINK_DEFAULT = 1.0f;
    public static final float FLEX_SHRINK_NOT_SET = 0.0f;
    public static final int MAX_SIZE = 0xFFFFFF;
    public static final int ORDER_DEFAULT = 1;

    public int getAlignSelf();

    public float getFlexBasisPercent();

    public float getFlexGrow();

    public float getFlexShrink();

    public int getHeight();

    public int getMarginBottom();

    public int getMarginEnd();

    public int getMarginLeft();

    public int getMarginRight();

    public int getMarginStart();

    public int getMarginTop();

    public int getMaxHeight();

    public int getMaxWidth();

    public int getMinHeight();

    public int getMinWidth();

    public int getOrder();

    public int getWidth();

    public boolean isWrapBefore();

    public void setAlignSelf(int var1);

    public void setFlexBasisPercent(float var1);

    public void setFlexGrow(float var1);

    public void setFlexShrink(float var1);

    public void setHeight(int var1);

    public void setMaxHeight(int var1);

    public void setMaxWidth(int var1);

    public void setMinHeight(int var1);

    public void setMinWidth(int var1);

    public void setOrder(int var1);

    public void setWidth(int var1);

    public void setWrapBefore(boolean var1);
}

