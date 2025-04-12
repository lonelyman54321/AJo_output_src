/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.plus.PlusOneDummyView$zzd;
import com.google.android.gms.plus.zzd;

final class PlusOneDummyView$zza
implements PlusOneDummyView$zzd {
    private Context mContext;

    private PlusOneDummyView$zza(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ PlusOneDummyView$zza(Context context, zzd zzd2) {
        this(context);
    }

    public final Drawable getDrawable(int n3) {
        return this.mContext.getResources().getDrawable(17301508);
    }

    public final boolean isValid() {
        return true;
    }
}

