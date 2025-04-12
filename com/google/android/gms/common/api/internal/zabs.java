/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;

final class zabs {
    private final ApiKey zaa;
    private final Feature zab;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabr2) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public static /* bridge */ /* synthetic */ Feature zaa(zabs zabs2) {
        return zabs2.zab;
    }

    public static /* bridge */ /* synthetic */ ApiKey zab(zabs zabs2) {
        return zabs2.zaa;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object != null && (bl2 = object instanceof zabs)) {
            boolean bl3;
            object = (zabs)object;
            Object object2 = this.zaa;
            ApiKey apiKey = ((zabs)object).zaa;
            bl2 = Objects.equal(object2, apiKey);
            if (bl2 && (bl3 = Objects.equal(object2 = this.zab, object = ((zabs)object).zab))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ApiKey apiKey = this.zaa;
        Feature feature = this.zab;
        Object[] objectArray = new Object[]{apiKey, feature};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        Object object = this.zaa;
        objects$ToStringHelper = objects$ToStringHelper.add("key", object);
        object = this.zab;
        return objects$ToStringHelper.add("feature", object).toString();
    }
}

