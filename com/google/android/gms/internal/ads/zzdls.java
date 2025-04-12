/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.zzbru;

public final class zzdls
extends zzdp {
    private final Object zza;
    private final zzdq zzb;
    private final zzbru zzc;

    public zzdls(zzdq zzdq2, zzbru zzbru2) {
        Object object;
        this.zza = object = new Object();
        this.zzb = zzdq2;
        this.zzc = zzbru2;
    }

    public final float zze() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final float zzf() {
        zzbru zzbru2 = this.zzc;
        if (zzbru2 != null) {
            return zzbru2.zzg();
        }
        return 0.0f;
    }

    public final float zzg() {
        zzbru zzbru2 = this.zzc;
        if (zzbru2 != null) {
            return zzbru2.zzh();
        }
        return 0.0f;
    }

    public final int zzh() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdt zzi() {
        Object object = this.zza;
        synchronized (object) {
            try {
                Object object2 = this.zzb;
                if (object2 == null) return null;
                return object2.zzi();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzj(boolean bl2) {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final void zzk() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final void zzl() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(zzdt zzdt2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        zzdq zzdq2 = this.zzb;
                        if (zzdq2 == null) break block3;
                        zzdq2.zzm(zzdt2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzn() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final boolean zzo() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final boolean zzp() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }

    public final boolean zzq() {
        RemoteException remoteException = new RemoteException();
        throw remoteException;
    }
}

