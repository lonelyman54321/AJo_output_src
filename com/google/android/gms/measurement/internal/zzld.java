/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzpp;

final class zzld
implements zzpp {
    private final /* synthetic */ zzju zza;

    public zzld(zzju zzju2) {
        this.zza = zzju2;
    }

    public final void zza(String string2, String string3, Bundle bundle) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string4 = "auto";
        if (!bl2) {
            this.zza.zza(string4, string3, bundle, string2);
            return;
        }
        this.zza.zzb(string4, string3, bundle);
    }
}

