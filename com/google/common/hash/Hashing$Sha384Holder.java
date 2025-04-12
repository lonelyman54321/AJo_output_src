/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.MessageDigestHashFunction;

class Hashing$Sha384Holder {
    static final HashFunction SHA_384;

    static {
        MessageDigestHashFunction messageDigestHashFunction = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
        SHA_384 = messageDigestHashFunction;
    }

    private Hashing$Sha384Holder() {
    }
}

