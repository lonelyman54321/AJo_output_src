/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzaeh;
import com.google.android.gms.internal.gtm.zzyp;
import com.google.android.gms.internal.gtm.zzyq;
import com.google.android.gms.internal.gtm.zzyv;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzyx
implements Iterable,
Serializable {
    public static final zzyx zzb;
    private int zza = 0;

    static {
        byte[] byArray = zzaco.zzb;
        zzyv zzyv2 = new zzyv(byArray);
        zzb = zzyv2;
    }

    public static int zzh(int n3, int n4, int n7) {
        int n8 = n3 | n4;
        int n10 = n4 - n3;
        n8 |= n10;
        int n14 = n7 - n4;
        if ((n8 |= n14) < 0) {
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
        return n10;
    }

    public static zzyx zzj(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzyx.zzh(n3, n7, n8);
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, n3, byArray2, 0, n4);
        zzyv zzyv2 = new zzyv(byArray2);
        return zzyv2;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zza;
        if (n3 == 0) {
            int n4 = this.zzd();
            n3 = this.zze(n4, 0, n4);
            if (n3 == 0) {
                n3 = 1;
            }
            this.zza = n3;
        }
        return n3;
    }

    public final /* synthetic */ Iterator iterator() {
        zzyq zzyq2 = new zzyq(this);
        return zzyq2;
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
            string2 = zzaeh.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = zzaeh.zza(this.zzf(0, n3));
            String string3 = "...";
            string2 = string2.concat(string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public abstract byte zza(int var1);

    public abstract byte zzb(int var1);

    public abstract int zzd();

    public abstract int zze(int var1, int var2, int var3);

    public abstract zzyx zzf(int var1, int var2);

    public abstract void zzg(zzyp var1);

    public final int zzi() {
        return this.zza;
    }
}

