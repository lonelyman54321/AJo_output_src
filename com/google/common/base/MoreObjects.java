/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.MoreObjects$ToStringHelper;

public final class MoreObjects {
    private MoreObjects() {
    }

    public static Object firstNonNull(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        if (object2 != null) {
            return object2;
        }
        object = new NullPointerException("Both parameters are null");
        throw object;
    }

    public static MoreObjects$ToStringHelper toStringHelper(Class object) {
        object = ((Class)object).getSimpleName();
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper((String)object, null);
        return moreObjects$ToStringHelper;
    }

    public static MoreObjects$ToStringHelper toStringHelper(Object object) {
        object = object.getClass().getSimpleName();
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper((String)object, null);
        return moreObjects$ToStringHelper;
    }

    public static MoreObjects$ToStringHelper toStringHelper(String string2) {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper(string2, null);
        return moreObjects$ToStringHelper;
    }
}

