/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzhki {
    public static final zzhki zza;
    public static final zzhki zzb;
    public static final zzhki zzc;
    public static final zzhki zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    static {
        zzhki zzhki2;
        zzhki zzhki3 = zzhki2;
        zza = zzhki2 = new zzhki(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        double d2 = 0.0;
        double d5 = 0.0;
        double d7 = 0.0;
        double d9 = 0.0;
        double d12 = 0.0;
        double d13 = 0.0;
        double d14 = 1.0;
        zzb = zzhki3 = new zzhki(d7, 1.0, -1.0, d9, d12, d13, d14, d2, d5);
        zzc = zzhki3 = new zzhki(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzd = zzhki3 = new zzhki(d7, -1.0, 1.0, d9, d12, d13, d14, d2, d5);
    }

    public zzhki(double d2, double d5, double d7, double d9, double d12, double d13, double d14, double d15, double d16) {
        this.zze = d12;
        this.zzf = d13;
        this.zzg = d14;
        this.zzh = d2;
        this.zzi = d5;
        this.zzj = d7;
        this.zzk = d9;
        this.zzl = d15;
        this.zzm = d16;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzhki> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzhki.class) == (clazz = object.getClass())) {
            object = (zzhki)object;
            double d2 = ((zzhki)object).zzh;
            double d5 = this.zzh;
            int n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzi;
            d5 = this.zzi;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzj;
            d5 = this.zzj;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzk;
            d5 = this.zzk;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzl;
            d5 = this.zzl;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzm;
            d5 = this.zzm;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zze;
            d5 = this.zze;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzf;
            d5 = this.zzf;
            n3 = Double.compare(d2, d5);
            if (n3 != 0) {
                return false;
            }
            d2 = ((zzhki)object).zzg;
            d5 = this.zzg;
            int n4 = Double.compare(d2, d5);
            if (n4 != 0) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        long l2 = Double.doubleToLongBits(this.zze);
        int n3 = 32;
        long l3 = l2 >>> n3;
        l2 ^= l3;
        l3 = Double.doubleToLongBits(this.zzf);
        long l4 = l3 >>> n3;
        l3 ^= l4;
        l4 = Double.doubleToLongBits(this.zzg);
        long l7 = l4 >>> n3;
        l4 ^= l7;
        l7 = Double.doubleToLongBits(this.zzh);
        long l8 = l7 >>> n3;
        l7 ^= l8;
        l8 = Double.doubleToLongBits(this.zzi);
        long l12 = l8 >>> n3;
        l8 ^= l12;
        l12 = Double.doubleToLongBits(this.zzj);
        long l14 = l12 >>> n3;
        l12 ^= l14;
        l14 = Double.doubleToLongBits(this.zzk);
        long l15 = l14 >>> n3;
        l15 = l14 ^ l15;
        l14 = Double.doubleToLongBits(this.zzl);
        long l16 = l14 >>> n3;
        l16 = l14 ^ l16;
        l14 = Double.doubleToLongBits(this.zzm);
        long l17 = l14 >>> n3;
        l14 ^= l17;
        int n4 = (int)l2 * 31;
        int n7 = (int)l3;
        n4 = (n4 + n7) * 31;
        n7 = (int)l4;
        n4 = (n4 + n7) * 31;
        n7 = (int)l7;
        n4 = (n4 + n7) * 31;
        n7 = (int)l8;
        n4 = (n4 + n7) * 31;
        n7 = (int)l12;
        n4 = (n4 + n7) * 31;
        n7 = (int)l15;
        n4 = (n4 + n7) * 31;
        n7 = (int)l16;
        n4 = (n4 + n7) * 31;
        n7 = (int)l14;
        return n4 + n7;
    }

    public final String toString() {
        Object object = this;
        zzhki zzhki2 = zza;
        boolean bl2 = this.equals(zzhki2);
        if (bl2) {
            return "Rotate 0\u00b0";
        }
        zzhki2 = zzb;
        bl2 = this.equals(zzhki2);
        if (bl2) {
            return "Rotate 90\u00b0";
        }
        zzhki2 = zzc;
        bl2 = this.equals(zzhki2);
        if (bl2) {
            return "Rotate 180\u00b0";
        }
        zzhki2 = zzd;
        bl2 = this.equals(zzhki2);
        if (bl2) {
            return "Rotate 270\u00b0";
        }
        double d2 = this.zze;
        double d5 = this.zzf;
        double d7 = this.zzg;
        double d9 = this.zzh;
        double d12 = this.zzi;
        double d13 = this.zzj;
        double d14 = this.zzk;
        double d15 = this.zzl;
        double d16 = this.zzm;
        object = new StringBuilder(260);
        ((StringBuilder)object).append("Matrix{u=");
        ((StringBuilder)object).append(d2);
        ((StringBuilder)object).append(", v=");
        ((StringBuilder)object).append(d5);
        ((StringBuilder)object).append(", w=");
        ((StringBuilder)object).append(d7);
        ((StringBuilder)object).append(", a=");
        ((StringBuilder)object).append(d9);
        ((StringBuilder)object).append(", b=");
        ((StringBuilder)object).append(d12);
        ((StringBuilder)object).append(", c=");
        ((StringBuilder)object).append(d13);
        ((StringBuilder)object).append(", d=");
        d2 = d14;
        ((StringBuilder)object).append(d14);
        ((StringBuilder)object).append(", tx=");
        d2 = d15;
        ((StringBuilder)object).append(d15);
        ((StringBuilder)object).append(", ty=");
        ((StringBuilder)object).append(d16);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

