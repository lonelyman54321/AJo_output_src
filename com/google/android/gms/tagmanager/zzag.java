/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.internal.gtm.zzrb;
import com.google.android.gms.internal.gtm.zzrc;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.TagManager;
import com.google.android.gms.tagmanager.zzaa;
import com.google.android.gms.tagmanager.zzab;
import com.google.android.gms.tagmanager.zzac;
import com.google.android.gms.tagmanager.zzad;
import com.google.android.gms.tagmanager.zzae;
import com.google.android.gms.tagmanager.zzah;
import com.google.android.gms.tagmanager.zzak;
import com.google.android.gms.tagmanager.zzdb;
import com.google.android.gms.tagmanager.zzdv;
import com.google.android.gms.tagmanager.zzdx;
import com.google.android.gms.tagmanager.zzee;
import com.google.android.gms.tagmanager.zzeh;
import com.google.android.gms.tagmanager.zzv;
import com.google.android.gms.tagmanager.zzx;
import com.google.android.gms.tagmanager.zzy;
import com.google.android.gms.tagmanager.zzz;
import java.util.HashMap;

public final class zzag
extends BasePendingResult {
    private final Clock zza;
    private final zzac zzb;
    private final Looper zzc;
    private final zzdx zzd;
    private final int zze;
    private final Context zzf;
    private final TagManager zzg;
    private final String zzh;
    private final zzah zzi;
    private zzae zzj;
    private volatile zzx zzk;
    private volatile boolean zzl;
    private com.google.android.gms.internal.gtm.zzah zzm;
    private long zzn;
    private String zzo;
    private zzad zzp;
    private zzz zzq;

    public zzag(Context context, TagManager tagManager, Looper looper, String string2, int n3, zzak zzak2) {
        zzee zzee2;
        zzag zzag2 = this;
        Context context2 = context;
        String string3 = string2;
        zzeh zzeh2 = new zzeh(context, string2);
        Object object = zzee2;
        Object object2 = context;
        Object object3 = string2;
        Object object4 = zzak2;
        zzee2 = new zzee(context, string2, zzak2, null, null);
        new HashMap();
        object = zzfx.zza();
        int n4 = 2;
        object.zza(n4);
        DefaultClock.getInstance();
        new HashMap();
        object = DefaultClock.getInstance();
        String string4 = "refreshing";
        Clock clock = DefaultClock.getInstance();
        int n7 = 1;
        int n8 = 5;
        long l2 = 900000L;
        long l3 = 5000L;
        super(n7, n8, l2, l3, string4, clock);
        object3 = new zzah(context, string2);
        object4 = looper == null ? Looper.getMainLooper() : looper;
        super((Looper)object4);
        zzag2.zzf = context2;
        object4 = tagManager;
        zzag2.zzg = tagManager;
        object4 = looper == null ? Looper.getMainLooper() : looper;
        zzag2.zzc = object4;
        zzag2.zzh = string3;
        zzag2.zze = n3;
        zzag2.zzj = zzeh2;
        zzag2.zzp = zzee2;
        zzag2.zzb = object4 = new zzac(zzag2, null);
        zzag2.zzm = object4 = com.google.android.gms.internal.gtm.zzah.zzf();
        zzag2.zza = object;
        zzag2.zzd = object2;
        zzag2.zzi = object3;
        boolean bl2 = this.zzv();
        if (bl2) {
            object = zzdv.zza().zzb();
            zzag2.zzo((String)object);
        }
        zzak2.zza();
    }

    public static /* bridge */ /* synthetic */ long zza(zzag zzag2) {
        return zzag2.zzn;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.gtm.zzah zzb(zzag zzag2) {
        return zzag2.zzm;
    }

    public static /* bridge */ /* synthetic */ Clock zzc(zzag zzag2) {
        return zzag2.zza;
    }

    public static /* bridge */ /* synthetic */ zzx zze(zzag zzag2) {
        return zzag2.zzk;
    }

    public static /* bridge */ /* synthetic */ zzah zzf(zzag zzag2) {
        return zzag2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzdx zzg(zzag zzag2) {
        return zzag2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzag zzag2, long l2) {
        zzag2.zzr(l2);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzag zzag2, com.google.android.gms.internal.gtm.zzah zzah2) {
        zzag2.zzt(zzah2);
    }

    public static /* bridge */ /* synthetic */ void zzk(zzag zzag2, com.google.android.gms.internal.gtm.zzah zzah2, long l2, boolean bl2) {
        zzag2.zzu(zzah2, l2, bl2);
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzag zzag2) {
        boolean cfr_ignored_0 = zzag2.zzl;
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzq(zzag zzag2) {
        return zzag2.zzv();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzr(long l2) {
        synchronized (this) {
            zzad zzad2 = this.zzp;
            if (zzad2 == null) {
                return;
            }
            Object object = this.zzm;
            object = ((com.google.android.gms.internal.gtm.zzah)object).zzh();
            zzad2.zza(l2, (String)object);
            return;
        }
    }

    private final void zzs(boolean bl2) {
        Object object = this.zzj;
        Object object2 = null;
        zzdb zzdb2 = new zzaa(this, null);
        object.zzd(zzdb2);
        object = this.zzp;
        zzdb2 = new zzab(this, null);
        object.zzc(zzdb2);
        object = this.zzj;
        int n3 = this.zze;
        zzrg zzrg2 = object.zza(n3);
        if (zzrg2 != null) {
            zzx zzx2;
            Container container;
            object = this.zzg;
            zzdb2 = this.zzc;
            Context context = this.zzf;
            String string2 = this.zzh;
            DataLayer dataLayer = ((TagManager)object).getDataLayer();
            long l2 = 0L;
            object2 = container;
            container = new Container(context, dataLayer, string2, l2, zzrg2);
            object2 = this.zzb;
            this.zzk = zzx2 = new zzx((TagManager)object, (Looper)zzdb2, container, (zzv)object2);
        }
        this.zzq = object = new zzz(this, bl2);
        bl2 = this.zzv();
        if (bl2) {
            this.zzp.zza(0L, "");
            return;
        }
        this.zzj.zzb();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzt(com.google.android.gms.internal.gtm.zzah object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object2 = this.zzj;
                    if (object2 != null) {
                        object2 = zzrc.zze();
                        long l2 = 0L;
                        ((zzrb)object2).zzc(l2);
                        com.google.android.gms.internal.gtm.zzz zzz2 = com.google.android.gms.internal.gtm.zzz.zzk();
                        ((zzrb)object2).zza(zzz2);
                        l2 = this.zzn;
                        ((zzrb)object2).zzc(l2);
                        zzz2 = com.google.android.gms.internal.gtm.zzz.zzk();
                        ((zzrb)object2).zza(zzz2);
                        ((zzrb)object2).zzb((com.google.android.gms.internal.gtm.zzah)object);
                        object = this.zzj;
                        object2 = ((zzaca)object2).zzB();
                        object2 = (zzrc)object2;
                        object.zzc((zzrc)object2);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzu(com.google.android.gms.internal.gtm.zzah object, long l2, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object2;
                    try {
                        bl2 = this.isReady();
                        if (bl2 && (object2 = this.zzk) == null) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    this.zzm = object;
                    this.zzn = l2;
                    object2 = this.zzi;
                    long l3 = ((zzah)object2).zza();
                    long l4 = this.zzn + l3;
                    object2 = this.zza;
                    long l7 = object2.currentTimeMillis();
                    l3 = Math.min(l3, l4 -= l7);
                    l4 = 0L;
                    l3 = Math.max(l4, l3);
                    this.zzr(l3);
                    Context context = this.zzf;
                    object2 = this.zzg;
                    String string2 = this.zzh;
                    DataLayer dataLayer = ((TagManager)object2).getDataLayer();
                    Container container = new Container(context, dataLayer, string2, l2, (com.google.android.gms.internal.gtm.zzah)object);
                    object = this.zzk;
                    if (object == null) {
                        object = this.zzg;
                        Looper looper = this.zzc;
                        zzac zzac2 = this.zzb;
                        this.zzk = object2 = new zzx((TagManager)object, looper, container, zzac2);
                    } else {
                        object = this.zzk;
                        ((zzx)object).zzc(container);
                    }
                    boolean bl3 = this.isReady();
                    if (!bl3 && (bl3 = ((zzz)(object = this.zzq)).zza(container))) {
                        object = this.zzk;
                        this.setResult((Result)object);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private final boolean zzv() {
        String string2;
        boolean bl2;
        int n3;
        Object object = zzdv.zza();
        int n4 = ((zzdv)object).zze();
        return (n4 == (n3 = 2) || (n4 = ((zzdv)object).zze()) == (n3 = 3)) && (bl2 = (string2 = this.zzh).equals(object = ((zzdv)object).zzc()));
    }

    public final ContainerHolder zzd(Status status) {
        Result result2 = this.zzk;
        if (result2 != null) {
            return this.zzk;
        }
        result2 = Status.RESULT_SUCCESS_CACHE;
        result2 = new zzx(status);
        return result2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzh() {
        synchronized (this) {
            return this.zzo;
        }
    }

    public final void zzl() {
        zzae zzae2 = this.zzj;
        int n3 = this.zze;
        zzrg zzrg2 = zzae2.zza(n3);
        zzae2 = null;
        if (zzrg2 != null) {
            Container container;
            Object object = this.zzf;
            TagManager tagManager = this.zzg;
            String string2 = this.zzh;
            Object object2 = tagManager.getDataLayer();
            long l2 = 0L;
            Container container2 = container;
            container = new Container((Context)object, (DataLayer)object2, string2, l2, zzrg2);
            tagManager = this.zzg;
            container2 = this.zzc;
            object2 = new zzy(this);
            object = new zzx(tagManager, (Looper)container2, container, (zzv)object2);
            this.setResult((Result)object);
        } else {
            int n4 = 10;
            String string3 = "Default was requested, but no default container was found";
            Result result2 = new Status(n4, string3, null);
            result2 = this.zzd((Status)result2);
            this.setResult(result2);
        }
        this.zzp = null;
        this.zzj = null;
    }

    public final void zzm() {
        this.zzs(true);
    }

    public final void zzn() {
        this.zzs(false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.zzo = string2;
                    zzad zzad2 = this.zzp;
                    if (zzad2 != null) {
                        zzad2.zzb(string2);
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

