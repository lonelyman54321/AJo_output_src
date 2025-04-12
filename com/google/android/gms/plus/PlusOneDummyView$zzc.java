/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.plus.PlusOneDummyView$zzd;
import com.google.android.gms.plus.zzd;

final class PlusOneDummyView$zzc
implements PlusOneDummyView$zzd {
    private Context mContext;

    private PlusOneDummyView$zzc(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ PlusOneDummyView$zzc(Context context, zzd zzd2) {
        this(context);
    }

    public final Drawable getDrawable(int n3) {
        int n4;
        String string2 = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? "ic_plusone_standard_off_client" : "ic_plusone_tall_off_client") : "ic_plusone_medium_off_client") : "ic_plusone_small_off_client";
        Resources resources = this.mContext.getResources();
        String string3 = this.mContext.getPackageName();
        n3 = resources.getIdentifier(string2, "drawable", string3);
        return this.mContext.getResources().getDrawable(n3);
    }

    public final boolean isValid() {
        Resources resources = this.mContext.getResources();
        String string2 = this.mContext.getPackageName();
        String string3 = "drawable";
        int n3 = resources.getIdentifier("ic_plusone_small_off_client", string3, string2);
        string2 = this.mContext.getResources();
        String string4 = this.mContext.getPackageName();
        int n4 = string2.getIdentifier("ic_plusone_medium_off_client", string3, string4);
        string4 = this.mContext.getResources();
        String string5 = this.mContext.getPackageName();
        int n7 = string4.getIdentifier("ic_plusone_tall_off_client", string3, string5);
        string5 = this.mContext.getResources();
        String string6 = this.mContext.getPackageName();
        String string7 = "ic_plusone_standard_off_client";
        int n8 = string5.getIdentifier(string7, string3, string6);
        return n3 != 0 && n4 != 0 && n7 != 0 && n8 != 0;
    }
}

