/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzctt;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzfgu;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzctv
extends zzcsf {
    private final zzbjm zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzctv(zzcuo zzcuo2, zzbjm zzbjm2, Runnable runnable2, Executor executor) {
        super(zzcuo2);
        this.zzc = zzbjm2;
        this.zzd = runnable2;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference object) {
        if ((object = (Runnable)((AtomicReference)object).getAndSet(null)) != null) {
            object.run();
        }
    }

    public final int zza() {
        return 0;
    }

    public final View zzc() {
        return null;
    }

    public final zzdq zzd() {
        return null;
    }

    public final zzfgu zze() {
        return null;
    }

    public final zzfgu zzf() {
        return null;
    }

    public final void zzg() {
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq2) {
    }

    public final void zzj() {
        Runnable runnable2 = this.zzd;
        Object object = new AtomicReference(runnable2);
        runnable2 = new zzctt((AtomicReference)object);
        object = new zzctu(this, runnable2);
        this.zze.execute((Runnable)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void zzk(Runnable runnable2) {
        Object object;
        try {
            object = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzctv.zzi(((zzctt)runnable2).zza);
            return;
        }
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(runnable2);
        boolean bl2 = object.zze(iObjectWrapper);
        if (bl2) return;
        object = runnable2;
        object = (zzctt)runnable2;
        object = ((zzctt)object).zza;
        zzctv.zzi((AtomicReference)object);
    }
}

