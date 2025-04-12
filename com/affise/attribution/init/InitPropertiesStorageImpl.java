/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.init;

import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import kotlin.jvm.internal.Intrinsics;

public final class InitPropertiesStorageImpl
implements InitPropertiesStorage {
    private AffiseInitProperties properties;

    public AffiseInitProperties getProperties() {
        return this.properties;
    }

    public void setProperties(AffiseInitProperties affiseInitProperties) {
        Intrinsics.checkNotNullParameter(affiseInitProperties, "model");
        this.properties = affiseInitProperties;
    }

    public void updateSecretKey(String object) {
        String string2 = "secretKey";
        Intrinsics.checkNotNullParameter(object, string2);
        AffiseInitProperties affiseInitProperties = this.properties;
        if (affiseInitProperties != null) {
            int n3 = 479;
            object = AffiseInitProperties.copy$default(affiseInitProperties, null, false, null, null, null, (String)object, null, false, null, n3, null);
        } else {
            object = null;
        }
        this.properties = object;
    }
}

