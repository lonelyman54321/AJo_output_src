/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzch;
import java.io.EOFException;

public final class zzady {
    public static int zza(zzadv zzadv2, byte[] byArray, int n3, int n4) {
        int n7;
        int n8;
        for (n7 = 0; n7 < n4; n7 += n8) {
            n8 = n3 + n7;
            int n10 = n4 - n7;
            if ((n8 = zzadv2.zzb(byArray, n8, n10)) == (n10 = -1)) break;
        }
        return n7;
    }

    public static void zzb(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        throw zzch.zza(string2, null);
    }

    public static boolean zzc(zzadv zzadv2, byte[] byArray, int n3, int n4, boolean bl2) {
        try {
            return zzadv2.zzm(byArray, 0, n4, bl2);
        }
        catch (EOFException eOFException) {
            if (bl2) {
                return false;
            }
            throw eOFException;
        }
    }

    public static boolean zzd(zzadv zzadv2, byte[] byArray, int n3, int n4) {
        try {
            zzadv2 = (zzadi)zzadv2;
        }
        catch (EOFException eOFException) {
            return false;
        }
        ((zzadi)zzadv2).zzn(byArray, n3, n4, false);
        return true;
    }

    public static boolean zze(zzadv zzadv2, int n3) {
        try {
            zzadv2 = (zzadi)zzadv2;
        }
        catch (EOFException eOFException) {
            return false;
        }
        ((zzadi)zzadv2).zzo(n3, false);
        return true;
    }
}

