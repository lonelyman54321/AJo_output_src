/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;

interface PageIndicator
extends ViewPager$h {
    public void notifyDataSetChanged();

    public /* synthetic */ void onPageScrollStateChanged(int var1);

    public /* synthetic */ void onPageScrolled(int var1, float var2, int var3);

    public /* synthetic */ void onPageSelected(int var1);

    public void setCurrentItem(int var1);

    public void setOnPageChangeListener(ViewPager$h var1);

    public void setViewPager(ViewPager var1);

    public void setViewPager(ViewPager var1, int var2);
}

