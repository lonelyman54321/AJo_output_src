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
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfwi;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfwx;
import com.google.android.gms.internal.ads.zzfwy;
import com.google.android.gms.internal.ads.zzfwz;
import com.google.android.gms.internal.ads.zzfxa;
import com.google.android.gms.internal.ads.zzfxb;
import com.google.android.gms.internal.ads.zzfxh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzfxg {
    private static final Map zza;
    private final Context zzb;
    private final zzfwv zzc;
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
    private final zzfwi zzo;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public zzfxg(Context object, zzfwv zzfwv2, String object2, Intent intent, zzfwi zzfwi2, zzfxb zzfxb2) {
        object2 = new ArrayList();
        this.zze = object2;
        this.zzf = object2;
        this.zzg = object2 = new Object();
        object2 = new zzfwx(this);
        this.zzk = object2;
        this.zzl = object2 = new AtomicInteger(0);
        this.zzb = object;
        this.zzc = zzfwv2;
        this.zzd = "OverlayDisplayService";
        this.zzi = intent;
        this.zzo = zzfwi2;
        super(null);
        this.zzj = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzfxg zzfxg2) {
        return zzfxg2.zzb;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection zzb(zzfxg zzfxg2) {
        return zzfxg2.zzm;
    }

    public static /* bridge */ /* synthetic */ IInterface zzd(zzfxg zzfxg2) {
        return zzfxg2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzfwv zzf(zzfxg zzfxg2) {
        return zzfxg2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzg(zzfxg zzfxg2) {
        return zzfxg2.zzg;
    }

    public static /* bridge */ /* synthetic */ List zzh(zzfxg zzfxg2) {
        return zzfxg2.zze;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzi(zzfxg zzfxg2) {
        return zzfxg2.zzl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzj(zzfxg zzfxg2) {
        Object object = zzfxg2.zzc;
        Object object2 = "reportBinderDeath";
        Object object3 = null;
        Object[] objectArray = new Object[]{};
        ((zzfwv)object).zzc((String)object2, objectArray);
        object = (zzfxb)zzfxg2.zzj.get();
        if (object != null) {
            object2 = zzfxg2.zzc;
            object3 = new Object[]{};
            objectArray = "calling onBinderDied";
            ((zzfwv)object2).zzc((String)objectArray, object3);
            object.zza();
        } else {
            boolean bl2;
            object = zzfxg2.zzc;
            object2 = zzfxg2.zzd;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = "%s : Binder has died.";
            ((zzfwv)object).zzc((String)object2, objectArray);
            object = zzfxg2.zze.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (zzfww)object.next();
                object3 = zzfxg2.zzv();
                ((zzfww)object2).zzc((Exception)object3);
            }
            object = zzfxg2.zze;
            object.clear();
        }
        object = zzfxg2.zzg;
        synchronized (object) {
            zzfxg2.zzw();
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(zzfxg zzfxg2, ServiceConnection serviceConnection2) {
        zzfxg2.zzm = null;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzfxg zzfxg2, boolean bl2) {
        zzfxg2.zzh = false;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzfxg zzfxg2, IInterface iInterface) {
        zzfxg2.zzn = iInterface;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfxg zzfxg2, TaskCompletionSource taskCompletionSource) {
        zzfxg2.zzf.add(taskCompletionSource);
        Task task2 = taskCompletionSource.getTask();
        zzfwy zzfwy2 = new zzfwy(zzfxg2, taskCompletionSource);
        task2.addOnCompleteListener(zzfwy2);
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfxg zzfxg2) {
        zzfxg2.zzw();
    }

    public static /* bridge */ /* synthetic */ void zzp(zzfxg object, zzfww iterator) {
        int n3;
        Object object2 = ((zzfxg)object).zzn;
        Object object3 = null;
        if (object2 == null && (n3 = ((zzfxg)object).zzh) == 0) {
            object2 = ((zzfxg)object).zzc;
            Object object4 = new Object[]{};
            ((zzfwv)object2).zzc("Initiate binding to the service.", (Object[])object4);
            ((zzfxg)object).zze.add(iterator);
            object2 = null;
            iterator = new Iterator((zzfxg)object, null);
            ((zzfxg)object).zzm = iterator;
            n3 = 1;
            ((zzfxg)object).zzh = n3;
            object4 = ((zzfxg)object).zzb;
            Intent intent = ((zzfxg)object).zzi;
            boolean bl2 = object4.bindService(intent, (ServiceConnection)iterator, n3);
            if (!bl2) {
                iterator = ((zzfxg)object).zzc;
                object2 = new Object[]{};
                object4 = "Failed to bind to the service.";
                ((zzfwv)((Object)iterator)).zzc((String)object4, (Object[])object2);
                ((zzfxg)object).zzh = false;
                iterator = ((zzfxg)object).zze.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (zzfww)iterator.next();
                    object3 = new zzfxh();
                    ((zzfww)object2).zzc((Exception)object3);
                }
                object = ((zzfxg)object).zze;
                object.clear();
            }
            return;
        }
        n3 = ((zzfxg)object).zzh;
        if (n3 != 0) {
            object2 = ((zzfxg)object).zzc;
            object3 = new Object[]{};
            ((zzfwv)object2).zzc("Waiting to bind to the service.", object3);
            ((zzfxg)object).zze.add(iterator);
            return;
        }
        ((zzfww)((Object)iterator)).run();
    }

    public static /* bridge */ /* synthetic */ void zzq(zzfxg object) {
        zzfwv zzfwv2 = ((zzfxg)object).zzc;
        Object[] objectArray = null;
        Object[] objectArray2 = new Object[]{};
        String string2 = "linkToDeath";
        zzfwv2.zzc(string2, objectArray2);
        try {
            zzfwv2 = ((zzfxg)object).zzn;
        }
        catch (RemoteException remoteException) {
            object = ((zzfxg)object).zzc;
            objectArray = new Object[]{};
            ((zzfwv)object).zzb(remoteException, "linkToDeath failed", objectArray);
            return;
        }
        zzfwv2 = zzfwv2.asBinder();
        objectArray2 = ((zzfxg)object).zzk;
        zzfwv2.linkToDeath((IBinder.DeathRecipient)objectArray2, 0);
    }

    public static /* bridge */ /* synthetic */ void zzr(zzfxg zzfxg2) {
        zzfwv zzfwv2 = zzfxg2.zzc;
        Object[] objectArray = new Object[]{};
        zzfwv2.zzc("unlinkToDeath", objectArray);
        zzfwv2 = zzfxg2.zzn.asBinder();
        zzfxg2 = zzfxg2.zzk;
        zzfwv2.unlinkToDeath((IBinder.DeathRecipient)zzfxg2, 0);
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

    public final void zzs(zzfww zzfww2, TaskCompletionSource taskCompletionSource) {
        TaskCompletionSource taskCompletionSource2 = zzfww2.zzb();
        zzfwz zzfwz2 = new zzfwz(this, taskCompletionSource2, taskCompletionSource, zzfww2);
        this.zzc().post((Runnable)zzfwz2);
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

    public final void zzu() {
        zzfxa zzfxa2 = new zzfxa(this);
        this.zzc().post((Runnable)zzfxa2);
    }
}

