/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzbb;
import com.google.android.gms.internal.fido.zzbf;
import com.google.android.gms.internal.fido.zzbh;
import java.math.RoundingMode;

class zzbe
extends zzbf {
    final zzbb zzb;
    final Character zzc;

    public zzbe(zzbb object, Character object2) {
        char c2;
        boolean bl2;
        this.zzb = object;
        if (object2 != null && (bl2 = ((zzbb)object).zzb(c2 = '='))) {
            Object[] objectArray = new Object[]{object2};
            object2 = zzan.zza("Padding character %s was already in alphabet", objectArray);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        this.zzc = object2;
    }

    public zzbe(String string2, String object, Character c2) {
        object = ((String)object).toCharArray();
        zzbb zzbb2 = new zzbb(string2, (char[])object);
        this(zzbb2, c2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzbe;
        if (bl2) {
            boolean bl3;
            object = (zzbe)object;
            Object object2 = this.zzb;
            zzbb zzbb2 = ((zzbe)object).zzb;
            bl2 = ((zzbb)object2).equals(zzbb2);
            if (bl2 && ((object2 = this.zzc) == (object = ((zzbe)object).zzc) || object2 != null && (bl3 = object2.equals(object)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        zzbb zzbb2 = this.zzb;
        int n4 = zzbb2.hashCode();
        Character c2 = this.zzc;
        if (c2 == null) {
            n3 = 0;
            c2 = null;
        } else {
            n3 = ((Object)c2).hashCode();
        }
        return n4 ^ n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        Object object = this.zzb;
        stringBuilder.append(object);
        object = this.zzb;
        int n3 = ((zzbb)object).zzb;
        int n4 = 8 % n3;
        if (n4 != 0) {
            object = this.zzc;
            if (object == null) {
                object = ".omitPadding()";
                stringBuilder.append((String)object);
            } else {
                stringBuilder.append(".withPadChar('");
                object = this.zzc;
                stringBuilder.append(object);
                object = "')";
                stringBuilder.append((String)object);
            }
        }
        return stringBuilder.toString();
    }

    public void zza(Appendable appendable, byte[] byArray, int n3, int n4) {
        n3 = byArray.length;
        zzam.zze(0, n4, n3);
        for (int i3 = 0; i3 < n4; i3 += n3) {
            n3 = this.zzb.zzd;
            int n7 = n4 - i3;
            n3 = Math.min(n3, n7);
            this.zzc(appendable, byArray, i3, n3);
            zzbb zzbb2 = this.zzb;
            n3 = zzbb2.zzd;
        }
    }

    public final int zzb(int n3) {
        zzbb zzbb2 = this.zzb;
        int n4 = zzbb2.zzc;
        int n7 = zzbb2.zzd;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return zzbh.zza(n3, n7, roundingMode) * n4;
    }

    public final void zzc(Appendable appendable, byte[] object, int n3, int n4) {
        long l2;
        int n7 = n3 + n4;
        int n8 = ((byte[])object).length;
        zzam.zze(n3, n7, n8);
        zzbb zzbb2 = this.zzb;
        n7 = zzbb2.zzd;
        n8 = 0;
        if (n4 <= n7) {
            n7 = 1;
        } else {
            n7 = 0;
            zzbb2 = null;
        }
        zzam.zzc(n7 != 0);
        long l3 = 0L;
        n7 = 0;
        zzbb2 = null;
        while (true) {
            int n10 = 8;
            if (n7 >= n4) break;
            int n14 = n3 + n7;
            n14 = object[n14] & 0xFF;
            l2 = n14;
            l3 = (l3 | l2) << n10;
            ++n7;
        }
        int n15 = (n4 + 1) * 8;
        zzbb zzbb3 = this.zzb;
        n3 = zzbb3.zzb;
        n15 -= n3;
        while (n8 < (n3 = n4 * 8)) {
            n3 = n15 - n8;
            l2 = l3 >>> n3;
            zzbb3 = this.zzb;
            n7 = zzbb3.zza;
            int n16 = (int)l2;
            n3 = zzbb3.zza(n7 &= n16);
            appendable.append((char)n3);
            zzbb3 = this.zzb;
            n3 = zzbb3.zzb;
            n8 += n3;
        }
        object = this.zzc;
        if (object != null) {
            while (true) {
                object = this.zzb;
                n15 = object.zzd * 8;
                if (n8 >= n15) break;
                this.zzc.getClass();
                appendable.append('=');
                object = this.zzb;
                n15 = object.zzb;
                n8 += n15;
            }
        }
    }
}

