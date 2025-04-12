/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.flexbox;

import android.view.View;
import com.google.android.flexbox.FlexLine;
import java.util.List;

interface FlexContainer {
    public static final int NOT_SET = 255;

    public void addView(View var1);

    public void addView(View var1, int var2);

    public int getAlignContent();

    public int getAlignItems();

    public int getChildHeightMeasureSpec(int var1, int var2, int var3);

    public int getChildWidthMeasureSpec(int var1, int var2, int var3);

    public int getDecorationLengthCrossAxis(View var1);

    public int getDecorationLengthMainAxis(View var1, int var2, int var3);

    public int getFlexDirection();

    public View getFlexItemAt(int var1);

    public int getFlexItemCount();

    public List getFlexLines();

    public List getFlexLinesInternal();

    public int getFlexWrap();

    public int getJustifyContent();

    public int getLargestMainSize();

    public int getMaxLine();

    public int getPaddingBottom();

    public int getPaddingEnd();

    public int getPaddingLeft();

    public int getPaddingRight();

    public int getPaddingStart();

    public int getPaddingTop();

    public View getReorderedFlexItemAt(int var1);

    public int getSumOfCrossSize();

    public boolean isMainAxisDirectionHorizontal();

    public void onNewFlexItemAdded(View var1, int var2, int var3, FlexLine var4);

    public void onNewFlexLineAdded(FlexLine var1);

    public void removeAllViews();

    public void removeViewAt(int var1);

    public void setAlignContent(int var1);

    public void setAlignItems(int var1);

    public void setFlexDirection(int var1);

    public void setFlexLines(List var1);

    public void setFlexWrap(int var1);

    public void setJustifyContent(int var1);

    public void setMaxLine(int var1);

    public void updateViewCache(int var1, View var2);
}

