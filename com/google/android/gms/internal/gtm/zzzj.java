/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabn;
import com.google.android.gms.internal.gtm.zzabx;
import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzacx;
import com.google.android.gms.internal.gtm.zzada;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyo;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzi;
import java.util.List;

final class zzzj
implements zzaez {
    private final zzzi zza;

    private zzzj(zzzi zzzi2) {
        this.zza = zzzi2;
        zzzi2.zze = this;
    }

    public static zzzj zza(zzzi zzzi2) {
        zzzj zzzj2 = zzzi2.zze;
        if (zzzj2 != null) {
            return zzzj2;
        }
        zzzj2 = new zzzj(zzzi2);
        return zzzj2;
    }

    public final void zzA(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzada;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzada)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzada)list).size()); ++n3) {
                    ((zzada)list).zze(n3);
                    n4 += 8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzada)list).size())) {
                    zzzi2 = this.zza;
                    long l2 = ((zzada)list).zze(n7);
                    zzzi2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzada)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    long l3 = ((zzada)list).zze(n7);
                    zzzi3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Long l4 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l7 = (Long)list.get(n3);
                l7.getClass();
                n4 += 8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                l4 = (Long)list.get(n7);
                long l8 = l4;
                zzzi4.zzk(l8);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzzi5.zzj(n3, l14);
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
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    n8 = ((zzacg)list).zze(n3);
                    n10 = n8 + n8;
                    n8 = zzzi.zzC(n8 >> 31 ^ n10);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    n8 = n4 + n4;
                    n4 = n4 >> 31 ^ n8;
                    zzzi2.zzu(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    n10 = n8 + n8;
                    n8 = n8 >> 31 ^ n10;
                    zzzi3.zzt(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = n15;
                n10 = n8 + n8;
                n8 = zzzi.zzC(n8 >> 31 ^ n10);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                n8 = n4 + n4;
                n4 = n4 >> 31 ^ n8;
                zzzi4.zzu(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                n10 = n8 + n8;
                n8 = n8 >> 31 ^ n10;
                zzzi5.zzt(n3, n8);
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
        int n8 = list instanceof zzada;
        int n10 = 2;
        int n14 = 63;
        if (n8 != 0) {
            list = (zzada)list;
            if (n4) {
                long l2;
                long l3;
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var9_10 = null;
                for (n3 = 0; n3 < (n8 = ((zzada)list).size()); ++n3) {
                    l3 = ((zzada)list).zze(n3);
                    l2 = l3 + l3;
                    l3 = l3 >> n14 ^ l2;
                    n8 = zzzi.zzD(l3);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzada)list).size())) {
                    zzzi2 = this.zza;
                    l3 = ((zzada)list).zze(n7);
                    l2 = l3 + l3;
                    l3 = l3 >> n14 ^ l2;
                    zzzi2.zzw(l3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzada)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    long l4 = ((zzada)list).zze(n7);
                    long l7 = l4 + l4;
                    l4 = l4 >> n14 ^ l7;
                    zzzi3.zzv(n3, l4);
                }
            }
        } else if (n4) {
            long l8;
            long l12;
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Long l14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l15 = (Long)list.get(n3);
                l12 = l15;
                l8 = l12 + l12;
                l12 = l12 >> n14 ^ l8;
                n8 = zzzi.zzD(l12);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                l14 = (Long)list.get(n7);
                l12 = l14;
                l8 = l12 + l12;
                l12 = l12 >> n14 ^ l8;
                zzzi4.zzw(l12);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Long l16 = (Long)list.get(n7);
                long l17 = l16;
                long l18 = l17 + l17;
                l17 = l17 >> n14 ^ l18;
                zzzi5.zzv(n3, l17);
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
        int n7 = list instanceof zzacx;
        if (n7 != 0) {
            int n8;
            List list2 = list;
            list2 = (zzacx)list;
            for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                zzzi zzzi2;
                Object object = list2.zzb();
                boolean bl2 = object instanceof String;
                if (bl2) {
                    zzzi2 = this.zza;
                    object = (String)object;
                    zzzi2.zzq(n3, (String)object);
                    continue;
                }
                zzzi2 = this.zza;
                object = (zzyx)object;
                zzzi2.zzL(n3, (zzyx)object);
            }
        } else {
            while (n4 < (n7 = list.size())) {
                zzzi zzzi3 = this.zza;
                String string2 = (String)list.get(n4);
                zzzi3.zzq(n3, string2);
                ++n4;
            }
        }
    }

    public final void zzI(int n3, int n4) {
        this.zza.zzt(n3, n4);
    }

    public final void zzJ(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    n8 = zzzi.zzC(((zzacg)list).zze(n3));
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    zzzi2.zzu(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    zzzi3.zzt(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n8 = zzzi.zzC(n15);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzzi4.zzu(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzzi5.zzt(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzK(int n3, long l2) {
        this.zza.zzv(n3, l2);
    }

    public final void zzL(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzada;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzada)list;
            if (n4) {
                long l2;
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzada)list).size()); ++n3) {
                    l2 = ((zzada)list).zze(n3);
                    n8 = zzzi.zzD(l2);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzada)list).size())) {
                    zzzi2 = this.zza;
                    l2 = ((zzada)list).zze(n7);
                    zzzi2.zzw(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzada)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    long l3 = ((zzada)list).zze(n7);
                    zzzi3.zzv(n3, l3);
                }
            }
        } else if (n4) {
            long l4;
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzzi.zzD(l4);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzzi4.zzw(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzzi5.zzv(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzb(int n3, boolean bl2) {
        this.zza.zzK(n3, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public final void zzc(int n3, List list, boolean n4) {
        int n7;
        boolean bl2 = list instanceof zzyo;
        int n8 = 2;
        if (bl2) {
            list = (zzyo)list;
            if (n4 != 0) {
                void var3_5;
                int n10;
                this.zza.zzs(n3, n8);
                zzzi zzzi2 = null;
                boolean bl3 = false;
                Object var8_21 = null;
                for (n3 = 0; n3 < (n10 = ((zzyo)list).size()); ++n3) {
                    ((zzyo)list).zzf(n3);
                    ++var3_5;
                }
                zzzi2 = this.zza;
                zzzi2.zzu((int)var3_5);
                while (n7 < (n3 = ((zzyo)list).size())) {
                    zzzi2 = this.zza;
                    byte by2 = ((zzyo)list).zzf(n7);
                    zzzi2.zzJ(by2);
                    ++n7;
                }
            } else {
                int n14;
                for (n7 = 0; n7 < (n14 = ((zzyo)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    boolean bl4 = ((zzyo)list).zzf(n7);
                    zzzi3.zzK(n3, bl4);
                }
            }
        } else if (n4 != 0) {
            void var3_9;
            int n15;
            this.zza.zzs(n3, n8);
            zzzi zzzi4 = null;
            boolean bl5 = false;
            Boolean bl6 = null;
            for (n3 = 0; n3 < (n15 = list.size()); ++n3) {
                Boolean bl7 = (Boolean)list.get(n3);
                bl7.getClass();
                ++var3_9;
            }
            zzzi4 = this.zza;
            zzzi4.zzu((int)var3_9);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                bl6 = (Boolean)list.get(n7);
                byte by4 = bl6.booleanValue();
                zzzi4.zzJ(by4);
                ++n7;
            }
        } else {
            int n16;
            while (n7 < (n16 = list.size())) {
                zzzi zzzi5 = this.zza;
                Boolean bl8 = (Boolean)list.get(n7);
                boolean bl9 = bl8;
                zzzi5.zzK(n3, bl9);
                ++n7;
            }
        }
    }

    public final void zzd(int n3, zzyx zzyx2) {
        this.zza.zzL(n3, zzyx2);
    }

    public final void zze(int n3, List list) {
        int n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            zzzi zzzi2 = this.zza;
            zzyx zzyx2 = (zzyx)list.get(i3);
            zzzi2.zzL(n3, zzyx2);
        }
    }

    public final void zzf(int n3, double d2) {
        zzzi zzzi2 = this.zza;
        long l2 = Double.doubleToRawLongBits(d2);
        zzzi2.zzj(n3, l2);
    }

    public final void zzg(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzabn;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzabn)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzabn)list).size()); ++n3) {
                    ((zzabn)list).zze(n3);
                    n4 += 8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzabn)list).size())) {
                    zzzi2 = this.zza;
                    double d2 = ((zzabn)list).zze(n7);
                    long l2 = Double.doubleToRawLongBits(d2);
                    zzzi2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzabn)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    double d5 = ((zzabn)list).zze(n7);
                    long l3 = Double.doubleToRawLongBits(d5);
                    zzzi3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Double d7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Double d9 = (Double)list.get(n3);
                d9.getClass();
                n4 += 8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                d7 = (Double)list.get(n7);
                double d12 = d7;
                long l4 = Double.doubleToRawLongBits(d12);
                zzzi4.zzk(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Double d13 = (Double)list.get(n7);
                double d14 = d13;
                long l7 = Double.doubleToRawLongBits(d14);
                zzzi5.zzj(n3, l7);
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
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    long l2 = ((zzacg)list).zze(n3);
                    n8 = zzzi.zzD(l2);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    zzzi2.zzm(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    zzzi3.zzl(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                long l3 = n15.intValue();
                n8 = zzzi.zzD(l3);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzzi4.zzm(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzzi5.zzl(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzk(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zzl(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    ((zzacg)list).zze(n3);
                    n4 += 4;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    zzzi2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    zzzi3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n15.getClass();
                n4 += 4;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzzi4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzzi5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzm(int n3, long l2) {
        this.zza.zzj(n3, l2);
    }

    public final void zzn(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzada;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzada)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzada)list).size()); ++n3) {
                    ((zzada)list).zze(n3);
                    n4 += 8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzada)list).size())) {
                    zzzi2 = this.zza;
                    long l2 = ((zzada)list).zze(n7);
                    zzzi2.zzk(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzada)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    long l3 = ((zzada)list).zze(n7);
                    zzzi3.zzj(n3, l3);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Long l4 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l7 = (Long)list.get(n3);
                l7.getClass();
                n4 += 8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                l4 = (Long)list.get(n7);
                long l8 = l4;
                zzzi4.zzk(l8);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzzi5.zzj(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzo(int n3, float f5) {
        zzzi zzzi2 = this.zza;
        int n4 = Float.floatToRawIntBits(f5);
        zzzi2.zzh(n3, n4);
    }

    public final void zzp(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzabx;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzabx)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                float f5 = 0.0f;
                Object var9_11 = null;
                for (n3 = 0; n3 < (n8 = ((zzabx)list).size()); ++n3) {
                    ((zzabx)list).zze(n3);
                    n4 += 4;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzabx)list).size())) {
                    zzzi2 = this.zza;
                    f5 = ((zzabx)list).zze(n7);
                    n4 = Float.floatToRawIntBits(f5);
                    zzzi2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzabx)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    float f6 = ((zzabx)list).zze(n7);
                    n8 = Float.floatToRawIntBits(f6);
                    zzzi3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            float f7 = 0.0f;
            Float f8 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Float f11 = (Float)list.get(n3);
                f11.getClass();
                n4 += 4;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                f8 = (Float)list.get(n7);
                f7 = f8.floatValue();
                n4 = Float.floatToRawIntBits(f7);
                zzzi4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Float f12 = (Float)list.get(n7);
                float f14 = f12.floatValue();
                n8 = Float.floatToRawIntBits(f14);
                zzzi5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzq(int n3, Object object, zzadx zzadx2) {
        object = (zzadl)object;
        zzzi zzzi2 = this.zza;
        zzzi2.zzs(n3, 3);
        zzzj zzzj2 = zzzi2.zze;
        zzadx2.zzj(object, zzzj2);
        zzzi2.zzs(n3, 4);
    }

    public final void zzr(int n3, int n4) {
        this.zza.zzl(n3, n4);
    }

    public final void zzs(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    long l2 = ((zzacg)list).zze(n3);
                    n8 = zzzi.zzD(l2);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    zzzi2.zzm(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    zzzi3.zzl(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                long l3 = n15.intValue();
                n8 = zzzi.zzD(l3);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzzi4.zzm(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzzi5.zzl(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzt(int n3, long l2) {
        this.zza.zzv(n3, l2);
    }

    public final void zzu(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzada;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzada)list;
            if (n4) {
                long l2;
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzada)list).size()); ++n3) {
                    l2 = ((zzada)list).zze(n3);
                    n8 = zzzi.zzD(l2);
                    n4 += n8;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzada)list).size())) {
                    zzzi2 = this.zza;
                    l2 = ((zzada)list).zze(n7);
                    zzzi2.zzw(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzada)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    long l3 = ((zzada)list).zze(n7);
                    zzzi3.zzv(n3, l3);
                }
            }
        } else if (n4) {
            long l4;
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Long l7 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Long l8 = (Long)list.get(n3);
                l4 = l8;
                n8 = zzzi.zzD(l4);
                n4 += n8;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                l7 = (Long)list.get(n7);
                l4 = l7;
                zzzi4.zzw(l4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Long l12 = (Long)list.get(n7);
                long l14 = l12;
                zzzi5.zzv(n3, l14);
                ++n7;
            }
        }
    }

    public final void zzv(int n3, Object object, zzadx zzadx2) {
        object = (zzadl)object;
        this.zza.zzn(n3, (zzadl)object, zzadx2);
    }

    public final void zzw(int n3, Object object) {
        boolean bl2 = object instanceof zzyx;
        if (bl2) {
            zzzi zzzi2 = this.zza;
            object = (zzyx)object;
            zzzi2.zzp(n3, (zzyx)object);
            return;
        }
        zzzi zzzi3 = this.zza;
        object = (zzadl)object;
        zzzi3.zzo(n3, (zzadl)object);
    }

    public final void zzx(int n3, int n4) {
        this.zza.zzh(n3, n4);
    }

    public final void zzy(int n3, List list, boolean n4) {
        int n7;
        int n8 = list instanceof zzacg;
        int n10 = 2;
        if (n8 != 0) {
            list = (zzacg)list;
            if (n4) {
                this.zza.zzs(n3, n10);
                zzzi zzzi2 = null;
                n4 = 0;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = ((zzacg)list).size()); ++n3) {
                    ((zzacg)list).zze(n3);
                    n4 += 4;
                }
                zzzi2 = this.zza;
                zzzi2.zzu(n4);
                while (n7 < (n3 = ((zzacg)list).size())) {
                    zzzi2 = this.zza;
                    n4 = ((zzacg)list).zze(n7);
                    zzzi2.zzi(n4);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = ((zzacg)list).size()); ++n7) {
                    zzzi zzzi3 = this.zza;
                    n8 = ((zzacg)list).zze(n7);
                    zzzi3.zzh(n3, n8);
                }
            }
        } else if (n4) {
            this.zza.zzs(n3, n10);
            zzzi zzzi4 = null;
            n4 = 0;
            Integer n14 = null;
            for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                Integer n15 = (Integer)list.get(n3);
                n15.getClass();
                n4 += 4;
            }
            zzzi4 = this.zza;
            zzzi4.zzu(n4);
            while (n7 < (n3 = list.size())) {
                zzzi4 = this.zza;
                n14 = (Integer)list.get(n7);
                n4 = n14;
                zzzi4.zzi(n4);
                ++n7;
            }
        } else {
            while (n7 < (n4 = list.size())) {
                zzzi zzzi5 = this.zza;
                Integer n16 = (Integer)list.get(n7);
                n8 = n16;
                zzzi5.zzh(n3, n8);
                ++n7;
            }
        }
    }

    public final void zzz(int n3, long l2) {
        this.zza.zzj(n3, l2);
    }
}

