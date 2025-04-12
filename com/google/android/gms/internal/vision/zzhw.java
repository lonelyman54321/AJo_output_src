/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzid;

final class zzhw
extends zzid {
    private final int zzc;
    private final int zzd;

    public zzhw(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        zzht.zzb(n3, n7, n8);
        this.zzc = n3;
        this.zzd = n4;
    }

    public final byte zza(int n3) {
        int n4 = this.zza();
        int n7 = n3 + 1;
        if ((n7 = n4 - n7 | n3) < 0) {
            if (n3 < 0) {
                String string2 = tk3_2.a(22, n3, "Index < 0: ");
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            String string3 = C12.a(40, n3, n4, "Index > length: ", ", ");
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string3);
            throw arrayIndexOutOfBoundsException;
        }
        byte[] byArray = this.zzb;
        n7 = this.zzc + n3;
        return byArray[n7];
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zza(byte[] byArray, int n3, int n4, int n7) {
        byte[] byArray2 = this.zzb;
        n4 = this.zze();
        System.arraycopy(byArray2, n4, byArray, 0, n7);
    }

    public final byte zzb(int n3) {
        byte[] byArray = this.zzb;
        int n4 = this.zzc + n3;
        return byArray[n4];
    }

    public final int zze() {
        return this.zzc;
    }
}

