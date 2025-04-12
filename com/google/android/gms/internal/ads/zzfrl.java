/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzfsp;
import com.google.android.gms.internal.ads.zzfsq;
import com.google.android.gms.internal.ads.zzfsu;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzfrl
implements BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    protected final zzfsp zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfrl(Context object, String string2, String object2) {
        this.zzb = string2;
        this.zzc = object2;
        super("GassClient");
        this.zze = string2;
        ((Thread)((Object)string2)).start();
        Looper looper = string2.getLooper();
        this.zza = object2 = new zzfsp((Context)object, looper, this, this, 9200000);
        super();
        this.zzd = object;
        ((BaseGmsClient)object2).checkAvailabilityAndConnect();
    }

    public static zzaus zza() {
        zzatp zzatp2 = zzaus.zza();
        zzatp2.zzJ(32768L);
        return (zzaus)zzatp2.zzbn();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnected(Bundle var1_1) {
        var1_1 = this.zzd();
        if (var1_1 == null) {
            return;
        }
        try {
            var3_5 = this.zzb;
            var4_6 = this.zzc;
            var2_3 = new zzfsq(var3_5, var4_6);
            var1_1 = var1_1.zze((zzfsq)var2_3);
            var1_1 = var1_1.zza();
            var2_3 = this.zzd;
            var2_3.put(var1_1);
lbl12:
            // 3 sources

            while (true) {
                this.zzc();
                break;
            }
        }
        catch (Throwable v0) {
            try {
                var1_1 = this.zzd;
                var2_4 = zzfrl.zza();
                var1_1.put(var2_4);
                ** GOTO lbl12
            }
            catch (Throwable var1_2) {
                this.zzc();
                this.zze.quit();
                throw var1_2;
            }
            catch (InterruptedException v1) {
                ** continue;
            }
        }
        this.zze.quit();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onConnectionFailed(ConnectionResult object) {
        try {
            object = this.zzd;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        zzaus zzaus2 = zzfrl.zza();
        ((LinkedBlockingQueue)object).put(zzaus2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onConnectionSuspended(int n3) {
        LinkedBlockingQueue linkedBlockingQueue;
        try {
            linkedBlockingQueue = this.zzd;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        zzaus zzaus2 = zzfrl.zza();
        linkedBlockingQueue.put(zzaus2);
    }

    public final zzaus zzb(int n3) {
        Object object = this.zzd;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = 5000L;
        object = ((LinkedBlockingQueue)object).poll(l2, timeUnit);
        try {
            object = (zzaus)object;
        }
        catch (InterruptedException interruptedException) {
            object = null;
        }
        if (object == null) {
            object = zzfrl.zza();
        }
        return object;
    }

    public final void zzc() {
        boolean bl2;
        zzfsp zzfsp2 = this.zza;
        if (zzfsp2 != null && ((bl2 = zzfsp2.isConnected()) || (bl2 = (zzfsp2 = this.zza).isConnecting()))) {
            zzfsp2 = this.zza;
            zzfsp2.disconnect();
        }
    }

    public final zzfsu zzd() {
        zzfsp zzfsp2 = this.zza;
        try {
            return zzfsp2.zzp();
        }
        catch (DeadObjectException | IllegalStateException throwable) {
            return null;
        }
    }
}

