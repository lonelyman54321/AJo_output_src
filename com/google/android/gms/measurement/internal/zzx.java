/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfw$zzb;
import com.google.android.gms.internal.measurement.zzfw$zze;
import com.google.android.gms.internal.measurement.zzgf$zzd;
import com.google.android.gms.internal.measurement.zzgf$zze;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzm;
import com.google.android.gms.internal.measurement.zzgf$zzm$zza;
import com.google.android.gms.internal.measurement.zzgf$zzn;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzy;
import com.google.android.gms.measurement.internal.zzz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzx
extends zzot {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzx(zzou zzou2) {
        super(zzou2);
    }

    private final zzz zza(Integer n3) {
        Object object = this.zzc;
        boolean bl2 = object.containsKey(n3);
        if (bl2) {
            return (zzz)this.zzc.get(n3);
        }
        String string2 = this.zza;
        object = new zzz(this, string2, null);
        this.zzc.put(n3, object);
        return object;
    }

    private final boolean zza(int n3, int n4) {
        Map map2 = this.zzc;
        Object object = n3;
        if ((object = (zzz)map2.get(object)) == null) {
            return false;
        }
        return zzz.zza((zzz)object).get(n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String string2, List list, List list2, Long l2, Long object, boolean bl2) {
        int n3;
        int n4;
        long l3;
        int n7;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl3;
        int n8;
        Object object6;
        int n10;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        int n14;
        Object object12;
        boolean bl4;
        Object object13;
        Object object14;
        int n15;
        Object object15;
        Object object16;
        Object object17;
        zzx zzx2;
        block63: {
            int n16;
            boolean bl5;
            block67: {
                block65: {
                    boolean bl6;
                    block66: {
                        block64: {
                            boolean bl7;
                            boolean bl8;
                            block62: {
                                block59: {
                                    zzx2 = this;
                                    Preconditions.checkNotEmpty(string2);
                                    Preconditions.checkNotNull(list);
                                    Preconditions.checkNotNull(list2);
                                    object17 = string2;
                                    this.zza = string2;
                                    object17 = new HashSet();
                                    this.zzb = object17;
                                    this.zzc = object17 = new Jp();
                                    object17 = l2;
                                    this.zzd = l2;
                                    object17 = object;
                                    this.zze = object;
                                    object17 = list.iterator();
                                    do {
                                        bl5 = object17.hasNext();
                                        n15 = 0;
                                        object14 = null;
                                        if (!bl5) break block59;
                                        object15 = (zzgf$zzf)object17.next();
                                    } while (!(bl5 = ((String)(object16 = "_s")).equals(object15 = ((zzgf$zzf)object15).zzg())));
                                    bl5 = true;
                                    break block62;
                                }
                                bl5 = false;
                                object15 = null;
                            }
                            boolean bl9 = zzoh.zza();
                            if (bl9 && (bl8 = ((zzai)(object17 = this.zze())).zzf((String)(object16 = zzx2.zza), (zzfx)(object13 = zzbn.zzbz)))) {
                                bl4 = true;
                            } else {
                                bl4 = false;
                                object12 = null;
                            }
                            boolean bl10 = zzoh.zza();
                            if (bl10 && (bl7 = ((zzai)(object17 = this.zze())).zzf((String)(object16 = zzx2.zza), (zzfx)(object13 = zzbn.zzby)))) {
                                n14 = 1;
                            } else {
                                n14 = 0;
                                object11 = null;
                            }
                            if (bl5) {
                                object16 = this.zzh();
                                object13 = zzx2.zza;
                                ((zzot)object16).zzam();
                                ((zzjf)object16).zzv();
                                Preconditions.checkNotEmpty((String)object13);
                                object17 = new ContentValues();
                                object10 = 0;
                                object9 = "current_session_count";
                                object17.put((String)object9, (Integer)object10);
                                try {
                                    object10 = ((zzar)object16).f_();
                                    object9 = "events";
                                    object8 = "app_id = ?";
                                    object7 = new String[]{object13};
                                    object10.update((String)object9, object17, (String)object8, (String[])object7);
                                }
                                catch (SQLiteException sQLiteException) {
                                    object16 = ((zzjf)object16).zzj().zzg();
                                    object10 = "Error resetting session-scoped event counts. appId";
                                    object13 = zzgo.zza((String)object13);
                                    ((zzgq)object16).zza((String)object10, object13, (Object)sQLiteException);
                                }
                            }
                            object17 = Collections.emptyMap();
                            if (n14 != 0 && bl4) {
                                object17 = this.zzh();
                                object16 = zzx2.zza;
                                object17 = ((zzar)object17).zzm((String)object16);
                            }
                            if ((n10 = (object6 = ((zzar)(object16 = this.zzh())).zzl((String)(object13 = zzx2.zza))).isEmpty()) != 0) break block63;
                            object13 = object6.keySet();
                            object16 = new HashSet(object13);
                            if (!bl5) break block64;
                            object15 = zzx2.zza;
                            object13 = this.zzh();
                            object10 = zzx2.zza;
                            object13 = ((zzar)object13).zzn((String)object10);
                            Preconditions.checkNotEmpty(object15);
                            Preconditions.checkNotNull(object6);
                            object15 = new Jp();
                            n8 = object6.isEmpty();
                            if (n8 != 0) break block65;
                            object10 = object6.keySet().iterator();
                            break block66;
                        }
                        object14 = object6;
                        break block67;
                    }
                    while (bl6 = object10.hasNext()) {
                        ArrayList arrayList;
                        object9 = (Integer)object10.next();
                        ((Integer)object9).intValue();
                        object8 = (zzgf$zzm)object6.get(object9);
                        object7 = (List)object13.get(object9);
                        if (object7 == null || (bl3 = object7.isEmpty())) {
                            arrayList = object13;
                            ((a53)object15).put(object9, object8);
                        } else {
                            object5 = this.h_();
                            object4 = ((zzgf$zzm)object8).zzi();
                            boolean bl11 = (object5 = ((zzpj)object5).zza((List)object4, (List)object7)).isEmpty();
                            if (bl11) continue;
                            object5 = ((zzgf$zzm$zza)((zzkg)object8).zzch()).zzb().zzb((Iterable)object5);
                            object4 = this.h_();
                            object14 = ((zzgf$zzm)object8).zzk();
                            object4 = ((zzpj)object4).zza((List)object14, (List)object7);
                            ((zzgf$zzm$zza)object5).zzd().zzd((Iterable)object4);
                            object4 = new ArrayList();
                            object14 = ((zzgf$zzm)object8).zzh().iterator();
                            while ((n16 = (int)(object14.hasNext() ? 1 : 0)) != 0) {
                                object2 = object3 = object14.next();
                                object2 = (zzgf$zze)object3;
                                n16 = ((zzgf$zze)object2).zza();
                                arrayList = object13;
                                object13 = n16;
                                n7 = (int)(object7.contains(object13) ? 1 : 0);
                                if (n7 == 0) {
                                    ((ArrayList)object4).add(object2);
                                }
                                object13 = arrayList;
                            }
                            arrayList = object13;
                            ((zzgf$zzm$zza)object5).zza().zza((Iterable)object4);
                            object13 = new ArrayList();
                            object8 = ((zzgf$zzm)object8).zzj().iterator();
                            while (bl11 = object8.hasNext()) {
                                object4 = (zzgf$zzn)object8.next();
                                object14 = ((zzgf$zzn)object4).zzb();
                                n15 = (int)(object7.contains(object14) ? 1 : 0);
                                if (n15 != 0) continue;
                                ((ArrayList)object13).add(object4);
                            }
                            object8 = ((zzgf$zzm$zza)object5).zzc();
                            ((zzgf$zzm$zza)object8).zzc((Iterable)object13);
                            object13 = (zzgf$zzm)((zzkg)((zzkg$zza)object5).zzaj());
                            ((a53)object15).put(object9, object13);
                        }
                        object13 = arrayList;
                        n15 = 0;
                        object14 = null;
                    }
                }
                object14 = object15;
            }
            object2 = ((HashSet)object16).iterator();
            while (bl5 = object2.hasNext()) {
                block68: {
                    object4 = object15 = object2.next();
                    object4 = (Integer)object15;
                    ((Integer)object4).intValue();
                    object15 = (zzgf$zzm)object14.get(object4);
                    object9 = new BitSet();
                    object8 = new BitSet();
                    object7 = new Jp();
                    if (object15 != null && (n10 = ((zzgf$zzm)object15).zza()) != 0) {
                        object16 = ((zzgf$zzm)object15).zzh().iterator();
                        while ((n7 = (int)(object16.hasNext() ? 1 : 0)) != 0) {
                            object13 = (zzgf$zze)object16.next();
                            n8 = ((zzgf$zze)object13).zzf();
                            if (n8 == 0) continue;
                            n8 = ((zzgf$zze)object13).zza();
                            object10 = n8;
                            bl3 = ((zzgf$zze)object13).zze();
                            if (bl3) {
                                long l4 = ((zzgf$zze)object13).zzb();
                                object13 = l4;
                            } else {
                                n7 = 0;
                                object13 = null;
                            }
                            ((a53)object7).put(object10, object13);
                        }
                    }
                    object5 = new Jp();
                    if (object15 != null && (n10 = ((zzgf$zzm)object15).zzc()) != 0) {
                        object16 = ((zzgf$zzm)object15).zzj().iterator();
                        while ((n7 = (int)(object16.hasNext() ? 1 : 0)) != 0) {
                            object13 = (zzgf$zzn)object16.next();
                            n8 = (int)(((zzgf$zzn)object13).zzf() ? 1 : 0);
                            if (n8 != 0 && (n8 = ((zzgf$zzn)object13).zza()) > 0) {
                                n8 = ((zzgf$zzn)object13).zzb();
                                object10 = n8;
                                n16 = ((zzgf$zzn)object13).zza();
                                object = object16;
                                n10 = n16 + -1;
                                long l7 = ((zzgf$zzn)object13).zza(n10);
                                object16 = l7;
                                ((a53)object5).put(object10, object16);
                            } else {
                                object = object16;
                            }
                            object16 = object;
                        }
                    }
                    if (object15 == null) break block68;
                    object16 = null;
                    for (n10 = 0; n10 < (n7 = ((zzgf$zzm)object15).zzd() << 6); ++n10) {
                        block71: {
                            block70: {
                                block69: {
                                    object13 = ((zzgf$zzm)object15).zzk();
                                    n7 = (int)(zzpj.zza((List)object13, n10) ? 1 : 0);
                                    if (n7 == 0) break block69;
                                    object13 = this.zzj().zzq();
                                    object10 = n10;
                                    object3 = object14;
                                    object14 = "Filter already evaluated. audience ID, filter ID";
                                    ((zzgq)object13).zza((String)object14, object4, object10);
                                    ((BitSet)object8).set(n10);
                                    object13 = ((zzgf$zzm)object15).zzi();
                                    n7 = (int)(zzpj.zza((List)object13, n10) ? 1 : 0);
                                    if (n7 == 0) break block70;
                                    ((BitSet)object9).set(n10);
                                    break block71;
                                }
                                object3 = object14;
                            }
                            object13 = n10;
                            ((a53)object7).remove(object13);
                        }
                        object14 = object3;
                    }
                }
                object3 = object14;
                object15 = object6.get(object4);
                object10 = object15;
                object10 = (zzgf$zzm)object15;
                if (n14 != 0 && bl4 && (object15 = (List)object17.get(object4)) != null && (object16 = zzx2.zze) != null && (object16 = zzx2.zzd) != null) {
                    object15 = object15.iterator();
                    while ((n10 = (int)(object15.hasNext() ? 1 : 0)) != 0) {
                        object16 = (zzfw$zzb)object15.next();
                        n7 = ((zzfw$zzb)object16).zzb();
                        object14 = zzx2.zze;
                        long l8 = (Long)object14;
                        long l12 = 1000L;
                        l8 /= l12;
                        n10 = (int)(((zzfw$zzb)object16).zzi() ? 1 : 0);
                        if (n10 != 0) {
                            object16 = zzx2.zzd;
                            l8 = (Long)object16 / l12;
                        }
                        if ((n10 = (int)(((a53)object7).containsKey(object16 = Integer.valueOf(n7)) ? 1 : 0)) != 0) {
                            object16 = n7;
                            object14 = l8;
                            ((a53)object7).put(object16, object14);
                        }
                        if ((n10 = (int)(((a53)object5).containsKey(object16 = Integer.valueOf(n7)) ? 1 : 0)) == 0) continue;
                        object16 = n7;
                        object13 = l8;
                        ((a53)object5).put(object16, object13);
                    }
                }
                object13 = zzx2.zza;
                object15 = object14;
                object16 = this;
                object = object2;
                object2 = object4;
                boolean bl12 = false;
                object4 = null;
                object14 = new zzz(this, (String)object13, (zzgf$zzm)object10, (BitSet)object9, (BitSet)object8, (Map)object7, (Map)object5, null);
                object15 = zzx2.zzc;
                object15.put(object2, object14);
                object2 = object;
                object14 = object3;
            }
        }
        boolean bl13 = list.isEmpty();
        object15 = "Skipping failed audience ID";
        if (!bl13) {
            n10 = 0;
            object17 = new zzy(zzx2, null);
            object16 = new Jp();
            object13 = list.iterator();
            while ((n8 = object13.hasNext()) != 0) {
                long l14;
                Object object18;
                object10 = (zzgf$zzf)object13.next();
                object9 = zzx2.zza;
                if ((object9 = ((zzy)object17).zza((String)object9, (zzgf$zzf)object10)) == null) continue;
                object8 = this.zzh();
                object7 = zzx2.zza;
                object5 = ((zzgf$zzf)object9).zzg();
                object4 = ((zzgf$zzf)object10).zzg();
                if ((object4 = ((zzar)object8).zzd((String)object7, (String)object4)) == null) {
                    object4 = ((zzjf)object8).zzj().zzr();
                    object14 = zzgo.zza((String)object7);
                    object8 = ((zzjf)object8).zzi().zza((String)object5);
                    object5 = "Event aggregate wasn't created during raw event logging. appId, event";
                    ((zzgq)object4).zza((String)object5, object14, object8);
                    object18 = ((zzgf$zzf)object10).zzg();
                    long l15 = ((zzgf$zzf)object10).zzd();
                    long l16 = 1L;
                    long l17 = 1L;
                    long l18 = 1L;
                    long l19 = 0L;
                    object8 = new zzbh((String)object7, (String)object18, l16, l17, l18, l15, l19, null, null, null, null);
                } else {
                    String string3 = ((zzbh)object4).zza;
                    String string4 = ((zzbh)object4).zzb;
                    l14 = ((zzbh)object4).zzc;
                    l3 = 1L;
                    long l20 = l14 + l3;
                    long l21 = ((zzbh)object4).zzd + l3;
                    long l22 = ((zzbh)object4).zze + l3;
                    long l23 = ((zzbh)object4).zzf;
                    l14 = ((zzbh)object4).zzg;
                    Long l24 = ((zzbh)object4).zzh;
                    Long l25 = ((zzbh)object4).zzi;
                    Long l26 = ((zzbh)object4).zzj;
                    object10 = ((zzbh)object4).zzk;
                    object8 = new zzbh(string3, string4, l20, l21, l22, l23, l14, l24, l25, l26, (Boolean)object10);
                }
                object10 = this.zzh();
                ((zzar)object10).zza((zzbh)object8);
                if (bl2) continue;
                l14 = ((zzbh)object8).zzc;
                object10 = ((zzgf$zzf)object9).zzg();
                object4 = (Map)((a53)object16).get(object10);
                if (object4 == null) {
                    object4 = this.zzh();
                    object14 = zzx2.zza;
                    object4 = ((zzar)object4).zzf((String)object14, (String)object10);
                    ((a53)object16).put(object10, object4);
                }
                object10 = object4.keySet().iterator();
                while ((n15 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                    block60: {
                        boolean bl14;
                        object14 = (Integer)object10.next();
                        n4 = (Integer)object14;
                        object12 = zzx2.zzb;
                        bl4 = object12.contains(object14);
                        if (bl4) {
                            object2 = this.zzj().zzq();
                            ((zzgq)object2).zza((String)object15, object14);
                            continue;
                        }
                        object12 = ((List)object4.get(object14)).iterator();
                        n14 = 1;
                        while (bl14 = object12.hasNext()) {
                            object11 = (zzfw$zzb)object12.next();
                            object = object17;
                            object17 = zzx2.zza;
                            object6 = new zzab(zzx2, (String)object17, n4, (zzfw$zzb)object11);
                            object17 = zzx2.zzd;
                            object3 = object16;
                            object16 = zzx2.zze;
                            n14 = ((zzfw$zzb)object11).zzb();
                            boolean bl15 = zzx2.zza(n4, n14);
                            object18 = object16;
                            n14 = (int)(((zzab)object6).zza((Long)object17, (Long)object16, (zzgf$zzf)object9, l14, (zzbh)object8, bl15) ? 1 : 0);
                            if (n14 != 0) {
                                zzx2.zza((Integer)object14).zza((zzaa)object6);
                                object17 = object;
                                object16 = object3;
                                continue;
                            }
                            object17 = zzx2.zzb;
                            object17.add(object14);
                            break block60;
                        }
                        object = object17;
                        object3 = object16;
                    }
                    if (n14 == 0) {
                        object17 = zzx2.zzb;
                        object17.add(object14);
                    }
                    object17 = object;
                    object16 = object3;
                }
            }
        }
        if (bl2) {
            return new ArrayList();
        }
        boolean bl16 = list2.isEmpty();
        if (!bl16) {
            object17 = new Jp();
            object16 = list2.iterator();
            block18: while ((n7 = object16.hasNext()) != 0) {
                boolean bl17;
                object13 = (zzgf$zzp)object16.next();
                object10 = ((zzgf$zzp)object13).zzg();
                object9 = (Map)((a53)object17).get(object10);
                if (object9 == null) {
                    object9 = this.zzh();
                    object8 = zzx2.zza;
                    object9 = ((zzar)object9).zzg((String)object8, (String)object10);
                    ((a53)object17).put(object10, object9);
                }
                object10 = object9.keySet().iterator();
                while (bl17 = object10.hasNext()) {
                    object8 = (Integer)object10.next();
                    n3 = (Integer)object8;
                    object5 = zzx2.zzb;
                    bl3 = object5.contains(object8);
                    if (bl3) {
                        object13 = this.zzj().zzq();
                        ((zzgq)object13).zza((String)object15, object8);
                        continue block18;
                    }
                    object5 = ((List)object9.get(object8)).iterator();
                    boolean bl18 = true;
                    while ((n15 = object5.hasNext()) != 0) {
                        object4 = (zzfw$zze)object5.next();
                        object14 = this.zzj();
                        n15 = ((zzgo)object14).zza(n4 = 2);
                        if (n15 != 0) {
                            object14 = this.zzj().zzq();
                            n4 = (int)(((zzfw$zze)object4).zzi() ? 1 : 0);
                            if (n4 != 0) {
                                n4 = ((zzfw$zze)object4).zza();
                                object2 = n4;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            object12 = this.zzi();
                            object11 = ((zzfw$zze)object4).zze();
                            object12 = ((zzgl)object12).zzc((String)object11);
                            object11 = "Evaluating filter. audience, filter, property";
                            ((zzgq)object14).zza((String)object11, object8, object2, object12);
                            object14 = this.zzj().zzq();
                            object2 = this.h_().zza((zzfw$zze)object4);
                            object12 = "Filter definition";
                            ((zzgq)object14).zza((String)object12, object2);
                        }
                        if ((n15 = ((zzfw$zze)object4).zzi()) != 0 && (n15 = ((zzfw$zze)object4).zza()) <= (n4 = 256)) {
                            object2 = zzx2.zza;
                            object14 = new zzad(zzx2, (String)object2, n3, (zzfw$zze)object4);
                            object2 = zzx2.zzd;
                            object12 = zzx2.zze;
                            boolean bl18 = ((zzfw$zze)object4).zza();
                            bl18 = zzx2.zza(n3, (int)(bl18 ? 1 : 0));
                            if (bl18 = ((zzad)object14).zza((Long)object2, (Long)object12, (zzgf$zzp)object13, bl18)) {
                                object2 = zzx2.zza((Integer)object8);
                                ((zzz)object2).zza((zzaa)object14);
                                continue;
                            }
                            object7 = zzx2.zzb;
                            object7.add(object8);
                            break;
                        }
                        object7 = this.zzj().zzr();
                        object5 = zzgo.zza(zzx2.zza);
                        n15 = (int)(((zzfw$zze)object4).zzi() ? 1 : 0);
                        if (n15 != 0) {
                            bl18 = ((zzfw$zze)object4).zza();
                            object4 = (int)(bl18 ? 1 : 0);
                        } else {
                            bl18 = false;
                            object4 = null;
                        }
                        object4 = String.valueOf(object4);
                        object14 = "Invalid property filter ID. appId, id";
                        ((zzgq)object7).zza((String)object14, object5, object4);
                        bl18 = false;
                        object4 = null;
                        break;
                    }
                    if (bl18) continue;
                    object7 = zzx2.zzb;
                    object7.add(object8);
                }
            }
        }
        object15 = new ArrayList();
        object17 = zzx2.zzc.keySet();
        object16 = zzx2.zzb;
        object17.removeAll((Collection<?>)object16);
        object16 = object17.iterator();
        while (true) {
            block61: {
                Object object19;
                if (!(object19 = object16.hasNext())) {
                    return object15;
                }
                object17 = (Integer)object16.next();
                n7 = (Integer)object17;
                object10 = (zzz)zzx2.zzc.get(object17);
                Preconditions.checkNotNull(object10);
                object13 = ((zzz)object10).zza(n7);
                ((ArrayList)object15).add(object13);
                object10 = this.zzh();
                object9 = zzx2.zza;
                object13 = ((zzgf$zzd)object13).zzd();
                ((zzot)object10).zzam();
                ((zzjf)object10).zzv();
                Preconditions.checkNotEmpty((String)object9);
                Preconditions.checkNotNull(object13);
                object13 = ((zzio)object13).zzce();
                object8 = new ContentValues();
                object8.put("app_id", (String)object9);
                object7 = "audience_id";
                object8.put((String)object7, (Integer)object17);
                object17 = "current_results";
                object8.put((String)object17, (byte[])object13);
                try {
                    object17 = ((zzar)object10).f_();
                    object13 = "audience_filter_values";
                    n3 = 5;
                    bl3 = false;
                    object5 = null;
                }
                catch (SQLiteException sQLiteException) {
                    bl3 = false;
                    object5 = null;
                    break block61;
                }
                try {
                    long l27 = object17.insertWithOnConflict((String)object13, null, (ContentValues)object8, n3);
                    long l28 = l27 - (l3 = (long)-1);
                    object19 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                    if (object19) continue;
                    object17 = ((zzjf)object10).zzj();
                    object17 = ((zzgo)object17).zzg();
                    object13 = "Failed to insert filter results (got -1). appId";
                    object8 = zzgo.zza((String)object9);
                    ((zzgq)object17).zza((String)object13, object8);
                    continue;
                }
                catch (SQLiteException sQLiteException) {}
            }
            object13 = ((zzjf)object10).zzj().zzg();
            object10 = "Error storing filter results. appId";
            object9 = zzgo.zza((String)object9);
            ((zzgq)object13).zza((String)object10, object9, object17);
        }
    }

    public final boolean zzc() {
        return false;
    }
}

