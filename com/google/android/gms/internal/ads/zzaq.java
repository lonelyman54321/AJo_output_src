/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzt;

public final class zzaq {
    public final zzt zza;

    public /* synthetic */ zzaq(zzt zzt2, int n3, int n4, float f5, long l2, zzap zzap2) {
        CharSequence charSequence;
        String string2 = hj0_0.a(n3, "width must be positive, but is: ");
        boolean bl2 = false;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        zzeq.zze(n3 != 0, string2);
        string2 = "height must be positive, but is: ";
        charSequence = new StringBuilder(string2);
        charSequence.append(n4);
        charSequence = charSequence.toString();
        if (n4 > 0) {
            bl2 = true;
        }
        zzeq.zze(bl2, charSequence);
        this.zza = zzt2;
    }
}

