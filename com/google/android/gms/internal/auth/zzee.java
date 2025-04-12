/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdv;
import com.google.android.gms.internal.auth.zzdw;
import com.google.android.gms.internal.auth.zzeb;
import com.google.android.gms.internal.auth.zzed;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzgw;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzee
implements Iterable,
Serializable {
    private static final Comparator zza;
    public static final zzee zzb;
    private static final zzed zzd;
    private int zzc = 0;

    static {
        byte[] byArray = zzez.zzd;
        Object object = new zzeb(byArray);
        zzb = object;
        zzd = object = new zzed(null);
        zza = object = new zzdw();
    }

    public static int zzi(int n3, int n4, int n7) {
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

    public static zzee zzk(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzee.zzi(n3, n7, n8);
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        zzeb zzeb2 = new zzeb(byArray2);
        return zzeb2;
    }

    public static zzee zzl(String object) {
        Charset charset = zzez.zzb;
        object = ((String)object).getBytes(charset);
        zzeb zzeb2 = new zzeb((byte[])object);
        return zzeb2;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zzc;
        if (n3 == 0) {
            n3 = this.zzd();
            if ((n3 = this.zze(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.zzc = n3;
        }
        return n3;
    }

    public final /* synthetic */ Iterator iterator() {
        zzdv zzdv2 = new zzdv(this);
        return zzdv2;
    }

    public final String toString() {
        String string2;
        int n3;
        Object object = Locale.ROOT;
        int n4 = System.identityHashCode(this);
        object = Integer.toHexString(n4);
        int n7 = this.zzd();
        int n8 = this.zzd();
        if (n8 <= (n3 = 50)) {
            string2 = zzgw.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = zzgw.zza(this.zzf(0, n3));
            String string3 = "...";
            string2 = string2.concat(string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public abstract byte zza(int var1);

    public abstract byte zzb(int var1);

    public abstract int zzd();

    public abstract int zze(int var1, int var2, int var3);

    public abstract zzee zzf(int var1, int var2);

    public abstract String zzg(Charset var1);

    public abstract boolean zzh();

    public final int zzj() {
        return this.zzc;
    }

    public final String zzm(Charset object) {
        int n3 = this.zzd();
        object = n3 == 0 ? "" : this.zzg((Charset)object);
        return object;
    }
}

