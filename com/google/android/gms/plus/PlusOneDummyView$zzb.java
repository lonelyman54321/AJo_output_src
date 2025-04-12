/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.drawable.Drawable
 */
package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.google.android.gms.plus.PlusOneDummyView$zzd;
import com.google.android.gms.plus.zzd;

final class PlusOneDummyView$zzb
implements PlusOneDummyView$zzd {
    private Context mContext;

    private PlusOneDummyView$zzb(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ PlusOneDummyView$zzb(Context context, zzd zzd2) {
        this(context);
    }

    public final Drawable getDrawable(int n3) {
        int n4;
        Context context;
        String string2 = "com.google.android.gms";
        try {
            context = this.mContext;
            n4 = 4;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
        context = context.createPackageContext(string2, n4);
        context = context.getResources();
        String string3 = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? "ic_plusone_standard" : "ic_plusone_tall") : "ic_plusone_medium") : "ic_plusone_small";
        String string4 = "drawable";
        n3 = context.getIdentifier(string3, string4, string2);
        return context.getDrawable(n3);
    }

    public final boolean isValid() {
        int n3;
        String string2;
        Context context;
        try {
            context = this.mContext;
            string2 = "com.google.android.gms";
            n3 = 4;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        context = context.createPackageContext(string2, n3);
        context.getResources();
        return true;
    }
}

