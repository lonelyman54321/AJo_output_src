/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class ApiKey {
    private final int zaa;
    private final Api zab;
    private final Api$ApiOptions zac;
    private final String zad;

    private ApiKey(Api api, Api$ApiOptions api$ApiOptions, String string2) {
        int n3;
        this.zab = api;
        this.zac = api$ApiOptions;
        this.zad = string2;
        Object[] objectArray = new Object[]{api, api$ApiOptions, string2};
        this.zaa = n3 = Objects.hashCode(objectArray);
    }

    public static ApiKey getSharedApiKey(Api api, Api$ApiOptions api$ApiOptions, String string2) {
        ApiKey apiKey = new ApiKey(api, api$ApiOptions, string2);
        return apiKey;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof ApiKey;
        if (!bl4) {
            return false;
        }
        object = (ApiKey)object;
        Object object2 = this.zab;
        Object object3 = ((ApiKey)object).zab;
        bl4 = Objects.equal(object2, object3);
        if (bl4 && (bl4 = Objects.equal(object2 = this.zac, object3 = ((ApiKey)object).zac)) && (bl2 = Objects.equal(object2 = this.zad, object = ((ApiKey)object).zad))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return this.zaa;
    }

    public final String zaa() {
        return this.zab.zad();
    }
}

