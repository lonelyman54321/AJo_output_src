/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzpn;

final class zzhl
implements Runnable {
    private final /* synthetic */ zzbz zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzhi zzc;

    public zzhl(zzhi zzhi2, zzbz zzbz2, ServiceConnection serviceConnection2) {
        this.zza = zzbz2;
        this.zzb = serviceConnection2;
        this.zzc = zzhi2;
    }

    public final void run() {
        Object object = this.zzc;
        zzhj zzhj2 = ((zzhi)object).zza;
        object = zzhi.zza((zzhi)object);
        Object object2 = this.zza;
        ServiceConnection serviceConnection2 = this.zzb;
        object2 = zzhj2.zza((String)object, (zzbz)object2);
        zzhj2.zza.zzl().zzv();
        Object object3 = zzhj2.zza;
        ((zzic)object3).zzaa();
        if (object2 != null) {
            object3 = "install_begin_timestamp_seconds";
            long l2 = 0L;
            long l3 = object2.getLong((String)object3, l2);
            long l4 = 1000L;
            long l7 = (l3 *= l4) - l2;
            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 == false) {
                object = zzhj2.zza.zzj().zzr();
                object2 = "Service response is missing Install Referrer install timestamp";
                ((zzgq)object).zza((String)object2);
            } else {
                boolean bl2;
                object3 = object2.getString("install_referrer");
                if (object3 != null && !(bl2 = ((String)object3).isEmpty())) {
                    zzhj2.zza.zzj().zzq().zza("InstallReferrer API result", object3);
                    Object object5 = zzhj2.zza.zzv();
                    String string2 = "?";
                    object3 = Uri.parse((String)string2.concat((String)object3));
                    object3 = ((zzpn)object5).zza((Uri)object3);
                    if (object3 == null) {
                        object = zzhj2.zza.zzj().zzg();
                        object2 = "No campaign params defined in Install Referrer result";
                        ((zzgq)object).zza((String)object2);
                    } else {
                        String string3;
                        long l8;
                        long l12;
                        long l14;
                        long l15;
                        object5 = "gclid";
                        bl2 = object3.containsKey((String)object5);
                        if ((bl2 || (bl2 = object3.containsKey((String)(object5 = "gbraid")))) && (l15 = (l14 = (l12 = object2.getLong((String)(object5 = "referrer_click_timestamp_server_seconds"), l2) * l4) - l2) == 0L ? 0 : (l14 < 0L ? -1 : 1)) > 0) {
                            object2 = "click_timestamp";
                            object3.putLong((String)object2, l12);
                        }
                        if ((l15 = (l8 = l3 - (l2 = ((zzhf)(object2 = zzhj2.zza.zzn().zzd)).zza())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) {
                            object2 = zzhj2.zza.zzj().zzq();
                            string3 = "Logging Install Referrer campaign from module while it may have already been logged.";
                            ((zzgq)object2).zza(string3);
                        }
                        if ((l15 = (long)((zzic)(object2 = zzhj2.zza)).zzae()) != false) {
                            zzhj2.zza.zzn().zzd.zza(l3);
                            object2 = zzhj2.zza.zzj().zzq();
                            String string4 = "referrer API v2";
                            ((zzgq)object2).zza("Logging Install Referrer campaign from gmscore with ", string4);
                            object3.putString("_cis", string4);
                            object2 = zzhj2.zza.zzp();
                            string3 = "auto";
                            string4 = "_cmp";
                            ((zzju)object2).zza(string3, string4, (Bundle)object3, (String)object);
                        }
                    }
                } else {
                    object = zzhj2.zza.zzj().zzg();
                    object2 = "No referrer defined in Install Referrer response";
                    ((zzgq)object).zza((String)object2);
                }
            }
        }
        if (serviceConnection2 != null) {
            object = ConnectionTracker.getInstance();
            zzhj2 = zzhj2.zza.zza();
            ((ConnectionTracker)object).unbindService((Context)zzhj2, serviceConnection2);
        }
    }
}

