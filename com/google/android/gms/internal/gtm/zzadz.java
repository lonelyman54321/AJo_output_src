/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabr;
import com.google.android.gms.internal.gtm.zzabv;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzacj;
import com.google.android.gms.internal.gtm.zzacw;
import com.google.android.gms.internal.gtm.zzada;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaem;
import com.google.android.gms.internal.gtm.zzaen;
import com.google.android.gms.internal.gtm.zzaeo;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzzi;
import com.google.android.gms.internal.gtm.zzzj;
import java.util.AbstractMap;
import java.util.List;
import java.util.RandomAccess;

final class zzadz {
    public static final /* synthetic */ int zza;
    private static final zzaem zzb;

    static {
        zzaeo zzaeo2 = new zzaeo();
        zzb = zzaeo2;
    }

    public static void zzA(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzu(n3, list, bl2);
        }
    }

    public static void zzB(int n3, List list, zzaez zzaez2, zzadx zzadx2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzaez zzaez3 = zzaez2;
                zzaez3 = (zzzj)zzaez2;
                ((zzzj)zzaez3).zzv(n3, e2, zzadx2);
            }
        }
    }

    public static void zzC(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzy(n3, list, bl2);
        }
    }

    public static void zzD(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzA(n3, list, bl2);
        }
    }

    public static void zzE(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzC(n3, list, bl2);
        }
    }

    public static void zzF(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzE(n3, list, bl2);
        }
    }

    public static void zzG(int n3, List list, zzaez zzaez2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzaez2.zzH(n3, list);
        }
    }

    public static void zzH(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzJ(n3, list, bl2);
        }
    }

    public static void zzI(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzL(n3, list, bl2);
        }
    }

    public static boolean zzJ(Object object, Object object2) {
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
        int n7 = list instanceof zzacg;
        if (n7 != 0) {
            list = (zzacg)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzacg)list).zze(n3);
                int n8 = zzzi.zzD(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                long l3 = n10.intValue();
                int n14 = zzzi.zzD(l3);
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
        return (zzzi.zzC(n3 << 3) + 4) * n4;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int n3, List list, boolean bl2) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return (zzzi.zzC(n3 << 3) + 8) * n4;
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
        int n7 = list instanceof zzacg;
        if (n7 != 0) {
            list = (zzacg)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzacg)list).zze(n3);
                int n8 = zzzi.zzD(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                long l3 = n10.intValue();
                int n14 = zzzi.zzD(l3);
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
        int n7 = list instanceof zzada;
        if (n7 != 0) {
            list = (zzada)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzada)list).zze(n3);
                int n8 = zzzi.zzD(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzzi.zzD(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int zzh(int n3, Object object, zzadx zzadx2) {
        n3 <<= 3;
        boolean bl2 = object instanceof zzacw;
        if (bl2) {
            object = (zzacw)object;
            n3 = zzzi.zzC(n3);
            int n4 = ((zzacw)object).zza();
            return d90_0.a(n4, n4, n3);
        }
        object = (zzadl)object;
        n3 = zzzi.zzC(n3);
        return zzzi.zzA((zzadl)object, zzadx2) + n3;
    }

    public static int zzi(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof zzacg;
        if (n7 != 0) {
            list = (zzacg)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = ((zzacg)list).zze(n3);
                int n10 = n8 + n8;
                n8 = zzzi.zzC(n8 >> 31 ^ n10);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n14 = (Integer)list.get(n3);
                int n15 = n14;
                int n16 = n15 + n15;
                n15 = zzzi.zzC(n15 >> 31 ^ n16);
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
        int n7 = list instanceof zzada;
        int n8 = 63;
        if (n7 != 0) {
            list = (zzada)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzada)list).zze(n3);
                long l3 = l2 + l2;
                l2 = l2 >> n8 ^ l3;
                int n10 = zzzi.zzD(l2);
                n7 += n10;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l4 = (Long)list.get(n3);
                long l7 = l4;
                long l8 = l7 + l7;
                l7 = l7 >> n8 ^ l8;
                int n14 = zzzi.zzD(l7);
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
        int n7 = list instanceof zzacg;
        if (n7 != 0) {
            list = (zzacg)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = zzzi.zzC(((zzacg)list).zze(n3));
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = zzzi.zzC(n10);
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
        int n7 = list instanceof zzada;
        if (n7 != 0) {
            list = (zzada)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                long l2 = ((zzada)list).zze(n3);
                int n8 = zzzi.zzD(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = zzzi.zzD(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static zzaem zzm() {
        return zzb;
    }

    public static Object zzn(Object object, int n3, List object2, zzacj zzacj2, Object object3, zzaem zzaem2) {
        if (zzacj2 == null) {
            return object3;
        }
        int n4 = object2 instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object2.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object2).get(i3);
                int n10 = n8;
                boolean bl2 = zzacj2.zza(n10);
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object2).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object3 = zzadz.zzo(object, n3, n10, object3, zzaem2);
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
                boolean bl3 = zzacj2.zza(n4);
                if (bl3) continue;
                object3 = zzadz.zzo(object, n3, n4, object3, zzaem2);
                object2.remove();
            }
        }
        return object3;
    }

    public static Object zzo(Object object, int n3, int n4, Object object2, zzaem zzaem2) {
        if (object2 == null) {
            object2 = zzaem2.zza(object);
        }
        long l2 = n4;
        zzaem2.zzh(object2, n3, l2);
        return object2;
    }

    public static void zzp(zzabr object, Object object2, Object object3) {
        object = ((zzacc)object3).zza;
        object3 = ((zzabv)object).zza;
        boolean bl2 = ((AbstractMap)object3).isEmpty();
        if (!bl2) {
            object2 = ((zzacc)object2).zzU();
            ((zzabv)object2).zzj((zzabv)object);
        }
    }

    public static void zzq(zzaem object, Object object2, Object object3) {
        object2 = (zzacf)object2;
        object = ((zzacf)object2).zzc;
        object3 = ((zzacf)object3).zzc;
        zzaen zzaen2 = zzaen.zzc();
        boolean bl2 = zzaen2.equals(object3);
        if (!bl2) {
            zzaen2 = zzaen.zzc();
            bl2 = zzaen2.equals(object);
            if (bl2) {
                object = zzaen.zze((zzaen)object, (zzaen)object3);
            } else {
                ((zzaen)object).zzd((zzaen)object3);
            }
        }
        ((zzacf)object2).zzc = object;
    }

    public static void zzr(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzc(n3, list, bl2);
        }
    }

    public static void zzs(int n3, List list, zzaez zzaez2) {
        boolean bl2;
        if (list != null && !(bl2 = list.isEmpty())) {
            zzaez2.zze(n3, list);
        }
    }

    public static void zzt(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzg(n3, list, bl2);
        }
    }

    public static void zzu(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzj(n3, list, bl2);
        }
    }

    public static void zzv(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzl(n3, list, bl2);
        }
    }

    public static void zzw(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzn(n3, list, bl2);
        }
    }

    public static void zzx(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzp(n3, list, bl2);
        }
    }

    public static void zzy(int n3, List list, zzaez zzaez2, zzadx zzadx2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                zzaez zzaez3 = zzaez2;
                zzaez3 = (zzzj)zzaez2;
                ((zzzj)zzaez3).zzq(n3, e2, zzadx2);
            }
        }
    }

    public static void zzz(int n3, List list, zzaez zzaez2, boolean bl2) {
        boolean bl3;
        if (list != null && !(bl3 = list.isEmpty())) {
            zzaez2.zzs(n3, list, bl2);
        }
    }
}

