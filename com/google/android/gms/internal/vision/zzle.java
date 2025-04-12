/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zziq;
import com.google.android.gms.internal.vision.zziu;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjd;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzjy;
import com.google.android.gms.internal.vision.zzkh;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzlh;
import com.google.android.gms.internal.vision.zzlu;
import com.google.android.gms.internal.vision.zzlw;
import com.google.android.gms.internal.vision.zzma;
import com.google.android.gms.internal.vision.zzmr;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.RandomAccess;

final class zzle {
    private static final Class zza = zzle.zzd();
    private static final zzlu zzb = zzle.zza(false);
    private static final zzlu zzc = zzle.zza(true);
    private static final zzlu zzd;

    static {
        zzlw zzlw2 = new zzlw();
        zzd = zzlw2;
    }

    public static int zza(int n3, Object object, zzlc zzlc2) {
        boolean bl2 = object instanceof zzjt;
        if (bl2) {
            object = (zzjt)object;
            return zzii.zza(n3, (zzjt)object);
        }
        object = (zzkk)object;
        return zzii.zzb(n3, (zzkk)object, zzlc2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zza(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = zzii.zze(n3) * n7;
        int n8 = list instanceof zzjv;
        if (n8 != 0) {
            list = (zzjv)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.zzb(n4);
                boolean bl2 = object instanceof zzht;
                if (bl2) {
                    zzht zzht2 = (zzht)object;
                    n8 = zzii.zzb(zzht2);
                } else {
                    String string2 = (String)object;
                    n8 = zzii.zzb(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof zzht;
                if (bl3) {
                    zzht zzht3 = (zzht)e2;
                    n8 = zzii.zzb(zzht3);
                } else {
                    String string3 = (String)e2;
                    n8 = zzii.zzb(string3);
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
    public static int zza(int n3, List list, zzlc zzlc2) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = zzii.zze(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof zzjt;
            if (bl2) {
                zzjt zzjt2 = (zzjt)e2;
                n8 = zzii.zza(zzjt2);
            } else {
                zzkk zzkk2 = (zzkk)e2;
                n8 = zzii.zza(zzkk2, zzlc2);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    public static int zza(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zza(list);
        int n8 = list.size();
        return zzii.zze(n3) * n8 + n7;
    }

    public static int zza(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjy;
        if (n7 != 0) {
            list = (zzjy)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzjy)list).zzb(n3);
                int n8 = zzii.zzd(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzii.zzd(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static zzlu zza() {
        return zzb;
    }

    private static zzlu zza(boolean bl2) {
        GenericDeclaration genericDeclaration;
        int n3;
        block11: {
            n3 = 1;
            try {
                genericDeclaration = zzle.zze();
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
        return (zzlu)((Object)bl3);
    }

    public static Object zza(int n3, int n4, Object object, zzlu zzlu2) {
        if (object == null) {
            object = zzlu2.zza();
        }
        long l2 = n4;
        zzlu2.zza(object, n3, l2);
        return object;
    }

    public static Object zza(int n3, List object, zzjg zzjg2, Object object2, zzlu zzlu2) {
        if (zzjg2 == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                boolean bl2 = zzjg2.zza(n10);
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = zzle.zza(n3, n10, object2, zzlu2);
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
                boolean bl3 = zzjg2.zza(n4);
                if (bl3) continue;
                object2 = zzle.zza(n3, n4, object2, zzlu2);
                object.remove();
            }
        }
        return object2;
    }

    public static void zza(int n3, List list, zzmr zzmr2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzmr2.zza(n3, list);
        }
    }

    public static void zza(int n3, List list, zzmr zzmr2, zzlc zzlc2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzmr2.zza(n3, list, zzlc2);
        }
    }

    public static void zza(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzg(n3, list, bl2);
        }
    }

    public static void zza(zziq object, Object object2, Object object3) {
        object3 = ((zziq)object).zza(object3);
        zzlh zzlh2 = ((zziu)object3).zza;
        boolean bl2 = zzlh2.isEmpty();
        if (!bl2) {
            object = ((zziq)object).zzb(object2);
            ((zziu)object).zza((zziu)object3);
        }
    }

    public static void zza(zzkh object, Object object2, Object object3, long l2) {
        Object object4 = zzma.zzf(object2, l2);
        object3 = zzma.zzf(object3, l2);
        object = object.zza(object4, object3);
        zzma.zza(object2, l2, object);
    }

    public static void zza(zzlu zzlu2, Object object, Object object2) {
        Object object3 = zzlu2.zzb(object);
        object2 = zzlu2.zzb(object2);
        object2 = zzlu2.zzc(object3, object2);
        zzlu2.zza(object, object2);
    }

    public static void zza(Class serializable) {
        boolean bl2;
        Class clazz = zzjb.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = zza) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static boolean zza(Object object, Object object2) {
        boolean bl2;
        return object == object2 || object != null && (bl2 = object.equals(object2));
        {
        }
    }

    public static int zzb(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = zzii.zze(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzht zzht2 = (zzht)list.get(i3);
            n4 = zzii.zzb(zzht2);
            n3 += n4;
        }
        return n3;
    }

    public static int zzb(int n3, List list, zzlc zzlc2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            zzkk zzkk2 = (zzkk)list.get(i3);
            int n8 = zzii.zzc(n3, zzkk2, zzlc2);
            n7 += n8;
        }
        return n7;
    }

    public static int zzb(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zzb(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zzb(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjy;
        if (n7 != 0) {
            list = (zzjy)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzjy)list).zzb(n3);
                int n8 = zzii.zze(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzii.zze(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static zzlu zzb() {
        return zzc;
    }

    public static void zzb(int n3, List list, zzmr zzmr2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzmr2.zzb(n3, list);
        }
    }

    public static void zzb(int n3, List list, zzmr zzmr2, zzlc zzlc2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzmr2.zzb(n3, list, zzlc2);
        }
    }

    public static void zzb(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzf(n3, list, bl2);
        }
    }

    public static int zzc(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zzc(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zzc(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjy;
        if (n7 != 0) {
            list = (zzjy)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzjy)list).zzb(n3);
                int n8 = zzii.zzf(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzii.zzf(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static zzlu zzc() {
        return zzd;
    }

    public static void zzc(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzc(n3, list, bl2);
        }
    }

    public static int zzd(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zzd(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zzd(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjd;
        if (n7 != 0) {
            list = (zzjd)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzii.zzk(((zzjd)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzii.zzk(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    private static Class zzd() {
        String string2 = "com.google.protobuf.GeneratedMessage";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void zzd(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzd(n3, list, bl2);
        }
    }

    public static int zze(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zze(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zze(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjd;
        if (n7 != 0) {
            list = (zzjd)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzii.zzf(((zzjd)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzii.zzf(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    private static Class zze() {
        String string2 = "com.google.protobuf.UnknownFieldSetSchema";
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static void zze(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzn(n3, list, bl2);
        }
    }

    public static int zzf(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zzf(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zzf(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjd;
        if (n7 != 0) {
            list = (zzjd)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzii.zzg(((zzjd)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzii.zzg(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzf(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zze(n3, list, bl2);
        }
    }

    public static int zzg(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzle.zzg(list);
        return zzii.zze(n3) * n4 + n7;
    }

    public static int zzg(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzjd;
        if (n7 != 0) {
            list = (zzjd)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzii.zzh(((zzjd)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzii.zzh(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzg(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzl(n3, list, bl2);
        }
    }

    public static int zzh(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzii.zzi(n3, 0) * n4;
    }

    public static int zzh(List list) {
        return list.size() << 2;
    }

    public static void zzh(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zza(n3, list, bl2);
        }
    }

    public static int zzi(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzii.zzg(n3, 0L) * n4;
    }

    public static int zzi(List list) {
        return list.size() << 3;
    }

    public static void zzi(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzj(n3, list, bl2);
        }
    }

    public static int zzj(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzii.zzb(n3, true) * n4;
    }

    public static int zzj(List list) {
        return list.size();
    }

    public static void zzj(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzm(n3, list, bl2);
        }
    }

    public static void zzk(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzb(n3, list, bl2);
        }
    }

    public static void zzl(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzk(n3, list, bl2);
        }
    }

    public static void zzm(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzh(n3, list, bl2);
        }
    }

    public static void zzn(int n3, List list, zzmr zzmr2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzmr2.zzi(n3, list, bl2);
        }
    }
}

