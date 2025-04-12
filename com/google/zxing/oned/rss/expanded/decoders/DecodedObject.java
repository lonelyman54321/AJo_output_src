/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

abstract class DecodedObject {
    private final int newPosition;

    public DecodedObject(int n3) {
        this.newPosition = n3;
    }

    public final int getNewPosition() {
        return this.newPosition;
    }
}

