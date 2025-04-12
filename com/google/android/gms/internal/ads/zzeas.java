/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzeaq;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class zzeas
implements BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    protected final zzccn zza;
    protected final Object zzb;
    protected boolean zzc;
    protected boolean zzd;
    protected zzbxu zze;
    protected zzbwr zzf;

    public zzeas() {
        Object object = new zzccn();
        this.zza = object;
        this.zzb = object = new Object();
        this.zzc = false;
        this.zzd = false;
    }

    public static void zzc(Context context, ListenableFuture listenableFuture, Executor executor) {
        Object object = (Boolean)zzbgc.zzj.zze();
        boolean bl2 = (Boolean)object;
        if (!bl2 && !(bl2 = ((Boolean)(object = (Boolean)zzbgc.zzh.zze())).booleanValue())) {
            return;
        }
        object = new zzeaq(context);
        zzgft.zzr(listenableFuture, (zzgfp)object, executor);
    }

    public void onConnectionFailed(ConnectionResult object) {
        zzm.zze("Disconnected from remote ad request service.");
        object = new zzebh(1);
        this.zza.zzd((Throwable)object);
    }

    public final void onConnectionSuspended(int n3) {
        zzm.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    zzbwr zzbwr2;
                    boolean bl2 = true;
                    try {
                        this.zzd = bl2;
                        zzbwr2 = this.zzf;
                        bl2 = zzbwr2.isConnected();
                        if (!bl2 && !(bl2 = (zzbwr2 = this.zzf).isConnecting())) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    zzbwr2 = this.zzf;
                    zzbwr2.disconnect();
                }
                Binder.flushPendingCommands();
                return;
            }
            throw throwable2;
        }
    }
}

