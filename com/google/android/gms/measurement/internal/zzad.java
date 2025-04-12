/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfw$zze;
import com.google.android.gms.internal.measurement.zzfw$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzx;

final class zzad
extends zzaa {
    private zzfw$zze zzg;
    private final /* synthetic */ zzx zzh;

    public zzad(zzx zzx2, String string2, int n3, zzfw$zze zzfw$zze) {
        this.zzh = zzx2;
        super(string2, n3);
        this.zzg = zzfw$zze;
    }

    public final int zza() {
        return this.zzg.zza();
    }

    public final boolean zza(Long object, Long number, zzgf$zzp zzkg2, boolean bl2) {
        zzfw$zze zzfw$zze;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        zzai zzai2;
        boolean bl3 = zzoh.zza();
        boolean bl4 = false;
        Boolean bl5 = null;
        boolean bl6 = true;
        if (bl3 && (bl3 = (zzai2 = this.zzh.zze()).zzf((String)(object5 = this.zza), (zzfx)(object4 = zzbn.zzbx)))) {
            bl3 = true;
        } else {
            bl3 = false;
            zzai2 = null;
        }
        object5 = this.zzg;
        boolean bl7 = ((zzfw$zze)object5).zzf();
        object4 = this.zzg;
        boolean bl8 = ((zzfw$zze)object4).zzg();
        zzfw$zze zzfw$zze2 = this.zzg;
        boolean bl9 = zzfw$zze2.zzh();
        if (!(bl7 || bl8 || bl9)) {
            bl7 = false;
            object5 = null;
        } else {
            bl7 = true;
        }
        bl8 = false;
        object4 = null;
        if (bl2 && !bl7) {
            object = this.zzh.zzj().zzq();
            int n3 = this.zzb;
            number = n3;
            zzkg2 = this.zzg;
            boolean n4 = ((zzfw$zze)zzkg2).zzi();
            if (n4) {
                zzkg2 = this.zzg;
                int n7 = ((zzfw$zze)zzkg2).zza();
                object4 = n7;
            }
            ((zzgq)object).zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", number, object4);
            return bl6;
        }
        Object object6 = this.zzg.zzb();
        boolean bl10 = ((zzfw$zzc)object6).zzf();
        boolean bl11 = ((zzgf$zzp)zzkg2).zzk();
        if (bl11) {
            bl11 = ((zzfw$zzc)object6).zzh();
            if (!bl11) {
                object6 = this.zzh.zzj().zzr();
                object3 = this.zzh.zzi();
                object2 = ((zzgf$zzp)zzkg2).zzg();
                object3 = ((zzgl)object3).zzc((String)object2);
                object2 = "No number filter for long property. property";
                ((zzgq)object6).zza((String)object2, object3);
            } else {
                long l2 = ((zzgf$zzp)zzkg2).zzc();
                object4 = ((zzfw$zzc)object6).zzc();
                object4 = zzaa.zza(zzaa.zza(l2, (zzfw$zzd)object4), bl10);
            }
        } else {
            bl11 = ((zzgf$zzp)zzkg2).zzi();
            if (bl11) {
                bl11 = ((zzfw$zzc)object6).zzh();
                if (!bl11) {
                    object6 = this.zzh.zzj().zzr();
                    object3 = this.zzh.zzi();
                    object2 = ((zzgf$zzp)zzkg2).zzg();
                    object3 = ((zzgl)object3).zzc((String)object2);
                    object2 = "No number filter for double property. property";
                    ((zzgq)object6).zza((String)object2, object3);
                } else {
                    double d2 = ((zzgf$zzp)zzkg2).zza();
                    object4 = ((zzfw$zzc)object6).zzc();
                    object4 = zzaa.zza(zzaa.zza(d2, (zzfw$zzd)object4), bl10);
                }
            } else {
                bl11 = ((zzgf$zzp)zzkg2).zzm();
                if (bl11) {
                    bl11 = ((zzfw$zzc)object6).zzj();
                    if (!bl11) {
                        bl11 = ((zzfw$zzc)object6).zzh();
                        if (!bl11) {
                            object6 = this.zzh.zzj().zzr();
                            object3 = this.zzh.zzi();
                            object2 = ((zzgf$zzp)zzkg2).zzg();
                            object3 = ((zzgl)object3).zzc((String)object2);
                            object2 = "No string or number filter defined. property";
                            ((zzgq)object6).zza((String)object2, object3);
                        } else {
                            object2 = ((zzgf$zzp)zzkg2).zzh();
                            bl11 = zzpj.zzb((String)object2);
                            if (bl11) {
                                object4 = ((zzgf$zzp)zzkg2).zzh();
                                object6 = ((zzfw$zzc)object6).zzc();
                                object4 = zzaa.zza(zzaa.zza((String)object4, (zzfw$zzd)object6), bl10);
                            } else {
                                object6 = this.zzh.zzj().zzr();
                                object3 = this.zzh.zzi();
                                object2 = ((zzgf$zzp)zzkg2).zzg();
                                object3 = ((zzgl)object3).zzc((String)object2);
                                object2 = ((zzgf$zzp)zzkg2).zzh();
                                String string2 = "Invalid user property value for Numeric number filter. property, value";
                                ((zzgq)object6).zza(string2, object3, object2);
                            }
                        }
                    } else {
                        object4 = ((zzgf$zzp)zzkg2).zzh();
                        object6 = ((zzfw$zzc)object6).zzd();
                        object2 = this.zzh.zzj();
                        object4 = zzaa.zza(zzaa.zza((String)object4, (zzfw$zzf)object6, (zzgo)object2), bl10);
                    }
                } else {
                    object6 = this.zzh.zzj().zzr();
                    object3 = this.zzh.zzi();
                    object2 = ((zzgf$zzp)zzkg2).zzg();
                    object3 = ((zzgl)object3).zzc((String)object2);
                    object2 = "User property has no value, property";
                    ((zzgq)object6).zza((String)object2, object3);
                }
            }
        }
        object6 = this.zzh.zzj().zzq();
        object3 = object4 == null ? "null" : object4;
        object2 = "Property filter result";
        ((zzgq)object6).zza((String)object2, object3);
        if (object4 == null) {
            return false;
        }
        this.zzc = bl5 = Boolean.TRUE;
        if (bl9 && !(bl4 = ((Boolean)object4).booleanValue())) {
            return bl6;
        }
        if (!bl2 || (bl2 = (zzfw$zze = this.zzg).zzf())) {
            this.zzd = object4;
        }
        if ((bl2 = ((Boolean)object4).booleanValue()) && bl7 && (bl2 = ((zzgf$zzp)zzkg2).zzl())) {
            boolean bl12;
            long l3 = ((zzgf$zzp)zzkg2).zzd();
            if (object != null) {
                l3 = (Long)object;
            }
            if (bl3 && (bl12 = ((zzfw$zze)(object = this.zzg)).zzf()) && !(bl12 = ((zzfw$zze)(object = this.zzg)).zzg()) && number != null) {
                l3 = (Long)number;
            }
            if (bl12 = ((zzfw$zze)(object = this.zzg)).zzg()) {
                this.zzf = object = Long.valueOf(l3);
            } else {
                this.zze = object = Long.valueOf(l3);
            }
        }
        return bl6;
    }

    public final boolean zzb() {
        return false;
    }

    public final boolean zzc() {
        return true;
    }
}

