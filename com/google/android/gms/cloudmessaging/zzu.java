/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzs;

final class zzu
extends zzs {
    public zzu(int n3, int n4, Bundle bundle) {
        super(n3, n4, bundle);
    }

    public final void zza(Bundle bundle) {
        String string2 = "data";
        if ((bundle = bundle.getBundle(string2)) == null) {
            bundle = Bundle.EMPTY;
        }
        this.zzd(bundle);
    }

    public final boolean zzb() {
        return false;
    }
}

