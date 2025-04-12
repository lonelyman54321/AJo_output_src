/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzvo;

final class zzpc {
    final /* synthetic */ zzpd zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvo zze;
    private boolean zzf;
    private boolean zzg;

    public zzpc(zzpd zzpd2, String string2, int n3, zzvo zzvo2) {
        boolean bl2;
        this.zza = zzpd2;
        this.zzb = string2;
        this.zzc = n3;
        long l2 = zzvo2 == null ? (long)-1 : zzvo2.zzd;
        this.zzd = l2;
        if (zzvo2 != null && (bl2 = zzvo2.zzb())) {
            this.zze = zzvo2;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(zzpc zzpc2) {
        return zzpc2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzpc zzpc2) {
        return zzpc2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzvo zzc(zzpc zzpc2) {
        return zzpc2.zze;
    }

    public static /* bridge */ /* synthetic */ String zzd(zzpc zzpc2) {
        return zzpc2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zze(zzpc zzpc2, boolean bl2) {
        zzpc2.zzg = true;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzpc zzpc2, boolean bl2) {
        zzpc2.zzf = true;
    }

    public static /* bridge */ /* synthetic */ boolean zzh(zzpc zzpc2) {
        return zzpc2.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzi(zzpc zzpc2) {
        return zzpc2.zzf;
    }

    public final void zzg(int n3, zzvo zzvo2) {
        zzpd zzpd2;
        long l2;
        long l3;
        long l4;
        int n4;
        long l7 = this.zzd;
        long l8 = -1;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object == false && n3 == (n4 = this.zzc) && zzvo2 != null && (l4 = (l3 = (l7 = zzvo2.zzd) - (l2 = zzpd.zza(zzpd2 = this.zza))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            this.zzd = l7;
        }
    }

    public final boolean zzj(int n3, zzvo zzvo2) {
        int n4;
        int n7;
        int n8;
        boolean bl2 = true;
        if (zzvo2 == null) {
            int n10 = this.zzc;
            if (n3 == n10) {
                return bl2;
            }
            return false;
        }
        zzvo zzvo3 = this.zze;
        if (zzvo3 == null) {
            long l2;
            long l3;
            long l4;
            long l7;
            n3 = (int)(zzvo2.zzb() ? 1 : 0);
            if (n3 == 0 && (l7 = (l4 = (l3 = zzvo2.zzd) - (l2 = this.zzd)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                return bl2;
            }
            return false;
        }
        long l8 = zzvo2.zzd;
        long l12 = zzvo3.zzd;
        long l14 = l8 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object == false && (n8 = zzvo2.zzb) == (n7 = zzvo3.zzb) && (n4 = zzvo2.zzc) == (n3 = zzvo3.zzc)) {
            return bl2;
        }
        return false;
    }

    public final boolean zzk(zzmy object) {
        Object object2 = ((zzmy)object).zzd;
        boolean bl2 = true;
        if (object2 == null) {
            int n3 = this.zzc;
            int n4 = ((zzmy)object).zzc;
            if (n3 != n4) {
                return bl2;
            }
            return false;
        }
        long l2 = this.zzd;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 == false) {
            return false;
        }
        l3 = ((zzvo)object2).zzd;
        long l7 = l3 - l2;
        object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 > 0) {
            return bl2;
        }
        Object object4 = this.zze;
        if (object4 == null) {
            return false;
        }
        object4 = ((zzmy)object).zzb;
        object2 = ((zzvo)object2).zza;
        int n7 = ((zzdc)object4).zza(object2);
        Object object5 = this.zze.zza;
        int n8 = ((zzdc)object4).zza(object5);
        object5 = ((zzmy)object).zzd;
        l3 = ((zzvo)object5).zzd;
        zzvo zzvo2 = this.zze;
        long l8 = zzvo2.zzd;
        long l12 = l3 - l8;
        Object object6 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object6 >= 0 && n7 >= n8) {
            if (n7 > n8) {
                return bl2;
            }
            n7 = (int)(((zzvo)object5).zzb() ? 1 : 0);
            if (n7 != 0) {
                object = ((zzmy)object).zzd;
                n7 = ((zzvo)object).zzb;
                int n10 = ((zzvo)object).zzc;
                object4 = this.zze;
                int n14 = ((zzvo)object4).zzb;
                if (n7 <= n14) {
                    if (n7 == n14) {
                        n7 = ((zzvo)object4).zzc;
                        if (n10 <= n7) {
                            return false;
                        }
                    } else {
                        bl2 = false;
                    }
                }
                return bl2;
            }
            object = ((zzmy)object).zzd;
            int n15 = ((zzvo)object).zze;
            n7 = -1;
            if (n15 != n7) {
                object2 = this.zze;
                n7 = ((zzvo)object2).zzb;
                if (n15 <= n7) {
                    return false;
                }
            }
            return bl2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean zzl(zzdc var1_1, zzdc var2_2) {
        var3_3 = this.zzc;
        var4_4 = var1_1.zzc();
        var5_5 = -1;
        if (var3_3 >= var4_4) {
            var6_6 = var2_2.zzc();
            if (var3_3 >= var6_6) {
                while (true) {
                    var3_3 = -1;
                    break;
                }
            }
        } else {
            var7_7 = zzpd.zzc(this.zza);
            var8_8 = 0L;
            var1_1.zze(var3_3, (zzdb)var7_7, var8_8);
            var10_9 = zzpd.zzc(this.zza);
            var3_3 = var10_9.zzp;
            while (true) {
                var7_7 = zzpd.zzc(this.zza);
                if (var3_3 > (var4_4 = var7_7.zzq)) ** continue;
                var7_7 = var1_1.zzf(var3_3);
                var4_4 = var2_2.zza(var7_7);
                if (var4_4 != var5_5) {
                    var1_1 = zzpd.zzb(this.zza);
                    var1_1 = var2_2.zzd(var4_4, (zzcz)var1_1, false);
                    var3_3 = var1_1.zzd;
                    break;
                }
                ++var3_3;
            }
        }
        this.zzc = var3_3;
        if (var3_3 == var5_5) {
            return false;
        }
        var1_1 = this.zze;
        var3_3 = 1;
        if (var1_1 == null) {
            return (boolean)var3_3;
        }
        var1_1 = var1_1.zza;
        var6_6 = var2_2.zza(var1_1);
        if (var6_6 != var5_5) {
            return (boolean)var3_3;
        }
        return false;
    }
}

