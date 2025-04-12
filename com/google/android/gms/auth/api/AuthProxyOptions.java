/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.zzb;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;

public final class AuthProxyOptions
implements Api$ApiOptions$Optional {
    public static final AuthProxyOptions zza;
    private final Bundle zzb;

    static {
        AuthProxyOptions authProxyOptions;
        Bundle bundle = new Bundle();
        zza = authProxyOptions = new AuthProxyOptions(bundle, null);
    }

    public /* synthetic */ AuthProxyOptions(Bundle bundle, zzb zzb2) {
        this.zzb = bundle;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof AuthProxyOptions;
        if (!bl2) {
            return false;
        }
        object = (AuthProxyOptions)object;
        Bundle bundle = this.zzb;
        object = ((AuthProxyOptions)object).zzb;
        return Objects.checkBundlesEquality(bundle, (Bundle)object);
    }

    public final int hashCode() {
        Bundle bundle = this.zzb;
        Object[] objectArray = new Object[]{bundle};
        return Objects.hashCode(objectArray);
    }

    public final Bundle zza() {
        Bundle bundle = this.zzb;
        Bundle bundle2 = new Bundle(bundle);
        return bundle2;
    }
}

