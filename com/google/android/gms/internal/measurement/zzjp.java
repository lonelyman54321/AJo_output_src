/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziw;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzkc;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zznl;
import java.util.List;
import java.util.Map;

final class zzjp
implements zznl {
    private final zzjn zza;

    private zzjp(zzjn zzjn2) {
        this.zza = zzjn2 = (zzjn)zzkj.zza(zzjn2, "output");
        zzjn2.zza = this;
    }

    public static zzjp zza(zzjn zzjn2) {
        zzjp zzjp2 = zzjn2.zza;
        if (zzjp2 != null) {
            return zzjp2;
        }
        zzjp2 = new zzjp(zzjn2);
        return zzjp2;
    }

    public final int zza() {
        return 1;
    }

    public final void zza(int n3) {
        this.zza.zzj(n3, 4);
    }

    public final void zza(int n3, double d2) {
        this.zza.zzb(n3, d2);
    }

    public final void zza(int n3, float f5) {
        this.zza.zzb(n3, f5);
    }

    public final void zza(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zza(int n3, long l2) {
        this.zza.zzf(n3, l2);
    }

    public final void zza(int n3, zziy zziy2) {
        this.zza.zzc(n3, zziy2);
    }

    public final void zza(int n3, zzlh zzlh2, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            this.zza.zzj(n3, 2);
            zzjn zzjn2 = this.zza;
            Object k2 = entry.getKey();
            Object v4 = entry.getValue();
            int n4 = zzle.zza(zzlh2, k2, v4);
            zzjn2.zzk(n4);
            zzjn2 = this.zza;
            k2 = entry.getKey();
            entry = entry.getValue();
            zzle.zza(zzjn2, zzlh2, k2, entry);
        }
    }

    public final void zza(int n3, Object object) {
        boolean bl2 = object instanceof zziy;
        if (bl2) {
            zzjn zzjn2 = this.zza;
            object = (zziy)object;
            zzjn2.zzd(n3, (zziy)object);
            return;
        }
        zzjn zzjn3 = this.zza;
        object = (zzlm)object;
        zzjn3.zzb(n3, (zzlm)object);
    }

    public final void zza(int n3, Object object, zzme zzme2) {
        zzjn zzjn2 = this.zza;
        object = (zzlm)object;
        zzjn2.zzj(n3, 3);
        zzjp zzjp2 = zzjn2.zza;
        zzme2.zza(object, zzjp2);
        zzjn2.zzj(n3, 4);
    }

    public final void zza(int n3, String string2) {
        this.zza.zzb(n3, string2);
    }

    public final void zza(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzjn zzjn2 = this.zza;
            zziy zziy2 = (zziy)list.get(i3);
            zzjn2.zzc(n3, zziy2);
        }
    }

    public final void zza(int n3, List list, zzme zzme2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zza(n3, e2, zzme2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zza(int n3, List list, boolean n4) {
        int n7;
        int n8;
        boolean bl2 = list instanceof zziw;
        int n10 = 2;
        if (bl2) {
            int n14;
            list = (zziw)list;
            if (n4 != 0) {
                void var3_5;
                int n15;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                boolean bl3 = false;
                Object var8_21 = null;
                for (n3 = 0; n3 < (n15 = ((zziw)list).size()); ++n3) {
                    n15 = zzjn.zza(((zziw)list).zzb(n3));
                    var3_5 += n15;
                }
                zzjn2 = this.zza;
                zzjn2.zzk((int)var3_5);
                while (n8 < (n3 = ((zziw)list).size())) {
                    zzjn2 = this.zza;
                    boolean bl4 = ((zziw)list).zzb(n8);
                    zzjn2.zzb(bl4);
                    ++n8;
                }
                return;
            }
            for (n8 = 0; n8 < (n14 = ((zziw)list).size()); ++n8) {
                zzjn zzjn3 = this.zza;
                boolean bl5 = ((zziw)list).zzb(n8);
                zzjn3.zzb(n3, bl5);
            }
            return;
        }
        if (n4 != 0) {
            void var3_9;
            int n16;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            boolean bl6 = false;
            Boolean bl7 = null;
            for (n3 = 0; n3 < (n16 = list.size()); ++n3) {
                Boolean bl8 = (Boolean)list.get(n3);
                n16 = zzjn.zza(bl8);
                var3_9 += n16;
            }
            zzjn4 = this.zza;
            zzjn4.zzk((int)var3_9);
            while (n8 < (n3 = list.size())) {
                zzjn4 = this.zza;
                bl7 = (Boolean)list.get(n8);
                boolean bl9 = bl7;
                zzjn4.zzb(bl9);
                ++n8;
            }
            return;
        }
        while (n8 < (n7 = list.size())) {
            zzjn zzjn5 = this.zza;
            Boolean bl10 = (Boolean)list.get(n8);
            boolean bl11 = bl10;
            zzjn5.zzb(n3, bl11);
            ++n8;
        }
    }

    public final void zza(int n3, boolean bl2) {
        this.zza.zzb(n3, bl2);
    }

    public final void zzb(int n3) {
        this.zza.zzj(n3, 3);
    }

    public final void zzb(int n3, int n4) {
        this.zza.zzg(n3, n4);
    }

    public final void zzb(int n3, long l2) {
        this.zza.zzh(n3, l2);
    }

    public final void zzb(int n3, Object object, zzme zzme2) {
        zzjn zzjn2 = this.zza;
        object = (zzlm)object;
        zzjn2.zzc(n3, (zzlm)object, zzme2);
    }

    public final void zzb(int n3, List list) {
        int n4;
        int n7 = list instanceof zzkx;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzkx)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzjn zzjn2;
                Object object = list2.zza(n4);
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzjn2 = this.zza;
                    object = (String)object;
                    zzjn2.zzb(n3, (String)object);
                    continue;
                }
                zzjn2 = this.zza;
                object = (zziy)object;
                zzjn2.zzc(n3, (zziy)object);
            }
            return;
        }
        while (n4 < (n7 = list.size())) {
            zzjn zzjn3 = this.zza;
            String string2 = (String)list.get(n4);
            zzjn3.zzb(n3, string2);
            ++n4;
        }
    }

    public final void zzb(int n3, List list, zzme zzme2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zzb(n3, e2, zzme2);
        }
    }

    public final void zzb(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzjs;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzjs)list;
            if (n4) {
                double d2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzjs)list).size()); ++n3) {
                    d2 = ((zzjs)list).zzb(n3);
                    n8 = zzjn.zza(d2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzjs)list).size())) {
                    zzjn2 = this.zza;
                    d2 = ((zzjs)list).zzb(n7);
                    zzjn2.zzb(d2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzjs)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                double d5 = ((zzjs)list).zzb(n7);
                zzjn3.zzb(n3, d5);
            }
            return;
        }
        if (n4) {
            double d7;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Double d9 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d12 = (Double)list.get(n3);
                d7 = d12;
                n8 = zzjn.zza(d7);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                d9 = (Double)list.get(n7);
                d7 = d9;
                zzjn4.zzb(d7);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Double d13 = (Double)list.get(n7);
            double d14 = d13;
            zzjn5.zzb(n3, d14);
            ++n7;
        }
    }

    public final void zzc(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zzc(int n3, long l2) {
        this.zza.zzf(n3, l2);
    }

    public final void zzc(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zza(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzi(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzh(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zza(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzi(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzh(n3, n8);
            ++n7;
        }
    }

    public final void zzd(int n3, int n4) {
        this.zza.zzg(n3, n4);
    }

    public final void zzd(int n3, long l2) {
        this.zza.zzg(n3, l2);
    }

    public final void zzd(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zzb(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzh(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzg(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zzb(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzh(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzg(n3, n8);
            ++n7;
        }
    }

    public final void zze(int n3, int n4) {
        this.zza.zzi(n3, n4);
    }

    public final void zze(int n3, long l2) {
        this.zza.zzh(n3, l2);
    }

    public final void zze(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzlb;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzlb)list;
            if (n4) {
                long l2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzlb)list).size()); ++n3) {
                    l2 = ((zzlb)list).zzb(n3);
                    n8 = zzjn.zza(l2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzlb)list).size())) {
                    zzjn2 = this.zza;
                    l2 = ((zzlb)list).zzb(n7);
                    zzjn2.zzf(l2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzlb)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                long l3 = ((zzlb)list).zzb(n7);
                zzjn3.zzf(n3, l3);
            }
            return;
        }
        if (n4) {
            long l4;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzjn.zza(l4);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzjn4.zzf(l4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Long l12 = (Long)list.get(n7);
            long l14 = l12;
            zzjn5.zzf(n3, l14);
            ++n7;
        }
    }

    public final void zzf(int n3, int n4) {
        this.zza.zzk(n3, n4);
    }

    public final void zzf(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkc;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkc)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                float f5 = 0.0f;
                Object var9_11 = null;
                for (n3 = 0; n3 < (n8 = ((zzkc)list).size()); ++n3) {
                    float f6 = ((zzkc)list).zzb(n3);
                    n8 = zzjn.zza(f6);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkc)list).size())) {
                    zzjn2 = this.zza;
                    f5 = ((zzkc)list).zzb(n7);
                    zzjn2.zzb(f5);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkc)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                float f7 = ((zzkc)list).zzb(n7);
                zzjn3.zzb(n3, f7);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            float f8 = 0.0f;
            Float f11 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f12 = (Float)list.get(n3);
                float f14 = f12.floatValue();
                n8 = zzjn.zza(f14);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                f11 = (Float)list.get(n7);
                f8 = f11.floatValue();
                zzjn4.zzb(f8);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Float f15 = (Float)list.get(n7);
            float f16 = f15.floatValue();
            zzjn5.zzb(n3, f16);
            ++n7;
        }
    }

    public final void zzg(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zzc(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzi(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzh(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zzc(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzi(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzh(n3, n8);
            ++n7;
        }
    }

    public final void zzh(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzlb;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzlb)list;
            if (n4) {
                long l2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzlb)list).size()); ++n3) {
                    l2 = ((zzlb)list).zzb(n3);
                    n8 = zzjn.zzb(l2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzlb)list).size())) {
                    zzjn2 = this.zza;
                    l2 = ((zzlb)list).zzb(n7);
                    zzjn2.zzh(l2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzlb)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                long l3 = ((zzlb)list).zzb(n7);
                zzjn3.zzh(n3, l3);
            }
            return;
        }
        if (n4) {
            long l4;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzjn.zzb(l4);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzjn4.zzh(l4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Long l12 = (Long)list.get(n7);
            long l14 = l12;
            zzjn5.zzh(n3, l14);
            ++n7;
        }
    }

    public final void zzi(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zzd(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzh(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzg(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zzd(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzh(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzg(n3, n8);
            ++n7;
        }
    }

    public final void zzj(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzlb;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzlb)list;
            if (n4) {
                long l2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzlb)list).size()); ++n3) {
                    l2 = ((zzlb)list).zzb(n3);
                    n8 = zzjn.zzc(l2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzlb)list).size())) {
                    zzjn2 = this.zza;
                    l2 = ((zzlb)list).zzb(n7);
                    zzjn2.zzf(l2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzlb)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                long l3 = ((zzlb)list).zzb(n7);
                zzjn3.zzf(n3, l3);
            }
            return;
        }
        if (n4) {
            long l4;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzjn.zzc(l4);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzjn4.zzf(l4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Long l12 = (Long)list.get(n7);
            long l14 = l12;
            zzjn5.zzf(n3, l14);
            ++n7;
        }
    }

    public final void zzk(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zze(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzj(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzi(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zze(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzj(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzi(n3, n8);
            ++n7;
        }
    }

    public final void zzl(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzlb;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzlb)list;
            if (n4) {
                long l2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzlb)list).size()); ++n3) {
                    l2 = ((zzlb)list).zzb(n3);
                    n8 = zzjn.zzd(l2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzlb)list).size())) {
                    zzjn2 = this.zza;
                    l2 = ((zzlb)list).zzb(n7);
                    zzjn2.zzg(l2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzlb)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                long l3 = ((zzlb)list).zzb(n7);
                zzjn3.zzg(n3, l3);
            }
            return;
        }
        if (n4) {
            long l4;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzjn.zzd(l4);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzjn4.zzg(l4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Long l12 = (Long)list.get(n7);
            long l14 = l12;
            zzjn5.zzg(n3, l14);
            ++n7;
        }
    }

    public final void zzm(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzkh;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzkh)list;
            if (n4) {
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzkh)list).size()); ++n3) {
                    n8 = zzjn.zzg(((zzkh)list).zzb(n3));
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzkh)list).size())) {
                    zzjn2 = this.zza;
                    n4 = ((zzkh)list).zzb(n7);
                    zzjn2.zzk(n4);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzkh)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                n8 = ((zzkh)list).zzb(n7);
                zzjn3.zzk(n3, n8);
            }
            return;
        }
        if (n4) {
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzjn.zzg(n15);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzjn4.zzk(n4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Integer n16 = (Integer)list.get(n7);
            n8 = n16;
            zzjn5.zzk(n3, n8);
            ++n7;
        }
    }

    public final void zzn(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzlb;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzlb)list;
            if (n4) {
                long l2;
                this.zza.zzj(n3, n10);
                zzjn zzjn2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzlb)list).size()); ++n3) {
                    l2 = ((zzlb)list).zzb(n3);
                    n8 = zzjn.zze(l2);
                    n4 += n8;
                }
                zzjn2 = this.zza;
                zzjn2.zzk(n4);
                while (n7 < (n3 = ((zzlb)list).size())) {
                    zzjn2 = this.zza;
                    l2 = ((zzlb)list).zzb(n7);
                    zzjn2.zzh(l2);
                    ++n7;
                }
                return;
            }
            for (n7 = 0; n7 < (n4 = ((zzlb)list).size()); ++n7) {
                zzjn zzjn3 = this.zza;
                long l3 = ((zzlb)list).zzb(n7);
                zzjn3.zzh(n3, l3);
            }
            return;
        }
        if (n4) {
            long l4;
            this.zza.zzj(n3, n10);
            zzjn zzjn4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzjn.zze(l4);
                n4 += n8;
            }
            zzjn4 = this.zza;
            zzjn4.zzk(n4);
            while (n7 < (n3 = list.size())) {
                zzjn4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzjn4.zzh(l4);
                ++n7;
            }
            return;
        }
        while (n7 < (n4 = list.size())) {
            zzjn zzjn5 = this.zza;
            Long l12 = (Long)list.get(n7);
            long l14 = l12;
            zzjn5.zzh(n3, l14);
            ++n7;
        }
    }
}

