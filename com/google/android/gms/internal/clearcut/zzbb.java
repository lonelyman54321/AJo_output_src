/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzaw;
import com.google.android.gms.internal.clearcut.zzba;
import com.google.android.gms.internal.clearcut.zzbc;
import com.google.android.gms.internal.clearcut.zzbd;
import com.google.android.gms.internal.clearcut.zzbf;
import com.google.android.gms.internal.clearcut.zzbg;
import com.google.android.gms.internal.clearcut.zzbi;
import com.google.android.gms.internal.clearcut.zzbj;
import com.google.android.gms.internal.clearcut.zzci;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzbb
implements Serializable,
Iterable {
    public static final zzbb zzfi;
    private static final zzbf zzfj;
    private int zzfk = 0;

    static {
        byte[] byArray = zzci.zzkt;
        Object object = new zzbi(byArray);
        zzfi = object;
        boolean bl2 = zzaw.zzx();
        byArray = null;
        object = bl2 ? new zzbj(null) : new zzbd(null);
        zzfj = object;
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

    public static zzbb zzb(byte[] byArray, int n3, int n4) {
        byArray = zzfj.zzc(byArray, n3, n4);
        zzbi zzbi2 = new zzbi(byArray);
        return zzbi2;
    }

    public static zzbb zzf(String object) {
        Charset charset = zzci.UTF_8;
        object = ((String)object).getBytes(charset);
        zzbi zzbi2 = new zzbi((byte[])object);
        return zzbi2;
    }

    public static zzbg zzk(int n3) {
        zzbg zzbg2 = new zzbg(n3, null);
        return zzbg2;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n3 = this.zzfk;
        if (n3 == 0) {
            n3 = this.size();
            if ((n3 = this.zza(n3, 0, n3)) == 0) {
                n3 = 1;
            }
            this.zzfk = n3;
        }
        return n3;
    }

    public /* synthetic */ Iterator iterator() {
        zzbc zzbc2 = new zzbc(this);
        return zzbc2;
    }

    public abstract int size();

    public final String toString() {
        String string2 = Integer.toHexString(System.identityHashCode(this));
        Integer n3 = this.size();
        Object[] objectArray = new Object[]{string2, n3};
        return String.format("<ByteString@%s size=%d>", objectArray);
    }

    public abstract int zza(int var1, int var2, int var3);

    public abstract zzbb zza(int var1, int var2);

    public abstract String zza(Charset var1);

    public abstract void zza(zzba var1);

    public abstract boolean zzaa();

    public final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int var1);

    public final String zzz() {
        Charset charset = zzci.UTF_8;
        int n3 = this.size();
        if (n3 == 0) {
            return "";
        }
        return this.zza(charset);
    }
}

