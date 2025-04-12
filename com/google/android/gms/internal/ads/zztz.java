/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zzui;
import com.google.android.gms.internal.ads.zzuj;

public final class zztz
implements zzui {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zza(Object object) {
        object = (zztp)object;
        int n3 = zzuj.zza;
        object = ((zztp)object).zza;
        String string2 = "OMX.google";
        n3 = (int)(((String)object).startsWith(string2) ? 1 : 0);
        int n4 = 1;
        if (n3 != 0) return n4;
        string2 = "c2.android";
        n3 = (int)(((String)object).startsWith(string2) ? 1 : 0);
        if (n3 != 0) return n4;
        n3 = zzgd.zza;
        n4 = 26;
        if (n3 >= n4) return 0;
        string2 = "OMX.MTK.AUDIO.DECODER.RAW";
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) return 0;
        return -1;
    }
}

