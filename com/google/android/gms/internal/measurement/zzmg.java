/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmu;
import com.google.android.gms.internal.measurement.zzmw;
import com.google.android.gms.internal.measurement.zzmz;
import com.google.android.gms.internal.measurement.zznl;
import java.util.List;
import java.util.RandomAccess;

final class zzmg {
    private static final zzmu zza;

    static {
        zzmw zzmw2 = new zzmw();
        zza = zzmw2;
    }

    public static int zza(int n3, Object object, zzme zzme2) {
        boolean bl2 = object instanceof zzku;
        if (bl2) {
            object = (zzku)object;
            return zzjn.zzb(n3, (zzku)object);
        }
        object = (zzlm)object;
        return zzjn.zzb(n3, (zzlm)object, zzme2);
    }

    public static int zza(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = zzjn.zzf(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zziy zziy2 = (zziy)list.get(i3);
            n4 = zzjn.zza(zziy2);
            n3 += n4;
        }
        return n3;
    }

    public static int zza(int n3, List list, zzme zzme2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            zzlm zzlm2 = (zzlm)list.get(i3);
            int n8 = zzjn.zza(n3, zzlm2, zzme2);
            n7 += n8;
        }
        return n7;
    }

    public static int zza(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzjn.zza(n3, true) * n4;
    }

    public static int zza(List list) {
        return list.size();
    }

    public static zzmu zza() {
        return zza;
    }

    public static Object zza(Object object, int n3, int n4, Object object2, zzmu zzmu2) {
        if (object2 == null) {
            object2 = zzmu2.zzc(object);
        }
        long l2 = n4;
        zzmu2.zzb(object2, n3, l2);
        return object2;
    }

    public static Object zza(Object list, int n3, List object, zzkl zzkl2, Object object2, zzmu zzmu2) {
        if (zzkl2 == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                boolean bl2 = zzkl2.zza(n10);
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = zzmg.zza(list, n3, n10, object2, zzmu2);
            }
            if (n7 != n4) {
                list = ((List)object).subList(n7, n4);
                list.clear();
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                boolean bl3 = zzkl2.zza(n4);
                if (bl3) continue;
                object2 = zzmg.zza(list, n3, n4, object2, zzmu2);
                object.remove();
            }
        }
        return object2;
    }

    public static void zza(int n3, List list, zznl zznl2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zznl2.zza(n3, list);
        }
    }

    public static void zza(int n3, List list, zznl zznl2, zzme zzme2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zznl2.zza(n3, list, zzme2);
        }
    }

    public static void zza(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zza(n3, list, bl2);
        }
    }

    public static void zza(zzjv object, Object object2, Object object3) {
        object3 = ((zzjv)object).zza(object3);
        zzmj zzmj2 = ((zzjw)object3).zza;
        boolean bl2 = zzmj2.isEmpty();
        if (!bl2) {
            object = ((zzjv)object).zzb(object2);
            ((zzjw)object).zza((zzjw)object3);
        }
    }

    public static void zza(zzlj object, Object object2, Object object3, long l2) {
        Object object4 = zzmz.zze(object2, l2);
        object3 = zzmz.zze(object3, l2);
        object = object.zza(object4, object3);
        zzmz.zza(object2, l2, object);
    }

    public static void zza(zzmu zzmu2, Object object, Object object2) {
        Object object3 = zzmu2.zzd(object);
        object2 = zzmu2.zzd(object2);
        object2 = zzmu2.zza(object3, object2);
        zzmu2.zzc(object, object2);
    }

    public static void zza(Class clazz) {
        zzkg.class.isAssignableFrom(clazz);
    }

    public static boolean zza(Object object, Object object2) {
        boolean bl2;
        return object == object2 || object != null && (bl2 = object.equals(object2));
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzb(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = zzjn.zzf(n3) * n7;
        int n8 = list instanceof zzkx;
        if (n8 != 0) {
            list = (zzkx)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.zza(n4);
                boolean bl2 = object instanceof zziy;
                if (bl2) {
                    zziy zziy2 = (zziy)object;
                    n8 = zzjn.zza(zziy2);
                } else {
                    String string2 = (String)object;
                    n8 = zzjn.zza(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof zziy;
                if (bl3) {
                    zziy zziy3 = (zziy)e2;
                    n8 = zzjn.zza(zziy3);
                } else {
                    String string3 = (String)e2;
                    n8 = zzjn.zza(string3);
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
    public static int zzb(int n3, List list, zzme zzme2) {
        int n4 = list.size();
        int n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n3 = zzjn.zzf(n3) * n4;
        while (n7 < n4) {
            int n8;
            Object e2 = list.get(n7);
            boolean bl2 = e2 instanceof zzku;
            if (bl2) {
                zzku zzku2 = (zzku)e2;
                n8 = zzjn.zza(zzku2);
            } else {
                zzlm zzlm2 = (zzlm)e2;
                n8 = zzjn.zza(zzlm2, zzme2);
            }
            n3 = n8 += n3;
            ++n7;
        }
        return n3;
    }

    public static int zzb(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzb(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zzb(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzkh;
        if (n7 != 0) {
            list = (zzkh)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzjn.zza(((zzkh)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzjn.zza(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzb(int n3, List list, zznl zznl2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zznl2.zzb(n3, list);
        }
    }

    public static void zzb(int n3, List list, zznl zznl2, zzme zzme2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zznl2.zzb(n3, list, zzme2);
        }
    }

    public static void zzb(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzb(n3, list, bl2);
        }
    }

    public static int zzc(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzjn.zzb(n3, 0) * n4;
    }

    public static int zzc(List list) {
        return list.size() << 2;
    }

    public static void zzc(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzc(n3, list, bl2);
        }
    }

    public static int zzd(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return zzjn.zza(n3, 0L) * n4;
    }

    public static int zzd(List list) {
        return list.size() << 3;
    }

    public static void zzd(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzd(n3, list, bl2);
        }
    }

    public static int zze(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zze(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zze(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzkh;
        if (n7 != 0) {
            list = (zzkh)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzjn.zzc(((zzkh)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzjn.zzc(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zze(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zze(n3, list, bl2);
        }
    }

    public static int zzf(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzf(list);
        int n8 = list.size();
        return zzjn.zzf(n3) * n8 + n7;
    }

    public static int zzf(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzlb;
        if (n7 != 0) {
            list = (zzlb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzlb)list).zzb(n3);
                int n8 = zzjn.zzb(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzjn.zzb(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzf(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzf(n3, list, bl2);
        }
    }

    public static int zzg(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzg(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zzg(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzkh;
        if (n7 != 0) {
            list = (zzkh)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzjn.zze(((zzkh)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzjn.zze(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzg(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzg(n3, list, bl2);
        }
    }

    public static int zzh(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzh(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zzh(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzlb;
        if (n7 != 0) {
            list = (zzlb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzlb)list).zzb(n3);
                int n8 = zzjn.zzd(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzjn.zzd(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzh(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzh(n3, list, bl2);
        }
    }

    public static int zzi(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzi(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zzi(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzkh;
        if (n7 != 0) {
            list = (zzkh)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzjn.zzg(((zzkh)list).zzb(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzjn.zzg(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzi(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzi(n3, list, bl2);
        }
    }

    public static int zzj(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = zzmg.zzj(list);
        return zzjn.zzf(n3) * n4 + n7;
    }

    public static int zzj(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzlb;
        if (n7 != 0) {
            list = (zzlb)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzlb)list).zzb(n3);
                int n8 = zzjn.zze(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzjn.zze(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static void zzj(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzj(n3, list, bl2);
        }
    }

    public static void zzk(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzk(n3, list, bl2);
        }
    }

    public static void zzl(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzl(n3, list, bl2);
        }
    }

    public static void zzm(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzm(n3, list, bl2);
        }
    }

    public static void zzn(int n3, List list, zznl zznl2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zznl2.zzn(n3, list, bl2);
        }
    }
}

