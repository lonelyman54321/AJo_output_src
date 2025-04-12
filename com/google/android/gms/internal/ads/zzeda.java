/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzebh;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzeda
implements BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    protected final zzccn zza;
    protected boolean zzb;
    protected boolean zzc;
    protected zzbwu zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    public zzeda() {
        zzccn zzccn2;
        this.zza = zzccn2 = new zzccn();
        this.zzb = false;
        this.zzc = false;
    }

    public final void onConnectionFailed(ConnectionResult object) {
        Serializable serializable = Locale.US;
        int n3 = ((ConnectionResult)object).getErrorCode();
        serializable = new StringBuilder("Remote ad service connection failed, cause: ");
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(".");
        object = ((StringBuilder)serializable).toString();
        zzm.zze((String)object);
        serializable = new zzebh(1, (String)object);
        this.zza.zzd((Throwable)serializable);
    }

    public void onConnectionSuspended(int n3) {
        Serializable serializable = Locale.US;
        serializable = new StringBuilder("Remote ad service connection suspended, cause: ");
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(".");
        String string2 = ((StringBuilder)serializable).toString();
        zzm.zze(string2);
        serializable = new zzebh(1, string2);
        this.zza.zzd((Throwable)serializable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                zzbwu zzbwu2;
                block3: {
                    try {
                        zzbwu2 = this.zzd;
                        if (zzbwu2 != null) break block3;
                        Context context = this.zze;
                        Looper looper = this.zzf;
                        this.zzd = zzbwu2 = new zzbwu(context, looper, this, this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzbwu2 = this.zzd;
                zzbwu2.checkAvailabilityAndConnect();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                zzbwu zzbwu2;
                boolean bl2;
                block5: {
                    bl2 = true;
                    try {
                        this.zzc = bl2;
                        zzbwu2 = this.zzd;
                        if (zzbwu2 != null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                bl2 = zzbwu2.isConnected();
                if (bl2 || (bl2 = (zzbwu2 = this.zzd).isConnecting())) {
                    zzbwu2 = this.zzd;
                    zzbwu2.disconnect();
                }
                Binder.flushPendingCommands();
                return;
            }
            throw throwable2;
        }
    }
}

