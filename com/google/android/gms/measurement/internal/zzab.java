/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfw$zzb;
import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfw$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzx;
import java.util.HashSet;

final class zzab
extends zzaa {
    private zzfw$zzb zzg;
    private final /* synthetic */ zzx zzh;

    public zzab(zzx zzx2, String string2, int n3, zzfw$zzb zzfw$zzb) {
        this.zzh = zzx2;
        super(string2, n3);
        this.zzg = zzfw$zzb;
    }

    public final int zza() {
        return this.zzg.zzb();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean zza(Long l2, Long l3, zzgf$zzf zzgf$zzf, long l4, zzbh zzbh2, boolean bl2) {
        void var11_17;
        Boolean bl3;
        Object object;
        Object object2;
        int n3;
        long l7;
        int n4;
        Object object3;
        Object object4;
        Object object5;
        boolean bl4;
        int n7;
        boolean bl5;
        zzab zzab2;
        block42: {
            boolean bl6;
            boolean bl7;
            Object object6;
            boolean bl8;
            int n8;
            Object object7;
            Object object8;
            Object object9;
            int n10;
            block45: {
                block43: {
                    block44: {
                        int n14;
                        zzab2 = this;
                        bl5 = zzoh.zza();
                        n7 = 0;
                        Object var11_10 = null;
                        bl4 = true;
                        if (bl5 && (bl5 = ((zzai)(object5 = this.zzh.zze())).zzf((String)(object4 = this.zza), (zzfx)(object3 = zzbn.zzbz)))) {
                            bl5 = true;
                        } else {
                            bl5 = false;
                            object5 = null;
                        }
                        object4 = zzab2.zzg;
                        n4 = ((zzfw$zzb)object4).zzj();
                        if (n4 != 0) {
                            object4 = zzbh2;
                            l7 = zzbh2.zze;
                        } else {
                            l7 = l4;
                        }
                        Object object10 = zzab2.zzh.zzj();
                        n3 = ((zzgo)object10).zza(2);
                        object2 = null;
                        if (n3 != 0) {
                            object10 = zzab2.zzh.zzj().zzq();
                            n10 = zzab2.zzb;
                            object = n10;
                            object9 = zzab2.zzg;
                            n14 = ((zzfw$zzb)object9).zzl();
                            if (n14 != 0) {
                                n14 = zzab2.zzg.zzb();
                                object9 = n14;
                            } else {
                                n14 = 0;
                                object9 = null;
                            }
                            object8 = zzab2.zzh.zzi();
                            object7 = zzab2.zzg.zzf();
                            object8 = ((zzgl)object8).zza((String)object7);
                            object7 = "Evaluating filter. audience, filter, event";
                            ((zzgq)object10).zza((String)object7, object, object9, object8);
                            object10 = zzab2.zzh.zzj().zzq();
                            object = zzab2.zzh.h_();
                            object9 = zzab2.zzg;
                            object = ((zzpj)object).zza((zzfw$zzb)object9);
                            object9 = "Filter definition";
                            ((zzgq)object10).zza((String)object9, object);
                        }
                        if ((n3 = ((zzfw$zzb)(object10 = zzab2.zzg)).zzl()) == 0 || (n3 = ((zzfw$zzb)(object10 = zzab2.zzg)).zzb()) > (n10 = 256)) break block43;
                        object10 = zzab2.zzg;
                        n3 = (int)(((zzfw$zzb)object10).zzh() ? 1 : 0);
                        object = zzab2.zzg;
                        n10 = (int)(((zzfw$zzb)object).zzi() ? 1 : 0);
                        object9 = zzab2.zzg;
                        n14 = (int)(((zzfw$zzb)object9).zzj() ? 1 : 0);
                        if (n3 == 0 && n10 == 0 && n14 == 0) {
                            n3 = 0;
                            object10 = null;
                        } else {
                            n3 = 1;
                        }
                        if (bl2 && n3 == 0) {
                            object5 = zzab2.zzh.zzj().zzq();
                            n7 = zzab2.zzb;
                            Integer n15 = n7;
                            object4 = zzab2.zzg;
                            n4 = (int)(((zzfw$zzb)object4).zzl() ? 1 : 0);
                            if (n4 != 0) {
                                object4 = zzab2.zzg;
                                n4 = ((zzfw$zzb)object4).zzb();
                                object2 = n4;
                            }
                            ((zzgq)object5).zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", n15, object2);
                            return bl4;
                        }
                        object = zzab2.zzg;
                        object9 = zzgf$zzf.zzg();
                        n8 = ((zzfw$zzb)object).zzk();
                        if (n8 == 0) break block44;
                        object8 = ((zzfw$zzb)object).zze();
                        object4 = zzaa.zza(l7, (zzfw$zzd)object8);
                        if (object4 == null) break block42;
                        n4 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
                        if (n4 != 0) break block44;
                        object2 = Boolean.FALSE;
                        break block42;
                    }
                    object4 = new HashSet();
                    object3 = ((zzfw$zzb)object).zzg().iterator();
                    break block45;
                }
                object5 = zzab2.zzh.zzj().zzr();
                Object object11 = zzgo.zza(zzab2.zza);
                object4 = zzab2.zzg;
                n4 = ((zzfw$zzb)object4).zzl();
                if (n4 != 0) {
                    object4 = zzab2.zzg;
                    n4 = ((zzfw$zzb)object4).zzb();
                    object2 = n4;
                }
                object4 = String.valueOf(object2);
                ((zzgq)object5).zza("Invalid event filter ID. appId, id", object11, object4);
                return false;
            }
            while ((n8 = object3.hasNext()) != 0) {
                object8 = (zzfw$zzc)object3.next();
                object7 = ((zzfw$zzc)object8).zze();
                bl8 = ((String)object7).isEmpty();
                if (bl8) {
                    object4 = zzab2.zzh.zzj().zzr();
                    object3 = zzab2.zzh.zzi().zza((String)object9);
                    object = "null or empty param name in filter. event";
                    ((zzgq)object4).zza((String)object, object3);
                    break block42;
                }
                object8 = ((zzfw$zzc)object8).zze();
                ((HashSet)object4).add((Object)object8);
            }
            object3 = new Jp();
            object8 = zzgf$zzf.zzh().iterator();
            while (bl8 = object8.hasNext()) {
                object7 = (zzgf$zzh)object8.next();
                object6 = ((zzgf$zzh)object7).zzg();
                bl7 = ((HashSet)object4).contains(object6);
                if (!bl7) continue;
                bl7 = ((zzgf$zzh)object7).zzl();
                if (bl7) {
                    object6 = ((zzgf$zzh)object7).zzg();
                    bl6 = ((zzgf$zzh)object7).zzl();
                    if (bl6) {
                        long l8 = ((zzgf$zzh)object7).zzd();
                        object7 = l8;
                    } else {
                        bl8 = false;
                        object7 = null;
                    }
                    ((a53)object3).put(object6, object7);
                    continue;
                }
                bl7 = ((zzgf$zzh)object7).zzj();
                if (bl7) {
                    object6 = ((zzgf$zzh)object7).zzg();
                    bl6 = ((zzgf$zzh)object7).zzj();
                    if (bl6) {
                        double d2 = ((zzgf$zzh)object7).zza();
                        object7 = d2;
                    } else {
                        bl8 = false;
                        object7 = null;
                    }
                    ((a53)object3).put(object6, object7);
                    continue;
                }
                bl7 = ((zzgf$zzh)object7).zzn();
                if (bl7) {
                    object6 = ((zzgf$zzh)object7).zzg();
                    object7 = ((zzgf$zzh)object7).zzh();
                    ((a53)object3).put(object6, object7);
                    continue;
                }
                object4 = zzab2.zzh.zzj().zzr();
                object3 = zzab2.zzh.zzi().zza((String)object9);
                object = zzab2.zzh.zzi();
                object9 = ((zzgf$zzh)object7).zzg();
                object = ((zzgl)object).zzb((String)object9);
                object9 = "Unknown value for param. event, param";
                ((zzgq)object4).zza((String)object9, object3, object);
                break block42;
            }
            object4 = ((zzfw$zzb)object).zzg().iterator();
            while ((n10 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                block46: {
                    block49: {
                        block50: {
                            block48: {
                                block47: {
                                    object = (zzfw$zzc)object4.next();
                                    n8 = ((zzfw$zzc)object).zzg();
                                    if (n8 != 0 && (n8 = ((zzfw$zzc)object).zzf()) != 0) {
                                        n8 = 1;
                                    } else {
                                        n8 = 0;
                                        object8 = null;
                                    }
                                    object7 = ((zzfw$zzc)object).zze();
                                    bl7 = ((String)object7).isEmpty();
                                    if (bl7) {
                                        object4 = zzab2.zzh.zzj().zzr();
                                        object3 = zzab2.zzh.zzi().zza((String)object9);
                                        object = "Event has empty param name. event";
                                        ((zzgq)object4).zza((String)object, object3);
                                        break block42;
                                    }
                                    object6 = ((a53)object3).get(object7);
                                    bl6 = object6 instanceof Long;
                                    if (bl6) {
                                        bl6 = ((zzfw$zzc)object).zzh();
                                        if (!bl6) {
                                            object4 = zzab2.zzh.zzj().zzr();
                                            object3 = zzab2.zzh.zzi().zza((String)object9);
                                            object = zzab2.zzh.zzi().zzb((String)object7);
                                            object9 = "No number filter for long param. event, param";
                                            ((zzgq)object4).zza((String)object9, object3, object);
                                            break block42;
                                        }
                                        object6 = (Long)object6;
                                        long l12 = (Long)object6;
                                        object = ((zzfw$zzc)object).zzc();
                                        if ((object = zzaa.zza(l12, (zzfw$zzd)object)) != null) {
                                            n10 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                                            if (n10 != n8) continue;
                                            object2 = Boolean.FALSE;
                                        }
                                        break block42;
                                    }
                                    bl6 = object6 instanceof Double;
                                    if (bl6) {
                                        bl6 = ((zzfw$zzc)object).zzh();
                                        if (!bl6) {
                                            object4 = zzab2.zzh.zzj().zzr();
                                            object3 = zzab2.zzh.zzi().zza((String)object9);
                                            object = zzab2.zzh.zzi().zzb((String)object7);
                                            object9 = "No number filter for double param. event, param";
                                            ((zzgq)object4).zza((String)object9, object3, object);
                                            break block42;
                                        }
                                        object6 = (Double)object6;
                                        double d5 = (Double)object6;
                                        object = ((zzfw$zzc)object).zzc();
                                        if ((object = zzaa.zza(d5, (zzfw$zzd)object)) != null) {
                                            n10 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                                            if (n10 != n8) continue;
                                            object2 = Boolean.FALSE;
                                        }
                                        break block42;
                                    }
                                    bl6 = object6 instanceof String;
                                    if (!bl6) break block46;
                                    bl6 = ((zzfw$zzc)object).zzj();
                                    if (!bl6) break block47;
                                    object6 = (String)object6;
                                    object = ((zzfw$zzc)object).zzd();
                                    object7 = zzab2.zzh.zzj();
                                    object = zzaa.zza((String)object6, (zzfw$zzf)object, (zzgo)object7);
                                    break block48;
                                }
                                bl6 = ((zzfw$zzc)object).zzh();
                                if (!bl6) break block49;
                                bl6 = zzpj.zzb((String)(object6 = (String)object6));
                                if (!bl6) break block50;
                                object = ((zzfw$zzc)object).zzc();
                                object = zzaa.zza((String)object6, (zzfw$zzd)object);
                            }
                            if (object != null) {
                                n10 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                                if (n10 != n8) continue;
                                object2 = Boolean.FALSE;
                            }
                            break block42;
                        }
                        object4 = zzab2.zzh.zzj().zzr();
                        object3 = zzab2.zzh.zzi().zza((String)object9);
                        object = zzab2.zzh.zzi().zzb((String)object7);
                        object9 = "Invalid param value for number filter. event, param";
                        ((zzgq)object4).zza((String)object9, object3, object);
                        break block42;
                    }
                    object4 = zzab2.zzh.zzj().zzr();
                    object3 = zzab2.zzh.zzi().zza((String)object9);
                    object = zzab2.zzh.zzi().zzb((String)object7);
                    object9 = "No filter for String param. event, param";
                    ((zzgq)object4).zza((String)object9, object3, object);
                    break block42;
                }
                if (object6 == null) {
                    object4 = zzab2.zzh.zzj().zzq();
                    object3 = zzab2.zzh.zzi().zza((String)object9);
                    object2 = zzab2.zzh.zzi().zzb((String)object7);
                    object = "Missing param for filter. event, param";
                    ((zzgq)object4).zza((String)object, object3, object2);
                    object2 = Boolean.FALSE;
                    break block42;
                } else {
                    object4 = zzab2.zzh.zzj().zzr();
                    object3 = zzab2.zzh.zzi().zza((String)object9);
                    object = zzab2.zzh.zzi().zzb((String)object7);
                    object9 = "Unknown param type. event, param";
                    ((zzgq)object4).zza((String)object9, object3, object);
                }
                break block42;
            }
            object2 = Boolean.TRUE;
        }
        object4 = zzab2.zzh.zzj().zzq();
        object3 = object2 == null ? "null" : object2;
        object = "Event filter result";
        ((zzgq)object4).zza((String)object, object3);
        if (object2 == null) {
            return false;
        }
        zzab2.zzc = bl3 = Boolean.TRUE;
        n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n4 == 0) {
            return bl4;
        }
        zzab2.zzd = bl3;
        if (n3 == 0) return bl4;
        n7 = (int)(zzgf$zzf.zzk() ? 1 : 0);
        if (n7 == 0) return bl4;
        l7 = zzgf$zzf.zzd();
        Long l14 = l7;
        object4 = zzab2.zzg;
        n4 = (int)(((zzfw$zzb)object4).zzi() ? 1 : 0);
        if (n4 != 0) {
            void var11_15;
            if (bl5 && (bl5 = ((zzfw$zzb)(object5 = zzab2.zzg)).zzk())) {
                Long l15 = l2;
            }
            zzab2.zzf = var11_15;
            return bl4;
        }
        if (bl5 && (bl5 = ((zzfw$zzb)(object5 = zzab2.zzg)).zzk())) {
            Long l16 = l3;
        }
        zzab2.zze = var11_17;
        return bl4;
    }

    public final boolean zzb() {
        return this.zzg.zzk();
    }

    public final boolean zzc() {
        return false;
    }
}

