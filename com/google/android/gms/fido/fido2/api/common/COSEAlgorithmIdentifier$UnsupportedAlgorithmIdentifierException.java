/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException
extends Exception {
    public COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(int n3) {
        String string2 = Gj0.b(n3, "Algorithm with COSE value ", " not supported");
        super(string2);
    }
}

