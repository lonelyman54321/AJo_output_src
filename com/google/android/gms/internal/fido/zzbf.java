/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzbd;
import com.google.android.gms.internal.fido.zzbe;
import java.io.IOException;

public abstract class zzbf {
    private static final zzbf zza;
    private static final zzbf zzb;
    private static final zzbf zzc;
    private static final zzbf zzd;
    private static final zzbf zze;

    static {
        Character c2 = Character.valueOf('=');
        zzbe zzbe2 = new zzbd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", c2);
        zza = zzbe2;
        zzbe2 = new zzbd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", c2);
        zzb = zzbe2;
        zzbe2 = new zzbe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", c2);
        zzc = zzbe2;
        zzbe2 = new zzbe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", c2);
        zzd = zzbe2;
        zzbe2 = new zzbc("base16()", "0123456789ABCDEF");
        zze = zzbe2;
    }

    public static zzbf zzd() {
        return zze;
    }

    public abstract void zza(Appendable var1, byte[] var2, int var3, int var4);

    public abstract int zzb(int var1);

    public final String zze(byte[] byArray, int n3, int n4) {
        n3 = byArray.length;
        zzam.zze(0, n4, n3);
        int n7 = this.zzb(n4);
        Object object = new StringBuilder(n7);
        try {
            this.zza((Appendable)object, byArray, 0, n4);
            return ((StringBuilder)object).toString();
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
    }
}

