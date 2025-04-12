/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzbb;
import com.google.android.gms.internal.fido.zzbe;

final class zzbc
extends zzbe {
    final char[] zza;

    public zzbc(String object, String object2) {
        char[] cArray = "0123456789ABCDEF".toCharArray();
        object = new zzbb("base16()", cArray);
        super((zzbb)object, null);
        object2 = new char[512];
        this.zza = (char[])object2;
        object2 = zzbb.zzc((zzbb)object);
        int n3 = ((Object)object2).length;
        int n4 = 16;
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        zzam.zzc(n3 != 0);
        while (n7 < (n3 = 256)) {
            object2 = this.zza;
            n4 = n7 >>> 4;
            n4 = ((zzbb)object).zza(n4);
            object2[n7] = n4;
            object2 = this.zza;
            n4 = n7 | 0x100;
            int n8 = n7 & 0xF;
            n8 = ((zzbb)object).zza(n8);
            object2[n4] = n8;
            ++n7;
        }
    }

    public final void zza(Appendable appendable, byte[] byArray, int n3, int n4) {
        n3 = byArray.length;
        zzam.zze(0, n4, n3);
        for (int i3 = 0; i3 < n4; ++i3) {
            n3 = byArray[i3] & 0xFF;
            char c2 = this.zza[n3];
            appendable.append(c2);
            char[] cArray = this.zza;
            n3 |= 0x100;
            n3 = cArray[n3];
            appendable.append((char)n3);
        }
    }
}

