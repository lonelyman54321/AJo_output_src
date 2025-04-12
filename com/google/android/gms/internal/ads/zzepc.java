/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzeoj;
import com.google.android.gms.internal.ads.zzeok;
import com.google.android.gms.internal.ads.zzeol;
import com.google.android.gms.internal.ads.zzeom;
import com.google.android.gms.internal.ads.zzeon;
import com.google.android.gms.internal.ads.zzeoo;
import com.google.android.gms.internal.ads.zzeop;
import com.google.android.gms.internal.ads.zzeoq;
import com.google.android.gms.internal.ads.zzeor;
import com.google.android.gms.internal.ads.zzeos;
import com.google.android.gms.internal.ads.zzeot;
import com.google.android.gms.internal.ads.zzeou;
import com.google.android.gms.internal.ads.zzeov;
import com.google.android.gms.internal.ads.zzeow;
import com.google.android.gms.internal.ads.zzeox;
import com.google.android.gms.internal.ads.zzeoy;
import com.google.android.gms.internal.ads.zzeoz;
import com.google.android.gms.internal.ads.zzepa;
import com.google.android.gms.internal.ads.zzepb;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzfhf;
import java.io.Serializable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzepc
implements AppEventListener,
zzdcg,
zzdaz,
zzczo,
zzdaf,
zza,
zzczl,
zzdbw,
zzdab,
zzdhi {
    final zzdvc zza;
    final BlockingQueue zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final AtomicBoolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicBoolean zzj;

    public zzepc(zzdvc zzdvc2) {
        Serializable serializable;
        this.zzc = serializable = new Serializable();
        this.zzd = serializable = new Serializable();
        this.zze = serializable = new Serializable();
        this.zzf = serializable = new Serializable();
        this.zzg = serializable = new Serializable();
        super(true);
        this.zzh = serializable;
        super(false);
        this.zzi = serializable;
        super(false);
        this.zzj = serializable;
        zzbeg zzbeg2 = zzbep.zziR;
        int n3 = (Integer)zzba.zzc().zza(zzbeg2);
        super(n3);
        this.zzb = serializable;
        this.zza = zzdvc2;
    }

    private final void zzo() {
        Object object = this.zzi;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (bl2 && (bl2 = ((AtomicBoolean)(object = this.zzj)).get())) {
            Pair pair;
            boolean bl3;
            object = this.zzb.iterator();
            while (bl3 = object.hasNext()) {
                pair = (Pair)object.next();
                AtomicReference atomicReference = this.zzd;
                zzeon zzeon2 = new zzeon(pair);
                zzfdy.zza(atomicReference, zzeon2);
            }
            this.zzb.clear();
            object = this.zzh;
            bl3 = false;
            pair = null;
            ((AtomicBoolean)object).set(false);
        }
    }

    public final void onAdClicked() {
        Object object = zzbep.zzkM;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            object = this.zzc;
            object2 = new zzepa();
            zzfdy.zza((AtomicReference)object, (zzfdx)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAppEvent(String string2, String string3) {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block4: {
                block5: {
                    try {
                        object = this.zzh;
                        boolean bl2 = ((AtomicBoolean)object).get();
                        if (!bl2) break block4;
                        object = this.zzb;
                        Object object2 = new Pair((Object)string2, (Object)string3);
                        bl2 = object.offer(object2);
                        if (bl2) break block5;
                        object = "The queue for app events is full, dropping the new event.";
                        zzm.zze((String)object);
                        object = this.zza;
                        if (object == null) break block5;
                        object = ((zzdvc)object).zza();
                        object2 = "action";
                        String string4 = "dae_action";
                        ((zzdvb)object).zzb((String)object2, string4);
                        object2 = "dae_name";
                        ((zzdvb)object).zzb((String)object2, string2);
                        string2 = "dae_data";
                        ((zzdvb)object).zzb(string2, string3);
                        ((zzdvb)object).zzf();
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            object = this.zzd;
            zzeou zzeou2 = new zzeou(string2, string3);
            zzfdy.zza((AtomicReference)object, zzeou2);
            return;
            throw throwable2;
        }
    }

    public final void zza() {
        zzfdx zzfdx2 = new zzeok();
        zzfdy.zza(this.zzc, zzfdx2);
        zzfdx2 = new zzeol();
        zzfdy.zza(this.zzg, zzfdx2);
    }

    public final void zzb() {
        zzeov zzeov2 = new zzeov();
        zzfdy.zza(this.zzc, zzeov2);
    }

    public final void zzc() {
        zzfdx zzfdx2 = new zzeox();
        zzfdy.zza(this.zzc, zzfdx2);
        zzfdx2 = new zzeoy();
        zzfdy.zza(this.zzg, zzfdx2);
        zzfdx2 = new zzeoz();
        zzfdy.zza(this.zzg, zzfdx2);
    }

    public final void zzdB(zze zze2) {
        zzfdx zzfdx2 = new zzeoo(zze2);
        zzfdy.zza(this.zzc, zzfdx2);
        zzfdx2 = new zzeop(zze2);
        zzfdy.zza(this.zzc, zzfdx2);
        zzfdx2 = new zzeoq(zze2);
        zzfdy.zza(this.zzf, zzfdx2);
        this.zzh.set(false);
        this.zzb.clear();
    }

    public final void zzdG() {
        Object object = zzbep.zzkM;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzc;
            object2 = new zzepa();
            zzfdy.zza((AtomicReference)object, (zzfdx)object2);
        }
        object = this.zzg;
        object2 = new zzeom();
        zzfdy.zza((AtomicReference)object, (zzfdx)object2);
    }

    public final void zzdf() {
        zzeow zzeow2 = new zzeow();
        zzfdy.zza(this.zzc, zzeow2);
    }

    public final void zzdn(zzbxu zzbxu2) {
    }

    public final void zzdo(zzfhf zzfhf2) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbh zzg() {
        synchronized (this) {
            Object object = this.zzc;
            object = ((AtomicReference)object).get();
            return (zzbh)object;
        }
    }

    public final void zzh(zzs zzs2) {
        zzepb zzepb2 = new zzepb(zzs2);
        zzfdy.zza(this.zze, zzepb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcb zzi() {
        synchronized (this) {
            Object object = this.zzd;
            object = ((AtomicReference)object).get();
            return (zzcb)object;
        }
    }

    public final void zzj(zzbh zzbh2) {
        this.zzc.set(zzbh2);
    }

    public final void zzk(zzbk zzbk2) {
        this.zzf.set(zzbk2);
    }

    public final void zzl(zzdg zzdg2) {
        this.zze.set(zzdg2);
    }

    public final void zzm(zzcb zzcb2) {
        this.zzd.set(zzcb2);
        this.zzi.set(true);
        this.zzo();
    }

    public final void zzn(zzci zzci2) {
        this.zzg.set(zzci2);
    }

    public final void zzq(zze zze2) {
        zzeot zzeot2 = new zzeot(zze2);
        zzfdy.zza(this.zzg, zzeot2);
    }

    public final void zzr() {
        zzeoj zzeoj2 = new zzeoj();
        zzfdy.zza(this.zzc, zzeoj2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs() {
        synchronized (this) {
            Object object = new zzeor();
            AtomicReference atomicReference = this.zzc;
            zzfdy.zza(atomicReference, (zzfdx)object);
            object = new zzeos();
            atomicReference = this.zzf;
            zzfdy.zza(atomicReference, (zzfdx)object);
            object = this.zzj;
            boolean bl2 = true;
            ((AtomicBoolean)object).set(bl2);
            this.zzo();
            return;
        }
    }
}

