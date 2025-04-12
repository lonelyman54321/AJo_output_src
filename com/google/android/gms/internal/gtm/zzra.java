/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzra {
    public static Bundle zza(Map object) {
        boolean bl2;
        if (object == null) {
            return null;
        }
        int bl22 = object.size();
        Object object2 = new Bundle(bl22);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object3 = object.next();
            Object object4 = object3.getValue();
            boolean bl3 = object4 instanceof zzqz;
            if (bl3) {
                object4 = (String)object3.getKey();
                object3 = ((zzqz)object3.getValue()).zzk();
                object2.putString(object4, (String)object3);
                continue;
            }
            object4 = object3.getValue();
            bl3 = object4 instanceof zzqp;
            if (bl3) {
                object4 = (String)object3.getKey();
                object3 = ((zzqp)object3.getValue()).zzi();
                bl2 = object3.booleanValue();
                object2.putBoolean(object4, bl2);
                continue;
            }
            object4 = object3.getValue();
            bl3 = object4 instanceof zzqq;
            if (bl3) {
                object4 = (String)object3.getKey();
                object3 = ((zzqq)object3.getValue()).zzi();
                double d2 = object3.doubleValue();
                object2.putDouble(object4, d2);
                continue;
            }
            object4 = object3.getValue();
            bl3 = object4 instanceof zzqw;
            if (bl3) {
                object4 = (String)object3.getKey();
                object3 = zzra.zza(((zzqw)object3.getValue()).zza);
                object2.putBundle(object4, object3);
                continue;
            }
            object2 = object3.getKey();
            object3 = new Bundle[]{object2};
            object2 = String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", (Object[])object3);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        return object2;
    }

    public static zzqo zzb(Object object) {
        if (object == null) {
            return zzqs.zzd;
        }
        boolean bl2 = object instanceof zzqo;
        if (bl2) {
            return (zzqo)object;
        }
        bl2 = object instanceof Boolean;
        if (bl2) {
            object = (Boolean)object;
            zzqp zzqp2 = new zzqp((Boolean)object);
            return zzqp2;
        }
        bl2 = object instanceof Short;
        if (bl2) {
            object = ((Short)object).doubleValue();
            zzqq zzqq2 = new zzqq((Double)object);
            return zzqq2;
        }
        bl2 = object instanceof Integer;
        if (bl2) {
            object = ((Integer)object).doubleValue();
            zzqq zzqq3 = new zzqq((Double)object);
            return zzqq3;
        }
        bl2 = object instanceof Long;
        if (bl2) {
            object = ((Long)object).doubleValue();
            zzqq zzqq4 = new zzqq((Double)object);
            return zzqq4;
        }
        bl2 = object instanceof Float;
        if (bl2) {
            object = ((Float)object).doubleValue();
            zzqq zzqq5 = new zzqq((Double)object);
            return zzqq5;
        }
        bl2 = object instanceof Double;
        if (bl2) {
            object = (Double)object;
            zzqq zzqq6 = new zzqq((Double)object);
            return zzqq6;
        }
        bl2 = object instanceof Byte;
        if (bl2) {
            object = object.toString();
            zzqz zzqz2 = new zzqz((String)object);
            return zzqz2;
        }
        bl2 = object instanceof Character;
        if (bl2) {
            object = object.toString();
            zzqz zzqz3 = new zzqz((String)object);
            return zzqz3;
        }
        bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            zzqz zzqz4 = new zzqz((String)object);
            return zzqz4;
        }
        bl2 = object instanceof List;
        if (bl2) {
            boolean bl3;
            ArrayList<zzqo> arrayList = new ArrayList<zzqo>();
            object = ((List)object).iterator();
            while (bl3 = object.hasNext()) {
                zzqo zzqo2 = zzra.zzb(object.next());
                arrayList.add(zzqo2);
            }
            object = new zzqv(arrayList);
            return object;
        }
        bl2 = object instanceof Map;
        if (bl2) {
            boolean bl4;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            object = ((Map)object).entrySet().iterator();
            while (bl4 = object.hasNext()) {
                Object object2 = (Map.Entry)object.next();
                boolean bl5 = object2.getKey() instanceof String;
                Preconditions.checkArgument(bl5);
                String string2 = (String)object2.getKey();
                object2 = zzra.zzb(object2.getValue());
                hashMap.put(string2, object2);
            }
            object = new zzqw(hashMap);
            return object;
        }
        bl2 = object instanceof Bundle;
        if (bl2) {
            boolean bl6;
            HashMap<String, zzqo> hashMap = new HashMap<String, zzqo>();
            object = (Bundle)object;
            Iterator iterator = object.keySet().iterator();
            while (bl6 = iterator.hasNext()) {
                String string3 = (String)iterator.next();
                zzqo zzqo3 = zzra.zzb(object.get(string3));
                hashMap.put(string3, zzqo3);
            }
            object = new zzqw(hashMap);
            return object;
        }
        object = object.getClass();
        object = String.valueOf(object);
        object = "Type not supported: ".concat((String)object);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }

    public static zzqo zzc(zzhx object, zzqo zzqo2) {
        Preconditions.checkNotNull(zzqo2);
        boolean bl2 = zzra.zzj(zzqo2);
        if (!(bl2 || (bl2 = zzqo2 instanceof zzqr) || (bl2 = zzqo2 instanceof zzqv) || (bl2 = zzqo2 instanceof zzqw))) {
            bl2 = zzqo2 instanceof zzqx;
            if (bl2) {
                zzqo2 = (zzqx)zzqo2;
                zzqo2 = zzra.zzd((zzhx)object, (zzqx)zzqo2);
            } else {
                object = new UnsupportedOperationException("Attempting to evaluate unknown type");
                throw object;
            }
        }
        if (zzqo2 != null) {
            boolean bl3 = zzqo2 instanceof zzqx;
            if (!bl3) {
                return zzqo2;
            }
            object = new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
            throw object;
        }
        object = new IllegalArgumentException("AbstractType evaluated to Java null");
        throw object;
    }

    public static zzqo zzd(zzhx object, zzqx zzqoArray) {
        Object object2 = zzqoArray.zzi();
        zzqoArray = zzqoArray.zzj();
        zzqo[] zzqoArray2 = ((zzhx)object).zzb((String)object2);
        String string2 = "Function '";
        if (zzqoArray2 != null) {
            boolean bl2 = zzqoArray2 instanceof zzqr;
            if (bl2) {
                object2 = ((zzqr)zzqoArray2).zzi();
                zzqoArray2 = new zzqo[zzqoArray.size()];
                zzqoArray = zzqoArray.toArray(zzqoArray2);
                return object2.zzd((zzhx)object, zzqoArray);
            }
            zzqoArray = cP.a(string2, (String)object2, "' is not a function");
            object = new UnsupportedOperationException((String)zzqoArray);
            throw object;
        }
        zzqoArray = cP.a(string2, (String)object2, "' is not supported");
        object = new UnsupportedOperationException((String)zzqoArray);
        throw object;
    }

    public static zzqo zze(zzqo zzqo2) {
        boolean bl2 = zzqo2 instanceof zzqw;
        if (bl2) {
            boolean bl3;
            boolean bl4;
            Object object = new HashSet();
            Object object2 = zzqo2;
            object2 = ((zzqw)zzqo2).zza;
            Object object3 = object2.entrySet().iterator();
            while (bl4 = object3.hasNext()) {
                zzqs zzqs2;
                Map.Entry entry = object3.next();
                Object v4 = entry.getValue();
                if (v4 != (zzqs2 = zzqs.zze)) continue;
                entry = (String)entry.getKey();
                ((HashSet)object).add(entry);
            }
            object = ((HashSet)object).iterator();
            while (bl3 = object.hasNext()) {
                object3 = (String)object.next();
                object2.remove(object3);
            }
        }
        return zzqo2;
    }

    public static zzqs zzf(zzhx zzhx2, List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            zzqo zzqo2 = (zzqo)object.next();
            Preconditions.checkArgument(zzqo2 instanceof zzqx);
            boolean bl3 = zzra.zzi(zzqo2 = zzra.zzc(zzhx2, zzqo2));
            if (!bl3) continue;
            return (zzqs)zzqo2;
        }
        return zzqs.zze;
    }

    public static Object zzg(zzqo object) {
        int n3 = 1;
        int n4 = 2;
        if (object == null) {
            return null;
        }
        Object object2 = zzqs.zzd;
        if (object == object2) {
            return null;
        }
        boolean bl2 = object instanceof zzqp;
        if (bl2) {
            return ((zzqp)object).zzi();
        }
        bl2 = object instanceof zzqq;
        if (bl2) {
            Double d2 = ((zzqq)(object = (zzqq)object)).zzi();
            double d5 = d2;
            n4 = (int)(Double.isInfinite(d5) ? 1 : 0);
            if (n4 == 0) {
                double d7 = Math.floor(d5);
                double d9 = 1.0E-5;
                double d12 = (d7 = d5 - d7) - d9;
                Object object3 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                if (object3 < 0) {
                    return (int)d5;
                }
            }
            return ((zzqq)object).zzi().toString();
        }
        bl2 = object instanceof zzqz;
        if (bl2) {
            return ((zzqz)object).zzk();
        }
        bl2 = object instanceof zzqv;
        if (bl2) {
            boolean bl3;
            object2 = new ArrayList();
            object = ((zzqv)object).zzk().iterator();
            while (bl3 = object.hasNext()) {
                zzqo zzqo2 = (zzqo)((Object)object.next());
                Object object4 = zzra.zzg(zzqo2);
                if (object4 == null) {
                    object = zzqo2.getClass().getCanonicalName();
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = zzqo2;
                    objectArray[n3] = object;
                    zzhi.zza(String.format("Failure to convert a list element to object: %s (%s)", objectArray));
                    return null;
                }
                ((ArrayList)object2).add(object4);
            }
            return object2;
        }
        bl2 = object instanceof zzqw;
        if (bl2) {
            boolean bl4;
            object2 = new HashMap();
            object = ((zzqw)object).zza.entrySet().iterator();
            while (bl4 = object.hasNext()) {
                Map.Entry entry = object.next();
                Object object5 = zzra.zzg((zzqo)entry.getValue());
                if (object5 == null) {
                    object = entry.getValue();
                    object2 = ((zzqo)entry.getValue()).getClass().getCanonicalName();
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object;
                    objectArray[n3] = object2;
                    zzhi.zza(String.format("Failure to convert a map's value to object: %s (%s)", objectArray));
                    return null;
                }
                entry = (String)entry.getKey();
                ((HashMap)object2).put(entry, object5);
            }
            return object2;
        }
        object = String.valueOf(object.getClass());
        zzhi.zza("Converting to Object from unknown abstract type: ".concat((String)object));
        return null;
    }

    public static Map zzh(Bundle bundle) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = bundle.get(string2);
            boolean bl3 = object instanceof Bundle;
            if (bl3) {
                object = zzra.zzh((Bundle)object);
                hashMap.put(string2, object);
                continue;
            }
            bl3 = object instanceof List;
            if (bl3) {
                object = zzra.zzk((List)object);
                hashMap.put(string2, object);
                continue;
            }
            hashMap.put(string2, object);
        }
        return hashMap;
    }

    public static boolean zzi(zzqo zzqo2) {
        zzqs zzqs2 = zzqs.zzc;
        boolean bl2 = true;
        if (zzqo2 != zzqs2 && zzqo2 != (zzqs2 = zzqs.zzb)) {
            boolean bl3 = zzqo2 instanceof zzqs;
            if (bl3) {
                boolean bl4 = ((zzqs)(zzqo2 = (zzqs)zzqo2)).zzj();
                if (!bl4) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }

    public static boolean zzj(zzqo zzqo2) {
        zzqs zzqs2;
        boolean bl2 = zzqo2 instanceof zzqp;
        boolean bl3 = true;
        if (!(bl2 || (bl2 = zzqo2 instanceof zzqq) || (bl2 = zzqo2 instanceof zzqz) || zzqo2 == (zzqs2 = zzqs.zzd) || zzqo2 == (zzqs2 = zzqs.zze))) {
            return false;
        }
        return bl3;
    }

    private static List zzk(List object) {
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            boolean bl3 = object2 instanceof Bundle;
            if (bl3) {
                object2 = zzra.zzh((Bundle)object2);
                arrayList.add(object2);
                continue;
            }
            bl3 = object2 instanceof List;
            if (bl3) {
                object2 = zzra.zzk((List)object2);
                arrayList.add(object2);
                continue;
            }
            arrayList.add(object2);
        }
        return arrayList;
    }
}

