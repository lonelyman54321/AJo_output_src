/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyCallback
 *  android.telephony.TelephonyCallback$DisplayInfoListener
 *  android.telephony.TelephonyDisplayInfo
 */
package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.google.android.gms.internal.ads.zzfs;

final class zzfp
extends TelephonyCallback
implements TelephonyCallback.DisplayInfoListener {
    private final zzfs zza;

    public zzfp(zzfs zzfs2) {
        this.zza = zzfs2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int n3 = qv1_0.a(telephonyDisplayInfo);
        int n4 = 3;
        int n7 = 5;
        int n8 = 1;
        if (n3 == n4 || n3 == (n4 = 4) || n3 == n7) {
            n3 = 1;
        } else {
            n3 = 0;
            telephonyDisplayInfo = null;
        }
        zzfs zzfs2 = this.zza;
        if (n8 == n3) {
            n7 = 10;
        }
        zzfs.zzc(zzfs2, n7);
    }
}

