/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.IBinder$DeathRecipient
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzi;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzk;
import com.google.android.play.core.review.internal.zzl;
import com.google.android.play.core.review.internal.zzm;
import com.google.android.play.core.review.internal.zzn;
import com.google.android.play.core.review.internal.zzo;
import com.google.android.play.core.review.internal.zzu;
import com.google.android.play.core.review.zze;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzt {
    private static final Map zza;
    private final Context zzb;
    private final zzi zzc;
    private final String zzd;
    private final List zze;
    private final Set zzf;
    private final Object zzg;
    private boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk;
    private final AtomicInteger zzl;
    private ServiceConnection zzm;
    private IInterface zzn;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public zzt(Context object, zzi zzi2, String object2, Intent intent, zze zze2, zzo zzo2) {
        object2 = new ArrayList();
        this.zze = object2;
        this.zzf = object2;
        this.zzg = object2 = new Object();
        object2 = new zzk(this);
        this.zzk = object2;
        this.zzl = object2 = new AtomicInteger(0);
        this.zzb = object;
        this.zzc = zzi2;
        this.zzd = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.zzi = intent;
        super(null);
        this.zzj = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzt zzt2) {
        return zzt2.zzb;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection zzb(zzt zzt2) {
        return zzt2.zzm;
    }

    public static /* bridge */ /* synthetic */ IInterface zzd(zzt zzt2) {
        return zzt2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzi zzf(zzt zzt2) {
        return zzt2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzg(zzt zzt2) {
        return zzt2.zzg;
    }

    public static /* bridge */ /* synthetic */ List zzh(zzt zzt2) {
        return zzt2.zze;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzi(zzt zzt2) {
        return zzt2.zzl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzj(zzt zzt2) {
        Object object = zzt2.zzc;
        Object object2 = "reportBinderDeath";
        Object object3 = null;
        Object[] objectArray = new Object[]{};
        ((zzi)object).zzc((String)object2, objectArray);
        object = (zzo)zzt2.zzj.get();
        if (object != null) {
            object2 = zzt2.zzc;
            object3 = new Object[]{};
            objectArray = "calling onBinderDied";
            ((zzi)object2).zzc((String)objectArray, object3);
            object.zza();
        } else {
            boolean bl2;
            object = zzt2.zzc;
            object2 = zzt2.zzd;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = "%s : Binder has died.";
            ((zzi)object).zzc((String)object2, objectArray);
            object = zzt2.zze.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (zzj)object.next();
                object3 = zzt2.zzv();
                ((zzj)object2).zzc((Exception)object3);
            }
            object = zzt2.zze;
            object.clear();
        }
        object = zzt2.zzg;
        synchronized (object) {
            zzt2.zzw();
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzt zzt2, ServiceConnection serviceConnection2) {
        zzt2.zzm = null;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzt zzt2, boolean bl2) {
        zzt2.zzh = false;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzt zzt2, IInterface iInterface) {
        zzt2.zzn = iInterface;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzt zzt2, TaskCompletionSource taskCompletionSource) {
        zzt2.zzf.add(taskCompletionSource);
        Task task2 = taskCompletionSource.getTask();
        zzl zzl2 = new zzl(zzt2, taskCompletionSource);
        task2.addOnCompleteListener(zzl2);
    }

    public static /* bridge */ /* synthetic */ void zzo(zzt zzt2) {
        zzt2.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzp(zzt object, zzj iterator) {
        int n3;
        Object object2 = ((zzt)object).zzn;
        Object object3 = null;
        if (object2 == null && (n3 = ((zzt)object).zzh) == 0) {
            object2 = ((zzt)object).zzc;
            Object object4 = new Object[]{};
            ((zzi)object2).zzc("Initiate binding to the service.", (Object[])object4);
            ((zzt)object).zze.add(iterator);
            object2 = null;
            iterator = new Iterator((zzt)object, null);
            ((zzt)object).zzm = iterator;
            n3 = 1;
            ((zzt)object).zzh = n3;
            object4 = ((zzt)object).zzb;
            Intent intent = ((zzt)object).zzi;
            boolean bl2 = object4.bindService(intent, (ServiceConnection)iterator, n3);
            if (!bl2) {
                iterator = ((zzt)object).zzc;
                object2 = new Object[]{};
                object4 = "Failed to bind to the service.";
                ((zzi)((Object)iterator)).zzc((String)object4, (Object[])object2);
                ((zzt)object).zzh = false;
                iterator = ((zzt)object).zze.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (zzj)iterator.next();
                    object3 = new zzu();
                    ((zzj)object2).zzc((Exception)object3);
                }
                object = ((zzt)object).zze;
                object.clear();
            }
            return;
        }
        n3 = ((zzt)object).zzh;
        if (n3 != 0) {
            object2 = ((zzt)object).zzc;
            object3 = new Object[]{};
            ((zzi)object2).zzc("Waiting to bind to the service.", object3);
            ((zzt)object).zze.add(iterator);
            return;
        }
        ((zzj)((Object)iterator)).run();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzt object) {
        zzi zzi2 = ((zzt)object).zzc;
        Object[] objectArray = null;
        Object[] objectArray2 = new Object[]{};
        String string2 = "linkToDeath";
        zzi2.zzc(string2, objectArray2);
        try {
            zzi2 = ((zzt)object).zzn;
        }
        catch (RemoteException remoteException) {
            object = ((zzt)object).zzc;
            objectArray = new Object[]{};
            ((zzi)object).zzb(remoteException, "linkToDeath failed", objectArray);
            return;
        }
        zzi2 = zzi2.asBinder();
        objectArray2 = ((zzt)object).zzk;
        zzi2.linkToDeath((IBinder.DeathRecipient)objectArray2, 0);
    }

    public static /* bridge */ /* synthetic */ void zzr(zzt zzt2) {
        zzi zzi2 = zzt2.zzc;
        Object[] objectArray = new Object[]{};
        zzi2.zzc("unlinkToDeath", objectArray);
        zzi2 = zzt2.zzn.asBinder();
        zzt2 = zzt2.zzk;
        zzi2.unlinkToDeath((IBinder.DeathRecipient)zzt2, 0);
    }

    private final RemoteException zzv() {
        String string2 = String.valueOf(this.zzd);
        string2 = string2.concat(" : Binder has died.");
        RemoteException remoteException = new RemoteException(string2);
        return remoteException;
    }

    private final void zzw() {
        boolean bl2;
        Iterator iterator = this.zzf.iterator();
        while (bl2 = iterator.hasNext()) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource)iterator.next();
            RemoteException remoteException = this.zzv();
            taskCompletionSource.trySetException((Exception)((Object)remoteException));
        }
        this.zzf.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Handler zzc() {
        Map map2 = zza;
        synchronized (map2) {
            Throwable throwable2;
            block4: {
                String string2;
                block3: {
                    try {
                        string2 = this.zzd;
                        boolean bl2 = map2.containsKey(string2);
                        if (bl2) break block3;
                        String string3 = this.zzd;
                        int n3 = 10;
                        string2 = new HandlerThread(string3, n3);
                        ((Thread)((Object)string2)).start();
                        string3 = this.zzd;
                        string2 = string2.getLooper();
                        Handler handler = new Handler((Looper)string2);
                        map2.put(string3, handler);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                string2 = this.zzd;
                string2 = map2.get(string2);
                return (Handler)string2;
            }
            throw throwable2;
        }
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzj zzj2, TaskCompletionSource taskCompletionSource) {
        TaskCompletionSource taskCompletionSource2 = zzj2.zzb();
        zzm zzm2 = new zzm(this, taskCompletionSource2, taskCompletionSource, zzj2);
        this.zzc().post((Runnable)zzm2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task object) {
        object = this.zzg;
        synchronized (object) {
            Set set = this.zzf;
            set.remove(taskCompletionSource);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(TaskCompletionSource object) {
        Object object2 = this.zzg;
        synchronized (object2) {
            Set set = this.zzf;
            set.remove(object);
        }
        object = new zzn(this);
        this.zzc().post((Runnable)object);
    }
}

