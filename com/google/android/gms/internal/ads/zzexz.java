/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzexx;
import com.google.android.gms.internal.ads.zzexy;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzexz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfmn zzd;
    private final zzdvc zze;
    private long zzf = 0L;
    private int zzg = 0;

    public zzexz(Context context, Executor executor, Set set, zzfmn zzfmn2, zzdvc zzdvc2) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfmn2;
        this.zze = zzdvc2;
    }

    public final ListenableFuture zza(Object object, Bundle object2) {
        int n3;
        Object object3;
        int n4;
        long l2;
        Object object4 = this.zza;
        ArrayList<ListenableFuture> arrayList = zzfmu.zzo;
        object4 = zzfmb.zza((Context)object4, (zzfmu)((Object)arrayList));
        object4.zzj();
        int n7 = this.zzb.size();
        arrayList = new ArrayList<ListenableFuture>(n7);
        Object object5 = new ArrayList();
        Object object6 = zzbep.zzlM;
        Object object7 = (String)zzba.zzc().zza((zzbeg)object6);
        boolean bl2 = ((String)object7).isEmpty();
        if (!bl2) {
            object5 = (String)zzba.zzc().zza((zzbeg)object6);
            object6 = ",";
            object5 = Arrays.asList(((String)object5).split((String)object6));
        }
        this.zzf = l2 = zzu.zzB().elapsedRealtime();
        object6 = new Bundle();
        object7 = zzbep.zzcd;
        Object object8 = zzba.zzc();
        object7 = (Boolean)((zzben)object8).zza((zzbeg)object7);
        bl2 = (Boolean)object7;
        if (bl2 && object2 != null) {
            object7 = zzu.zzB();
            long l3 = object7.currentTimeMillis();
            n4 = object instanceof Bundle;
            if (n4 != 0) {
                object3 = zzdul.zzc.zza();
                object2.putLong((String)object3, l3);
            } else {
                object3 = zzdul.zzf.zza();
                object2.putLong((String)object3, l3);
            }
        }
        object7 = this.zzb.iterator();
        while ((n3 = object7.hasNext()) != 0) {
            zzexx zzexx2;
            Object object9 = object8 = object7.next();
            object9 = (zzexw)object8;
            n3 = object5.contains(object8 = String.valueOf(object9.zza()));
            if (n3 != 0) continue;
            object8 = zzbep.zzge;
            object3 = zzba.zzc();
            object8 = (Boolean)((zzben)object3).zza((zzbeg)object8);
            n3 = ((Boolean)object8).booleanValue();
            if (n3 != 0 && (n3 = object9.zza()) == (n4 = 44)) continue;
            long l4 = zzu.zzB().elapsedRealtime();
            ListenableFuture listenableFuture = object9.zzb();
            object8 = zzexx2;
            object3 = this;
            zzexx2 = new zzexx(this, l4, (zzexw)object9, (Bundle)object6);
            object8 = zzcci.zzf;
            listenableFuture.addListener(zzexx2, (Executor)object8);
            arrayList.add(listenableFuture);
        }
        object5 = zzgft.zzb(arrayList);
        object7 = new zzexy(arrayList, object, (Bundle)object2, (Bundle)object6);
        object = this.zzc;
        object = ((zzgfs)object5).zza((Callable)object7, (Executor)object);
        boolean bl3 = zzfmq.zza();
        if (bl3) {
            object2 = this.zzd;
            zzfmm.zzb((ListenableFuture)object, (zzfmn)object2, (zzfmc)object4);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(long l2, zzexw object, Bundle object2) {
        Object object3;
        block18: {
            Object object4;
            String string2 = "sig";
            Clock clock = zzu.zzB();
            long l3 = clock.elapsedRealtime() - l2;
            object3 = (Boolean)zzbgm.zza.zze();
            int n3 = ((Boolean)object3).booleanValue();
            if (n3 != 0) {
                object3 = zzfyv.zzc(object.getClass().getCanonicalName());
                String string3 = "Signal runtime (ms) : ";
                object4 = new StringBuilder(string3);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append(" = ");
                ((StringBuilder)object4).append(l3);
                object3 = ((StringBuilder)object4).toString();
                com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            }
            object3 = zzbep.zzcd;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            n3 = ((Boolean)object3).booleanValue();
            if (n3 != 0) {
                object3 = zzbep.zzce;
                object4 = zzba.zzc();
                object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
                n3 = ((Boolean)object3).booleanValue();
                if (n3 != 0) {
                    synchronized (this) {
                        n3 = object.zza();
                        object4 = new StringBuilder(string2);
                        ((StringBuilder)object4).append(n3);
                        object3 = ((StringBuilder)object4).toString();
                        object2.putLong((String)object3, l3);
                    }
                }
            }
            object3 = zzbep.zzcb;
            object4 = zzba.zzc();
            object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
            n3 = ((Boolean)object3).booleanValue();
            if (n3 == 0) {
                return;
            }
            object3 = this.zze.zza();
            ((zzdvb)object3).zzb("action", "lat_ms");
            ((zzdvb)object3).zzb("lat_grp", "sig_lat_grp");
            object4 = String.valueOf(object.zza());
            ((zzdvb)object3).zzb("lat_id", (String)object4);
            object4 = String.valueOf(l3);
            ((zzdvb)object3).zzb("clat_ms", (String)object4);
            object4 = zzbep.zzcc;
            object2 = zzba.zzc();
            object4 = (Boolean)((zzben)object2).zza((zzbeg)object4);
            int n4 = ((Boolean)object4).booleanValue();
            if (n4 != 0) {
                synchronized (this) {
                    this.zzg = n4 = this.zzg + 1;
                }
                object4 = zzu.zzo().zzh().zzd();
                object2 = "seq_num";
                ((zzdvb)object3).zzb((String)object2, (String)object4);
                synchronized (this) {
                    Throwable throwable2;
                    block17: {
                        block16: {
                            int n7;
                            long l4;
                            int n8;
                            try {
                                long l7;
                                long l8;
                                n4 = this.zzg;
                                object2 = this.zzb;
                                n8 = object2.size();
                                if (n4 != n8 || (n4 = (int)((l8 = (l7 = this.zzf) - (l4 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) break block16;
                                n4 = 0;
                                object4 = null;
                                this.zzg = 0;
                                object4 = zzu.zzB();
                                l7 = object4.elapsedRealtime();
                                l4 = this.zzf;
                            }
                            catch (Throwable throwable2) {
                                break block17;
                            }
                            object4 = String.valueOf(l7 -= l4);
                            n8 = object.zza();
                            int n10 = 39;
                            if (n8 > n10 && (n7 = object.zza()) < (n8 = 52)) {
                                object = "lat_gmssg";
                                ((zzdvb)object3).zzb((String)object, (String)object4);
                            } else {
                                object = "lat_clsg";
                                ((zzdvb)object3).zzb((String)object, (String)object4);
                            }
                        }
                        break block18;
                    }
                    throw throwable2;
                }
            }
        }
        ((zzdvb)object3).zzg();
    }
}

