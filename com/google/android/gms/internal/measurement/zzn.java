/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzj;
import java.util.List;

public final class zzn
extends zzap {
    private final zzac zza;

    public zzn(zzac zzac2) {
        this.zza = zzac2;
    }

    public final zzaq zza(String object, zzh object2, List object3) {
        Object object4 = "setEventName";
        Object object5 = "setParamValue";
        String string2 = "getParams";
        int n3 = 2;
        String string3 = "getParamValue";
        String string4 = "getTimestamp";
        String string5 = "getEventName";
        object.getClass();
        int n4 = 1;
        int n7 = -1;
        int n8 = ((String)object).hashCode();
        switch (n8) {
            default: {
                break;
            }
            case 1570616835: {
                n8 = (int)(((String)object).equals(object4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 5;
                break;
            }
            case 920706790: {
                n8 = (int)(((String)object).equals(object5) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 4;
                break;
            }
            case 700587132: {
                n8 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 3;
                break;
            }
            case 146575578: {
                n8 = (int)(((String)object).equals(string3) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 2;
                break;
            }
            case 45521504: {
                n8 = (int)(((String)object).equals(string4) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 1;
                break;
            }
            case 21624207: {
                n8 = (int)(((String)object).equals(string5) ? 1 : 0);
                if (n8 == 0) break;
                n7 = 0;
            }
        }
        switch (n7) {
            default: {
                return super.zza((String)object, (zzh)object2, (List)object3);
            }
            case 5: {
                zzg.zza((String)object4, n4, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object);
                object2 = zzaq.zzc;
                boolean bl2 = object2.equals(object);
                if (!bl2 && !(bl2 = (object2 = zzaq.zzd).equals(object))) {
                    object2 = this.zza.zzb();
                    object3 = object.zzf();
                    ((zzad)object2).zzb((String)object3);
                    object = object.zzf();
                    object2 = new zzas((String)object);
                    return object2;
                }
                object = new IllegalArgumentException("Illegal event name");
                throw object;
            }
            case 4: {
                zzg.zza((String)object5, n3, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object).zzf();
                object3 = (zzaq)object3.get(n4);
                object2 = ((zzh)object2).zza((zzaq)object3);
                object3 = this.zza.zzb();
                object4 = zzg.zza((zzaq)object2);
                ((zzad)object3).zza((String)object, object4);
                return object2;
            }
            case 3: {
                boolean bl3;
                zzg.zza(string2, 0, (List)object3);
                object = this.zza.zzb().zzc();
                object2 = new zzap();
                object3 = object.keySet().iterator();
                while (bl3 = object3.hasNext()) {
                    object4 = (String)object3.next();
                    object5 = zzj.zza(object.get(object4));
                    ((zzap)object2).zza((String)object4, (zzaq)object5);
                }
                return object2;
            }
            case 2: {
                zzg.zza(string3, n4, (List)object3);
                object = (zzaq)object3.get(0);
                object = ((zzh)object2).zza((zzaq)object).zzf();
                return zzj.zza(this.zza.zzb().zza((String)object));
            }
            case 1: {
                zzg.zza(string4, 0, (List)object3);
                object = this.zza.zzb();
                object = (double)((zzad)object).zza();
                object2 = new zzai((Double)object);
                return object2;
            }
            case 0: 
        }
        zzg.zza(string5, 0, (List)object3);
        object = this.zza.zzb();
        object = ((zzad)object).zzb();
        object2 = new zzas((String)object);
        return object2;
    }
}

