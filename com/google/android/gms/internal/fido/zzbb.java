/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzbh;
import java.math.RoundingMode;
import java.util.Arrays;

final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    public zzbb(String string2, char[] cArray) {
        int n3;
        int n4 = 128;
        byte[] byArray = new byte[n4];
        byte by2 = -1;
        Arrays.fill(byArray, by2);
        for (int i3 = 0; i3 < (n3 = cArray.length); ++i3) {
            String string3;
            byte by4;
            n3 = cArray[i3];
            byte by5 = 1;
            if (n3 < n4) {
                by4 = 1;
            } else {
                by4 = 0;
                string3 = null;
            }
            String string4 = "Non-ASCII character: %s";
            zzam.zzd(by4 != 0, string4, (char)n3);
            by4 = byArray[n3];
            if (by4 != by2) {
                by5 = 0;
            }
            string3 = "Duplicate character: %s";
            zzam.zzd(by5 != 0, string3, (char)n3);
            byArray[n3] = by5 = (byte)i3;
        }
        this(string2, cArray, byArray, false);
    }

    private zzbb(String object, char[] object2, byte[] object3, boolean n3) {
        this.zze = object;
        object2.getClass();
        this.zzf = object2;
        int n4 = ((char[])object2).length;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        n3 = zzbh.zzb(n4, roundingMode);
        try {
            this.zzb = n3;
        }
        catch (ArithmeticException arithmeticException) {
            int n7 = ((char[])object2).length;
            object3 = new IllegalArgumentException;
            object2 = hj0_0.a(n7, "Illegal alphabet length ");
            super((String)object2, arithmeticException);
            throw object3;
        }
        int n8 = Integer.numberOfTrailingZeros(n3);
        int n10 = 3 - n8;
        int n14 = 1;
        this.zzc = n10 = n14 << n10;
        this.zzd = n8 = n3 >> n8;
        this.zza = n4 += -1;
        this.zzg = object3;
        object = new boolean[n10];
        n8 = 0;
        object2 = null;
        object3 = null;
        for (int i3 = 0; i3 < (n3 = this.zzd); ++i3) {
            n3 = i3 * 8;
            n10 = this.zzb;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            n3 = zzbh.zza(n3, n10, roundingMode2);
            object[n3] = n14;
        }
        this.zzh = false;
        return;
    }

    public static /* bridge */ /* synthetic */ char[] zzc(zzbb zzbb2) {
        return zzbb2.zzf;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzbb;
        if (bl2) {
            object = (zzbb)object;
            bl2 = ((zzbb)object).zzh;
            char[] cArray = this.zzf;
            object = ((zzbb)object).zzf;
            boolean bl3 = Arrays.equals(cArray, (char[])object);
            if (bl3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int n3) {
        return this.zzf[n3];
    }

    public final boolean zzb(char c2) {
        byte[] byArray = this.zzg;
        c2 = byArray[61];
        char c3 = '\uffffffff';
        return c2 != c3;
    }
}

