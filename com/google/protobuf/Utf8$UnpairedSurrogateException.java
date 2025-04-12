/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

class Utf8$UnpairedSurrogateException
extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int n3, int n4) {
        String string2 = D70.b(n3, n4, "Unpaired surrogate at index ", " of ");
        super(string2);
    }
}

