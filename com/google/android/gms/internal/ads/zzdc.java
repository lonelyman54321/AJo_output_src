/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzcx;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzn;

public abstract class zzdc {
    public static final zzdc zza;
    public static final zzn zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        Object object = new zzcx();
        zza = object;
        int n3 = 36;
        zzc = Integer.toString(0, n3);
        zzd = Integer.toString(1, n3);
        zze = Integer.toString(2, n3);
        zzb = object = new zzcw();
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzdc;
        if (n4 == 0) {
            return false;
        }
        n4 = ((zzdc)(object = (zzdc)object)).zzc();
        if (n4 == (n3 = this.zzc()) && (n4 = ((zzdc)object).zzb()) == (n3 = this.zzb())) {
            int n7;
            int n8;
            zzdb zzdb2 = new zzdb();
            zzcz zzcz2 = new zzcz();
            Object object2 = new zzdb();
            zzcz zzcz3 = new zzcz();
            zzcz zzcz4 = null;
            for (int i3 = 0; i3 < (n8 = this.zzc()); ++i3) {
                zzdb zzdb3;
                long l2 = 0L;
                zzdb zzdb4 = this.zze(i3, zzdb2, l2);
                n8 = (int)(zzdb4.equals(zzdb3 = ((zzdc)object).zze(i3, (zzdb)object2, l2)) ? 1 : 0);
                if (n8 != 0) continue;
                return false;
            }
            zzdb2 = null;
            for (n4 = 0; n4 < (n7 = this.zzb()); ++n4) {
                object2 = this.zzd(n4, zzcz2, bl2);
                n7 = (int)(((zzcz)object2).equals(zzcz4 = ((zzdc)object).zzd(n4, zzcz3, bl2)) ? 1 : 0);
                if (n7 != 0) continue;
                return false;
            }
            n4 = this.zzg(bl2);
            if (n4 != (n3 = ((zzdc)object).zzg(bl2))) {
                return false;
            }
            n3 = this.zzh(bl2);
            if (n3 == (n7 = ((zzdc)object).zzh(bl2))) {
                while (n4 != n3) {
                    n7 = this.zzj(n4, 0, bl2);
                    if (n7 == (n4 = ((zzdc)object).zzj(n4, 0, bl2))) {
                        n4 = n7;
                        continue;
                    }
                    return false;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        zzdb zzdb2 = new zzdb();
        zzcz zzcz2 = new zzcz();
        int n4 = this.zzc() + 217;
        int n7 = 0;
        zzcz zzcz3 = null;
        while (true) {
            n3 = this.zzc();
            n4 *= 31;
            if (n7 >= n3) break;
            long l2 = 0L;
            zzdb zzdb3 = this.zze(n7, zzdb2, l2);
            n3 = zzdb3.hashCode();
            n4 += n3;
            ++n7;
        }
        int n8 = this.zzb() + n4;
        n4 = 0;
        while (true) {
            n7 = this.zzb();
            n3 = 1;
            if (n4 >= n7) break;
            n8 *= 31;
            zzcz3 = this.zzd(n4, zzcz2, n3 != 0);
            n7 = zzcz3.hashCode();
            n8 += n7;
            ++n4;
        }
        int n10 = this.zzg(n3 != 0);
        while (n10 != (n4 = -1)) {
            n8 *= 31;
            n4 = this.zzj(n10, 0, n3 != 0);
            n8 += n10;
            n10 = n4;
        }
        return n8;
    }

    public abstract int zza(Object var1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcz zzd(int var1, zzcz var2, boolean var3);

    public abstract zzdb zze(int var1, zzdb var2, long var3);

    public abstract Object zzf(int var1);

    public int zzg(boolean bl2) {
        bl2 = this.zzo();
        if (bl2) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean bl2) {
        bl2 = this.zzo();
        int n3 = -1;
        if (bl2) {
            return n3;
        }
        return this.zzc() + n3;
    }

    public final int zzi(int n3, zzcz zzcz2, zzdb zzdb2, int n4, boolean bl2) {
        zzcz2 = this.zzd(n3, zzcz2, false);
        int n7 = zzcz2.zzd;
        long l2 = 0L;
        zzdb zzdb3 = this.zze(n7, zzdb2, l2);
        int n8 = zzdb3.zzq;
        if (n8 == n3) {
            n3 = this.zzj(n7, n4, bl2);
            if (n3 == (n7 = -1)) {
                return n7;
            }
            return this.zze((int)n3, (zzdb)zzdb2, (long)l2).zzp;
        }
        return n3 + 1;
    }

    public int zzj(int n3, int n4, boolean bl2) {
        int n7 = 1;
        if (n4 != 0) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 == n8) {
                    n4 = this.zzh(bl2);
                    n3 = n3 == n4 ? this.zzg(bl2) : (n3 += n7);
                    return n3;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            return n3;
        }
        n4 = this.zzh(bl2);
        if (n3 == n4) {
            return -1;
        }
        return n3 + n7;
    }

    public int zzk(int n3, int n4, boolean bl2) {
        n4 = this.zzg(false);
        int n7 = -1;
        if (n3 == n4) {
            return n7;
        }
        return n3 + n7;
    }

    public final Pair zzl(zzdb zzdb2, zzcz zzcz2, int n3, long l2) {
        zzdb2 = this.zzm(zzdb2, zzcz2, n3, l2, 0L);
        zzdb2.getClass();
        return zzdb2;
    }

    public final Pair zzm(zzdb object, zzcz object2, int n3, long l2, long l3) {
        long l4;
        int n4 = this.zzc();
        zzeq.zza(n3, 0, n4);
        this.zze(n3, (zzdb)object, l3);
        l3 = 0L;
        long l7 = -9223372036854775807L;
        n3 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
        if (n3 == 0) {
            l4 = ((zzdb)object).zzn;
            l2 = l3;
        }
        n3 = ((zzdb)object).zzp;
        this.zzd(n3, (zzcz)object2, false);
        while (n3 < (n4 = ((zzdb)object).zzq)) {
            long cfr_ignored_0 = ((zzcz)object2).zzf;
            n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n4 == 0) break;
            int n7 = n3 + 1;
            zzcz zzcz2 = this.zzd(n7, (zzcz)object2, false);
            long cfr_ignored_1 = zzcz2.zzf;
            if (n4 < 0) break;
            n3 = n7;
        }
        this.zzd(n3, (zzcz)object2, true);
        long l8 = ((zzcz)object2).zzf;
        l8 = ((zzcz)object2).zze;
        long l12 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
        if (l12 != false) {
            l7 = -1;
            l2 = Math.min(l2, l8 += l7);
        }
        l4 = Math.max(l3, l2);
        object = ((zzcz)object2).zzc;
        object.getClass();
        object2 = l4;
        return Pair.create((Object)object, (Object)object2);
    }

    public zzcz zzn(Object object, zzcz zzcz2) {
        int n3 = this.zza(object);
        return this.zzd(n3, zzcz2, true);
    }

    public final boolean zzo() {
        int n3 = this.zzc();
        return n3 == 0;
    }
}

