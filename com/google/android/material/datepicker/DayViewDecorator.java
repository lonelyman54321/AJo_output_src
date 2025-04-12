/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

public abstract class DayViewDecorator
implements Parcelable {
    public ColorStateList getBackgroundColor(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public Drawable getCompoundDrawableRight(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public Drawable getCompoundDrawableTop(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public CharSequence getContentDescription(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3, CharSequence charSequence) {
        return charSequence;
    }

    public ColorStateList getTextColor(Context context, int n3, int n4, int n7, boolean bl2, boolean bl3) {
        return null;
    }

    public void initialize(Context context) {
    }
}

