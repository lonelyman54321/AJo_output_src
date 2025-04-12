/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzdg;
import com.google.android.gms.internal.clearcut.zzdh;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzfr;
import java.util.List;
import java.util.Map;

final class zzbp
implements zzfr {
    private final zzbn zzfo;

    private zzbp(zzbn zzbn2) {
        this.zzfo = zzbn2 = (zzbn)zzci.zza((Object)zzbn2, "output");
        zzbn2.zzfz = this;
    }

    public static zzbp zza(zzbn zzbn2) {
        zzbp zzbp2 = zzbn2.zzfz;
        if (zzbp2 != null) {
            return zzbp2;
        }
        zzbp2 = new zzbp(zzbn2);
        return zzbp2;
    }

    public final void zza(int n3, double d2) {
        this.zzfo.zza(n3, d2);
    }

    public final void zza(int n3, float f5) {
        this.zzfo.zza(n3, f5);
    }

    public final void zza(int n3, long l2) {
        this.zzfo.zza(n3, l2);
    }

    public final void zza(int n3, zzbb zzbb2) {
        this.zzfo.zza(n3, zzbb2);
    }

    public final void zza(int n3, zzdh zzdh2, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            this.zzfo.zzb(n3, 2);
            zzbn zzbn2 = this.zzfo;
            Object k2 = entry.getKey();
            Object v4 = entry.getValue();
            int n4 = zzdg.zza(zzdh2, k2, v4);
            zzbn2.zzo(n4);
            zzbn2 = this.zzfo;
            k2 = entry.getKey();
            entry = entry.getValue();
            zzdg.zza(zzbn2, zzdh2, k2, entry);
        }
    }

    public final void zza(int n3, Object object) {
        boolean bl2 = object instanceof zzbb;
        if (bl2) {
            zzbn zzbn2 = this.zzfo;
            object = (zzbb)object;
            zzbn2.zzb(n3, (zzbb)object);
            return;
        }
        zzbn zzbn3 = this.zzfo;
        object = (zzdo)object;
        zzbn3.zzb(n3, (zzdo)object);
    }

    public final void zza(int n3, Object object, zzef zzef2) {
        zzbn zzbn2 = this.zzfo;
        object = (zzdo)object;
        zzbn2.zza(n3, (zzdo)object, zzef2);
    }

    public final void zza(int n3, String string2) {
        this.zzfo.zza(n3, string2);
    }

    public final void zza(int n3, List list) {
        int n4;
        int n7 = list instanceof zzcx;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzcx)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzbn zzbn2;
                Object object = list2.getRaw(n4);
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzbn2 = this.zzfo;
                    object = (String)object;
                    zzbn2.zza(n3, (String)object);
                    continue;
                }
                zzbn2 = this.zzfo;
                object = (zzbb)object;
                zzbn2.zza(n3, (zzbb)object);
            }
            return;
        }
        while (n4 < (n7 = list.size())) {
            zzbn zzbn3 = this.zzfo;
            String string2 = (String)list.get(n4);
            zzbn3.zza(n3, string2);
            ++n4;
        }
    }

    public final void zza(int n3, List list, zzef zzef2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zza(n3, e2, zzef2);
        }
    }

    public final void zza(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzs(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzn(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zzc(n3, n15);
        }
    }

    public final void zzaa(int n3) {
        this.zzfo.zzb(n3, 3);
    }

    public final void zzab(int n3) {
        this.zzfo.zzb(n3, 4);
    }

    public final int zzaj() {
        return zzcg$zzg.zzko;
    }

    public final void zzb(int n3, long l2) {
        this.zzfo.zzb(n3, l2);
    }

    public final void zzb(int n3, Object object, zzef zzef2) {
        zzbn zzbn2 = this.zzfo;
        object = (zzdo)object;
        zzbn2.zzb(n3, 3);
        zzbp zzbp2 = zzbn2.zzfz;
        zzef2.zza(object, zzbp2);
        zzbn2.zzb(n3, 4);
    }

    public final void zzb(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzbn zzbn2 = this.zzfo;
            zzbb zzbb2 = (zzbb)list.get(i3);
            zzbn2.zza(n3, zzbb2);
        }
    }

    public final void zzb(int n3, List list, zzef zzef2) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Object e2 = list.get(i3);
            this.zzb(n3, e2, zzef2);
        }
    }

    public final void zzb(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzv(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzq(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zzf(n3, n15);
        }
    }

    public final void zzb(int n3, boolean bl2) {
        this.zzfo.zzb(n3, bl2);
    }

    public final void zzc(int n3, int n4) {
        this.zzfo.zzc(n3, n4);
    }

    public final void zzc(int n3, long l2) {
        this.zzfo.zzc(n3, l2);
    }

    public final void zzc(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzbn.zze(l2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzbn2.zzb(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzbn3.zza(n3, l7);
        }
    }

    public final void zzd(int n3, int n4) {
        this.zzfo.zzd(n3, n4);
    }

    public final void zzd(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzbn.zzf(l2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzbn2.zzb(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzbn3.zza(n3, l7);
        }
    }

    public final void zze(int n3, int n4) {
        this.zzfo.zze(n3, n4);
    }

    public final void zze(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzbn.zzh(l2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzbn2.zzd(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzbn3.zzc(n3, l7);
        }
    }

    public final void zzf(int n3, int n4) {
        this.zzfo.zzf(n3, n4);
    }

    public final void zzf(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            float f5 = 2.8E-45f;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            float f6 = 0.0f;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f7 = (Float)list.get(n3);
                f5 = f7.floatValue();
                n8 = zzbn.zzb(f5);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Float)list.get(n7);
                f6 = ((Float)object).floatValue();
                zzbn2.zza(f6);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Float f8 = (Float)list.get(n7);
            float f11 = f8.floatValue();
            zzbn3.zza(n3, f11);
        }
    }

    public final void zzg(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            double d2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d5 = (Double)list.get(n3);
                d2 = d5;
                n8 = zzbn.zzb(d2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Double)list.get(n7);
                d2 = (Double)object;
                zzbn2.zza(d2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Double d7 = (Double)list.get(n7);
            double d9 = d7;
            zzbn3.zza(n3, d9);
        }
    }

    public final void zzh(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzx(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzn(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zzc(n3, n15);
        }
    }

    public final void zzi(int n3, long l2) {
        this.zzfo.zza(n3, l2);
    }

    /*
     * WARNING - void declaration
     */
    public final void zzi(int n3, List list, boolean n4) {
        int n7;
        int n8;
        if (n4 != 0) {
            void var3_5;
            Object object = this.zzfo;
            int n10 = 2;
            ((zzbn)object).zzb(n3, n10);
            zzbn zzbn2 = null;
            boolean bl2 = false;
            object = null;
            for (n3 = 0; n3 < (n10 = list.size()); ++n3) {
                Boolean bl3 = (Boolean)list.get(n3);
                n10 = zzbn.zzb(bl3);
                var3_5 += n10;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo((int)var3_5);
            while (n8 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Boolean)list.get(n8);
                boolean bl4 = (Boolean)object;
                zzbn2.zza(bl4);
                ++n8;
            }
            return;
        }
        for (n8 = 0; n8 < (n7 = list.size()); ++n8) {
            zzbn zzbn3 = this.zzfo;
            Boolean bl5 = (Boolean)list.get(n8);
            boolean bl6 = bl5;
            zzbn3.zzb(n3, bl6);
        }
    }

    public final void zzj(int n3, long l2) {
        this.zzfo.zzc(n3, l2);
    }

    public final void zzj(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzt(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzo(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zzd(n3, n15);
        }
    }

    public final void zzk(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzw(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzq(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zzf(n3, n15);
        }
    }

    public final void zzl(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzbn.zzi(l2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzbn2.zzd(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzbn3.zzc(n3, l7);
        }
    }

    public final void zzm(int n3, int n4) {
        this.zzfo.zzf(n3, n4);
    }

    public final void zzm(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                n8 = zzbn.zzu(n10);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzbn2.zzp(n4);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Integer n14 = (Integer)list.get(n7);
            int n15 = n14;
            zzbn3.zze(n3, n15);
        }
    }

    public final void zzn(int n3, int n4) {
        this.zzfo.zzc(n3, n4);
    }

    public final void zzn(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            long l2;
            Object object = this.zzfo;
            int n8 = 2;
            ((zzbn)object).zzb(n3, n8);
            zzbn zzbn2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l3 = (Long)list.get(n3);
                l2 = l3;
                n8 = zzbn.zzg(l2);
                n4 += n8;
            }
            zzbn2 = this.zzfo;
            zzbn2.zzo(n4);
            while (n7 < (n3 = list.size())) {
                zzbn2 = this.zzfo;
                object = (Long)list.get(n7);
                l2 = (Long)object;
                zzbn2.zzc(l2);
                ++n7;
            }
            return;
        }
        for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
            zzbn zzbn3 = this.zzfo;
            Long l4 = (Long)list.get(n7);
            long l7 = l4;
            zzbn3.zzb(n3, l7);
        }
    }
}

