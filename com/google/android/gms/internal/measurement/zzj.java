/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzgr$zzd;
import com.google.android.gms.internal.measurement.zzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzj {
    public static zzaq zza(zzgr$zzd object) {
        if (object == null) {
            return zzaq.zzc;
        }
        Object object2 = zzi.zza;
        ArrayList<zzaq> arrayList = ((zzgr$zzd)object).zzb();
        int n3 = ((Enum)((Object)arrayList)).ordinal();
        int n4 = object2[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            boolean bl2 = false;
            zzaq zzaq2 = null;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 != n3) {
                            object2 = new IllegalStateException;
                            object = String.valueOf(object);
                            object = "Invalid entity: ".concat((String)object);
                            ((IllegalStateException)object2)((String)object);
                            throw object2;
                        }
                        object = new IllegalArgumentException("Unknown type found. Cannot convert entity");
                        throw object;
                    }
                    object2 = ((zzgr$zzd)object).zzf();
                    arrayList = new ArrayList<zzaq>();
                    object2 = object2.iterator();
                    while (bl2 = object2.hasNext()) {
                        zzaq2 = zzj.zza((zzgr$zzd)object2.next());
                        arrayList.add(zzaq2);
                    }
                    object = ((zzgr$zzd)object).zzd();
                    object2 = new zzat((String)object, arrayList);
                    return object2;
                }
                n4 = (int)(((zzgr$zzd)object).zzh() ? 1 : 0);
                if (n4 != 0) {
                    object2 = new zzag;
                    object = ((zzgr$zzd)object).zzg();
                    object2 = new zzag((Boolean)object);
                    return object2;
                }
                object = new zzag(null);
                return object;
            }
            n4 = (int)(((zzgr$zzd)object).zzi() ? 1 : 0);
            if (n4 != 0) {
                object2 = new zzai;
                object = ((zzgr$zzd)object).zza();
                object2 = new zzai((Double)object);
                return object2;
            }
            object = new zzai(null);
            return object;
        }
        n4 = (int)(((zzgr$zzd)object).zzj() ? 1 : 0);
        if (n4 != 0) {
            object2 = new zzas;
            object = ((zzgr$zzd)object).zze();
            object2 = new zzas((String)object);
            return object2;
        }
        return zzaq.zzj;
    }

    public static zzaq zza(Object iterator) {
        if (iterator == null) {
            return zzaq.zzd;
        }
        boolean bl2 = iterator instanceof String;
        if (bl2) {
            iterator = (String)((Object)iterator);
            zzas zzas2 = new zzas((String)((Object)iterator));
            return zzas2;
        }
        bl2 = iterator instanceof Double;
        if (bl2) {
            iterator = (Double)((Object)iterator);
            zzai zzai2 = new zzai((Double)((Object)iterator));
            return zzai2;
        }
        bl2 = iterator instanceof Long;
        if (bl2) {
            iterator = ((Long)((Object)iterator)).doubleValue();
            zzai zzai3 = new zzai((Double)((Object)iterator));
            return zzai3;
        }
        bl2 = iterator instanceof Integer;
        if (bl2) {
            iterator = ((Integer)((Object)iterator)).doubleValue();
            zzai zzai4 = new zzai((Double)((Object)iterator));
            return zzai4;
        }
        bl2 = iterator instanceof Boolean;
        if (bl2) {
            iterator = (Boolean)((Object)iterator);
            zzag zzag2 = new zzag((Boolean)((Object)iterator));
            return zzag2;
        }
        bl2 = iterator instanceof Map;
        if (bl2) {
            boolean bl3;
            zzap zzap2 = new zzap();
            iterator = (Map)((Object)iterator);
            Iterator iterator2 = iterator.keySet().iterator();
            while (bl3 = iterator2.hasNext()) {
                Object object = iterator2.next();
                zzaq zzaq2 = zzj.zza(iterator.get(object));
                if (object == null) continue;
                boolean bl4 = object instanceof String;
                if (!bl4) {
                    object = object.toString();
                }
                object = (String)object;
                zzap2.zza((String)object, zzaq2);
            }
            return zzap2;
        }
        bl2 = iterator instanceof List;
        if (bl2) {
            boolean bl5;
            zzaf zzaf2 = new zzaf();
            iterator = ((List)((Object)iterator)).iterator();
            while (bl5 = iterator.hasNext()) {
                zzaq zzaq3 = zzj.zza(iterator.next());
                zzaf2.zza(zzaq3);
            }
            return zzaf2;
        }
        iterator = new Iterator("Invalid value type");
        throw iterator;
    }
}

