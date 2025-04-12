/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhau;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbd;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhck;
import com.google.android.gms.internal.ads.zzhct;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhem;
import com.google.android.gms.internal.ads.zzheq;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfi;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.RandomAccess;

final class zzheb {
    public static final /* synthetic */ int zza;
    private static final Class zzb;
    private static final zzheq zzc;
    private static final zzheq zzd;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        Object object2 = "com.google.protobuf.GeneratedMessage";
        try {
            object2 = Class.forName((String)object2);
        }
        catch (Throwable throwable) {
            object2 = null;
        }
        zzb = object2;
        object2 = "com.google.protobuf.UnknownFieldSetSchema";
        try {
            object2 = Class.forName((String)object2);
        }
        catch (Throwable throwable) {
            object2 = null;
        }
        if (object2 != null) {
            try {
                object2 = ((Class)object2).getConstructor(null);
                object2 = ((Constructor)object2).newInstance(null);
                object = object2 = (zzheq)object2;
            }
            catch (Throwable throwable) {}
        }
        zzc = object;
        object = new zzhes();
        zzd = object;
    }

    public static void zzA(int n3, List list, zzhfi zzhfi2, zzhdz zzhdz2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzhfi zzhfi3 = zzhfi2;
                zzhfi3 = (zzhau)zzhfi2;
                ((zzhau)zzhfi3).zzq(n3, e2, zzhdz2);
            }
        }
    }

    public static void zzB(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzs(n3, list, bl2);
        }
    }

    public static void zzC(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzu(n3, list, bl2);
        }
    }

    public static void zzD(int n3, List list, zzhfi zzhfi2, zzhdz zzhdz2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzhfi zzhfi3 = zzhfi2;
                zzhfi3 = (zzhau)zzhfi2;
                ((zzhau)zzhfi3).zzv(n3, e2, zzhdz2);
            }
        }
    }

    public static void zzE(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzy(n3, list, bl2);
        }
    }

    public static void zzF(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzA(n3, list, bl2);
        }
    }

    public static void zzG(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzC(n3, list, bl2);
        }
    }

    public static void zzH(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzE(n3, list, bl2);
        }
    }

    public static void zzI(int n3, List list, zzhfi zzhfi2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzhfi2.zzH(n3, list);
        }
    }

    public static void zzJ(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzJ(n3, list, bl2);
        }
    }

    public static void zzK(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzL(n3, list, bl2);
        }
    }

    public static boolean zzL(Object object, Object object2) {
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

    public static int zza(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhbp;
        if (n7 != 0) {
            list = (zzhbp)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzhbp)list).zzd(n3);
                int n8 = zzhat.zzE(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                long l3 = n10.intValue();
                int n14 = zzhat.zzE(l3);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzb(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzhat.zzD(n3 << 3) + 4) * n4;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzhat.zzD(n3 << 3) + 8) * n4;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhbp;
        if (n7 != 0) {
            list = (zzhbp)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzhbp)list).zzd(n3);
                int n8 = zzhat.zzE(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                long l3 = n10.intValue();
                int n14 = zzhat.zzE(l3);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzg(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhct;
        if (n7 != 0) {
            list = (zzhct)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzhct)list).zza(n3);
                int n8 = zzhat.zzE(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzhat.zzE(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzh(int n3, Object object, zzhdz zzhdz2) {
        n3 <<= 3;
        boolean bl2 = object instanceof zzhck;
        if (bl2) {
            object = (zzhck)object;
            n3 = zzhat.zzD(n3);
            int n4 = ((zzhck)object).zza();
            return rk3_1.a(n4, n4, n3);
        }
        object = (zzhde)object;
        n3 = zzhat.zzD(n3);
        return zzhat.zzA((zzhde)object, zzhdz2) + n3;
    }

    public static int zzi(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhbp;
        if (n7 != 0) {
            list = (zzhbp)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = ((zzhbp)list).zzd(n3);
                int n10 = n8 + n8;
                n8 = zzhat.zzD(n8 >> 31 ^ n10);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n14 = (Integer)list.get(n3);
                int n15 = n14;
                int n16 = n15 + n15;
                n15 = zzhat.zzD(n15 >> 31 ^ n16);
                n7 += n15;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzj(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhct;
        int n8 = 63;
        if (n7 != 0) {
            list = (zzhct)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzhct)list).zza(n3);
                long l3 = l2 + l2;
                l2 = l2 >> n8 ^ l3;
                int n10 = zzhat.zzE(l2);
                n7 += n10;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l4 = (Long)list.get(n3);
                long l7 = l4;
                long l8 = l7 + l7;
                l7 = l7 >> n8 ^ l8;
                int n14 = zzhat.zzE(l7);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzk(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhbp;
        if (n7 != 0) {
            list = (zzhbp)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzhat.zzD(((zzhbp)list).zzd(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzhat.zzD(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzl(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzhct;
        if (n7 != 0) {
            list = (zzhct)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzhct)list).zza(n3);
                int n8 = zzhat.zzE(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzhat.zzE(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static zzheq zzm() {
        return zzc;
    }

    public static zzheq zzn() {
        return zzd;
    }

    public static Object zzo(Object object, int n3, List object2, zzhbu zzhbu2, Object object3, zzheq zzheq2) {
        if (zzhbu2 == null) {
            return object3;
        }
        int n4 = object2 instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object2.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object2).get(i3);
                int n10 = n8;
                boolean bl2 = zzhbu2.zza(n10);
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object2).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object3 = zzheb.zzp(object, n3, n10, object3, zzheq2);
            }
            if (n7 != n4) {
                ((List)object2).subList(n7, n4).clear();
                return object3;
            }
        } else {
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object2.next();
                n4 = n14;
                boolean bl3 = zzhbu2.zza(n4);
                if (bl3) continue;
                object3 = zzheb.zzp(object, n3, n4, object3, zzheq2);
                object2.remove();
            }
        }
        return object3;
    }

    public static Object zzp(Object object, int n3, int n4, Object object2, zzheq zzheq2) {
        if (object2 == null) {
            object2 = zzheq2.zzc(object);
        }
        long l2 = n4;
        zzheq2.zzl(object2, n3, l2);
        return object2;
    }

    public static void zzq(zzhaz object, Object object2, Object object3) {
        object3 = ((zzhaz)object).zzb(object3);
        zzhem zzhem2 = ((zzhbd)object3).zza;
        boolean bl2 = zzhem2.isEmpty();
        if (!bl2) {
            object = ((zzhaz)object).zzc(object2);
            ((zzhbd)object).zzj((zzhbd)object3);
        }
    }

    public static void zzr(zzheq zzheq2, Object object, Object object2) {
        Object object3 = zzheq2.zzd(object);
        object2 = zzheq2.zzd(object2);
        object2 = zzheq2.zze(object3, object2);
        zzheq2.zzo(object, object2);
    }

    public static void zzs(Class serializable) {
        boolean bl2;
        Class clazz = zzhbo.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)serializable);
        if (!bl3 && (clazz = zzb) != null && !(bl2 = clazz.isAssignableFrom((Class<?>)serializable))) {
            serializable = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw serializable;
        }
    }

    public static void zzt(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzc(n3, list, bl2);
        }
    }

    public static void zzu(int n3, List list, zzhfi zzhfi2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzhfi2.zze(n3, list);
        }
    }

    public static void zzv(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzg(n3, list, bl2);
        }
    }

    public static void zzw(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzj(n3, list, bl2);
        }
    }

    public static void zzx(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzl(n3, list, bl2);
        }
    }

    public static void zzy(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzn(n3, list, bl2);
        }
    }

    public static void zzz(int n3, List list, zzhfi zzhfi2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzhfi2.zzp(n3, list, bl2);
        }
    }
}

