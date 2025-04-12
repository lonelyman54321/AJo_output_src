/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Messenger
 *  android.util.Log
 *  android.util.SparseArray
 */
package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzi;
import com.google.android.gms.cloudmessaging.zzj;
import com.google.android.gms.cloudmessaging.zzk;
import com.google.android.gms.cloudmessaging.zzl;
import com.google.android.gms.cloudmessaging.zzm;
import com.google.android.gms.cloudmessaging.zzo;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class zzp
implements ServiceConnection {
    int zza = 0;
    final Messenger zzb;
    zzq zzc;
    final Queue zzd;
    final SparseArray zze;
    final /* synthetic */ zzv zzf;

    public /* synthetic */ zzp(zzv sparseArray, zzo object) {
        this.zzf = sparseArray;
        Looper looper = Looper.getMainLooper();
        zzm zzm2 = new zzm(this);
        super(looper, zzm2);
        super((Handler)object);
        this.zzb = sparseArray;
        this.zzd = sparseArray = new ArrayDeque();
        this.zze = sparseArray = new SparseArray();
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        Log.isLoggable((String)"MessengerIpcClient", (int)2);
        object = zzv.zze(this.zzf);
        zzi zzi2 = new zzi(this, iBinder);
        object.execute(zzi2);
    }

    public final void onServiceDisconnected(ComponentName object) {
        Log.isLoggable((String)"MessengerIpcClient", (int)2);
        object = zzv.zze(this.zzf);
        zzl zzl2 = new zzl(this);
        object.execute(zzl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(int n3, String string2) {
        synchronized (this) {
            this.zzb(n3, string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(int n3, String object, Throwable throwable) {
        synchronized (this) {
            Throwable throwable22;
            block11: {
                block8: {
                    int n4;
                    int n7;
                    int n8;
                    Object object2;
                    block9: {
                        block10: {
                            object2 = "MessengerIpcClient";
                            int n10 = 3;
                            try {
                                int n14 = Log.isLoggable((String)object2, (int)n10);
                                if (n14 != 0) {
                                    object2 = String.valueOf(object);
                                    String string2 = "Disconnected: ";
                                    string2.concat((String)object2);
                                }
                                if ((n14 = this.zza) == 0) break block8;
                                n8 = 4;
                                n7 = 2;
                                int n15 = 1;
                                if (n14 == n15 || n14 == n7) break block9;
                                if (n14 == n10) break block10;
                            }
                            catch (Throwable throwable22) {}
                            return;
                        }
                        this.zza = n8;
                        return;
                        break block11;
                    }
                    object2 = "MessengerIpcClient";
                    Log.isLoggable((String)object2, (int)n7);
                    this.zza = n8;
                    object2 = this.zzf;
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    object2 = zzv.zza((zzv)object2);
                    connectionTracker.unbindService((Context)object2, this);
                    object2 = new zzt(n3, (String)object, throwable);
                    Object object3 = this.zzd;
                    object3 = object3.iterator();
                    while ((n4 = object3.hasNext()) != 0) {
                        object = object3.next();
                        object = (zzs)object;
                        ((zzs)object).zzc((zzt)object2);
                    }
                    object3 = this.zzd;
                    object3.clear();
                    n3 = 0;
                    object3 = null;
                    while (true) {
                        if (n3 >= (n4 = (object = this.zze).size())) {
                            object3 = this.zze;
                            object3.clear();
                            return;
                        }
                        object = this.zze;
                        object = object.valueAt(n3);
                        object = (zzs)object;
                        ((zzs)object).zzc((zzt)object2);
                        ++n3;
                    }
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            throw throwable22;
        }
    }

    public final void zzc() {
        ScheduledExecutorService scheduledExecutorService = zzv.zze(this.zzf);
        zzj zzj2 = new zzj(this);
        scheduledExecutorService.execute(zzj2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzd() {
        // MONITORENTER : this
        int n3 = this.zza;
        int n4 = 1;
        if (n3 != n4) return;
        String string2 = "Timed out while binding";
        this.zza(n4, string2);
        // MONITOREXIT : this
        return;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.zze;
                    object = object.get(n3);
                    object = (zzs)object;
                    if (object != null) {
                        Object object2 = this.zze;
                        object2.remove(n3);
                        String string2 = "Timed out waiting for response";
                        int n4 = 3;
                        object2 = new zzt(n4, string2, null);
                        ((zzs)object).zzc((zzt)object2);
                        this.zzf();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object;
                    int n3 = this.zza;
                    int n4 = 2;
                    if (n3 == n4 && (n3 = (int)((object = this.zzd).isEmpty() ? 1 : 0)) != 0 && (n3 = (object = this.zze).size()) == 0) {
                        object = "MessengerIpcClient";
                        Log.isLoggable((String)object, (int)n4);
                        this.zza = n3 = 3;
                        object = this.zzf;
                        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                        object = zzv.zza((zzv)object);
                        connectionTracker.unbindService((Context)object, this);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
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
    public final boolean zzg(zzs object) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                boolean bl2;
                block13: {
                    SecurityException securityException2;
                    Object object2;
                    block14: {
                        Object object3;
                        block12: {
                            boolean bl3;
                            block8: {
                                block9: {
                                    block10: {
                                        try {
                                            boolean bl4 = this.zza;
                                            bl3 = 2 != 0;
                                            bl2 = true;
                                            if (!bl4) break block8;
                                            if (bl4 == bl2) break block9;
                                            if (bl4 == bl3) break block10;
                                        }
                                        catch (Throwable throwable2) {
                                            break block11;
                                        }
                                        return false;
                                    }
                                    Queue queue = this.zzd;
                                    queue.add(object);
                                    this.zzc();
                                    return bl2;
                                }
                                Queue queue = this.zzd;
                                queue.add(object);
                                return bl2;
                            }
                            object2 = this.zzd;
                            object2.add(object);
                            boolean bl5 = this.zza;
                            if (!bl5) {
                                bl5 = true;
                            } else {
                                bl5 = false;
                                object = null;
                            }
                            Preconditions.checkState(bl5);
                            object = "MessengerIpcClient";
                            Log.isLoggable((String)object, (int)(bl3 ? 1 : 0));
                            this.zza = bl2;
                            object2 = "com.google.android.c2dm.intent.REGISTER";
                            object = new Intent((String)object2);
                            object2 = "com.google.android.gms";
                            object.setPackage((String)object2);
                            try {
                                object2 = ConnectionTracker.getInstance();
                                object3 = this.zzf;
                                object3 = zzv.zza(object3);
                                bl5 = ((ConnectionTracker)object2).bindService((Context)object3, (Intent)object, this, (int)(bl2 ? 1 : 0));
                                if (bl5) break block12;
                                object = "Unable to bind to service";
                                this.zza(0, (String)object);
                                break block13;
                            }
                            catch (SecurityException securityException2) {
                                break block14;
                            }
                        }
                        object = this.zzf;
                        object = zzv.zze((zzv)object);
                        object2 = new zzk(this);
                        object3 = TimeUnit.SECONDS;
                        long l2 = 30;
                        object.schedule((Runnable)object2, l2, (TimeUnit)((Object)object3));
                        break block13;
                    }
                    object2 = "Unable to bind to service";
                    this.zzb(0, (String)object2, securityException2);
                }
                return bl2;
            }
            throw throwable2;
        }
    }
}

