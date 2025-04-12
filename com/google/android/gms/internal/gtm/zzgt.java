/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.tagmanager.zzck;
import java.util.Date;
import java.util.Map;

public final class zzgt
implements Clock {
    private final Bundle zza;
    private final String zzb;
    private final Date zzc;
    private final String zzd;
    private Map zze;
    private boolean zzf;
    private final zzck zzg;

    public zzgt(String string2, Bundle bundle, String string3, Date date, boolean bl2, zzck zzck2) {
        this.zzb = string2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zza = bundle;
        this.zzc = date;
        this.zzd = string3;
        this.zzf = bl2;
        this.zzg = zzck2;
    }

    public final long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public final long currentTimeMillis() {
        return this.zzc.getTime();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }

    public final Bundle zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        Object object = this.zze;
        if (object == null) {
            object = this.zzg;
            object = object.zzb();
            try {
                this.zze = object;
            }
            catch (RemoteException remoteException) {
                object = String.valueOf(remoteException.getMessage());
                String string2 = "Error calling measurement proxy:";
                object = string2.concat((String)object);
                zzhi.zza((String)object);
            }
        }
        return this.zze;
    }

    public final void zze(boolean bl2) {
        this.zzf = false;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}

