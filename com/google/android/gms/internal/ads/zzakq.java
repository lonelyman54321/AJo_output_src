/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;

public final class zzakq {
    public final boolean zza;
    public final String zzb;
    public final zzaez zzc;
    public final int zzd;
    public final byte[] zze;

    public zzakq(boolean bl2, String string2, int n3, byte[] byArray, int n4, int n7, byte[] object) {
        zzaez zzaez2;
        int n8;
        block9: {
            CharSequence charSequence;
            int n10;
            int n14;
            int n15;
            block10: {
                n15 = 0;
                n8 = 1;
                n14 = n3 == 0 ? 1 : 0;
                int n16 = object == null ? 1 : 0;
                zzeq.zzd((n14 ^= n16) != 0);
                this.zza = bl2;
                this.zzb = string2;
                this.zzd = n3;
                this.zze = object;
                if (string2 == null) break block9;
                n3 = string2.hashCode();
                n10 = 3;
                n14 = 2;
                switch (n3) {
                    default: {
                        break;
                    }
                    case 3049895: {
                        charSequence = "cens";
                        n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                        if (n3 == 0) break;
                        n15 = 1;
                        break block10;
                    }
                    case 3049879: {
                        charSequence = "cenc";
                        n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                        if (n3 == 0) break;
                        break block10;
                    }
                    case 3046671: {
                        charSequence = "cbcs";
                        n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                        if (n3 == 0) break;
                        n15 = 3;
                        break block10;
                    }
                    case 3046605: {
                        charSequence = "cbc1";
                        n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                        if (n3 == 0) break;
                        n15 = 2;
                        break block10;
                    }
                }
                n15 = -1;
            }
            if (n15 != 0 && n15 != n8) {
                if (n15 != n14 && n15 != n10) {
                    object = "Unsupported protection scheme type '";
                    super((String)object);
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append("'. Assuming AES-CTR crypto mode.");
                    string2 = ((StringBuilder)charSequence).toString();
                    charSequence = "TrackEncryptionBox";
                    zzfk.zzf((String)charSequence, string2);
                } else {
                    n8 = 2;
                }
            }
        }
        this.zzc = zzaez2 = new zzaez(n8, byArray, n4, n7);
    }
}

