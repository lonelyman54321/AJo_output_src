/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzexv;

public final class zzexs
implements zzexv {
    public final /* synthetic */ Bundle zza;

    public /* synthetic */ zzexs(Bundle bundle) {
        this.zza = bundle;
    }

    public final void zzj(Object object) {
        object = (Bundle)object;
        Bundle bundle = this.zza;
        object.putBundle("shared_pref", bundle);
    }
}

