/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;

public final class zbc
implements Api$ApiOptions$Optional {
    private final String zba;

    public zbc(String string2) {
        this.zba = string2;
    }

    public final boolean equals(Object object) {
        return object instanceof zbc;
    }

    public final int hashCode() {
        Object[] objectArray = new Object[]{zbc.class};
        return Objects.hashCode(objectArray);
    }

    public final Bundle zba() {
        Bundle bundle = new Bundle();
        String string2 = this.zba;
        bundle.putString("session_id", string2);
        return bundle;
    }

    public final String zbb() {
        return this.zba;
    }
}

