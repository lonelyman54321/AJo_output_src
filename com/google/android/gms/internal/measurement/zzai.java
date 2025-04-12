/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzh;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

public final class zzai
implements zzaq {
    private final Double zza;

    public zzai(Double d2) {
        if (d2 == null) {
            this.zza = d2 = Double.valueOf(0.0 / 0.0);
            return;
        }
        this.zza = d2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof zzai;
        if (!bl2) {
            return false;
        }
        object = (zzai)object;
        Double d2 = this.zza;
        object = ((zzai)object).zza;
        return d2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zzf();
    }

    public final zzaq zza(String object, zzh object2, List list) {
        object2 = "toString";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            object2 = this.zzf();
            object = new zzas((String)object2);
            return object;
        }
        object = y02.a(this.zzf(), ".", (String)object, " is not a function.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final zzaq zzc() {
        Double d2 = this.zza;
        zzai zzai2 = new zzai(d2);
        return zzai2;
    }

    public final Boolean zzd() {
        double d2;
        double d5;
        double d7;
        Double d9 = this.zza;
        double d12 = d9;
        boolean bl2 = Double.isNaN(d12);
        if (!bl2 && (d7 = (d5 = (d12 = (d9 = this.zza).doubleValue()) - (d2 = 0.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) != false) {
            bl2 = true;
        } else {
            bl2 = false;
            d9 = null;
        }
        return bl2;
    }

    public final Double zze() {
        return this.zza;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String zzf() {
        int n3;
        Object object;
        Object object2 = this.zza;
        double d2 = (Double)object2;
        boolean bl2 = Double.isNaN(d2);
        if (bl2) {
            return "NaN";
        }
        object2 = this.zza;
        d2 = (Double)object2;
        bl2 = Double.isInfinite(d2);
        if (bl2) {
            double d5;
            object2 = this.zza;
            d2 = (Double)object2;
            double d7 = d2 - (d5 = 0.0);
            Object object3 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object3 <= 0) return "-Infinity";
            return "Infinity";
        }
        d2 = this.zza;
        object2 = BigDecimal.valueOf(d2);
        int n4 = ((BigDecimal)object2).signum();
        int n7 = 0;
        Object var10_10 = null;
        if (n4 == 0) {
            object = BigInteger.ZERO;
            object2 = new BigDecimal((BigInteger)object, 0);
        } else {
            n4 = ((BigDecimal)object2).signum();
            if (n4 == 0) {
                object = BigInteger.ZERO;
                object2 = new BigDecimal((BigInteger)object, 0);
            } else {
                object2 = ((BigDecimal)object2).stripTrailingZeros();
            }
        }
        object = new DecimalFormat("0E0");
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        ((NumberFormat)object).setRoundingMode(roundingMode);
        n7 = ((BigDecimal)object2).scale();
        n7 = n7 > 0 ? ((BigDecimal)object2).precision() : ((BigDecimal)object2).scale();
        ((NumberFormat)object).setMinimumFractionDigits(n7 += -1);
        object = ((Format)object).format(object2);
        String string2 = "E";
        int n8 = ((String)object).indexOf(string2);
        if (n8 <= 0) return object;
        ++n8;
        String string3 = ((String)object).substring(n8);
        if ((n8 = Integer.parseInt(string3)) < 0) {
            int n10 = -7;
            if (n8 > n10) return ((BigDecimal)object2).toPlainString();
        }
        if (n8 >= 0 && n8 < (n3 = 21)) {
            return ((BigDecimal)object2).toPlainString();
        }
        string3 = "e-";
        object2 = ((String)object).replace("E-", string3);
        return ((String)object2).replace(string2, "e+");
    }

    public final Iterator zzh() {
        return null;
    }
}

