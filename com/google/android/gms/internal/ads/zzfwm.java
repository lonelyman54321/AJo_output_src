/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfvp;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;

final class zzfwm
extends zzfvp {
    final /* synthetic */ zzfwn zza;
    private final zzfws zzb;

    public zzfwm(zzfwn zzfwn2, zzfws zzfws2) {
        this.zza = zzfwn2;
        this.zzb = zzfws2;
    }

    public final void zzb(Bundle object) {
        int n3 = object.getInt("statusCode", 8150);
        object = object.getString("sessionToken");
        Object object2 = zzfwr.zzc();
        ((zzfwq)object2).zzb(n3);
        if (object != null) {
            ((zzfwq)object2).zza((String)object);
        }
        object = this.zzb;
        object2 = ((zzfwq)object2).zzc();
        object.zza((zzfwr)object2);
        int n4 = 8157;
        if (n3 == n4) {
            object = this.zza;
            ((zzfwn)object).zzc();
        }
    }
}

