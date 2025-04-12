/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarf;
import com.google.android.gms.internal.ads.zzarg;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzarh {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaqo zze;
    private final zzaqx zzf;
    private final zzaqy[] zzg;
    private zzaqq zzh;
    private final List zzi;
    private final List zzj;
    private final zzaqv zzk;

    public zzarh(zzaqo zzaqyArray, zzaqx zzaqx2, int n3) {
        Looper looper = Looper.getMainLooper();
        Object object = new Handler(looper);
        zzaqv zzaqv2 = new zzaqv((Handler)object);
        this.zza = object;
        super();
        this.zzb = object;
        super();
        this.zzc = object;
        super();
        this.zzd = object;
        super();
        this.zzi = object;
        super();
        this.zzj = object;
        this.zze = zzaqyArray;
        this.zzf = zzaqx2;
        zzaqyArray = new zzaqy[4];
        this.zzg = zzaqyArray;
        this.zzk = zzaqv2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzare zza(zzare zzare2) {
        zzare2.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            Set set2 = this.zzb;
            set2.add(zzare2);
        }
        int n3 = this.zza.incrementAndGet();
        zzare2.zzg(n3);
        zzare2.zzm("add-to-queue");
        this.zzc(zzare2, 0);
        this.zzc.add(zzare2);
        return zzare2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzare zzare2) {
        Collection collection;
        Object object = this.zzb;
        synchronized (object) {
            collection = this.zzb;
            collection.remove(zzare2);
        }
        collection = this.zzi;
        synchronized (collection) {
            try {
                object = this.zzi;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[1, 5, 7, 8] lbl14 : MonitorExitStatement: MONITOREXIT : var3_4 /* !! */ 
                        this.zzc(zzare2, 5);
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (zzarg)object2;
                    object2.zza();
                }
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
    public final void zzc(zzare object, int n3) {
        object = this.zzj;
        synchronized (object) {
            try {
                Object object2 = this.zzj;
                object2 = object2.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    Object object3 = object2.next();
                    object3 = (zzarf)object3;
                    object3.zza();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzd() {
        int n3;
        Object object = this.zzh;
        if (object != null) {
            object.zzb();
        }
        object = this.zzg;
        int n4 = 0;
        Object object2 = null;
        for (int i3 = 0; i3 < (n3 = 4); ++i3) {
            zzaqy zzaqy2 = object[i3];
            if (zzaqy2 == null) continue;
            zzaqy2.zza();
        }
        object = this.zzc;
        object2 = this.zzd;
        zzaqo zzaqo2 = this.zze;
        zzaqv zzaqv2 = this.zzk;
        Thread thread2 = new zzaqq((BlockingQueue)object, (BlockingQueue)object2, zzaqo2, zzaqv2);
        this.zzh = thread2;
        thread2.start();
        while (n4 < n3) {
            object = this.zzd;
            object2 = this.zzf;
            zzaqo2 = this.zze;
            zzaqv2 = this.zzk;
            thread2 = new zzaqy((BlockingQueue)object, (zzaqx)object2, zzaqo2, zzaqv2);
            object = this.zzg;
            object[n4] = thread2;
            thread2.start();
            ++n4;
        }
    }
}

