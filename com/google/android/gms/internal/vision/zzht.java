/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhi;
import com.google.android.gms.internal.vision.zzhq;
import com.google.android.gms.internal.vision.zzhs;
import com.google.android.gms.internal.vision.zzhv;
import com.google.android.gms.internal.vision.zzhw;
import com.google.android.gms.internal.vision.zzhx;
import com.google.android.gms.internal.vision.zzhz;
import com.google.android.gms.internal.vision.zzib;
import com.google.android.gms.internal.vision.zzic;
import com.google.android.gms.internal.vision.zzid;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzlq;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzht
implements Serializable,
Iterable {
    public static final zzht zza;
    private static final zzhz zzb;
    private static final Comparator zzd;
    private int zzc = 0;

    static {
        byte[] byArray = zzjf.zzb;
        Object object = new zzid(byArray);
        zza = object;
        boolean bl2 = zzhi.zza();
        byArray = null;
        object = bl2 ? new zzic(null) : new zzhx(null);
        zzb = object;
        zzd = object = new zzhv();
    }

    public static /* synthetic */ int zza(byte by2) {
        return zzht.zzb(by2);
    }

    public static zzht zza(String object) {
        Charset charset = zzjf.zza;
        object = ((String)object).getBytes(charset);
        zzid zzid2 = new zzid((byte[])object);
        return zzid2;
    }

    public static zzht zza(byte[] byArray) {
        zzid zzid2 = new zzid(byArray);
        return zzid2;
    }

    public static zzht zza(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzht.zzb(n3, n7, n8);
        byArray = zzb.zza(byArray, n3, n4);
        zzid zzid2 = new zzid(byArray);
        return zzid2;
    }

    private static int zzb(byte by2) {
        return by2 & 0xFF;
    }

    public static int zzb(int n3, int n4, int n7) {
        int n8 = n4 - n3;
        int n10 = n3 | n4 | n8;
        int n14 = n7 - n4;
        if ((n10 |= n14) < 0) {
            if (n3 >= 0) {
                if (n4 < n3) {
                    String string2 = C12.a(66, n3, n4, "Beginning index larger than ending index: ", ", ");
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
                    throw indexOutOfBoundsException;
                }
                String string3 = C12.a(37, n4, n7, "End index: ", " >= ");
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
                throw indexOutOfBoundsException;
            }
            String string4 = oe2_0.a(32, n3, "Beginning index: ", " < 0");
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string4);
            throw indexOutOfBoundsException;
        }
        return n8;
    }

    public static zzht zzb(byte[] byArray, int n3, int n4) {
        zzhw zzhw2 = new zzhw(byArray, n3, n4);
        return zzhw2;
    }

    public static zzib zzc(int n3) {
        zzib zzib2 = new zzib(n3, null);
        return zzib2;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zzc;
        if (n3 == 0) {
            n3 = this.zza();
            if ((n3 = this.zza(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.zzc = n3;
        }
        return n3;
    }

    public /* synthetic */ Iterator iterator() {
        zzhs zzhs2 = new zzhs(this);
        return zzhs2;
    }

    public final String toString() {
        String string2;
        int n3;
        Object object = Locale.ROOT;
        int n4 = System.identityHashCode(this);
        object = Integer.toHexString(n4);
        int n7 = this.zza();
        int n8 = this.zza();
        if (n8 <= (n3 = 50)) {
            string2 = zzlq.zza(this);
        } else {
            n8 = 0;
            n3 = 47;
            string2 = String.valueOf(zzlq.zza(this.zza(0, n3)));
            String string3 = "...";
            string2 = string2.concat(string3);
        }
        return h30_0.a(oe3_0.a(n7, "<ByteString@", (String)object, " size=", " contents=\""), string2, "\">");
    }

    public abstract byte zza(int var1);

    public abstract int zza();

    public abstract int zza(int var1, int var2, int var3);

    public abstract zzht zza(int var1, int var2);

    public abstract String zza(Charset var1);

    public abstract void zza(zzhq var1);

    public abstract void zza(byte[] var1, int var2, int var3, int var4);

    public abstract byte zzb(int var1);

    public final String zzb() {
        Charset charset = zzjf.zza;
        int n3 = this.zza();
        if (n3 == 0) {
            return "";
        }
        return this.zza(charset);
    }

    public abstract boolean zzc();

    public final int zzd() {
        return this.zzc;
    }
}

