/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import java.io.Serializable;

final class zzfo
extends Number
implements Comparable {
    private double zza;
    private long zzb;
    private final boolean zzc;

    private zzfo(double d2) {
        this.zza = d2;
        this.zzc = false;
    }

    private zzfo(long l2) {
        this.zzb = l2;
        this.zzc = true;
    }

    public static zzfo zzc(Double d2) {
        double d5 = d2;
        zzfo zzfo2 = new zzfo(d5);
        return zzfo2;
    }

    public static zzfo zzd(long l2) {
        zzfo zzfo2 = new zzfo(l2);
        return zzfo2;
    }

    public static zzfo zze(String string2) {
        Serializable serializable;
        long l2;
        try {
            l2 = Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            double d2;
            try {
                d2 = Double.parseDouble(string2);
            }
            catch (NumberFormatException numberFormatException2) {
                string2 = String.valueOf(string2);
                string2 = string2.concat(" is not a valid TypedNumber");
                serializable = new NumberFormatException(string2);
                throw serializable;
            }
            serializable = new zzfo(d2);
            return serializable;
        }
        serializable = new zzfo(l2);
        return serializable;
    }

    public final byte byteValue() {
        return (byte)this.zzb();
    }

    public final double doubleValue() {
        double d2;
        boolean bl2 = this.zzc;
        if (bl2) {
            long l2 = this.zzb;
            d2 = l2;
        } else {
            d2 = this.zza;
        }
        return d2;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = object instanceof zzfo;
        return bl2 && (n3 = this.zza((zzfo)(object = (zzfo)object))) == 0;
    }

    public final float floatValue() {
        return (float)this.doubleValue();
    }

    public final int hashCode() {
        long l2 = this.zzb();
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final int intValue() {
        return (int)this.zzb();
    }

    public final long longValue() {
        return this.zzb();
    }

    public final short shortValue() {
        return (short)this.zzb();
    }

    public final String toString() {
        String string2;
        boolean bl2 = this.zzc;
        if (bl2) {
            long l2 = this.zzb;
            string2 = Long.toString(l2);
        } else {
            double d2 = this.zza;
            string2 = Double.toString(d2);
        }
        return string2;
    }

    public final int zza(zzfo zzfo2) {
        int n3;
        boolean bl2 = this.zzc;
        if (bl2 && (bl2 = zzfo2.zzc)) {
            long l2 = this.zzb;
            long l3 = zzfo2.zzb;
            n3 = Long.compare(l2, l3);
        } else {
            double d2 = this.doubleValue();
            double d5 = zzfo2.doubleValue();
            n3 = Double.compare(d2, d5);
        }
        return n3;
    }

    public final long zzb() {
        long l2;
        boolean bl2 = this.zzc;
        if (bl2) {
            l2 = this.zzb;
        } else {
            double d2 = this.zza;
            l2 = (long)d2;
        }
        return l2;
    }

    public final boolean zzf() {
        boolean bl2 = this.zzc;
        return !bl2;
    }

    public final boolean zzg() {
        return this.zzc;
    }
}

