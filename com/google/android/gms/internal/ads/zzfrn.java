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
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsp;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzfsz;
import com.google.android.gms.internal.ads.zzftb;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzfrn
implements BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    protected final zzfsp zza;
    private final String zzb;
    private final String zzc;
    private final zzazw zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfre zzg;
    private final long zzh;

    public zzfrn(Context object, int n3, zzazw object2, String string2, String string3, String string4, zzfre zzfre2) {
        long l2;
        HandlerThread handlerThread;
        this.zzb = string2;
        this.zzd = object2;
        this.zzc = string3;
        this.zzg = zzfre2;
        this.zzf = handlerThread = new HandlerThread("GassDGClient");
        handlerThread.start();
        this.zzh = l2 = System.currentTimeMillis();
        Looper looper = handlerThread.getLooper();
        this.zza = object2 = new zzfsp((Context)object, looper, this, this, 19621000);
        this.zze = object;
        ((BaseGmsClient)object2).checkAvailabilityAndConnect();
    }

    public static zzftb zza() {
        zzftb zzftb2 = new zzftb(null, 1);
        return zzftb2;
    }

    private final void zze(int n3, long l2, Exception exception) {
        long l3 = System.currentTimeMillis() - l2;
        this.zzg.zzc(n3, l3, exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onConnected(Bundle object) {
        Object object2;
        zzazw zzazw2;
        object = this.zzd();
        if (object == null) return;
        try {
            zzazw2 = this.zzd;
        }
        catch (Throwable throwable) {
            try {
                object2 = new Exception(throwable);
                long l2 = this.zzh;
                int n3 = 2010;
                this.zze(n3, l2, (Exception)object2);
                return;
            }
            finally {
                this.zzc();
                this.zzf.quit();
            }
        }
        String string2 = this.zzb;
        String string3 = this.zzc;
        int n4 = 1;
        object2 = new zzfsz(n4, zzazw2, string2, string3);
        object = ((zzfsu)object).zzf((zzfsz)object2);
        long l3 = this.zzh;
        int n7 = 5011;
        string3 = null;
        this.zze(n7, l3, null);
        object2 = this.zze;
        ((LinkedBlockingQueue)object2).put(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onConnectionFailed(ConnectionResult object) {
        int n3;
        long l2;
        try {
            l2 = this.zzh;
            n3 = 4012;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        this.zze(n3, l2, null);
        object = this.zze;
        zzftb zzftb2 = zzfrn.zza();
        ((LinkedBlockingQueue)object).put(zzftb2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onConnectionSuspended(int n3) {
        long l2;
        try {
            l2 = this.zzh;
            n3 = 4011;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        this.zze(n3, l2, null);
        LinkedBlockingQueue linkedBlockingQueue = this.zze;
        zzftb zzftb2 = zzfrn.zza();
        linkedBlockingQueue.put(zzftb2);
    }

    public final zzftb zzb(int n3) {
        int n4;
        n3 = 0;
        zzatc zzatc2 = null;
        Object object = this.zze;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = 50000L;
        object = ((LinkedBlockingQueue)object).poll(l2, timeUnit);
        try {
            object = (zzftb)object;
        }
        catch (InterruptedException interruptedException) {
            n4 = 2009;
            l2 = this.zzh;
            this.zze(n4, l2, interruptedException);
            object = null;
        }
        n4 = 3004;
        l2 = this.zzh;
        this.zze(n4, l2, null);
        if (object != null) {
            n3 = ((zzftb)object).zzc;
            n4 = 7;
            if (n3 == n4) {
                zzatc2 = zzatc.zzc;
                zzfre.zzg(zzatc2);
            } else {
                zzatc2 = zzatc.zzb;
                zzfre.zzg(zzatc2);
            }
        }
        if (object == null) {
            return zzfrn.zza();
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

