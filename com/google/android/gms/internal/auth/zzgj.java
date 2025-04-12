/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzex;
import com.google.android.gms.internal.auth.zzfr;
import com.google.android.gms.internal.auth.zzgy;
import com.google.android.gms.internal.auth.zzha;
import com.google.android.gms.internal.auth.zzhi;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.RandomAccess;

final class zzgj {
    private static final Class zza;
    private static final zzgy zzb;
    private static final zzgy zzc;
    private static final zzgy zzd;

    static {
        Object object = "com.google.protobuf.GeneratedMessage";
        try {
            object = Class.forName((String)object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        zza = object;
        zzb = zzgj.zzj(false);
        zzc = zzgj.zzj(true);
        zzd = object = new zzha();
    }

    public static zzgy zza() {
        return zzb;
    }

    public static zzgy zzb() {
        return zzc;
    }

    public static zzgy zzc() {
        return zzd;
    }

    public static Object zzd(int n3, List object, zzex zzex2, Object object2, zzgy zzgy2) {
        if (zzex2 == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                boolean bl2 = zzex2.zza();
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = zzgj.zze(n3, n10, object2, zzgy2);
            }
            if (n7 != n4) {
                ((List)object).subList(n7, n4).clear();
                return object2;
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                boolean bl3 = zzex2.zza();
                if (bl3) continue;
                object2 = zzgj.zze(n3, n4, object2, zzgy2);
                object.remove();
            }
        }
        return object2;
    }

    public static Object zze(int n3, int n4, Object object, zzgy zzgy2) {
        if (object == null) {
            object = zzgy2.zzc();
        }
        long l2 = n4;
        zzgy2.zzd(object, n3, l2);
        return object;
    }

    public static void zzf(zzgy zzgy2, Object object, Object object2) {
        Object object3 = zzgy2.zza(object);
        object2 = zzgy2.zza(object2);
        object2 = zzgy2.zzb(object3, object2);
        zzgy2.zzf(object, object2);
    }

    public static void zzg(Class serializable) {
        boolean bl2;
        Class clazz = zzeu.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = zza) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static boolean zzh(Object object, Object object2) {
        boolean bl2 = true;
        if (object != object2) {
            if (object != null) {
                boolean bl3 = object.equals(object2);
                if (!bl3) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }

    public static void zzi(zzfr object, Object object2, Object object3, long l2) {
        object = zzhi.zzf(object2, l2);
        object3 = zzhi.zzf(object3, l2);
        object = zzfr.zza(object, object3);
        zzhi.zzp(object2, l2, object);
    }

    private static zzgy zzj(boolean bl2) {
        Class[] classArray;
        int n3 = 1;
        Constructor constructor = "com.google.protobuf.UnknownFieldSetSchema";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Throwable throwable) {
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            classArray = new Class[n3];
        }
        catch (Throwable throwable) {
            return null;
        }
        Class<Boolean> clazz = Boolean.TYPE;
        classArray[0] = clazz;
        constructor = ((Class)((Object)constructor)).getConstructor(classArray);
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = bl3;
        bl3 = constructor.newInstance(objectArray);
        return (zzgy)((Object)bl3);
    }
}

