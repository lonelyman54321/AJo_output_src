/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzbu;
import com.google.android.gms.internal.clearcut.zzby;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzch;
import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzcv;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzdc;
import com.google.android.gms.internal.clearcut.zzdj;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzex;
import com.google.android.gms.internal.clearcut.zzez;
import com.google.android.gms.internal.clearcut.zzfd;
import com.google.android.gms.internal.clearcut.zzfr;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.RandomAccess;

final class zzeh {
    private static final Class zzoh = zzeh.zzdp();
    private static final zzex zzoi = zzeh.zzd(false);
    private static final zzex zzoj = zzeh.zzd(true);
    private static final zzex zzok;

    static {
        zzez zzez2 = new zzez();
        zzok = zzez2;
    }

    public static int zza(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdc;
        if (n7 != 0) {
            list = (zzdc)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdc)list).getLong(n3);
                int n8 = zzbn.zze(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzbn.zze(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    private static Object zza(int n3, int n4, Object object, zzex zzex2) {
        if (object == null) {
            object = zzex2.zzdz();
        }
        long l2 = n4;
        zzex2.zza(object, n3, l2);
        return object;
    }

    public static Object zza(int n3, List object, zzck zzck2, Object object2, zzex zzex2) {
        if (zzck2 == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            Object var7_7 = null;
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                zzcj zzcj2 = zzck2.zzb(n10);
                if (zzcj2 != null) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = zzeh.zza(n3, n10, object2, zzex2);
            }
            if (n7 != n4) {
                List list = ((List)object).subList(n7, n4);
                list.clear();
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                zzcj zzcj3 = zzck2.zzb(n4);
                if (zzcj3 != null) continue;
                object2 = zzeh.zza(n3, n4, object2, zzex2);
                object.remove();
            }
        }
        return object2;
    }

    public static void zza(int n3, List list, zzfr zzfr2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzfr2.zza(n3, list);
        }
    }

    public static void zza(int n3, List list, zzfr zzfr2, zzef zzef2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzfr2.zza(n3, list, zzef2);
        }
    }

    public static void zza(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzg(n3, list, bl2);
        }
    }

    public static void zza(zzbu object, Object object2, Object object3) {
        boolean bl2 = ((zzby)(object3 = ((zzbu)object).zza(object3))).isEmpty();
        if (!bl2) {
            object = ((zzbu)object).zzb(object2);
            ((zzby)object).zza((zzby)object3);
        }
    }

    public static void zza(zzdj object, Object object2, Object object3, long l2) {
        Object object4 = zzfd.zzo(object2, l2);
        object3 = zzfd.zzo(object3, l2);
        object = object.zzb(object4, object3);
        zzfd.zza(object2, l2, object);
    }

    public static void zza(zzex zzex2, Object object, Object object2) {
        Object object3 = zzex2.zzq(object);
        object2 = zzex2.zzq(object2);
        object2 = zzex2.zzg(object3, object2);
        zzex2.zze(object, object2);
    }

    public static int zzb(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdc;
        if (n7 != 0) {
            list = (zzdc)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdc)list).getLong(n3);
                int n8 = zzbn.zzf(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzbn.zzf(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzb(int n3, List list, zzfr zzfr2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzfr2.zzb(n3, list);
        }
    }

    public static void zzb(int n3, List list, zzfr zzfr2, zzef zzef2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzfr2.zzb(n3, list, zzef2);
        }
    }

    public static void zzb(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzf(n3, list, bl2);
        }
    }

    public static int zzc(int n3, Object object, zzef zzef2) {
        boolean bl2 = object instanceof zzcv;
        if (bl2) {
            object = (zzcv)object;
            return zzbn.zza(n3, (zzcv)object);
        }
        object = (zzdo)object;
        return zzbn.zzb(n3, (zzdo)object, zzef2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzc(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = zzbn.zzr(n3) * n7;
        int n8 = list instanceof zzcx;
        if (n8 != 0) {
            list = (zzcx)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.getRaw(n4);
                boolean bl2 = object instanceof zzbb;
                if (bl2) {
                    zzbb zzbb2 = (zzbb)object;
                    n8 = zzbn.zzb(zzbb2);
                } else {
                    String string2 = (String)object;
                    n8 = zzbn.zzh(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof zzbb;
                if (bl3) {
                    zzbb zzbb3 = (zzbb)e2;
                    n8 = zzbn.zzb(zzbb3);
                } else {
                    String string3 = (String)e2;
                    n8 = zzbn.zzh(string3);
                }
                n3 = n8 += n3;
                ++n4;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzc(int n3, List list, zzef zzef2) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = zzbn.zzr(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof zzcv;
            if (bl2) {
                zzcv zzcv2 = (zzcv)e2;
                n8 = zzbn.zza(zzcv2);
            } else {
                zzdo zzdo2 = (zzdo)e2;
                n8 = zzbn.zzb(zzdo2, zzef2);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    public static int zzc(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdc;
        if (n7 != 0) {
            list = (zzdc)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdc)list).getLong(n3);
                int n8 = zzbn.zzg(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzbn.zzg(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzc(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzc(n3, list, bl2);
        }
    }

    public static boolean zzc(int n3, int n4, int n7) {
        int n8 = 40;
        boolean bl2 = true;
        if (n4 < n8) {
            return bl2;
        }
        long l2 = n4;
        long l3 = n3;
        l2 -= l3;
        l3 = n7;
        long l4 = (long)2 * l3;
        long l7 = 3;
        l3 += l7;
        long l8 = 10;
        long l12 = (l2 += l8) - (l3 = l3 * l7 + (l4 += l7));
        n7 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
        if (n7 <= 0) {
            return bl2;
        }
        return false;
    }

    public static int zzd(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = zzbn.zzr(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzbb zzbb2 = (zzbb)list.get(i3);
            n4 = zzbn.zzb(zzbb2);
            n3 += n4;
        }
        return n3;
    }

    public static int zzd(int n3, List list, zzef zzef2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            zzdo zzdo2 = (zzdo)list.get(i3);
            int n8 = zzbn.zzc(n3, zzdo2, zzef2);
            n7 += n8;
        }
        return n7;
    }

    public static int zzd(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzch;
        if (n7 != 0) {
            list = (zzch)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzbn.zzx(((zzch)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzbn.zzx(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    private static zzex zzd(boolean bl2) {
        GenericDeclaration genericDeclaration;
        int n3;
        block11: {
            n3 = 1;
            try {
                genericDeclaration = zzeh.zzdq();
                if (genericDeclaration != null) break block11;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        Class[] classArray = new Class[n3];
        Class<Boolean> clazz = Boolean.TYPE;
        classArray[0] = clazz;
        genericDeclaration = ((Class)genericDeclaration).getConstructor(classArray);
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = bl3;
        bl3 = ((Constructor)genericDeclaration).newInstance(objectArray);
        return (zzex)((Object)bl3);
    }

    public static void zzd(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzd(n3, list, bl2);
        }
    }

    public static boolean zzd(Object object, Object object2) {
        boolean bl2;
        return object == object2 || object != null && (bl2 = object.equals(object2));
        {
        }
    }

    public static zzex zzdm() {
        return zzoi;
    }

    public static zzex zzdn() {
        return zzoj;
    }

    public static zzex zzdo() {
        return zzok;
    }

    private static Class zzdp() {
        String string2 = "com.google.protobuf.GeneratedMessage";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static Class zzdq() {
        String string2 = "com.google.protobuf.UnknownFieldSetSchema";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static int zze(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzch;
        if (n7 != 0) {
            list = (zzch)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzbn.zzs(((zzch)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzbn.zzs(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zze(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzn(n3, list, bl2);
        }
    }

    public static int zzf(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzch;
        if (n7 != 0) {
            list = (zzch)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzbn.zzt(((zzch)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzbn.zzt(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzf(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zze(n3, list, bl2);
        }
    }

    public static void zzf(Class serializable) {
        boolean bl2;
        Class clazz = zzcg.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = zzoh) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static int zzg(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzch;
        if (n7 != 0) {
            list = (zzch)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzbn.zzu(((zzch)list).getInt(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzbn.zzu(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzg(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzl(n3, list, bl2);
        }
    }

    public static int zzh(List list) {
        return list.size() << 2;
    }

    public static void zzh(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zza(n3, list, bl2);
        }
    }

    public static int zzi(List list) {
        return list.size() << 3;
    }

    public static void zzi(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzj(n3, list, bl2);
        }
    }

    public static int zzj(List list) {
        return list.size();
    }

    public static void zzj(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzm(n3, list, bl2);
        }
    }

    public static void zzk(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzb(n3, list, bl2);
        }
    }

    public static void zzl(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzk(n3, list, bl2);
        }
    }

    public static void zzm(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzh(n3, list, bl2);
        }
    }

    public static void zzn(int n3, List list, zzfr zzfr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzfr2.zzi(n3, list, bl2);
        }
    }

    public static int zzo(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zza(list);
        int n8 = list.size();
        return zzbn.zzr(n3) * n8 + n7;
    }

    public static int zzp(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zzb(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzq(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zzc(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzr(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zzd(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzs(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zze(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzt(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zzf(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzu(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzeh.zzg(list);
        return zzbn.zzr(n3) * n4 + n7;
    }

    public static int zzv(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzbn.zzj(n3, 0) * n4;
    }

    public static int zzw(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzbn.zzg(n3, 0L) * n4;
    }

    public static int zzx(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzbn.zzc(n3, true) * n4;
    }
}

