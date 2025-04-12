/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.internal.ads.zzchd;

public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzchd object) {
        int n3;
        Context context;
        ViewGroup.LayoutParams layoutParams;
        this.zzb = layoutParams = object.getLayoutParams();
        layoutParams = object.getParent();
        this.zzd = context = object.zzE();
        if (layoutParams != null && (n3 = layoutParams instanceof ViewGroup) != 0) {
            layoutParams = (ViewGroup)layoutParams;
            this.zzc = layoutParams;
            context = object.zzF();
            this.zza = n3 = layoutParams.indexOfChild((View)context);
            context = object.zzF();
            layoutParams.removeView((View)context);
            object.zzaq(true);
            return;
        }
        object = new zzg("Could not get the parent of the WebView for an overlay.");
        throw object;
    }
}

