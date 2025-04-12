/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzar;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzbf;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzbc
extends zzay {
    public zzbc() {
        List list = this.zza;
        zzbv zzbv2 = zzbv.zzc;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzl;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzm;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzn;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzs;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzp;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzt;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzx;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzam;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzay;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbb;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbe;
        list.add(zzbv2);
        list = this.zza;
        zzbv2 = zzbv.zzbf;
        list.add(zzbv2);
    }

    private static zzaq zza(zzh object, List object2) {
        Object object3 = zzbv.zzx;
        int n3 = 2;
        zzg.zzb((zzbv)((Object)object3), n3, (List)object2);
        object3 = (zzaq)object2.get(0);
        object3 = ((zzh)object).zza((zzaq)object3);
        int n4 = 1;
        Object object4 = (zzaq)object2.get(n4);
        object4 = ((zzh)object).zza((zzaq)object4);
        int n7 = object4 instanceof zzaf;
        if (n7 != 0) {
            object4 = ((zzaf)object4).zzi();
            List list = new List();
            int n8 = object2.size();
            if (n8 > n3) {
                n7 = object2.size();
                list = object2.subList(n3, n7);
            }
            object3 = object3.zzf();
            object2 = new zzar((String)object3, (List)object4, list, (zzh)object);
            return object2;
        }
        object2 = object4.getClass().getCanonicalName();
        object2 = kp1_0.c("FN requires an ArrayValue of parameter names found ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzaq zza(String object, zzh object2, List object3) {
        Object object4 = zzbf.zza;
        int n3 = zzg.zza((String)object).ordinal();
        int n4 = object4[n3];
        Object object5 = "return";
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        switch (n4) {
            default: {
                return this.zza((String)object);
            }
            case 13: {
                zzg.zza(zzbv.zzbf, n7, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object).zzd();
                boolean bl2 = (Boolean)object;
                if (bl2) {
                    object = (zzaq)object3.get(n10);
                    return ((zzh)object2).zza((zzaq)object);
                }
                object = (zzaq)object3.get(n8);
                return ((zzh)object2).zza((zzaq)object);
            }
            case 12: {
                zzg.zza(zzbv.zzbe, n7, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object4 = (zzaq)object3.get(n10);
                object4 = ((zzh)object2).zza((zzaq)object4);
                object3 = (zzaq)object3.get(n8);
                object3 = ((zzh)object2).zza((zzaq)object3);
                n7 = object4 instanceof zzaf;
                if (n7 != 0) {
                    n7 = object3 instanceof zzaf;
                    if (n7 != 0) {
                        object4 = (zzaf)object4;
                        object3 = (zzaf)object3;
                        n7 = 0;
                        zzaq zzaq2 = null;
                        for (int i3 = 0; i3 < (n8 = ((zzaf)object4).zzb()); ++i3) {
                            if (n7 == 0) {
                                zzaq zzaq3 = ((zzaf)object4).zza(i3);
                                n8 = (int)(object.equals(zzaq3 = ((zzh)object2).zza(zzaq3)) ? 1 : 0);
                                if (n8 == 0) continue;
                            }
                            zzaq2 = ((zzaf)object3).zza(i3);
                            n8 = (zzaq2 = ((zzh)object2).zza(zzaq2)) instanceof zzaj;
                            if (n8 != 0) {
                                object = zzaq2;
                                object = ((zzaj)zzaq2).zzb();
                                boolean bl3 = ((String)object).equals(object2 = "break");
                                if (bl3) return zzaq.zzc;
                                return zzaq2;
                            }
                            n7 = 1;
                        }
                        int n14 = ((zzaf)object4).zzb() + n10;
                        if (n14 != (n7 = ((zzaf)object3).zzb())) return zzaq.zzc;
                        n14 = ((zzaf)object4).zzb();
                        object = ((zzaf)object3).zza(n14);
                        boolean bl4 = (object = ((zzh)object2).zza((zzaq)object)) instanceof zzaj;
                        if (!bl4) return zzaq.zzc;
                        object2 = object;
                        object2 = ((zzaj)object).zzb();
                        boolean bl5 = ((String)object2).equals(object5);
                        if (bl5) return (zzaq)object;
                        object3 = "continue";
                        bl4 = ((String)object2).equals(object3);
                        if (!bl4) return zzaq.zzc;
                        return (zzaq)object;
                    }
                    object = new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                    throw object;
                }
                object = new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                throw object;
            }
            case 11: {
                boolean bl6 = object3.isEmpty();
                if (bl6) {
                    return zzaq.zzg;
                }
                zzg.zza(zzbv.zzbb, n10, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                return new zzaj((String)object5, (zzaq)object);
            }
            case 10: {
                return new zzaf((List)object3);
            }
            case 9: {
                zzg.zzb(zzbv.zzam, n8, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object4 = (zzaq)object3.get(n10);
                object4 = ((zzh)object2).zza((zzaq)object4);
                n3 = object3.size();
                if (n3 > n8) {
                    object3 = (zzaq)object3.get(n8);
                    object3 = ((zzh)object2).zza((zzaq)object3);
                } else {
                    boolean bl7 = false;
                    object3 = null;
                }
                object5 = zzaq.zzc;
                object = object.zzd();
                boolean bl8 = (Boolean)object;
                if (bl8) {
                    object4 = (zzaf)object4;
                    object = ((zzh)object2).zza((zzaf)object4);
                } else if (object3 != null) {
                    object3 = (zzaf)object3;
                    object = ((zzh)object2).zza((zzaf)object3);
                } else {
                    object = object5;
                }
                boolean bl9 = object instanceof zzaj;
                if (!bl9) return object5;
                return (zzaq)object;
            }
            case 8: {
                return zzbc.zza((zzh)object2, (List)object3);
            }
            case 7: {
                zzg.zzb(zzbv.zzt, n8, (List)object3);
                object = (zzar)zzbc.zza((zzh)object2, (List)object3);
                object3 = ((zzal)object).zza();
                if (object3 == null) {
                    object3 = "";
                    ((zzh)object2).zzc((String)object3, (zzaq)object);
                    return object;
                } else {
                    object3 = ((zzal)object).zza();
                    ((zzh)object2).zzc((String)object3, (zzaq)object);
                }
                return object;
            }
            case 6: {
                zzg.zza(zzbv.zzm, 0, (List)object3);
                return zzaq.zze;
            }
            case 4: 
            case 5: {
                boolean bl10 = object3.isEmpty();
                if (bl10) return zzaq.zzc;
                object = (zzaq)object3.get(0);
                boolean bl11 = (object = ((zzh)object2).zza((zzaq)object)) instanceof zzaf;
                if (!bl11) return zzaq.zzc;
                object = (zzaf)object;
                return ((zzh)object2).zza((zzaf)object);
            }
            case 3: {
                zzg.zza(zzbv.zzm, 0, (List)object3);
                return zzaq.zzf;
            }
            case 2: {
                object = ((zzh)object2).zza();
                object2 = new zzaf((List)object3);
                return ((zzh)object).zza((zzaf)object2);
            }
            case 1: 
        }
        zzg.zza(zzbv.zzc, n7, (List)object3);
        object = (zzaq)object3.get(0);
        object = ((zzh)object2).zza((zzaq)object);
        object4 = (zzaq)object3.get(n10);
        object4 = ((zzh)object2).zza((zzaq)object4).zzf();
        object3 = (zzaq)object3.get(n8);
        object3 = ((zzh)object2).zza((zzaq)object3);
        n3 = object3 instanceof zzaf;
        if (n3 != 0) {
            n3 = (int)(((String)object4).isEmpty() ? 1 : 0);
            if (n3 == 0) {
                object3 = ((zzaf)object3).zzi();
                return object.zza((String)object4, (zzh)object2, (List)object3);
            }
            object = new IllegalArgumentException("Function name for apply is undefined");
            throw object;
        }
        object2 = object3.getClass().getCanonicalName();
        object2 = kp1_0.c("Function arguments for Apply are not a list found ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

