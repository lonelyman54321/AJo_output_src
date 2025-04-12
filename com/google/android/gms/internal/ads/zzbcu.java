/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzbcu {
    private ScheduledFuture zza = null;
    private final Runnable zzb;
    private final Object zzc;
    private zzbcx zzd;
    private Context zze;
    private zzbda zzf;

    public zzbcu() {
        Object object = new zzbcq(this);
        this.zzb = object;
        this.zzc = object = new Object();
    }

    public static /* bridge */ /* synthetic */ zzbcx zzc(zzbcu zzbcu2) {
        return zzbcu2.zzd;
    }

    public static /* bridge */ /* synthetic */ Object zze(zzbcu zzbcu2) {
        return zzbcu2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzbcu zzbcu2, zzbcx zzbcx2) {
        zzbcu2.zzd = null;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbcu zzbcu2) {
        zzbcu2.zzl();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ void zzh(zzbcu zzbcu2) {
        Object object = zzbcu2.zzc;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                zzbcx zzbcx2;
                try {
                    zzbcx2 = zzbcu2.zzd;
                    if (zzbcx2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                boolean bl2 = zzbcx2.isConnected();
                if (bl2 || (bl2 = (zzbcx2 = zzbcu2.zzd).isConnecting())) {
                    zzbcx2 = zzbcu2.zzd;
                    zzbcx2.disconnect();
                }
                bl2 = false;
                zzbcx2 = null;
                zzbcu2.zzd = null;
                zzbcu2.zzf = null;
                Binder.flushPendingCommands();
                return;
            }
            throw throwable2;
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzbcu zzbcu2, zzbda zzbda2) {
        zzbcu2.zzf = zzbda2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzl() {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    Object object2 = this.zze;
                    if (object2 != null && (object2 = this.zzd) == null) {
                        object2 = new zzbcs(this);
                        zzbct zzbct2 = new zzbct(this);
                        object2 = this.zzd((BaseGmsClient$BaseConnectionCallbacks)object2, zzbct2);
                        this.zzd = object2;
                        ((BaseGmsClient)object2).checkAvailabilityAndConnect();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
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
    public final long zza(zzbcy zzbcy2) {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                long l2;
                Object object2;
                try {
                    object2 = this.zzf;
                    l2 = -2;
                    if (object2 == null) {
                        return l2;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = this.zzd;
                boolean bl2 = ((zzbcx)object2).zzp();
                if (!bl2) return l2;
                try {
                    object2 = this.zzf;
                    return ((zzbda)object2).zze(zzbcy2);
                }
                catch (RemoteException remoteException) {
                    object2 = "Unable to call into cache service.";
                    zzm.zzh((String)object2, remoteException);
                }
                return l2;
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
    public final zzbcv zzb(zzbcy abstractSafeParcelable) {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                RemoteException remoteException2;
                Object object2;
                block9: {
                    try {
                        object2 = this.zzf;
                        if (object2 == null) {
                            return new zzbcv();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    try {
                        object2 = this.zzd;
                        boolean bl2 = ((zzbcx)object2).zzp();
                        if (bl2) {
                            object2 = this.zzf;
                            return ((zzbda)object2).zzg((zzbcy)abstractSafeParcelable);
                        }
                    }
                    catch (RemoteException remoteException2) {
                        break block9;
                    }
                    {
                        object2 = this.zzf;
                        return ((zzbda)object2).zzf((zzbcy)abstractSafeParcelable);
                    }
                }
                object2 = "Unable to call into cache service.";
                zzm.zzh((String)object2, remoteException2);
                return new zzbcv();
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbcx zzd(BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        synchronized (this) {
            Context context = this.zze;
            zzbx zzbx2 = zzu.zzt();
            zzbx2 = zzbx2.zzb();
            return new zzbcx(context, (Looper)zzbx2, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(Context object) {
        if (object == null) {
            return;
        }
        Object object2 = this.zzc;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                Object object3;
                try {
                    object3 = this.zze;
                    if (object3 != null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = object.getApplicationContext();
                this.zze = object;
                object = zzbep.zzek;
                object3 = zzba.zzc();
                object = ((zzben)object3).zza((zzbeg)object);
                boolean bl2 = (Boolean)(object = (Boolean)object);
                if (bl2) {
                    this.zzl();
                } else {
                    object = zzbep.zzej;
                    object3 = zzba.zzc();
                    object = ((zzben)object3).zza((zzbeg)object);
                    bl2 = (Boolean)(object = (Boolean)object);
                    if (bl2) {
                        object = new zzbcr(this);
                        object3 = zzu.zzb();
                        ((zzbbh)object3).zzc((zzbbg)object);
                    }
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
    public final void zzj() {
        Object object = zzbep.zzel;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Runnable runnable2;
                block4: {
                    try {
                        this.zzl();
                        object2 = this.zza;
                        if (object2 == null) break block4;
                        runnable2 = null;
                        object2.cancel(false);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = zzcci.zzd;
                runnable2 = this.zzb;
                Object object3 = zzbep.zzem;
                zzben zzben2 = zzba.zzc();
                object3 = zzben2.zza((zzbeg)object3);
                object3 = (Long)object3;
                long l2 = (Long)object3;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.zza = object2 = object2.schedule(runnable2, l2, timeUnit);
                return;
            }
            throw throwable2;
        }
    }
}

