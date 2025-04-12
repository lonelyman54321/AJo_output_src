/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zak;

final class zaj
extends Drawable.ConstantState {
    int zaa;
    int zab;

    public zaj(zaj zaj2) {
        if (zaj2 != null) {
            int n3;
            int n4;
            this.zaa = n4 = zaj2.zaa;
            this.zab = n3 = zaj2.zab;
        }
    }

    public final int getChangingConfigurations() {
        return this.zaa;
    }

    public final Drawable newDrawable() {
        zak zak2 = new zak(this);
        return zak2;
    }
}

