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
package com.google.android.play.core.appupdate.internal;

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
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzo;
import com.google.android.play.core.appupdate.internal.zzp;
import com.google.android.play.core.appupdate.internal.zzq;
import com.google.android.play.core.appupdate.internal.zzr;
import com.google.android.play.core.appupdate.internal.zzs;
import com.google.android.play.core.appupdate.internal.zzy;
import com.google.android.play.core.appupdate.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzx {
    private static final Map zza;
    private final Context zzb;
    private final zzm zzc;
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
    private final zzl zzo;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public zzx(Context object, zzm zzm2, String object2, Intent intent, zzl zzl2, zzs zzs2) {
        object2 = new ArrayList();
        this.zze = object2;
        this.zzf = object2;
        this.zzg = object2 = new Object();
        object2 = new zzp(this);
        this.zzk = object2;
        this.zzl = object2 = new AtomicInteger(0);
        this.zzb = object;
        this.zzc = zzm2;
        this.zzd = "AppUpdateService";
        this.zzi = intent;
        this.zzo = zzl2;
        super(null);
        this.zzj = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzx zzx2) {
        return zzx2.zzb;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection zzb(zzx zzx2) {
        return zzx2.zzm;
    }

    public static /* bridge */ /* synthetic */ IInterface zzd(zzx zzx2) {
        return zzx2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzm zzf(zzx zzx2) {
        return zzx2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzg(zzx zzx2) {
        return zzx2.zzg;
    }

    public static /* bridge */ /* synthetic */ List zzh(zzx zzx2) {
        return zzx2.zze;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzi(zzx zzx2) {
        return zzx2.zzl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzj(zzx zzx2) {
        Object object = zzx2.zzc;
        Object object2 = "reportBinderDeath";
        Object object3 = null;
        Object[] objectArray = new Object[]{};
        ((zzm)object).zzd((String)object2, objectArray);
        object = (zzs)zzx2.zzj.get();
        if (object != null) {
            object2 = zzx2.zzc;
            object3 = new Object[]{};
            objectArray = "calling onBinderDied";
            ((zzm)object2).zzd((String)objectArray, object3);
            object.zza();
        } else {
            boolean bl2;
            object = zzx2.zzc;
            object2 = zzx2.zzd;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = "%s : Binder has died.";
            ((zzm)object).zzd((String)object2, objectArray);
            object = zzx2.zze.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (zzn)object.next();
                object3 = zzx2.zzv();
                ((zzn)object2).zzc((Exception)object3);
            }
            object = zzx2.zze;
            object.clear();
        }
        object = zzx2.zzg;
        synchronized (object) {
            zzx2.zzw();
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzx zzx2, ServiceConnection serviceConnection2) {
        zzx2.zzm = null;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzx zzx2, boolean bl2) {
        zzx2.zzh = false;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzx zzx2, IInterface iInterface) {
        zzx2.zzn = iInterface;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzx zzx2, TaskCompletionSource taskCompletionSource) {
        zzx2.zzf.add(taskCompletionSource);
        Task task2 = taskCompletionSource.getTask();
        zzo zzo2 = new zzo(zzx2, taskCompletionSource);
        task2.addOnCompleteListener(zzo2);
    }

    public static /* bridge */ /* synthetic */ void zzo(zzx zzx2) {
        zzx2.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzp(zzx object, zzn iterator) {
        int n3;
        Object object2 = ((zzx)object).zzn;
        Object object3 = null;
        if (object2 == null && (n3 = ((zzx)object).zzh) == 0) {
            object2 = ((zzx)object).zzc;
            Object object4 = new Object[]{};
            ((zzm)object2).zzd("Initiate binding to the service.", (Object[])object4);
            ((zzx)object).zze.add(iterator);
            object2 = null;
            iterator = new Iterator((zzx)object, null);
            ((zzx)object).zzm = iterator;
            n3 = 1;
            ((zzx)object).zzh = n3;
            object4 = ((zzx)object).zzb;
            Intent intent = ((zzx)object).zzi;
            boolean bl2 = object4.bindService(intent, (ServiceConnection)iterator, n3);
            if (!bl2) {
                iterator = ((zzx)object).zzc;
                object2 = new Object[]{};
                object4 = "Failed to bind to the service.";
                ((zzm)((Object)iterator)).zzd((String)object4, (Object[])object2);
                ((zzx)object).zzh = false;
                iterator = ((zzx)object).zze.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (zzn)iterator.next();
                    object3 = new zzy();
                    ((zzn)object2).zzc((Exception)object3);
                }
                object = ((zzx)object).zze;
                object.clear();
            }
            return;
        }
        n3 = ((zzx)object).zzh;
        if (n3 != 0) {
            object2 = ((zzx)object).zzc;
            object3 = new Object[]{};
            ((zzm)object2).zzd("Waiting to bind to the service.", object3);
            ((zzx)object).zze.add(iterator);
            return;
        }
        ((zzn)((Object)iterator)).run();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzx object) {
        zzm zzm2 = ((zzx)object).zzc;
        Object[] objectArray = null;
        Object[] objectArray2 = new Object[]{};
        String string2 = "linkToDeath";
        zzm2.zzd(string2, objectArray2);
        try {
            zzm2 = ((zzx)object).zzn;
        }
        catch (RemoteException remoteException) {
            object = ((zzx)object).zzc;
            objectArray = new Object[]{};
            ((zzm)object).zzc(remoteException, "linkToDeath failed", objectArray);
            return;
        }
        zzm2 = zzm2.asBinder();
        objectArray2 = ((zzx)object).zzk;
        zzm2.linkToDeath((IBinder.DeathRecipient)objectArray2, 0);
    }

    public static /* bridge */ /* synthetic */ void zzr(zzx zzx2) {
        zzm zzm2 = zzx2.zzc;
        Object[] objectArray = new Object[]{};
        zzm2.zzd("unlinkToDeath", objectArray);
        zzm2 = zzx2.zzn.asBinder();
        zzx2 = zzx2.zzk;
        zzm2.unlinkToDeath((IBinder.DeathRecipient)zzx2, 0);
    }

    private final RemoteException zzv() {
        String string2 = String.valueOf(this.zzd).concat(" : Binder has died.");
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

    public final void zzs(zzn zzn2, TaskCompletionSource taskCompletionSource) {
        TaskCompletionSource taskCompletionSource2 = zzn2.zzb();
        zzq zzq2 = new zzq(this, taskCompletionSource2, taskCompletionSource, zzn2);
        this.zzc().post((Runnable)zzq2);
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
        object = new zzr(this);
        this.zzc().post((Runnable)object);
    }
}

