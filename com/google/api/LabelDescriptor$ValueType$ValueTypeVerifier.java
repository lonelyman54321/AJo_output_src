/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor$ValueType;
import com.google.protobuf.Internal$EnumVerifier;

final class LabelDescriptor$ValueType$ValueTypeVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        LabelDescriptor$ValueType$ValueTypeVerifier labelDescriptor$ValueType$ValueTypeVerifier = new LabelDescriptor$ValueType$ValueTypeVerifier();
        INSTANCE = labelDescriptor$ValueType$ValueTypeVerifier;
    }

    private LabelDescriptor$ValueType$ValueTypeVerifier() {
    }

    public boolean isInRange(int n3) {
        LabelDescriptor$ValueType labelDescriptor$ValueType = LabelDescriptor$ValueType.forNumber(n3);
        if (labelDescriptor$ValueType != null) {
            n3 = 1;
        } else {
            n3 = 0;
            labelDescriptor$ValueType = null;
        }
        return n3 != 0;
    }
}

