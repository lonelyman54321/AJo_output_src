/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzni;
import com.google.android.gms.measurement.internal.zznk;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznm;
import com.google.android.gms.measurement.internal.zznn;

public final class zznj
implements ServiceConnection,
BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    final /* synthetic */ zzme zza;
    private volatile boolean zzb;
    private volatile zzgn zzc;

    public zznj(zzme zzme2) {
        this.zza = zzme2;
    }

    public static /* bridge */ /* synthetic */ void zza(zznj zznj2, boolean bl2) {
        zznj2.zzb = false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onConnected(Bundle object) {
        object = "MeasurementServiceConnection.onConnected";
        Preconditions.checkMainThread((String)object);
        // MONITORENTER : this
        object = this.zzc;
        Preconditions.checkNotNull(object);
        object = this.zzc;
        object = ((BaseGmsClient)object).getService();
        object = (zzfz)object;
        zzjf zzjf2 = this.zza;
        zzjf2 = ((zzme)zzjf2).zzl();
        zznk zznk2 = new zznk(this, (zzfz)object);
        ((zzhv)zzjf2).zzb(zznk2);
        return;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (DeadObjectException | IllegalStateException throwable) {}
            object = null;
            {
                this.zzc = null;
                object = null;
                this.zzb = false;
                // MONITOREXIT : this
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnectionFailed(ConnectionResult object) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        Object object2 = this.zza.zzu.zzm();
        if (object2 != null) {
            object2 = ((zzgo)object2).zzr();
            String string2 = "Service connection failed";
            ((zzgq)object2).zza(string2, object);
        }
        synchronized (this) {
            object = null;
            this.zzb = false;
            object = null;
            this.zzc = null;
        }
        object = this.zza.zzl();
        object2 = new zznm(this);
        ((zzhv)object).zzb((Runnable)object2);
    }

    public final void onConnectionSuspended(int n3) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzj().zzc().zza("Service connection suspended");
        zzhv zzhv2 = this.zza.zzl();
        zznn zznn2 = new zznn(this);
        zzhv2.zzb(zznn2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName var1_1, IBinder var2_3) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            block12: {
                var1_1 = null;
                if (var2_3 != null) ** GOTO lbl15
                this.zzb = false;
                var1_1 = this.zza;
                var1_1 = var1_1.zzj();
                var1_1 = var1_1.zzg();
                var2_3 = "Service connected with null binder";
                var1_1.zza((String)var2_3);
                return;
                {
                    catch (Throwable var1_2) {
                        break block12;
                    }
lbl15:
                    // 1 sources

                    var3_4 = null;
                    try {
                        var4_5 = var2_3.getInterfaceDescriptor();
                        var5_6 = "com.google.android.gms.measurement.internal.IMeasurementService";
                        var6_7 = var5_6.equals(var4_5);
                        if (!var6_7) ** GOTO lbl55
                        var4_5 = "com.google.android.gms.measurement.internal.IMeasurementService";
                        ** GOTO lbl42
                    }
                    catch (RemoteException v0) {}
                    {
                        block11: {
                            block13: {
                                var2_3 = this.zza;
                                var2_3 = var2_3.zzj();
                                var2_3 = var2_3.zzg();
                                var4_5 = "Service connect failed to get IMeasurementService";
                                var2_3.zza((String)var4_5);
lbl29:
                                // 3 sources

                                while (var3_4 == null) {
                                    this.zzb = false;
                                    try {
                                        var1_1 = ConnectionTracker.getInstance();
                                        var2_3 = this.zza;
                                        var2_3 = var2_3.zza();
                                        var3_4 = this.zza;
                                        var3_4 = zzme.zzb((zzme)var3_4);
                                        var1_1.unbindService((Context)var2_3, (ServiceConnection)var3_4);
                                    }
                                    catch (IllegalArgumentException v1) {}
                                    break block11;
                                }
                                break block13;
lbl42:
                                // 1 sources

                                var6_7 = (var4_5 = var2_3.queryLocalInterface((String)var4_5)) instanceof zzfz;
                                if (!var6_7) ** GOTO lbl53
                                {
                                    var4_5 = (zzfz)var4_5;
lbl45:
                                    // 2 sources

                                    while (true) {
                                        var3_4 = var4_5;
                                        var2_3 = this.zza;
                                        var2_3 = var2_3.zzj();
                                        var2_3 = var2_3.zzq();
                                        var4_5 = "Bound to IMeasurementService interface";
                                        var2_3.zza((String)var4_5);
                                        ** GOTO lbl29
                                        break;
                                    }
lbl53:
                                    // 1 sources

                                    var4_5 = new zzgb((IBinder)var2_3);
                                    ** continue;
lbl55:
                                    // 1 sources

                                    var2_3 = this.zza;
                                    var2_3 = var2_3.zzj();
                                    var2_3 = var2_3.zzg();
                                    var5_6 = "Got binder with a wrong descriptor";
                                    var2_3.zza(var5_6, var4_5);
                                    ** GOTO lbl29
                                }
                            }
                            var1_1 = this.zza;
                            var1_1 = var1_1.zzl();
                            var2_3 = new zzni(this, (zzfz)var3_4);
                            var1_1.zzb((Runnable)var2_3);
                        }
                        return;
                    }
                }
            }
            throw var1_2;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzj().zzc().zza("Service disconnected");
        zzhv zzhv2 = this.zza.zzl();
        zznl zznl2 = new zznl(this, componentName);
        zzhv2.zzb(zznl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        this.zza.zzv();
        Object object = this.zza.zza();
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                boolean bl3;
                try {
                    bl3 = this.zzb;
                    if (bl3) {
                        object = this.zza;
                        object = ((zzme)object).zzj();
                        object = ((zzgo)object).zzq();
                        String string2 = "Connection attempt already in progress";
                        ((zzgq)object).zza(string2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Object object2 = this.zzc;
                if (object2 != null && ((bl3 = ((BaseGmsClient)(object2 = this.zzc)).isConnecting()) || (bl3 = ((BaseGmsClient)(object2 = this.zzc)).isConnected()))) {
                    object = this.zza;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzq();
                    object2 = "Already awaiting connection attempt";
                    ((zzgq)object).zza((String)object2);
                    return;
                }
                Looper looper = Looper.getMainLooper();
                object2 = new zzgn((Context)object, looper, this, this);
                this.zzc = object2;
                object = this.zza;
                object = ((zzme)object).zzj();
                object = ((zzgo)object).zzq();
                object2 = "Connecting to remote service";
                ((zzgq)object).zza((String)object2);
                this.zzb = bl2 = true;
                object = this.zzc;
                Preconditions.checkNotNull(object);
                object = this.zzc;
                ((BaseGmsClient)object).checkAvailabilityAndConnect();
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
    public final void zza(Intent object) {
        this.zza.zzv();
        Object object2 = this.zza.zza();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                try {
                    bl2 = this.zzb;
                    if (bl2) {
                        object = this.zza;
                        object = ((zzme)object).zzj();
                        object = ((zzgo)object).zzq();
                        object2 = "Connection attempt already in progress";
                        ((zzgq)object).zza((String)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Object object3 = this.zza;
                object3 = ((zzme)object3).zzj();
                object3 = ((zzgo)object3).zzq();
                String string2 = "Using local app measurement service";
                ((zzgq)object3).zza(string2);
                this.zzb = bl2 = true;
                object3 = this.zza;
                object3 = zzme.zzb((zzme)object3);
                int n3 = 129;
                connectionTracker.bindService((Context)object2, (Intent)object, (ServiceConnection)object3, n3);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzb() {
        boolean bl2;
        zzgn zzgn2 = this.zzc;
        if (zzgn2 != null && ((bl2 = (zzgn2 = this.zzc).isConnected()) || (bl2 = (zzgn2 = this.zzc).isConnecting()))) {
            zzgn2 = this.zzc;
            zzgn2.disconnect();
        }
        this.zzc = null;
    }
}

