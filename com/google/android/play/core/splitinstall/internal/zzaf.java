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
package com.google.android.play.core.splitinstall.internal;

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
import com.google.android.play.core.splitinstall.internal.zzaa;
import com.google.android.play.core.splitinstall.internal.zzag;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import com.google.android.play.core.splitinstall.internal.zzw;
import com.google.android.play.core.splitinstall.internal.zzx;
import com.google.android.play.core.splitinstall.internal.zzy;
import com.google.android.play.core.splitinstall.internal.zzz;
import com.google.android.play.core.splitinstall.zzak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaf {
    private static final Map zza;
    private final Context zzb;
    private final zzu zzc;
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
    private final zzak zzo;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public zzaf(Context object, zzu zzu2, String object2, Intent intent, zzak zzak2, zzaa zzaa2) {
        object2 = new ArrayList();
        this.zze = object2;
        this.zzf = object2;
        this.zzg = object2 = new Object();
        object2 = new zzx(this);
        this.zzk = object2;
        this.zzl = object2 = new AtomicInteger(0);
        this.zzb = object;
        this.zzc = zzu2;
        this.zzd = "SplitInstallService";
        this.zzi = intent;
        this.zzo = zzak2;
        super(null);
        this.zzj = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzaf zzaf2) {
        return zzaf2.zzb;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection zzb(zzaf zzaf2) {
        return zzaf2.zzm;
    }

    public static /* bridge */ /* synthetic */ IInterface zzd(zzaf zzaf2) {
        return zzaf2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzu zzf(zzaf zzaf2) {
        return zzaf2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzg(zzaf zzaf2) {
        return zzaf2.zzg;
    }

    public static /* bridge */ /* synthetic */ List zzh(zzaf zzaf2) {
        return zzaf2.zze;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzi(zzaf zzaf2) {
        return zzaf2.zzl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzj(zzaf zzaf2) {
        Object object = zzaf2.zzc;
        Object object2 = "reportBinderDeath";
        Object object3 = null;
        Object[] objectArray = new Object[]{};
        ((zzu)object).zzd((String)object2, objectArray);
        object = (zzaa)zzaf2.zzj.get();
        if (object != null) {
            object2 = zzaf2.zzc;
            object3 = new Object[]{};
            objectArray = "calling onBinderDied";
            ((zzu)object2).zzd((String)objectArray, object3);
            object.zza();
        } else {
            boolean bl2;
            object = zzaf2.zzc;
            object2 = zzaf2.zzd;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = "%s : Binder has died.";
            ((zzu)object).zzd((String)object2, objectArray);
            object = zzaf2.zze.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (zzv)object.next();
                object3 = zzaf2.zzv();
                ((zzv)object2).zzb((Exception)object3);
            }
            object = zzaf2.zze;
            object.clear();
        }
        object = zzaf2.zzg;
        synchronized (object) {
            zzaf2.zzw();
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzaf zzaf2, ServiceConnection serviceConnection2) {
        zzaf2.zzm = null;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzaf zzaf2, boolean bl2) {
        zzaf2.zzh = false;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzaf zzaf2, IInterface iInterface) {
        zzaf2.zzn = iInterface;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzaf zzaf2, TaskCompletionSource taskCompletionSource) {
        zzaf2.zzf.add(taskCompletionSource);
        Task task2 = taskCompletionSource.getTask();
        zzw zzw2 = new zzw(zzaf2, taskCompletionSource);
        task2.addOnCompleteListener(zzw2);
    }

    public static /* bridge */ /* synthetic */ void zzo(zzaf zzaf2) {
        zzaf2.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzp(zzaf object, zzv iterator) {
        int n3;
        Object object2 = ((zzaf)object).zzn;
        Object object3 = null;
        if (object2 == null && (n3 = ((zzaf)object).zzh) == 0) {
            object2 = ((zzaf)object).zzc;
            Object object4 = new Object[]{};
            ((zzu)object2).zzd("Initiate binding to the service.", (Object[])object4);
            ((zzaf)object).zze.add(iterator);
            object2 = null;
            iterator = new Iterator((zzaf)object, null);
            ((zzaf)object).zzm = iterator;
            n3 = 1;
            ((zzaf)object).zzh = n3;
            object4 = ((zzaf)object).zzb;
            Intent intent = ((zzaf)object).zzi;
            boolean bl2 = object4.bindService(intent, (ServiceConnection)iterator, n3);
            if (!bl2) {
                iterator = ((zzaf)object).zzc;
                object2 = new Object[]{};
                object4 = "Failed to bind to the service.";
                ((zzu)((Object)iterator)).zzd((String)object4, (Object[])object2);
                ((zzaf)object).zzh = false;
                iterator = ((zzaf)object).zze.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (zzv)iterator.next();
                    object3 = new zzag();
                    ((zzv)object2).zzb((Exception)object3);
                }
                object = ((zzaf)object).zze;
                object.clear();
            }
            return;
        }
        n3 = ((zzaf)object).zzh;
        if (n3 != 0) {
            object2 = ((zzaf)object).zzc;
            object3 = new Object[]{};
            ((zzu)object2).zzd("Waiting to bind to the service.", object3);
            ((zzaf)object).zze.add(iterator);
            return;
        }
        ((zzv)((Object)iterator)).run();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzaf object) {
        zzu zzu2 = ((zzaf)object).zzc;
        Object[] objectArray = null;
        Object[] objectArray2 = new Object[]{};
        String string2 = "linkToDeath";
        zzu2.zzd(string2, objectArray2);
        try {
            zzu2 = ((zzaf)object).zzn;
        }
        catch (RemoteException remoteException) {
            object = ((zzaf)object).zzc;
            objectArray = new Object[]{};
            ((zzu)object).zzc(remoteException, "linkToDeath failed", objectArray);
            return;
        }
        zzu2 = zzu2.asBinder();
        objectArray2 = ((zzaf)object).zzk;
        zzu2.linkToDeath((IBinder.DeathRecipient)objectArray2, 0);
    }

    public static /* bridge */ /* synthetic */ void zzr(zzaf zzaf2) {
        zzu zzu2 = zzaf2.zzc;
        Object[] objectArray = new Object[]{};
        zzu2.zzd("unlinkToDeath", objectArray);
        zzu2 = zzaf2.zzn.asBinder();
        zzaf2 = zzaf2.zzk;
        zzu2.unlinkToDeath((IBinder.DeathRecipient)zzaf2, 0);
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

    public final void zzs(zzv zzv2, TaskCompletionSource taskCompletionSource) {
        TaskCompletionSource taskCompletionSource2 = zzv2.zza();
        zzy zzy2 = new zzy(this, taskCompletionSource2, taskCompletionSource, zzv2);
        this.zzc().post((Runnable)zzy2);
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
        object = new zzz(this);
        this.zzc().post((Runnable)object);
    }
}

