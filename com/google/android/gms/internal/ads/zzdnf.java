/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcrk;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdnc;
import com.google.android.gms.internal.ads.zzdnd;
import com.google.android.gms.internal.ads.zzdne;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdsd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdnf {
    private final zzdsd zza;
    private final zzdqs zzb;
    private final zzcrk zzc;
    private final zzdmb zzd;

    public zzdnf(zzdsd zzdsd2, zzdqs zzdqs2, zzcrk zzcrk2, zzdmb zzdmb2) {
        this.zza = zzdsd2;
        this.zzb = zzdqs2;
        this.zzc = zzcrk2;
        this.zzd = zzdmb2;
    }

    public final View zza() {
        Object object = this.zza;
        WeakReference<Object> weakReference = zzq.zzc();
        object = ((zzdsd)object).zza((zzq)((Object)weakReference), null, null);
        weakReference = object;
        ((View)object).setVisibility(8);
        weakReference = new WeakReference<Object>(this);
        object.zzag("/sendMessageToSdk", (zzblp)((Object)weakReference));
        weakReference = new WeakReference<Object>(this);
        object.zzag("/adMuted", (zzblp)((Object)weakReference));
        weakReference = new WeakReference<Object>(object);
        zzblp zzblp2 = new zzdnc(this);
        this.zzb.zzm(weakReference, "/loadHtml", zzblp2);
        weakReference = new WeakReference<Object>(object);
        zzblp2 = new zzdnd(this);
        this.zzb.zzm(weakReference, "/showOverlay", zzblp2);
        weakReference = new WeakReference<Object>(object);
        zzblp2 = new zzdne(this);
        this.zzb.zzm(weakReference, "/hideOverlay", zzblp2);
        return (View)object;
    }

    public final /* synthetic */ void zzb(zzchd zzchd2, Map map2) {
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final /* synthetic */ void zzc(zzchd zzchd2, Map map2) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map object, boolean bl2, int n3, String string2, String string3) {
        HashMap hashMap = p3.a("messageType", "htmlLoaded");
        String string4 = "id";
        object = (String)object.get(string4);
        hashMap.put(string4, object);
        this.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(zzchd zzchd2, Map map2) {
        zzm.zzi("Showing native ads overlay.");
        zzchd2.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzchd zzchd2, Map map2) {
        zzm.zzi("Hiding native ads overlay.");
        zzchd2.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}

