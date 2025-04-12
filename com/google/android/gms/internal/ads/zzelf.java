/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzeld;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelh;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzelf {
    private final Clock zza;
    private final zzelh zzb;
    private final zzfoe zzc;
    private final LinkedHashMap zzd;
    private final boolean zze;
    private final zzehq zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzelf(Clock object, zzelh zzelh2, zzehq zzehq2, zzfoe zzfoe2) {
        boolean bl2;
        LinkedHashMap linkedHashMap;
        this.zzd = linkedHashMap = new LinkedHashMap();
        this.zza = object;
        this.zzb = zzelh2;
        object = zzbep.zzhb;
        this.zze = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzf = zzehq2;
        this.zzc = zzfoe2;
    }

    public static /* bridge */ /* synthetic */ zzehq zzb(zzelf zzelf2) {
        return zzelf2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzelh zzc(zzelf zzelf2) {
        return zzelf2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzfoe zzd(zzelf zzelf2) {
        return zzelf2.zzc;
    }

    public static /* bridge */ /* synthetic */ Clock zze(zzelf zzelf2) {
        return zzelf2.zza;
    }

    public static /* bridge */ /* synthetic */ LinkedHashMap zzh(zzelf zzelf2) {
        return zzelf2.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzn(zzelf zzelf2) {
        return zzelf2.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zzo(zzelf zzelf2) {
        return zzelf2.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzelf zzelf2, zzfgt zzfgt2) {
        return zzelf2.zzq(zzfgt2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzq(zzfgt object) {
        int n3;
        int n4;
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.zzd;
            object = linkedHashMap.get(object);
            object = (zzele)object;
            linkedHashMap = null;
            if (object == null) {
                return false;
            }
            n4 = ((zzele)object).zzc;
            n3 = 8;
        }
        if (n4 != n3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zza() {
        synchronized (this) {
            return this.zzh;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzf(zzfhf zzfhf2, zzfgt zzfgt2, ListenableFuture listenableFuture, zzfoa zzfoa2) {
        Object object = zzfgt2;
        ListenableFuture listenableFuture2 = listenableFuture;
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2;
                        Object object3 = zzfhf2.zzb;
                        zzfgw zzfgw2 = ((zzfhe)object3).zzb;
                        object3 = this.zza;
                        long l2 = object3.elapsedRealtime();
                        String string2 = zzfgt2.zzx;
                        if (string2 == null) break block4;
                        object3 = this.zzd;
                        String string3 = zzfgt2.zzag;
                        long l3 = 0L;
                        int n3 = 9;
                        Object object4 = object2;
                        object2 = new zzele(string2, string3, n3, l3, null);
                        ((AbstractMap)object3).put(zzfgt2, object2);
                        object3 = object4;
                        object2 = this;
                        object4 = new zzeld(this, l2, zzfgw2, zzfgt2, string2, zzfoa2, zzfhf2);
                        object = zzcci.zzf;
                        zzgft.zzr(listenableFuture, (zzgfp)object4, (Executor)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return listenableFuture2;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzg() {
        synchronized (this) {
            try {
                boolean bl2;
                Object object = new ArrayList();
                Object object2 = this.zzd;
                object2 = ((LinkedHashMap)object2).entrySet();
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    Object object3 = object2.next();
                    object3 = (Map.Entry)object3;
                    object3 = object3.getValue();
                    object3 = (zzele)object3;
                    int n3 = ((zzele)object3).zzc;
                    int n4 = -1 >>> 1;
                    if (n3 == n4) continue;
                    object3 = ((zzele)object3).toString();
                    ((ArrayList)object).add(object3);
                }
                object2 = "_";
                return TextUtils.join((CharSequence)object2, object);
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
    public final void zzi(zzfgt zzfgt2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                long l2;
                Object object;
                try {
                    object = this.zza;
                    long l3 = object.elapsedRealtime();
                    l2 = this.zzi;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzh = l3 -= l2;
                if (zzfgt2 != null) {
                    object = this.zzf;
                    ((zzehq)object).zze(zzfgt2);
                }
                this.zzg = bl2 = true;
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
    public final void zzj() {
        synchronized (this) {
            Clock clock = this.zza;
            long l2 = clock.elapsedRealtime();
            long l3 = this.zzi;
            this.zzh = l2 -= l3;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(List iterator) {
        synchronized (this) {
            try {
                boolean bl2;
                long l2;
                Object object = this.zza;
                this.zzi = l2 = object.elapsedRealtime();
                iterator = iterator.iterator();
                while (bl2 = iterator.hasNext()) {
                    object = iterator.next();
                    object = (zzfgt)object;
                    Object object2 = ((zzfgt)object).zzx;
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                    if (bl3) continue;
                    object2 = this.zzd;
                    String string2 = ((zzfgt)object).zzx;
                    String string3 = ((zzfgt)object).zzag;
                    long l3 = 0L;
                    int n3 = -1 >>> 1;
                    zzele zzele2 = new zzele(string2, string3, n3, l3, null);
                    ((AbstractMap)object2).put(object, zzele2);
                }
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl() {
        synchronized (this) {
            long l2;
            Clock clock = this.zza;
            this.zzi = l2 = clock.elapsedRealtime();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(zzfgt object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    int n3;
                    LinkedHashMap linkedHashMap = this.zzd;
                    object = linkedHashMap.get(object);
                    object = (zzele)object;
                    if (object != null && (n3 = this.zzg) == 0) {
                        ((zzele)object).zzc = n3 = 8;
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

