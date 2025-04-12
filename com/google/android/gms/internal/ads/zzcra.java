/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqv;
import com.google.android.gms.internal.ads.zzcqw;
import com.google.android.gms.internal.ads.zzcqy;
import com.google.android.gms.internal.ads.zzcqz;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdag;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcra
implements zzban,
zzdag,
zzp,
zzdaf {
    private final zzcqv zza;
    private final zzcqw zzb;
    private final Set zzc;
    private final zzbqt zzd;
    private final Executor zze;
    private final Clock zzf;
    private final AtomicBoolean zzg;
    private final zzcqz zzh;
    private boolean zzi;
    private WeakReference zzj;

    public zzcra(zzbqq object, zzcqw zzcqw2, Executor executor, zzcqv zzcqv2, Clock clock) {
        Object object2 = new HashSet();
        this.zzc = object2;
        super(false);
        this.zzg = object2;
        this.zzh = object2 = new zzcqz();
        this.zzi = false;
        object2 = new WeakReference(this);
        this.zzj = object2;
        this.zza = zzcqv2;
        object2 = zzbqe.zza;
        this.zzd = object = ((zzbqq)object).zza("google.afma.activeView.handleUpdate", (zzbqa)object2, (zzbpz)object2);
        this.zzb = zzcqw2;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzchd zzchd2 = (zzchd)iterator.next();
            zzcqv zzcqv2 = this.zza;
            zzcqv2.zzf(zzchd2);
        }
        this.zza.zze();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdH() {
        synchronized (this) {
            zzcqz zzcqz2 = this.zzh;
            zzcqz2.zzb = false;
            this.zzg();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdj(Context object) {
        synchronized (this) {
            boolean bl2;
            String string2;
            object = this.zzh;
            object.zze = string2 = "u";
            this.zzg();
            this.zzk();
            this.zzi = bl2 = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdk() {
        synchronized (this) {
            boolean bl2;
            zzcqz zzcqz2 = this.zzh;
            zzcqz2.zzb = bl2 = true;
            this.zzg();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdl(Context object) {
        synchronized (this) {
            boolean bl2;
            object = this.zzh;
            object.zzb = bl2 = true;
            this.zzg();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdm(Context object) {
        synchronized (this) {
            object = this.zzh;
            object.zzb = false;
            this.zzg();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdp(zzbam zzbam2) {
        synchronized (this) {
            boolean bl2;
            zzcqz zzcqz2 = this.zzh;
            zzcqz2.zza = bl2 = zzbam2.zzj;
            zzcqz2.zzf = zzbam2;
            this.zzg();
            return;
        }
    }

    public final void zzdq() {
    }

    public final void zzdr() {
    }

    public final void zzdt() {
    }

    public final void zzdu(int n3) {
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block8: {
                    block9: {
                        Exception exception2;
                        block7: {
                            Object object;
                            Object object2;
                            block10: {
                                boolean bl2;
                                long l2;
                                object2 = this.zzj;
                                object2 = ((Reference)object2).get();
                                if (object2 == null) break block8;
                                boolean bl3 = this.zzi;
                                if (bl3 || !(bl3 = ((AtomicBoolean)(object2 = this.zzg)).get())) break block9;
                                object2 = this.zzh;
                                object = this.zzf;
                                ((zzcqz)object2).zzd = l2 = object.elapsedRealtime();
                                object2 = this.zzb;
                                object = this.zzh;
                                object2 = ((zzcqw)object2).zza((zzcqz)object);
                                object = this.zzc;
                                object = object.iterator();
                                while (bl2 = object.hasNext()) {
                                    Object object3 = object.next();
                                    object3 = (zzchd)object3;
                                    Executor executor = this.zze;
                                    zzcqy zzcqy2 = new zzcqy((zzchd)object3, (JSONObject)object2);
                                    executor.execute(zzcqy2);
                                }
                                break block10;
                                catch (Throwable throwable2) {
                                    break block6;
                                }
                                catch (Exception exception2) {
                                    break block7;
                                }
                            }
                            object = this.zzd;
                            object2 = ((zzbqt)object).zzb(object2);
                            object = "ActiveViewListener.callActiveViewJs";
                            zzccl.zzb((ListenableFuture)object2, (String)object);
                            return;
                        }
                        String string2 = "Failed to call ActiveViewJS";
                        com.google.android.gms.ads.internal.util.zze.zzb(string2, exception2);
                        return;
                    }
                    return;
                }
                this.zzj();
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
    public final void zzh(zzchd zzchd2) {
        synchronized (this) {
            Object object = this.zzc;
            object.add(zzchd2);
            object = this.zza;
            ((zzcqv)object).zzd(zzchd2);
            return;
        }
    }

    public final void zzi(Object object) {
        WeakReference<Object> weakReference;
        this.zzj = weakReference = new WeakReference<Object>(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj() {
        synchronized (this) {
            boolean bl2;
            this.zzk();
            this.zzi = bl2 = true;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.zzg;
                    boolean bl2 = true;
                    boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
                    if (bl3) {
                        object = this.zza;
                        ((zzcqv)object).zzc(this);
                        this.zzg();
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
}

