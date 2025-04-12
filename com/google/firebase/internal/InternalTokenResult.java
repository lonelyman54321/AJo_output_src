/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.internal;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;

public class InternalTokenResult {
    private String zza;

    public InternalTokenResult(String string2) {
        this.zza = string2;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof InternalTokenResult;
        if (!bl2) {
            return false;
        }
        object = (InternalTokenResult)object;
        String string2 = this.zza;
        object = ((InternalTokenResult)object).zza;
        return Objects.equal(string2, object);
    }

    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        String string2 = this.zza;
        Object[] objectArray = new Object[]{string2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        String string2 = this.zza;
        return objects$ToStringHelper.add("token", string2).toString();
    }
}

