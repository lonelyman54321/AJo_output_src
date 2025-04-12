/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzgf$zzd;
import com.google.android.gms.internal.measurement.zzgf$zzd$zza;
import com.google.android.gms.internal.measurement.zzgf$zze;
import com.google.android.gms.internal.measurement.zzgf$zze$zza;
import com.google.android.gms.internal.measurement.zzgf$zzm;
import com.google.android.gms.internal.measurement.zzgf$zzm$zza;
import com.google.android.gms.internal.measurement.zzgf$zzn;
import com.google.android.gms.internal.measurement.zzgf$zzn$zza;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzx;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzz {
    private String zza;
    private boolean zzb;
    private zzgf$zzm zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map zzf;
    private Map zzg;
    private final /* synthetic */ zzx zzh;

    private zzz(zzx object, String string2) {
        this.zzh = object;
        this.zza = string2;
        this.zzb = true;
        this.zzd = object = new BitSet();
        this.zze = object = new BitSet();
        this.zzf = object = new Jp();
        this.zzg = object = new Jp();
    }

    private zzz(zzx iterator, String object, zzgf$zzm zzgf$zzm, BitSet cloneable, BitSet object2, Map map2, Map map3) {
        this.zzh = iterator;
        this.zza = object;
        this.zzd = cloneable;
        this.zze = object2;
        this.zzf = map2;
        iterator = new Iterator();
        this.zzg = iterator;
        if (map3 != null) {
            boolean bl2;
            iterator = map3.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object = (Integer)iterator.next();
                object2 = (Long)map3.get(object);
                ((ArrayList)cloneable).add(object2);
                object2 = this.zzg;
                object2.put(object, cloneable);
            }
        }
        this.zzb = false;
        this.zzc = zzgf$zzm;
    }

    public /* synthetic */ zzz(zzx zzx2, String string2, zzgf$zzm zzgf$zzm, BitSet bitSet, BitSet bitSet2, Map map2, Map map3, zzac zzac2) {
        this(zzx2, string2, zzgf$zzm, bitSet, bitSet2, map2, map3);
    }

    public /* synthetic */ zzz(zzx zzx2, String string2, zzac zzac2) {
        this(zzx2, string2);
    }

    public static /* bridge */ /* synthetic */ BitSet zza(zzz zzz2) {
        return zzz2.zzd;
    }

    public final zzgf$zzd zza(int n3) {
        zzkg$zza zzkg$zza;
        Object object;
        Object object2;
        boolean bl2;
        Iterator iterator;
        int n4;
        zzgf$zzd$zza zzgf$zzd$zza = zzgf$zzd.zzb();
        zzgf$zzd$zza.zza(n3);
        n3 = (int)(this.zzb ? 1 : 0);
        zzgf$zzd$zza.zza(n3 != 0);
        zzlo zzlo2 = this.zzc;
        if (zzlo2 != null) {
            zzgf$zzd$zza.zza((zzgf$zzm)zzlo2);
        }
        zzlo2 = zzgf$zzm.zze();
        Object object3 = zzpj.zza(this.zzd);
        zzlo2 = ((zzgf$zzm$zza)zzlo2).zzb((Iterable)object3);
        object3 = zzpj.zza(this.zze);
        zzlo2 = ((zzgf$zzm$zza)zzlo2).zzd((Iterable)object3);
        object3 = this.zzf;
        if (object3 == null) {
            object3 = null;
        } else {
            n4 = this.zzf.size();
            object3 = new Object(n4);
            iterator = this.zzf.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object2 = (Integer)iterator.next();
                int n7 = (Integer)object2;
                object = this.zzf;
                if ((object2 = (Long)object.get(object2)) == null) continue;
                object = zzgf$zze.zzc();
                zzkg$zza = ((zzgf$zze$zza)object).zza(n7);
                long l2 = (Long)object2;
                object2 = (zzgf$zze)((zzkg)((zzgf$zze$zza)zzkg$zza).zza(l2).zzaj());
                ((ArrayList)object3).add(object2);
            }
        }
        if (object3 != null) {
            ((zzgf$zzm$zza)zzlo2).zza((Iterable)object3);
        }
        if ((object3 = this.zzg) == null) {
            object3 = Collections.emptyList();
        } else {
            n4 = this.zzg.size();
            object3 = new Object(n4);
            iterator = this.zzg.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object2 = (Integer)iterator.next();
                zzkg$zza = zzgf$zzn.zzc();
                int n8 = (Integer)object2;
                zzkg$zza = ((zzgf$zzn$zza)zzkg$zza).zza(n8);
                object = this.zzg;
                if ((object2 = (List)object.get(object2)) != null) {
                    Collections.sort(object2);
                    ((zzgf$zzn$zza)zzkg$zza).zza((Iterable)object2);
                }
                object2 = (zzgf$zzn)((zzkg)zzkg$zza.zzaj());
                ((ArrayList)object3).add(object2);
            }
        }
        ((zzgf$zzm$zza)zzlo2).zzc((Iterable)object3);
        zzgf$zzd$zza.zza((zzgf$zzm$zza)zzlo2);
        return (zzgf$zzd)((zzkg)zzgf$zzd$zza.zzaj());
    }

    public final void zza(zzaa object) {
        long l2;
        Object object2;
        BitSet bitSet;
        int n4 = ((zzaa)object).zza();
        Object object3 = ((zzaa)object).zzc;
        if (object3 != null) {
            bitSet = this.zze;
            boolean n3 = (Boolean)object3;
            bitSet.set(n4, n3);
        }
        if ((object3 = ((zzaa)object).zzd) != null) {
            bitSet = this.zzd;
            boolean bl2 = (Boolean)object3;
            bitSet.set(n4, bl2);
        }
        object3 = ((zzaa)object).zze;
        long l3 = 1000L;
        if (object3 != null) {
            long l4;
            long l7;
            long l8;
            object3 = this.zzf;
            object2 = n4;
            object3 = (Long)object3.get(object2);
            object2 = ((zzaa)object).zze;
            l2 = (Long)object2 / l3;
            if (object3 == null || (l8 = (l7 = l2 - (l4 = ((Long)object3).longValue())) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
                object3 = this.zzf;
                Integer n3 = n4;
                object2 = l2;
                object3.put(n3, object2);
            }
        }
        if ((object3 = ((zzaa)object).zzf) != null) {
            zzfx zzfx2;
            Object object4;
            object3 = this.zzg;
            object2 = n4;
            if ((object3 = (List)object3.get(object2)) == null) {
                object3 = new ArrayList();
                object2 = this.zzg;
                object4 = n4;
                object2.put(object4, object3);
            }
            if ((n4 = (int)(((zzaa)object).zzc() ? 1 : 0)) != 0) {
                object3.clear();
            }
            if ((n4 = (int)(zzoh.zza() ? 1 : 0)) != 0 && (n4 = (int)(((zzai)(object4 = this.zzh.zze())).zzf((String)(object2 = this.zza), zzfx2 = zzbn.zzbz) ? 1 : 0)) != 0 && (n4 = (int)(((zzaa)object).zzb() ? 1 : 0)) != 0) {
                object3.clear();
            }
            if ((n4 = (int)(zzoh.zza() ? 1 : 0)) != 0 && (n4 = (int)(((zzai)(object4 = this.zzh.zze())).zzf((String)(object2 = this.zza), zzfx2 = zzbn.zzbz) ? 1 : 0)) != 0) {
                l2 = ((zzaa)object).zzf / l3;
                object = l2;
                boolean bl3 = object3.contains(object);
                if (!bl3) {
                    object = l2;
                    object3.add(object);
                }
                return;
            }
            l2 = ((zzaa)object).zzf / l3;
            object = l2;
            object3.add(object);
        }
    }
}

