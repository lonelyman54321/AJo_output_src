/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule$PathTranslation;
import com.google.protobuf.Internal$EnumVerifier;

final class BackendRule$PathTranslation$PathTranslationVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        BackendRule$PathTranslation$PathTranslationVerifier backendRule$PathTranslation$PathTranslationVerifier = new BackendRule$PathTranslation$PathTranslationVerifier();
        INSTANCE = backendRule$PathTranslation$PathTranslationVerifier;
    }

    private BackendRule$PathTranslation$PathTranslationVerifier() {
    }

    public boolean isInRange(int n3) {
        BackendRule$PathTranslation backendRule$PathTranslation = BackendRule$PathTranslation.forNumber(n3);
        if (backendRule$PathTranslation != null) {
            n3 = 1;
        } else {
            n3 = 0;
            backendRule$PathTranslation = null;
        }
        return n3 != 0;
    }
}

