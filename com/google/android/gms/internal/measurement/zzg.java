/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaf;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzh;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzg {
    public static double zza(double d2) {
        double d5;
        double d7;
        int n3 = Double.isNaN(d2);
        double d9 = 0.0;
        if (n3 != 0) {
            return d9;
        }
        n3 = Double.isInfinite(d2);
        if (n3 == 0 && (n3 = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1)) != 0 && (d7 = (d5 = d2 - (d9 = -0.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) != false) {
            n3 = n3 > 0 ? 1 : -1;
            double d12 = n3;
            d2 = Math.floor(Math.abs(d2)) * d12;
        }
        return d2;
    }

    public static int zza(zzh object) {
        int n3;
        String string2 = "runtime.counter";
        Double d2 = ((zzh)object).zza(string2).zze();
        double d5 = d2;
        double d7 = 1.0;
        int n4 = zzg.zzb(d5 += d7);
        if (n4 <= (n3 = 1000000)) {
            Double d9 = n4;
            zzai zzai2 = new zzai(d9);
            ((zzh)object).zzc(string2, zzai2);
            return n4;
        }
        object = new IllegalStateException("Instructions allowed exceeded");
        throw object;
    }

    public static zzbv zza(String string2) {
        Object object;
        int n3;
        if (string2 != null && (n3 = string2.isEmpty()) == 0) {
            n3 = Integer.parseInt(string2);
            object = zzbv.zza(n3);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            return object;
        }
        string2 = kp1_0.c("Unsupported commandId ", string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static Object zza(zzaq object) {
        Object object2 = zzaq.zzd;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            return null;
        }
        object2 = zzaq.zzc;
        bl2 = object2.equals(object);
        if (bl2) {
            return "";
        }
        bl2 = object instanceof zzap;
        if (bl2) {
            return zzg.zza((zzap)object);
        }
        bl2 = object instanceof zzaf;
        if (bl2) {
            boolean bl3;
            object2 = new Object();
            object = ((zzaf)object).iterator();
            while (bl3 = object.hasNext()) {
                Object object3 = zzg.zza((zzaq)object.next());
                if (object3 == null) continue;
                ((ArrayList)object2).add(object3);
            }
            return object2;
        }
        object2 = object.zze();
        bl2 = ((Double)object2).isNaN();
        if (!bl2) {
            return object.zze();
        }
        return object.zzf();
    }

    public static Map zza(zzap zzap2) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = zzap2.zza().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = zzg.zza(zzap2.zza(string2));
            if (object == null) continue;
            hashMap.put(string2, object);
        }
        return hashMap;
    }

    public static void zza(zzbv zzbv2, int n3, List list) {
        zzg.zza(zzbv2.name(), n3, list);
    }

    public static void zza(String string2, int n3, List list) {
        int n4 = list.size();
        if (n4 == n3) {
            return;
        }
        int n7 = list.size();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" operation requires ");
        stringBuilder.append(n3);
        stringBuilder.append(" parameters found ");
        stringBuilder.append(n7);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static boolean zza(zzaq object, zzaq object2) {
        Constable constable = object.getClass();
        Class<?> clazz = object2.getClass();
        boolean bl2 = constable.equals(clazz);
        clazz = null;
        if (!bl2) {
            return false;
        }
        bl2 = object instanceof zzax;
        boolean bl3 = true;
        if (!bl2 && !(bl2 = object instanceof zzao)) {
            bl2 = object instanceof zzai;
            if (bl2) {
                constable = object.zze();
                double d2 = (Double)constable;
                bl2 = Double.isNaN(d2);
                if (!bl2 && !(bl2 = Double.isNaN(d2 = ((Double)(constable = object2.zze())).doubleValue()))) {
                    object = ((zzaq)object).zze();
                    object2 = object2.zze();
                    return ((Double)object).equals(object2);
                }
                return false;
            }
            bl2 = object instanceof zzas;
            if (bl2) {
                object = object.zzf();
                object2 = object2.zzf();
                return ((String)object).equals(object2);
            }
            bl2 = object instanceof zzag;
            if (bl2) {
                object = ((zzaq)object).zzd();
                object2 = object2.zzd();
                return ((Boolean)object).equals(object2);
            }
            if (object == object2) {
                return bl3;
            }
            return false;
        }
        return bl3;
    }

    public static int zzb(double d2) {
        double d5;
        double d7;
        double d9;
        int n3 = Double.isNaN(d2);
        if (n3 == 0 && (n3 = Double.isInfinite(d2)) == 0 && (d9 = (d7 = d2 - (d5 = 0.0)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) != false) {
            n3 = d9 > 0 ? 1 : -1;
            d5 = n3;
            return (int)(Math.floor(Math.abs(d2)) * d5 % 4.294967296E9);
        }
        return 0;
    }

    public static void zzb(zzbv zzbv2, int n3, List list) {
        zzg.zzb(zzbv2.name(), n3, list);
    }

    public static void zzb(String string2, int n3, List list) {
        int n4 = list.size();
        if (n4 >= n3) {
            return;
        }
        int n7 = list.size();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" operation requires at least ");
        stringBuilder.append(n3);
        stringBuilder.append(" parameters found ");
        stringBuilder.append(n7);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static boolean zzb(zzaq object) {
        Double d2;
        boolean bl2;
        double d5;
        double d7;
        double d9;
        double d12;
        if (object == null) {
            return false;
        }
        boolean bl3 = ((Double)(object = object.zze())).isNaN();
        return !bl3 && (d12 = (d9 = (d7 = ((Double)object).doubleValue()) - (d5 = 0.0)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) >= 0 && (bl2 = ((Double)object).equals(d2 = Double.valueOf(d7 = Math.floor((Double)object))));
    }

    public static long zzc(double d2) {
        return (long)zzg.zzb(d2) & 0xFFFFFFFFL;
    }

    public static void zzc(String string2, int n3, List list) {
        int n4 = list.size();
        if (n4 <= n3) {
            return;
        }
        int n7 = list.size();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" operation requires at most ");
        stringBuilder.append(n3);
        stringBuilder.append(" parameters found ");
        stringBuilder.append(n7);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

