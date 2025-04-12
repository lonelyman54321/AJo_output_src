/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbw;
import com.google.android.gms.internal.icing.zzby;
import com.google.android.gms.internal.icing.zzcd;
import com.google.android.gms.internal.icing.zzce;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzfb;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;

public abstract class zzcf
implements Iterable,
Serializable {
    public static final zzcf zzb;
    private static final Comparator zzc;
    private static final zzce zzd;
    private int zza = 0;

    static {
        byte[] byArray = zzdh.zzc;
        Object object = new zzcd(byArray);
        zzb = object;
        zzd = object = new zzce(null);
        zzc = object = new zzby();
    }

    public static zzcf zzj(String object) {
        Charset charset = zzdh.zza;
        object = ((String)object).getBytes(charset);
        zzcd zzcd2 = new zzcd((byte[])object);
        return zzcd2;
    }

    public static int zzm(int n3, int n4, int n7) {
        n3 = n7 - n4 | n4;
        if (n3 >= 0) {
            return n4;
        }
        String string2 = C12.a(37, n4, n7, "End index: ", " >= ");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zza;
        if (n3 == 0) {
            n3 = this.zzc();
            if ((n3 = this.zzi(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.zza = n3;
        }
        return n3;
    }

    public final String toString() {
        String string2;
        int n3;
        Object object = Locale.ROOT;
        int n4 = System.identityHashCode(this);
        object = Integer.toHexString(n4);
        int n7 = this.zzc();
        int n8 = this.zzc();
        if (n8 <= (n3 = 50)) {
            string2 = zzfb.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = String.valueOf(zzfb.zza(this.zze(0, n3)));
            String string3 = "...";
            string2 = string2.concat(string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public abstract byte zza(int var1);

    public abstract byte zzb(int var1);

    public abstract int zzc();

    public abstract zzcf zze(int var1, int var2);

    public abstract void zzf(zzbw var1);

    public abstract String zzg(Charset var1);

    public abstract boolean zzh();

    public abstract int zzi(int var1, int var2, int var3);

    public final String zzk(Charset object) {
        int n3 = this.zzc();
        object = n3 == 0 ? "" : this.zzg((Charset)object);
        return object;
    }

    public final int zzl() {
        return this.zza;
    }
}

