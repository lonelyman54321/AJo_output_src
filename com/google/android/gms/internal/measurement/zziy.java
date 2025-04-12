/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzmq;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class zziy
implements Serializable,
Iterable {
    public static final zziy zza;
    private static final zzjb zzb;
    private int zzc = 0;

    static {
        byte[] byArray = zzkj.zzb;
        Object object = new zzjf(byArray);
        zza = object;
        zzb = object = new zzji(null);
        new zzja();
    }

    public static /* synthetic */ int zza(byte by2) {
        return by2 & 0xFF;
    }

    public static int zza(int n3, int n4, int n7) {
        int n8 = n4 - n3;
        int n10 = n3 | n4 | n8;
        int n14 = n7 - n4;
        if ((n10 |= n14) < 0) {
            if (n3 >= 0) {
                if (n4 < n3) {
                    String string2 = D70.b(n3, n4, "Beginning index larger than ending index: ", ", ");
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
                    throw indexOutOfBoundsException;
                }
                String string3 = D70.b(n4, n7, "End index: ", " >= ");
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
                throw indexOutOfBoundsException;
            }
            String string4 = Gj0.b(n3, "Beginning index: ", " < 0");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string4);
            throw indexOutOfBoundsException;
        }
        return n8;
    }

    public static zziy zza(String object) {
        Charset charset = zzkj.zza;
        object = ((String)object).getBytes(charset);
        zzjf zzjf2 = new zzjf((byte[])object);
        return zzjf2;
    }

    public static zziy zza(byte[] byArray) {
        int n3 = byArray.length;
        return zziy.zza(byArray, 0, n3);
    }

    public static zziy zza(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zziy.zza(n3, n7, n8);
        byArray = zzb.zza(byArray, n3, n4);
        zzjf zzjf2 = new zzjf(byArray);
        return zzjf2;
    }

    public static zziy zzb(byte[] byArray) {
        zzjf zzjf2 = new zzjf(byArray);
        return zzjf2;
    }

    public static zzjd zzc(int n3) {
        zzjd zzjd2 = new zzjd(n3, null);
        return zzjd2;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zzc;
        if (n3 == 0) {
            n3 = this.zzb();
            if ((n3 = this.zzb(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.zzc = n3;
        }
        return n3;
    }

    public /* synthetic */ Iterator iterator() {
        zzix zzix2 = new zzix(this);
        return zzix2;
    }

    public final String toString() {
        String string2;
        int n3;
        Object object = Locale.ROOT;
        int n4 = System.identityHashCode(this);
        object = Integer.toHexString(n4);
        int n7 = this.zzb();
        int n8 = this.zzb();
        if (n8 <= (n3 = 50)) {
            string2 = zzmq.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = zzmq.zza(this.zza(0, n3));
            String string3 = "...";
            string2 = Ft2.a(string2, string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public abstract byte zza(int var1);

    public final int zza() {
        return this.zzc;
    }

    public abstract zziy zza(int var1, int var2);

    public abstract void zza(zziv var1);

    public abstract byte zzb(int var1);

    public abstract int zzb();

    public abstract int zzb(int var1, int var2, int var3);
}

