/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhav;
import com.google.android.gms.internal.ads.zzhbf;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhct;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhfi;
import java.util.List;

final class zzhau
implements zzhfi {
    private final zzhat zza;

    private zzhau(zzhat zzhat2) {
        zzhcb.zzc(zzhat2, "output");
        this.zza = zzhat2;
        zzhat2.zze = this;
    }

    public static zzhau zza(zzhat zzhat2) {
        zzhau zzhau2 = zzhat2.zze;
        if (zzhau2 != null) {
            return zzhau2;
        }
        zzhau2 = new zzhau(zzhat2);
        return zzhau2;
    }

    public final void zzA(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhct;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhct)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhct)list).size()); ++n3) {
                    ((zzhct)list).zza(n3);
                    n4 += 8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhct)list).size())) {
                    zzhat2 = this.zza;
                    long l2 = ((zzhct)list).zza(n7);
                    zzhat2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhct)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    long l3 = ((zzhct)list).zza(n7);
                    zzhat3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Long l4 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l7 = (Long)list.get(n3);
                l7.getClass();
                n4 += 8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                l4 = (Long)list.get(n7);
                long l8 = l4;
                zzhat4.zzk(l8);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzhat5.zzj(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzB(int n3, int n4) {
        int n7 = n4 + n4;
        n4 = n4 >> 31 ^ n7;
        this.zza.zzt(n3, n4);
    }

    public final void zzC(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbp;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbp)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbp)list).size()); ++n3) {
                    n8 = ((zzhbp)list).zzd(n3);
                    n10 = n8 + n8;
                    n8 = zzhat.zzD(n8 >> 31 ^ n10);
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbp)list).size())) {
                    zzhat2 = this.zza;
                    n4 = ((zzhbp)list).zzd(n7);
                    n8 = n4 + n4;
                    n4 = n4 >> 31 ^ n8;
                    zzhat2.zzu(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    n8 = ((zzhbp)list).zzd(n7);
                    n10 = n8 + n8;
                    n8 = n8 >> 31 ^ n10;
                    zzhat3.zzt(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = n15;
                n10 = n8 + n8;
                n8 = zzhat.zzD(n8 >> 31 ^ n10);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                n8 = n4 + n4;
                n4 = n4 >> 31 ^ n8;
                zzhat4.zzu(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                n10 = n8 + n8;
                n8 = n8 >> 31 ^ n10;
                zzhat5.zzt(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzD(int n3, long l2) {
        long l3 = l2 + l2;
        l2 = l2 >> 63 ^ l3;
        this.zza.zzv(n3, l2);
    }

    public final void zzE(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhct;
        int n10 = 2;
        int n14 = 63;
        if (n8 != 0) {
            list = (zzhct)list;
            if (n4) {
                long l2;
                long l3;
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var9_10 = null;
                for (n3 = 0; n3 < (n8 = ((zzhct)list).size()); ++n3) {
                    l3 = ((zzhct)list).zza(n3);
                    l2 = l3 + l3;
                    l3 = l3 >> n14 ^ l2;
                    n8 = zzhat.zzE(l3);
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhct)list).size())) {
                    zzhat2 = this.zza;
                    l3 = ((zzhct)list).zza(n7);
                    l2 = l3 + l3;
                    l3 = l3 >> n14 ^ l2;
                    zzhat2.zzw(l3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhct)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    long l4 = ((zzhct)list).zza(n7);
                    long l7 = l4 + l4;
                    l4 = l4 >> n14 ^ l7;
                    zzhat3.zzv(n3, l4);
                }
            }
        } else if (n4) {
            long l8;
            long l12;
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Long l14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l15 = (Long)list.get(n3);
                l12 = l15;
                l8 = l12 + l12;
                l12 = l12 >> n14 ^ l8;
                n8 = zzhat.zzE(l12);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                l14 = (Long)list.get(n7);
                l12 = l14;
                l8 = l12 + l12;
                l12 = l12 >> n14 ^ l8;
                zzhat4.zzw(l12);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Long l16 = (Long)list.get(n7);
                long l17 = l16;
                long l18 = l17 + l17;
                l17 = l17 >> n14 ^ l18;
                zzhat5.zzv(n3, l17);
                ++n7;
            }
        }
    }

    public final void zzF(int n3) {
        this.zza.zzs(n3, 3);
    }

    public final void zzG(int n3, String string2) {
        this.zza.zzq(n3, string2);
    }

    public final void zzH(int n3, List list) {
        int n4;
        int n7 = list instanceof zzhcm;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzhcm)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzhat zzhat2;
                Object object = list2.zze(n4);
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzhat2 = this.zza;
                    object = (String)object;
                    zzhat2.zzq(n3, (String)object);
                    continue;
                }
                zzhat2 = this.zza;
                object = (zzhac)object;
                zzhat2.zzO(n3, (zzhac)object);
            }
        } else {
            while (n4 < (n7 = list.size())) {
                zzhat zzhat3 = this.zza;
                String string2 = (String)list.get(n4);
                zzhat3.zzq(n3, string2);
                ++n4;
            }
        }
    }

    public final void zzI(int n3, int n4) {
        this.zza.zzt(n3, n4);
    }

    public final void zzJ(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbp;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbp)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbp)list).size()); ++n3) {
                    n8 = zzhat.zzD(((zzhbp)list).zzd(n3));
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbp)list).size())) {
                    zzhat2 = this.zza;
                    n4 = ((zzhbp)list).zzd(n7);
                    zzhat2.zzu(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    n8 = ((zzhbp)list).zzd(n7);
                    zzhat3.zzt(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzhat.zzD(n15);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzhat4.zzu(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzhat5.zzt(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzK(int n3, long l2) {
        this.zza.zzv(n3, l2);
    }

    public final void zzL(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhct;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhct)list;
            if (n4) {
                long l2;
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhct)list).size()); ++n3) {
                    l2 = ((zzhct)list).zza(n3);
                    n8 = zzhat.zzE(l2);
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhct)list).size())) {
                    zzhat2 = this.zza;
                    l2 = ((zzhct)list).zza(n7);
                    zzhat2.zzw(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhct)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    long l3 = ((zzhct)list).zza(n7);
                    zzhat3.zzv(n3, l3);
                }
            }
        } else if (n4) {
            long l4;
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzhat.zzE(l4);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzhat4.zzw(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzhat5.zzv(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzb(int n3, boolean bl2) {
        this.zza.zzN(n3, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public final void zzc(int n3, List list, boolean n4) {
        int n7;
        boolean bl2 = list instanceof zzgzp;
        int n8 = 2;
        if (bl2) {
            list = (zzgzp)list;
            if (n4 != 0) {
                void var3_5;
                int n10;
                this.zza.zzs(n3, n8);
                zzhat zzhat2 = null;
                boolean bl3 = false;
                Object var8_21 = null;
                for (n3 = 0; n3 < (n10 = ((zzgzp)list).size()); ++n3) {
                    ((zzgzp)list).zzh(n3);
                    ++var3_5;
                }
                zzhat2 = this.zza;
                zzhat2.zzu((int)var3_5);
                while (n7 < (n3 = ((zzgzp)list).size())) {
                    zzhat2 = this.zza;
                    byte by2 = ((zzgzp)list).zzh(n7);
                    zzhat2.zzM(by2);
                    ++n7;
                }
            } else {
                int n14;
                for (n7 = 0; n7 < (n14 = ((zzgzp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    boolean bl4 = ((zzgzp)list).zzh(n7);
                    zzhat3.zzN(n3, bl4);
                }
            }
        } else if (n4 != 0) {
            void var3_9;
            int n15;
            this.zza.zzs(n3, n8);
            zzhat zzhat4 = null;
            boolean bl5 = false;
            Boolean bl6 = null;
            for (n3 = 0; n3 < (n15 = list.size()); ++n3) {
                Boolean bl7 = (Boolean)list.get(n3);
                bl7.getClass();
                ++var3_9;
            }
            zzhat4 = this.zza;
            zzhat4.zzu((int)var3_9);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                bl6 = (Boolean)list.get(n7);
                byte by4 = bl6.booleanValue();
                zzhat4.zzM(by4);
                ++n7;
            }
        } else {
            int n16;
            while (n7 < (n16 = list.size())) {
                zzhat zzhat5 = this.zza;
                Boolean bl8 = (Boolean)list.get(n7);
                boolean bl9 = bl8;
                zzhat5.zzN(n3, bl9);
                ++n7;
            }
        }
    }

    public final void zzd(int n3, zzhac zzhac2) {
        this.zza.zzO(n3, zzhac2);
    }

    public final void zze(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzhat zzhat2 = this.zza;
            zzhac zzhac2 = (zzhac)list.get(i3);
            zzhat2.zzO(n3, zzhac2);
        }
    }

    public final void zzf(int n3, double d2) {
        zzhat zzhat2 = this.zza;
        long l2 = Double.doubleToRawLongBits(d2);
        zzhat2.zzj(n3, l2);
    }

    public final void zzg(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhav;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhav)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhav)list).size()); ++n3) {
                    ((zzhav)list).zzd(n3);
                    n4 += 8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhav)list).size())) {
                    zzhat2 = this.zza;
                    double d2 = ((zzhav)list).zzd(n7);
                    long l2 = Double.doubleToRawLongBits(d2);
                    zzhat2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhav)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    double d5 = ((zzhav)list).zzd(n7);
                    long l3 = Double.doubleToRawLongBits(d5);
                    zzhat3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Double d7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d9 = (Double)list.get(n3);
                d9.getClass();
                n4 += 8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                d7 = (Double)list.get(n7);
                double d12 = d7;
                long l4 = Double.doubleToRawLongBits(d12);
                zzhat4.zzk(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Double d13 = (Double)list.get(n7);
                double d14 = d13;
                long l7 = Double.doubleToRawLongBits(d14);
                zzhat5.zzj(n3, l7);
                ++n7;
            }
        }
    }

    public final void zzh(int n3) {
        this.zza.zzs(n3, 4);
    }

    public final void zzi(int n3, int n4) {
        this.zza.zzl(n3, n4);
    }

    public final void zzj(int n3, List list, boolean n4) {
        int n7;
        if (n4) {
            Object object = this.zza;
            int n8 = 2;
            ((zzhat)object).zzs(n3, n8);
            zzhat zzhat2 = null;
            n4 = 0;
            object = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n10 = (Integer)list.get(n3);
                long l2 = n10.intValue();
                n8 = zzhat.zzE(l2);
                n4 += n8;
            }
            zzhat2 = this.zza;
            zzhat2.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat2 = this.zza;
                object = (Integer)list.get(n7);
                n4 = (Integer)object;
                zzhat2.zzm(n4);
                ++n7;
            }
        } else {
            for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                zzhat zzhat3 = this.zza;
                Integer n14 = (Integer)list.get(n7);
                int n15 = n14;
                zzhat3.zzl(n3, n15);
            }
        }
    }

    public final void zzk(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zzl(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbp;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbp)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbp)list).size()); ++n3) {
                    ((zzhbp)list).zzd(n3);
                    n4 += 4;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbp)list).size())) {
                    zzhat2 = this.zza;
                    n4 = ((zzhbp)list).zzd(n7);
                    zzhat2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    n8 = ((zzhbp)list).zzd(n7);
                    zzhat3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n15.getClass();
                n4 += 4;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzhat4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzhat5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzm(int n3, long l2) {
        this.zza.zzj(n3, l2);
    }

    public final void zzn(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhct;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhct)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhct)list).size()); ++n3) {
                    ((zzhct)list).zza(n3);
                    n4 += 8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhct)list).size())) {
                    zzhat2 = this.zza;
                    long l2 = ((zzhct)list).zza(n7);
                    zzhat2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhct)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    long l3 = ((zzhct)list).zza(n7);
                    zzhat3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Long l4 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l7 = (Long)list.get(n3);
                l7.getClass();
                n4 += 8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                l4 = (Long)list.get(n7);
                long l8 = l4;
                zzhat4.zzk(l8);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzhat5.zzj(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzo(int n3, float f5) {
        zzhat zzhat2 = this.zza;
        int n4 = Float.floatToRawIntBits(f5);
        zzhat2.zzh(n3, n4);
    }

    public final void zzp(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbf;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbf)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                float f5 = 0.0f;
                Object var9_11 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbf)list).size()); ++n3) {
                    ((zzhbf)list).zzd(n3);
                    n4 += 4;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbf)list).size())) {
                    zzhat2 = this.zza;
                    f5 = ((zzhbf)list).zzd(n7);
                    n4 = Float.floatToRawIntBits(f5);
                    zzhat2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbf)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    float f6 = ((zzhbf)list).zzd(n7);
                    n8 = Float.floatToRawIntBits(f6);
                    zzhat3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            float f7 = 0.0f;
            Float f8 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f11 = (Float)list.get(n3);
                f11.getClass();
                n4 += 4;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                f8 = (Float)list.get(n7);
                f7 = f8.floatValue();
                n4 = Float.floatToRawIntBits(f7);
                zzhat4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Float f12 = (Float)list.get(n7);
                float f14 = f12.floatValue();
                n8 = Float.floatToRawIntBits(f14);
                zzhat5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzq(int n3, Object object, zzhdz zzhdz2) {
        object = (zzhde)object;
        zzhat zzhat2 = this.zza;
        zzhat2.zzs(n3, 3);
        zzhau zzhau2 = zzhat2.zze;
        zzhdz2.zzj(object, zzhau2);
        zzhat2.zzs(n3, 4);
    }

    public final void zzr(int n3, int n4) {
        this.zza.zzl(n3, n4);
    }

    public final void zzs(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbp;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbp)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbp)list).size()); ++n3) {
                    long l2 = ((zzhbp)list).zzd(n3);
                    n8 = zzhat.zzE(l2);
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbp)list).size())) {
                    zzhat2 = this.zza;
                    n4 = ((zzhbp)list).zzd(n7);
                    zzhat2.zzm(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    n8 = ((zzhbp)list).zzd(n7);
                    zzhat3.zzl(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                long l3 = n15.intValue();
                n8 = zzhat.zzE(l3);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzhat4.zzm(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzhat5.zzl(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzt(int n3, long l2) {
        this.zza.zzv(n3, l2);
    }

    public final void zzu(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhct;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhct)list;
            if (n4) {
                long l2;
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhct)list).size()); ++n3) {
                    l2 = ((zzhct)list).zza(n3);
                    n8 = zzhat.zzE(l2);
                    n4 += n8;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhct)list).size())) {
                    zzhat2 = this.zza;
                    l2 = ((zzhct)list).zza(n7);
                    zzhat2.zzw(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhct)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    long l3 = ((zzhct)list).zza(n7);
                    zzhat3.zzv(n3, l3);
                }
            }
        } else if (n4) {
            long l4;
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzhat.zzE(l4);
                n4 += n8;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzhat4.zzw(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzhat5.zzv(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzv(int n3, Object object, zzhdz zzhdz2) {
        object = (zzhde)object;
        this.zza.zzn(n3, (zzhde)object, zzhdz2);
    }

    public final void zzw(int n3, Object object) {
        boolean bl2 = object instanceof zzhac;
        if (bl2) {
            zzhat zzhat2 = this.zza;
            object = (zzhac)object;
            zzhat2.zzp(n3, (zzhac)object);
            return;
        }
        zzhat zzhat3 = this.zza;
        object = (zzhde)object;
        zzhat3.zzo(n3, (zzhde)object);
    }

    public final void zzx(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zzy(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzhbp;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzhbp)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzhat zzhat2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzhbp)list).size()); ++n3) {
                    ((zzhbp)list).zzd(n3);
                    n4 += 4;
                }
                zzhat2 = this.zza;
                zzhat2.zzu(n4);
                while (n7 < (n3 = ((zzhbp)list).size())) {
                    zzhat2 = this.zza;
                    n4 = ((zzhbp)list).zzd(n7);
                    zzhat2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzhbp)list).size()); ++n7) {
                    zzhat zzhat3 = this.zza;
                    n8 = ((zzhbp)list).zzd(n7);
                    zzhat3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzhat zzhat4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n15.getClass();
                n4 += 4;
            }
            zzhat4 = this.zza;
            zzhat4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzhat4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzhat4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzhat zzhat5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzhat5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzz(int n3, long l2) {
        this.zza.zzj(n3, l2);
    }
}

