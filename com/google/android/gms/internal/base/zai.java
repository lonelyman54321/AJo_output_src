/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zah;

final class zai
extends Drawable {
    private static final zai zaa;
    private static final zah zab;

    static {
        Object object;
        zaa = object = new zai();
        object = new zah(null);
        zab = object;
    }

    private zai() {
    }

    public static /* bridge */ /* synthetic */ zai zaa() {
        return zaa;
    }

    public final void draw(Canvas canvas) {
    }

    public final Drawable.ConstantState getConstantState() {
        return zab;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int n3) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

