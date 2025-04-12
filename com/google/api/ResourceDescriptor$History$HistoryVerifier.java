/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor$History;
import com.google.protobuf.Internal$EnumVerifier;

final class ResourceDescriptor$History$HistoryVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        ResourceDescriptor$History$HistoryVerifier resourceDescriptor$History$HistoryVerifier = new ResourceDescriptor$History$HistoryVerifier();
        INSTANCE = resourceDescriptor$History$HistoryVerifier;
    }

    private ResourceDescriptor$History$HistoryVerifier() {
    }

    public boolean isInRange(int n3) {
        ResourceDescriptor$History resourceDescriptor$History = ResourceDescriptor$History.forNumber(n3);
        if (resourceDescriptor$History != null) {
            n3 = 1;
        } else {
            n3 = 0;
            resourceDescriptor$History = null;
        }
        return n3 != 0;
    }
}

