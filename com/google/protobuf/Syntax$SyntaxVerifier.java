/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Syntax;

final class Syntax$SyntaxVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        Syntax$SyntaxVerifier syntax$SyntaxVerifier = new Syntax$SyntaxVerifier();
        INSTANCE = syntax$SyntaxVerifier;
    }

    private Syntax$SyntaxVerifier() {
    }

    public boolean isInRange(int n3) {
        Syntax syntax = Syntax.forNumber(n3);
        if (syntax != null) {
            n3 = 1;
        } else {
            n3 = 0;
            syntax = null;
        }
        return n3 != 0;
    }
}

