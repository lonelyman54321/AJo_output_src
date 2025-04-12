/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.icing.zzcn;
import com.google.android.gms.internal.icing.zzcq;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdb;
import com.google.android.gms.internal.icing.zzdm;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzdt;
import com.google.android.gms.internal.icing.zzdy;
import com.google.android.gms.internal.icing.zzdz;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzep;
import com.google.android.gms.internal.icing.zzfd;
import com.google.android.gms.internal.icing.zzff;
import com.google.android.gms.internal.icing.zzfn;
import java.lang.reflect.Constructor;
import java.util.AbstractMap;
import java.util.List;

final class zzer {
    private static final Class zza;
    private static final zzfd zzb;
    private static final zzfd zzc;
    private static final zzfd zzd;

    static {
        Object object = "com.google.protobuf.GeneratedMessage";
        try {
            object = Class.forName((String)object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        zza = object;
        zzb = zzer.zzZ(false);
        zzc = zzer.zzZ(true);
        zzd = object = new zzff();
    }

    public static zzfd zzA() {
        return zzb;
    }

    public static zzfd zzB() {
        return zzc;
    }

    public static zzfd zzC() {
        return zzd;
    }

    public static boolean zzD(Object object, Object object2) {
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

    public static void zzE(zzcq zzcq2, Object object, Object object2) {
        zzcq2.zzb(object2);
        throw null;
    }

    public static void zzF(zzfd zzfd2, Object object, Object object2) {
        Object object3 = zzfd2.zzb(object);
        object2 = zzfd2.zzb(object2);
        object2 = zzfd2.zzd(object3, object2);
        zzfd2.zza(object, object2);
    }

    public static void zzG(zzdz object, Object object2, Object object3, long l2) {
        object = zzfn.zzn(object2, l2);
        object3 = zzfn.zzn(object3, l2);
        object = (zzdy)object;
        boolean bl2 = ((AbstractMap)(object3 = (zzdy)object3)).isEmpty();
        if (!bl2) {
            bl2 = ((zzdy)object).zzd();
            if (!bl2) {
                object = ((zzdy)object).zzb();
            }
            ((zzdy)object).zza((zzdy)object3);
        }
        zzfn.zzo(object2, l2, object);
    }

    public static void zzH(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzz(n3, list, bl2);
        }
    }

    public static void zzI(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzy(n3, list, bl2);
        }
    }

    public static void zzJ(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzv(n3, list, bl2);
        }
    }

    public static void zzK(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzw(n3, list, bl2);
        }
    }

    public static void zzL(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzI(n3, list, bl2);
        }
    }

    public static void zzM(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzx(n3, list, bl2);
        }
    }

    public static void zzN(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzG(n3, list, bl2);
        }
    }

    public static void zzO(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzt(n3, list, bl2);
        }
    }

    public static void zzP(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzE(n3, list, bl2);
        }
    }

    public static void zzQ(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzH(n3, list, bl2);
        }
    }

    public static void zzR(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzu(n3, list, bl2);
        }
    }

    public static void zzS(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzF(n3, list, bl2);
        }
    }

    public static void zzT(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzA(n3, list, bl2);
        }
    }

    public static void zzU(int n3, List list, zzcn zzcn2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzcn2.zzB(n3, list, bl2);
        }
    }

    public static void zzV(int n3, List list, zzcn zzcn2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzcn2.zzC(n3, list);
        }
    }

    public static void zzW(int n3, List list, zzcn zzcn2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzcn2.zzD(n3, list);
        }
    }

    public static void zzX(int n3, List list, zzcn zzcn2, zzep zzep2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzcn2.zzr(n3, e2, zzep2);
            }
        }
    }

    public static void zzY(int n3, List list, zzcn zzcn2, zzep zzep2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzcn2.zzs(n3, e2, zzep2);
            }
        }
    }

    private static zzfd zzZ(boolean bl2) {
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
        return (zzfd)((Object)bl3);
    }

    public static void zza(Class serializable) {
        boolean bl2;
        Class clazz = zzda.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = zza) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static int zzb(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdt;
        if (n7 != 0) {
            list = (zzdt)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdt)list).zzf(n3);
                int n8 = zzcm.zzx(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzcm.zzx(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzc(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzb(list);
        int n8 = list.size();
        return zzcm.zzu(n3) * n8 + n7;
    }

    public static int zzd(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdt;
        if (n7 != 0) {
            list = (zzdt)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdt)list).zzf(n3);
                int n8 = zzcm.zzx(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzcm.zzx(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int zze(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzd(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzf(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdt;
        int n8 = 63;
        if (n7 != 0) {
            list = (zzdt)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzdt)list).zzf(n3);
                long l3 = l2 + l2;
                l2 = l2 >> n8 ^ l3;
                int n10 = zzcm.zzx(l2);
                n7 += n10;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l4 = (Long)list.get(n3);
                long l7 = l4;
                long l8 = l7 + l7;
                l7 = l7 >> n8 ^ l8;
                int n14 = zzcm.zzx(l7);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzg(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzf(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzh(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdb;
        if (n7 != 0) {
            list = (zzdb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzcm.zzv(((zzdb)list).zzd(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzcm.zzv(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzi(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzh(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzj(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdb;
        if (n7 != 0) {
            list = (zzdb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzcm.zzv(((zzdb)list).zzd(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzcm.zzv(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzk(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzj(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzl(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdb;
        if (n7 != 0) {
            list = (zzdb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzcm.zzw(((zzdb)list).zzd(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzcm.zzw(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzm(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzl(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzn(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzdb;
        if (n7 != 0) {
            list = (zzdb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = ((zzdb)list).zzd(n3);
                int n10 = n8 + n8;
                n8 = zzcm.zzw(n8 >> 31 ^ n10);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n14 = (Integer)list.get(n3);
                int n15 = n14;
                int n16 = n15 + n15;
                n15 = zzcm.zzw(n15 >> 31 ^ n16);
                n7 += n15;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzo(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzer.zzn(list);
        return zzcm.zzu(n3) * n4 + n7;
    }

    public static int zzp(List list) {
        return list.size() * 4;
    }

    public static int zzq(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzcm.zzw(n3 << 3) + 4) * n4;
    }

    public static int zzr(List list) {
        return list.size() * 8;
    }

    public static int zzs(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzcm.zzw(n3 << 3) + 8) * n4;
    }

    public static int zzt(List list) {
        return list.size();
    }

    public static int zzu(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzcm.zzw(n3 << 3) + 1) * n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzv(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = zzcm.zzu(n3) * n7;
        int n8 = list instanceof zzdo;
        if (n8 != 0) {
            list = (zzdo)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.zzg(n4);
                boolean bl2 = object instanceof zzcf;
                if (bl2) {
                    zzcf zzcf2 = (zzcf)object;
                    n8 = zzcm.zzA(zzcf2);
                } else {
                    String string2 = (String)object;
                    n8 = zzcm.zzy(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof zzcf;
                if (bl3) {
                    zzcf zzcf3 = (zzcf)e2;
                    n8 = zzcm.zzA(zzcf3);
                } else {
                    String string3 = (String)e2;
                    n8 = zzcm.zzy(string3);
                }
                n3 = n8 += n3;
                ++n4;
            }
        }
        return n3;
    }

    public static int zzw(int n3, Object object, zzep zzep2) {
        boolean bl2 = object instanceof zzdm;
        if (bl2) {
            object = (zzdm)object;
            n3 = zzcm.zzw(n3 << 3);
            int n4 = ((zzdm)object).zza();
            return mo.c(n4, n4, n3);
        }
        object = (zzee)object;
        n3 = zzcm.zzw(n3 << 3);
        return zzcm.zzB((zzee)object, zzep2) + n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzx(int n3, List list, zzep zzep2) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = zzcm.zzu(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof zzdm;
            if (bl2) {
                zzdm zzdm2 = (zzdm)e2;
                n8 = zzcm.zzz(zzdm2);
            } else {
                zzee zzee2 = (zzee)e2;
                n8 = zzcm.zzB(zzee2, zzep2);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    public static int zzy(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = zzcm.zzu(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzcf zzcf2 = (zzcf)list.get(i3);
            n4 = zzcm.zzA(zzcf2);
            n3 += n4;
        }
        return n3;
    }

    public static int zzz(int n3, List list, zzep zzep2) {
        int n4 = list.size();
        if (n4 != 0) {
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                zzee zzee2 = (zzee)list.get(i3);
                int n8 = zzcm.zzE(n3, zzee2, zzep2);
                n7 += n8;
            }
            return n7;
        }
        return 0;
    }
}

