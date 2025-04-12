/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdmw;
import com.google.android.gms.internal.ads.zzdqs;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdmx
implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdqs zzd;
    private final Clock zze;
    private zzbjp zzf;
    private zzblp zzg;

    public zzdmx(zzdqs zzdqs2, Clock clock) {
        this.zzd = zzdqs2;
        this.zze = clock;
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (weakReference = (View)weakReference.get()) != null) {
            weakReference.setClickable(false);
            weakReference.setOnClickListener(null);
            this.zzc = null;
        }
    }

    public final void onClick(View object) {
        Object object2 = this.zzc;
        if (object2 != null && (object2 = ((Reference)object2).get()) == object) {
            object = this.zza;
            if (object != null && (object = this.zzb) != null) {
                object = new HashMap();
                object2 = this.zza;
                ((HashMap)object).put("id", object2);
                long l2 = this.zze.currentTimeMillis();
                long l3 = this.zzb;
                String string2 = "time_interval";
                object2 = String.valueOf(l2 -= l3);
                ((HashMap)object).put(string2, object2);
                ((HashMap)object).put("messageType", "onePointFiveClick");
                object2 = this.zzd;
                String string3 = "sendMessageToNativeJs";
                ((zzdqs)object2).zzj(string3, (Map)object);
            }
            this.zzd();
        }
    }

    public final zzbjp zza() {
        return this.zzf;
    }

    public final void zzb() {
        Object object = this.zzf;
        if (object != null && (object = this.zzb) != null) {
            this.zzd();
            object = this.zzf;
            try {
                object.zze();
                return;
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
    }

    public final void zzc(zzbjp zzbjp2) {
        this.zzf = zzbjp2;
        zzblp zzblp2 = this.zzg;
        String string2 = "/unconfirmedClick";
        if (zzblp2 != null) {
            zzdqs zzdqs2 = this.zzd;
            zzdqs2.zzn(string2, zzblp2);
        }
        this.zzg = zzblp2 = new zzdmw(this, zzbjp2);
        this.zzd.zzl(string2, zzblp2);
    }
}

