/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzcds;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzchd;

public final class zzcdt {
    private final Context zza;
    private final zzcee zzb;
    private final ViewGroup zzc;
    private zzcds zzd;

    public zzcdt(Context context, ViewGroup viewGroup, zzchd zzchd2) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context.getApplicationContext();
        }
        this.zza = context;
        this.zzc = viewGroup;
        this.zzb = zzchd2;
        this.zzd = null;
    }

    public final zzcds zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcds zzcds2 = this.zzd;
        if (zzcds2 != null) {
            return zzcds2.zzl();
        }
        return null;
    }

    public final void zzc(int n3, int n4, int n7, int n8) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcds zzcds2 = this.zzd;
        if (zzcds2 != null) {
            zzcds2.zzF(n3, n4, n7, n8);
        }
    }

    public final void zzd(int n3, int n4, int n7, int n8, int n10, boolean bl2, zzced zzced2) {
        Object object = this.zzd;
        if (object != null) {
            return;
        }
        object = this.zzb.zzm().zza();
        zzbfb zzbfb2 = this.zzb.zzk();
        String[] stringArray = new String[]{"vpr2"};
        zzbew.zza((zzbfe)object, zzbfb2, stringArray);
        Context context = this.zza;
        zzcee zzcee2 = this.zzb;
        zzbfe zzbfe2 = zzcee2.zzm().zza();
        this.zzd = object = new zzcds(context, zzcee2, n10, bl2, zzbfe2, zzced2);
        zzbfb2 = this.zzc;
        int n14 = -1;
        stringArray = new ViewGroup.LayoutParams(n14, n14);
        zzbfb2.addView((View)object, 0, (ViewGroup.LayoutParams)stringArray);
        this.zzd.zzF(n3, n4, n7, n8);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcds zzcds2 = this.zzd;
        if (zzcds2 != null) {
            zzcds2.zzo();
            zzcds2 = this.zzc;
            zzcds zzcds3 = this.zzd;
            zzcds2.removeView((View)zzcds3);
            zzcds2 = null;
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcds zzcds2 = this.zzd;
        if (zzcds2 != null) {
            zzcds2.zzu();
        }
    }

    public final void zzg(int n3) {
        zzcds zzcds2 = this.zzd;
        if (zzcds2 != null) {
            zzcds2.zzC(n3);
        }
    }
}

