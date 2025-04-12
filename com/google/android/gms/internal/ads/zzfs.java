/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfo;
import com.google.android.gms.internal.ads.zzzw;
import com.google.android.gms.internal.ads.zzzy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzfs {
    private static zzfs zza;
    private final Handler zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;

    private zzfs(Context context) {
        Object object;
        Object object2 = Looper.getMainLooper();
        this.zzb = object = new Handler(object2);
        this.zzc = object;
        super();
        this.zzd = object;
        this.zze = 0;
        super();
        object.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        super(this, null);
        context.registerReceiver((BroadcastReceiver)object2, (IntentFilter)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzfs zzb(Context object) {
        Class<zzfs> clazz = zzfs.class;
        synchronized (clazz) {
            try {
                zzfs zzfs2 = zza;
                if (zzfs2 != null) return zza;
                zza = zzfs2 = new zzfs((Context)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzc(zzfs zzfs2, int n3) {
        int n4;
        Iterator iterator = zzfs2.zzd;
        synchronized (iterator) {
            try {
                n4 = zzfs2.zze;
                if (n4 == n3) {
                    return;
                }
                zzfs2.zze = n3;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
                iterator = zzfs2.zzc.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = (WeakReference)iterator.next();
            Object object2 = (zzzw)((Reference)object).get();
            if (object2 != null) {
                object = ((zzzw)object2).zza;
                zzzy.zzh((zzzy)object, n3);
                continue;
            }
            object2 = zzfs2.zzc;
            ((CopyOnWriteArrayList)object2).remove(object);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        Object object = this.zzd;
        synchronized (object) {
            return this.zze;
        }
    }

    public final void zzd(zzzw zzzw2) {
        WeakReference<zzzw> weakReference;
        boolean bl2;
        Object object = this.zzc.iterator();
        while (bl2 = object.hasNext()) {
            weakReference = (WeakReference<zzzw>)object.next();
            Object object2 = weakReference.get();
            if (object2 != null) continue;
            object2 = this.zzc;
            ((CopyOnWriteArrayList)object2).remove(weakReference);
        }
        object = this.zzc;
        weakReference = new WeakReference(zzzw2);
        ((CopyOnWriteArrayList)object).add(weakReference);
        object = this.zzb;
        weakReference = new zzfo(this, zzzw2);
        object.post((Runnable)((Object)weakReference));
    }
}

