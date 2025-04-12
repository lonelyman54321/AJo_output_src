/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbs;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzck;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzep;
import java.util.List;

final class zzcn {
    private final zzcm zza;

    private zzcn(zzcm zzcm2) {
        zzdh.zzb(zzcm2, "output");
        this.zza = zzcm2;
        zzcm2.zza = this;
    }

    public static zzcn zza(zzcm zzcm2) {
        zzcn zzcn2 = zzcm2.zza;
        if (zzcn2 != null) {
            return zzcn2;
        }
        zzcn2 = new zzcn(zzcm2);
        return zzcn2;
    }

    public final void zzA(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzcm.zzv(n10);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzcm2.zzk(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzcm3.zzb(n3, n15);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zzB(int n3, List list, boolean n4) {
        int n7;
        if (n4 != 0) {
            void var3_5;
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            boolean bl2 = false;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Boolean bl3 = (Boolean)list.get(n3);
                bl3.getClass();
                ++var3_5;
            }
            zzcm2 = this.zza;
            zzcm2.zzl((int)var3_5);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Boolean)list.get(n7);
                byte by2 = ((Boolean)object).booleanValue();
                zzcm2.zzj(by2);
                ++n7;
            }
        } else {
            int n10;
            for (n7 = 0; n7 < (n10 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Boolean bl4 = (Boolean)list.get(n7);
                boolean bl5 = bl4;
                zzcm3.zzg(n3, bl5);
            }
        }
    }

    public final void zzC(int n3, List list) {
        int n4;
        int n7 = list instanceof zzdo;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzdo)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzcm zzcm2;
                Object object = list2.zzg(n4);
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzcm2 = this.zza;
                    object = (String)object;
                    zzcm2.zzh(n3, (String)object);
                    continue;
                }
                zzcm2 = this.zza;
                object = (zzcf)object;
                zzcm2.zzi(n3, (zzcf)object);
            }
        } else {
            while (n4 < (n7 = list.size())) {
                zzcm zzcm3 = this.zza;
                String string2 = (String)list.get(n4);
                zzcm3.zzh(n3, string2);
                ++n4;
            }
        }
    }

    public final void zzD(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzcm zzcm2 = this.zza;
            zzcf zzcf2 = (zzcf)list.get(i3);
            zzcm2.zzi(n3, zzcf2);
        }
    }

    public final void zzE(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzcm.zzw(n10);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzcm2.zzl(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzcm3.zzc(n3, n15);
            }
        }
    }

    public final void zzF(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n10.getClass();
                n4 += 4;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzcm2.zzm(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzcm3.zzd(n3, n15);
            }
        }
    }

    public final void zzG(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l2 = (Long)list.get(n3);
                l2.getClass();
                n4 += 8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Long)list.get(n7);
                long l3 = (Long)object;
                zzcm2.zzo(l3);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                zzcm3.zzf(n3, l7);
            }
        }
    }

    public final void zzH(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = n10;
                int n14 = n8 + n8;
                n8 = zzcm.zzw(n8 >> 31 ^ n14);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                n8 = n4 + n4;
                n4 = n4 >> 31 ^ n8;
                zzcm2.zzl(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n15 = (Integer)list.get(n7);
                int n16 = n15;
                int n17 = n16 + n16;
                n16 = n16 >> 31 ^ n17;
                zzcm3.zzc(n3, n16);
            }
        }
    }

    public final void zzI(int n3, List list, boolean n4) {
        int n7;
        int n8 = 63;
        if (n4) {
            long l2;
            long l3;
            Object object = this.zza;
            int n10 = 2;
            ((zzcm)object).zza(n3, n10);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n10 = list.size()); ++n3) {
                Long l4 = (Long)list.get(n3);
                l3 = l4;
                l2 = l3 + l3;
                l3 = l3 >> n8 ^ l2;
                n10 = zzcm.zzx(l3);
                n4 += n10;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Long)list.get(n7);
                l3 = (Long)object;
                l2 = l3 + l3;
                l3 = l3 >> n8 ^ l2;
                zzcm2.zzn(l3);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Long l7 = (Long)list.get(n7);
                long l8 = l7;
                long l12 = l8 + l8;
                l8 = l8 >> n8 ^ l12;
                zzcm3.zze(n3, l8);
            }
        }
    }

    public final void zzb(int n3, int n4) {
        this.zza.zzd(n3, n4);
    }

    public final void zzc(int n3, long l2) {
        this.zza.zze(n3, l2);
    }

    public final void zzd(int n3, long l2) {
        this.zza.zzf(n3, l2);
    }

    public final void zze(int n3, float f5) {
        zzcm zzcm2 = this.zza;
        int n4 = Float.floatToRawIntBits(f5);
        zzcm2.zzd(n3, n4);
    }

    public final void zzf(int n3, double d2) {
        zzcm zzcm2 = this.zza;
        long l2 = Double.doubleToRawLongBits(d2);
        zzcm2.zzf(n3, l2);
    }

    public final void zzg(int n3, int n4) {
        this.zza.zzb(n3, n4);
    }

    public final void zzh(int n3, long l2) {
        this.zza.zze(n3, l2);
    }

    public final void zzi(int n3, int n4) {
        this.zza.zzb(n3, n4);
    }

    public final void zzj(int n3, long l2) {
        this.zza.zzf(n3, l2);
    }

    public final void zzk(int n3, int n4) {
        this.zza.zzd(n3, n4);
    }

    public final void zzl(int n3, boolean bl2) {
        this.zza.zzg(n3, bl2);
    }

    public final void zzm(int n3, String string2) {
        this.zza.zzh(n3, string2);
    }

    public final void zzn(int n3, zzcf zzcf2) {
        this.zza.zzi(n3, zzcf2);
    }

    public final void zzo(int n3, int n4) {
        this.zza.zzc(n3, n4);
    }

    public final void zzp(int n3, int n4) {
        zzcm zzcm2 = this.zza;
        int n7 = n4 + n4;
        n4 = n4 >> 31 ^ n7;
        zzcm2.zzc(n3, n4);
    }

    public final void zzq(int n3, long l2) {
        zzcm zzcm2 = this.zza;
        long l3 = l2 + l2;
        l2 = l2 >> 63 ^ l3;
        zzcm2.zze(n3, l2);
    }

    public final void zzr(int n3, Object object, zzep zzep2) {
        zzcm zzcm2 = this.zza;
        object = (zzee)object;
        zzcm2 = (zzck)zzcm2;
        n3 = n3 << 3 | 2;
        ((zzck)zzcm2).zzl(n3);
        Object object2 = object;
        object2 = (zzbs)object;
        int n4 = ((zzbs)object2).zzi();
        int n7 = -1;
        if (n4 == n7) {
            n4 = zzep2.zzd(object2);
            ((zzbs)object2).zzj(n4);
        }
        ((zzck)zzcm2).zzl(n4);
        object2 = zzcm2.zza;
        zzep2.zzi(object, (zzcn)object2);
    }

    public final void zzs(int n3, Object object, zzep zzep2) {
        zzcm zzcm2 = this.zza;
        object = (zzee)object;
        zzcm2.zza(n3, 3);
        zzcn zzcn2 = zzcm2.zza;
        zzep2.zzi(object, zzcn2);
        zzcm2.zza(n3, 4);
    }

    public final void zzt(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzcm.zzv(n10);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzcm2.zzk(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzcm3.zzb(n3, n15);
            }
        }
    }

    public final void zzu(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n10.getClass();
                n4 += 4;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzcm2.zzm(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzcm3.zzd(n3, n15);
            }
        }
    }

    public final void zzv(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzcm.zzx(l2);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzcm2.zzn(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                zzcm3.zze(n3, l7);
            }
        }
    }

    public final void zzw(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzcm.zzx(l2);
                n4 += n8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzcm2.zzn(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                zzcm3.zze(n3, l7);
            }
        }
    }

    public final void zzx(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l2 = (Long)list.get(n3);
                l2.getClass();
                n4 += 8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Long)list.get(n7);
                long l3 = (Long)object;
                zzcm2.zzo(l3);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Long l4 = (Long)list.get(n7);
                long l7 = l4;
                zzcm3.zzf(n3, l7);
            }
        }
    }

    public final void zzy(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            float f5 = 2.8E-45f;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            float f6 = 0.0f;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f7 = (Float)list.get(n3);
                f7.getClass();
                n4 += 4;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Float)list.get(n7);
                f6 = ((Float)object).floatValue();
                n4 = Float.floatToRawIntBits(f6);
                zzcm2.zzm(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Float f8 = (Float)list.get(n7);
                float f11 = f8.floatValue();
                int n10 = Float.floatToRawIntBits(f11);
                zzcm3.zzd(n3, n10);
            }
        }
    }

    public final void zzz(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzcm)object).zza(n3, n8);
            zzcm zzcm2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d2 = (Double)list.get(n3);
                d2.getClass();
                n4 += 8;
            }
            zzcm2 = this.zza;
            zzcm2.zzl(n4);
            while (n7 < (n3 = list.size())) {
                zzcm2 = this.zza;
                object = (Double)list.get(n7);
                double d5 = (Double)object;
                long l2 = Double.doubleToRawLongBits(d5);
                zzcm2.zzo(l2);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzcm zzcm3 = this.zza;
                Double d7 = (Double)list.get(n7);
                double d9 = d7;
                long l3 = Double.doubleToRawLongBits(d9);
                zzcm3.zzf(n3, l3);
            }
        }
    }
}

