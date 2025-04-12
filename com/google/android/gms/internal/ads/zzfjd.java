/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdv$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzb$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zza$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzd;
import com.google.android.gms.internal.ads.zzbdv$zzb$zze;
import com.google.android.gms.internal.ads.zzbdv$zzb$zze$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzg;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzg$zza;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzfjb;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfjf;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjn;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzhbi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class zzfjd
implements zzfjc {
    private final ConcurrentHashMap zza;
    private final zzfjj zzb;
    private final zzfjf zzc;

    public zzfjd(zzfjj object) {
        ConcurrentHashMap concurrentHashMap;
        int n3 = ((zzfjj)object).zzd;
        this.zza = concurrentHashMap = new ConcurrentHashMap(n3);
        this.zzb = object;
        this.zzc = object = new zzfjf();
    }

    private final void zzf() {
        Object object = zzfjj.CREATOR;
        object = zzbep.zzgB;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            boolean bl3;
            object = new StringBuilder();
            object2 = this.zzb.zzb;
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(" PoolCollection");
            object2 = this.zzc.zzb();
            ((StringBuilder)object).append((String)object2);
            object2 = this.zza.entrySet().iterator();
            int n3 = 0;
            while (bl3 = object2.hasNext()) {
                Object object3;
                int n4;
                Object object4 = (Map.Entry)object2.next();
                ((StringBuilder)object).append(++n3);
                ((StringBuilder)object).append(". ");
                Object object5 = object4.getValue();
                ((StringBuilder)object).append(object5);
                ((StringBuilder)object).append("#");
                int n7 = ((Object)((zzfjm)object4.getKey())).hashCode();
                ((StringBuilder)object).append(n7);
                ((StringBuilder)object).append("    ");
                object5 = null;
                for (n7 = 0; n7 < (n4 = ((zzfjb)(object3 = (zzfjb)object4.getValue())).zzb()); ++n7) {
                    object3 = "[O]";
                    ((StringBuilder)object).append((String)object3);
                }
                object5 = (zzfjb)object4.getValue();
                n7 = ((zzfjb)object5).zzb();
                while (true) {
                    object3 = this.zzb;
                    n4 = ((zzfjj)object3).zzd;
                    if (n7 >= n4) break;
                    object3 = "[ ]";
                    ((StringBuilder)object).append((String)object3);
                    ++n7;
                }
                object5 = "\n";
                ((StringBuilder)object).append((String)object5);
                object4 = ((zzfjb)object4.getValue()).zzg();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append((String)object5);
            }
            while (true) {
                object2 = this.zzb;
                int n8 = ((zzfjj)object2).zzc;
                if (n3 >= n8) break;
                ((StringBuilder)object).append(++n3);
                object2 = ".\n";
                ((StringBuilder)object).append((String)object2);
            }
            object = ((StringBuilder)object).toString();
            zzm.zze((String)object);
        }
    }

    public final zzfjj zza() {
        return this.zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfjl zzb(zzfjm object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                block8: {
                    block5: {
                        Object object3;
                        block6: {
                            try {
                                object2 = this.zza;
                                object = ((ConcurrentHashMap)object2).get(object);
                                object = (zzfjb)object;
                                if (object == null) break block5;
                                object2 = ((zzfjb)object).zze();
                                if (object2 != null) break block6;
                                object3 = this.zzc;
                                ((zzfjf)object3).zze();
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        object = ((zzfjb)object).zzf();
                        if (object2 != null) {
                            object3 = zzbdv$zzb.zzd();
                            zzbdv$zzb$zza$zza zzbdv$zzb$zza$zza = zzbdv$zzb$zza.zza();
                            Object object4 = zzbdv$zzb$zzd.zzb;
                            zzbdv$zzb$zza$zza.zzf((zzbdv$zzb$zzd)object4);
                            object4 = zzbdv$zzb$zze.zzc();
                            boolean bl2 = ((zzfjz)object).zza;
                            ((zzbdv$zzb$zze$zza)object4).zzd(bl2);
                            int n3 = ((zzfjz)object).zzb;
                            ((zzbdv$zzb$zze$zza)object4).zze(n3);
                            zzbdv$zzb$zza$zza.zzg((zzbdv$zzb$zze$zza)object4);
                            ((zzbdv$zzb$zzc)object3).zzd(zzbdv$zzb$zza$zza);
                            object = ((zzhbi)object3).zzbn();
                            object = (zzbdv$zzb)object;
                            object3 = ((zzfjl)object2).zza;
                            object3 = object3.zzb();
                            object3 = ((zzcvx)object3).zzc();
                            ((zzdeq)object3).zzi((zzbdv$zzb)object);
                        }
                        break block8;
                    }
                    object = this.zzc;
                    ((zzfjf)object).zzf();
                    this.zzf();
                    return null;
                }
                this.zzf();
                return object2;
            }
            throw throwable2;
        }
    }

    public final zzfjm zzc(zzl zzl2, String string2, zzw zzw2) {
        Object object = this.zzb.zza;
        Object object2 = new zzbxy((Context)object);
        int n3 = ((zzbxy)object2).zza().zzk;
        String string3 = this.zzb.zzf;
        object = object2;
        object2 = new zzfjn(zzl2, string2, n3, string3, zzw2);
        return object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(zzfjm object, zzfjl object2) {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                int n3;
                Object object3;
                Object object4;
                Object object5;
                int n4;
                Object object6;
                Object object7;
                block11: {
                    block13: {
                        block14: {
                            block17: {
                                long l2;
                                int n7;
                                block15: {
                                    block16: {
                                        boolean bl2;
                                        try {
                                            long l3;
                                            object7 = this.zza;
                                            object7 = ((ConcurrentHashMap)object7).get(object);
                                            object7 = (zzfjb)object7;
                                            object6 = zzu.zzB();
                                            ((zzfjl)object2).zzd = l3 = object6.currentTimeMillis();
                                            if (object7 != null) break block11;
                                            object7 = this.zzb;
                                            n7 = ((zzfjj)object7).zzd;
                                            n4 = ((zzfjj)object7).zze * 1000;
                                        }
                                        catch (Throwable throwable2) {
                                            break block12;
                                        }
                                        {
                                            object6 = new zzfjb(n7, n4);
                                            object7 = this.zza;
                                            object5 = this.zzb;
                                            n4 = ((ConcurrentHashMap)object7).size();
                                            n7 = ((zzfjj)object5).zzc;
                                            if (n4 != n7) break block13;
                                            object7 = this.zzb;
                                            n4 = ((zzfjj)object7).zzg;
                                            n7 = n4 + -1;
                                            object4 = null;
                                            if (n4 == 0) break block14;
                                            l2 = Long.MAX_VALUE;
                                            if (n7 == 0) break block15;
                                            n4 = 1;
                                            if (n7 == n4) break block16;
                                            n4 = 2;
                                            if (n7 != n4) break block17;
                                            object7 = this.zza;
                                            object7 = ((ConcurrentHashMap)object7).entrySet();
                                            object7 = object7.iterator();
                                            n7 = -1 >>> 1;
                                        }
                                        while (bl2 = object7.hasNext()) {
                                            object3 = object7.next();
                                            object3 = (Map.Entry)object3;
                                            Object object8 = object3.getValue();
                                            n3 = ((zzfjb)(object8 = (zzfjb)object8)).zza();
                                            if (n3 >= n7) continue;
                                            object5 = object3.getValue();
                                            object5 = (zzfjb)object5;
                                            n7 = ((zzfjb)object5).zza();
                                            object4 = object3.getKey();
                                            object4 = (zzfjm)object4;
                                        }
                                        if (object4 != null) {
                                            object7 = this.zza;
                                            ((ConcurrentHashMap)object7).remove(object4);
                                        }
                                        break block17;
                                    }
                                    object7 = this.zza;
                                    object7 = ((ConcurrentHashMap)object7).entrySet();
                                    object7 = object7.iterator();
                                    while ((n7 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                                        object5 = object7.next();
                                        object5 = (Map.Entry)object5;
                                        Object object9 = object5.getValue();
                                        long l4 = ((zzfjb)(object9 = (zzfjb)object9)).zzd();
                                        long l7 = l4 - l2;
                                        Object object10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                        if (object10 >= 0) continue;
                                        object4 = object5.getValue();
                                        object4 = (zzfjb)object4;
                                        long l8 = ((zzfjb)object4).zzd();
                                        object5 = object5.getKey();
                                        object5 = (zzfjm)object5;
                                        l2 = l8;
                                        object4 = object5;
                                    }
                                    if (object4 != null) {
                                        object7 = this.zza;
                                        ((ConcurrentHashMap)object7).remove(object4);
                                    }
                                    break block17;
                                }
                                object7 = this.zza;
                                object7 = ((ConcurrentHashMap)object7).entrySet();
                                object7 = object7.iterator();
                                while ((n7 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                                    object5 = object7.next();
                                    object5 = (Map.Entry)object5;
                                    Object object11 = object5.getValue();
                                    long l12 = ((zzfjb)(object11 = (zzfjb)object11)).zzc();
                                    long l14 = l12 - l2;
                                    Object object12 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                    if (object12 >= 0) continue;
                                    object4 = object5.getValue();
                                    object4 = (zzfjb)object4;
                                    long l15 = ((zzfjb)object4).zzc();
                                    object5 = object5.getKey();
                                    object5 = (zzfjm)object5;
                                    l2 = l15;
                                    object4 = object5;
                                }
                                if (object4 != null) {
                                    object7 = this.zza;
                                    ((ConcurrentHashMap)object7).remove(object4);
                                }
                            }
                            object7 = this.zzc;
                            ((zzfjf)object7).zzg();
                            break block13;
                        }
                        throw null;
                    }
                    object7 = this.zza;
                    ((ConcurrentHashMap)object7).put(object, object6);
                    object = this.zzc;
                    ((zzfjf)object).zzd();
                    object7 = object6;
                }
                boolean bl3 = ((zzfjb)object7).zzh((zzfjl)object2);
                object6 = this.zzc;
                ((zzfjf)object6).zzc();
                object6 = this.zzc;
                object6 = ((zzfjf)object6).zza();
                object7 = ((zzfjb)object7).zzf();
                object5 = zzbdv$zzb.zzd();
                object4 = zzbdv$zzb$zza.zza();
                object3 = zzbdv$zzb$zzd.zzb;
                ((zzbdv$zzb$zza$zza)object4).zzf((zzbdv$zzb$zzd)object3);
                object3 = zzbdv$zzb$zzg.zzc();
                n3 = ((zzfje)object6).zza;
                ((zzbdv$zzb$zzg$zza)object3).zze(n3 != 0);
                boolean bl4 = ((zzfje)object6).zzb;
                ((zzbdv$zzb$zzg$zza)object3).zzf(bl4);
                n4 = ((zzfjz)object7).zzb;
                ((zzbdv$zzb$zzg$zza)object3).zzg(n4);
                ((zzbdv$zzb$zza$zza)object4).zzi((zzbdv$zzb$zzg$zza)object3);
                ((zzbdv$zzb$zzc)object5).zzd((zzbdv$zzb$zza$zza)object4);
                object7 = ((zzhbi)object5).zzbn();
                object7 = (zzbdv$zzb)object7;
                object2 = ((zzfjl)object2).zza;
                object2 = object2.zzb();
                object2 = ((zzcvx)object2).zzc();
                ((zzdeq)object2).zzj((zzbdv$zzb)object7);
                this.zzf();
                return bl3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zze(zzfjm object) {
        boolean bl2;
        block4: {
            // MONITORENTER : this
            ConcurrentHashMap concurrentHashMap = this.zza;
            object = concurrentHashMap.get(object);
            object = (zzfjb)object;
            bl2 = true;
            if (object == null) break block4;
            zzfjj zzfjj2 = this.zzb;
            int n3 = ((zzfjb)object).zzb();
            int n4 = zzfjj2.zzd;
            if (n3 >= n4) return false;
            return bl2;
        }
        // MONITOREXIT : this
        return bl2;
    }
}

