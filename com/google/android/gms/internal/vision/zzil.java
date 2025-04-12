/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzkc;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzmq;
import com.google.android.gms.internal.vision.zzmr;
import java.util.List;
import java.util.Map;

final class zzil
implements zzmr {
    private final zzii zza;

    private zzil(zzii zzii2) {
        this.zza = zzii2 = (zzii)zzjf.zza((Object)zzii2, "output");
        zzii2.zza = this;
    }

    public static zzil zza(zzii zzii2) {
        zzil zzil2 = zzii2.zza;
        if (zzil2 != null) {
            return zzil2;
        }
        zzil2 = new zzil(zzii2);
        return zzil2;
    }

    public final int zza() {
        return zzmq.zza;
    }

    public final void zza(int n3) {
        this.zza.zza(n3, 3);
    }

    public final void zza(int n3, double d2) {
        this.zza.zza(n3, d2);
    }

    public final void zza(int n3, float f5) {
        this.zza.zza(n3, f5);
    }

    public final void zza(int n3, int n4) {
        this.zza.zze(n3, n4);
    }

    public final void zza(int n3, long l2) {
        this.zza.zza(n3, l2);
    }

    public final void zza(int n3, zzht zzht2) {
        this.zza.zza(n3, zzht2);
    }

    public final void zza(int n3, zzkf zzkf2, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            this.zza.zza(n3, 2);
            zzii zzii2 = this.zza;
            Object k2 = entry.getKey();
            Object v4 = entry.getValue();
            int n4 = zzkc.zza(zzkf2, k2, v4);
            zzii2.zzb(n4);
            zzii2 = this.zza;
            k2 = entry.getKey();
            entry = entry.getValue();
            zzkc.zza(zzii2, zzkf2, k2, entry);
        }
    }

    public final void zza(int n3, Object object) {
        boolean bl2 = object instanceof zzht;
        if (bl2) {
            zzii zzii2 = this.zza;
            object = (zzht)object;
            zzii2.zzb(n3, (zzht)object);
            return;
        }
        zzii zzii3 = this.zza;
        object = (zzkk)object;
        zzii3.zza(n3, (zzkk)object);
    }

    public final void zza(int n3, Object object, zzlc zzlc2) {
        zzii zzii2 = this.zza;
        object = (zzkk)object;
        zzii2.zza(n3, (zzkk)object, zzlc2);
    }

    public final void zza(int n3, String string2) {
        this.zza.zza(n3, string2);
    }

    public final void zza(int n3, List list) {
        int n4;
        int n7 = list instanceof zzjv;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzjv)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzii zzii2;
                Object object = list2.zzb(n4);
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzii2 = this.zza;
                    object = (String)object;
                    zzii2.zza(n3, (String)object);
                    continue;
                }
                zzii2 = this.zza;
                object = (zzht)object;
                zzii2.zza(n3, (zzht)object);
            }
            return;
        }
        while (n4 < (n7 = list.size())) {
            zzii zzii3 = this.zza;
            String string2 = (String)list.get(n4);
            zzii3.zza(n3, string2);
            ++n4;
        }
    }

    public final void zza(int n3, List list, zzlc zzlc2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zza(n3, e2, zzlc2);
        }
    }

    public final void zza(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzf(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zza(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zzb(n3, n15);
        }
    }

    public final void zza(int n3, boolean bl2) {
        this.zza.zza(n3, bl2);
    }

    public final void zzb(int n3) {
        this.zza.zza(n3, 4);
    }

    public final void zzb(int n3, int n4) {
        this.zza.zzb(n3, n4);
    }

    public final void zzb(int n3, long l2) {
        this.zza.zzc(n3, l2);
    }

    public final void zzb(int n3, Object object, zzlc zzlc2) {
        zzii zzii2 = this.zza;
        object = (zzkk)object;
        zzii2.zza(n3, 3);
        zzil zzil2 = zzii2.zza;
        zzlc2.zza(object, zzil2);
        zzii2.zza(n3, 4);
    }

    public final void zzb(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzii zzii2 = this.zza;
            zzht zzht2 = (zzht)list.get(i3);
            zzii2.zza(n3, zzht2);
        }
    }

    public final void zzb(int n3, List list, zzlc zzlc2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zzb(n3, e2, zzlc2);
        }
    }

    public final void zzb(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzi(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zzd(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zze(n3, n15);
        }
    }

    public final void zzc(int n3, int n4) {
        this.zza.zzb(n3, n4);
    }

    public final void zzc(int n3, long l2) {
        this.zza.zza(n3, l2);
    }

    public final void zzc(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzii.zzd(l2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzii2.zza(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzii3.zza(n3, l7);
        }
    }

    public final void zzd(int n3, int n4) {
        this.zza.zze(n3, n4);
    }

    public final void zzd(int n3, long l2) {
        this.zza.zzc(n3, l2);
    }

    public final void zzd(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzii.zze(l2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzii2.zza(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzii3.zza(n3, l7);
        }
    }

    public final void zze(int n3, int n4) {
        this.zza.zzc(n3, n4);
    }

    public final void zze(int n3, long l2) {
        this.zza.zzb(n3, l2);
    }

    public final void zze(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzii.zzg(l2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzii2.zzc(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzii3.zzc(n3, l7);
        }
    }

    public final void zzf(int n3, int n4) {
        this.zza.zzd(n3, n4);
    }

    public final void zzf(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            float f5 = 2.8E-45f;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            float f6 = 0.0f;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f7 = (Float)list.get(n3);
                f5 = f7.floatValue();
                n8 = zzii.zzb(f5);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Float)list.get(n7);
                f6 = ((Float)object).floatValue();
                zzii2.zza(f6);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Float f8 = (Float)list.get(n7);
            float f11 = f8.floatValue();
            zzii3.zza(n3, f11);
        }
    }

    public final void zzg(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            double d2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d5 = (Double)list.get(n3);
                d2 = d5;
                n8 = zzii.zzb(d2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Double)list.get(n7);
                d2 = (Double)object;
                zzii2.zza(d2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Double d7 = (Double)list.get(n7);
            double d9 = d7;
            zzii3.zza(n3, d9);
        }
    }

    public final void zzh(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzk(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zza(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zzb(n3, n15);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void zzi(int n3, List list, boolean n4) {
        int n7;
        int n8;
        if (n4 != 0) {
            void var3_5;
            Object object = this.zza;
            int n10 = 2;
            ((zzii)object).zza(n3, n10);
            zzii zzii2 = null;
            boolean bl2 = false;
            object = null;
            for (n3 = 0; n3 < (n10 = list.size()); ++n3) {
                Boolean bl3 = (Boolean)list.get(n3);
                n10 = zzii.zzb(bl3);
                var3_5 += n10;
            }
            zzii2 = this.zza;
            zzii2.zzb((int)var3_5);
            while (n8 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Boolean)list.get(n8);
                boolean bl4 = (Boolean)object;
                zzii2.zza(bl4);
                ++n8;
            }
            return;
        }
        for (n8 = 0; n8 < (n7 = list.size()); ++n8) {
            zzii zzii3 = this.zza;
            Boolean bl5 = (Boolean)list.get(n8);
            boolean bl6 = bl5;
            zzii3.zza(n3, bl6);
        }
    }

    public final void zzj(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzg(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zzb(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zzc(n3, n15);
        }
    }

    public final void zzk(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzj(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zzd(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zze(n3, n15);
        }
    }

    public final void zzl(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzii.zzh(l2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzii2.zzc(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzii3.zzc(n3, l7);
        }
    }

    public final void zzm(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzii.zzh(n10);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzii2.zzc(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzii3.zzd(n3, n15);
        }
    }

    public final void zzn(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zza;
            int n8 = 2;
            ((zzii)object).zza(n3, n8);
            zzii zzii2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzii.zzf(l2);
                n4 += n8;
            }
            zzii2 = this.zza;
            zzii2.zzb(n4);
            while (n7 < (n3 = list.size())) {
                zzii2 = this.zza;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzii2.zzb(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzii zzii3 = this.zza;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzii3.zzb(n3, l7);
        }
    }
}

