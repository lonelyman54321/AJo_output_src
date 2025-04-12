/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqi;
import com.google.android.gms.internal.ads.zzcqj;
import com.google.android.gms.internal.ads.zzcqk;
import com.google.android.gms.internal.ads.zzcql;
import com.google.android.gms.internal.ads.zzcqm;
import com.google.android.gms.internal.ads.zzcqn;
import com.google.android.gms.internal.ads.zzcqo;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdgz;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcqp
implements zzczl,
zzdaz,
zzdaf,
zza,
zzdab,
zzdgz {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhf zze;
    private final zzfgt zzf;
    private final zzfoa zzg;
    private final zzfia zzh;
    private final zzaxd zzi;
    private final zzbfs zzj;
    private final zzfmn zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcyn zzn;
    private boolean zzo;
    private final AtomicBoolean zzp;
    private final zzbfu zzq;

    public zzcqp(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfhf zzfhf2, zzfgt zzfgt2, zzfoa zzfoa2, zzfia zzfia2, View view, zzchd zzchd2, zzaxd zzaxd2, zzbfs zzbfs2, zzbfu zzbfu2, zzfmn zzfmn2, zzcyn zzcyn2) {
        Object object = new AtomicBoolean();
        this.zzp = object;
        object = context;
        this.zza = context;
        object = executor;
        this.zzb = executor;
        object = executor2;
        this.zzc = executor2;
        object = scheduledExecutorService;
        this.zzd = scheduledExecutorService;
        object = zzfhf2;
        this.zze = zzfhf2;
        object = zzfgt2;
        this.zzf = zzfgt2;
        object = zzfoa2;
        this.zzg = zzfoa2;
        object = zzfia2;
        this.zzh = zzfia2;
        object = zzaxd2;
        this.zzi = zzaxd2;
        object = new WeakReference(view);
        this.zzl = object;
        object = new WeakReference(zzchd2);
        this.zzm = object;
        object = zzbfs2;
        this.zzj = zzbfs2;
        object = zzbfu2;
        this.zzq = zzbfu2;
        object = zzfmn2;
        this.zzk = zzfmn2;
        object = zzcyn2;
        this.zzn = zzcyn2;
    }

    public static /* bridge */ /* synthetic */ Context zzg(zzcqp zzcqp2) {
        return zzcqp2.zza;
    }

    public static /* bridge */ /* synthetic */ zzfgt zzh(zzcqp zzcqp2) {
        return zzcqp2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfhf zzi(zzcqp zzcqp2) {
        return zzcqp2.zze;
    }

    public static /* bridge */ /* synthetic */ zzfia zzj(zzcqp zzcqp2) {
        return zzcqp2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzfoa zzk(zzcqp zzcqp2) {
        return zzcqp2.zzg;
    }

    public static /* bridge */ /* synthetic */ List zzl(zzcqp zzcqp2) {
        return zzcqp2.zzu();
    }

    public static /* synthetic */ void zzm(zzcqp zzcqp2) {
        zzcqp2.zzv();
    }

    private final List zzu() {
        Object object = zzbep.zzls;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            zzu.zzp();
            object = this.zza;
            boolean bl2 = zzt.zzB((Context)object);
            if (bl2) {
                zzu.zzp();
                object = zzt.zzs(this.zza);
                if (object != null) {
                    boolean bl3;
                    int n4 = (Integer)object;
                    int n7 = 20;
                    int n8 = Math.min(n4, n7);
                    object2 = new Object();
                    Iterator iterator = this.zzf.zzd.iterator();
                    while (bl3 = iterator.hasNext()) {
                        Object object3 = Uri.parse((String)((String)iterator.next())).buildUpon();
                        String string2 = Integer.toString(n8);
                        String string3 = "dspct";
                        object3 = object3.appendQueryParameter(string3, string2).toString();
                        ((ArrayList)object2).add(object3);
                    }
                    return object2;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzv() {
        block7: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            block10: {
                block9: {
                    boolean bl2;
                    block8: {
                        boolean n3;
                        object5 = this.zzf.zzd;
                        if (object5 == null || (n3 = object5.isEmpty())) break block7;
                        object5 = zzbep.zzdx;
                        object5 = (Boolean)zzba.zzc().zza((zzbeg)object5);
                        boolean bl3 = (Boolean)object5;
                        object4 = null;
                        if (bl3) {
                            object5 = this.zzi;
                            object3 = this.zza;
                            object2 = this.zzl;
                            object5 = ((zzaxd)object5).zzc();
                            object2 = (View)((Reference)object2).get();
                            object = object5 = object5.zzh((Context)object3, (View)object2, null);
                        } else {
                            object = null;
                        }
                        object5 = zzbep.zzao;
                        object3 = zzba.zzc();
                        object5 = (Boolean)((zzben)object3).zza((zzbeg)object5);
                        boolean bl4 = (Boolean)object5;
                        if (!bl4) break block8;
                        object5 = this.zze.zzb.zzb;
                        boolean bl5 = ((zzfgw)object5).zzg;
                        if (bl5) break block9;
                    }
                    if (bl2 = ((Boolean)(object5 = (Boolean)zzbgj.zzh.zze())).booleanValue()) break block10;
                }
                object5 = this.zzh;
                object3 = this.zzg;
                object2 = this.zze;
                zzfgt zzfgt2 = this.zzf;
                List list = this.zzu();
                object4 = ((zzfoa)object3).zzd((zzfhf)object2, zzfgt2, false, (String)object, null, list);
                ((zzfia)object5).zza((List)object4);
                return;
            }
            object5 = (Boolean)zzbgj.zzg.zze();
            boolean bl6 = (Boolean)object5;
            if (bl6) {
                object5 = this.zzf;
                int n3 = ((zzfgt)object5).zzb;
                int n4 = 1;
                if (n3 == n4 || n3 == (n4 = 2) || n3 == (n4 = 5)) {
                    object5 = (zzchd)this.zzm.get();
                }
            }
            object5 = zzgfk.zzu(zzgft.zzh(null));
            object4 = zzbep.zzaW;
            long l2 = (Long)zzba.zzc().zza((zzbeg)object4);
            object2 = this.zzd;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object5 = (zzgfk)zzgft.zzo((ListenableFuture)object5, l2, timeUnit, (ScheduledExecutorService)object2);
            object4 = new zzcqo(this, (String)object);
            object3 = this.zzb;
            zzgft.zzr((ListenableFuture)object5, (zzgfp)object4, (Executor)object3);
        }
    }

    private final void zzw(int n3, int n4) {
        int n7;
        int n8;
        Object object;
        if (n3 > 0 && ((object = (View)this.zzl.get()) == null || (n8 = object.getHeight()) == 0 || (n7 = object.getWidth()) == 0)) {
            object = this.zzd;
            zzcqm zzcqm2 = new zzcqm(this, n3, n4);
            long l2 = n4;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object.schedule(zzcqm2, l2, timeUnit);
            return;
        }
        this.zzv();
    }

    public final void onAdClicked() {
        Object object;
        Object object2;
        block6: {
            boolean bl2;
            block5: {
                object2 = zzbep.zzao;
                object = zzba.zzc();
                object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
                bl2 = (Boolean)object2;
                if (!bl2) break block5;
                object2 = this.zze.zzb.zzb;
                bl2 = ((zzfgw)object2).zzg;
                if (bl2) break block6;
            }
            if (bl2 = ((Boolean)(object2 = (Boolean)zzbgj.zzd.zze())).booleanValue()) {
                object2 = zzgfk.zzu(this.zzj.zza());
                object = new zzcqj();
                Executor executor = zzcci.zzf;
                object2 = zzgft.zze((ListenableFuture)object2, Throwable.class, (zzfxu)object, executor);
                object = new zzcqn(this);
                executor = this.zzb;
                zzgft.zzr((ListenableFuture)object2, (zzgfp)object, executor);
                return;
            }
        }
        object2 = this.zzh;
        object = this.zzg;
        Object object3 = this.zze;
        zzfgt zzfgt2 = this.zzf;
        Context context = this.zza;
        List list = zzfgt2.zzc;
        object = ((zzfoa)object).zzc((zzfhf)object3, zzfgt2, list);
        int n3 = 1;
        object3 = zzu.zzo();
        int n4 = ((zzcby)object3).zzA(context);
        if (n3 == n4) {
            n3 = 2;
        }
        ((zzfia)object2).zzc((List)object, n3);
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzds(zzbyh object, String object2, String object3) {
        object2 = this.zzg;
        object3 = this.zzf;
        List list = ((zzfgt)object3).zzi;
        zzfia zzfia2 = this.zzh;
        object = ((zzfoa)object2).zze((zzfgt)object3, list, (zzbyh)object);
        zzfia2.zza((List)object);
    }

    public final void zze() {
        Object object = this.zzg;
        zzfhf zzfhf2 = this.zze;
        zzfgt zzfgt2 = this.zzf;
        List list = zzfgt2.zzj;
        zzfia zzfia2 = this.zzh;
        object = ((zzfoa)object).zzc(zzfhf2, zzfgt2, list);
        zzfia2.zza((List)object);
    }

    public final void zzf() {
        Object object = this.zzg;
        zzfhf zzfhf2 = this.zze;
        zzfgt zzfgt2 = this.zzf;
        List list = zzfgt2.zzh;
        zzfia zzfia2 = this.zzh;
        object = ((zzfoa)object).zzc(zzfhf2, zzfgt2, list);
        zzfia2.zza((List)object);
    }

    public final /* synthetic */ void zzn() {
        zzcql zzcql2 = new zzcql(this);
        this.zzb.execute(zzcql2);
    }

    public final /* synthetic */ void zzo(int n3, int n4) {
        this.zzw(n3 += -1, n4);
    }

    public final /* synthetic */ void zzp(int n3, int n4) {
        zzcqk zzcqk2 = new zzcqk(this, n3, n4);
        this.zzb.execute(zzcqk2);
    }

    public final void zzq(zze object) {
        Object object2 = zzbep.zzbw;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            int n3 = ((zze)object).zza;
            object2 = this.zzf.zzp;
            int n4 = 2;
            object = zzfoa.zzf(n4, n3, (List)object2);
            object2 = this.zzh;
            object3 = this.zzg;
            zzfhf zzfhf2 = this.zze;
            zzfgt zzfgt2 = this.zzf;
            object = ((zzfoa)object3).zzc(zzfhf2, zzfgt2, (List)object);
            ((zzfia)object2).zza((List)object);
        }
    }

    public final void zzr() {
        Object object = this.zzp;
        int n3 = 0;
        Object object2 = null;
        boolean bl2 = true;
        boolean n4 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (!n4) {
            return;
        }
        object = zzbep.zzdG;
        object2 = zzba.zzc();
        object = (Integer)((zzben)object2).zza((zzbeg)object);
        int n7 = (Integer)object;
        if (n7 > 0) {
            object2 = zzbep.zzdH;
            n3 = (Integer)zzba.zzc().zza((zzbeg)object2);
            this.zzw(n7, n3);
            return;
        }
        object = zzbep.zzdF;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3) {
            object = this.zzc;
            object2 = new zzcqi(this);
            object.execute((Runnable)object2);
            return;
        }
        this.zzv();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    block4: {
                        try {
                            bl2 = this.zzo;
                            if (!bl2) break block4;
                            Object object = this.zzu();
                            ArrayList arrayList = new ArrayList(object);
                            object = this.zzf;
                            object = ((zzfgt)object).zzg;
                            arrayList.addAll(object);
                            object = this.zzh;
                            Object object2 = this.zzg;
                            zzfhf zzfhf2 = this.zze;
                            zzfgt zzfgt2 = this.zzf;
                            boolean bl3 = true;
                            object2 = ((zzfoa)object2).zzd(zzfhf2, zzfgt2, bl3, null, null, arrayList);
                            ((zzfia)object).zza((List)object2);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    Object object = this.zzh;
                    Object object3 = this.zzg;
                    Object object4 = this.zze;
                    Object object5 = this.zzf;
                    Object object6 = ((zzfgt)object5).zzn;
                    object3 = ((zzfoa)object3).zzc((zzfhf)object4, (zzfgt)object5, (List)object6);
                    ((zzfia)object).zza((List)object3);
                    object = zzbep.zzdC;
                    object3 = zzba.zzc();
                    object = ((zzben)object3).zza((zzbeg)object);
                    object = (Boolean)object;
                    bl2 = (Boolean)object;
                    if (bl2 && (object = this.zzn) != null) {
                        object3 = ((zzcyn)object).zzb();
                        object3 = ((zzfgt)object3).zzn;
                        object = ((zzcyn)object).zza();
                        object = ((zzelf)object).zzg();
                        object = zzfoa.zzg((List)object3, (String)object);
                        object3 = this.zzn;
                        object3 = ((zzcyn)object3).zza();
                        long l2 = ((zzelf)object3).zza();
                        object = zzfoa.zzh((List)object, l2);
                        object3 = this.zzh;
                        object4 = this.zzg;
                        object5 = this.zzn;
                        object6 = ((zzcyn)object5).zzc();
                        object5 = ((zzcyn)object5).zzb();
                        object = ((zzfoa)object4).zzc((zzfhf)object6, (zzfgt)object5, (List)object);
                        ((zzfia)object3).zza((List)object);
                    }
                    object = this.zzh;
                    object3 = this.zzg;
                    object4 = this.zze;
                    object5 = this.zzf;
                    object6 = ((zzfgt)object5).zzg;
                    object3 = ((zzfoa)object3).zzc((zzfhf)object4, (zzfgt)object5, (List)object6);
                    ((zzfia)object).zza((List)object3);
                }
                this.zzo = bl2 = true;
                return;
            }
            throw throwable2;
        }
    }

    public final void zzt() {
        Object object = this.zzg;
        zzfhf zzfhf2 = this.zze;
        zzfgt zzfgt2 = this.zzf;
        List list = zzfgt2.zzav;
        zzfia zzfia2 = this.zzh;
        object = ((zzfoa)object).zzc(zzfhf2, zzfgt2, list);
        zzfia2.zza((List)object);
    }
}

