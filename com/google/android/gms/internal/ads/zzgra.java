/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqz;
import com.google.android.gms.internal.ads.zzgze;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

public final class zzgra {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgze zza(String object) {
        int n3;
        int n4 = ((String)object).length();
        Object object2 = new byte[n4];
        for (int i3 = 0; i3 < (n3 = ((String)object).length()); ++i3) {
            int n7;
            n3 = ((String)object).charAt(i3);
            if (n3 >= (n7 = 33) && n3 <= (n7 = 126)) {
                n3 = (byte)n3;
                object2[i3] = n3;
                continue;
            }
            object2 = new StringBuilder;
            ((StringBuilder)object2)("Not a printable ASCII character: ");
            ((StringBuilder)object2).append((char)n3);
            object2 = ((StringBuilder)object2).toString();
            object = new GeneralSecurityException((String)object2);
            throw object;
        }
        return zzgze.zzb((byte[])object2);
    }

    public static final zzgze zzb(String object) {
        int n3;
        int n4 = ((String)object).length();
        Object object2 = new byte[n4];
        for (int i3 = 0; i3 < (n3 = ((String)object).length()); ++i3) {
            int n7;
            n3 = ((String)object).charAt(i3);
            if (n3 >= (n7 = 33) && n3 <= (n7 = 126)) {
                n3 = (byte)n3;
                object2[i3] = n3;
                continue;
            }
            object2 = new StringBuilder;
            ((StringBuilder)object2)("Not a printable ASCII character: ");
            ((StringBuilder)object2).append((char)n3);
            object2 = ((StringBuilder)object2).toString();
            object = new zzgqz((String)object2);
            throw object;
        }
        return zzgze.zzb((byte[])object2);
    }

    public static boolean zzc(byte[] byArray, byte[] byArray2) {
        int n3 = byArray2.length;
        int n4 = byArray.length;
        if (n3 >= n4) {
            for (n3 = 0; n3 < (n4 = byArray.length); ++n3) {
                n4 = byArray2[n3];
                byte by2 = byArray[n3];
                if (n4 == by2) continue;
                return false;
            }
            return true;
        }
        return false;
    }
}

