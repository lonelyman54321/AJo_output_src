/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.oned.rss.expanded.decoders.DecodedObject;

final class DecodedChar
extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public DecodedChar(int n3, char c2) {
        super(n3);
        this.value = c2;
    }

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        char c2 = this.value;
        char c3 = '$';
        return c2 == c3;
    }
}

