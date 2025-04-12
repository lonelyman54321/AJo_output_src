/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfc;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzff;
import com.google.android.gms.internal.ads.zzfg;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzfh {
    private final zzer zza;
    private final zzfb zzb;
    private final zzff zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzfh(Looper looper, zzer zzer2, zzff zzff2) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this(copyOnWriteArraySet, looper, zzer2, zzff2, true);
    }

    private zzfh(CopyOnWriteArraySet object, Looper looper, zzer zzer2, zzff zzff2, boolean bl2) {
        this.zza = zzer2;
        this.zzd = object;
        this.zzc = zzff2;
        this.zzg = object = new Object();
        object = new ArrayDeque();
        this.zze = object;
        object = new ArrayDeque();
        this.zzf = object;
        object = new zzfc(this);
        this.zzb = object = zzer2.zzb(looper, (Handler.Callback)object);
        this.zzi = bl2;
    }

    public static /* synthetic */ boolean zzg(zzfh zzfh2, Message object) {
        boolean bl2;
        object = zzfh2.zzd.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzfg)object.next();
            zzff zzff2 = zzfh2.zzc;
            ((zzfg)object2).zzb(zzff2);
            object2 = zzfh2.zzb;
            zzff2 = null;
            bl2 = object2.zzg(0);
            if (!bl2) continue;
        }
        return true;
    }

    private final void zzh() {
        boolean bl2 = this.zzi;
        if (!bl2) {
            return;
        }
        Object object = this.zzb;
        Thread thread2 = Thread.currentThread();
        if (thread2 == (object = object.zza().getThread())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        zzeq.zzf(bl2);
    }

    public final zzfh zza(Looper looper, zzff zzff2) {
        boolean bl2 = this.zzi;
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        zzer zzer2 = this.zza;
        zzfh zzfh2 = new zzfh(copyOnWriteArraySet, looper, zzer2, zzff2, bl2);
        return zzfh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Object object) {
        Object object2 = this.zzg;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzh;
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
                zzfg zzfg2 = new zzfg(object);
                copyOnWriteArraySet.add(zzfg2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzc() {
        this.zzh();
        Object object = this.zzf;
        boolean bl2 = ((ArrayDeque)object).isEmpty();
        if (!bl2) {
            object = this.zzb;
            Object object2 = null;
            bl2 = object.zzg(0);
            if (!bl2) {
                object = this.zzb;
                object2 = object.zzb(0);
                object.zzk((zzfa)object2);
            }
            object = this.zze;
            bl2 = ((ArrayDeque)object).isEmpty() ^ true;
            object2 = this.zze;
            ArrayDeque arrayDeque = this.zzf;
            ((ArrayDeque)object2).addAll(arrayDeque);
            object2 = this.zzf;
            ((ArrayDeque)object2).clear();
            if (!bl2) {
                while (!(bl2 = ((ArrayDeque)(object = this.zze)).isEmpty())) {
                    ((Runnable)this.zze.peekFirst()).run();
                    object = this.zze;
                    ((ArrayDeque)object).removeFirst();
                }
            }
        }
    }

    public final void zzd(int n3, zzfe zzfe2) {
        this.zzh();
        Object object = this.zzd;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(object);
        object = new zzfd(copyOnWriteArraySet, n3, zzfe2);
        this.zzf.add(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        boolean bl2;
        this.zzh();
        Iterator iterator = this.zzg;
        synchronized (iterator) {
            this.zzh = bl2 = true;
        }
        iterator = this.zzd.iterator();
        while (true) {
            if (!(bl2 = iterator.hasNext())) {
                this.zzd.clear();
                return;
            }
            zzfg zzfg2 = (zzfg)iterator.next();
            zzff zzff2 = this.zzc;
            zzfg2.zzc(zzff2);
        }
    }

    public final void zzf(Object object) {
        boolean bl2;
        this.zzh();
        Iterator iterator = this.zzd.iterator();
        while (bl2 = iterator.hasNext()) {
            zzfg zzfg2 = (zzfg)iterator.next();
            Object object2 = zzfg2.zza;
            boolean bl3 = object2.equals(object);
            if (!bl3) continue;
            object2 = this.zzc;
            zzfg2.zzc((zzff)object2);
            object2 = this.zzd;
            ((CopyOnWriteArraySet)object2).remove(zzfg2);
        }
    }
}

