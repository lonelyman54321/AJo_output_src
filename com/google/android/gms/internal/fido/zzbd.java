/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzbb;
import com.google.android.gms.internal.fido.zzbe;

final class zzbd
extends zzbe {
    public zzbd(String object, String object2, Character c2) {
        object2 = ((String)object2).toCharArray();
        zzbb zzbb2 = new zzbb((String)object, (char[])object2);
        super(zzbb2, c2);
        object = zzbb.zzc(zzbb2);
        boolean bl2 = ((Object)object).length;
        boolean bl3 = 64 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        zzam.zzc(bl2);
    }

    public final void zza(Appendable appendable, byte[] byArray, int n3, int n4) {
        char c2;
        n3 = byArray.length;
        int n7 = 0;
        zzam.zze(0, n4, n3);
        for (n3 = n4; n3 >= (c2 = '\u0003'); n3 += -3) {
            c2 = n7 + 1;
            char c3 = byArray[n7] & 0xFF;
            c2 = byArray[c2] & 0xFF;
            int n8 = n7 + 2;
            n8 = byArray[n8] & 0xFF;
            zzbb zzbb2 = this.zzb;
            c2 = c2 << 8 | (c3 <<= 16) | n8;
            char c3 = c2 >>> 18;
            c3 = zzbb2.zza(c3);
            appendable.append(c3);
            zzbb zzbb3 = this.zzb;
            n8 = c2 >>> 12 & 0x3F;
            c3 = zzbb3.zza(n8);
            appendable.append(c3);
            zzbb3 = this.zzb;
            n8 = c2 >>> 6 & 0x3F;
            c3 = zzbb3.zza(n8);
            appendable.append(c3);
            zzbb3 = this.zzb;
            c2 &= 0x3F;
            c2 = zzbb3.zza(c2);
            appendable.append(c2);
            n7 += 3;
        }
        if (n7 < n4) {
            this.zzc(appendable, byArray, n7, n4 -= n7);
        }
    }
}

