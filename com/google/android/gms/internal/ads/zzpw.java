/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpq;
import com.google.android.gms.internal.ads.zzps;
import com.google.android.gms.internal.ads.zzpt;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzrh;
import com.google.android.gms.internal.ads.zzrz;

public final class zzpw {
    private final Context zza;
    private final Handler zzb;
    private final zzps zzc;
    private final BroadcastReceiver zzd;
    private final zzpt zze;
    private zzpp zzf;
    private zzpx zzg;
    private zzk zzh;
    private boolean zzi;
    private final zzrh zzj;

    public zzpw(Context context, zzrh object, zzk zzk2, zzpx object2) {
        this.zza = context = context.getApplicationContext();
        this.zzj = object;
        this.zzh = zzk2;
        this.zzg = object2;
        object = zzgd.zzy();
        object2 = null;
        super((Looper)object, null);
        this.zzb = zzk2;
        int n3 = zzgd.zza;
        int n4 = 23;
        if (n3 >= n4) {
            super(this, null);
        } else {
            n3 = 0;
            object = null;
        }
        this.zzc = object;
        super(this, null);
        this.zzd = object;
        object = zzpp.zza();
        if (object != null) {
            context = context.getContentResolver();
            super(this, (Handler)zzk2, (ContentResolver)context, (Uri)object);
        }
        this.zze = object2;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzpw zzpw2) {
        return zzpw2.zza;
    }

    public static /* bridge */ /* synthetic */ zzk zzb(zzpw zzpw2) {
        return zzpw2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzpx zzd(zzpw zzpw2) {
        return zzpw2.zzg;
    }

    public static /* bridge */ /* synthetic */ void zze(zzpw zzpw2, zzpx zzpx2) {
        zzpw2.zzg = null;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzpw zzpw2, zzpp zzpp2) {
        zzpw2.zzj(zzpp2);
    }

    private final void zzj(zzpp zzpp2) {
        Object object;
        boolean bl2 = this.zzi;
        if (bl2 && !(bl2 = zzpp2.equals(object = this.zzf))) {
            this.zzf = zzpp2;
            object = this.zzj.zza;
            ((zzrz)object).zzJ(zzpp2);
        }
    }

    public final zzpp zzc() {
        zzpx zzpx2;
        Object object;
        Context context;
        int n3;
        int n4 = this.zzi;
        if (n4 != 0) {
            zzpp zzpp2 = this.zzf;
            zzpp2.getClass();
            return zzpp2;
        }
        this.zzi = n4 = 1;
        Object object2 = this.zze;
        if (object2 != null) {
            object2.zza();
        }
        if ((n4 = zzgd.zza) >= (n3 = 23) && (object2 = this.zzc) != null) {
            context = this.zza;
            object = this.zzb;
            zzpq.zza(context, (AudioDeviceCallback)object2, object);
        }
        object2 = this.zzd;
        n3 = 0;
        context = null;
        if (object2 != null) {
            object2 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
            object = this.zza;
            zzpx2 = this.zzd;
            Handler handler = this.zzb;
            context = object.registerReceiver((BroadcastReceiver)zzpx2, (IntentFilter)object2, null, handler);
        }
        object2 = this.zza;
        object = this.zzh;
        zzpx2 = this.zzg;
        object2 = zzpp.zzd((Context)object2, (Intent)context, (zzk)object, zzpx2);
        this.zzf = object2;
        return object2;
    }

    public final void zzg(zzk object) {
        this.zzh = object;
        zzpx zzpx2 = this.zzg;
        object = zzpp.zzc(this.zza, (zzk)object, zzpx2);
        this.zzj((zzpp)object);
    }

    public final void zzh(AudioDeviceInfo object) {
        boolean bl2;
        Object object2 = this.zzg;
        zzpx zzpx2 = null;
        if (object2 == null) {
            bl2 = false;
            object2 = null;
        } else {
            object2 = ((zzpx)object2).zza;
        }
        bl2 = zzgd.zzG(object, object2);
        if (bl2) {
            return;
        }
        if (object != null) {
            zzpx2 = new zzpx((AudioDeviceInfo)object);
        }
        this.zzg = zzpx2;
        object = this.zza;
        object2 = this.zzh;
        object = zzpp.zzc((Context)object, (zzk)object2, zzpx2);
        this.zzj((zzpp)object);
    }

    public final void zzi() {
        Context context;
        int n3 = this.zzi;
        if (n3 == 0) {
            return;
        }
        Object object = null;
        this.zzf = null;
        n3 = zzgd.zza;
        int n4 = 23;
        if (n3 >= n4 && (object = this.zzc) != null) {
            context = this.zza;
            zzpq.zzb(context, (AudioDeviceCallback)object);
        }
        if ((object = this.zzd) != null) {
            context = this.zza;
            context.unregisterReceiver((BroadcastReceiver)object);
        }
        if ((object = this.zze) != null) {
            ((zzpt)((Object)object)).zzb();
        }
        this.zzi = false;
    }
}

