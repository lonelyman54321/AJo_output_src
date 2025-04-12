/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpr;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;

final class zzps
extends AudioDeviceCallback {
    final /* synthetic */ zzpw zza;

    public /* synthetic */ zzps(zzpw zzpw2, zzpr zzpr2) {
        this.zza = zzpw2;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] object) {
        object = this.zza;
        Context context = zzpw.zza((zzpw)object);
        zzk zzk2 = zzpw.zzb((zzpw)object);
        object = zzpw.zzd((zzpw)object);
        object = zzpp.zzc(context, zzk2, (zzpx)object);
        zzpw.zzf(this.zza, (zzpp)object);
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] object) {
        Object object2 = zzpw.zzd(this.zza);
        int n3 = zzgd.zza;
        n3 = ((AudioDeviceInfo[])object).length;
        zzpx zzpx2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            AudioDeviceInfo audioDeviceInfo = object[i3];
            boolean bl2 = zzgd.zzG(audioDeviceInfo, object2);
            if (!bl2) continue;
            object = this.zza;
            object2 = null;
            zzpw.zze((zzpw)object, null);
            break;
        }
        object = this.zza;
        object2 = zzpw.zza((zzpw)object);
        zzk zzk2 = zzpw.zzb((zzpw)object);
        zzpx2 = zzpw.zzd((zzpw)object);
        object2 = zzpp.zzc((Context)object2, zzk2, zzpx2);
        zzpw.zzf((zzpw)object, (zzpp)object2);
    }
}

