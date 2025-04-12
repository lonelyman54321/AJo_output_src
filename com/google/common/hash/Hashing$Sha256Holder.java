/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.MessageDigestHashFunction;

class Hashing$Sha256Holder {
    static final HashFunction SHA_256;

    static {
        MessageDigestHashFunction messageDigestHashFunction = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
        SHA_256 = messageDigestHashFunction;
    }

    private Hashing$Sha256Holder() {
    }
}

