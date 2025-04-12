/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Property$PropertyType;
import com.google.protobuf.Internal$EnumVerifier;

final class Property$PropertyType$PropertyTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        Property$PropertyType$PropertyTypeVerifier property$PropertyType$PropertyTypeVerifier = new Property$PropertyType$PropertyTypeVerifier();
        INSTANCE = property$PropertyType$PropertyTypeVerifier;
    }

    private Property$PropertyType$PropertyTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        Property$PropertyType property$PropertyType = Property$PropertyType.forNumber(n3);
        if (property$PropertyType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            property$PropertyType = null;
        }
        return n3 != 0;
    }
}

