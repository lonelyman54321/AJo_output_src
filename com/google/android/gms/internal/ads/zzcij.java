/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzcic;
import com.google.android.gms.internal.ads.zzcih;
import com.google.android.gms.internal.ads.zzcii;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzfuv;

public final class zzcij {
    private final zzcik zza;
    private final zzcii zzb;

    public zzcij(zzcik zzcik2, zzcii zzcii2) {
        this.zzb = zzcii2;
        this.zza = zzcik2;
    }

    public String getClickSignals(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "";
        if (bl2) {
            zze.zza("Click string is empty, not proceeding.");
            return string3;
        }
        zzcik zzcik2 = this.zza;
        Object object = zzcik2.zzI();
        if (object == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return string3;
        }
        if ((object = ((zzaxd)object).zzc()) == null) {
            zze.zza("Signals object is empty, ignoring.");
            return string3;
        }
        if ((zzcik2 = zzcik2.getContext()) == null) {
            zze.zza("Context is null, ignoring.");
            return string3;
        }
        zzcik2 = this.zza;
        string3 = zzcik2.getContext();
        Activity activity = zzcik2.zzi();
        zzcik2 = (View)zzcik2;
        return object.zzf((Context)string3, string2, (View)zzcik2, activity);
    }

    public String getViewSignals() {
        zzcik zzcik2 = this.zza;
        Object object = zzcik2.zzI();
        String string2 = "";
        if (object == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return string2;
        }
        if ((object = ((zzaxd)object).zzc()) == null) {
            zze.zza("Signals object is empty, ignoring.");
            return string2;
        }
        if ((zzcik2 = zzcik2.getContext()) == null) {
            zze.zza("Context is null, ignoring.");
            return string2;
        }
        zzcik2 = this.zza;
        string2 = zzcik2.getContext();
        Activity activity = zzcik2.zzi();
        zzcik2 = (View)zzcik2;
        return object.zzh((Context)string2, (View)zzcik2, activity);
    }

    public void notify(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            zzm.zzj("URL is empty, ignoring message");
            return;
        }
        zzfuv zzfuv2 = zzt.zza;
        zzcih zzcih2 = new zzcih(this, string2);
        zzfuv2.post(zzcih2);
    }

    public final /* synthetic */ void zza(String string2) {
        string2 = Uri.parse((String)string2);
        zzchl zzchl2 = ((zzcic)this.zzb.zza).zzaO();
        if (zzchl2 == null) {
            zzm.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        zzchl2.zzj((Uri)string2);
    }
}

