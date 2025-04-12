/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzccc;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzcbr {
    private final Clock zza;
    private final zzccc zzb;
    private final LinkedList zzc;
    private final Object zzd;
    private final String zze;
    private final String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    public zzcbr(Clock linkedList, zzccc zzccc2, String string2, String string3) {
        long l2;
        Object object;
        this.zzd = object = new Object();
        this.zzg = l2 = (long)-1;
        this.zzh = l2;
        this.zzi = 0L;
        this.zzj = l2;
        this.zzk = l2;
        this.zza = linkedList;
        this.zzb = zzccc2;
        this.zze = string2;
        this.zzf = string3;
        this.zzc = linkedList = new LinkedList();
    }

    public static /* bridge */ /* synthetic */ Clock zzb(zzcbr zzcbr2) {
        return zzcbr2.zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle zza() {
        Object object = this.zzd;
        synchronized (object) {
            try {
                Bundle bundle = new Bundle();
                ArrayList<Object> arrayList = "seq_num";
                Object object2 = this.zze;
                bundle.putString((String)((Object)arrayList), (String)object2);
                arrayList = "slotid";
                object2 = this.zzf;
                bundle.putString((String)((Object)arrayList), (String)object2);
                arrayList = "ismediation";
                object2 = null;
                bundle.putBoolean((String)((Object)arrayList), false);
                arrayList = "treq";
                long l2 = this.zzj;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = "tresponse";
                l2 = this.zzk;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = "timp";
                l2 = this.zzg;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = "tload";
                l2 = this.zzh;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = "pcc";
                l2 = this.zzi;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = "tfetch";
                l2 = -1;
                bundle.putLong((String)((Object)arrayList), l2);
                arrayList = new ArrayList<Object>();
                object2 = this.zzc;
                object2 = ((AbstractCollection)object2).iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        object2 = "tclick";
                        bundle.putParcelableArrayList((String)object2, arrayList);
                        return bundle;
                    }
                    Object object3 = object2.next();
                    object3 = (zzcbq)object3;
                    object3 = ((zzcbq)object3).zzb();
                    arrayList.add(object3);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String zzc() {
        return this.zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        long l2 = this.zzk;
                        long l3 = -1;
                        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l4 == false) break block3;
                        Object object2 = new zzcbq(this);
                        ((zzcbq)object2).zzd();
                        LinkedList linkedList = this.zzc;
                        linkedList.add(object2);
                        l2 = this.zzi;
                        l3 = 1L;
                        this.zzi = l2 += l3;
                        object2 = this.zzb;
                        ((zzccc)object2).zzf();
                        object2 = this.zzb;
                        ((zzccc)object2).zze(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
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
    public final void zze() {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2;
                        boolean bl2;
                        long l2 = this.zzk;
                        long l3 = -1;
                        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l4 == false || (bl2 = ((AbstractCollection)(object2 = this.zzc)).isEmpty())) break block3;
                        object2 = this.zzc;
                        object2 = ((LinkedList)object2).getLast();
                        long l7 = ((zzcbq)(object2 = (zzcbq)object2)).zza();
                        long l8 = l7 - l3;
                        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object3 != false) break block3;
                        ((zzcbq)object2).zzc();
                        object2 = this.zzb;
                        ((zzccc)object2).zze(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
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
    public final void zzf() {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        long l2;
                        long l3 = this.zzk;
                        long l4 = -1;
                        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                        if (l7 == false || (l7 = (l2 = (l3 = this.zzg) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) break block3;
                        object2 = this.zza;
                        this.zzg = l3 = object2.elapsedRealtime();
                        object2 = this.zzb;
                        ((zzccc)object2).zze(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.zzb;
                ((zzccc)object2).zzg();
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
    public final void zzg() {
        Object object = this.zzd;
        synchronized (object) {
            zzccc zzccc2 = this.zzb;
            zzccc2.zzh();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(boolean bl2) {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        long l2 = this.zzk;
                        long l3 = -1;
                        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l4 == false) break block3;
                        Clock clock = this.zza;
                        this.zzh = l2 = clock.elapsedRealtime();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
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
    public final void zzi() {
        Object object = this.zzd;
        synchronized (object) {
            zzccc zzccc2 = this.zzb;
            zzccc2.zzi();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(zzl zzl2) {
        Object object = this.zzd;
        synchronized (object) {
            long l2;
            Clock clock = this.zza;
            this.zzj = l2 = clock.elapsedRealtime();
            zzccc zzccc2 = this.zzb;
            zzccc2.zzj(zzl2, l2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(long l2) {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.zzk = l2;
                        long l3 = -1;
                        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l4 == false) break block3;
                        zzccc zzccc2 = this.zzb;
                        zzccc2.zze(this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

