/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.MessageDigestHashFunction;

class Hashing$Sha512Holder {
    static final HashFunction SHA_512;

    static {
        MessageDigestHashFunction messageDigestHashFunction = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
        SHA_512 = messageDigestHashFunction;
    }

    private Hashing$Sha512Holder() {
    }
}

