/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zag;
import com.google.android.gms.internal.base.zai;

final class zah
extends Drawable.ConstantState {
    private zah() {
    }

    public /* synthetic */ zah(zag zag2) {
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return zai.zaa();
    }
}

