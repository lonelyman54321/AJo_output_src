/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.gtm.zzhd;
import com.google.android.gms.internal.gtm.zzhe;
import com.google.android.gms.internal.gtm.zzhg;
import com.google.android.gms.internal.gtm.zzhi;

public final class zzjg
implements ServiceConnection {
    private final Context zza;
    private final ConnectionTracker zzb;
    private volatile boolean zzc = false;
    private volatile boolean zzd = false;
    private zzhg zze;

    public zzjg(Context context, ConnectionTracker connectionTracker) {
        this.zza = context;
        this.zzb = connectionTracker;
    }

    private static final void zzf(zzhd zzhd2, String string2) {
        try {
            zzhd2.zze(false, string2);
            return;
        }
        catch (RemoteException remoteException) {
            zzhi.zzb("Error - local callback should not throw RemoteException", remoteException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                if (iBinder == null) {
                    bl2 = false;
                    object = null;
                } else {
                    object = "com.google.android.gms.tagmanager.internal.ITagManagerService";
                    try {
                        object = iBinder.queryLocalInterface((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    boolean bl3 = object instanceof zzhg;
                    object = bl3 ? (zzhg)object : new zzhe(iBinder);
                }
                this.zze = object;
                this.zzc = bl2 = true;
                bl2 = false;
                object = null;
                this.zzd = false;
                this.notifyAll();
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
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            componentName = null;
            this.zze = null;
            componentName = null;
            this.zzc = false;
            this.zzd = false;
            return;
        }
    }

    public final void zza() {
        boolean bl2 = this.zzd();
        if (bl2) {
            zzhg zzhg2 = this.zze;
            try {
                zzhg2.zze();
                return;
            }
            catch (RemoteException remoteException) {
                String string2 = "Error calling service to dispatch pending events";
                zzhi.zzf(string2, remoteException);
            }
        }
    }

    public final void zzb(String string2, Bundle object, String string3, long l2, boolean bl2) {
        boolean bl3 = this.zzd();
        if (bl3) {
            zzhg zzhg2 = this.zze;
            try {
                zzhg2.zzf(string2, (Bundle)object, string3, l2, bl2);
                return;
            }
            catch (RemoteException remoteException) {
                object = "Error calling service to emit event";
                zzhi.zzf((String)object, remoteException);
            }
        }
    }

    public final void zzc(String string2, String string3, String object, zzhd zzhd2) {
        boolean bl2 = this.zzd();
        if (bl2) {
            try {
                object = this.zze;
            }
            catch (RemoteException remoteException) {
                zzhi.zzf("Error calling service to load container", remoteException);
                zzjg.zzf(zzhd2, string2);
                return;
            }
            object.zzh(string2, string3, null, zzhd2);
            return;
        }
        zzjg.zzf(zzhd2, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        boolean bl2 = this.zzc;
        int n3 = 1;
        if (bl2) {
            return n3 != 0;
        }
        synchronized (this) {
            block12: {
                Throwable throwable2;
                block11: {
                    try {
                        bl2 = this.zzc;
                        if (bl2) {
                            return n3 != 0;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    bl2 = this.zzd;
                    if (!bl2) {
                        Object object = "ignored";
                        Intent intent = new Intent((String)object);
                        object = null;
                        intent.setAction(null);
                        object = this.zza;
                        object = object.getPackageName();
                        String string2 = "com.google.android.gms.tagmanager.TagManagerService";
                        intent.setClassName((String)object, string2);
                        object = this.zzb;
                        string2 = this.zza;
                        bl2 = ((ConnectionTracker)object).bindService((Context)string2, intent, this, n3);
                        if (!bl2) {
                            return false;
                        }
                        this.zzd = n3;
                    }
                    break block12;
                }
                throw throwable2;
            }
            while (bl2 = this.zzd) {
                try {
                    this.wait();
                    this.zzd = false;
                }
                catch (InterruptedException interruptedException) {
                    String string3 = "Error connecting to TagManagerService";
                    zzhi.zzf(string3, interruptedException);
                    this.zzd = false;
                    continue;
                }
                break;
            }
            return this.zzc;
        }
    }

    public final boolean zze() {
        boolean bl2 = this.zzd();
        if (bl2) {
            zzhg zzhg2 = this.zze;
            try {
                zzhg2.zzi();
                return true;
            }
            catch (RemoteException remoteException) {
                String string2 = "Error in resetting service";
                zzhi.zzf(string2, remoteException);
            }
        }
        return false;
    }
}

